import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static236 {

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "[Lclient!rf;")
	public static Class154[] aClass154Array1;

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
	public static int anInt4452 = 0;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "([Ljava/lang/String;ZI[SI)V")
	public static void method3689(@OriginalArg(0) String[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) short[] arg2, @OriginalArg(4) int arg3) {
		if (arg1 <= arg3) {
			return;
		}
		@Pc(26) int local26 = (arg3 + arg1) / 2;
		@Pc(28) int local28 = arg3;
		@Pc(32) String local32 = arg0[local26];
		arg0[local26] = arg0[arg1];
		arg0[arg1] = local32;
		@Pc(46) short local46 = arg2[local26];
		arg2[local26] = arg2[arg1];
		arg2[arg1] = local46;
		for (@Pc(58) int local58 = arg3; local58 < arg1; local58++) {
			if (local32 == null || arg0[local58] != null && arg0[local58].compareTo(local32) < (local58 & 0x1)) {
				@Pc(88) String local88 = arg0[local58];
				arg0[local58] = arg0[local28];
				arg0[local28] = local88;
				@Pc(102) short local102 = arg2[local58];
				arg2[local58] = arg2[local28];
				arg2[local28++] = local102;
			}
		}
		arg0[arg1] = arg0[local28];
		arg0[local28] = local32;
		arg2[arg1] = arg2[local28];
		arg2[local28] = local46;
		method3689(arg0, local28 - 1, arg2, arg3);
		method3689(arg0, arg1, arg2, local28 + 1);
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V")
	public static void method3690() {
		Static268.aClass26_54.method511();
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!fd;Ljava/lang/String;I)I")
	public static int method3692(@OriginalArg(0) Class4_Sub10 arg0, @OriginalArg(1) String arg1) {
		@Pc(6) int local6 = arg0.anInt5713;
		@Pc(10) byte[] local10 = Static66.method1061(arg1);
		arg0.method4614(local10.length);
		arg0.anInt5713 += Static62.aClass131_1.method3245(arg0.anInt5713, 0, arg0.aByteArray71, local10, local10.length);
		return arg0.anInt5713 - local6;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)Lclient!ke;")
	public static Class4_Sub3_Sub5_Sub2 method3693(@OriginalArg(1) int arg0) {
		@Pc(6) Class4_Sub3_Sub5_Sub2 local6 = (Class4_Sub3_Sub5_Sub2) Static18.aClass26_3.method518((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(22) byte[] local22 = Static152.aClass58_67.method1372(arg0, 0);
		local6 = new Class4_Sub3_Sub5_Sub2(local22);
		local6.method2274(Static125.aClass56Array3, null);
		Static18.aClass26_3.method510(local6, (long) arg0);
		return local6;
	}
}
