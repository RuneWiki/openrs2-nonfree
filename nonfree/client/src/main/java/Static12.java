import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!am", name = "b", descriptor = "I")
	public static int anInt266;

	@OriginalMember(owner = "client!am", name = "f", descriptor = "Lclient!jd;")
	public static Class13 aClass13_2;

	@OriginalMember(owner = "client!am", name = "i", descriptor = "[I")
	public static int[] anIntArray15;

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(BII)V", line = 4)
	public static void method280(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static321.aFloat71 < Static321.aFloat72) {
			Static321.aFloat71 = (float) ((double) Static321.aFloat71 + (double) Static321.aFloat71 / 30.0D);
			if (Static321.aFloat71 > Static321.aFloat72) {
				Static321.aFloat71 = Static321.aFloat72;
			}
			Static275.method2424();
			Static321.anInt6035 = (int) Static321.aFloat71 >> 1;
			Static321.aByteArrayArrayArray15 = Static240.method6019(Static321.anInt6035);
		} else if (Static321.aFloat72 < Static321.aFloat71) {
			Static321.aFloat71 = (float) ((double) Static321.aFloat71 - (double) Static321.aFloat71 / 30.0D);
			if (Static321.aFloat72 > Static321.aFloat71) {
				Static321.aFloat71 = Static321.aFloat72;
			}
			Static275.method2424();
			Static321.anInt6035 = (int) Static321.aFloat71 >> 1;
			Static321.aByteArrayArrayArray15 = Static240.method6019(Static321.anInt6035);
		}
		if (Class163.anInt4321 != -1 && Class2_Sub10.anInt1761 != -1) {
			@Pc(86) int local86 = Class163.anInt4321 - Static142.anInt2769;
			if (local86 < 2 || local86 > 2) {
				local86 /= 8;
			}
			@Pc(103) int local103 = Class2_Sub10.anInt1761 - Static89.anInt2001;
			Static142.anInt2769 += local86;
			if (local103 < 2 || local103 > 2) {
				local103 /= 8;
			}
			Static89.anInt2001 += local103;
			if (local86 == 0 && local103 == 0) {
				Class163.anInt4321 = -1;
				Class2_Sub10.anInt1761 = -1;
			}
			Static275.method2424();
		}
		if (Static226.anInt4488 <= 0) {
			Class11_Sub4_Sub1.anInt3974 = -1;
			Class161.anInt4294 = -1;
		} else {
			Static84.anInt6624--;
			if (Static84.anInt6624 == 0) {
				Static84.anInt6624 = 100;
				Static226.anInt4488--;
			}
		}
		if (!Class144.aBoolean242 || Static184.aClass135_24 == null) {
			return;
		}
		for (@Pc(170) Class2_Sub15 local170 = (Class2_Sub15) Static184.aClass135_24.method3552(); local170 != null; local170 = (Class2_Sub15) Static184.aClass135_24.method3553()) {
			@Pc(179) Class164 local179 = Static321.aClass125_4.method3380(local170.aClass2_Sub20_1.anInt2944);
			if (local170.method2359(arg0, arg1)) {
				if (local179.aStringArray41 != null) {
					if (local179.aStringArray41[4] != null) {
						Static1.method3(-1, true, 0, false, local179.aStringArray41[4], local179.anInt4417, 1007, local179.aString49, -1, (long) local170.aClass2_Sub20_1.anInt2944);
					}
					if (local179.aStringArray41[3] != null) {
						Static1.method3(-1, true, 0, false, local179.aStringArray41[3], local179.anInt4417, 1003, local179.aString49, -1, (long) local170.aClass2_Sub20_1.anInt2944);
					}
					if (local179.aStringArray41[2] != null) {
						Static1.method3(-1, true, 0, false, local179.aStringArray41[2], local179.anInt4417, 1012, local179.aString49, -1, (long) local170.aClass2_Sub20_1.anInt2944);
					}
					if (local179.aStringArray41[1] != null) {
						Static1.method3(-1, true, 0, false, local179.aStringArray41[1], local179.anInt4417, 1002, local179.aString49, -1, (long) local170.aClass2_Sub20_1.anInt2944);
					}
					if (local179.aStringArray41[0] != null) {
						Static1.method3(-1, true, 0, false, local179.aStringArray41[0], local179.anInt4417, 1008, local179.aString49, -1, (long) local170.aClass2_Sub20_1.anInt2944);
					}
				}
				if (!local170.aClass2_Sub20_1.aBoolean207) {
					local170.aClass2_Sub20_1.aBoolean207 = true;
					Static185.method3597(Class2_Sub42.aClass16_9, local170.aClass2_Sub20_1.anInt2944, local179.anInt4417);
				}
				if (local170.aClass2_Sub20_1.aBoolean207) {
					Static185.method3597(Class208.aClass16_7, local170.aClass2_Sub20_1.anInt2944, local179.anInt4417);
				}
			} else if (local170.aClass2_Sub20_1.aBoolean207) {
				local170.aClass2_Sub20_1.aBoolean207 = false;
				Static185.method3597(Class2_Sub2_Sub1.aClass16_1, local170.aClass2_Sub20_1.anInt2944, local179.anInt4417);
			}
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(I)V", line = 161)
	public static void method282() {
		for (@Pc(10) Class2_Sub19 local10 = (Class2_Sub19) Class62.aClass135_14.method3552(); local10 != null; local10 = (Class2_Sub19) Class62.aClass135_14.method3553()) {
			if (local10.aBoolean204) {
				local10.method2942();
			}
		}
		for (@Pc(30) Class2_Sub19 local30 = (Class2_Sub19) Class11_Sub5_Sub6.aClass135_39.method3552(); local30 != null; local30 = (Class2_Sub19) Class11_Sub5_Sub6.aClass135_39.method3553()) {
			if (local30.aBoolean204) {
				local30.method2942();
			}
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(III)Lclient!gq;", line = 204)
	public static Class11_Sub1 method283(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class67 local7 = Static307.aClass67ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass11_Sub1_3;
	}
}
