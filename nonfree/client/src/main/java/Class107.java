import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kg")
public final class Class107 {

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "Lclient!vn;")
	private Class4_Sub3_Sub14_Sub1 aClass4_Sub3_Sub14_Sub1_5;

	@OriginalMember(owner = "client!kg", name = "e", descriptor = "I")
	private int anInt2855;

	@OriginalMember(owner = "client!kg", name = "f", descriptor = "I")
	private int anInt2856;

	@OriginalMember(owner = "client!kg", name = "k", descriptor = "I")
	public int anInt2860;

	@OriginalMember(owner = "client!kg", name = "l", descriptor = "I")
	private int anInt2861;

	@OriginalMember(owner = "client!kg", name = "r", descriptor = "I")
	private int anInt2865;

	@OriginalMember(owner = "client!kg", name = "p", descriptor = "I")
	private int anInt2864 = -1;

	@OriginalMember(owner = "client!kg", name = "s", descriptor = "I")
	private int anInt2866 = -1;

	@OriginalMember(owner = "client!kg", name = "q", descriptor = "Z")
	private boolean aBoolean198 = true;

	@OriginalMember(owner = "client!kg", name = "n", descriptor = "I")
	private int anInt2863;

	@OriginalMember(owner = "client!kg", name = "t", descriptor = "I")
	private int anInt2867;

	@OriginalMember(owner = "client!kg", name = "m", descriptor = "I")
	private int anInt2862;

	@OriginalMember(owner = "client!kg", name = "u", descriptor = "Z")
	private boolean aBoolean199;

	@OriginalMember(owner = "client!kg", name = "i", descriptor = "I")
	private int anInt2858;

	@OriginalMember(owner = "client!kg", name = "j", descriptor = "I")
	private int anInt2859;

	@OriginalMember(owner = "client!kg", name = "c", descriptor = "I")
	private int anInt2854;

	@OriginalMember(owner = "client!kg", name = "x", descriptor = "I")
	private int anInt2869;

	@OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class107(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt2863 = arg2;
		this.anInt2867 = arg3;
		this.anInt2862 = arg4;
		this.aBoolean199 = arg7;
		this.anInt2858 = arg1;
		this.anInt2859 = arg6;
		this.anInt2854 = arg5;
		this.anInt2869 = arg0;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "([IIIIIIIIIIII)V")
	private void method2295(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(1) int local1 = arg2;
		for (@Pc(4) int local4 = -arg7; local4 < 0; local4++) {
			@Pc(12) int local12 = (arg3 >> 16) * 128;
			for (@Pc(15) int local15 = -arg6; local15 < 0; local15++) {
				if (arg0[arg4] != 0) {
					@Pc(25) int local25 = arg0[arg4];
					@Pc(37) int local37 = (Static146.aByteArray29[(arg2 >> 16) + local12] & 0xFF) + 64;
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

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lclient!kg;)V")
	private void method2296(@OriginalArg(0) Class107 arg0) {
		Static146.method2304();
		Static146.method2312();
		@Pc(3) GL local3 = Static94.aGL1;
		Static104.method1687(Static146.anIntArray256);
		Static104.method1699();
		local3.glClearColor((float) (this.anInt2859 >> 16 & 0xFF) / 255.0F, (float) (this.anInt2859 >> 8 & 0xFF) / 255.0F, (float) (this.anInt2859 & 0xFF) / 255.0F, 0.0F);
		local3.glClear(16640);
		@Pc(39) int local39 = 0;
		@Pc(41) int local41 = 0;
		@Pc(43) int local43 = 256;
		if (arg0 != null) {
			if (arg0.aBoolean199) {
				local39 = -arg0.anInt2863;
				local41 = -arg0.anInt2867;
				local43 = -arg0.anInt2862;
			} else {
				local39 = this.anInt2863 - arg0.anInt2863;
				local41 = this.anInt2867 - arg0.anInt2867;
				local43 = this.anInt2862 - arg0.anInt2862;
			}
		}
		Static14.method213(-1.0F, 1.0F, -1.0F, 1.0F, this.anInt2861, this.anInt2861);
		@Pc(96) int local96;
		@Pc(101) int local101;
		@Pc(113) int local113;
		if (this.anInt2865 != 0) {
			local96 = Class111.anIntArray299[this.anInt2865];
			local101 = Class111.anIntArray298[this.anInt2865];
			local113 = local41 * local101 + 32767 - local43 * local96 >> 16;
			local43 = local41 * local96 + local43 * local101 + 32767 >> 16;
			local41 = local113;
		}
		if (this.anInt2855 != 0) {
			local96 = this.anInt2855 - 1024 & 0x7FF;
			local101 = Class111.anIntArray299[local96];
			local113 = Class111.anIntArray298[local96];
			@Pc(157) int local157 = local43 * local101 + local39 * local113 + 32767 >> 16;
			local43 = local43 * local113 + 32767 - local39 * local101 >> 16;
			local39 = local157;
		}
		Static178.method2788((float) -local39, (float) -local41, (float) local43);
		Static178.method2795(16777215, 0.5F, 0.5F, 1.0F);
		Static178.method2790();
		if (this.anInt2859 != 0) {
			local3.glScalef(0.8125F, 0.8125F, 1.0F);
		}
		Static158.anInterface5_1.method454(this.anInt2861, this.anInt2858);
		Static94.method1610(true);
		if (Static94.aBoolean135) {
			local3.glBindBufferARB(34962, 0);
			local3.glBindBufferARB(34963, 0);
		}
		local3.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		local3.glDisableClientState(32886);
		local3.glNormalPointer(5126, 20, Static146.aByteBuffer9.position(0));
		local3.glVertexPointer(2, 5126, 20, Static146.aByteBuffer9.position(0));
		local3.glTexCoordPointer(2, 5126, 20, Static146.aByteBuffer9.position(12));
		local3.glDrawElements(5, Static146.aByteBuffer10.limit() / 2, 5123, Static146.aByteBuffer10.position(0));
		local3.glEnableClientState(32886);
		Static94.method1610(false);
		if (this.anInt2859 != 0) {
			Static164.method2665(0, 0);
			Static94.method1597(1);
			Static94.method1607(0);
			Static94.method1600(Static146.anInt2868);
			local3.glColorMask(true, true, true, false);
			local3.glTexEnvi(8960, 34176, 34168);
			local3.glTexEnvi(8960, 34200, 771);
			local3.glBegin(7);
			local3.glColor4ub((byte) (this.anInt2859 >> 16), (byte) (this.anInt2859 >> 8), (byte) this.anInt2859, (byte) 127);
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
			local3.glColor4ub((byte) (this.anInt2859 >> 16), (byte) (this.anInt2859 >> 8), (byte) this.anInt2859, (byte) -1);
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
		Static14.method209();
		Static94.method1600(this.anInt2864);
		local3.glCopyTexImage2D(3553, 0, 6408, 0, 0, this.anInt2861, this.anInt2861, 0);
		Static104.method1696(Static146.anIntArray256);
	}

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "(Lclient!kg;)Z")
	private boolean method2297(@OriginalArg(0) Class107 arg0) {
		@Pc(5) Class53_Sub3 local5 = Static176.method2765(Static64.aClass58_37, this.anInt2858);
		if (local5 == null) {
			return false;
		}
		@Pc(11) GL local11 = Static94.aGL1;
		Static104.method1687(Static146.anIntArray256);
		Static104.method1699();
		local11.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
		local11.glClear(16640);
		@Pc(25) int local25 = 0;
		@Pc(27) int local27 = 0;
		@Pc(29) int local29 = 256;
		if (arg0 != null) {
			if (arg0.aBoolean199) {
				local25 = -arg0.anInt2863;
				local27 = -arg0.anInt2867;
				local29 = -arg0.anInt2862;
			} else {
				local25 = this.anInt2863 - arg0.anInt2863;
				local27 = this.anInt2867 - arg0.anInt2867;
				local29 = this.anInt2862 - arg0.anInt2862;
			}
		}
		local5.method2761();
		@Pc(78) Class53_Sub4 local78 = local5.method2774(64, 768, -local25, -local27, -local29);
		@Pc(86) int local86 = (local78.method3875() - local78.method3866()) / 2;
		@Pc(94) int local94 = (local78.method3879() - local78.method3850()) / 2;
		@Pc(101) int local101 = local86 > local94 ? local86 : local94;
		Static14.method212((float) -local101, (float) local101, (float) -local101, (float) local101, 2048.0F, -2048.0F, this.anInt2861, this.anInt2861);
		@Pc(126) int local126;
		@Pc(131) int local131;
		@Pc(143) int local143;
		if (this.anInt2865 != 0) {
			local126 = Class111.anIntArray299[this.anInt2865];
			local131 = Class111.anIntArray298[this.anInt2865];
			local143 = local27 * local131 + 32767 - local29 * local126 >> 16;
			local29 = local27 * local126 + local29 * local131 + 32767 >> 16;
			local27 = local143;
		}
		if (this.anInt2855 != 0) {
			local126 = this.anInt2855 - 1024 & 0x7FF;
			local131 = Class111.anIntArray299[local126];
			local143 = Class111.anIntArray298[local126];
			@Pc(187) int local187 = local29 * local131 + local25 * local143 + 32767 >> 16;
			local29 = local29 * local143 + 32767 - local25 * local131 >> 16;
			local25 = local187;
		}
		Static178.method2788((float) -local25, (float) local27, (float) -local29);
		Static178.method2795(16777215, 0.5F, 0.5F, 0.5F);
		Static178.method2790();
		Static94.method1591();
		Static94.method1588(true);
		Static94.method1610(true);
		local78.method3859(0, 0, 0, -local86 - local78.method3866(), -local94 - local78.method3850(), 0, -1L);
		Static94.method1610(false);
		Static94.method1588(false);
		Static94.method1589();
		Static14.method209();
		Static94.method1600(this.anInt2864);
		local11.glCopyTexImage2D(3553, 0, 6408, 0, 0, this.anInt2861, this.anInt2861, 0);
		Static104.method1696(Static146.anIntArray256);
		return true;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "()V")
	private void method2298() {
		@Pc(2) int local2 = this.anInt2861;
		@Pc(5) int local5 = this.anInt2861;
		@Pc(9) int local9 = 8388608 / local2;
		@Pc(13) int local13 = 8388608 / local5;
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = 0;
		@Pc(23) int local23 = Static270.anInt5189 - local2;
		if (local5 > Static270.anInt5188) {
			local5 -= local5 - Static270.anInt5188;
		}
		@Pc(37) int local37;
		if (Static270.anInt5184 > 0) {
			local37 = Static270.anInt5184;
			local5 -= local37;
			local19 = local37 * Static270.anInt5189;
			local17 = local13 * local37;
		}
		if (local2 > Static270.anInt5187) {
			local37 = local2 - Static270.anInt5187;
			local2 -= local37;
			local23 += local37;
		}
		if (Static270.anInt5186 > 0) {
			local37 = Static270.anInt5186;
			local2 -= local37;
			local19 += local37;
			local15 = local9 * local37;
			local23 += local37;
		}
		this.method2314(Static270.anIntArray561, this.anInt2859, local15, local17, local19, local23, local2, local5, local9, local13);
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIIII)V")
	public void method2299(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(6) int local6 = this.anInt2865 - arg4 & 0x7FF;
		@Pc(13) int local13 = this.anInt2855 - arg5 & 0x7FF;
		if (local13 > 1024) {
			local13 -= 2048;
		}
		if (local6 > 1024) {
			local6 -= 2048;
		}
		@Pc(27) int local27 = local6 * arg3 / 512;
		@Pc(33) int local33 = local13 * arg3 / -512;
		@Pc(42) int local42 = local27 + (arg3 - this.anInt2856) / 2;
		@Pc(51) int local51 = local33 + (arg2 - this.anInt2856) / 2;
		if (local42 >= arg3 || local42 + this.anInt2856 <= 0 || local51 >= arg2 || local51 + this.anInt2856 <= 0) {
			return;
		}
		if (this.anInt2869 == 0) {
			Static158.anInterface5_1.method454(this.anInt2861, this.anInt2858);
		} else if (this.anInt2864 == -1) {
			return;
		} else {
			Static94.method1600(this.anInt2864);
		}
		local27 = local42 + arg1;
		local33 = local51 + arg0;
		@Pc(100) int local100 = local33 + this.anInt2856;
		@Pc(105) int local105 = local27 + this.anInt2856;
		@Pc(107) GL local107 = Static94.aGL1;
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

	@OriginalMember(owner = "client!kg", name = "c", descriptor = "(Lclient!kg;)V")
	public void method2300(@OriginalArg(0) Class107 arg0) {
		if (this.anInt2869 == 0) {
			return;
		}
		@Pc(14) boolean local14 = this.anInt2864 == -1 || this.anInt2866 != Static173.anInt3332;
		if (!this.aBoolean198 && !local14) {
			return;
		}
		if (local14) {
			this.anInt2866 = Static173.anInt3332;
			this.anInt2864 = Static267.method4208(Static267.anInt5137, this.anInt2861, this.anInt2861);
		} else {
			Static94.method1600(this.anInt2864);
			Static267.method4207(Static267.anInt5137, this.anInt2861, this.anInt2861);
		}
		if (this.anInt2869 == 1) {
			this.method2296(arg0);
			this.aBoolean198 = false;
		} else if (this.anInt2869 == 2) {
			this.aBoolean198 = !this.method2297(arg0);
		}
	}

	@OriginalMember(owner = "client!kg", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method2313();
		super.finalize();
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIII)Z")
	public boolean method2301(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean199) {
			this.anInt2860 = 1073741823;
			local7 = this.anInt2863;
			local12 = this.anInt2867;
			local17 = this.anInt2862;
		} else {
			local7 = this.anInt2863 - arg0;
			local12 = this.anInt2867 - arg1;
			local17 = this.anInt2862 - arg2;
			this.anInt2860 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt2860 == 0) {
				this.anInt2860 = 1;
			}
			local7 = (local7 << 8) / this.anInt2860;
			local12 = (local12 << 8) / this.anInt2860;
			local17 = (local17 << 8) / this.anInt2860;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt2856 = this.anInt2854 * arg3 / (this.aBoolean199 ? 1024 : this.anInt2860);
		} else {
			this.anInt2856 = 0;
		}
		if (this.anInt2856 < 8) {
			this.method2313();
			this.aClass4_Sub3_Sub14_Sub1_5 = null;
			return false;
		}
		@Pc(145) int local145 = Static162.method2618(this.anInt2856);
		if (local145 > 512) {
			local145 = 512;
		}
		if (local145 != this.anInt2861) {
			this.anInt2861 = local145;
		}
		this.anInt2865 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 325.9493103027344D) & 0x7FF;
		this.anInt2855 = (int) (Math.atan2((double) local7, (double) -local17) * 325.9493103027344D) & 0x7FF;
		this.aBoolean198 = true;
		this.aClass4_Sub3_Sub14_Sub1_5 = null;
		return true;
	}

	@OriginalMember(owner = "client!kg", name = "d", descriptor = "(Lclient!kg;)Z")
	private boolean method2305(@OriginalArg(0) Class107 arg0) {
		if (this.aClass4_Sub3_Sub14_Sub1_5 == null) {
			if (this.anInt2869 == 0) {
				this.aClass4_Sub3_Sub14_Sub1_5 = Static158.anInterface5_1.method452(true, Static158.aFloat74, this.anInt2861, this.anInt2858);
			} else if (this.anInt2869 == 2) {
				this.method2311(arg0);
			} else if (this.anInt2869 == 1) {
				this.method2307(arg0);
			}
		}
		return this.aClass4_Sub3_Sub14_Sub1_5 != null;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIIIILclient!kg;)V")
	public void method2306(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class107 arg6) {
		@Pc(6) int local6 = this.anInt2865 - arg4 & 0x7FF;
		@Pc(13) int local13 = this.anInt2855 - arg5 & 0x7FF;
		if (local13 > 1024) {
			local13 -= 2048;
		}
		if (local6 > 1024) {
			local6 -= 2048;
		}
		@Pc(27) int local27 = local6 * arg3 / 512;
		@Pc(33) int local33 = local13 * arg3 / -512;
		@Pc(42) int local42 = local27 + (arg3 - this.anInt2856) / 2;
		@Pc(51) int local51 = local33 + (arg2 - this.anInt2856) / 2;
		if (local42 < arg3 && local42 + this.anInt2856 > 0 && local51 < arg2 && local51 + this.anInt2856 > 0 && this.method2305(arg6)) {
			this.aClass4_Sub3_Sub14_Sub1_5.method4544(local51 + arg0, local42 + arg1, this.anInt2856, this.anInt2856);
		}
	}

	@OriginalMember(owner = "client!kg", name = "e", descriptor = "(Lclient!kg;)V")
	private void method2307(@OriginalArg(0) Class107 arg0) {
		Static146.method2303();
		Static146.method2302();
		this.aClass4_Sub3_Sub14_Sub1_5 = new Class4_Sub3_Sub14_Sub1_Sub1(this.anInt2861, this.anInt2861);
		Static270.method4260(Static146.anIntArray256);
		this.aClass4_Sub3_Sub14_Sub1_5.method2179();
		Static158.method2574();
		Static270.method4242(0, 0, this.anInt2861, this.anInt2861, 0);
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 256;
		if (arg0 != null) {
			if (arg0.aBoolean199) {
				local26 = -arg0.anInt2863;
				local28 = -arg0.anInt2867;
				local30 = -arg0.anInt2862;
			} else {
				local26 = this.anInt2863 - arg0.anInt2863;
				local28 = this.anInt2867 - arg0.anInt2867;
				local30 = this.anInt2862 - arg0.anInt2862;
			}
		}
		@Pc(74) int local74;
		@Pc(79) int local79;
		@Pc(91) int local91;
		if (this.anInt2865 != 0) {
			local74 = Class111.anIntArray299[this.anInt2865];
			local79 = Class111.anIntArray298[this.anInt2865];
			local91 = local28 * local79 + 32767 - local30 * local74 >> 16;
			local30 = local28 * local74 + local30 * local79 + 32767 >> 16;
			local28 = local91;
		}
		@Pc(135) int local135;
		if (this.anInt2855 != 0) {
			local74 = this.anInt2855 - 1024 & 0x7FF;
			local79 = Class111.anIntArray299[local74];
			local91 = Class111.anIntArray298[local74];
			local135 = local30 * local79 + local26 * local91 + 32767 >> 16;
			local30 = local30 * local91 + 32767 - local26 * local79 >> 16;
			local26 = local135;
		}
		Static316.method72(Static146.aClass53_Sub3_1.aShortArray53, 0, Static146.aClass53_Sub3_1.anInt3353, (short) Static158.anInterface5_1.method446(this.anInt2858));
		@Pc(172) Class53_Sub4_Sub1 local172 = Static146.aClass53_Sub3_1.method2772(64, 512, -local26, -local28, -local30);
		local79 = local172.method3875() - local172.method3866();
		local91 = local172.method3879() - local172.method3850();
		if (local79 > local91) {
			local135 = this.anInt2859 == 0 ? (local79 << 9) / this.anInt2861 : (local79 * 16 << 9) / (this.anInt2861 * 13);
			local172.method2924(0, 0, 0, 0, 0, 0, local135);
		} else {
			local135 = this.anInt2859 == 0 ? (local91 << 9) / this.anInt2861 : (local91 * 16 << 9) / (this.anInt2861 * 13);
			local172.method2924(0, 0, 0, 0, 0, 0, local135);
		}
		if (this.anInt2859 == 0) {
			for (local135 = 0; local135 < Static270.anIntArray561.length; local135++) {
				if (Static270.anIntArray561[local135] != 0) {
					Static270.anIntArray561[local135] |= 0xFF000000;
				}
			}
		} else {
			this.method2308();
			this.method2298();
		}
		Static152.aClass59_1.method4281();
		Static270.method4263(Static146.anIntArray256);
		Static158.method2574();
	}

	@OriginalMember(owner = "client!kg", name = "e", descriptor = "()V")
	private void method2308() {
		@Pc(6) int local6 = this.anInt2861 * 3 / 32;
		@Pc(15) int local15 = this.anInt2861 * 13 / 16;
		@Pc(17) int local17 = local15;
		@Pc(21) int local21 = 8388608 / local15;
		@Pc(25) int local25 = 8388608 / local15;
		@Pc(31) int local31 = local6 + local6 * Static270.anInt5189;
		@Pc(35) int local35 = Static270.anInt5189 - local15;
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 0;
		if (local6 + local15 > Static270.anInt5188) {
			local17 = local15 + Static270.anInt5188 - local6 - local15;
		}
		@Pc(59) int local59;
		if (local6 < Static270.anInt5184) {
			local59 = Static270.anInt5184 - local6;
			local17 -= local59;
			local31 += local59 * Static270.anInt5189;
			local39 = local25 * local59;
		}
		if (local6 + local15 > Static270.anInt5187) {
			local59 = local6 + local15 - Static270.anInt5187;
			local15 -= local59;
			local35 += local59;
		}
		if (local6 < Static270.anInt5186) {
			local59 = Static270.anInt5186 - local6;
			local15 -= local59;
			local31 += local59;
			local37 = local21 * local59;
			local35 += local59;
		}
		this.method2295(Static270.anIntArray561, this.anInt2859, local37, local39, local31, local35, local15, local17, local21, local25);
	}

	@OriginalMember(owner = "client!kg", name = "f", descriptor = "(Lclient!kg;)V")
	private void method2311(@OriginalArg(0) Class107 arg0) {
		@Pc(5) Class53_Sub3 local5 = Static176.method2765(Static64.aClass58_37, this.anInt2858);
		if (local5 == null) {
			return;
		}
		this.aClass4_Sub3_Sub14_Sub1_5 = new Class4_Sub3_Sub14_Sub1(this.anInt2861, this.anInt2861);
		Static270.method4260(Static146.anIntArray256);
		this.aClass4_Sub3_Sub14_Sub1_5.method2179();
		Static158.method2574();
		Static270.method4242(0, 0, this.anInt2861, this.anInt2861, 0);
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 256;
		if (arg0 != null) {
			if (arg0.aBoolean199) {
				local33 = -arg0.anInt2863;
				local35 = -arg0.anInt2867;
				local37 = -arg0.anInt2862;
			} else {
				local33 = this.anInt2863 - arg0.anInt2863;
				local35 = this.anInt2867 - arg0.anInt2867;
				local37 = this.anInt2862 - arg0.anInt2862;
			}
		}
		@Pc(81) int local81;
		@Pc(86) int local86;
		@Pc(98) int local98;
		if (this.anInt2865 != 0) {
			local81 = Class111.anIntArray299[this.anInt2865];
			local86 = Class111.anIntArray298[this.anInt2865];
			local98 = local35 * local86 + 32767 - local37 * local81 >> 16;
			local37 = local35 * local81 + local37 * local86 + 32767 >> 16;
			local35 = local98;
		}
		@Pc(142) int local142;
		if (this.anInt2855 != 0) {
			local81 = this.anInt2855 - 1024 & 0x7FF;
			local86 = Class111.anIntArray299[local81];
			local98 = Class111.anIntArray298[local81];
			local142 = local37 * local86 + local33 * local98 + 32767 >> 16;
			local37 = local37 * local98 + 32767 - local33 * local86 >> 16;
			local33 = local142;
		}
		@Pc(167) Class53_Sub4_Sub1 local167 = local5.method2772(64, 768, -local33, -local35, -local37);
		local86 = local167.method3875() - local167.method3866();
		local98 = local167.method3879() - local167.method3850();
		local142 = local167.method3866() + local86 / 2;
		@Pc(193) int local193 = local167.method3850() + local98 / 2;
		if (local86 > local98) {
			local167.method2924(0, 0, 0, -local142, -local193, 0, (local86 << 9) / this.anInt2861);
		} else {
			local167.method2924(0, 0, 0, -local142, -local193, 0, (local98 << 9) / this.anInt2861);
		}
		Static152.aClass59_1.method4281();
		Static270.method4263(Static146.anIntArray256);
		Static158.method2574();
	}

	@OriginalMember(owner = "client!kg", name = "i", descriptor = "()V")
	private void method2313() {
		if (this.anInt2864 != -1) {
			Static173.method2733(this.anInt2864, 0, this.anInt2866);
		}
		this.aBoolean198 = true;
		this.anInt2864 = -1;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "([IIIIIIIIIII)V")
	private void method2314(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(1) int local1 = arg2;
		for (@Pc(4) int local4 = -arg7; local4 < 0; local4++) {
			@Pc(12) int local12 = (arg3 >> 16) * 128;
			for (@Pc(15) int local15 = -arg6; local15 < 0; local15++) {
				if (arg0[arg4] == 0) {
					arg0[arg4] = (Static146.aByteArray29[(arg2 >> 16) + local12] & 0xFF) << 24 | arg1;
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
}
