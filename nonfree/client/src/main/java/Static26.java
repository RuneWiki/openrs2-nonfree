import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!cg", name = "m", descriptor = "I")
	public static int anInt553;

	@OriginalMember(owner = "client!cg", name = "n", descriptor = "Lclient!kh;")
	public static Class52_Sub1 aClass52_Sub1_4;

	@OriginalMember(owner = "client!cg", name = "k", descriptor = "I")
	public static int anInt551 = 0;

	@OriginalMember(owner = "client!cg", name = "o", descriptor = "I")
	public static int anInt554 = 0;

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V")
	public static void method468() {
		Static93.aClass3_Sub4_Sub1_18.method1298(162);
		for (@Pc(23) Class3_Sub10 local23 = (Class3_Sub10) Static144.aClass40_9.method1026(); local23 != null; local23 = (Class3_Sub10) Static144.aClass40_9.method1024()) {
			if (local23.anInt1429 == 0) {
				Static151.method2214(local23, true);
			}
		}
		if (Static72.aClass6_40 != null) {
			Static9.method237(Static72.aClass6_40);
			Static72.aClass6_40 = null;
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIB[I[I[Lclient!oe;)V")
	public static void method469(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) Class71[] arg4) {
		if (arg0 >= arg1) {
			return;
		}
		@Pc(8) int local8 = arg0 - 1;
		@Pc(12) int local12 = arg1 + 1;
		@Pc(19) int local19 = (arg0 + arg1) / 2;
		@Pc(23) Class71 local23 = arg4[local19];
		arg4[local19] = arg4[arg0];
		arg4[arg0] = local23;
		while (local8 < local12) {
			@Pc(37) boolean local37 = true;
			@Pc(40) int local40;
			@Pc(55) int local55;
			@Pc(50) int local50;
			do {
				local12--;
				for (local40 = 0; local40 < 4; local40++) {
					if (arg3[local40] == 2) {
						local50 = local23.anInt2950;
						local55 = arg4[local12].anInt2950;
					} else if (arg3[local40] == 1) {
						local50 = local23.anInt2945;
						if (local50 == -1 && arg2[local40] == 1) {
							local50 = 2001;
						}
						local55 = arg4[local12].anInt2945;
						if (local55 == -1 && arg2[local40] == 1) {
							local55 = 2001;
						}
					} else if (arg3[local40] == 3) {
						local55 = arg4[local12].aBoolean139 ? 1 : 0;
						local50 = local23.aBoolean139 ? 1 : 0;
					} else {
						local50 = local23.anInt2947;
						local55 = arg4[local12].anInt2947;
					}
					if (local55 != local50) {
						if ((arg2[local40] != 1 || local50 >= local55) && (arg2[local40] != 0 || local55 >= local50)) {
							local37 = false;
						}
						break;
					}
					if (local40 == 3) {
						local37 = false;
					}
				}
			} while (local37);
			local37 = true;
			do {
				local8++;
				for (local40 = 0; local40 < 4; local40++) {
					if (arg3[local40] == 2) {
						local55 = arg4[local8].anInt2950;
						local50 = local23.anInt2950;
					} else if (arg3[local40] == 1) {
						local50 = local23.anInt2945;
						if (local50 == -1 && arg2[local40] == 1) {
							local50 = 2001;
						}
						local55 = arg4[local8].anInt2945;
						if (local55 == -1 && arg2[local40] == 1) {
							local55 = 2001;
						}
					} else if (arg3[local40] == 3) {
						local50 = local23.aBoolean139 ? 1 : 0;
						local55 = arg4[local8].aBoolean139 ? 1 : 0;
					} else {
						local55 = arg4[local8].anInt2947;
						local50 = local23.anInt2947;
					}
					if (local50 != local55) {
						if ((arg2[local40] != 1 || local55 >= local50) && (arg2[local40] != 0 || local50 >= local55)) {
							local37 = false;
						}
						break;
					}
					if (local40 == 3) {
						local37 = false;
					}
				}
			} while (local37);
			if (local12 > local8) {
				@Pc(319) Class71 local319 = arg4[local8];
				arg4[local8] = arg4[local12];
				arg4[local12] = local319;
			}
		}
		method469(arg0, local12, arg2, arg3, arg4);
		method469(local12 + 1, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(I)I")
	public static int method472() {
		return Static116.anInt3353;
	}
}
