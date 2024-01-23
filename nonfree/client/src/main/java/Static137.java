import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!ob", name = "Jb", descriptor = "[Lclient!o;")
	public static Class73_Sub1[] aClass73_Sub1Array3;

	@OriginalMember(owner = "client!ob", name = "Fb", descriptor = "Lclient!db;")
	public static Class19 aClass19_19 = new Class19();

	@OriginalMember(owner = "client!ob", name = "Hb", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1558 = Static200.method3116("Clientscript error in: ");

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZI)V")
	public static void method3326() {
		@Pc(9) byte[][] local9 = Static27.aByteArrayArray2;
		for (@Pc(11) int local11 = 0; local11 < 4; local11++) {
			Static84.method1044();
			for (@Pc(17) int local17 = 0; local17 < 13; local17++) {
				for (@Pc(21) int local21 = 0; local21 < 13; local21++) {
					@Pc(31) int local31 = Static145.anIntArrayArrayArray12[local11][local17][local21];
					@Pc(33) boolean local33 = false;
					if (local31 != -1) {
						@Pc(43) int local43 = local31 >> 24 & 0x3;
						@Pc(53) int local53 = local31 >> 14 & 0x3FF;
						@Pc(59) int local59 = local31 >> 1 & 0x3;
						@Pc(65) int local65 = local31 >> 3 & 0x7FF;
						@Pc(75) int local75 = (local53 / 8 << 8) + local65 / 8;
						for (@Pc(77) int local77 = 0; local77 < Static193.anIntArray536.length; local77++) {
							if (Static193.anIntArray536[local77] == local75 && local9[local77] != null) {
								Static207.method3213(local9[local77], (local53 & 0x7) * 8, (local65 & 0x7) * 8, local17 * 8, local11, local21 * 8, Static153.aClass3Array1, local43, local59);
								local33 = true;
								break;
							}
						}
					}
					if (!local33) {
						Static72.method1313(local11, local21 * 8, 8, local17 * 8, 8);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IZIIII)Lclient!ch;")
	public static Class1_Sub1_Sub6 method3328(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(34) long local34 = ((long) arg3 << 38) + (arg1 ? 137438953472L : 0L) + ((long) arg0 << 16) + (long) arg4 + ((long) arg2 << 40);
		@Pc(40) Class1_Sub1_Sub6 local40 = (Class1_Sub1_Sub6) Static141.aClass39_15.method1161(local34);
		if (local40 != null) {
			return local40;
		}
		Static81.aBoolean105 = false;
		local40 = Static43.method710(arg1, arg0, false, arg2, arg4, arg3);
		if (local40 != null && !Static81.aBoolean105) {
			Static141.aClass39_15.method1152(local34, local40);
		}
		return local40;
	}
}
