import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mi")
public final class Class6_Sub26 extends Class6 {

	@OriginalMember(owner = "client!mi", name = "j", descriptor = "[B")
	public byte[] aByteArray60;

	@OriginalMember(owner = "client!mi", name = "k", descriptor = "[S")
	public short[] aShortArray69;

	@OriginalMember(owner = "client!mi", name = "o", descriptor = "[I")
	private int[] anIntArray430;

	@OriginalMember(owner = "client!mi", name = "p", descriptor = "I")
	public int anInt3655;

	@OriginalMember(owner = "client!mi", name = "q", descriptor = "[Lclient!hk;")
	public Class6_Sub11_Sub1[] aClass6_Sub11_Sub1Array1;

	@OriginalMember(owner = "client!mi", name = "s", descriptor = "[B")
	public byte[] aByteArray61;

	@OriginalMember(owner = "client!mi", name = "t", descriptor = "[Lclient!ub;")
	public Class195[] aClass195Array1;

	@OriginalMember(owner = "client!mi", name = "u", descriptor = "[B")
	public byte[] aByteArray62;

	@OriginalMember(owner = "client!mi", name = "<init>", descriptor = "()V")
	private Class6_Sub26() {
	}

	@OriginalMember(owner = "client!mi", name = "<init>", descriptor = "([B)V")
	public Class6_Sub26(@OriginalArg(0) byte[] arg0) {
		this.aClass6_Sub11_Sub1Array1 = new Class6_Sub11_Sub1[128];
		this.aByteArray60 = new byte[128];
		this.aByteArray62 = new byte[128];
		this.anIntArray430 = new int[128];
		this.aClass195Array1 = new Class195[128];
		this.aByteArray61 = new byte[128];
		this.aShortArray69 = new short[128];
		@Pc(36) Class6_Sub10 local36 = new Class6_Sub10(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray67[local36.anInt4188 + local38] != 0; local38++) {
		}
		@Pc(56) byte[] local56 = new byte[local38];
		for (@Pc(58) int local58 = 0; local58 < local38; local58++) {
			local56[local58] = local36.method3992();
		}
		local36.anInt4188++;
		local38++;
		@Pc(84) int local84 = local36.anInt4188;
		local36.anInt4188 += local38;
		@Pc(92) int local92;
		for (local92 = 0; local36.aByteArray67[local36.anInt4188 + local92] != 0; local92++) {
		}
		@Pc(107) byte[] local107 = new byte[local92];
		for (@Pc(109) int local109 = 0; local109 < local92; local109++) {
			local107[local109] = local36.method3992();
		}
		local92++;
		local36.anInt4188++;
		@Pc(135) int local135 = local36.anInt4188;
		local36.anInt4188 += local92;
		@Pc(143) int local143;
		for (local143 = 0; local36.aByteArray67[local143 + local36.anInt4188] != 0; local143++) {
		}
		@Pc(160) byte[] local160 = new byte[local143];
		for (@Pc(162) int local162 = 0; local162 < local143; local162++) {
			local160[local162] = local36.method3992();
		}
		local36.anInt4188++;
		local143++;
		@Pc(184) byte[] local184 = new byte[local143];
		@Pc(191) int local191;
		@Pc(203) int local203;
		@Pc(209) int local209;
		if (local143 <= 1) {
			local191 = local143;
		} else {
			local184[1] = 1;
			@Pc(199) int local199 = 1;
			local191 = 2;
			for (local203 = 2; local203 < local143; local203++) {
				local209 = local36.method3972();
				if (local209 == 0) {
					local199 = local191++;
				} else {
					if (local199 >= local209) {
						local209--;
					}
					local199 = local209;
				}
				local184[local203] = (byte) local199;
			}
		}
		@Pc(237) Class195[] local237 = new Class195[local191];
		for (local203 = 0; local203 < local237.length; local203++) {
			@Pc(249) Class195 local249 = local237[local203] = new Class195();
			@Pc(253) int local253 = local36.method3972();
			if (local253 > 0) {
				local249.aByteArray91 = new byte[local253 * 2];
			}
			local253 = local36.method3972();
			if (local253 > 0) {
				local249.aByteArray90 = new byte[local253 * 2 + 2];
				local249.aByteArray90[1] = 64;
			}
		}
		local209 = local36.method3972();
		@Pc(305) byte[] local305 = local209 > 0 ? new byte[local209 * 2] : null;
		local209 = local36.method3972();
		@Pc(318) byte[] local318 = local209 > 0 ? new byte[local209 * 2] : null;
		@Pc(320) int local320;
		for (local320 = 0; local36.aByteArray67[local36.anInt4188 + local320] != 0; local320++) {
		}
		@Pc(334) byte[] local334 = new byte[local320];
		for (@Pc(336) int local336 = 0; local336 < local320; local336++) {
			local334[local336] = local36.method3992();
		}
		local36.anInt4188++;
		local320++;
		@Pc(361) int local361 = 0;
		for (@Pc(363) int local363 = 0; local363 < 128; local363++) {
			local361 += local36.method3972();
			this.aShortArray69[local363] = (short) local361;
		}
		local361 = 0;
		for (@Pc(385) int local385 = 0; local385 < 128; local385++) {
			local361 += local36.method3972();
			this.aShortArray69[local385] = (short) (this.aShortArray69[local385] + (local361 << 8));
		}
		@Pc(410) int local410 = 0;
		@Pc(412) int local412 = 0;
		@Pc(414) int local414 = 0;
		for (@Pc(416) int local416 = 0; local416 < 128; local416++) {
			if (local410 == 0) {
				if (local412 >= local334.length) {
					local410 = -1;
				} else {
					local410 = local334[local412++];
				}
				local414 = local36.method3982();
			}
			this.aShortArray69[local416] = (short) (this.aShortArray69[local416] + ((local414 - 1 & 0x2) << 14));
			local410--;
			this.anIntArray430[local416] = local414;
		}
		local412 = 0;
		local410 = 0;
		@Pc(477) int local477 = 0;
		for (@Pc(479) int local479 = 0; local479 < 128; local479++) {
			if (this.anIntArray430[local479] != 0) {
				if (local410 == 0) {
					local477 = local36.aByteArray67[local84++] - 1;
					if (local56.length > local412) {
						local410 = local56[local412++];
					} else {
						local410 = -1;
					}
				}
				local410--;
				this.aByteArray60[local479] = (byte) local477;
			}
		}
		local412 = 0;
		local410 = 0;
		@Pc(529) int local529 = 0;
		for (@Pc(531) int local531 = 0; local531 < 128; local531++) {
			if (this.anIntArray430[local531] != 0) {
				if (local410 == 0) {
					if (local107.length > local412) {
						local410 = local107[local412++];
					} else {
						local410 = -1;
					}
					local529 = local36.aByteArray67[local135++] + 16 << 2;
				}
				this.aByteArray61[local531] = (byte) local529;
				local410--;
			}
		}
		local410 = 0;
		local412 = 0;
		@Pc(582) Class195 local582 = null;
		for (@Pc(584) int local584 = 0; local584 < 128; local584++) {
			if (this.anIntArray430[local584] != 0) {
				if (local410 == 0) {
					local582 = local237[local184[local412]];
					if (local160.length > local412) {
						local410 = local160[local412++];
					} else {
						local410 = -1;
					}
				}
				this.aClass195Array1[local584] = local582;
				local410--;
			}
		}
		local412 = 0;
		local410 = 0;
		@Pc(631) int local631 = 0;
		for (@Pc(633) int local633 = 0; local633 < 128; local633++) {
			if (local410 == 0) {
				if (local412 < local334.length) {
					local410 = local334[local412++];
				} else {
					local410 = -1;
				}
				if (this.anIntArray430[local633] > 0) {
					local631 = local36.method3972() + 1;
				}
			}
			this.aByteArray62[local633] = (byte) local631;
			local410--;
		}
		this.anInt3655 = local36.method3972() + 1;
		@Pc(702) int local702;
		for (@Pc(691) int local691 = 0; local691 < local191; local691++) {
			@Pc(697) Class195 local697 = local237[local691];
			if (local697.aByteArray91 != null) {
				for (local702 = 1; local702 < local697.aByteArray91.length; local702 += 2) {
					local697.aByteArray91[local702] = local36.method3992();
				}
			}
			if (local697.aByteArray90 != null) {
				for (local702 = 3; local702 < local697.aByteArray90.length - 2; local702 += 2) {
					local697.aByteArray90[local702] = local36.method3992();
				}
			}
		}
		@Pc(755) int local755;
		if (local305 != null) {
			for (local755 = 1; local755 < local305.length; local755 += 2) {
				local305[local755] = local36.method3992();
			}
		}
		if (local318 != null) {
			for (local755 = 1; local755 < local318.length; local755 += 2) {
				local318[local755] = local36.method3992();
			}
		}
		@Pc(804) int local804;
		for (local755 = 0; local755 < local191; local755++) {
			@Pc(797) Class195 local797 = local237[local755];
			if (local797.aByteArray90 != null) {
				local361 = 0;
				for (local804 = 2; local804 < local797.aByteArray90.length; local804 += 2) {
					local361 -= -local36.method3972() - 1;
					local797.aByteArray90[local804] = (byte) local361;
				}
			}
		}
		@Pc(854) int local854;
		for (local702 = 0; local702 < local191; local702++) {
			@Pc(847) Class195 local847 = local237[local702];
			if (local847.aByteArray91 != null) {
				local361 = 0;
				for (local854 = 2; local854 < local847.aByteArray91.length; local854 += 2) {
					local361 = local361 + local36.method3972() + 1;
					local847.aByteArray91[local854] = (byte) local361;
				}
			}
		}
		@Pc(931) int local931;
		@Pc(954) int local954;
		@Pc(960) byte local960;
		@Pc(980) int local980;
		@Pc(982) int local982;
		@Pc(991) int local991;
		@Pc(925) byte local925;
		@Pc(1031) int local1031;
		if (local305 != null) {
			local361 = local36.method3972();
			local305[0] = (byte) local361;
			for (local804 = 2; local804 < local305.length; local804 += 2) {
				local361 = local36.method3972() + local361 + 1;
				local305[local804] = (byte) local361;
			}
			local925 = local305[0];
			@Pc(929) byte local929 = local305[1];
			for (local931 = 0; local931 < local925; local931++) {
				this.aByteArray62[local931] = (byte) (this.aByteArray62[local931] * local929 + 32 >> 6);
			}
			for (local954 = 2; local954 < local305.length; local954 += 2) {
				local960 = local305[local954];
				@Pc(966) byte local966 = local305[local954 + 1];
				local980 = (local960 - local925) * local929 + (local960 - local925) / 2;
				for (local982 = local925; local982 < local960; local982++) {
					local991 = Static136.method2603(local960 - local925, local980);
					local980 += local966 - local929;
					this.aByteArray62[local982] = (byte) (local991 * this.aByteArray62[local982] + 32 >> 6);
				}
				local925 = local960;
				local929 = local966;
			}
			for (local1031 = local925; local1031 < 128; local1031++) {
				this.aByteArray62[local1031] = (byte) (local929 * this.aByteArray62[local1031] + 32 >> 6);
			}
		}
		@Pc(1103) int local1103;
		if (local318 != null) {
			local361 = local36.method3972();
			local318[0] = (byte) local361;
			for (local804 = 2; local804 < local318.length; local804 += 2) {
				local361 = local36.method3972() + local361 + 1;
				local318[local804] = (byte) local361;
			}
			local925 = local318[0];
			local1103 = local318[1] << 1;
			for (local931 = 0; local931 < local925; local931++) {
				local954 = (this.aByteArray61[local931] & 0xFF) + local1103;
				if (local954 < 0) {
					local954 = 0;
				}
				if (local954 > 128) {
					local954 = 128;
				}
				this.aByteArray61[local931] = (byte) local954;
			}
			local954 = 2;
			@Pc(1158) int local1158;
			while (local954 < local318.length) {
				local960 = local318[local954];
				local1158 = local318[local954 + 1] << 1;
				local980 = local1103 * (local960 - local925) + (local960 - local925) / 2;
				for (local982 = local925; local982 < local960; local982++) {
					local991 = Static136.method2603(local960 - local925, local980);
					@Pc(1193) int local1193 = (this.aByteArray61[local982] & 0xFF) + local991;
					if (local1193 < 0) {
						local1193 = 0;
					}
					if (local1193 > 128) {
						local1193 = 128;
					}
					local980 += local1158 - local1103;
					this.aByteArray61[local982] = (byte) local1193;
				}
				local925 = local960;
				local954 += 2;
				local1103 = local1158;
			}
			for (local1031 = local925; local1031 < 128; local1031++) {
				local1158 = local1103 + (this.aByteArray61[local1031] & 0xFF);
				if (local1158 < 0) {
					local1158 = 0;
				}
				if (local1158 > 128) {
					local1158 = 128;
				}
				this.aByteArray61[local1031] = (byte) local1158;
			}
		}
		for (local804 = 0; local804 < local191; local804++) {
			local237[local804].anInt5843 = local36.method3972();
		}
		for (local854 = 0; local854 < local191; local854++) {
			@Pc(1291) Class195 local1291 = local237[local854];
			if (local1291.aByteArray91 != null) {
				local1291.anInt5846 = local36.method3972();
			}
			if (local1291.aByteArray90 != null) {
				local1291.anInt5844 = local36.method3972();
			}
			if (local1291.anInt5843 > 0) {
				local1291.anInt5849 = local36.method3972();
			}
		}
		for (local1103 = 0; local1103 < local191; local1103++) {
			local237[local1103].anInt5845 = local36.method3972();
		}
		for (local931 = 0; local931 < local191; local931++) {
			@Pc(1349) Class195 local1349 = local237[local931];
			if (local1349.anInt5845 > 0) {
				local1349.anInt5847 = local36.method3972();
			}
		}
		for (local954 = 0; local954 < local191; local954++) {
			@Pc(1372) Class195 local1372 = local237[local954];
			if (local1372.anInt5847 > 0) {
				local1372.anInt5842 = local36.method3972();
			}
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "([IILclient!wc;[B)Z")
	public boolean method3595(@OriginalArg(0) int[] arg0, @OriginalArg(2) Class213 arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(9) int local9 = 0;
		@Pc(11) Class6_Sub11_Sub1 local11 = null;
		for (@Pc(13) int local13 = 0; local13 < 128; local13++) {
			if (arg2 == null || arg2[local13] != 0) {
				@Pc(28) int local28 = this.anIntArray430[local13];
				if (local28 != 0) {
					if (local9 != local28) {
						local9 = local28--;
						if ((local28 & 0x1) == 0) {
							local11 = arg1.method5638(local28 >> 2, arg0);
						} else {
							local11 = arg1.method5633(arg0, local28 >> 2);
						}
						if (local11 == null) {
							local7 = false;
						}
					}
					if (local11 != null) {
						this.aClass6_Sub11_Sub1Array1[local13] = local11;
						this.anIntArray430[local13] = 0;
					}
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!mi", name = "c", descriptor = "(I)V")
	public void method3597() {
		this.anIntArray430 = null;
	}
}
