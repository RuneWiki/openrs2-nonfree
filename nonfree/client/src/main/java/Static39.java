import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!cj", name = "r", descriptor = "I")
	public static int anInt977;

	@OriginalMember(owner = "client!cj", name = "s", descriptor = "Lclient!mo;")
	public static Class143 aClass143_25;

	@OriginalMember(owner = "client!cj", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString39 = "Take";

	@OriginalMember(owner = "client!cj", name = "q", descriptor = "I")
	public static int anInt976 = 1;

	@OriginalMember(owner = "client!cj", name = "t", descriptor = "Ljava/lang/String;")
	public static String aString40 = "Select";

	@OriginalMember(owner = "client!cj", name = "u", descriptor = "[Lclient!ll;")
	public static final Class129[] aClass129Array1 = new Class129[16];

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(BII[Ljava/lang/String;)Ljava/lang/String;")
	public static String method982(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String[] arg2) {
		if (arg1 == 0) {
			return "";
		} else if (arg1 == 1) {
			@Pc(24) String local24 = arg2[arg0];
			return local24 == null ? "null" : local24.toString();
		} else {
			@Pc(36) int local36 = arg1 + arg0;
			@Pc(38) int local38 = 0;
			for (@Pc(40) int local40 = arg0; local40 < local36; local40++) {
				@Pc(46) String local46 = arg2[local40];
				if (local46 == null) {
					local38 += 4;
				} else {
					local38 += local46.length();
				}
			}
			@Pc(65) StringBuffer local65 = new StringBuffer(local38);
			for (@Pc(67) int local67 = arg0; local67 < local36; local67++) {
				@Pc(73) String local73 = arg2[local67];
				if (local73 == null) {
					local65.append("null");
				} else {
					local65.append(local73);
				}
			}
			return local65.toString();
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(II)V")
	public static void method983(@OriginalArg(1) int arg0) {
		Static80.anInt1922 = arg0;
		Static256.aClass11_110.method213();
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(I[S)[S")
	public static short[] method984(@OriginalArg(1) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(11) short[] local11 = new short[arg0.length];
			Static358.method765(arg0, 0, local11, 0, arg0.length);
			return local11;
		}
	}
}
