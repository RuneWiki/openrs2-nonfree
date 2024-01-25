import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!gh", name = "l", descriptor = "I")
	public static int anInt3485;

	@OriginalMember(owner = "client!gh", name = "n", descriptor = "I")
	public static int anInt3486;

	@OriginalMember(owner = "client!gh", name = "o", descriptor = "I")
	public static int anInt3487;

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "Lclient!eda;")
	public static final Class90 aClass90_62 = new Class90(109, -1);

	@OriginalMember(owner = "client!gh", name = "k", descriptor = "Lclient!qj;")
	public static final Class277 aClass277_6 = new Class277(8, 7);

	@OriginalMember(owner = "client!gh", name = "m", descriptor = "Lclient!eg;")
	public static final Class92 aClass92_1 = new Class92();

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "([BIZI)I")
	public static int method2765(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = -1;
		for (@Pc(14) int local14 = arg1; local14 < arg2; local14++) {
			local12 = Class4_Sub36.anIntArray393[(local12 ^ arg0[local14]) & 0xFF] ^ local12 >>> 8;
		}
		return ~local12;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IZ)V")
	public static void method2767(@OriginalArg(1) boolean arg0) {
		if (Static521.aClass258_1 == null) {
			Static422.method6329();
		}
		if (arg0) {
			Static521.aClass258_1.method5976();
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)I")
	public static int method2769() {
		if (Static40.anInt1244 == 0) {
			Static332.aClass223_2.method5089(new Class259("jaclib"));
			if (Static332.aClass223_2.method5091().method6811() != 100) {
				return 1;
			}
			if (!((Class259) Static332.aClass223_2.method5091()).method6012()) {
				Static104.aClient3.method1526();
			}
			Static40.anInt1244 = 1;
		}
		@Pc(224) int local224;
		@Pc(243) int local243;
		@Pc(257) int local257;
		@Pc(263) int local263;
		if (Static40.anInt1244 == 1) {
			Static554.aClass223Array3 = Static332.method5088();
			Static332.aClass223_1.method5089(new Class234(Static459.aClass348_101));
			Static332.aClass223_3.method5089(new Class259("jaggl"));
			Static332.aClass223_4.method5089(new Class259("jagdx"));
			Static332.aClass223_5.method5089(new Class259("jagmisc"));
			Static332.aClass223_6.method5089(new Class259("sw3d"));
			Static332.aClass223_7.method5089(new Class259("hw3d"));
			Static332.aClass223_8.method5089(new Class234(Static18.aClass348_10));
			Static332.aClass223_9.method5089(new Class234(Static453.aClass348_104));
			Static332.aClass223_10.method5089(new Class234(Static196.aClass348_49));
			Static332.aClass223_11.method5089(new Class234(Static7.aClass348_6));
			Static332.aClass223_12.method5089(new Class234(Static364.aClass348_77));
			Static332.aClass223_13.method5089(new Class234(Static249.aClass348_41));
			Static332.aClass223_14.method5089(new Class234(Static384.aClass348_92));
			Static332.aClass223_15.method5089(new Class234(Static377.aClass348_85));
			Static332.aClass223_16.method5089(new Class234(Static325.aClass348_68));
			Static332.aClass223_17.method5089(new Class234(Static506.aClass348_117));
			Static332.aClass223_18.method5089(new Class234(Static390.aClass348_96));
			Static332.aClass223_19.method5089(new Class234(Static417.aClass348_56));
			Static332.aClass223_20.method5089(new Class234(Static277.aClass348_62));
			Static332.aClass223_21.method5089(new Class234(Static175.aClass348_44));
			Static332.aClass223_22.method5089(new Class297(Static26.aClass348_12, "huffman"));
			Static332.aClass223_23.method5089(new Class234(Static414.aClass348_98));
			Static332.aClass223_24.method5089(new Class234(Static75.aClass348_26));
			Static332.aClass223_25.method5089(new Class234(Static478.aClass348_114));
			Static332.aClass223_26.method5089(new Class263(Static272.aClass348_136, "details"));
			for (local224 = 0; local224 < Static554.aClass223Array3.length; local224++) {
				if (Static554.aClass223Array3[local224].method5091() == null) {
					throw new RuntimeException();
				}
			}
			local243 = 0;
			@Pc(245) Class223[] local245 = Static554.aClass223Array3;
			for (@Pc(247) int local247 = 0; local247 < local245.length; local247++) {
				@Pc(253) Class223 local253 = local245[local247];
				local257 = local253.method5092();
				local263 = local253.method5091().method6811();
				local243 += local263 * local257 / 100;
			}
			Static127.anInt2873 = local243;
			Static40.anInt1244 = 2;
		}
		if (Static554.aClass223Array3 == null) {
			return 100;
		}
		local224 = 0;
		local243 = 0;
		@Pc(298) boolean local298 = true;
		@Pc(300) Class223[] local300 = Static554.aClass223Array3;
		for (local257 = 0; local257 < local300.length; local257++) {
			@Pc(308) Class223 local308 = local300[local257];
			@Pc(312) int local312 = local308.method5092();
			@Pc(318) int local318 = local308.method5091().method6811();
			if (local318 < 100) {
				local298 = false;
			}
			local224 += local312;
			local243 += local318 * local312 / 100;
		}
		if (local298) {
			if (!((Class259) Static332.aClass223_5.method5091()).method6012()) {
				Static104.aClient3.method1518();
			}
			Static554.aClass223Array3 = null;
		}
		local224 -= Static127.anInt2873;
		local243 -= Static127.anInt2873;
		local263 = local224 <= 0 ? 100 : local243 * 100 / local224;
		if (!local298 && local263 > 99) {
			local263 = 99;
		}
		return local263;
	}
}
