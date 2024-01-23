import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!en", name = "a", descriptor = "I")
	public static int anInt1384 = 0;

	@OriginalMember(owner = "client!en", name = "f", descriptor = "Z")
	public static boolean aBoolean100 = false;

	@OriginalMember(owner = "client!en", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString82 = "green:";

	@OriginalMember(owner = "client!en", name = "i", descriptor = "J")
	public static long aLong53 = 0L;

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(BIIIILclient!wa;)Ljava/awt/Frame;")
	public static Frame method1191(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) Class175 arg3) {
		if (!arg3.method4332()) {
			return null;
		}
		@Pc(21) Class90[] local21 = Static170.method2925(arg3);
		if (local21 == null) {
			return null;
		}
		@Pc(29) boolean local29 = false;
		for (@Pc(31) int local31 = 0; local31 < local21.length; local31++) {
			if (local21[local31].anInt3054 == arg1 && local21[local31].anInt3047 == arg0 && (!local29 || local21[local31].anInt3056 > arg2)) {
				local29 = true;
				arg2 = local21[local31].anInt3056;
			}
		}
		if (!local29) {
			return null;
		}
		@Pc(95) Class116 local95 = arg3.method4336(arg1, arg2, arg0);
		while (local95.anInt3812 == 0) {
			Static48.method934(10L);
		}
		@Pc(107) Frame local107 = (Frame) local95.anObject5;
		if (local107 == null) {
			return null;
		} else if (local95.anInt3812 == 2) {
			Static246.method3819(arg3, local107);
			return null;
		} else {
			return local107;
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIIZ)V")
	public static void method1193(@OriginalArg(3) int arg0, @OriginalArg(4) boolean arg1) {
		Static158.anInt3404 = 104;
		Static209.anInt4179 = 104;
		Static171.anInt3641 = arg0;
		Static140.aClass1_Sub26ArrayArrayArray2 = new Class1_Sub26[4][Static158.anInt3404][Static209.anInt4179];
		Static108.anIntArrayArrayArray7 = new int[4][Static158.anInt3404 + 1][Static209.anInt4179 + 1];
		if (Static277.aBoolean412) {
			Static192.aClass1_Sub32ArrayArray2 = new Class1_Sub32[4][];
		}
		if (arg1) {
			Static273.aClass1_Sub26ArrayArrayArray3 = new Class1_Sub26[1][Static158.anInt3404][Static209.anInt4179];
			Static242.anIntArrayArray31 = new int[Static158.anInt3404][Static209.anInt4179];
			Static255.anIntArrayArrayArray12 = new int[1][Static158.anInt3404 + 1][Static209.anInt4179 + 1];
			if (Static277.aBoolean412) {
				Static44.aClass1_Sub32ArrayArray1 = new Class1_Sub32[1][];
			}
		} else {
			Static273.aClass1_Sub26ArrayArrayArray3 = null;
			Static242.anIntArrayArray31 = null;
			Static255.anIntArrayArrayArray12 = null;
			Static44.aClass1_Sub32ArrayArray1 = null;
		}
		Static284.method4269(false);
		Static126.aClass165Array3 = new Class165[500];
		Static154.anInt3331 = 0;
		Static67.aClass165Array1 = new Class165[500];
		Static95.anInt2222 = 0;
		Static214.anIntArrayArrayArray9 = new int[4][Static158.anInt3404 + 1][Static209.anInt4179 + 1];
		Static82.aClass25Array2 = new Class25[5000];
		Static199.anInt4060 = 0;
		Static35.aClass25Array3 = new Class25[100];
		Static260.aBooleanArrayArray8 = new boolean[Static171.anInt3641 + Static171.anInt3641 + 1][Static171.anInt3641 + Static171.anInt3641 + 1];
		Static135.aBooleanArrayArray4 = new boolean[Static171.anInt3641 + Static171.anInt3641 + 2][Static171.anInt3641 + Static171.anInt3641 + 2];
		Static106.aByteArrayArrayArray17 = new byte[4][Static158.anInt3404][Static209.anInt4179];
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(I)I")
	public static int method1194() {
		return 15;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IB)V")
	public static void method1195() {
		Static127.aClass135_13.method3320(5);
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IB[JI[Ljava/lang/Object;)V")
	public static void method1196(@OriginalArg(0) int arg0, @OriginalArg(2) long[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Object[] arg3) {
		if (arg0 >= arg2) {
			return;
		}
		@Pc(22) int local22 = (arg2 + arg0) / 2;
		@Pc(24) int local24 = arg0;
		@Pc(28) long local28 = arg1[local22];
		arg1[local22] = arg1[arg2];
		arg1[arg2] = local28;
		@Pc(42) Object local42 = arg3[local22];
		arg3[local22] = arg3[arg2];
		arg3[arg2] = local42;
		for (@Pc(54) int local54 = arg0; local54 < arg2; local54++) {
			if (local28 + (long) (local54 & 0x1) > arg1[local54]) {
				@Pc(77) long local77 = arg1[local54];
				arg1[local54] = arg1[local24];
				arg1[local24] = local77;
				@Pc(91) Object local91 = arg3[local54];
				arg3[local54] = arg3[local24];
				arg3[local24++] = local91;
			}
		}
		arg1[arg2] = arg1[local24];
		arg1[local24] = local28;
		arg3[arg2] = arg3[local24];
		arg3[local24] = local42;
		method1196(arg0, arg1, local24 - 1, arg3);
		method1196(local24 + 1, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(ZI)I")
	public static int method1197(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!en", name = "c", descriptor = "(I)[Lclient!kn;")
	public static Class1_Sub2_Sub11_Sub2[] method1198() {
		@Pc(8) Class1_Sub2_Sub11_Sub2[] local8 = new Class1_Sub2_Sub11_Sub2[Static199.anInt4056];
		for (@Pc(17) int local17 = 0; local17 < Static199.anInt4056; local17++) {
			@Pc(28) int local28 = Static44.anIntArray97[local17] * Static31.anIntArray78[local17];
			@Pc(31) int[] local31 = new int[local28];
			@Pc(35) byte[] local35 = Static268.aByteArrayArray13[local17];
			for (@Pc(37) int local37 = 0; local37 < local28; local37++) {
				local31[local37] = Static133.anIntArray266[local35[local37] & 0xFF];
			}
			local8[local17] = new Class1_Sub2_Sub11_Sub2(Static60.anInt1268, Static267.anInt5199, Static268.anIntArray461[local17], Static289.anIntArray543[local17], Static31.anIntArray78[local17], Static44.anIntArray97[local17], local31);
		}
		Static91.method1595();
		return local8;
	}
}
