import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!ik", name = "J", descriptor = "[I")
	public static final int[] anIntArray298 = new int[50];

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(Z)V")
	public static void method2380() {
		if (Static348.anInt4439 == 10) {
			Static310.method4763(28);
		}
		if (Static348.anInt4439 == 30) {
			Static310.method4763(25);
		}
	}

	@OriginalMember(owner = "client!ik", name = "c", descriptor = "(III)V")
	public static void method2381(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static229.method3783(Static118.aClass244_36);
		Static23.aClass3_Sub5_Sub1_1.method2727(arg1);
		Static23.aClass3_Sub5_Sub1_1.method2758(arg0);
	}

	@OriginalMember(owner = "client!ik", name = "g", descriptor = "(B)[Lclient!o;")
	public static Class171[] method2382() {
		return new Class171[] { Static238.aClass171_4, Static199.aClass171_3, Static178.aClass171_2, Static63.aClass171_1, Static310.aClass171_6 };
	}

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(BII)B")
	public static byte method2383(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lclient!dt;B)Lclient!dt;")
	public static Class62 method2384(@OriginalArg(0) Class62 arg0) {
		@Pc(11) Class62 local11 = Static48.method923(arg0);
		if (local11 == null) {
			local11 = arg0.aClass62_3;
		}
		return local11;
	}

	@OriginalMember(owner = "client!ik", name = "c", descriptor = "(II)V")
	public static void method2385(@OriginalArg(0) int arg0) {
		Static140.anInt2648 = arg0;
		@Pc(7) Class139 local7 = Static136.aClass139_31;
		synchronized (Static136.aClass139_31) {
			Static136.aClass139_31.method3075();
		}
		local7 = Static78.aClass139_13;
		synchronized (Static78.aClass139_13) {
			Static78.aClass139_13.method3075();
		}
	}
}
