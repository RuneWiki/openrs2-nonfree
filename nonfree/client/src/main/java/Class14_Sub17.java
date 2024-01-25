import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ep")
public final class Class14_Sub17 extends Class14 {

	@OriginalMember(owner = "client!ep", name = "s", descriptor = "[S")
	public short[] aShortArray33;

	@OriginalMember(owner = "client!ep", name = "u", descriptor = "[B")
	public byte[] aByteArray38;

	@OriginalMember(owner = "client!ep", name = "x", descriptor = "I")
	public int anInt2272;

	@OriginalMember(owner = "client!ep", name = "l", descriptor = "[Lclient!pd;")
	public Class14_Sub19_Sub1[] aClass14_Sub19_Sub1Array1;

	@OriginalMember(owner = "client!ep", name = "z", descriptor = "[B")
	public byte[] aByteArray39;

	@OriginalMember(owner = "client!ep", name = "q", descriptor = "[B")
	public byte[] aByteArray40;

	@OriginalMember(owner = "client!ep", name = "o", descriptor = "[I")
	private int[] anIntArray143;

	@OriginalMember(owner = "client!ep", name = "w", descriptor = "[Lclient!hka;")
	public Class156[] aClass156Array1;

	@OriginalMember(owner = "client!ep", name = "<init>", descriptor = "()V")
	private Class14_Sub17() {
	}

