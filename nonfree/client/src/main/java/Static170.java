import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!vf", name = "h", descriptor = "[[S")
	public static short[][] aShortArrayArray8;

	@OriginalMember(owner = "client!vf", name = "n", descriptor = "[Lclient!fb;")
	public static Class3_Sub2_Sub2_Sub4[] aClass3_Sub2_Sub2_Sub4Array10;

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "I")
	public static int anInt4091 = 0;

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "I")
	public static int anInt4092 = 0;

	@OriginalMember(owner = "client!vf", name = "d", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1429 = method3101(")1j");

	@OriginalMember(owner = "client!vf", name = "e", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1430 = method3101("Konfig geladen)3");

	@OriginalMember(owner = "client!vf", name = "f", descriptor = "Lclient!eh;")
	private static Class28 aClass28_1431 = method3101("You have only just left another world)3");

	@OriginalMember(owner = "client!vf", name = "g", descriptor = "I")
	public static int anInt4093 = -1;

	@OriginalMember(owner = "client!vf", name = "l", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1432 = aClass28_1431;

	@OriginalMember(owner = "client!vf", name = "m", descriptor = "I")
	public static int anInt4097 = 99;

	@OriginalMember(owner = "client!vf", name = "o", descriptor = "I")
	public static int anInt4098 = 1;

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lclient!gg;ILclient!fd;Z)V")
	public static void method3100(@OriginalArg(0) Class34 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class7_Sub1 arg2) {
		@Pc(3) Class3_Sub22 local3 = new Class3_Sub22();
		local3.aClass34_4 = arg0;
		local3.aLong144 = arg1;
		local3.aClass7_Sub1_16 = arg2;
		local3.anInt3878 = 1;
		@Pc(22) Class23 local22 = Static69.aClass23_8;
		synchronized (Static69.aClass23_8) {
			Static69.aClass23_8.method850(local3);
		}
		Static71.method1652();
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(BLjava/lang/String;)Lclient!eh;")
	public static Class28 method3101(@OriginalArg(1) String arg0) {
		@Pc(11) byte[] local11 = arg0.getBytes();
		@Pc(14) int local14 = local11.length;
		@Pc(18) Class28 local18 = new Class28();
		@Pc(20) int local20 = 0;
		local18.aByteArray15 = new byte[local14];
		while (local14 > local20) {
			@Pc(32) int local32 = local11[local20++] & 0xFF;
			if (local32 <= 45 && local32 >= 40) {
				if (local20 >= local14) {
					break;
				}
				@Pc(65) int local65 = local11[local20++] & 0xFF;
				local18.aByteArray15[local18.anInt1118++] = (byte) ((local32 - 40) * 43 + local65 - 48);
			} else if (local32 != 0) {
				local18.aByteArray15[local18.anInt1118++] = (byte) local32;
			}
		}
		local18.method902();
		return local18.method914();
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lclient!eh;I)Z")
	public static boolean method3102(@OriginalArg(0) Class28 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < Static4.anInt128; local16++) {
			if (arg0.method936(Static11.aClass28Array2[local16])) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(II)Lclient!fh;")
	public static Class3_Sub2_Sub7 method3103(@OriginalArg(0) int arg0) {
		@Pc(10) Class3_Sub2_Sub7 local10 = (Class3_Sub2_Sub7) Static138.aClass63_25.method2337((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static134.aClass7_55.method1021(9, arg0);
		local10 = new Class3_Sub2_Sub7();
		local10.anInt1315 = arg0;
		if (local25 != null) {
			local10.method1124(new Class3_Sub8(local25));
		}
		local10.method1117();
		Static138.aClass63_25.method2338((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V")
	public static void method3104() {
		aClass3_Sub2_Sub2_Sub4Array10 = null;
		aClass28_1430 = null;
		aClass28_1431 = null;
		aShortArrayArray8 = null;
		aClass28_1429 = null;
		aClass28_1432 = null;
	}
}
