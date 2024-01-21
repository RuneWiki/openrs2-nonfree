import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!ig", name = "v", descriptor = "Lclient!d;")
	public static Class16 aClass16_6 = new Class16(32);

	@OriginalMember(owner = "client!ig", name = "A", descriptor = "Lclient!sd;")
	private static Class73 aClass73_865 = Static122.method531("Loaded config");

	@OriginalMember(owner = "client!ig", name = "B", descriptor = "Lclient!sd;")
	public static Class73 aClass73_866 = aClass73_865;

	@OriginalMember(owner = "client!ig", name = "K", descriptor = "Lclient!sd;")
	private static Class73 aClass73_867 = Static122.method531("Loading interfaces )2 ");

	@OriginalMember(owner = "client!ig", name = "L", descriptor = "I")
	public static int anInt1602 = 255;

	@OriginalMember(owner = "client!ig", name = "M", descriptor = "Lclient!sd;")
	public static Class73 aClass73_868 = aClass73_867;

	@OriginalMember(owner = "client!ig", name = "N", descriptor = "Lclient!sd;")
	public static Class73 aClass73_869 = Static122.method531("<col=ffffff>");

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(III)I")
	public static int method1222(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = arg1 - 1 & arg0 >> 31;
		return ((arg0 >>> 31) + arg0) % arg1 + local11;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IZBLclient!f;II)V")
	public static void method1224(@OriginalArg(0) int arg0, @OriginalArg(3) Class13 arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		Static71.aClass13_13 = arg1;
		Static137.anInt3105 = 1;
		Static31.anInt816 = 10000;
		Static130.anInt2969 = arg2;
		Static4.aBoolean7 = false;
		Static71.anInt1634 = arg3;
		Static52.anInt1269 = arg0;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(B)V")
	public static void method1225() {
		aClass73_868 = null;
		aClass73_867 = null;
		aClass16_6 = null;
		aClass73_865 = null;
		aClass73_866 = null;
		aClass73_869 = null;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "([Lclient!ph;II[II[I)V")
	public static void method1226(@OriginalArg(0) Class62[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(5) int[] arg4) {
		if (arg2 >= arg1) {
			return;
		}
		@Pc(12) int local12 = arg2 - 1;
		@Pc(16) int local16 = arg1 + 1;
		@Pc(22) int local22 = (arg1 + arg2) / 2;
		@Pc(26) Class62 local26 = arg0[local22];
		arg0[local22] = arg0[arg2];
		arg0[arg2] = local26;
		while (local12 < local16) {
			@Pc(40) boolean local40 = true;
			@Pc(43) int local43;
			@Pc(72) int local72;
			@Pc(67) int local67;
			do {
				local16--;
				for (local43 = 0; local43 < 4; local43++) {
					if (arg4[local43] == 2) {
						local67 = local26.anInt2972;
						local72 = arg0[local16].anInt2972;
					} else if (arg4[local43] == 1) {
						local72 = arg0[local16].anInt2970;
						if (local72 == -1 && arg3[local43] == 1) {
							local72 = 2001;
						}
						local67 = local26.anInt2970;
						if (local67 == -1 && arg3[local43] == 1) {
							local67 = 2001;
						}
					} else if (arg4[local43] == 3) {
						local67 = local26.aBoolean196 ? 1 : 0;
						local72 = arg0[local16].aBoolean196 ? 1 : 0;
					} else {
						local67 = local26.anInt2963;
						local72 = arg0[local16].anInt2963;
					}
					if (local72 != local67) {
						if ((arg3[local43] != 1 || local67 >= local72) && (arg3[local43] != 0 || local67 <= local72)) {
							local40 = false;
						}
						break;
					}
					if (local43 == 3) {
						local40 = false;
					}
				}
			} while (local40);
			local40 = true;
			do {
				local12++;
				for (local43 = 0; local43 < 4; local43++) {
					if (arg4[local43] == 2) {
						local72 = arg0[local12].anInt2972;
						local67 = local26.anInt2972;
					} else if (arg4[local43] == 1) {
						local67 = local26.anInt2970;
						local72 = arg0[local12].anInt2970;
						if (local67 == -1 && arg3[local43] == 1) {
							local67 = 2001;
						}
						if (local72 == -1 && arg3[local43] == 1) {
							local72 = 2001;
						}
					} else if (arg4[local43] == 3) {
						local67 = local26.aBoolean196 ? 1 : 0;
						local72 = arg0[local12].aBoolean196 ? 1 : 0;
					} else {
						local67 = local26.anInt2963;
						local72 = arg0[local12].anInt2963;
					}
					if (local72 != local67) {
						if ((arg3[local43] != 1 || local72 >= local67) && (arg3[local43] != 0 || local67 >= local72)) {
							local40 = false;
						}
						break;
					}
					if (local43 == 3) {
						local40 = false;
					}
				}
			} while (local40);
			if (local12 < local16) {
				@Pc(333) Class62 local333 = arg0[local12];
				arg0[local12] = arg0[local16];
				arg0[local16] = local333;
			}
		}
		method1226(arg0, local16, arg2, arg3, arg4);
		method1226(arg0, arg1, local16 + 1, arg3, arg4);
	}
}
