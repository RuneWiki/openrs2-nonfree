import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static238 {

	@OriginalMember(owner = "client!jea", name = "fb", descriptor = "[I")
	public static int[] anIntArray272;

	@OriginalMember(owner = "client!jea", name = "Q", descriptor = "Lclient!gd;")
	public static final Class120 aClass120_5 = new Class120();

	@OriginalMember(owner = "client!jea", name = "gb", descriptor = "Lclient!is;")
	public static Class155 aClass155_6 = null;

	@OriginalMember(owner = "client!jea", name = "d", descriptor = "(B)V")
	public static void method3884() {
		@Pc(7) int local7 = Static57.anInt1513;
		@Pc(9) int[] local9 = Static447.anIntArray571;
		for (@Pc(11) int local11 = 0; local11 < local7; local11++) {
			@Pc(19) Class21_Sub1_Sub1_Sub1_Sub2 local19 = Static453.aClass21_Sub1_Sub1_Sub1_Sub2Array1[local9[local11]];
			if (local19 != null && local19.anInt4240 > 0) {
				local19.anInt4240--;
				if (local19.anInt4240 == 0) {
					local19.aString86 = null;
				}
			}
		}
		for (@Pc(45) int local45 = 0; local45 < Static137.anInt3042; local45++) {
			@Pc(52) long local52 = (long) Static24.anIntArray24[local45];
			@Pc(58) Class4_Sub29 local58 = (Class4_Sub29) Static144.aClass221_6.method5075(local52);
			if (local58 != null) {
				@Pc(63) Class21_Sub1_Sub1_Sub1_Sub1 local63 = local58.aClass21_Sub1_Sub1_Sub1_Sub1_1;
				if (local63.anInt4240 > 0) {
					local63.anInt4240--;
					if (local63.anInt4240 == 0) {
						local63.aString86 = null;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "([IIIII)V")
	public static void method3886(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		arg3--;
		@Pc(13) int local13 = arg1 - 1;
		@Pc(16) int local16 = local13 - 7;
		while (arg3 < local16) {
			@Pc(20) int local20 = arg3 + 1;
			arg0[local20] = arg2;
			@Pc(25) int local25 = local20 + 1;
			arg0[local25] = arg2;
			@Pc(30) int local30 = local25 + 1;
			arg0[local30] = arg2;
			@Pc(35) int local35 = local30 + 1;
			arg0[local35] = arg2;
			@Pc(40) int local40 = local35 + 1;
			arg0[local40] = arg2;
			@Pc(45) int local45 = local40 + 1;
			arg0[local45] = arg2;
			@Pc(50) int local50 = local45 + 1;
			arg0[local50] = arg2;
			arg3 = local50 + 1;
			arg0[arg3] = arg2;
		}
		while (local13 > arg3) {
			arg3++;
			arg0[arg3] = arg2;
		}
	}
}
