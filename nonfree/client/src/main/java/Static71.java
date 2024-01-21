import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!m", name = "e", descriptor = "I")
	public static int anInt1491;

	@OriginalMember(owner = "client!m", name = "g", descriptor = "Lclient!lf;")
	public static Class7 aClass7_10;

	@OriginalMember(owner = "client!m", name = "h", descriptor = "Lclient!mf;")
	public static Class56_Sub1 aClass56_Sub1_12;

	@OriginalMember(owner = "client!m", name = "j", descriptor = "[I")
	public static int[] anIntArray278;

	@OriginalMember(owner = "client!m", name = "k", descriptor = "Lclient!lf;")
	public static Class7 aClass7_11;

	@OriginalMember(owner = "client!m", name = "n", descriptor = "Lclient!tc;")
	public static Class74 aClass74_2;

	@OriginalMember(owner = "client!m", name = "d", descriptor = "Lclient!aa;")
	public static Class2 aClass2_8 = new Class2();

	@OriginalMember(owner = "client!m", name = "f", descriptor = "Lclient!fc;")
	public static Class25 aClass25_696 = Static78.method1313("Benutzeroberfl-=che geladen)3");

	@OriginalMember(owner = "client!m", name = "o", descriptor = "Lclient!fc;")
	private static Class25 aClass25_699 = Static78.method1313("green:");

	@OriginalMember(owner = "client!m", name = "i", descriptor = "Lclient!fc;")
	public static Class25 aClass25_697 = aClass25_699;

	@OriginalMember(owner = "client!m", name = "l", descriptor = "Lclient!fc;")
	public static Class25 aClass25_698 = aClass25_699;

	@OriginalMember(owner = "client!m", name = "m", descriptor = "I")
	public static int anInt1492 = 0;

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(II)V")
	public static void method1147() {
		Static1.anInt19 = 2;
		Static118.aBoolean123 = false;
		Static53.aClass56_78 = null;
		Static126.anInt2930 = 0;
		Static120.anInt2848 = -1;
		Static64.anInt1442 = -1;
		Static88.anInt1984 = 1;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V")
	public static void method1148() {
		aClass2_8 = null;
		aClass7_10 = null;
		aClass25_696 = null;
		aClass7_11 = null;
		aClass25_699 = null;
		anIntArray278 = null;
		aClass56_Sub1_12 = null;
		aClass74_2 = null;
		aClass25_697 = null;
		aClass25_698 = null;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Z)V")
	public static void method1149() {
		try {
			if (Static61.aClass3_1 == null) {
				Static61.aClass3_1 = new Class3(aClass74_2, Static116.method1859(new Class25[] { Static120.aClass25_1386, Static92.aClass25_983, Static37.aClass25_430 }).method766());
			} else {
				@Pc(11) byte[] local11 = Static61.aClass3_1.method40();
				if (local11 != null) {
					@Pc(18) Class1_Sub5 local18 = new Class1_Sub5(local11);
					Static68.anInt1477 = local18.method651();
					Static120.aClass11Array1 = new Class11[Static68.anInt1477];
					for (@Pc(27) int local27 = 0; local27 < Static68.anInt1477; local27++) {
						@Pc(37) Class11 local37 = Static120.aClass11Array1[local27] = new Class11();
						@Pc(41) int local41 = local18.method651();
						local37.anInt275 = local41 & 0x7FFF;
						local37.aBoolean7 = (local41 & 0x8000) != 0;
						local37.aClass25_145 = local18.method654();
						local37.anInt273 = local18.method668();
						local37.anInt274 = local27;
						local37.anInt271 = Static119.method1920(local37.aClass25_145);
					}
					Static84.method1410(Static53.anIntArray429, Static100.anIntArray401, 0, Static120.aClass11Array1.length - 1, Static120.aClass11Array1);
					Static93.aBoolean103 = true;
					Static61.aClass3_1 = null;
				}
			}
		} catch (@Pc(128) Exception local128) {
			Static61.aClass3_1 = null;
		}
	}
}
