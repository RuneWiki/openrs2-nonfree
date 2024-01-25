import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static418 {

	@OriginalMember(owner = "client!uu", name = "d", descriptor = "Z")
	public static boolean aBoolean473 = false;

	@OriginalMember(owner = "client!uu", name = "e", descriptor = "[J")
	public static final long[] aLongArray9 = new long[32];

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(Ljava/lang/Object;ZI)[B")
	public static byte[] method5565(@OriginalArg(0) Object arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg0;
			return arg1 ? Static373.method5168(local13) : local13;
		} else if (arg0 instanceof Class136) {
			@Pc(27) Class136 local27 = (Class136) arg0;
			return local27.method3293();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(IIBIIII)V")
	public static void method5567(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg4 - arg5;
		@Pc(13) int local13 = arg5 + arg1;
		for (@Pc(19) int local19 = arg1; local19 < local13; local19++) {
			Static59.method1261(Static163.anIntArrayArray35[local19], arg2, arg3, arg0);
		}
		@Pc(38) int local38 = arg2 - arg5;
		for (@Pc(40) int local40 = arg4; local40 > local9; local40--) {
			Static59.method1261(Static163.anIntArrayArray35[local40], arg2, arg3, arg0);
		}
		@Pc(58) int local58 = arg5 + arg3;
		for (@Pc(60) int local60 = local13; local60 <= local9; local60++) {
			@Pc(66) int[] local66 = Static163.anIntArrayArray35[local60];
			Static59.method1261(local66, local58, arg3, arg0);
			Static59.method1261(local66, arg2, local38, arg0);
		}
	}

	@OriginalMember(owner = "client!uu", name = "b", descriptor = "(I)V")
	public static void method5569() {
		@Pc(5) int local5 = 0;
		if (Static38.aClass135_Sub1_1.method4237(Static143.anInt2766)) {
			local5 = 55;
		}
		if (!Static38.aClass135_Sub1_1.aBoolean357) {
			local5 |= 0x40;
		}
		Static370.method5070(local5);
		Static349.aClass115_4.method2768(local5);
		Static165.aClass19_1.method562(local5);
		Static238.aClass116_2.method2818(local5);
		Static67.aClass263_2.method5785(local5);
		Static164.method2647(local5);
		Static251.method3761(local5);
		Static193.method2986(local5);
		Static421.method1796(local5);
		Static266.method5704();
	}
}
