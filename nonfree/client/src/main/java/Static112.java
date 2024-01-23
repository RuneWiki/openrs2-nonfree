import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!ic", name = "h", descriptor = "Lclient!th;")
	public static Class168 aClass168_84;

	@OriginalMember(owner = "client!ic", name = "z", descriptor = "I")
	public static int anInt2461;

	@OriginalMember(owner = "client!ic", name = "f", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray24 = new String[500];

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIBII)V")
	public static void method1810(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) int local3 = 0;
		@Pc(17) int local17 = arg0;
		Static98.method3942(arg0 + arg3, Static121.anIntArrayArray33[arg1], arg2, arg3 - arg0);
		@Pc(32) int local32 = -1;
		@Pc(35) int local35 = -arg0;
		while (local3 < local17) {
			local32 += 2;
			local3++;
			local35 += local32;
			if (local35 >= 0) {
				@Pc(53) int local53 = arg3 - local3;
				local17--;
				@Pc(60) int[] local60 = Static121.anIntArrayArray33[local17 + arg1];
				local35 -= local17 << 1;
				@Pc(73) int[] local73 = Static121.anIntArrayArray33[arg1 - local17];
				@Pc(77) int local77 = arg3 + local3;
				Static98.method3942(local77, local60, arg2, local53);
				Static98.method3942(local77, local73, arg2, local53);
			}
			@Pc(94) int local94 = arg3 + local17;
			@Pc(100) int[] local100 = Static121.anIntArrayArray33[local3 + arg1];
			@Pc(104) int local104 = arg3 - local17;
			@Pc(111) int[] local111 = Static121.anIntArrayArray33[arg1 - local3];
			Static98.method3942(local94, local100, arg2, local104);
			Static98.method3942(local94, local111, arg2, local104);
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "([II)[I")
	public static int[] method1811(@OriginalArg(0) int[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(19) int[] local19 = new int[arg0.length];
			Static319.method1420(arg0, 0, local19, 0, arg0.length);
			return local19;
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!ab;")
	public static RuntimeException_Sub1 method1818(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(12) RuntimeException_Sub1 local12;
		if (arg0 instanceof RuntimeException_Sub1) {
			local12 = (RuntimeException_Sub1) arg0;
			local12.aString7 = local12.aString7 + ' ' + arg1;
		} else {
			local12 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local12;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)V")
	public static void method1823(@OriginalArg(1) int arg0) {
		if (arg0 == Static96.anInt2212) {
			return;
		}
		@Pc(27) boolean local27 = arg0 == 5 || arg0 == 10 || arg0 == 28;
		if (Static96.anInt2212 == 0) {
			Static193.method3113();
		}
		if (arg0 == 40) {
			Static222.method3478();
		}
		if (arg0 != 40 && Static121.aClass104_4 != null) {
			Static121.aClass104_4.method2571();
			Static121.aClass104_4 = null;
		}
		if (arg0 == 25 || arg0 == 28) {
			Static222.anInt4704 = 1;
			Static144.anInt3282 = 0;
			Static134.anInt3084 = 1;
			Static186.anInt4095 = 0;
			Static222.anInt4707 = 0;
			Static83.method1427(true);
		}
		if (arg0 == 25 || arg0 == 10) {
			Static68.method1163();
		}
		if (arg0 == 5) {
			Static119.method1935(Static277.aClass168_188);
		} else {
			Static176.method2829();
		}
		@Pc(114) boolean local114 = Static96.anInt2212 == 5 || Static96.anInt2212 == 10 || Static96.anInt2212 == 28;
		if (local27 != local114) {
			if (local27) {
				Static107.anInt1667 = Static240.anInt5003;
				if (Static87.anInt2035 == 0) {
					Static98.method3944();
				} else {
					Static5.method2411(Static240.anInt5003, 255, Static310.aClass168_209);
				}
				Static280.aClass41_3.method1025(false);
			} else {
				Static98.method3944();
				Static280.aClass41_3.method1025(true);
			}
		}
		if (Static294.aBoolean367 && (arg0 == 25 || arg0 == 28 || arg0 == 40)) {
			Static294.method4510();
		}
		Static96.anInt2212 = arg0;
	}
}
