import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vc")
public final class Class139 {

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
	private int anInt5256;

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "I")
	private int anInt5257;

	@OriginalMember(owner = "client!vc", name = "e", descriptor = "I")
	private int anInt5260;

	@OriginalMember(owner = "client!vc", name = "j", descriptor = "I")
	private int anInt5264;

	@OriginalMember(owner = "client!vc", name = "k", descriptor = "I")
	public int anInt5265;

	@OriginalMember(owner = "client!vc", name = "o", descriptor = "Lclient!q;")
	private Class1_Sub2_Sub4_Sub1 aClass1_Sub2_Sub4_Sub1_6;

	@OriginalMember(owner = "client!vc", name = "f", descriptor = "I")
	private int anInt5261;

	@OriginalMember(owner = "client!vc", name = "i", descriptor = "I")
	private int anInt5263;

	@OriginalMember(owner = "client!vc", name = "m", descriptor = "I")
	private int anInt5266;

	@OriginalMember(owner = "client!vc", name = "l", descriptor = "Z")
	private boolean aBoolean267;

	@OriginalMember(owner = "client!vc", name = "n", descriptor = "I")
	private int anInt5267;

	@OriginalMember(owner = "client!vc", name = "h", descriptor = "I")
	private int anInt5262;

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "I")
	private int anInt5259;

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "I")
	private int anInt5258;

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class139(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt5261 = arg2;
		this.anInt5263 = arg3;
		this.anInt5266 = arg4;
		this.aBoolean267 = arg7;
		this.anInt5267 = arg1;
		this.anInt5262 = arg6;
		this.anInt5259 = arg5;
		this.anInt5258 = arg0;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!vc;)Z")
	private boolean method3994(@OriginalArg(0) Class139 arg0) {
		if (this.aClass1_Sub2_Sub4_Sub1_6 == null) {
			if (this.anInt5258 == 0) {
				this.aClass1_Sub2_Sub4_Sub1_6 = Static235.anInterface1_1.method390(true, this.anInt5267, Static235.aFloat47, this.anInt5257);
			} else if (this.anInt5258 == 2) {
				this.method3998(arg0);
			} else if (this.anInt5258 == 1) {
				this.method4005(arg0);
			}
		}
		return this.aClass1_Sub2_Sub4_Sub1_6 != null;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "([IIIIIIIIIIII)V")
	private void method3996(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(1) int local1 = arg2;
		for (@Pc(4) int local4 = -arg7; local4 < 0; local4++) {
			@Pc(11) int local11 = (arg3 >> 16) * 128;
			for (@Pc(14) int local14 = -arg6; local14 < 0; local14++) {
				if (arg0[arg4] != 0) {
					@Pc(23) int local23 = arg0[arg4];
					@Pc(35) int local35 = (Static245.aByteArray63[(arg2 >> 16) + local11] & 0xFF) + 64;
					if (local35 > 255) {
						local35 = 255;
					}
					@Pc(44) int local44 = 256 - local35;
					arg0[arg4] = ((arg1 & 0xFF00FF) * local44 + (local23 & 0xFF00FF) * local35 & -16711936) + ((arg1 & 0xFF00) * local44 + (local23 & 0xFF00) * local35 & 0xFF0000) >> 8 | 0xFF000000;
				}
				arg4++;
				arg2 += arg8;
			}
			arg3 += arg9;
			arg2 = local1;
			arg4 += arg5;
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "([IIIIIIIIIII)V")
	private void method3997(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(1) int local1 = arg2;
		for (@Pc(4) int local4 = -arg7; local4 < 0; local4++) {
			@Pc(11) int local11 = (arg3 >> 16) * 128;
			for (@Pc(14) int local14 = -arg6; local14 < 0; local14++) {
				if (arg0[arg4] == 0) {
					arg0[arg4] = (Static245.aByteArray63[(arg2 >> 16) + local11] & 0xFF) << 24 | arg1;
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

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(Lclient!vc;)V")
	private void method3998(@OriginalArg(0) Class139 arg0) {
		@Pc(5) Class9_Sub3 local5 = Static27.method545(Static162.aClass51_54, this.anInt5267);
		if (local5 == null) {
			return;
		}
		this.aClass1_Sub2_Sub4_Sub1_6 = new Class1_Sub2_Sub4_Sub1(this.anInt5257, this.anInt5257);
		Static189.method3195(Static245.anIntArray458);
		this.aClass1_Sub2_Sub4_Sub1_6.method913();
		Static235.method3902();
		Static189.method3193(0, 0, this.anInt5257, this.anInt5257, 0);
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 256;
		if (arg0 != null) {
			if (arg0.aBoolean267) {
				local33 = -arg0.anInt5261;
				local35 = -arg0.anInt5263;
				local37 = -arg0.anInt5266;
			} else {
				local33 = this.anInt5261 - arg0.anInt5261;
				local35 = this.anInt5263 - arg0.anInt5263;
				local37 = this.anInt5266 - arg0.anInt5266;
			}
		}
		@Pc(81) int local81;
		@Pc(86) int local86;
		@Pc(98) int local98;
		if (this.anInt5260 != 0) {
			local81 = Class132.anIntArray440[this.anInt5260];
			local86 = Class132.anIntArray439[this.anInt5260];
			local98 = local35 * local86 + 32767 - local37 * local81 >> 16;
			local37 = local35 * local81 + local37 * local86 + 32767 >> 16;
			local35 = local98;
		}
		@Pc(142) int local142;
		if (this.anInt5264 != 0) {
			local81 = this.anInt5264 - 1024 & 0x7FF;
			local86 = Class132.anIntArray440[local81];
			local98 = Class132.anIntArray439[local81];
			local142 = local37 * local86 + local33 * local98 + 32767 >> 16;
			local37 = local37 * local98 + 32767 - local33 * local86 >> 16;
			local33 = local142;
		}
		@Pc(167) Class9_Sub5_Sub1 local167 = local5.method550(64, 768, -local33, -local35, -local37);
		local86 = local167.method3599() - local167.method3616();
		local98 = local167.method3640() - local167.method3587();
		local142 = local167.method3616() + local86 / 2;
		@Pc(193) int local193 = local167.method3587() + local98 / 2;
		if (local86 > local98) {
			local167.method3635(0, 0, 0, -local142, -local193, 0, (local86 << 9) / this.anInt5257);
		} else {
			local167.method3635(0, 0, 0, -local142, -local193, 0, (local98 << 9) / this.anInt5257);
		}
		Static193.aClass73_1.method2864();
		Static189.method3191(Static245.anIntArray458);
		Static235.method3902();
	}

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "()V")
	private void method4000() {
	}

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "()V")
	private void method4001() {
		@Pc(2) int local2 = this.anInt5257;
		@Pc(5) int local5 = this.anInt5257;
		@Pc(9) int local9 = 8388608 / local2;
		@Pc(13) int local13 = 8388608 / local5;
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = 0;
		@Pc(23) int local23 = Static189.anInt4234 - local2;
		if (local5 > Static189.anInt4233) {
			local5 -= local5 - Static189.anInt4233;
		}
		@Pc(36) int local36;
		if (Static189.anInt4231 > 0) {
			local36 = Static189.anInt4231;
			local5 -= local36;
			local19 = local36 * Static189.anInt4234;
			local17 = local13 * local36;
		}
		if (local2 > Static189.anInt4229) {
			local36 = local2 - Static189.anInt4229;
			local2 -= local36;
			local23 += local36;
		}
		if (Static189.anInt4232 > 0) {
			local36 = Static189.anInt4232;
			local2 -= local36;
			local19 += local36;
			local15 = local9 * local36;
			local23 += local36;
		}
		this.method3997(Static189.anIntArray319, this.anInt5262, local15, local17, local19, local23, local2, local5, local9, local13);
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIII)Z")
	public boolean method4002(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean267) {
			this.anInt5265 = 1073741823;
			local7 = this.anInt5261;
			local12 = this.anInt5263;
			local17 = this.anInt5266;
		} else {
			local7 = this.anInt5261 - arg0;
			local12 = this.anInt5263 - arg1;
			local17 = this.anInt5266 - arg2;
			this.anInt5265 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt5265 == 0) {
				this.anInt5265 = 1;
			}
			local7 = (local7 << 8) / this.anInt5265;
			local12 = (local12 << 8) / this.anInt5265;
			local17 = (local17 << 8) / this.anInt5265;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt5256 = this.anInt5259 * arg3 / (this.aBoolean267 ? 1024 : this.anInt5265);
		} else {
			this.anInt5256 = 0;
		}
		if (this.anInt5256 < 8) {
			this.method4000();
			this.aClass1_Sub2_Sub4_Sub1_6 = null;
			return false;
		}
		@Pc(145) int local145 = Static199.method3320(this.anInt5256);
		if (local145 > 512) {
			local145 = 512;
		}
		if (local145 != this.anInt5257) {
			this.anInt5257 = local145;
		}
		this.anInt5260 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 325.9493103027344D) & 0x7FF;
		this.anInt5264 = (int) (Math.atan2((double) local7, (double) -local17) * 325.9493103027344D) & 0x7FF;
		this.aClass1_Sub2_Sub4_Sub1_6 = null;
		return true;
	}

	@OriginalMember(owner = "client!vc", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method4000();
		super.finalize();
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIIIILclient!vc;)V")
	public void method4004(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class139 arg6) {
		@Pc(6) int local6 = this.anInt5260 - arg4 & 0x7FF;
		@Pc(13) int local13 = this.anInt5264 - arg5 & 0x7FF;
		if (local13 > 1024) {
			local13 -= 2048;
		}
		if (local6 > 1024) {
			local6 -= 2048;
		}
		@Pc(27) int local27 = local6 * arg3 / 512;
		@Pc(33) int local33 = local13 * arg3 / -512;
		@Pc(42) int local42 = local27 + (arg3 - this.anInt5256) / 2;
		@Pc(51) int local51 = local33 + (arg2 - this.anInt5256) / 2;
		if (local42 < arg3 && local42 + this.anInt5256 > 0 && local51 < arg2 && local51 + this.anInt5256 > 0 && this.method3994(arg6)) {
			this.aClass1_Sub2_Sub4_Sub1_6.method887(local51 + arg0, local42 + arg1, this.anInt5256, this.anInt5256);
		}
	}

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "(Lclient!vc;)V")
	private void method4005(@OriginalArg(0) Class139 arg0) {
		Static245.method3995();
		Static245.method4003();
		this.aClass1_Sub2_Sub4_Sub1_6 = new Class1_Sub2_Sub4_Sub1_Sub1(this.anInt5257, this.anInt5257);
		Static189.method3195(Static245.anIntArray458);
		this.aClass1_Sub2_Sub4_Sub1_6.method913();
		Static235.method3902();
		Static189.method3193(0, 0, this.anInt5257, this.anInt5257, 0);
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 256;
		if (arg0 != null) {
			if (arg0.aBoolean267) {
				local26 = -arg0.anInt5261;
				local28 = -arg0.anInt5263;
				local30 = -arg0.anInt5266;
			} else {
				local26 = this.anInt5261 - arg0.anInt5261;
				local28 = this.anInt5263 - arg0.anInt5263;
				local30 = this.anInt5266 - arg0.anInt5266;
			}
		}
		@Pc(74) int local74;
		@Pc(79) int local79;
		@Pc(91) int local91;
		if (this.anInt5260 != 0) {
			local74 = Class132.anIntArray440[this.anInt5260];
			local79 = Class132.anIntArray439[this.anInt5260];
			local91 = local28 * local79 + 32767 - local30 * local74 >> 16;
			local30 = local28 * local74 + local30 * local79 + 32767 >> 16;
			local28 = local91;
		}
		@Pc(135) int local135;
		if (this.anInt5264 != 0) {
			local74 = this.anInt5264 - 1024 & 0x7FF;
			local79 = Class132.anIntArray440[local74];
			local91 = Class132.anIntArray439[local74];
			local135 = local30 * local79 + local26 * local91 + 32767 >> 16;
			local30 = local30 * local91 + 32767 - local26 * local79 >> 16;
			local26 = local135;
		}
		Static274.method2686(Static245.aClass9_Sub3_1.aShortArray15, 0, Static245.aClass9_Sub3_1.anInt859, (short) Static235.anInterface1_1.method391(this.anInt5267));
		@Pc(172) Class9_Sub5_Sub1 local172 = Static245.aClass9_Sub3_1.method550(64, 512, -local26, -local28, -local30);
		local79 = local172.method3599() - local172.method3616();
		local91 = local172.method3640() - local172.method3587();
		if (local79 > local91) {
			local135 = this.anInt5262 == 0 ? (local79 << 9) / this.anInt5257 : (local79 * 16 << 9) / (this.anInt5257 * 13);
			local172.method3635(0, 0, 0, 0, 0, 0, local135);
		} else {
			local135 = this.anInt5262 == 0 ? (local91 << 9) / this.anInt5257 : (local91 * 16 << 9) / (this.anInt5257 * 13);
			local172.method3635(0, 0, 0, 0, 0, 0, local135);
		}
		if (this.anInt5262 == 0) {
			for (local135 = 0; local135 < Static189.anIntArray319.length; local135++) {
				if (Static189.anIntArray319[local135] != 0) {
					Static189.anIntArray319[local135] |= 0xFF000000;
				}
			}
		} else {
			this.method4006();
			this.method4001();
		}
		Static193.aClass73_1.method2864();
		Static189.method3191(Static245.anIntArray458);
		Static235.method3902();
	}

	@OriginalMember(owner = "client!vc", name = "f", descriptor = "()V")
	private void method4006() {
		@Pc(6) int local6 = this.anInt5257 * 3 / 32;
		@Pc(15) int local15 = this.anInt5257 * 13 / 16;
		@Pc(17) int local17 = local15;
		@Pc(21) int local21 = 8388608 / local15;
		@Pc(25) int local25 = 8388608 / local15;
		@Pc(31) int local31 = local6 + local6 * Static189.anInt4234;
		@Pc(35) int local35 = Static189.anInt4234 - local15;
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 0;
		if (local6 + local15 > Static189.anInt4233) {
			local17 = local15 + Static189.anInt4233 - local6 - local15;
		}
		@Pc(59) int local59;
		if (local6 < Static189.anInt4231) {
			local59 = Static189.anInt4231 - local6;
			local17 -= local59;
			local31 += local59 * Static189.anInt4234;
			local39 = local25 * local59;
		}
		if (local6 + local15 > Static189.anInt4229) {
			local59 = local6 + local15 - Static189.anInt4229;
			local15 -= local59;
			local35 += local59;
		}
		if (local6 < Static189.anInt4232) {
			local59 = Static189.anInt4232 - local6;
			local15 -= local59;
			local31 += local59;
			local37 = local21 * local59;
			local35 += local59;
		}
		this.method3996(Static189.anIntArray319, this.anInt5262, local37, local39, local31, local35, local15, local17, local21, local25);
	}
}
