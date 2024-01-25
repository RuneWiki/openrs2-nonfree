import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static296 {

	@OriginalMember(owner = "client!pg", name = "u", descriptor = "Lclient!pc;")
	public static Class188 aClass188_78;

	@OriginalMember(owner = "client!pg", name = "j", descriptor = "Lclient!vj;")
	public static final Class256 aClass256_109 = new Class256("Loading defaults - ", "Lade Standardeinstellungen - ", "Chargement des paramètres par défaut - ", "Carregando padrões - ");

	@OriginalMember(owner = "client!pg", name = "s", descriptor = "Z")
	public static boolean aBoolean462 = false;

	@OriginalMember(owner = "client!pg", name = "t", descriptor = "I")
	public static int anInt5334 = -1;

	@OriginalMember(owner = "client!pg", name = "v", descriptor = "I")
	public static int anInt5335 = 0;

	@OriginalMember(owner = "client!pg", name = "w", descriptor = "I")
	public static int anInt5336 = 0;

	@OriginalMember(owner = "client!pg", name = "x", descriptor = "Lclient!vj;")
	public static final Class256 aClass256_110 = new Class256("K", "T", "K", "K");

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(Z)V")
	public static void method4312() {
		@Pc(10) Class129 local10 = Static115.aClass129_58;
		synchronized (Static115.aClass129_58) {
			Static115.aClass129_58.method3026();
		}
		local10 = Static205.aClass129_33;
		synchronized (Static205.aClass129_33) {
			Static205.aClass129_33.method3026();
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method4314(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		Static448.method6059(Static317.aClass44_74);
		Static98.aClass2_Sub20_Sub1_1.method3699(Static209.method3225(arg1) + 1);
		Static98.aClass2_Sub20_Sub1_1.method3715(arg1);
		Static98.aClass2_Sub20_Sub1_1.method3728(arg0);
	}
}
