import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static425 {

	@OriginalMember(owner = "client!vc", name = "g", descriptor = "I")
	public static int anInt7119;

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "Lclient!pn;")
	public static final Class194 aClass194_117 = new Class194(81, 3);

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "Lclient!pu;")
	public static final Class198 aClass198_116 = new Class198("Members object", "Gegenstand für Mitglieder", "Objet d'abonnés", "Objeto para membros");

	@OriginalMember(owner = "client!vc", name = "f", descriptor = "Lclient!mo;")
	public static final Class163 aClass163_15 = new Class163(5, 7);

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IB)V")
	public static void method5638(@OriginalArg(0) int arg0) {
		Static110.anInt1841 = arg0;
		Static390.anInt6394 = -1;
		Static390.anInt6394 = -1;
		Static462.method6054();
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(BI)Z")
	public static boolean method5640(@OriginalArg(1) int arg0) {
		return arg0 == 23 || arg0 == 25 || arg0 == 1008 || arg0 == 2 || arg0 == 47;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!sj;I)V")
	public static void method5641(@OriginalArg(0) Class2_Sub1_Sub3_Sub2 arg0) {
		@Pc(11) Class5_Sub31 local11 = (Class5_Sub31) Static464.aClass252_39.method5659((long) arg0.anInt6126);
		if (local11 == null) {
			return;
		}
		if (local11.aClass5_Sub22_Sub2_4 != null) {
			Static119.aClass5_Sub22_Sub3_3.method3636(local11.aClass5_Sub22_Sub2_4);
			local11.aClass5_Sub22_Sub2_4 = null;
		}
		local11.method6003();
	}
}
