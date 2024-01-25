import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!lk", name = "h", descriptor = "I")
	public static int anInt2357;

	@OriginalMember(owner = "client!lk", name = "i", descriptor = "Lclient!ra;")
	public static Class170 aClass170_50;

	@OriginalMember(owner = "client!lk", name = "k", descriptor = "I")
	public static int anInt2358;

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "Lclient!fi;")
	public static final Class66 aClass66_38 = new Class66(260);

	@OriginalMember(owner = "client!lk", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString150 = "Take";

	@OriginalMember(owner = "client!lk", name = "e", descriptor = "Z")
	public static final boolean aBoolean156 = false;

	@OriginalMember(owner = "client!lk", name = "j", descriptor = "[Z")
	public static final boolean[] aBooleanArray9 = new boolean[100];

	@OriginalMember(owner = "client!lk", name = "l", descriptor = "J")
	public static long aLong88 = 0L;

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(II)Lclient!ef;")
	public static Class55 method2205(@OriginalArg(0) int arg0) {
		@Pc(5) Class66 local5 = Static37.aClass66_10;
		@Pc(16) Class55 local16;
		synchronized (Static37.aClass66_10) {
			local16 = (Class55) Static37.aClass66_10.method1939((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(39) byte[] local39 = Static320.aClass170_113.method4584(16, arg0);
		local16 = new Class55();
		if (local39 != null) {
			local16.method1525(new Class5_Sub1(local39));
		}
		@Pc(54) Class66 local54 = Static37.aClass66_10;
		synchronized (Static37.aClass66_10) {
			Static37.aClass66_10.method1936((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(B)V")
	public static void method2208() {
		Static47.anInt1211 = 0;
		Static205.anInt3959 = 0;
		Static225.method3900();
		Static184.method5546();
		Static306.method5237();
		@Pc(23) int local23;
		for (@Pc(17) int local17 = 0; local17 < Static205.anInt3959; local17++) {
			local23 = Static269.anIntArray394[local17];
			if (Static188.aClass25_Sub1_Sub1_Sub2Array1[local23].anInt5320 != Static180.anInt3606) {
				if (Static188.aClass25_Sub1_Sub1_Sub2Array1[local23].aClass216_1.method5780()) {
					Static69.method1524(Static188.aClass25_Sub1_Sub1_Sub2Array1[local23]);
				}
				Static188.aClass25_Sub1_Sub1_Sub2Array1[local23].method4664(null);
				Static188.aClass25_Sub1_Sub1_Sub2Array1[local23] = null;
			}
		}
		if (Static179.anInt3568 != Static6.aClass5_Sub1_Sub1_1.anInt2029) {
			throw new RuntimeException("gnp1 pos:" + Static6.aClass5_Sub1_Sub1_1.anInt2029 + " psize:" + Static179.anInt3568);
		}
		for (local23 = 0; local23 < Static63.anInt1486; local23++) {
			if (Static188.aClass25_Sub1_Sub1_Sub2Array1[Static331.anIntArray535[local23]] == null) {
				throw new RuntimeException("gnp2 pos:" + local23 + " size:" + Static63.anInt1486);
			}
		}
	}

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "(II)V")
	public static void method2209(@OriginalArg(1) int arg0) {
		if (Static121.anInt2577 == arg0) {
			return;
		}
		Static266.anInt5101 = Static339.anInt6352 = Static217.anIntArray307[arg0];
		Static15.aClass59_1.method4886(50, (int) ((double) Static266.anInt5101 * 34.46D));
		Static123.anIntArrayArray16 = new int[Static266.anInt5101][Static339.anInt6352];
		Static193.anIntArrayArray31 = new int[Static266.anInt5101][Static339.anInt6352];
		Static118.anIntArrayArrayArray6 = new int[4][Static266.anInt5101 >> 3][Static339.anInt6352 >> 3];
		for (@Pc(42) int local42 = 0; local42 < 4; local42++) {
			Static117.aClass49Array1[local42] = Static1.method1(Static266.anInt5101, Static339.anInt6352);
		}
		Static293.aByteArrayArrayArray25 = new byte[4][Static266.anInt5101][Static339.anInt6352];
		Static191.method5178(Static266.anInt5101, Static339.anInt6352);
		Static161.method2991(Static15.aClass59_1, Static339.anInt6352 >> 3, Static266.anInt5101 >> 3);
		Static121.anInt2577 = arg0;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "([BI)Lclient!q;")
	public static Class5_Sub9_Sub18 method2211(@OriginalArg(0) byte[] arg0) {
		@Pc(9) Class5_Sub9_Sub18 local9 = new Class5_Sub9_Sub18();
		@Pc(14) Class5_Sub1 local14 = new Class5_Sub1(arg0);
		local14.anInt2029 = local14.aByteArray18.length - 2;
		@Pc(25) int local25 = local14.method1845();
		@Pc(36) int local36 = local14.aByteArray18.length - local25 - 2 - 12;
		local14.anInt2029 = local36;
		@Pc(43) int local43 = local14.method1826();
		local9.anInt4833 = local14.method1845();
		local9.anInt4836 = local14.method1845();
		local9.anInt4839 = local14.method1845();
		local9.anInt4842 = local14.method1845();
		@Pc(74) int local74 = local14.method1832();
		@Pc(85) int local85;
		@Pc(91) int local91;
		if (local74 > 0) {
			local9.aClass42Array1 = new Class42[local74];
			for (local85 = 0; local85 < local74; local85++) {
				local91 = local14.method1845();
				@Pc(98) Class42 local98 = new Class42(Static266.method4535(local91));
				local9.aClass42Array1[local85] = local98;
				while (local91-- > 0) {
					@Pc(109) int local109 = local14.method1826();
					@Pc(113) int local113 = local14.method1826();
					local98.method1050((long) local109, new Class5_Sub37(local113));
				}
			}
		}
		local14.anInt2029 = 0;
		local9.aString286 = local14.method1830();
		local9.aStringArray36 = new String[local43];
		local9.anIntArray378 = new int[local43];
		local9.anIntArray377 = new int[local43];
		local85 = 0;
		while (local36 > local14.anInt2029) {
			local91 = local14.method1845();
			if (local91 == 3) {
				local9.aStringArray36[local85] = local14.method1840().intern();
			} else if (local91 >= 100 || local91 == 21 || local91 == 38 || local91 == 39) {
				local9.anIntArray378[local85] = local14.method1832();
			} else {
				local9.anIntArray378[local85] = local14.method1826();
			}
			local9.anIntArray377[local85++] = local91;
		}
		return local9;
	}
}
