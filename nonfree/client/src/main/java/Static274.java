import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static274 {

	@OriginalMember(owner = "client!vb", name = "v", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray14;

	@OriginalMember(owner = "client!vb", name = "z", descriptor = "I")
	public static int anInt5699;

	@OriginalMember(owner = "client!vb", name = "D", descriptor = "I")
	public static int anInt5700;

	@OriginalMember(owner = "client!vb", name = "W", descriptor = "[[I")
	public static int[][] anIntArrayArray50;

	@OriginalMember(owner = "client!vb", name = "t", descriptor = "[Lclient!bd;")
	public static Class15[] aClass15Array3 = new Class15[14];

	@OriginalMember(owner = "client!vb", name = "w", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray32 = new String[100];

	@OriginalMember(owner = "client!vb", name = "K", descriptor = "I")
	public static int anInt5705 = 0;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(BII)Z")
	public static boolean method4578(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!Static299.aBoolean203) {
			return false;
		}
		@Pc(21) int local21 = arg0 >> 16;
		@Pc(25) int local25 = arg0 & 0xFFFF;
		if (Static219.aClass115ArrayArray1[local21] == null || Static219.aClass115ArrayArray1[local21][local25] == null) {
			return false;
		}
		@Pc(45) Class115 local45 = Static219.aClass115ArrayArray1[local21][local25];
		@Pc(54) int local54;
		if (arg1 == -1 && local45.anInt3538 == 0) {
			for (local54 = 0; local54 < Static216.anInt4481; local54++) {
				if (Static289.aShortArray93[local54] == 34 || Static289.aShortArray93[local54] == 1007 || Static289.aShortArray93[local54] == 31 || Static289.aShortArray93[local54] == 29 || Static289.aShortArray93[local54] == 51) {
					for (@Pc(157) Class115 local157 = Static90.method1692(Static55.anIntArray97[local54]); local157 != null; local157 = Static15.method321(local157)) {
						if (local157.anInt3552 == local45.anInt3552) {
							return true;
						}
					}
				}
			}
		} else {
			for (local54 = 0; local54 < Static216.anInt4481; local54++) {
				if (arg1 == Static163.anIntArray262[local54] && Static55.anIntArray97[local54] == local45.anInt3552 && (Static289.aShortArray93[local54] == 34 || Static289.aShortArray93[local54] == 1007 || Static289.aShortArray93[local54] == 31 || Static289.aShortArray93[local54] == 29 || Static289.aShortArray93[local54] == 51)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "(I)V")
	public static void method4580(@OriginalArg(0) int arg0) {
		Static14.anInt348 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static26.anInt552; local3++) {
			for (@Pc(8) int local8 = 0; local8 < Static232.anInt4787; local8++) {
				if (Static180.aClass2_Sub31ArrayArrayArray2[arg0][local3][local8] == null) {
					Static180.aClass2_Sub31ArrayArrayArray2[arg0][local3][local8] = new Class2_Sub31(arg0, local3, local8);
				}
			}
		}
	}

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "(I)V")
	public static void method4581() {
		@Pc(6) Class2_Sub23 local6;
		for (local6 = (Class2_Sub23) Static238.aClass1_24.method13(); local6 != null; local6 = (Class2_Sub23) Static238.aClass1_24.method9()) {
			if (local6.aBoolean391) {
				local6.method3753();
			}
		}
		for (local6 = (Class2_Sub23) Static143.aClass1_12.method13(); local6 != null; local6 = (Class2_Sub23) Static143.aClass1_12.method9()) {
			if (local6.aBoolean391) {
				local6.method3753();
			}
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)I")
	public static int method4582(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}
}
