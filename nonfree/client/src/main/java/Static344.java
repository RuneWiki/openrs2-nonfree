import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static344 {

	@OriginalMember(owner = "client!qr", name = "Y", descriptor = "I")
	public static int anInt5818;

	@OriginalMember(owner = "client!qr", name = "Q", descriptor = "Lclient!of;")
	public static final Class174 aClass174_171 = new Class174("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.", "Conexão perdida.");

	@OriginalMember(owner = "client!qr", name = "S", descriptor = "[I")
	public static final int[] anIntArray357 = new int[] { 4, 4, 1, 2, 6, 4, 2, 47, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

	@OriginalMember(owner = "client!qr", name = "X", descriptor = "Lclient!of;")
	public static final Class174 aClass174_172 = new Class174("Checking for updates - ", "Suche nach Updates - ", "Vérification des mises à jour - ", "Verificando atualizações - ");

	@OriginalMember(owner = "client!qr", name = "b", descriptor = "(IIIIIII)V")
	public static void method4826(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = arg4 + arg2;
		@Pc(15) int local15 = arg3 - arg2;
		for (@Pc(17) int local17 = arg4; local17 < local10; local17++) {
			Static201.method3084(Static296.anIntArrayArray42[local17], arg5, arg1, arg0);
		}
		@Pc(36) int local36 = arg1 - arg2;
		for (@Pc(42) int local42 = arg3; local42 > local15; local42--) {
			Static201.method3084(Static296.anIntArrayArray42[local42], arg5, arg1, arg0);
		}
		@Pc(60) int local60 = arg2 + arg5;
		for (@Pc(62) int local62 = local10; local62 <= local15; local62++) {
			@Pc(68) int[] local68 = Static296.anIntArrayArray42[local62];
			Static201.method3084(local68, arg5, local60, arg0);
			Static201.method3084(local68, local36, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(Lclient!ei;B)V")
	public static void method4827(@OriginalArg(0) Class3_Sub14 arg0) {
		if (Static389.aClass227ArrayArrayArray3 == null) {
			return;
		}
		@Pc(8) Interface5 local8 = null;
		if (arg0.anInt1619 == 0) {
			local8 = (Interface5) Static392.method5427(arg0.anInt1621, arg0.anInt1627, arg0.anInt1629);
		}
		if (arg0.anInt1619 == 1) {
			local8 = (Interface5) Static222.method4446(arg0.anInt1621, arg0.anInt1627, arg0.anInt1629);
		}
		if (arg0.anInt1619 == 2) {
			local8 = (Interface5) Static313.method4388(arg0.anInt1621, arg0.anInt1627, arg0.anInt1629, jt.class);
		}
		if (arg0.anInt1619 == 3) {
			local8 = (Interface5) Static112.method1824(arg0.anInt1621, arg0.anInt1627, arg0.anInt1629);
		}
		if (local8 == null) {
			arg0.anInt1622 = -1;
			arg0.anInt1624 = 0;
			arg0.anInt1618 = 0;
		} else {
			arg0.anInt1622 = local8.method6263();
			arg0.anInt1624 = local8.method6261();
			arg0.anInt1618 = local8.method6262();
		}
	}
}
