import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "[[S")
	public static short[][] aShortArrayArray5;

	@OriginalMember(owner = "client!rb", name = "f", descriptor = "[Lclient!r;")
	public static Class61[] aClass61Array17;

	@OriginalMember(owner = "client!rb", name = "m", descriptor = "Lclient!gf;")
	public static Class30 aClass30_11;

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "I")
	public static int anInt2696 = 0;

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "I")
	public static final int anInt2697 = 2301979;

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "Lclient!r;")
	private static Class61 aClass61_798 = Static129.method2060("Please wait)3)3)3");

	@OriginalMember(owner = "client!rb", name = "e", descriptor = "Lclient!r;")
	public static Class61 aClass61_799 = aClass61_798;

	@OriginalMember(owner = "client!rb", name = "h", descriptor = "Lclient!r;")
	public static Class61 aClass61_800 = Static129.method2060("<col=ff3000>");

	@OriginalMember(owner = "client!rb", name = "i", descriptor = "Lclient!r;")
	public static Class61 aClass61_801 = Static129.method2060("Weiter");

	@OriginalMember(owner = "client!rb", name = "j", descriptor = "Z")
	public static boolean aBoolean98 = false;

	@OriginalMember(owner = "client!rb", name = "l", descriptor = "I")
	public static int anInt2700 = 0;

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!ke;II)Lclient!r;")
	public static Class61 method1740(@OriginalArg(0) Class5_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (!Static114.method1871(arg1, Static42.method755(arg0)) && arg0.anObjectArray15 == null) {
			return null;
		} else if (arg0.aClass61Array9 == null || arg1 >= arg0.aClass61Array9.length || arg0.aClass61Array9[arg1] == null || arg0.aClass61Array9[arg1].method1716().method1733() == 0) {
			return Static30.aBoolean26 ? Static123.method1929(new Class61[] { Static125.aClass61_992, Static39.method730(arg1) }) : null;
		} else {
			return arg0.aClass61Array9[arg1];
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V")
	public static void method1741() {
		aClass61Array17 = null;
		aClass61_801 = null;
		aClass61_798 = null;
		aClass61_799 = null;
		aClass61_800 = null;
		aClass30_11 = null;
		aShortArrayArray5 = null;
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)J")
	public static synchronized long method1742() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (local1 < Static127.aLong96) {
			Static134.aLong101 += Static127.aLong96 - local1;
		}
		Static127.aLong96 = local1;
		return local1 + Static134.aLong101;
	}
}
