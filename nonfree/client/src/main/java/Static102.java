import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!kc", name = "s", descriptor = "Z")
	public static boolean aBoolean109;

	@OriginalMember(owner = "client!kc", name = "t", descriptor = "Lclient!ii;")
	public static Class47 aClass47_10;

	@OriginalMember(owner = "client!kc", name = "y", descriptor = "I")
	public static int anInt2328;

	@OriginalMember(owner = "client!kc", name = "z", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!kc", name = "B", descriptor = "Lclient!mb;")
	public static Class62 aClass62_799;

	@OriginalMember(owner = "client!kc", name = "p", descriptor = "[I")
	public static final int[] anIntArray215 = new int[500];

	@OriginalMember(owner = "client!kc", name = "r", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_798 = Static151.method2243("Lade Sprites )2 ");

	@OriginalMember(owner = "client!kc", name = "F", descriptor = "I")
	public static int anInt2333 = 0;

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "(I)Lclient!ua;")
	public static Class2_Sub1_Sub22 method1621() {
		if (Static10.aClass2_Sub1_Sub22_1 == null) {
			Static10.aClass2_Sub1_Sub22_1 = new Class2_Sub1_Sub22();
		}
		return Static10.aClass2_Sub1_Sub22_1;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(BLjava/awt/Component;IILclient!hf;)Lclient!n;")
	public static Class3 method1622(@OriginalArg(1) Component arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class41 arg3) {
		if (Static88.anInt1852 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(33) Class3 local33 = (Class3) Class.forName("Class3_Sub1").getDeclaredConstructor().newInstance();
			local33.anIntArray14 = new int[(Static29.aBoolean31 ? 2 : 1) * 256];
			local33.anInt159 = arg1;
			local33.method103(arg0);
			local33.anInt166 = (arg1 & 0xFFFFFC00) + 1024;
			if (local33.anInt166 > 16384) {
				local33.anInt166 = 16384;
			}
			local33.method98(local33.anInt166);
			if (Static131.anInt1511 > 0 && Static134.aClass89_1 == null) {
				Static134.aClass89_1 = new Class89();
				Static134.aClass89_1.aClass41_4 = arg3;
				arg3.method1044(Static134.aClass89_1, Static131.anInt1511);
			}
			if (Static134.aClass89_1 != null) {
				if (Static134.aClass89_1.aClass3Array1[arg2] != null) {
					throw new IllegalArgumentException();
				}
				Static134.aClass89_1.aClass3Array1[arg2] = local33;
			}
			return local33;
		} catch (@Pc(106) Throwable local106) {
			try {
				@Pc(112) Class3_Sub2 local112 = new Class3_Sub2(arg3, arg2);
				local112.anInt159 = arg1;
				local112.anIntArray14 = new int[(Static29.aBoolean31 ? 2 : 1) * 256];
				local112.method103(arg0);
				local112.anInt166 = 16384;
				local112.method98(local112.anInt166);
				if (Static131.anInt1511 > 0 && Static134.aClass89_1 == null) {
					Static134.aClass89_1 = new Class89();
					Static134.aClass89_1.aClass41_4 = arg3;
					arg3.method1044(Static134.aClass89_1, Static131.anInt1511);
				}
				if (Static134.aClass89_1 != null) {
					if (Static134.aClass89_1.aClass3Array1[arg2] != null) {
						throw new IllegalArgumentException();
					}
					Static134.aClass89_1.aClass3Array1[arg2] = local112;
				}
				return local112;
			} catch (@Pc(182) Throwable local182) {
				return new Class3();
			}
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(B[Lclient!mb;[SII)V")
	public static void method1623(@OriginalArg(1) Class62[] arg0, @OriginalArg(2) short[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 <= arg3) {
			return;
		}
		@Pc(14) int local14 = (arg2 + arg3) / 2;
		@Pc(18) Class62 local18 = arg0[local14];
		arg0[local14] = arg0[arg2];
		@Pc(26) int local26 = arg3;
		arg0[arg2] = local18;
		@Pc(34) short local34 = arg1[local14];
		arg1[local14] = arg1[arg2];
		arg1[arg2] = local34;
		for (@Pc(46) int local46 = arg3; local46 < arg2; local46++) {
			if (local18 == null || arg0[local46] != null && arg0[local46].method1847(local18) < (local46 & 0x1)) {
				@Pc(68) Class62 local68 = arg0[local46];
				arg0[local46] = arg0[local26];
				arg0[local26] = local68;
				@Pc(82) short local82 = arg1[local46];
				arg1[local46] = arg1[local26];
				arg1[local26++] = local82;
			}
		}
		arg0[arg2] = arg0[local26];
		arg0[local26] = local18;
		arg1[arg2] = arg1[local26];
		arg1[local26] = local34;
		method1623(arg0, arg1, local26 - 1, arg3);
		method1623(arg0, arg1, arg2, local26 + 1);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IBI)I")
	public static int method1624(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class2_Sub24 local10 = (Class2_Sub24) Static204.aClass58_14.method1704((long) arg0);
		if (local10 == null) {
			return 0;
		} else if (arg1 >= 0 && local10.anIntArray367.length > arg1) {
			return local10.anIntArray367[arg1];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IZII)V")
	public static void method1625(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(4) Class47 local4 = Static93.method1400(arg0, arg2);
		if (local4 != null && local4.anObjectArray26 != null) {
			@Pc(22) Class2_Sub13 local22 = new Class2_Sub13();
			local22.aClass47_12 = local4;
			local22.anObjectArray27 = local4.anObjectArray26;
			Static140.method2145(local22);
		}
		Static34.anInt818 = arg1;
		Static204.anInt4234 = arg0;
		Static151.anInt3208 = arg2;
		Static8.aBoolean12 = true;
		Static165.method2410(local4);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!oc;ILclient!u;I)V")
	public static void method1626(@OriginalArg(0) Class71_Sub1 arg0, @OriginalArg(2) Class98 arg1, @OriginalArg(3) int arg2) {
		@Pc(3) Class2_Sub26 local3 = new Class2_Sub26();
		local3.aClass71_Sub1_28 = arg0;
		local3.anInt4228 = 1;
		local3.aLong148 = arg2;
		local3.aClass98_4 = arg1;
		@Pc(22) Class13 local22 = Static115.aClass13_7;
		synchronized (Static115.aClass13_7) {
			Static115.aClass13_7.method304(local3);
		}
		Static140.method2149();
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)V")
	public static void method1627(@OriginalArg(1) int arg0) {
		Static186.anInt3885 = -1;
		Static142.anInt3025 = arg0;
		Static176.anInt3717 = -1;
		Static26.method2655();
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(JB)V")
	public static void method1628(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(14) int local14 = 0; local14 < Static29.anInt714; local14++) {
			if (arg0 == Static124.aLongArray7[local14]) {
				Static29.anInt714--;
				for (@Pc(32) int local32 = local14; local32 < Static29.anInt714; local32++) {
					Static62.aClass62Array33[local32] = Static62.aClass62Array33[local32 + 1];
					Static35.anIntArray65[local32] = Static35.anIntArray65[local32 + 1];
					Static80.aClass62Array46[local32] = Static80.aClass62Array46[local32 + 1];
					Static124.aLongArray7[local32] = Static124.aLongArray7[local32 + 1];
					Static54.anIntArray87[local32] = Static54.anIntArray87[local32 + 1];
				}
				Static104.anInt2337 = Static11.anInt305;
				Static58.aClass2_Sub11_Sub1_2.method1595(30);
				Static58.aClass2_Sub11_Sub1_2.method1527(arg0);
				break;
			}
		}
	}
}
