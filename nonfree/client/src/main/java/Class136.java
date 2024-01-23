import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qd")
public final class Class136 {

	@OriginalMember(owner = "client!qd", name = "f", descriptor = "Lclient!kn;")
	private Class1_Sub2_Sub11_Sub2 aClass1_Sub2_Sub11_Sub2_3;

	@OriginalMember(owner = "client!qd", name = "o", descriptor = "I")
	private int anInt4191;

	@OriginalMember(owner = "client!qd", name = "p", descriptor = "I")
	private int anInt4192;

	@OriginalMember(owner = "client!qd", name = "q", descriptor = "I")
	private int anInt4193;

	@OriginalMember(owner = "client!qd", name = "w", descriptor = "I")
	private int anInt4199;

	@OriginalMember(owner = "client!qd", name = "x", descriptor = "I")
	public int anInt4200;

	@OriginalMember(owner = "client!qd", name = "g", descriptor = "Z")
	private boolean aBoolean323 = true;

	@OriginalMember(owner = "client!qd", name = "t", descriptor = "I")
	private int anInt4196 = -1;

	@OriginalMember(owner = "client!qd", name = "u", descriptor = "I")
	private int anInt4197 = -1;

	@OriginalMember(owner = "client!qd", name = "r", descriptor = "I")
	private int anInt4194;

	@OriginalMember(owner = "client!qd", name = "k", descriptor = "I")
	private int anInt4189;

	@OriginalMember(owner = "client!qd", name = "v", descriptor = "I")
	private int anInt4198;

