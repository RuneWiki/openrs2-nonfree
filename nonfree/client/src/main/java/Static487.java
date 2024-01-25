import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static487 {

	@OriginalMember(owner = "client!ug", name = "G", descriptor = "[I")
	public static int[] anIntArray647;

	@OriginalMember(owner = "client!ug", name = "M", descriptor = "[I")
	public static int[] anIntArray648;

	@OriginalMember(owner = "client!ug", name = "N", descriptor = "Lclient!ada;")
	public static Class6 aClass6_129;

	@OriginalMember(owner = "client!ug", name = "D", descriptor = "Lclient!h;")
	public static final Class114 aClass114_159 = new Class114("Initialised native registry", "Registry initialisiert", "Registre natif initialisé", "Inicializando registro nativo");

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lclient!kda;Lclient!n;B)V")
	public static void method7048(@OriginalArg(0) Class160 arg0, @OriginalArg(1) Interface8 arg1) {
		Static534.anInterface8_14 = arg1;
		Static521.aClass160_102 = arg0;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(II)V")
	public static void method7049() {
		Static262.aClass316_33.method7791(50);
		Static216.aClass316_28.method7791(50);
		Static180.aClass316_21.method7791(50);
		Static108.aClass316_13.method7791(50);
		Static488.aClass316_59.method7791(50);
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lclient!gba;B)I")
	public static int method7050(@OriginalArg(0) Class1_Sub13_Sub2 arg0) {
		@Pc(8) int local8 = arg0.method3087(2);
		@Pc(20) int local20;
		if (local8 == 0) {
			local20 = 0;
		} else if (local8 == 1) {
			local20 = arg0.method3087(5);
		} else if (local8 == 2) {
			local20 = arg0.method3087(8);
		} else {
			local20 = arg0.method3087(11);
		}
		return local20;
	}

	@OriginalMember(owner = "client!ug", name = "e", descriptor = "(I)Ljava/lang/String;")
	public static String method7053() {
		@Pc(5) String local5 = "www";
		if (Static363.aClass199_14 == Static348.aClass199_11) {
			local5 = "www-wtrc";
		} else if (Static168.aClass199_6 == Static363.aClass199_14) {
			local5 = "www-wtqa";
		} else if (Static363.aClass199_14 == Static295.aClass199_10) {
			local5 = "www-wtwip";
		}
		@Pc(24) String local24 = "";
		if (Static120.aString18 != null) {
			local24 = "/p=" + Static120.aString18;
		}
		return "http://" + local5 + "." + Static538.aClass37_4.aString7 + ".com/l=" + Static315.anInt5993 + "/a=" + Static143.anInt3316 + local24 + "/";
	}
}
