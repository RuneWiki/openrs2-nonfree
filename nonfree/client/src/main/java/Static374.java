import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static374 {

	@OriginalMember(owner = "client!mn", name = "e", descriptor = "Lclient!wia;")
	public static final Class387 aClass387_66 = new Class387(34, -1);

	@OriginalMember(owner = "client!mn", name = "f", descriptor = "Z")
	public static final boolean aBoolean489 = false;

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "[Lclient!tia;")
	public static final Class5_Sub50[] aClass5_Sub50Array1 = new Class5_Sub50[300];

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(IIII)V")
	public static void method5468(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(37) String local37 = "tele " + arg0 + "," + (arg2 >> 6) + "," + (arg1 >> 6) + "," + (arg2 & 0x3F) + "," + (arg1 & 0x3F);
		System.out.println(local37);
		Static676.method8313(true, false, local37);
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(IIB)I")
	public static int method5469(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = 0;
		while (arg1 > 0) {
			local13 = local13 << 1 | arg0 & 0x1;
			arg0 >>>= 0x1;
			arg1--;
		}
		return local13;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(Z)I")
	public static int method5471() {
		return Static630.method8820(false);
	}

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "(I)V")
	public static void method5472() {
		for (@Pc(3) int local3 = 0; local3 < Static372.anInt8186; local3++) {
			Static292.aClass337Array4[local3] = null;
		}
		if (15611 != 15611) {
			return;
		}
		Static372.anInt8186 = 0;
		@Pc(40) int local40;
		@Pc(44) int local44;
		for (@Pc(36) int local36 = 0; local36 < Static490.anInt9715; local36++) {
			for (local40 = 0; local40 < Static328.anInt5870; local40++) {
				for (local44 = 0; local44 < Static526.anInt8863; local44++) {
					@Pc(54) Class174 local54 = Static260.aClass174ArrayArrayArray2[local36][local44][local40];
					if (local54 != null) {
						if (local54.aShort50 > 0) {
							local54.aShort50 = (short) (local54.aShort50 * -1);
						}
						if (local54.aShort53 > 0) {
							local54.aShort53 = (short) (local54.aShort53 * -1);
						}
					}
				}
			}
		}
		for (local40 = 0; local40 < Static490.anInt9715; local40++) {
			for (local44 = 0; local44 < Static328.anInt5870; local44++) {
				for (@Pc(119) int local119 = 0; local119 < Static526.anInt8863; local119++) {
					@Pc(129) Class174 local129 = Static260.aClass174ArrayArrayArray2[local40][local119][local44];
					if (local129 != null) {
						@Pc(155) boolean local155 = Static260.aClass174ArrayArrayArray2[0][local119][local44] != null && Static260.aClass174ArrayArrayArray2[0][local119][local44].aClass174_1 != null;
						@Pc(163) int local163;
						@Pc(165) int local165;
						@Pc(179) Class174 local179;
						@Pc(189) int local189;
						@Pc(387) int local387;
						@Pc(402) int local402;
						@Pc(409) int local409;
						@Pc(426) int local426;
						@Pc(434) int local434;
						@Pc(438) int local438;
						@Pc(442) int local442;
						@Pc(449) int local449;
						@Pc(488) int local488;
						@Pc(492) int local492;
						if (local129.aShort53 < 0) {
							local163 = local44;
							local165 = local44;
							local179 = Static260.aClass174ArrayArrayArray2[local40][local119][local44 - 1];
							local189 = Static220.aClass22Array2[local40].method8038(local44, local119);
							while (local163 > 0 && local179 != null && local179.aShort53 < 0 && local129.aShort53 == local179.aShort53 && local179.aShort52 == local129.aShort52 && local189 == Static220.aClass22Array2[local40].method8038(local163 - 1, local119) && (local163 - 1 <= 0 || Static220.aClass22Array2[local40].method8038(local163 - 2, local119) == local189)) {
								local163--;
								local179 = Static260.aClass174ArrayArrayArray2[local40][local119][local163 - 1];
							}
							for (local179 = Static260.aClass174ArrayArrayArray2[local40][local119][local44 + 1]; local165 < Static526.anInt8863 && local179 != null && local179.aShort53 < 0 && local129.aShort53 == local179.aShort53 && local129.aShort52 == local179.aShort52 && local189 == Static220.aClass22Array2[local40].method8038(local165 + 1, local119) && (local165 + 1 >= Static526.anInt8863 || Static220.aClass22Array2[local40].method8038(local165 + 2, local119) == local189); local179 = Static260.aClass174ArrayArrayArray2[local40][local119][local165 + 1]) {
								local165++;
							}
							local387 = local40 + 1 - local40;
							local402 = Static220.aClass22Array2[local155 ? local40 + 1 : local40].method8038(local163, local119);
							local409 = local402 + local129.aShort53 * local387;
							local426 = Static220.aClass22Array2[local155 ? local40 + 1 : local40].method8038(local165 + 1, local119);
							local434 = local426 + local129.aShort53 * local387;
							local438 = local119 << Static611.anInt10115;
							local442 = local163 << Static611.anInt10115;
							local449 = (local165 << Static611.anInt10115) + Static88.anInt7739;
							Static292.aClass337Array4[Static372.anInt8186++] = new Class337(1, local40, local438 + local129.aShort52, local129.aShort52 + local438, local438 + local129.aShort52, local438 + local129.aShort52, local402, local426, local434, local409, local442, local449, local449, local442);
							for (local488 = local40; local488 <= local40; local488++) {
								for (local492 = local163; local492 <= local165; local492++) {
									Static260.aClass174ArrayArrayArray2[local488][local119][local492].aShort53 = (short) (Static260.aClass174ArrayArrayArray2[local488][local119][local492].aShort53 * -1);
								}
							}
						}
						if (local129.aShort50 < 0) {
							local163 = local119;
							local165 = local119;
							local179 = Static260.aClass174ArrayArrayArray2[local40][local119 - 1][local44];
							local189 = Static220.aClass22Array2[local40].method8038(local44, local119);
							while (local163 > 0 && local179 != null && local179.aShort50 < 0 && local179.aShort50 == local129.aShort50 && local179.aShort51 == local129.aShort51 && Static220.aClass22Array2[local40].method8038(local44, local163 - 1) == local189 && (local163 - 1 <= 0 || Static220.aClass22Array2[local40].method8038(local44, local163 - 2) == local189)) {
								local163--;
								local179 = Static260.aClass174ArrayArrayArray2[local40][local163 - 1][local44];
							}
							for (local179 = Static260.aClass174ArrayArrayArray2[local40][local119 + 1][local44]; Static328.anInt5870 > local165 && local179 != null && local179.aShort50 < 0 && local129.aShort50 == local179.aShort50 && local129.aShort51 == local179.aShort51 && Static220.aClass22Array2[local40].method8038(local44, local165 + 1) == local189 && (local165 + 1 >= Static328.anInt5870 || local189 == Static220.aClass22Array2[local40].method8038(local44, local165 + 2)); local179 = Static260.aClass174ArrayArrayArray2[local40][local165 + 1][local44]) {
								local165++;
							}
							local387 = local40 + 1 - local40;
							local402 = Static220.aClass22Array2[local155 ? local40 + 1 : local40].method8038(local44, local163);
							local409 = local402 + local387 * local129.aShort50;
							local426 = Static220.aClass22Array2[local155 ? local40 + 1 : local40].method8038(local44, local165 + 1);
							local434 = local387 * local129.aShort50 + local426;
							local438 = local163 << Static611.anInt10115;
							local442 = (local165 << Static611.anInt10115) + Static88.anInt7739;
							local449 = local44 << Static611.anInt10115;
							Static292.aClass337Array4[Static372.anInt8186++] = new Class337(2, local40, local438, local442, local442, local438, local402, local426, local434, local409, local129.aShort51 + local449, local449 + local129.aShort51, local449 + local129.aShort51, local129.aShort51 + local449);
							for (local488 = local40; local488 <= local40; local488++) {
								for (local492 = local163; local492 <= local165; local492++) {
									Static260.aClass174ArrayArrayArray2[local488][local492][local44].aShort50 = (short) (Static260.aClass174ArrayArrayArray2[local488][local492][local44].aShort50 * -1);
								}
							}
						}
					}
				}
			}
		}
		Static526.aBoolean668 = true;
	}
}
