import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!hl", name = "g", descriptor = "[I")
	public static final int[] anIntArray195 = new int[500];

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(BI)I")
	public static int method2476(@OriginalArg(1) int arg0) {
		return arg0 >> 11 & 0x7F;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2478(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 < 0 || arg3 < 0 || Static40.anInt1089 - 1 <= arg0 || Static44.anInt7276 - 1 <= arg3) {
			return;
		}
		if (Static263.aClass118ArrayArrayArray2 == null) {
			return;
		}
		@Pc(42) Interface8 local42;
		if (arg2 == 0) {
			local42 = (Interface8) Static321.method4376(arg1, arg0, arg3);
			@Pc(242) Interface8 local242 = (Interface8) Static310.method4313(arg1, arg0, arg3);
			if (local42 != null && arg5 != 2) {
				if (local42 instanceof Class7_Sub4_Sub1) {
					((Class7_Sub4_Sub1) local42).aClass115_4.method2763(arg4);
				} else {
					Static375.method5188(arg4, arg3, arg0, arg6, arg2, arg5, local42.method4808(), arg1);
				}
			}
			if (local242 != null) {
				if (local242 instanceof Class7_Sub4_Sub1) {
					((Class7_Sub4_Sub1) local242).aClass115_4.method2763(arg4);
				} else {
					Static375.method5188(arg4, arg3, arg0, arg6, arg2, arg5, local242.method4808(), arg1);
				}
			}
		} else if (arg2 == 1) {
			local42 = (Interface8) Static113.method4396(arg1, arg0, arg3);
			if (local42 != null) {
				if (local42 instanceof Class7_Sub3_Sub1) {
					((Class7_Sub3_Sub1) local42).aClass115_2.method2763(arg4);
				} else {
					@Pc(58) int local58 = local42.method4808();
					if (arg5 == 4 || arg5 == 5) {
						Static375.method5188(arg4, arg3, arg0, arg6, arg2, 4, local58, arg1);
					} else if (arg5 == 6) {
						Static375.method5188(arg4, arg3, arg0, arg6 + 4, arg2, 4, local58, arg1);
					} else if (arg5 == 7) {
						Static375.method5188(arg4, arg3, arg0, (arg6 + 2 & 0x3) + 4, arg2, 4, local58, arg1);
					} else if (arg5 == 8) {
						Static375.method5188(arg4, arg3, arg0, arg6 + 4, arg2, 4, local58, arg1);
						Static375.method5188(arg4, arg3, arg0, (arg6 + 2 & 0x3) + 4, arg2, 4, local58, arg1);
					}
				}
			}
		} else if (arg2 == 2) {
			local42 = (Interface8) Static314.method4348(arg1, arg0, arg3, pa.class);
			if (local42 != null) {
				if (arg5 == 11) {
					arg5 = 10;
				}
				if (local42 instanceof Class7_Sub2_Sub4) {
					((Class7_Sub2_Sub4) local42).aClass115_1.method2763(arg4);
				} else {
					Static375.method5188(arg4, arg3, arg0, arg6, arg2, arg5, local42.method4808(), arg1);
				}
			}
		} else if (arg2 == 3) {
			local42 = (Interface8) Static166.method2721(arg1, arg0, arg3);
			if (local42 != null) {
				if (local42 instanceof Class7_Sub1_Sub1) {
					((Class7_Sub1_Sub1) local42).aClass115_3.method2763(arg4);
				} else {
					Static375.method5188(arg4, arg3, arg0, arg6, arg2, arg5, local42.method4808(), arg1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(B[B)[B")
	public static byte[] method2480(@OriginalArg(1) byte[] arg0) {
		@Pc(16) Class3_Sub7 local16 = new Class3_Sub7(arg0);
		@Pc(20) int local20 = local16.method2582();
		@Pc(24) int local24 = local16.method2589();
		if (local24 < 0 || Static220.anInt6436 != 0 && Static220.anInt6436 < local24) {
			throw new RuntimeException();
		} else if (local20 == 0) {
			@Pc(91) byte[] local91 = new byte[local24];
			local16.method2580(local24, local91);
			return local91;
		} else {
			@Pc(47) int local47 = local16.method2589();
			if (local47 < 0 || Static220.anInt6436 != 0 && local47 > Static220.anInt6436) {
				throw new RuntimeException();
			}
			@Pc(68) byte[] local68 = new byte[local47];
			if (local20 == 1) {
				Static287.method4064(local68, local47, arg0, local24);
			} else {
				Static179.aClass154_2.method3753(local16, local68);
			}
			return local68;
		}
	}
}
