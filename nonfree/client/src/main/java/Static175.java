import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!sa", name = "u", descriptor = "Lclient!ga;")
	public static Class36 aClass36_4;

	@OriginalMember(owner = "client!sa", name = "A", descriptor = "Lclient!pb;")
	public static Class71 aClass71_34;

	@OriginalMember(owner = "client!sa", name = "s", descriptor = "[I")
	public static final int[] anIntArray321 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 67, 68, 69, 70, 71, 72, 75, 79, 80, 81, 82, 87, 88, 89, 90, 77, 96, 98, 99, 100, 101, 102, 250, 251, 109, 110, 111, 112, 117, 252, 167, 126, 127, 128, 129, 130, 131, 132, 135, 139, 140, 141, 142, 147, 148, 149, 150, 137, 156, 158, 159, 160, 161, 162, 253, 254, 170, 171, 172, 173, 178, 255, 179 };

	@OriginalMember(owner = "client!sa", name = "y", descriptor = "[I")
	public static final int[] anIntArray322 = new int[1000];

	@OriginalMember(owner = "client!sa", name = "B", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_1307 = Static151.method2243("Malformed login packet)3");

	@OriginalMember(owner = "client!sa", name = "H", descriptor = "Lclient!mb;")
	public static Class62 aClass62_1308 = aClass62_1307;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!dh;B)V")
	public static void method2546(@OriginalArg(0) Class7_Sub2 arg0) {
		arg0.anInt3096 = arg0.anInt3077;
		if (arg0.anInt3064 == 0) {
			arg0.anInt3084 = 0;
			return;
		}
		if (arg0.anInt3062 != -1 && arg0.anInt3075 == 0) {
			@Pc(28) Class2_Sub1_Sub25 local28 = Static90.method27(arg0.anInt3062);
			if (arg0.anInt3086 > 0 && local28.anInt4367 == 0) {
				arg0.anInt3084++;
				return;
			}
			if (arg0.anInt3086 <= 0 && local28.anInt4371 == 0) {
				arg0.anInt3084++;
				return;
			}
		}
		@Pc(69) int local69 = arg0.anInt3046;
		@Pc(84) int local84 = arg0.anInt3048 * 64 + arg0.anIntArray275[arg0.anInt3064 - 1] * 128;
		@Pc(87) int local87 = arg0.anInt3085;
		@Pc(102) int local102 = arg0.anIntArray274[arg0.anInt3064 - 1] * 128 + arg0.anInt3048 * 64;
		if (local84 - local69 > 256 || local84 - local69 < -256 || local102 - local87 > 256 || local102 - local87 < -256) {
			arg0.anInt3046 = local84;
			arg0.anInt3085 = local102;
			return;
		}
		if (local69 >= local84) {
			if (local69 > local84) {
				if (local87 < local102) {
					arg0.anInt3098 = 768;
				} else if (local87 > local102) {
					arg0.anInt3098 = 256;
				} else {
					arg0.anInt3098 = 512;
				}
			} else if (local102 > local87) {
				arg0.anInt3098 = 1024;
			} else if (local102 < local87) {
				arg0.anInt3098 = 0;
			}
		} else if (local87 < local102) {
			arg0.anInt3098 = 1280;
		} else if (local102 < local87) {
			arg0.anInt3098 = 1792;
		} else {
			arg0.anInt3098 = 1536;
		}
		@Pc(227) int local227 = arg0.anInt3098 - arg0.anInt3071 & 0x7FF;
		@Pc(229) int local229 = 4;
		if (local227 > 1024) {
			local227 -= 2048;
		}
		@Pc(236) int local236 = arg0.anInt3095;
		if (local227 >= -256 && local227 <= 256) {
			local236 = arg0.anInt3088;
		} else if (local227 >= 256 && local227 < 768) {
			local236 = arg0.anInt3068;
		} else if (local227 >= -768 && local227 <= -256) {
			local236 = arg0.anInt3072;
		}
		@Pc(271) boolean local271 = true;
		if (local236 == -1) {
			local236 = arg0.anInt3088;
		}
		arg0.anInt3096 = local236;
		if (arg0 instanceof Class7_Sub2_Sub1) {
			local271 = ((Class7_Sub2_Sub1) arg0).aClass2_Sub1_Sub20_1.aBoolean152;
		}
		if (local271) {
			if (arg0.anInt3071 != arg0.anInt3098 && arg0.anInt3067 == -1 && arg0.anInt3054 != 0) {
				local229 = 2;
			}
			if (arg0.anInt3064 > 2) {
				local229 = 6;
			}
			if (arg0.anInt3064 > 3) {
				local229 = 8;
			}
			if (arg0.anInt3084 > 0 && arg0.anInt3064 > 1) {
				arg0.anInt3084--;
				local229 = 8;
			}
		} else {
			if (arg0.anInt3064 > 1) {
				local229 = 6;
			}
			if (arg0.anInt3064 > 2) {
				local229 = 8;
			}
			if (arg0.anInt3084 > 0 && arg0.anInt3064 > 1) {
				arg0.anInt3084--;
				local229 = 8;
			}
		}
		if (arg0.aBooleanArray18[arg0.anInt3064 - 1]) {
			local229 <<= 0x1;
		}
		if (local102 > local87) {
			arg0.anInt3085 += local229;
			if (arg0.anInt3085 > local102) {
				arg0.anInt3085 = local102;
			}
		} else if (local102 < local87) {
			arg0.anInt3085 -= local229;
			if (local102 > arg0.anInt3085) {
				arg0.anInt3085 = local102;
			}
		}
		if (local69 < local84) {
			arg0.anInt3046 += local229;
			if (local84 < arg0.anInt3046) {
				arg0.anInt3046 = local84;
			}
		} else if (local69 > local84) {
			arg0.anInt3046 -= local229;
			if (arg0.anInt3046 < local84) {
				arg0.anInt3046 = local84;
			}
		}
		if (local84 == arg0.anInt3046 && local102 == arg0.anInt3085) {
			if (arg0.anInt3086 > 0) {
				arg0.anInt3086--;
			}
			arg0.anInt3064--;
		}
		if (local229 >= 8 && arg0.anInt3088 == arg0.anInt3096 && arg0.anInt3053 != -1) {
			arg0.anInt3096 = arg0.anInt3053;
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)I")
	public static int method2547(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIZI)I")
	public static int method2548(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2 >> 7;
		@Pc(11) int local11 = arg0 >> 7;
		if (local7 < 0 || local11 < 0 || local7 > 103 || local11 > 103) {
			return 0;
		}
		@Pc(37) int local37 = arg1;
		@Pc(41) int local41 = arg0 & 0x7F;
		@Pc(45) int local45 = arg2 & 0x7F;
		if (arg1 < 3 && (Static133.aByteArrayArrayArray11[1][local7][local11] & 0x2) == 2) {
			local37 = arg1 + 1;
		}
		@Pc(91) int local91 = Static171.anIntArrayArrayArray7[local37][local7 + 1][local11] * local45 + Static171.anIntArrayArrayArray7[local37][local7][local11] * (128 - local45) >> 7;
		@Pc(122) int local122 = local45 * Static171.anIntArrayArrayArray7[local37][local7 + 1][local11 + 1] + Static171.anIntArrayArrayArray7[local37][local7][local11 + 1] * (128 - local45) >> 7;
		return (128 - local41) * local91 + local41 * local122 >> 7;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!mb;ZI)V")
	public static void method2549(@OriginalArg(0) Class62 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(18) int local18 = Static13.aClass2_Sub1_Sub12_2.method1360(arg0, 250);
		@Pc(25) int local25 = Static13.aClass2_Sub1_Sub12_2.method1365(arg0, 250) * 13;
		Static212.method3103(6, 6, local18 + 4 + 4, 4 + 4 + local25, 0);
		Static212.method3106(6, 6, local18 + 4 + 4, local25 + 4 + 4, 16777215);
		Static13.aClass2_Sub1_Sub12_2.method1382(arg0, 10, 10, local18, local25, 16777215, -1, 1, 1, 0);
		Static135.method2042(local25 + 4 + 4, 6, 6, local18 + 4 + 4);
		if (!arg1) {
			Static94.method1427(10, local18, local25, 10);
			return;
		}
		@Pc(101) Canvas local101 = Static139.aCanvas1;
		try {
			@Pc(104) Graphics local104 = local101.getGraphics();
			Static127.aClass46_1.method2380(local104);
		} catch (@Pc(114) Exception local114) {
			local101.repaint();
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!pb;Lclient!pb;BLclient!pb;)V")
	public static void method2550(@OriginalArg(0) Class71 arg0, @OriginalArg(1) Class71 arg1, @OriginalArg(3) Class71 arg2) {
		Static109.aClass71_21 = arg1;
		Static126.aClass71_24 = arg0;
		Static6.aClass71_1 = arg2;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(BLclient!mb;Lclient!kd;)I")
	public static int method2552(@OriginalArg(1) Class62 arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		@Pc(2) int local2 = arg1.anInt2235;
		arg1.method1547(arg0.anInt2653);
		arg1.anInt2235 += Static52.aClass83_1.method2390(arg0.anInt2653, 0, arg0.aByteArray28, arg1.anInt2235, arg1.aByteArray26);
		return arg1.anInt2235 - local2;
	}
}
