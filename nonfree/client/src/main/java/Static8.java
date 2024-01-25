import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ak", name = "m", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray1;

	@OriginalMember(owner = "client!ak", name = "u", descriptor = "I")
	public static int anInt89 = 0;

	@OriginalMember(owner = "client!ak", name = "J", descriptor = "[I")
	public static final int[] anIntArray12 = new int[25];

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IZ)Lclient!qn;")
	public static Class167 method76(@OriginalArg(0) int arg0) {
		@Pc(10) Class167 local10 = (Class167) Static210.aClass26_39.method332((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static314.aClass144_35.method3896(arg0, 1);
		local10 = new Class167();
		if (local20 != null) {
			local10.method4455(arg0, new Class11_Sub25(local20));
		}
		Static210.aClass26_39.method330((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "(I)V")
	public static void method77() {
		Static276.anInt5528 = -1;
		Static132.anInt2474 = -1;
		Static9.anInt153 = 0;
		Static91.anInt1786 = -1;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIIIIII)V")
	public static void method80(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class177 local3 = new Class177();
		local3.anInt5478 = arg1 >> 7;
		local3.anInt5486 = arg2 >> 7;
		local3.anInt5479 = arg3 >> 7;
		local3.anInt5487 = arg4 >> 7;
		local3.anInt5484 = arg0;
		local3.anInt5493 = arg1;
		local3.anInt5488 = arg2;
		local3.anInt5495 = arg3;
		local3.anInt5496 = arg4;
		local3.anInt5485 = arg5;
		local3.anInt5494 = arg6;
		Static135.aClass177Array2[Static339.anInt6547++] = local3;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(II)S")
	public static short method81(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 >> 10 & 0x3F;
		@Pc(20) int local20 = arg0 >> 3 & 0x70;
		@Pc(24) int local24 = arg0 & 0x7F;
		@Pc(44) int local44 = local24 <= 64 ? local20 * local24 >> 7 : local20 * (127 - local24) >> 7;
		@Pc(48) int local48 = local24 + local44;
		@Pc(56) int local56;
		if (local48 == 0) {
			local56 = local44 << 1;
		} else {
			local56 = (local44 << 8) / local48;
		}
		return (short) (local56 >> 4 << 7 | local9 << 10 | local48);
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IILclient!nq;)Lclient!pi;")
	public static Class11_Sub32 method82(@OriginalArg(1) int arg0, @OriginalArg(2) Class144 arg1) {
		@Pc(8) byte[] local8 = arg1.method3908(arg0);
		return local8 == null ? null : new Class11_Sub32(local8);
	}
}
