import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rl")
public final class Class2_Sub33 extends Class2 {

	@OriginalMember(owner = "client!rl", name = "o", descriptor = "[Lclient!cu;")
	public Class2_Sub4_Sub1[] aClass2_Sub4_Sub1Array1;

	@OriginalMember(owner = "client!rl", name = "r", descriptor = "[I")
	private int[] anIntArray672;

	@OriginalMember(owner = "client!rl", name = "s", descriptor = "[B")
	public byte[] aByteArray86;

	@OriginalMember(owner = "client!rl", name = "t", descriptor = "[Lclient!dp;")
	public Class52[] aClass52Array1;

	@OriginalMember(owner = "client!rl", name = "v", descriptor = "I")
	public int anInt5500;

	@OriginalMember(owner = "client!rl", name = "w", descriptor = "[S")
	public short[] aShortArray101;

	@OriginalMember(owner = "client!rl", name = "B", descriptor = "[B")
	public byte[] aByteArray87;

	@OriginalMember(owner = "client!rl", name = "C", descriptor = "[B")
	public byte[] aByteArray88;

	static {
		new Class221(" left the channel.", " hat den Chatraum verlassen.", " a quitté le canal.", " deixou o canal.");
	}

	@OriginalMember(owner = "client!rl", name = "<init>", descriptor = "()V")
	private Class2_Sub33() {
	}

