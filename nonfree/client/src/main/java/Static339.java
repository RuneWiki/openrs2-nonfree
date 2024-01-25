import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static339 {

	@OriginalMember(owner = "client!oba", name = "f", descriptor = "Lclient!nj;")
	public static final Class202 aClass202_186 = new Class202("Allocated memory", "Zugewiesener Speicher.", "Mémoire attribuée", "Memória alocada");

	@OriginalMember(owner = "client!oba", name = "i", descriptor = "Lclient!qu;")
	public static final Class243 aClass243_65 = new Class243(43, 8);

	@OriginalMember(owner = "client!oba", name = "j", descriptor = "Lclient!nj;")
	public static final Class202 aClass202_187 = new Class202(" from your friends list first.", " zuerst von deiner Freunde-Liste!", " de votre liste d'amis.", " da sua lista de amigos primeiro.");

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(IIZ)I")
	public static int method5350(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static191.anIntArray635[arg1 & 0x3] : Static473.anIntArray648[arg1 & 0x3];
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(B)V")
	public static void method5351() {
		@Pc(7) Class133 local7 = null;
		try {
			@Pc(13) Class20 local13 = Static531.aClass283_6.method7180("2", true);
			while (local13.anInt593 == 0) {
				Static379.method5233(1L);
			}
			if (local13.anInt593 == 1) {
				local7 = (Class133) local13.anObject2;
				@Pc(40) byte[] local40 = new byte[(int) local7.method3311()];
				@Pc(55) int local55;
				for (@Pc(42) int local42 = 0; local42 < local40.length; local42 += local55) {
					local55 = local7.method3309(local40.length - local42, local40, local42);
					if (local55 == -1) {
						throw new IOException("EOF");
					}
				}
				Static387.method6222(new Class2_Sub29(local40));
			}
		} catch (@Pc(79) Exception local79) {
		}
		try {
			if (local7 != null) {
				local7.method3306();
			}
		} catch (@Pc(86) Exception local86) {
		}
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(III)Z")
	public static boolean method5352(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static538.method7755(arg0, arg1) | (arg0 & 0x70000) != 0 || Static105.method1941(arg1, arg0);
	}
}
