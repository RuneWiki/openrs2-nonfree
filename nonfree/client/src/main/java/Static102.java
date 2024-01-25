import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!dba", name = "F", descriptor = "Lclient!gba;")
	public static Class126 aClass126_1;

	@OriginalMember(owner = "client!dba", name = "z", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_27 = new Class186(129, 6);

	@OriginalMember(owner = "client!dba", name = "w", descriptor = "Lclient!pda;")
	public static final Class283 aClass283_3 = new Class283();

	@OriginalMember(owner = "client!dba", name = "v", descriptor = "Lclient!tj;")
	public static final Class357 aClass357_6 = new Class357();

	@OriginalMember(owner = "client!dba", name = "E", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_28 = new Class186(138, 4);

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(IIIIII)V")
	public static void method1354(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (Static356.anInt6028 < arg3 || Static280.anInt5114 > arg2) {
			return;
		}
		@Pc(29) boolean local29;
		if (arg0 < Static85.anInt1313) {
			arg0 = Static85.anInt1313;
			local29 = false;
		} else if (Static316.anInt6313 >= arg0) {
			local29 = true;
		} else {
			local29 = false;
			arg0 = Static316.anInt6313;
		}
		@Pc(46) boolean local46;
		if (arg4 < Static85.anInt1313) {
			local46 = false;
			arg4 = Static85.anInt1313;
		} else if (Static316.anInt6313 >= arg4) {
			local46 = true;
		} else {
			arg4 = Static316.anInt6313;
			local46 = false;
		}
		if (arg3 >= Static280.anInt5114) {
			Static482.method7040(arg1, arg0, Static384.anIntArrayArray38[arg3++], arg4);
		} else {
			arg3 = Static280.anInt5114;
		}
		if (arg2 <= Static356.anInt6028) {
			Static482.method7040(arg1, arg0, Static384.anIntArrayArray38[arg2--], arg4);
		} else {
			arg2 = Static356.anInt6028;
		}
		@Pc(115) int local115;
		if (local29 && local46) {
			for (local115 = arg3; local115 <= arg2; local115++) {
				@Pc(169) int[] local169 = Static384.anIntArrayArray38[local115];
				local169[arg0] = local169[arg4] = arg1;
			}
		} else if (local29) {
			for (local115 = arg3; local115 <= arg2; local115++) {
				Static384.anIntArrayArray38[local115][arg0] = arg1;
			}
		} else if (local46) {
			for (local115 = arg3; local115 <= arg2; local115++) {
				Static384.anIntArrayArray38[local115][arg4] = arg1;
			}
		}
	}
}
