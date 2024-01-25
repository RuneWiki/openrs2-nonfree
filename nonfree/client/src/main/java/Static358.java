import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static358 {

	@OriginalMember(owner = "client!vc", name = "n", descriptor = "Lclient!ap;")
	public static final Class11 aClass11_35 = new Class11(39, 3);

	@OriginalMember(owner = "client!vc", name = "q", descriptor = "I")
	public static int anInt2084 = -1;

	@OriginalMember(owner = "client!vc", name = "t", descriptor = "Z")
	public static boolean aBoolean142 = true;

	@OriginalMember(owner = "client!vc", name = "u", descriptor = "I")
	public static int anInt2087 = 0;

	@OriginalMember(owner = "client!vc", name = "v", descriptor = "Lclient!hq;")
	public static final Class101 aClass101_6 = new Class101("", 11);

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Ljava/awt/Canvas;Lclient!tq;IILclient!is;I)Lclient!vc;")
	public static synchronized Class63 method1965(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface9 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class111 arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = -1;
		for (@Pc(9) int local9 = 0; local9 < 8; local9++) {
			if (!Static149.aBooleanArray35[local9]) {
				local7 = local9;
				break;
			}
		}
		if (local7 == -1) {
			throw new IllegalStateException("NFTI");
		}
		@Pc(52) Class63 local52;
		if (arg2 == 0) {
			local52 = Static262.method4041(arg1, local7, arg0);
		} else if (arg2 == 1) {
			local52 = Static110.method2279(arg3, arg0, arg4, arg1, local7);
		} else {
			throw new IllegalArgumentException("UM");
		}
		Static149.aBooleanArray35[local7] = true;
		return local52;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IZ)V")
	public static void method1970(@OriginalArg(1) boolean arg0) {
		if (arg0 && Static338.aClass2_Sub10_Sub8_3 != null) {
			Static315.anInt5369 = Static338.aClass2_Sub10_Sub8_3.anInt1903;
		} else {
			Static315.anInt5369 = -1;
		}
		Static224.aClass30_32 = null;
		Static240.aClass4_18 = null;
		Static338.aClass2_Sub10_Sub8_3 = null;
		Static309.anInt5191 = 0;
		Static338.method3050();
		Static338.aClass30_23.method692();
		Static160.aClass110_3 = null;
		Static59.aClass110_2 = null;
		Static379.aClass110_8 = null;
		Static38.aClass18_1 = null;
		Static373.aClass110_7 = null;
		Static280.anInt4835 = -1;
		Static24.anInt533 = -1;
		Static338.aClass209_3 = null;
		Static361.aClass110_6 = null;
		Static269.aClass110_5 = null;
		Static219.aClass110_4 = null;
		Static46.aClass110_1 = null;
		Static338.aClass226_3.method4907();
		Static338.aClass206_62.method4419(64, 64);
		Static338.aClass226_3.method4912(128, 64);
		Static338.aClass118_4.method2857(64);
		Static341.aClass36_1.method798(64);
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(III)V")
	public static void method2019(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class2_Sub10_Sub2 local10 = Static217.method3611(arg1, 13);
		local10.method864();
		local10.anInt1037 = arg0;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IB)I")
	public static int method2025(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IJ)V")
	public static void method2028(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static183.method3161(arg0 - 1L);
			Static183.method3161(1L);
		} else {
			Static183.method3161(arg0);
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!ic;I)V")
	public static void method2045(@OriginalArg(0) Class10_Sub4 arg0) {
		arg0.aClass1_Sub5_Sub1_1 = null;
		if (Static365.anInt6197 < 20) {
			Static317.aClass154_8.method3481(arg0);
			Static365.anInt6197++;
		}
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(IIIIIII)V")
	public static void method2052(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg2 - arg4;
		@Pc(14) int local14 = arg3 + arg4;
		for (@Pc(16) int local16 = arg3; local16 < local14; local16++) {
			Static315.method4662(arg0, Static15.anIntArrayArray1[local16], arg1, arg5);
		}
		for (@Pc(36) int local36 = arg2; local36 > local9; local36--) {
			Static315.method4662(arg0, Static15.anIntArrayArray1[local36], arg1, arg5);
		}
		@Pc(62) int local62 = arg1 + arg4;
		@Pc(67) int local67 = arg0 - arg4;
		for (@Pc(69) int local69 = local14; local69 <= local9; local69++) {
			@Pc(75) int[] local75 = Static15.anIntArrayArray1[local69];
			Static315.method4662(local62, local75, arg1, arg5);
			Static315.method4662(arg0, local75, local67, arg5);
		}
	}
}
