import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static459 {

	@OriginalMember(owner = "client!ri", name = "f", descriptor = "Lclient!tt;")
	public static final Class319 aClass319_145 = new Class319(64, 3);

	@OriginalMember(owner = "client!ri", name = "g", descriptor = "Z")
	public static boolean aBoolean567 = true;

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lclient!ga;B)V")
	public static void method6511(@OriginalArg(0) Class111 arg0) {
		Static436.anInt7677 = 0;
		Static571.anInt9322 = 0;
		Static290.aClass349_7 = new Class349();
		Static293.aClass20_Sub1_Sub1_Sub1Array2 = new Class20_Sub1_Sub1_Sub1[1024];
		Static400.aClass20_Sub5Array2 = new Class20_Sub5[Static504.anIntArray578[Static341.anInt6056] + 1];
		Static469.anInt7951 = 0;
		Static134.anInt9523 = 0;
		Static326.method4930(arg0);
		Static285.method7747(arg0);
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(BIILclient!tc;Lclient!r;I)V")
	public static void method6513(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class306 arg2, @OriginalArg(4) Class12 arg3, @OriginalArg(5) int arg4) {
		@Pc(9) Class223 local9 = Static74.aClass184_1.method4074(arg2.anInt8391);
		if (local9.anInt6070 == -1) {
			return;
		}
		if (arg2.aBoolean622) {
			@Pc(22) int local22 = arg4 + arg2.anInt8389;
			arg4 = local22 & 0x3;
		} else {
			arg4 = 0;
		}
		@Pc(48) Class10 local48 = local9.method5099(arg2.aBoolean607, arg4, arg3);
		if (local48 == null) {
			return;
		}
		@Pc(54) int local54 = arg2.anInt8385;
		@Pc(57) int local57 = arg2.anInt8414;
		if ((arg4 & 0x1) == 1) {
			local57 = arg2.anInt8385;
			local54 = arg2.anInt8414;
		}
		@Pc(73) int local73 = local48.A();
		@Pc(76) int local76 = local48.ca();
		if (local9.aBoolean435) {
			local73 = local54 * 4;
			local76 = local57 * 4;
		}
		if (local9.anInt6073 == 0) {
			local48.method7682(arg0, arg1 - (local57 - 1) * 4, local73, local76);
		} else {
			local48.method7680(arg0, arg1 + 4 - local57 * 4, local73, local76, 0, local9.anInt6073 | 0xFF000000, 1);
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(ILclient!ga;I)Lclient!ifa;")
	public static Class1_Sub19 method6514(@OriginalArg(1) Class111 arg0, @OriginalArg(2) int arg1) {
		@Pc(13) byte[] local13 = arg0.method2449(arg1);
		return local13 == null ? null : new Class1_Sub19(local13);
	}
}
