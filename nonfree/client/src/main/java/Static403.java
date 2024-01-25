import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static403 {

	@OriginalMember(owner = "client!oh", name = "U", descriptor = "Lclient!rr;")
	public static Class294 aClass294_3;

	@OriginalMember(owner = "client!oh", name = "F", descriptor = "I")
	public static int anInt4294 = -1;

	@OriginalMember(owner = "client!oh", name = "S", descriptor = "Lclient!us;")
	public static final Class344 aClass344_42 = new Class344(81, 8);

	@OriginalMember(owner = "client!oh", name = "V", descriptor = "I")
	public static int anInt4307 = 0;

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIII)I")
	public static int method3680(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 / arg1;
		@Pc(13) int local13 = arg1 - 1 & arg0;
		@Pc(17) int local17 = arg2 / arg1;
		@Pc(23) int local23 = arg2 & arg1 - 1;
		@Pc(28) int local28 = Static354.method5796(local7, local17);
		@Pc(35) int local35 = Static354.method5796(local7 + 1, local17);
		@Pc(42) int local42 = Static354.method5796(local7, local17 + 1);
		@Pc(60) int local60 = Static354.method5796(local7 + 1, local17 + 1);
		@Pc(67) int local67 = Static480.method7069(local35, arg1, local28, local13);
		@Pc(74) int local74 = Static480.method7069(local60, arg1, local42, local13);
		return Static480.method7069(local74, arg1, local67, local23);
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "([I[IILclient!bm;IB)Lclient!jj;")
	public static Class1_Sub2 method3681(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class33_Sub1 arg3, @OriginalArg(4) int arg4) {
		@Pc(23) int local23;
		@Pc(33) int local33;
		@Pc(35) int local35;
		if (!arg3.method2007(Static137.aClass89_8, Static104.aClass82_3)) {
			@Pc(69) int[] local69 = new int[arg4 * arg2];
			for (local23 = 0; local23 < arg2; local23++) {
				local33 = arg1[local23] + arg4 * local23;
				for (local35 = 0; local35 < arg0[local23]; local35++) {
					local69[local33++] = -16777216;
				}
			}
			return new Class1_Sub2(arg3, arg4, arg2, local69);
		}
		@Pc(21) byte[] local21 = new byte[arg2 * arg4];
		for (local23 = 0; local23 < arg2; local23++) {
			local33 = local23 * arg4 + arg1[local23];
			for (local35 = 0; local35 < arg0[local23]; local35++) {
				local21[local33++] = -1;
			}
		}
		return new Class1_Sub2(arg3, arg4, arg2, local21);
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IZI)I")
	public static int method3683(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg1 + arg0 * 57;
		@Pc(20) int local20 = local9 << 13 ^ local9;
		@Pc(34) int local34 = Integer.MAX_VALUE & local20 * (local20 * local20 * 15731 + 789221) + 1376312589;
		return local34 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!oh", name = "g", descriptor = "(I)Z")
	public static boolean method3685() {
		try {
			@Pc(11) Class123 local11 = new Class123();
			@Pc(16) byte[] local16 = local11.method3928(Static48.aByteArray7);
			Static366.method1891(local16);
			return true;
		} catch (@Pc(23) Exception local23) {
			return false;
		}
	}
}
