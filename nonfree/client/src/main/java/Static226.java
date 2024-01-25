import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static226 {

	@OriginalMember(owner = "client!ic", name = "E", descriptor = "Z")
	public static boolean aBoolean324 = false;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILjava/lang/Class;Ljava/lang/String;)Z")
	public static boolean method3557(@OriginalArg(1) Class arg0, @OriginalArg(2) String arg1) {
		@Pc(13) Class local13 = (Class) Static54.aHashtable2.get(arg1);
		if (local13 != null) {
			return local13.getClassLoader() == arg0.getClassLoader();
		}
		@Pc(26) File local26 = null;
		if (local26 == null) {
			local26 = (File) Static498.aHashtable7.get(arg1);
		}
		if (local26 != null) {
			try {
				local26 = new File(local26.getCanonicalPath());
				@Pc(44) Class local44 = Class.forName("java.lang.Runtime");
				@Pc(47) Class local47 = Class.forName("java.lang.reflect.AccessibleObject");
				@Pc(57) Method local57 = local47.getDeclaredMethod("setAccessible", Boolean.TYPE);
				@Pc(73) Method local73 = local44.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String"));
				local57.invoke(local73, Boolean.TRUE);
				local73.invoke(Runtime.getRuntime(), arg0, local26.getPath());
				local57.invoke(local73, Boolean.FALSE);
				Static54.aHashtable2.put(arg1, arg0);
				return true;
			} catch (@Pc(116) NoSuchMethodException local116) {
				System.load(local26.getPath());
				Static54.aHashtable2.put(arg1, km.class);
				return true;
			} catch (@Pc(134) Throwable local134) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!d;Lclient!ha;B)V")
	public static void method3558(@OriginalArg(0) Interface8 arg0, @OriginalArg(1) Class126 arg1) {
		if (Static203.aClass5_Sub4_Sub1_2 == null) {
			return;
		}
		if (Static88.anInt1458 < 10) {
			if (!Static203.aClass384_2.method8894(Static203.aClass5_Sub4_Sub1_2.aString11)) {
				Static88.anInt1458 = Static280.aClass384_71.method8879(Static203.aClass5_Sub4_Sub1_2.aString11) / 10;
				return;
			}
			Static519.method6247();
			Static88.anInt1458 = 10;
		}
		if (Static88.anInt1458 == 10) {
			Static203.anInt136 = Static203.aClass5_Sub4_Sub1_2.anInt523 >> 6 << 6;
			Static203.anInt137 = Static203.aClass5_Sub4_Sub1_2.anInt515 >> 6 << 6;
			Static203.anInt134 = (Static203.aClass5_Sub4_Sub1_2.anInt516 >> 6 << 6) + 64 - Static203.anInt136;
			Static203.anInt130 = (Static203.aClass5_Sub4_Sub1_2.anInt526 >> 6 << 6) + 64 - Static203.anInt137;
			@Pc(73) int[] local73 = new int[3];
			@Pc(75) int local75 = -1;
			@Pc(77) int local77 = -1;
			if (Static203.aClass5_Sub4_Sub1_2.method543(local73, Static113.anInt1785 + (Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.anInt9317 >> 9), (Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.anInt9315 >> 9) + Static622.anInt10087, Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.aByte125)) {
				local77 = local73[2] - Static203.anInt137;
				local75 = local73[1] - Static203.anInt136;
			}
			if (!Static591.aBoolean778 && local75 >= 0 && Static203.anInt134 > local75 && local77 >= 0 && Static203.anInt130 > local77) {
				local77 += (int) (Math.random() * 10.0D) - 5;
				local75 += (int) (Math.random() * 10.0D) - 5;
				Static504.anInt8544 = local75;
				Static449.anInt7564 = local77;
			} else if (Static528.anInt8800 == -1 || Static601.anInt9877 == -1) {
				Static203.aClass5_Sub4_Sub1_2.method546(Static203.aClass5_Sub4_Sub1_2.anInt518 >> 14 & 0x3FFF, local73, Static203.aClass5_Sub4_Sub1_2.anInt518 & 0x3FFF);
				Static504.anInt8544 = local73[1] - Static203.anInt136;
				Static449.anInt7564 = local73[2] - Static203.anInt137;
			} else {
				Static203.aClass5_Sub4_Sub1_2.method546(Static528.anInt8800, local73, Static601.anInt9877);
				if (local73 != null) {
					Static504.anInt8544 = local73[1] - Static203.anInt136;
					Static449.anInt7564 = local73[2] - Static203.anInt137;
				}
				Static601.anInt9877 = -1;
				Static528.anInt8800 = -1;
				Static591.aBoolean778 = false;
			}
			if (Static203.aClass5_Sub4_Sub1_2.anInt525 == 37) {
				Static203.aFloat3 = 3.0F;
				Static203.aFloat4 = 3.0F;
			} else if (Static203.aClass5_Sub4_Sub1_2.anInt525 == 50) {
				Static203.aFloat3 = 4.0F;
				Static203.aFloat4 = 4.0F;
			} else if (Static203.aClass5_Sub4_Sub1_2.anInt525 == 75) {
				Static203.aFloat3 = 6.0F;
				Static203.aFloat4 = 6.0F;
			} else if (Static203.aClass5_Sub4_Sub1_2.anInt525 == 100) {
				Static203.aFloat3 = 8.0F;
				Static203.aFloat4 = 8.0F;
			} else if (Static203.aClass5_Sub4_Sub1_2.anInt525 == 200) {
				Static203.aFloat3 = 16.0F;
				Static203.aFloat4 = 16.0F;
			} else {
				Static203.aFloat3 = 8.0F;
				Static203.aFloat4 = 8.0F;
			}
			Static203.anInt126 = (int) Static203.aFloat3 >> 1;
			Static203.aByteArrayArrayArray2 = Static86.method1350(Static203.anInt126);
			Static503.method3569();
			Static203.method149();
			Static173.aClass306_13 = new Class306();
			Static203.anInt124 += (int) (Math.random() * 5.0D) - 2;
			if (Static203.anInt124 < -8) {
				Static203.anInt124 = -8;
			}
			if (Static203.anInt124 > 8) {
				Static203.anInt124 = 8;
			}
			Static203.anInt125 += (int) (Math.random() * 5.0D) - 2;
			if (Static203.anInt125 < -16) {
				Static203.anInt125 = -16;
			}
			if (Static203.anInt125 > 16) {
				Static203.anInt125 = 16;
			}
			Static203.method161(arg0, Static203.anInt124 >> 2 << 10, Static203.anInt125 >> 1);
			Static203.aClass273_2.method6530(1024, 256);
			Static203.aClass56_2.method1170(256, 256);
			Static203.aClass371_2.method8558(4096);
			Static386.aClass338_1.method8032(256);
			Static88.anInt1458 = 20;
		} else if (Static88.anInt1458 == 20) {
			Static233.method6780(true);
			Static203.method162(arg1, Static203.anInt124, Static203.anInt125);
			Static88.anInt1458 = 60;
			Static233.method6780(true);
			Static619.method8532();
		} else if (Static88.anInt1458 == 60) {
			if (Static203.aClass384_2.method8876(Static203.aClass5_Sub4_Sub1_2.aString11 + "_staticelements")) {
				if (!Static203.aClass384_2.method8894(Static203.aClass5_Sub4_Sub1_2.aString11 + "_staticelements")) {
					return;
				}
				Static203.aClass383_2 = Static119.method1739(Static202.aBoolean294, Static203.aClass384_2, Static203.aClass5_Sub4_Sub1_2.aString11 + "_staticelements");
			} else {
				Static203.aClass383_2 = new Class383(0);
			}
			Static203.method165();
			Static88.anInt1458 = 70;
			Static233.method6780(true);
			Static619.method8532();
		} else if (Static88.anInt1458 == 70) {
			Static245.aClass262_2 = new Class262(arg1, 11, true, Static181.aCanvas3);
			Static88.anInt1458 = 73;
			Static233.method6780(true);
			Static619.method8532();
		} else if (Static88.anInt1458 == 73) {
			Static334.aClass262_4 = new Class262(arg1, 12, true, Static181.aCanvas3);
			Static88.anInt1458 = 76;
			Static233.method6780(true);
			Static619.method8532();
		} else if (Static88.anInt1458 == 76) {
			Static639.aClass262_8 = new Class262(arg1, 14, true, Static181.aCanvas3);
			Static88.anInt1458 = 79;
			Static233.method6780(true);
			Static619.method8532();
		} else if (Static88.anInt1458 == 79) {
			Static173.aClass262_1 = new Class262(arg1, 17, true, Static181.aCanvas3);
			Static88.anInt1458 = 82;
			Static233.method6780(true);
			Static619.method8532();
		} else if (Static88.anInt1458 == 82) {
			Static453.aClass262_6 = new Class262(arg1, 19, true, Static181.aCanvas3);
			Static88.anInt1458 = 85;
			Static233.method6780(true);
			Static619.method8532();
		} else if (Static88.anInt1458 == 85) {
			Static413.aClass262_5 = new Class262(arg1, 22, true, Static181.aCanvas3);
			Static88.anInt1458 = 88;
			Static233.method6780(true);
			Static619.method8532();
		} else if (Static88.anInt1458 == 88) {
			Static493.aClass262_7 = new Class262(arg1, 26, true, Static181.aCanvas3);
			Static88.anInt1458 = 91;
			Static233.method6780(true);
			Static619.method8532();
		} else {
			Static272.aClass262_3 = new Class262(arg1, 30, true, Static181.aCanvas3);
			Static88.anInt1458 = 100;
			Static233.method6780(true);
			Static619.method8532();
			System.gc();
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(III)Lclient!og;")
	public static Class14_Sub1_Sub3 method3559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class156 local7 = Static535.aClass156ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass14_Sub1_Sub3_2;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IILclient!wd;)Z")
	public static boolean method3560(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub12_Sub2 arg1) {
		@Pc(8) int local8 = arg1.method8670(2);
		@Pc(27) int local27;
		@Pc(34) int local34;
		@Pc(101) int local101;
		@Pc(105) int local105;
		@Pc(111) int local111;
		if (local8 == 0) {
			if (arg1.method8670(1) != 0) {
				method3560(arg0, arg1);
			}
			local27 = arg1.method8670(6);
			local34 = arg1.method8670(6);
			@Pc(44) boolean local44 = arg1.method8670(1) == 1;
			if (local44) {
				Static417.anIntArray574[Static385.anInt6764++] = arg0;
			}
			if (Static377.aClass14_Sub1_Sub1_Sub3_Sub1Array1[arg0] != null) {
				throw new RuntimeException("hr:lr");
			}
			@Pc(67) Class127 local67 = Static495.aClass127Array3[arg0];
			@Pc(75) Class14_Sub1_Sub1_Sub3_Sub1 local75 = Static377.aClass14_Sub1_Sub1_Sub3_Sub1Array1[arg0] = new Class14_Sub1_Sub1_Sub3_Sub1();
			local75.anInt2960 = arg0;
			if (Static578.aClass5_Sub12Array1[arg0] != null) {
				local75.method2369(Static578.aClass5_Sub12Array1[arg0]);
			}
			local75.method2521(local67.anInt3248, true);
			local75.anInt2951 = local67.anInt3247;
			local101 = local67.anInt3245;
			local105 = local101 >> 28;
			local111 = local101 >> 14 & 0xFF;
			@Pc(115) int local115 = local101 & 0xFF;
			@Pc(125) int local125 = (local111 << 6) + local27 - Static113.anInt1785;
			@Pc(134) int local134 = (local115 << 6) + local34 - Static622.anInt10087;
			local75.aBoolean238 = local67.aBoolean271;
			local75.aByteArray27[0] = Static514.aByteArray78[arg0];
			local75.aByte125 = local75.aByte126 = (byte) local105;
			if (Static353.method5596(local125, local134)) {
				local75.aByte126++;
			}
			local75.method2371(local134, local125);
			local75.aBoolean240 = false;
			Static495.aClass127Array3[arg0] = null;
			return true;
		} else if (local8 == 1) {
			local27 = arg1.method8670(2);
			local34 = Static495.aClass127Array3[arg0].anInt3245;
			Static495.aClass127Array3[arg0].anInt3245 = ((local27 + (local34 >> 28) & 0x3) << 28) + (local34 & 0xFFFFFFF);
			return false;
		} else {
			@Pc(228) int local228;
			@Pc(233) int local233;
			@Pc(242) int local242;
			if (local8 != 2) {
				local27 = arg1.method8670(18);
				local34 = local27 >> 16;
				local228 = local27 >> 8 & 0xFF;
				local233 = local27 & 0xFF;
				local242 = Static495.aClass127Array3[arg0].anInt3245;
				local101 = (local242 >> 28) + local34 & 0x3;
				local105 = (local242 >> 14) + local228 & 0xFF;
				local111 = local233 + local242 & 0xFF;
				Static495.aClass127Array3[arg0].anInt3245 = local111 + (local105 << 14) + (local101 << 28);
				return false;
			}
			local27 = arg1.method8670(5);
			local34 = local27 >> 3;
			local228 = local27 & 0x7;
			local233 = Static495.aClass127Array3[arg0].anInt3245;
			local242 = (local233 >> 28) + local34 & 0x3;
			local101 = local233 >> 14 & 0xFF;
			local105 = local233 & 0xFF;
			if (local228 == 0) {
				local101--;
				local105--;
			}
			if (local228 == 1) {
				local105--;
			}
			if (local228 == 2) {
				local101++;
				local105--;
			}
			if (local228 == 3) {
				local101--;
			}
			if (local228 == 4) {
				local101++;
			}
			if (local228 == 5) {
				local105++;
				local101--;
			}
			if (local228 == 6) {
				local105++;
			}
			if (local228 == 7) {
				local101++;
				local105++;
			}
			Static495.aClass127Array3[arg0].anInt3245 = (local101 << 14) + ((local242 << 28) + local105);
			return false;
		}
	}
}
