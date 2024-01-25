import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static441 {

	@OriginalMember(owner = "client!sd", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString63;

	@OriginalMember(owner = "client!sd", name = "g", descriptor = "I")
	public static int anInt8034 = -2;

	@OriginalMember(owner = "client!sd", name = "m", descriptor = "[I")
	public static final int[] anIntArray680 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V")
	public static void method6642() {
		Static421.aClass125_50.method3516();
		Static383.aClass125_39.method3516();
		Static527.aClass125_68.method3516();
		Static549.aClass125_72.method3516();
		Static103.aClass125_14.method3516();
	}

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "(I)V")
	public static void method6645() {
		@Pc(7) Class323 local7 = null;
		try {
			@Pc(13) Class212 local13 = Static401.aClass285_11.method7034(false, "3");
			while (local13.anInt6547 == 0) {
				Static327.method5231(1L);
			}
			if (local13.anInt6547 == 2) {
				throw new RuntimeException("Error opening file");
			}
			local7 = (Class323) local13.anObject13;
			@Pc(48) byte[] local48 = new byte[(int) local7.method7799()];
			if (local48.length == 0) {
				Static446.aString64 = "";
				Static369.aString49 = "";
			} else {
				@Pc(71) int local71;
				for (@Pc(59) int local59 = 0; local59 < local48.length; local59 += local71) {
					local71 = local7.method7797(local59, local48, local48.length - local59);
					if (local71 == -1) {
						throw new IOException("EOF");
					}
				}
				@Pc(92) Class3_Sub27 local92 = new Class3_Sub27(local48);
				@Pc(96) int local96 = local92.method7548();
				if (local96 > 50) {
					throw new RuntimeException("Bad length");
				}
				local92.anInt9191 = local96 + 1;
				if (!local92.method7563()) {
					throw new RuntimeException("Invalid CRC");
				}
				local92.anInt9191 = 1;
				@Pc(127) int local127 = local92.method7548();
				if (local127 > 1) {
					throw new RuntimeException("Invalid version " + local127);
				}
				Static369.aString49 = local92.method7607();
				Static446.aString64 = local92.method7607();
				if (local127 >= 1) {
					Static141.anInt2895 = local92.method7591();
				} else {
					Static141.anInt2895 = Static142.anInt2899;
				}
			}
		} catch (@Pc(164) Exception local164) {
			Static369.aString49 = "";
			Static446.aString64 = "";
		}
		try {
			if (local7 != null) {
				local7.method7794();
			}
		} catch (@Pc(175) Exception local175) {
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IZLclient!kr;)Z")
	public static boolean method6651(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub27_Sub1 arg1) {
		@Pc(8) int local8 = arg1.method4536(2);
		@Pc(25) int local25;
		@Pc(30) int local30;
		@Pc(99) int local99;
		@Pc(103) int local103;
		@Pc(109) int local109;
		if (local8 == 0) {
			if (arg1.method4536(1) != 0) {
				method6651(arg0, arg1);
			}
			local25 = arg1.method4536(6);
			local30 = arg1.method4536(6);
			@Pc(42) boolean local42 = arg1.method4536(1) == 1;
			if (local42) {
				Static345.anIntArray563[Static336.anInt6336++] = arg0;
			}
			if (Static498.aClass6_Sub1_Sub2_Sub1Array1[arg0] != null) {
				throw new RuntimeException("hr:lr");
			}
			@Pc(65) Class89 local65 = Static462.aClass89Array1[arg0];
			@Pc(73) Class6_Sub1_Sub2_Sub1 local73 = Static498.aClass6_Sub1_Sub2_Sub1Array1[arg0] = new Class6_Sub1_Sub2_Sub1();
			local73.anInt8587 = arg0;
			if (Static485.aClass3_Sub27Array1[arg0] != null) {
				local73.method2047(Static485.aClass3_Sub27Array1[arg0]);
			}
			local73.method7079(local65.anInt2754, true);
			local73.anInt8563 = local65.anInt2755;
			local99 = local65.anInt2756;
			local103 = local99 >> 28;
			local109 = local99 >> 14 & 0xFF;
			local73.aBoolean165 = local65.aBoolean203;
			@Pc(117) int local117 = local99 & 0xFF;
			local73.aByteArray99[0] = Static459.aByteArray96[arg0];
			local73.aByte100 = (byte) local103;
			local73.method2044(local25 + (local109 << 6) - Static223.anInt4827, local30 + ((local117 << 6) - Static150.anInt3027));
			local73.aBoolean164 = false;
			Static462.aClass89Array1[arg0] = null;
			return true;
		} else if (local8 == 1) {
			local25 = arg1.method4536(2);
			local30 = Static462.aClass89Array1[arg0].anInt2756;
			Static462.aClass89Array1[arg0].anInt2756 = (local30 & 0xFFFFFFF) + ((local25 + (local30 >> 28) & 0x3) << 28);
			return false;
		} else {
			@Pc(204) int local204;
			@Pc(209) int local209;
			@Pc(217) int local217;
			if (local8 != 2) {
				local25 = arg1.method4536(18);
				local30 = local25 >> 16;
				local204 = local25 >> 8 & 0xFF;
				local209 = local25 & 0xFF;
				local217 = Static462.aClass89Array1[arg0].anInt2756;
				local99 = local30 + (local217 >> 28) & 0x3;
				local103 = local204 + (local217 >> 14) & 0xFF;
				local109 = local209 + local217 & 0xFF;
				Static462.aClass89Array1[arg0].anInt2756 = local109 + (local99 << 28) + (local103 << 14);
				return false;
			}
			local25 = arg1.method4536(5);
			local30 = local25 >> 3;
			local204 = local25 & 0x7;
			local209 = Static462.aClass89Array1[arg0].anInt2756;
			local217 = local30 + (local209 >> 28) & 0x3;
			local99 = local209 >> 14 & 0xFF;
			local103 = local209 & 0xFF;
			if (local204 == 0) {
				local103--;
				local99--;
			}
			if (local204 == 1) {
				local103--;
			}
			if (local204 == 2) {
				local99++;
				local103--;
			}
			if (local204 == 3) {
				local99--;
			}
			if (local204 == 4) {
				local99++;
			}
			if (local204 == 5) {
				local99--;
				local103++;
			}
			if (local204 == 6) {
				local103++;
			}
			if (local204 == 7) {
				local99++;
				local103++;
			}
			Static462.aClass89Array1[arg0].anInt2756 = (local99 << 14) + (local217 << 28) + local103;
			return false;
		}
	}
}
