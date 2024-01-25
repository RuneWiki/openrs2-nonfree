import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bha")
public final class Class3_Sub10 extends Class3 {

	@OriginalMember(owner = "client!bha", name = "j", descriptor = "[S")
	public short[] aShortArray6;

	@OriginalMember(owner = "client!bha", name = "m", descriptor = "[Lclient!wo;")
	public Class3_Sub18_Sub1[] aClass3_Sub18_Sub1Array1;

	@OriginalMember(owner = "client!bha", name = "n", descriptor = "[B")
	public byte[] aByteArray8;

	@OriginalMember(owner = "client!bha", name = "p", descriptor = "[I")
	private int[] anIntArray49;

	@OriginalMember(owner = "client!bha", name = "s", descriptor = "[B")
	public byte[] aByteArray9;

	@OriginalMember(owner = "client!bha", name = "u", descriptor = "I")
	public int anInt767;

	@OriginalMember(owner = "client!bha", name = "v", descriptor = "[Lclient!dv;")
	public Class81[] aClass81Array1;

	@OriginalMember(owner = "client!bha", name = "w", descriptor = "[B")
	public byte[] aByteArray10;

	@OriginalMember(owner = "client!bha", name = "<init>", descriptor = "()V")
	private Class3_Sub10() {
	}

