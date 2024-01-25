import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "I")
	public static int anInt3433;

	@OriginalMember(owner = "client!gca", name = "j", descriptor = "Lclient!au;")
	public static Class14_Sub4 aClass14_Sub4_1;

	@OriginalMember(owner = "client!gca", name = "f", descriptor = "[Lclient!wr;")
	public static Class393[] aClass393Array1 = new Class393[50];

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(II)[I")
	public static int[] method2839(@OriginalArg(0) int arg0) {
		@Pc(6) int[] local6 = new int[3];
		Static625.method8782(Static551.method5873(arg0));
		local6[0] = Static170.aCalendar1.get(5);
		local6[1] = Static170.aCalendar1.get(2);
		local6[2] = Static170.aCalendar1.get(1);
		return local6;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(Lclient!ha;B)V")
	public static void method2840(@OriginalArg(0) Class137 arg0) {
		Static294.aClass38_9 = Static411.method6078(Static45.anInt1109, arg0, true);
		Static254.aClass158_7 = Static250.method3681(arg0, Static45.anInt1109);
		Static242.aClass38_5 = Static411.method6078(Static335.anInt6336, arg0, true);
		Static586.aClass158_12 = Static250.method3681(arg0, Static335.anInt6336);
		Static448.aClass38_10 = Static411.method6078(Static602.anInt10183, arg0, true);
		Static48.aClass158_1 = Static250.method3681(arg0, Static602.anInt10183);
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(IIILclient!mea;)V")
	public static void method2842(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class230 arg2) {
		if (arg2 == null) {
			return;
		}
		if (arg2.anObjectArray28 != null) {
			@Pc(16) Class14_Sub55 local16 = new Class14_Sub55();
			local16.anObjectArray33 = arg2.anObjectArray28;
			local16.aClass230_14 = arg2;
			Static632.method8830(local16);
		}
		Static402.anInt10315 = arg2.anInt6663;
		Static639.anInt10686 = arg2.anInt6679;
		Static156.anInt3080 = arg0;
		Static238.aBoolean302 = true;
		Static68.anInt1565 = arg2.anInt6646;
		Static597.anInt10147 = arg1;
		Static416.anInt7542 = arg2.anInt6697;
		Static275.anInt4778 = arg2.anInt6658;
		Static634.method8860(arg2);
	}

	@OriginalMember(owner = "client!gca", name = "b", descriptor = "(II)Z")
	public static boolean method2845(@OriginalArg(0) int arg0) {
		return arg0 == (-arg0 & arg0);
	}
}
