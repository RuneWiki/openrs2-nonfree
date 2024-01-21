import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!hb", name = "u", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!hb", name = "j", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_530 = Static81.method1507("This world is full)3");

	@OriginalMember(owner = "client!hb", name = "e", descriptor = "Lclient!dj;")
	public static Class24 aClass24_528 = aClass24_530;

	@OriginalMember(owner = "client!hb", name = "h", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_529 = Static81.method1507("_");

	@OriginalMember(owner = "client!hb", name = "k", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_531 = Static81.method1507("<img=1>");

	@OriginalMember(owner = "client!hb", name = "y", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_535 = Static81.method1507("wave:");

	@OriginalMember(owner = "client!hb", name = "l", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_532 = aClass24_535;

	@OriginalMember(owner = "client!hb", name = "m", descriptor = "I")
	public static int anInt1722 = 0;

	@OriginalMember(owner = "client!hb", name = "p", descriptor = "Lclient!ri;")
	public static final Class86 aClass86_25 = new Class86(64);

	@OriginalMember(owner = "client!hb", name = "s", descriptor = "Lclient!dj;")
	public static Class24 aClass24_533 = aClass24_535;

	@OriginalMember(owner = "client!hb", name = "v", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_534 = Static81.method1507("Starte 3D)2Softwarebibliothek");

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIIIB)V")
	public static void method1361(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static146.method2424(arg1);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg1 - arg2;
		@Pc(17) int local17 = arg1;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(32) int local32 = -arg1;
		@Pc(34) int local34 = local15;
		@Pc(37) int local37 = -local15;
		@Pc(41) int[] local41 = Static98.anIntArrayArray16[arg4];
		@Pc(43) int local43 = -1;
		@Pc(45) int local45 = -1;
		@Pc(49) int local49 = arg0 + local15;
		@Pc(54) int local54 = arg0 - local15;
		Static39.method731(local41, arg0 - arg1, local54, arg5);
		Static39.method731(local41, local54, local49, arg3);
		Static39.method731(local41, local49, arg0 + arg1, arg5);
		while (local10 < local17) {
			local45 += 2;
			local43 += 2;
			local37 += local45;
			if (local37 >= 0 && local34 >= 1) {
				Static193.anIntArray378[local34] = local10;
				local34--;
				local37 -= local34 << 1;
			}
			local32 += local43;
			local10++;
			@Pc(123) int[] local123;
			@Pc(138) int[] local138;
			@Pc(131) int local131;
			@Pc(127) int local127;
			@Pc(147) int local147;
			@Pc(143) int local143;
			@Pc(151) int local151;
			if (local32 >= 0) {
				local17--;
				if (local17 < local15) {
					local123 = Static98.anIntArrayArray16[arg4 + local17];
					local127 = local10 + arg0;
					local131 = Static193.anIntArray378[local17];
					local138 = Static98.anIntArrayArray16[arg4 - local17];
					local143 = arg0 + local131;
					local147 = arg0 - local10;
					local151 = arg0 - local131;
					Static39.method731(local123, local147, local151, arg5);
					Static39.method731(local123, local151, local143, arg3);
					Static39.method731(local123, local143, local127, arg5);
					Static39.method731(local138, local147, local151, arg5);
					Static39.method731(local138, local151, local143, arg3);
					Static39.method731(local138, local143, local127, arg5);
				} else {
					local123 = Static98.anIntArrayArray16[arg4 + local17];
					local138 = Static98.anIntArrayArray16[arg4 - local17];
					local131 = local10 + arg0;
					local127 = arg0 - local10;
					Static39.method731(local123, local127, local131, arg5);
					Static39.method731(local138, local127, local131, arg5);
				}
				local32 -= local17 << 1;
			}
			local123 = Static98.anIntArrayArray16[arg4 + local10];
			local138 = Static98.anIntArrayArray16[arg4 - local10];
			local131 = local17 + arg0;
			local127 = arg0 - local17;
			if (local10 >= local15) {
				Static39.method731(local123, local127, local131, arg5);
				Static39.method731(local138, local127, local131, arg5);
			} else {
				local147 = local34 < local10 ? Static193.anIntArray378[local10] : local34;
				local151 = arg0 - local147;
				local143 = local147 + arg0;
				Static39.method731(local123, local127, local151, arg5);
				Static39.method731(local123, local151, local143, arg3);
				Static39.method731(local123, local143, local131, arg5);
				Static39.method731(local138, local127, local151, arg5);
				Static39.method731(local138, local151, local143, arg3);
				Static39.method731(local138, local143, local131, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(BI)I")
	public static int method1364(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(II)Lclient!ba;")
	public static Class1_Sub2_Sub3 method1365(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub2_Sub3 local10 = (Class1_Sub2_Sub3) aClass86_25.method2816((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(24) byte[] local24 = Static177.aClass69_35.method2208(Static76.method1413(arg0), Static149.method2566(arg0));
		local10 = new Class1_Sub2_Sub3();
		local10.anInt299 = arg0;
		if (local24 != null) {
			local10.method301(new Class1_Sub7(local24));
		}
		aClass86_25.method2821(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZLclient!jj;I)V")
	public static void method1367(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class53 arg1) {
		if (Static108.aClass53_3 != null) {
			try {
				Static108.aClass53_3.method1713();
			} catch (@Pc(16) Exception local16) {
			}
			Static108.aClass53_3 = null;
		}
		Static108.aClass53_3 = arg1;
		Static151.method2594(arg0);
		Static174.aClass1_Sub7_5.anInt3592 = 0;
		Static85.aClass1_Sub7_3 = null;
		Static161.anInt3568 = 0;
		Static208.aClass1_Sub2_Sub24_1 = null;
		while (true) {
			@Pc(41) Class1_Sub2_Sub24 local41 = (Class1_Sub2_Sub24) Static176.aClass57_45.method1876();
			if (local41 == null) {
				while (true) {
					local41 = (Class1_Sub2_Sub24) Static104.aClass57_21.method1876();
					if (local41 == null) {
						if (Static52.aByte3 != 0) {
							try {
								@Pc(96) Class1_Sub7 local96 = new Class1_Sub7(4);
								local96.method2753(4);
								local96.method2753(Static52.aByte3);
								local96.method2775(0);
								Static108.aClass53_3.method1717(local96.aByteArray38, 4);
							} catch (@Pc(117) IOException local117) {
								try {
									Static108.aClass53_3.method1713();
								} catch (@Pc(122) Exception local122) {
								}
								Static49.anInt1249++;
								Static108.aClass53_3 = null;
							}
						}
						Static70.anInt3210 = 0;
						Static132.aLong94 = Static24.method503();
						return;
					}
					Static79.aClass58_1.method1914(local41);
					Static80.aClass57_19.method1874(local41, local41.aLong149);
					Static49.anInt1246++;
					Static183.anInt4091--;
				}
			}
			Static162.aClass57_36.method1874(local41, local41.aLong149);
			Static143.anInt3203--;
			Static3.anInt116++;
		}
	}
}
