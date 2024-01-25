import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static285 {

	@OriginalMember(owner = "client!od", name = "h", descriptor = "I")
	public static int anInt5407;

	@OriginalMember(owner = "client!od", name = "i", descriptor = "F")
	public static float aFloat85;

	@OriginalMember(owner = "client!od", name = "c", descriptor = "Lclient!nk;")
	public static final Class177 aClass177_78 = new Class177(13, 0);

	@OriginalMember(owner = "client!od", name = "g", descriptor = "Lclient!vv;")
	public static final Class263 aClass263_129 = new Class263(28, 2);

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ZI)S")
	public static short method4173(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 >> 10 & 0x3F;
		@Pc(15) int local15 = arg0 >> 3 & 0x70;
		@Pc(19) int local19 = arg0 & 0x7F;
		@Pc(37) int local37 = local19 <= 64 ? local15 * local19 >> 7 : (127 - local19) * local15 >> 7;
		@Pc(46) int local46 = local37 + local19;
		@Pc(52) int local52;
		if (local46 == 0) {
			local52 = local37 << 1;
		} else {
			local52 = (local37 << 8) / local46;
		}
		return (short) (local46 | local52 >> 4 << 7 | local9 << 10);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIII)I")
	public static int method4174(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static110.aByteArrayArrayArray20[arg1][arg2][arg0] & 0x8) == 0) {
			return arg1 <= 0 || (Static110.aByteArrayArrayArray20[1][arg2][arg0] & 0x2) == 0 ? arg1 : arg1 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIZ)V")
	public static void method4175(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			Static32.method677(Static163.aClass177_49);
		}
		if (arg0 == 1) {
			Static32.method677(Static15.aClass177_3);
		}
		Static433.aClass1_Sub3_Sub1_11.method1205(Static278.anInt5374 + arg2);
		Static433.aClass1_Sub3_Sub1_11.method1164(Static414.aClass48_1.method1119(82) ? 1 : 0);
		Static433.aClass1_Sub3_Sub1_11.method1205(Static380.anInt6896 + arg1);
		Static270.anInt5251 = arg2;
		Static110.aBoolean473 = false;
		Static57.anInt1519 = arg1;
		Static283.method4168();
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!qq;IZZ)V")
	public static void method4176(@OriginalArg(0) Class1_Sub39 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2) {
		@Pc(6) int local6 = arg0.anInt6172;
		@Pc(10) int local10 = (int) arg0.aLong228;
		arg0.method6178();
		if (arg2) {
			Static222.method3439(local6);
		}
		Static19.method415(local6);
		@Pc(27) Class68 local27 = Static300.method4351(local10);
		if (local27 != null) {
			Static446.method6042(local27);
		}
		Static194.method3147();
		if (!arg1 && Static456.anInt1594 != -1) {
			Static434.method5793(Static456.anInt1594, 1);
		}
		@Pc(51) Class175 local51 = new Class175(Static177.aClass38_18);
		for (@Pc(56) Class1_Sub39 local56 = (Class1_Sub39) local51.method3825(); local56 != null; local56 = (Class1_Sub39) local51.method3822()) {
			if (!local56.method6175()) {
				local56 = (Class1_Sub39) local51.method3825();
				if (local56 == null) {
					break;
				}
			}
			if (local56.anInt6174 == 3) {
				@Pc(77) int local77 = (int) local56.aLong228;
				if (local77 >>> 16 == local6) {
					method4176(local56, arg1, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIII)V")
	public static void method4177(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static105.anInt2417 <= arg2 - arg3 && arg2 + arg3 <= Static70.anInt1843 && arg0 - arg3 >= Static362.anInt6654 && Static164.anInt6595 >= arg3 + arg0) {
			Static211.method3323(arg0, arg1, arg3, arg2);
		} else {
			Static66.method1303(arg1, arg3, arg2, arg0);
		}
	}
}
