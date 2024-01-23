import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!nf", name = "c", descriptor = "[Lclient!hh;")
	public static Class50[] aClass50Array55;

	@OriginalMember(owner = "client!nf", name = "f", descriptor = "Lclient!pa;")
	public static Class86 aClass86_50;

	@OriginalMember(owner = "client!nf", name = "r", descriptor = "Z")
	public static boolean aBoolean124 = false;

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lclient!pa;Lclient!pa;Lclient!pa;Lclient!ok;Z)Z")
	public static boolean method2342(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class86 arg1, @OriginalArg(2) Class86 arg2, @OriginalArg(3) Class1_Sub12_Sub3 arg3) {
		Static134.aClass86_48 = arg2;
		Static203.aClass86_13 = arg1;
		Static65.aClass86_75 = arg0;
		Static203.aClass1_Sub12_Sub3_2 = arg3;
		return true;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V")
	public static void method2344() {
		@Pc(5) Object local5 = Static4.anObject1;
		synchronized (Static4.anObject1) {
			if (Static195.anInt3974 == 0) {
				Static4.aClass87_1.method2694(new Class104(), 5);
			}
			Static195.anInt3974 = 600;
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(ILclient!ge;)V")
	public static void method2345(@OriginalArg(1) Class1_Sub12 arg0) {
		arg0.aBoolean173 = false;
		if (arg0.aClass1_Sub15_5 != null) {
			arg0.aClass1_Sub15_5.anInt3457 = 0;
		}
		for (@Pc(18) Class1_Sub12 local18 = arg0.method3038(); local18 != null; local18 = arg0.method3035()) {
			method2345(local18);
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lclient!pa;II)Lclient!hk;")
	public static Class1_Sub1_Sub8_Sub1 method2346(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1) {
		return Static116.method1858(arg1, arg0) ? Static220.method3397() : null;
	}

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(Z)V")
	public static void method2347() {
		@Pc(8) int[] local8 = new int[Static109.anInt2173];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < Static109.anInt2173; local12++) {
			@Pc(18) Class70 local18 = Static16.method227(local12);
			if (local18.anInt2406 >= 0 || local18.anInt2407 >= 0) {
				local8[local10++] = local12;
			}
		}
		Static187.anIntArray434 = new int[local10];
		for (@Pc(49) int local49 = 0; local49 < local10; local49++) {
			Static187.anIntArray434[local49] = local8[local49];
		}
	}
}
