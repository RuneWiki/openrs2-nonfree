import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static295 {

	@OriginalMember(owner = "client!wh", name = "G", descriptor = "I")
	public static int anInt5859;

	@OriginalMember(owner = "client!wh", name = "H", descriptor = "[I")
	public static int[] anIntArray690;

	@OriginalMember(owner = "client!wh", name = "K", descriptor = "[I")
	public static int[] anIntArray691;

	@OriginalMember(owner = "client!wh", name = "F", descriptor = "J")
	public static long aLong198 = 0L;

	@OriginalMember(owner = "client!wh", name = "I", descriptor = "Z")
	public static boolean aBoolean448 = false;

	@OriginalMember(owner = "client!wh", name = "L", descriptor = "Ljava/lang/String;")
	public static String aString192 = "glow3:";

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(III)Lclient!oa;")
	public static Class124 method4512(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub19 local7 = Static130.aClass1_Sub19ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt2570; local13++) {
			@Pc(22) Class124 local22 = local7.aClass124Array2[local13];
			if ((local22.aLong114 >> 29 & 0x3L) == 2L && local22.anInt3416 == arg1 && local22.anInt3411 == arg2) {
				Static166.method2528(local22);
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(III)V")
	public static void method4513() {
		for (@Pc(1) int local1 = 0; local1 < Static158.anInt2965; local1++) {
			for (@Pc(6) int local6 = 0; local6 < Static44.anInt996; local6++) {
				for (@Pc(11) int local11 = 0; local11 < Static14.anInt369; local11++) {
					@Pc(22) Class1_Sub19 local22 = Static130.aClass1_Sub19ArrayArrayArray1[local1][local6][local11];
					if (local22 != null) {
						@Pc(27) Class125 local27 = local22.aClass125_1;
						if (local27 != null && local27.aClass6_8.method3835()) {
							Static258.method4004(local27.aClass6_8, local1, local6, local11, 1, 1);
							if (local27.aClass6_7 != null && local27.aClass6_7.method3835()) {
								Static258.method4004(local27.aClass6_7, local1, local6, local11, 1, 1);
								local27.aClass6_8.method3840(local27.aClass6_7, 0, 0, 0, false);
								local27.aClass6_7 = local27.aClass6_7.method3834();
							}
							local27.aClass6_8 = local27.aClass6_8.method3834();
						}
						for (@Pc(83) int local83 = 0; local83 < local22.anInt2570; local83++) {
							@Pc(92) Class124 local92 = local22.aClass124Array2[local83];
							if (local92 != null && local92.aClass6_6.method3835()) {
								Static258.method4004(local92.aClass6_6, local1, local6, local11, local92.anInt3401 + 1 - local92.anInt3416, local92.anInt3406 - local92.anInt3411 + 1);
								local92.aClass6_6 = local92.aClass6_6.method3834();
							}
						}
						@Pc(131) Class167 local131 = local22.aClass167_1;
						if (local131 != null && local131.aClass6_9.method3835()) {
							Static210.method3345(local131.aClass6_9, local1, local6, local11);
							local131.aClass6_9 = local131.aClass6_9.method3834();
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)I")
	public static int method4514(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!wh", name = "e", descriptor = "(I)V")
	public static void method4516() {
		if (Static214.aBoolean322) {
			return;
		}
		Static214.aBoolean322 = true;
		if (Static290.aBoolean436) {
			Static152.aFloat81 = (int) Static152.aFloat81 - 17 & 0xFFFFFFF0;
		} else {
			Static70.aFloat38 += (-Static70.aFloat38 - 12.0F) / 2.0F;
		}
		Static45.aBoolean87 = true;
	}
}
