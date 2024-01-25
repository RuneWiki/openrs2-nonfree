import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static341 {

	@OriginalMember(owner = "client!vn", name = "k", descriptor = "I")
	public static int anInt266;

	@OriginalMember(owner = "client!vn", name = "j", descriptor = "Lclient!pm;")
	public static final Class159 aClass159_23 = new Class159("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.");

	@OriginalMember(owner = "client!vn", name = "l", descriptor = "[Lclient!b;")
	public static final Class14[] aClass14Array2 = new Class14[14];

	@OriginalMember(owner = "client!vn", name = "m", descriptor = "[I")
	public static final int[] anIntArray9 = new int[2500];

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method236(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(20) int local20 = 0; local20 < local8; local20++) {
			@Pc(26) char local26 = arg0.charAt(local20);
			if (local26 == '<' || local26 == '>') {
				local10 += 3;
			}
		}
		@Pc(48) StringBuffer local48 = new StringBuffer(local10 + local8);
		for (@Pc(50) int local50 = 0; local50 < local8; local50++) {
			@Pc(56) char local56 = arg0.charAt(local50);
			if (local56 == '<') {
				local48.append("<lt>");
			} else if (local56 == '>') {
				local48.append("<gt>");
			} else {
				local48.append(local56);
			}
		}
		return local48.toString();
	}

	@OriginalMember(owner = "client!vn", name = "c", descriptor = "(I)V")
	public static void method237() {
		Static243.aClass47_10.method2668(Static177.aFloat68, Static140.aFloat63, Static150.aFloat64);
	}
}
