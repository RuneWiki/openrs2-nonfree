import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public final class Class4_Sub14 extends Class4 {

	@OriginalMember(owner = "client!kd", name = "r", descriptor = "[Lclient!ib;")
	public final Class4_Sub13_Sub1[] aClass4_Sub13_Sub1Array1 = new Class4_Sub13_Sub1[128];

	@OriginalMember(owner = "client!kd", name = "u", descriptor = "I")
	public final int anInt1785;

	@OriginalMember(owner = "client!kd", name = "A", descriptor = "[B")
	public final byte[] aByteArray16 = new byte[128];

	@OriginalMember(owner = "client!kd", name = "B", descriptor = "[B")
	public final byte[] aByteArray17;

	@OriginalMember(owner = "client!kd", name = "C", descriptor = "[S")
	public final short[] aShortArray17;

	@OriginalMember(owner = "client!kd", name = "K", descriptor = "[B")
	public final byte[] aByteArray18;

	@OriginalMember(owner = "client!kd", name = "N", descriptor = "[I")
	private int[] anIntArray172 = new int[128];

	@OriginalMember(owner = "client!kd", name = "P", descriptor = "[Lclient!kc;")
	public final Class38[] aClass38Array1 = new Class38[128];

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "([B)V")
	public Class4_Sub14(@OriginalArg(0) byte[] arg0) {
		@Pc(21) int local21 = 0;
		this.aByteArray18 = new byte[128];
		this.aByteArray17 = new byte[128];
		this.aShortArray17 = new short[128];
		@Pc(38) Class4_Sub11 local38 = new Class4_Sub11(arg0);
		while (local38.aByteArray9[local38.anInt1099 + local21] != 0) {
			local21++;
		}
		@Pc(56) byte[] local56 = new byte[local21];
		for (@Pc(58) int local58 = 0; local58 < local21; local58++) {
			local56[local58] = local38.method731();
		}
		local38.anInt1099++;
		local21++;
		@Pc(84) int local84 = local38.anInt1099;
		@Pc(86) int local86 = 0;
		local38.anInt1099 += local21;
		while (local38.aByteArray9[local38.anInt1099 + local86] != 0) {
			local86++;
		}
		@Pc(107) byte[] local107 = new byte[local86];
		for (@Pc(109) int local109 = 0; local109 < local86; local109++) {
			local107[local109] = local38.method731();
		}
		local86++;
		@Pc(124) int local124 = 0;
		local38.anInt1099++;
		@Pc(133) int local133 = local38.anInt1099;
		local38.anInt1099 += local86;
		while (local38.aByteArray9[local124 + local38.anInt1099] != 0) {
			local124++;
		}
		@Pc(156) byte[] local156 = new byte[local124];
		for (@Pc(158) int local158 = 0; local158 < local124; local158++) {
			local156[local158] = local38.method731();
		}
		local38.anInt1099++;
		local124++;
		@Pc(180) byte[] local180 = new byte[local124];
		@Pc(185) int local185;
		@Pc(197) int local197;
		@Pc(203) int local203;
		if (local124 <= 1) {
			local185 = local124;
		} else {
			local185 = 2;
			@Pc(191) int local191 = 1;
			local180[1] = 1;
			for (local197 = 2; local197 < local124; local197++) {
				local203 = local38.method719();
				if (local203 == 0) {
					local191 = local185++;
				} else {
					if (local191 >= local203) {
						local203--;
					}
					local191 = local203;
				}
				local180[local197] = (byte) local191;
			}
		}
		@Pc(235) Class38[] local235 = new Class38[local185];
		for (local197 = 0; local197 < local235.length; local197++) {
			@Pc(247) Class38 local247 = local235[local197] = new Class38();
			@Pc(251) int local251 = local38.method719();
			if (local251 > 0) {
				local247.aByteArray14 = new byte[local251 * 2];
			}
			local251 = local38.method719();
			if (local251 > 0) {
				local247.aByteArray15 = new byte[local251 * 2 + 2];
				local247.aByteArray15[1] = 64;
			}
		}
		local203 = local38.method719();
		@Pc(306) byte[] local306 = local203 <= 0 ? null : new byte[local203 * 2];
		@Pc(308) int local308 = 0;
		local203 = local38.method719();
		@Pc(324) byte[] local324 = local203 <= 0 ? null : new byte[local203 * 2];
		while (local38.aByteArray9[local308 + local38.anInt1099] != 0) {
			local308++;
		}
		@Pc(338) byte[] local338 = new byte[local308];
		for (@Pc(340) int local340 = 0; local340 < local308; local340++) {
			local338[local340] = local38.method731();
		}
		local308++;
		local38.anInt1099++;
		@Pc(361) int local361 = 0;
		for (@Pc(363) int local363 = 0; local363 < 128; local363++) {
			local361 += local38.method719();
			this.aShortArray17[local363] = (short) local361;
		}
		local361 = 0;
		for (@Pc(387) int local387 = 0; local387 < 128; local387++) {
			local361 += local38.method719();
			this.aShortArray17[local387] = (short) (this.aShortArray17[local387] + (local361 << 8));
		}
		@Pc(412) int local412 = 0;
		@Pc(414) int local414 = 0;
		@Pc(416) int local416 = 0;
		for (@Pc(418) int local418 = 0; local418 < 128; local418++) {
			if (local412 == 0) {
				if (local416 < local338.length) {
					local412 = local338[local416++];
				} else {
					local412 = -1;
				}
				local414 = local38.method697();
			}
			local412--;
			this.aShortArray17[local418] = (short) (this.aShortArray17[local418] + ((local414 - 1 & 0x2) << 14));
			this.anIntArray172[local418] = local414;
		}
		local416 = 0;
		@Pc(470) int local470 = 0;
		local412 = 0;
		for (@Pc(474) int local474 = 0; local474 < 128; local474++) {
			if (this.anIntArray172[local474] != 0) {
				if (local412 == 0) {
					if (local56.length > local416) {
						local412 = local56[local416++];
					} else {
						local412 = -1;
					}
					local470 = local38.aByteArray9[local84++] - 1;
				}
				local412--;
				this.aByteArray18[local474] = (byte) local470;
			}
		}
		local412 = 0;
		local416 = 0;
		@Pc(527) int local527 = 0;
		for (@Pc(529) int local529 = 0; local529 < 128; local529++) {
			if (this.anIntArray172[local529] != 0) {
				if (local412 == 0) {
					local527 = local38.aByteArray9[local133++] + 16 << 2;
					if (local107.length <= local416) {
						local412 = -1;
					} else {
						local412 = local107[local416++];
					}
				}
				this.aByteArray16[local529] = (byte) local527;
				local412--;
			}
		}
		local416 = 0;
		@Pc(582) Class38 local582 = null;
		local412 = 0;
		for (@Pc(586) int local586 = 0; local586 < 128; local586++) {
			if (this.anIntArray172[local586] != 0) {
				if (local412 == 0) {
					local582 = local235[local180[local416]];
					if (local156.length <= local416) {
						local412 = -1;
					} else {
						local412 = local156[local416++];
					}
				}
				this.aClass38Array1[local586] = local582;
				local412--;
			}
		}
		local416 = 0;
		local412 = 0;
		@Pc(631) int local631 = 0;
		for (@Pc(633) int local633 = 0; local633 < 128; local633++) {
			if (local412 == 0) {
				if (local416 >= local338.length) {
					local412 = -1;
				} else {
					local412 = local338[local416++];
				}
				if (this.anIntArray172[local633] > 0) {
					local631 = local38.method719() + 1;
				}
			}
			local412--;
			this.aByteArray17[local633] = (byte) local631;
		}
		this.anInt1785 = local38.method719() + 1;
		@Pc(698) int local698;
		for (@Pc(687) int local687 = 0; local687 < local185; local687++) {
			@Pc(693) Class38 local693 = local235[local687];
			if (local693.aByteArray14 != null) {
				for (local698 = 1; local698 < local693.aByteArray14.length; local698 += 2) {
					local693.aByteArray14[local698] = local38.method731();
				}
			}
			if (local693.aByteArray15 != null) {
				for (local698 = 3; local698 < local693.aByteArray15.length - 2; local698 += 2) {
					local693.aByteArray15[local698] = local38.method731();
				}
			}
		}
		@Pc(743) int local743;
		if (local306 != null) {
			for (local743 = 1; local743 < local306.length; local743 += 2) {
				local306[local743] = local38.method731();
			}
		}
		if (local324 != null) {
			for (local743 = 1; local743 < local324.length; local743 += 2) {
				local324[local743] = local38.method731();
			}
		}
		@Pc(796) int local796;
		for (local743 = 0; local743 < local185; local743++) {
			@Pc(789) Class38 local789 = local235[local743];
			if (local789.aByteArray15 != null) {
				local361 = 0;
				for (local796 = 2; local796 < local789.aByteArray15.length; local796 += 2) {
					local361 -= -local38.method719() - 1;
					local789.aByteArray15[local796] = (byte) local361;
				}
			}
		}
		@Pc(842) int local842;
		for (local698 = 0; local698 < local185; local698++) {
			@Pc(835) Class38 local835 = local235[local698];
			if (local835.aByteArray14 != null) {
				local361 = 0;
				for (local842 = 2; local842 < local835.aByteArray14.length; local842 += 2) {
					local361 = local38.method719() + local361 + 1;
					local835.aByteArray14[local842] = (byte) local361;
				}
			}
		}
		@Pc(920) int local920;
		@Pc(943) int local943;
		@Pc(949) byte local949;
		@Pc(969) int local969;
		@Pc(972) int local972;
		@Pc(982) int local982;
		@Pc(914) byte local914;
		@Pc(1027) int local1027;
		if (local306 != null) {
			local361 = local38.method719();
			local306[0] = (byte) local361;
			for (local796 = 2; local796 < local306.length; local796 += 2) {
				local361 = local361 + local38.method719() + 1;
				local306[local796] = (byte) local361;
			}
			local914 = local306[0];
			@Pc(918) byte local918 = local306[1];
			for (local920 = 0; local920 < local914; local920++) {
				this.aByteArray17[local920] = (byte) (local918 * this.aByteArray17[local920] + 32 >> 6);
			}
			local943 = 2;
			while (local306.length > local943) {
				local949 = local306[local943];
				@Pc(955) byte local955 = local306[local943 + 1];
				local969 = (local949 - local914) / 2 + (local949 - local914) * local918;
				local943 += 2;
				for (local972 = local914; local972 < local949; local972++) {
					local982 = Static96.method1609(local969, local949 - local914);
					this.aByteArray17[local972] = (byte) (this.aByteArray17[local972] * local982 + 32 >> 6);
					local969 += local955 - local918;
				}
				local914 = local949;
				local918 = local955;
			}
			for (local1027 = local914; local1027 < 128; local1027++) {
				this.aByteArray17[local1027] = (byte) (this.aByteArray17[local1027] * local918 + 32 >> 6);
			}
		}
		@Pc(1097) int local1097;
		if (local324 != null) {
			local361 = local38.method719();
			local324[0] = (byte) local361;
			for (local796 = 2; local796 < local324.length; local796 += 2) {
				local361 = local38.method719() + local361 + 1;
				local324[local796] = (byte) local361;
			}
			local914 = local324[0];
			local1097 = local324[1] << 1;
			for (local920 = 0; local920 < local914; local920++) {
				local943 = local1097 + (this.aByteArray16[local920] & 0xFF);
				if (local943 < 0) {
					local943 = 0;
				}
				if (local943 > 128) {
					local943 = 128;
				}
				this.aByteArray16[local920] = (byte) local943;
			}
			local943 = 2;
			@Pc(1154) int local1154;
			while (local943 < local324.length) {
				local949 = local324[local943];
				local1154 = local324[local943 + 1] << 1;
				local943 += 2;
				local969 = local1097 * (local949 - local914) + (local949 - local914) / 2;
				for (local972 = local914; local972 < local949; local972++) {
					local982 = Static96.method1609(local969, local949 - local914);
					local969 += local1154 - local1097;
					@Pc(1199) int local1199 = (this.aByteArray16[local972] & 0xFF) + local982;
					if (local1199 < 0) {
						local1199 = 0;
					}
					if (local1199 > 128) {
						local1199 = 128;
					}
					this.aByteArray16[local972] = (byte) local1199;
				}
				local914 = local949;
				local1097 = local1154;
			}
			for (local1027 = local914; local1027 < 128; local1027++) {
				local1154 = local1097 + (this.aByteArray16[local1027] & 0xFF);
				if (local1154 < 0) {
					local1154 = 0;
				}
				if (local1154 > 128) {
					local1154 = 128;
				}
				this.aByteArray16[local1027] = (byte) local1154;
			}
		}
		for (local796 = 0; local796 < local185; local796++) {
			local235[local796].anInt1770 = local38.method719();
		}
		for (local842 = 0; local842 < local185; local842++) {
			@Pc(1298) Class38 local1298 = local235[local842];
			if (local1298.aByteArray14 != null) {
				local1298.anInt1764 = local38.method719();
			}
			if (local1298.aByteArray15 != null) {
				local1298.anInt1772 = local38.method719();
			}
			if (local1298.anInt1770 > 0) {
				local1298.anInt1768 = local38.method719();
			}
		}
		for (local1097 = 0; local1097 < local185; local1097++) {
			local235[local1097].anInt1767 = local38.method719();
		}
		for (local920 = 0; local920 < local185; local920++) {
			@Pc(1353) Class38 local1353 = local235[local920];
			if (local1353.anInt1767 > 0) {
				local1353.anInt1774 = local38.method719();
			}
		}
		for (local943 = 0; local943 < local185; local943++) {
			@Pc(1380) Class38 local1380 = local235[local943];
			if (local1380.anInt1774 > 0) {
				local1380.anInt1763 = local38.method719();
			}
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Z)V")
	public void method1112() {
		this.anIntArray172 = null;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILclient!jf;[B[I)Z")
	public boolean method1115(@OriginalArg(1) Class35 arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int[] arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(9) Class4_Sub13_Sub1 local9 = null;
		@Pc(11) int local11 = 0;
		for (@Pc(21) int local21 = 0; local21 < 128; local21++) {
			if (arg1 == null || arg1[local21] != 0) {
				@Pc(33) int local33 = this.anIntArray172[local21];
				if (local33 != 0) {
					if (local11 != local33) {
						local11 = local33--;
						if ((local33 & 0x1) == 0) {
							local9 = arg0.method1034(local33 >> 2, arg2);
						} else {
							local9 = arg0.method1035(arg2, local33 >> 2);
						}
						if (local9 == null) {
							local7 = false;
						}
					}
					if (local9 != null) {
						this.aClass4_Sub13_Sub1Array1[local21] = local9;
						this.anIntArray172[local21] = 0;
					}
				}
			}
		}
		return local7;
	}
}
