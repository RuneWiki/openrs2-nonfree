import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static340 {

	@OriginalMember(owner = "client!qq", name = "I", descriptor = "I")
	public static int anInt6081;

	@OriginalMember(owner = "client!qq", name = "O", descriptor = "Lclient!mn;")
	public static Class171 aClass171_72;

	@OriginalMember(owner = "client!qq", name = "Q", descriptor = "Lclient!mn;")
	public static Class171 aClass171_73;

	@OriginalMember(owner = "client!qq", name = "R", descriptor = "I")
	public static int anInt6086;

	@OriginalMember(owner = "client!qq", name = "S", descriptor = "Lclient!o;")
	public static Class41 aClass41_16;

	@OriginalMember(owner = "client!qq", name = "N", descriptor = "Lclient!lm;")
	public static final Class163 aClass163_16 = new Class163(7, 3);

	@OriginalMember(owner = "client!qq", name = "P", descriptor = "Lclient!ss;")
	public static final Class231 aClass231_105 = new Class231("Loading interfaces - ", "Lade Benutzeroberfläche - ", "Chargement des interfaces - ", "Carregando interfaces - ");

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(ILclient!na;Ljava/lang/String;I)Lclient!aw;")
	public static Class18 method4839(@OriginalArg(1) Class75_Sub2 arg0, @OriginalArg(2) String arg1) {
		@Pc(5) int local5 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local5);
		OpenGL.glProgramStringARB(34336, 34933, arg1);
		OpenGL.glGetIntegerv(34379, Static456.anIntArray625, 0);
		if (Static456.anIntArray625[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class18(arg0, 34336, local5);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}
}
