import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!hd", name = "x", descriptor = "Lclient!lb;")
	public static Class48 aClass48_1 = new Class48();

	@OriginalMember(owner = "client!hd", name = "I", descriptor = "Lclient!oa;")
	public static Class56 aClass56_707 = Static33.method650("backhmid1");

	@OriginalMember(owner = "client!hd", name = "O", descriptor = "Lclient!n;")
	public static Class52 aClass52_27 = new Class52(64);

	@OriginalMember(owner = "client!hd", name = "P", descriptor = "Lclient!oa;")
	public static Class56 aClass56_708 = Static33.method650("Schrifts-=tze geladen)3");

	@OriginalMember(owner = "client!hd", name = "Q", descriptor = "Lclient!ja;")
	public static Class37 aClass37_8 = new Class37();

	@OriginalMember(owner = "client!hd", name = "R", descriptor = "I")
	public static int anInt1183 = 0;

	@OriginalMember(owner = "client!hd", name = "S", descriptor = "Lclient!oa;")
	public static Class56 aClass56_709 = Static33.method650("Ihr Charakter)2Profil wird in:");

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Z)V")
	public static void method815() {
		if (Static66.anInt559 < 2 && Static98.anInt2560 == 0 && !Static93.aBoolean114) {
			return;
		}
		@Pc(42) Class56 local42;
		if (Static98.anInt2560 == 1 && Static66.anInt559 < 2) {
			local42 = Static84.method1524(new Class56[] { Static57.aClass56_890, Static53.aClass56_856, Static84.aClass56_1217, Static19.aClass56_283 });
		} else if (Static93.aBoolean114 && Static66.anInt559 < 2) {
			local42 = Static84.method1524(new Class56[] { Static76.aClass56_1114, Static53.aClass56_856, Static126.aClass56_1702, Static19.aClass56_283 });
		} else {
			local42 = Static28.aClass56Array2[Static66.anInt559 - 1];
		}
		if (Static66.anInt559 > 2) {
			local42 = Static84.method1524(new Class56[] { local42, Static124.aClass56_1699, Static111.method1851(Static66.anInt559 - 2), Static73.aClass56_1071 });
		}
		Static57.aClass3_Sub1_Sub1_Sub1_3.method746(local42, 4, 16777215, Static98.anInt2566 / 1000);
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(II)Lclient!ob;")
	public static Class3_Sub1_Sub11 method816(@OriginalArg(1) int arg0) {
		@Pc(10) Class3_Sub1_Sub11 local10 = (Class3_Sub1_Sub11) Static5.aClass52_2.method1342((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static50.aClass44_33.method1146(5, arg0);
		local10 = new Class3_Sub1_Sub11();
		if (local20 != null) {
			local10.method1469(new Class3_Sub2(local20));
		}
		Static5.aClass52_2.method1344(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "(I)V")
	public static void method818() {
		aClass56_707 = null;
		aClass56_709 = null;
		aClass37_8 = null;
		aClass56_708 = null;
		aClass48_1 = null;
		aClass52_27 = null;
	}
}
