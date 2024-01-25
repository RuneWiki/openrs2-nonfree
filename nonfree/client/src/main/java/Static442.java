import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static442 {

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "(Z)V")
	public static void method6162() {
		Static427.anInt7540 = 0;
		Static4.anInt41 = 0;
		Static346.method5020();
		Static29.method5863();
		method6164();
		@Pc(17) boolean local17 = false;
		@Pc(25) int local25;
		for (@Pc(19) int local19 = 0; local19 < Static4.anInt41; local19++) {
			local25 = Static370.anIntArray352[local19];
			@Pc(32) Class3_Sub39 local32 = (Class3_Sub39) Static581.aClass297_39.method6531((long) local25);
			@Pc(35) Class25_Sub2_Sub2_Sub5_Sub2 local35 = local32.aClass25_Sub2_Sub2_Sub5_Sub2_2;
			if (Static289.aBoolean370 && Static384.method5342(local25)) {
				Static314.method4678();
			}
			if (Static397.anInt6998 != local35.anInt8550) {
				if (local35.aClass213_1.method5006()) {
					Static202.method3488(local35);
				}
				local35.method6690(null);
				local32.method8128();
				local17 = true;
			}
		}
		if (local17) {
			Static238.anInt4737 = Static581.aClass297_39.method6528();
			Static581.aClass297_39.method6536(Static33.aClass3_Sub39Array1);
		}
		if (Static42.anInt1159 != Static455.aClass3_Sub26_Sub1_2.anInt8703) {
			throw new RuntimeException("gnp1 pos:" + Static455.aClass3_Sub26_Sub1_2.anInt8703 + " psize:" + Static42.anInt1159);
		}
		for (local25 = 0; local25 < Static60.anInt1599; local25++) {
			if (Static581.aClass297_39.method6531((long) Static529.anIntArray535[local25]) == null) {
				throw new RuntimeException("gnp2 pos:" + local25 + " size:" + Static60.anInt1599);
			}
		}
	}

	@OriginalMember(owner = "client!qn", name = "e", descriptor = "(I)V")
	private static void method6164() {
		for (@Pc(7) int local7 = 0; local7 < Static427.anInt7540; local7++) {
			@Pc(13) int local13 = Static105.anIntArray86[local7];
			@Pc(21) Class25_Sub2_Sub2_Sub5_Sub2 local21 = ((Class3_Sub39) Static581.aClass297_39.method6531((long) local13)).aClass25_Sub2_Sub2_Sub5_Sub2_2;
			@Pc(27) int local27 = Static455.aClass3_Sub26_Sub1_2.method6814();
			if ((local27 & 0x40) != 0) {
				local27 += Static455.aClass3_Sub26_Sub1_2.method6814() << 8;
			}
			@Pc(47) int local47;
			if ((local27 & 0x200) != 0) {
				local47 = Static455.aClass3_Sub26_Sub1_2.method6822();
				local21.anInt8571 = Static455.aClass3_Sub26_Sub1_2.method6821();
				local21.anInt8563 = Static455.aClass3_Sub26_Sub1_2.method6819();
				local21.anInt8573 = local47 & 0x7FFF;
				local21.aBoolean577 = (local47 & 0x8000) != 0;
				local21.anInt8535 = local21.anInt8573 + Static397.anInt6998 + local21.anInt8571;
			}
			if ((local27 & 0x2) != 0) {
				if (local21.aClass213_1.method5006()) {
					Static202.method3488(local21);
				}
				local21.method6690(Static181.aClass60_1.method1797(Static455.aClass3_Sub26_Sub1_2.method6811()));
				local21.method6673(local21.aClass213_1.anInt6196);
				local21.anInt8506 = local21.aClass213_1.anInt6186 << 3;
				if (local21.aClass213_1.method5006()) {
					Static138.method2725(local21.anIntArray513[0], null, local21, local21.anIntArray512[0], 0, local21.aByte117, null);
				}
			}
			if ((local27 & 0x8) != 0) {
				local21.anInt8536 = Static455.aClass3_Sub26_Sub1_2.method6783();
				if (local21.anInt8536 == 65535) {
					local21.anInt8536 = -1;
				}
			}
			if ((local27 & 0x4) != 0) {
				local21.aString229 = Static455.aClass3_Sub26_Sub1_2.method6786();
				local21.anInt8569 = 100;
			}
			if ((local27 & 0x800) != 0) {
				local21.aByte120 = Static455.aClass3_Sub26_Sub1_2.method6775();
				local21.aByte121 = Static455.aClass3_Sub26_Sub1_2.method6825();
				local21.aByte123 = Static455.aClass3_Sub26_Sub1_2.method6792();
				local21.aByte122 = (byte) Static455.aClass3_Sub26_Sub1_2.method6814();
				local21.anInt8530 = Static397.anInt6998 + Static455.aClass3_Sub26_Sub1_2.method6812();
				local21.anInt8510 = Static397.anInt6998 + Static455.aClass3_Sub26_Sub1_2.method6783();
			}
			@Pc(227) int local227;
			if ((local27 & 0x1000) != 0) {
				local47 = Static455.aClass3_Sub26_Sub1_2.method6832();
				local227 = Static455.aClass3_Sub26_Sub1_2.method6777();
				local21.method6684(local227, Static397.anInt6998, local47);
			}
			@Pc(254) int local254;
			if ((local27 & 0x80) != 0) {
				local47 = Static455.aClass3_Sub26_Sub1_2.method6811();
				if (local47 == 65535) {
					local47 = -1;
				}
				local227 = Static455.aClass3_Sub26_Sub1_2.method6774();
				local254 = Static455.aClass3_Sub26_Sub1_2.method6819();
				local21.method6682(local254, local47, false, local227);
			}
			if ((local27 & 0x2000) != 0) {
				local47 = Static455.aClass3_Sub26_Sub1_2.method6822();
				if (local47 == 65535) {
					local47 = -1;
				}
				local227 = Static455.aClass3_Sub26_Sub1_2.method6785();
				local254 = Static455.aClass3_Sub26_Sub1_2.method6819();
				local21.method6682(local254, local47, true, local227);
			}
			@Pc(318) int local318;
			@Pc(327) int local327;
			@Pc(307) int[] local307;
			@Pc(310) int[] local310;
			if ((local27 & 0x4000) != 0) {
				local47 = Static455.aClass3_Sub26_Sub1_2.method6821();
				local307 = new int[local47];
				local310 = new int[local47];
				for (@Pc(312) int local312 = 0; local312 < local47; local312++) {
					local318 = Static455.aClass3_Sub26_Sub1_2.method6811();
					if ((local318 & 0xC000) == 49152) {
						local327 = Static455.aClass3_Sub26_Sub1_2.method6811();
						local307[local312] = local327 | local318 << 16;
					} else {
						local307[local312] = local318;
					}
					local310[local312] = Static455.aClass3_Sub26_Sub1_2.method6811();
				}
				local21.method6676(local310, local307);
			}
			if ((local27 & 0x400) != 0) {
				local21.anInt8553 = Static455.aClass3_Sub26_Sub1_2.method6792();
				local21.anInt8546 = Static455.aClass3_Sub26_Sub1_2.method6825();
				local21.anInt8556 = Static455.aClass3_Sub26_Sub1_2.method6775();
				local21.anInt8532 = Static455.aClass3_Sub26_Sub1_2.method6792();
				local21.anInt8533 = Static455.aClass3_Sub26_Sub1_2.method6822() + Static397.anInt6998;
				local21.anInt8493 = Static455.aClass3_Sub26_Sub1_2.method6783() + Static397.anInt6998;
				local21.anInt8514 = Static455.aClass3_Sub26_Sub1_2.method6814();
				local21.anInt8556 += local21.anIntArray512[0];
				local21.anInt8578 = 0;
				local21.anInt8532 += local21.anIntArray513[0];
				local21.anInt8580 = 1;
				local21.anInt8546 += local21.anIntArray513[0];
				local21.anInt8553 += local21.anIntArray512[0];
			}
			if ((local27 & 0x100) != 0) {
				local47 = Static455.aClass3_Sub26_Sub1_2.method6821();
				local307 = new int[local47];
				local310 = new int[local47];
				@Pc(463) int[] local463 = new int[local47];
				for (local318 = 0; local318 < local47; local318++) {
					local327 = Static455.aClass3_Sub26_Sub1_2.method6822();
					if (local327 == 65535) {
						local327 = -1;
					}
					local307[local318] = local327;
					local310[local318] = Static455.aClass3_Sub26_Sub1_2.method6777();
					local463[local318] = Static455.aClass3_Sub26_Sub1_2.method6811();
				}
				Static90.method1966(local463, local21, local307, local310);
			}
			if ((local27 & 0x20) != 0) {
				@Pc(516) int[] local516 = new int[4];
				for (local227 = 0; local227 < 4; local227++) {
					local516[local227] = Static455.aClass3_Sub26_Sub1_2.method6783();
					if (local516[local227] == 65535) {
						local516[local227] = -1;
					}
				}
				local254 = Static455.aClass3_Sub26_Sub1_2.method6819();
				Static447.method6196(local254, local21, local516);
			}
			if ((local27 & 0x10) != 0) {
				local47 = Static455.aClass3_Sub26_Sub1_2.method6832();
				local227 = Static455.aClass3_Sub26_Sub1_2.method6777();
				local21.method6684(local227, Static397.anInt6998, local47);
				local21.anInt8523 = Static397.anInt6998 + 300;
				local21.anInt8519 = Static455.aClass3_Sub26_Sub1_2.method6777();
			}
			if ((local27 & 0x1) != 0) {
				local21.anInt8584 = Static455.aClass3_Sub26_Sub1_2.method6812();
				local21.anInt8601 = Static455.aClass3_Sub26_Sub1_2.method6783();
			}
		}
	}
}
