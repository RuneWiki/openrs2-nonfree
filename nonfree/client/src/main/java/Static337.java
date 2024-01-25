import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static337 {

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "[[I")
	public static int[][] anIntArrayArray50;

	@OriginalMember(owner = "client!qr", name = "h", descriptor = "Lclient!tc;")
	public static Class232 aClass232_6;

	@OriginalMember(owner = "client!qr", name = "j", descriptor = "I")
	public static int anInt5743;

	@OriginalMember(owner = "client!qr", name = "I", descriptor = "[I")
	public static int[] anIntArray393;

	@OriginalMember(owner = "client!qr", name = "K", descriptor = "I")
	public static int anInt5761;

	@OriginalMember(owner = "client!qr", name = "V", descriptor = "Lclient!fo;")
	public static Class82 aClass82_79;

	@OriginalMember(owner = "client!qr", name = "m", descriptor = "Z")
	public static boolean aBoolean654 = false;

	@OriginalMember(owner = "client!qr", name = "J", descriptor = "Ljava/lang/String;")
	public static String aString67 = null;

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(ILclient!jk;Lclient!jk;)V")
	public static void method4519(@OriginalArg(1) Class124 arg0, @OriginalArg(2) Class124 arg1) {
		Static52.method867(Static181.aClass103_135);
		Static18.aClass1_Sub28_Sub1_1.method5347(arg0.anInt3348);
		Static18.aClass1_Sub28_Sub1_1.method5347(arg1.anInt3348);
		Static18.aClass1_Sub28_Sub1_1.method5393(arg1.anInt3430);
		Static18.aClass1_Sub28_Sub1_1.method5359(arg1.anInt3405);
		Static18.aClass1_Sub28_Sub1_1.method5395(arg0.anInt3430);
		Static18.aClass1_Sub28_Sub1_1.method5350(arg0.anInt3405);
	}

	@OriginalMember(owner = "client!qr", name = "b", descriptor = "(I)V")
	public static void method4523() {
		for (@Pc(11) int local11 = 0; local11 < Static328.anInt5608; local11++) {
			@Pc(17) int local17 = Static31.anIntArray30[local11];
			@Pc(21) Class25_Sub5_Sub1_Sub1 local21 = Static87.aClass25_Sub5_Sub1_Sub1Array6[local17];
			if (local21 != null) {
				Static232.method3334(local21.aClass54_1.anInt1348, local21);
			}
		}
	}

	@OriginalMember(owner = "client!qr", name = "b", descriptor = "(III)Lclient!uj;")
	public static Class25_Sub4 method4524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class169 local7 = Static359.aClass169ArrayArrayArray5[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass25_Sub4_2;
	}
}
