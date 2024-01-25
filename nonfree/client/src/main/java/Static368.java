import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static368 {

	@OriginalMember(owner = "client!sl", name = "z", descriptor = "F")
	public static float aFloat88;

	@OriginalMember(owner = "client!sl", name = "L", descriptor = "F")
	public static float aFloat89;

	@OriginalMember(owner = "client!sl", name = "P", descriptor = "Lclient!gi;")
	public static Class94 aClass94_1;

	@OriginalMember(owner = "client!sl", name = "s", descriptor = "Lclient!lt;")
	public static final Class151 aClass151_192 = new Class151("Loading world list data", "Lade Liste der Welten", "Chargement de la liste des serveurs", "Carregando dados da lista de mundos");

	@OriginalMember(owner = "client!sl", name = "E", descriptor = "Lclient!ki;")
	public static final Class137 aClass137_234 = new Class137(29, 7);

	@OriginalMember(owner = "client!sl", name = "T", descriptor = "Lclient!ne;")
	public static final Class166 aClass166_7 = new Class166("WTWIP", 3);

	@OriginalMember(owner = "client!sl", name = "U", descriptor = "I")
	public static int anInt6250 = 0;

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(ILjava/util/Random;I)I")
	public static int method4796(@OriginalArg(1) Random arg0, @OriginalArg(2) int arg1) {
		if (arg1 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static298.method3895(arg1)) {
			return (int) (((long) arg0.nextInt() & 0xFFFFFFFFL) * (long) arg1 >> 32);
		} else {
			@Pc(37) int local37 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
			@Pc(48) int local48;
			do {
				local48 = arg0.nextInt();
			} while (local37 <= local48);
			return Static106.method1490(arg1, local48);
		}
	}
}
