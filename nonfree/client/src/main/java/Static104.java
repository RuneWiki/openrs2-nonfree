import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!dv", name = "c", descriptor = "Lclient!bga;")
	public static Class6_Sub6_Sub1 aClass6_Sub6_Sub1_4;

	@OriginalMember(owner = "client!dv", name = "h", descriptor = "I")
	public static int anInt7872 = 0;

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(I)V")
	public static void method6572() {
		Static539.aClass339_6.method7935();
		Static165.aClass25_3.method988();
		Static517.aClass285_2.method7165();
		Static480.aClass57_11.method1468();
		Static504.aClass343_2.method7991();
		Static98.aClass203_1.method4901();
		Static114.aClass156_2.method4109();
		Static355.aClass278_2.method6829();
		Static177.aClass171_1.method4472();
		Static329.aClass294_1.method7329();
		Static416.aClass250_1.method6262();
		Static109.aClass226_3.method5641();
		Static17.aClass42_3.method1145();
		Static72.aClass165_1.method4286();
		Static499.aClass118_2.method3498();
		Static61.aClass15_1.method643();
		Static273.aClass115_1.method3457();
		Static116.aClass110_1.method2922();
		Static106.aClass205_1.method4922();
		Static370.aClass17_1.method656();
		Static109.method2239();
		Static517.method7583();
		Static123.method2427();
		Static284.method4664();
		Static268.aClass245_63.method6076();
		Static272.aClass245_42.method6076();
		Static208.aClass245_35.method6076();
		Static6.aClass245_7.method6076();
		Static89.aClass245_23.method6076();
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(I[BI)I")
	public static int method6574(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		return Static225.method4049(0, arg1, arg0);
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(III)Z")
	public static boolean method6577(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(IB)I")
	public static int method6578(@OriginalArg(0) int arg0) {
		if (arg0 < 96) {
			return 0;
		} else if (arg0 < 128) {
			return 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!dv", name = "b", descriptor = "(III)Z")
	public static boolean method6580(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static173.anIntArrayArrayArray4[arg0][arg1][arg2];
		if (local7 == -Static467.anInt8612) {
			return false;
		} else if (local7 == Static467.anInt8612) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << Static494.anInt8859;
			@Pc(26) int local26 = arg2 << Static494.anInt8859;
			if (Static220.method3989(local22 + 1, Static47.aClass62Array1[arg0].JA(arg1, arg2), local26 + 1) && Static220.method3989(local22 + Static364.anInt7313 - 1, Static47.aClass62Array1[arg0].JA(arg1 + 1, arg2), local26 + 1) && Static220.method3989(local22 + Static364.anInt7313 - 1, Static47.aClass62Array1[arg0].JA(arg1 + 1, arg2 + 1), local26 + Static364.anInt7313 - 1) && Static220.method3989(local22 + 1, Static47.aClass62Array1[arg0].JA(arg1, arg2 + 1), local26 + Static364.anInt7313 - 1) && Static220.method3989(local22 + Static406.anInt9843, Static47.aClass62Array1[arg0].JA(arg1, arg2), local26 + 1) && Static220.method3989(local22 + Static364.anInt7313 - 1, Static47.aClass62Array1[arg0].JA(arg1 + 1, arg2), local26 + Static406.anInt9843) && Static220.method3989(local22 + Static406.anInt9843, Static47.aClass62Array1[arg0].JA(arg1, arg2 + 1), local26 + Static364.anInt7313 - 1) && Static220.method3989(local22 + Static364.anInt7313 - 1, Static47.aClass62Array1[arg0].JA(arg1, arg2), local26 + Static406.anInt9843) && Static220.method3989(local22 + Static406.anInt9843, Static47.aClass62Array1[arg0].JA(arg1, arg2), local26 + Static406.anInt9843)) {
				Static173.anIntArrayArrayArray4[arg0][arg1][arg2] = Static467.anInt8612;
				return true;
			} else {
				Static173.anIntArrayArrayArray4[arg0][arg1][arg2] = -Static467.anInt8612;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!dv", name = "c", descriptor = "(I)V")
	public static void method6581() {
		for (@Pc(14) Class6_Sub41 local14 = (Class6_Sub41) Static532.aClass211_72.method5183(); local14 != null; local14 = (Class6_Sub41) Static532.aClass211_72.method5177()) {
			if (local14.anInt8267 > 0) {
				local14.anInt8267--;
			}
			if (local14.anInt8267 != 0) {
				if (local14.anInt8266 > 0) {
					local14.anInt8266--;
				}
				if (local14.anInt8266 == 0 && local14.anInt8273 >= 1 && local14.anInt8275 >= 1 && local14.anInt8273 <= Static228.anInt4746 - 2 && local14.anInt8275 <= Static44.anInt1275 - 2 && (local14.anInt8265 < 0 || Static514.method7576(local14.anInt8276, local14.anInt8265))) {
					Static475.method7280(-1, local14.anInt8272, local14.anInt8271, local14.anInt8265, local14.anInt8274, local14.anInt8275, local14.anInt8273, local14.anInt8276);
					local14.anInt8266 = -1;
					if (local14.anInt8269 == local14.anInt8265 && local14.anInt8269 == -1) {
						local14.method8151();
					} else if (local14.anInt8269 == local14.anInt8265 && local14.anInt8264 == local14.anInt8272 && local14.anInt8276 == local14.anInt8270) {
						local14.method8151();
					}
				}
			} else if (local14.anInt8269 < 0 || Static514.method7576(local14.anInt8270, local14.anInt8269)) {
				Static475.method7280(-1, local14.anInt8264, local14.anInt8271, local14.anInt8269, local14.anInt8274, local14.anInt8275, local14.anInt8273, local14.anInt8270);
				local14.method8151();
			}
		}
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(IIB)Z")
	public static boolean method6583(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static242.method4246(arg0, arg1) & ((arg0 & 0x2000) != 0 | Static396.method6260(arg1, arg0) | Static393.method6186(arg1, arg0));
	}
}
