import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static394 {

	@OriginalMember(owner = "client!nea", name = "j", descriptor = "F")
	public static float aFloat123;

	@OriginalMember(owner = "client!nea", name = "b", descriptor = "Z")
	public static final boolean aBoolean452 = false;

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(II)I")
	public static int method5495(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(BIJ)Ljava/lang/String;")
	public static String method5498(@OriginalArg(1) int arg0, @OriginalArg(2) long arg1) {
		Static593.method7811(arg1);
		@Pc(15) int local15 = Static387.aCalendar2.get(5);
		@Pc(19) int local19 = Static387.aCalendar2.get(2);
		@Pc(23) int local23 = Static387.aCalendar2.get(1);
		return arg0 == 3 ? Static426.method5890(arg1, arg0) : Integer.toString(local15 / 10) + local15 % 10 + "-" + Static262.aStringArrayArray1[arg0][local19] + "-" + local23;
	}
}
