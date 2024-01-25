import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!al", name = "b", descriptor = "Lclient!qp;")
	public static final Class209 aClass209_8 = new Class209("Connecting to update server", "Verbindung mit Update-Server...", "Connexion au serveur de mise à jour en cours", "Conectando ao servidor de atualização");

	@OriginalMember(owner = "client!al", name = "f", descriptor = "I")
	public static int anInt258 = 0;

	@OriginalMember(owner = "client!al", name = "h", descriptor = "[I")
	public static final int[] anIntArray30 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(II)V")
	public static void method226(@OriginalArg(1) int arg0) {
		if (!Static12.aClass79_Sub1_1.aBoolean355) {
			arg0 = -1;
		}
		if (Static223.anInt4335 == arg0) {
			return;
		}
		if (arg0 != -1) {
			@Pc(29) Class244 local29 = Static254.aClass263_1.method5706(arg0);
			@Pc(33) Class85 local33 = local29.method5264();
			if (local33 == null) {
				arg0 = -1;
			} else {
				Static43.aClass59_5.method1356(local33.method2064(), local33.method2065(), new Point(local29.anInt6651, local29.anInt6650), Static339.aCanvas7, local33.method2067());
				Static223.anInt4335 = arg0;
			}
		}
		if (arg0 == -1 && Static223.anInt4335 != -1) {
			Static43.aClass59_5.method1356(null, -1, new Point(), Static339.aCanvas7, -1);
			Static223.anInt4335 = -1;
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IIZI)I")
	public static int method227(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(10) Class2_Sub38 local10 = Static448.method5748(arg1, arg2);
		if (local10 == null) {
			return 0;
		} else if (arg0 == -1) {
			return 0;
		} else {
			@Pc(22) int local22 = 0;
			for (@Pc(24) int local24 = 0; local24 < local10.anIntArray513.length; local24++) {
				if (arg0 == local10.anIntArray512[local24]) {
					local22 += local10.anIntArray513[local24];
				}
			}
			return local22;
		}
	}

	@OriginalMember(owner = "client!al", name = "b", descriptor = "(I)[Lclient!dn;")
	public static Class56[] method228() {
		return new Class56[] { Static23.aClass56_1, Static89.aClass56_3, Static202.aClass56_6, Static184.aClass56_5, Static123.aClass56_4, Static343.aClass56_7 };
	}
}
