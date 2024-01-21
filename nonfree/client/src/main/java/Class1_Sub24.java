import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class Class1_Sub24 extends Class1 {

	@OriginalMember(owner = "client!uc", name = "u", descriptor = "[Lclient!dc;")
	public final Class1_Sub11_Sub1[] aClass1_Sub11_Sub1Array1 = new Class1_Sub11_Sub1[128];

	@OriginalMember(owner = "client!uc", name = "v", descriptor = "[I")
	private int[] anIntArray398 = new int[128];

	@OriginalMember(owner = "client!uc", name = "z", descriptor = "I")
	public final int anInt3819;

	@OriginalMember(owner = "client!uc", name = "A", descriptor = "[S")
	public final short[] aShortArray50 = new short[128];

	@OriginalMember(owner = "client!uc", name = "C", descriptor = "[B")
	public final byte[] aByteArray43 = new byte[128];

	@OriginalMember(owner = "client!uc", name = "E", descriptor = "[B")
	public final byte[] aByteArray44 = new byte[128];

	@OriginalMember(owner = "client!uc", name = "H", descriptor = "[Lclient!w;")
	public final Class88[] aClass88Array1 = new Class88[128];

	@OriginalMember(owner = "client!uc", name = "J", descriptor = "[B")
	public final byte[] aByteArray45 = new byte[128];

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "([B)V")
	public Class1_Sub24(@OriginalArg(0) byte[] arg0) {
		@Pc(36) Class1_Sub8 local36 = new Class1_Sub8(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray3[local36.anInt446 + local38] != 0; local38++) {
		}
		@Pc(52) byte[] local52 = new byte[local38];
		for (@Pc(54) int local54 = 0; local54 < local38; local54++) {
			local52[local54] = local36.method339();
		}
		local36.anInt446++;
		local38++;
		@Pc(75) int local75 = 0;
		@Pc(78) int local78 = local36.anInt446;
		local36.anInt446 += local38;
		while (local36.aByteArray3[local75 + local36.anInt446] != 0) {
			local75++;
		}
		@Pc(101) byte[] local101 = new byte[local75];
		for (@Pc(103) int local103 = 0; local103 < local75; local103++) {
			local101[local103] = local36.method339();
		}
		local36.anInt446++;
		local75++;
		@Pc(125) int local125 = local36.anInt446;
		@Pc(127) int local127 = 0;
		local36.anInt446 += local75;
		while (local36.aByteArray3[local127 + local36.anInt446] != 0) {
			local127++;
		}
		@Pc(147) byte[] local147 = new byte[local127];
		for (@Pc(149) int local149 = 0; local149 < local127; local149++) {
			local147[local149] = local36.method339();
		}
		local36.anInt446++;
		local127++;
		@Pc(175) byte[] local175 = new byte[local127];
		@Pc(180) int local180;
		@Pc(188) int local188;
		@Pc(194) int local194;
		if (local127 > 1) {
			local180 = 2;
			local175[1] = 1;
			@Pc(186) int local186 = 1;
			for (local188 = 2; local188 < local127; local188++) {
				local194 = local36.method336();
				if (local194 == 0) {
					local186 = local180++;
				} else {
					if (local194 <= local186) {
						local194--;
					}
					local186 = local194;
				}
				local175[local188] = (byte) local186;
			}
		} else {
			local180 = local127;
		}
		@Pc(227) Class88[] local227 = new Class88[local180];
		for (local188 = 0; local188 < local227.length; local188++) {
			@Pc(239) Class88 local239 = local227[local188] = new Class88();
			@Pc(243) int local243 = local36.method336();
			if (local243 > 0) {
				local239.aByteArray47 = new byte[local243 * 2];
			}
			local243 = local36.method336();
			if (local243 > 0) {
				local239.aByteArray48 = new byte[local243 * 2 + 2];
				local239.aByteArray48[1] = 64;
			}
		}
		local194 = local36.method336();
		@Pc(288) byte[] local288 = local194 > 0 ? new byte[local194 * 2] : null;
		local194 = local36.method336();
		@Pc(294) int local294;
		for (local294 = 0; local36.aByteArray3[local36.anInt446 + local294] != 0; local294++) {
		}
		@Pc(315) byte[] local315 = local194 <= 0 ? null : new byte[local194 * 2];
		@Pc(318) byte[] local318 = new byte[local294];
		for (@Pc(320) int local320 = 0; local320 < local294; local320++) {
			local318[local320] = local36.method339();
		}
		local294++;
		@Pc(339) int local339 = 0;
		local36.anInt446++;
		for (@Pc(347) int local347 = 0; local347 < 128; local347++) {
			local339 += local36.method336();
			this.aShortArray50[local347] = (short) local339;
		}
		local339 = 0;
		for (@Pc(371) int local371 = 0; local371 < 128; local371++) {
			local339 += local36.method336();
			this.aShortArray50[local371] = (short) (this.aShortArray50[local371] + (local339 << 8));
		}
		@Pc(398) int local398 = 0;
		@Pc(400) int local400 = 0;
		@Pc(402) int local402 = 0;
		for (@Pc(404) int local404 = 0; local404 < 128; local404++) {
			if (local398 == 0) {
				if (local318.length <= local400) {
					local398 = -1;
				} else {
					local398 = local318[local400++];
				}
				local402 = local36.method310();
			}
			this.aShortArray50[local404] = (short) (this.aShortArray50[local404] + ((local402 - 1 & 0x2) << 14));
			local398--;
			this.anIntArray398[local404] = local402;
		}
		local398 = 0;
		local400 = 0;
		@Pc(463) int local463 = 0;
		for (@Pc(465) int local465 = 0; local465 < 128; local465++) {
			if (this.anIntArray398[local465] != 0) {
				if (local398 == 0) {
					if (local52.length <= local400) {
						local398 = -1;
					} else {
						local398 = local52[local400++];
					}
					local463 = local36.aByteArray3[local78++] - 1;
				}
				local398--;
				this.aByteArray44[local465] = (byte) local463;
			}
		}
		local398 = 0;
		local400 = 0;
		@Pc(521) int local521 = 0;
		for (@Pc(523) int local523 = 0; local523 < 128; local523++) {
			if (this.anIntArray398[local523] != 0) {
				if (local398 == 0) {
					local521 = local36.aByteArray3[local125++] + 16 << 2;
					if (local101.length > local400) {
						local398 = local101[local400++];
					} else {
						local398 = -1;
					}
				}
				this.aByteArray43[local523] = (byte) local521;
				local398--;
			}
		}
		@Pc(580) Class88 local580 = null;
		local398 = 0;
		local400 = 0;
		for (@Pc(586) int local586 = 0; local586 < 128; local586++) {
			if (this.anIntArray398[local586] != 0) {
				if (local398 == 0) {
					local580 = local227[local175[local400]];
					if (local147.length <= local400) {
						local398 = -1;
					} else {
						local398 = local147[local400++];
					}
				}
				local398--;
				this.aClass88Array1[local586] = local580;
			}
		}
		local400 = 0;
		local398 = 0;
		@Pc(635) int local635 = 0;
		for (@Pc(637) int local637 = 0; local637 < 128; local637++) {
			if (local398 == 0) {
				if (local318.length <= local400) {
					local398 = -1;
				} else {
					local398 = local318[local400++];
				}
				if (this.anIntArray398[local637] > 0) {
					local635 = local36.method336() + 1;
				}
			}
			local398--;
			this.aByteArray45[local637] = (byte) local635;
		}
		this.anInt3819 = local36.method336() + 1;
		@Pc(698) int local698;
		for (@Pc(687) int local687 = 0; local687 < local180; local687++) {
			@Pc(693) Class88 local693 = local227[local687];
			if (local693.aByteArray47 != null) {
				for (local698 = 1; local698 < local693.aByteArray47.length; local698 += 2) {
					local693.aByteArray47[local698] = local36.method339();
				}
			}
			if (local693.aByteArray48 != null) {
				for (local698 = 3; local698 < local693.aByteArray48.length - 2; local698 += 2) {
					local693.aByteArray48[local698] = local36.method339();
				}
			}
		}
		@Pc(747) int local747;
		if (local288 != null) {
			for (local747 = 1; local747 < local288.length; local747 += 2) {
				local288[local747] = local36.method339();
			}
		}
		if (local315 != null) {
			for (local747 = 1; local747 < local315.length; local747 += 2) {
				local315[local747] = local36.method339();
			}
		}
		@Pc(800) int local800;
		for (local747 = 0; local747 < local180; local747++) {
			@Pc(793) Class88 local793 = local227[local747];
			if (local793.aByteArray48 != null) {
				local339 = 0;
				for (local800 = 2; local800 < local793.aByteArray48.length; local800 += 2) {
					local339 = local36.method336() + local339 + 1;
					local793.aByteArray48[local800] = (byte) local339;
				}
			}
		}
		@Pc(845) int local845;
		for (local698 = 0; local698 < local180; local698++) {
			@Pc(838) Class88 local838 = local227[local698];
			if (local838.aByteArray47 != null) {
				local339 = 0;
				for (local845 = 2; local845 < local838.aByteArray47.length; local845 += 2) {
					local339 = local36.method336() + local339 + 1;
					local838.aByteArray47[local845] = (byte) local339;
				}
			}
		}
		@Pc(922) int local922;
		@Pc(949) int local949;
		@Pc(955) byte local955;
		@Pc(977) int local977;
		@Pc(979) int local979;
		@Pc(989) int local989;
		@Pc(920) byte local920;
		@Pc(1031) int local1031;
		if (local288 != null) {
			local339 = local36.method336();
			local288[0] = (byte) local339;
			for (local800 = 2; local800 < local288.length; local800 += 2) {
				local339 = local36.method336() + local339 + 1;
				local288[local800] = (byte) local339;
			}
			@Pc(916) byte local916 = local288[1];
			local920 = local288[0];
			for (local922 = 0; local922 < local920; local922++) {
				this.aByteArray45[local922] = (byte) (local916 * this.aByteArray45[local922] + 32 >> 6);
			}
			local949 = 2;
			while (local949 < local288.length) {
				local955 = local288[local949];
				@Pc(961) byte local961 = local288[local949 + 1];
				local949 += 2;
				local977 = local916 * (local955 - local920) + (local955 - local920) / 2;
				for (local979 = local920; local979 < local955; local979++) {
					local989 = Static166.method2911(local977, local955 - local920);
					this.aByteArray45[local979] = (byte) (this.aByteArray45[local979] * local989 + 32 >> 6);
					local977 += local961 - local916;
				}
				local916 = local961;
				local920 = local955;
			}
			for (local1031 = local920; local1031 < 128; local1031++) {
				this.aByteArray45[local1031] = (byte) (local916 * this.aByteArray45[local1031] + 32 >> 6);
			}
		}
		@Pc(1099) int local1099;
		if (local315 != null) {
			local339 = local36.method336();
			local315[0] = (byte) local339;
			for (local800 = 2; local800 < local315.length; local800 += 2) {
				local339 = local339 + local36.method336() + 1;
				local315[local800] = (byte) local339;
			}
			local920 = local315[0];
			local1099 = local315[1] << 1;
			for (local922 = 0; local922 < local920; local922++) {
				local949 = local1099 + (this.aByteArray43[local922] & 0xFF);
				if (local949 < 0) {
					local949 = 0;
				}
				if (local949 > 128) {
					local949 = 128;
				}
				this.aByteArray43[local922] = (byte) local949;
			}
			local949 = 2;
			@Pc(1149) int local1149;
			while (local949 < local315.length) {
				local1149 = local315[local949 + 1] << 1;
				local955 = local315[local949];
				local977 = local1099 * (local955 - local920) + (local955 - local920) / 2;
				for (local979 = local920; local979 < local955; local979++) {
					local989 = Static166.method2911(local977, local955 - local920);
					@Pc(1187) int local1187 = (this.aByteArray43[local979] & 0xFF) + local989;
					if (local1187 < 0) {
						local1187 = 0;
					}
					local977 += local1149 - local1099;
					if (local1187 > 128) {
						local1187 = 128;
					}
					this.aByteArray43[local979] = (byte) local1187;
				}
				local920 = local955;
				local949 += 2;
				local1099 = local1149;
			}
			for (local1031 = local920; local1031 < 128; local1031++) {
				local1149 = (this.aByteArray43[local1031] & 0xFF) + local1099;
				if (local1149 < 0) {
					local1149 = 0;
				}
				if (local1149 > 128) {
					local1149 = 128;
				}
				this.aByteArray43[local1031] = (byte) local1149;
			}
		}
		for (local800 = 0; local800 < local180; local800++) {
			local227[local800].anInt4045 = local36.method336();
		}
		for (local845 = 0; local845 < local180; local845++) {
			@Pc(1296) Class88 local1296 = local227[local845];
			if (local1296.aByteArray47 != null) {
				local1296.anInt4047 = local36.method336();
			}
			if (local1296.aByteArray48 != null) {
				local1296.anInt4044 = local36.method336();
			}
			if (local1296.anInt4045 > 0) {
				local1296.anInt4050 = local36.method336();
			}
		}
		for (local1099 = 0; local1099 < local180; local1099++) {
			local227[local1099].anInt4052 = local36.method336();
		}
		for (local922 = 0; local922 < local180; local922++) {
			@Pc(1351) Class88 local1351 = local227[local922];
			if (local1351.anInt4052 > 0) {
				local1351.anInt4048 = local36.method336();
			}
		}
		for (local949 = 0; local949 < local180; local949++) {
			@Pc(1378) Class88 local1378 = local227[local949];
			if (local1378.anInt4048 > 0) {
				local1378.anInt4049 = local36.method336();
			}
		}
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(Z)V")
	public void method2907() {
		this.anIntArray398 = null;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILclient!ag;[I[B)Z")
	public boolean method2909(@OriginalArg(1) Class4 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(9) Class1_Sub11_Sub1 local9 = null;
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
			if (arg2 == null || arg2[local18] != 0) {
				@Pc(30) int local30 = this.anIntArray398[local18];
				if (local30 != 0) {
					if (local30 != local16) {
						local16 = local30--;
						if ((local30 & 0x1) == 0) {
							local9 = arg0.method126(arg1, local30 >> 2);
						} else {
							local9 = arg0.method131(arg1, local30 >> 2);
						}
						if (local9 == null) {
							local7 = false;
						}
					}
					if (local9 != null) {
						this.aClass1_Sub11_Sub1Array1[local18] = local9;
						this.anIntArray398[local18] = 0;
					}
				}
			}
		}
		return local7;
	}
}
