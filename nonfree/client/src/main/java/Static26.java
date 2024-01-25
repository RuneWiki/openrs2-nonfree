import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!bc", name = "j", descriptor = "I")
	public static int anInt460;

	@OriginalMember(owner = "client!bc", name = "k", descriptor = "Z")
	public static boolean aBoolean45;

	@OriginalMember(owner = "client!bc", name = "f", descriptor = "Lclient!nf;")
	public static final Class2_Sub13_Sub2 aClass2_Sub13_Sub2_1 = new Class2_Sub13_Sub2(5000);

	@OriginalMember(owner = "client!bc", name = "h", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_13 = new Class211(100, -2);

	@OriginalMember(owner = "client!bc", name = "i", descriptor = "Lclient!kc;")
	public static final Class134 aClass134_13 = new Class134("K", "T", "K", "K");

	@OriginalMember(owner = "client!bc", name = "l", descriptor = "[I")
	public static final int[] anIntArray42 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!bc", name = "m", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray4 = new String[100];

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IBLjava/lang/String;)V")
	public static void method366(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(8) Class2_Sub5_Sub11 local8 = Static316.method4316(3, arg0);
		local8.method3098();
		local8.aString113 = arg1;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIII)V")
	public static void method367(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class270 local7 = Static309.aClass270ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class3_Sub3 local13 = local7.aClass3_Sub3_2;
		@Pc(16) Class3_Sub3 local16 = local7.aClass3_Sub3_3;
		if (local13 != null) {
			local13.anInt6462 = local13.anInt6462 * arg3 / (0x10 << Static460.anInt7074 - 7);
			local13.anInt6456 = local13.anInt6456 * arg3 / (0x10 << Static460.anInt7074 - 7);
		}
		if (local16 != null) {
			local16.anInt6462 = local16.anInt6462 * arg3 / (0x10 << Static460.anInt7074 - 7);
			local16.anInt6456 = local16.anInt6456 * arg3 / (0x10 << Static460.anInt7074 - 7);
		}
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(IIII)I")
	public static int method369(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) int local12 = arg1 & 0x3;
		if (local12 == 0) {
			return arg0;
		} else if (local12 == 1) {
			return arg2;
		} else if (local12 == 2) {
			return 1023 - arg0;
		} else {
			return 1023 - arg2;
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)V")
	public static void method370(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		Static427.aString196 = arg1;
		Static258.aString121 = arg0;
		if (Static263.anInt3675 != 3 && (Static427.aString196.equals("") || Static258.aString121.equals(""))) {
			Static409.method5176(3);
			return;
		}
		if (Static263.anInt3675 != 1) {
			Static43.anInt801 = 0;
			Static62.anInt1154 = -1;
		}
		Static141.aBoolean165 = false;
		Static409.method5176(-3);
		Static126.anInt546 = 0;
		Static127.anInt2292 = 0;
		Static450.anInt7195 = 1;
	}
}
