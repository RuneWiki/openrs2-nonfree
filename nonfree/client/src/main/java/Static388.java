import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static388 {

	@OriginalMember(owner = "client!nb", name = "e", descriptor = "Lclient!ep;")
	public static Class109 aClass109_1;

	@OriginalMember(owner = "client!nb", name = "j", descriptor = "Lclient!br;")
	public static Class41 aClass41_2;

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "[I")
	public static final int[] anIntArray342 = new int[250];

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "[Lclient!mu;")
	public static final Class239[] aClass239Array1 = new Class239[14];

	@OriginalMember(owner = "client!nb", name = "d", descriptor = "I")
	public static int anInt6476 = 0;

	@OriginalMember(owner = "client!nb", name = "f", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_102 = new Class171(60, 0);

	@OriginalMember(owner = "client!nb", name = "i", descriptor = "I")
	public static int anInt6479 = -1;

	@OriginalMember(owner = "client!nb", name = "k", descriptor = "Lclient!qw;")
	public static final Class302 aClass302_43 = new Class302();

	@OriginalMember(owner = "client!nb", name = "l", descriptor = "Lclient!gi;")
	public static final Class131 aClass131_19 = new Class131();

	@OriginalMember(owner = "client!nb", name = "m", descriptor = "I")
	public static int anInt6480 = 0;

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILclient!ofa;)V")
	public static void method5437(@OriginalArg(1) Class265 arg0) {
		if (!Static47.aBoolean59) {
			return;
		}
		if (arg0.anObjectArray20 != null) {
			@Pc(23) Class265 local23 = Static212.method3145(Static376.anInt5867, Static284.anInt4811);
			if (local23 != null) {
				@Pc(29) Class3_Sub53 local29 = new Class3_Sub53();
				local29.aClass265_16 = arg0;
				local29.anObjectArray35 = arg0.anObjectArray20;
				local29.aClass265_15 = local23;
				Static250.method3767(local29);
			}
		}
		@Pc(46) Class3_Sub37 local46 = Static90.method1509(Static571.aClass240_101, Static226.aClass144_2);
		local46.aClass3_Sub4_Sub1_2.method7909(arg0.anInt7032);
		local46.aClass3_Sub4_Sub1_2.method7936(Static284.anInt4811);
		local46.aClass3_Sub4_Sub1_2.method7941(arg0.anInt7004);
		local46.aClass3_Sub4_Sub1_2.method7941(arg0.anInt7005);
		local46.aClass3_Sub4_Sub1_2.method7913(Static376.anInt5867);
		local46.aClass3_Sub4_Sub1_2.method7941(Static454.anInt7316);
		Static301.method2678(local46);
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "([BI)Z")
	public static boolean method5438(@OriginalArg(0) byte[] arg0) {
		@Pc(13) Class3_Sub4 local13 = new Class3_Sub4(arg0);
		@Pc(17) int local17 = local13.method7954();
		if (local17 != 2) {
			return false;
		}
		@Pc(35) boolean local35 = local13.method7954() == 1;
		if (local35) {
			Static358.method5176(local13);
		}
		Static50.method967(local13);
		return true;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(III)Z")
	public static boolean method5440(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 >= 1000 && arg0 < 1000) {
			return true;
		} else if (arg1 >= 1000 || arg0 >= 1000) {
			return arg1 >= 1000 && arg0 >= 1000;
		} else if (Static562.method7402(arg0)) {
			return true;
		} else {
			return !Static562.method7402(arg1);
		}
	}
}
