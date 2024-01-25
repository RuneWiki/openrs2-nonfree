import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!fba", name = "g", descriptor = "Lclient!qja;")
	public static Class26 aClass26_2;

	@OriginalMember(owner = "client!fba", name = "j", descriptor = "D")
	public static double aDouble7;

	@OriginalMember(owner = "client!fba", name = "k", descriptor = "I")
	public static int anInt3014;

	@OriginalMember(owner = "client!fba", name = "f", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_60 = new Class44(108, 0);

	@OriginalMember(owner = "client!fba", name = "i", descriptor = "Lclient!fba;")
	public static final Class100 aClass100_46 = new Class100(61, 16);

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(BII[Ljava/lang/String;)Ljava/lang/String;")
	public static String method2448(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String[] arg2) {
		if (arg0 == 0) {
			return "";
		} else if (arg0 == 1) {
			@Pc(19) String local19 = arg2[arg1];
			return local19 == null ? "null" : local19.toString();
		} else {
			@Pc(30) int local30 = arg0 + arg1;
			@Pc(32) int local32 = 0;
			for (@Pc(34) int local34 = arg1; local34 < local30; local34++) {
				@Pc(40) String local40 = arg2[local34];
				if (local40 == null) {
					local32 += 4;
				} else {
					local32 += local40.length();
				}
			}
			@Pc(72) StringBuffer local72 = new StringBuffer(local32);
			for (@Pc(74) int local74 = arg1; local74 < local30; local74++) {
				@Pc(80) String local80 = arg2[local74];
				if (local80 == null) {
					local72.append("null");
				} else {
					local72.append(local80);
				}
			}
			return local72.toString();
		}
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(B)V")
	public static void method2450() {
		@Pc(5) Class264 local5 = Static566.aClass264_56;
		synchronized (Static566.aClass264_56) {
			Static566.aClass264_56.method6360();
		}
	}
}
