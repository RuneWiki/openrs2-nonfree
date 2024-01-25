import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static586 {

	@OriginalMember(owner = "client!tw", name = "i", descriptor = "Lclient!rv;")
	public static Class312 aClass312_1;

	@OriginalMember(owner = "client!tw", name = "o", descriptor = "[I")
	public static final int[] anIntArray648 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(IIIIIII)V")
	public static void method8116(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 != 8 && arg0 != 16) {
			@Pc(30) Class351 local30 = Static441.aClass351ArrayArrayArray1[arg3][arg1][arg4];
			if (local30 == null) {
				local30 = new Class351(arg3);
			}
			if (arg0 == 1) {
				local30.aShort115 = (short) arg5;
				local30.aShort117 = (short) arg2;
			} else if (arg0 == 2) {
				local30.aShort116 = (short) arg5;
				local30.aShort114 = (short) arg2;
			}
			if (Static383.aBoolean424) {
				Static37.method876();
				return;
			}
			return;
		}
		@Pc(77) int local77;
		@Pc(82) int local82;
		@Pc(86) int local86;
		@Pc(90) int local90;
		@Pc(100) int local100;
		@Pc(110) int local110;
		if (arg0 != 8) {
			local77 = Static655.anInt10510 + (arg1 << Static185.anInt3178);
			local82 = local77 - Static655.anInt10510;
			local86 = arg4 << Static185.anInt3178;
			local90 = Static655.anInt10510 + local86;
			local100 = Static64.aClass12Array1[arg3].method7846(arg1 + 1, arg4);
			local110 = Static64.aClass12Array1[arg3].method7846(arg1, arg4 + 1);
			Static414.aClass379Array2[Static242.anInt4294++] = new Class379(arg0, arg3, local77, local82, local82, local77, local100, local110, local110 - arg5, local100 - arg5, local86, local90, local90, local86);
			return;
		}
		local77 = arg1 << Static185.anInt3178;
		local82 = local77 + Static655.anInt10510;
		local86 = arg4 << Static185.anInt3178;
		local90 = Static655.anInt10510 + local86;
		local100 = Static64.aClass12Array1[arg3].method7846(arg1, arg4);
		local110 = Static64.aClass12Array1[arg3].method7846(arg1 + 1, arg4 - -1);
		Static414.aClass379Array2[Static242.anInt4294++] = new Class379(arg0, arg3, local77, local82, local82, local77, local100, local110, local110 - arg5, -arg5 + local100, local86, local90, local90, local86);
	}

	@OriginalMember(owner = "client!tw", name = "e", descriptor = "(II)V")
	public static void method8117(@OriginalArg(1) int arg0) {
		Static490.anInt8337 = arg0;
		Static360.anInt9757 = -1;
		Static360.anInt9757 = -1;
		Static524.method7853();
	}
}
