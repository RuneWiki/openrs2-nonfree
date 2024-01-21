import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!g", name = "b", descriptor = "J")
	public static long aLong75;

	@OriginalMember(owner = "client!g", name = "e", descriptor = "I")
	public static int anInt1375;

	@OriginalMember(owner = "client!g", name = "h", descriptor = "[I")
	public static int[] anIntArray90 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V")
	public static void method888() {
		Static72.aClass84_3 = new Class84();
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(I)V")
	public static void method889() {
		anIntArray90 = null;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ILclient!ai;)V")
	public static void method890(@OriginalArg(1) Class6 arg0) {
		if (Static65.aClass2_Sub5Array1 == null) {
			return;
		}
		@Pc(10) int local10 = 0;
		@Pc(14) long local14 = arg0.method129();
		if (local14 == 0L) {
			return;
		}
		while (Static65.aClass2_Sub5Array1.length > local10 && Static65.aClass2_Sub5Array1[local10].aLong241 != local14) {
			local10++;
		}
		if (Static65.aClass2_Sub5Array1.length > local10 && Static65.aClass2_Sub5Array1[local10] != null) {
			Static66.aClass2_Sub13_Sub1_2.method1455(236);
			Static66.aClass2_Sub13_Sub1_2.method1418(Static65.aClass2_Sub5Array1[local10].aLong241);
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(I[B)Lclient!te;")
	public static Class2_Sub3_Sub2_Sub4_Sub1 method891(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(18) Class2_Sub3_Sub2_Sub4_Sub1 local18 = new Class2_Sub3_Sub2_Sub4_Sub1(arg0, Static76.anIntArray121, Static14.anIntArray16, Static88.anIntArray153, Static131.anIntArray278, Static127.anIntArray258, Static167.aByteArrayArray10);
			Static49.method886();
			return local18;
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Lclient!c;Lclient!ai;Lclient!c;Lclient!ai;B)Lclient!te;")
	public static Class2_Sub3_Sub2_Sub4_Sub1 method892(@OriginalArg(0) Class10 arg0, @OriginalArg(1) Class6 arg1, @OriginalArg(2) Class10 arg2, @OriginalArg(3) Class6 arg3) {
		@Pc(13) int local13 = arg0.method1602(arg3);
		@Pc(19) int local19 = arg0.method1600(local13, arg1);
		return Static131.method2047(local19, arg0, arg2, local13);
	}

	@OriginalMember(owner = "client!g", name = "c", descriptor = "(I)V")
	public static void method893() {
		Static130.aClass17_18.method509();
	}
}
