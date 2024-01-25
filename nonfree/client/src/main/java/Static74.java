import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!ei", name = "F", descriptor = "Lclient!tj;")
	public static Class193 aClass193_21;

	@OriginalMember(owner = "client!ei", name = "P", descriptor = "I")
	public static int anInt1924;

	@OriginalMember(owner = "client!ei", name = "t", descriptor = "Lclient!dj;")
	public static final Class43 aClass43_10 = new Class43(16);

	@OriginalMember(owner = "client!ei", name = "D", descriptor = "Z")
	public static boolean aBoolean135 = false;

	@OriginalMember(owner = "client!ei", name = "E", descriptor = "Lclient!lm;")
	public static final Class124 aClass124_1 = new Class124(64);

	@OriginalMember(owner = "client!ei", name = "L", descriptor = "I")
	public static int anInt1921 = 2;

	@OriginalMember(owner = "client!ei", name = "O", descriptor = "Lclient!dj;")
	public static final Class43 aClass43_11 = new Class43(16);

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(I[SI[Ljava/lang/String;I)V")
	public static void method1739(@OriginalArg(0) int arg0, @OriginalArg(1) short[] arg1, @OriginalArg(3) String[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= arg0) {
			return;
		}
		@Pc(14) int local14 = (arg0 + arg3) / 2;
		@Pc(16) int local16 = arg3;
		@Pc(20) String local20 = arg2[local14];
		arg2[local14] = arg2[arg0];
		arg2[arg0] = local20;
		@Pc(34) short local34 = arg1[local14];
		arg1[local14] = arg1[arg0];
		arg1[arg0] = local34;
		for (@Pc(46) int local46 = arg3; local46 < arg0; local46++) {
			if (local20 == null || arg2[local46] != null && (local46 & 0x1) > arg2[local46].compareTo(local20)) {
				@Pc(71) String local71 = arg2[local46];
				arg2[local46] = arg2[local16];
				arg2[local16] = local71;
				@Pc(85) short local85 = arg1[local46];
				arg1[local46] = arg1[local16];
				arg1[local16++] = local85;
			}
		}
		arg2[arg0] = arg2[local16];
		arg2[local16] = local20;
		arg1[arg0] = arg1[local16];
		arg1[local16] = local34;
		method1739(local16 - 1, arg1, arg2, arg3);
		method1739(arg0, arg1, arg2, local16 + 1);
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "([I[ILclient!pn;[IB)V")
	public static void method1741(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class8_Sub1_Sub2_Sub2 arg2, @OriginalArg(3) int[] arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(13) int local13 = arg0[local7];
			@Pc(17) int local17 = arg3[local7];
			@Pc(21) int local21 = arg1[local7];
			for (@Pc(23) int local23 = 0; local17 != 0 && local23 < arg2.aClass202Array3.length; local23++) {
				if ((local17 & 0x1) != 0) {
					if (local13 == -1) {
						arg2.aClass202Array3[local23] = null;
					} else {
						@Pc(39) Class14 local39 = Static225.method4042(local13);
						@Pc(42) int local42 = local39.anInt351;
						@Pc(47) Class202 local47 = arg2.aClass202Array3[local23];
						if (local47 != null) {
							if (local13 == local47.anInt6226) {
								if (local42 == 0) {
									local47 = arg2.aClass202Array3[local23] = null;
								} else if (local42 == 1) {
									local47.anInt6230 = 0;
									local47.anInt6229 = local21;
									local47.anInt6227 = 0;
									local47.anInt6233 = 0;
									local47.anInt6228 = 1;
									Static167.method3265(arg2.anInt6701, arg2.anInt6702, 0, false, local39);
								} else if (local42 == 2) {
									local47.anInt6230 = 0;
								}
							} else if (local39.anInt344 >= Static225.method4042(local47.anInt6226).anInt344) {
								local47 = arg2.aClass202Array3[local23] = null;
							}
						}
						if (local47 == null) {
							local47 = arg2.aClass202Array3[local23] = new Class202();
							local47.anInt6228 = 1;
							local47.anInt6230 = 0;
							local47.anInt6229 = local21;
							local47.anInt6227 = 0;
							local47.anInt6226 = local13;
							local47.anInt6233 = 0;
							Static167.method3265(arg2.anInt6701, arg2.anInt6702, 0, false, local39);
						}
					}
				}
				local17 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(II)V")
	public static void method1742(@OriginalArg(1) int arg0) {
		@Pc(8) Class4_Sub4_Sub18 local8 = Static302.method4961(arg0, 10);
		local8.method4902();
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "(B)V")
	public static void method1744() {
		Static354.method5641(false);
		if (Static233.anInt4713 >= 0 && Static233.anInt4713 != 0) {
			Static106.method2349(Static233.anInt4713);
			Static233.anInt4713 = -1;
		}
	}
}
