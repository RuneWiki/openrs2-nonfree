import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!jk", name = "s", descriptor = "I")
	public static int anInt4925;

	@OriginalMember(owner = "client!jk", name = "t", descriptor = "I")
	public static int anInt4926;

	@OriginalMember(owner = "client!jk", name = "r", descriptor = "Lclient!jg;")
	public static final Class128 aClass128_8 = new Class128();

	@OriginalMember(owner = "client!jk", name = "u", descriptor = "Lclient!sk;")
	public static final Class231 aClass231_87 = new Class231("Loaded interface scripts", "Interface-Skripte geladen", "Interfaces chargées", "Interfaces carregadas");

	@OriginalMember(owner = "client!jk", name = "v", descriptor = "Z")
	public static boolean aBoolean348 = false;

	@OriginalMember(owner = "client!jk", name = "h", descriptor = "(I)Lclient!hn;")
	public static Class48_Sub4 method4355() {
		@Pc(8) Class48_Sub4 local8 = (Class48_Sub4) aClass128_8.method2830();
		if (local8 == null) {
			return new Class48_Sub4();
		} else {
			Static107.anInt1926--;
			return local8;
		}
	}
}
