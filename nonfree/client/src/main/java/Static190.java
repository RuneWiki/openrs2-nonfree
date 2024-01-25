import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static190 {

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "Lclient!ch;")
	public static final Class32 aClass32_48 = new Class32("Choose Option", "Wähl eine Option", "Choisir une option", "Selecionar opção");

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "[I")
	public static final int[] anIntArray702 = new int[32];

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "I")
	public static int anInt3567 = 0;

	@OriginalMember(owner = "client!lb", name = "f", descriptor = "Lclient!rc;")
	public static final Class205 aClass205_77 = new Class205(67, 0);

	@OriginalMember(owner = "client!lb", name = "g", descriptor = "Lclient!rc;")
	public static final Class205 aClass205_78 = new Class205(14, 3);

	@OriginalMember(owner = "client!lb", name = "h", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray89 = new String[] { "en", "de", "fr", "pt", "nl" };

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)I")
	public static int method3249(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}
}
