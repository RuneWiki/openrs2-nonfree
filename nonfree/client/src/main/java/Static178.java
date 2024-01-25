import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!lq", name = "o", descriptor = "I")
	public static int anInt3855 = 0;

	@OriginalMember(owner = "client!lq", name = "q", descriptor = "Lclient!cq;")
	public static final Class34 aClass34_112 = new Class34("Loaded textures", "Texturen geladen.", "Textures chargées", "Texturas carregadas");

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(IC)Z")
	public static boolean method3526(@OriginalArg(1) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "(B)V")
	public static void method3528() {
		for (@Pc(15) int local15 = 0; local15 < Static263.anInt5363; local15++) {
			@Pc(21) Class164 local21 = Static208.method3948(local15);
			if (local21 != null && local21.anInt4968 == 0) {
				Static91.anIntArray217[local15] = 0;
				Static30.anIntArray104[local15] = 0;
			}
		}
		Static192.aClass197_17 = new Class197(128);
	}
}
