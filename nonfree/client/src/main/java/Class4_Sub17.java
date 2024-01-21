import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mh")
public final class Class4_Sub17 extends Class4 {

	@OriginalMember(owner = "client!mh", name = "s", descriptor = "[S")
	public final short[] aShortArray33 = new short[128];

	@OriginalMember(owner = "client!mh", name = "x", descriptor = "[B")
	public final byte[] aByteArray32 = new byte[128];

	@OriginalMember(owner = "client!mh", name = "B", descriptor = "[Lclient!of;")
	public final Class67[] aClass67Array1 = new Class67[128];

	@OriginalMember(owner = "client!mh", name = "D", descriptor = "[Lclient!vf;")
	public final Class4_Sub12_Sub1[] aClass4_Sub12_Sub1Array1 = new Class4_Sub12_Sub1[128];

	@OriginalMember(owner = "client!mh", name = "I", descriptor = "I")
	public final int anInt2731;

	@OriginalMember(owner = "client!mh", name = "J", descriptor = "[I")
	private int[] anIntArray254 = new int[128];

	@OriginalMember(owner = "client!mh", name = "K", descriptor = "[B")
	public final byte[] aByteArray33 = new byte[128];

	@OriginalMember(owner = "client!mh", name = "M", descriptor = "[B")
	public final byte[] aByteArray34 = new byte[128];

