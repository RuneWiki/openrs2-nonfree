import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!ub", name = "n", descriptor = "Lclient!td;")
	public static Class3_Sub3_Sub4 aClass3_Sub3_Sub4_2;

	@OriginalMember(owner = "client!ub", name = "r", descriptor = "Lclient!gf;")
	public static Class33 aClass33_11;

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1308 = Static170.method3101("<col=c0ff00>");

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1309 = Static170.method3101("Bitte starten Sie eine Mitgliedschaft");

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "I")
	public static int anInt3884 = 0;

	@OriginalMember(owner = "client!ub", name = "m", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray41 = new byte[4][104][104];

	@OriginalMember(owner = "client!ub", name = "o", descriptor = "Z")
	public static boolean aBoolean181 = false;

	@OriginalMember(owner = "client!ub", name = "p", descriptor = "[I")
	public static int[] anIntArray652 = new int[128];

	@OriginalMember(owner = "client!ub", name = "t", descriptor = "Z")
	public static boolean aBoolean182 = true;

	@OriginalMember(owner = "client!ub", name = "z", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1310 = Static170.method3101("Sie befinden sich in einem Mitglieder)2Gebiet(Q");

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIZ)I")
	public static int method2963(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) int local5 = arg1 - 1 & arg2;
		@Pc(13) int local13 = arg0 / arg1;
		@Pc(19) int local19 = arg1 - 1 & arg0;
		@Pc(23) int local23 = arg2 / arg1;
		@Pc(28) int local28 = Static174.method3156(local23, local13);
		@Pc(35) int local35 = Static174.method3156(local23 + 1, local13);
		@Pc(42) int local42 = Static174.method3156(local23, local13 + 1);
		@Pc(51) int local51 = Static174.method3156(local23 + 1, local13 + 1);
		@Pc(58) int local58 = Static156.method2959(local35, local28, local5, arg1);
		@Pc(70) int local70 = Static156.method2959(local51, local42, local5, arg1);
		return Static156.method2959(local70, local58, local19, arg1);
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(B)V")
	public static void method2968() {
		anIntArray652 = null;
		aClass28_1309 = null;
		aClass28_1308 = null;
		aClass3_Sub3_Sub4_2 = null;
		aClass28_1310 = null;
		aByteArrayArrayArray41 = null;
		aClass33_11 = null;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "([BLclient!gg;II)V")
	public static void method2974(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(3) int arg2) {
		@Pc(3) Class3_Sub22 local3 = new Class3_Sub22();
		local3.anInt3878 = 0;
		local3.aClass34_4 = arg1;
		local3.aLong144 = arg2;
		local3.aByteArray39 = arg0;
		@Pc(22) Class23 local22 = Static69.aClass23_8;
		synchronized (Static69.aClass23_8) {
			Static69.aClass23_8.method850(local3);
		}
		Static71.method1652();
	}
}
