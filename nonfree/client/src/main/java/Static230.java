import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static230 {

	@OriginalMember(owner = "client!os", name = "p", descriptor = "Lclient!ir;")
	public static Class100 aClass100_124;

	@OriginalMember(owner = "client!os", name = "x", descriptor = "I")
	public static int anInt6570;

	@OriginalMember(owner = "client!os", name = "C", descriptor = "Lclient!ir;")
	public static Class100 aClass100_125;

	@OriginalMember(owner = "client!os", name = "h", descriptor = "I")
	public static int anInt6558 = -1;

	@OriginalMember(owner = "client!os", name = "n", descriptor = "[I")
	public static final int[] anIntArray548 = new int[50];

	@OriginalMember(owner = "client!os", name = "o", descriptor = "I")
	public static int anInt6563 = 1;

	@OriginalMember(owner = "client!os", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString247 = "Loaded input handler";

	@OriginalMember(owner = "client!os", name = "B", descriptor = "Ljava/lang/String;")
	public static String aString248 = null;

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IIIIIII)V")
	public static void method5526(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class158 local3 = new Class158();
		local3.anInt4740 = arg1 >> 7;
		local3.anInt4726 = arg2 >> 7;
		local3.anInt4745 = arg3 >> 7;
		local3.anInt4728 = arg4 >> 7;
		local3.anInt4733 = arg0;
		local3.anInt4730 = arg1;
		local3.anInt4748 = arg2;
		local3.anInt4741 = arg3;
		local3.anInt4738 = arg4;
		local3.anInt4729 = arg5;
		local3.anInt4731 = arg6;
		Static32.aClass158Array1[Static243.anInt4826++] = local3;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Lclient!ro;BI)Lclient!pl;")
	public static Class160 method5536(@OriginalArg(0) Class5_Sub4 arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class160 local12;
		if (Static192.aClass160_2 == null) {
			local12 = new Class160();
		} else {
			local12 = Static192.aClass160_2;
			Static192.aClass160_2 = Static192.aClass160_2.aClass160_3;
			local12.aClass160_3 = null;
			Static278.anInt5568--;
		}
		local12.aClass5_Sub4_1 = arg0;
		local12.anInt4807 = arg1;
		return local12;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(II)Lclient!db;")
	public static Class41 method5537(@OriginalArg(1) int arg0) {
		@Pc(5) Class198 local5 = Static62.aClass198_17;
		@Pc(14) Class41 local14;
		synchronized (Static62.aClass198_17) {
			local14 = (Class41) Static62.aClass198_17.method5242((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(39) byte[] local39 = Static18.aClass100_11.method2319(Static289.method4951(arg0), Static208.method3585(arg0));
		local14 = new Class41();
		local14.anInt1202 = arg0;
		if (local39 != null) {
			local14.method925(new Class3_Sub4(local39));
		}
		local14.method940();
		if (local14.anInt1228 != -1) {
			local14.method931(method5537(local14.anInt1233), method5537(local14.anInt1228));
		}
		if (local14.anInt1179 != -1) {
			local14.method930(method5537(local14.anInt1179), method5537(local14.anInt1177));
		}
		if (!Static97.aBoolean104 && local14.lb) {
			local14.aStringArray8 = Static13.aStringArray2;
			local14.anInt1207 = 0;
			local14.aBoolean57 = false;
			local14.anIntArray79 = null;
			local14.aStringArray7 = Static308.aStringArray40;
			local14.aString36 = Static178.aString139;
		}
		@Pc(113) Class198 local113 = Static62.aClass198_17;
		synchronized (Static62.aClass198_17) {
			Static62.aClass198_17.method5231((long) arg0, local14);
			return local14;
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(III[S[Ljava/lang/String;)V")
	public static void method5541(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) short[] arg2, @OriginalArg(4) String[] arg3) {
		if (arg1 <= arg0) {
			return;
		}
		@Pc(14) int local14 = (arg0 + arg1) / 2;
		@Pc(16) int local16 = arg0;
		@Pc(20) String local20 = arg3[local14];
		arg3[local14] = arg3[arg1];
		arg3[arg1] = local20;
		@Pc(34) short local34 = arg2[local14];
		arg2[local14] = arg2[arg1];
		arg2[arg1] = local34;
		for (@Pc(46) int local46 = arg0; local46 < arg1; local46++) {
			if (local20 == null || arg3[local46] != null && arg3[local46].compareTo(local20) < (local46 & 0x1)) {
				@Pc(67) String local67 = arg3[local46];
				arg3[local46] = arg3[local16];
				arg3[local16] = local67;
				@Pc(81) short local81 = arg2[local46];
				arg2[local46] = arg2[local16];
				arg2[local16++] = local81;
			}
		}
		arg3[arg1] = arg3[local16];
		arg3[local16] = local20;
		arg2[arg1] = arg2[local16];
		arg2[local16] = local34;
		method5541(arg0, local16 - 1, arg2, arg3);
		method5541(local16 + 1, arg1, arg2, arg3);
	}
}
