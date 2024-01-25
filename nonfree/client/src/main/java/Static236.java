import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static236 {

	@OriginalMember(owner = "client!ln", name = "h", descriptor = "Lclient!oi;")
	public static final Class175 aClass175_151 = new Class175("Loading core fonts - ", "Lade Schriftarten - ", "Chargement des polices - ", "Carregando fontes principais - ");

	@OriginalMember(owner = "client!ln", name = "l", descriptor = "Lclient!jd;")
	public static final Class119 aClass119_13 = new Class119(11, 0, 1, 2);

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(III)I")
	public static int method3702(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static67.anIntArray131[arg0 & 0x3] : Static389.anIntArray485[arg0 & 0x3];
	}
}
