import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static279 {

	@OriginalMember(owner = "client!vg", name = "g", descriptor = "I")
	public static int anInt5379;

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "J")
	public static long aLong193 = 0L;

	@OriginalMember(owner = "client!vg", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString314 = "glow1:";

	@OriginalMember(owner = "client!vg", name = "f", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!vg", name = "j", descriptor = "[F")
	public static float[] aFloatArray29 = new float[] { 0.073F, 0.169F, 0.24F, 1.0F };

	@OriginalMember(owner = "client!vg", name = "k", descriptor = "I")
	public static int anInt5382 = 0;

	@OriginalMember(owner = "client!vg", name = "l", descriptor = "Lclient!qc;")
	public static Class135 aClass135_40 = new Class135(16);

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method4237(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static214.anIntArrayArrayArray9[arg0][local16][local20] == -Static107.anInt2499) {
						return false;
					}
				}
			}
			local16 = (arg1 << 7) + 1;
			local20 = (arg3 << 7) + 2;
			@Pc(156) int local156 = Static55.anIntArrayArrayArray3[arg0][arg1][arg3] + arg5;
			if (!Static255.method3903(local16, local156, local20)) {
				return false;
			}
			@Pc(169) int local169 = (arg2 << 7) - 1;
			if (!Static255.method3903(local169, local156, local20)) {
				return false;
			}
			@Pc(182) int local182 = (arg4 << 7) - 1;
			if (!Static255.method3903(local16, local156, local182)) {
				return false;
			} else if (Static255.method3903(local169, local156, local182)) {
				return true;
			} else {
				return false;
			}
		} else if (Static220.method3471(arg0, arg1, arg3)) {
			local16 = arg1 << 7;
			local20 = arg3 << 7;
			return Static255.method3903(local16 + 1, Static55.anIntArrayArrayArray3[arg0][arg1][arg3] + arg5, local20 + 1) && Static255.method3903(local16 + 128 - 1, Static55.anIntArrayArrayArray3[arg0][arg1 + 1][arg3] + arg5, local20 + 1) && Static255.method3903(local16 + 128 - 1, Static55.anIntArrayArrayArray3[arg0][arg1 + 1][arg3 + 1] + arg5, local20 + 128 - 1) && Static255.method3903(local16 + 1, Static55.anIntArrayArrayArray3[arg0][arg1][arg3 + 1] + arg5, local20 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(ZZ)V")
	public static void method4238(@OriginalArg(0) boolean arg0) {
		Static28.method555(Static80.anInt1776, Static218.aFloat42, Static225.aFloat44, Static239.aFloat48);
		Static28.method559(Static64.anInt1379, Static274.anInt5345, arg0);
		Static28.method554((float) Static108.anInt2516, (float) Static217.anInt4294, (float) Static236.anInt4597);
		Static28.method553();
		Static213.aFloat38 = Static217.aFloat41;
		Static213.aFloat39 = Static121.aFloat19;
		Static213.aFloat40 = Static138.aFloat47;
		Static29.aClass1_Sub2_Sub7_1 = Static123.aClass1_Sub2_Sub7_5;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method4240(@OriginalArg(1) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method4241(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(7) String local7 = Static135.method2309(Static233.method3607(arg0));
		@Pc(13) boolean local13 = false;
		for (@Pc(26) int local26 = 0; local26 < Static278.anInt5374; local26++) {
			@Pc(39) Class14_Sub2_Sub1 local39 = Static98.aClass14_Sub2_Sub1Array1[Static17.anIntArray444[local26]];
			if (local39 != null && local39.aString99 != null && local39.aString99.equalsIgnoreCase(local7)) {
				if (arg1 == 1) {
					Static283.aClass1_Sub11_Sub1_3.method2697(255);
					Static283.aClass1_Sub11_Sub1_3.method2655(0);
					Static283.aClass1_Sub11_Sub1_3.method2640(Static17.anIntArray444[local26]);
				} else if (arg1 == 4) {
					Static283.aClass1_Sub11_Sub1_3.method2697(61);
					Static283.aClass1_Sub11_Sub1_3.method2668(0);
					Static283.aClass1_Sub11_Sub1_3.method2677(Static17.anIntArray444[local26]);
				} else if (arg1 == 5) {
					Static283.aClass1_Sub11_Sub1_3.method2697(139);
					Static283.aClass1_Sub11_Sub1_3.method2645(0);
					Static283.aClass1_Sub11_Sub1_3.method2677(Static17.anIntArray444[local26]);
				} else if (arg1 == 6) {
					Static283.aClass1_Sub11_Sub1_3.method2697(249);
					Static283.aClass1_Sub11_Sub1_3.method2660(Static17.anIntArray444[local26]);
					Static283.aClass1_Sub11_Sub1_3.method2668(0);
				} else if (arg1 == 7) {
					Static283.aClass1_Sub11_Sub1_3.method2697(230);
					Static283.aClass1_Sub11_Sub1_3.method2677(Static17.anIntArray444[local26]);
					Static283.aClass1_Sub11_Sub1_3.method2645(0);
				}
				local13 = true;
				break;
			}
		}
		if (!local13) {
			Static196.method1924(0, Static35.aString104 + local7, "");
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	public static void method4242(@OriginalArg(0) String arg0) {
		@Pc(7) int local7 = Static242.method3708(arg0);
		if (local7 != -1) {
			@Pc(44) int[] local44 = Static20.aClass1_Sub2_Sub21_1.method4288(Static53.aClass82_13.anIntArray262[local7] >> 14 & 0x3FFF, Static53.aClass82_13.anIntArray262[local7] & 0x3FFF, Static53.aClass82_13.anIntArray262[local7] >> 28 & 0x3);
			Static283.method4250(local44[1], local44[2]);
		}
	}
}
