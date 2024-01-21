import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!sc", name = "Bb", descriptor = "[Lclient!na;")
	public static Class3_Sub2_Sub3_Sub2[] aClass3_Sub2_Sub3_Sub2Array7;

	@OriginalMember(owner = "client!sc", name = "Ib", descriptor = "Z")
	public static boolean aBoolean140;

	@OriginalMember(owner = "client!sc", name = "M", descriptor = "[J")
	public static long[] aLongArray3 = new long[100];

	@OriginalMember(owner = "client!sc", name = "mb", descriptor = "Lclient!nd;")
	public static Class59 aClass59_9 = new Class59();

	@OriginalMember(owner = "client!sc", name = "vb", descriptor = "Lclient!kb;")
	private static Class46 aClass46_1164 = Static65.method1172("scroll:");

	@OriginalMember(owner = "client!sc", name = "yb", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1165 = aClass46_1164;

	@OriginalMember(owner = "client!sc", name = "zb", descriptor = "[Lclient!f;")
	public static Class24[] aClass24Array1 = new Class24[50];

	@OriginalMember(owner = "client!sc", name = "Gb", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1166 = Static65.method1172("Zu viele Verbindungen von Ihrer Adresse)3");

	@OriginalMember(owner = "client!sc", name = "Hb", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1167 = Static65.method1172("<col=ffff00>*V");

	@OriginalMember(owner = "client!sc", name = "Jb", descriptor = "I")
	public static int anInt3350 = 0;

	@OriginalMember(owner = "client!sc", name = "Kb", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1168 = aClass46_1164;

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)V")
	public static void method2431() {
		aClass24Array1 = null;
		aClass46_1164 = null;
		aClass46_1167 = null;
		aClass46_1165 = null;
		aLongArray3 = null;
		aClass46_1168 = null;
		aClass59_9 = null;
		aClass46_1166 = null;
		aClass3_Sub2_Sub3_Sub2Array7 = null;
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(II)Lclient!sc;")
	public static Class3_Sub2_Sub14 method2432(@OriginalArg(1) int arg0) {
		@Pc(10) Class3_Sub2_Sub14 local10 = (Class3_Sub2_Sub14) Static26.aClass57_6.method1719((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(28) byte[] local28 = Static37.aClass44_5.method1624(10, arg0);
		local10 = new Class3_Sub2_Sub14();
		local10.anInt3334 = arg0;
		if (local28 != null) {
			local10.method2425(new Class3_Sub4(local28));
		}
		local10.method2433();
		if (local10.anInt3337 != -1) {
			local10.method2421(method2432(local10.anInt3337), method2432(local10.anInt3336));
		}
		if (!Static38.aBoolean34 && local10.aBoolean138) {
			local10.aBoolean139 = false;
			local10.aClass46Array20 = null;
			local10.aClass46Array21 = null;
			local10.anInt3331 = 0;
			local10.aClass46_1163 = Static88.aClass46_734;
		}
		Static26.aClass57_6.method1717(local10, (long) arg0);
		return local10;
	}
}
