import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static274 {

	@OriginalMember(owner = "client!pp", name = "j", descriptor = "I")
	public static int anInt4765;

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "Lclient!dk;")
	public static final Class57 aClass57_75 = new Class57("Connected to update server", "Verbindung zum Update-Server hergestellt.", "Connecté au serveur de mise à jour", "Conectado ao servidor de atualização");

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(Ljava/lang/String;IIII)V")
	public static void method4277(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) Class62 local13 = Static80.method1338(arg3, arg2);
		if (local13 == null) {
			return;
		}
		if (local13.anObjectArray7 != null) {
			@Pc(23) Class3_Sub23 local23 = new Class3_Sub23();
			local23.aString30 = arg0;
			local23.anInt3039 = arg1;
			local23.aClass62_11 = local13;
			local23.anObjectArray31 = local13.anObjectArray7;
			Static124.method2006(local23);
		}
		@Pc(40) boolean local40 = true;
		if (local13.anInt1572 != 0) {
			local40 = Static312.method4801(local13);
		}
		if (!local40 || !Static48.method915(local13).method5602(arg1 - 1)) {
			return;
		}
		if (arg1 == 1) {
			Static229.method3783(Static373.aClass244_92);
			Static200.method3134(arg2, arg3, local13.anInt1549);
		}
		if (arg1 == 2) {
			Static229.method3783(Static319.aClass244_76);
			Static200.method3134(arg2, arg3, local13.anInt1549);
		}
		if (arg1 == 3) {
			Static229.method3783(Static337.aClass244_79);
			Static200.method3134(arg2, arg3, local13.anInt1549);
		}
		if (arg1 == 4) {
			Static229.method3783(Static109.aClass244_34);
			Static200.method3134(arg2, arg3, local13.anInt1549);
		}
		if (arg1 == 5) {
			Static229.method3783(Static25.aClass244_9);
			Static200.method3134(arg2, arg3, local13.anInt1549);
		}
		if (arg1 == 6) {
			Static229.method3783(Static109.aClass244_33);
			Static200.method3134(arg2, arg3, local13.anInt1549);
		}
		if (arg1 == 7) {
			Static229.method3783(Static287.aClass244_68);
			Static200.method3134(arg2, arg3, local13.anInt1549);
		}
		if (arg1 == 8) {
			Static229.method3783(Static19.aClass244_7);
			Static200.method3134(arg2, arg3, local13.anInt1549);
		}
		if (arg1 == 9) {
			Static229.method3783(Static33.aClass244_10);
			Static200.method3134(arg2, arg3, local13.anInt1549);
		}
		if (arg1 == 10) {
			Static229.method3783(Static271.aClass244_94);
			Static200.method3134(arg2, arg3, local13.anInt1549);
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(ILclient!hg;II)V")
	public static void method4282(@OriginalArg(0) int arg0, @OriginalArg(1) Class102 arg1, @OriginalArg(3) int arg2) {
		Static280.aClass102ArrayArray1[arg0][arg2] = arg1;
	}
}
