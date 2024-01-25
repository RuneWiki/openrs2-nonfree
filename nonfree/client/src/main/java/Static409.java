import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static409 {

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray34 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "I")
	public static int anInt7642 = 0;

	@OriginalMember(owner = "client!rb", name = "e", descriptor = "Lclient!hba;")
	public static final Class111 aClass111_3 = new Class111();

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)V")
	public static void method6413() {
		for (@Pc(10) Class6_Sub2 local10 = (Class6_Sub2) Static331.aClass107_5.method2834(); local10 != null; local10 = (Class6_Sub2) Static331.aClass107_5.method2834()) {
			Static539.method7757(local10);
		}
		@Pc(31) int local31;
		@Pc(33) int local33;
		if (Static281.aClass2_Sub19_Sub1_1.method2159(Static266.anInt4923)) {
			local31 = 0;
			local33 = 3;
		} else {
			local33 = Static348.anInt6407;
			local31 = Static348.anInt6407;
		}
		Static67.method1237();
		for (@Pc(42) int local42 = local31; local42 <= local33; local42++) {
			Static67.method1247();
			Static67.method1246(local42);
			Static67.method1240(local42);
		}
		Static67.method1254();
		Static67.method1253();
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILclient!no;)I")
	public static int method6414(@OriginalArg(1) Class2_Sub29_Sub2 arg0) {
		@Pc(10) int local10 = arg0.method5248(2);
		@Pc(28) int local28;
		if (local10 == 0) {
			local28 = 0;
		} else if (local10 == 1) {
			local28 = arg0.method5248(5);
		} else if (local10 == 2) {
			local28 = arg0.method5248(8);
		} else {
			local28 = arg0.method5248(11);
		}
		return local28;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IBILclient!qa;III)Lclient!r;")
	public static Class63 method6415(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class39 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(6) long local6 = (long) arg5;
		@Pc(12) Class63 local12 = (Class63) Static152.aClass231_64.method6228(local6);
		if (local12 == null) {
			@Pc(22) Class29 local22 = Static342.method5377(arg5, Static248.aClass53_78);
			if (local22 == null) {
				return null;
			}
			if (local22.anInt849 < 13) {
				local22.method868();
			}
			local12 = arg2.method6011(local22, 2055, Static210.anInt3780, 64, 768);
			Static152.aClass231_64.method6232(local12, local6);
		}
		local12 = local12.method7706((byte) 2, 2055, true);
		if (arg1 != 0) {
			local12.OA(arg1);
		}
		if (arg3 != 0) {
			local12.D(arg3);
		}
		if (arg4 != 0) {
			local12.b(arg4);
		}
		if (arg0 != 0) {
			local12.ca(0, arg0, 0);
		}
		return local12;
	}
}
