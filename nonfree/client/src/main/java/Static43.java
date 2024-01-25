import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!bu", name = "l", descriptor = "F")
	public static float aFloat7;

	@OriginalMember(owner = "client!bu", name = "m", descriptor = "I")
	public static int anInt335;

	@OriginalMember(owner = "client!bu", name = "j", descriptor = "Lclient!pg;")
	public static final Class186 aClass186_11 = new Class186(21, 0);

	@OriginalMember(owner = "client!bu", name = "k", descriptor = "Lclient!br;")
	public static final Class27 aClass27_2 = new Class27();

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(IILclient!vj;)Lclient!np;")
	public static Class165 method274(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub2 arg1) {
		@Pc(7) Class165 local7;
		if (Static427.aClass165_3 == null) {
			local7 = new Class165();
		} else {
			local7 = Static427.aClass165_3;
			Static427.aClass165_3 = Static427.aClass165_3.aClass165_2;
			Static4.anInt163--;
			local7.aClass165_2 = null;
		}
		local7.anInt4788 = arg0;
		local7.aClass6_Sub2_2 = arg1;
		return local7;
	}
}
