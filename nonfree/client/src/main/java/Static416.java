import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static416 {

	@OriginalMember(owner = "client!pl", name = "d", descriptor = "Lclient!nb;")
	public static Class232 aClass232_7;

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "[[B")
	public static final byte[][] aByteArrayArray6 = new byte[1000][];

	@OriginalMember(owner = "client!pl", name = "c", descriptor = "I")
	public static int anInt2616 = 0;

	@OriginalMember(owner = "client!pl", name = "e", descriptor = "[Z")
	public static final boolean[] aBooleanArray7 = new boolean[5];

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)V")
	public static void method2251() {
		while (true) {
			if (Static361.aClass2_Sub7_Sub2_1.method4525(Static528.anInt8479) >= 15) {
				@Pc(18) int local18 = Static361.aClass2_Sub7_Sub2_1.method4535(15);
				if (local18 != 32767) {
					@Pc(25) boolean local25 = false;
					@Pc(32) Class2_Sub5 local32 = (Class2_Sub5) Static436.aClass90_26.method1685((long) local18);
					@Pc(38) Class12_Sub2_Sub1_Sub4_Sub2 local38;
					if (local32 == null) {
						local38 = new Class12_Sub2_Sub1_Sub4_Sub2();
						local38.anInt8406 = local18;
						local32 = new Class2_Sub5(local38);
						Static436.aClass90_26.method1684(local32, (long) local18);
						Static379.aClass2_Sub5Array1[Static51.anInt912++] = local32;
						local25 = true;
					}
					local38 = local32.aClass12_Sub2_Sub1_Sub4_Sub2_1;
					Static461.anIntArray562[Static365.anInt6148++] = local18;
					local38.anInt8367 = Static417.anInt8887;
					if (local38.aClass295_1 != null && local38.aClass295_1.method5945()) {
						Static238.method3429(local38);
					}
					@Pc(92) int local92 = Static361.aClass2_Sub7_Sub2_1.method4535(5);
					if (local92 > 15) {
						local92 -= 32;
					}
					@Pc(109) int local109 = (Static361.aClass2_Sub7_Sub2_1.method4535(3) + 4 & 0x37400007) << 11;
					local38.method6784(Static76.aClass361_1.method7581(Static361.aClass2_Sub7_Sub2_1.method4535(14)));
					@Pc(124) int local124 = Static361.aClass2_Sub7_Sub2_1.method4535(2);
					@Pc(129) int local129 = Static361.aClass2_Sub7_Sub2_1.method4535(1);
					@Pc(134) int local134 = Static361.aClass2_Sub7_Sub2_1.method4535(1);
					if (local134 == 1) {
						Static224.anIntArray269[Static549.anInt9008++] = local18;
					}
					@Pc(152) int local152 = Static361.aClass2_Sub7_Sub2_1.method4535(5);
					local38.method6762(local38.aClass295_1.anInt7362);
					if (local152 > 15) {
						local152 -= 32;
					}
					local38.anInt8395 = local38.aClass295_1.anInt7329 << 3;
					if (local25) {
						local38.method6766(local109, true);
					}
					local38.method6783(local124, local38.method6777(), local152 + Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.anIntArray565[0], local129 == 1, Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.anIntArray566[0] + local92);
					if (local38.aClass295_1.method5945()) {
						Static169.method2211(local38.anIntArray566[0], null, 0, local38.anIntArray565[0], local38.aByte128, null, local38);
					}
					continue;
				}
			}
			Static361.aClass2_Sub7_Sub2_1.method4524();
			return;
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IBI)Z")
	public static boolean method2252(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x10000) != 0;
	}
}
