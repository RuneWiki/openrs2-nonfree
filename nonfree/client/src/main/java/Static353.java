import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static353 {

	@OriginalMember(owner = "client!ko", name = "v", descriptor = "I")
	public static int anInt5597;

	@OriginalMember(owner = "client!ko", name = "q", descriptor = "I")
	public static int anInt5602;

	@OriginalMember(owner = "client!ko", name = "s", descriptor = "Lclient!oe;")
	public static Class274 aClass274_1;

	@OriginalMember(owner = "client!ko", name = "x", descriptor = "Lclient!sla;")
	public static final Class344 aClass344_7 = new Class344(0, 2);

	@OriginalMember(owner = "client!ko", name = "n", descriptor = "Z")
	public static boolean aBoolean363 = false;

	@OriginalMember(owner = "client!ko", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString68 = null;

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(I[Ljava/lang/Object;[I)V")
	public static void method4958(@OriginalArg(1) Object[] arg0, @OriginalArg(2) int[] arg1) {
		Static94.method1949(0, arg1.length - 1, arg0, arg1);
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(ZBLclient!ik;Ljava/lang/String;)Lclient!uk;")
	public static Class377 method4959(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class182 arg1, @OriginalArg(3) String arg2) {
		@Pc(10) int local10 = arg1.method3978(arg2);
		if (local10 == -1) {
			return new Class377(0);
		}
		@Pc(24) int[] local24 = arg1.method3954(local10);
		@Pc(30) Class377 local30 = new Class377(local24.length);
		@Pc(41) int local41 = 0;
		@Pc(43) int local43 = 0;
		while (true) {
			while (local41 < local30.anInt10084) {
				@Pc(57) Class3_Sub2 local57 = new Class3_Sub2(arg1.method3985(local24[local43++], local10));
				@Pc(61) int local61 = local57.method2036();
				@Pc(65) int local65 = local57.method2028(-14795);
				@Pc(69) int local69 = local57.method2048(255);
				if (!arg0 && local69 == 1) {
					local30.anInt10084--;
				} else {
					local30.anIntArray733[local41] = local61;
					local30.anIntArray732[local41] = local65;
					local41++;
				}
			}
			return local30;
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(B)V")
	public static void method4960() {
		@Pc(22) Class3_Sub29 local22 = Static507.method6901(Static556.aClass144_83, Static95.aClass292_2.aClass88_2);
		local22.aClass3_Sub2_Sub1_1.method2065(Static276.method3880(3));
		local22.aClass3_Sub2_Sub1_1.method2032(Static681.anInt10652);
		local22.aClass3_Sub2_Sub1_1.method2032(Static76.anInt1720);
		local22.aClass3_Sub2_Sub1_1.method2065(Static580.aClass3_Sub22_24.aClass21_Sub6_2.method3188());
		Static95.aClass292_2.method6855(local22);
	}
}
