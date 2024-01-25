import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static213 {

	@OriginalMember(owner = "client!nh", name = "n", descriptor = "I")
	public static int anInt4102;

	@OriginalMember(owner = "client!nh", name = "e", descriptor = "Lclient!iq;")
	public static final Class93 aClass93_81 = new Class93("Loaded update list", "Update-Liste geladen.", "Liste des mises à jour chargée", "Lista de atualizações carregada");

	@OriginalMember(owner = "client!nh", name = "l", descriptor = "[Lclient!re;")
	public static final Class121_Sub1[] aClass121_Sub1Array1 = new Class121_Sub1[29];

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(I)Ljava/lang/String;")
	public static String method3778() {
		@Pc(11) String local11 = "www";
		if (Static183.anInt3622 != 0) {
			local11 = "www-wtqa";
		}
		@Pc(17) String local17 = "";
		if (Static331.aString28 != null) {
			local17 = "/p=" + Static331.aString28;
		}
		return Static41.anInt830 == 1 ? "http://" + local11 + ".stellardawn.com/l=" + Static21.anInt455 + "/a=" + Static94.anInt2145 + local17 + "/" : "http://" + local11 + ".runescape.com/l=" + Static21.anInt455 + "/a=" + Static94.anInt2145 + local17 + "/";
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(II)V")
	public static void method3781(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub11_Sub19 local8 = Static306.method5411(2, arg0);
		local8.method5539();
	}
}
