import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!an", name = "E", descriptor = "I")
	public static int anInt623;

	@OriginalMember(owner = "client!an", name = "F", descriptor = "Ljava/lang/Object;")
	public static Object anObject1;

	@OriginalMember(owner = "client!an", name = "B", descriptor = "Lclient!ee;")
	public static final Class86 aClass86_1 = new Class86("WTQA", 2);

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IB)Z")
	public static boolean method474(@OriginalArg(0) int arg0) {
		return arg0 == 44 || arg0 == 51 || arg0 == 1001 || arg0 == 47 || arg0 == 60;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IIILjava/lang/String;I)V")
	public static void method475(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class78 local8 = Static496.method7080(arg3, arg0);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray15 != null) {
			@Pc(22) Class2_Sub42 local22 = new Class2_Sub42();
			local22.anInt8126 = arg1;
			local22.aString75 = arg2;
			local22.anObjectArray33 = local8.anObjectArray15;
			local22.aClass78_9 = local8;
			Static639.method8539(local22);
		}
		if (Static538.anInt8985 != 10 || !Static69.method1332(local8).method6407(arg1 - 1)) {
			return;
		}
		@Pc(64) Class2_Sub50 local64;
		if (arg1 == 1) {
			local64 = Static595.method8194(Static610.aClass310_2, Static606.aClass269_93);
			Static201.method3524(arg0, local64, arg3, local8.anInt2006);
			Static311.method4754(local64);
		}
		if (arg1 == 2) {
			local64 = Static595.method8194(Static610.aClass310_2, Static465.aClass269_77);
			Static201.method3524(arg0, local64, arg3, local8.anInt2006);
			Static311.method4754(local64);
		}
		if (arg1 == 3) {
			local64 = Static595.method8194(Static610.aClass310_2, Static271.aClass269_54);
			Static201.method3524(arg0, local64, arg3, local8.anInt2006);
			Static311.method4754(local64);
		}
		if (arg1 == 4) {
			local64 = Static595.method8194(Static610.aClass310_2, Static600.aClass269_92);
			Static201.method3524(arg0, local64, arg3, local8.anInt2006);
			Static311.method4754(local64);
		}
		if (arg1 == 5) {
			local64 = Static595.method8194(Static610.aClass310_2, Static367.aClass269_66);
			Static201.method3524(arg0, local64, arg3, local8.anInt2006);
			Static311.method4754(local64);
		}
		if (arg1 == 6) {
			local64 = Static595.method8194(Static610.aClass310_2, Static228.aClass269_47);
			Static201.method3524(arg0, local64, arg3, local8.anInt2006);
			Static311.method4754(local64);
		}
		if (arg1 == 7) {
			local64 = Static595.method8194(Static610.aClass310_2, Static206.aClass269_43);
			Static201.method3524(arg0, local64, arg3, local8.anInt2006);
			Static311.method4754(local64);
		}
		if (arg1 == 8) {
			local64 = Static595.method8194(Static610.aClass310_2, Static133.aClass269_32);
			Static201.method3524(arg0, local64, arg3, local8.anInt2006);
			Static311.method4754(local64);
		}
		if (arg1 == 9) {
			local64 = Static595.method8194(Static610.aClass310_2, Static166.aClass269_37);
			Static201.method3524(arg0, local64, arg3, local8.anInt2006);
			Static311.method4754(local64);
		}
		if (arg1 == 10) {
			local64 = Static595.method8194(Static610.aClass310_2, Static127.aClass269_31);
			Static201.method3524(arg0, local64, arg3, local8.anInt2006);
			Static311.method4754(local64);
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(BI)I")
	public static int method476(@OriginalArg(1) int arg0) {
		return arg0 >>> 10;
	}
}