	@OriginalMember(owner = "client!qd", name = "d", descriptor = "Z")
	private boolean aBoolean322;

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "I")
	private int anInt4185;

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "I")
	private int anInt4186;

	@OriginalMember(owner = "client!qd", name = "m", descriptor = "I")
	private int anInt4190;

	@OriginalMember(owner = "client!qd", name = "i", descriptor = "I")
	private int anInt4188;

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class136(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt4194 = arg2;
		this.anInt4189 = arg3;
		this.anInt4198 = arg4;
		this.aBoolean322 = arg7;
		this.anInt4185 = arg1;
		this.anInt4186 = arg6;
		this.anInt4190 = arg5;
		this.anInt4188 = arg0;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIIIIILclient!qd;)V")
	public void method3331(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class136 arg6) {
		@Pc(6) int local6 = this.anInt4193 - arg4 & 0x7FF;
		@Pc(13) int local13 = this.anInt4199 - arg5 & 0x7FF;
		if (local13 > 1024) {
			local13 -= 2048;
		}
		if (local6 > 1024) {
			local6 -= 2048;
		}
		@Pc(27) int local27 = local6 * arg3 / 512;
		@Pc(33) int local33 = local13 * arg3 / -512;
		@Pc(42) int local42 = local27 + (arg3 - this.anInt4192) / 2;
		@Pc(51) int local51 = local33 + (arg2 - this.anInt4192) / 2;
		if (local42 < arg3 && local42 + this.anInt4192 > 0 && local51 < arg2 && local51 + this.anInt4192 > 0 && this.method3334(arg6)) {
			this.aClass1_Sub2_Sub11_Sub2_3.method3778(local51 + arg0, local42 + arg1, this.anInt4192, this.anInt4192);
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIII)Z")
	public boolean method3332(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean322) {
			this.anInt4200 = 1073741823;
			local7 = this.anInt4194;
			local12 = this.anInt4189;
			local17 = this.anInt4198;
		} else {
			local7 = this.anInt4194 - arg0;
			local12 = this.anInt4189 - arg1;
			local17 = this.anInt4198 - arg2;
			this.anInt4200 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt4200 == 0) {
				this.anInt4200 = 1;
			}
			local7 = (local7 << 8) / this.anInt4200;
			local12 = (local12 << 8) / this.anInt4200;
			local17 = (local17 << 8) / this.anInt4200;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt4192 = this.anInt4190 * arg3 / (this.aBoolean322 ? 1024 : this.anInt4200);
		} else {
			this.anInt4192 = 0;
		}
		if (this.anInt4192 < 8) {
			this.method3346();
			this.aClass1_Sub2_Sub11_Sub2_3 = null;
			return false;
		}
		@Pc(145) int local145 = Static215.method3400(this.anInt4192);
		if (local145 > 512) {
			local145 = 512;
		}
		if (local145 != this.anInt4191) {
			this.anInt4191 = local145;
		}
		this.anInt4193 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 325.9493103027344D) & 0x7FF;
		this.anInt4199 = (int) (Math.atan2((double) local7, (double) -local17) * 325.9493103027344D) & 0x7FF;
		this.aBoolean323 = true;
		this.aClass1_Sub2_Sub11_Sub2_3 = null;
		return true;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lclient!qd;)Z")
	private boolean method3334(@OriginalArg(0) Class136 arg0) {
		if (this.aClass1_Sub2_Sub11_Sub2_3 == null) {
			if (this.anInt4188 == 0) {
				this.aClass1_Sub2_Sub11_Sub2_3 = Static110.anInterface2_1.method2276(this.anInt4191, true, this.anInt4185, Static110.aFloat18);
			} else if (this.anInt4188 == 2) {
				this.method3348(arg0);
			} else if (this.anInt4188 == 1) {
				this.method3343(arg0);
			}
		}
		return this.aClass1_Sub2_Sub11_Sub2_3 != null;
	}

	@OriginalMember(owner = "client!qd", name = "d", descriptor = "()V")
	private void method3335() {
		@Pc(2) int local2 = this.anInt4191;
		@Pc(5) int local5 = this.anInt4191;
		@Pc(9) int local9 = 8388608 / local2;
		@Pc(13) int local13 = 8388608 / local5;
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = 0;
		@Pc(23) int local23 = Static50.anInt1138 - local2;
		if (local5 > Static50.anInt1136) {
			local5 -= local5 - Static50.anInt1136;
		}
		@Pc(37) int local37;
		if (Static50.anInt1135 > 0) {
			local37 = Static50.anInt1135;
			local5 -= local37;
			local19 = local37 * Static50.anInt1138;
			local17 = local13 * local37;
		}
		if (local2 > Static50.anInt1137) {
			local37 = local2 - Static50.anInt1137;
			local2 -= local37;
			local23 += local37;
		}
		if (Static50.anInt1139 > 0) {
			local37 = Static50.anInt1139;
			local2 -= local37;
			local19 += local37;
			local15 = local9 * local37;
			local23 += local37;
		}
		this.method3337(Static50.anIntArray107, this.anInt4186, local15, local17, local19, local23, local2, local5, local9, local13);
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(Lclient!qd;)V")
	private void method3336(@OriginalArg(0) Class136 arg0) {
		Static210.method3329();
		Static210.method3330();
		@Pc(3) GL local3 = Static277.aGL1;
		Static41.method841(Static210.anIntArray378);
		Static41.method842();
		local3.glClearColor((float) (this.anInt4186 >> 16 & 0xFF) / 255.0F, (float) (this.anInt4186 >> 8 & 0xFF) / 255.0F, (float) (this.anInt4186 & 0xFF) / 255.0F, 0.0F);
		local3.glClear(16640);
		@Pc(39) int local39 = 0;
		@Pc(41) int local41 = 0;
		@Pc(43) int local43 = 256;
		if (arg0 != null) {
			if (arg0.aBoolean322) {
				local39 = -arg0.anInt4194;
				local41 = -arg0.anInt4189;
				local43 = -arg0.anInt4198;
			} else {
				local39 = this.anInt4194 - arg0.anInt4194;
				local41 = this.anInt4189 - arg0.anInt4189;
				local43 = this.anInt4198 - arg0.anInt4198;
			}
		}
		Static206.method3306(-1.0F, 1.0F, -1.0F, 1.0F, this.anInt4191, this.anInt4191);
		@Pc(96) int local96;
		@Pc(101) int local101;
		@Pc(113) int local113;
		if (this.anInt4193 != 0) {
			local96 = Class68.anIntArray229[this.anInt4193];
			local101 = Class68.anIntArray226[this.anInt4193];
			local113 = local41 * local101 + 32767 - local43 * local96 >> 16;
			local43 = local41 * local96 + local43 * local101 + 32767 >> 16;
			local41 = local113;
		}
		if (this.anInt4199 != 0) {
			local96 = this.anInt4199 - 1024 & 0x7FF;
			local101 = Class68.anIntArray229[local96];
			local113 = Class68.anIntArray226[local96];
			@Pc(157) int local157 = local43 * local101 + local39 * local113 + 32767 >> 16;
			local43 = local43 * local113 + 32767 - local39 * local101 >> 16;
			local39 = local157;
		}
		Static28.method554((float) -local39, (float) -local41, (float) local43);
		Static28.method555(16777215, 0.5F, 0.5F, 1.0F);
		Static28.method553();
		if (this.anInt4186 != 0) {
			local3.glScalef(0.8125F, 0.8125F, 1.0F);
		}
		Static110.anInterface2_1.method2265(this.anInt4191, this.anInt4185);
		Static277.method4193(true);
		if (Static277.aBoolean417) {
			local3.glBindBufferARB(34962, 0);
			local3.glBindBufferARB(34963, 0);
		}
		local3.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		local3.glDisableClientState(32886);
		local3.glNormalPointer(5126, 20, Static210.aByteBuffer8.position(0));
		local3.glVertexPointer(2, 5126, 20, Static210.aByteBuffer8.position(0));
		local3.glTexCoordPointer(2, 5126, 20, Static210.aByteBuffer8.position(12));
		local3.glDrawElements(5, Static210.aByteBuffer9.limit() / 2, 5123, Static210.aByteBuffer9.position(0));
		local3.glEnableClientState(32886);
		Static277.method4193(false);
		if (this.anInt4186 != 0) {
			Static123.method2162(0, 0);
			Static277.method4222(1);
			Static277.method4190(0);
			Static277.method4212(Static210.anInt4195);
			local3.glColorMask(true, true, true, false);
			local3.glTexEnvi(8960, 34176, 34168);
			local3.glTexEnvi(8960, 34200, 771);
			local3.glBegin(7);
			local3.glColor4ub((byte) (this.anInt4186 >> 16), (byte) (this.anInt4186 >> 8), (byte) this.anInt4186, (byte) 127);
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
			local3.glColor4ub((byte) (this.anInt4186 >> 16), (byte) (this.anInt4186 >> 8), (byte) this.anInt4186, (byte) -1);
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
		Static206.method3302();
		Static277.method4212(this.anInt4197);
		local3.glCopyTexImage2D(3553, 0, 6408, 0, 0, this.anInt4191, this.anInt4191, 0);
		Static41.method834(Static210.anIntArray378);
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "([IIIIIIIIIII)V")
	private void method3337(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(1) int local1 = arg2;
		for (@Pc(4) int local4 = -arg7; local4 < 0; local4++) {
			@Pc(12) int local12 = (arg3 >> 16) * 128;
			for (@Pc(15) int local15 = -arg6; local15 < 0; local15++) {
				if (arg0[arg4] == 0) {
					arg0[arg4] = (Static210.aByteArray56[(arg2 >> 16) + local12] & 0xFF) << 24 | arg1;
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

	@OriginalMember(owner = "client!qd", name = "e", descriptor = "()V")
	private void method3338() {
		@Pc(6) int local6 = this.anInt4191 * 3 / 32;
		@Pc(15) int local15 = this.anInt4191 * 13 / 16;
		@Pc(17) int local17 = local15;
		@Pc(21) int local21 = 8388608 / local15;
		@Pc(25) int local25 = 8388608 / local15;
		@Pc(31) int local31 = local6 + local6 * Static50.anInt1138;
		@Pc(35) int local35 = Static50.anInt1138 - local15;
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 0;
		if (local6 + local15 > Static50.anInt1136) {
			local17 = local15 + Static50.anInt1136 - local6 - local15;
		}
		@Pc(59) int local59;
		if (local6 < Static50.anInt1135) {
			local59 = Static50.anInt1135 - local6;
			local17 -= local59;
			local31 += local59 * Static50.anInt1138;
			local39 = local25 * local59;
		}
		if (local6 + local15 > Static50.anInt1137) {
			local59 = local6 + local15 - Static50.anInt1137;
			local15 -= local59;
			local35 += local59;
		}
		if (local6 < Static50.anInt1139) {
			local59 = Static50.anInt1139 - local6;
			local15 -= local59;
			local31 += local59;
			local37 = local21 * local59;
			local35 += local59;
		}
		this.method3341(Static50.anIntArray107, this.anInt4186, local37, local39, local31, local35, local15, local17, local21, local25);
	}

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "(Lclient!qd;)V")
	public void method3339(@OriginalArg(0) Class136 arg0) {
		if (this.anInt4188 == 0) {
			return;
		}
		@Pc(14) boolean local14 = this.anInt4197 == -1 || this.anInt4196 != Static94.anInt2207;
		if (!this.aBoolean323 && !local14) {
			return;
		}
		if (local14) {
			this.anInt4196 = Static94.anInt2207;
			this.anInt4197 = Static37.method773(Static37.anInt932, this.anInt4191, this.anInt4191);
		} else {
			Static277.method4212(this.anInt4197);
			Static37.method780(Static37.anInt932, this.anInt4191, this.anInt4191);
		}
		if (this.anInt4188 == 1) {
			this.method3336(arg0);
			this.aBoolean323 = false;
		} else if (this.anInt4188 == 2) {
			this.aBoolean323 = !this.method3344(arg0);
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "([IIIIIIIIIIII)V")
	private void method3341(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(1) int local1 = arg2;
		for (@Pc(4) int local4 = -arg7; local4 < 0; local4++) {
			@Pc(12) int local12 = (arg3 >> 16) * 128;
			for (@Pc(15) int local15 = -arg6; local15 < 0; local15++) {
				if (arg0[arg4] != 0) {
					@Pc(25) int local25 = arg0[arg4];
					@Pc(37) int local37 = (Static210.aByteArray56[(arg2 >> 16) + local12] & 0xFF) + 64;
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

	@OriginalMember(owner = "client!qd", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method3346();
		super.finalize();
	}

	@OriginalMember(owner = "client!qd", name = "d", descriptor = "(Lclient!qd;)V")
	private void method3343(@OriginalArg(0) Class136 arg0) {
		Static210.method3342();
		Static210.method3345();
		this.aClass1_Sub2_Sub11_Sub2_3 = new Class1_Sub2_Sub11_Sub2_Sub1(this.anInt4191, this.anInt4191);
		Static50.method948(Static210.anIntArray378);
		this.aClass1_Sub2_Sub11_Sub2_3.method3782();
		Static110.method2030();
		Static50.method954(0, 0, this.anInt4191, this.anInt4191, 0);
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 256;
		if (arg0 != null) {
			if (arg0.aBoolean322) {
				local26 = -arg0.anInt4194;
				local28 = -arg0.anInt4189;
				local30 = -arg0.anInt4198;
			} else {
				local26 = this.anInt4194 - arg0.anInt4194;
				local28 = this.anInt4189 - arg0.anInt4189;
				local30 = this.anInt4198 - arg0.anInt4198;
			}
		}
		@Pc(74) int local74;
		@Pc(79) int local79;
		@Pc(91) int local91;
		if (this.anInt4193 != 0) {
			local74 = Class68.anIntArray229[this.anInt4193];
			local79 = Class68.anIntArray226[this.anInt4193];
			local91 = local28 * local79 + 32767 - local30 * local74 >> 16;
			local30 = local28 * local74 + local30 * local79 + 32767 >> 16;
			local28 = local91;
		}
		@Pc(135) int local135;
		if (this.anInt4199 != 0) {
			local74 = this.anInt4199 - 1024 & 0x7FF;
			local79 = Class68.anIntArray229[local74];
			local91 = Class68.anIntArray226[local74];
			local135 = local30 * local79 + local26 * local91 + 32767 >> 16;
			local30 = local30 * local91 + 32767 - local26 * local79 >> 16;
			local26 = local135;
		}
		Static304.method2607(Static210.aClass14_Sub3_1.aShortArray18, 0, Static210.aClass14_Sub3_1.anInt1154, (short) Static110.anInterface2_1.method2266(this.anInt4185));
		@Pc(172) Class14_Sub6_Sub2 local172 = Static210.aClass14_Sub3_1.method1004(64, 512, -local26, -local28, -local30);
		local79 = local172.method4098() - local172.method4122();
		local91 = local172.method4123() - local172.method4091();
		if (local79 > local91) {
			local135 = this.anInt4186 == 0 ? (local79 << 9) / this.anInt4191 : (local79 * 16 << 9) / (this.anInt4191 * 13);
			local172.method4139(0, 0, 0, 0, 0, 0, local135);
		} else {
			local135 = this.anInt4186 == 0 ? (local91 << 9) / this.anInt4191 : (local91 * 16 << 9) / (this.anInt4191 * 13);
			local172.method4139(0, 0, 0, 0, 0, 0, local135);
		}
		if (this.anInt4186 == 0) {
			for (local135 = 0; local135 < Static50.anIntArray107.length; local135++) {
				if (Static50.anIntArray107[local135] != 0) {
					Static50.anIntArray107[local135] |= 0xFF000000;
				}
			}
		} else {
			this.method3338();
			this.method3335();
		}
		Static72.aClass99_1.method3516();
		Static50.method960(Static210.anIntArray378);
		Static110.method2030();
	}

	@OriginalMember(owner = "client!qd", name = "e", descriptor = "(Lclient!qd;)Z")
	private boolean method3344(@OriginalArg(0) Class136 arg0) {
		@Pc(5) Class14_Sub3 local5 = Static51.method976(Static157.aClass91_125, this.anInt4185);
		if (local5 == null) {
			return false;
		}
		@Pc(11) GL local11 = Static277.aGL1;
		Static41.method841(Static210.anIntArray378);
		Static41.method842();
		local11.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
		local11.glClear(16640);
		@Pc(25) int local25 = 0;
		@Pc(27) int local27 = 0;
		@Pc(29) int local29 = 256;
		if (arg0 != null) {
			if (arg0.aBoolean322) {
				local25 = -arg0.anInt4194;
				local27 = -arg0.anInt4189;
				local29 = -arg0.anInt4198;
			} else {
				local25 = this.anInt4194 - arg0.anInt4194;
				local27 = this.anInt4189 - arg0.anInt4189;
				local29 = this.anInt4198 - arg0.anInt4198;
			}
		}
		local5.method986();
		@Pc(78) Class14_Sub6 local78 = local5.method984(64, 768, -local25, -local27, -local29);
		@Pc(86) int local86 = (local78.method4098() - local78.method4122()) / 2;
		@Pc(94) int local94 = (local78.method4123() - local78.method4091()) / 2;
		@Pc(101) int local101 = local86 > local94 ? local86 : local94;
		Static206.method3307((float) -local101, (float) local101, (float) -local101, (float) local101, 2048.0F, -2048.0F, this.anInt4191, this.anInt4191);
		@Pc(126) int local126;
		@Pc(131) int local131;
		@Pc(143) int local143;
		if (this.anInt4193 != 0) {
			local126 = Class68.anIntArray229[this.anInt4193];
			local131 = Class68.anIntArray226[this.anInt4193];
			local143 = local27 * local131 + 32767 - local29 * local126 >> 16;
			local29 = local27 * local126 + local29 * local131 + 32767 >> 16;
			local27 = local143;
		}
		if (this.anInt4199 != 0) {
			local126 = this.anInt4199 - 1024 & 0x7FF;
			local131 = Class68.anIntArray229[local126];
			local143 = Class68.anIntArray226[local126];
			@Pc(187) int local187 = local29 * local131 + local25 * local143 + 32767 >> 16;
			local29 = local29 * local143 + 32767 - local25 * local131 >> 16;
			local25 = local187;
		}
		Static28.method554((float) -local25, (float) local27, (float) -local29);
		Static28.method555(16777215, 0.5F, 0.5F, 0.5F);
		Static28.method553();
		Static277.method4215();
		Static277.method4192(true);
		Static277.method4193(true);
		local78.method4113(0, 0, 0, -local86 - local78.method4122(), -local94 - local78.method4091(), 0, -1L);
		Static277.method4193(false);
		Static277.method4192(false);
		Static277.method4208();
		Static206.method3302();
		Static277.method4212(this.anInt4197);
		local11.glCopyTexImage2D(3553, 0, 6408, 0, 0, this.anInt4191, this.anInt4191, 0);
		Static41.method834(Static210.anIntArray378);
		return true;
	}

	@OriginalMember(owner = "client!qd", name = "i", descriptor = "()V")
	private void method3346() {
		if (this.anInt4197 != -1) {
			Static94.method1748(this.anInt4197, 0, this.anInt4196);
		}
		this.aBoolean323 = true;
		this.anInt4197 = -1;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIIIII)V")
	public void method3347(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(6) int local6 = this.anInt4193 - arg4 & 0x7FF;
		@Pc(13) int local13 = this.anInt4199 - arg5 & 0x7FF;
		if (local13 > 1024) {
			local13 -= 2048;
		}
		if (local6 > 1024) {
			local6 -= 2048;
		}
		@Pc(27) int local27 = local6 * arg3 / 512;
		@Pc(33) int local33 = local13 * arg3 / -512;
		@Pc(42) int local42 = local27 + (arg3 - this.anInt4192) / 2;
		@Pc(51) int local51 = local33 + (arg2 - this.anInt4192) / 2;
		if (local42 >= arg3 || local42 + this.anInt4192 <= 0 || local51 >= arg2 || local51 + this.anInt4192 <= 0) {
			return;
		}
		if (this.anInt4188 == 0) {
			Static110.anInterface2_1.method2265(this.anInt4191, this.anInt4185);
		} else if (this.anInt4197 == -1) {
			return;
		} else {
			Static277.method4212(this.anInt4197);
		}
		local27 = local42 + arg1;
		local33 = local51 + arg0;
		@Pc(100) int local100 = local33 + this.anInt4192;
		@Pc(105) int local105 = local27 + this.anInt4192;
		@Pc(107) GL local107 = Static277.aGL1;
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

	@OriginalMember(owner = "client!qd", name = "f", descriptor = "(Lclient!qd;)V")
	private void method3348(@OriginalArg(0) Class136 arg0) {
		@Pc(5) Class14_Sub3 local5 = Static51.method976(Static157.aClass91_125, this.anInt4185);
		if (local5 == null) {
			return;
		}
		this.aClass1_Sub2_Sub11_Sub2_3 = new Class1_Sub2_Sub11_Sub2(this.anInt4191, this.anInt4191);
		Static50.method948(Static210.anIntArray378);
		this.aClass1_Sub2_Sub11_Sub2_3.method3782();
		Static110.method2030();
		Static50.method954(0, 0, this.anInt4191, this.anInt4191, 0);
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 256;
		if (arg0 != null) {
			if (arg0.aBoolean322) {
				local33 = -arg0.anInt4194;
				local35 = -arg0.anInt4189;
				local37 = -arg0.anInt4198;
			} else {
				local33 = this.anInt4194 - arg0.anInt4194;
				local35 = this.anInt4189 - arg0.anInt4189;
				local37 = this.anInt4198 - arg0.anInt4198;
			}
		}
		@Pc(81) int local81;
		@Pc(86) int local86;
		@Pc(98) int local98;
		if (this.anInt4193 != 0) {
			local81 = Class68.anIntArray229[this.anInt4193];
			local86 = Class68.anIntArray226[this.anInt4193];
			local98 = local35 * local86 + 32767 - local37 * local81 >> 16;
			local37 = local35 * local81 + local37 * local86 + 32767 >> 16;
			local35 = local98;
		}
		@Pc(142) int local142;
		if (this.anInt4199 != 0) {
			local81 = this.anInt4199 - 1024 & 0x7FF;
			local86 = Class68.anIntArray229[local81];
			local98 = Class68.anIntArray226[local81];
			local142 = local37 * local86 + local33 * local98 + 32767 >> 16;
			local37 = local37 * local98 + 32767 - local33 * local86 >> 16;
			local33 = local142;
		}
		@Pc(167) Class14_Sub6_Sub2 local167 = local5.method1004(64, 768, -local33, -local35, -local37);
		local86 = local167.method4098() - local167.method4122();
		local98 = local167.method4123() - local167.method4091();
		local142 = local167.method4122() + local86 / 2;
		@Pc(193) int local193 = local167.method4091() + local98 / 2;
		if (local86 > local98) {
			local167.method4139(0, 0, 0, -local142, -local193, 0, (local86 << 9) / this.anInt4191);
		} else {
			local167.method4139(0, 0, 0, -local142, -local193, 0, (local98 << 9) / this.anInt4191);
		}
		Static72.aClass99_1.method3516();
		Static50.method960(Static210.anIntArray378);
		Static110.method2030();
	}
}
