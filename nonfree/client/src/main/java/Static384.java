import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static384 {

	@OriginalMember(owner = "client!tl", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString58;

	@OriginalMember(owner = "client!tl", name = "g", descriptor = "[Z")
	public static boolean[] aBooleanArray25;

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "Lclient!sa;")
	public static final Class6_Sub36 aClass6_Sub36_1 = new Class6_Sub36(0, 0);

	@OriginalMember(owner = "client!tl", name = "c", descriptor = "Lclient!wt;")
	public static final Class267 aClass267_91 = new Class267("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para cá");

	@OriginalMember(owner = "client!tl", name = "d", descriptor = "I")
	public static int anInt6848 = 13156520;

	@OriginalMember(owner = "client!tl", name = "e", descriptor = "I")
	public static int anInt6849 = 0;

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIIIII)V")
	public static void method5694(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static413.anInt7423 = arg2;
		Static106.anInt2294 = arg1;
		Static159.anInt5733 = arg3;
		Static405.anInt7262 = arg4;
		Static345.anInt6218 = arg0;
		if (Static405.anInt7262 >= 100) {
			@Pc(28) int local28 = Static345.anInt6218 * 128 + 64;
			@Pc(34) int local34 = Static106.anInt2294 * 128 + 64;
			@Pc(43) int local43 = Static221.method3331(Static388.anInt6870, local34, local28) - Static159.anInt5733;
			@Pc(48) int local48 = local28 - Static157.anInt3220;
			@Pc(53) int local53 = local43 - Static367.anInt6653;
			@Pc(58) int local58 = local34 - Static229.anInt4187;
			@Pc(69) int local69 = (int) Math.sqrt((double) (local48 * local48 + local58 * local58));
			Static328.anInt5668 = (int) (Math.atan2((double) local53, (double) local69) * 2607.5945876176133D) & 0x3FFF;
			Static260.anInt4728 = (int) (-2607.5945876176133D * Math.atan2((double) local48, (double) local58)) & 0x3FFF;
			Static251.anInt6446 = 0;
			if (Static328.anInt5668 < 1024) {
				Static328.anInt5668 = 1024;
			}
			if (Static328.anInt5668 > 3072) {
				Static328.anInt5668 = 3072;
			}
		}
		Static429.anInt7656 = 2;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lclient!jo;)V")
	public static void method5696(@OriginalArg(0) Class3_Sub2 arg0) {
		for (@Pc(2) int local2 = arg0.aShort101; local2 <= arg0.aShort100; local2++) {
			for (@Pc(6) int local6 = arg0.aShort102; local6 <= arg0.aShort99; local6++) {
				@Pc(16) Class101 local16 = Static409.aClass101ArrayArrayArray3[arg0.aByte103][local2][local6];
				if (local16 != null) {
					@Pc(21) Class145 local21 = local16.aClass145_1;
					@Pc(23) Class145 local23 = null;
					while (local21 != null) {
						if (local21.aClass3_Sub2_2 == arg0) {
							if (local23 == null) {
								local16.aClass145_1 = local21.aClass145_2;
							} else {
								local23.aClass145_2 = local21.aClass145_2;
							}
							local21.method3260();
							break;
						}
						local23 = local21;
						local21 = local21.aClass145_2;
					}
					local16.aByte41 = 0;
					for (@Pc(56) Class145 local56 = local16.aClass145_1; local56 != null; local56 = local56.aClass145_2) {
						local16.aByte41 = (byte) (local16.aByte41 | local56.anInt3942);
					}
				}
			}
		}
	}
}
