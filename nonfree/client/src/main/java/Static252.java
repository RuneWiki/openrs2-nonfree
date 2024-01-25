import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static252 {

	@OriginalMember(owner = "client!ika", name = "f", descriptor = "I")
	public static int anInt4008;

	@OriginalMember(owner = "client!ika", name = "c", descriptor = "Lclient!ke;")
	public static final Class196 aClass196_146 = new Class196(97, 6);

	@OriginalMember(owner = "client!ika", name = "e", descriptor = "Lclient!ke;")
	public static final Class196 aClass196_147 = new Class196(118, 6);

	@OriginalMember(owner = "client!ika", name = "g", descriptor = "I")
	public static int anInt4009 = 0;

	@OriginalMember(owner = "client!ika", name = "a", descriptor = "(II)V")
	public static void method3528(@OriginalArg(0) int arg0) {
		@Pc(17) Class5_Sub2_Sub4 local17 = Static257.method3597(1, (long) arg0);
		local17.method2440();
	}

	@OriginalMember(owner = "client!ika", name = "a", descriptor = "(I)I")
	public static int method3530() {
		return Static77.anInt1200++;
	}

	@OriginalMember(owner = "client!ika", name = "a", descriptor = "(I[Ljava/lang/String;IZ)Ljava/lang/String;")
	public static String method3531(@OriginalArg(0) int arg0, @OriginalArg(1) String[] arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			return "";
		} else if (arg0 == 1) {
			@Pc(17) String local17 = arg1[arg2];
			return local17 == null ? "null" : local17.toString();
		} else {
			@Pc(28) int local28 = arg0 + arg2;
			@Pc(30) int local30 = 0;
			for (@Pc(32) int local32 = arg2; local32 < local28; local32++) {
				@Pc(37) String local37 = arg1[local32];
				if (local37 == null) {
					local30 += 4;
				} else {
					local30 += local37.length();
				}
			}
			@Pc(64) StringBuffer local64 = new StringBuffer(local30);
			for (@Pc(66) int local66 = arg2; local66 < local28; local66++) {
				@Pc(71) String local71 = arg1[local66];
				if (local71 == null) {
					local64.append("null");
				} else {
					local64.append(local71);
				}
			}
			return local64.toString();
		}
	}
}
