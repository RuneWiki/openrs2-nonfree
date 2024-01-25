import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static299 {

	@OriginalMember(owner = "client!lc", name = "bb", descriptor = "I")
	public static int anInt5407;

	@OriginalMember(owner = "client!lc", name = "I", descriptor = "Lclient!ct;")
	public static final Class62 aClass62_11 = new Class62();

	@OriginalMember(owner = "client!lc", name = "X", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray6 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

	@OriginalMember(owner = "client!lc", name = "eb", descriptor = "[[I")
	public static final int[][] anIntArrayArray33 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(BLclient!es;)V")
	public static void method4534(@OriginalArg(1) Class2_Sub15 arg0) {
		if (arg0.aByteArray62.length - arg0.anInt5241 < 1) {
			return;
		}
		@Pc(26) int local26 = arg0.method4325();
		if (local26 < 0 || local26 > 1 || arg0.aByteArray62.length - arg0.anInt5241 < 2) {
			return;
		}
		@Pc(49) int local49 = arg0.method4294();
		if (arg0.aByteArray62.length - arg0.anInt5241 < local49 * 6) {
			return;
		}
		for (@Pc(63) int local63 = 0; local63 < local49; local63++) {
			@Pc(69) int local69 = arg0.method4294();
			@Pc(75) int local75 = arg0.method4307();
			if (Static470.anIntArray532.length > local69 && Static254.aBooleanArray23[local69] && (Static172.aClass262_1.method6032(local69).aChar1 != '1' || local75 >= -1 && local75 <= 1)) {
				Static470.anIntArray532[local69] = local75;
			}
		}
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(III)Z")
	public static boolean method4535(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(II)I")
	public static int method4537(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static544.aShortArrayArray33 == null ? 0 : Static544.aShortArrayArray33[arg0][arg1] & 0xFFFF;
	}

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "(II)V")
	public static void method4538(@OriginalArg(0) int arg0) {
		Static492.anInt8283 = arg0;
		Static268.aClass313_63.method6977();
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIIILclient!r;)V")
	public static void method4539(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class100 arg4) {
		arg4.da(arg0, arg3, arg2 + arg0, arg3 + arg1);
		arg4.method6261(-16777216, arg0, arg3, arg1, arg2);
		if (Static499.anInt8380 < 100) {
			return;
		}
		@Pc(43) float local43 = (float) Static270.anInt1805 / (float) Static270.anInt1797;
		@Pc(45) int local45 = arg2;
		@Pc(47) int local47 = arg1;
		if (local43 < 1.0F) {
			local47 = (int) (local43 * (float) arg2);
		} else {
			local45 = (int) ((float) arg1 / local43);
		}
		@Pc(74) int local74 = arg3 + (arg1 - local47) / 2;
		@Pc(83) int local83 = arg0 + (arg2 - local45) / 2;
		if (Static326.aClass39_12 == null || Static326.aClass39_12.E() != arg2 || Static326.aClass39_12.u() != arg1) {
			Static270.method1323(Static270.anInt1801, Static270.anInt1805 + Static270.anInt1800, Static270.anInt1797 + Static270.anInt1801, Static270.anInt1800, local83, local74, local45 + local83, local74 - -local47);
			Static270.method1309(arg4);
			Static326.aClass39_12 = arg4.method6236(local83, local74, local45, local47, false);
		}
		Static326.aClass39_12.method7851(local83, local74);
		@Pc(139) int local139 = Static532.anInt8741 * local45 / Static270.anInt1797;
		@Pc(145) int local145 = local47 * Static87.anInt1840 / Static270.anInt1805;
		@Pc(153) int local153 = local45 * Static196.anInt3902 / Static270.anInt1797 + local83;
		@Pc(167) int local167 = local47 + local74 - local145 - Static81.anInt1760 * local47 / Static270.anInt1805;
		@Pc(169) int local169 = -1996554240;
		if (Static328.aClass284_2 == Static404.aClass284_3) {
			local169 = -1996488705;
		}
		arg4.J(local153, local167, local139, local145, local169, 1);
		arg4.method6212(local153, local167, local139, local145, local169, 0);
		if (Static356.anInt6365 <= 0) {
			return;
		}
		@Pc(199) int local199;
		if (Static485.anInt8224 <= 50) {
			local199 = Static485.anInt8224 * 5;
		} else {
			local199 = (100 - Static485.anInt8224) * 5;
		}
		for (@Pc(212) Class2_Sub46 local212 = (Class2_Sub46) Static270.aClass8_9.method210(); local212 != null; local212 = (Class2_Sub46) Static270.aClass8_9.method218()) {
			@Pc(220) Class366 local220 = Static270.aClass25_2.method435(local212.anInt9117);
			if (Static563.method7643(local220)) {
				@Pc(248) int local248;
				@Pc(259) int local259;
				if (Static591.anInt9584 == local212.anInt9117) {
					local248 = local45 * local212.anInt9115 / Static270.anInt1797 + local83;
					local259 = local74 + local47 * (Static270.anInt1805 - local212.anInt9116) / Static270.anInt1805;
					arg4.method6261(local199 << 24 | 0xFFFF00, local248 - 2, local259 + -2, 4, 4);
				} else if (Static582.anInt9503 != -1 && Static582.anInt9503 == local220.anInt9642) {
					local248 = local83 + local212.anInt9115 * local45 / Static270.anInt1797;
					local259 = local74 + (Static270.anInt1805 - local212.anInt9116) * local47 / Static270.anInt1805;
					arg4.method6261(local199 << 24 | 0xFFFF00, local248 - 2, local259 + -2, 4, 4);
				}
			}
		}
	}
}
