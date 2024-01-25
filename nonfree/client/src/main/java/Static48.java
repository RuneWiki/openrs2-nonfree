import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!cp", name = "f", descriptor = "I")
	public static int anInt1288;

	@OriginalMember(owner = "client!cp", name = "i", descriptor = "I")
	public static int anInt1290;

	@OriginalMember(owner = "client!cp", name = "g", descriptor = "[I")
	public static final int[] anIntArray59 = new int[4096];

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(ILjava/lang/String;Z)V")
	public static void method956(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(13) Class4_Sub4_Sub18 local13 = Static302.method4961(arg0, 2);
		local13.method4908();
		local13.aString58 = arg1;
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(BI)Z")
	public static boolean method958(@OriginalArg(1) int arg0) {
		return (-arg0 & arg0) == arg0;
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(ILclient!tj;IB)Lclient!bb;")
	public static Class16 method959(@OriginalArg(1) Class193 arg0, @OriginalArg(2) int arg1) {
		@Pc(18) byte[] local18 = arg0.method5047(arg1, 0);
		return local18 == null ? null : new Class16(local18);
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(III)V")
	public static void method960(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class4_Sub4_Sub18 local8 = Static302.method4961(arg0, 1);
		local8.method4908();
		local8.anInt5705 = arg1;
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(BLclient!lf;Ljava/lang/String;)I")
	public static int method961(@OriginalArg(1) Class4_Sub11 arg0, @OriginalArg(2) String arg1) {
		@Pc(6) int local6 = arg0.anInt3768;
		@Pc(10) byte[] local10 = Static241.method4296(arg1);
		arg0.method3399(local10.length);
		arg0.anInt3768 += Static292.aClass211_1.method5470(0, local10.length, arg0.aByteArray55, arg0.anInt3768, local10);
		return arg0.anInt3768 - local6;
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(II)V")
	public static void method962(@OriginalArg(1) int arg0) {
		if (Static261.anInt5280 == 0) {
			Static229.aClass4_Sub1_Sub4_3.method3794(arg0);
		} else {
			Static16.anInt334 = arg0;
		}
	}
}
