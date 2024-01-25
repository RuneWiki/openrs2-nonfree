import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static367 {

	@OriginalMember(owner = "client!pe", name = "e", descriptor = "I")
	public static int anInt6543;

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "[I")
	public static final int[] anIntArray490 = new int[3];

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(III)V")
	public static void method5673(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static451.aFloat84 < Static451.aFloat85) {
			Static451.aFloat84 = (float) ((double) Static451.aFloat84 + (double) Static451.aFloat84 / 30.0D);
			if (Static451.aFloat84 > Static451.aFloat85) {
				Static451.aFloat84 = Static451.aFloat85;
			}
			Static2.method4834();
			Static451.anInt3548 = (int) Static451.aFloat84 >> 1;
			Static451.aByteArrayArrayArray3 = Static15.method802(Static451.anInt3548);
		} else if (Static451.aFloat84 > Static451.aFloat85) {
			Static451.aFloat84 = (float) ((double) Static451.aFloat84 - (double) Static451.aFloat84 / 30.0D);
			if (Static451.aFloat84 < Static451.aFloat85) {
				Static451.aFloat84 = Static451.aFloat85;
			}
			Static2.method4834();
			Static451.anInt3548 = (int) Static451.aFloat84 >> 1;
			Static451.aByteArrayArrayArray3 = Static15.method802(Static451.anInt3548);
		}
		if (Static241.anInt2906 != -1 && Static128.anInt3069 != -1) {
			@Pc(83) int local83 = Static241.anInt2906 - Static211.anInt4386;
			if (local83 < 2 || local83 > 2) {
				local83 /= 8;
			}
			@Pc(100) int local100 = Static128.anInt3069 - Static181.anInt3889;
			Static211.anInt4386 += local83;
			if (local100 < 2 || local100 > 2) {
				local100 /= 8;
			}
			if (local83 == 0 && local100 == 0) {
				Static128.anInt3069 = -1;
				Static241.anInt2906 = -1;
			}
			Static181.anInt3889 += local100;
			Static2.method4834();
		}
		if (Static173.anInt3748 > 0) {
			Static527.anInt8941--;
			if (Static527.anInt8941 == 0) {
				Static173.anInt3748--;
				Static527.anInt8941 = 100;
			}
		} else {
			Static388.anInt6745 = -1;
			Static116.anInt2817 = -1;
		}
		if (!Static171.aBoolean235 || Static263.aClass38_39 == null) {
			return;
		}
		for (@Pc(162) Class1_Sub18 local162 = (Class1_Sub18) Static263.aClass38_39.method1419(); local162 != null; local162 = (Class1_Sub18) Static263.aClass38_39.method1415()) {
			@Pc(170) Class24 local170 = Static451.aClass250_3.method6143(local162.aClass1_Sub25_1.anInt4556);
			if (local162.method2920(arg1, arg0)) {
				if (local170.aStringArray4 != null) {
					if (local170.aStringArray4[4] != null) {
						Static179.method3455(0, -1, (long) local162.aClass1_Sub25_1.anInt4556, true, 1004, local170.aStringArray4[4], false, -1, local170.anInt1169, local170.aString4);
					}
					if (local170.aStringArray4[3] != null) {
						Static179.method3455(0, -1, (long) local162.aClass1_Sub25_1.anInt4556, true, 1003, local170.aStringArray4[3], false, -1, local170.anInt1169, local170.aString4);
					}
					if (local170.aStringArray4[2] != null) {
						Static179.method3455(0, -1, (long) local162.aClass1_Sub25_1.anInt4556, true, 1010, local170.aStringArray4[2], false, -1, local170.anInt1169, local170.aString4);
					}
					if (local170.aStringArray4[1] != null) {
						Static179.method3455(0, -1, (long) local162.aClass1_Sub25_1.anInt4556, true, 1008, local170.aStringArray4[1], false, -1, local170.anInt1169, local170.aString4);
					}
					if (local170.aStringArray4[0] != null) {
						Static179.method3455(0, -1, (long) local162.aClass1_Sub25_1.anInt4556, true, 1007, local170.aStringArray4[0], false, -1, local170.anInt1169, local170.aString4);
					}
				}
				if (!local162.aClass1_Sub25_1.aBoolean277) {
					local162.aClass1_Sub25_1.aBoolean277 = true;
					Static387.method5836(Static72.aClass266_3, local162.aClass1_Sub25_1.anInt4556, local170.anInt1169);
				}
				if (local162.aClass1_Sub25_1.aBoolean277) {
					Static387.method5836(Static18.aClass266_1, local162.aClass1_Sub25_1.anInt4556, local170.anInt1169);
				}
			} else if (local162.aClass1_Sub25_1.aBoolean277) {
				local162.aClass1_Sub25_1.aBoolean277 = false;
				Static387.method5836(Static372.aClass266_8, local162.aClass1_Sub25_1.anInt4556, local170.anInt1169);
			}
		}
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(II)Lclient!od;")
	public static Class1_Sub1_Sub16 method5677(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub1_Sub16 local10 = (Class1_Sub1_Sub16) Static196.aClass290_2.method7078((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static214.aClass160_48.method4198(0, arg0);
		if (local25 == null || local25.length <= 1) {
			return null;
		} else {
			local10 = Static7.method229(local25);
			Static196.aClass290_2.method7077((long) arg0, local10);
			return local10;
		}
	}
}
