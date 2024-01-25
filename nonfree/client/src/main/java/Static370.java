import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static370 {

	@OriginalMember(owner = "client!ob", name = "db", descriptor = "I")
	public static int anInt6167;

	@OriginalMember(owner = "client!ob", name = "J", descriptor = "[[I")
	public static final int[][] anIntArrayArray143 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(II[B)I")
	public static int method4985(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		return Static359.method4477(0, arg1, arg0);
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(BI)Z")
	public static boolean method4987(@OriginalArg(1) int arg0) {
		return arg0 == 3 || arg0 == 4;
	}

	@OriginalMember(owner = "client!ob", name = "h", descriptor = "(I)I")
	public static int method4989() {
		if (Static93.aClass341_8 == null) {
			if (!Static554.aBoolean708 && Static337.anInt8004 > 0) {
				if (Static197.aBoolean491 && Static137.aClass295_1.method7719(81) && Static337.anInt8004 > 2) {
					return ((Class1_Sub51) Static310.aClass353_32.aClass1_271.aClass1_286.aClass1_286).anInt9642;
				}
				return ((Class1_Sub51) Static310.aClass353_32.aClass1_271.aClass1_286).anInt9642;
			}
			@Pc(25) int local25 = Static166.aClass25_1.method4783();
			@Pc(29) int local29 = Static166.aClass25_1.method4788();
			@Pc(31) int local31 = Static330.anInt5532;
			@Pc(33) int local33 = Static518.anInt8770;
			@Pc(35) int local35 = Static274.anInt307;
			if (local31 < local25 && local31 + local35 > local25) {
				@Pc(49) int local49 = -1;
				@Pc(68) int local68;
				for (@Pc(51) int local51 = 0; local51 < Static337.anInt8004; local51++) {
					if (Static244.aBoolean336) {
						local68 = local33 + (Static337.anInt8004 + -1 + -local51) * 16 + 33;
						if (local29 > local68 - 13 && local29 <= local68 + 3) {
							local49 = local51;
						}
					} else {
						local68 = (Static337.anInt8004 - local51 - 1) * 16 + local33 + 31;
						if (local29 > local68 - 13 && local68 + 3 >= local29) {
							local49 = local51;
						}
					}
				}
				if (local49 != -1) {
					local68 = 0;
					@Pc(131) Class220 local131 = new Class220(Static310.aClass353_32);
					for (@Pc(138) Class1_Sub51 local138 = (Class1_Sub51) local131.method4408(); local138 != null; local138 = (Class1_Sub51) local131.method4410()) {
						if (local49 == local68++) {
							return local138.anInt9642;
						}
					}
				}
			}
		}
		return -1;
	}
}
