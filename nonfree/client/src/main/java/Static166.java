import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
	public static int anInt4506 = 0;

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "Lclient!ea;")
	private static Class18 aClass18_1167 = Static8.method128("You are standing in a members)2only area)3");

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1168 = Static8.method128("Untersuchen");

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1169 = Static8.method128("<col=00ff00>");

	@OriginalMember(owner = "client!vc", name = "f", descriptor = "[I")
	public static int[] anIntArray409 = new int[256];

	@OriginalMember(owner = "client!vc", name = "g", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1170 = Static8.method128(":assist:");

	@OriginalMember(owner = "client!vc", name = "j", descriptor = "[I")
	public static int[] anIntArray410 = new int[25];

	@OriginalMember(owner = "client!vc", name = "l", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1171 = aClass18_1167;

	@OriginalMember(owner = "client!vc", name = "p", descriptor = "[I")
	public static int[] anIntArray411 = new int[5];

	@OriginalMember(owner = "client!vc", name = "A", descriptor = "Lclient!rc;")
	public static Class66 aClass66_25 = new Class66(64);

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)I")
	public static int method3057() {
		return 6;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IZI)I")
	public static int method3059(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(41) int local41 = Static22.method378(arg1 + 45365, arg0 + 91923, 4) + (Static22.method378(arg1 - -10294, arg0 + 37821, 2) - 128 >> 1) + (Static22.method378(arg1, arg0, 1) + -128 >> 2) - 128;
		local41 = (int) ((double) local41 * 0.3D) + 35;
		if (local41 < 10) {
			local41 = 10;
		} else if (local41 > 60) {
			local41 = 60;
		}
		return local41;
	}

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "(I)V")
	public static void method3061() {
		aClass18_1170 = null;
		aClass18_1167 = null;
		aClass66_25 = null;
		aClass18_1168 = null;
		anIntArray409 = null;
		aClass18_1169 = null;
		anIntArray410 = null;
		anIntArray411 = null;
		aClass18_1171 = null;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IBI)V")
	public static void method3062(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int[] local8 = new int[4];
		@Pc(10) int local10 = 1;
		@Pc(17) int[] local17 = new int[4];
		local17[0] = arg0;
		local8[0] = arg1;
		for (@Pc(27) int local27 = 0; local27 < 4; local27++) {
			if (arg0 != Static175.anIntArray427[local27]) {
				local17[local10] = Static175.anIntArray427[local27];
				local8[local10] = Static65.anIntArray167[local27];
				local10++;
			}
		}
		Static175.anIntArray427 = local17;
		Static65.anIntArray167 = local8;
		Static149.method2809(Static65.anIntArray167, Static175.anIntArray427, 0, Static43.aClass57Array1.length - 1, Static43.aClass57Array1);
	}

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "(IZ)V")
	public static void method3064(@OriginalArg(1) boolean arg0) {
		for (@Pc(12) int local12 = 0; local12 < Static155.anInt4267; local12++) {
			@Pc(20) Class1_Sub1_Sub5_Sub1_Sub1 local20 = Static91.aClass1_Sub1_Sub5_Sub1_Sub1Array1[Static150.anIntArray382[local12]];
			@Pc(29) int local29 = (Static150.anIntArray382[local12] << 14) + 536870912;
			if (local20 != null && local20.method2479() && local20.aClass1_Sub1_Sub15_1.aBoolean166 == arg0 && local20.aClass1_Sub1_Sub15_1.method2591()) {
				@Pc(50) int local50 = local20.anInt3579 >> 7;
				@Pc(55) int local55 = local20.anInt3558 >> 7;
				if (local50 >= 0 && local50 < 104 && local55 >= 0 && local55 < 104) {
					if (local20.anInt3591 == 1 && (local20.anInt3579 & 0x7F) == 64 && (local20.anInt3558 & 0x7F) == 64) {
						if (Static157.anIntArrayArray123[local50][local55] == Static152.anInt4188) {
							continue;
						}
						Static157.anIntArrayArray123[local50][local55] = Static152.anInt4188;
					}
					if (!local20.aClass1_Sub1_Sub15_1.aBoolean163) {
						local29 += Integer.MIN_VALUE;
					}
					Static87.aClass68_1.method2656(Static9.anInt295, local20.anInt3579, local20.anInt3558, Static34.method728(Static9.anInt295, local20.anInt3591 * 64 + local20.anInt3558 - 64, (local20.anInt3591 + -1) * 64 + local20.anInt3579), local20.anInt3591 * 64 + 60 - 64, local20, local20.anInt3576, local29, local20.aBoolean155);
				}
			}
		}
	}
}
