import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!bh", name = "h", descriptor = "Ljava/awt/datatransfer/Clipboard;")
	public static Clipboard aClipboard1;

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "Z")
	public static final boolean aBoolean12 = false;

	@OriginalMember(owner = "client!bh", name = "e", descriptor = "Lclient!dk;")
	public static final Class57 aClass57_13 = new Class57("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.");

	@OriginalMember(owner = "client!bh", name = "i", descriptor = "I")
	public static int anInt360 = 1;

	@OriginalMember(owner = "client!bh", name = "j", descriptor = "Lclient!ba;")
	public static final Class21 aClass21_2 = new Class21(16);

	@OriginalMember(owner = "client!bh", name = "m", descriptor = "[I")
	public static final int[] anIntArray40 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "([Lclient!dt;BI)V")
	public static void method331(@OriginalArg(0) Class62[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			@Pc(9) Class62 local9 = arg0[local3];
			if (local9 != null && arg1 == local9.anInt1506 && !Static48.method918(local9)) {
				if (local9.anInt1575 == 0) {
					method331(arg0, local9.anInt1500);
					if (local9.aClass62Array1 != null) {
						method331(local9.aClass62Array1, local9.anInt1500);
					}
					@Pc(46) Class3_Sub22 local46 = (Class3_Sub22) Static29.aClass44_26.method942((long) local9.anInt1500);
					if (local46 != null) {
						Static269.method4264(local46.anInt3029);
					}
				}
				if (local9.anInt1575 == 6 && local9.anInt1520 != -1) {
					@Pc(67) Class177 local67 = Static176.aClass43_2.method930(local9.anInt1520);
					if (local67 != null) {
						local9.anInt1535 += Static38.anInt702;
						while (local67.anIntArray501[local9.anInt1547] < local9.anInt1535) {
							local9.anInt1535 -= local67.anIntArray501[local9.anInt1547];
							local9.anInt1547++;
							if (local9.anInt1547 >= local67.anIntArray499.length) {
								local9.anInt1547 -= local67.anInt4497;
								if (local9.anInt1547 < 0 || local9.anInt1547 >= local67.anIntArray499.length) {
									local9.anInt1547 = 0;
								}
							}
							local9.anInt1566 = local9.anInt1547 + 1;
							if (local9.anInt1566 >= local67.anIntArray499.length) {
								local9.anInt1566 -= local67.anInt4497;
								if (local9.anInt1566 < 0 || local9.anInt1566 >= local67.anIntArray499.length) {
									local9.anInt1566 = -1;
								}
							}
							Static158.method2441(local9);
						}
					}
				}
			}
		}
	}
}
