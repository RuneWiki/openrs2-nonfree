import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static305 {

	@OriginalMember(owner = "client!wa", name = "S", descriptor = "I")
	public static int anInt5782;

	@OriginalMember(owner = "client!wa", name = "hb", descriptor = "I")
	public static int anInt5793;

	@OriginalMember(owner = "client!wa", name = "M", descriptor = "I")
	public static int anInt5777 = 0;

	@OriginalMember(owner = "client!wa", name = "cb", descriptor = "[Lclient!ug;")
	public static Class55_Sub1[] aClass55_Sub1Array2 = new Class55_Sub1[29];

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "(III)V")
	public static void method4550(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static137.aClass1_Sub14_Sub1_6.method2661(211);
		Static137.aClass1_Sub14_Sub1_6.method2642(arg1);
		Static137.aClass1_Sub14_Sub1_6.method2644(arg0);
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IBIII)V")
	public static void method4551(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static195.anInt3969 == 1) {
			Static63.aClass1_Sub1_Sub3Array6[Static171.anInt3597 / 100].method4628(Static225.anInt4442 - 8, Static270.anInt5141 + -8);
		}
		if (Static195.anInt3969 == 2) {
			Static63.aClass1_Sub1_Sub3Array6[Static171.anInt3597 / 100 + 4].method4628(Static225.anInt4442 - 8, Static270.anInt5141 + -8);
		}
		Static250.method2591();
	}

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(II)Ljava/lang/String;")
	public static String method4552(@OriginalArg(1) int arg0) {
		@Pc(8) String local8 = Integer.toString(arg0);
		for (@Pc(13) int local13 = local8.length() - 3; local13 > 0; local13 -= 3) {
			local8 = local8.substring(0, local13) + "," + local8.substring(local13);
		}
		if (local8.length() > 9) {
			return " <col=00ff80>" + local8.substring(0, local8.length() - 8) + Static177.aString81 + " (" + local8 + ")</col>";
		} else if (local8.length() > 6) {
			return " <col=ffffff>" + local8.substring(0, local8.length() - 4) + Static192.aString132 + " (" + local8 + ")</col>";
		} else {
			return " <col=ffff00>" + local8 + "</col>";
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lclient!sb;II)Lclient!ed;")
	public static Class1_Sub1_Sub8 method4554(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		@Pc(38) Class1_Sub1_Sub8 local38 = new Class1_Sub1_Sub8(arg1, arg0.method2605(), arg0.method2605(), arg0.method2647(), arg0.method2647(), arg0.method2595() == 1, arg0.method2595());
		@Pc(42) int local42 = arg0.method2595();
		for (@Pc(44) int local44 = 0; local44 < local42; local44++) {
			local38.aClass24_4.method473(new Class1_Sub26(arg0.method2595(), arg0.method2595(), arg0.method2593(), arg0.method2593(), arg0.method2593(), arg0.method2593(), arg0.method2593(), arg0.method2593(), arg0.method2593(), arg0.method2593()));
		}
		local38.method933();
		return local38;
	}
}
