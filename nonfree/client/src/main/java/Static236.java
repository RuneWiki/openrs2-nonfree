import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static236 {

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "Lclient!lo;")
	public static final Class158 aClass158_123 = new Class158("Connected to update server", "Verbindung zum Update-Server hergestellt.", "Connecté au serveur de mise à jour", "Conectado ao servidor de atualização");

	@OriginalMember(owner = "client!lo", name = "g", descriptor = "[I")
	public static final int[] anIntArray439 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!lo", name = "i", descriptor = "I")
	public static int anInt4675 = 0;

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lclient!sd;B)V")
	public static void method3590(@OriginalArg(0) Class226 arg0) {
		Static68.aClass226_1 = arg0;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(B)V")
	public static void method3591() {
		Static254.anIntArray468 = Static32.method674(0.4F);
	}

	@OriginalMember(owner = "client!lo", name = "b", descriptor = "(I)I")
	public static int method3593() {
		@Pc(10) Class106 local10 = Static30.aClass106_3;
		@Pc(12) boolean local12 = false;
		if (Static262.anInt2805 != 0) {
			@Pc(21) Canvas local21 = new Canvas();
			local21.setSize(100, 100);
			local12 = true;
			local10 = Static461.method5919(local21, null, 0, null, 0);
		}
		@Pc(38) long local38 = Static250.method3737();
		for (@Pc(40) int local40 = 0; local40 < 10000; local40++) {
			local10.method5914();
		}
		@Pc(65) int local65 = (int) (Static250.method3737() - local38);
		local10.method5941(0, 100, 0, 100, -16777216);
		if (local12) {
			local10.method5966();
		}
		return local65;
	}
}
