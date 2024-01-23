import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!qf", name = "h", descriptor = "Lclient!eg;")
	public static Class33 aClass33_18;

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "[I")
	public static int[] anIntArray753 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!qf", name = "d", descriptor = "Lclient!qe;")
	private static Class78 aClass78_847 = Static199.method3560("flash3:");

	@OriginalMember(owner = "client!qf", name = "f", descriptor = "Lclient!qe;")
	public static Class78 aClass78_848 = aClass78_847;

	@OriginalMember(owner = "client!qf", name = "g", descriptor = "Lclient!qe;")
	public static Class78 aClass78_849 = Static199.method3560("settings");

	@OriginalMember(owner = "client!qf", name = "k", descriptor = "[I")
	public static int[] anIntArray754 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@OriginalMember(owner = "client!qf", name = "l", descriptor = "Lclient!qe;")
	public static Class78 aClass78_850 = Static199.method3560("Lade Schrifts-=tze )2 ");

	@OriginalMember(owner = "client!qf", name = "q", descriptor = "Lclient!qe;")
	public static Class78 aClass78_851 = aClass78_847;

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IB)Z")
	public static boolean method3774(@OriginalArg(0) int arg0) {
		return (arg0 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIII)V")
	public static void method3775(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static73.anInt1576 <= arg1 && arg1 <= Static137.anInt3137) {
			@Pc(15) int local15 = Static80.method1342(arg3, Static6.anInt187, Static101.anInt2213);
			@Pc(21) int local21 = Static80.method1342(arg2, Static6.anInt187, Static101.anInt2213);
			Static160.method2881(arg1, local15, local21, arg0);
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Ljava/lang/String;Z)Lclient!qe;")
	public static Class78 method3776(@OriginalArg(0) String arg0) {
		@Pc(14) byte[] local14;
		try {
			local14 = arg0.getBytes("ISO-8859-1");
		} catch (@Pc(16) UnsupportedEncodingException local16) {
			local14 = arg0.getBytes();
		}
		@Pc(23) Class78 local23 = new Class78();
		local23.aByteArray48 = local14;
		local23.anInt3831 = 0;
		for (@Pc(31) int local31 = 0; local31 < local14.length; local31++) {
			if (local14[local31] != 0) {
				local14[local23.anInt3831++] = local14[local31];
			}
		}
		return local23;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3780(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg5 < 0 || arg3 < 0 || arg5 >= 103 || arg3 >= 103) {
			return;
		}
		@Pc(37) int local37;
		if (arg1 == 0) {
			@Pc(27) Class27 local27 = Static177.method3245(arg4, arg5, arg3);
			if (local27 != null) {
				local37 = (int) (local27.aLong30 >>> 32) & Integer.MAX_VALUE;
				if (arg6 == 2) {
					local27.aClass5_2 = new Class5_Sub1(local37, 2, arg2 + 4, arg4, arg5, arg3, arg0, false, local27.aClass5_2);
					local27.aClass5_3 = new Class5_Sub1(local37, 2, arg2 + 1 & 0x3, arg4, arg5, arg3, arg0, false, local27.aClass5_3);
				} else {
					local27.aClass5_2 = new Class5_Sub1(local37, arg6, arg2, arg4, arg5, arg3, arg0, false, local27.aClass5_2);
				}
			}
		}
		if (arg1 == 1) {
			@Pc(104) Class104 local104 = Static187.method3449(arg4, arg5, arg3);
			if (local104 != null) {
				local37 = (int) (local104.aLong175 >>> 32) & Integer.MAX_VALUE;
				if (arg6 == 4 || arg6 == 5) {
					local104.aClass5_10 = new Class5_Sub1(local37, 4, arg2, arg4, arg5, arg3, arg0, false, local104.aClass5_10);
				} else if (arg6 == 6) {
					local104.aClass5_10 = new Class5_Sub1(local37, 4, arg2 + 4, arg4, arg5, arg3, arg0, false, local104.aClass5_10);
				} else if (arg6 == 7) {
					local104.aClass5_10 = new Class5_Sub1(local37, 4, (arg2 + 2 & 0x3) + 4, arg4, arg5, arg3, arg0, false, local104.aClass5_10);
				} else if (arg6 == 8) {
					local104.aClass5_10 = new Class5_Sub1(local37, 4, arg2 + 4, arg4, arg5, arg3, arg0, false, local104.aClass5_10);
					local104.aClass5_9 = new Class5_Sub1(local37, 4, (arg2 + 2 & 0x3) + 4, arg4, arg5, arg3, arg0, false, local104.aClass5_9);
				}
			}
		}
		if (arg1 == 2) {
			if (arg6 == 11) {
				arg6 = 10;
			}
			@Pc(247) Class100 local247 = Static50.method650(arg4, arg5, arg3);
			if (local247 != null) {
				local247.aClass5_8 = new Class5_Sub1((int) (local247.aLong169 >>> 32) & Integer.MAX_VALUE, arg6, arg2, arg4, arg5, arg3, arg0, false, local247.aClass5_8);
			}
		}
		if (arg1 != 3) {
			return;
		}
		@Pc(280) Class106 local280 = Static75.method1251(arg4, arg5, arg3);
		if (local280 != null) {
			local280.aClass5_11 = new Class5_Sub1((int) (local280.aLong176 >>> 32) & Integer.MAX_VALUE, 22, arg2, arg4, arg5, arg3, arg0, false, local280.aClass5_11);
			return;
		}
	}
}
