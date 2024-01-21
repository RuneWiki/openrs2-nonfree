import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!tb", name = "f", descriptor = "Lclient!g;")
	public static Class26 aClass26_29;

	@OriginalMember(owner = "client!tb", name = "g", descriptor = "I")
	public static int anInt2421 = 0;

	@OriginalMember(owner = "client!tb", name = "t", descriptor = "Lclient!u;")
	public static Class74 aClass74_1542 = Static72.method1077("_");

	@OriginalMember(owner = "client!tb", name = "u", descriptor = "[[B")
	public static byte[][] aByteArrayArray8 = new byte[250][];

	@OriginalMember(owner = "client!tb", name = "B", descriptor = "[I")
	public static int[] anIntArray350 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!tb", name = "D", descriptor = "Lclient!rc;")
	public static Class65 aClass65_1 = new Class65();

	@OriginalMember(owner = "client!tb", name = "K", descriptor = "Lclient!u;")
	public static Class74 aClass74_1543 = Static72.method1077("");

	@OriginalMember(owner = "client!tb", name = "L", descriptor = "[Lclient!vd;")
	public static Class2_Sub2_Sub2_Sub1_Sub2[] aClass2_Sub2_Sub2_Sub1_Sub2Array1 = new Class2_Sub2_Sub2_Sub1_Sub2[2048];

	@OriginalMember(owner = "client!tb", name = "M", descriptor = "[I")
	public static int[] anIntArray352 = new int[128];

	@OriginalMember(owner = "client!tb", name = "O", descriptor = "Lclient!u;")
	public static Class74 aClass74_1544 = Static72.method1077("Hierhin gehen");

	@OriginalMember(owner = "client!tb", name = "U", descriptor = "Lclient!u;")
	public static Class74 aClass74_1545 = Static72.method1077("Anmelde)2Limit -Uberschritten)3");

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V")
	public static void method1682() {
		aClass74_1544 = null;
		aClass65_1 = null;
		aClass74_1545 = null;
		aClass26_29 = null;
		anIntArray352 = null;
		aClass2_Sub2_Sub2_Sub1_Sub2Array1 = null;
		anIntArray350 = null;
		aClass74_1543 = null;
		aClass74_1542 = null;
		aByteArrayArray8 = null;
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)V")
	public static void method1683() {
		if (!Static120.aBoolean111) {
			return;
		}
		Static67.aClass9_31 = null;
		Static42.aClass2_Sub2_Sub1_Sub1_21 = null;
		Static43.anIntArray114 = null;
		Static23.aClass9_14 = null;
		Static111.aClass2_Sub2_Sub1_Sub1_46 = null;
		Static8.aClass2_Sub2_Sub1_Sub1_6 = null;
		Static64.anIntArray175 = null;
		Static52.aClass2_Sub2_Sub1_Sub1_26 = null;
		Static50.aClass9_25 = null;
		Static97.aClass2_Sub2_Sub1_Sub1_51 = null;
		Static45.anIntArray124 = null;
		Static99.aClass9_48 = null;
		Static107.aClass9_52 = null;
		Static120.aBoolean111 = false;
		Static91.aClass2_Sub2_Sub1_Sub1_39 = null;
		Static72.aClass9_34 = null;
		Static128.aClass9_59 = null;
		Static99.aClass9_49 = null;
		Static14.aClass2_Sub2_Sub1_Sub1_13 = null;
		Static53.aClass9_27 = null;
		Static10.aClass2_Sub2_Sub1_Sub1_8 = null;
		Static83.aClass9_40 = null;
		Static90.aClass2_Sub2_Sub1_Sub1_38 = null;
		Static68.aClass9_32 = null;
		Static102.aClass9_51 = null;
		Static48.aClass2_Sub2_Sub1_Sub1Array6 = null;
		Static62.aClass2_Sub2_Sub1_Sub1_29 = null;
		Static23.aClass9_13 = null;
		Static78.aClass9_38 = null;
		Static111.aClass2_Sub2_Sub1_Sub1_45 = null;
		Static37.aClass9_43 = null;
		Static42.aClass2_Sub2_Sub1_Sub1_20 = null;
		Static41.aClass2_Sub2_Sub1_Sub1_19 = null;
		Static63.aClass9_30 = null;
		Static83.aClass2_Sub2_Sub1_Sub1_36 = null;
		Static52.anIntArray142 = null;
		Static63.aClass2_Sub2_Sub1_Sub1_30 = null;
		Static14.aClass2_Sub2_Sub1_Sub1_12 = null;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(III)I")
	public static int method1684(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(37) int local37 = Static51.method1519(arg0 + 45365, arg1 - -91923, 4) + (Static51.method1519(arg0 + 10294, arg1 + 37821, 2) + -128 >> 1) + (Static51.method1519(arg0, arg1, 1) + -128 >> 2) - 128;
		local37 = (int) ((double) local37 * 0.3D) + 35;
		if (local37 < 10) {
			local37 = 10;
		} else if (local37 > 60) {
			local37 = 60;
		}
		return local37;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(BI)Lclient!j;")
	public static Class2_Sub2_Sub10 method1685(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub2_Sub10 local10 = (Class2_Sub2_Sub10) Static5.aClass16_4.method490((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static86.aClass26_21.method1358(arg0, 5);
		local10 = new Class2_Sub2_Sub10();
		if (local20 != null) {
			local10.method899(new Class2_Sub10(local20));
		}
		Static5.aClass16_4.method492(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZJ)Lclient!u;")
	public static Class74 method1686(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(35) int local35 = 0;
			@Pc(37) long local37 = arg0;
			while (local37 != 0L) {
				local37 /= 37L;
				local35++;
			}
			@Pc(53) byte[] local53 = new byte[local35];
			while (arg0 != 0L) {
				@Pc(57) long local57 = arg0;
				arg0 /= 37L;
				local35--;
				local53[local35] = Static52.aByteArray9[(int) (local57 - arg0 * 37L)];
			}
			@Pc(84) Class74 local84 = new Class74();
			local84.aByteArray38 = local53;
			local84.anInt2481 = local53.length;
			return local84;
		}
	}
}
