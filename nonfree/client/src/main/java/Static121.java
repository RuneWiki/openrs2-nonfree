import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!hq", name = "E", descriptor = "Lclient!ir;")
	public static Class100 aClass100_56;

	@OriginalMember(owner = "client!hq", name = "J", descriptor = "F")
	public static float aFloat19;

	@OriginalMember(owner = "client!hq", name = "D", descriptor = "[S")
	public static short[] aShortArray68 = new short[256];

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "([Ljava/lang/Object;B[III)V")
	public static void method2138(@OriginalArg(0) Object[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 <= arg3) {
			return;
		}
		@Pc(14) int local14 = (arg3 + arg2) / 2;
		@Pc(16) int local16 = arg3;
		@Pc(20) int local20 = arg1[local14];
		arg1[local14] = arg1[arg2];
		arg1[arg2] = local20;
		@Pc(34) Object local34 = arg0[local14];
		arg0[local14] = arg0[arg2];
		arg0[arg2] = local34;
		for (@Pc(46) int local46 = arg3; local46 < arg2; local46++) {
			if (arg1[local46] < (local46 & 0x1) + local20) {
				@Pc(61) int local61 = arg1[local46];
				arg1[local46] = arg1[local16];
				arg1[local16] = local61;
				@Pc(75) Object local75 = arg0[local46];
				arg0[local46] = arg0[local16];
				arg0[local16++] = local75;
			}
		}
		arg1[arg2] = arg1[local16];
		arg1[local16] = local20;
		arg0[arg2] = arg0[local16];
		arg0[local16] = local34;
		method2138(arg0, arg1, local16 - 1, arg3);
		method2138(arg0, arg1, arg2, local16 + 1);
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(BI)V")
	public static void method2139(@OriginalArg(1) int arg0) {
		@Pc(12) Class3_Sub7_Sub11 local12 = Static116.method2029(arg0, 3);
		local12.method2502();
	}

	@OriginalMember(owner = "client!hq", name = "b", descriptor = "(II)V")
	public static void method2143(@OriginalArg(0) int arg0) {
		Static251.anInt4977 = 1000 / arg0;
	}
}
