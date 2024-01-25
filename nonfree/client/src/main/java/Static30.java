import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!bk", name = "U", descriptor = "[Lclient!tr;")
	public static Class110[] aClass110Array1;

	@OriginalMember(owner = "client!bk", name = "Q", descriptor = "Z")
	public static boolean aBoolean22 = false;

	@OriginalMember(owner = "client!bk", name = "R", descriptor = "I")
	public static int anInt545 = 0;

	@OriginalMember(owner = "client!bk", name = "S", descriptor = "I")
	public static int anInt546 = -1;

	@OriginalMember(owner = "client!bk", name = "T", descriptor = "I")
	public static int anInt547 = 0;

	@OriginalMember(owner = "client!bk", name = "V", descriptor = "Lclient!us;")
	public static final Class234 aClass234_14 = new Class234(102, 8);

	@OriginalMember(owner = "client!bk", name = "c", descriptor = "(I)Z")
	public static boolean method470() {
		return Static105.anInt2076 > 0;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!nm;")
	public static Class28_Sub1 method472(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class48 local7 = Static69.aClass48ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(14) Class50 local14 = local7.aClass50_1; local14 != null; local14 = local14.aClass50_2) {
			@Pc(18) Class28_Sub1 local18 = local14.aClass28_Sub1_1;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort89 == arg1 && local18.aShort87 == arg2) {
				return local18;
			}
		}
		return null;
	}
}
