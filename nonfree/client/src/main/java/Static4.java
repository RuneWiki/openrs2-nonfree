import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ad", name = "I", descriptor = "Lclient!vb;")
	public static Class7_Sub1 aClass7_Sub1_1;

	@OriginalMember(owner = "client!ad", name = "r", descriptor = "I")
	public static volatile int anInt88 = 0;

	@OriginalMember(owner = "client!ad", name = "t", descriptor = "[I")
	public static int[] anIntArray12 = new int[50];

	@OriginalMember(owner = "client!ad", name = "y", descriptor = "Lclient!kh;")
	public static Class60 aClass60_41 = Static200.method3116(" loggt sich ein)3");

	@OriginalMember(owner = "client!ad", name = "A", descriptor = "J")
	public static long aLong4 = 0L;

	@OriginalMember(owner = "client!ad", name = "E", descriptor = "I")
	public static int anInt97 = 0;

	@OriginalMember(owner = "client!ad", name = "G", descriptor = "Lclient!kh;")
	public static Class60 aClass60_42 = null;

	@OriginalMember(owner = "client!ad", name = "H", descriptor = "I")
	public static int anInt99 = 0;

	@OriginalMember(owner = "client!ad", name = "N", descriptor = "I")
	public static int anInt104 = 0;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!ah;B)Z")
	public static boolean method77(@OriginalArg(0) Class6 arg0) {
		if (arg0.anInt245 == 205) {
			anInt99 = 250;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(III)Lclient!w;")
	public static Class106 method79(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub22 local7 = Static100.aClass1_Sub22ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass106_1;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(BI)V")
	public static void method80(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub27 local10 = (Class1_Sub27) Static121.aClass33_7.method1071((long) arg0);
		if (local10 != null) {
			local10.method3530();
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)Z")
	public static boolean method81(@OriginalArg(1) int arg0) {
		if (arg0 >= 97 && arg0 <= 122) {
			return true;
		} else if (arg0 >= 65 && arg0 <= 90) {
			return true;
		} else {
			return arg0 >= 48 && arg0 <= 57;
		}
	}
}
