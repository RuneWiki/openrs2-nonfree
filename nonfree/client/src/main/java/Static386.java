import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static386 {

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "I")
	public static int anInt6457;

	@OriginalMember(owner = "client!tp", name = "g", descriptor = "I")
	public static int anInt6463;

	@OriginalMember(owner = "client!tp", name = "i", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray12;

	@OriginalMember(owner = "client!tp", name = "l", descriptor = "I")
	public static int anInt6467 = 0;

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(Lclient!od;[[BZ)V")
	public static void method5101(@OriginalArg(0) Class23_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.anInt5076; local7++) {
			Static112.method2026();
			for (@Pc(13) int local13 = 0; local13 < Static229.anInt4427 >> 3; local13++) {
				for (@Pc(17) int local17 = 0; local17 < Static379.anInt6422 >> 3; local17++) {
					@Pc(27) int local27 = Static393.anIntArrayArrayArray13[local7][local13][local17];
					if (local27 != -1) {
						@Pc(37) int local37 = local27 >> 24 & 0x3;
						if (!arg0.aBoolean378 || local37 == 0) {
							@Pc(48) int local48 = local27 >> 1 & 0x3;
							@Pc(54) int local54 = local27 >> 14 & 0x3FF;
							@Pc(60) int local60 = local27 >> 3 & 0x7FF;
							@Pc(70) int local70 = local60 / 8 + (local54 / 8 << 8);
							for (@Pc(72) int local72 = 0; local72 < Static334.anIntArray494.length; local72++) {
								if (local70 == Static334.anIntArray494[local72] && arg1[local72] != null) {
									arg0.method4084(local13 * 8, local37, arg1[local72], local17 * 8, Static194.aClass70Array1, local48, local7, (local54 & 0x7) * 8, Static33.aClass49_1, (local60 & 0x7) * 8);
									break;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(ZI)V")
	public static void method5102(@OriginalArg(0) boolean arg0) {
		for (@Pc(13) Class2_Sub24 local13 = (Class2_Sub24) Static72.aClass14_7.method309(); local13 != null; local13 = (Class2_Sub24) Static72.aClass14_7.method311()) {
			if (local13.aClass2_Sub3_Sub3_2 != null) {
				Static260.aClass2_Sub3_Sub1_2.method1826(local13.aClass2_Sub3_Sub3_2);
				local13.aClass2_Sub3_Sub3_2 = null;
			}
			if (local13.aClass2_Sub3_Sub3_1 != null) {
				Static260.aClass2_Sub3_Sub1_2.method1826(local13.aClass2_Sub3_Sub3_1);
				local13.aClass2_Sub3_Sub3_1 = null;
			}
			local13.method5866();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(56) Class2_Sub24 local56 = (Class2_Sub24) Static446.aClass14_49.method309(); local56 != null; local56 = (Class2_Sub24) Static446.aClass14_49.method311()) {
			if (local56.aClass2_Sub3_Sub3_2 != null) {
				Static260.aClass2_Sub3_Sub1_2.method1826(local56.aClass2_Sub3_Sub3_2);
				local56.aClass2_Sub3_Sub3_2 = null;
			}
			local56.method5866();
		}
		for (@Pc(83) Class2_Sub24 local83 = (Class2_Sub24) Static216.aClass163_38.method3771(); local83 != null; local83 = (Class2_Sub24) Static216.aClass163_38.method3770()) {
			if (local83.aClass2_Sub3_Sub3_2 != null) {
				Static260.aClass2_Sub3_Sub1_2.method1826(local83.aClass2_Sub3_Sub3_2);
				local83.aClass2_Sub3_Sub3_2 = null;
			}
			local83.method5866();
		}
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method5103(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = Static129.method2210(arg0.charAt(local12)) + (local10 << 5) - local10;
		}
		return local10;
	}
}
