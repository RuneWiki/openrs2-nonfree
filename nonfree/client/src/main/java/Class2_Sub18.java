import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!li")
public final class Class2_Sub18 extends Class2 {

	@OriginalMember(owner = "client!li", name = "n", descriptor = "[Lclient!cb;")
	public final Class2_Sub6_Sub1[] aClass2_Sub6_Sub1Array1;

	@OriginalMember(owner = "client!li", name = "p", descriptor = "[B")
	public final byte[] aByteArray25 = new byte[128];

	@OriginalMember(owner = "client!li", name = "w", descriptor = "[I")
	private int[] anIntArray253 = new int[128];

	@OriginalMember(owner = "client!li", name = "y", descriptor = "[B")
	public final byte[] aByteArray26 = new byte[128];

	@OriginalMember(owner = "client!li", name = "A", descriptor = "[Lclient!oc;")
	public final Class70[] aClass70Array1 = new Class70[128];

	@OriginalMember(owner = "client!li", name = "D", descriptor = "[B")
	public final byte[] aByteArray27;

	@OriginalMember(owner = "client!li", name = "G", descriptor = "I")
	public final int anInt2553;

	@OriginalMember(owner = "client!li", name = "I", descriptor = "[S")
	public final short[] aShortArray23 = new short[128];

