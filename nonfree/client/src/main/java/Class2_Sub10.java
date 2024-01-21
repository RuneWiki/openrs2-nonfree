import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!id")
public final class Class2_Sub10 extends Class2 {

	@OriginalMember(owner = "client!id", name = "y", descriptor = "[I")
	private int[] anIntArray262 = new int[128];

	@OriginalMember(owner = "client!id", name = "A", descriptor = "[B")
	public final byte[] aByteArray30 = new byte[128];

	@OriginalMember(owner = "client!id", name = "D", descriptor = "I")
	public final int anInt2339;

	@OriginalMember(owner = "client!id", name = "F", descriptor = "[S")
	public final short[] aShortArray43;

	@OriginalMember(owner = "client!id", name = "G", descriptor = "[Lclient!oa;")
	public final Class2_Sub16_Sub1[] aClass2_Sub16_Sub1Array1 = new Class2_Sub16_Sub1[128];

	@OriginalMember(owner = "client!id", name = "H", descriptor = "[Lclient!fi;")
	public final Class28[] aClass28Array1 = new Class28[128];

	@OriginalMember(owner = "client!id", name = "I", descriptor = "[B")
	public final byte[] aByteArray31;

	@OriginalMember(owner = "client!id", name = "J", descriptor = "[B")
	public final byte[] aByteArray32;

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "([B)V")
	public Class2_Sub10(@OriginalArg(0) byte[] arg0) {
		@Pc(21) int local21 = 0;
		this.aByteArray32 = new byte[128];
		this.aShortArray43 = new short[128];
		this.aByteArray31 = new byte[128];
		@Pc(38) Class2_Sub3 local38 = new Class2_Sub3(arg0);
		while (local38.aByteArray4[local21 + local38.anInt273] != 0) {
			local21++;
		}
		@Pc(52) byte[] local52 = new byte[local21];
		for (@Pc(54) int local54 = 0; local54 < local21; local54++) {
			local52[local54] = local38.method227();
		}
		local38.anInt273++;
		@Pc(74) int local74 = 0;
		local21++;
		@Pc(78) int local78 = local38.anInt273;
		local38.anInt273 += local21;
		while (local38.aByteArray4[local74 + local38.anInt273] != 0) {
			local74++;
		}
		@Pc(98) byte[] local98 = new byte[local74];
		for (@Pc(100) int local100 = 0; local100 < local74; local100++) {
			local98[local100] = local38.method227();
		}
		local74++;
		local38.anInt273++;
		@Pc(122) int local122 = local38.anInt273;
		local38.anInt273 += local74;
		@Pc(130) int local130;
		for (local130 = 0; local38.aByteArray4[local130 + local38.anInt273] != 0; local130++) {
		}
		@Pc(147) byte[] local147 = new byte[local130];
		for (@Pc(149) int local149 = 0; local149 < local130; local149++) {
			local147[local149] = local38.method227();
		}
		local130++;
		local38.anInt273++;
		@Pc(175) byte[] local175 = new byte[local130];
		@Pc(182) int local182;
		@Pc(194) int local194;
		@Pc(200) int local200;
		if (local130 <= 1) {
			local182 = local130;
		} else {
			local182 = 2;
			local175[1] = 1;
			@Pc(192) int local192 = 1;
			for (local194 = 2; local194 < local130; local194++) {
				local200 = local38.method218();
				if (local200 == 0) {
					local192 = local182++;
				} else {
					if (local192 >= local200) {
						local200--;
					}
					local192 = local200;
				}
				local175[local194] = (byte) local192;
			}
		}
		@Pc(229) Class28[] local229 = new Class28[local182];
		for (local194 = 0; local194 < local229.length; local194++) {
			@Pc(241) Class28 local241 = local229[local194] = new Class28();
			@Pc(245) int local245 = local38.method218();
			if (local245 > 0) {
				local241.aByteArray20 = new byte[local245 * 2];
			}
			local245 = local38.method218();
			if (local245 > 0) {
				local241.aByteArray21 = new byte[local245 * 2 + 2];
				local241.aByteArray21[1] = 64;
			}
		}
		local200 = local38.method218();
		@Pc(289) int local289 = 0;
		@Pc(298) byte[] local298 = local200 <= 0 ? null : new byte[local200 * 2];
		local200 = local38.method218();
		while (local38.aByteArray4[local289 + local38.anInt273] != 0) {
			local289++;
		}
		@Pc(316) byte[] local316 = new byte[local289];
		for (@Pc(318) int local318 = 0; local318 < local289; local318++) {
			local316[local318] = local38.method227();
		}
		@Pc(346) byte[] local346 = local200 <= 0 ? null : new byte[local200 * 2];
		local38.anInt273++;
		local289++;
		@Pc(355) int local355 = 0;
		for (@Pc(357) int local357 = 0; local357 < 128; local357++) {
			local355 += local38.method218();
			this.aShortArray43[local357] = (short) local355;
		}
		local355 = 0;
		for (@Pc(381) int local381 = 0; local381 < 128; local381++) {
			local355 += local38.method218();
			this.aShortArray43[local381] = (short) (this.aShortArray43[local381] + (local355 << 8));
		}
		@Pc(406) int local406 = 0;
		@Pc(408) int local408 = 0;
		@Pc(410) int local410 = 0;
		for (@Pc(412) int local412 = 0; local412 < 128; local412++) {
			if (local406 == 0) {
				if (local408 >= local316.length) {
					local406 = -1;
				} else {
					local406 = local316[local408++];
				}
				local410 = local38.method210();
			}
			this.aShortArray43[local412] = (short) (this.aShortArray43[local412] + ((local410 - 1 & 0x2) << 14));
			this.anIntArray262[local412] = local410;
			local406--;
		}
		local408 = 0;
		local406 = 0;
		@Pc(470) int local470 = 0;
		for (@Pc(472) int local472 = 0; local472 < 128; local472++) {
			if (this.anIntArray262[local472] != 0) {
				if (local406 == 0) {
					if (local408 >= local52.length) {
						local406 = -1;
					} else {
						local406 = local52[local408++];
					}
					local470 = local38.aByteArray4[local78++] - 1;
				}
				this.aByteArray30[local472] = (byte) local470;
				local406--;
			}
		}
		local408 = 0;
		@Pc(525) int local525 = 0;
		local406 = 0;
		for (@Pc(529) int local529 = 0; local529 < 128; local529++) {
			if (this.anIntArray262[local529] != 0) {
				if (local406 == 0) {
					if (local408 < local98.length) {
						local406 = local98[local408++];
					} else {
						local406 = -1;
					}
					local525 = local38.aByteArray4[local122++] + 16 << 2;
				}
				local406--;
				this.aByteArray32[local529] = (byte) local525;
			}
		}
		local406 = 0;
		@Pc(585) Class28 local585 = null;
		local408 = 0;
		for (@Pc(589) int local589 = 0; local589 < 128; local589++) {
			if (this.anIntArray262[local589] != 0) {
				if (local406 == 0) {
					local585 = local229[local175[local408]];
					if (local408 < local147.length) {
						local406 = local147[local408++];
					} else {
						local406 = -1;
					}
				}
				this.aClass28Array1[local589] = local585;
				local406--;
			}
		}
		local408 = 0;
		local406 = 0;
		@Pc(632) int local632 = 0;
		for (@Pc(634) int local634 = 0; local634 < 128; local634++) {
			if (local406 == 0) {
				if (local408 < local316.length) {
					local406 = local316[local408++];
				} else {
					local406 = -1;
				}
				if (this.anIntArray262[local634] > 0) {
					local632 = local38.method218() + 1;
				}
			}
			this.aByteArray31[local634] = (byte) local632;
			local406--;
		}
		this.anInt2339 = local38.method218() + 1;
		@Pc(703) int local703;
		for (@Pc(692) int local692 = 0; local692 < local182; local692++) {
			@Pc(698) Class28 local698 = local229[local692];
			if (local698.aByteArray20 != null) {
				for (local703 = 1; local703 < local698.aByteArray20.length; local703 += 2) {
					local698.aByteArray20[local703] = local38.method227();
				}
			}
			if (local698.aByteArray21 != null) {
				for (local703 = 3; local703 < local698.aByteArray21.length - 2; local703 += 2) {
					local698.aByteArray21[local703] = local38.method227();
				}
			}
		}
		@Pc(756) int local756;
		if (local298 != null) {
			for (local756 = 1; local756 < local298.length; local756 += 2) {
				local298[local756] = local38.method227();
			}
		}
		if (local346 != null) {
			for (local756 = 1; local756 < local346.length; local756 += 2) {
				local346[local756] = local38.method227();
			}
		}
		@Pc(805) int local805;
		for (local756 = 0; local756 < local182; local756++) {
			@Pc(798) Class28 local798 = local229[local756];
			if (local798.aByteArray21 != null) {
				local355 = 0;
				for (local805 = 2; local805 < local798.aByteArray21.length; local805 += 2) {
					local355 = local38.method218() + local355 + 1;
					local798.aByteArray21[local805] = (byte) local355;
				}
			}
		}
		@Pc(850) int local850;
		for (local703 = 0; local703 < local182; local703++) {
			@Pc(843) Class28 local843 = local229[local703];
			if (local843.aByteArray20 != null) {
				local355 = 0;
				for (local850 = 2; local850 < local843.aByteArray20.length; local850 += 2) {
					local355 = local38.method218() + local355 + 1;
					local843.aByteArray20[local850] = (byte) local355;
				}
			}
		}
		@Pc(924) int local924;
		@Pc(947) int local947;
		@Pc(959) byte local959;
		@Pc(973) int local973;
		@Pc(975) int local975;
		@Pc(985) int local985;
		@Pc(918) byte local918;
		@Pc(1028) int local1028;
		if (local298 != null) {
			local355 = local38.method218();
			local298[0] = (byte) local355;
			for (local805 = 2; local805 < local298.length; local805 += 2) {
				local355 = local355 + local38.method218() + 1;
				local298[local805] = (byte) local355;
			}
			local918 = local298[0];
			@Pc(922) byte local922 = local298[1];
			for (local924 = 0; local924 < local918; local924++) {
				this.aByteArray31[local924] = (byte) (this.aByteArray31[local924] * local922 + 32 >> 6);
			}
			local947 = 2;
			while (local947 < local298.length) {
				@Pc(955) byte local955 = local298[local947 + 1];
				local959 = local298[local947];
				local973 = local922 * (local959 - local918) + (local959 - local918) / 2;
				for (local975 = local918; local975 < local959; local975++) {
					local985 = Static85.method1992(local959 - local918, local973);
					local973 += local955 - local922;
					this.aByteArray31[local975] = (byte) (local985 * this.aByteArray31[local975] + 32 >> 6);
				}
				local947 += 2;
				local918 = local959;
				local922 = local955;
			}
			for (local1028 = local918; local1028 < 128; local1028++) {
				this.aByteArray31[local1028] = (byte) (this.aByteArray31[local1028] * local922 + 32 >> 6);
			}
		}
		@Pc(1094) int local1094;
		if (local346 != null) {
			local355 = local38.method218();
			local346[0] = (byte) local355;
			for (local805 = 2; local805 < local346.length; local805 += 2) {
				local355 += local38.method218() + 1;
				local346[local805] = (byte) local355;
			}
			local918 = local346[0];
			local1094 = local346[1] << 1;
			for (local924 = 0; local924 < local918; local924++) {
				local947 = (this.aByteArray32[local924] & 0xFF) + local1094;
				if (local947 < 0) {
					local947 = 0;
				}
				if (local947 > 128) {
					local947 = 128;
				}
				this.aByteArray32[local924] = (byte) local947;
			}
			@Pc(1139) int local1139;
			for (local947 = 2; local947 < local346.length; local947 += 2) {
				local1139 = local346[local947 + 1] << 1;
				local959 = local346[local947];
				local973 = (local959 - local918) / 2 + (local959 - local918) * local1094;
				for (local975 = local918; local975 < local959; local975++) {
					local985 = Static85.method1992(local959 - local918, local973);
					@Pc(1177) int local1177 = local985 + (this.aByteArray32[local975] & 0xFF);
					local973 += local1139 - local1094;
					if (local1177 < 0) {
						local1177 = 0;
					}
					if (local1177 > 128) {
						local1177 = 128;
					}
					this.aByteArray32[local975] = (byte) local1177;
				}
				local1094 = local1139;
				local918 = local959;
			}
			for (local1028 = local918; local1028 < 128; local1028++) {
				local1139 = local1094 + (this.aByteArray32[local1028] & 0xFF);
				if (local1139 < 0) {
					local1139 = 0;
				}
				if (local1139 > 128) {
					local1139 = 128;
				}
				this.aByteArray32[local1028] = (byte) local1139;
			}
		}
		for (local805 = 0; local805 < local182; local805++) {
			local229[local805].anInt1785 = local38.method218();
		}
		for (local850 = 0; local850 < local182; local850++) {
			@Pc(1269) Class28 local1269 = local229[local850];
			if (local1269.aByteArray20 != null) {
				local1269.anInt1796 = local38.method218();
			}
			if (local1269.aByteArray21 != null) {
				local1269.anInt1787 = local38.method218();
			}
			if (local1269.anInt1785 > 0) {
				local1269.anInt1789 = local38.method218();
			}
		}
		for (local1094 = 0; local1094 < local182; local1094++) {
			local229[local1094].anInt1794 = local38.method218();
		}
		for (local924 = 0; local924 < local182; local924++) {
			@Pc(1328) Class28 local1328 = local229[local924];
			if (local1328.anInt1794 > 0) {
				local1328.anInt1791 = local38.method218();
			}
		}
		for (local947 = 0; local947 < local182; local947++) {
			@Pc(1352) Class28 local1352 = local229[local947];
			if (local1352.anInt1791 > 0) {
				local1352.anInt1792 = local38.method218();
			}
		}
	}

	@OriginalMember(owner = "client!id", name = "d", descriptor = "(I)V")
	public void method1863() {
		this.anIntArray262 = null;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "([BILclient!oe;[I)Z")
	public boolean method1865(@OriginalArg(0) byte[] arg0, @OriginalArg(2) Class62 arg1, @OriginalArg(3) int[] arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(9) int local9 = 0;
		@Pc(11) Class2_Sub16_Sub1 local11 = null;
		for (@Pc(13) int local13 = 0; local13 < 128; local13++) {
			if (arg0 == null || arg0[local13] != 0) {
				@Pc(36) int local36 = this.anIntArray262[local13];
				if (local36 != 0) {
					if (local36 != local9) {
						local9 = local36--;
						if ((local36 & 0x1) == 0) {
							local11 = arg1.method2740(arg2, local36 >> 2);
						} else {
							local11 = arg1.method2737(arg2, local36 >> 2);
						}
						if (local11 == null) {
							local7 = false;
						}
					}
					if (local11 != null) {
						this.aClass2_Sub16_Sub1Array1[local13] = local11;
						this.anIntArray262[local13] = 0;
					}
				}
			}
		}
		return local7;
	}
}
