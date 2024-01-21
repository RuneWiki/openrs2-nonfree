import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!oa", name = "N", descriptor = "I")
	public static final int anInt2654 = 50;

	@OriginalMember(owner = "client!oa", name = "S", descriptor = "Lclient!kb;")
	public static Class46 aClass46_906 = Static65.method1172("Lade Benutzeroberfl-=che )2 ");

	@OriginalMember(owner = "client!oa", name = "W", descriptor = "[I")
	public static int[] anIntArray292 = new int[anInt2654];

	@OriginalMember(owner = "client!oa", name = "Y", descriptor = "[I")
	public static int[] anIntArray293 = new int[anInt2654];

	@OriginalMember(owner = "client!oa", name = "gb", descriptor = "[I")
	public static int[] anIntArray294 = new int[anInt2654];

	@OriginalMember(owner = "client!oa", name = "lb", descriptor = "[I")
	public static int[] anIntArray295 = new int[anInt2654];

	@OriginalMember(owner = "client!oa", name = "ob", descriptor = "[I")
	public static int[] anIntArray296 = new int[anInt2654];

	@OriginalMember(owner = "client!oa", name = "qb", descriptor = "Lclient!kb;")
	public static Class46 aClass46_907 = Static65.method1172("<br>");

	@OriginalMember(owner = "client!oa", name = "sb", descriptor = "[I")
	public static int[] anIntArray297 = new int[anInt2654];

	@OriginalMember(owner = "client!oa", name = "tb", descriptor = "[Lclient!kb;")
	public static Class46[] aClass46Array15 = new Class46[anInt2654];

	@OriginalMember(owner = "client!oa", name = "ub", descriptor = "Lclient!kb;")
	public static Class46 aClass46_908 = Static65.method1172(" zuerst von Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!oa", name = "Db", descriptor = "[I")
	public static int[] anIntArray298 = new int[anInt2654];

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)I")
	public static int method1840(@OriginalArg(1) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			local5 += 16;
			arg0 >>>= 0x10;
		}
		if (arg0 >= 256) {
			arg0 >>>= 0x8;
			local5 += 8;
		}
		if (arg0 >= 16) {
			local5 += 4;
			arg0 >>>= 0x4;
		}
		if (arg0 >= 4) {
			local5 += 2;
			arg0 >>>= 0x2;
		}
		if (arg0 >= 1) {
			local5++;
			arg0 >>>= 0x1;
		}
		return arg0 + local5;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([BLclient!ge;II)V")
	public static void method1842(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class30 arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class3_Sub20 local7 = new Class3_Sub20();
		local7.anInt3200 = 0;
		local7.aClass30_3 = arg1;
		local7.aLong143 = arg2;
		local7.aByteArray39 = arg0;
		@Pc(22) Class59 local22 = Static161.aClass59_13;
		synchronized (Static161.aClass59_13) {
			Static161.aClass59_13.method1730(local7);
		}
		Static22.method409();
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V")
	public static void method1843() {
		anIntArray293 = null;
		anIntArray294 = null;
		anIntArray298 = null;
		aClass46_907 = null;
		aClass46_908 = null;
		anIntArray297 = null;
		aClass46_906 = null;
		anIntArray292 = null;
		aClass46Array15 = null;
		anIntArray296 = null;
		anIntArray295 = null;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!rd;Z)Lclient!cf;")
	public static Class3_Sub1 method1845(@OriginalArg(0) Class3_Sub4 arg0) {
		@Pc(5) int local5 = arg0.method191();
		@Pc(9) int local9 = arg0.method191();
		@Pc(18) Class local18 = Static180.method2890(local9);
		try {
			@Pc(26) Class3_Sub1 local26 = (Class3_Sub1) local18.getDeclaredConstructor().newInstance();
			if (local26 != null) {
				local26.anInt3998 = local5;
				local26.anInt3985 = arg0.method191();
				@Pc(40) int local40 = arg0.method191();
				for (@Pc(42) int local42 = 0; local42 < local40; local42++) {
					@Pc(48) int local48 = arg0.method191();
					local26.method2906(local48, arg0);
				}
			}
			local26.method2916();
			return local26;
		} catch (@Pc(67) IllegalAccessException local67) {
			throw new RuntimeException();
		} catch (@Pc(72) InstantiationException local72) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIII)V")
	public static void method1846(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = arg0; local3 <= arg0 + arg2; local3++) {
			for (@Pc(7) int local7 = arg3; local7 <= arg1 + arg3; local7++) {
				if (local7 >= 0 && local7 < 104 && local3 >= 0 && local3 < 104) {
					Static175.aByteArrayArrayArray7[0][local7][local3] = 127;
					if (local7 == arg3 && local7 > 0) {
						Static133.anIntArrayArrayArray8[0][local7][local3] = Static133.anIntArrayArrayArray8[0][local7 - 1][local3];
					}
					if (local7 == arg1 + arg3 && local7 < 103) {
						Static133.anIntArrayArrayArray8[0][local7][local3] = Static133.anIntArrayArrayArray8[0][local7 + 1][local3];
					}
					if (arg0 == local3 && local3 > 0) {
						Static133.anIntArrayArrayArray8[0][local7][local3] = Static133.anIntArrayArrayArray8[0][local7][local3 - 1];
					}
					if (arg0 + arg2 == local3 && local3 < 103) {
						Static133.anIntArrayArrayArray8[0][local7][local3] = Static133.anIntArrayArrayArray8[0][local7][local3 + 1];
					}
				}
			}
		}
	}
}
