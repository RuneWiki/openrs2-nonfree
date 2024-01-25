import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static368 {

	@OriginalMember(owner = "client!mh", name = "t", descriptor = "Lclient!hn;")
	public static Class161 aClass161_4;

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(B[Lclient!nf;)V")
	public static void method5459(@OriginalArg(1) Class102[] arg0) {
		Static211.anInt9608 = arg0.length;
		Static442.anIntArray463 = new int[Static211.anInt9608 + 10];
		Static359.aClass102Array17 = new Class102[Static211.anInt9608 + 10];
		Static689.method8053(arg0, 0, Static359.aClass102Array17, 0, Static211.anInt9608);
		for (@Pc(26) int local26 = 0; local26 < Static211.anInt9608; local26++) {
			Static442.anIntArray463[local26] = Static359.aClass102Array17[local26].method6958();
		}
		for (@Pc(46) int local46 = Static211.anInt9608; local46 < Static359.aClass102Array17.length; local46++) {
			Static442.anIntArray463[local46] = 12;
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(ZZ)Z")
	public static boolean method5460(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(II)Z")
	public static boolean method5461(@OriginalArg(1) int arg0) {
		if (Static89.aBooleanArray8[arg0]) {
			return true;
		} else if (Static280.aClass143_73.method3144(arg0)) {
			@Pc(23) int local23 = Static280.aClass143_73.method3123(arg0);
			if (local23 == 0) {
				Static89.aBooleanArray8[arg0] = true;
				return true;
			}
			if (Static562.aClass208ArrayArray3[arg0] == null) {
				Static562.aClass208ArrayArray3[arg0] = new Class208[local23];
			}
			for (@Pc(47) int local47 = 0; local47 < local23; local47++) {
				if (Static562.aClass208ArrayArray3[arg0][local47] == null) {
					@Pc(61) byte[] local61 = Static280.aClass143_73.method3125(local47, arg0);
					if (local61 != null) {
						@Pc(73) Class208 local73 = Static562.aClass208ArrayArray3[arg0][local47] = new Class208();
						local73.anInt5653 = local47 + (arg0 << 16);
						if (local61[0] != -1) {
							throw new IllegalStateException("if1");
						}
						local73.method4722(new Class3_Sub17(local61));
					}
				}
			}
			Static89.aBooleanArray8[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!mh", name = "c", descriptor = "(I)V")
	public static void method5462() {
		Static258.aClass212_1.method7746();
		for (@Pc(16) int local16 = 0; local16 < 32; local16++) {
			Static404.aLongArray15[local16] = 0L;
		}
		for (@Pc(30) int local30 = 0; local30 < 32; local30++) {
			Static341.aLongArray13[local30] = 0L;
		}
		Static651.anInt10024 = 0;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIIIII)V")
	public static void method5463(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg4 != 8 && arg4 != 16) {
			@Pc(21) Class247 local21 = Static332.aClass247ArrayArrayArray1[arg0][arg2][arg3];
			if (local21 == null) {
				local21 = new Class247(arg0);
			}
			if (arg4 == 1) {
				local21.aShort83 = (short) arg5;
				local21.aShort82 = (short) arg1;
			} else if (arg4 == 2) {
				local21.aShort80 = (short) arg5;
				local21.aShort81 = (short) arg1;
			}
			if (Static175.aBoolean264) {
				Static200.method3158();
				return;
			}
			return;
		}
		@Pc(69) int local69;
		@Pc(74) int local74;
		@Pc(78) int local78;
		@Pc(83) int local83;
		@Pc(93) int local93;
		@Pc(103) int local103;
		if (arg4 != 8) {
			local69 = (arg2 << Static436.anInt7634) + Static10.anInt118;
			local74 = local69 - Static10.anInt118;
			local78 = arg3 << Static436.anInt7634;
			local83 = local78 + Static10.anInt118;
			local93 = Static239.aClass104Array1[arg0].method8279(arg3, arg2 + 1);
			local103 = Static239.aClass104Array1[arg0].method8279(arg3 + 1, arg2);
			Static67.aClass167Array15[Static22.anInt704++] = new Class167(arg4, arg0, local69, local74, local74, local69, local93, local103, local103 - arg5, local93 - arg5, local78, local83, local83, local78);
			return;
		}
		local69 = arg2 << Static436.anInt7634;
		local74 = Static10.anInt118 + local69;
		local78 = arg3 << Static436.anInt7634;
		local83 = Static10.anInt118 + local78;
		local93 = Static239.aClass104Array1[arg0].method8279(arg3, arg2);
		local103 = Static239.aClass104Array1[arg0].method8279(arg3 + 1, arg2 + 1);
		Static67.aClass167Array15[Static22.anInt704++] = new Class167(arg4, arg0, local69, local74, local74, local69, local93, local103, local103 - arg5, -arg5 + local93, local78, local83, local83, local78);
	}
}
