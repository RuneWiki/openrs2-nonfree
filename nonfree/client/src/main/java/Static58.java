import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!cs", name = "J", descriptor = "Lclient!hh;")
	public static Class109 aClass109_22;

	@OriginalMember(owner = "client!cs", name = "P", descriptor = "I")
	public static int anInt1051;

	@OriginalMember(owner = "client!cs", name = "B", descriptor = "[I")
	public static final int[] anIntArray53 = new int[1000];

	@OriginalMember(owner = "client!cs", name = "L", descriptor = "Z")
	public static boolean aBoolean88 = false;

	@OriginalMember(owner = "client!cs", name = "N", descriptor = "Lclient!gf;")
	public static final Class96 aClass96_20 = new Class96("slide:", "gleiten:", "glissement:", "deslizamento:");

	@OriginalMember(owner = "client!cs", name = "W", descriptor = "[I")
	public static final int[] anIntArray54 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(Lclient!ti;I)Lclient!qp;")
	public static Class9_Sub4 method890(@OriginalArg(0) Class1_Sub14 arg0) {
		return new Class9_Sub4(arg0.method4531(), arg0.method4531(), arg0.method4531(), arg0.method4531(), arg0.method4496(), arg0.method4496(), arg0.method4548());
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(IB)V")
	public static void method894(@OriginalArg(0) int arg0) {
		@Pc(12) Class1_Sub1_Sub1 local12 = Static190.method3007(arg0, 16);
		local12.method28();
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(Lclient!hh;Z)V")
	public static void method895(@OriginalArg(0) Class109 arg0) {
		Static330.aClass109_75 = arg0;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(III)V")
	public static void method897(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class137 local7 = Static131.aClass137ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 != null && local7.aClass47_Sub5_1 != null) {
			local7.aClass47_Sub5_1 = null;
		}
	}
}
