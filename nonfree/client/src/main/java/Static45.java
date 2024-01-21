import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!ff", name = "Z", descriptor = "[[B")
	public static byte[][] aByteArrayArray33;

	@OriginalMember(owner = "client!ff", name = "cb", descriptor = "Lclient!mf;")
	public static Class30 aClass30_1;

	@OriginalMember(owner = "client!ff", name = "fb", descriptor = "[S")
	public static short[] aShortArray13;

	@OriginalMember(owner = "client!ff", name = "bb", descriptor = "[Lclient!dg;")
	public static Class21[] aClass21Array1 = new Class21[4];

	@OriginalMember(owner = "client!ff", name = "eb", descriptor = "Z")
	public static boolean aBoolean66 = false;

	@OriginalMember(owner = "client!ff", name = "hb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_394 = Static170.method3101("headicons_pk");

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IBLclient!hd;)Lclient!eh;")
	public static Class28 method1071(@OriginalArg(2) Class3_Sub8 arg0) {
		try {
			@Pc(7) Class28 local7 = new Class28();
			local7.anInt1118 = arg0.method1544();
			if (local7.anInt1118 > 32767) {
				local7.anInt1118 = 32767;
			}
			local7.aByteArray15 = new byte[local7.anInt1118];
			arg0.anInt1948 += Static96.aClass80_103.method3097(arg0.anInt1948, arg0.aByteArray19, local7.aByteArray15, local7.anInt1118, 0);
			return local7;
		} catch (@Pc(49) Exception local49) {
			return Static153.aClass28_1273;
		}
	}

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "(B)V")
	public static void method1072() {
		aShortArray13 = null;
		aByteArrayArray33 = null;
		aClass28_394 = null;
		aClass30_1 = null;
		aClass21Array1 = null;
	}

	@OriginalMember(owner = "client!ff", name = "d", descriptor = "(B)V")
	public static void method1073() {
		Static170.anInt4097 = 99;
		Static113.anIntArray508 = new int[104];
		Static1.anIntArray4 = new int[104];
		Static172.aByteArrayArrayArray45 = new byte[4][105][105];
		Static57.aByteArrayArrayArray11 = new byte[4][104][104];
		Static28.anIntArray176 = new int[104];
		Static107.aByteArrayArrayArray23 = new byte[4][104][104];
		Static57.anIntArray281 = new int[104];
		Static115.anIntArray514 = new int[104];
		Static91.aByteArrayArrayArray44 = new byte[4][104][104];
		Static128.anIntArrayArrayArray36 = new int[4][105][105];
		Static48.aByteArrayArrayArray10 = new byte[4][104][104];
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(II)V")
	public static void method1074(@OriginalArg(1) int arg0) {
		Static134.anInt3415 = arg0;
	}
}
