import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static332 {

	@OriginalMember(owner = "client!qr", name = "i", descriptor = "F")
	public static float aFloat158;

	@OriginalMember(owner = "client!qr", name = "e", descriptor = "Lclient!aa;")
	public static final Class2 aClass2_88 = new Class2(7, 4);

	@OriginalMember(owner = "client!qr", name = "g", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray46 = new String[100];

	@OriginalMember(owner = "client!qr", name = "h", descriptor = "Lclient!uv;")
	public static final Class253 aClass253_119 = new Class253(76, 2);

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "([Ljava/lang/String;ZII)Ljava/lang/String;")
	public static String method4371(@OriginalArg(0) String[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 0) {
			return "";
		} else if (arg1 == 1) {
			@Pc(19) String local19 = arg0[arg2];
			return local19 == null ? "null" : local19.toString();
		} else {
			@Pc(30) int local30 = arg2 + arg1;
			@Pc(37) int local37 = 0;
			for (@Pc(39) int local39 = arg2; local39 < local30; local39++) {
				@Pc(45) String local45 = arg0[local39];
				if (local45 == null) {
					local37 += 4;
				} else {
					local37 += local45.length();
				}
			}
			@Pc(64) StringBuffer local64 = new StringBuffer(local37);
			for (@Pc(66) int local66 = arg2; local66 < local30; local66++) {
				@Pc(72) String local72 = arg0[local66];
				if (local72 == null) {
					local64.append("null");
				} else {
					local64.append(local72);
				}
			}
			return local64.toString();
		}
	}
}
