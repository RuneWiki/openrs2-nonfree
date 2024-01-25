import java.awt.Container;
import java.awt.Insets;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static248 {

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "Lclient!bh;")
	public static final Class1_Sub7_Sub1 aClass1_Sub7_Sub1_2 = new Class1_Sub7_Sub1(5000);

	@OriginalMember(owner = "client!qc", name = "k", descriptor = "I")
	public static int anInt4819 = -1;

	@OriginalMember(owner = "client!qc", name = "n", descriptor = "Ljava/util/Random;")
	public static final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!cp;)V")
	public static void method4430(@OriginalArg(0) Class5_Sub3 arg0) {
		for (@Pc(2) int local2 = arg0.aShort75; local2 <= arg0.aShort78; local2++) {
			for (@Pc(6) int local6 = arg0.aShort77; local6 <= arg0.aShort76; local6++) {
				@Pc(16) Class204 local16 = Static138.aClass204ArrayArrayArray1[arg0.aByte53][local2][local6];
				if (local16 != null) {
					@Pc(21) Class17 local21 = local16.aClass17_3;
					@Pc(23) Class17 local23 = null;
					while (local21 != null) {
						if (local21.aClass5_Sub3_1 == arg0) {
							if (local23 == null) {
								local16.aClass17_3 = local21.aClass17_1;
							} else {
								local23.aClass17_1 = local21.aClass17_1;
							}
							local21.method443();
							break;
						}
						local23 = local21;
						local21 = local21.aClass17_1;
					}
					local16.aByte61 = 0;
					for (@Pc(56) Class17 local56 = local16.aClass17_3; local56 != null; local56 = local56.aClass17_1) {
						local16.aByte61 = (byte) (local16.aByte61 | local56.anInt399);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZZ)V")
	public static void method4431(@OriginalArg(0) boolean arg0) {
		@Pc(11) byte local11;
		@Pc(9) byte[][] local9;
		if (arg0) {
			local9 = Static203.aByteArrayArray12;
			local11 = 1;
		} else {
			local11 = 4;
			local9 = Static61.aByteArrayArray4;
		}
		for (@Pc(24) int local24 = 0; local24 < local11; local24++) {
			Static278.method4804();
			for (@Pc(30) int local30 = 0; local30 < Static48.anInt1107 >> 3; local30++) {
				for (@Pc(34) int local34 = 0; local34 < Static337.anInt6402 >> 3; local34++) {
					@Pc(44) int local44 = Static21.anIntArrayArrayArray1[local24][local30][local34];
					if (local44 != -1) {
						@Pc(53) int local53 = local44 >> 24 & 0x3;
						if (!arg0 || local53 == 0) {
							@Pc(66) int local66 = local44 >> 1 & 0x3;
							@Pc(72) int local72 = local44 >> 14 & 0x3FF;
							@Pc(78) int local78 = local44 >> 3 & 0x7FF;
							@Pc(88) int local88 = (local72 / 8 << 8) + local78 / 8;
							for (@Pc(90) int local90 = 0; local90 < Static80.anIntArray184.length; local90++) {
								if (local88 == Static80.anIntArray184[local90] && local9[local90] != null) {
									Static331.method5552(Static24.aClass91Array1, local66, local9[local90], arg0, Static34.aClass2_6, local24, (local72 & 0x7) * 8, (local78 & 0x7) * 8, local53, local30 * 8, local34 * 8);
									break;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method4432(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class1_Sub1_Sub2 local10 = Static42.method1000(3, arg1);
		local10.method168();
		local10.aString4 = arg0;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method4437(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(8) Class1_Sub1_Sub2 local8 = Static42.method1000(2, arg0);
		local8.method168();
		local8.aString4 = arg1;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZIIIII)V")
	public static void method4438(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0) {
			Static313.method5283();
		}
		if (Static292.aFrame2 != null && (arg2 != 3 || arg3 != Static176.anInt3649 || Static114.anInt2288 != arg4)) {
			Static282.method4874(Static180.aClass110_6, Static292.aFrame2);
			Static292.aFrame2 = null;
		}
		if (arg2 == 3 && Static292.aFrame2 == null) {
			Static292.aFrame2 = Static147.method2793(Static180.aClass110_6, arg4, 0, arg3);
			if (Static292.aFrame2 != null) {
				Static176.anInt3649 = arg3;
				Static114.anInt2288 = arg4;
				Static114.method2086(Static180.aClass110_6);
			}
		}
		if (arg2 == 3 && Static292.aFrame2 == null) {
			method4438(true, arg1, Static142.anInt3154, -1, -1);
			return;
		}
		@Pc(73) Container local73;
		@Pc(80) Insets local80;
		if (Static292.aFrame2 != null) {
			Static262.anInt5078 = arg4;
			Static328.anInt6274 = arg3;
			local73 = Static292.aFrame2;
		} else if (Static232.aFrame3 == null) {
			local73 = Static180.aClass110_6.anApplet1;
			Static328.anInt6274 = local73.getSize().width;
			Static262.anInt5078 = local73.getSize().height;
		} else {
			local80 = Static232.aFrame3.getInsets();
			Static328.anInt6274 = Static232.aFrame3.getSize().width - local80.left - local80.right;
			Static262.anInt5078 = Static232.aFrame3.getSize().height - local80.top - local80.bottom;
			local73 = Static232.aFrame3;
		}
		@Pc(150) int local150;
		if (arg2 == 1) {
			Static11.anInt5389 = 765;
			Static320.anInt6140 = 503;
			Static78.anInt1584 = 0;
			Static340.anInt3938 = (Static328.anInt6274 - 765) / 2;
		} else if (Static157.anInt3131 < 96 && Static258.anInt5029 == 0) {
			local150 = Static328.anInt6274 > 1024 ? 1024 : Static328.anInt6274;
			Static11.anInt5389 = local150;
			Static340.anInt3938 = (Static328.anInt6274 - local150) / 2;
			@Pc(166) int local166 = Static262.anInt5078 > 768 ? 768 : Static262.anInt5078;
			Static320.anInt6140 = local166;
			Static78.anInt1584 = 0;
		} else {
			Static340.anInt3938 = 0;
			Static320.anInt6140 = Static262.anInt5078;
			Static78.anInt1584 = 0;
			Static11.anInt5389 = Static328.anInt6274;
		}
		if (Static123.anInt2380 != 0) {
			@Pc(196) boolean local196;
			if (Static11.anInt5389 < 1024 && Static320.anInt6140 < 768) {
				local196 = true;
			} else {
				local196 = false;
			}
		}
		if (arg0) {
			Static263.method4608(Static258.anInt5029);
		} else {
			Static261.aCanvas4.setSize(Static11.anInt5389, Static320.anInt6140);
			if (Static34.aClass2_6 != null) {
				Static34.aClass2_6.method3276();
			}
			if (local73 == Static232.aFrame3) {
				local80 = Static232.aFrame3.getInsets();
				Static261.aCanvas4.setLocation(Static340.anInt3938 + local80.left, Static78.anInt1584 + local80.top);
			} else {
				Static261.aCanvas4.setLocation(Static340.anInt3938, Static78.anInt1584);
			}
		}
		if (arg2 >= 2) {
			Static279.aBoolean465 = true;
		} else {
			Static279.aBoolean465 = false;
		}
		if (Static100.anInt2086 != -1) {
			Static16.method370(true);
		}
		if (Static153.aClass158_2 != null && (Static239.anInt4649 == 30 || Static239.anInt4649 == 25)) {
			Static154.method2925();
		}
		for (local150 = 0; local150 < 100; local150++) {
			Static313.aBooleanArray30[local150] = true;
		}
		Static181.aBoolean317 = true;
	}
}
