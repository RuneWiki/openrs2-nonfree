import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static305 {

	@OriginalMember(owner = "client!tk", name = "v", descriptor = "Z")
	public static boolean aBoolean549 = false;

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(II)V")
	public static void method5356(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class8 local7 = Static275.aClass8ArrayArrayArray4[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class8 local28 = Static275.aClass8ArrayArrayArray4[local9][arg0][arg1] = Static275.aClass8ArrayArrayArray4[local9 + 1][arg0][arg1];
			if (local28 != null) {
				local28.aByte4--;
				for (@Pc(40) Class172 local40 = local28.aClass172_1; local40 != null; local40 = local40.aClass172_4) {
					@Pc(44) Class62_Sub1 local44 = local40.aClass62_Sub1_1;
					if (local44.aShort84 == arg0 && local44.aShort83 == arg1) {
						local44.aByte56--;
					}
				}
			}
		}
		if (Static275.aClass8ArrayArrayArray4[0][arg0][arg1] == null) {
			Static275.aClass8ArrayArrayArray4[0][arg0][arg1] = new Class8(0, arg0, arg1);
			Static275.aClass8ArrayArrayArray4[0][arg0][arg1].aByte7 = 1;
		}
		Static275.aClass8ArrayArrayArray4[0][arg0][arg1].aClass8_1 = local7;
		Static275.aClass8ArrayArrayArray4[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIII)V")
	public static void method5357(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static126.anIntArrayArray82 != null) {
			Static126.anIntArrayArray82[arg0][arg1] = (arg3 & 0x7F8) << 21 | arg2 & 0xFFFFFF;
		}
	}

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "(IIII)V")
	public static void method5358(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		@Pc(3) int local3 = arg1 << 3;
		@Pc(15) int local15 = arg0 << 3;
		Static92.aFloat28 = local15;
		Static331.aFloat43 = local3;
		if (Static182.anInt3602 == 2) {
			Static291.anInt5883 = local15;
			Static283.anInt5723 = local3;
			Static344.anInt6885 = 0;
		}
		Static349.method5958();
		Static285.aBoolean515 = true;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(BII)I")
	public static int method5359(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		arg1 = (arg0 & 0x7F) * arg1 >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return arg1 + (arg0 & 0xFF80);
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(ILclient!dg;)V")
	public static void method5360(@OriginalArg(1) Class2_Sub10 arg0) {
		@Pc(9) int local9 = arg0.method4441();
		Static92.aClass125Array2 = new Class125[local9];
		for (@Pc(14) int local14 = 0; local14 < local9; local14++) {
			Static92.aClass125Array2[local14] = new Class125();
			Static92.aClass125Array2[local14].anInt3729 = arg0.method4441();
			Static92.aClass125Array2[local14].aString34 = arg0.method4408();
		}
		Static98.anInt2208 = arg0.method4441();
		Static161.anInt3258 = arg0.method4441();
		Static168.anInt3424 = arg0.method4441();
		Static181.aClass20_Sub1Array2 = new Class20_Sub1[Static161.anInt3258 + 1 - Static98.anInt2208];
		for (@Pc(73) int local73 = 0; local73 < Static168.anInt3424; local73++) {
			@Pc(79) int local79 = arg0.method4441();
			@Pc(87) Class20_Sub1 local87 = Static181.aClass20_Sub1Array2[local79] = new Class20_Sub1();
			local87.anInt492 = arg0.method4421();
			local87.anInt496 = arg0.method4444();
			local87.anInt500 = local79 + Static98.anInt2208;
			local87.aString9 = arg0.method4408();
			local87.aString10 = arg0.method4408();
		}
		Static213.anInt4102 = arg0.method4444();
		Static322.aBoolean573 = true;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(BI)V")
	public static void method5361() {
		@Pc(1) Class119 local1 = Static253.aClass119_210;
		synchronized (Static253.aClass119_210) {
			Static253.aClass119_210.method3315(5);
		}
		local1 = Static119.aClass119_76;
		synchronized (Static119.aClass119_76) {
			Static119.aClass119_76.method3315(5);
		}
		@Pc(33) Class148 local33 = Static129.aClass148_1;
		synchronized (Static129.aClass148_1) {
			Static129.aClass148_1.method4069();
		}
	}

	@OriginalMember(owner = "client!tk", name = "c", descriptor = "(IIII)I")
	public static int method5362(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((Static313.aByteArrayArrayArray12[arg2][arg1][arg0] & 0x8) == 0) {
			return arg2 <= 0 || (Static313.aByteArrayArrayArray12[1][arg1][arg0] & 0x2) == 0 ? arg2 : arg2 - 1;
		} else {
			return 0;
		}
	}
}