	@OriginalMember(owner = "client!mh", name = "<init>", descriptor = "([B)V")
	public Class4_Sub17(@OriginalArg(0) byte[] arg0) {
		@Pc(33) int local33 = 0;
		@Pc(38) Class4_Sub11 local38 = new Class4_Sub11(arg0);
		while (local38.aByteArray19[local33 + local38.anInt1597] != 0) {
			local33++;
		}
		@Pc(52) byte[] local52 = new byte[local33];
		for (@Pc(54) int local54 = 0; local54 < local33; local54++) {
			local52[local54] = local38.method1241();
		}
		local33++;
		local38.anInt1597++;
		@Pc(76) int local76 = local38.anInt1597;
		local38.anInt1597 += local33;
		@Pc(84) int local84;
		for (local84 = 0; local38.aByteArray19[local84 + local38.anInt1597] != 0; local84++) {
		}
		@Pc(101) byte[] local101 = new byte[local84];
		for (@Pc(103) int local103 = 0; local103 < local84; local103++) {
			local101[local103] = local38.method1241();
		}
		local84++;
		local38.anInt1597++;
		@Pc(125) int local125 = local38.anInt1597;
		local38.anInt1597 += local84;
		@Pc(133) int local133;
		for (local133 = 0; local38.aByteArray19[local133 + local38.anInt1597] != 0; local133++) {
		}
		@Pc(150) byte[] local150 = new byte[local133];
		for (@Pc(152) int local152 = 0; local152 < local133; local152++) {
			local150[local152] = local38.method1241();
		}
		local38.anInt1597++;
		local133++;
		@Pc(174) byte[] local174 = new byte[local133];
		@Pc(187) int local187;
		@Pc(189) int local189;
		@Pc(195) int local195;
		if (local133 > 1) {
			@Pc(181) int local181 = 1;
			local174[1] = 1;
			local187 = 2;
			for (local189 = 2; local189 < local133; local189++) {
				local195 = local38.method1253();
				if (local195 == 0) {
					local181 = local187++;
				} else {
					if (local181 >= local195) {
						local195--;
					}
					local181 = local195;
				}
				local174[local189] = (byte) local181;
			}
		} else {
			local187 = local133;
		}
		@Pc(227) Class67[] local227 = new Class67[local187];
		for (local189 = 0; local189 < local227.length; local189++) {
			@Pc(239) Class67 local239 = local227[local189] = new Class67();
			@Pc(243) int local243 = local38.method1253();
			if (local243 > 0) {
				local239.aByteArray36 = new byte[local243 * 2];
			}
			local243 = local38.method1253();
			if (local243 > 0) {
				local239.aByteArray35 = new byte[local243 * 2 + 2];
				local239.aByteArray35[1] = 64;
			}
		}
		local195 = local38.method1253();
		@Pc(294) byte[] local294 = local195 > 0 ? new byte[local195 * 2] : null;
		local195 = local38.method1253();
		@Pc(300) int local300 = 0;
		@Pc(309) byte[] local309 = local195 <= 0 ? null : new byte[local195 * 2];
		while (local38.aByteArray19[local300 + local38.anInt1597] != 0) {
			local300++;
		}
		@Pc(326) byte[] local326 = new byte[local300];
		for (@Pc(328) int local328 = 0; local328 < local300; local328++) {
			local326[local328] = local38.method1241();
		}
		local300++;
		local38.anInt1597++;
		@Pc(353) int local353 = 0;
		for (@Pc(355) int local355 = 0; local355 < 128; local355++) {
			local353 += local38.method1253();
			this.aShortArray33[local355] = (short) local353;
		}
		local353 = 0;
		for (@Pc(377) int local377 = 0; local377 < 128; local377++) {
			local353 += local38.method1253();
			this.aShortArray33[local377] = (short) (this.aShortArray33[local377] + (local353 << 8));
		}
		@Pc(404) int local404 = 0;
		@Pc(406) int local406 = 0;
		@Pc(408) int local408 = 0;
		for (@Pc(410) int local410 = 0; local410 < 128; local410++) {
			if (local404 == 0) {
				if (local406 < local326.length) {
					local404 = local326[local406++];
				} else {
					local404 = -1;
				}
				local408 = local38.method1259();
			}
			local404--;
			this.aShortArray33[local410] = (short) (this.aShortArray33[local410] + ((local408 - 1 & 0x2) << 14));
			this.anIntArray254[local410] = local408;
		}
		local404 = 0;
		local406 = 0;
		@Pc(464) int local464 = 0;
		for (@Pc(466) int local466 = 0; local466 < 128; local466++) {
			if (this.anIntArray254[local466] != 0) {
				if (local404 == 0) {
					local464 = local38.aByteArray19[local76++] - 1;
					if (local406 >= local52.length) {
						local404 = -1;
					} else {
						local404 = local52[local406++];
					}
				}
				local404--;
				this.aByteArray32[local466] = (byte) local464;
			}
		}
		local404 = 0;
		local406 = 0;
		@Pc(518) int local518 = 0;
		for (@Pc(520) int local520 = 0; local520 < 128; local520++) {
			if (this.anIntArray254[local520] != 0) {
				if (local404 == 0) {
					local518 = local38.aByteArray19[local125++] + 16 << 2;
					if (local101.length > local406) {
						local404 = local101[local406++];
					} else {
						local404 = -1;
					}
				}
				local404--;
				this.aByteArray33[local520] = (byte) local518;
			}
		}
		local404 = 0;
		local406 = 0;
		@Pc(572) Class67 local572 = null;
		for (@Pc(574) int local574 = 0; local574 < 128; local574++) {
			if (this.anIntArray254[local574] != 0) {
				if (local404 == 0) {
					local572 = local227[local174[local406]];
					if (local406 < local150.length) {
						local404 = local150[local406++];
					} else {
						local404 = -1;
					}
				}
				local404--;
				this.aClass67Array1[local574] = local572;
			}
		}
		local406 = 0;
		local404 = 0;
		@Pc(626) int local626 = 0;
		for (@Pc(628) int local628 = 0; local628 < 128; local628++) {
			if (local404 == 0) {
				if (local326.length > local406) {
					local404 = local326[local406++];
				} else {
					local404 = -1;
				}
				if (this.anIntArray254[local628] > 0) {
					local626 = local38.method1253() + 1;
				}
			}
			local404--;
			this.aByteArray34[local628] = (byte) local626;
		}
		this.anInt2731 = local38.method1253() + 1;
		@Pc(690) int local690;
		for (@Pc(679) int local679 = 0; local679 < local187; local679++) {
			@Pc(685) Class67 local685 = local227[local679];
			if (local685.aByteArray36 != null) {
				for (local690 = 1; local690 < local685.aByteArray36.length; local690 += 2) {
					local685.aByteArray36[local690] = local38.method1241();
				}
			}
			if (local685.aByteArray35 != null) {
				for (local690 = 3; local690 < local685.aByteArray35.length - 2; local690 += 2) {
					local685.aByteArray35[local690] = local38.method1241();
				}
			}
		}
		@Pc(739) int local739;
		if (local294 != null) {
			for (local739 = 1; local739 < local294.length; local739 += 2) {
				local294[local739] = local38.method1241();
			}
		}
		if (local309 != null) {
			for (local739 = 1; local739 < local309.length; local739 += 2) {
				local309[local739] = local38.method1241();
			}
		}
		@Pc(788) int local788;
		for (local739 = 0; local739 < local187; local739++) {
			@Pc(781) Class67 local781 = local227[local739];
			if (local781.aByteArray35 != null) {
				local353 = 0;
				for (local788 = 2; local788 < local781.aByteArray35.length; local788 += 2) {
					local353 = local38.method1253() + local353 + 1;
					local781.aByteArray35[local788] = (byte) local353;
				}
			}
		}
		@Pc(833) int local833;
		for (local690 = 0; local690 < local187; local690++) {
			@Pc(826) Class67 local826 = local227[local690];
			if (local826.aByteArray36 != null) {
				local353 = 0;
				for (local833 = 2; local833 < local826.aByteArray36.length; local833 += 2) {
					local353 = local38.method1253() + local353 + 1;
					local826.aByteArray36[local833] = (byte) local353;
				}
			}
		}
		@Pc(906) int local906;
		@Pc(933) int local933;
		@Pc(945) byte local945;
		@Pc(960) int local960;
		@Pc(962) int local962;
		@Pc(972) int local972;
		@Pc(900) byte local900;
		@Pc(1008) int local1008;
		if (local294 != null) {
			local353 = local38.method1253();
			local294[0] = (byte) local353;
			for (local788 = 2; local788 < local294.length; local788 += 2) {
				local353 = local353 + local38.method1253() + 1;
				local294[local788] = (byte) local353;
			}
			local900 = local294[0];
			@Pc(904) byte local904 = local294[1];
			for (local906 = 0; local906 < local900; local906++) {
				this.aByteArray34[local906] = (byte) (this.aByteArray34[local906] * local904 + 32 >> 6);
			}
			local933 = 2;
			while (local294.length > local933) {
				@Pc(941) byte local941 = local294[local933 + 1];
				local945 = local294[local933];
				local933 += 2;
				local960 = local904 * (local945 - local900) + (local945 - local900) / 2;
				for (local962 = local900; local962 < local945; local962++) {
					local972 = Static88.method1743(local960, local945 - local900);
					local960 += local941 - local904;
					this.aByteArray34[local962] = (byte) (this.aByteArray34[local962] * local972 + 32 >> 6);
				}
				local900 = local945;
				local904 = local941;
			}
			for (local1008 = local900; local1008 < 128; local1008++) {
				this.aByteArray34[local1008] = (byte) (local904 * this.aByteArray34[local1008] + 32 >> 6);
			}
		}
		@Pc(1076) int local1076;
		if (local309 != null) {
			local353 = local38.method1253();
			local309[0] = (byte) local353;
			for (local788 = 2; local788 < local309.length; local788 += 2) {
				local353 = local353 + local38.method1253() + 1;
				local309[local788] = (byte) local353;
			}
			local900 = local309[0];
			local1076 = local309[1] << 1;
			for (local906 = 0; local906 < local900; local906++) {
				local933 = local1076 + (this.aByteArray33[local906] & 0xFF);
				if (local933 < 0) {
					local933 = 0;
				}
				if (local933 > 128) {
					local933 = 128;
				}
				this.aByteArray33[local906] = (byte) local933;
			}
			local933 = 2;
			@Pc(1124) int local1124;
			while (local309.length > local933) {
				local945 = local309[local933];
				local1124 = local309[local933 + 1] << 1;
				local933 += 2;
				local960 = (local945 - local900) / 2 + (local945 - local900) * local1076;
				for (local962 = local900; local962 < local945; local962++) {
					local972 = Static88.method1743(local960, local945 - local900);
					local960 += local1124 - local1076;
					@Pc(1165) int local1165 = local972 + (this.aByteArray33[local962] & 0xFF);
					if (local1165 < 0) {
						local1165 = 0;
					}
					if (local1165 > 128) {
						local1165 = 128;
					}
					this.aByteArray33[local962] = (byte) local1165;
				}
				local900 = local945;
				local1076 = local1124;
			}
			for (local1008 = local900; local1008 < 128; local1008++) {
				local1124 = (this.aByteArray33[local1008] & 0xFF) + local1076;
				if (local1124 < 0) {
					local1124 = 0;
				}
				if (local1124 > 128) {
					local1124 = 128;
				}
				this.aByteArray33[local1008] = (byte) local1124;
			}
		}
		for (local788 = 0; local788 < local187; local788++) {
			local227[local788].anInt3000 = local38.method1253();
		}
		for (local833 = 0; local833 < local187; local833++) {
			@Pc(1264) Class67 local1264 = local227[local833];
			if (local1264.aByteArray36 != null) {
				local1264.anInt3005 = local38.method1253();
			}
			if (local1264.aByteArray35 != null) {
				local1264.anInt3011 = local38.method1253();
			}
			if (local1264.anInt3000 > 0) {
				local1264.anInt3001 = local38.method1253();
			}
		}
		for (local1076 = 0; local1076 < local187; local1076++) {
			local227[local1076].anInt2999 = local38.method1253();
		}
		for (local906 = 0; local906 < local187; local906++) {
			@Pc(1326) Class67 local1326 = local227[local906];
			if (local1326.anInt2999 > 0) {
				local1326.anInt3003 = local38.method1253();
			}
		}
		for (local933 = 0; local933 < local187; local933++) {
			@Pc(1346) Class67 local1346 = local227[local933];
			if (local1346.anInt3003 > 0) {
				local1346.anInt3002 = local38.method1253();
			}
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Z)V")
	public void method2058() {
		this.anIntArray254 = null;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(ILclient!sb;[B[I)Z")
	public boolean method2063(@OriginalArg(1) Class77 arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int[] arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(9) int local9 = 0;
		@Pc(11) Class4_Sub12_Sub1 local11 = null;
		for (@Pc(13) int local13 = 0; local13 < 128; local13++) {
			if (arg1 == null || arg1[local13] != 0) {
				@Pc(25) int local25 = this.anIntArray254[local13];
				if (local25 != 0) {
					if (local9 != local25) {
						local9 = local25--;
						if ((local25 & 0x1) == 0) {
							local11 = arg0.method2604(arg2, local25 >> 2);
						} else {
							local11 = arg0.method2605(arg2, local25 >> 2);
						}
						if (local11 == null) {
							local7 = false;
						}
					}
					if (local11 != null) {
						this.aClass4_Sub12_Sub1Array1[local13] = local11;
						this.anIntArray254[local13] = 0;
					}
				}
			}
		}
		return local7;
	}
}
