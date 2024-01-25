import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!di", name = "N", descriptor = "I")
	public static int anInt5539;

	@OriginalMember(owner = "client!di", name = "D", descriptor = "Lclient!tm;")
	public static final Class221 aClass221_192 = new Class221("purple:", "lila:", "violet:", "roxo:");

	@OriginalMember(owner = "client!di", name = "G", descriptor = "I")
	public static int anInt5536 = -1;

	@OriginalMember(owner = "client!di", name = "M", descriptor = "Lclient!lm;")
	public static final Class144 aClass144_10 = new Class144("", 14);

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IIZIZ)Lclient!fc;")
	public static Class71 method4850(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(4) boolean arg2) {
		@Pc(12) Class161 local12 = null;
		if (Static176.aClass20_4 != null) {
			local12 = new Class161(arg0, Static176.aClass20_4, Static343.aClass20Array1[arg0], 1000000);
		}
		Static148.aClass106_Sub1Array2[arg0] = Static344.aClass83_9.method2077(Static78.aClass161_1, arg0, local12);
		if (arg2) {
			Static148.aClass106_Sub1Array2[arg0].method3063();
		}
		return new Class71(Static148.aClass106_Sub1Array2[arg0], arg1, 1);
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IIBI)I")
	public static int method4851(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return 7 - arg1;
		} else if (local3 == 2) {
			return 7 - arg2;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(ILclient!ms;)V")
	public static void method4852(@OriginalArg(1) Class155 arg0) {
		if (arg0.anInt4164 == 5 && arg0.anInt4212 != -1) {
			Static223.method3755(arg0, Static304.aClass82_4);
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(ILclient!bn;)Ljava/lang/String;")
	public static String method4853(@OriginalArg(1) Class2_Sub7 arg0) {
		return arg0.aString4 == null || arg0.aString4.length() <= 0 ? arg0.aString3 : arg0.aString3 + Static226.aClass221_144.method5229(Static189.anInt5185) + arg0.aString4;
	}
}
