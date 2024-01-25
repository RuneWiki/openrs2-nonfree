import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static263 {

	@OriginalMember(owner = "client!qo", name = "Sc", descriptor = "I")
	public static int anInt5170;

	@OriginalMember(owner = "client!qo", name = "Uc", descriptor = "I")
	public static int anInt5172;

	@OriginalMember(owner = "client!qo", name = "dd", descriptor = "Lclient!rk;")
	public static Class180 aClass180_70;

	@OriginalMember(owner = "client!qo", name = "Pc", descriptor = "Lclient!ik;")
	public static Class103 aClass103_52 = new Class103(128);

	@OriginalMember(owner = "client!qo", name = "Yc", descriptor = "[I")
	public static final int[] anIntArray667 = new int[200];

	@OriginalMember(owner = "client!qo", name = "Zc", descriptor = "Ljava/lang/String;")
	public static String aString326 = "Ok";

	@OriginalMember(owner = "client!qo", name = "ad", descriptor = "Ljava/lang/String;")
	public static String aString327 = "Members object";

	@OriginalMember(owner = "client!qo", name = "bd", descriptor = "Lclient!ik;")
	public static final Class103 aClass103_53 = new Class103(4);

	@OriginalMember(owner = "client!qo", name = "cd", descriptor = "Lclient!v;")
	public static Class202 aClass202_1 = new Class202();

	@OriginalMember(owner = "client!qo", name = "ed", descriptor = "Z")
	public static boolean aBoolean381 = false;

	@OriginalMember(owner = "client!qo", name = "fd", descriptor = "I")
	public static int anInt5176 = 0;

	@OriginalMember(owner = "client!qo", name = "f", descriptor = "(B)V")
	public static void method4424() {
		if (Static240.anInt6391 < 0) {
			return;
		}
		@Pc(8) long local8 = Static335.method5308();
		Static240.anInt6391 = (int) ((long) Static240.anInt6391 + Static241.aLong158 - local8);
		if (Static240.anInt6391 > 0) {
			@Pc(24) int local24 = (Static240.anInt6391 << 8) / Static161.anInt3339;
			@Pc(28) int local28 = 255 - local24;
			@Pc(33) float local33 = (float) local24 / 255.0F;
			Static42.anInt1094 = ((Static241.aClass14_1.anInt288 & 0xFF00FF) * local28 + (Static252.anInt6121 & 0xFF00FF) * local24 & 0xFF00FF00) + (local24 * (Static252.anInt6121 & 0xFF00) + (local28 * (Static241.aClass14_1.anInt288 & 0xFF00)) & 0xFF0000) >>> 8;
			@Pc(72) float local72 = 1.0F - local33;
			Static243.aFloat68 = Static326.aFloat77 + local72 * (Static241.aClass14_1.aFloat5 - Static326.aFloat77);
			Static151.aFloat45 = local72 * (Static241.aClass14_1.aFloat2 - Static65.aFloat13) + Static65.aFloat13;
			Static258.aFloat69 = Static92.aFloat15 + local72 * (Static241.aClass14_1.aFloat4 - Static92.aFloat15);
			Static316.anInt6073 = (local24 * (Static159.anInt3299 & 0xFF00FF) + (Static241.aClass14_1.anInt291 & 0xFF00FF) * local28 & 0xFF00FF00) + ((Static159.anInt3299 & 0xFF00) * local24 + ((Static241.aClass14_1.anInt291 & 0xFF00) * local28) & 0xFF0000) >>> 8;
			Static68.anInt1706 = local24 * Static244.anInt4838 + Static241.aClass14_1.anInt293 * local28 >> 8;
			Static186.aFloat52 = Static173.aFloat51 + local72 * (Static241.aClass14_1.aFloat6 - Static173.aFloat51);
			Static320.aFloat75 = local72 * (Static241.aClass14_1.aFloat3 - Static87.aFloat74) + Static87.aFloat74;
			Static287.aFloat72 = Static289.aFloat16 + (Static241.aClass14_1.aFloat1 - Static289.aFloat16) * local72;
			if (Static241.aClass14_1.aClass17_1 != Static142.aClass17_3) {
				Static114.aClass17_2 = Static34.aClass89_1.method5451(Static142.aClass17_3, Static241.aClass14_1.aClass17_1, local72, Static114.aClass17_2);
			}
		} else {
			Static186.aFloat52 = Static241.aClass14_1.aFloat6;
			Static243.aFloat68 = Static241.aClass14_1.aFloat5;
			Static42.anInt1094 = Static241.aClass14_1.anInt288;
			Static114.aClass17_2 = Static241.aClass14_1.aClass17_1;
			Static151.aFloat45 = Static241.aClass14_1.aFloat2;
			Static258.aFloat69 = Static241.aClass14_1.aFloat4;
			Static316.anInt6073 = Static241.aClass14_1.anInt291;
			Static240.anInt6391 = -1;
			Static68.anInt1706 = Static241.aClass14_1.anInt293;
			Static287.aFloat72 = Static241.aClass14_1.aFloat1;
			Static320.aFloat75 = Static241.aClass14_1.aFloat3;
		}
		Static241.aLong158 = local8;
	}

	@OriginalMember(owner = "client!qo", name = "c", descriptor = "(IIII)Z")
	public static boolean method4427(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static63.method4607(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << 7;
			@Pc(14) int local14 = arg2 << 7;
			return Static245.method4225(local10 + 1, Static331.aClass8Array5[arg0].method4173(arg1, arg2) + arg3, local14 + 1) && Static245.method4225(local10 + 128 - 1, Static331.aClass8Array5[arg0].method4173(arg1 + 1, arg2) + arg3, local14 + 1) && Static245.method4225(local10 + 128 - 1, Static331.aClass8Array5[arg0].method4173(arg1 + 1, arg2 + 1) + arg3, local14 + 128 - 1) && Static245.method4225(local10 + 1, Static331.aClass8Array5[arg0].method4173(arg1, arg2 + 1) + arg3, local14 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qo", name = "m", descriptor = "(I)V")
	public static void method4429() {
		if (Static272.aClass15_2 != null) {
			Static272.aClass15_2.method4455();
		}
		if (Static213.aClass15_1 != null) {
			Static213.aClass15_1.method4455();
		}
	}

	@OriginalMember(owner = "client!qo", name = "n", descriptor = "(I)V")
	public static void method4431() {
		Static248.aClass103_47.method2678();
	}
}
