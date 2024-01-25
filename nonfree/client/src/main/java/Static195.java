import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!jm", name = "K", descriptor = "I")
	public static int anInt3127;

	@OriginalMember(owner = "client!jm", name = "Q", descriptor = "F")
	public static float aFloat43;

	@OriginalMember(owner = "client!jm", name = "S", descriptor = "I")
	public static int anInt3133;

	@OriginalMember(owner = "client!jm", name = "C", descriptor = "Lclient!ki;")
	public static final Class137 aClass137_132 = new Class137(10, 8);

	@OriginalMember(owner = "client!jm", name = "F", descriptor = "[I")
	public static final int[] anIntArray170 = new int[4096];

	@OriginalMember(owner = "client!jm", name = "G", descriptor = "I")
	public static int anInt3124 = -50;

	@OriginalMember(owner = "client!jm", name = "R", descriptor = "Lclient!lt;")
	public static final Class151 aClass151_104 = new Class151("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.", "Conexão perdida.");

	@OriginalMember(owner = "client!jm", name = "T", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_124 = new Class214(99, 8);

	@OriginalMember(owner = "client!jm", name = "U", descriptor = "S")
	public static short aShort32 = 1;

	@OriginalMember(owner = "client!jm", name = "d", descriptor = "(I)V")
	public static void method2587() {
		if (Static169.anInt2522 == -1) {
			return;
		}
		@Pc(11) int local11 = Static210.aClass26_1.method576();
		@Pc(15) int local15 = Static210.aClass26_1.method574();
		@Pc(20) Class1_Sub29 local20 = (Class1_Sub29) Static416.aClass254_44.method5437();
		if (local20 != null) {
			local11 = local20.method3481();
			local15 = local20.method3484();
		}
		Static443.method4785(0, Static92.anInt1618, local11, Static126.anInt2202, 0, local15, 0, Static169.anInt2522, 0);
		if (Static289.aClass250_6 != null) {
			Static418.method5209(local15, local11);
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(III)Lclient!lh;")
	public static Class20_Sub1 method2589(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class82 local7 = Static159.aClass82ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass20_Sub1_3;
	}
}
