import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "client!qk", name = "c", descriptor = "Lclient!nq;")
	public static Class144 aClass144_87;

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(B)V")
	public static void method4446() {
		Static204.method3650(false);
		if (Static43.anInt852 >= 0 && Static43.anInt852 != 0) {
			Static156.method2520(Static43.anInt852);
			Static43.anInt852 = -1;
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)Z")
	public static boolean method4447() {
		if (Static67.aBoolean77) {
			try {
				Static360.method555("showVideoAd", Static77.aClass118_7.anApplet1);
				return true;
			} catch (@Pc(14) Throwable local14) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILclient!ms;Lclient!ms;)V")
	public static void method4448(@OriginalArg(1) Class137 arg0, @OriginalArg(2) Class137 arg1) {
		Static313.aClass11_Sub25_Sub1_5.method2454(90);
		Static313.aClass11_Sub25_Sub1_5.method5168(arg1.anInt4044);
		Static313.aClass11_Sub25_Sub1_5.method5182(arg0.anInt4044);
		Static313.aClass11_Sub25_Sub1_5.method5196(arg1.anInt4112);
		Static313.aClass11_Sub25_Sub1_5.method5204(arg1.anInt4095);
		Static313.aClass11_Sub25_Sub1_5.method5196(arg0.anInt4095);
		Static313.aClass11_Sub25_Sub1_5.method5191(arg0.anInt4112);
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method4449(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(20) String local20 = Static151.method2277(arg0);
		if (local20 == null) {
			return;
		}
		for (@Pc(25) int local25 = 0; local25 < Static20.anInt374; local25++) {
			@Pc(31) String local31 = Static193.aStringArray30[local25];
			if (local31.startsWith("*")) {
				local31 = local31.substring(1);
			}
			local31 = Static151.method2277(local31);
			if (local31 != null && local31.equals(local20)) {
				Static20.anInt374--;
				for (@Pc(55) int local55 = local25; local55 < Static20.anInt374; local55++) {
					Static193.aStringArray30[local55] = Static193.aStringArray30[local55 + 1];
					Static272.aStringArray40[local55] = Static272.aStringArray40[local55 + 1];
					Static16.anIntArray18[local55] = Static16.anIntArray18[local55 + 1];
					Static91.aStringArray16[local55] = Static91.aStringArray16[local55 + 1];
					Static152.anIntArray425[local55] = Static152.anIntArray425[local55 + 1];
					Static87.aBooleanArray9[local55] = Static87.aBooleanArray9[local55 + 1];
				}
				Static30.anInt546 = Static301.anInt5969;
				Static313.aClass11_Sub25_Sub1_5.method2454(181);
				Static313.aClass11_Sub25_Sub1_5.method5186(Static350.method5658(arg0));
				Static313.aClass11_Sub25_Sub1_5.method5173(arg0);
				break;
			}
		}
	}
}
