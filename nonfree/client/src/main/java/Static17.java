import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!bg", name = "g", descriptor = "I")
	public static int anInt474;

	@OriginalMember(owner = "client!bg", name = "j", descriptor = "Lclient!jj;")
	public static Class88 aClass88_1;

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString35 = "Loading config - ";

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "I")
	public static int anInt470 = 0;

	@OriginalMember(owner = "client!bg", name = "e", descriptor = "I")
	public static int anInt472 = 0;

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(B)V")
	public static void method415() {
		Static7.aClass89_1.method2266();
		Static192.aClass89_28.method2266();
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lclient!hd;IIIII)V")
	public static void method416(@OriginalArg(0) Class2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != Static155.anInt3493) {
				for (@Pc(28) int local28 = local3; local28 <= local7; local28++) {
					if (local28 >= 0 && local28 < Static90.anInt2091) {
						for (@Pc(39) int local39 = local11; local39 <= local15; local39++) {
							if (local39 >= 0 && local39 < Static77.anInt1766 && (!local1 || local28 >= local7 || local39 >= local15 || local39 < arg3 && local28 != arg2)) {
								@Pc(71) Class1_Sub2 local71 = Static7.aClass1_Sub2ArrayArrayArray1[local17][local28][local39];
								if (local71 != null) {
									@Pc(158) int local158 = (Static46.anIntArrayArrayArray1[local17][local28][local39] + Static46.anIntArrayArrayArray1[local17][local28 + 1][local39] + Static46.anIntArrayArrayArray1[local17][local28][local39 + 1] + Static46.anIntArrayArrayArray1[local17][local28 + 1][local39 + 1]) / 4 - (Static46.anIntArrayArrayArray1[arg1][arg2][arg3] + Static46.anIntArrayArrayArray1[arg1][arg2 + 1][arg3] + Static46.anIntArrayArrayArray1[arg1][arg2][arg3 + 1] + Static46.anIntArrayArrayArray1[arg1][arg2 + 1][arg3 + 1]) / 4;
									@Pc(161) Class136 local161 = local71.aClass136_1;
									if (local161 != null) {
										if (local161.aClass2_10.method3946()) {
											arg0.method3949(local161.aClass2_10, (local28 - arg2) * 128 + (1 - arg4) * 64, local158, (local39 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
										if (local161.aClass2_9 != null && local161.aClass2_9.method3946()) {
											arg0.method3949(local161.aClass2_9, (local28 - arg2) * 128 + (1 - arg4) * 64, local158, (local39 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
									}
									for (@Pc(232) int local232 = 0; local232 < local71.anInt45; local232++) {
										@Pc(241) Class7 local241 = local71.aClass7Array1[local232];
										if (local241 != null && local241.aClass2_1.method3946() && (local28 == local241.anInt214 || local28 == local3) && (local39 == local241.anInt220 || local39 == local11)) {
											@Pc(270) int local270 = local241.anInt218 + 1 - local241.anInt214;
											@Pc(278) int local278 = local241.anInt212 + 1 - local241.anInt220;
											arg0.method3949(local241.aClass2_1, (local241.anInt214 - arg2) * 128 + (local270 - arg4) * 64, local158, (local241.anInt220 - arg3) * 128 + (local278 - arg5) * 64, local1);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}
}
