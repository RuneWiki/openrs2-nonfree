import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static286 {

	@OriginalMember(owner = "client!od", name = "x", descriptor = "I")
	public static int anInt5018;

	@OriginalMember(owner = "client!od", name = "s", descriptor = "Lclient!os;")
	public static final Class182 aClass182_179 = new Class182("Loading interface scripts - ", "Lade Interface-Skripte - ", "Chargement des interfaces - ", "Carregando interfaces - ");

	@OriginalMember(owner = "client!od", name = "w", descriptor = "Lclient!ln;")
	public static final Class10_Sub27 aClass10_Sub27_1 = new Class10_Sub27(0, 0);

	@OriginalMember(owner = "client!od", name = "y", descriptor = "I")
	public static int anInt5019 = 0;

	@OriginalMember(owner = "client!od", name = "z", descriptor = "I")
	public static int anInt5020 = -1;

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IBI)Z")
	public static boolean method4049(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0;
	}
}
