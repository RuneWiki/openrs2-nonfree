import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static423 {

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
	public static int anInt7200;

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "[[B")
	public static byte[][] aByteArrayArray17;

	@OriginalMember(owner = "client!pc", name = "h", descriptor = "Lclient!cv;")
	public static Class64 aClass64_4;

	@OriginalMember(owner = "client!pc", name = "i", descriptor = "Lclient!kaa;")
	public static final Class181 aClass181_60 = new Class181(38, 2);

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IZJ)Ljava/lang/String;")
	public static String method6388(@OriginalArg(0) int arg0, @OriginalArg(2) long arg1) {
		Static170.method2647(arg1);
		@Pc(10) int local10 = Static222.aCalendar1.get(5);
		@Pc(22) int local22 = Static222.aCalendar1.get(2);
		@Pc(26) int local26 = Static222.aCalendar1.get(1);
		@Pc(30) int local30 = Static222.aCalendar1.get(11);
		@Pc(34) int local34 = Static222.aCalendar1.get(12);
		return arg0 == 3 ? Static324.method5028(arg0, arg1) : Integer.toString(local10 / 10) + local10 % 10 + "-" + Static170.aStringArrayArray1[arg0][local22] + "-" + local26 + " " + local30 / 10 + local30 % 10 + ":" + local34 / 10 + local34 % 10;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILclient!wd;I)V")
	public static void method6389(@OriginalArg(1) Class5_Sub12_Sub2 arg0, @OriginalArg(2) int arg1) {
		Static262.aBoolean356 = false;
		Static385.anInt6764 = 0;
		Static475.method7465(arg0);
		Static22.method486(arg0);
		if (Static262.aBoolean356) {
			System.out.println("---endgpp---");
		}
		if (arg1 != arg0.anInt10154) {
			throw new RuntimeException("gpi1 pos:" + arg0.anInt10154 + " psize:" + arg1);
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(BII)Z")
	public static boolean method6390(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x70000) != 0 | Static191.method3042(arg1, arg0) || Static89.method1391(arg0, arg1);
	}
}
