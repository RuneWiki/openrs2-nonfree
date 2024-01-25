import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static259 {

	@OriginalMember(owner = "client!kg", name = "p", descriptor = "I")
	public static int anInt4237;

	@OriginalMember(owner = "client!kg", name = "o", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_102 = new Class40(30, 4);

	@OriginalMember(owner = "client!kg", name = "q", descriptor = "I")
	public static final int anInt4238 = 1;

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lclient!fca;IBI)V")
	public static void method3637(@OriginalArg(0) Class97 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == null) {
			return;
		}
		if (arg0.anObjectArray24 != null) {
			@Pc(13) Class6_Sub36 local13 = new Class6_Sub36();
			local13.aClass97_7 = arg0;
			local13.anObjectArray34 = arg0.anObjectArray24;
			Static100.method1639(local13);
		}
		Static443.anInt7698 = arg0.lb;
		Static324.anInt5830 = arg0.anInt2337;
		Static217.anInt3710 = arg2;
		Static492.aBoolean560 = true;
		Static217.anInt3703 = arg1;
		Static278.anInt6564 = arg0.anInt2315;
		Static288.anInt4713 = arg0.anInt2311;
		Static537.anInt9108 = arg0.anInt2277;
		Static390.method5794(arg0);
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method3638(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + Static368.method5421("%0a", "\n", arg0));
	}
}
