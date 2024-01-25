import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static397 {

	@OriginalMember(owner = "client!tn", name = "g", descriptor = "[Lclient!ya;")
	public static Class139[] aClass139Array2;

	@OriginalMember(owner = "client!tn", name = "i", descriptor = "Z")
	public static boolean aBoolean556;

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "Lclient!kn;")
	public static final Class142 aClass142_99 = new Class142("Starting 3D Library", "Starte 3D-Softwarebibliothek.", "Démarrage de la librairie 3D", "Iniciando biblioteca 3D");

	@OriginalMember(owner = "client!tn", name = "j", descriptor = "Z")
	public static boolean aBoolean557 = false;

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(Ljava/net/Socket;II)Lclient!hp;")
	public static Class110 method5141(@OriginalArg(0) Socket arg0) throws IOException {
		return new Class110_Sub1(arg0, 5000);
	}

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "(I)Z")
	public static boolean method5142() {
		if (Static379.aBoolean16) {
			try {
				if ((Boolean) Static466.method42("showingVideoAd", Static259.aClass177_2.anApplet1)) {
					return false;
				}
				return true;
			} catch (@Pc(23) Throwable local23) {
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(BLclient!hj;)V")
	public static void method5143(@OriginalArg(1) Class1_Sub20 arg0) {
		if (Static259.aClass216ArrayArrayArray3 == null) {
			return;
		}
		@Pc(12) Interface7 local12 = null;
		if (arg0.anInt2537 == 0) {
			local12 = (Interface7) Static464.method5366(arg0.anInt2542, arg0.anInt2536, arg0.anInt2539);
		}
		if (arg0.anInt2537 == 1) {
			local12 = (Interface7) Static282.method3773(arg0.anInt2542, arg0.anInt2536, arg0.anInt2539);
		}
		if (arg0.anInt2537 == 2) {
			local12 = (Interface7) Static423.method5398(arg0.anInt2542, arg0.anInt2536, arg0.anInt2539, nc.class);
		}
		if (arg0.anInt2537 == 3) {
			local12 = (Interface7) Static168.method2856(arg0.anInt2542, arg0.anInt2536, arg0.anInt2539);
		}
		if (local12 == null) {
			arg0.anInt2535 = 0;
			arg0.anInt2540 = 0;
			arg0.anInt2534 = -1;
		} else {
			arg0.anInt2534 = local12.method4895();
			arg0.anInt2535 = local12.method4897();
			arg0.anInt2540 = local12.method4899();
		}
	}
}
