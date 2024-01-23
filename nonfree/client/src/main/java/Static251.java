import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static251 {

	@OriginalMember(owner = "client!sf", name = "u", descriptor = "Lclient!df;")
	public static Class33 aClass33_13 = new Class33(64);

	@OriginalMember(owner = "client!sf", name = "z", descriptor = "I")
	public static int anInt5174 = 3;

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!rg;IIII)V")
	public static void method4234(@OriginalArg(0) Class151 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static283.aBoolean393) {
			Static234.method3975(arg2, arg3, arg0.anInt4773 + arg2, arg3 - -arg0.anInt4751);
		}
		if (Static230.anInt4489 < 3) {
			if (Static283.aBoolean393) {
				((Class3_Sub4_Sub12_Sub1) Static260.aClass3_Sub4_Sub12_7).method2280(arg2, arg3, arg0.anInt4773, arg0.anInt4751, Static260.aClass3_Sub4_Sub12_7.anInt5728 / 2, Static260.aClass3_Sub4_Sub12_7.anInt5729 / 2, (int) Static84.aFloat21, 256, (Class3_Sub4_Sub12_Sub1) arg0.method4000(false));
			} else {
				((Class3_Sub4_Sub12_Sub2) Static260.aClass3_Sub4_Sub12_7).method4714(arg2, arg3, arg0.anInt4773, arg0.anInt4751, Static260.aClass3_Sub4_Sub12_7.anInt5728 / 2, Static260.aClass3_Sub4_Sub12_7.anInt5729 / 2, (int) Static84.aFloat21, arg0.anIntArray509, arg0.anIntArray523);
			}
		} else if (Static283.aBoolean393) {
			@Pc(103) Class3_Sub4_Sub12 local103 = arg0.method4000(false);
			if (local103 != null) {
				local103.method4697(arg2, arg3);
			}
		} else {
			Static143.method2463(arg2, arg3, arg0.anIntArray509, arg0.anIntArray523);
		}
		Static223.aBooleanArray102[arg1] = true;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;Ljava/lang/String;ILjava/lang/String;II)V")
	public static void method4236(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		for (@Pc(7) int local7 = 99; local7 > 0; local7--) {
			Static209.anIntArray624[local7] = Static209.anIntArray624[local7 - 1];
			Static45.anIntArray68[local7] = Static45.anIntArray68[local7 - 1];
			Static153.aStringArray25[local7] = Static153.aStringArray25[local7 - 1];
			Static213.aStringArray28[local7] = Static213.aStringArray28[local7 - 1];
			Static231.aStringArray31[local7] = Static231.aStringArray31[local7 - 1];
			Static244.aStringArray35[local7] = Static244.aStringArray35[local7 - 1];
			Static115.anIntArray222[local7] = Static115.anIntArray222[local7 - 1];
		}
		Static150.anInt2857 = Static201.anInt3956;
		Static108.anInt2013++;
		Static153.aStringArray25[0] = arg2;
		Static209.anIntArray624[0] = arg5;
		Static213.aStringArray28[0] = arg0;
		Static231.aStringArray31[0] = arg1;
		Static45.anIntArray68[0] = arg3;
		Static115.anIntArray222[0] = arg6;
		Static244.aStringArray35[0] = arg4;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZILclient!rn;Lclient!rn;I)Lclient!hg;")
	public static Class3_Sub4_Sub11 method4237(@OriginalArg(1) int arg0, @OriginalArg(2) Class155 arg1, @OriginalArg(3) Class155 arg2) {
		@Pc(10) int[] local10 = arg1.method4117(arg0);
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < local10.length; local14++) {
			@Pc(26) byte[] local26 = arg1.method4138(arg0, local10[local14]);
			if (local26 == null) {
				local12 = false;
			} else {
				@Pc(48) int local48 = local26[1] & 0xFF | (local26[0] & 0xFF) << 8;
				@Pc(56) byte[] local56 = arg2.method4138(local48, 0);
				if (local56 == null) {
					local12 = false;
				}
			}
		}
		if (!local12) {
			return null;
		}
		try {
			return new Class3_Sub4_Sub11(arg1, arg2, arg0, false);
		} catch (@Pc(86) Exception local86) {
			return null;
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/Class;")
	public static Class method4245(@OriginalArg(1) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}
}
