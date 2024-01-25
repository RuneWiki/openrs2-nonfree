import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static538 {

	@OriginalMember(owner = "client!se", name = "h", descriptor = "I")
	public static int anInt8818;

	@OriginalMember(owner = "client!se", name = "d", descriptor = "I")
	public static int anInt8816 = 0;

	@OriginalMember(owner = "client!se", name = "e", descriptor = "Z")
	public static boolean aBoolean660 = false;

	@OriginalMember(owner = "client!se", name = "g", descriptor = "Lclient!cja;")
	public static final Class62 aClass62_46 = new Class62(16);

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(ILclient!fca;)Lclient!lp;")
	public static Class229 method7477(@OriginalArg(1) Class3_Sub17 arg0) {
		@Pc(7) int local7 = arg0.method4888();
		@Pc(14) Class92 local14 = Static146.method2531()[arg0.method4888()];
		@Pc(21) Class65 local21 = Static657.method8561()[arg0.method4888()];
		@Pc(25) int local25 = arg0.method4869();
		@Pc(29) int local29 = arg0.method4869();
		@Pc(33) int local33 = arg0.method4858();
		@Pc(37) int local37 = arg0.method4858();
		@Pc(41) int local41 = arg0.method4868();
		@Pc(45) int local45 = arg0.method4868();
		@Pc(49) int local49 = arg0.method4868();
		@Pc(58) boolean local58 = arg0.method4888() == 1;
		return new Class229(local7, local14, local21, local25, local29, local33, local37, local41, local45, local49, local58);
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(BLclient!jda;)I")
	public static int method7478(@OriginalArg(1) Class188 arg0) {
		if (arg0 == Static70.aClass188_1) {
			return 5890;
		} else if (Static317.aClass188_3 == arg0) {
			return 34167;
		} else if (arg0 == Static622.aClass188_4) {
			return 34168;
		} else if (arg0 == Static262.aClass188_2) {
			return 34166;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Ljava/awt/Component;BZ)Lclient!tba;")
	public static Class75 method7479(@OriginalArg(0) Component arg0) {
		try {
			@Pc(29) Constructor local29 = Class.forName("Class75_Sub2").getDeclaredConstructor(Component.class, Boolean.TYPE);
			return (Class75) local29.newInstance(arg0, Boolean.valueOf(true));
		} catch (@Pc(47) Throwable local47) {
			return new Class75_Sub1(arg0, true);
		}
	}
}
