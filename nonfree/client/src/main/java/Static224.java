import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static224 {

	@OriginalMember(owner = "client!li", name = "a", descriptor = "I")
	public static int anInt4457;

	@OriginalMember(owner = "client!li", name = "i", descriptor = "[[I")
	public static int[][] anIntArrayArray30;

	@OriginalMember(owner = "client!li", name = "e", descriptor = "Lclient!qv;")
	public static final Class214 aClass214_141 = new Class214(80, -1);

	@OriginalMember(owner = "client!li", name = "h", descriptor = "Lclient!wp;")
	public static final Class273 aClass273_1 = new Class273();

	@OriginalMember(owner = "client!li", name = "j", descriptor = "I")
	public static int anInt4461 = 0;

	@OriginalMember(owner = "client!li", name = "k", descriptor = "Lclient!qt;")
	public static final Class212 aClass212_61 = new Class212(37, 4);

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(III)V")
	public static void method3826(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = Static296.aClass84_10.method2381(Static311.aClass21_95.method362(Static168.anInt3290));
		@Pc(24) int local24;
		for (@Pc(18) Class4_Sub14 local18 = (Class4_Sub14) Static289.aClass91_31.method2584(); local18 != null; local18 = (Class4_Sub14) Static289.aClass91_31.method2586()) {
			local24 = Static85.method1761(local18);
			if (local13 < local24) {
				local13 = local24;
			}
		}
		local13 += 8;
		local24 = Static352.anInt6233 * 16 + 21;
		@Pc(54) int local54 = arg1 - local13 / 2;
		if (Static374.anInt6595 < local13 + local54) {
			local54 = Static374.anInt6595 - local13;
		}
		if (local54 < 0) {
			local54 = 0;
		}
		@Pc(77) int local77 = arg0;
		if (Static30.anInt518 < arg0 + local24) {
			local77 = Static30.anInt518 - local24;
		}
		if (local77 < 0) {
			local77 = 0;
		}
		Static22.anInt426 = local54;
		Static153.anInt3164 = (Static314.aBoolean588 ? 26 : 22) + Static352.anInt6233 * 16;
		Static223.anInt4455 = local77;
		Static87.aBoolean142 = true;
		Static177.anInt3637 = local13;
	}

	@OriginalMember(owner = "client!li", name = "b", descriptor = "(III)Lclient!og;")
	public static Class11_Sub4 method3829(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class162 local7 = Static294.aClass162ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class11_Sub4 local14 = local7.aClass11_Sub4_1;
			local7.aClass11_Sub4_1 = null;
			return local14;
		}
	}
}
