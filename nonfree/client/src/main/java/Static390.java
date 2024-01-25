import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static390 {

	@OriginalMember(owner = "client!tg", name = "j", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray12;

	@OriginalMember(owner = "client!tg", name = "c", descriptor = "I")
	public static int anInt6539 = 0;

	@OriginalMember(owner = "client!tg", name = "g", descriptor = "Lclient!la;")
	public static final Class136 aClass136_178 = new Class136(7, -1);

	@OriginalMember(owner = "client!tg", name = "l", descriptor = "Lclient!co;")
	public static final Class35 aClass35_7 = new Class35("WTWIP", 3);

	@OriginalMember(owner = "client!tg", name = "m", descriptor = "I")
	public static int anInt6546 = 0;

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(CB)Z")
	public static boolean method5419(@OriginalArg(0) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IZI)Lclient!kg;")
	public static Class128 method5421(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class128 local7 = new Class128();
		local7.anInt3692 = -1;
		local7.anInt3705 = arg0 + 5 + 1;
		local7.anInt3693 = arg1 + 1 + 5;
		local7.anInt3691 = -1;
		local7.anIntArrayArray27 = new int[local7.anInt3693][local7.anInt3705];
		local7.method3177();
		return local7;
	}
}
