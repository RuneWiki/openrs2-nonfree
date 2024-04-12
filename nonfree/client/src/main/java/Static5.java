import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ae", name = "U", descriptor = "I")
	public static int anInt173;

	@OriginalMember(owner = "client!ae", name = "ab", descriptor = "Lclient!ad;")
	public static Class5_Sub1 aClass5_Sub1_1;

	@OriginalMember(owner = "client!ae", name = "f", descriptor = "(I)V", line = 11)
	public static void method115() {
		if (Class2_Sub6.anInt797 < 2 && Class18.anInt1874 == 0 && Class2_Sub2_Sub5.anInt641 == 0) {
			return;
		}
		@Pc(47) Class40 local47;
		if (Class18.anInt1874 == 1 && Class2_Sub6.anInt797 < 2) {
			local47 = Static72.method1334(new Class40[] { Class20.aClass40_193, Class2_Sub2_Sub14.aClass40_601, Class2_Sub2_Sub11.aClass40_333 });
		} else if (Class2_Sub2_Sub5.anInt641 == 1 && Class2_Sub6.anInt797 < 2) {
			local47 = Static72.method1334(new Class40[] { Class51.aClass40_567, Class6.aClass40_61 });
		} else {
			local47 = Class15.aClass40Array8[Class2_Sub6.anInt797 - 1];
		}
		if (Class2_Sub6.anInt797 > 2) {
			local47 = Static72.method1334(new Class40[] { local47, Class2_Sub2_Sub1.aClass40_45, Static48.method859(Class2_Sub6.anInt797 - 2), Class35.aClass40_455 });
		}
		Static13.aClass2_Sub2_Sub2_Sub2_1.method580(local47, 4, 16777215, Class24.anInt2511 / 1000);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(BI)Lclient!ee;", line = 38)
	public static Class2_Sub2_Sub5 method116(@OriginalArg(1) int arg0) {
		@Pc(15) Class2_Sub2_Sub5 local15 = (Class2_Sub2_Sub5) Class2_Sub2_Sub1.aClass47_3.method1325((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static49.aClass5_18.method68(arg0, 13);
		local15 = new Class2_Sub2_Sub5();
		local15.anInt634 = arg0;
		if (local25 != null) {
			local15.method504(new Class2_Sub3(local25));
		}
		Class2_Sub2_Sub1.aClass47_3.method1332((long) arg0, local15);
		return local15;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!ud;B)V", line = 63)
	public static void method117(@OriginalArg(0) Class5 arg0) {
		Static40.aClass5_25 = arg0;
	}

	@OriginalMember(owner = "client!ae", name = "g", descriptor = "(I)V", line = 85)
	public static void method118() {
		Class2_Sub2_Sub1.anIntArray36 = null;
		Class2_Sub2_Sub1.aClass40_47 = null;
		Class2_Sub2_Sub1.aClass40_43 = null;
		Class2_Sub2_Sub1.aClass44_1 = null;
		Class2_Sub2_Sub1.aClass47_3 = null;
		aClass5_Sub1_1 = null;
		Class2_Sub2_Sub1.anIntArray37 = null;
		Class2_Sub2_Sub1.aClass40_46 = null;
		Class2_Sub2_Sub1.aClass40_44 = null;
		Class2_Sub2_Sub1.aClass40_45 = null;
	}

	@OriginalMember(owner = "client!ae", name = "h", descriptor = "(I)I", line = 144)
	public static int method120() {
		return 5;
	}
}
