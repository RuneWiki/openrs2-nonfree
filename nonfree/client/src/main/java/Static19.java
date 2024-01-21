import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "J")
	public static long aLong19;

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "Lclient!ea;")
	public static Class18 aClass18_172 = Static8.method128("RuneScape wurde aktualisiert(Q");

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "Lclient!ea;")
	public static Class18 aClass18_173 = Static8.method128("Spieler kann nicht gefunden werden: ");

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "Lclient!ea;")
	private static Class18 aClass18_174 = Static8.method128("button near the top of that page)3");

	@OriginalMember(owner = "client!cb", name = "f", descriptor = "Lclient!ea;")
	private static Class18 aClass18_175 = Static8.method128("Loading)3)3)3");

	@OriginalMember(owner = "client!cb", name = "i", descriptor = "I")
	public static int anInt565 = 0;

	@OriginalMember(owner = "client!cb", name = "j", descriptor = "Lclient!ea;")
	public static Class18 aClass18_176 = aClass18_174;

	@OriginalMember(owner = "client!cb", name = "l", descriptor = "I")
	public static int anInt567 = 0;

	@OriginalMember(owner = "client!cb", name = "m", descriptor = "Lclient!ea;")
	public static Class18 aClass18_177 = aClass18_175;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "([IZII)I")
	public static int method346(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return arg1 * arg0[1] + arg0[0] * arg2;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!bc;Z)V")
	public static void method347(@OriginalArg(0) Class1_Sub5 arg0) {
		if (arg0.aClass1_Sub13_5 != null) {
			arg0.aClass1_Sub13_5.anInt2077 = 0;
		}
		arg0.aBoolean79 = false;
		for (@Pc(18) Class1_Sub5 local18 = arg0.method1318(); local18 != null; local18 = arg0.method1314()) {
			method347(local18);
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V")
	public static void method348() {
		aClass18_172 = null;
		aClass18_175 = null;
		aClass18_174 = null;
		aClass18_173 = null;
		aClass18_177 = null;
		aClass18_176 = null;
	}
}
