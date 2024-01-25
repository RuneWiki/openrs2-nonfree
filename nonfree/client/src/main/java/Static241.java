import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static241 {

	@OriginalMember(owner = "client!jea", name = "b", descriptor = "[S")
	private static final short[] aShortArray87 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!jea", name = "e", descriptor = "Z")
	public static boolean aBoolean360 = false;

	@OriginalMember(owner = "client!jea", name = "p", descriptor = "[S")
	public static final short[] aShortArray89 = new short[] { -10304, 9104, 25485, 4620, 4540 };

	@OriginalMember(owner = "client!jea", name = "o", descriptor = "[S")
	public static final short[] aShortArray88 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!jea", name = "k", descriptor = "[[S")
	public static final short[][] aShortArrayArray20 = new short[][] { aShortArray87, aShortArray89, aShortArray88 };

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method4087(@OriginalArg(1) String arg0) {
		return Static564.method7258(arg0);
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(IIIZI)Lclient!vf;")
	public static Class4_Sub49 method4092(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class4_Sub49 local7 = new Class4_Sub49();
		local7.anInt9337 = arg0;
		local7.anInt9334 = arg3;
		Static543.aClass183_39.method4282((long) arg1, local7);
		Static263.method6566(arg0);
		@Pc(35) Class115 local35 = Static92.method2118(arg1);
		if (local35 != null) {
			Static330.method4950(local35);
		}
		if (Static74.aClass115_2 != null) {
			Static330.method4950(Static74.aClass115_2);
			Static74.aClass115_2 = null;
		}
		Static228.method3965();
		if (local35 != null) {
			Static424.method6072(local35, !arg2);
		}
		if (!arg2) {
			Static205.method3638(arg0);
		}
		if (!arg2 && Static249.anInt4945 != -1) {
			Static349.method5193(1, Static249.anInt4945);
		}
		return local7;
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(ILclient!hi;)I")
	public static int method4095(@OriginalArg(1) Class141 arg0) {
		if (arg0 == Static431.aClass141_11) {
			return 6407;
		} else if (Static85.aClass141_2 == arg0) {
			return 6408;
		} else if (arg0 == Static106.aClass141_3) {
			return 6406;
		} else if (Static128.aClass141_6 == arg0) {
			return 6409;
		} else if (Static471.aClass141_13 == arg0) {
			return 6410;
		} else if (Static129.aClass141_7 == arg0) {
			return 6145;
		} else {
			throw new IllegalStateException();
		}
	}
}
