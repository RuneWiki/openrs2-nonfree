import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!dba", name = "e", descriptor = "I")
	public static int anInt1541;

	@OriginalMember(owner = "client!dba", name = "g", descriptor = "Lclient!jba;")
	public static Class1_Sub6_Sub2 aClass1_Sub6_Sub2_3;

	@OriginalMember(owner = "client!dba", name = "b", descriptor = "Z")
	public static boolean aBoolean98 = false;

	@OriginalMember(owner = "client!dba", name = "d", descriptor = "I")
	public static int anInt1540 = 0;

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(IILclient!in;I)V")
	public static void method1330(@OriginalArg(1) int arg0, @OriginalArg(2) Class160 arg1, @OriginalArg(3) int arg2) {
		if (arg1.aByte56 == 0) {
			arg1.anInt4169 = arg1.anInt4137;
		} else if (arg1.aByte56 == 1) {
			arg1.anInt4169 = arg1.anInt4137 + (arg0 - arg1.anInt4182) / 2;
		} else if (arg1.aByte56 == 2) {
			arg1.anInt4169 = arg0 - arg1.anInt4182 - arg1.anInt4137;
		} else if (arg1.aByte56 == 3) {
			arg1.anInt4169 = arg0 * arg1.anInt4137 >> 14;
		} else if (arg1.aByte56 == 4) {
			arg1.anInt4169 = (arg0 - arg1.anInt4182) / 2 + (arg1.anInt4137 * arg0 >> 14);
		} else {
			arg1.anInt4169 = arg0 - (arg0 * arg1.anInt4137 >> 14) - arg1.anInt4182;
		}
		if (arg1.aByte58 == 0) {
			arg1.anInt4171 = arg1.anInt4202;
		} else if (arg1.aByte58 == 1) {
			arg1.anInt4171 = arg1.anInt4202 + (arg2 - arg1.anInt4156) / 2;
		} else if (arg1.aByte58 == 2) {
			arg1.anInt4171 = arg2 - arg1.anInt4202 - arg1.anInt4156;
		} else if (arg1.aByte58 == 3) {
			arg1.anInt4171 = arg1.anInt4202 * arg2 >> 14;
		} else if (arg1.aByte58 == 4) {
			arg1.anInt4171 = (arg2 - arg1.anInt4156) / 2 + (arg2 * arg1.anInt4202 >> 14);
		} else {
			arg1.anInt4171 = arg2 - arg1.anInt4156 - (arg1.anInt4202 * arg2 >> 14);
		}
		if (!Static506.aBoolean659 || Static67.method1098(arg1).anInt658 == 0 && arg1.anInt4166 != 0) {
			return;
		}
		if (arg1.anInt4169 < 0) {
			arg1.anInt4169 = 0;
		} else if (arg1.anInt4182 + arg1.anInt4169 > arg0) {
			arg1.anInt4169 = arg0 - arg1.anInt4182;
		}
		if (arg1.anInt4171 < 0) {
			arg1.anInt4171 = 0;
		} else if (arg2 < arg1.anInt4156 + arg1.anInt4171) {
			arg1.anInt4171 = arg2 - arg1.anInt4156;
			return;
		}
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(ILclient!sd;)V")
	public static void method1331(@OriginalArg(1) Class1_Sub43 arg0) {
		if (Static568.aClass360ArrayArrayArray22 == null) {
			return;
		}
		@Pc(8) Interface15 local8 = null;
		if (arg0.anInt8107 == 0) {
			local8 = (Interface15) Static316.method4694(arg0.anInt8109, arg0.anInt8101, arg0.anInt8102);
		}
		if (arg0.anInt8107 == 1) {
			local8 = (Interface15) Static175.method2781(arg0.anInt8109, arg0.anInt8101, arg0.anInt8102);
		}
		if (arg0.anInt8107 == 2) {
			local8 = (Interface15) Static432.method6172(arg0.anInt8109, arg0.anInt8101, arg0.anInt8102, kj.class);
		}
		if (arg0.anInt8107 == 3) {
			local8 = (Interface15) Static481.method6668(arg0.anInt8109, arg0.anInt8101, arg0.anInt8102);
		}
		if (local8 == null) {
			arg0.anInt8106 = -1;
			arg0.anInt8108 = 0;
			arg0.anInt8099 = 0;
		} else {
			arg0.anInt8106 = local8.method7232();
			arg0.anInt8108 = local8.method7227();
			arg0.anInt8099 = local8.method7230();
		}
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(IB)V")
	public static void method1332(@OriginalArg(0) int arg0) {
		Static290.anInt5279 = arg0;
		@Pc(7) Class207 local7 = Static275.aClass207_25;
		synchronized (Static275.aClass207_25) {
			Static275.aClass207_25.method4392();
		}
		local7 = Static236.aClass207_55;
		synchronized (Static236.aClass207_55) {
			Static236.aClass207_55.method4392();
		}
	}
}
