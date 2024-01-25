import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hi")
public final class Class1_Sub20 extends Class1 {

	@OriginalMember(owner = "client!hi", name = "q", descriptor = "[B")
	public byte[] aByteArray40;

	@OriginalMember(owner = "client!hi", name = "r", descriptor = "[Lclient!vc;")
	public Class254[] aClass254Array1;

	@OriginalMember(owner = "client!hi", name = "s", descriptor = "[S")
	public short[] aShortArray64;

	@OriginalMember(owner = "client!hi", name = "t", descriptor = "I")
	public int anInt3255;

	@OriginalMember(owner = "client!hi", name = "u", descriptor = "[B")
	public byte[] aByteArray41;

	@OriginalMember(owner = "client!hi", name = "y", descriptor = "[Lclient!mg;")
	public Class1_Sub12_Sub1[] aClass1_Sub12_Sub1Array1;

	@OriginalMember(owner = "client!hi", name = "z", descriptor = "[B")
	public byte[] aByteArray42;

	@OriginalMember(owner = "client!hi", name = "A", descriptor = "[I")
	private int[] anIntArray336;

	@OriginalMember(owner = "client!hi", name = "<init>", descriptor = "()V")
	private Class1_Sub20() {
	}

	@OriginalMember(owner = "client!hi", name = "<init>", descriptor = "([B)V")
	public Class1_Sub20(@OriginalArg(0) byte[] arg0) {
		this.anIntArray336 = new int[128];
		this.aByteArray42 = new byte[128];
		this.aByteArray40 = new byte[128];
		this.aByteArray41 = new byte[128];
		this.aShortArray64 = new short[128];
		this.aClass1_Sub12_Sub1Array1 = new Class1_Sub12_Sub1[128];
		this.aClass254Array1 = new Class254[128];
		@Pc(34) Class1_Sub3 local34 = new Class1_Sub3(arg0);
		@Pc(36) int local36;
		for (local36 = 0; local34.aByteArray14[local34.anInt1710 + local36] != 0; local36++) {
		}
		@Pc(50) byte[] local50 = new byte[local36];
		for (@Pc(52) int local52 = 0; local52 < local36; local52++) {
			local50[local52] = local34.method1212();
		}
		local36++;
		local34.anInt1710++;
		@Pc(73) int local73 = local34.anInt1710;
		local34.anInt1710 += local36;
		@Pc(81) int local81;
		for (local81 = 0; local34.aByteArray14[local34.anInt1710 + local81] != 0; local81++) {
		}
		@Pc(95) byte[] local95 = new byte[local81];
		for (@Pc(97) int local97 = 0; local97 < local81; local97++) {
			local95[local97] = local34.method1212();
		}
		local34.anInt1710++;
		local81++;
		@Pc(122) int local122 = local34.anInt1710;
		local34.anInt1710 += local81;
		@Pc(130) int local130;
		for (local130 = 0; local34.aByteArray14[local34.anInt1710 + local130] != 0; local130++) {
		}
		@Pc(143) byte[] local143 = new byte[local130];
		for (@Pc(145) int local145 = 0; local145 < local130; local145++) {
			local143[local145] = local34.method1212();
		}
		local130++;
		local34.anInt1710++;
		@Pc(166) byte[] local166 = new byte[local130];
		@Pc(175) int local175;
		@Pc(179) int local179;
		@Pc(184) int local184;
		if (local130 > 1) {
			local166[1] = 1;
			local175 = 2;
			@Pc(177) int local177 = 1;
			for (local179 = 2; local179 < local130; local179++) {
				local184 = local34.method1171();
				if (local184 == 0) {
					local177 = local175++;
				} else {
					if (local184 <= local177) {
						local184--;
					}
					local177 = local184;
				}
				local166[local179] = (byte) local177;
			}
		} else {
			local175 = local130;
		}
		@Pc(215) Class254[] local215 = new Class254[local175];
		for (local179 = 0; local179 < local215.length; local179++) {
			@Pc(226) Class254 local226 = local215[local179] = new Class254();
			@Pc(230) int local230 = local34.method1171();
			if (local230 > 0) {
				local226.aByteArray89 = new byte[local230 * 2];
			}
			local230 = local34.method1171();
			if (local230 > 0) {
				local226.aByteArray88 = new byte[local230 * 2 + 2];
				local226.aByteArray88[1] = 64;
			}
		}
		local184 = local34.method1171();
		@Pc(284) byte[] local284 = local184 > 0 ? new byte[local184 * 2] : null;
		local184 = local34.method1171();
		@Pc(297) byte[] local297 = local184 > 0 ? new byte[local184 * 2] : null;
		@Pc(299) int local299;
		for (local299 = 0; local34.aByteArray14[local299 + local34.anInt1710] != 0; local299++) {
		}
		@Pc(312) byte[] local312 = new byte[local299];
		for (@Pc(314) int local314 = 0; local314 < local299; local314++) {
			local312[local314] = local34.method1212();
		}
		local299++;
		local34.anInt1710++;
		@Pc(338) int local338 = 0;
		for (@Pc(340) int local340 = 0; local340 < 128; local340++) {
			local338 += local34.method1171();
			this.aShortArray64[local340] = (short) local338;
		}
		local338 = 0;
		for (@Pc(363) int local363 = 0; local363 < 128; local363++) {
			local338 += local34.method1171();
			this.aShortArray64[local363] = (short) (this.aShortArray64[local363] + (local338 << 8));
		}
		@Pc(387) int local387 = 0;
		@Pc(389) int local389 = 0;
		@Pc(391) int local391 = 0;
		for (@Pc(393) int local393 = 0; local393 < 128; local393++) {
			if (local387 == 0) {
				if (local312.length > local389) {
					local387 = local312[local389++];
				} else {
					local387 = -1;
				}
				local391 = local34.method1214();
			}
			this.aShortArray64[local393] = (short) (this.aShortArray64[local393] + ((local391 - 1 & 0x2) << 14));
			this.anIntArray336[local393] = local391;
			local387--;
		}
		local387 = 0;
		local389 = 0;
		@Pc(452) int local452 = 0;
		for (@Pc(454) int local454 = 0; local454 < 128; local454++) {
			if (this.anIntArray336[local454] != 0) {
				if (local387 == 0) {
					local452 = local34.aByteArray14[local73++] - 1;
					if (local50.length > local389) {
						local387 = local50[local389++];
					} else {
						local387 = -1;
					}
				}
				local387--;
				this.aByteArray42[local454] = (byte) local452;
			}
		}
		local389 = 0;
		local387 = 0;
		@Pc(502) int local502 = 0;
		for (@Pc(504) int local504 = 0; local504 < 128; local504++) {
			if (this.anIntArray336[local504] != 0) {
				if (local387 == 0) {
					if (local95.length <= local389) {
						local387 = -1;
					} else {
						local387 = local95[local389++];
					}
					local502 = local34.aByteArray14[local122++] + 16 << 2;
				}
				this.aByteArray41[local504] = (byte) local502;
				local387--;
			}
		}
		local387 = 0;
		local389 = 0;
		@Pc(559) Class254 local559 = null;
		for (@Pc(561) int local561 = 0; local561 < 128; local561++) {
			if (this.anIntArray336[local561] != 0) {
				if (local387 == 0) {
					local559 = local215[local166[local389]];
					if (local143.length > local389) {
						local387 = local143[local389++];
					} else {
						local387 = -1;
					}
				}
				local387--;
				this.aClass254Array1[local561] = local559;
			}
		}
		local389 = 0;
		local387 = 0;
		@Pc(607) int local607 = 0;
		for (@Pc(609) int local609 = 0; local609 < 128; local609++) {
			if (local387 == 0) {
				if (local312.length <= local389) {
					local387 = -1;
				} else {
					local387 = local312[local389++];
				}
				if (this.anIntArray336[local609] > 0) {
					local607 = local34.method1171() + 1;
				}
			}
			local387--;
			this.aByteArray40[local609] = (byte) local607;
		}
		this.anInt3255 = local34.method1171() + 1;
		@Pc(668) int local668;
		for (@Pc(658) int local658 = 0; local658 < local175; local658++) {
			@Pc(663) Class254 local663 = local215[local658];
			if (local663.aByteArray89 != null) {
				for (local668 = 1; local668 < local663.aByteArray89.length; local668 += 2) {
					local663.aByteArray89[local668] = local34.method1212();
				}
			}
			if (local663.aByteArray88 != null) {
				for (local668 = 3; local668 < local663.aByteArray88.length - 2; local668 += 2) {
					local663.aByteArray88[local668] = local34.method1212();
				}
			}
		}
		@Pc(715) int local715;
		if (local284 != null) {
			for (local715 = 1; local715 < local284.length; local715 += 2) {
				local284[local715] = local34.method1212();
			}
		}
		if (local297 != null) {
			for (local715 = 1; local715 < local297.length; local715 += 2) {
				local297[local715] = local34.method1212();
			}
		}
		@Pc(765) int local765;
		for (local715 = 0; local715 < local175; local715++) {
			@Pc(758) Class254 local758 = local215[local715];
			if (local758.aByteArray88 != null) {
				local338 = 0;
				for (local765 = 2; local765 < local758.aByteArray88.length; local765 += 2) {
					local338 = local34.method1171() + local338 + 1;
					local758.aByteArray88[local765] = (byte) local338;
				}
			}
		}
		@Pc(808) int local808;
		for (local668 = 0; local668 < local175; local668++) {
			@Pc(801) Class254 local801 = local215[local668];
			if (local801.aByteArray89 != null) {
				local338 = 0;
				for (local808 = 2; local808 < local801.aByteArray89.length; local808 += 2) {
					local338 += local34.method1171() + 1;
					local801.aByteArray89[local808] = (byte) local338;
				}
			}
		}
		@Pc(883) int local883;
		@Pc(909) int local909;
		@Pc(914) byte local914;
		@Pc(933) int local933;
		@Pc(935) int local935;
		@Pc(944) int local944;
		@Pc(877) byte local877;
		@Pc(982) int local982;
		if (local284 != null) {
			local338 = local34.method1171();
			local284[0] = (byte) local338;
			for (local765 = 2; local765 < local284.length; local765 += 2) {
				local338 = local34.method1171() + local338 + 1;
				local284[local765] = (byte) local338;
			}
			local877 = local284[0];
			@Pc(881) byte local881 = local284[1];
			for (local883 = 0; local883 < local877; local883++) {
				this.aByteArray40[local883] = (byte) (this.aByteArray40[local883] * local881 + 32 >> 6);
			}
			local909 = 2;
			while (local284.length > local909) {
				local914 = local284[local909];
				@Pc(920) byte local920 = local284[local909 + 1];
				local933 = (local914 - local877) / 2 + local881 * (local914 - local877);
				for (local935 = local877; local935 < local914; local935++) {
					local944 = Static42.method783(local933, local914 - local877);
					this.aByteArray40[local935] = (byte) (local944 * this.aByteArray40[local935] + 32 >> 6);
					local933 += local920 - local881;
				}
				local881 = local920;
				local909 += 2;
				local877 = local914;
			}
			for (local982 = local877; local982 < 128; local982++) {
				this.aByteArray40[local982] = (byte) (local881 * this.aByteArray40[local982] + 32 >> 6);
			}
		}
		@Pc(1046) int local1046;
		if (local297 != null) {
			local338 = local34.method1171();
			local297[0] = (byte) local338;
			for (local765 = 2; local765 < local297.length; local765 += 2) {
				local338 = local34.method1171() + local338 + 1;
				local297[local765] = (byte) local338;
			}
			local877 = local297[0];
			local1046 = local297[1] << 1;
			for (local883 = 0; local883 < local877; local883++) {
				local909 = (this.aByteArray41[local883] & 0xFF) + local1046;
				if (local909 < 0) {
					local909 = 0;
				}
				if (local909 > 128) {
					local909 = 128;
				}
				this.aByteArray41[local883] = (byte) local909;
			}
			local909 = 2;
			@Pc(1098) int local1098;
			while (local909 < local297.length) {
				local914 = local297[local909];
				local1098 = local297[local909 + 1] << 1;
				local933 = (local914 - local877) * local1046 + (local914 - local877) / 2;
				for (local935 = local877; local935 < local914; local935++) {
					local944 = Static42.method783(local933, local914 - local877);
					@Pc(1132) int local1132 = local944 + (this.aByteArray41[local935] & 0xFF);
					if (local1132 < 0) {
						local1132 = 0;
					}
					if (local1132 > 128) {
						local1132 = 128;
					}
					this.aByteArray41[local935] = (byte) local1132;
					local933 += local1098 - local1046;
				}
				local1046 = local1098;
				local909 += 2;
				local877 = local914;
			}
			for (local982 = local877; local982 < 128; local982++) {
				local1098 = (this.aByteArray41[local982] & 0xFF) + local1046;
				if (local1098 < 0) {
					local1098 = 0;
				}
				if (local1098 > 128) {
					local1098 = 128;
				}
				this.aByteArray41[local982] = (byte) local1098;
			}
		}
		for (local765 = 0; local765 < local175; local765++) {
			local215[local765].anInt7483 = local34.method1171();
		}
		for (local808 = 0; local808 < local175; local808++) {
			@Pc(1238) Class254 local1238 = local215[local808];
			if (local1238.aByteArray89 != null) {
				local1238.anInt7480 = local34.method1171();
			}
			if (local1238.aByteArray88 != null) {
				local1238.anInt7478 = local34.method1171();
			}
			if (local1238.anInt7483 > 0) {
				local1238.anInt7479 = local34.method1171();
			}
		}
		for (local1046 = 0; local1046 < local175; local1046++) {
			local215[local1046].anInt7485 = local34.method1171();
		}
		for (local883 = 0; local883 < local175; local883++) {
			@Pc(1290) Class254 local1290 = local215[local883];
			if (local1290.anInt7485 > 0) {
				local1290.anInt7484 = local34.method1171();
			}
		}
		for (local909 = 0; local909 < local175; local909++) {
			@Pc(1312) Class254 local1312 = local215[local909];
			if (local1312.anInt7484 > 0) {
				local1312.anInt7481 = local34.method1171();
			}
		}
	}

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "(B)V")
	public void method2422() {
		this.anIntArray336 = null;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "([I[BILclient!vm;)Z")
	public boolean method2423(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) Class259 arg2) {
		@Pc(5) boolean local5 = true;
		@Pc(7) int local7 = 0;
		@Pc(9) Class1_Sub12_Sub1 local9 = null;
		for (@Pc(11) int local11 = 0; local11 < 128; local11++) {
			if (arg1 == null || arg1[local11] != 0) {
				@Pc(23) int local23 = this.anIntArray336[local11];
				if (local23 != 0) {
					if (local23 != local7) {
						local7 = local23--;
						if ((local23 & 0x1) == 0) {
							local9 = arg2.method5781(local23 >> 2, arg0);
						} else {
							local9 = arg2.method5777(arg0, local23 >> 2);
						}
						if (local9 == null) {
							local5 = false;
						}
					}
					if (local9 != null) {
						this.aClass1_Sub12_Sub1Array1[local11] = local9;
						this.anIntArray336[local11] = 0;
					}
				}
			}
		}
		return local5;
	}
}
