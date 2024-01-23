import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static243 {

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray13;

	@OriginalMember(owner = "client!rn", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString160;

	@OriginalMember(owner = "client!rn", name = "j", descriptor = "Lclient!cg;")
	public static Class22 aClass22_81;

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "J")
	public static long aLong167 = 0L;

	@OriginalMember(owner = "client!rn", name = "c", descriptor = "Z")
	public static boolean aBoolean299 = false;

	@OriginalMember(owner = "client!rn", name = "e", descriptor = "Z")
	public static boolean aBoolean300 = false;

	@OriginalMember(owner = "client!rn", name = "g", descriptor = "[S")
	public static short[] aShortArray80 = new short[] { 960, 957, -21568, -21571, 22464 };

	@OriginalMember(owner = "client!rn", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString161 = "Close";

	@OriginalMember(owner = "client!rn", name = "n", descriptor = "[[B")
	public static byte[][] aByteArrayArray12 = new byte[50][];

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(I[BI)I")
	public static int method3736(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		return Static299.method4597(arg1, 0, arg0);
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(ZB)V")
	public static void method3737(@OriginalArg(0) boolean arg0) {
		@Pc(12) Class4_Sub26 local12;
		for (local12 = (Class4_Sub26) Static80.aClass17_11.method613(); local12 != null; local12 = (Class4_Sub26) Static80.aClass17_11.method607()) {
			if (local12.aClass4_Sub6_Sub1_3 != null) {
				Static10.aClass4_Sub6_Sub4_1.method3730(local12.aClass4_Sub6_Sub1_3);
				local12.aClass4_Sub6_Sub1_3 = null;
			}
			if (local12.aClass4_Sub6_Sub1_2 != null) {
				Static10.aClass4_Sub6_Sub4_1.method3730(local12.aClass4_Sub6_Sub1_2);
				local12.aClass4_Sub6_Sub1_2 = null;
			}
			local12.method4690();
		}
		if (!arg0) {
			return;
		}
		for (local12 = (Class4_Sub26) Static17.aClass17_2.method613(); local12 != null; local12 = (Class4_Sub26) Static17.aClass17_2.method607()) {
			if (local12.aClass4_Sub6_Sub1_3 != null) {
				Static10.aClass4_Sub6_Sub4_1.method3730(local12.aClass4_Sub6_Sub1_3);
				local12.aClass4_Sub6_Sub1_3 = null;
			}
			local12.method4690();
		}
		for (local12 = (Class4_Sub26) Static5.aClass163_1.method4192(); local12 != null; local12 = (Class4_Sub26) Static5.aClass163_1.method4183()) {
			if (local12.aClass4_Sub6_Sub1_3 != null) {
				Static10.aClass4_Sub6_Sub4_1.method3730(local12.aClass4_Sub6_Sub1_3);
				local12.aClass4_Sub6_Sub1_3 = null;
			}
			local12.method4690();
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(II)I")
	public static int method3739(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return 0;
		}
		@Pc(17) Class4_Sub33 local17 = (Class4_Sub33) Static49.aClass163_15.method4188((long) arg0);
		if (local17 == null) {
			return Static199.method2421(arg0).anInt2969;
		}
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 0; local29 < local17.anIntArray463.length; local29++) {
			if (local17.anIntArray463[local29] == -1) {
				local27++;
			}
		}
		return local27 + Static199.method2421(arg0).anInt2969 - local17.anIntArray463.length;
	}
}
