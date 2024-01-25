import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!eka", name = "tb", descriptor = "Lclient!bt;")
	public static Class34 aClass34_29;

	@OriginalMember(owner = "client!eka", name = "S", descriptor = "I")
	public static int anInt2477 = 0;

	@OriginalMember(owner = "client!eka", name = "ob", descriptor = "Lclient!lf;")
	public static final Class210 aClass210_6 = new Class210(6, 1);

	@OriginalMember(owner = "client!eka", name = "qb", descriptor = "Lclient!lja;")
	public static final Class216 aClass216_48 = new Class216(18, 8);

	@OriginalMember(owner = "client!eka", name = "sb", descriptor = "I")
	public static int anInt2496 = 0;

	@OriginalMember(owner = "client!eka", name = "c", descriptor = "(III)Lclient!ab;")
	public static Class3_Sub1_Sub1 method2406(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class73 local7 = Static267.aClass73ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class3_Sub1_Sub1 local14 = local7.aClass3_Sub1_Sub1_1;
			local7.aClass3_Sub1_Sub1_1 = null;
			Static499.method6774(local14);
			return local14;
		}
	}
}
