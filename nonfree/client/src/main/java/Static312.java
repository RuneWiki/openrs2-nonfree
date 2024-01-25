import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static312 {

	@OriginalMember(owner = "client!tj", name = "W", descriptor = "I")
	public static int anInt6196;

	@OriginalMember(owner = "client!tj", name = "P", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_200 = new Class221(52, 3);

	@OriginalMember(owner = "client!tj", name = "R", descriptor = "[I")
	public static final int[] anIntArray478 = new int[50];

	@OriginalMember(owner = "client!tj", name = "S", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_201 = new Class221(30, 4);

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(III)V")
	public static void method5208(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class2_Sub9_Sub4 local8 = Static98.method1971(12, arg1);
		local8.method1801();
		local8.anInt1723 = arg0;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(II)Lclient!fc;")
	public static Class66 method5209(@OriginalArg(0) int arg0) {
		@Pc(10) Class66 local10 = (Class66) Static41.aClass107_41.method3021((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static77.aClass104_53.method2756(36, arg0);
		local10 = new Class66();
		local10.anInt1734 = arg0;
		if (local20 != null) {
			local10.method1802(new Class2_Sub12(local20));
		}
		local10.method1806();
		Static41.aClass107_41.method3018((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(ILclient!wg;)V")
	public static void method5210(@OriginalArg(1) Class218 arg0) {
		Static51.aClass218_1 = arg0;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(Z)V")
	public static void method5212() {
		Static300.method5057(Static12.aClass157_12);
		Static197.aClass2_Sub12_Sub2_2.method3158(Static281.anInt5678);
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIIIIIIIIIIIII)V")
	public static void method5214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		@Pc(15) Class1_Sub2_Sub3 local15;
		@Pc(11) int local11;
		if (arg1 >= 0) {
			local11 = arg1 - 1;
			local15 = Static95.aClass1_Sub2_Sub3_Sub2Array1[local11];
		} else {
			local11 = -arg1 - 1;
			if (local11 == Static217.anInt4819) {
				local15 = Static177.aClass1_Sub2_Sub3_Sub1_1;
			} else {
				local15 = Static164.aClass1_Sub2_Sub3_Sub1Array1[local11];
			}
		}
		if (local15 == null) {
			return;
		}
		@Pc(44) Class74 local44 = Static228.method4210(arg8);
		@Pc(60) int local60;
		@Pc(57) int local57;
		if (arg12 == 1 || arg12 == 3) {
			local60 = local44.anInt2048;
			local57 = local44.anInt2094;
		} else {
			local57 = local44.anInt2048;
			local60 = local44.anInt2094;
		}
		@Pc(74) int local74 = (local60 >> 1) + arg11;
		@Pc(82) int local82 = arg11 + (local60 + 1 >> 1);
		@Pc(88) int local88 = (local57 >> 1) + arg10;
		@Pc(96) int local96 = arg10 + (local57 + 1 >> 1);
		@Pc(100) Class105 local100 = Static9.aClass105Array1[arg4];
		@Pc(124) int local124 = local100.method4453(local74, local88) + local100.method4453(local82, local88) + local100.method4453(local74, local96) + local100.method4453(local82, local96) >> 2;
		@Pc(128) Class2_Sub25 local128 = new Class2_Sub25();
		local128.anInt4088 = arg12;
		local128.anInt4104 = arg11;
		@Pc(148) int local148;
		if (arg0 < arg2) {
			local148 = arg2;
			arg2 = arg0;
			arg0 = local148;
		}
		local128.anInt4095 = arg8;
		local128.anInt4087 = arg10;
		local128.anInt4102 = local15.aByte77;
		local128.anInt4089 = arg9;
		local128.anInt4099 = arg6 + Static6.anInt91;
		local128.anInt4103 = arg5 + Static6.anInt91;
		local128.anInt4093 = arg2 + arg11;
		local128.anInt4091 = arg0 + arg11;
		if (arg7 > arg3) {
			local148 = arg7;
			arg7 = arg3;
			arg3 = local148;
		}
		local128.anInt4096 = arg3 + arg10;
		local128.anInt4098 = arg10 + arg7;
		local128.anInt4097 = local60 * 64 + local128.anInt4104 * 128;
		local128.anInt4105 = local128.anInt4087 * 128 + local57 * 64;
		local128.anInt4094 = local124;
		Static358.aClass180_43.method4909(local128);
		local15.aClass2_Sub25_3 = local128;
	}
}
