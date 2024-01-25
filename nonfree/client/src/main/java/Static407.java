import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static407 {

	@OriginalMember(owner = "client!pm", name = "d", descriptor = "Lclient!dc;")
	public static final Class68 aClass68_15 = new Class68(11, 0, 1, 2);

	@OriginalMember(owner = "client!pm", name = "f", descriptor = "[I")
	public static final int[] anIntArray422 = new int[1];

	@OriginalMember(owner = "client!pm", name = "g", descriptor = "J")
	public static long aLong207 = -1L;

	@OriginalMember(owner = "client!pm", name = "h", descriptor = "Lclient!vh;")
	public static final Class344 aClass344_70 = new Class344(6, 16);

	@OriginalMember(owner = "client!pm", name = "i", descriptor = "I")
	public static int anInt7865 = 0;

	@OriginalMember(owner = "client!pm", name = "j", descriptor = "I")
	public static int anInt7866 = 0;

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(III)V")
	public static void method6144(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13;
		if (Static417.anInt5248 != arg0) {
			Static579.anIntArray585 = new int[arg0];
			for (local13 = 0; local13 < arg0; local13++) {
				Static579.anIntArray585[local13] = (local13 << 12) / arg0;
			}
			Static359.anInt6929 = arg0 - 1;
			Static170.anInt3583 = arg0 * 32;
			Static417.anInt5248 = arg0;
		}
		if (arg1 == Static38.anInt1239) {
			return;
		}
		if (arg1 == Static417.anInt5248) {
			Static217.anIntArray501 = Static579.anIntArray585;
		} else {
			Static217.anIntArray501 = new int[arg1];
			for (local13 = 0; local13 < arg1; local13++) {
				Static217.anIntArray501[local13] = (local13 << 12) / arg1;
			}
		}
		Static565.anInt5164 = arg1 - 1;
		Static38.anInt1239 = arg1;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIILclient!r;II)V")
	public static void method6145(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class7 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		arg2.da(arg0, arg1, arg0 + arg4, arg3 + arg1);
		arg2.method7825(arg3, arg4, arg1, -16777216, arg0);
		if (Static142.anInt3092 < 100) {
			return;
		}
		@Pc(33) float local33 = (float) Static572.anInt10057 / (float) Static572.anInt10062;
		@Pc(35) int local35 = arg4;
		@Pc(37) int local37 = arg3;
		if (local33 < 1.0F) {
			local37 = (int) ((float) arg4 * local33);
		} else {
			local35 = (int) ((float) arg3 / local33);
		}
		@Pc(64) int local64 = arg0 + (arg4 - local35) / 2;
		@Pc(73) int local73 = arg1 + (arg3 - local37) / 2;
		if (Static239.aClass88_15 == null || arg4 != Static239.aClass88_15.E() || Static239.aClass88_15.u() != arg3) {
			Static572.method7753(Static572.anInt10056, Static572.anInt10057 + Static572.anInt10059, Static572.anInt10062 + Static572.anInt10056, Static572.anInt10059, local64, local73, local35 + local64, local73 + local37);
			Static572.method7751(arg2);
			Static239.aClass88_15 = arg2.method7788(local64, local73, local35, local37, false);
		}
		Static239.aClass88_15.method8051(local64, local73);
		@Pc(124) int local124 = local35 * Static366.anInt7070 / Static572.anInt10062;
		@Pc(130) int local130 = local37 * Static481.anInt9094 / Static572.anInt10057;
		@Pc(138) int local138 = Static4.anInt1828 * local35 / Static572.anInt10062 + local64;
		@Pc(152) int local152 = local73 + local37 - local37 * Static72.anInt1882 / Static572.anInt10057 - local130;
		@Pc(154) int local154 = -1996554240;
		if (Static162.aClass128_1 == Static403.aClass128_3) {
			local154 = -1996488705;
		}
		arg2.J(local138, local152, local124, local130, local154, 1);
		arg2.method7824(local138, local152, local124, local130, local154, 0);
		if (Static536.anInt9797 <= 0) {
			return;
		}
		@Pc(190) int local190;
		if (Static44.anInt1296 > 50) {
			local190 = 500 - Static44.anInt1296 * 5;
		} else {
			local190 = Static44.anInt1296 * 5;
		}
		for (@Pc(201) Class4_Sub20 local201 = (Class4_Sub20) Static572.aClass22_64.method895(); local201 != null; local201 = (Class4_Sub20) Static572.aClass22_64.method889()) {
			@Pc(209) Class288 local209 = Static572.aClass121_4.method2676(local201.anInt3266);
			if (Static292.method4718(local209)) {
				@Pc(230) int local230;
				@Pc(241) int local241;
				if (local201.anInt3266 == Static139.anInt3063) {
					local230 = local64 + local35 * local201.anInt3263 / Static572.anInt10062;
					local241 = local37 * (Static572.anInt10057 - local201.anInt3264) / Static572.anInt10057 + local73;
					arg2.method7825(4, 4, local241 - 2, local190 << 24 | 0xFFFF00, local230 - 2);
				} else if (Static537.anInt9803 != -1 && local209.anInt8601 == Static537.anInt9803) {
					local230 = local35 * local201.anInt3263 / Static572.anInt10062 + local64;
					local241 = local37 * (Static572.anInt10057 - local201.anInt3264) / Static572.anInt10057 + local73;
					arg2.method7825(4, 4, local241 - 2, local190 << 24 | 0xFFFF00, local230 - 2);
				}
			}
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(BZLjava/lang/String;J)V")
	public static void method6146(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1, @OriginalArg(3) long arg2) {
		if (arg0) {
			Static387.method5967();
			if (Static543.aString213.equals("")) {
				Static457.anInt8737 = 39;
				return;
			}
		}
		@Pc(19) Class4_Sub13 local19 = new Class4_Sub13(576);
		local19.method7052(10);
		local19.method7038((int) (Math.random() * 65535.0D));
		local19.method7020(arg2);
		local19.method7038(arg0 ? Static105.anInt8981 : Static446.anInt8497);
		local19.method7002(arg1);
		local19.method7020(arg0 ? Static66.aLong37 : Static452.aLong234);
		if (arg0) {
			local19.method7020(Static587.method8191(Static543.aString213));
			try {
				local19.method7020(Long.parseLong(Static570.aString228));
			} catch (@Pc(77) Exception local77) {
				Static457.anInt8737 = 39;
				return;
			}
		} else {
			local19.method7032((int) (Math.random() * 9.9999999E7D));
			local19.method7032((int) (Math.random() * 9.9999999E7D));
			local19.method7032((int) (Math.random() * 9.9999999E7D));
			local19.method7032((int) (Math.random() * 9.9999999E7D));
		}
		local19.method7032((int) (Math.random() * 9.9999999E7D));
		local19.method7024(Static325.aBigInteger4, Static496.aBigInteger6);
		@Pc(123) Class4_Sub39 local123 = Static504.method7252();
		local123.aClass4_Sub13_Sub2_1.method7052(arg0 ? Static58.aClass195_12.anInt5991 : Static58.aClass195_9.anInt5991);
		@Pc(136) int local136 = 1;
		if (Static172.aString67 != null) {
			local136 = Static172.aString67.length() + 1 + 1;
		}
		local123.aClass4_Sub13_Sub2_1.method7038(local136 + local19.anInt9170 + 28);
		local123.aClass4_Sub13_Sub2_1.method7038(624);
		local123.aClass4_Sub13_Sub2_1.method7052(Static142.anInt3088);
		local123.aClass4_Sub13_Sub2_1.method7052(Static162.aClass128_1.anInt3622);
		Static194.method3191(local123.aClass4_Sub13_Sub2_1);
		@Pc(181) String local181 = arg0 ? Static517.aString233 : Static172.aString67;
		local123.aClass4_Sub13_Sub2_1.method7052(local181 == null ? 0 : 1);
		if (local181 != null) {
			local123.aClass4_Sub13_Sub2_1.method7002(local181);
		}
		local123.aClass4_Sub13_Sub2_1.method7030(local19.anInt9170, local19.aByteArray88);
		Static50.method1166(local123);
		Static423.anInt8145 = 0;
		Static457.anInt8737 = -3;
		Static232.anInt4898 = 1;
		Static209.anInt4424 = 0;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIIIIIII)Z")
	public static boolean method6148(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg1 < arg5 + arg2 && arg2 < arg1 + arg3) {
			return arg4 < arg6 + arg7 && arg7 < arg4 + arg0;
		} else {
			return false;
		}
	}
}
