import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!jl", name = "I", descriptor = "Ljava/lang/String;")
	public static String aString83 = "Please remove ";

	@OriginalMember(owner = "client!jl", name = "J", descriptor = "Ljava/lang/String;")
	public static String aString84 = "Face here";

	@OriginalMember(owner = "client!jl", name = "L", descriptor = "Lclient!ii;")
	public static Class69 aClass69_5 = new Class69(128);

	@OriginalMember(owner = "client!jl", name = "T", descriptor = "Ljava/lang/String;")
	public static String aString85 = "level: ";

	@OriginalMember(owner = "client!jl", name = "U", descriptor = "Ljava/lang/String;")
	public static String aString86 = "Cancel";

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIII[I)V")
	public static void method2127(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		arg1--;
		@Pc(11) int local11 = arg0 - 1;
		@Pc(15) int local15 = local11 - 7;
		while (arg1 < local15) {
			@Pc(20) int local20 = arg1 + 1;
			arg3[local20] = arg2;
			@Pc(25) int local25 = local20 + 1;
			arg3[local25] = arg2;
			@Pc(30) int local30 = local25 + 1;
			arg3[local30] = arg2;
			@Pc(35) int local35 = local30 + 1;
			arg3[local35] = arg2;
			@Pc(40) int local40 = local35 + 1;
			arg3[local40] = arg2;
			@Pc(45) int local45 = local40 + 1;
			arg3[local45] = arg2;
			@Pc(50) int local50 = local45 + 1;
			arg3[local50] = arg2;
			arg1 = local50 + 1;
			arg3[arg1] = arg2;
		}
		while (local11 > arg1) {
			arg1++;
			arg3[arg1] = arg2;
		}
	}

	@OriginalMember(owner = "client!jl", name = "b", descriptor = "(B)V")
	public static void method2128() {
		aString83 = null;
		aClass69_5 = null;
		aString85 = null;
		aString84 = null;
		aString86 = null;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(ZLclient!lc;Lclient!lc;I)V")
	public static void method2129(@OriginalArg(1) Class98 arg0, @OriginalArg(2) Class98 arg1) {
		Static264.aClass98_153 = arg1;
		Static113.aBoolean165 = true;
		Static136.aClass98_81 = arg0;
	}

	@OriginalMember(owner = "client!jl", name = "g", descriptor = "(I)V")
	public static void method2130() {
		Static84.anInt1709 = 0;
		Static43.anInt5510 = 0;
		Static7.method147();
		Static84.method1328();
		Static93.method1498();
		Static283.method4251();
		@Pc(19) int local19;
		for (local19 = 0; local19 < Static43.anInt5510; local19++) {
			@Pc(26) int local26 = Static175.anIntArray298[local19];
			if (Static104.anInt2226 != Static257.aClass12_Sub3_Sub2Array1[local26].anInt4167) {
				if (Static257.aClass12_Sub3_Sub2Array1[local26].anInt4221 > 0) {
					Static152.method2434(Static257.aClass12_Sub3_Sub2Array1[local26]);
				}
				Static257.aClass12_Sub3_Sub2Array1[local26] = null;
			}
		}
		if (Static101.aClass4_Sub17_Sub1_4.anInt2400 != Static131.anInt2781) {
			throw new RuntimeException("gpp1 pos:" + Static101.aClass4_Sub17_Sub1_4.anInt2400 + " psize:" + Static131.anInt2781);
		}
		for (local19 = 0; local19 < Static41.anInt856; local19++) {
			if (Static257.aClass12_Sub3_Sub2Array1[Static85.anIntArray179[local19]] == null) {
				throw new RuntimeException("gpp2 pos:" + local19 + " size:" + Static41.anInt856);
			}
		}
	}

	@OriginalMember(owner = "client!jl", name = "c", descriptor = "(B)I")
	public static int method2131() {
		try {
			if (Static134.anInt2799 == 0) {
				if (Static270.aLong178 > Static133.method2163() - 5000L) {
					return 0;
				}
				Static86.aClass123_2 = Static87.aClass164_2.method3941(Static145.aString98, Static90.anInt1866);
				Static151.aLong108 = Static133.method2163();
				Static134.anInt2799 = 1;
			}
			if (Static151.aLong108 + 30000L < Static133.method2163()) {
				return Static267.method2846(1000);
			}
			@Pc(89) int local89;
			@Pc(129) int local129;
			if (Static134.anInt2799 == 1) {
				if (Static86.aClass123_2.anInt3791 == 2) {
					return Static267.method2846(1001);
				}
				if (Static86.aClass123_2.anInt3791 != 1) {
					return -1;
				}
				Static259.aClass158_3 = new Class158((Socket) Static86.aClass123_2.anObject4, Static87.aClass164_2);
				Static86.aClass123_2 = null;
				local89 = 0;
				Static142.aClass4_Sub17_Sub1_3.anInt2400 = 0;
				if (Static162.aBoolean205) {
					local89 = Static201.anInt3919;
				}
				Static142.aClass4_Sub17_Sub1_3.method1861(23);
				Static142.aClass4_Sub17_Sub1_3.method1854(local89);
				Static259.aClass158_3.method3780(Static142.aClass4_Sub17_Sub1_3.aByteArray30, Static142.aClass4_Sub17_Sub1_3.anInt2400);
				if (Static83.aClass51_4 != null) {
					Static83.aClass51_4.method3280();
				}
				if (Static147.aClass51_3 != null) {
					Static147.aClass51_3.method3280();
				}
				local129 = Static259.aClass158_3.method3777();
				if (Static83.aClass51_4 != null) {
					Static83.aClass51_4.method3280();
				}
				if (Static147.aClass51_3 != null) {
					Static147.aClass51_3.method3280();
				}
				if (local129 != 0) {
					return Static267.method2846(local129);
				}
				Static134.anInt2799 = 2;
			}
			if (Static134.anInt2799 == 2) {
				if (Static259.aClass158_3.method3774() < 2) {
					return -1;
				}
				Static15.anInt296 = Static259.aClass158_3.method3777();
				Static15.anInt296 <<= 0x8;
				Static15.anInt296 += Static259.aClass158_3.method3777();
				Static281.aByteArray71 = new byte[Static15.anInt296];
				Static134.anInt2799 = 3;
				Static94.anInt1946 = 0;
			}
			if (Static134.anInt2799 != 3) {
				return -1;
			}
			local89 = Static259.aClass158_3.method3774();
			if (local89 < 1) {
				return -1;
			}
			if (local89 > Static15.anInt296 - Static94.anInt1946) {
				local89 = Static15.anInt296 - Static94.anInt1946;
			}
			Static259.aClass158_3.method3775(Static94.anInt1946, local89, Static281.aByteArray71);
			Static94.anInt1946 += local89;
			if (Static94.anInt1946 < Static15.anInt296) {
				return -1;
			} else if (Static273.method917(Static281.aByteArray71)) {
				local129 = 0;
				Static96.aClass53_Sub1Array1 = new Class53_Sub1[Static174.anInt3435];
				for (@Pc(246) int local246 = Static80.anInt1542; local246 <= Static200.anInt3912; local246++) {
					@Pc(257) Class53_Sub1 local257 = Static155.method2476(local246);
					if (local257 != null) {
						Static96.aClass53_Sub1Array1[local129++] = local257;
					}
				}
				Static259.aClass158_3.method3779();
				Static259.aClass158_3 = null;
				Static281.aByteArray71 = null;
				Static263.anInt906 = 0;
				Static134.anInt2799 = 0;
				Static270.aLong178 = Static133.method2163();
				return 0;
			} else {
				return Static267.method2846(1002);
			}
		} catch (@Pc(288) IOException local288) {
			return Static267.method2846(1003);
		}
	}
}
