import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!uc", name = "m", descriptor = "[Lclient!sc;")
	public static Class1_Sub2_Sub2_Sub4[] aClass1_Sub2_Sub2_Sub4Array11;

	@OriginalMember(owner = "client!uc", name = "M", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!uc", name = "l", descriptor = "Lclient!tg;")
	private static Class81 aClass81_1348 = Static120.method2057("Error connecting to server)3");

	@OriginalMember(owner = "client!uc", name = "n", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1349 = Static120.method2057("ams");

	@OriginalMember(owner = "client!uc", name = "w", descriptor = "[I")
	public static int[] anIntArray399 = new int[50];

	@OriginalMember(owner = "client!uc", name = "y", descriptor = "Lclient!tg;")
	private static Class81 aClass81_1350 = Static120.method2057("FULL");

	@OriginalMember(owner = "client!uc", name = "D", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1351 = aClass81_1350;

	@OriginalMember(owner = "client!uc", name = "G", descriptor = "I")
	public static final int anInt3822 = 3353893;

	@OriginalMember(owner = "client!uc", name = "L", descriptor = "Lclient!tg;")
	private static Class81 aClass81_1354 = Static120.method2057("Your ignore list is full)3 Max of 100 users)3");

	@OriginalMember(owner = "client!uc", name = "I", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1352 = aClass81_1354;

	@OriginalMember(owner = "client!uc", name = "K", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1353 = aClass81_1348;

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILclient!vb;)V")
	public static void method2906(@OriginalArg(1) Class82 arg0) {
		Static181.aClass82_72 = arg0;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IZI)Lclient!rh;")
	public static Class77 method2908(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class77 local12 = Static41.method800(arg0);
		if (arg1 == -1) {
			return local12;
		} else if (local12 == null || local12.aClass77Array1 == null || arg1 >= local12.aClass77Array1.length) {
			return null;
		} else {
			return local12.aClass77Array1[arg1];
		}
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(I)V")
	public static void method2910() {
		anIntArrayArrayArray8 = null;
		aClass81_1349 = null;
		aClass1_Sub2_Sub2_Sub4Array11 = null;
		aClass81_1352 = null;
		aClass81_1350 = null;
		aClass81_1353 = null;
		aClass81_1351 = null;
		anIntArray399 = null;
		aClass81_1354 = null;
		aClass81_1348 = null;
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(IZI)I")
	public static int method2911(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) int local3 = arg0 >>> 31;
		return (local3 + arg0) / arg1 - local3;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIII)I")
	public static int method2912(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static43.aByteArrayArrayArray2[arg2][arg0][arg1] & 0x8) == 0) {
			return arg2 <= 0 || (Static43.aByteArrayArrayArray2[1][arg0][arg1] & 0x2) == 0 ? arg2 : arg2 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZLclient!ka;)V")
	public static void method2913(@OriginalArg(1) Class1_Sub8 arg0) {
		@Pc(12) byte[] local12 = new byte[24];
		if (Static19.aClass67_1 != null) {
			@Pc(28) int local28;
			try {
				Static19.aClass67_1.method2168(0L);
				Static19.aClass67_1.method2170(local12);
				for (local28 = 0; local28 < 24 && local12[local28] == 0; local28++) {
				}
				if (local28 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(50) Exception local50) {
				for (local28 = 0; local28 < 24; local28++) {
					local12[local28] = -1;
				}
			}
		}
		arg0.method352(24, local12);
	}
}
