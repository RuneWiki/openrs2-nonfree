import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ma")
public final class Class109 {

	@OriginalMember(owner = "client!ma", name = "h", descriptor = "I")
	private int anInt3139;

	@OriginalMember(owner = "client!ma", name = "i", descriptor = "I")
	private int anInt3140;

	@OriginalMember(owner = "client!ma", name = "l", descriptor = "Lclient!eg;")
	private Class8_Sub1_Sub7_Sub1 aClass8_Sub1_Sub7_Sub1_3;

	@OriginalMember(owner = "client!ma", name = "o", descriptor = "I")
	private int anInt3144;

	@OriginalMember(owner = "client!ma", name = "q", descriptor = "I")
	private int anInt3145;

	@OriginalMember(owner = "client!ma", name = "r", descriptor = "I")
	public int anInt3146;

	@OriginalMember(owner = "client!ma", name = "j", descriptor = "I")
	private int anInt3141 = -1;

	@OriginalMember(owner = "client!ma", name = "e", descriptor = "Z")
	private boolean aBoolean264 = true;

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "I")
	private int anInt3137 = -1;

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "I")
	private int anInt3136;

	@OriginalMember(owner = "client!ma", name = "s", descriptor = "I")
	private int anInt3147;

	@OriginalMember(owner = "client!ma", name = "f", descriptor = "I")
	private int anInt3138;

	@OriginalMember(owner = "client!ma", name = "k", descriptor = "Z")
	private boolean aBoolean265;

	@OriginalMember(owner = "client!ma", name = "u", descriptor = "I")
	private int anInt3149;

	@OriginalMember(owner = "client!ma", name = "n", descriptor = "I")
	private int anInt3143;

	@OriginalMember(owner = "client!ma", name = "x", descriptor = "I")
	private int anInt3151;

	@OriginalMember(owner = "client!ma", name = "t", descriptor = "I")
	private int anInt3148;

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class109(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt3136 = arg2;
		this.anInt3147 = arg3;
		this.anInt3138 = arg4;
		this.aBoolean265 = arg7;
		this.anInt3149 = arg1;
		this.anInt3143 = arg6;
		this.anInt3151 = arg5;
		this.anInt3148 = arg0;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!ma;)Z")
	private boolean method2466(@OriginalArg(0) Class109 arg0) {
		@Pc(5) Class36_Sub7 local5 = Static281.method4202(Static131.aClass132_45, this.anInt3149);
		if (local5 == null) {
			return false;
		}
		@Pc(11) GL local11 = Static116.aGL1;
		Static126.method2005(Static155.anIntArray248);
		Static126.method1999();
		local11.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
		local11.glClear(16640);
		@Pc(25) int local25 = 0;
		@Pc(27) int local27 = 0;
		@Pc(29) int local29 = 256;
		if (arg0 != null) {
			if (arg0.aBoolean265) {
				local25 = -arg0.anInt3136;
				local27 = -arg0.anInt3147;
				local29 = -arg0.anInt3138;
			} else {
				local25 = this.anInt3136 - arg0.anInt3136;
				local27 = this.anInt3147 - arg0.anInt3147;
				local29 = this.anInt3138 - arg0.anInt3138;
			}
		}
		local5.method4201();
		@Pc(78) Class36_Sub2 local78 = local5.method4193(64, 768, -local25, -local27, -local29);
		@Pc(86) int local86 = (local78.method3947() - local78.method3948()) / 2;
		@Pc(94) int local94 = (local78.method3939() - local78.method4175()) / 2;
		@Pc(101) int local101 = local86 > local94 ? local86 : local94;
		Static251.method3771((float) -local101, (float) local101, (float) -local101, (float) local101, 2048.0F, -2048.0F, this.anInt3145, this.anInt3145);
		@Pc(126) int local126;
		@Pc(131) int local131;
		@Pc(143) int local143;
		if (this.anInt3140 != 0) {
			local126 = Class68.anIntArray137[this.anInt3140];
			local131 = Class68.anIntArray139[this.anInt3140];
			local143 = local27 * local131 + 32767 - local29 * local126 >> 16;
			local29 = local27 * local126 + local29 * local131 + 32767 >> 16;
			local27 = local143;
		}
		if (this.anInt3144 != 0) {
			local126 = this.anInt3144 - 1024 & 0x7FF;
			local131 = Class68.anIntArray137[local126];
			local143 = Class68.anIntArray139[local126];
			@Pc(187) int local187 = local29 * local131 + local25 * local143 + 32767 >> 16;
			local29 = local29 * local143 + 32767 - local25 * local131 >> 16;
			local25 = local187;
		}
		Static233.method3550((float) -local25, (float) local27, (float) -local29);
		Static233.method3553(16777215, 0.5F, 0.5F, 0.5F);
		Static233.method3551();
		Static116.method1881();
		Static116.method1871(true);
		Static116.method1883(true);
		local78.method3949(0, 0, 0, -local86 - local78.method3948(), -local94 - local78.method4175(), 0, -1L);
		Static116.method1883(false);
		Static116.method1871(false);
		Static116.method1874();
		Static251.method3767();
		Static116.method1897(this.anInt3137);
		local11.glCopyTexImage2D(3553, 0, 6408, 0, 0, this.anInt3145, this.anInt3145, 0);
		Static126.method2003(Static155.anIntArray248);
		return true;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "([IIIIIIIIIIII)V")
	private void method2467(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(1) int local1 = arg2;
		for (@Pc(4) int local4 = -arg7; local4 < 0; local4++) {
			@Pc(12) int local12 = (arg3 >> 16) * 128;
			for (@Pc(15) int local15 = -arg6; local15 < 0; local15++) {
				if (arg0[arg4] != 0) {
					@Pc(25) int local25 = arg0[arg4];
					@Pc(37) int local37 = (Static155.aByteArray27[(arg2 >> 16) + local12] & 0xFF) + 64;
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

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(Lclient!ma;)Z")
	private boolean method2469(@OriginalArg(0) Class109 arg0) {
		if (this.aClass8_Sub1_Sub7_Sub1_3 == null) {
			if (this.anInt3148 == 0) {
				this.aClass8_Sub1_Sub7_Sub1_3 = Static96.anInterface4_1.method1260(true, Static96.aFloat21, this.anInt3145, this.anInt3149);
			} else if (this.anInt3148 == 2) {
				this.method2477(arg0);
			} else if (this.anInt3148 == 1) {
				this.method2485(arg0);
			}
		}
		return this.aClass8_Sub1_Sub7_Sub1_3 != null;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "([IIIIIIIIIII)V")
	private void method2470(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(1) int local1 = arg2;
		for (@Pc(4) int local4 = -arg7; local4 < 0; local4++) {
			@Pc(12) int local12 = (arg3 >> 16) * 128;
			for (@Pc(15) int local15 = -arg6; local15 < 0; local15++) {
				if (arg0[arg4] == 0) {
					arg0[arg4] = (Static155.aByteArray27[(arg2 >> 16) + local12] & 0xFF) << 24 | arg1;
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

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "(Lclient!ma;)V")
	private void method2471(@OriginalArg(0) Class109 arg0) {
		Static155.method2483();
		Static155.method2480();
		@Pc(3) GL local3 = Static116.aGL1;
		Static126.method2005(Static155.anIntArray248);
		Static126.method1999();
		local3.glClearColor((float) (this.anInt3143 >> 16 & 0xFF) / 255.0F, (float) (this.anInt3143 >> 8 & 0xFF) / 255.0F, (float) (this.anInt3143 & 0xFF) / 255.0F, 0.0F);
		local3.glClear(16640);
		@Pc(39) int local39 = 0;
		@Pc(41) int local41 = 0;
		@Pc(43) int local43 = 256;
		if (arg0 != null) {
			if (arg0.aBoolean265) {
				local39 = -arg0.anInt3136;
				local41 = -arg0.anInt3147;
				local43 = -arg0.anInt3138;
			} else {
				local39 = this.anInt3136 - arg0.anInt3136;
				local41 = this.anInt3147 - arg0.anInt3147;
				local43 = this.anInt3138 - arg0.anInt3138;
			}
		}
		Static251.method3768(-1.0F, 1.0F, -1.0F, 1.0F, this.anInt3145, this.anInt3145);
		@Pc(96) int local96;
		@Pc(101) int local101;
		@Pc(113) int local113;
		if (this.anInt3140 != 0) {
			local96 = Class68.anIntArray137[this.anInt3140];
			local101 = Class68.anIntArray139[this.anInt3140];
			local113 = local41 * local101 + 32767 - local43 * local96 >> 16;
			local43 = local41 * local96 + local43 * local101 + 32767 >> 16;
			local41 = local113;
		}
		if (this.anInt3144 != 0) {
			local96 = this.anInt3144 - 1024 & 0x7FF;
			local101 = Class68.anIntArray137[local96];
			local113 = Class68.anIntArray139[local96];
			@Pc(157) int local157 = local43 * local101 + local39 * local113 + 32767 >> 16;
			local43 = local43 * local113 + 32767 - local39 * local101 >> 16;
			local39 = local157;
		}
		Static233.method3550((float) -local39, (float) -local41, (float) local43);
		Static233.method3553(16777215, 0.5F, 0.5F, 1.0F);
		Static233.method3551();
		if (this.anInt3143 != 0) {
			local3.glScalef(0.8125F, 0.8125F, 1.0F);
		}
		Static96.anInterface4_1.method1269(this.anInt3149, this.anInt3145);
		Static116.method1883(true);
		if (Static116.aBoolean195) {
			local3.glBindBufferARB(34962, 0);
			local3.glBindBufferARB(34963, 0);
		}
		local3.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		local3.glDisableClientState(32886);
		local3.glNormalPointer(5126, 20, Static155.aByteBuffer7.position(0));
		local3.glVertexPointer(2, 5126, 20, Static155.aByteBuffer7.position(0));
		local3.glTexCoordPointer(2, 5126, 20, Static155.aByteBuffer7.position(12));
		local3.glDrawElements(5, Static155.aByteBuffer8.limit() / 2, 5123, Static155.aByteBuffer8.position(0));
		local3.glEnableClientState(32886);
		Static116.method1883(false);
		if (this.anInt3143 != 0) {
			Static108.method1772(0, 0);
			Static116.method1884(1);
			Static116.method1889(0);
			Static116.method1897(Static155.anInt3142);
			local3.glColorMask(true, true, true, false);
			local3.glTexEnvi(8960, 34176, 34168);
			local3.glTexEnvi(8960, 34200, 771);
			local3.glBegin(7);
			local3.glColor4ub((byte) (this.anInt3143 >> 16), (byte) (this.anInt3143 >> 8), (byte) this.anInt3143, (byte) 127);
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
			local3.glColor4ub((byte) (this.anInt3143 >> 16), (byte) (this.anInt3143 >> 8), (byte) this.anInt3143, (byte) -1);
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
		Static251.method3767();
		Static116.method1897(this.anInt3137);
		local3.glCopyTexImage2D(3553, 0, 6408, 0, 0, this.anInt3145, this.anInt3145, 0);
		Static126.method2003(Static155.anIntArray248);
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIIII)V")
	public void method2472(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(6) int local6 = this.anInt3140 - arg4 & 0x7FF;
		@Pc(13) int local13 = this.anInt3144 - arg5 & 0x7FF;
		if (local13 > 1024) {
			local13 -= 2048;
		}
		if (local6 > 1024) {
			local6 -= 2048;
		}
		@Pc(27) int local27 = local6 * arg3 / 512;
		@Pc(33) int local33 = local13 * arg3 / -512;
		@Pc(42) int local42 = local27 + (arg3 - this.anInt3139) / 2;
		@Pc(51) int local51 = local33 + (arg2 - this.anInt3139) / 2;
		if (local42 >= arg3 || local42 + this.anInt3139 <= 0 || local51 >= arg2 || local51 + this.anInt3139 <= 0) {
			return;
		}
		if (this.anInt3148 == 0) {
			Static96.anInterface4_1.method1269(this.anInt3149, this.anInt3145);
		} else if (this.anInt3137 == -1) {
			return;
		} else {
			Static116.method1897(this.anInt3137);
		}
		local27 = local42 + arg1;
		local33 = local51 + arg0;
		@Pc(100) int local100 = local33 + this.anInt3139;
		@Pc(105) int local105 = local27 + this.anInt3139;
		@Pc(107) GL local107 = Static116.aGL1;
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

	@OriginalMember(owner = "client!ma", name = "d", descriptor = "(Lclient!ma;)V")
	public void method2473(@OriginalArg(0) Class109 arg0) {
		if (this.anInt3148 == 0) {
			return;
		}
		@Pc(14) boolean local14 = this.anInt3137 == -1 || this.anInt3141 != Static166.anInt3350;
		if (!this.aBoolean264 && !local14) {
			return;
		}
		if (local14) {
			this.anInt3141 = Static166.anInt3350;
			this.anInt3137 = Static287.method4254(Static287.anInt5640, this.anInt3145, this.anInt3145);
		} else {
			Static116.method1897(this.anInt3137);
			Static287.method4260(Static287.anInt5640, this.anInt3145, this.anInt3145);
		}
		if (this.anInt3148 == 1) {
			this.method2471(arg0);
			this.aBoolean264 = false;
		} else if (this.anInt3148 == 2) {
			this.aBoolean264 = !this.method2466(arg0);
		}
	}

	@OriginalMember(owner = "client!ma", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method2484();
		super.finalize();
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "()V")
	private void method2474() {
		@Pc(6) int local6 = this.anInt3145 * 3 / 32;
		@Pc(15) int local15 = this.anInt3145 * 13 / 16;
		@Pc(17) int local17 = local15;
		@Pc(21) int local21 = 8388608 / local15;
		@Pc(25) int local25 = 8388608 / local15;
		@Pc(31) int local31 = local6 + local6 * Static103.anInt2161;
		@Pc(35) int local35 = Static103.anInt2161 - local15;
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 0;
		if (local6 + local15 > Static103.anInt2159) {
			local17 = local15 + Static103.anInt2159 - local6 - local15;
		}
		@Pc(59) int local59;
		if (local6 < Static103.anInt2162) {
			local59 = Static103.anInt2162 - local6;
			local17 -= local59;
			local31 += local59 * Static103.anInt2161;
			local39 = local25 * local59;
		}
		if (local6 + local15 > Static103.anInt2163) {
			local59 = local6 + local15 - Static103.anInt2163;
			local15 -= local59;
			local35 += local59;
		}
		if (local6 < Static103.anInt2160) {
			local59 = Static103.anInt2160 - local6;
			local15 -= local59;
			local31 += local59;
			local37 = local21 * local59;
			local35 += local59;
		}
		this.method2467(Static103.anIntArray155, this.anInt3143, local37, local39, local31, local35, local15, local17, local21, local25);
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIIIILclient!ma;)V")
	public void method2475(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class109 arg6) {
		@Pc(6) int local6 = this.anInt3140 - arg4 & 0x7FF;
		@Pc(13) int local13 = this.anInt3144 - arg5 & 0x7FF;
		if (local13 > 1024) {
			local13 -= 2048;
		}
		if (local6 > 1024) {
			local6 -= 2048;
		}
		@Pc(27) int local27 = local6 * arg3 / 512;
		@Pc(33) int local33 = local13 * arg3 / -512;
		@Pc(42) int local42 = local27 + (arg3 - this.anInt3139) / 2;
		@Pc(51) int local51 = local33 + (arg2 - this.anInt3139) / 2;
		if (local42 < arg3 && local42 + this.anInt3139 > 0 && local51 < arg2 && local51 + this.anInt3139 > 0 && this.method2469(arg6)) {
			this.aClass8_Sub1_Sub7_Sub1_3.method2808(local51 + arg0, local42 + arg1, this.anInt3139, this.anInt3139);
		}
	}

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "()V")
	private void method2476() {
		@Pc(2) int local2 = this.anInt3145;
		@Pc(5) int local5 = this.anInt3145;
		@Pc(9) int local9 = 8388608 / local2;
		@Pc(13) int local13 = 8388608 / local5;
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = 0;
		@Pc(23) int local23 = Static103.anInt2161 - local2;
		if (local5 > Static103.anInt2159) {
			local5 -= local5 - Static103.anInt2159;
		}
		@Pc(37) int local37;
		if (Static103.anInt2162 > 0) {
			local37 = Static103.anInt2162;
			local5 -= local37;
			local19 = local37 * Static103.anInt2161;
			local17 = local13 * local37;
		}
		if (local2 > Static103.anInt2163) {
			local37 = local2 - Static103.anInt2163;
			local2 -= local37;
			local23 += local37;
		}
		if (Static103.anInt2160 > 0) {
			local37 = Static103.anInt2160;
			local2 -= local37;
			local19 += local37;
			local15 = local9 * local37;
			local23 += local37;
		}
		this.method2470(Static103.anIntArray155, this.anInt3143, local15, local17, local19, local23, local2, local5, local9, local13);
	}

	@OriginalMember(owner = "client!ma", name = "e", descriptor = "(Lclient!ma;)V")
	private void method2477(@OriginalArg(0) Class109 arg0) {
		@Pc(5) Class36_Sub7 local5 = Static281.method4202(Static131.aClass132_45, this.anInt3149);
		if (local5 == null) {
			return;
		}
		this.aClass8_Sub1_Sub7_Sub1_3 = new Class8_Sub1_Sub7_Sub1(this.anInt3145, this.anInt3145);
		Static103.method1676(Static155.anIntArray248);
		this.aClass8_Sub1_Sub7_Sub1_3.method1649();
		Static96.method1541();
		Static103.method1664(0, 0, this.anInt3145, this.anInt3145, 0);
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 256;
		if (arg0 != null) {
			if (arg0.aBoolean265) {
				local33 = -arg0.anInt3136;
				local35 = -arg0.anInt3147;
				local37 = -arg0.anInt3138;
			} else {
				local33 = this.anInt3136 - arg0.anInt3136;
				local35 = this.anInt3147 - arg0.anInt3147;
				local37 = this.anInt3138 - arg0.anInt3138;
			}
		}
		@Pc(81) int local81;
		@Pc(86) int local86;
		@Pc(98) int local98;
		if (this.anInt3140 != 0) {
			local81 = Class68.anIntArray137[this.anInt3140];
			local86 = Class68.anIntArray139[this.anInt3140];
			local98 = local35 * local86 + 32767 - local37 * local81 >> 16;
			local37 = local35 * local81 + local37 * local86 + 32767 >> 16;
			local35 = local98;
		}
		@Pc(142) int local142;
		if (this.anInt3144 != 0) {
			local81 = this.anInt3144 - 1024 & 0x7FF;
			local86 = Class68.anIntArray137[local81];
			local98 = Class68.anIntArray139[local81];
			local142 = local37 * local86 + local33 * local98 + 32767 >> 16;
			local37 = local37 * local98 + 32767 - local33 * local86 >> 16;
			local33 = local142;
		}
		@Pc(167) Class36_Sub2_Sub2 local167 = local5.method4208(64, 768, -local33, -local35, -local37);
		local86 = local167.method3947() - local167.method3948();
		local98 = local167.method3939() - local167.method4175();
		local142 = local167.method3948() + local86 / 2;
		@Pc(193) int local193 = local167.method4175() + local98 / 2;
		if (local86 > local98) {
			local167.method3973(0, 0, 0, -local142, -local193, 0, (local86 << 9) / this.anInt3145);
		} else {
			local167.method3973(0, 0, 0, -local142, -local193, 0, (local98 << 9) / this.anInt3145);
		}
		Static99.aClass4_1.method3760();
		Static103.method1666(Static155.anIntArray248);
		Static96.method1541();
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIII)Z")
	public boolean method2481(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean265) {
			this.anInt3146 = 1073741823;
			local7 = this.anInt3136;
			local12 = this.anInt3147;
			local17 = this.anInt3138;
		} else {
			local7 = this.anInt3136 - arg0;
			local12 = this.anInt3147 - arg1;
			local17 = this.anInt3138 - arg2;
			this.anInt3146 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt3146 == 0) {
				this.anInt3146 = 1;
			}
			local7 = (local7 << 8) / this.anInt3146;
			local12 = (local12 << 8) / this.anInt3146;
			local17 = (local17 << 8) / this.anInt3146;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt3139 = this.anInt3151 * arg3 / (this.aBoolean265 ? 1024 : this.anInt3146);
		} else {
			this.anInt3139 = 0;
		}
		if (this.anInt3139 < 8) {
			this.method2484();
			this.aClass8_Sub1_Sub7_Sub1_3 = null;
			return false;
		}
		@Pc(145) int local145 = Static125.method1987(this.anInt3139);
		if (local145 > 512) {
			local145 = 512;
		}
		if (local145 != this.anInt3145) {
			this.anInt3145 = local145;
		}
		this.anInt3140 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 325.9493103027344D) & 0x7FF;
		this.anInt3144 = (int) (Math.atan2((double) local7, (double) -local17) * 325.9493103027344D) & 0x7FF;
		this.aBoolean264 = true;
		this.aClass8_Sub1_Sub7_Sub1_3 = null;
		return true;
	}

	@OriginalMember(owner = "client!ma", name = "i", descriptor = "()V")
	private void method2484() {
		if (this.anInt3137 != -1) {
			Static166.method2639(this.anInt3137, 0, this.anInt3141);
		}
		this.aBoolean264 = true;
		this.anInt3137 = -1;
	}

	@OriginalMember(owner = "client!ma", name = "f", descriptor = "(Lclient!ma;)V")
	private void method2485(@OriginalArg(0) Class109 arg0) {
		Static155.method2468();
		Static155.method2479();
		this.aClass8_Sub1_Sub7_Sub1_3 = new Class8_Sub1_Sub7_Sub1_Sub1(this.anInt3145, this.anInt3145);
		Static103.method1676(Static155.anIntArray248);
		this.aClass8_Sub1_Sub7_Sub1_3.method1649();
		Static96.method1541();
		Static103.method1664(0, 0, this.anInt3145, this.anInt3145, 0);
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 256;
		if (arg0 != null) {
			if (arg0.aBoolean265) {
				local26 = -arg0.anInt3136;
				local28 = -arg0.anInt3147;
				local30 = -arg0.anInt3138;
			} else {
				local26 = this.anInt3136 - arg0.anInt3136;
				local28 = this.anInt3147 - arg0.anInt3147;
				local30 = this.anInt3138 - arg0.anInt3138;
			}
		}
		@Pc(74) int local74;
		@Pc(79) int local79;
		@Pc(91) int local91;
		if (this.anInt3140 != 0) {
			local74 = Class68.anIntArray137[this.anInt3140];
			local79 = Class68.anIntArray139[this.anInt3140];
			local91 = local28 * local79 + 32767 - local30 * local74 >> 16;
			local30 = local28 * local74 + local30 * local79 + 32767 >> 16;
			local28 = local91;
		}
		@Pc(135) int local135;
		if (this.anInt3144 != 0) {
			local74 = this.anInt3144 - 1024 & 0x7FF;
			local79 = Class68.anIntArray137[local74];
			local91 = Class68.anIntArray139[local74];
			local135 = local30 * local79 + local26 * local91 + 32767 >> 16;
			local30 = local30 * local91 + 32767 - local26 * local79 >> 16;
			local26 = local135;
		}
		Static301.method501(Static155.aClass36_Sub7_1.aShortArray75, 0, Static155.aClass36_Sub7_1.anInt5547, (short) Static96.anInterface4_1.method1259(this.anInt3149));
		@Pc(172) Class36_Sub2_Sub2 local172 = Static155.aClass36_Sub7_1.method4208(64, 512, -local26, -local28, -local30);
		local79 = local172.method3947() - local172.method3948();
		local91 = local172.method3939() - local172.method4175();
		if (local79 > local91) {
			local135 = this.anInt3143 == 0 ? (local79 << 9) / this.anInt3145 : (local79 * 16 << 9) / (this.anInt3145 * 13);
			local172.method3973(0, 0, 0, 0, 0, 0, local135);
		} else {
			local135 = this.anInt3143 == 0 ? (local91 << 9) / this.anInt3145 : (local91 * 16 << 9) / (this.anInt3145 * 13);
			local172.method3973(0, 0, 0, 0, 0, 0, local135);
		}
		if (this.anInt3143 == 0) {
			for (local135 = 0; local135 < Static103.anIntArray155.length; local135++) {
				if (Static103.anIntArray155[local135] != 0) {
					Static103.anIntArray155[local135] |= 0xFF000000;
				}
			}
		} else {
			this.method2474();
			this.method2476();
		}
		Static99.aClass4_1.method3760();
		Static103.method1666(Static155.anIntArray248);
		Static96.method1541();
	}
}
