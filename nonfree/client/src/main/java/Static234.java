import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static234 {

	@OriginalMember(owner = "client!s", name = "d", descriptor = "I")
	public static int anInt5157;

	@OriginalMember(owner = "client!s", name = "e", descriptor = "I")
	public static int anInt5158;

	@OriginalMember(owner = "client!s", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString162 = "";

	@OriginalMember(owner = "client!s", name = "c", descriptor = "Lclient!qg;")
	public static Class131 aClass131_16 = new Class131();

	@OriginalMember(owner = "client!s", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString163 = "rating: ";

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method4061(@OriginalArg(1) String arg0) {
		System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
		System.exit(1);
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(III)Lclient!ql;")
	public static Class133 method4063(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub14 local7 = Static132.aClass1_Sub14ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass133_1;
	}
}
