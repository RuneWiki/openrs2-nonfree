import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ae", name = "K", descriptor = "[I")
	public static final int[] anIntArray15 = new int[5];

	@OriginalMember(owner = "client!ae", name = "M", descriptor = "Lclient!ui;")
	public static final Class242 aClass242_2 = new Class242("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de rétablissement.", "Tentando reestabelecer conexão. Aguarde.");

	@OriginalMember(owner = "client!ae", name = "P", descriptor = "Lclient!cm;")
	public static final Class36 aClass36_4 = new Class36(53, 3);

	@OriginalMember(owner = "client!ae", name = "T", descriptor = "[I")
	public static final int[] anIntArray16 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(BIZZI)V")
	public static void method158(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		if (!arg2 && Static50.anInt1367 == arg3 && arg0 == Static33.anInt781 && (Static107.anInt2257 == Static221.anInt4855 || Static126.aClass67_Sub1_1.method4531(Static286.anInt5207))) {
			return;
		}
		Static107.anInt2257 = Static221.anInt4855;
		Static33.anInt781 = arg0;
		Static50.anInt1367 = arg3;
		if (Static126.aClass67_Sub1_1.method4531(Static286.anInt5207)) {
			Static107.anInt2257 = 0;
		}
		if (arg1) {
			Static321.method4406(28);
		} else {
			Static321.method4406(25);
		}
		Static309.method4260(Static390.aClass105_7, Static104.aClass242_28.method5320(Static139.anInt2670), true);
		@Pc(59) int local59 = Static381.anInt6688;
		@Pc(61) int local61 = Static285.anInt5187;
		Static381.anInt6688 = (Static50.anInt1367 - (Static126.anInt2569 >> 4)) * 8;
		Static285.anInt5187 = (Static33.anInt781 - (Static190.anInt3697 >> 4)) * 8;
		Static447.aClass4_Sub1_Sub16_3 = Static137.method4282(Static50.anInt1367 * 8, Static33.anInt781 * 8);
		Static406.aClass257_3 = null;
		@Pc(94) int local94 = Static381.anInt6688 - local59;
		@Pc(99) int local99 = Static285.anInt5187 - local61;
		@Pc(103) int local103;
		@Pc(113) int local113;
		if (arg1) {
			Static249.anInt4520 = 0;
			local103 = (Static126.anInt2569 - 1) * 128;
			@Pc(173) int local173 = (Static190.anInt3697 - 1) * 128;
			for (local113 = 0; local113 < 32768; local113++) {
				@Pc(181) Class6_Sub2_Sub1_Sub2 local181 = Static176.aClass6_Sub2_Sub1_Sub2Array1[local113];
				if (local181 != null) {
					local181.anInt6061 -= local99 * 128;
					local181.anInt6062 -= local94 * 128;
					if (local181.anInt6062 >= 0 && local181.anInt6062 <= local103 && local181.anInt6061 >= 0 && local173 >= local181.anInt6061) {
						@Pc(218) boolean local218 = true;
						for (@Pc(220) int local220 = 0; local220 < 10; local220++) {
							local181.anIntArray536[local220] -= local94;
							local181.anIntArray537[local220] -= local99;
							if (local181.anIntArray536[local220] < 0 || local181.anIntArray536[local220] >= Static126.anInt2569 || local181.anIntArray537[local220] < 0 || local181.anIntArray537[local220] >= Static190.anInt3697) {
								local218 = false;
							}
						}
						if (local218) {
							Static128.anIntArray171[Static249.anInt4520++] = local113;
						} else {
							Static176.aClass6_Sub2_Sub1_Sub2Array1[local113].method4770(null);
							Static176.aClass6_Sub2_Sub1_Sub2Array1[local113] = null;
						}
					} else {
						Static176.aClass6_Sub2_Sub1_Sub2Array1[local113].method4770(null);
						Static176.aClass6_Sub2_Sub1_Sub2Array1[local113] = null;
					}
				}
			}
		} else {
			for (local103 = 0; local103 < 32768; local103++) {
				@Pc(109) Class6_Sub2_Sub1_Sub2 local109 = Static176.aClass6_Sub2_Sub1_Sub2Array1[local103];
				if (local109 != null) {
					for (local113 = 0; local113 < 10; local113++) {
						local109.anIntArray536[local113] -= local94;
						local109.anIntArray537[local113] -= local99;
					}
					local109.anInt6061 -= local99 * 128;
					local109.anInt6062 -= local94 * 128;
				}
			}
		}
		for (local103 = 0; local103 < 2048; local103++) {
			@Pc(323) Class6_Sub2_Sub1_Sub1 local323 = Static171.aClass6_Sub2_Sub1_Sub1Array1[local103];
			if (local323 != null) {
				for (local113 = 0; local113 < 10; local113++) {
					local323.anIntArray536[local113] -= local94;
					local323.anIntArray537[local113] -= local99;
				}
				local323.anInt6062 -= local94 * 128;
				local323.anInt6061 -= local99 * 128;
			}
		}
		@Pc(373) Class80[] local373 = Static118.aClass80Array1;
		for (local113 = 0; local113 < local373.length; local113++) {
			@Pc(381) Class80 local381 = local373[local113];
			if (local381 != null) {
				local381.anInt2463 -= local94 * 128;
				local381.anInt2467 -= local99 * 128;
			}
		}
		Static381.method5197(local94, local99);
		for (@Pc(413) Class4_Sub36 local413 = (Class4_Sub36) Static193.aClass258_48.method5538(); local413 != null; local413 = (Class4_Sub36) Static193.aClass258_48.method5528()) {
			local413.anInt6026 -= local94;
			local413.anInt6039 -= local99;
			if (Static323.anInt5755 != 3 && (local413.anInt6026 < 0 || local413.anInt6039 < 0 || Static126.anInt2569 <= local413.anInt6026 || local413.anInt6039 >= Static190.anInt3697)) {
				local413.method5854();
			}
		}
		if (Static454.anInt7591 != 0) {
			Static52.anInt1390 -= local99;
			Static454.anInt7591 -= local94;
		}
		Static245.method3381();
		if (arg1) {
			Static254.anInt4614 -= local94 * 128;
			Static30.anInt696 -= local99 * 128;
			Static396.anInt6813 -= local99;
			Static420.anInt7596 -= local94;
			Static251.anInt4557 -= local94;
			Static253.anInt4570 -= local99;
			if (Math.abs(local94) > Static126.anInt2569 || Math.abs(local99) > Static190.anInt3697) {
				Static429.method5520();
			}
		} else if (Static134.anInt2621 == 4) {
			Static156.anInt2980 -= local94 * 128;
			Static322.anInt5750 -= local99 * 128;
			Static207.anInt3914 -= local94 * 128;
			Static110.anInt2331 -= local99 * 128;
		} else {
			Static134.anInt2621 = 1;
		}
		Static106.method1669();
		Static307.method5820();
		Static198.aClass258_30.method5527();
		Static332.aClass258_41.method5527();
		Static308.aClass27_7.method734();
		Static444.method5712();
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZIIIII)V")
	public static void method159(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static269.aFrame1 != null && (arg2 != 3 || arg4 != Static126.aClass67_Sub1_1.anInt5860 || arg3 != Static126.aClass67_Sub1_1.anInt5847)) {
			Static387.method5231(Static89.aClass114_3, Static269.aFrame1);
			Static269.aFrame1 = null;
		}
		if (arg2 == 3 && Static269.aFrame1 == null) {
			Static269.aFrame1 = Static189.method2796(0, arg3, Static89.aClass114_3, arg4);
			if (Static269.aFrame1 != null) {
				Static126.aClass67_Sub1_1.anInt5860 = arg4;
				Static126.aClass67_Sub1_1.anInt5847 = arg3;
				Static126.aClass67_Sub1_1.method4528(Static89.aClass114_3);
			}
		}
		if (arg2 == 3 && Static269.aFrame1 == null) {
			method159(true, arg1, Static126.aClass67_Sub1_1.anInt5863, -1, -1);
			return;
		}
		@Pc(96) Container local96;
		@Pc(74) Insets local74;
		if (Static269.aFrame1 != null) {
			Static290.anInt5237 = arg4;
			Static274.anInt4847 = arg3;
			local96 = Static269.aFrame1;
		} else if (Static373.aFrame2 == null) {
			local96 = Static89.aClass114_3.anApplet1;
			Static290.anInt5237 = local96.getSize().width;
			Static274.anInt4847 = local96.getSize().height;
		} else {
			local74 = Static373.aFrame2.getInsets();
			Static290.anInt5237 = Static373.aFrame2.getSize().width - local74.left - local74.right;
			@Pc(92) int local92 = local74.top + local74.bottom;
			Static274.anInt4847 = Static373.aFrame2.getSize().height - local92;
			local96 = Static373.aFrame2;
		}
		@Pc(136) int local136;
		if (arg2 == 1) {
			Static349.anInt6303 = Static410.anInt6809;
			Static76.anInt1789 = 0;
			Static353.anInt6357 = (Static290.anInt5237 - Static200.anInt3847) / 2;
			Static87.anInt1948 = Static200.anInt3847;
		} else if (Static346.anInt6291 < 96 && Static286.anInt5207 == 0) {
			local136 = Static290.anInt5237 > 1024 ? 1024 : Static290.anInt5237;
			Static353.anInt6357 = (Static290.anInt5237 - local136) / 2;
			@Pc(152) int local152 = Static274.anInt4847 > 768 ? 768 : Static274.anInt4847;
			Static87.anInt1948 = local136;
			Static76.anInt1789 = 0;
			Static349.anInt6303 = local152;
		} else {
			Static87.anInt1948 = Static290.anInt5237;
			Static353.anInt6357 = 0;
			Static76.anInt1789 = 0;
			Static349.anInt6303 = Static274.anInt4847;
		}
		if (Static427.aClass239_7 != Static130.aClass239_4) {
			@Pc(194) boolean local194;
			if (Static87.anInt1948 < 1024 && Static349.anInt6303 < 768) {
				local194 = true;
			} else {
				local194 = false;
			}
		}
		if (arg0) {
			Static291.method4052();
		} else {
			Static248.aCanvas5.setSize(Static87.anInt1948, Static349.anInt6303);
			Static16.aClass30_11.method4650(Static248.aCanvas5);
			if (local96 == Static373.aFrame2) {
				local74 = Static373.aFrame2.getInsets();
				Static248.aCanvas5.setLocation(Static353.anInt6357 + local74.left, Static76.anInt1789 + local74.top);
			} else {
				Static248.aCanvas5.setLocation(Static353.anInt6357, Static76.anInt1789);
			}
		}
		if (arg2 < 2) {
			Static51.aBoolean91 = false;
		} else {
			Static51.aBoolean91 = true;
		}
		if (Static404.anInt6892 != -1) {
			Static21.method451(true);
		}
		if (Static223.aClass5_3 != null && (Static73.anInt1749 == 30 || Static73.anInt1749 == 25)) {
			Static425.method5496();
		}
		for (local136 = 0; local136 < 100; local136++) {
			Static26.aBooleanArray2[local136] = true;
		}
		Static70.aBoolean488 = true;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIIIII)V")
	public static void method161(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		for (@Pc(10) Class41_Sub2 local10 = (Class41_Sub2) Static308.aClass27_7.method730(); local10 != null; local10 = (Class41_Sub2) Static308.aClass27_7.method735()) {
			if (local10.anInt4223 <= Static175.anInt3261) {
				local10.method5818();
			} else {
				Static106.method1665((local10.anInt4218 << 7) + 64, arg2 >> 1, arg3 >> 1, local10.anInt4225, (local10.anInt4221 << 7) + 64, local10.anInt4222 * 2);
				Static245.aClass105_4.method5604(0, local10.aString46, local10.anInt4226 | 0xFF000000, arg0 + Static370.anIntArray573[0], Static370.anIntArray573[1] + arg1);
			}
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IZZII)Lclient!ns;")
	public static Class166 method162(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(4) int arg2) {
		@Pc(10) Class113 local10 = null;
		if (Static383.aClass162_4 != null) {
			local10 = new Class113(arg2, Static383.aClass162_4, Static221.aClass162Array3[arg2], 1000000);
		}
		Static216.aClass193_Sub1Array2[arg2] = Static344.aClass73_1.method1675(arg2, local10, Static86.aClass113_7);
		if (arg0) {
			Static216.aClass193_Sub1Array2[arg2].method4432();
		}
		return new Class166(Static216.aClass193_Sub1Array2[arg2], arg1, 1);
	}
}
