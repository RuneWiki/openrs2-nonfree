import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static355 {

	@OriginalMember(owner = "client!v", name = "q", descriptor = "Lclient!pi;")
	public static Class190 aClass190_1;

	@OriginalMember(owner = "client!v", name = "e", descriptor = "[I")
	public static final int[] anIntArray1252 = new int[3];

	@OriginalMember(owner = "client!v", name = "k", descriptor = "Lclient!rc;")
	public static final Class205 aClass205_131 = new Class205(86, -1);

	@OriginalMember(owner = "client!v", name = "l", descriptor = "Lclient!ch;")
	public static final Class32 aClass32_94 = new Class32("Loading textures - ", "Lade Texturen - ", "Chargement des textures - ", "Carregando texturas - ");

	@OriginalMember(owner = "client!v", name = "n", descriptor = "[B")
	public static final byte[] aByteArray111 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@OriginalMember(owner = "client!v", name = "c", descriptor = "(I)I")
	public static int method5206() {
		@Pc(15) Class63 local15 = Static111.aClass63_3;
		@Pc(17) boolean local17 = false;
		if (Static62.anInt1261 != 0) {
			@Pc(23) Canvas local23 = new Canvas();
			local23.setSize(100, 100);
			local17 = true;
			local15 = Static358.method1965(local23, null, 0, null, 0);
		}
		@Pc(40) long local40 = Static39.method699();
		for (@Pc(42) int local42 = 0; local42 < 10000; local42++) {
			local15.method2040();
		}
		@Pc(67) int local67 = (int) (Static39.method699() - local40);
		local15.method1951(0, 100, 100, -16777216, 0);
		if (local17) {
			local15.method2050();
		}
		return local67;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(II)V")
	public static void method5209(@OriginalArg(1) int arg0) {
		Static280.anInt4835 = -1;
		Static24.anInt533 = -1;
		Static82.anInt1484 = arg0;
		Static52.method874();
	}
}
