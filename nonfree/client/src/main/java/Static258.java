import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static258 {

	@OriginalMember(owner = "client!jda", name = "i", descriptor = "Lclient!kd;")
	public static Class6 aClass6_38;

	@OriginalMember(owner = "client!jda", name = "q", descriptor = "[Lclient!dm;")
	public static Class78[] aClass78Array32;

	@OriginalMember(owner = "client!jda", name = "r", descriptor = "Lclient!fp;")
	public static Class114 aClass114_43;

	@OriginalMember(owner = "client!jda", name = "u", descriptor = "Lclient!av;")
	public static Class26 aClass26_38;

	@OriginalMember(owner = "client!jda", name = "h", descriptor = "I")
	public static int anInt10109 = -1;

	@OriginalMember(owner = "client!jda", name = "j", descriptor = "Lclient!is;")
	public static final Class165 aClass165_31 = new Class165();

	@OriginalMember(owner = "client!jda", name = "c", descriptor = "(I)V")
	public static void method8460() {
		if (!Static4.method56()) {
			return;
		}
		if (Static177.aStringArray9 == null) {
			Static536.method7484();
		}
		Static183.aBoolean337 = true;
		Static436.anInt7762 = 0;
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(Lclient!aia;I)V")
	public static void method8461(@OriginalArg(0) Class2_Sub3 arg0) {
		if (Static440.aClass217ArrayArrayArray3 == null) {
			return;
		}
		@Pc(8) Interface27 local8 = null;
		if (arg0.anInt290 == 0) {
			local8 = (Interface27) Static468.method6746(arg0.anInt294, arg0.anInt296, arg0.anInt286);
		}
		if (arg0.anInt290 == 1) {
			local8 = (Interface27) Static148.method2840(arg0.anInt294, arg0.anInt296, arg0.anInt286);
		}
		if (arg0.anInt290 == 2) {
			local8 = (Interface27) Static383.method5768(arg0.anInt294, arg0.anInt296, arg0.anInt286, wk.class);
		}
		if (arg0.anInt290 == 3) {
			local8 = (Interface27) Static263.method4286(arg0.anInt294, arg0.anInt296, arg0.anInt286);
		}
		if (local8 == null) {
			arg0.anInt288 = 0;
			arg0.anInt285 = -1;
			arg0.anInt284 = 0;
		} else {
			arg0.anInt285 = local8.method8326();
			arg0.anInt288 = local8.method8329();
			arg0.anInt284 = local8.method8328();
		}
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(Lclient!ul;BLclient!ha;)I")
	public static int method8463(@OriginalArg(0) Class342 arg0, @OriginalArg(2) Class87 arg1) {
		if (arg0.anInt9520 != -1) {
			return arg0.anInt9520;
		}
		if (arg0.anInt9515 != -1) {
			@Pc(29) Class199 local29 = arg1.anInterface6_11.method6357(arg0.anInt9515);
			if (!local29.aBoolean427) {
				return local29.aShort83;
			}
		}
		return arg0.anInt9511;
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(Lclient!ud;I)Lclient!pca;")
	public static Class160_Sub2 method8465(@OriginalArg(0) Class2_Sub34 arg0) {
		return new Class160_Sub2(arg0.method6856(), arg0.method6856(), arg0.method6856(), arg0.method6856(), arg0.method6870(), arg0.method6870(), arg0.method6904());
	}
}
