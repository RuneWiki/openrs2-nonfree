import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static286 {

	@OriginalMember(owner = "client!nq", name = "h", descriptor = "I")
	public static int anInt4795;

	@OriginalMember(owner = "client!nq", name = "c", descriptor = "Lclient!kn;")
	public static final Class142 aClass142_71 = new Class142("rating: ", "Kampfstufe: ", "classement ", "qualificação: ");

	@OriginalMember(owner = "client!nq", name = "j", descriptor = "I")
	public static final int anInt4796 = 1337;

	@OriginalMember(owner = "client!nq", name = "k", descriptor = "[F")
	public static final float[] aFloatArray22 = new float[4];

	@OriginalMember(owner = "client!nq", name = "l", descriptor = "I")
	public static int anInt4797 = 0;

	@OriginalMember(owner = "client!nq", name = "m", descriptor = "Lclient!kn;")
	public static final Class142 aClass142_72 = new Class142("Loading sprites - ", "Lade Sprites - ", "Chargement des sprites - ", "Carregando sprites - ");

	@OriginalMember(owner = "client!nq", name = "n", descriptor = "F")
	public static float aFloat68 = 0.0F;

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Ljava/lang/Object;Lclient!nt;I)V")
	public static void method3789(@OriginalArg(0) Object arg0, @OriginalArg(1) Class177 arg1) {
		if (arg1.anEventQueue1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 50 && arg1.anEventQueue1.peekEvent() != null; local11++) {
			Static331.method4343(1L);
		}
		if (arg0 != null) {
			arg1.anEventQueue1.postEvent(new ActionEvent(arg0, 1001, "dummy"));
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(B)V")
	public static void method3790() {
		Static103.anInt6434 = 0;
		for (@Pc(17) int local17 = 0; local17 < 2048; local17++) {
			Static351.aClass1_Sub19Array1[local17] = null;
			Static348.aByteArray79[local17] = 1;
			Static393.aClass70Array1[local17] = null;
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(CI)C")
	public static char method3792(@OriginalArg(0) char arg0) {
		if (arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-') {
			return '_';
		} else if (arg0 == '[' || arg0 == ']' || arg0 == '#') {
			return arg0;
		} else if (arg0 == 'à' || arg0 == 'á' || arg0 == 'â' || arg0 == 'ä' || arg0 == 'ã' || arg0 == 'À' || arg0 == 'Á' || arg0 == 'Â' || arg0 == 'Ä' || arg0 == 'Ã') {
			return 'a';
		} else if (arg0 == 'è' || arg0 == 'é' || arg0 == 'ê' || arg0 == 'ë' || arg0 == 'È' || arg0 == 'É' || arg0 == 'Ê' || arg0 == 'Ë') {
			return 'e';
		} else if (arg0 == 'í' || arg0 == 'î' || arg0 == 'ï' || arg0 == 'Í' || arg0 == 'Î' || arg0 == 'Ï') {
			return 'i';
		} else if (arg0 == 'ò' || arg0 == 'ó' || arg0 == 'ô' || arg0 == 'ö' || arg0 == 'õ' || arg0 == 'Ò' || arg0 == 'Ó' || arg0 == 'Ô' || arg0 == 'Ö' || arg0 == 'Õ') {
			return 'o';
		} else if (arg0 == 'ù' || arg0 == 'ú' || arg0 == 'û' || arg0 == 'ü' || arg0 == 'Ù' || arg0 == 'Ú' || arg0 == 'Û' || arg0 == 'Ü') {
			return 'u';
		} else if (arg0 == 'ç' || arg0 == 'Ç') {
			return 'c';
		} else if (arg0 == 'ÿ' || arg0 == 'Ÿ') {
			return 'y';
		} else if (arg0 == 'ñ' || arg0 == 'Ñ') {
			return 'n';
		} else if (arg0 == 'ß') {
			return 'b';
		} else {
			return Character.toLowerCase(arg0);
		}
	}
}
