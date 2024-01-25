import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static532 {

	@OriginalMember(owner = "client!wda", name = "k", descriptor = "[Lclient!sa;")
	public static Class75[] aClass75Array3;

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "Lclient!nj;")
	public static final Class202 aClass202_264 = new Class202("Members object", "Gegenstand für Mitglieder", "Objet d'abonnés", "Objeto para membros");

	@OriginalMember(owner = "client!wda", name = "h", descriptor = "Lclient!pn;")
	public static final Class224 aClass224_6 = new Class224();

	@OriginalMember(owner = "client!wda", name = "i", descriptor = "Lclient!qp;")
	public static final Class239 aClass239_186 = new Class239(42, 3);

	@OriginalMember(owner = "client!wda", name = "j", descriptor = "Z")
	public static boolean aBoolean666 = false;

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(ZI)V")
	public static void method7661(@OriginalArg(1) int arg0) {
		if (!Static281.aClass2_Sub19_Sub1_1.aBoolean190) {
			arg0 = -1;
		}
		if (arg0 == Static545.anInt9377) {
			return;
		}
		if (arg0 != -1) {
			@Pc(24) Class307 local24 = Static70.aClass61_1.method1760(arg0);
			@Pc(28) Class241 local28 = local24.method7618();
			if (local28 == null) {
				arg0 = -1;
			} else {
				Static531.aClass283_6.method7177(local28.method6366(), new Point(local24.anInt9114, local24.anInt9113), local28.method6375(), local28.method6376(), Static517.aCanvas14);
				Static545.anInt9377 = arg0;
			}
		}
		if (arg0 == -1 && Static545.anInt9377 != -1) {
			Static531.aClass283_6.method7177(null, new Point(), -1, -1, Static517.aCanvas14);
			Static545.anInt9377 = -1;
		}
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(ILclient!hca;)V")
	public static void method7663(@OriginalArg(1) Class1_Sub1_Sub2_Sub1 arg0) {
		@Pc(15) Class2_Sub46 local15 = (Class2_Sub46) Static92.aClass127_16.method3205((long) arg0.anInt5076);
		if (local15 == null) {
			return;
		}
		if (local15.aClass2_Sub12_Sub3_4 != null) {
			Static288.aClass2_Sub12_Sub2_5.method2088(local15.aClass2_Sub12_Sub3_4);
			local15.aClass2_Sub12_Sub3_4 = null;
		}
		local15.method7802();
	}
}