	@OriginalMember(owner = "client!li", name = "<init>", descriptor = "([B)V")
	public Class2_Sub18(@OriginalArg(0) byte[] arg0) {
		@Pc(25) int local25 = 0;
		this.aClass2_Sub6_Sub1Array1 = new Class2_Sub6_Sub1[128];
		this.aByteArray27 = new byte[128];
		@Pc(38) Class2_Sub3 local38 = new Class2_Sub3(arg0);
		while (local38.aByteArray2[local38.anInt340 + local25] != 0) {
			local25++;
		}
		@Pc(53) byte[] local53 = new byte[local25];
		for (@Pc(55) int local55 = 0; local55 < local25; local55++) {
			local53[local55] = local38.method221();
		}
		local25++;
		local38.anInt340++;
		@Pc(77) int local77 = local38.anInt340;
		local38.anInt340 += local25;
		@Pc(85) int local85;
		for (local85 = 0; local38.aByteArray2[local38.anInt340 + local85] != 0; local85++) {
		}
		@Pc(103) byte[] local103 = new byte[local85];
		for (@Pc(105) int local105 = 0; local105 < local85; local105++) {
			local103[local105] = local38.method221();
		}
		local85++;
		local38.anInt340++;
		@Pc(131) int local131 = local38.anInt340;
		local38.anInt340 += local85;
		@Pc(139) int local139;
		for (local139 = 0; local38.aByteArray2[local139 + local38.anInt340] != 0; local139++) {
		}
		@Pc(153) byte[] local153 = new byte[local139];
		for (@Pc(155) int local155 = 0; local155 < local139; local155++) {
			local153[local155] = local38.method221();
		}
		local38.anInt340++;
		local139++;
		@Pc(181) byte[] local181 = new byte[local139];
		@Pc(188) int local188;
		@Pc(200) int local200;
		@Pc(206) int local206;
		if (local139 <= 1) {
			local188 = local139;
		} else {
			local181[1] = 1;
			local188 = 2;
			@Pc(198) int local198 = 1;
			for (local200 = 2; local200 < local139; local200++) {
				local206 = local38.method260();
				if (local206 == 0) {
					local198 = local188++;
				} else {
					if (local198 >= local206) {
						local206--;
					}
					local198 = local206;
				}
				local181[local200] = (byte) local198;
			}
		}
		@Pc(242) Class70[] local242 = new Class70[local188];
		for (local200 = 0; local200 < local242.length; local200++) {
			@Pc(254) Class70 local254 = local242[local200] = new Class70();
			@Pc(258) int local258 = local38.method260();
			if (local258 > 0) {
				local254.aByteArray31 = new byte[local258 * 2];
			}
			local258 = local38.method260();
			if (local258 > 0) {
				local254.aByteArray32 = new byte[local258 * 2 + 2];
				local254.aByteArray32[1] = 64;
			}
		}
		local206 = local38.method260();
		@Pc(310) byte[] local310 = local206 <= 0 ? null : new byte[local206 * 2];
		local206 = local38.method260();
		@Pc(326) byte[] local326 = local206 > 0 ? new byte[local206 * 2] : null;
		@Pc(328) int local328;
		for (local328 = 0; local38.aByteArray2[local328 + local38.anInt340] != 0; local328++) {
		}
		@Pc(342) byte[] local342 = new byte[local328];
		for (@Pc(344) int local344 = 0; local344 < local328; local344++) {
			local342[local344] = local38.method221();
		}
		local38.anInt340++;
		local328++;
		@Pc(365) int local365 = 0;
		for (@Pc(367) int local367 = 0; local367 < 128; local367++) {
			local365 += local38.method260();
			this.aShortArray23[local367] = (short) local365;
		}
		local365 = 0;
		for (@Pc(391) int local391 = 0; local391 < 128; local391++) {
			local365 += local38.method260();
			this.aShortArray23[local391] = (short) (this.aShortArray23[local391] + (local365 << 8));
		}
		@Pc(416) int local416 = 0;
		@Pc(418) int local418 = 0;
		@Pc(420) int local420 = 0;
		for (@Pc(422) int local422 = 0; local422 < 128; local422++) {
			if (local416 == 0) {
				if (local418 < local342.length) {
					local416 = local342[local418++];
				} else {
					local416 = -1;
				}
				local420 = local38.method235();
			}
			this.aShortArray23[local422] = (short) (this.aShortArray23[local422] + ((local420 - 1 & 0x2) << 14));
			this.anIntArray253[local422] = local420;
			local416--;
		}
		local418 = 0;
		local416 = 0;
		@Pc(477) int local477 = 0;
		for (@Pc(479) int local479 = 0; local479 < 128; local479++) {
			if (this.anIntArray253[local479] != 0) {
				if (local416 == 0) {
					if (local53.length <= local418) {
						local416 = -1;
					} else {
						local416 = local53[local418++];
					}
					local477 = local38.aByteArray2[local77++] - 1;
				}
				this.aByteArray27[local479] = (byte) local477;
				local416--;
			}
		}
		local418 = 0;
		@Pc(529) int local529 = 0;
		local416 = 0;
		for (@Pc(533) int local533 = 0; local533 < 128; local533++) {
			if (this.anIntArray253[local533] != 0) {
				if (local416 == 0) {
					local529 = local38.aByteArray2[local131++] + 16 << 2;
					if (local103.length > local418) {
						local416 = local103[local418++];
					} else {
						local416 = -1;
					}
				}
				local416--;
				this.aByteArray25[local533] = (byte) local529;
			}
		}
		local416 = 0;
		local418 = 0;
		@Pc(584) Class70 local584 = null;
		for (@Pc(586) int local586 = 0; local586 < 128; local586++) {
			if (this.anIntArray253[local586] != 0) {
				if (local416 == 0) {
					local584 = local242[local181[local418]];
					if (local153.length > local418) {
						local416 = local153[local418++];
					} else {
						local416 = -1;
					}
				}
				local416--;
				this.aClass70Array1[local586] = local584;
			}
		}
		local416 = 0;
		@Pc(636) int local636 = 0;
		local418 = 0;
		for (@Pc(640) int local640 = 0; local640 < 128; local640++) {
			if (local416 == 0) {
				if (local418 >= local342.length) {
					local416 = -1;
				} else {
					local416 = local342[local418++];
				}
				if (this.anIntArray253[local640] > 0) {
					local636 = local38.method260() + 1;
				}
			}
			this.aByteArray26[local640] = (byte) local636;
			local416--;
		}
		this.anInt2553 = local38.method260() + 1;
		@Pc(703) int local703;
		for (@Pc(692) int local692 = 0; local692 < local188; local692++) {
			@Pc(698) Class70 local698 = local242[local692];
			if (local698.aByteArray31 != null) {
				for (local703 = 1; local703 < local698.aByteArray31.length; local703 += 2) {
					local698.aByteArray31[local703] = local38.method221();
				}
			}
			if (local698.aByteArray32 != null) {
				for (local703 = 3; local703 < local698.aByteArray32.length - 2; local703 += 2) {
					local698.aByteArray32[local703] = local38.method221();
				}
			}
		}
		@Pc(756) int local756;
		if (local310 != null) {
			for (local756 = 1; local756 < local310.length; local756 += 2) {
				local310[local756] = local38.method221();
			}
		}
		if (local326 != null) {
			for (local756 = 1; local756 < local326.length; local756 += 2) {
				local326[local756] = local38.method221();
			}
		}
		@Pc(805) int local805;
		for (local756 = 0; local756 < local188; local756++) {
			@Pc(798) Class70 local798 = local242[local756];
			if (local798.aByteArray32 != null) {
				local365 = 0;
				for (local805 = 2; local805 < local798.aByteArray32.length; local805 += 2) {
					local365 = local38.method260() + local365 + 1;
					local798.aByteArray32[local805] = (byte) local365;
				}
			}
		}
		@Pc(846) int local846;
		for (local703 = 0; local703 < local188; local703++) {
			@Pc(839) Class70 local839 = local242[local703];
			if (local839.aByteArray31 != null) {
				local365 = 0;
				for (local846 = 2; local846 < local839.aByteArray31.length; local846 += 2) {
					local365 += local38.method260() + 1;
					local839.aByteArray31[local846] = (byte) local365;
				}
			}
		}
		@Pc(923) int local923;
		@Pc(950) int local950;
		@Pc(956) byte local956;
		@Pc(970) int local970;
		@Pc(979) int local979;
		@Pc(989) int local989;
		@Pc(917) byte local917;
		@Pc(1029) int local1029;
		if (local310 != null) {
			local365 = local38.method260();
			local310[0] = (byte) local365;
			for (local805 = 2; local805 < local310.length; local805 += 2) {
				local365 = local365 + local38.method260() + 1;
				local310[local805] = (byte) local365;
			}
			local917 = local310[0];
			@Pc(921) byte local921 = local310[1];
			for (local923 = 0; local923 < local917; local923++) {
				this.aByteArray26[local923] = (byte) (local921 * this.aByteArray26[local923] + 32 >> 6);
			}
			local950 = 2;
			while (local310.length > local950) {
				local956 = local310[local950];
				local970 = local921 * (local956 - local917) + (local956 - local917) / 2;
				@Pc(976) byte local976 = local310[local950 + 1];
				local950 += 2;
				for (local979 = local917; local979 < local956; local979++) {
					local989 = Static87.method1511(local956 - local917, local970);
					local970 += local976 - local921;
					this.aByteArray26[local979] = (byte) (local989 * this.aByteArray26[local979] + 32 >> 6);
				}
				local917 = local956;
				local921 = local976;
			}
			for (local1029 = local917; local1029 < 128; local1029++) {
				this.aByteArray26[local1029] = (byte) (this.aByteArray26[local1029] * local921 + 32 >> 6);
			}
		}
		@Pc(1095) int local1095;
		if (local326 != null) {
			local365 = local38.method260();
			local326[0] = (byte) local365;
			for (local805 = 2; local805 < local326.length; local805 += 2) {
				local365 = local38.method260() + local365 + 1;
				local326[local805] = (byte) local365;
			}
			local917 = local326[0];
			local1095 = local326[1] << 1;
			for (local923 = 0; local923 < local917; local923++) {
				local950 = (this.aByteArray25[local923] & 0xFF) + local1095;
				if (local950 < 0) {
					local950 = 0;
				}
				if (local950 > 128) {
					local950 = 128;
				}
				this.aByteArray25[local923] = (byte) local950;
			}
			local950 = 2;
			@Pc(1149) int local1149;
			while (local950 < local326.length) {
				local1149 = local326[local950 + 1] << 1;
				local956 = local326[local950];
				local970 = local1095 * (local956 - local917) + (local956 - local917) / 2;
				local950 += 2;
				for (local979 = local917; local979 < local956; local979++) {
					local989 = Static87.method1511(local956 - local917, local970);
					local970 += local1149 - local1095;
					@Pc(1198) int local1198 = (this.aByteArray25[local979] & 0xFF) + local989;
					if (local1198 < 0) {
						local1198 = 0;
					}
					if (local1198 > 128) {
						local1198 = 128;
					}
					this.aByteArray25[local979] = (byte) local1198;
				}
				local1095 = local1149;
				local917 = local956;
			}
			for (local1029 = local917; local1029 < 128; local1029++) {
				local1149 = (this.aByteArray25[local1029] & 0xFF) + local1095;
				if (local1149 < 0) {
					local1149 = 0;
				}
				if (local1149 > 128) {
					local1149 = 128;
				}
				this.aByteArray25[local1029] = (byte) local1149;
			}
		}
		for (local805 = 0; local805 < local188; local805++) {
			local242[local805].anInt2894 = local38.method260();
		}
		for (local846 = 0; local846 < local188; local846++) {
			@Pc(1287) Class70 local1287 = local242[local846];
			if (local1287.aByteArray31 != null) {
				local1287.anInt2887 = local38.method260();
			}
			if (local1287.aByteArray32 != null) {
				local1287.anInt2885 = local38.method260();
			}
			if (local1287.anInt2894 > 0) {
				local1287.anInt2886 = local38.method260();
			}
		}
		for (local1095 = 0; local1095 < local188; local1095++) {
			local242[local1095].anInt2888 = local38.method260();
		}
		for (local923 = 0; local923 < local188; local923++) {
			@Pc(1345) Class70 local1345 = local242[local923];
			if (local1345.anInt2888 > 0) {
				local1345.anInt2893 = local38.method260();
			}
		}
		for (local950 = 0; local950 < local188; local950++) {
			@Pc(1369) Class70 local1369 = local242[local950];
			if (local1369.anInt2893 > 0) {
				local1369.anInt2890 = local38.method260();
			}
		}
	}

	@OriginalMember(owner = "client!li", name = "b", descriptor = "(I)V")
	public void method1950() {
		this.anIntArray253 = null;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "([BLclient!pj;I[I)Z")
	public boolean method1953(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class82 arg1, @OriginalArg(3) int[] arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(9) int local9 = 0;
		@Pc(11) Class2_Sub6_Sub1 local11 = null;
		for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
			if (arg0 == null || arg0[local18] != 0) {
				@Pc(30) int local30 = this.anIntArray253[local18];
				if (local30 != 0) {
					if (local9 != local30) {
						local9 = local30--;
						if ((local30 & 0x1) == 0) {
							local11 = arg1.method2344(arg2, local30 >> 2);
						} else {
							local11 = arg1.method2343(arg2, local30 >> 2);
						}
						if (local11 == null) {
							local7 = false;
						}
					}
					if (local11 != null) {
						this.aClass2_Sub6_Sub1Array1[local18] = local11;
						this.anIntArray253[local18] = 0;
					}
				}
			}
		}
		return local7;
	}
}
