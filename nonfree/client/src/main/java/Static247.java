import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static247 {

	@OriginalMember(owner = "client!ps", name = "O", descriptor = "Lclient!cq;")
	public static final Class34 aClass34_146 = new Class34("Checking for updates - ", "Suche nach Updates - ", "Vérification des mises à jour - ", "Verificando atualizações - ");

	@OriginalMember(owner = "client!ps", name = "ab", descriptor = "Lclient!bb;")
	public static final Class16 aClass16_28 = new Class16();

	@OriginalMember(owner = "client!ps", name = "db", descriptor = "I")
	public static int anInt5067 = 0;

	@OriginalMember(owner = "client!ps", name = "eb", descriptor = "[B")
	public static final byte[] aByteArray80 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@OriginalMember(owner = "client!ps", name = "gb", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray54 = new String[200];

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(BI)Lclient!kc;")
	public static Class113 method4446(@OriginalArg(1) int arg0) {
		@Pc(18) Class113 local18 = (Class113) Static153.aClass87_30.method2482((long) arg0);
		if (local18 != null) {
			return local18;
		}
		@Pc(28) byte[] local28 = Static191.aClass216_63.method5648(33, arg0);
		local18 = new Class113();
		if (local28 != null) {
			local18.method3082(arg0, new Class1_Sub8(local28));
		}
		Static153.aClass87_30.method2481(local18, (long) arg0);
		return local18;
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(ZLclient!la;)Ljava/lang/String;")
	public static String method4448(@OriginalArg(1) Class1_Sub23 arg0) {
		return arg0.aString34 == null || arg0.aString34.length() <= 0 ? arg0.aString35 : arg0.aString35 + Static27.aClass34_20.method1285(Static259.anInt2907) + arg0.aString34;
	}
}
