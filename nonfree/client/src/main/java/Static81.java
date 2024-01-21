import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_676 = Static120.method1824("<col=00ff80>");

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_677 = Static120.method1824("m");

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "[[I")
	public static final int[][] anIntArrayArray18 = new int[104][104];

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_678 = Static120.method1824(")1p");

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "()V")
	public static void method1211() {
		@Pc(3) int local3 = Static185.anIntArray499[Static27.anInt4460];
		@Pc(7) Class60[] local7 = Static185.aClass60ArrayArray1[Static27.anInt4460];
		Static192.anInt4403 = 0;
		for (@Pc(11) int local11 = 0; local11 < local3; local11++) {
			@Pc(16) Class60 local16 = local7[local11];
			@Pc(27) int local27;
			@Pc(42) int local42;
			@Pc(53) int local53;
			@Pc(85) int local85;
			@Pc(64) boolean local64;
			if (local16.anInt2547 == 1) {
				local27 = local16.anInt2548 + Static162.anInt3644 - Static58.anInt1291;
				if (local27 >= 0 && local27 <= Static162.anInt3644 + Static162.anInt3644) {
					local42 = local16.anInt2539 + Static162.anInt3644 - Static30.anInt4486;
					if (local42 < 0) {
						local42 = 0;
					}
					local53 = local16.anInt2545 + Static162.anInt3644 - Static30.anInt4486;
					if (local53 > Static162.anInt3644 + Static162.anInt3644) {
						local53 = Static162.anInt3644 + Static162.anInt3644;
					}
					local64 = false;
					while (local42 <= local53) {
						if (Static107.aBooleanArrayArray1[local27][local42++]) {
							local64 = true;
							break;
						}
					}
					if (local64) {
						local85 = Static87.anInt1818 - local16.anInt2542;
						if (local85 > 32) {
							local16.anInt2540 = 1;
						} else {
							if (local85 >= -32) {
								continue;
							}
							local16.anInt2540 = 2;
							local85 = -local85;
						}
						local16.anInt2544 = (local16.anInt2541 - Static143.anInt3081 << 8) / local85;
						local16.anInt2529 = (local16.anInt2533 - Static143.anInt3081 << 8) / local85;
						local16.anInt2535 = (local16.anInt2538 - Static95.anInt3659 << 8) / local85;
						local16.anInt2534 = (local16.anInt2532 - Static95.anInt3659 << 8) / local85;
						Static191.aClass60Array1[Static192.anInt4403++] = local16;
					}
				}
			} else if (local16.anInt2547 == 2) {
				local27 = local16.anInt2539 + Static162.anInt3644 - Static30.anInt4486;
				if (local27 >= 0 && local27 <= Static162.anInt3644 + Static162.anInt3644) {
					local42 = local16.anInt2548 + Static162.anInt3644 - Static58.anInt1291;
					if (local42 < 0) {
						local42 = 0;
					}
					local53 = local16.anInt2537 + Static162.anInt3644 - Static58.anInt1291;
					if (local53 > Static162.anInt3644 + Static162.anInt3644) {
						local53 = Static162.anInt3644 + Static162.anInt3644;
					}
					local64 = false;
					while (local42 <= local53) {
						if (Static107.aBooleanArrayArray1[local42++][local27]) {
							local64 = true;
							break;
						}
					}
					if (local64) {
						local85 = Static143.anInt3081 - local16.anInt2541;
						if (local85 > 32) {
							local16.anInt2540 = 3;
						} else {
							if (local85 >= -32) {
								continue;
							}
							local16.anInt2540 = 4;
							local85 = -local85;
						}
						local16.anInt2543 = (local16.anInt2542 - Static87.anInt1818 << 8) / local85;
						local16.anInt2546 = (local16.anInt2530 - Static87.anInt1818 << 8) / local85;
						local16.anInt2535 = (local16.anInt2538 - Static95.anInt3659 << 8) / local85;
						local16.anInt2534 = (local16.anInt2532 - Static95.anInt3659 << 8) / local85;
						Static191.aClass60Array1[Static192.anInt4403++] = local16;
					}
				}
			} else if (local16.anInt2547 == 4) {
				local27 = local16.anInt2538 - Static95.anInt3659;
				if (local27 > 128) {
					local42 = local16.anInt2539 + Static162.anInt3644 - Static30.anInt4486;
					if (local42 < 0) {
						local42 = 0;
					}
					local53 = local16.anInt2545 + Static162.anInt3644 - Static30.anInt4486;
					if (local53 > Static162.anInt3644 + Static162.anInt3644) {
						local53 = Static162.anInt3644 + Static162.anInt3644;
					}
					if (local42 <= local53) {
						@Pc(335) int local335 = local16.anInt2548 + Static162.anInt3644 - Static58.anInt1291;
						if (local335 < 0) {
							local335 = 0;
						}
						local85 = local16.anInt2537 + Static162.anInt3644 - Static58.anInt1291;
						if (local85 > Static162.anInt3644 + Static162.anInt3644) {
							local85 = Static162.anInt3644 + Static162.anInt3644;
						}
						@Pc(357) boolean local357 = false;
						label142: for (@Pc(359) int local359 = local335; local359 <= local85; local359++) {
							for (@Pc(362) int local362 = local42; local362 <= local53; local362++) {
								if (Static107.aBooleanArrayArray1[local359][local362]) {
									local357 = true;
									break label142;
								}
							}
						}
						if (local357) {
							local16.anInt2540 = 5;
							local16.anInt2543 = (local16.anInt2542 - Static87.anInt1818 << 8) / local27;
							local16.anInt2546 = (local16.anInt2530 - Static87.anInt1818 << 8) / local27;
							local16.anInt2544 = (local16.anInt2541 - Static143.anInt3081 << 8) / local27;
							local16.anInt2529 = (local16.anInt2533 - Static143.anInt3081 << 8) / local27;
							Static191.aClass60Array1[Static192.anInt4403++] = local16;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)Lclient!o;")
	public static Class3_Sub1_Sub14 method1213(@OriginalArg(0) int arg0) {
		@Pc(8) Class3_Sub1_Sub14 local8 = (Class3_Sub1_Sub14) Static130.aClass5_39.method139((long) arg0);
		if (local8 != null) {
			return local8;
		}
		@Pc(22) byte[] local22 = Static137.aClass1_22.method60(5, arg0);
		local8 = new Class3_Sub1_Sub14();
		if (local22 != null) {
			local8.method1858(new Class3_Sub17(local22));
		}
		Static130.aClass5_39.method145(local8, (long) arg0);
		return local8;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!mb;I)Lclient!th;")
	public static Class31_Sub4 method1214(@OriginalArg(0) Class3_Sub17 arg0) {
		return new Class31_Sub4(arg0.method2138(), arg0.method2138(), arg0.method2138(), arg0.method2138(), arg0.method2136(), arg0.method2136(), arg0.method2107());
	}
}
