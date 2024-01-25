import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static517 {

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "I")
	public static int anInt8881 = -1;

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(BLclient!oa;)V")
	public static void method7069(@OriginalArg(1) Class90 arg0) {
		Static266.aClass82_4 = Static323.method4983(Static297.anInt5459, arg0);
		Static557.aClass202_14 = Static114.method1793(Static297.anInt5459, arg0);
		Static75.aClass82_1 = Static323.method4983(Static448.anInt7921, arg0);
		Static166.aClass202_9 = Static114.method1793(Static448.anInt7921, arg0);
		Static264.aClass82_3 = Static323.method4983(Static141.anInt2743, arg0);
		Static479.aClass202_13 = Static114.method1793(Static141.anInt2743, arg0);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(BII)Z")
	public static boolean method7070(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x60000) != 0 | Static277.method4167(arg1, arg0) || Static369.method5433(arg0, arg1) || Static133.method2179(arg1, arg0);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZI)I")
	public static int method7071(@OriginalArg(1) int arg0) {
		@Pc(12) int local12 = arg0 & 0x3F;
		@Pc(18) int local18 = arg0 >> 6 & 0x3;
		if (local12 == 18) {
			if (local18 == 0) {
				return 1;
			}
			if (local18 == 1) {
				return 2;
			}
			if (local18 == 2) {
				return 4;
			}
			if (local18 == 3) {
				return 8;
			}
		} else if (local12 == 19 || local12 == 21) {
			if (local18 == 0) {
				return 16;
			}
			if (local18 == 1) {
				return 32;
			}
			if (local18 == 2) {
				return 64;
			}
			if (local18 == 3) {
				return 128;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(JILjava/lang/String;Z)V")
	public static void method7073(@OriginalArg(0) long arg0, @OriginalArg(2) String arg1, @OriginalArg(3) boolean arg2) {
		if (arg2) {
			Static526.method7221();
			if (Static277.aString39.equals("")) {
				Static331.anInt6271 = 39;
				return;
			}
		}
		@Pc(21) Class6_Sub12 local21 = new Class6_Sub12(576);
		local21.method6047(10);
		local21.method6032((int) (Math.random() * 65535.0D));
		local21.method6026(arg0);
		local21.method6032(arg2 ? Static308.anInt5672 : Static543.anInt9322);
		local21.method6009(arg1);
		local21.method6026(arg2 ? Static352.aLong165 : Static184.aLong78);
		if (arg2) {
			local21.method6026(Static529.method7820(Static277.aString39));
			try {
				local21.method6026(Long.parseLong(Static535.aString84));
			} catch (@Pc(101) Exception local101) {
				Static331.anInt6271 = 39;
				return;
			}
		} else {
			local21.method6042((int) (Math.random() * 9.9999999E7D));
			local21.method6042((int) (Math.random() * 9.9999999E7D));
			local21.method6042((int) (Math.random() * 9.9999999E7D));
			local21.method6042((int) (Math.random() * 9.9999999E7D));
		}
		local21.method6042((int) (Math.random() * 9.9999999E7D));
		local21.method6017(Static371.aBigInteger7, Static4.aBigInteger1);
		Static340.aClass6_Sub12_Sub2_1.anInt7556 = 0;
		Static340.aClass6_Sub12_Sub2_1.method6047(arg2 ? Static321.aClass252_12.anInt7316 : Static321.aClass252_9.anInt7316);
		Static340.aClass6_Sub12_Sub2_1.method6032(local21.anInt7556 + 28);
		Static340.aClass6_Sub12_Sub2_1.method6032(614);
		Static340.aClass6_Sub12_Sub2_1.method6047(Static188.anInt28);
		Static340.aClass6_Sub12_Sub2_1.method6047(Static172.aClass68_4.anInt1509);
		Static4.method77(Static340.aClass6_Sub12_Sub2_1);
		Static340.aClass6_Sub12_Sub2_1.method6025(local21.anInt7556, local21.aByteArray97);
		Static500.anInt8692 = 0;
		Static516.anInt8870 = 0;
		Static331.anInt6271 = -3;
		Static402.anInt7273 = 1;
	}
}
