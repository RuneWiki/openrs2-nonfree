import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "I")
	public static int anInt3426;

	@OriginalMember(owner = "client!kc", name = "k", descriptor = "F")
	public static float aFloat36;

	@OriginalMember(owner = "client!kc", name = "o", descriptor = "Lclient!oo;")
	public static Class149 aClass149_3;

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString115 = null;

	@OriginalMember(owner = "client!kc", name = "g", descriptor = "[I")
	public static final int[] anIntArray308 = new int[32];

	@OriginalMember(owner = "client!kc", name = "m", descriptor = "Z")
	public static boolean aBoolean285 = false;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IJII)V")
	public static void method2973(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = (int) arg1 >> 14 & 0x1F;
		@Pc(17) int local17 = (int) arg1 >> 20 & 0x3;
		@Pc(32) int local32 = (int) (arg1 >>> 32) & Integer.MAX_VALUE;
		if (local10 != 10 && local10 != 11 && local10 != 22) {
			Static309.method5200(0, local17, Static110.aClass2_Sub2_Sub1_Sub1_1.anIntArray517[0], Static110.aClass2_Sub2_Sub1_Sub1_1.anIntArray518[0], 0, arg0, 0, local10, arg2, true);
			return;
		}
		@Pc(71) Class56 local71 = Static320.method5290(local32);
		@Pc(82) int local82;
		@Pc(79) int local79;
		if (local17 == 0 || local17 == 2) {
			local79 = local71.anInt1330;
			local82 = local71.anInt1313;
		} else {
			local79 = local71.anInt1313;
			local82 = local71.anInt1330;
		}
		@Pc(93) int local93 = local71.anInt1338;
		if (local17 != 0) {
			local93 = (local93 << local17 & 0xF) + (local93 >> 4 - local17);
		}
		Static309.method5200(local93, 0, Static110.aClass2_Sub2_Sub1_Sub1_1.anIntArray517[0], Static110.aClass2_Sub2_Sub1_Sub1_1.anIntArray518[0], local79, arg0, local82, 0, arg2, true);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Z)Lclient!jj;")
	public static Class83_Sub1 method2974() {
		return Static345.anInt6751 < Static305.aClass83_Sub1Array1.length ? Static305.aClass83_Sub1Array1[Static345.anInt6751++] : null;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(BI)Z")
	public static boolean method2977(@OriginalArg(1) int arg0) {
		if (arg0 == 15 || arg0 == 32 || arg0 == 5 || arg0 == 13 || arg0 == 1 || arg0 == 16 || arg0 == 51 || arg0 == 59) {
			return true;
		} else if (arg0 == 45 || arg0 == 18 || arg0 == 1001 || arg0 == 1006) {
			return true;
		} else if (arg0 == 41 || arg0 == 26 || arg0 == 35 || arg0 == 43 || arg0 == 31) {
			return true;
		} else {
			return arg0 == 42 || arg0 == 4 || arg0 == 24 || arg0 == 36 || arg0 == 10 || arg0 == 44;
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;")
	public static String[] method2979(@OriginalArg(1) String[] arg0) {
		@Pc(8) String[] local8 = new String[5];
		for (@Pc(10) int local10 = 0; local10 < 5; local10++) {
			local8[local10] = local10 + ": ";
			if (arg0 != null && arg0[local10] != null) {
				local8[local10] = local8[local10] + arg0[local10];
			}
		}
		return local8;
	}
}
