import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static332 {

	@OriginalMember(owner = "client!qr", name = "J", descriptor = "Lclient!vj;")
	public static Class249 aClass249_1;

	@OriginalMember(owner = "client!qr", name = "z", descriptor = "I")
	public static int anInt6029 = -1;

	@OriginalMember(owner = "client!qr", name = "B", descriptor = "[[I")
	public static final int[][] anIntArrayArray49 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!qr", name = "G", descriptor = "Lclient!oi;")
	public static final Class175 aClass175_197 = new Class175(" is already on your ignore list.", " steht bereits auf deiner Ignorieren-Liste!", " est déjà dans votre liste noire.", " já está na sua lista de ignorados.");

	@OriginalMember(owner = "client!qr", name = "I", descriptor = "Lclient!hb;")
	public static final Class92 aClass92_201 = new Class92(62, 4);

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(CZI)I")
	public static int method4805(@OriginalArg(0) char arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg0 << 4;
		if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
			arg0 = Character.toLowerCase(arg0);
			local7 = (arg0 << 4) + 1;
		}
		if (arg0 == 'ñ' && arg1 == 0) {
			local7 = 1762;
		}
		return local7;
	}
}
