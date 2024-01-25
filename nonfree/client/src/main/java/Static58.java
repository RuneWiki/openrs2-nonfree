import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!cq", name = "B", descriptor = "I")
	public static int anInt1222;

	@OriginalMember(owner = "client!cq", name = "D", descriptor = "[[I")
	public static int[][] anIntArrayArray8;

	@OriginalMember(owner = "client!cq", name = "G", descriptor = "I")
	public static int anInt1225;

	@OriginalMember(owner = "client!cq", name = "z", descriptor = "I")
	public static int anInt1221 = -1;

	@OriginalMember(owner = "client!cq", name = "E", descriptor = "Lclient!bg;")
	public static final Class25 aClass25_18 = new Class25(78, 3);

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(B)V")
	public static void method1091() {
		for (@Pc(7) int local7 = 0; local7 < Static80.anInt1573; local7++) {
			@Pc(13) int local13 = Static375.anIntArray545[local7];
			@Pc(17) Class3_Sub3_Sub6_Sub2 local17 = Static450.aClass3_Sub3_Sub6_Sub2Array1[local13];
			@Pc(21) int local21 = Static55.aClass6_Sub15_Sub1_1.method3111();
			if ((local21 & 0x80) != 0) {
				local21 += Static55.aClass6_Sub15_Sub1_1.method3111() << 8;
			}
			if ((local21 & 0x2000) != 0) {
				local17.anInt6719 = Static55.aClass6_Sub15_Sub1_1.method3077();
				local17.anInt6734 = Static55.aClass6_Sub15_Sub1_1.method3099();
				local17.anInt6751 = Static55.aClass6_Sub15_Sub1_1.method3077();
				local17.anInt6748 = Static55.aClass6_Sub15_Sub1_1.method3099();
				local17.anInt6686 = Static55.aClass6_Sub15_Sub1_1.method3101() + Static125.anInt2225;
				local17.anInt6700 = Static55.aClass6_Sub15_Sub1_1.method3108() + Static125.anInt2225;
				local17.anInt6718 = Static55.aClass6_Sub15_Sub1_1.method3131();
				local17.anInt6751 += local17.anIntArray582[0];
				local17.anInt6719 += local17.anIntArray582[0];
				local17.anInt6734 += local17.anIntArray583[0];
				local17.anInt6755 = 0;
				local17.anInt6756 = 1;
				local17.anInt6748 += local17.anIntArray583[0];
			}
			@Pc(126) int local126;
			@Pc(130) int local130;
			if ((local21 & 0x20) != 0) {
				local126 = Static55.aClass6_Sub15_Sub1_1.method3090();
				local130 = Static55.aClass6_Sub15_Sub1_1.method3086();
				local17.method5509(local130, Static125.anInt2225, local126);
				local17.anInt6746 = Static125.anInt2225 + 300;
				local17.anInt6714 = Static55.aClass6_Sub15_Sub1_1.method3131();
			}
			if ((local21 & 0x8) != 0) {
				local126 = Static55.aClass6_Sub15_Sub1_1.method3090();
				local130 = Static55.aClass6_Sub15_Sub1_1.method3111();
				local17.method5509(local130, Static125.anInt2225, local126);
			}
			@Pc(188) int local188;
			if ((local21 & 0x10) != 0) {
				local126 = Static55.aClass6_Sub15_Sub1_1.method3097();
				local130 = Static55.aClass6_Sub15_Sub1_1.method3109();
				if (local126 == 65535) {
					local126 = -1;
				}
				local188 = Static55.aClass6_Sub15_Sub1_1.method3131();
				local17.method5523(local188, local130, false, local126);
			}
			if ((local21 & 0x1000) != 0) {
				local126 = Static55.aClass6_Sub15_Sub1_1.method3126();
				local130 = Static55.aClass6_Sub15_Sub1_1.method3129();
				if (local126 == 65535) {
					local126 = -1;
				}
				local188 = Static55.aClass6_Sub15_Sub1_1.method3111();
				local17.method5523(local188, local130, true, local126);
			}
			if ((local21 & 0x40) != 0) {
				local17.aString63 = Static55.aClass6_Sub15_Sub1_1.method3093();
				local17.anInt6721 = 100;
			}
			if ((local21 & 0x4) != 0) {
				if (local17.aClass17_1.method285()) {
					Static405.method5558(local17);
				}
				local17.method5529(Static336.aClass59_2.method1468(Static55.aClass6_Sub15_Sub1_1.method3126()));
				local17.method5513(local17.aClass17_1.anInt344);
				local17.anInt6679 = local17.aClass17_1.anInt351 << 3;
				if (local17.aClass17_1.method285()) {
					Static57.method1074(null, local17.anIntArray582[0], local17, 0, local17.aByte93, local17.anIntArray583[0], null);
				}
			}
			if ((local21 & 0x200) != 0) {
				local17.aByte95 = Static55.aClass6_Sub15_Sub1_1.method3116();
				local17.aByte98 = Static55.aClass6_Sub15_Sub1_1.method3077();
				local17.aByte97 = Static55.aClass6_Sub15_Sub1_1.method3104();
				local17.aByte96 = (byte) Static55.aClass6_Sub15_Sub1_1.method3131();
				local17.anInt6732 = Static125.anInt2225 + Static55.aClass6_Sub15_Sub1_1.method3101();
				local17.anInt6743 = Static125.anInt2225 + Static55.aClass6_Sub15_Sub1_1.method3097();
			}
			if ((local21 & 0x800) != 0) {
				local126 = Static55.aClass6_Sub15_Sub1_1.method3097();
				local17.anInt6682 = Static55.aClass6_Sub15_Sub1_1.method3086();
				local17.anInt6720 = Static55.aClass6_Sub15_Sub1_1.method3110();
				local17.aBoolean454 = (local126 & 0x8000) != 0;
				local17.anInt6711 = local126 & 0x7FFF;
				local17.anInt6689 = local17.anInt6711 + Static125.anInt2225 + local17.anInt6682;
			}
			if ((local21 & 0x2) != 0) {
				local126 = Static55.aClass6_Sub15_Sub1_1.method3108();
				if (local126 == 65535) {
					local126 = -1;
				}
				local130 = Static55.aClass6_Sub15_Sub1_1.method3111();
				Static44.method824(local126, local17, local130);
			}
			if ((local21 & 0x400) != 0) {
				local17.anInt6760 = Static55.aClass6_Sub15_Sub1_1.method3097();
				local17.anInt6761 = Static55.aClass6_Sub15_Sub1_1.method3097();
			}
			if ((local21 & 0x1) != 0) {
				local17.anInt6690 = Static55.aClass6_Sub15_Sub1_1.method3101();
				if (local17.anInt6690 == 65535) {
					local17.anInt6690 = -1;
				}
			}
			if ((local21 & 0x100) != 0) {
				local126 = Static55.aClass6_Sub15_Sub1_1.method3110();
				@Pc(465) int[] local465 = new int[local126];
				@Pc(468) int[] local468 = new int[local126];
				@Pc(471) int[] local471 = new int[local126];
				for (@Pc(473) int local473 = 0; local473 < local126; local473++) {
					@Pc(479) int local479 = Static55.aClass6_Sub15_Sub1_1.method3101();
					if (local479 == 65535) {
						local479 = -1;
					}
					local465[local473] = local479;
					local468[local473] = Static55.aClass6_Sub15_Sub1_1.method3110();
					local471[local473] = Static55.aClass6_Sub15_Sub1_1.method3101();
				}
				Static364.method5131(local468, local471, local17, local465);
			}
		}
	}

	@OriginalMember(owner = "client!cq", name = "b", descriptor = "(II)V")
	public static void method1093(@OriginalArg(0) int arg0) {
		Static265.anInt4551 = arg0;
		Static392.aClass220_52.method4999();
	}
}
