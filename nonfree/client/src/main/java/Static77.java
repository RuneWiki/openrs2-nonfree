import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!ds", name = "d", descriptor = "Lclient!pw;")
	public static Class194 aClass194_2;

	@OriginalMember(owner = "client!ds", name = "w", descriptor = "F")
	public static float aFloat23;

	@OriginalMember(owner = "client!ds", name = "k", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray10 = new String[200];

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(ZZ)V")
	public static void method1406(@OriginalArg(1) boolean arg0) {
		while (true) {
			if (Static176.aClass3_Sub25_Sub1_1.method2779(Static102.anInt1839) >= 15) {
				@Pc(22) int local22 = Static176.aClass3_Sub25_Sub1_1.method2783(15);
				if (local22 != 32767) {
					@Pc(29) boolean local29 = false;
					@Pc(36) Class3_Sub40 local36 = (Class3_Sub40) Static63.aClass140_37.method3490((long) local22);
					@Pc(42) Class1_Sub2_Sub6_Sub1 local42;
					if (local36 == null) {
						local42 = new Class1_Sub2_Sub6_Sub1();
						local42.anInt7621 = local22;
						local36 = new Class3_Sub40(local42);
						Static63.aClass140_37.method3494((long) local22, local36);
						local29 = true;
						Static407.aClass3_Sub40Array1[Static76.anInt1390++] = local36;
					}
					local42 = local36.aClass1_Sub2_Sub6_Sub1_2;
					Static198.anIntArray225[Static379.anInt6398++] = local22;
					local42.anInt7602 = Static172.anInt3107;
					if (local42.aClass158_1 != null && local42.aClass158_1.method3710()) {
						Static186.method2925(local42);
					}
					@Pc(98) int local98;
					if (arg0) {
						local98 = Static176.aClass3_Sub25_Sub1_1.method2783(8);
						if (local98 > 127) {
							local98 -= 256;
						}
					} else {
						local98 = Static176.aClass3_Sub25_Sub1_1.method2783(5);
						if (local98 > 15) {
							local98 -= 32;
						}
					}
					@Pc(124) int local124 = (Static176.aClass3_Sub25_Sub1_1.method2783(3) + 4 & 0x7D200007) << 11;
					@Pc(131) int local131;
					if (arg0) {
						local131 = Static176.aClass3_Sub25_Sub1_1.method2783(8);
						if (local131 > 127) {
							local131 -= 256;
						}
					} else {
						local131 = Static176.aClass3_Sub25_Sub1_1.method2783(5);
						if (local131 > 15) {
							local131 -= 32;
						}
					}
					@Pc(153) int local153 = Static176.aClass3_Sub25_Sub1_1.method2783(1);
					if (local153 == 1) {
						Static288.anIntArray324[Static124.anInt2278++] = local22;
					}
					@Pc(171) int local171 = Static176.aClass3_Sub25_Sub1_1.method2783(2);
					@Pc(176) int local176 = Static176.aClass3_Sub25_Sub1_1.method2783(1);
					local42.method5632(Static118.aClass19_1.method401(Static176.aClass3_Sub25_Sub1_1.method2783(14)));
					local42.method6203(local42.aClass158_1.anInt4454);
					local42.anInt7618 = local42.aClass158_1.anInt4442 << 3;
					if (local29) {
						local42.method6200(local124, true);
					}
					local42.method5633(local42.method6204(), Static203.aClass1_Sub2_Sub6_Sub2_1.anIntArray510[0] + local98, Static203.aClass1_Sub2_Sub6_Sub2_1.anIntArray509[0] + local131, local171, local176 == 1);
					if (local42.aClass158_1.method3710()) {
						Static331.method5981(0, local42.anIntArray509[0], local42, local42.aByte101, null, local42.anIntArray510[0], null);
					}
					continue;
				}
			}
			Static176.aClass3_Sub25_Sub1_1.method2786();
			return;
		}
	}
}
