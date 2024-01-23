import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!ch", name = "D", descriptor = "[I")
	public static int[] anIntArray203;

	@OriginalMember(owner = "client!ch", name = "v", descriptor = "Ljava/lang/String;")
	public static String aString85 = "You can't add yourself to your own friend list.";

	@OriginalMember(owner = "client!ch", name = "C", descriptor = "I")
	public static int anInt2375 = 0;

	@OriginalMember(owner = "client!ch", name = "E", descriptor = "[Lclient!wi;")
	public static Class186[] aClass186Array2 = new Class186[14];

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIBI)V")
	public static void method1933(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static251.aBoolean330) {
			Static87.method1457(arg3, arg0, arg2 + arg3, arg0 - -arg1);
			Static87.method1464(arg3, arg0, arg2, arg1, 0);
		} else {
			Static258.method4029(arg3, arg0, arg2 + arg3, arg1 + arg0);
			Static258.method4031(arg3, arg0, arg2, arg1, 0);
		}
		if (Static219.anInt4212 < 100) {
			return;
		}
		if (Static248.aClass4_Sub2_Sub4_9 == null || arg2 != Static248.aClass4_Sub2_Sub4_9.anInt5193 || Static248.aClass4_Sub2_Sub4_9.anInt5191 != arg1) {
			@Pc(63) Class4_Sub2_Sub4_Sub2 local63 = new Class4_Sub2_Sub4_Sub2(arg2, arg1);
			Static258.method4016(local63.anIntArray409, arg2, arg1);
			Static184.method2973(Static158.anInt3242, 0, Static207.anInt2141, 0, 0, arg1, 0, arg2);
			if (Static251.aBoolean330) {
				Static248.aClass4_Sub2_Sub4_9 = new Class4_Sub2_Sub4_Sub1(local63);
			} else {
				Static248.aClass4_Sub2_Sub4_9 = local63;
			}
			if (Static251.aBoolean330) {
				Static258.anIntArray399 = null;
			} else {
				Static147.aClass42_1.method3934();
			}
		}
		Static248.aClass4_Sub2_Sub4_9.method4135(arg3, arg0);
		@Pc(110) int local110 = arg2 * Static8.anInt158 / Static207.anInt2141 + arg3;
		@Pc(122) int local122 = Static298.anInt5312 * arg2 / Static207.anInt2141;
		@Pc(128) int local128 = arg1 * Static217.anInt4191 / Static158.anInt3242;
		@Pc(136) int local136 = arg1 * Static143.anInt2837 / Static158.anInt3242 + arg0;
		@Pc(138) int local138 = 16711680;
		if (Static122.anInt2465 == 1) {
			local138 = 16777215;
		}
		if (Static251.aBoolean330) {
			Static87.method1456(local110, local136, local122, local128, local138, 128);
			Static87.method1452(local110, local136, local122, local128, local138);
		} else {
			Static258.method4026(local110, local136, local122, local128, local138, 128);
			Static258.method4025(local110, local136, local122, local128, local138);
		}
		if (Static64.anInt1391 <= 0) {
			return;
		}
		@Pc(185) int local185;
		if (Static115.anInt2343 <= 10) {
			local185 = Static115.anInt2343 * 25;
		} else {
			local185 = (20 - Static115.anInt2343) * 25;
		}
		for (@Pc(199) Class4_Sub16 local199 = (Class4_Sub16) Static64.aClass17_9.method613(); local199 != null; local199 = (Class4_Sub16) Static64.aClass17_9.method607()) {
			if (Static236.anInt4701 == local199.anInt1897) {
				@Pc(216) int local216 = arg3 + arg2 * local199.anInt1900 / Static207.anInt2141;
				@Pc(225) int local225 = arg0 + local199.anInt1898 * arg1 / Static158.anInt3242;
				if (Static251.aBoolean330) {
					Static87.method1456(local216 - 2, local225 + -2, 4, 4, 16776960, local185);
				} else {
					Static258.method4026(local216 - 2, local225 + -2, 4, 4, 16776960, local185);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IZI)Ljava/lang/String;")
	public static String method1934(@OriginalArg(0) int arg0) {
		return arg0 >= 0 ? Static78.method1339(arg0) : Integer.toString(arg0);
	}

	@OriginalMember(owner = "client!ch", name = "d", descriptor = "(I)V")
	public static void method1936() {
		if (Static144.anIntArray233 != null && Static284.anIntArray447 != null) {
			return;
		}
		Static284.anIntArray447 = new int[256];
		Static144.anIntArray233 = new int[256];
		for (@Pc(14) int local14 = 0; local14 < 256; local14++) {
			@Pc(24) double local24 = (double) local14 / 255.0D * 6.283185307179586D;
			Static144.anIntArray233[local14] = (int) (Math.sin(local24) * 4096.0D);
			Static284.anIntArray447[local14] = (int) (Math.cos(local24) * 4096.0D);
		}
	}
}
