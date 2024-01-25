import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!bc", name = "L", descriptor = "Lclient!uv;")
	public static final Class296 aClass296_45 = new Class296(28, 0);

	@OriginalMember(owner = "client!bc", name = "N", descriptor = "Lclient!rh;")
	public static final Class256 aClass256_1 = new Class256(0);

	@OriginalMember(owner = "client!bc", name = "P", descriptor = "[I")
	public static final int[] anIntArray113 = new int[1000];

	@OriginalMember(owner = "client!bc", name = "R", descriptor = "Lclient!vt;")
	public static final Class306 aClass306_9 = new Class306("Connecting to update server", "Verbindung mit Update-Server...", "Connexion au serveur de mise à jour...", "Conectando ao servidor de atualização");

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(ILclient!dc;IBIII)V")
	public static void method778(@OriginalArg(1) Class49_Sub2_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		Static404.method6682(arg0.anInt7137, arg0.anInt7141, arg0.aByte98, arg3, 0, arg2, arg1);
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(B)[Lclient!bda;")
	public static Class21[] method779() {
		return new Class21[] { Static71.aClass21_1, Static486.aClass21_7, Static214.aClass21_3, Static508.aClass21_8, Static247.aClass21_5, Static462.aClass21_6 };
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)Lclient!taa;")
	public static Class185_Sub1 method780(@OriginalArg(1) int arg0) {
		return Static387.aBoolean508 && Static372.anInt6840 <= arg0 && Static538.anInt9101 >= arg0 ? Static320.aClass185_Sub1Array2[arg0 - Static372.anInt6840] : null;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIIII)V")
	public static void method781(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(11) int local11 = arg3; local11 <= arg0; local11++) {
			Static424.method6216(arg1, arg2, arg4, Static447.anIntArrayArray99[local11]);
		}
	}
}
