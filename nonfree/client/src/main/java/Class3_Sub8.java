import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bm")
public final class Class3_Sub8 extends Class3 {

	@OriginalMember(owner = "client!bm", name = "l", descriptor = "[B")
	public byte[] aByteArray8;

	@OriginalMember(owner = "client!bm", name = "m", descriptor = "[S")
	public short[] aShortArray16;

	@OriginalMember(owner = "client!bm", name = "n", descriptor = "I")
	public int anInt721;

	@OriginalMember(owner = "client!bm", name = "o", descriptor = "[Lclient!be;")
	public Class20[] aClass20Array1;

	@OriginalMember(owner = "client!bm", name = "t", descriptor = "[I")
	private int[] anIntArray37;

	@OriginalMember(owner = "client!bm", name = "u", descriptor = "[B")
	public byte[] aByteArray9;

	@OriginalMember(owner = "client!bm", name = "v", descriptor = "[B")
	public byte[] aByteArray10;

	@OriginalMember(owner = "client!bm", name = "y", descriptor = "[Lclient!hh;")
	public Class3_Sub17_Sub1[] aClass3_Sub17_Sub1Array1;

	@OriginalMember(owner = "client!bm", name = "<init>", descriptor = "()V")
	private Class3_Sub8() {
	}

	@OriginalMember(owner = "client!bm", name = "<init>", descriptor = "([B)V")
	public Class3_Sub8(@OriginalArg(0) byte[] arg0) {
		this.aByteArray8 = new byte[128];
		this.aClass20Array1 = new Class20[128];
		this.anIntArray37 = new int[128];
		this.aShortArray16 = new short[128];
		this.aByteArray9 = new byte[128];
		this.aByteArray10 = new byte[128];
		this.aClass3_Sub17_Sub1Array1 = new Class3_Sub17_Sub1[128];
		@Pc(36) Class3_Sub4 local36 = new Class3_Sub4(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray70[local36.anInt4268 + local38] != 0; local38++) {
		}
		@Pc(53) byte[] local53 = new byte[local38];
		for (@Pc(55) int local55 = 0; local55 < local38; local55++) {
			local53[local55] = local36.method3621();
		}
		local38++;
		local36.anInt4268++;
		@Pc(77) int local77 = local36.anInt4268;
		local36.anInt4268 += local38;
		@Pc(85) int local85;
		for (local85 = 0; local36.aByteArray70[local36.anInt4268 + local85] != 0; local85++) {
		}
		@Pc(103) byte[] local103 = new byte[local85];
		for (@Pc(105) int local105 = 0; local105 < local85; local105++) {
			local103[local105] = local36.method3621();
		}
		local36.anInt4268++;
		local85++;
		@Pc(127) int local127 = local36.anInt4268;
		local36.anInt4268 += local85;
		@Pc(135) int local135;
		for (local135 = 0; local36.aByteArray70[local135 + local36.anInt4268] != 0; local135++) {
		}
		@Pc(152) byte[] local152 = new byte[local135];
		for (@Pc(154) int local154 = 0; local154 < local135; local154++) {
			local152[local154] = local36.method3621();
		}
		local135++;
		local36.anInt4268++;
		@Pc(176) byte[] local176 = new byte[local135];
		@Pc(181) int local181;
		@Pc(193) int local193;
		@Pc(199) int local199;
		if (local135 <= 1) {
			local181 = local135;
		} else {
			local176[1] = 1;
			local181 = 2;
			@Pc(191) int local191 = 1;
			for (local193 = 2; local193 < local135; local193++) {
				local199 = local36.method3643();
				if (local199 == 0) {
					local191 = local181++;
				} else {
					if (local191 >= local199) {
						local199--;
					}
					local191 = local199;
				}
				local176[local193] = (byte) local191;
			}
		}
		@Pc(231) Class20[] local231 = new Class20[local181];
		for (local193 = 0; local193 < local231.length; local193++) {
			@Pc(243) Class20 local243 = local231[local193] = new Class20();
			@Pc(247) int local247 = local36.method3643();
			if (local247 > 0) {
				local243.aByteArray6 = new byte[local247 * 2];
			}
			local247 = local36.method3643();
			if (local247 > 0) {
				local243.aByteArray7 = new byte[local247 * 2 + 2];
				local243.aByteArray7[1] = 64;
			}
		}
		local199 = local36.method3643();
		@Pc(299) byte[] local299 = local199 > 0 ? new byte[local199 * 2] : null;
		local199 = local36.method3643();
		@Pc(312) byte[] local312 = local199 <= 0 ? null : new byte[local199 * 2];
		@Pc(314) int local314;
		for (local314 = 0; local36.aByteArray70[local36.anInt4268 + local314] != 0; local314++) {
		}
		@Pc(329) byte[] local329 = new byte[local314];
		for (@Pc(331) int local331 = 0; local331 < local314; local331++) {
			local329[local331] = local36.method3621();
		}
		local36.anInt4268++;
		local314++;
		@Pc(356) int local356 = 0;
		for (@Pc(358) int local358 = 0; local358 < 128; local358++) {
			local356 += local36.method3643();
			this.aShortArray16[local358] = (short) local356;
		}
		local356 = 0;
		for (@Pc(382) int local382 = 0; local382 < 128; local382++) {
			local356 += local36.method3643();
			this.aShortArray16[local382] = (short) (this.aShortArray16[local382] + (local356 << 8));
		}
		@Pc(407) int local407 = 0;
		@Pc(409) int local409 = 0;
		@Pc(411) int local411 = 0;
		for (@Pc(413) int local413 = 0; local413 < 128; local413++) {
			if (local407 == 0) {
				if (local329.length > local409) {
					local407 = local329[local409++];
				} else {
					local407 = -1;
				}
				local411 = local36.method3669();
			}
			this.aShortArray16[local413] = (short) (this.aShortArray16[local413] + ((local411 - 1 & 0x2) << 14));
			local407--;
			this.anIntArray37[local413] = local411;
		}
		local409 = 0;
		local407 = 0;
		@Pc(474) int local474 = 0;
		for (@Pc(476) int local476 = 0; local476 < 128; local476++) {
			if (this.anIntArray37[local476] != 0) {
				if (local407 == 0) {
					if (local53.length <= local409) {
						local407 = -1;
					} else {
						local407 = local53[local409++];
					}
					local474 = local36.aByteArray70[local77++] - 1;
				}
				local407--;
				this.aByteArray9[local476] = (byte) local474;
			}
		}
		local407 = 0;
		local409 = 0;
		@Pc(530) int local530 = 0;
		for (@Pc(532) int local532 = 0; local532 < 128; local532++) {
			if (this.anIntArray37[local532] != 0) {
				if (local407 == 0) {
					if (local103.length > local409) {
						local407 = local103[local409++];
					} else {
						local407 = -1;
					}
					local530 = local36.aByteArray70[local127++] + 16 << 2;
				}
				local407--;
				this.aByteArray10[local532] = (byte) local530;
			}
		}
		local407 = 0;
		local409 = 0;
		@Pc(586) Class20 local586 = null;
		for (@Pc(588) int local588 = 0; local588 < 128; local588++) {
			if (this.anIntArray37[local588] != 0) {
				if (local407 == 0) {
					local586 = local231[local176[local409]];
					if (local409 >= local152.length) {
						local407 = -1;
					} else {
						local407 = local152[local409++];
					}
				}
				local407--;
				this.aClass20Array1[local588] = local586;
			}
		}
		local407 = 0;
		local409 = 0;
		@Pc(634) int local634 = 0;
		for (@Pc(636) int local636 = 0; local636 < 128; local636++) {
			if (local407 == 0) {
				if (local329.length <= local409) {
					local407 = -1;
				} else {
					local407 = local329[local409++];
				}
				if (this.anIntArray37[local636] > 0) {
					local634 = local36.method3643() + 1;
				}
			}
			local407--;
			this.aByteArray8[local636] = (byte) local634;
		}
		this.anInt721 = local36.method3643() + 1;
		@Pc(703) int local703;
		for (@Pc(692) int local692 = 0; local692 < local181; local692++) {
			@Pc(698) Class20 local698 = local231[local692];
			if (local698.aByteArray6 != null) {
				for (local703 = 1; local703 < local698.aByteArray6.length; local703 += 2) {
					local698.aByteArray6[local703] = local36.method3621();
				}
			}
			if (local698.aByteArray7 != null) {
				for (local703 = 3; local703 < local698.aByteArray7.length - 2; local703 += 2) {
					local698.aByteArray7[local703] = local36.method3621();
				}
			}
		}
		@Pc(760) int local760;
		if (local299 != null) {
			for (local760 = 1; local760 < local299.length; local760 += 2) {
				local299[local760] = local36.method3621();
			}
		}
		if (local312 != null) {
			for (local760 = 1; local760 < local312.length; local760 += 2) {
				local312[local760] = local36.method3621();
			}
		}
		@Pc(809) int local809;
		for (local760 = 0; local760 < local181; local760++) {
			@Pc(802) Class20 local802 = local231[local760];
			if (local802.aByteArray7 != null) {
				local356 = 0;
				for (local809 = 2; local809 < local802.aByteArray7.length; local809 += 2) {
					local356 = local356 + local36.method3643() + 1;
					local802.aByteArray7[local809] = (byte) local356;
				}
			}
		}
		@Pc(854) int local854;
		for (local703 = 0; local703 < local181; local703++) {
			@Pc(847) Class20 local847 = local231[local703];
			if (local847.aByteArray6 != null) {
				local356 = 0;
				for (local854 = 2; local854 < local847.aByteArray6.length; local854 += 2) {
					local356 = local356 + local36.method3643() + 1;
					local847.aByteArray6[local854] = (byte) local356;
				}
			}
		}
		@Pc(936) int local936;
		@Pc(963) int local963;
		@Pc(969) byte local969;
		@Pc(990) int local990;
		@Pc(992) int local992;
		@Pc(1001) int local1001;
		@Pc(930) byte local930;
		@Pc(1044) int local1044;
		if (local299 != null) {
			local356 = local36.method3643();
			local299[0] = (byte) local356;
			for (local809 = 2; local809 < local299.length; local809 += 2) {
				local356 = local356 + local36.method3643() + 1;
				local299[local809] = (byte) local356;
			}
			local930 = local299[0];
			@Pc(934) byte local934 = local299[1];
			for (local936 = 0; local936 < local930; local936++) {
				this.aByteArray8[local936] = (byte) (local934 * this.aByteArray8[local936] + 32 >> 6);
			}
			local963 = 2;
			while (local299.length > local963) {
				local969 = local299[local963];
				@Pc(975) byte local975 = local299[local963 + 1];
				local990 = local934 * (local969 - local930) + (local969 - local930) / 2;
				for (local992 = local930; local992 < local969; local992++) {
					local1001 = Static103.method1736(local990, local969 - local930);
					local990 += local975 - local934;
					this.aByteArray8[local992] = (byte) (local1001 * this.aByteArray8[local992] + 32 >> 6);
				}
				local963 += 2;
				local930 = local969;
				local934 = local975;
			}
			for (local1044 = local930; local1044 < 128; local1044++) {
				this.aByteArray8[local1044] = (byte) (this.aByteArray8[local1044] * local934 + 32 >> 6);
			}
		}
		@Pc(1112) int local1112;
		if (local312 != null) {
			local356 = local36.method3643();
			local312[0] = (byte) local356;
			for (local809 = 2; local809 < local312.length; local809 += 2) {
				local356 += local36.method3643() + 1;
				local312[local809] = (byte) local356;
			}
			local930 = local312[0];
			local1112 = local312[1] << 1;
			for (local936 = 0; local936 < local930; local936++) {
				local963 = (this.aByteArray10[local936] & 0xFF) + local1112;
				if (local963 < 0) {
					local963 = 0;
				}
				if (local963 > 128) {
					local963 = 128;
				}
				this.aByteArray10[local936] = (byte) local963;
			}
			local963 = 2;
			@Pc(1170) int local1170;
			while (local312.length > local963) {
				local969 = local312[local963];
				local1170 = local312[local963 + 1] << 1;
				local990 = local1112 * (local969 - local930) + (local969 - local930) / 2;
				for (local992 = local930; local992 < local969; local992++) {
					local1001 = Static103.method1736(local990, local969 - local930);
					@Pc(1204) int local1204 = local1001 + (this.aByteArray10[local992] & 0xFF);
					if (local1204 < 0) {
						local1204 = 0;
					}
					if (local1204 > 128) {
						local1204 = 128;
					}
					local990 += local1170 - local1112;
					this.aByteArray10[local992] = (byte) local1204;
				}
				local963 += 2;
				local1112 = local1170;
				local930 = local969;
			}
			for (local1044 = local930; local1044 < 128; local1044++) {
				local1170 = (this.aByteArray10[local1044] & 0xFF) + local1112;
				if (local1170 < 0) {
					local1170 = 0;
				}
				if (local1170 > 128) {
					local1170 = 128;
				}
				this.aByteArray10[local1044] = (byte) local1170;
			}
		}
		for (local809 = 0; local809 < local181; local809++) {
			local231[local809].anInt566 = local36.method3643();
		}
		for (local854 = 0; local854 < local181; local854++) {
			@Pc(1308) Class20 local1308 = local231[local854];
			if (local1308.aByteArray6 != null) {
				local1308.anInt565 = local36.method3643();
			}
			if (local1308.aByteArray7 != null) {
				local1308.anInt563 = local36.method3643();
			}
			if (local1308.anInt566 > 0) {
				local1308.anInt559 = local36.method3643();
			}
		}
		for (local1112 = 0; local1112 < local181; local1112++) {
			local231[local1112].anInt564 = local36.method3643();
		}
		for (local936 = 0; local936 < local181; local936++) {
			@Pc(1366) Class20 local1366 = local231[local936];
			if (local1366.anInt564 > 0) {
				local1366.anInt556 = local36.method3643();
			}
		}
		for (local963 = 0; local963 < local181; local963++) {
			@Pc(1386) Class20 local1386 = local231[local963];
			if (local1386.anInt556 > 0) {
				local1386.anInt560 = local36.method3643();
			}
		}
	}

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "(I)V")
	public void method585() {
		this.anIntArray37 = null;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "([B[ILclient!eb;Z)Z")
	public boolean method587(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class52 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(9) int local9 = 0;
		@Pc(11) Class3_Sub17_Sub1 local11 = null;
		for (@Pc(13) int local13 = 0; local13 < 128; local13++) {
			if (arg0 == null || arg0[local13] != 0) {
				@Pc(25) int local25 = this.anIntArray37[local13];
				if (local25 != 0) {
					if (local25 != local9) {
						local9 = local25--;
						if ((local25 & 0x1) == 0) {
							local11 = arg2.method1111(local25 >> 2, arg1);
						} else {
							local11 = arg2.method1114(arg1, local25 >> 2);
						}
						if (local11 == null) {
							local7 = false;
						}
					}
					if (local11 != null) {
						this.aClass3_Sub17_Sub1Array1[local13] = local11;
						this.anIntArray37[local13] = 0;
					}
				}
			}
		}
		return local7;
	}
}
