import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static327 {

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "Lclient!ak;")
	public static final Class7 aClass7_126 = new Class7("Starting 3D Library", "Starte 3D-Softwarebibliothek.", "Démarrage de la librairie 3D", "Iniciando biblioteca 3D");

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIII[Lclient!uq;Z)V")
	public static void method4647(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class251[] arg3, @OriginalArg(5) boolean arg4) {
		for (@Pc(1) int local1 = 0; local1 < arg3.length; local1++) {
			@Pc(6) Class251 local6 = arg3[local1];
			if (local6 != null && arg2 == local6.anInt6722) {
				Static149.method5326(local6, arg0, arg1, arg4);
				Static326.method570(arg0, local6, arg1);
				if (local6.anInt6662 - local6.anInt6687 < local6.anInt6678) {
					local6.anInt6678 = local6.anInt6662 - local6.anInt6687;
				}
				if (local6.anInt6678 < 0) {
					local6.anInt6678 = 0;
				}
				if (local6.anInt6741 > local6.anInt6727 - local6.anInt6677) {
					local6.anInt6741 = local6.anInt6727 - local6.anInt6677;
				}
				if (local6.anInt6741 < 0) {
					local6.anInt6741 = 0;
				}
				if (local6.anInt6654 == 0) {
					Static157.method3072(arg4, local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILclient!hp;)Lclient!vr;")
	public static Class85_Sub2 method4648(@OriginalArg(1) Class1_Sub5 arg0) {
		return new Class85_Sub2(arg0.method5380(), arg0.method5380(), arg0.method5380(), arg0.method5380(), arg0.method5399(), arg0.method5399(), arg0.method5366());
	}
}
