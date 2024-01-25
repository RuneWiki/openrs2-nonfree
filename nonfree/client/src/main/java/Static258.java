import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static258 {

	@OriginalMember(owner = "client!n", name = "e", descriptor = "Lclient!ci;")
	public static Class38 aClass38_38;

	@OriginalMember(owner = "client!n", name = "d", descriptor = "Lclient!qv;")
	public static final Class214 aClass214_132 = new Class214(15, 2);

	@OriginalMember(owner = "client!n", name = "h", descriptor = "Lclient!bd;")
	public static final Class21 aClass21_45 = new Class21("Connecting to update server", "Verbindung mit Update-Server...", "Connexion au serveur de mise à jour en cours", "Conectando ao servidor de atualização");

	@OriginalMember(owner = "client!n", name = "i", descriptor = "Lclient!cm;")
	public static Applet_Sub1 anApplet_Sub1_4 = null;

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(II)Z")
	public static boolean method3303(@OriginalArg(0) int arg0) {
		if (arg0 == 4 || arg0 == 19 || arg0 == 16 || arg0 == 44 || arg0 == 10) {
			return true;
		} else {
			return arg0 == 12 || arg0 == 1001;
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Lclient!ul;IIILclient!l;Ljava/awt/Canvas;)Lclient!qa;")
	public static Class30 method3304(@OriginalArg(0) Class255 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Interface4 arg3, @OriginalArg(5) Canvas arg4) {
		return new Class30_Sub1(arg2, arg4, arg3, arg1, arg0);
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(B)Lclient!au;")
	public static Class4_Sub4 method3305() {
		if (Static425.aClass91_24 == null || Static176.aClass222_1 == null) {
			return null;
		}
		Static176.aClass222_1.method5127(Static425.aClass91_24);
		@Pc(18) Class4_Sub4 local18 = (Class4_Sub4) Static176.aClass222_1.method5130();
		if (local18 == null) {
			return null;
		} else {
			@Pc(33) Class217 local33 = Static425.aClass116_3.method3300(local18.anInt366);
			return local33 != null && local33.aBoolean461 && local33.method5087(Static425.anInterface2_2) ? local18 : Static62.method1454();
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIIIIZII)Z")
	public static boolean method3306(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(13) int local13 = Static52.aClass11_Sub5_Sub2_Sub1_2.anIntArray523[0];
		@Pc(18) int local18 = Static52.aClass11_Sub5_Sub2_Sub1_2.anIntArray524[0];
		if (local13 < 0 || local13 >= Static193.anInt3853 || local18 < 0 || Static301.anInt5585 <= local18) {
			return false;
		} else if (arg4 >= 0 && arg4 < Static193.anInt3853 && arg2 >= 0 && Static301.anInt5585 > arg2) {
			@Pc(81) int local81 = Static381.method5403(arg7, arg1, Static52.aClass11_Sub5_Sub2_Sub1_2.method5302(), arg3, Static221.anIntArray353, arg5, local18, arg6, arg4, Static174.anIntArray281, local13, arg0, Static335.aClass253Array1[Static52.aClass11_Sub5_Sub2_Sub1_2.aByte100], arg2);
			if (local81 < 1) {
				return false;
			}
			Static38.anInt906 = Static221.anIntArray353[local81 - 1];
			Static184.anInt3729 = Static174.anIntArray281[local81 - 1];
			Static381.aBoolean486 = false;
			Static47.method1043();
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IILclient!sv;)Lclient!pr;")
	public static Class199 method3309(@OriginalArg(1) int arg0, @OriginalArg(2) Class11_Sub5 arg1) {
		@Pc(14) Class199 local14;
		if (Static455.aClass199_3 == null) {
			local14 = new Class199();
		} else {
			local14 = Static455.aClass199_3;
			Static455.aClass199_3 = Static455.aClass199_3.aClass199_2;
			Static170.anInt3346--;
			local14.aClass199_2 = null;
		}
		local14.aClass11_Sub5_1 = arg1;
		local14.anInt5745 = arg0;
		return local14;
	}
}
