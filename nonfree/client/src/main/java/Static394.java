import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static394 {

	@OriginalMember(owner = "client!u", name = "c", descriptor = "Z")
	public static boolean aBoolean454;

	@OriginalMember(owner = "client!u", name = "e", descriptor = "I")
	public static int anInt6802;

	@OriginalMember(owner = "client!u", name = "f", descriptor = "Lclient!wk;")
	public static Class264 aClass264_42;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "Lclient!ui;")
	public static final Class242 aClass242_98 = new Class242("Loading defaults - ", "Lade Standardeinstellungen - ", "Chargement des paramètres par défaut - ", "Carregando padrões - ");

	@OriginalMember(owner = "client!u", name = "d", descriptor = "I")
	public static int anInt6801 = 0;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IIII)I")
	public static int method5278(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == arg1) {
			return arg0;
		}
		@Pc(12) int local12 = 128 - arg2;
		@Pc(31) int local31 = local12 * (arg0 & 0x7F) + (arg1 & 0x7F) * arg2 >> 7;
		@Pc(45) int local45 = (arg1 & 0x380) * arg2 + local12 * (arg0 & 0x380) >> 7;
		@Pc(59) int local59 = (arg0 & 0xFC00) * local12 + arg2 * (arg1 & 0xFC00) >> 7;
		return local59 & 0xFC00 | local45 & 0x380 | local31 & 0x7F;
	}
}
