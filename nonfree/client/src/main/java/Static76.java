import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!fc", name = "F", descriptor = "I")
	public static int anInt1447 = 128;

	@OriginalMember(owner = "client!fc", name = "G", descriptor = "Z")
	public static boolean aBoolean127 = true;

	@OriginalMember(owner = "client!fc", name = "H", descriptor = "[I")
	public static int[] anIntArray141 = new int[4096];

	@OriginalMember(owner = "client!fc", name = "I", descriptor = "I")
	public static int anInt1448 = -1;

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "(I)V")
	public static void method1200() {
		Static306.method4921(false);
		System.gc();
		Static264.method4398(25);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "([Ljava/lang/String;III)Ljava/lang/String;")
	public static String method1201(@OriginalArg(0) String[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 0) {
			return "";
		} else if (arg2 == 1) {
			@Pc(19) String local19 = arg0[arg1];
			return local19 == null ? "null" : local19.toString();
		} else {
			@Pc(30) int local30 = arg2 + arg1;
			@Pc(32) int local32 = 0;
			for (@Pc(34) int local34 = arg1; local34 < local30; local34++) {
				@Pc(46) String local46 = arg0[local34];
				if (local46 == null) {
					local32 += 4;
				} else {
					local32 += local46.length();
				}
			}
			@Pc(64) StringBuffer local64 = new StringBuffer(local32);
			for (@Pc(66) int local66 = arg1; local66 < local30; local66++) {
				@Pc(77) String local77 = arg0[local66];
				if (local77 == null) {
					local64.append("null");
				} else {
					local64.append(local77);
				}
			}
			return local64.toString();
		}
	}

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "(I)V")
	public static void method1203() {
		Static155.aClass98_22.method2571();
		Static53.aClass98_48.method2571();
	}
}
