import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dba")
public final class Class5_Sub9 extends Class5 {

	@OriginalMember(owner = "client!dba", name = "l", descriptor = "[Lclient!ew;")
	public Class93[] aClass93Array1;

	@OriginalMember(owner = "client!dba", name = "m", descriptor = "I")
	public int anInt1571;

	@OriginalMember(owner = "client!dba", name = "o", descriptor = "[I")
	private int[] anIntArray173;

	@OriginalMember(owner = "client!dba", name = "s", descriptor = "[B")
	public byte[] aByteArray28;

	@OriginalMember(owner = "client!dba", name = "t", descriptor = "[B")
	public byte[] aByteArray29;

	@OriginalMember(owner = "client!dba", name = "v", descriptor = "[B")
	public byte[] aByteArray30;

	@OriginalMember(owner = "client!dba", name = "w", descriptor = "[S")
	public short[] aShortArray27;

	@OriginalMember(owner = "client!dba", name = "x", descriptor = "[Lclient!ar;")
	public Class5_Sub5_Sub1[] aClass5_Sub5_Sub1Array1;

	@OriginalMember(owner = "client!dba", name = "<init>", descriptor = "()V")
	private Class5_Sub9() {
	}

	@OriginalMember(owner = "client!dba", name = "<init>", descriptor = "([B)V")
	public Class5_Sub9(@OriginalArg(0) byte[] arg0) {
		this.aClass5_Sub5_Sub1Array1 = new Class5_Sub5_Sub1[128];
		this.aClass93Array1 = new Class93[128];
		this.aByteArray30 = new byte[128];
		this.aByteArray29 = new byte[128];
		this.anIntArray173 = new int[128];
		this.aByteArray28 = new byte[128];
		this.aShortArray27 = new short[128];
		@Pc(36) Class5_Sub3 local36 = new Class5_Sub3(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray66[local38 + local36.anInt4960] != 0; local38++) {
		}
		@Pc(52) byte[] local52 = new byte[local38];
		for (@Pc(54) int local54 = 0; local54 < local38; local54++) {
			local52[local54] = local36.method4196();
		}
		local38++;
		local36.anInt4960++;
		@Pc(76) int local76 = local36.anInt4960;
		local36.anInt4960 += local38;
		@Pc(84) int local84;
		for (local84 = 0; local36.aByteArray66[local84 + local36.anInt4960] != 0; local84++) {
		}
		@Pc(98) byte[] local98 = new byte[local84];
		for (@Pc(100) int local100 = 0; local100 < local84; local100++) {
			local98[local100] = local36.method4196();
		}
		local84++;
		local36.anInt4960++;
		@Pc(126) int local126 = local36.anInt4960;
		local36.anInt4960 += local84;
		@Pc(134) int local134;
		for (local134 = 0; local36.aByteArray66[local134 + local36.anInt4960] != 0; local134++) {
		}
		@Pc(148) byte[] local148 = new byte[local134];
		for (@Pc(150) int local150 = 0; local150 < local134; local150++) {
			local148[local150] = local36.method4196();
		}
		local36.anInt4960++;
		local134++;
		@Pc(172) byte[] local172 = new byte[local134];
		@Pc(177) int local177;
		@Pc(189) int local189;
		@Pc(195) int local195;
		if (local134 <= 1) {
			local177 = local134;
		} else {
			local172[1] = 1;
			@Pc(185) int local185 = 1;
			local177 = 2;
			for (local189 = 2; local189 < local134; local189++) {
				local195 = local36.method4220();
				if (local195 == 0) {
					local185 = local177++;
				} else {
					if (local185 >= local195) {
						local195--;
					}
					local185 = local195;
				}
				local172[local189] = (byte) local185;
			}
		}
		@Pc(228) Class93[] local228 = new Class93[local177];
		for (local189 = 0; local189 < local228.length; local189++) {
			@Pc(240) Class93 local240 = local228[local189] = new Class93();
			@Pc(244) int local244 = local36.method4220();
			if (local244 > 0) {
				local240.aByteArray40 = new byte[local244 * 2];
			}
			local244 = local36.method4220();
			if (local244 > 0) {
				local240.aByteArray39 = new byte[local244 * 2 + 2];
				local240.aByteArray39[1] = 64;
			}
		}
		local195 = local36.method4220();
		@Pc(296) byte[] local296 = local195 > 0 ? new byte[local195 * 2] : null;
		local195 = local36.method4220();
		@Pc(312) byte[] local312 = local195 <= 0 ? null : new byte[local195 * 2];
		@Pc(314) int local314;
		for (local314 = 0; local36.aByteArray66[local314 + local36.anInt4960] != 0; local314++) {
		}
		@Pc(328) byte[] local328 = new byte[local314];
		for (@Pc(330) int local330 = 0; local330 < local314; local330++) {
			local328[local330] = local36.method4196();
		}
		local36.anInt4960++;
		local314++;
		@Pc(351) int local351 = 0;
		for (@Pc(353) int local353 = 0; local353 < 128; local353++) {
			local351 += local36.method4220();
			this.aShortArray27[local353] = (short) local351;
		}
		local351 = 0;
		for (@Pc(377) int local377 = 0; local377 < 128; local377++) {
			local351 += local36.method4220();
			this.aShortArray27[local377] = (short) (this.aShortArray27[local377] + (local351 << 8));
		}
		@Pc(402) int local402 = 0;
		@Pc(404) int local404 = 0;
		@Pc(406) int local406 = 0;
		for (@Pc(408) int local408 = 0; local408 < 128; local408++) {
			if (local402 == 0) {
				if (local328.length <= local404) {
					local402 = -1;
				} else {
					local402 = local328[local404++];
				}
				local406 = local36.method4223();
			}
			this.aShortArray27[local408] = (short) (this.aShortArray27[local408] + ((local406 - 1 & 0x2) << 14));
			local402--;
			this.anIntArray173[local408] = local406;
		}
		local404 = 0;
		local402 = 0;
		@Pc(466) int local466 = 0;
		for (@Pc(468) int local468 = 0; local468 < 128; local468++) {
			if (this.anIntArray173[local468] != 0) {
				if (local402 == 0) {
					if (local404 >= local52.length) {
						local402 = -1;
					} else {
						local402 = local52[local404++];
					}
					local466 = local36.aByteArray66[local76++] - 1;
				}
				local402--;
				this.aByteArray30[local468] = (byte) local466;
			}
		}
		local404 = 0;
		local402 = 0;
		@Pc(520) int local520 = 0;
		for (@Pc(522) int local522 = 0; local522 < 128; local522++) {
			if (this.anIntArray173[local522] != 0) {
				if (local402 == 0) {
					if (local404 >= local98.length) {
						local402 = -1;
					} else {
						local402 = local98[local404++];
					}
					local520 = local36.aByteArray66[local126++] + 16 << 2;
				}
				local402--;
				this.aByteArray28[local522] = (byte) local520;
			}
		}
		local404 = 0;
		local402 = 0;
		@Pc(578) Class93 local578 = null;
		for (@Pc(580) int local580 = 0; local580 < 128; local580++) {
			if (this.anIntArray173[local580] != 0) {
				if (local402 == 0) {
					local578 = local228[local172[local404]];
					if (local148.length > local404) {
						local402 = local148[local404++];
					} else {
						local402 = -1;
					}
				}
				local402--;
				this.aClass93Array1[local580] = local578;
			}
		}
		local404 = 0;
		local402 = 0;
		@Pc(625) int local625 = 0;
		for (@Pc(627) int local627 = 0; local627 < 128; local627++) {
			if (local402 == 0) {
				if (local404 >= local328.length) {
					local402 = -1;
				} else {
					local402 = local328[local404++];
				}
				if (this.anIntArray173[local627] > 0) {
					local625 = local36.method4220() + 1;
				}
			}
			local402--;
			this.aByteArray29[local627] = (byte) local625;
		}
		this.anInt1571 = local36.method4220() + 1;
		@Pc(693) int local693;
		for (@Pc(682) int local682 = 0; local682 < local177; local682++) {
			@Pc(688) Class93 local688 = local228[local682];
			if (local688.aByteArray40 != null) {
				for (local693 = 1; local693 < local688.aByteArray40.length; local693 += 2) {
					local688.aByteArray40[local693] = local36.method4196();
				}
			}
			if (local688.aByteArray39 != null) {
				for (local693 = 3; local693 < local688.aByteArray39.length - 2; local693 += 2) {
					local688.aByteArray39[local693] = local36.method4196();
				}
			}
		}
		@Pc(738) int local738;
		if (local296 != null) {
			for (local738 = 1; local738 < local296.length; local738 += 2) {
				local296[local738] = local36.method4196();
			}
		}
		if (local312 != null) {
			for (local738 = 1; local738 < local312.length; local738 += 2) {
				local312[local738] = local36.method4196();
			}
		}
		@Pc(787) int local787;
		for (local738 = 0; local738 < local177; local738++) {
			@Pc(780) Class93 local780 = local228[local738];
			if (local780.aByteArray39 != null) {
				local351 = 0;
				for (local787 = 2; local787 < local780.aByteArray39.length; local787 += 2) {
					local351 = local351 + local36.method4220() + 1;
					local780.aByteArray39[local787] = (byte) local351;
				}
			}
		}
		@Pc(837) int local837;
		for (local693 = 0; local693 < local177; local693++) {
			@Pc(830) Class93 local830 = local228[local693];
			if (local830.aByteArray40 != null) {
				local351 = 0;
				for (local837 = 2; local837 < local830.aByteArray40.length; local837 += 2) {
					local351 = local36.method4220() + local351 + 1;
					local830.aByteArray40[local837] = (byte) local351;
				}
			}
		}
		@Pc(906) int local906;
		@Pc(933) int local933;
		@Pc(939) byte local939;
		@Pc(959) int local959;
		@Pc(961) int local961;
		@Pc(971) int local971;
		@Pc(900) byte local900;
		@Pc(1012) int local1012;
		if (local296 != null) {
			local351 = local36.method4220();
			local296[0] = (byte) local351;
			for (local787 = 2; local787 < local296.length; local787 += 2) {
				local351 = local36.method4220() + local351 + 1;
				local296[local787] = (byte) local351;
			}
			local900 = local296[0];
			@Pc(904) byte local904 = local296[1];
			for (local906 = 0; local906 < local900; local906++) {
				this.aByteArray29[local906] = (byte) (local904 * this.aByteArray29[local906] + 32 >> 6);
			}
			local933 = 2;
			while (local933 < local296.length) {
				local939 = local296[local933];
				@Pc(945) byte local945 = local296[local933 + 1];
				local959 = (local939 - local900) / 2 + (local939 - local900) * local904;
				for (local961 = local900; local961 < local939; local961++) {
					local971 = Static311.method5049(local939 - local900, local959);
					local959 += local945 - local904;
					this.aByteArray29[local961] = (byte) (this.aByteArray29[local961] * local971 + 32 >> 6);
				}
				local933 += 2;
				local904 = local945;
				local900 = local939;
			}
			for (local1012 = local900; local1012 < 128; local1012++) {
				this.aByteArray29[local1012] = (byte) (local904 * this.aByteArray29[local1012] + 32 >> 6);
			}
		}
		@Pc(1081) int local1081;
		if (local312 != null) {
			local351 = local36.method4220();
			local312[0] = (byte) local351;
			for (local787 = 2; local787 < local312.length; local787 += 2) {
				local351 += local36.method4220() + 1;
				local312[local787] = (byte) local351;
			}
			local900 = local312[0];
			local1081 = local312[1] << 1;
			for (local906 = 0; local906 < local900; local906++) {
				local933 = local1081 + (this.aByteArray28[local906] & 0xFF);
				if (local933 < 0) {
					local933 = 0;
				}
				if (local933 > 128) {
					local933 = 128;
				}
				this.aByteArray28[local906] = (byte) local933;
			}
			@Pc(1134) int local1134;
			for (local933 = 2; local933 < local312.length; local933 += 2) {
				local939 = local312[local933];
				local1134 = local312[local933 + 1] << 1;
				local959 = (local939 - local900) * local1081 + (local939 - local900) / 2;
				for (local961 = local900; local961 < local939; local961++) {
					local971 = Static311.method5049(local939 - local900, local959);
					@Pc(1168) int local1168 = (this.aByteArray28[local961] & 0xFF) + local971;
					if (local1168 < 0) {
						local1168 = 0;
					}
					if (local1168 > 128) {
						local1168 = 128;
					}
					local959 += local1134 - local1081;
					this.aByteArray28[local961] = (byte) local1168;
				}
				local900 = local939;
				local1081 = local1134;
			}
			for (local1012 = local900; local1012 < 128; local1012++) {
				local1134 = local1081 + (this.aByteArray28[local1012] & 0xFF);
				if (local1134 < 0) {
					local1134 = 0;
				}
				if (local1134 > 128) {
					local1134 = 128;
				}
				this.aByteArray28[local1012] = (byte) local1134;
			}
		}
		for (local787 = 0; local787 < local177; local787++) {
			local228[local787].anInt2674 = local36.method4220();
		}
		for (local837 = 0; local837 < local177; local837++) {
			@Pc(1274) Class93 local1274 = local228[local837];
			if (local1274.aByteArray40 != null) {
				local1274.anInt2675 = local36.method4220();
			}
			if (local1274.aByteArray39 != null) {
				local1274.anInt2680 = local36.method4220();
			}
			if (local1274.anInt2674 > 0) {
				local1274.anInt2673 = local36.method4220();
			}
		}
		for (local1081 = 0; local1081 < local177; local1081++) {
			local228[local1081].anInt2671 = local36.method4220();
		}
		for (local906 = 0; local906 < local177; local906++) {
			@Pc(1328) Class93 local1328 = local228[local906];
			if (local1328.anInt2671 > 0) {
				local1328.anInt2672 = local36.method4220();
			}
		}
		for (local933 = 0; local933 < local177; local933++) {
			@Pc(1352) Class93 local1352 = local228[local933];
			if (local1352.anInt2672 > 0) {
				local1352.anInt2670 = local36.method4220();
			}
		}
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(I)V")
	public void method1442() {
		this.anIntArray173 = null;
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(B[I[BLclient!jt;)Z")
	public boolean method1445(@OriginalArg(1) int[] arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) Class165 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(9) int local9 = 0;
		@Pc(11) Class5_Sub5_Sub1 local11 = null;
		for (@Pc(17) int local17 = 0; local17 < 128; local17++) {
			if (arg1 == null || arg1[local17] != 0) {
				@Pc(29) int local29 = this.anIntArray173[local17];
				if (local29 != 0) {
					if (local29 != local9) {
						local9 = local29--;
						if ((local29 & 0x1) == 0) {
							local11 = arg2.method4139(arg0, local29 >> 2);
						} else {
							local11 = arg2.method4141(arg0, local29 >> 2);
						}
						if (local11 == null) {
							local7 = false;
						}
					}
					if (local11 != null) {
						this.aClass5_Sub5_Sub1Array1[local17] = local11;
						this.anIntArray173[local17] = 0;
					}
				}
			}
		}
		return local7;
	}
}
