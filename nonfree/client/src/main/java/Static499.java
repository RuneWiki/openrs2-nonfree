import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static499 {

	@OriginalMember(owner = "client!s", name = "i", descriptor = "[[B")
	public static byte[][] aByteArrayArray26;

	@OriginalMember(owner = "client!s", name = "k", descriptor = "[I")
	public static int[] anIntArray574;

	@OriginalMember(owner = "client!s", name = "l", descriptor = "[[I")
	public static final int[][] anIntArrayArray72 = new int[128][128];

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(ZLclient!ha;Lclient!d;)V")
	public static void method8582(@OriginalArg(1) Class133 arg0, @OriginalArg(2) Interface3 arg1) {
		if (Static620.aClass5_Sub5_Sub16_2 == null) {
			return;
		}
		if (Static353.anInt5917 < 10) {
			if (!Static620.aClass207_103.method4699(Static620.aClass5_Sub5_Sub16_2.aString80)) {
				Static353.anInt5917 = Static56.aClass207_16.method4688(Static620.aClass5_Sub5_Sub16_2.aString80) / 10;
				return;
			}
			Static288.method4542();
			Static353.anInt5917 = 10;
		}
		if (Static353.anInt5917 == 10) {
			Static620.anInt8206 = Static620.aClass5_Sub5_Sub16_2.anInt7397 >> 6 << 6;
			Static620.anInt8210 = Static620.aClass5_Sub5_Sub16_2.anInt7400 >> 6 << 6;
			Static620.anInt8201 = (Static620.aClass5_Sub5_Sub16_2.anInt7398 >> 6 << 6) + 64 - Static620.anInt8206;
			Static620.anInt8204 = (Static620.aClass5_Sub5_Sub16_2.anInt7405 >> 6 << 6) + 64 - Static620.anInt8210;
			@Pc(80) int[] local80 = new int[3];
			@Pc(82) int local82 = -1;
			@Pc(84) int local84 = -1;
			if (Static620.aClass5_Sub5_Sub16_2.method6558(local80, Static567.anInt9589 + (Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.anInt10229 >> 9), Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.aByte132, Static565.anInt9560 + (Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.anInt10231 >> 9))) {
				local84 = local80[2] - Static620.anInt8210;
				local82 = local80[1] - Static620.anInt8206;
			}
			if (!Static106.aBoolean155 && local82 >= 0 && Static620.anInt8201 > local82 && local84 >= 0 && Static620.anInt8204 > local84) {
				local84 += (int) (Math.random() * 10.0D) - 5;
				local82 += (int) (Math.random() * 10.0D) - 5;
				Static235.anInt4321 = local84;
				Static196.anInt3883 = local82;
			} else if (Static181.anInt3227 == -1 || Static4.anInt57 == -1) {
				Static620.aClass5_Sub5_Sub16_2.method6563(Static620.aClass5_Sub5_Sub16_2.anInt7393 & 0x3FFF, Static620.aClass5_Sub5_Sub16_2.anInt7393 >> 14 & 0x3FFF, local80);
				Static235.anInt4321 = local80[2] - Static620.anInt8210;
				Static196.anInt3883 = local80[1] - Static620.anInt8206;
			} else {
				Static620.aClass5_Sub5_Sub16_2.method6563(Static4.anInt57, Static181.anInt3227, local80);
				Static4.anInt57 = -1;
				Static181.anInt3227 = -1;
				Static106.aBoolean155 = false;
				if (local80 != null) {
					Static235.anInt4321 = local80[2] - Static620.anInt8210;
					Static196.anInt3883 = local80[1] - Static620.anInt8206;
				}
			}
			if (Static620.aClass5_Sub5_Sub16_2.anInt7402 == 37) {
				Static620.aFloat147 = 3.0F;
				Static620.aFloat146 = 3.0F;
			} else if (Static620.aClass5_Sub5_Sub16_2.anInt7402 == 50) {
				Static620.aFloat147 = 4.0F;
				Static620.aFloat146 = 4.0F;
			} else if (Static620.aClass5_Sub5_Sub16_2.anInt7402 == 75) {
				Static620.aFloat147 = 6.0F;
				Static620.aFloat146 = 6.0F;
			} else if (Static620.aClass5_Sub5_Sub16_2.anInt7402 == 100) {
				Static620.aFloat147 = 8.0F;
				Static620.aFloat146 = 8.0F;
			} else if (Static620.aClass5_Sub5_Sub16_2.anInt7402 == 200) {
				Static620.aFloat147 = 16.0F;
				Static620.aFloat146 = 16.0F;
			} else {
				Static620.aFloat147 = 8.0F;
				Static620.aFloat146 = 8.0F;
			}
			Static620.anInt8198 = (int) Static620.aFloat147 >> 1;
			Static620.aByteArrayArrayArray20 = Static320.method4868(Static620.anInt8198);
			Static494.method7232();
			Static620.method7134();
			Static608.aClass330_62 = new Class330();
			Static620.anInt8197 += (int) (Math.random() * 5.0D) - 2;
			if (Static620.anInt8197 < -8) {
				Static620.anInt8197 = -8;
			}
			if (Static620.anInt8197 > 8) {
				Static620.anInt8197 = 8;
			}
			Static620.anInt8199 += (int) (Math.random() * 5.0D) - 2;
			if (Static620.anInt8199 < -16) {
				Static620.anInt8199 = -16;
			}
			if (Static620.anInt8199 > 16) {
				Static620.anInt8199 = 16;
			}
			Static620.method7126(arg1, Static620.anInt8197 >> 2 << 10, Static620.anInt8199 >> 1);
			Static620.aClass42_4.method944(256, 1024);
			Static620.aClass333_2.method7938(256, 256);
			Static620.aClass246_6.method5490(4096);
			Static475.aClass370_1.method8788(256);
			Static353.anInt5917 = 20;
		} else if (Static353.anInt5917 == 20) {
			Static33.method520(true);
			Static620.method7137(arg0, Static620.anInt8197, Static620.anInt8199);
			Static353.anInt5917 = 60;
			Static33.method520(true);
			Static88.method1488();
		} else if (Static353.anInt5917 == 60) {
			if (Static620.aClass207_103.method4665(Static620.aClass5_Sub5_Sub16_2.aString80 + "_staticelements")) {
				if (!Static620.aClass207_103.method4699(Static620.aClass5_Sub5_Sub16_2.aString80 + "_staticelements")) {
					return;
				}
				Static620.aClass378_4 = Static576.method8349(Static620.aClass207_103, Static620.aClass5_Sub5_Sub16_2.aString80 + "_staticelements", Static283.aBoolean377);
			} else {
				Static620.aClass378_4 = new Class378(0);
			}
			Static620.method7121();
			Static353.anInt5917 = 70;
			Static33.method520(true);
			Static88.method1488();
		} else if (Static353.anInt5917 == 70) {
			Static104.aClass57_4 = new Class57(arg0, 11, true, Static83.aCanvas14);
			Static353.anInt5917 = 73;
			Static33.method520(true);
			Static88.method1488();
		} else if (Static353.anInt5917 == 73) {
			Static340.aClass57_7 = new Class57(arg0, 12, true, Static83.aCanvas14);
			Static353.anInt5917 = 76;
			Static33.method520(true);
			Static88.method1488();
		} else if (Static353.anInt5917 == 76) {
			Static125.aClass57_2 = new Class57(arg0, 14, true, Static83.aCanvas14);
			Static353.anInt5917 = 79;
			Static33.method520(true);
			Static88.method1488();
		} else if (Static353.anInt5917 == 79) {
			Static557.aClass57_9 = new Class57(arg0, 17, true, Static83.aCanvas14);
			Static353.anInt5917 = 82;
			Static33.method520(true);
			Static88.method1488();
		} else if (Static353.anInt5917 == 82) {
			Static114.aClass57_5 = new Class57(arg0, 19, true, Static83.aCanvas14);
			Static353.anInt5917 = 85;
			Static33.method520(true);
			Static88.method1488();
		} else if (Static353.anInt5917 == 85) {
			Static396.aClass57_8 = new Class57(arg0, 22, true, Static83.aCanvas14);
			Static353.anInt5917 = 88;
			Static33.method520(true);
			Static88.method1488();
		} else if (Static353.anInt5917 == 88) {
			Static101.aClass57_3 = new Class57(arg0, 26, true, Static83.aCanvas14);
			Static353.anInt5917 = 91;
			Static33.method520(true);
			Static88.method1488();
		} else {
			Static177.aClass57_6 = new Class57(arg0, 30, true, Static83.aCanvas14);
			Static353.anInt5917 = 100;
			Static33.method520(true);
			Static88.method1488();
			System.gc();
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIZ)Z")
	public static boolean method8587(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x8000) != 0;
	}
}