	@OriginalMember(owner = "client!ep", name = "<init>", descriptor = "([B)V")
	public Class14_Sub17(@OriginalArg(0) byte[] arg0) {
		this.aByteArray40 = new byte[128];
		this.aClass156Array1 = new Class156[128];
		this.aByteArray39 = new byte[128];
		this.anIntArray143 = new int[128];
		this.aClass14_Sub19_Sub1Array1 = new Class14_Sub19_Sub1[128];
		this.aByteArray38 = new byte[128];
		this.aShortArray33 = new short[128];
		@Pc(34) Class14_Sub21 local34 = new Class14_Sub21(arg0);
		@Pc(36) int local36;
		for (local36 = 0; local34.aByteArray99[local34.anInt8936 + local36] != 0; local36++) {
		}
		@Pc(53) byte[] local53 = new byte[local36];
		for (@Pc(55) int local55 = 0; local55 < local36; local55++) {
			local53[local55] = local34.method7720();
		}
		local36++;
		local34.anInt8936++;
		@Pc(76) int local76 = local34.anInt8936;
		local34.anInt8936 += local36;
		@Pc(84) int local84;
		for (local84 = 0; local34.aByteArray99[local84 + local34.anInt8936] != 0; local84++) {
		}
		@Pc(97) byte[] local97 = new byte[local84];
		for (@Pc(99) int local99 = 0; local99 < local84; local99++) {
			local97[local99] = local34.method7720();
		}
		local84++;
		local34.anInt8936++;
		@Pc(124) int local124 = local34.anInt8936;
		local34.anInt8936 += local84;
		@Pc(132) int local132;
		for (local132 = 0; local34.aByteArray99[local34.anInt8936 + local132] != 0; local132++) {
		}
		@Pc(146) byte[] local146 = new byte[local132];
		for (@Pc(148) int local148 = 0; local148 < local132; local148++) {
			local146[local148] = local34.method7720();
		}
		local34.anInt8936++;
		local132++;
		@Pc(173) byte[] local173 = new byte[local132];
		@Pc(180) int local180;
		@Pc(191) int local191;
		@Pc(196) int local196;
		if (local132 <= 1) {
			local180 = local132;
		} else {
			local173[1] = 1;
			@Pc(187) int local187 = 1;
			local180 = 2;
			for (local191 = 2; local191 < local132; local191++) {
				local196 = local34.method7695(127);
				if (local196 == 0) {
					local187 = local180++;
				} else {
					if (local187 >= local196) {
						local196--;
					}
					local187 = local196;
				}
				local173[local191] = (byte) local187;
			}
		}
		@Pc(233) Class156[] local233 = new Class156[local180];
		for (local191 = 0; local191 < local233.length; local191++) {
			@Pc(244) Class156 local244 = local233[local191] = new Class156();
			@Pc(248) int local248 = local34.method7695(111);
			if (local248 > 0) {
				local244.aByteArray54 = new byte[local248 * 2];
			}
			local248 = local34.method7695(123);
			if (local248 > 0) {
				local244.aByteArray55 = new byte[local248 * 2 + 2];
				local244.aByteArray55[1] = 64;
			}
		}
		local196 = local34.method7695(122);
		@Pc(308) byte[] local308 = local196 <= 0 ? null : new byte[local196 * 2];
		local196 = local34.method7695(105);
		@Pc(325) byte[] local325 = local196 <= 0 ? null : new byte[local196 * 2];
		@Pc(327) int local327;
		for (local327 = 0; local34.aByteArray99[local327 + local34.anInt8936] != 0; local327++) {
		}
		@Pc(340) byte[] local340 = new byte[local327];
		for (@Pc(342) int local342 = 0; local342 < local327; local342++) {
			local340[local342] = local34.method7720();
		}
		local327++;
		local34.anInt8936++;
		@Pc(366) int local366 = 0;
		for (@Pc(368) int local368 = 0; local368 < 128; local368++) {
			local366 += local34.method7695(107);
			this.aShortArray33[local368] = (short) local366;
		}
		local366 = 0;
		for (@Pc(391) int local391 = 0; local391 < 128; local391++) {
			local366 += local34.method7695(125);
			this.aShortArray33[local391] = (short) (this.aShortArray33[local391] + (local366 << 8));
		}
		@Pc(417) int local417 = 0;
		@Pc(419) int local419 = 0;
		@Pc(421) int local421 = 0;
		for (@Pc(423) int local423 = 0; local423 < 128; local423++) {
			if (local417 == 0) {
				if (local340.length <= local419) {
					local417 = -1;
				} else {
					local417 = local340[local419++];
				}
				local421 = local34.method7741();
			}
			this.aShortArray33[local423] = (short) (this.aShortArray33[local423] + ((local421 - 1 & 0x2) << 14));
			this.anIntArray143[local423] = local421;
			local417--;
		}
		local419 = 0;
		local417 = 0;
		@Pc(477) int local477 = 0;
		for (@Pc(479) int local479 = 0; local479 < 128; local479++) {
			if (this.anIntArray143[local479] != 0) {
				if (local417 == 0) {
					if (local53.length > local419) {
						local417 = local53[local419++];
					} else {
						local417 = -1;
					}
					local477 = local34.aByteArray99[local76++] - 1;
				}
				local417--;
				this.aByteArray40[local479] = (byte) local477;
			}
		}
		local417 = 0;
		local419 = 0;
		@Pc(533) int local533 = 0;
		for (@Pc(535) int local535 = 0; local535 < 128; local535++) {
			if (this.anIntArray143[local535] != 0) {
				if (local417 == 0) {
					local533 = local34.aByteArray99[local124++] + 16 << 2;
					if (local97.length > local419) {
						local417 = local97[local419++];
					} else {
						local417 = -1;
					}
				}
				local417--;
				this.aByteArray38[local535] = (byte) local533;
			}
		}
		local419 = 0;
		local417 = 0;
		@Pc(584) Class156 local584 = null;
		for (@Pc(586) int local586 = 0; local586 < 128; local586++) {
			if (this.anIntArray143[local586] != 0) {
				if (local417 == 0) {
					local584 = local233[local173[local419]];
					if (local146.length <= local419) {
						local417 = -1;
					} else {
						local417 = local146[local419++];
					}
				}
				local417--;
				this.aClass156Array1[local586] = local584;
			}
		}
		local419 = 0;
		local417 = 0;
		@Pc(634) int local634 = 0;
		for (@Pc(636) int local636 = 0; local636 < 128; local636++) {
			if (local417 == 0) {
				if (local340.length <= local419) {
					local417 = -1;
				} else {
					local417 = local340[local419++];
				}
				if (this.anIntArray143[local636] > 0) {
					local634 = local34.method7695(114) + 1;
				}
			}
			this.aByteArray39[local636] = (byte) local634;
			local417--;
		}
		this.anInt2272 = local34.method7695(109) + 1;
		@Pc(699) int local699;
		for (@Pc(689) int local689 = 0; local689 < local180; local689++) {
			@Pc(694) Class156 local694 = local233[local689];
			if (local694.aByteArray54 != null) {
				for (local699 = 1; local699 < local694.aByteArray54.length; local699 += 2) {
					local694.aByteArray54[local699] = local34.method7720();
				}
			}
			if (local694.aByteArray55 != null) {
				for (local699 = 3; local699 < local694.aByteArray55.length - 2; local699 += 2) {
					local694.aByteArray55[local699] = local34.method7720();
				}
			}
		}
		@Pc(756) int local756;
		if (local308 != null) {
			for (local756 = 1; local756 < local308.length; local756 += 2) {
				local308[local756] = local34.method7720();
			}
		}
		if (local325 != null) {
			for (local756 = 1; local756 < local325.length; local756 += 2) {
				local325[local756] = local34.method7720();
			}
		}
		@Pc(808) int local808;
		for (local756 = 0; local756 < local180; local756++) {
			@Pc(801) Class156 local801 = local233[local756];
			if (local801.aByteArray55 != null) {
				local366 = 0;
				for (local808 = 2; local808 < local801.aByteArray55.length; local808 += 2) {
					local366 = local366 + local34.method7695(119) + 1;
					local801.aByteArray55[local808] = (byte) local366;
				}
			}
		}
		@Pc(858) int local858;
		for (local699 = 0; local699 < local180; local699++) {
			@Pc(851) Class156 local851 = local233[local699];
			if (local851.aByteArray54 != null) {
				local366 = 0;
				for (local858 = 2; local858 < local851.aByteArray54.length; local858 += 2) {
					local366 = local34.method7695(114) + local366 + 1;
					local851.aByteArray54[local858] = (byte) local366;
				}
			}
		}
		@Pc(937) int local937;
		@Pc(963) int local963;
		@Pc(968) byte local968;
		@Pc(987) int local987;
		@Pc(989) int local989;
		@Pc(998) int local998;
		@Pc(931) byte local931;
		@Pc(1041) int local1041;
		if (local308 != null) {
			local366 = local34.method7695(115);
			local308[0] = (byte) local366;
			for (local808 = 2; local808 < local308.length; local808 += 2) {
				local366 = local366 + local34.method7695(106) + 1;
				local308[local808] = (byte) local366;
			}
			local931 = local308[0];
			@Pc(935) byte local935 = local308[1];
			for (local937 = 0; local937 < local931; local937++) {
				this.aByteArray39[local937] = (byte) (local935 * this.aByteArray39[local937] + 32 >> 6);
			}
			local963 = 2;
			while (local308.length > local963) {
				local968 = local308[local963];
				@Pc(974) byte local974 = local308[local963 + 1];
				local987 = (local968 - local931) / 2 + local935 * (local968 - local931);
				for (local989 = local931; local989 < local968; local989++) {
					local998 = Static117.method1831(local968 - local931, local987);
					local987 += local974 - local935;
					this.aByteArray39[local989] = (byte) (this.aByteArray39[local989] * local998 + 32 >> 6);
				}
				local935 = local974;
				local963 += 2;
				local931 = local968;
			}
			for (local1041 = local931; local1041 < 128; local1041++) {
				this.aByteArray39[local1041] = (byte) (this.aByteArray39[local1041] * local935 + 32 >> 6);
			}
		}
		@Pc(1107) int local1107;
		if (local325 != null) {
			local366 = local34.method7695(99);
			local325[0] = (byte) local366;
			for (local808 = 2; local808 < local325.length; local808 += 2) {
				local366 = local34.method7695(107) + local366 + 1;
				local325[local808] = (byte) local366;
			}
			local931 = local325[0];
			local1107 = local325[1] << 1;
			for (local937 = 0; local937 < local931; local937++) {
				local963 = local1107 + (this.aByteArray38[local937] & 0xFF);
				if (local963 < 0) {
					local963 = 0;
				}
				if (local963 > 128) {
					local963 = 128;
				}
				this.aByteArray38[local937] = (byte) local963;
			}
			local963 = 2;
			@Pc(1158) int local1158;
			while (local963 < local325.length) {
				local968 = local325[local963];
				local1158 = local325[local963 + 1] << 1;
				local987 = (local968 - local931) / 2 + local1107 * (local968 - local931);
				for (local989 = local931; local989 < local968; local989++) {
					local998 = Static117.method1831(local968 - local931, local987);
					@Pc(1192) int local1192 = local998 + (this.aByteArray38[local989] & 0xFF);
					if (local1192 < 0) {
						local1192 = 0;
					}
					if (local1192 > 128) {
						local1192 = 128;
					}
					local987 += local1158 - local1107;
					this.aByteArray38[local989] = (byte) local1192;
				}
				local963 += 2;
				local931 = local968;
				local1107 = local1158;
			}
			for (local1041 = local931; local1041 < 128; local1041++) {
				local1158 = (this.aByteArray38[local1041] & 0xFF) + local1107;
				if (local1158 < 0) {
					local1158 = 0;
				}
				if (local1158 > 128) {
					local1158 = 128;
				}
				this.aByteArray38[local1041] = (byte) local1158;
			}
		}
		for (local808 = 0; local808 < local180; local808++) {
			local233[local808].anInt4369 = local34.method7695(104);
		}
		for (local858 = 0; local858 < local180; local858++) {
			@Pc(1292) Class156 local1292 = local233[local858];
			if (local1292.aByteArray54 != null) {
				local1292.anInt4373 = local34.method7695(118);
			}
			if (local1292.aByteArray55 != null) {
				local1292.anInt4370 = local34.method7695(121);
			}
			if (local1292.anInt4369 > 0) {
				local1292.anInt4366 = local34.method7695(101);
			}
		}
		for (local1107 = 0; local1107 < local180; local1107++) {
			local233[local1107].anInt4371 = local34.method7695(99);
		}
		for (local937 = 0; local937 < local180; local937++) {
			@Pc(1347) Class156 local1347 = local233[local937];
			if (local1347.anInt4371 > 0) {
				local1347.anInt4372 = local34.method7695(114);
			}
		}
		for (local963 = 0; local963 < local180; local963++) {
			@Pc(1375) Class156 local1375 = local233[local963];
			if (local1375.anInt4372 > 0) {
				local1375.anInt4368 = local34.method7695(102);
			}
		}
	}

	@OriginalMember(owner = "client!ep", name = "e", descriptor = "(I)V")
	public void method2152() {
		this.anIntArray143 = null;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(ZLclient!ls;[I[B)Z")
	public boolean method2154(@OriginalArg(1) Class226 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(5) boolean local5 = true;
		@Pc(7) int local7 = 0;
		@Pc(9) Class14_Sub19_Sub1 local9 = null;
		for (@Pc(11) int local11 = 0; local11 < 128; local11++) {
			if (arg2 == null || arg2[local11] != 0) {
				@Pc(34) int local34 = this.anIntArray143[local11];
				if (local34 != 0) {
					if (local7 != local34) {
						local7 = local34--;
						if ((local34 & 0x1) == 0) {
							local9 = arg0.method5463(local34 >> 2, arg1);
						} else {
							local9 = arg0.method5457(local34 >> 2, arg1);
						}
						if (local9 == null) {
							local5 = false;
						}
					}
					if (local9 != null) {
						this.aClass14_Sub19_Sub1Array1[local11] = local9;
						this.anIntArray143[local11] = 0;
					}
				}
			}
		}
		return local5;
	}
}
