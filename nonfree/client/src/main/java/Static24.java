import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static24 {

	@OriginalMember(owner = "client!bg", name = "e", descriptor = "I")
	public static int anInt5066;

	@OriginalMember(owner = "client!bg", name = "f", descriptor = "I")
	public static int anInt5067;

	@OriginalMember(owner = "client!bg", name = "H", descriptor = "I")
	public static int anInt5083;

	@OriginalMember(owner = "client!bg", name = "n", descriptor = "J")
	public static long aLong139 = 0L;

	@OriginalMember(owner = "client!bg", name = "r", descriptor = "Lclient!di;")
	public static final Class54 aClass54_73 = new Class54(81, 3);

	@OriginalMember(owner = "client!bg", name = "D", descriptor = "Lclient!qp;")
	public static final Class209 aClass209_114 = new Class209("Loading core fonts - ", "Lade Schriftarten - ", "Chargement des polices - ", "Carregando fontes principais - ");

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IZI)B")
	public static byte method4073(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Ljava/lang/String;Z)Z")
	public static boolean method4076(@OriginalArg(0) String arg0) {
		return Static440.method5702(arg0);
	}
}
