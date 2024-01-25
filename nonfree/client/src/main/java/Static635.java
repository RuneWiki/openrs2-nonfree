import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static635 {

	@OriginalMember(owner = "client!wo", name = "e", descriptor = "I")
	public static int anInt10177;

	@OriginalMember(owner = "client!wo", name = "c", descriptor = "[[I")
	public static final int[][] anIntArrayArray104 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(BI)V")
	public static void method8502(@OriginalArg(1) int arg0) {
		if (Static158.anInt3597 == 0) {
			Static489.aClass2_Sub2_Sub1_4.method178(arg0);
		} else {
			Static119.anInt2867 = arg0;
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(III)Z")
	public static boolean method8503(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!Static642.aBoolean757) {
			return false;
		}
		@Pc(17) int local17 = arg0 >> 16;
		@Pc(21) int local21 = arg0 & 0xFFFF;
		if (Static399.aClass78ArrayArray1[local17] == null || Static399.aClass78ArrayArray1[local17][local21] == null) {
			return false;
		}
		@Pc(39) Class78 local39 = Static399.aClass78ArrayArray1[local17][local21];
		@Pc(50) Class2_Sub5_Sub20 local50;
		if (arg1 == -1 && local39.anInt1955 == 0) {
			for (local50 = (Class2_Sub5_Sub20) Static261.aClass238_28.method5833(); local50 != null; local50 = (Class2_Sub5_Sub20) Static261.aClass238_28.method5838()) {
				if (local50.anInt10077 == 51 || local50.anInt10077 == 1001 || local50.anInt10077 == 47 || local50.anInt10077 == 44 || local50.anInt10077 == 60) {
					for (@Pc(135) Class78 local135 = Static180.method3291(local50.anInt10073); local135 != null; local135 = Static505.method7154(local135)) {
						if (local39.anInt1968 == local135.anInt1968) {
							return true;
						}
					}
				}
			}
		} else {
			for (local50 = (Class2_Sub5_Sub20) Static261.aClass238_28.method5833(); local50 != null; local50 = (Class2_Sub5_Sub20) Static261.aClass238_28.method5838()) {
				if (local50.anInt10079 == arg1 && local50.anInt10073 == local39.anInt1968 && (local50.anInt10077 == 51 || local50.anInt10077 == 1001 || local50.anInt10077 == 47 || local50.anInt10077 == 44 || local50.anInt10077 == 60)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(ILclient!eq;)V")
	public static void method8504(@OriginalArg(1) Class97 arg0) {
		Static406.aClass97_152 = arg0;
	}
}
