import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static227 {

	@OriginalMember(owner = "client!jb", name = "p", descriptor = "I")
	public static int anInt3847;

	@OriginalMember(owner = "client!jb", name = "t", descriptor = "Lclient!jv;")
	public static final Class165 aClass165_8 = new Class165(4, 1);

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!wk;B)V")
	public static void method3327(@OriginalArg(0) Class6_Sub51 arg0) {
		if (Static208.aClass9ArrayArrayArray3 == null) {
			return;
		}
		@Pc(8) Interface6 local8 = null;
		if (arg0.anInt9519 == 0) {
			local8 = (Interface6) Static120.method1814(arg0.anInt9521, arg0.anInt9518, arg0.anInt9513);
		}
		if (arg0.anInt9519 == 1) {
			local8 = (Interface6) Static178.method5953(arg0.anInt9521, arg0.anInt9518, arg0.anInt9513);
		}
		if (arg0.anInt9519 == 2) {
			local8 = (Interface6) Static134.method1995(arg0.anInt9521, arg0.anInt9518, arg0.anInt9513, dda.class);
		}
		if (arg0.anInt9519 == 3) {
			local8 = (Interface6) Static315.method4904(arg0.anInt9521, arg0.anInt9518, arg0.anInt9513);
		}
		if (local8 == null) {
			arg0.anInt9523 = -1;
			arg0.anInt9524 = 0;
			arg0.anInt9520 = 0;
		} else {
			arg0.anInt9523 = local8.method7555();
			arg0.anInt9524 = local8.method7551();
			arg0.anInt9520 = local8.method7553();
		}
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(I)Ljava/lang/String;")
	public static String method3328() {
		@Pc(7) String local7 = "www";
		if (Static376.aClass287_6 == Static420.aClass287_7) {
			local7 = "www-wtrc";
		} else if (Static376.aClass287_6 == Static257.aClass287_4) {
			local7 = "www-wtqa";
		} else if (Static154.aClass287_2 == Static376.aClass287_6) {
			local7 = "www-wtwip";
		}
		@Pc(33) String local33 = "";
		if (Static492.aString102 != null) {
			local33 = "/p=" + Static492.aString102;
		}
		return "http://" + local7 + "." + Static57.aClass314_1.aString110 + ".com/l=" + Static470.anInt7957 + "/a=" + Static323.anInt5822 + local33 + "/";
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIC)I")
	public static int method3329(@OriginalArg(1) int arg0, @OriginalArg(2) char arg1) {
		@Pc(7) int local7 = arg1 << 4;
		if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
			arg1 = Character.toLowerCase(arg1);
			local7 = (arg1 << 4) + 1;
		}
		if (arg1 == 'ñ' && arg0 == 0) {
			local7 = 1762;
		}
		return local7;
	}
}
