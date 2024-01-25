import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!ft", name = "u", descriptor = "I")
	public static int anInt1090;

	@OriginalMember(owner = "client!ft", name = "w", descriptor = "I")
	public static int anInt1091;

	@OriginalMember(owner = "client!ft", name = "p", descriptor = "Lclient!hi;")
	public static final Class102 aClass102_38 = new Class102(19, -1);

	@OriginalMember(owner = "client!ft", name = "r", descriptor = "I")
	public static int anInt1088 = -1;

	@OriginalMember(owner = "client!ft", name = "t", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_33 = new Class211(3, 10);

	@OriginalMember(owner = "client!ft", name = "v", descriptor = "[[I")
	public static final int[][] anIntArrayArray6 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(B[[BLclient!pu;)V")
	public static void method872(@OriginalArg(1) byte[][] arg0, @OriginalArg(2) Class118_Sub1 arg1) {
		@Pc(17) int[] local17 = new int[] { -1, 0, 0, 0, 0 };
		for (@Pc(19) int local19 = 0; local19 < arg1.anInt5443; local19++) {
			Static123.method5625();
			for (@Pc(25) int local25 = 0; local25 < Static166.anInt2852 >> 3; local25++) {
				for (@Pc(29) int local29 = 0; local29 < Static426.anInt6923 >> 3; local29++) {
					@Pc(39) int local39 = Static121.anIntArrayArrayArray1[local19][local25][local29];
					if (local39 != -1) {
						@Pc(48) int local48 = local39 >> 24 & 0x3;
						if (!arg1.aBoolean408 || local48 == 0) {
							@Pc(62) int local62 = local39 >> 1 & 0x3;
							@Pc(68) int local68 = local39 >> 14 & 0x3FF;
							@Pc(74) int local74 = local39 >> 3 & 0x7FF;
							@Pc(84) int local84 = (local68 / 8 << 8) + local74 / 8;
							for (@Pc(86) int local86 = 0; local86 < Static225.anIntArray310.length; local86++) {
								if (Static225.anIntArray310[local86] == local84 && arg0[local86] != null) {
									@Pc(104) Class2_Sub13 local104 = new Class2_Sub13(arg0[local86]);
									arg1.method4300(local19, Static361.aClass71Array1, local48, local68, local62, local74, local25 * 8, local29 * 8, local104);
									arg1.method4314(local68, local48, local104, local74, Static82.aClass163_1, local17[0] == -1 ? local17 : null, local25 * 8, local62, local19, local29 * 8);
									break;
								}
							}
						}
					}
				}
			}
		}
		if (local17[0] != -1) {
			Static405.aClass157_1 = Static91.aClass180_1.method3851(local17[2], local17[1], Static231.aClass129_1, local17[0], local17[3]);
			Static431.anInt6971 = local17[4];
		}
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(BI)V")
	public static void method879(@OriginalArg(1) int arg0) {
		if (Static241.anIntArray335 == null || arg0 > Static241.anIntArray335.length) {
			Static241.anIntArray335 = new int[arg0];
		}
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(BLclient!dk;)I")
	public static int method880(@OriginalArg(1) Class54 arg0) {
		@Pc(12) int local12 = 0;
		if (arg0.method1131(Static4.anInt69)) {
			local12++;
		}
		if (arg0.method1131(Static341.anInt5807)) {
			local12++;
		}
		return local12;
	}
}
