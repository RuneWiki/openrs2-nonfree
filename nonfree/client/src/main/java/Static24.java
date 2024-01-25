import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!bb", name = "x", descriptor = "Lclient!pc;")
	public static Class196 aClass196_1;

	@OriginalMember(owner = "client!bb", name = "y", descriptor = "I")
	public static int anInt373;

	@OriginalMember(owner = "client!bb", name = "u", descriptor = "Lclient!dq;")
	public static final Class56 aClass56_25 = new Class56(96, 8);

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(B[I)Ljava/lang/String;")
	public static String method335(@OriginalArg(1) int[] arg0) {
		@Pc(14) StringBuffer local14 = new StringBuffer();
		@Pc(16) int local16 = Static37.anInt612;
		for (@Pc(18) int local18 = 0; local18 < arg0.length; local18++) {
			@Pc(27) Class82 local27 = Static378.aClass94_4.method1763(arg0[local18]);
			if (local27.anInt2101 != -1) {
				@Pc(41) Class95 local41 = (Class95) Static271.aClass137_48.method2744((long) local27.anInt2101);
				if (local41 == null) {
					@Pc(49) Class216 local49 = Static465.method4465(Static13.aClass211_11, local27.anInt2101, 0);
					if (local49 != null) {
						local41 = Static39.aClass135_1.method5379(local49);
						Static271.aClass137_48.method2732((long) local27.anInt2101, local41);
					}
				}
				if (local41 != null) {
					Static243.aClass95Array8[local16] = local41;
					local14.append(" <img=").append(local16).append(">");
					local16++;
				}
			}
		}
		return local14.toString();
	}
}
