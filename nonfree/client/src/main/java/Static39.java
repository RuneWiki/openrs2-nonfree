import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!bv", name = "c", descriptor = "Lclient!q;")
	public static Class202 aClass202_3;

	@OriginalMember(owner = "client!bv", name = "e", descriptor = "[[B")
	public static byte[][] aByteArrayArray6;

	@OriginalMember(owner = "client!bv", name = "j", descriptor = "I")
	public static int anInt1158;

	@OriginalMember(owner = "client!bv", name = "d", descriptor = "Lclient!wt;")
	public static final Class267 aClass267_16 = new Class267("Connected to update server", "Verbindung zum Update-Server hergestellt.", "Connecté au serveur de mise à jour", "Conectado ao servidor de atualização");

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(IIII)V")
	public static void method945(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) int local6 = arg1 * Static291.aClass28_Sub1_1.anInt1033 >> 8;
		if (local6 != 0 && arg0 != -1) {
			Static210.method3214(local6, arg0, Static208.aClass100_39);
			Static5.aBoolean10 = true;
		}
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(IIBZ)I")
	public static int method946(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(16) Class6_Sub37 local16 = Static375.method5604(arg2, arg0);
		if (local16 == null) {
			return 0;
		} else if (arg1 >= 0 && local16.anIntArray409.length > arg1) {
			return local16.anIntArray409[arg1];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lclient!ts;B)Ljava/lang/String;")
	public static String method947(@OriginalArg(0) Class239 arg0) {
		if (Static50.method1150(arg0).method1216() == 0) {
			return null;
		} else if (arg0.aString61 == null || arg0.aString61.trim().length() == 0) {
			return Static27.aBoolean39 ? "Hidden-use" : null;
		} else {
			return arg0.aString61;
		}
	}
}
