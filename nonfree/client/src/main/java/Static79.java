import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!sb", name = "T", descriptor = "I")
	public static int anInt2058;

	@OriginalMember(owner = "client!sb", name = "V", descriptor = "Lclient!ad;")
	public static Class5_Sub1 aClass5_Sub1_18;

	@OriginalMember(owner = "client!sb", name = "X", descriptor = "Lclient!pd;")
	public static Class18 aClass18_1;

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "(B)V", line = 9)
	private static void method1396() {
		Static7.aClass45_5.method1476();
		Static14.aClass2_Sub2_Sub2_Sub3_19.method1320(0, 0);
		Static3.anIntArray4 = Static6.method175(Static3.anIntArray4);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!ob;I)V", line = 23)
	public static void method1397(@OriginalArg(0) Class42 arg0) {
		Static89.aClass42_1 = arg0;
	}

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "(B)V", line = 34)
	public static void method1398() {
		aClass5_Sub1_18 = null;
		Class2_Sub2_Sub14.aClass40_601 = null;
		Class2_Sub2_Sub14.aClass40_600 = null;
		aClass18_1 = null;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZILclient!bb;Z)Z", line = 75)
	public static boolean method1400(@OriginalArg(2) Class7 arg0, @OriginalArg(3) boolean arg1) {
		return Static28.method585(arg0, arg1);
	}

	@OriginalMember(owner = "client!sb", name = "f", descriptor = "(I)V", line = 95)
	public static void method1401() {
		Class2_Sub2_Sub1.aBoolean13 = true;
		method1396();
		@Pc(29) boolean local29;
		if (Class37.anInt1654 != -1) {
			local29 = Static20.method403(0, -1, Class37.anInt1654, 1, 0, 261, 0, 190);
			if (!local29) {
				Class2_Sub2_Sub7.aBoolean59 = true;
			}
		} else if (Class3.anIntArray2[Class35.anInt1551] != -1) {
			local29 = Static20.method403(0, -1, Class3.anIntArray2[Class35.anInt1551], 1, 0, 261, 0, 190);
			if (!local29) {
				Class2_Sub2_Sub7.aBoolean59 = true;
			}
		}
		if (Class2_Sub12.aBoolean175 && Static1.anInt16 == 1) {
			Static22.method480();
		}
		Static67.method1207(Static23.aGraphics1);
	}

	@OriginalMember(owner = "client!sb", name = "g", descriptor = "(I)V", line = 140)
	public static void method1402() {
		Class17.aClass47_4.method1330();
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(B[Lclient!o;)[Lclient!o;", line = 171)
	public static Class40[] method1404(@OriginalArg(1) Class40[] arg0) {
		@Pc(4) Class40[] local4 = new Class40[5];
		for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
			local4[local15] = Static72.method1334(new Class40[] { Static48.method859(local15), Class1.aClass40_4 });
			if (arg0 != null && arg0[local15] != null) {
				local4[local15] = Static72.method1334(new Class40[] { local4[local15], arg0[local15] });
			}
		}
		return local4;
	}
}
