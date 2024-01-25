import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!cj", name = "e", descriptor = "F")
	public static float aFloat23;

	@OriginalMember(owner = "client!cj", name = "g", descriptor = "I")
	public static int anInt1442;

	@OriginalMember(owner = "client!cj", name = "k", descriptor = "Ljava/applet/Applet;")
	public static Applet anApplet1;

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString8 = "";

	@OriginalMember(owner = "client!cj", name = "i", descriptor = "[I")
	public static final int[] anIntArray103 = new int[8];

	@OriginalMember(owner = "client!cj", name = "j", descriptor = "Lclient!kq;")
	public static final Class193 aClass193_2 = new Class193();

	@OriginalMember(owner = "client!cj", name = "l", descriptor = "[Z")
	public static final boolean[] aBooleanArray1 = new boolean[8];

	@OriginalMember(owner = "client!cj", name = "m", descriptor = "I")
	public static int anInt1444 = 0;

	@OriginalMember(owner = "client!cj", name = "n", descriptor = "I")
	public static int anInt1445 = 0;

	@OriginalMember(owner = "client!cj", name = "o", descriptor = "B")
	public static byte aByte35 = -6;

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lclient!uu;Lclient!uu;Lclient!uu;Lclient!uu;I)V")
	public static void method1255(@OriginalArg(0) Class343 arg0, @OriginalArg(1) Class343 arg1, @OriginalArg(2) Class343 arg2, @OriginalArg(3) Class343 arg3) {
		Static469.aClass343_222 = arg2;
		Static637.aClass343_258 = arg0;
		Static5.aClass343_8 = arg1;
		Static319.aClass344ArrayArray2 = new Class344[Static5.aClass343_8.method8144()][];
		Static397.aBooleanArray25 = new boolean[Static5.aClass343_8.method8144()];
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIIII)V")
	public static void method1256(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(13) int local13 = arg2 * arg2;
		@Pc(17) int local17 = arg3 * arg3;
		@Pc(21) int local21 = local17 << 1;
		@Pc(29) int local29 = local13 << 1;
		@Pc(33) int local33 = arg3 << 1;
		@Pc(41) int local41 = local21 + (1 - local33) * local13;
		@Pc(49) int local49 = local17 - (local33 - 1) * local29;
		@Pc(53) int local53 = local13 << 2;
		@Pc(57) int local57 = local17 << 2;
		@Pc(65) int local65 = local21 * 3;
		@Pc(73) int local73 = local29 * ((arg3 << 1) - 3);
		@Pc(79) int local79 = local57;
		@Pc(101) int local101;
		@Pc(109) int local109;
		if (arg4 >= Static298.anInt5919 && arg4 <= Static596.anInt9703) {
			local101 = Static632.method8535(Static576.anInt9425, Static474.anInt8118, arg2 + arg0);
			local109 = Static632.method8535(Static576.anInt9425, Static474.anInt8118, arg0 - arg2);
			Static82.method1400(arg1, local109, local101, Static71.anIntArrayArray5[arg4]);
		}
		@Pc(123) int local123 = (arg3 - 1) * local53;
		while (local9 > 0) {
			if (local41 < 0) {
				while (local41 < 0) {
					local49 += local79;
					local41 += local65;
					local79 += local57;
					local7++;
					local65 += local57;
				}
			}
			if (local49 < 0) {
				local49 += local79;
				local41 += local65;
				local79 += local57;
				local7++;
				local65 += local57;
			}
			local41 += -local123;
			local49 += -local73;
			local73 -= local53;
			local123 -= local53;
			local9--;
			local101 = arg4 - local9;
			local109 = local9 + arg4;
			if (local109 >= Static298.anInt5919 && Static596.anInt9703 >= local101) {
				@Pc(219) int local219 = Static632.method8535(Static576.anInt9425, Static474.anInt8118, local7 + arg0);
				@Pc(228) int local228 = Static632.method8535(Static576.anInt9425, Static474.anInt8118, arg0 - local7);
				if (Static298.anInt5919 <= local101) {
					Static82.method1400(arg1, local228, local219, Static71.anIntArrayArray5[local101]);
				}
				if (Static596.anInt9703 >= local109) {
					Static82.method1400(arg1, local228, local219, Static71.anIntArrayArray5[local109]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(BI)I")
	public static int method1258(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}
}
