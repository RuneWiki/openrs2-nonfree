import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!bk", name = "w", descriptor = "Lclient!nl;")
	public static Class171 aClass171_10;

	@OriginalMember(owner = "client!bk", name = "z", descriptor = "Lclient!jm;")
	public static Class2_Sub19 aClass2_Sub19_1;

	@OriginalMember(owner = "client!bk", name = "t", descriptor = "Lclient!ch;")
	public static final Class32 aClass32_10 = new Class32("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.", "Conexão perdida.");

	@OriginalMember(owner = "client!bk", name = "v", descriptor = "[I")
	public static final int[] anIntArray129 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@OriginalMember(owner = "client!bk", name = "x", descriptor = "I")
	public static int anInt617 = 2;

	@OriginalMember(owner = "client!bk", name = "y", descriptor = "[I")
	public static final int[] anIntArray130 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!bk", name = "B", descriptor = "Lclient!ch;")
	public static final Class32 aClass32_11 = new Class32("Loaded world list data", "Liste der Welten geladen", "Liste des serveurs chargée", "Dados da lista de mundos carregados");

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIBI)V")
	public static void method507(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Static86.anInt1651; local3++) {
			@Pc(9) Rectangle local9 = Class148.aRectangleArray2[local3];
			if (local9.x + local9.width > arg2 && arg2 + arg1 > local9.x && arg3 < local9.y + local9.height && arg0 + arg3 > local9.y) {
				Static331.aBooleanArray30[local3] = true;
			}
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IZI)V")
	public static void method508(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class2_Sub10_Sub2 local14 = Static217.method3611(arg0, 5);
		local14.method864();
		local14.anInt1037 = arg1;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(BC)Z")
	public static boolean method509(@OriginalArg(1) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(34) char[] local34 = Static187.aCharArray1;
			for (@Pc(36) int local36 = 0; local36 < local34.length; local36++) {
				@Pc(42) char local42 = local34[local36];
				if (arg0 == local42) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(ID)V")
	public static void method510(@OriginalArg(1) double arg0) {
		if (arg0 == Static217.aDouble9) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 256; local11++) {
			@Pc(23) int local23 = (int) (Math.pow((double) local11 / 255.0D, arg0) * 255.0D);
			Static52.anIntArray215[local11] = local23 <= 255 ? local23 : 255;
		}
		Static217.aDouble9 = arg0;
	}
}
