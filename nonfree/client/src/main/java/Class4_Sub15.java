import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public final class Class4_Sub15 extends Class4 {

	@OriginalMember(owner = "client!sb", name = "o", descriptor = "[I")
	private int[] anIntArray316 = new int[128];

	@OriginalMember(owner = "client!sb", name = "u", descriptor = "[B")
	public final byte[] aByteArray37 = new byte[128];

	@OriginalMember(owner = "client!sb", name = "v", descriptor = "[Lclient!re;")
	public final Class4_Sub6_Sub1[] aClass4_Sub6_Sub1Array1 = new Class4_Sub6_Sub1[128];

	@OriginalMember(owner = "client!sb", name = "w", descriptor = "[B")
	public final byte[] aByteArray38 = new byte[128];

	@OriginalMember(owner = "client!sb", name = "A", descriptor = "[Lclient!vd;")
	public final Class80[] aClass80Array1 = new Class80[128];

	@OriginalMember(owner = "client!sb", name = "F", descriptor = "I")
	public final int anInt2453;

	@OriginalMember(owner = "client!sb", name = "I", descriptor = "[S")
	public final short[] aShortArray35 = new short[128];

	@OriginalMember(owner = "client!sb", name = "K", descriptor = "[B")
	public final byte[] aByteArray39 = new byte[128];

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "([B)V")
	public Class4_Sub15(@OriginalArg(0) byte[] arg0) {
		@Pc(36) Class4_Sub9 local36 = new Class4_Sub9(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray6[local38 + local36.anInt1312] != 0; local38++) {
		}
		@Pc(55) byte[] local55 = new byte[local38];
		for (@Pc(57) int local57 = 0; local57 < local38; local57++) {
			local55[local57] = local36.method797();
		}
		local36.anInt1312++;
		@Pc(82) int local82 = local36.anInt1312;
		local38++;
		local36.anInt1312 += local38;
		@Pc(91) int local91;
		for (local91 = 0; local36.aByteArray6[local91 + local36.anInt1312] != 0; local91++) {
		}
		@Pc(108) byte[] local108 = new byte[local91];
		for (@Pc(110) int local110 = 0; local110 < local91; local110++) {
			local108[local110] = local36.method797();
		}
		local36.anInt1312++;
		local91++;
		@Pc(135) int local135 = 0;
		@Pc(138) int local138 = local36.anInt1312;
		local36.anInt1312 += local91;
		while (local36.aByteArray6[local135 + local36.anInt1312] != 0) {
			local135++;
		}
		@Pc(161) byte[] local161 = new byte[local135];
		for (@Pc(163) int local163 = 0; local163 < local135; local163++) {
			local161[local163] = local36.method797();
		}
		local36.anInt1312++;
		local135++;
		@Pc(185) byte[] local185 = new byte[local135];
		@Pc(190) int local190;
		@Pc(198) int local198;
		@Pc(204) int local204;
		if (local135 > 1) {
			local190 = 2;
			@Pc(192) int local192 = 1;
			local185[1] = 1;
			for (local198 = 2; local198 < local135; local198++) {
				local204 = local36.method773();
				if (local204 == 0) {
					local192 = local190++;
				} else {
					if (local192 >= local204) {
						local204--;
					}
					local192 = local204;
				}
				local185[local198] = (byte) local192;
			}
		} else {
			local190 = local135;
		}
		@Pc(241) Class80[] local241 = new Class80[local190];
		for (local198 = 0; local198 < local241.length; local198++) {
			@Pc(253) Class80 local253 = local241[local198] = new Class80();
			@Pc(257) int local257 = local36.method773();
			if (local257 > 0) {
				local253.aByteArray44 = new byte[local257 * 2];
			}
			local257 = local36.method773();
			if (local257 > 0) {
				local253.aByteArray43 = new byte[local257 * 2 + 2];
				local253.aByteArray43[1] = 64;
			}
		}
		local204 = local36.method773();
		@Pc(305) byte[] local305 = local204 > 0 ? new byte[local204 * 2] : null;
		@Pc(307) int local307 = 0;
		local204 = local36.method773();
		while (local36.aByteArray6[local307 + local36.anInt1312] != 0) {
			local307++;
		}
		@Pc(334) byte[] local334 = local204 > 0 ? new byte[local204 * 2] : null;
		@Pc(337) byte[] local337 = new byte[local307];
		for (@Pc(339) int local339 = 0; local339 < local307; local339++) {
			local337[local339] = local36.method797();
		}
		local307++;
		@Pc(358) int local358 = 0;
		local36.anInt1312++;
		for (@Pc(366) int local366 = 0; local366 < 128; local366++) {
			local358 += local36.method773();
			this.aShortArray35[local366] = (short) local358;
		}
		local358 = 0;
		for (@Pc(388) int local388 = 0; local388 < 128; local388++) {
			local358 += local36.method773();
			this.aShortArray35[local388] = (short) (this.aShortArray35[local388] + (local358 << 8));
		}
		@Pc(415) int local415 = 0;
		@Pc(417) int local417 = 0;
		@Pc(419) int local419 = 0;
		for (@Pc(421) int local421 = 0; local421 < 128; local421++) {
			if (local415 == 0) {
				if (local419 < local337.length) {
					local415 = local337[local419++];
				} else {
					local415 = -1;
				}
				local417 = local36.method809();
			}
			local415--;
			this.aShortArray35[local421] = (short) (this.aShortArray35[local421] + ((local417 - 1 & 0x2) << 14));
			this.anIntArray316[local421] = local417;
		}
		local419 = 0;
		local415 = 0;
		@Pc(473) int local473 = 0;
		for (@Pc(475) int local475 = 0; local475 < 128; local475++) {
			if (this.anIntArray316[local475] != 0) {
				if (local415 == 0) {
					local473 = local36.aByteArray6[local82++] - 1;
					if (local419 >= local55.length) {
						local415 = -1;
					} else {
						local415 = local55[local419++];
					}
				}
				this.aByteArray38[local475] = (byte) local473;
				local415--;
			}
		}
		local415 = 0;
		local419 = 0;
		@Pc(531) int local531 = 0;
		for (@Pc(533) int local533 = 0; local533 < 128; local533++) {
			if (this.anIntArray316[local533] != 0) {
				if (local415 == 0) {
					local531 = local36.aByteArray6[local138++] + 16 << 2;
					if (local419 < local108.length) {
						local415 = local108[local419++];
					} else {
						local415 = -1;
					}
				}
				this.aByteArray39[local533] = (byte) local531;
				local415--;
			}
		}
		local415 = 0;
		local419 = 0;
		@Pc(588) Class80 local588 = null;
		for (@Pc(590) int local590 = 0; local590 < 128; local590++) {
			if (this.anIntArray316[local590] != 0) {
				if (local415 == 0) {
					local588 = local241[local185[local419]];
					if (local419 >= local161.length) {
						local415 = -1;
					} else {
						local415 = local161[local419++];
					}
				}
				this.aClass80Array1[local590] = local588;
				local415--;
			}
		}
		local415 = 0;
		@Pc(638) int local638 = 0;
		local419 = 0;
		for (@Pc(642) int local642 = 0; local642 < 128; local642++) {
			if (local415 == 0) {
				if (local337.length > local419) {
					local415 = local337[local419++];
				} else {
					local415 = -1;
				}
				if (this.anIntArray316[local642] > 0) {
					local638 = local36.method773() + 1;
				}
			}
			this.aByteArray37[local642] = (byte) local638;
			local415--;
		}
		this.anInt2453 = local36.method773() + 1;
		@Pc(704) int local704;
		for (@Pc(693) int local693 = 0; local693 < local190; local693++) {
			@Pc(699) Class80 local699 = local241[local693];
			if (local699.aByteArray44 != null) {
				for (local704 = 1; local704 < local699.aByteArray44.length; local704 += 2) {
					local699.aByteArray44[local704] = local36.method797();
				}
			}
			if (local699.aByteArray43 != null) {
				for (local704 = 3; local704 < local699.aByteArray43.length - 2; local704 += 2) {
					local699.aByteArray43[local704] = local36.method797();
				}
			}
		}
		@Pc(761) int local761;
		if (local305 != null) {
			for (local761 = 1; local761 < local305.length; local761 += 2) {
				local305[local761] = local36.method797();
			}
		}
		if (local334 != null) {
			for (local761 = 1; local761 < local334.length; local761 += 2) {
				local334[local761] = local36.method797();
			}
		}
		@Pc(810) int local810;
		for (local761 = 0; local761 < local190; local761++) {
			@Pc(803) Class80 local803 = local241[local761];
			if (local803.aByteArray43 != null) {
				local358 = 0;
				for (local810 = 2; local810 < local803.aByteArray43.length; local810 += 2) {
					local358 = local358 + local36.method773() + 1;
					local803.aByteArray43[local810] = (byte) local358;
				}
			}
		}
		@Pc(855) int local855;
		for (local704 = 0; local704 < local190; local704++) {
			@Pc(848) Class80 local848 = local241[local704];
			if (local848.aByteArray44 != null) {
				local358 = 0;
				for (local855 = 2; local855 < local848.aByteArray44.length; local855 += 2) {
					local358 = local36.method773() + local358 + 1;
					local848.aByteArray44[local855] = (byte) local358;
				}
			}
		}
		@Pc(929) int local929;
		@Pc(952) int local952;
		@Pc(958) byte local958;
		@Pc(978) int local978;
		@Pc(980) int local980;
		@Pc(990) int local990;
		@Pc(923) byte local923;
		@Pc(1029) int local1029;
		if (local305 != null) {
			local358 = local36.method773();
			local305[0] = (byte) local358;
			for (local810 = 2; local810 < local305.length; local810 += 2) {
				local358 -= -local36.method773() - 1;
				local305[local810] = (byte) local358;
			}
			local923 = local305[0];
			@Pc(927) byte local927 = local305[1];
			for (local929 = 0; local929 < local923; local929++) {
				this.aByteArray37[local929] = (byte) (local927 * this.aByteArray37[local929] + 32 >> 6);
			}
			local952 = 2;
			while (local305.length > local952) {
				local958 = local305[local952];
				@Pc(964) byte local964 = local305[local952 + 1];
				local952 += 2;
				local978 = (local958 - local923) / 2 + local927 * (local958 - local923);
				for (local980 = local923; local980 < local958; local980++) {
					local990 = Static129.method682(local978, local958 - local923);
					local978 += local964 - local927;
					this.aByteArray37[local980] = (byte) (this.aByteArray37[local980] * local990 + 32 >> 6);
				}
				local923 = local958;
				local927 = local964;
			}
			for (local1029 = local923; local1029 < 128; local1029++) {
				this.aByteArray37[local1029] = (byte) (this.aByteArray37[local1029] * local927 + 32 >> 6);
			}
		}
		@Pc(1099) int local1099;
		if (local334 != null) {
			local358 = local36.method773();
			local334[0] = (byte) local358;
			for (local810 = 2; local810 < local334.length; local810 += 2) {
				local358 = local358 + local36.method773() + 1;
				local334[local810] = (byte) local358;
			}
			local923 = local334[0];
			local1099 = local334[1] << 1;
			for (local929 = 0; local929 < local923; local929++) {
				local952 = local1099 + (this.aByteArray39[local929] & 0xFF);
				if (local952 < 0) {
					local952 = 0;
				}
				if (local952 > 128) {
					local952 = 128;
				}
				this.aByteArray39[local929] = (byte) local952;
			}
			local952 = 2;
			@Pc(1154) int local1154;
			while (local334.length > local952) {
				local958 = local334[local952];
				local1154 = local334[local952 + 1] << 1;
				local952 += 2;
				local978 = local1099 * (local958 - local923) + (local958 - local923) / 2;
				for (local980 = local923; local980 < local958; local980++) {
					local990 = Static129.method682(local978, local958 - local923);
					local978 += local1154 - local1099;
					@Pc(1197) int local1197 = local990 + (this.aByteArray39[local980] & 0xFF);
					if (local1197 < 0) {
						local1197 = 0;
					}
					if (local1197 > 128) {
						local1197 = 128;
					}
					this.aByteArray39[local980] = (byte) local1197;
				}
				local923 = local958;
				local1099 = local1154;
			}
			for (local1029 = local923; local1029 < 128; local1029++) {
				local1154 = (this.aByteArray39[local1029] & 0xFF) + local1099;
				if (local1154 < 0) {
					local1154 = 0;
				}
				if (local1154 > 128) {
					local1154 = 128;
				}
				this.aByteArray39[local1029] = (byte) local1154;
			}
		}
		for (local810 = 0; local810 < local190; local810++) {
			local241[local810].anInt2820 = local36.method773();
		}
		for (local855 = 0; local855 < local190; local855++) {
			@Pc(1295) Class80 local1295 = local241[local855];
			if (local1295.aByteArray44 != null) {
				local1295.anInt2823 = local36.method773();
			}
			if (local1295.aByteArray43 != null) {
				local1295.anInt2822 = local36.method773();
			}
			if (local1295.anInt2820 > 0) {
				local1295.anInt2824 = local36.method773();
			}
		}
		for (local1099 = 0; local1099 < local190; local1099++) {
			local241[local1099].anInt2818 = local36.method773();
		}
		for (local929 = 0; local929 < local190; local929++) {
			@Pc(1349) Class80 local1349 = local241[local929];
			if (local1349.anInt2818 > 0) {
				local1349.anInt2826 = local36.method773();
			}
		}
		for (local952 = 0; local952 < local190; local952++) {
			@Pc(1369) Class80 local1369 = local241[local952];
			if (local1369.anInt2826 > 0) {
				local1369.anInt2819 = local36.method773();
			}
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "([BB[ILclient!pa;)Z")
	public boolean method1709(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class62 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(9) int local9 = 0;
		@Pc(11) Class4_Sub6_Sub1 local11 = null;
		for (@Pc(13) int local13 = 0; local13 < 128; local13++) {
			if (arg0 == null || arg0[local13] != 0) {
				@Pc(36) int local36 = this.anIntArray316[local13];
				if (local36 != 0) {
					if (local36 != local9) {
						local9 = local36--;
						if ((local36 & 0x1) == 0) {
							local11 = arg2.method1371(arg1, local36 >> 2);
						} else {
							local11 = arg2.method1366(local36 >> 2, arg1);
						}
						if (local11 == null) {
							local7 = false;
						}
					}
					if (local11 != null) {
						this.aClass4_Sub6_Sub1Array1[local13] = local11;
						this.anIntArray316[local13] = 0;
					}
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!sb", name = "e", descriptor = "(I)V")
	public void method1710() {
		this.anIntArray316 = null;
	}
}
