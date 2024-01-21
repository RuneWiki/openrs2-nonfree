import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!ob", name = "G", descriptor = "I")
	public static int anInt2016;

	@OriginalMember(owner = "client!ob", name = "y", descriptor = "Lclient!rc;")
	private static Class55 aClass55_801 = Static34.method846("Loading ignore list");

	@OriginalMember(owner = "client!ob", name = "z", descriptor = "I")
	public static int anInt2013 = 0;

	@OriginalMember(owner = "client!ob", name = "A", descriptor = "[Lclient!rc;")
	public static Class55[] aClass55Array18 = new Class55[200];

	@OriginalMember(owner = "client!ob", name = "B", descriptor = "Lclient!rc;")
	public static Class55 aClass55_802 = Static34.method846("@or3@");

	@OriginalMember(owner = "client!ob", name = "O", descriptor = "Lclient!rc;")
	private static Class55 aClass55_804 = Static34.method846("Login server offline)3");

	@OriginalMember(owner = "client!ob", name = "C", descriptor = "Lclient!rc;")
	public static Class55 aClass55_803 = aClass55_804;

	@OriginalMember(owner = "client!ob", name = "J", descriptor = "I")
	public static int anInt2017 = 0;

	@OriginalMember(owner = "client!ob", name = "P", descriptor = "[I")
	public static int[] anIntArray190 = new int[2000];

	@OriginalMember(owner = "client!ob", name = "S", descriptor = "Z")
	public static boolean aBoolean92 = false;

	@OriginalMember(owner = "client!ob", name = "U", descriptor = "Lclient!rc;")
	public static Class55 aClass55_805 = aClass55_801;

	@OriginalMember(owner = "client!ob", name = "db", descriptor = "Lclient!rc;")
	public static Class55 aClass55_806 = Static34.method846("::errortest");

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIILjava/awt/Component;)Lclient!fc;")
	public static Class21 method1376(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2) {
		try {
			@Pc(14) Class local14 = Class.forName("Class21_Sub2");
			@Pc(18) Class21 local18 = (Class21) local14.getDeclaredConstructor().newInstance();
			local18.method1443(arg0, arg1, arg2);
			return local18;
		} catch (@Pc(27) Throwable local27) {
			@Pc(31) Class21_Sub1 local31 = new Class21_Sub1();
			local31.method1443(arg0, arg1, arg2);
			return local31;
		}
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(III)V")
	public static void method1377(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) Class3 local11 = Static105.aClass3ArrayArrayArray1[Static56.anInt1718][arg1][arg0];
		if (local11 == null) {
			Static109.aClass34_1.method1050(Static56.anInt1718, arg1, arg0);
			return;
		}
		@Pc(21) Class6_Sub2_Sub3_Sub5 local21 = null;
		@Pc(23) int local23 = -99999999;
		@Pc(30) Class6_Sub2_Sub3_Sub5 local30;
		for (local30 = (Class6_Sub2_Sub3_Sub5) local11.method31(); local30 != null; local30 = (Class6_Sub2_Sub3_Sub5) local11.method26()) {
			@Pc(36) Class6_Sub2_Sub5 local36 = Static58.method1195(local30.anInt2287);
			@Pc(39) int local39 = local36.anInt1066;
			if (local36.anInt1084 == 1) {
				local39 *= local30.anInt2292 + 1;
			}
			if (local23 < local39) {
				local23 = local39;
				local21 = local30;
			}
		}
		if (local21 == null) {
			Static109.aClass34_1.method1050(Static56.anInt1718, arg1, arg0);
			return;
		}
		@Pc(80) Class6_Sub2_Sub3_Sub5 local80 = null;
		local11.method29(local21);
		local30 = (Class6_Sub2_Sub3_Sub5) local11.method31();
		@Pc(93) Class6_Sub2_Sub3_Sub5 local93 = null;
		@Pc(101) int local101 = (arg0 << 7) + arg1 + 1610612736;
		while (local30 != null) {
			if (local21.anInt2287 != local30.anInt2287) {
				if (local93 == null) {
					local93 = local30;
				}
				if (local30.anInt2287 != local93.anInt2287 && local80 == null) {
					local80 = local30;
				}
			}
			local30 = (Class6_Sub2_Sub3_Sub5) local11.method26();
		}
		Static109.aClass34_1.method1024(Static56.anInt1718, arg1, arg0, Static112.method2073(Static56.anInt1718, arg1 * 128 + 64, arg0 * 128 - -64), local21, local101, local93, local80);
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILclient!pb;BI)[Lclient!eb;")
	public static Class6_Sub2_Sub2_Sub2[] method1378(@OriginalArg(0) int arg0, @OriginalArg(1) Class40 arg1, @OriginalArg(3) int arg2) {
		return Static44.method1829(arg2, arg0, arg1) ? Static6.method235() : null;
	}

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "(I)V")
	public static void method1379() {
		aClass55_802 = null;
		aClass55_805 = null;
		aClass55_801 = null;
		aClass55_806 = null;
		aClass55_803 = null;
		anIntArray190 = null;
		aClass55Array18 = null;
		aClass55_804 = null;
	}
}
