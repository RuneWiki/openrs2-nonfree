import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!eb", name = "u", descriptor = "I")
	public static int anInt1472;

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lclient!im;I)Lclient!kh;")
	public static Class1_Sub1 method1115(@OriginalArg(0) Class1_Sub16 arg0) {
		arg0.method2655();
		@Pc(11) int local11 = arg0.method2655();
		@Pc(19) Class1_Sub1 local19 = Static31.method660(local11);
		local19.anInt6135 = arg0.method2655();
		@Pc(30) int local30 = arg0.method2655();
		for (@Pc(38) int local38 = 0; local38 < local30; local38++) {
			@Pc(49) int local49 = arg0.method2655();
			local19.method4760(arg0, local49);
		}
		local19.method4756();
		return local19;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(III)V")
	public static void method1116(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static91.method1593(arg0)) {
			Static219.method3893(arg1, Static81.aClass116ArrayArray1[arg0]);
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public static String method1117(@OriginalArg(1) int arg0) {
		if (arg0 >= 100000) {
			return arg0 < 10000000 ? "<col=ffffff>" + arg0 / 1000 + Static150.aString53 + "</col>" : "<col=00ff80>" + arg0 / 1000000 + Static267.aString100 + "</col>";
		} else {
			return "<col=ffff00>" + arg0 + "</col>";
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lclient!im;B)Lclient!vk;")
	public static Class68_Sub4 method1118(@OriginalArg(0) Class1_Sub16 arg0) {
		return new Class68_Sub4(arg0.method2645(), arg0.method2645(), arg0.method2645(), arg0.method2645(), arg0.method2645(), arg0.method2645(), arg0.method2645(), arg0.method2645(), arg0.method2634(), arg0.method2655());
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "()V")
	public static void method1119() {
		@Pc(3) int local3;
		@Pc(9) int local9;
		@Pc(14) int local14;
		if (Static147.aClass1_Sub14ArrayArrayArray3 != null) {
			for (local3 = 0; local3 < Static147.aClass1_Sub14ArrayArrayArray3.length; local3++) {
				for (local9 = 0; local9 < Static212.anInt4717; local9++) {
					for (local14 = 0; local14 < Static293.anInt6189; local14++) {
						Static147.aClass1_Sub14ArrayArrayArray3[local3][local9][local14] = null;
					}
				}
			}
		}
		Static277.aClass1_Sub20ArrayArray3 = null;
		if (Static59.aClass1_Sub14ArrayArrayArray1 != null) {
			for (local3 = 0; local3 < Static59.aClass1_Sub14ArrayArrayArray1.length; local3++) {
				for (local9 = 0; local9 < Static212.anInt4717; local9++) {
					for (local14 = 0; local14 < Static293.anInt6189; local14++) {
						Static59.aClass1_Sub14ArrayArrayArray1[local3][local9][local14] = null;
					}
				}
			}
		}
		Static3.aClass1_Sub20ArrayArray1 = null;
		Static82.anInt1969 = 0;
		if (Static6.aClass3Array4 != null) {
			for (local3 = 0; local3 < Static82.anInt1969; local3++) {
				Static6.aClass3Array4[local3] = null;
			}
		}
		if (Static178.aClass152Array3 != null) {
			for (local3 = 0; local3 < Static38.anInt1149; local3++) {
				Static178.aClass152Array3[local3] = null;
			}
			Static38.anInt1149 = 0;
		}
		if (Static164.aClass152Array2 != null) {
			for (local3 = 0; local3 < Static164.aClass152Array2.length; local3++) {
				Static164.aClass152Array2[local3] = null;
			}
		}
	}
}
