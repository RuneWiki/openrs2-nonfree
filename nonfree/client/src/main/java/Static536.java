import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static536 {

	@OriginalMember(owner = "client!qp", name = "i", descriptor = "Lclient!ha;")
	public static Class22 aClass22_11;

	@OriginalMember(owner = "client!qp", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString105;

	@OriginalMember(owner = "client!qp", name = "d", descriptor = "Ljava/lang/Object;")
	public static Object anObject15;

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(Lclient!ika;Z)Lclient!qr;")
	public static Class104_Sub3 method7115(@OriginalArg(0) Class3_Sub2 arg0) {
		@Pc(13) Class104 local13 = Static707.method9440(arg0);
		@Pc(17) int local17 = arg0.method2036();
		@Pc(21) int local21 = arg0.method2036();
		@Pc(25) int local25 = arg0.method2028(-14795);
		return new Class104_Sub3(local13.aClass223_11, local13.aClass352_11, local13.anInt8368, local13.anInt8366, local13.anInt8371, local13.anInt8367, local13.anInt8375, local13.anInt8365, local13.anInt8370, local17, local21, local25);
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(ZIILclient!nt;)V")
	public static void method7117(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class270 arg2) {
		@Pc(8) Class252 local8 = arg2.method6017(Static153.aClass22_4);
		if (local8 == null) {
			return;
		}
		Static153.aClass22_4.KA(arg0, arg1, arg2.anInt7015 + arg0, arg2.anInt7045 + arg1);
		if (Static306.anInt4920 < 3) {
			Static166.aClass178_3.method7626((float) arg2.anInt7015 / 2.0F + (float) arg0, (float) arg2.anInt7045 / 2.0F + (float) arg1, ((int) -Static382.aFloat40 & 0x3FFF) << 2, local8.aClass1_1, arg0, arg1);
		} else {
			Static153.aClass22_4.A(-16777216, local8.aClass1_1, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "([BZ)Lclient!b;")
	public static Class3_Sub7_Sub1 method7118(@OriginalArg(0) byte[] arg0) {
		@Pc(9) Class3_Sub7_Sub1 local9 = new Class3_Sub7_Sub1();
		@Pc(14) Class3_Sub2 local14 = new Class3_Sub2(arg0);
		local14.anInt2178 = local14.aByteArray20.length - 2;
		@Pc(25) int local25 = local14.method2028(-14795);
		@Pc(36) int local36 = local14.aByteArray20.length - local25 - 16 - 2;
		local14.anInt2178 = local36;
		@Pc(43) int local43 = local14.method2036();
		local9.anInt1119 = local14.method2028(-14795);
		local9.anInt1118 = local14.method2028(-14795);
		local9.anInt1114 = local14.method2028(-14795);
		local9.anInt1112 = local14.method2028(-14795);
		local9.anInt1116 = local14.method2028(-14795);
		local9.anInt1117 = local14.method2028(-14795);
		@Pc(77) int local77 = local14.method2048(255);
		@Pc(85) int local85;
		@Pc(91) int local91;
		if (local77 > 0) {
			local9.aClass313Array1 = new Class313[local77];
			for (local85 = 0; local85 < local77; local85++) {
				local91 = local14.method2028(-14795);
				@Pc(98) Class313 local98 = new Class313(Static92.method1941(local91));
				local9.aClass313Array1[local85] = local98;
				while (local91-- > 0) {
					@Pc(109) int local109 = local14.method2036();
					@Pc(113) int local113 = local14.method2036();
					local98.method7107((long) local109, new Class3_Sub44(local113));
				}
			}
		}
		local14.anInt2178 = 0;
		local9.aString10 = local14.method2066();
		local9.anIntArray66 = new int[local43];
		local85 = 0;
		while (local14.anInt2178 < local36) {
			local91 = local14.method2028(-14795);
			if (local91 == 3) {
				if (local9.aStringArray2 == null) {
					local9.aStringArray2 = new String[local43];
				}
				local9.aStringArray2[local85] = local14.method2014().intern();
			} else if (local91 == 54) {
				if (local9.aLongArray2 == null) {
					local9.aLongArray2 = new long[local43];
				}
				local9.aLongArray2[local85] = local14.method2063();
			} else {
				if (local9.anIntArray65 == null) {
					local9.anIntArray65 = new int[local43];
				}
				if (local91 >= 150 || local91 == 21 || local91 == 38 || local91 == 39) {
					local9.anIntArray65[local85] = local14.method2048(255);
				} else {
					local9.anIntArray65[local85] = local14.method2036();
				}
			}
			local9.anIntArray66[local85++] = local91;
		}
		if (false) {
			return null;
		} else {
			return local9;
		}
	}
}
