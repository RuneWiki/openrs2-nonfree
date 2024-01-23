import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qg")
public final class Class146 {

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "I")
	public int anInt4211;

	@OriginalMember(owner = "client!qg", name = "f", descriptor = "I")
	private int anInt4215;

	@OriginalMember(owner = "client!qg", name = "j", descriptor = "I")
	private int anInt4216;

	@OriginalMember(owner = "client!qg", name = "q", descriptor = "Lclient!ch;")
	private Class1_Sub2_Sub1_Sub2 aClass1_Sub2_Sub1_Sub2_4;

	@OriginalMember(owner = "client!qg", name = "v", descriptor = "I")
	private int anInt4224;

	@OriginalMember(owner = "client!qg", name = "w", descriptor = "I")
	private int anInt4225;

	@OriginalMember(owner = "client!qg", name = "g", descriptor = "Z")
	private boolean aBoolean289 = true;

	@OriginalMember(owner = "client!qg", name = "m", descriptor = "I")
	private int anInt4219 = -1;

	@OriginalMember(owner = "client!qg", name = "u", descriptor = "I")
	private int anInt4223 = -1;

	@OriginalMember(owner = "client!qg", name = "x", descriptor = "I")
	private int anInt4226;

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "I")
	private int anInt4213;

	@OriginalMember(owner = "client!qg", name = "k", descriptor = "I")
	private int anInt4217;

	@OriginalMember(owner = "client!qg", name = "t", descriptor = "Z")
	private boolean aBoolean290;

	@OriginalMember(owner = "client!qg", name = "l", descriptor = "I")
	private int anInt4218;

	@OriginalMember(owner = "client!qg", name = "s", descriptor = "I")
	private int anInt4222;

	@OriginalMember(owner = "client!qg", name = "n", descriptor = "I")
	private int anInt4220;

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "I")
	private int anInt4212;

	@OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class146(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt4226 = arg2;
		this.anInt4213 = arg3;
		this.anInt4217 = arg4;
		this.aBoolean290 = arg7;
		this.anInt4218 = arg1;
		this.anInt4222 = arg6;
		this.anInt4220 = arg5;
		this.anInt4212 = arg0;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lclient!qg;)V")
	private void method3557(@OriginalArg(0) Class146 arg0) {
		Static231.method3569();
		Static231.method3575();
		this.aClass1_Sub2_Sub1_Sub2_4 = new Class1_Sub2_Sub1_Sub2_Sub1(this.anInt4216, this.anInt4216);
		Static25.method399(Static231.anIntArray357);
		this.aClass1_Sub2_Sub1_Sub2_4.method3859();
		Static215.method3375();
		Static25.method385(0, 0, this.anInt4216, this.anInt4216, 0);
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 256;
		if (arg0 != null) {
			if (arg0.aBoolean290) {
				local26 = -arg0.anInt4226;
				local28 = -arg0.anInt4213;
				local30 = -arg0.anInt4217;
			} else {
				local26 = this.anInt4226 - arg0.anInt4226;
				local28 = this.anInt4213 - arg0.anInt4213;
				local30 = this.anInt4217 - arg0.anInt4217;
			}
		}
		@Pc(74) int local74;
		@Pc(79) int local79;
		@Pc(91) int local91;
		if (this.anInt4224 != 0) {
			local74 = Class135.anIntArray335[this.anInt4224];
			local79 = Class135.anIntArray338[this.anInt4224];
			local91 = local28 * local79 + 32767 - local30 * local74 >> 16;
			local30 = local28 * local74 + local30 * local79 + 32767 >> 16;
			local28 = local91;
		}
		@Pc(135) int local135;
		if (this.anInt4215 != 0) {
			local74 = this.anInt4215 - 1024 & 0x7FF;
			local79 = Class135.anIntArray335[local74];
			local91 = Class135.anIntArray338[local74];
			local135 = local30 * local79 + local26 * local91 + 32767 >> 16;
			local30 = local30 * local91 + 32767 - local26 * local79 >> 16;
			local26 = local135;
		}
		Static319.method1767(Static231.aClass15_Sub6_1.aShortArray78, 0, Static231.aClass15_Sub6_1.anInt4382, (short) Static215.anInterface5_1.method777(this.anInt4218));
		@Pc(172) Class15_Sub2_Sub2 local172 = Static231.aClass15_Sub6_1.method3764(64, 512, -local26, -local28, -local30);
		local79 = local172.method1033() - local172.method1039();
		local91 = local172.method1024() - local172.method4676();
		if (local79 > local91) {
			local135 = this.anInt4222 == 0 ? (local79 << 9) / this.anInt4216 : (local79 * 16 << 9) / (this.anInt4216 * 13);
			local172.method1047(0, 0, 0, 0, 0, 0, local135);
		} else {
			local135 = this.anInt4222 == 0 ? (local91 << 9) / this.anInt4216 : (local91 * 16 << 9) / (this.anInt4216 * 13);
			local172.method1047(0, 0, 0, 0, 0, 0, local135);
		}
		if (this.anInt4222 == 0) {
			for (local135 = 0; local135 < Static25.anIntArray27.length; local135++) {
				if (Static25.anIntArray27[local135] != 0) {
					Static25.anIntArray27[local135] |= 0xFF000000;
				}
			}
		} else {
			this.method3567();
			this.method3559();
		}
		Static94.aClass58_3.method2968();
		Static25.method406(Static231.anIntArray357);
		Static215.method3375();
	}

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "()V")
	private void method3559() {
		@Pc(2) int local2 = this.anInt4216;
		@Pc(5) int local5 = this.anInt4216;
		@Pc(9) int local9 = 8388608 / local2;
		@Pc(13) int local13 = 8388608 / local5;
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = 0;
		@Pc(23) int local23 = Static25.anInt420 - local2;
		if (local5 > Static25.anInt419) {
			local5 -= local5 - Static25.anInt419;
		}
		@Pc(37) int local37;
		if (Static25.anInt417 > 0) {
			local37 = Static25.anInt417;
			local5 -= local37;
			local19 = local37 * Static25.anInt420;
			local17 = local13 * local37;
		}
		if (local2 > Static25.anInt422) {
			local37 = local2 - Static25.anInt422;
			local2 -= local37;
			local23 += local37;
		}
		if (Static25.anInt418 > 0) {
			local37 = Static25.anInt418;
			local2 -= local37;
			local19 += local37;
			local15 = local9 * local37;
			local23 += local37;
		}
		this.method3564(Static25.anIntArray27, this.anInt4222, local15, local17, local19, local23, local2, local5, local9, local13);
	}

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "(Lclient!qg;)Z")
	private boolean method3560(@OriginalArg(0) Class146 arg0) {
		@Pc(5) Class15_Sub6 local5 = Static241.method3755(Static216.aClass121_93, this.anInt4218);
		if (local5 == null) {
			return false;
		}
		@Pc(11) GL local11 = Static156.aGL1;
		Static119.method2140(Static231.anIntArray357);
		Static119.method2126();
		local11.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
		local11.glClear(16640);
		@Pc(25) int local25 = 0;
		@Pc(27) int local27 = 0;
		@Pc(29) int local29 = 256;
		if (arg0 != null) {
			if (arg0.aBoolean290) {
				local25 = -arg0.anInt4226;
				local27 = -arg0.anInt4213;
				local29 = -arg0.anInt4217;
			} else {
				local25 = this.anInt4226 - arg0.anInt4226;
				local27 = this.anInt4213 - arg0.anInt4213;
				local29 = this.anInt4217 - arg0.anInt4217;
			}
		}
		local5.method3749();
		@Pc(78) Class15_Sub2 local78 = local5.method3760(64, 768, -local25, -local27, -local29);
		@Pc(86) int local86 = (local78.method1033() - local78.method1039()) / 2;
		@Pc(94) int local94 = (local78.method1024() - local78.method4676()) / 2;
		@Pc(101) int local101 = local86 > local94 ? local86 : local94;
		Static14.method183((float) -local101, (float) local101, (float) -local101, (float) local101, 2048.0F, -2048.0F, this.anInt4216, this.anInt4216);
		@Pc(126) int local126;
		@Pc(131) int local131;
		@Pc(143) int local143;
		if (this.anInt4224 != 0) {
			local126 = Class135.anIntArray335[this.anInt4224];
			local131 = Class135.anIntArray338[this.anInt4224];
			local143 = local27 * local131 + 32767 - local29 * local126 >> 16;
			local29 = local27 * local126 + local29 * local131 + 32767 >> 16;
			local27 = local143;
		}
		if (this.anInt4215 != 0) {
			local126 = this.anInt4215 - 1024 & 0x7FF;
			local131 = Class135.anIntArray335[local126];
			local143 = Class135.anIntArray338[local126];
			@Pc(187) int local187 = local29 * local131 + local25 * local143 + 32767 >> 16;
			local29 = local29 * local143 + 32767 - local25 * local131 >> 16;
			local25 = local187;
		}
		Static283.method4354((float) -local25, (float) local27, (float) -local29);
		Static283.method4351(16777215, 0.5F, 0.5F, 0.5F);
		Static283.method4350();
		Static156.method2676();
		Static156.method2668(true);
		Static156.method2675(true);
		local78.method1035(0, 0, 0, -local86 - local78.method1039(), -local94 - local78.method4676(), 0, -1L);
		Static156.method2675(false);
		Static156.method2668(false);
		Static156.method2656();
		Static14.method192();
		Static156.method2699(this.anInt4219);
		local11.glCopyTexImage2D(3553, 0, 6408, 0, 0, this.anInt4216, this.anInt4216, 0);
		Static119.method2141(Static231.anIntArray357);
		return true;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIIIILclient!qg;)V")
	public void method3561(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class146 arg6) {
		@Pc(6) int local6 = this.anInt4224 - arg4 & 0x7FF;
		@Pc(13) int local13 = this.anInt4215 - arg5 & 0x7FF;
		if (local13 > 1024) {
			local13 -= 2048;
		}
		if (local6 > 1024) {
			local6 -= 2048;
		}
		@Pc(27) int local27 = local6 * arg3 / 512;
		@Pc(33) int local33 = local13 * arg3 / -512;
		@Pc(42) int local42 = local27 + (arg3 - this.anInt4225) / 2;
		@Pc(51) int local51 = local33 + (arg2 - this.anInt4225) / 2;
		if (local42 < arg3 && local42 + this.anInt4225 > 0 && local51 < arg2 && local51 + this.anInt4225 > 0 && this.method3574(arg6)) {
			this.aClass1_Sub2_Sub1_Sub2_4.method3847(local51 + arg0, local42 + arg1, this.anInt4225, this.anInt4225);
		}
	}

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "(Lclient!qg;)V")
	public void method3562(@OriginalArg(0) Class146 arg0) {
		if (this.anInt4212 == 0) {
			return;
		}
		@Pc(14) boolean local14 = this.anInt4219 == -1 || this.anInt4223 != Static10.anInt142;
		if (!this.aBoolean289 && !local14) {
			return;
		}
		if (local14) {
			this.anInt4223 = Static10.anInt142;
			this.anInt4219 = Static121.method2158(Static121.anInt2514, this.anInt4216, this.anInt4216);
		} else {
			Static156.method2699(this.anInt4219);
			Static121.method2156(Static121.anInt2514, this.anInt4216, this.anInt4216);
		}
		if (this.anInt4212 == 1) {
			this.method3563(arg0);
			this.aBoolean289 = false;
		} else if (this.anInt4212 == 2) {
			this.aBoolean289 = !this.method3560(arg0);
		}
	}

	@OriginalMember(owner = "client!qg", name = "d", descriptor = "(Lclient!qg;)V")
	private void method3563(@OriginalArg(0) Class146 arg0) {
		Static231.method3558();
		Static231.method3568();
		@Pc(3) GL local3 = Static156.aGL1;
		Static119.method2140(Static231.anIntArray357);
		Static119.method2126();
		local3.glClearColor((float) (this.anInt4222 >> 16 & 0xFF) / 255.0F, (float) (this.anInt4222 >> 8 & 0xFF) / 255.0F, (float) (this.anInt4222 & 0xFF) / 255.0F, 0.0F);
		local3.glClear(16640);
		@Pc(39) int local39 = 0;
		@Pc(41) int local41 = 0;
		@Pc(43) int local43 = 256;
		if (arg0 != null) {
			if (arg0.aBoolean290) {
				local39 = -arg0.anInt4226;
				local41 = -arg0.anInt4213;
				local43 = -arg0.anInt4217;
			} else {
				local39 = this.anInt4226 - arg0.anInt4226;
				local41 = this.anInt4213 - arg0.anInt4213;
				local43 = this.anInt4217 - arg0.anInt4217;
			}
		}
		Static14.method187(-1.0F, 1.0F, -1.0F, 1.0F, this.anInt4216, this.anInt4216);
		@Pc(96) int local96;
		@Pc(101) int local101;
		@Pc(113) int local113;
		if (this.anInt4224 != 0) {
			local96 = Class135.anIntArray335[this.anInt4224];
			local101 = Class135.anIntArray338[this.anInt4224];
			local113 = local41 * local101 + 32767 - local43 * local96 >> 16;
			local43 = local41 * local96 + local43 * local101 + 32767 >> 16;
			local41 = local113;
		}
		if (this.anInt4215 != 0) {
			local96 = this.anInt4215 - 1024 & 0x7FF;
			local101 = Class135.anIntArray335[local96];
			local113 = Class135.anIntArray338[local96];
			@Pc(157) int local157 = local43 * local101 + local39 * local113 + 32767 >> 16;
			local43 = local43 * local113 + 32767 - local39 * local101 >> 16;
			local39 = local157;
		}
		Static283.method4354((float) -local39, (float) -local41, (float) local43);
		Static283.method4351(16777215, 0.5F, 0.5F, 1.0F);
		Static283.method4350();
		if (this.anInt4222 != 0) {
			local3.glScalef(0.8125F, 0.8125F, 1.0F);
		}
		Static215.anInterface5_1.method786(this.anInt4216, this.anInt4218);
		Static156.method2675(true);
		if (Static156.aBoolean206) {
			local3.glBindBufferARB(34962, 0);
			local3.glBindBufferARB(34963, 0);
		}
		local3.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		local3.glDisableClientState(32886);
		local3.glNormalPointer(5126, 20, Static231.aByteBuffer12.position(0));
		local3.glVertexPointer(2, 5126, 20, Static231.aByteBuffer12.position(0));
		local3.glTexCoordPointer(2, 5126, 20, Static231.aByteBuffer12.position(12));
		local3.glDrawElements(5, Static231.aByteBuffer11.limit() / 2, 5123, Static231.aByteBuffer11.position(0));
		local3.glEnableClientState(32886);
		Static156.method2675(false);
		if (this.anInt4222 != 0) {
			Static90.method1648(0, 0);
			Static156.method2695(1);
			Static156.method2681(0);
			Static156.method2699(Static231.anInt4214);
			local3.glColorMask(true, true, true, false);
			local3.glTexEnvi(8960, 34176, 34168);
			local3.glTexEnvi(8960, 34200, 771);
			local3.glBegin(7);
			local3.glColor4ub((byte) (this.anInt4222 >> 16), (byte) (this.anInt4222 >> 8), (byte) this.anInt4222, (byte) 127);
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
			local3.glColor4ub((byte) (this.anInt4222 >> 16), (byte) (this.anInt4222 >> 8), (byte) this.anInt4222, (byte) -1);
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
		Static14.method192();
		Static156.method2699(this.anInt4219);
		local3.glCopyTexImage2D(3553, 0, 6408, 0, 0, this.anInt4216, this.anInt4216, 0);
		Static119.method2141(Static231.anIntArray357);
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "([IIIIIIIIIII)V")
	private void method3564(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(1) int local1 = arg2;
		for (@Pc(4) int local4 = -arg7; local4 < 0; local4++) {
			@Pc(12) int local12 = (arg3 >> 16) * 128;
			for (@Pc(15) int local15 = -arg6; local15 < 0; local15++) {
				if (arg0[arg4] == 0) {
					arg0[arg4] = (Static231.aByteArray49[(arg2 >> 16) + local12] & 0xFF) << 24 | arg1;
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

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIII)Z")
	public boolean method3566(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean290) {
			this.anInt4211 = 1073741823;
			local7 = this.anInt4226;
			local12 = this.anInt4213;
			local17 = this.anInt4217;
		} else {
			local7 = this.anInt4226 - arg0;
			local12 = this.anInt4213 - arg1;
			local17 = this.anInt4217 - arg2;
			this.anInt4211 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt4211 == 0) {
				this.anInt4211 = 1;
			}
			local7 = (local7 << 8) / this.anInt4211;
			local12 = (local12 << 8) / this.anInt4211;
			local17 = (local17 << 8) / this.anInt4211;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt4225 = this.anInt4220 * arg3 / (this.aBoolean290 ? 1024 : this.anInt4211);
		} else {
			this.anInt4225 = 0;
		}
		if (this.anInt4225 < 8) {
			this.method3572();
			this.aClass1_Sub2_Sub1_Sub2_4 = null;
			return false;
		}
		@Pc(145) int local145 = Static27.method458(this.anInt4225);
		if (local145 > 512) {
			local145 = 512;
		}
		if (local145 != this.anInt4216) {
			this.anInt4216 = local145;
		}
		this.anInt4224 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 325.9493103027344D) & 0x7FF;
		this.anInt4215 = (int) (Math.atan2((double) local7, (double) -local17) * 325.9493103027344D) & 0x7FF;
		this.aBoolean289 = true;
		this.aClass1_Sub2_Sub1_Sub2_4 = null;
		return true;
	}

	@OriginalMember(owner = "client!qg", name = "d", descriptor = "()V")
	private void method3567() {
		@Pc(6) int local6 = this.anInt4216 * 3 / 32;
		@Pc(15) int local15 = this.anInt4216 * 13 / 16;
		@Pc(17) int local17 = local15;
		@Pc(21) int local21 = 8388608 / local15;
		@Pc(25) int local25 = 8388608 / local15;
		@Pc(31) int local31 = local6 + local6 * Static25.anInt420;
		@Pc(35) int local35 = Static25.anInt420 - local15;
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 0;
		if (local6 + local15 > Static25.anInt419) {
			local17 = local15 + Static25.anInt419 - local6 - local15;
		}
		@Pc(59) int local59;
		if (local6 < Static25.anInt417) {
			local59 = Static25.anInt417 - local6;
			local17 -= local59;
			local31 += local59 * Static25.anInt420;
			local39 = local25 * local59;
		}
		if (local6 + local15 > Static25.anInt422) {
			local59 = local6 + local15 - Static25.anInt422;
			local15 -= local59;
			local35 += local59;
		}
		if (local6 < Static25.anInt418) {
			local59 = Static25.anInt418 - local6;
			local15 -= local59;
			local31 += local59;
			local37 = local21 * local59;
			local35 += local59;
		}
		this.method3573(Static25.anIntArray27, this.anInt4222, local37, local39, local31, local35, local15, local17, local21, local25);
	}

	@OriginalMember(owner = "client!qg", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method3572();
		super.finalize();
	}

	@OriginalMember(owner = "client!qg", name = "e", descriptor = "(Lclient!qg;)V")
	private void method3570(@OriginalArg(0) Class146 arg0) {
		@Pc(5) Class15_Sub6 local5 = Static241.method3755(Static216.aClass121_93, this.anInt4218);
		if (local5 == null) {
			return;
		}
		this.aClass1_Sub2_Sub1_Sub2_4 = new Class1_Sub2_Sub1_Sub2(this.anInt4216, this.anInt4216);
		Static25.method399(Static231.anIntArray357);
		this.aClass1_Sub2_Sub1_Sub2_4.method3859();
		Static215.method3375();
		Static25.method385(0, 0, this.anInt4216, this.anInt4216, 0);
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 256;
		if (arg0 != null) {
			if (arg0.aBoolean290) {
				local33 = -arg0.anInt4226;
				local35 = -arg0.anInt4213;
				local37 = -arg0.anInt4217;
			} else {
				local33 = this.anInt4226 - arg0.anInt4226;
				local35 = this.anInt4213 - arg0.anInt4213;
				local37 = this.anInt4217 - arg0.anInt4217;
			}
		}
		@Pc(81) int local81;
		@Pc(86) int local86;
		@Pc(98) int local98;
		if (this.anInt4224 != 0) {
			local81 = Class135.anIntArray335[this.anInt4224];
			local86 = Class135.anIntArray338[this.anInt4224];
			local98 = local35 * local86 + 32767 - local37 * local81 >> 16;
			local37 = local35 * local81 + local37 * local86 + 32767 >> 16;
			local35 = local98;
		}
		@Pc(142) int local142;
		if (this.anInt4215 != 0) {
			local81 = this.anInt4215 - 1024 & 0x7FF;
			local86 = Class135.anIntArray335[local81];
			local98 = Class135.anIntArray338[local81];
			local142 = local37 * local86 + local33 * local98 + 32767 >> 16;
			local37 = local37 * local98 + 32767 - local33 * local86 >> 16;
			local33 = local142;
		}
		@Pc(167) Class15_Sub2_Sub2 local167 = local5.method3764(64, 768, -local33, -local35, -local37);
		local86 = local167.method1033() - local167.method1039();
		local98 = local167.method1024() - local167.method4676();
		local142 = local167.method1039() + local86 / 2;
		@Pc(193) int local193 = local167.method4676() + local98 / 2;
		if (local86 > local98) {
			local167.method1047(0, 0, 0, -local142, -local193, 0, (local86 << 9) / this.anInt4216);
		} else {
			local167.method1047(0, 0, 0, -local142, -local193, 0, (local98 << 9) / this.anInt4216);
		}
		Static94.aClass58_3.method2968();
		Static25.method406(Static231.anIntArray357);
		Static215.method3375();
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIIII)V")
	public void method3571(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(6) int local6 = this.anInt4224 - arg4 & 0x7FF;
		@Pc(13) int local13 = this.anInt4215 - arg5 & 0x7FF;
		if (local13 > 1024) {
			local13 -= 2048;
		}
		if (local6 > 1024) {
			local6 -= 2048;
		}
		@Pc(27) int local27 = local6 * arg3 / 512;
		@Pc(33) int local33 = local13 * arg3 / -512;
		@Pc(42) int local42 = local27 + (arg3 - this.anInt4225) / 2;
		@Pc(51) int local51 = local33 + (arg2 - this.anInt4225) / 2;
		if (local42 >= arg3 || local42 + this.anInt4225 <= 0 || local51 >= arg2 || local51 + this.anInt4225 <= 0) {
			return;
		}
		if (this.anInt4212 == 0) {
			Static215.anInterface5_1.method786(this.anInt4216, this.anInt4218);
		} else if (this.anInt4219 == -1) {
			return;
		} else {
			Static156.method2699(this.anInt4219);
		}
		local27 = local42 + arg1;
		local33 = local51 + arg0;
		@Pc(100) int local100 = local33 + this.anInt4225;
		@Pc(105) int local105 = local27 + this.anInt4225;
		@Pc(107) GL local107 = Static156.aGL1;
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

	@OriginalMember(owner = "client!qg", name = "g", descriptor = "()V")
	private void method3572() {
		if (this.anInt4219 != -1) {
			Static10.method130(this.anInt4219, 0, this.anInt4223);
		}
		this.aBoolean289 = true;
		this.anInt4219 = -1;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "([IIIIIIIIIIII)V")
	private void method3573(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(1) int local1 = arg2;
		for (@Pc(4) int local4 = -arg7; local4 < 0; local4++) {
			@Pc(12) int local12 = (arg3 >> 16) * 128;
			for (@Pc(15) int local15 = -arg6; local15 < 0; local15++) {
				if (arg0[arg4] != 0) {
					@Pc(25) int local25 = arg0[arg4];
					@Pc(37) int local37 = (Static231.aByteArray49[(arg2 >> 16) + local12] & 0xFF) + 64;
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

	@OriginalMember(owner = "client!qg", name = "f", descriptor = "(Lclient!qg;)Z")
	private boolean method3574(@OriginalArg(0) Class146 arg0) {
		if (this.aClass1_Sub2_Sub1_Sub2_4 == null) {
			if (this.anInt4212 == 0) {
				this.aClass1_Sub2_Sub1_Sub2_4 = Static215.anInterface5_1.method789(this.anInt4218, true, this.anInt4216, Static215.aFloat123);
			} else if (this.anInt4212 == 2) {
				this.method3570(arg0);
			} else if (this.anInt4212 == 1) {
				this.method3557(arg0);
			}
		}
		return this.aClass1_Sub2_Sub1_Sub2_4 != null;
	}
}
