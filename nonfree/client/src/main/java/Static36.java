import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!ga", name = "Z", descriptor = "Lclient!ue;")
	public static Class4_Sub4_Sub5_Sub4 aClass4_Sub4_Sub5_Sub4_3;

	@OriginalMember(owner = "client!ga", name = "Mb", descriptor = "I")
	public static int anInt1035;

	@OriginalMember(owner = "client!ga", name = "Y", descriptor = "I")
	public static int anInt1011 = 0;

	@OriginalMember(owner = "client!ga", name = "db", descriptor = "Lclient!v;")
	private static Class76 aClass76_434 = Static134.method2017("Continue");

	@OriginalMember(owner = "client!ga", name = "jb", descriptor = "Lclient!v;")
	public static Class76 aClass76_435 = Static134.method2017("-5berpr-Ufen Sie Ihr Mitteilungsfach)3");

	@OriginalMember(owner = "client!ga", name = "kb", descriptor = "I")
	public static int anInt1017 = 1;

	@OriginalMember(owner = "client!ga", name = "ob", descriptor = "J")
	public static long aLong37 = 0L;

	@OriginalMember(owner = "client!ga", name = "pb", descriptor = "I")
	public static int anInt1021 = 127;

	@OriginalMember(owner = "client!ga", name = "sb", descriptor = "Lclient!v;")
	public static Class76 aClass76_436 = aClass76_434;

	@OriginalMember(owner = "client!ga", name = "zb", descriptor = "Lclient!v;")
	public static Class76 aClass76_437 = Static134.method2017("::gc");

	@OriginalMember(owner = "client!ga", name = "Eb", descriptor = "I")
	public static int anInt1031 = 1;

	@OriginalMember(owner = "client!ga", name = "Nb", descriptor = "Lclient!v;")
	public static Class76 aClass76_438 = Static134.method2017("null");

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(Z)V")
	public static void method653() {
		aClass76_437 = null;
		aClass4_Sub4_Sub5_Sub4_3 = null;
		aClass76_436 = null;
		aClass76_438 = null;
		aClass76_434 = null;
		aClass76_435 = null;
	}

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "(B)V")
	public static void method654() {
		Static24.aClass4_Sub10_Sub1_1.method613();
		@Pc(13) int local13 = Static24.aClass4_Sub10_Sub1_1.method608(8);
		@Pc(22) int local22;
		if (Static76.anInt1935 > local13) {
			for (local22 = local13; local22 < Static76.anInt1935; local22++) {
				Static88.anIntArray290[Static104.anInt2333++] = Static47.anIntArray153[local22];
			}
		}
		if (Static76.anInt1935 < local13) {
			throw new RuntimeException("gnpov1");
		}
		Static76.anInt1935 = 0;
		for (local22 = 0; local22 < local13; local22++) {
			@Pc(60) int local60 = Static47.anIntArray153[local22];
			@Pc(64) Class4_Sub4_Sub3_Sub1_Sub1 local64 = Static29.aClass4_Sub4_Sub3_Sub1_Sub1Array1[local60];
			@Pc(69) int local69 = Static24.aClass4_Sub10_Sub1_1.method608(1);
			if (local69 == 0) {
				Static47.anIntArray153[Static76.anInt1935++] = local60;
				local64.anInt1391 = Static78.anInt1981;
			} else {
				@Pc(92) int local92 = Static24.aClass4_Sub10_Sub1_1.method608(2);
				if (local92 == 0) {
					Static47.anIntArray153[Static76.anInt1935++] = local60;
					local64.anInt1391 = Static78.anInt1981;
					Static60.anIntArray201[Static48.anInt1228++] = local60;
				} else {
					@Pc(134) int local134;
					@Pc(144) int local144;
					if (local92 == 1) {
						Static47.anIntArray153[Static76.anInt1935++] = local60;
						local64.anInt1391 = Static78.anInt1981;
						local134 = Static24.aClass4_Sub10_Sub1_1.method608(3);
						local64.method973(local134, false);
						local144 = Static24.aClass4_Sub10_Sub1_1.method608(1);
						if (local144 == 1) {
							Static60.anIntArray201[Static48.anInt1228++] = local60;
						}
					} else if (local92 == 2) {
						Static47.anIntArray153[Static76.anInt1935++] = local60;
						local64.anInt1391 = Static78.anInt1981;
						local134 = Static24.aClass4_Sub10_Sub1_1.method608(3);
						local64.method973(local134, true);
						local144 = Static24.aClass4_Sub10_Sub1_1.method608(3);
						local64.method973(local144, true);
						@Pc(200) int local200 = Static24.aClass4_Sub10_Sub1_1.method608(1);
						if (local200 == 1) {
							Static60.anIntArray201[Static48.anInt1228++] = local60;
						}
					} else if (local92 == 3) {
						Static88.anIntArray290[Static104.anInt2333++] = local60;
					}
				}
			}
		}
	}
}
