import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static305 {

	@OriginalMember(owner = "client!ks", name = "K", descriptor = "Lclient!fp;")
	public static Class114 aClass114_29;

	@OriginalMember(owner = "client!ks", name = "D", descriptor = "I")
	public static int anInt5639 = 0;

	@OriginalMember(owner = "client!ks", name = "F", descriptor = "Lclient!kg;")
	public static final Class188 aClass188_4 = new Class188("", 13);

	@OriginalMember(owner = "client!ks", name = "L", descriptor = "I")
	public static int anInt5645 = 0;

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(III)Z")
	public static boolean method4707(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0 && (arg0 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "(III)B")
	public static byte method4708(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Z)Lclient!aga;")
	public static Class13 method4709() {
		try {
			return (Class13) Class.forName("Class13_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(9) Throwable local9) {
			return new Class13_Sub2();
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lclient!rca;B)V")
	public static void method4710(@OriginalArg(0) Class2_Sub34_Sub2 arg0) {
		arg0.method6864(Static164.aClass97_42.method2547());
		arg0.method6864(Static573.aClass97_139.method2547());
		arg0.method6864(Static104.aClass97_26.method2547());
		arg0.method6864(Static100.aClass97_25.method2547());
		arg0.method6864(Static560.aClass97_137.method2547());
		arg0.method6864(Static48.aClass97_6.method2547());
		arg0.method6864(Static536.aClass97_133.method2547());
		arg0.method6864(Static625.aClass97_153.method2547());
		arg0.method6864(Static594.aClass97_144.method2547());
		arg0.method6864(Static276.aClass97_69.method2547());
		arg0.method6864(Static345.aClass97_91.method2547());
		arg0.method6864(Static226.aClass97_60.method2547());
		arg0.method6864(Static224.aClass97_59.method2547());
		arg0.method6864(Static428.aClass97_107.method2547());
		arg0.method6864(Static333.aClass97_87.method2547());
		arg0.method6864(Static87.aClass97_17.method2547());
		arg0.method6864(Static95.aClass97_21.method2547());
		arg0.method6864(Static410.aClass97_101.method2547());
		arg0.method6864(Static377.aClass97_96.method2547());
		arg0.method6864(Static64.aClass97_12.method2547());
		arg0.method6864(Static328.aClass97_84.method2547());
		arg0.method6864(Static282.aClass97_70.method2547());
		arg0.method6864(Static544.aClass97_135.method2547());
		arg0.method6864(Static612.aClass97_149.method2547());
		arg0.method6864(Static253.aClass97_65.method2547());
		arg0.method6864(Static551.aClass97_136.method2547());
		arg0.method6864(Static442.aClass97_110.method2547());
		arg0.method6864(Static372.aClass97_95.method2547());
		arg0.method6864(Static150.aClass97_37.method2547());
		arg0.method6864(Static644.aClass97_154.method2547());
		arg0.method6864(Static193.aClass97_56.method2547());
		arg0.method6864(Static181.aClass97_52.method2547());
		arg0.method6864(Static322.method4856());
		arg0.method6864(Static365.method5558());
		arg0.method6864(Static312.aClass97_78.method2547());
	}
}
