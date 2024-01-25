import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "I")
	public static int anInt484;

	@OriginalMember(owner = "client!bk", name = "c", descriptor = "Lclient!bd;")
	public static final Class21 aClass21_3 = new Class21("Loading sprites - ", "Lade Sprites - ", "Chargement des sprites - ", "Carregando sprites - ");

	@OriginalMember(owner = "client!bk", name = "e", descriptor = "Lclient!ge;")
	public static final Class83 aClass83_7 = new Class83(8);

	@OriginalMember(owner = "client!bk", name = "f", descriptor = "Lclient!qt;")
	public static final Class212 aClass212_7 = new Class212(19, 8);

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIII)V")
	public static void method410(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 >= Static176.anInt3462 && arg1 <= Static418.anInt3023) {
			@Pc(19) int local19 = Static22.method360(Static55.anInt1319, Static162.anInt1715, arg3);
			@Pc(25) int local25 = Static22.method360(Static55.anInt1319, Static162.anInt1715, arg2);
			Static199.method176(arg0, local19, arg1, local25);
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IZI)Z")
	public static boolean method412(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0;
	}
}
