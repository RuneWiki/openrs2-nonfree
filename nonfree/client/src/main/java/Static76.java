import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!daa", name = "S", descriptor = "Lclient!bf;")
	public static final Class24 aClass24_1 = new Class24();

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(ZBI)V")
	public static void method1563(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			Static103.aClass39_3 = Static384.method6029(Static281.aClass2_Sub19_Sub1_1.anInt2192 * 2, Static517.aCanvas14, Static19.aClass53_4, Static11.anInterface12_10, 0);
		} else {
			if (arg0) {
				Static103.aClass39_3 = Static384.method6029(0, Static517.aCanvas14, Static19.aClass53_4, Static11.anInterface12_10, 0);
				Static103.aClass39_3.Z(0);
				@Pc(40) Class52 local40 = Static337.method5338(Static184.anInt3392, Static36.aClass53_10);
				@Pc(49) Class47 local49 = Static103.aClass39_3.method6078(local40, Static558.method6365(Static460.aClass53_147, Static184.anInt3392));
				Static263.method4275(local49, true, Static290.aClass202_161.method5139(Static172.anInt6352));
				Static58.method1077();
				Static103.aClass39_3.method6021();
			}
			try {
				Static103.aClass39_3 = Static384.method6029(Static281.aClass2_Sub19_Sub1_1.anInt2192 * 2, Static517.aCanvas14, Static19.aClass53_4, Static11.anInterface12_10, arg1);
				if (Static103.aClass39_3.method6014()) {
					@Pc(80) boolean local80 = true;
					try {
						local80 = jagmisc.getTotalPhysicalMemory() > 268435456L;
					} catch (@Pc(92) Throwable local92) {
					}
					@Pc(98) Class2_Sub4 local98;
					if (local80) {
						local98 = Static103.aClass39_3.method6033(146800640);
					} else {
						local98 = Static103.aClass39_3.method6033(104857600);
					}
					Static103.aClass39_3.method6050(local98);
				}
			} catch (@Pc(109) Throwable local109) {
				Static103.aClass39_3 = Static384.method6029(0, Static517.aCanvas14, Static19.aClass53_4, Static11.anInterface12_10, 0);
				arg1 = 0;
			}
		}
		Static266.anInt4923 = arg1;
		Static449.method6867();
		if (!Static103.aClass39_3.method6037()) {
			Static178.anInt3308 = 1;
		}
		Static103.aClass39_3.method6074(Static178.anInt3308);
		Static103.aClass39_3.method6047(0);
		Static103.aClass39_3.L(8);
		Static338.aClass181_13 = Static103.aClass39_3.method6035();
		Static267.aClass181_14 = Static103.aClass39_3.method6035();
		Static8.method372();
		Static103.aClass39_3.method6044(!Static281.aClass2_Sub19_Sub1_1.aBoolean182);
		if (Static103.aClass39_3.method6026()) {
			Static3.method262(Static281.aClass2_Sub19_Sub1_1.aBoolean192);
		}
		Static132.method2414(Static511.anInt8889 >> 3, Static363.anInt1158 >> 3, Static103.aClass39_3);
		Static330.method3998();
		Static210.aBoolean299 = false;
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(IC)Z")
	public static boolean method1565(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
