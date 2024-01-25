import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static383 {

	@OriginalMember(owner = "client!pea", name = "V", descriptor = "F")
	public static float aFloat142;

	@OriginalMember(owner = "client!pea", name = "Kd", descriptor = "Lclient!il;")
	public static Class146 aClass146_9;

	@OriginalMember(owner = "client!pea", name = "Jb", descriptor = "[I")
	public static final int[] anIntArray557 = new int[1];

	@OriginalMember(owner = "client!pea", name = "cc", descriptor = "I")
	public static int anInt6691 = 0;

	@OriginalMember(owner = "client!pea", name = "Uc", descriptor = "S")
	public static short aShort94 = 1;

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(ZIIIIZLclient!pq;)V")
	public static void method5694(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) Class251 arg3) {
		Static396.aBoolean490 = false;
		Static192.anInt3325 = arg1;
		Static140.anInt2527 = 1;
		Static74.anInt1223 = 0;
		Static466.aClass251_130 = arg3;
		Static259.anInt4237 = arg0;
		Static221.anInt3764 = Static143.aClass6_Sub19_Sub4_7.method7707() / arg2;
		if (Static221.anInt3764 < 1) {
			Static221.anInt3764 = 1;
		}
	}

	@OriginalMember(owner = "client!pea", name = "r", descriptor = "(I)V")
	public static void method5698() {
		if (Static176.aClass121_5 == null) {
			return;
		}
		Static78.aClass249_1.method5818();
		Static121.method1820();
		Static260.method3646();
		Static293.method4105();
		Static68.method884();
		Static265.method3758();
		if (Static285.aClass89_1 != null) {
			Static285.aClass89_1.method1811();
		}
		Static294.method4113();
		Static244.method3524();
		Static155.method2275();
		Static271.method3828();
		Static544.method7513(false);
		for (@Pc(48) int local48 = 0; local48 < 2048; local48++) {
			@Pc(54) Class29_Sub2_Sub1_Sub2 local54 = Static346.aClass29_Sub2_Sub1_Sub2Array1[local48];
			if (local54 != null) {
				local54.aClass6_Sub4_3 = null;
				for (@Pc(61) int local61 = 0; local61 < local54.aClass22Array3.length; local61++) {
					local54.aClass22Array3[local61] = null;
				}
			}
		}
		for (@Pc(82) int local82 = 0; local82 < Static505.anInt8419; local82++) {
			@Pc(89) Class29_Sub2_Sub1_Sub1 local89 = Static354.aClass6_Sub28Array1[local82].aClass29_Sub2_Sub1_Sub1_2;
			if (local89 != null) {
				for (@Pc(93) int local93 = 0; local93 < local89.aClass22Array3.length; local93++) {
					local89.aClass22Array3[local93] = null;
				}
			}
		}
		Static19.aClass34_9 = null;
		Static90.aClass34_8 = null;
		Static176.aClass121_5.method7116();
		Static176.aClass121_5 = null;
	}
}
