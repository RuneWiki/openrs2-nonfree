import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ac", name = "G", descriptor = "Lclient!dn;")
	public static Class56 aClass56_12;

	@OriginalMember(owner = "client!ac", name = "H", descriptor = "F")
	public static float aFloat11;

	@OriginalMember(owner = "client!ac", name = "I", descriptor = "I")
	public static int anInt815;

	@OriginalMember(owner = "client!ac", name = "J", descriptor = "I")
	public static int anInt816;

	@OriginalMember(owner = "client!ac", name = "K", descriptor = "[[Lclient!eo;")
	public static Class68[][] aClass68ArrayArray2;

	@OriginalMember(owner = "client!ac", name = "h", descriptor = "Lclient!oi;")
	public static final Class175 aClass175_34 = new Class175(" ", ": ", " ", " ");

	@OriginalMember(owner = "client!ac", name = "n", descriptor = "Lclient!oi;")
	public static final Class175 aClass175_35 = new Class175("Members object", "Gegenstand für Mitglieder", "Objet d'abonnés", "Objeto para membros");

	@OriginalMember(owner = "client!ac", name = "A", descriptor = "Lclient!jd;")
	public static final Class119 aClass119_2 = new Class119(2, 4, 4, 0);

	@OriginalMember(owner = "client!ac", name = "L", descriptor = "[[I")
	public static final int[][] anIntArrayArray3 = new int[6][];

	@OriginalMember(owner = "client!ac", name = "M", descriptor = "I")
	public static int anInt817 = 0;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V")
	public static void method739() {
		try {
			@Pc(16) Method local16 = Runtime.class.getMethod("availableProcessors");
			if (local16 != null) {
				try {
					@Pc(20) Runtime local20 = Runtime.getRuntime();
					@Pc(26) Integer local26 = (Integer) local16.invoke(local20, (Object[]) null);
					Static348.anInt7448 = local26;
				} catch (@Pc(31) Throwable local31) {
				}
			}
		} catch (@Pc(33) Exception local33) {
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method742(@OriginalArg(0) String arg0) {
		if (Static65.aClass26Array2 != null) {
			Static414.method5552(Static408.aClass92_233);
			Static302.aClass3_Sub2_Sub2_2.method6001(Static442.method5901(arg0));
			Static302.aClass3_Sub2_Sub2_2.method6033(arg0);
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!mv;Z)V")
	public static void method748(@OriginalArg(0) Class1_Sub3_Sub3_Sub1 arg0) {
		@Pc(15) Class3_Sub36 local15 = (Class3_Sub36) Static222.aClass127_23.method3246((long) arg0.anInt6066);
		if (local15 == null) {
			Static301.method4446(null, null, arg0, arg0.anIntArray453[0], 0, arg0.aByte77, arg0.anIntArray454[0]);
		} else {
			local15.method4863();
		}
	}
}