	@OriginalMember(owner = "client!rl", name = "<init>", descriptor = "([B)V")
	public Class2_Sub33(@OriginalArg(0) byte[] arg0) {
		this.anIntArray672 = new int[128];
		this.aByteArray88 = new byte[128];
		this.aByteArray87 = new byte[128];
		this.aClass2_Sub4_Sub1Array1 = new Class2_Sub4_Sub1[128];
		this.aShortArray101 = new short[128];
		this.aByteArray86 = new byte[128];
		this.aClass52Array1 = new Class52[128];
		@Pc(36) Class2_Sub13 local36 = new Class2_Sub13(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray77[local36.anInt4788 + local38] != 0; local38++) {
		}
		@Pc(53) byte[] local53 = new byte[local38];
		for (@Pc(55) int local55 = 0; local55 < local38; local55++) {
			local53[local55] = local36.method4217();
		}
		local38++;
		local36.anInt4788++;
		@Pc(77) int local77 = local36.anInt4788;
		local36.anInt4788 += local38;
		@Pc(85) int local85;
		for (local85 = 0; local36.aByteArray77[local36.anInt4788 + local85] != 0; local85++) {
		}
		@Pc(100) byte[] local100 = new byte[local85];
		for (@Pc(102) int local102 = 0; local102 < local85; local102++) {
			local100[local102] = local36.method4217();
		}
		local36.anInt4788++;
		local85++;
		@Pc(124) int local124 = local36.anInt4788;
		local36.anInt4788 += local85;
		@Pc(132) int local132;
		for (local132 = 0; local36.aByteArray77[local36.anInt4788 + local132] != 0; local132++) {
		}
		@Pc(146) byte[] local146 = new byte[local132];
		for (@Pc(148) int local148 = 0; local148 < local132; local148++) {
			local146[local148] = local36.method4217();
		}
		local132++;
		local36.anInt4788++;
		@Pc(174) byte[] local174 = new byte[local132];
		@Pc(183) int local183;
		@Pc(187) int local187;
		@Pc(193) int local193;
		if (local132 > 1) {
			local174[1] = 1;
			local183 = 2;
			@Pc(185) int local185 = 1;
			for (local187 = 2; local187 < local132; local187++) {
				local193 = local36.method4240();
				if (local193 == 0) {
					local185 = local183++;
				} else {
					if (local193 <= local185) {
						local193--;
					}
					local185 = local193;
				}
				local174[local187] = (byte) local185;
			}
		} else {
			local183 = local132;
		}
		@Pc(230) Class52[] local230 = new Class52[local183];
		for (local187 = 0; local187 < local230.length; local187++) {
			@Pc(242) Class52 local242 = local230[local187] = new Class52();
			@Pc(246) int local246 = local36.method4240();
			if (local246 > 0) {
				local242.aByteArray23 = new byte[local246 * 2];
			}
			local246 = local36.method4240();
			if (local246 > 0) {
				local242.aByteArray22 = new byte[local246 * 2 + 2];
				local242.aByteArray22[1] = 64;
			}
		}
		local193 = local36.method4240();
		@Pc(294) byte[] local294 = local193 <= 0 ? null : new byte[local193 * 2];
		local193 = local36.method4240();
		@Pc(310) byte[] local310 = local193 > 0 ? new byte[local193 * 2] : null;
		@Pc(312) int local312;
		for (local312 = 0; local36.aByteArray77[local312 + local36.anInt4788] != 0; local312++) {
		}
		@Pc(329) byte[] local329 = new byte[local312];
		for (@Pc(331) int local331 = 0; local331 < local312; local331++) {
			local329[local331] = local36.method4217();
		}
		local36.anInt4788++;
		local312++;
		@Pc(352) int local352 = 0;
		for (@Pc(354) int local354 = 0; local354 < 128; local354++) {
			local352 += local36.method4240();
			this.aShortArray101[local354] = (short) local352;
		}
		local352 = 0;
		for (@Pc(376) int local376 = 0; local376 < 128; local376++) {
			local352 += local36.method4240();
			this.aShortArray101[local376] = (short) (this.aShortArray101[local376] + (local352 << 8));
		}
		@Pc(403) int local403 = 0;
		@Pc(405) int local405 = 0;
		@Pc(407) int local407 = 0;
		for (@Pc(409) int local409 = 0; local409 < 128; local409++) {
			if (local403 == 0) {
				if (local405 >= local329.length) {
					local403 = -1;
				} else {
					local403 = local329[local405++];
				}
				local407 = local36.method4213();
			}
			this.aShortArray101[local409] = (short) (this.aShortArray101[local409] + ((local407 - 1 & 0x2) << 14));
			local403--;
			this.anIntArray672[local409] = local407;
		}
		local405 = 0;
		local403 = 0;
		@Pc(463) int local463 = 0;
		for (@Pc(465) int local465 = 0; local465 < 128; local465++) {
			if (this.anIntArray672[local465] != 0) {
				if (local403 == 0) {
					local463 = local36.aByteArray77[local77++] - 1;
					if (local405 < local53.length) {
						local403 = local53[local405++];
					} else {
						local403 = -1;
					}
				}
				this.aByteArray86[local465] = (byte) local463;
				local403--;
			}
		}
		local403 = 0;
		local405 = 0;
		@Pc(515) int local515 = 0;
		for (@Pc(517) int local517 = 0; local517 < 128; local517++) {
			if (this.anIntArray672[local517] != 0) {
				if (local403 == 0) {
					if (local405 >= local100.length) {
						local403 = -1;
					} else {
						local403 = local100[local405++];
					}
					local515 = local36.aByteArray77[local124++] + 16 << 2;
				}
				local403--;
				this.aByteArray88[local517] = (byte) local515;
			}
		}
		local403 = 0;
		local405 = 0;
		@Pc(566) Class52 local566 = null;
		for (@Pc(568) int local568 = 0; local568 < 128; local568++) {
			if (this.anIntArray672[local568] != 0) {
				if (local403 == 0) {
					local566 = local230[local174[local405]];
					if (local146.length > local405) {
						local403 = local146[local405++];
					} else {
						local403 = -1;
					}
				}
				this.aClass52Array1[local568] = local566;
				local403--;
			}
		}
		local405 = 0;
		local403 = 0;
		@Pc(616) int local616 = 0;
		for (@Pc(618) int local618 = 0; local618 < 128; local618++) {
			if (local403 == 0) {
				if (local329.length <= local405) {
					local403 = -1;
				} else {
					local403 = local329[local405++];
				}
				if (this.anIntArray672[local618] > 0) {
					local616 = local36.method4240() + 1;
				}
			}
			local403--;
			this.aByteArray87[local618] = (byte) local616;
		}
		this.anInt5500 = local36.method4240() + 1;
		@Pc(680) int local680;
		for (@Pc(669) int local669 = 0; local669 < local183; local669++) {
			@Pc(675) Class52 local675 = local230[local669];
			if (local675.aByteArray23 != null) {
				for (local680 = 1; local680 < local675.aByteArray23.length; local680 += 2) {
					local675.aByteArray23[local680] = local36.method4217();
				}
			}
			if (local675.aByteArray22 != null) {
				for (local680 = 3; local680 < local675.aByteArray22.length - 2; local680 += 2) {
					local675.aByteArray22[local680] = local36.method4217();
				}
			}
		}
		@Pc(733) int local733;
		if (local294 != null) {
			for (local733 = 1; local733 < local294.length; local733 += 2) {
				local294[local733] = local36.method4217();
			}
		}
		if (local310 != null) {
			for (local733 = 1; local733 < local310.length; local733 += 2) {
				local310[local733] = local36.method4217();
			}
		}
		@Pc(786) int local786;
		for (local733 = 0; local733 < local183; local733++) {
			@Pc(779) Class52 local779 = local230[local733];
			if (local779.aByteArray22 != null) {
				local352 = 0;
				for (local786 = 2; local786 < local779.aByteArray22.length; local786 += 2) {
					local352 = local36.method4240() + local352 + 1;
					local779.aByteArray22[local786] = (byte) local352;
				}
			}
		}
		@Pc(835) int local835;
		for (local680 = 0; local680 < local183; local680++) {
			@Pc(828) Class52 local828 = local230[local680];
			if (local828.aByteArray23 != null) {
				local352 = 0;
				for (local835 = 2; local835 < local828.aByteArray23.length; local835 += 2) {
					local352 = local36.method4240() + local352 + 1;
					local828.aByteArray23[local835] = (byte) local352;
				}
			}
		}
		@Pc(909) int local909;
		@Pc(936) int local936;
		@Pc(942) byte local942;
		@Pc(963) int local963;
		@Pc(965) int local965;
		@Pc(975) int local975;
		@Pc(903) byte local903;
		@Pc(1014) int local1014;
		if (local294 != null) {
			local352 = local36.method4240();
			local294[0] = (byte) local352;
			for (local786 = 2; local786 < local294.length; local786 += 2) {
				local352 -= -local36.method4240() - 1;
				local294[local786] = (byte) local352;
			}
			local903 = local294[0];
			@Pc(907) byte local907 = local294[1];
			for (local909 = 0; local909 < local903; local909++) {
				this.aByteArray87[local909] = (byte) (local907 * this.aByteArray87[local909] + 32 >> 6);
			}
			local936 = 2;
			while (local294.length > local936) {
				local942 = local294[local936];
				@Pc(948) byte local948 = local294[local936 + 1];
				local963 = (local942 - local903) * local907 + (local942 - local903) / 2;
				for (local965 = local903; local965 < local942; local965++) {
					local975 = Static154.method2582(local942 - local903, local963);
					this.aByteArray87[local965] = (byte) (local975 * this.aByteArray87[local965] + 32 >> 6);
					local963 += local948 - local907;
				}
				local936 += 2;
				local903 = local942;
				local907 = local948;
			}
			for (local1014 = local903; local1014 < 128; local1014++) {
				this.aByteArray87[local1014] = (byte) (local907 * this.aByteArray87[local1014] + 32 >> 6);
			}
		}
		@Pc(1080) int local1080;
		if (local310 != null) {
			local352 = local36.method4240();
			local310[0] = (byte) local352;
			for (local786 = 2; local786 < local310.length; local786 += 2) {
				local352 = local36.method4240() + local352 + 1;
				local310[local786] = (byte) local352;
			}
			local903 = local310[0];
			local1080 = local310[1] << 1;
			for (local909 = 0; local909 < local903; local909++) {
				local936 = (this.aByteArray88[local909] & 0xFF) + local1080;
				if (local936 < 0) {
					local936 = 0;
				}
				if (local936 > 128) {
					local936 = 128;
				}
				this.aByteArray88[local909] = (byte) local936;
			}
			local936 = 2;
			@Pc(1131) int local1131;
			while (local936 < local310.length) {
				local942 = local310[local936];
				local1131 = local310[local936 + 1] << 1;
				local963 = local1080 * (local942 - local903) + (local942 - local903) / 2;
				for (local965 = local903; local965 < local942; local965++) {
					local975 = Static154.method2582(local942 - local903, local963);
					@Pc(1165) int local1165 = local975 + (this.aByteArray88[local965] & 0xFF);
					if (local1165 < 0) {
						local1165 = 0;
					}
					if (local1165 > 128) {
						local1165 = 128;
					}
					this.aByteArray88[local965] = (byte) local1165;
					local963 += local1131 - local1080;
				}
				local936 += 2;
				local1080 = local1131;
				local903 = local942;
			}
			for (local1014 = local903; local1014 < 128; local1014++) {
				local1131 = local1080 + (this.aByteArray88[local1014] & 0xFF);
				if (local1131 < 0) {
					local1131 = 0;
				}
				if (local1131 > 128) {
					local1131 = 128;
				}
				this.aByteArray88[local1014] = (byte) local1131;
			}
		}
		for (local786 = 0; local786 < local183; local786++) {
			local230[local786].anInt1253 = local36.method4240();
		}
		for (local835 = 0; local835 < local183; local835++) {
			@Pc(1272) Class52 local1272 = local230[local835];
			if (local1272.aByteArray23 != null) {
				local1272.anInt1246 = local36.method4240();
			}
			if (local1272.aByteArray22 != null) {
				local1272.anInt1252 = local36.method4240();
			}
			if (local1272.anInt1253 > 0) {
				local1272.anInt1250 = local36.method4240();
			}
		}
		for (local1080 = 0; local1080 < local183; local1080++) {
			local230[local1080].anInt1248 = local36.method4240();
		}
		for (local909 = 0; local909 < local183; local909++) {
			@Pc(1326) Class52 local1326 = local230[local909];
			if (local1326.anInt1248 > 0) {
				local1326.anInt1254 = local36.method4240();
			}
		}
		for (local936 = 0; local936 < local183; local936++) {
			@Pc(1353) Class52 local1353 = local230[local936];
			if (local1353.anInt1254 > 0) {
				local1353.anInt1249 = local36.method4240();
			}
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "([BI[ILclient!li;)Z")
	public boolean method4816(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class142 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(9) int local9 = 0;
		@Pc(11) Class2_Sub4_Sub1 local11 = null;
		for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
			if (arg0 == null || arg0[local18] != 0) {
				@Pc(30) int local30 = this.anIntArray672[local18];
				if (local30 != 0) {
					if (local30 != local9) {
						local9 = local30--;
						if ((local30 & 0x1) == 0) {
							local11 = arg2.method3350(arg1, local30 >> 2);
						} else {
							local11 = arg2.method3349(local30 >> 2, arg1);
						}
						if (local11 == null) {
							local7 = false;
						}
					}
					if (local11 != null) {
						this.aClass2_Sub4_Sub1Array1[local18] = local11;
						this.anIntArray672[local18] = 0;
					}
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!rl", name = "e", descriptor = "(I)V")
	public void method4820() {
		this.anIntArray672 = null;
	}
}
