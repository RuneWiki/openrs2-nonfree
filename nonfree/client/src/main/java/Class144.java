import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ra")
public final class Class144 {

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "Lclient!si;")
	private Class1_Sub3_Sub13_Sub2 aClass1_Sub3_Sub13_Sub2_5;

	@OriginalMember(owner = "client!ra", name = "g", descriptor = "I")
	private int anInt4894;

	@OriginalMember(owner = "client!ra", name = "h", descriptor = "I")
	private int anInt4895;

	@OriginalMember(owner = "client!ra", name = "l", descriptor = "I")
	private int anInt4897;

	@OriginalMember(owner = "client!ra", name = "s", descriptor = "I")
	public int anInt4902;

	@OriginalMember(owner = "client!ra", name = "w", descriptor = "I")
	private int anInt4905;

	@OriginalMember(owner = "client!ra", name = "u", descriptor = "I")
	private int anInt4904 = -1;

	@OriginalMember(owner = "client!ra", name = "q", descriptor = "I")
	private int anInt4900 = -1;

	@OriginalMember(owner = "client!ra", name = "v", descriptor = "Z")
	private boolean aBoolean298 = true;

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "I")
	private int anInt4891;

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "I")
	private int anInt4892;

	@OriginalMember(owner = "client!ra", name = "t", descriptor = "I")
	private int anInt4903;

	@OriginalMember(owner = "client!ra", name = "j", descriptor = "Z")
	private boolean aBoolean297;

	@OriginalMember(owner = "client!ra", name = "m", descriptor = "I")
	private int anInt4898;

	@OriginalMember(owner = "client!ra", name = "o", descriptor = "I")
	private int anInt4899;

	@OriginalMember(owner = "client!ra", name = "i", descriptor = "I")
	private int anInt4896;

	@OriginalMember(owner = "client!ra", name = "x", descriptor = "I")
	private int anInt4906;

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class144(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt4891 = arg2;
		this.anInt4892 = arg3;
		this.anInt4903 = arg4;
		this.aBoolean297 = arg7;
		this.anInt4898 = arg1;
		this.anInt4899 = arg6;
		this.anInt4896 = arg5;
		this.anInt4906 = arg0;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIIIILclient!ra;)V")
	public void method3685(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class144 arg6) {
		@Pc(6) int local6 = this.anInt4895 - arg4 & 0x7FF;
		@Pc(13) int local13 = this.anInt4894 - arg5 & 0x7FF;
		if (local13 > 1024) {
			local13 -= 2048;
		}
		if (local6 > 1024) {
			local6 -= 2048;
		}
		@Pc(27) int local27 = local6 * arg3 / 512;
		@Pc(33) int local33 = local13 * arg3 / -512;
		@Pc(42) int local42 = local27 + (arg3 - this.anInt4905) / 2;
		@Pc(51) int local51 = local33 + (arg2 - this.anInt4905) / 2;
		if (local42 < arg3 && local42 + this.anInt4905 > 0 && local51 < arg2 && local51 + this.anInt4905 > 0 && this.method3690(arg6)) {
			this.aClass1_Sub3_Sub13_Sub2_5.method4205(local51 + arg0, local42 + arg1, this.anInt4905, this.anInt4905);
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!ra;)Z")
	private boolean method3686(@OriginalArg(0) Class144 arg0) {
		@Pc(5) Class2_Sub3 local5 = Static30.method658(Static224.aClass168_163, this.anInt4898);
		if (local5 == null) {
			return false;
		}
		@Pc(11) GL local11 = Static294.aGL1;
		Static156.method2543(Static233.anIntArray452);
		Static156.method2538();
		local11.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
		local11.glClear(16640);
		@Pc(25) int local25 = 0;
		@Pc(27) int local27 = 0;
		@Pc(29) int local29 = 256;
		if (arg0 != null) {
			if (arg0.aBoolean297) {
				local25 = -arg0.anInt4891;
				local27 = -arg0.anInt4892;
				local29 = -arg0.anInt4903;
			} else {
				local25 = this.anInt4891 - arg0.anInt4891;
				local27 = this.anInt4892 - arg0.anInt4892;
				local29 = this.anInt4903 - arg0.anInt4903;
			}
		}
		local5.method638();
		@Pc(78) Class2_Sub1 local78 = local5.method651(64, 768, -local25, -local27, -local29);
		@Pc(86) int local86 = (local78.method558() - local78.method575()) / 2;
		@Pc(94) int local94 = (local78.method568() - local78.method3948()) / 2;
		@Pc(101) int local101 = local86 > local94 ? local86 : local94;
		Static164.method2587((float) -local101, (float) local101, (float) -local101, (float) local101, 2048.0F, -2048.0F, this.anInt4897, this.anInt4897);
		@Pc(126) int local126;
		@Pc(131) int local131;
		@Pc(143) int local143;
		if (this.anInt4895 != 0) {
			local126 = Class146.anIntArray461[this.anInt4895];
			local131 = Class146.anIntArray463[this.anInt4895];
			local143 = local27 * local131 + 32767 - local29 * local126 >> 16;
			local29 = local27 * local126 + local29 * local131 + 32767 >> 16;
			local27 = local143;
		}
		if (this.anInt4894 != 0) {
			local126 = this.anInt4894 - 1024 & 0x7FF;
			local131 = Class146.anIntArray461[local126];
			local143 = Class146.anIntArray463[local126];
			@Pc(187) int local187 = local29 * local131 + local25 * local143 + 32767 >> 16;
			local29 = local29 * local143 + 32767 - local25 * local131 >> 16;
			local25 = local187;
		}
		Static180.method2903((float) -local25, (float) local27, (float) -local29);
		Static180.method2911(16777215, 0.5F, 0.5F, 0.5F);
		Static180.method2910();
		Static294.method4495();
		Static294.method4491(true);
		Static294.method4496(true);
		local78.method559(0, 0, 0, -local86 - local78.method575(), -local94 - local78.method3948(), 0, -1L);
		Static294.method4496(false);
		Static294.method4491(false);
		Static294.method4492();
		Static164.method2591();
		Static294.method4486(this.anInt4904);
		local11.glCopyTexImage2D(3553, 0, 6408, 0, 0, this.anInt4897, this.anInt4897, 0);
		Static156.method2536(Static233.anIntArray452);
		return true;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIIII)V")
	public void method3687(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(6) int local6 = this.anInt4895 - arg4 & 0x7FF;
		@Pc(13) int local13 = this.anInt4894 - arg5 & 0x7FF;
		if (local13 > 1024) {
			local13 -= 2048;
		}
		if (local6 > 1024) {
			local6 -= 2048;
		}
		@Pc(27) int local27 = local6 * arg3 / 512;
		@Pc(33) int local33 = local13 * arg3 / -512;
		@Pc(42) int local42 = local27 + (arg3 - this.anInt4905) / 2;
		@Pc(51) int local51 = local33 + (arg2 - this.anInt4905) / 2;
		if (local42 >= arg3 || local42 + this.anInt4905 <= 0 || local51 >= arg2 || local51 + this.anInt4905 <= 0) {
			return;
		}
		if (this.anInt4906 == 0) {
			Static237.anInterface1_1.method4599(this.anInt4897, this.anInt4898);
		} else if (this.anInt4904 == -1) {
			return;
		} else {
			Static294.method4486(this.anInt4904);
		}
		local27 = local42 + arg1;
		local33 = local51 + arg0;
		@Pc(100) int local100 = local33 + this.anInt4905;
		@Pc(105) int local105 = local27 + this.anInt4905;
		@Pc(107) GL local107 = Static294.aGL1;
		local107.glBegin(7);
		local107.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		local107.glTexCoord2f(0.0F, 0.0F);
		local107.glVertex2i(local33, local27);
		local107.glTexCoord2f(0.0F, 1.0F);
		local107.glVertex2i(local33, local105);
		local107.glTexCoord2f(1.0F, 1.0F);
		local107.glVertex2i(local100, local105);
		local107.glTexCoord2f(1.0F, 0.0F);
		local107.glVertex2i(local100, local27);
		local107.glEnd();
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "()V")
	private void method3688() {
		@Pc(6) int local6 = this.anInt4897 * 3 / 32;
		@Pc(15) int local15 = this.anInt4897 * 13 / 16;
		@Pc(17) int local17 = local15;
		@Pc(21) int local21 = 8388608 / local15;
		@Pc(25) int local25 = 8388608 / local15;
		@Pc(31) int local31 = local6 + local6 * Static231.anInt4851;
		@Pc(35) int local35 = Static231.anInt4851 - local15;
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 0;
		if (local6 + local15 > Static231.anInt4853) {
			local17 = local15 + Static231.anInt4853 - local6 - local15;
		}
		@Pc(59) int local59;
		if (local6 < Static231.anInt4852) {
			local59 = Static231.anInt4852 - local6;
			local17 -= local59;
			local31 += local59 * Static231.anInt4851;
			local39 = local25 * local59;
		}
		if (local6 + local15 > Static231.anInt4848) {
			local59 = local6 + local15 - Static231.anInt4848;
			local15 -= local59;
			local35 += local59;
		}
		if (local6 < Static231.anInt4849) {
			local59 = Static231.anInt4849 - local6;
			local15 -= local59;
			local31 += local59;
			local37 = local21 * local59;
			local35 += local59;
		}
		this.method3702(Static231.anIntArray448, this.anInt4899, local37, local39, local31, local35, local15, local17, local21, local25);
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(Lclient!ra;)Z")
	private boolean method3690(@OriginalArg(0) Class144 arg0) {
		if (this.aClass1_Sub3_Sub13_Sub2_5 == null) {
			if (this.anInt4906 == 0) {
				this.aClass1_Sub3_Sub13_Sub2_5 = Static237.anInterface1_1.method4592(this.anInt4897, Static237.aFloat48, true, this.anInt4898);
			} else if (this.anInt4906 == 2) {
				this.method3696(arg0);
			} else if (this.anInt4906 == 1) {
				this.method3692(arg0);
			}
		}
		return this.aClass1_Sub3_Sub13_Sub2_5 != null;
	}

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "(Lclient!ra;)V")
	public void method3691(@OriginalArg(0) Class144 arg0) {
		if (this.anInt4906 == 0) {
			return;
		}
		@Pc(14) boolean local14 = this.anInt4904 == -1 || this.anInt4900 != Static113.anInt2464;
		if (!this.aBoolean298 && !local14) {
			return;
		}
		if (local14) {
			this.anInt4900 = Static113.anInt2464;
			this.anInt4904 = Static201.method3213(Static201.anInt4369, this.anInt4897, this.anInt4897);
		} else {
			Static294.method4486(this.anInt4904);
			Static201.method3208(Static201.anInt4369, this.anInt4897, this.anInt4897);
		}
		if (this.anInt4906 == 1) {
			this.method3695(arg0);
			this.aBoolean298 = false;
		} else if (this.anInt4906 == 2) {
			this.aBoolean298 = !this.method3686(arg0);
		}
	}

	@OriginalMember(owner = "client!ra", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method3700();
		super.finalize();
	}

	@OriginalMember(owner = "client!ra", name = "d", descriptor = "(Lclient!ra;)V")
	private void method3692(@OriginalArg(0) Class144 arg0) {
		Static233.method3701();
		Static233.method3693();
		this.aClass1_Sub3_Sub13_Sub2_5 = new Class1_Sub3_Sub13_Sub2_Sub1(this.anInt4897, this.anInt4897);
		Static231.method3631(Static233.anIntArray452);
		this.aClass1_Sub3_Sub13_Sub2_5.method4218();
		Static237.method3736();
		Static231.method3630(0, 0, this.anInt4897, this.anInt4897, 0);
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 256;
		if (arg0 != null) {
			if (arg0.aBoolean297) {
				local26 = -arg0.anInt4891;
				local28 = -arg0.anInt4892;
				local30 = -arg0.anInt4903;
			} else {
				local26 = this.anInt4891 - arg0.anInt4891;
				local28 = this.anInt4892 - arg0.anInt4892;
				local30 = this.anInt4903 - arg0.anInt4903;
			}
		}
		@Pc(74) int local74;
		@Pc(79) int local79;
		@Pc(91) int local91;
		if (this.anInt4895 != 0) {
			local74 = Class146.anIntArray461[this.anInt4895];
			local79 = Class146.anIntArray463[this.anInt4895];
			local91 = local28 * local79 + 32767 - local30 * local74 >> 16;
			local30 = local28 * local74 + local30 * local79 + 32767 >> 16;
			local28 = local91;
		}
		@Pc(135) int local135;
		if (this.anInt4894 != 0) {
			local74 = this.anInt4894 - 1024 & 0x7FF;
			local79 = Class146.anIntArray461[local74];
			local91 = Class146.anIntArray463[local74];
			local135 = local30 * local79 + local26 * local91 + 32767 >> 16;
			local30 = local30 * local91 + 32767 - local26 * local79 >> 16;
			local26 = local135;
		}
		Static319.method1421(Static233.aClass2_Sub3_1.aShortArray34, 0, Static233.aClass2_Sub3_1.anInt764, (short) Static237.anInterface1_1.method4597(this.anInt4898));
		@Pc(172) Class2_Sub1_Sub2 local172 = Static233.aClass2_Sub3_1.method640(64, 512, -local26, -local28, -local30);
		local79 = local172.method558() - local172.method575();
		local91 = local172.method568() - local172.method3948();
		if (local79 > local91) {
			local135 = this.anInt4899 == 0 ? (local79 << 9) / this.anInt4897 : (local79 * 16 << 9) / (this.anInt4897 * 13);
			local172.method591(0, 0, 0, 0, 0, 0, local135);
		} else {
			local135 = this.anInt4899 == 0 ? (local91 << 9) / this.anInt4897 : (local91 * 16 << 9) / (this.anInt4897 * 13);
			local172.method591(0, 0, 0, 0, 0, 0, local135);
		}
		if (this.anInt4899 == 0) {
			for (local135 = 0; local135 < Static231.anIntArray448.length; local135++) {
				if (Static231.anIntArray448[local135] != 0) {
					Static231.anIntArray448[local135] |= 0xFF000000;
				}
			}
		} else {
			this.method3688();
			this.method3699();
		}
		Static293.aClass3_1.method2413();
		Static231.method3628(Static233.anIntArray452);
		Static237.method3736();
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIII)Z")
	public boolean method3694(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean297) {
			this.anInt4902 = 1073741823;
			local7 = this.anInt4891;
			local12 = this.anInt4892;
			local17 = this.anInt4903;
		} else {
			local7 = this.anInt4891 - arg0;
			local12 = this.anInt4892 - arg1;
			local17 = this.anInt4903 - arg2;
			this.anInt4902 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt4902 == 0) {
				this.anInt4902 = 1;
			}
			local7 = (local7 << 8) / this.anInt4902;
			local12 = (local12 << 8) / this.anInt4902;
			local17 = (local17 << 8) / this.anInt4902;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt4905 = this.anInt4896 * arg3 / (this.aBoolean297 ? 1024 : this.anInt4902);
		} else {
			this.anInt4905 = 0;
		}
		if (this.anInt4905 < 8) {
			this.method3700();
			this.aClass1_Sub3_Sub13_Sub2_5 = null;
			return false;
		}
		@Pc(145) int local145 = Static151.method2450(this.anInt4905);
		if (local145 > 512) {
			local145 = 512;
		}
		if (local145 != this.anInt4897) {
			this.anInt4897 = local145;
		}
		this.anInt4895 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 325.9493103027344D) & 0x7FF;
		this.anInt4894 = (int) (Math.atan2((double) local7, (double) -local17) * 325.9493103027344D) & 0x7FF;
		this.aBoolean298 = true;
		this.aClass1_Sub3_Sub13_Sub2_5 = null;
		return true;
	}

	@OriginalMember(owner = "client!ra", name = "e", descriptor = "(Lclient!ra;)V")
	private void method3695(@OriginalArg(0) Class144 arg0) {
		Static233.method3703();
		Static233.method3689();
		@Pc(3) GL local3 = Static294.aGL1;
		Static156.method2543(Static233.anIntArray452);
		Static156.method2538();
		local3.glClearColor((float) (this.anInt4899 >> 16 & 0xFF) / 255.0F, (float) (this.anInt4899 >> 8 & 0xFF) / 255.0F, (float) (this.anInt4899 & 0xFF) / 255.0F, 0.0F);
		local3.glClear(16640);
		@Pc(39) int local39 = 0;
		@Pc(41) int local41 = 0;
		@Pc(43) int local43 = 256;
		if (arg0 != null) {
			if (arg0.aBoolean297) {
				local39 = -arg0.anInt4891;
				local41 = -arg0.anInt4892;
				local43 = -arg0.anInt4903;
			} else {
				local39 = this.anInt4891 - arg0.anInt4891;
				local41 = this.anInt4892 - arg0.anInt4892;
				local43 = this.anInt4903 - arg0.anInt4903;
			}
		}
		Static164.method2584(-1.0F, 1.0F, -1.0F, 1.0F, this.anInt4897, this.anInt4897);
		@Pc(96) int local96;
		@Pc(101) int local101;
		@Pc(113) int local113;
		if (this.anInt4895 != 0) {
			local96 = Class146.anIntArray461[this.anInt4895];
			local101 = Class146.anIntArray463[this.anInt4895];
			local113 = local41 * local101 + 32767 - local43 * local96 >> 16;
			local43 = local41 * local96 + local43 * local101 + 32767 >> 16;
			local41 = local113;
		}
		if (this.anInt4894 != 0) {
			local96 = this.anInt4894 - 1024 & 0x7FF;
			local101 = Class146.anIntArray461[local96];
			local113 = Class146.anIntArray463[local96];
			@Pc(157) int local157 = local43 * local101 + local39 * local113 + 32767 >> 16;
			local43 = local43 * local113 + 32767 - local39 * local101 >> 16;
			local39 = local157;
		}
		Static180.method2903((float) -local39, (float) -local41, (float) local43);
		Static180.method2911(16777215, 0.5F, 0.5F, 1.0F);
		Static180.method2910();
		if (this.anInt4899 != 0) {
			local3.glScalef(0.8125F, 0.8125F, 1.0F);
		}
		Static237.anInterface1_1.method4599(this.anInt4897, this.anInt4898);
		Static294.method4496(true);
		if (Static294.aBoolean381) {
			local3.glBindBufferARB(34962, 0);
			local3.glBindBufferARB(34963, 0);
		}
		local3.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		local3.glDisableClientState(32886);
		local3.glNormalPointer(5126, 20, Static233.aByteBuffer8.position(0));
		local3.glVertexPointer(2, 5126, 20, Static233.aByteBuffer8.position(0));
		local3.glTexCoordPointer(2, 5126, 20, Static233.aByteBuffer8.position(12));
		local3.glDrawElements(5, Static233.aByteBuffer9.limit() / 2, 5123, Static233.aByteBuffer9.position(0));
		local3.glEnableClientState(32886);
		Static294.method4496(false);
		if (this.anInt4899 != 0) {
			Static1.method4721(0, 0);
			Static294.method4488(1);
			Static294.method4490(0);
			Static294.method4486(Static233.anInt4893);
			local3.glColorMask(true, true, true, false);
			local3.glTexEnvi(8960, 34176, 34168);
			local3.glTexEnvi(8960, 34200, 771);
			local3.glBegin(7);
			local3.glColor4ub((byte) (this.anInt4899 >> 16), (byte) (this.anInt4899 >> 8), (byte) this.anInt4899, (byte) 127);
			local3.glTexCoord2f(0.0F, 0.0F);
			local3.glVertex2i(-1, -1);
			local3.glTexCoord2f(1.0F, 0.0F);
			local3.glVertex2i(1, -1);
			local3.glTexCoord2f(1.0F, 1.0F);
			local3.glVertex2i(1, 1);
			local3.glTexCoord2f(0.0F, 1.0F);
			local3.glVertex2i(-1, 1);
			local3.glEnd();
			local3.glTexEnvi(8960, 34200, 770);
			local3.glLoadIdentity();
			local3.glColorMask(true, true, true, true);
			local3.glBlendFunc(773, 772);
			local3.glBegin(7);
			local3.glColor4ub((byte) (this.anInt4899 >> 16), (byte) (this.anInt4899 >> 8), (byte) this.anInt4899, (byte) -1);
			local3.glTexCoord2f(0.0F, 0.0F);
			local3.glVertex2i(-1, -1);
			local3.glTexCoord2f(1.0F, 0.0F);
			local3.glVertex2i(1, -1);
			local3.glTexCoord2f(1.0F, 1.0F);
			local3.glVertex2i(1, 1);
			local3.glTexCoord2f(0.0F, 1.0F);
			local3.glVertex2i(-1, 1);
			local3.glEnd();
			local3.glBlendFunc(770, 771);
			local3.glTexEnvi(8960, 34176, 5890);
		}
		Static164.method2591();
		Static294.method4486(this.anInt4904);
		local3.glCopyTexImage2D(3553, 0, 6408, 0, 0, this.anInt4897, this.anInt4897, 0);
		Static156.method2536(Static233.anIntArray452);
	}

	@OriginalMember(owner = "client!ra", name = "f", descriptor = "(Lclient!ra;)V")
	private void method3696(@OriginalArg(0) Class144 arg0) {
		@Pc(5) Class2_Sub3 local5 = Static30.method658(Static224.aClass168_163, this.anInt4898);
		if (local5 == null) {
			return;
		}
		this.aClass1_Sub3_Sub13_Sub2_5 = new Class1_Sub3_Sub13_Sub2(this.anInt4897, this.anInt4897);
		Static231.method3631(Static233.anIntArray452);
		this.aClass1_Sub3_Sub13_Sub2_5.method4218();
		Static237.method3736();
		Static231.method3630(0, 0, this.anInt4897, this.anInt4897, 0);
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 256;
		if (arg0 != null) {
			if (arg0.aBoolean297) {
				local33 = -arg0.anInt4891;
				local35 = -arg0.anInt4892;
				local37 = -arg0.anInt4903;
			} else {
				local33 = this.anInt4891 - arg0.anInt4891;
				local35 = this.anInt4892 - arg0.anInt4892;
				local37 = this.anInt4903 - arg0.anInt4903;
			}
		}
		@Pc(81) int local81;
		@Pc(86) int local86;
		@Pc(98) int local98;
		if (this.anInt4895 != 0) {
			local81 = Class146.anIntArray461[this.anInt4895];
			local86 = Class146.anIntArray463[this.anInt4895];
			local98 = local35 * local86 + 32767 - local37 * local81 >> 16;
			local37 = local35 * local81 + local37 * local86 + 32767 >> 16;
			local35 = local98;
		}
		@Pc(142) int local142;
		if (this.anInt4894 != 0) {
			local81 = this.anInt4894 - 1024 & 0x7FF;
			local86 = Class146.anIntArray461[local81];
			local98 = Class146.anIntArray463[local81];
			local142 = local37 * local86 + local33 * local98 + 32767 >> 16;
			local37 = local37 * local98 + 32767 - local33 * local86 >> 16;
			local33 = local142;
		}
		@Pc(167) Class2_Sub1_Sub2 local167 = local5.method640(64, 768, -local33, -local35, -local37);
		local86 = local167.method558() - local167.method575();
		local98 = local167.method568() - local167.method3948();
		local142 = local167.method575() + local86 / 2;
		@Pc(193) int local193 = local167.method3948() + local98 / 2;
		if (local86 > local98) {
			local167.method591(0, 0, 0, -local142, -local193, 0, (local86 << 9) / this.anInt4897);
		} else {
			local167.method591(0, 0, 0, -local142, -local193, 0, (local98 << 9) / this.anInt4897);
		}
		Static293.aClass3_1.method2413();
		Static231.method3628(Static233.anIntArray452);
		Static237.method3736();
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "([IIIIIIIIIII)V")
	private void method3697(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(1) int local1 = arg2;
		for (@Pc(4) int local4 = -arg7; local4 < 0; local4++) {
			@Pc(12) int local12 = (arg3 >> 16) * 128;
			for (@Pc(15) int local15 = -arg6; local15 < 0; local15++) {
				if (arg0[arg4] == 0) {
					arg0[arg4] = (Static233.aByteArray65[(arg2 >> 16) + local12] & 0xFF) << 24 | arg1;
				} else {
					arg0[arg4] |= 0xFF000000;
				}
				arg4++;
				arg2 += arg8;
			}
			arg3 += arg9;
			arg2 = local1;
			arg4 += arg5;
		}
	}

	@OriginalMember(owner = "client!ra", name = "f", descriptor = "()V")
	private void method3699() {
		@Pc(2) int local2 = this.anInt4897;
		@Pc(5) int local5 = this.anInt4897;
		@Pc(9) int local9 = 8388608 / local2;
		@Pc(13) int local13 = 8388608 / local5;
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = 0;
		@Pc(23) int local23 = Static231.anInt4851 - local2;
		if (local5 > Static231.anInt4853) {
			local5 -= local5 - Static231.anInt4853;
		}
		@Pc(37) int local37;
		if (Static231.anInt4852 > 0) {
			local37 = Static231.anInt4852;
			local5 -= local37;
			local19 = local37 * Static231.anInt4851;
			local17 = local13 * local37;
		}
		if (local2 > Static231.anInt4848) {
			local37 = local2 - Static231.anInt4848;
			local2 -= local37;
			local23 += local37;
		}
		if (Static231.anInt4849 > 0) {
			local37 = Static231.anInt4849;
			local2 -= local37;
			local19 += local37;
			local15 = local9 * local37;
			local23 += local37;
		}
		this.method3697(Static231.anIntArray448, this.anInt4899, local15, local17, local19, local23, local2, local5, local9, local13);
	}

	@OriginalMember(owner = "client!ra", name = "g", descriptor = "()V")
	private void method3700() {
		if (this.anInt4904 != -1) {
			Static113.method1837(this.anInt4904, 0, this.anInt4900);
		}
		this.aBoolean298 = true;
		this.anInt4904 = -1;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "([IIIIIIIIIIII)V")
	private void method3702(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(1) int local1 = arg2;
		for (@Pc(4) int local4 = -arg7; local4 < 0; local4++) {
			@Pc(12) int local12 = (arg3 >> 16) * 128;
			for (@Pc(15) int local15 = -arg6; local15 < 0; local15++) {
				if (arg0[arg4] != 0) {
					@Pc(25) int local25 = arg0[arg4];
					@Pc(37) int local37 = (Static233.aByteArray65[(arg2 >> 16) + local12] & 0xFF) + 64;
					if (local37 > 255) {
						local37 = 255;
					}
					@Pc(46) int local46 = 256 - local37;
					arg0[arg4] = ((arg1 & 0xFF00FF) * local46 + (local25 & 0xFF00FF) * local37 & -16711936) + ((arg1 & 0xFF00) * local46 + (local25 & 0xFF00) * local37 & 0xFF0000) >> 8 | 0xFF000000;
				}
				arg4++;
				arg2 += arg8;
			}
			arg3 += arg9;
			arg2 = local1;
			arg4 += arg5;
		}
	}
}
