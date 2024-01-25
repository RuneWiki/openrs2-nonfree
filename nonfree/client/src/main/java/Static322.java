import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static322 {

	@OriginalMember(owner = "client!kr", name = "c", descriptor = "Lclient!aj;")
	public static Class15 aClass15_85;

	@OriginalMember(owner = "client!kr", name = "f", descriptor = "I")
	public static int anInt5378;

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_121 = new Class180(6, -2);

	@OriginalMember(owner = "client!kr", name = "e", descriptor = "I")
	public static int anInt5377 = -1;

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)V")
	public static void method4919() {
		Static394.aBoolean445 = false;
		Static654.anIntArray928 = null;
		Static555.anIntArray766 = null;
		Static190.anIntArray337 = null;
		Static511.anIntArray690 = null;
		Static664.anIntArray938 = null;
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method4920(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (Static458.anInt7581 >= 200 && !Static140.aBoolean219 || Static458.anInt7581 >= 200) {
			Static381.method5445(Static601.aClass346_13.method8440(Static609.anInt9834));
			return;
		}
		@Pc(37) String local37 = Static629.method8792(arg0);
		if (local37 == null) {
			return;
		}
		@Pc(81) String local81;
		for (@Pc(42) int local42 = 0; local42 < Static458.anInt7581; local42++) {
			@Pc(50) String local50 = Static629.method8792(Static461.aStringArray20[local42]);
			if (local50 != null && local50.equals(local37)) {
				Static381.method5445(arg0 + Static601.aClass346_40.method8440(Static609.anInt9834));
				return;
			}
			if (Static105.aStringArray5[local42] != null) {
				local81 = Static629.method8792(Static105.aStringArray5[local42]);
				if (local81 != null && local81.equals(local37)) {
					Static381.method5445(arg0 + Static601.aClass346_40.method8440(Static609.anInt9834));
					return;
				}
			}
		}
		for (@Pc(108) int local108 = 0; local108 < Static94.anInt1782; local108++) {
			local81 = Static629.method8792(Static134.aStringArray7[local108]);
			if (local81 != null && local81.equals(local37)) {
				Static381.method5445(Static601.aClass346_45.method8440(Static609.anInt9834) + arg0 + Static601.aClass346_46.method8440(Static609.anInt9834));
				return;
			}
			if (Static271.aStringArray31[local108] != null) {
				@Pc(152) String local152 = Static629.method8792(Static271.aStringArray31[local108]);
				if (local152 != null && local152.equals(local37)) {
					Static381.method5445(Static601.aClass346_45.method8440(Static609.anInt9834) + arg0 + Static601.aClass346_46.method8440(Static609.anInt9834));
					return;
				}
			}
		}
		if (Static629.method8792(Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.aString123).equals(local37)) {
			Static381.method5445(Static601.aClass346_43.method8440(Static609.anInt9834));
		} else {
			@Pc(206) Class3_Sub34 local206 = Static172.method3123(Static163.aClass375_1, Static262.aClass218_67);
			local206.aClass3_Sub25_Sub1_2.method8614(Static440.method6269(arg0));
			local206.aClass3_Sub25_Sub1_2.method8583(arg0);
			Static441.method6275(local206);
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(B)Ljava/lang/String;")
	public static String method4921() {
		@Pc(15) String local15 = "www";
		if (Static371.aClass147_6 == Static202.aClass147_5) {
			local15 = "www-wtrc";
		} else if (Static440.aClass147_7 == Static202.aClass147_5) {
			local15 = "www-wtqa";
		} else if (Static152.aClass147_3 == Static202.aClass147_5) {
			local15 = "www-wtwip";
		}
		@Pc(36) String local36 = "";
		if (Static303.aString49 != null) {
			local36 = "/p=" + Static303.aString49;
		}
		return "http://" + local15 + "." + Static55.aClass118_2.aString33 + ".com/l=" + Static609.anInt9834 + "/a=" + Static362.anInt5843 + local36 + "/";
	}
}