	@OriginalMember(owner = "client!bha", name = "<init>", descriptor = "([B)V")
	public Class3_Sub10(@OriginalArg(0) byte[] arg0) {
		this.aByteArray10 = new byte[128];
		this.aByteArray8 = new byte[128];
		this.aShortArray6 = new short[128];
		this.anIntArray49 = new int[128];
		this.aByteArray9 = new byte[128];
		this.aClass81Array1 = new Class81[128];
		this.aClass3_Sub18_Sub1Array1 = new Class3_Sub18_Sub1[128];
		@Pc(36) Class3_Sub9 local36 = new Class3_Sub9(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray51[local36.anInt6453 + local38] != 0; local38++) {
		}
		@Pc(52) byte[] local52 = new byte[local38];
		for (@Pc(54) int local54 = 0; local54 < local38; local54++) {
			local52[local54] = local36.method5619();
		}
		local38++;
		local36.anInt6453++;
		@Pc(76) int local76 = local36.anInt6453;
		local36.anInt6453 += local38;
		@Pc(84) int local84;
		for (local84 = 0; local36.aByteArray51[local36.anInt6453 + local84] != 0; local84++) {
		}
		@Pc(101) byte[] local101 = new byte[local84];
		for (@Pc(103) int local103 = 0; local103 < local84; local103++) {
			local101[local103] = local36.method5619();
		}
		local84++;
		local36.anInt6453++;
		@Pc(129) int local129 = local36.anInt6453;
		local36.anInt6453 += local84;
		@Pc(137) int local137;
		for (local137 = 0; local36.aByteArray51[local137 + local36.anInt6453] != 0; local137++) {
		}
		@Pc(154) byte[] local154 = new byte[local137];
		for (@Pc(156) int local156 = 0; local156 < local137; local156++) {
			local154[local156] = local36.method5619();
		}
		local36.anInt6453++;
		local137++;
		@Pc(178) byte[] local178 = new byte[local137];
		@Pc(183) int local183;
		@Pc(195) int local195;
		@Pc(201) int local201;
		if (local137 <= 1) {
			local183 = local137;
		} else {
			local178[1] = 1;
			local183 = 2;
			@Pc(193) int local193 = 1;
			for (local195 = 2; local195 < local137; local195++) {
				local201 = local36.method5633();
				if (local201 == 0) {
					local193 = local183++;
				} else {
					if (local193 >= local201) {
						local201--;
					}
					local193 = local201;
				}
				local178[local195] = (byte) local193;
			}
		}
		@Pc(233) Class81[] local233 = new Class81[local183];
		for (local195 = 0; local195 < local233.length; local195++) {
			@Pc(245) Class81 local245 = local233[local195] = new Class81();
			@Pc(249) int local249 = local36.method5633();
			if (local249 > 0) {
				local245.aByteArray21 = new byte[local249 * 2];
			}
			local249 = local36.method5633();
			if (local249 > 0) {
				local245.aByteArray20 = new byte[local249 * 2 + 2];
				local245.aByteArray20[1] = 64;
			}
		}
		local201 = local36.method5633();
		@Pc(300) byte[] local300 = local201 <= 0 ? null : new byte[local201 * 2];
		local201 = local36.method5633();
		@Pc(313) byte[] local313 = local201 > 0 ? new byte[local201 * 2] : null;
		@Pc(315) int local315;
		for (local315 = 0; local36.aByteArray51[local36.anInt6453 + local315] != 0; local315++) {
		}
		@Pc(333) byte[] local333 = new byte[local315];
		for (@Pc(335) int local335 = 0; local335 < local315; local335++) {
			local333[local335] = local36.method5619();
		}
		local315++;
		local36.anInt6453++;
		@Pc(356) int local356 = 0;
		for (@Pc(358) int local358 = 0; local358 < 128; local358++) {
			local356 += local36.method5633();
			this.aShortArray6[local358] = (short) local356;
		}
		local356 = 0;
		for (@Pc(382) int local382 = 0; local382 < 128; local382++) {
			local356 += local36.method5633();
			this.aShortArray6[local382] = (short) (this.aShortArray6[local382] + (local356 << 8));
		}
		@Pc(407) int local407 = 0;
		@Pc(409) int local409 = 0;
		@Pc(411) int local411 = 0;
		for (@Pc(413) int local413 = 0; local413 < 128; local413++) {
			if (local407 == 0) {
				if (local409 >= local333.length) {
					local407 = -1;
				} else {
					local407 = local333[local409++];
				}
				local411 = local36.method5623();
			}
			this.aShortArray6[local413] = (short) (this.aShortArray6[local413] + ((local411 - 1 & 0x2) << 14));
			this.anIntArray49[local413] = local411;
			local407--;
		}
		local409 = 0;
		local407 = 0;
		@Pc(469) int local469 = 0;
		for (@Pc(471) int local471 = 0; local471 < 128; local471++) {
			if (this.anIntArray49[local471] != 0) {
				if (local407 == 0) {
					if (local409 < local52.length) {
						local407 = local52[local409++];
					} else {
						local407 = -1;
					}
					local469 = local36.aByteArray51[local76++] - 1;
				}
				local407--;
				this.aByteArray8[local471] = (byte) local469;
			}
		}
		local409 = 0;
		local407 = 0;
		@Pc(521) int local521 = 0;
		for (@Pc(523) int local523 = 0; local523 < 128; local523++) {
			if (this.anIntArray49[local523] != 0) {
				if (local407 == 0) {
					if (local101.length <= local409) {
						local407 = -1;
					} else {
						local407 = local101[local409++];
					}
					local521 = local36.aByteArray51[local129++] + 16 << 2;
				}
				local407--;
				this.aByteArray9[local523] = (byte) local521;
			}
		}
		local407 = 0;
		local409 = 0;
		@Pc(579) Class81 local579 = null;
		for (@Pc(581) int local581 = 0; local581 < 128; local581++) {
			if (this.anIntArray49[local581] != 0) {
				if (local407 == 0) {
					local579 = local233[local178[local409]];
					if (local154.length <= local409) {
						local407 = -1;
					} else {
						local407 = local154[local409++];
					}
				}
				this.aClass81Array1[local581] = local579;
				local407--;
			}
		}
		local409 = 0;
		local407 = 0;
		@Pc(630) int local630 = 0;
		for (@Pc(632) int local632 = 0; local632 < 128; local632++) {
			if (local407 == 0) {
				if (local409 >= local333.length) {
					local407 = -1;
				} else {
					local407 = local333[local409++];
				}
				if (this.anIntArray49[local632] > 0) {
					local630 = local36.method5633() + 1;
				}
			}
			this.aByteArray10[local632] = (byte) local630;
			local407--;
		}
		this.anInt767 = local36.method5633() + 1;
		@Pc(696) int local696;
		for (@Pc(685) int local685 = 0; local685 < local183; local685++) {
			@Pc(691) Class81 local691 = local233[local685];
			if (local691.aByteArray21 != null) {
				for (local696 = 1; local696 < local691.aByteArray21.length; local696 += 2) {
					local691.aByteArray21[local696] = local36.method5619();
				}
			}
			if (local691.aByteArray20 != null) {
				for (local696 = 3; local696 < local691.aByteArray20.length - 2; local696 += 2) {
					local691.aByteArray20[local696] = local36.method5619();
				}
			}
		}
		@Pc(749) int local749;
		if (local300 != null) {
			for (local749 = 1; local749 < local300.length; local749 += 2) {
				local300[local749] = local36.method5619();
			}
		}
		if (local313 != null) {
			for (local749 = 1; local749 < local313.length; local749 += 2) {
				local313[local749] = local36.method5619();
			}
		}
		@Pc(798) int local798;
		for (local749 = 0; local749 < local183; local749++) {
			@Pc(791) Class81 local791 = local233[local749];
			if (local791.aByteArray20 != null) {
				local356 = 0;
				for (local798 = 2; local798 < local791.aByteArray20.length; local798 += 2) {
					local356 = local356 + local36.method5633() + 1;
					local791.aByteArray20[local798] = (byte) local356;
				}
			}
		}
		@Pc(843) int local843;
		for (local696 = 0; local696 < local183; local696++) {
			@Pc(836) Class81 local836 = local233[local696];
			if (local836.aByteArray21 != null) {
				local356 = 0;
				for (local843 = 2; local843 < local836.aByteArray21.length; local843 += 2) {
					local356 = local356 + local36.method5633() + 1;
					local836.aByteArray21[local843] = (byte) local356;
				}
			}
		}
		@Pc(912) int local912;
		@Pc(939) int local939;
		@Pc(945) byte local945;
		@Pc(966) int local966;
		@Pc(968) int local968;
		@Pc(978) int local978;
		@Pc(906) byte local906;
		@Pc(1019) int local1019;
		if (local300 != null) {
			local356 = local36.method5633();
			local300[0] = (byte) local356;
			for (local798 = 2; local798 < local300.length; local798 += 2) {
				local356 += local36.method5633() + 1;
				local300[local798] = (byte) local356;
			}
			local906 = local300[0];
			@Pc(910) byte local910 = local300[1];
			for (local912 = 0; local912 < local906; local912++) {
				this.aByteArray10[local912] = (byte) (local910 * this.aByteArray10[local912] + 32 >> 6);
			}
			local939 = 2;
			while (local939 < local300.length) {
				local945 = local300[local939];
				@Pc(951) byte local951 = local300[local939 + 1];
				local966 = (local945 - local906) * local910 + (local945 - local906) / 2;
				for (local968 = local906; local968 < local945; local968++) {
					local978 = Static283.method4603(local945 - local906, local966);
					local966 += local951 - local910;
					this.aByteArray10[local968] = (byte) (local978 * this.aByteArray10[local968] + 32 >> 6);
				}
				local906 = local945;
				local939 += 2;
				local910 = local951;
			}
			for (local1019 = local906; local1019 < 128; local1019++) {
				this.aByteArray10[local1019] = (byte) (this.aByteArray10[local1019] * local910 + 32 >> 6);
			}
		}
		@Pc(1085) int local1085;
		if (local313 != null) {
			local356 = local36.method5633();
			local313[0] = (byte) local356;
			for (local798 = 2; local798 < local313.length; local798 += 2) {
				local356 = local36.method5633() + local356 + 1;
				local313[local798] = (byte) local356;
			}
			local906 = local313[0];
			local1085 = local313[1] << 1;
			for (local912 = 0; local912 < local906; local912++) {
				local939 = (this.aByteArray9[local912] & 0xFF) + local1085;
				if (local939 < 0) {
					local939 = 0;
				}
				if (local939 > 128) {
					local939 = 128;
				}
				this.aByteArray9[local912] = (byte) local939;
			}
			@Pc(1137) int local1137;
			for (local939 = 2; local939 < local313.length; local939 += 2) {
				local945 = local313[local939];
				local1137 = local313[local939 + 1] << 1;
				local966 = (local945 - local906) * local1085 + (local945 - local906) / 2;
				for (local968 = local906; local968 < local945; local968++) {
					local978 = Static283.method4603(local945 - local906, local966);
					@Pc(1173) int local1173 = (this.aByteArray9[local968] & 0xFF) + local978;
					if (local1173 < 0) {
						local1173 = 0;
					}
					if (local1173 > 128) {
						local1173 = 128;
					}
					this.aByteArray9[local968] = (byte) local1173;
					local966 += local1137 - local1085;
				}
				local1085 = local1137;
				local906 = local945;
			}
			for (local1019 = local906; local1019 < 128; local1019++) {
				local1137 = (this.aByteArray9[local1019] & 0xFF) + local1085;
				if (local1137 < 0) {
					local1137 = 0;
				}
				if (local1137 > 128) {
					local1137 = 128;
				}
				this.aByteArray9[local1019] = (byte) local1137;
			}
		}
		for (local798 = 0; local798 < local183; local798++) {
			local233[local798].anInt2228 = local36.method5633();
		}
		for (local843 = 0; local843 < local183; local843++) {
			@Pc(1275) Class81 local1275 = local233[local843];
			if (local1275.aByteArray21 != null) {
				local1275.anInt2225 = local36.method5633();
			}
			if (local1275.aByteArray20 != null) {
				local1275.anInt2230 = local36.method5633();
			}
			if (local1275.anInt2228 > 0) {
				local1275.anInt2231 = local36.method5633();
			}
		}
		for (local1085 = 0; local1085 < local183; local1085++) {
			local233[local1085].anInt2229 = local36.method5633();
		}
		for (local912 = 0; local912 < local183; local912++) {
			@Pc(1333) Class81 local1333 = local233[local912];
			if (local1333.anInt2229 > 0) {
				local1333.anInt2224 = local36.method5633();
			}
		}
		for (local939 = 0; local939 < local183; local939++) {
			@Pc(1353) Class81 local1353 = local233[local939];
			if (local1353.anInt2224 > 0) {
				local1353.anInt2226 = local36.method5633();
			}
		}
	}

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(ZLclient!eia;[B[I)Z")
	public boolean method732(@OriginalArg(1) Class92 arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int[] arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(9) int local9 = 0;
		@Pc(11) Class3_Sub18_Sub1 local11 = null;
		for (@Pc(13) int local13 = 0; local13 < 128; local13++) {
			if (arg1 == null || arg1[local13] != 0) {
				@Pc(28) int local28 = this.anIntArray49[local13];
				if (local28 != 0) {
					if (local9 != local28) {
						local9 = local28--;
						if ((local28 & 0x1) == 0) {
							local11 = arg0.method2308(arg2, local28 >> 2);
						} else {
							local11 = arg0.method2304(local28 >> 2, arg2);
						}
						if (local11 == null) {
							local7 = false;
						}
					}
					if (local11 != null) {
						this.aClass3_Sub18_Sub1Array1[local13] = local11;
						this.anIntArray49[local13] = 0;
					}
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(I)V")
	public void method734() {
		this.anIntArray49 = null;
	}
}
