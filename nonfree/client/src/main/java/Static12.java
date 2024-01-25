import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!ak", name = "d", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!ak", name = "c", descriptor = "I")
	public static int anInt163 = 0;

	@OriginalMember(owner = "client!ak", name = "h", descriptor = "Z")
	public static boolean aBoolean18 = false;

	@OriginalMember(owner = "client!ak", name = "j", descriptor = "Lclient!bg;")
	public static final Class22 aClass22_17 = new Class22(14, 3);

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIIIIB)V")
	public static void method124(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(13) int local13 = arg3 * arg3;
		@Pc(17) int local17 = arg0 * arg0;
		@Pc(21) int local21 = local17 << 1;
		@Pc(29) int local29 = local13 << 1;
		@Pc(33) int local33 = arg0 << 1;
		@Pc(41) int local41 = local21 + local13 * (1 - local33);
		@Pc(49) int local49 = local17 - (local33 - 1) * local29;
		@Pc(53) int local53 = local13 << 2;
		@Pc(57) int local57 = local17 << 2;
		@Pc(65) int local65 = local21 * 3;
		@Pc(73) int local73 = local29 * ((arg0 << 1) - 3);
		@Pc(79) int local79 = local57;
		@Pc(85) int local85 = local53 * (arg0 - 1);
		@Pc(103) int local103;
		@Pc(111) int local111;
		if (Static376.anInt6287 <= arg4 && arg4 <= Static168.anInt3256) {
			local103 = Static332.method4519(Static208.anInt2656, arg3 + arg1, Static354.anInt6186);
			local111 = Static332.method4519(Static208.anInt2656, arg1 - arg3, Static354.anInt6186);
			Static251.method3640(local111, arg2, local103, Static96.anIntArrayArray21[arg4]);
		}
		while (local9 > 0) {
			if (local41 < 0) {
				while (local41 < 0) {
					local41 += local65;
					local49 += local79;
					local79 += local57;
					local65 += local57;
					local7++;
				}
			}
			if (local49 < 0) {
				local41 += local65;
				local49 += local79;
				local79 += local57;
				local65 += local57;
				local7++;
			}
			local49 += -local73;
			local41 += -local85;
			local9--;
			local85 -= local53;
			local73 -= local53;
			local103 = arg4 - local9;
			local111 = local9 + arg4;
			if (Static376.anInt6287 <= local111 && Static168.anInt3256 >= local103) {
				@Pc(219) int local219 = Static332.method4519(Static208.anInt2656, arg1 + local7, Static354.anInt6186);
				@Pc(228) int local228 = Static332.method4519(Static208.anInt2656, arg1 - local7, Static354.anInt6186);
				if (Static376.anInt6287 <= local103) {
					Static251.method3640(local228, arg2, local219, Static96.anIntArrayArray21[local103]);
				}
				if (local111 <= Static168.anInt3256) {
					Static251.method3640(local228, arg2, local219, Static96.anIntArrayArray21[local111]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lclient!uu;B)Lclient!uu;")
	public static Class247 method125(@OriginalArg(0) Class247 arg0) {
		if (arg0.anInt6850 != -1) {
			return Static392.method5121(arg0.anInt6850);
		}
		@Pc(20) int local20 = arg0.anInt6809 >>> 16;
		@Pc(25) Class25 local25 = new Class25(Static325.aClass102_29);
		for (@Pc(30) Class4_Sub43 local30 = (Class4_Sub43) local25.method641(); local30 != null; local30 = (Class4_Sub43) local25.method640()) {
			if (local30.anInt6979 == local20) {
				return Static392.method5121((int) local30.aLong224);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(ILclient!uu;)Lclient!uu;")
	public static Class247 method126(@OriginalArg(1) Class247 arg0) {
		@Pc(6) Class247 local6 = Static53.method906(arg0);
		if (local6 == null) {
			local6 = arg0.aClass247_17;
		}
		return local6;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(B)V")
	public static void method127() {
		Static57.aClass19_7.B(((float) Static323.aClass50_Sub1_1.anInt3436 * 0.1F + 0.7F) * Static350.aFloat187);
		Static57.aClass19_7.T(Static398.anInt6606, Static216.aFloat131, Static434.aFloat228, (float) (Static108.anInt2361 << 0), (float) (Static328.anInt5676 << 0), (float) (Static101.anInt2036 << 0));
		Static57.aClass19_7.method4288(Static396.aClass99_4);
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(II)Lclient!ho;")
	public static Class98 method128(@OriginalArg(0) int arg0) {
		@Pc(8) Class98[] local8 = Static62.method995();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			if (local8[local10].anInt3060 == arg0) {
				return local8[local10];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIIIIZII)V")
	public static void method130(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(10) int local10 = arg5 - arg6;
		@Pc(19) int local19 = arg0 + arg6;
		for (@Pc(21) int local21 = arg0; local21 < local19; local21++) {
			Static251.method3640(arg3, arg4, arg1, Static96.anIntArrayArray21[local21]);
		}
		@Pc(44) int local44 = arg1 - arg6;
		for (@Pc(46) int local46 = arg5; local46 > local10; local46--) {
			Static251.method3640(arg3, arg4, arg1, Static96.anIntArrayArray21[local46]);
		}
		@Pc(64) int local64 = arg3 + arg6;
		for (@Pc(66) int local66 = local19; local66 <= local10; local66++) {
			@Pc(72) int[] local72 = Static96.anIntArrayArray21[local66];
			Static251.method3640(arg3, arg4, local64, local72);
			Static251.method3640(local64, arg2, local44, local72);
			Static251.method3640(local44, arg4, arg1, local72);
		}
	}
}
