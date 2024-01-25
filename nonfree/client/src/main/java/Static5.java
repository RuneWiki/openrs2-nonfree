import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!aca", name = "G", descriptor = "[Lclient!es;")
	public static Class90[] aClass90Array1;

	@OriginalMember(owner = "client!aca", name = "L", descriptor = "I")
	public static int anInt456;

	@OriginalMember(owner = "client!aca", name = "O", descriptor = "Lclient!ni;")
	public static Class223 aClass223_2;

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(Z)V")
	public static void method439() {
		Static365.aClass46_4.method2003();
		Static153.aClass167_1.method5018();
		Static287.aClass99_1.method3060();
		Static249.aClass310_1.method7476();
		Static8.aClass309_1.method7454();
		Static356.aClass221_1.method5929();
		Static528.aClass198_2.method5704();
		Static360.aClass312_2.method7494();
		Static39.aClass214_1.method5871();
		Static259.aClass156_2.method4849();
		Static629.aClass271_1.method6869();
		Static385.aClass345_2.method8043();
		Static386.aClass341_2.method7999();
		Static69.aClass369_1.method8526();
		Static526.aClass21_1.method705();
		Static82.aClass74_1.method2531();
		Static181.aClass132_1.method3806();
		Static37.aClass282_1.method7031();
		Static40.aClass19_1.method645();
		Static120.aClass278_1.method6965();
		Static205.aClass137_4.method4133();
		Static86.method8591();
		Static473.method7025();
		Static122.method2606();
		Static394.method6232();
		Static129.method2650();
		Static484.aClass94_45.method2958(5);
		Static619.aClass94_37.method2958(5);
		Static644.aClass94_69.method2958(5);
		Static63.aClass94_10.method2958(5);
		Static435.aClass94_40.method2958(5);
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(ZZ)V")
	public static void method440(@OriginalArg(1) boolean arg0) {
		if (Static226.aClass41_1 != null) {
			Static226.aClass41_1.method1733();
			Static226.aClass41_1 = null;
		}
		Static347.anInt6836 = 0;
		Static234.method4283();
		Static248.method4432();
		for (@Pc(19) int local19 = 0; local19 < 4; local19++) {
			Static313.aClass258Array1[local19].method6645();
		}
		Static218.method3848(false);
		System.gc();
		Static171.method3227();
		Static342.aBoolean544 = false;
		Static281.anInt5925 = -1;
		Static414.method6491();
		Static536.method7576(true);
		Static477.anInt8412 = 0;
		Static300.anInt6134 = 0;
		Static484.anInt8559 = 0;
		Static227.anInt5049 = 0;
		Static643.anInt10750 = 0;
		Static218.anInt4657 = 0;
		for (@Pc(60) int local60 = 0; local60 < Static189.aClass50Array1.length; local60++) {
			Static189.aClass50Array1[local60] = null;
		}
		Static228.method4137();
		for (@Pc(75) int local75 = 0; local75 < 2048; local75++) {
			Static643.aClass9_Sub4_Sub2_Sub1_Sub2Array1[local75] = null;
		}
		Static288.anInt5977 = 0;
		Static461.aClass380_35.method8751();
		Static337.anInt6701 = 0;
		Static283.aClass380_37.method8751();
		Static500.method7617();
		Static140.anInt3330 = 0;
		Static140.aClass157_1.method4855();
		Static531.method7544();
		Static241.method4386();
		Static23.aLong13 = 0L;
		Static500.aClass6_Sub7_8 = null;
		if (arg0) {
			Static119.method2558(12);
			return;
		}
		Static119.method2558(3);
		try {
			Static651.method5913("loggedout", Static635.anApplet2);
		} catch (@Pc(126) Throwable local126) {
		}
	}

	@OriginalMember(owner = "client!aca", name = "c", descriptor = "(II)V")
	public static void method441(@OriginalArg(1) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static114.anInt2971 = arg0;
		Static82.aClass9_Sub5Array1 = new Class9_Sub5[Static85.anIntArray87[Static114.anInt2971] + 1];
		Static455.anInt8188 = 0;
		Static478.anInt8414 = 0;
	}

	@OriginalMember(owner = "client!aca", name = "b", descriptor = "(IIB)Z")
	public static boolean method442(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
	}
}
