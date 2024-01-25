import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!iq", name = "M", descriptor = "[Lclient!rk;")
	public static final Class6_Sub2_Sub1_Sub2[] aClass6_Sub2_Sub1_Sub2Array1 = new Class6_Sub2_Sub1_Sub2[32768];

	@OriginalMember(owner = "client!iq", name = "S", descriptor = "Lclient!ui;")
	public static final Class242 aClass242_45 = new Class242("glow3:", "leuchten3:", "brillant3:", "brilho3:");

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "(IZI)Z")
	public static boolean method2581(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x40000) != 0 | Static223.method3134(arg0, arg1) || Static105.method1658(arg1, arg0);
	}

	@OriginalMember(owner = "client!iq", name = "e", descriptor = "(I)V")
	public static void method2582() {
		@Pc(12) int local12 = Static126.aClass67_Sub1_1.method4535(Static286.anInt5207);
		if (local12 == 0) {
			Static275.aByteArrayArrayArray8 = null;
			Static166.method2461(0);
		} else if (local12 == 1) {
			Static107.method1676((byte) 0);
			Static166.method2461(512);
			if (Static327.aByteArrayArrayArray11 != null) {
				Static369.method5084();
			}
		} else {
			Static107.method1676((byte) (Static203.anInt3898 - 4 & 0xFF));
			Static166.method2461(2);
		}
		Static25.anInt667 = Static221.anInt4855;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(IIIILclient!qa;I)V")
	public static void method2583(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class30 arg3, @OriginalArg(5) int arg4) {
		arg3.pa(arg4, arg0, arg4 + arg2, arg1 + arg0);
		arg3.method4692(arg2, arg1, arg4, -16777216, arg0);
		if (Static231.anInt4229 < 100) {
			return;
		}
		@Pc(35) float local35 = (float) Static137.anInt5580 / (float) Static137.anInt5588;
		@Pc(37) int local37 = arg2;
		@Pc(39) int local39 = arg1;
		if (local35 < 1.0F) {
			local39 = (int) ((float) arg2 * local35);
		} else {
			local37 = (int) ((float) arg1 / local35);
		}
		@Pc(66) int local66 = arg0 + (arg1 - local39) / 2;
		@Pc(75) int local75 = arg4 + (arg2 - local37) / 2;
		if (Static212.aClass3_11 == null || arg2 != Static212.aClass3_11.UA() || arg1 != Static212.aClass3_11.qa()) {
			Static137.method4296(Static137.anInt5581, Static137.anInt5580 + Static137.anInt5584, Static137.anInt5588 + Static137.anInt5581, Static137.anInt5584, local75, local66, local37 + local75, local39 + local66);
			Static137.method4304(arg3);
			Static212.aClass3_11 = arg3.method4633(local75, local66, local37, local39, false);
		}
		Static212.aClass3_11.method5877(local75, local66);
		@Pc(122) int local122 = local37 * Static139.anInt2672 / Static137.anInt5588;
		@Pc(128) int local128 = Static341.anInt6056 * local39 / Static137.anInt5580;
		@Pc(137) int local137 = local75 + local37 * Static32.anInt748 / Static137.anInt5588;
		@Pc(151) int local151 = local66 + local39 - local39 * Static19.anInt571 / Static137.anInt5580 - local128;
		@Pc(153) int local153 = -1996554240;
		if (Static128.aClass95_1 == Static441.aClass95_5) {
			local153 = -1996488705;
		}
		arg3.NA(local137, local151, local122, local128, local153, 1);
		arg3.method4645(local137, local151, local122, local128, local153, 0);
		if (Static2.anInt6973 <= 0) {
			return;
		}
		@Pc(186) int local186;
		if (Static98.anInt2095 > 50) {
			local186 = (100 - Static98.anInt2095) * 5;
		} else {
			local186 = Static98.anInt2095 * 5;
		}
		for (@Pc(197) Class4_Sub32 local197 = (Class4_Sub32) Static137.aClass258_37.method5538(); local197 != null; local197 = (Class4_Sub32) Static137.aClass258_37.method5528()) {
			@Pc(207) Class25 local207 = Static137.aClass198_4.method4491(local197.anInt5601);
			if (Static111.method5046(local207)) {
				@Pc(239) int local239;
				@Pc(252) int local252;
				if (local197.anInt5601 == Static129.anInt2584) {
					local239 = local37 * local197.anInt5605 / Static137.anInt5588 + local75;
					local252 = local66 + local39 * (Static137.anInt5580 - local197.anInt5602) / Static137.anInt5580;
					arg3.method4692(4, 4, local239 - 2, local186 << 24 | 0xFFFF00, local252 - 2);
				} else if (Static158.anInt2992 != -1 && Static158.anInt2992 == local207.anInt865) {
					local239 = local75 + local197.anInt5605 * local37 / Static137.anInt5588;
					local252 = local66 + (Static137.anInt5580 - local197.anInt5602) * local39 / Static137.anInt5580;
					arg3.method4692(4, 4, local239 - 2, local186 << 24 | 0xFFFF00, local252 - 2);
				}
			}
		}
	}
}
