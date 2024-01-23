import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nb")
public final class Class118 {

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "I")
	private int anInt3348;

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "I")
	private int anInt3349;

	@OriginalMember(owner = "client!nb", name = "k", descriptor = "I")
	private int anInt3356;

	@OriginalMember(owner = "client!nb", name = "l", descriptor = "I")
	public int anInt3357;

	@OriginalMember(owner = "client!nb", name = "p", descriptor = "I")
	private int anInt3359;

	@OriginalMember(owner = "client!nb", name = "q", descriptor = "Lclient!qn;")
	private Class3_Sub4_Sub12_Sub2 aClass3_Sub4_Sub12_Sub2_2;

	@OriginalMember(owner = "client!nb", name = "e", descriptor = "I")
	private int anInt3351 = -1;

	@OriginalMember(owner = "client!nb", name = "f", descriptor = "I")
	private int anInt3352 = -1;

	@OriginalMember(owner = "client!nb", name = "u", descriptor = "Z")
	private boolean aBoolean241 = true;

	@OriginalMember(owner = "client!nb", name = "r", descriptor = "I")
	private int anInt3360;

	@OriginalMember(owner = "client!nb", name = "s", descriptor = "I")
	private int anInt3361;

	@OriginalMember(owner = "client!nb", name = "w", descriptor = "I")
	private int anInt3363;

	@OriginalMember(owner = "client!nb", name = "t", descriptor = "Z")
	private boolean aBoolean240;

	@OriginalMember(owner = "client!nb", name = "v", descriptor = "I")
	private int anInt3362;

	@OriginalMember(owner = "client!nb", name = "h", descriptor = "I")
	private int anInt3354;

	@OriginalMember(owner = "client!nb", name = "i", descriptor = "I")
	private int anInt3355;

	@OriginalMember(owner = "client!nb", name = "o", descriptor = "I")
	private int anInt3358;

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class118(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt3360 = arg2;
		this.anInt3361 = arg3;
		this.anInt3363 = arg4;
		this.aBoolean240 = arg7;
		this.anInt3362 = arg1;
		this.anInt3354 = arg6;
		this.anInt3355 = arg5;
		this.anInt3358 = arg0;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!nb;)Z")
	private boolean method2955(@OriginalArg(0) Class118 arg0) {
		if (this.aClass3_Sub4_Sub12_Sub2_2 == null) {
			if (this.anInt3358 == 0) {
				this.aClass3_Sub4_Sub12_Sub2_2 = Static16.anInterface4_1.method2900(this.anInt3362, true, this.anInt3348, Static16.aFloat7);
			} else if (this.anInt3358 == 2) {
				this.method2960(arg0);
			} else if (this.anInt3358 == 1) {
				this.method2961(arg0);
			}
		}
		return this.aClass3_Sub4_Sub12_Sub2_2 != null;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "()V")
	private void method2956() {
		if (this.anInt3351 != -1) {
			Static189.method3151(this.anInt3351, 0, this.anInt3352);
		}
		this.aBoolean241 = true;
		this.anInt3351 = -1;
	}

	@OriginalMember(owner = "client!nb", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method2956();
		super.finalize();
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIIILclient!nb;)V")
	public void method2959(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class118 arg6) {
		@Pc(6) int local6 = this.anInt3349 - arg4 & 0x7FF;
		@Pc(13) int local13 = this.anInt3356 - arg5 & 0x7FF;
		if (local13 > 1024) {
			local13 -= 2048;
		}
		if (local6 > 1024) {
			local6 -= 2048;
		}
		@Pc(27) int local27 = local6 * arg3 / 512;
		@Pc(33) int local33 = local13 * arg3 / -512;
		@Pc(42) int local42 = local27 + (arg3 - this.anInt3359) / 2;
		@Pc(51) int local51 = local33 + (arg2 - this.anInt3359) / 2;
		if (local42 < arg3 && local42 + this.anInt3359 > 0 && local51 < arg2 && local51 + this.anInt3359 > 0 && this.method2955(arg6)) {
			this.aClass3_Sub4_Sub12_Sub2_2.method4703(local51 + arg0, local42 + arg1, this.anInt3359, this.anInt3359);
		}
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(Lclient!nb;)V")
	private void method2960(@OriginalArg(0) Class118 arg0) {
		@Pc(5) Class10_Sub3 local5 = Static46.method722(Static261.aClass155_109, this.anInt3362);
		if (local5 == null) {
			return;
		}
		this.aClass3_Sub4_Sub12_Sub2_2 = new Class3_Sub4_Sub12_Sub2(this.anInt3348, this.anInt3348);
		Static143.method2439(Static180.anIntArray407);
		this.aClass3_Sub4_Sub12_Sub2_2.method4710();
		Static16.method272();
		Static143.method2462(0, 0, this.anInt3348, this.anInt3348, 0);
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 256;
		if (arg0 != null) {
			if (arg0.aBoolean240) {
				local33 = -arg0.anInt3360;
				local35 = -arg0.anInt3361;
				local37 = -arg0.anInt3363;
			} else {
				local33 = this.anInt3360 - arg0.anInt3360;
				local35 = this.anInt3361 - arg0.anInt3361;
				local37 = this.anInt3363 - arg0.anInt3363;
			}
		}
		@Pc(81) int local81;
		@Pc(86) int local86;
		@Pc(98) int local98;
		if (this.anInt3349 != 0) {
			local81 = Class11.anIntArray26[this.anInt3349];
			local86 = Class11.anIntArray27[this.anInt3349];
			local98 = local35 * local86 + 32767 - local37 * local81 >> 16;
			local37 = local35 * local81 + local37 * local86 + 32767 >> 16;
			local35 = local98;
		}
		@Pc(142) int local142;
		if (this.anInt3356 != 0) {
			local81 = this.anInt3356 - 1024 & 0x7FF;
			local86 = Class11.anIntArray26[local81];
			local98 = Class11.anIntArray27[local81];
			local142 = local37 * local86 + local33 * local98 + 32767 >> 16;
			local37 = local37 * local98 + 32767 - local33 * local86 >> 16;
			local33 = local142;
		}
		@Pc(167) Class10_Sub4_Sub2 local167 = local5.method702(64, 768, -local33, -local35, -local37);
		local86 = local167.method1951() - local167.method1937();
		local98 = local167.method1943() - local167.method4973();
		local142 = local167.method1937() + local86 / 2;
		@Pc(193) int local193 = local167.method4973() + local98 / 2;
		if (local86 > local98) {
			local167.method1981(0, 0, 0, -local142, -local193, 0, (local86 << 9) / this.anInt3348);
		} else {
			local167.method1981(0, 0, 0, -local142, -local193, 0, (local98 << 9) / this.anInt3348);
		}
		Static94.aClass128_1.method4293();
		Static143.method2441(Static180.anIntArray407);
		Static16.method272();
	}

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "(Lclient!nb;)V")
	private void method2961(@OriginalArg(0) Class118 arg0) {
		Static180.method2965();
		Static180.method2974();
		this.aClass3_Sub4_Sub12_Sub2_2 = new Class3_Sub4_Sub12_Sub2_Sub1(this.anInt3348, this.anInt3348);
		Static143.method2439(Static180.anIntArray407);
		this.aClass3_Sub4_Sub12_Sub2_2.method4710();
		Static16.method272();
		Static143.method2462(0, 0, this.anInt3348, this.anInt3348, 0);
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 256;
		if (arg0 != null) {
			if (arg0.aBoolean240) {
				local26 = -arg0.anInt3360;
				local28 = -arg0.anInt3361;
				local30 = -arg0.anInt3363;
			} else {
				local26 = this.anInt3360 - arg0.anInt3360;
				local28 = this.anInt3361 - arg0.anInt3361;
				local30 = this.anInt3363 - arg0.anInt3363;
			}
		}
		@Pc(74) int local74;
		@Pc(79) int local79;
		@Pc(91) int local91;
		if (this.anInt3349 != 0) {
			local74 = Class11.anIntArray26[this.anInt3349];
			local79 = Class11.anIntArray27[this.anInt3349];
			local91 = local28 * local79 + 32767 - local30 * local74 >> 16;
			local30 = local28 * local74 + local30 * local79 + 32767 >> 16;
			local28 = local91;
		}
		@Pc(135) int local135;
		if (this.anInt3356 != 0) {
			local74 = this.anInt3356 - 1024 & 0x7FF;
			local79 = Class11.anIntArray26[local74];
			local91 = Class11.anIntArray27[local74];
			local135 = local30 * local79 + local26 * local91 + 32767 >> 16;
			local30 = local30 * local91 + 32767 - local26 * local79 >> 16;
			local26 = local135;
		}
		Static326.method4273(Static180.aClass10_Sub3_1.aShortArray15, 0, Static180.aClass10_Sub3_1.anInt857, (short) Static16.anInterface4_1.method2906(this.anInt3362));
		@Pc(172) Class10_Sub4_Sub2 local172 = Static180.aClass10_Sub3_1.method702(64, 512, -local26, -local28, -local30);
		local79 = local172.method1951() - local172.method1937();
		local91 = local172.method1943() - local172.method4973();
		if (local79 > local91) {
			local135 = this.anInt3354 == 0 ? (local79 << 9) / this.anInt3348 : (local79 * 16 << 9) / (this.anInt3348 * 13);
			local172.method1981(0, 0, 0, 0, 0, 0, local135);
		} else {
			local135 = this.anInt3354 == 0 ? (local91 << 9) / this.anInt3348 : (local91 * 16 << 9) / (this.anInt3348 * 13);
			local172.method1981(0, 0, 0, 0, 0, 0, local135);
		}
		if (this.anInt3354 == 0) {
			for (local135 = 0; local135 < Static143.anIntArray316.length; local135++) {
				if (Static143.anIntArray316[local135] != 0) {
					Static143.anIntArray316[local135] |= 0xFF000000;
				}
			}
		} else {
			this.method2967();
			this.method2972();
		}
		Static94.aClass128_1.method4293();
		Static143.method2441(Static180.anIntArray407);
		Static16.method272();
	}

	@OriginalMember(owner = "client!nb", name = "d", descriptor = "(Lclient!nb;)V")
	private void method2962(@OriginalArg(0) Class118 arg0) {
		Static180.method2958();
		Static180.method2966();
		@Pc(3) GL local3 = Static283.aGL1;
		Static234.method3966(Static180.anIntArray407);
		Static234.method3976();
		local3.glClearColor((float) (this.anInt3354 >> 16 & 0xFF) / 255.0F, (float) (this.anInt3354 >> 8 & 0xFF) / 255.0F, (float) (this.anInt3354 & 0xFF) / 255.0F, 0.0F);
		local3.glClear(16640);
		@Pc(39) int local39 = 0;
		@Pc(41) int local41 = 0;
		@Pc(43) int local43 = 256;
		if (arg0 != null) {
			if (arg0.aBoolean240) {
				local39 = -arg0.anInt3360;
				local41 = -arg0.anInt3361;
				local43 = -arg0.anInt3363;
			} else {
				local39 = this.anInt3360 - arg0.anInt3360;
				local41 = this.anInt3361 - arg0.anInt3361;
				local43 = this.anInt3363 - arg0.anInt3363;
			}
		}
		Static121.method2019(-1.0F, 1.0F, -1.0F, 1.0F, this.anInt3348, this.anInt3348);
		@Pc(96) int local96;
		@Pc(101) int local101;
		@Pc(113) int local113;
		if (this.anInt3349 != 0) {
			local96 = Class11.anIntArray26[this.anInt3349];
			local101 = Class11.anIntArray27[this.anInt3349];
			local113 = local41 * local101 + 32767 - local43 * local96 >> 16;
			local43 = local41 * local96 + local43 * local101 + 32767 >> 16;
			local41 = local113;
		}
		if (this.anInt3356 != 0) {
			local96 = this.anInt3356 - 1024 & 0x7FF;
			local101 = Class11.anIntArray26[local96];
			local113 = Class11.anIntArray27[local96];
			@Pc(157) int local157 = local43 * local101 + local39 * local113 + 32767 >> 16;
			local43 = local43 * local113 + 32767 - local39 * local101 >> 16;
			local39 = local157;
		}
		Static226.method3655((float) -local39, (float) -local41, (float) local43);
		Static226.method3660(16777215, 0.5F, 0.5F, 1.0F);
		Static226.method3654();
		if (this.anInt3354 != 0) {
			local3.glScalef(0.8125F, 0.8125F, 1.0F);
		}
		Static16.anInterface4_1.method2904(this.anInt3348, this.anInt3362);
		Static283.method4651(true);
		if (Static283.aBoolean406) {
			local3.glBindBufferARB(34962, 0);
			local3.glBindBufferARB(34963, 0);
		}
		local3.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		local3.glDisableClientState(32886);
		local3.glNormalPointer(5126, 20, Static180.aByteBuffer12.position(0));
		local3.glVertexPointer(2, 5126, 20, Static180.aByteBuffer12.position(0));
		local3.glTexCoordPointer(2, 5126, 20, Static180.aByteBuffer12.position(12));
		local3.glDrawElements(5, Static180.aByteBuffer11.limit() / 2, 5123, Static180.aByteBuffer11.position(0));
		local3.glEnableClientState(32886);
		Static283.method4651(false);
		if (this.anInt3354 != 0) {
			Static53.method5036(0, 0);
			Static283.method4664(1);
			Static283.method4656(0);
			Static283.method4636(Static180.anInt3353);
			local3.glColorMask(true, true, true, false);
			local3.glTexEnvi(8960, 34176, 34168);
			local3.glTexEnvi(8960, 34200, 771);
			local3.glBegin(7);
			local3.glColor4ub((byte) (this.anInt3354 >> 16), (byte) (this.anInt3354 >> 8), (byte) this.anInt3354, (byte) 127);
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
			local3.glColor4ub((byte) (this.anInt3354 >> 16), (byte) (this.anInt3354 >> 8), (byte) this.anInt3354, (byte) -1);
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
		Static121.method2017();
		Static283.method4636(this.anInt3351);
		local3.glCopyTexImage2D(3553, 0, 6408, 0, 0, this.anInt3348, this.anInt3348, 0);
		Static234.method3963(Static180.anIntArray407);
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIII)Z")
	public boolean method2963(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean240) {
			this.anInt3357 = 1073741823;
			local7 = this.anInt3360;
			local12 = this.anInt3361;
			local17 = this.anInt3363;
		} else {
			local7 = this.anInt3360 - arg0;
			local12 = this.anInt3361 - arg1;
			local17 = this.anInt3363 - arg2;
			this.anInt3357 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt3357 == 0) {
				this.anInt3357 = 1;
			}
			local7 = (local7 << 8) / this.anInt3357;
			local12 = (local12 << 8) / this.anInt3357;
			local17 = (local17 << 8) / this.anInt3357;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt3359 = this.anInt3355 * arg3 / (this.aBoolean240 ? 1024 : this.anInt3357);
		} else {
			this.anInt3359 = 0;
		}
		if (this.anInt3359 < 8) {
			this.method2956();
			this.aClass3_Sub4_Sub12_Sub2_2 = null;
			return false;
		}
		@Pc(145) int local145 = Static310.method4990(this.anInt3359);
		if (local145 > 512) {
			local145 = 512;
		}
		if (local145 != this.anInt3348) {
			this.anInt3348 = local145;
		}
		this.anInt3349 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 325.9493103027344D) & 0x7FF;
		this.anInt3356 = (int) (Math.atan2((double) local7, (double) -local17) * 325.9493103027344D) & 0x7FF;
		this.aBoolean241 = true;
		this.aClass3_Sub4_Sub12_Sub2_2 = null;
		return true;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "([IIIIIIIIIII)V")
	private void method2964(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(1) int local1 = arg2;
		for (@Pc(4) int local4 = -arg7; local4 < 0; local4++) {
			@Pc(12) int local12 = (arg3 >> 16) * 128;
			for (@Pc(15) int local15 = -arg6; local15 < 0; local15++) {
				if (arg0[arg4] == 0) {
					arg0[arg4] = (Static180.aByteArray41[(arg2 >> 16) + local12] & 0xFF) << 24 | arg1;
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

	@OriginalMember(owner = "client!nb", name = "f", descriptor = "()V")
	private void method2967() {
		@Pc(6) int local6 = this.anInt3348 * 3 / 32;
		@Pc(15) int local15 = this.anInt3348 * 13 / 16;
		@Pc(17) int local17 = local15;
		@Pc(21) int local21 = 8388608 / local15;
		@Pc(25) int local25 = 8388608 / local15;
		@Pc(31) int local31 = local6 + local6 * Static143.anInt2745;
		@Pc(35) int local35 = Static143.anInt2745 - local15;
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 0;
		if (local6 + local15 > Static143.anInt2744) {
			local17 = local15 + Static143.anInt2744 - local6 - local15;
		}
		@Pc(59) int local59;
		if (local6 < Static143.anInt2746) {
			local59 = Static143.anInt2746 - local6;
			local17 -= local59;
			local31 += local59 * Static143.anInt2745;
			local39 = local25 * local59;
		}
		if (local6 + local15 > Static143.anInt2747) {
			local59 = local6 + local15 - Static143.anInt2747;
			local15 -= local59;
			local35 += local59;
		}
		if (local6 < Static143.anInt2748) {
			local59 = Static143.anInt2748 - local6;
			local15 -= local59;
			local31 += local59;
			local37 = local21 * local59;
			local35 += local59;
		}
		this.method2968(Static143.anIntArray316, this.anInt3354, local37, local39, local31, local35, local15, local17, local21, local25);
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "([IIIIIIIIIIII)V")
	private void method2968(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(1) int local1 = arg2;
		for (@Pc(4) int local4 = -arg7; local4 < 0; local4++) {
			@Pc(12) int local12 = (arg3 >> 16) * 128;
			for (@Pc(15) int local15 = -arg6; local15 < 0; local15++) {
				if (arg0[arg4] != 0) {
					@Pc(25) int local25 = arg0[arg4];
					@Pc(37) int local37 = (Static180.aByteArray41[(arg2 >> 16) + local12] & 0xFF) + 64;
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

	@OriginalMember(owner = "client!nb", name = "e", descriptor = "(Lclient!nb;)Z")
	private boolean method2970(@OriginalArg(0) Class118 arg0) {
		@Pc(5) Class10_Sub3 local5 = Static46.method722(Static261.aClass155_109, this.anInt3362);
		if (local5 == null) {
			return false;
		}
		@Pc(11) GL local11 = Static283.aGL1;
		Static234.method3966(Static180.anIntArray407);
		Static234.method3976();
		local11.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
		local11.glClear(16640);
		@Pc(25) int local25 = 0;
		@Pc(27) int local27 = 0;
		@Pc(29) int local29 = 256;
		if (arg0 != null) {
			if (arg0.aBoolean240) {
				local25 = -arg0.anInt3360;
				local27 = -arg0.anInt3361;
				local29 = -arg0.anInt3363;
			} else {
				local25 = this.anInt3360 - arg0.anInt3360;
				local27 = this.anInt3361 - arg0.anInt3361;
				local29 = this.anInt3363 - arg0.anInt3363;
			}
		}
		local5.method725();
		@Pc(78) Class10_Sub4 local78 = local5.method717(64, 768, -local25, -local27, -local29);
		@Pc(86) int local86 = (local78.method1951() - local78.method1937()) / 2;
		@Pc(94) int local94 = (local78.method1943() - local78.method4973()) / 2;
		@Pc(101) int local101 = local86 > local94 ? local86 : local94;
		Static121.method2021((float) -local101, (float) local101, (float) -local101, (float) local101, 2048.0F, -2048.0F, this.anInt3348, this.anInt3348);
		@Pc(126) int local126;
		@Pc(131) int local131;
		@Pc(143) int local143;
		if (this.anInt3349 != 0) {
			local126 = Class11.anIntArray26[this.anInt3349];
			local131 = Class11.anIntArray27[this.anInt3349];
			local143 = local27 * local131 + 32767 - local29 * local126 >> 16;
			local29 = local27 * local126 + local29 * local131 + 32767 >> 16;
			local27 = local143;
		}
		if (this.anInt3356 != 0) {
			local126 = this.anInt3356 - 1024 & 0x7FF;
			local131 = Class11.anIntArray26[local126];
			local143 = Class11.anIntArray27[local126];
			@Pc(187) int local187 = local29 * local131 + local25 * local143 + 32767 >> 16;
			local29 = local29 * local143 + 32767 - local25 * local131 >> 16;
			local25 = local187;
		}
		Static226.method3655((float) -local25, (float) local27, (float) -local29);
		Static226.method3660(16777215, 0.5F, 0.5F, 0.5F);
		Static226.method3654();
		Static283.method4653();
		Static283.method4657(true);
		Static283.method4651(true);
		local78.method1939(0, 0, 0, -local86 - local78.method1937(), -local94 - local78.method4973(), 0, -1L);
		Static283.method4651(false);
		Static283.method4657(false);
		Static283.method4641();
		Static121.method2017();
		Static283.method4636(this.anInt3351);
		local11.glCopyTexImage2D(3553, 0, 6408, 0, 0, this.anInt3348, this.anInt3348, 0);
		Static234.method3963(Static180.anIntArray407);
		return true;
	}

	@OriginalMember(owner = "client!nb", name = "f", descriptor = "(Lclient!nb;)V")
	public void method2971(@OriginalArg(0) Class118 arg0) {
		if (this.anInt3358 == 0) {
			return;
		}
		@Pc(14) boolean local14 = this.anInt3351 == -1 || this.anInt3352 != Static189.anInt3719;
		if (!this.aBoolean241 && !local14) {
			return;
		}
		if (local14) {
			this.anInt3352 = Static189.anInt3719;
			this.anInt3351 = Static211.method3484(Static211.anInt4138, this.anInt3348, this.anInt3348);
		} else {
			Static283.method4636(this.anInt3351);
			Static211.method3483(Static211.anInt4138, this.anInt3348, this.anInt3348);
		}
		if (this.anInt3358 == 1) {
			this.method2962(arg0);
			this.aBoolean241 = false;
		} else if (this.anInt3358 == 2) {
			this.aBoolean241 = !this.method2970(arg0);
		}
	}

	@OriginalMember(owner = "client!nb", name = "h", descriptor = "()V")
	private void method2972() {
		@Pc(2) int local2 = this.anInt3348;
		@Pc(5) int local5 = this.anInt3348;
		@Pc(9) int local9 = 8388608 / local2;
		@Pc(13) int local13 = 8388608 / local5;
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = 0;
		@Pc(23) int local23 = Static143.anInt2745 - local2;
		if (local5 > Static143.anInt2744) {
			local5 -= local5 - Static143.anInt2744;
		}
		@Pc(37) int local37;
		if (Static143.anInt2746 > 0) {
			local37 = Static143.anInt2746;
			local5 -= local37;
			local19 = local37 * Static143.anInt2745;
			local17 = local13 * local37;
		}
		if (local2 > Static143.anInt2747) {
			local37 = local2 - Static143.anInt2747;
			local2 -= local37;
			local23 += local37;
		}
		if (Static143.anInt2748 > 0) {
			local37 = Static143.anInt2748;
			local2 -= local37;
			local19 += local37;
			local15 = local9 * local37;
			local23 += local37;
		}
		this.method2964(Static143.anIntArray316, this.anInt3354, local15, local17, local19, local23, local2, local5, local9, local13);
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIII)V")
	public void method2973(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(6) int local6 = this.anInt3349 - arg4 & 0x7FF;
		@Pc(13) int local13 = this.anInt3356 - arg5 & 0x7FF;
		if (local13 > 1024) {
			local13 -= 2048;
		}
		if (local6 > 1024) {
			local6 -= 2048;
		}
		@Pc(27) int local27 = local6 * arg3 / 512;
		@Pc(33) int local33 = local13 * arg3 / -512;
		@Pc(42) int local42 = local27 + (arg3 - this.anInt3359) / 2;
		@Pc(51) int local51 = local33 + (arg2 - this.anInt3359) / 2;
		if (local42 >= arg3 || local42 + this.anInt3359 <= 0 || local51 >= arg2 || local51 + this.anInt3359 <= 0) {
			return;
		}
		if (this.anInt3358 == 0) {
			Static16.anInterface4_1.method2904(this.anInt3348, this.anInt3362);
		} else if (this.anInt3351 == -1) {
			return;
		} else {
			Static283.method4636(this.anInt3351);
		}
		local27 = local42 + arg1;
		local33 = local51 + arg0;
		@Pc(100) int local100 = local33 + this.anInt3359;
		@Pc(105) int local105 = local27 + this.anInt3359;
		@Pc(107) GL local107 = Static283.aGL1;
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
}
