import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!fo", name = "G", descriptor = "I")
	public static int anInt3166;

	@OriginalMember(owner = "client!fo", name = "N", descriptor = "Lclient!dr;")
	public static final Class73 aClass73_66 = new Class73(67, 6);

	@OriginalMember(owner = "client!fo", name = "P", descriptor = "[I")
	public static final int[] anIntArray193 = new int[32];

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "([JIII[Ljava/lang/Object;)V")
	public static void method2804(@OriginalArg(0) long[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Object[] arg3) {
		if (arg1 <= arg2) {
			return;
		}
		@Pc(15) int local15 = (arg2 + arg1) / 2;
		@Pc(17) int local17 = arg2;
		@Pc(21) long local21 = arg0[local15];
		arg0[local15] = arg0[arg1];
		arg0[arg1] = local21;
		@Pc(35) Object local35 = arg3[local15];
		arg3[local15] = arg3[arg1];
		arg3[arg1] = local35;
		@Pc(55) int local55 = ~local21 == Long.MIN_VALUE ? 0 : 1;
		for (@Pc(57) int local57 = arg2; local57 < arg1; local57++) {
			if (local21 + (long) (local57 & local55) > arg0[local57]) {
				@Pc(74) long local74 = arg0[local57];
				arg0[local57] = arg0[local17];
				arg0[local17] = local74;
				@Pc(88) Object local88 = arg3[local57];
				arg3[local57] = arg3[local17];
				arg3[local17++] = local88;
			}
		}
		arg0[arg1] = arg0[local17];
		arg0[local17] = local21;
		arg3[arg1] = arg3[local17];
		arg3[local17] = local35;
		method2804(arg0, local17 - 1, arg2, arg3);
		method2804(arg0, arg1, local17 + 1, arg3);
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method2805(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		if (Static13.anInt7634 <= arg8 && Static461.anInt7899 >= arg8 && Static13.anInt7634 <= arg2 && arg2 <= Static461.anInt7899 && arg5 >= Static13.anInt7634 && Static461.anInt7899 >= arg5 && Static13.anInt7634 <= arg0 && arg0 <= Static461.anInt7899 && arg6 >= Static583.anInt9478 && arg6 <= Static415.anInt9494 && Static583.anInt9478 <= arg4 && arg4 <= Static415.anInt9494 && Static583.anInt9478 <= arg7 && arg7 <= Static415.anInt9494 && Static583.anInt9478 <= arg3 && arg3 <= Static415.anInt9494) {
			Static338.method5253(arg0, arg3, arg5, arg8, arg1, arg4, arg2, arg7, arg6);
		} else {
			Static339.method5264(arg1, arg8, arg2, arg3, arg6, arg0, arg4, arg5, arg7);
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "([[BILclient!go;)V")
	public static void method2806(@OriginalArg(0) byte[][] arg0, @OriginalArg(2) Class115_Sub1 arg1) {
		@Pc(8) int local8 = Static380.aByteArrayArray22.length;
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			@Pc(16) byte[] local16 = arg0[local10];
			if (local16 != null) {
				@Pc(28) int local28 = (Static365.anIntArray477[local10] >> 8) * 64 - Static39.anInt4952;
				@Pc(38) int local38 = (Static365.anIntArray477[local10] & 0xFF) * 64 - Static138.anInt3088;
				Static482.method6632();
				arg1.method3157(Static579.aClass189Array4, Static240.aClass14_7, local38, local28, local16);
			}
		}
	}
}
