import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!ib", name = "q", descriptor = "Lclient!va;")
	public static Class1_Sub2_Sub21 aClass1_Sub2_Sub21_4;

	@OriginalMember(owner = "client!ib", name = "u", descriptor = "Lclient!kb;")
	public static Class83 aClass83_70;

	@OriginalMember(owner = "client!ib", name = "x", descriptor = "Lclient!ok;")
	public static Class116 aClass116_6;

	@OriginalMember(owner = "client!ib", name = "r", descriptor = "I")
	public static int anInt2372 = 0;

	@OriginalMember(owner = "client!ib", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString76 = "wishes to trade with you.";

	@OriginalMember(owner = "client!ib", name = "w", descriptor = "J")
	public static long aLong83 = 0L;

	@OriginalMember(owner = "client!ib", name = "B", descriptor = "I")
	public static int anInt2378 = 0;

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(BI)V")
	public static void method1785() {
		Static178.aClass155_34.method4364(5);
		Static18.aClass155_5.method4364(5);
		Static41.aClass155_9.method4364(5);
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IZI)Z")
	public static boolean method1787(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 11) {
			arg1 = 10;
		}
		@Pc(17) Class30 local17 = Static268.method4511(arg0);
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		return local17.method676(arg1);
	}
}
