import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static417 {

	@OriginalMember(owner = "client!vc", name = "i", descriptor = "Lclient!kf;")
	public static Class134 aClass134_3;

	@OriginalMember(owner = "client!vc", name = "j", descriptor = "Lclient!tq;")
	public static Class234 aClass234_2;

	@OriginalMember(owner = "client!vc", name = "k", descriptor = "Lclient!tt;")
	public static Class237 aClass237_1;

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "Lclient!ff;")
	public static final Class81 aClass81_183 = new Class81(36, 2);

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "Z")
	public static boolean aBoolean624 = false;

	@OriginalMember(owner = "client!vc", name = "h", descriptor = "Lclient!cu;")
	public static final Class44 aClass44_90 = new Class44(59, 4);

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V")
	public static void method5647() {
		Static184.aClass26_4.method2219(Static40.aFloat40, Static406.aFloat208, Static279.aFloat161);
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Z)V")
	public static void method5648() {
		if (Static1.anInt20 < 0) {
			return;
		}
		@Pc(15) long local15 = Static208.method3182();
		Static1.anInt20 = (int) ((long) Static1.anInt20 + Static339.aLong166 - local15);
		if (Static1.anInt20 <= 0) {
			Static406.aFloat208 = Static240.aClass68_2.aFloat77;
			Static314.aFloat170 = Static240.aClass68_2.aFloat74;
			Static40.aFloat40 = Static240.aClass68_2.aFloat75;
			Static61.aClass21_1 = Static240.aClass68_2.aClass21_2;
			Static399.anInt6964 = Static240.aClass68_2.anInt2170;
			Static107.aFloat79 = Static240.aClass68_2.aFloat76;
			Static335.anInt1518 = Static240.aClass68_2.anInt2164;
			Static1.anInt20 = -1;
			Static279.aFloat161 = Static240.aClass68_2.aFloat72;
			Static27.aFloat200 = Static240.aClass68_2.aFloat73;
			Static85.anInt3260 = Static240.aClass68_2.anInt2168;
		} else {
			@Pc(69) int local69 = (Static1.anInt20 << 8) / Static122.anInt2415;
			@Pc(73) int local73 = 255 - local69;
			@Pc(78) float local78 = (float) local69 / 255.0F;
			Static335.anInt1518 = (local73 * (Static240.aClass68_2.anInt2164 & 0xFF00FF) + (Static401.anInt6979 & 0xFF00FF) * local69 & 0xFF00FF00) + (local69 * (Static401.anInt6979 & 0xFF00) + ((Static240.aClass68_2.anInt2164 & 0xFF00) * local73) & 0xFF0000) >>> 8;
			@Pc(115) float local115 = 1.0F - local78;
			Static314.aFloat170 = local115 * (Static240.aClass68_2.aFloat74 - Static274.aFloat160) + Static274.aFloat160;
			Static399.anInt6964 = (local69 * (Static327.anInt5866 & 0xFF00) + (Static240.aClass68_2.anInt2170 & 0xFF00) * local73 & 0xFF0000) + (local73 * (Static240.aClass68_2.anInt2170 & 0xFF00FF) + local69 * (Static327.anInt5866 & 0xFF00FF) & 0xFF00FF00) >>> 8;
			Static107.aFloat79 = (Static240.aClass68_2.aFloat76 - Static258.aFloat141) * local115 + Static258.aFloat141;
			Static27.aFloat200 = Static128.aFloat82 + (Static240.aClass68_2.aFloat73 - Static128.aFloat82) * local115;
			Static40.aFloat40 = local115 * (Static240.aClass68_2.aFloat75 - Static20.aFloat10) + Static20.aFloat10;
			Static279.aFloat161 = local115 * (Static240.aClass68_2.aFloat72 - Static319.aFloat173) + Static319.aFloat173;
			Static85.anInt3260 = Static265.anInt7239 * local69 + Static240.aClass68_2.anInt2168 * local73 >> 8;
			Static406.aFloat208 = local115 * (Static240.aClass68_2.aFloat77 - Static268.aFloat159) + Static268.aFloat159;
			if (Static429.aClass21_4 != Static240.aClass68_2.aClass21_2) {
				Static61.aClass21_1 = Static184.aClass26_4.method2251(Static429.aClass21_4, Static240.aClass68_2.aClass21_2, local115, Static61.aClass21_1);
			}
		}
		Static339.aLong166 = local15;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IBI)Z")
	public static boolean method5650(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIII)I")
	public static int method5651(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static367.aByteArrayArrayArray16[arg0][arg1][arg2] & 0x8) == 0) {
			return arg0 <= 0 || (Static367.aByteArrayArrayArray16[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
		} else {
			return 0;
		}
	}
}
