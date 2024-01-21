import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!si")
public final class Class24_Sub3_Sub1 extends Class24_Sub3 {

	@OriginalMember(owner = "client!si", name = "q", descriptor = "S")
	private short aShort5;

	@OriginalMember(owner = "client!si", name = "r", descriptor = "[I")
	public int[] anIntArray329;

	@OriginalMember(owner = "client!si", name = "s", descriptor = "[I")
	private int[] anIntArray330;

	@OriginalMember(owner = "client!si", name = "t", descriptor = "[B")
	private byte[] aByteArray40;

	@OriginalMember(owner = "client!si", name = "v", descriptor = "[B")
	private byte[] aByteArray41;

	@OriginalMember(owner = "client!si", name = "w", descriptor = "S")
	private short aShort6;

	@OriginalMember(owner = "client!si", name = "x", descriptor = "S")
	private short aShort7;

	@OriginalMember(owner = "client!si", name = "y", descriptor = "[I")
	private int[] anIntArray331;

	@OriginalMember(owner = "client!si", name = "A", descriptor = "[I")
	private int[] anIntArray332;

	@OriginalMember(owner = "client!si", name = "B", descriptor = "S")
	private short aShort8;

	@OriginalMember(owner = "client!si", name = "C", descriptor = "[I")
	private int[] anIntArray333;

	@OriginalMember(owner = "client!si", name = "D", descriptor = "[I")
	public int[] anIntArray334;

	@OriginalMember(owner = "client!si", name = "E", descriptor = "[I")
	private int[] anIntArray335;

	@OriginalMember(owner = "client!si", name = "F", descriptor = "S")
	private short aShort9;

	@OriginalMember(owner = "client!si", name = "G", descriptor = "[[I")
	private int[][] anIntArrayArray27;

	@OriginalMember(owner = "client!si", name = "H", descriptor = "[I")
	private int[] anIntArray336;

	@OriginalMember(owner = "client!si", name = "J", descriptor = "[S")
	private short[] aShortArray39;

	@OriginalMember(owner = "client!si", name = "K", descriptor = "[I")
	private int[] anIntArray337;

	@OriginalMember(owner = "client!si", name = "L", descriptor = "S")
	private short aShort10;

	@OriginalMember(owner = "client!si", name = "M", descriptor = "[I")
	private int[] anIntArray338;

	@OriginalMember(owner = "client!si", name = "N", descriptor = "[I")
	private int[] anIntArray339;

	@OriginalMember(owner = "client!si", name = "Q", descriptor = "[B")
	private byte[] aByteArray42;

	@OriginalMember(owner = "client!si", name = "R", descriptor = "[[I")
	private int[][] anIntArrayArray28;

	@OriginalMember(owner = "client!si", name = "S", descriptor = "S")
	private short aShort11;

	@OriginalMember(owner = "client!si", name = "T", descriptor = "S")
	private short aShort12;

	@OriginalMember(owner = "client!si", name = "U", descriptor = "[I")
	public int[] anIntArray340;

	@OriginalMember(owner = "client!si", name = "u", descriptor = "I")
	private int anInt3631 = 0;

	@OriginalMember(owner = "client!si", name = "p", descriptor = "B")
	private byte aByte11 = 0;

	@OriginalMember(owner = "client!si", name = "O", descriptor = "I")
	private int anInt3633 = 0;

	@OriginalMember(owner = "client!si", name = "z", descriptor = "Z")
	public boolean aBoolean171 = false;

	@OriginalMember(owner = "client!si", name = "I", descriptor = "I")
	public int anInt3632 = 0;

	@OriginalMember(owner = "client!si", name = "<init>", descriptor = "()V")
	public Class24_Sub3_Sub1() {
	}

	@OriginalMember(owner = "client!si", name = "<init>", descriptor = "(Lclient!v;IIIII)V")
	public Class24_Sub3_Sub1(@OriginalArg(0) Class24_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.method2996();
		arg0.method3001();
		this.anInt3632 = arg0.anInt3936;
		this.anIntArray329 = arg0.anIntArray381;
		this.anIntArray340 = arg0.anIntArray382;
		this.anIntArray334 = arg0.anIntArray386;
		this.anInt3633 = arg0.anInt3935;
		this.anIntArray339 = arg0.anIntArray383;
		this.anIntArray330 = arg0.anIntArray385;
		this.anIntArray331 = arg0.anIntArray378;
		this.aByteArray41 = arg0.aByteArray48;
		this.aByteArray40 = arg0.aByteArray50;
		this.aByte11 = arg0.aByte12;
		this.anIntArrayArray28 = arg0.anIntArrayArray36;
		this.anIntArrayArray27 = arg0.anIntArrayArray35;
		@Pc(87) int local87 = (int) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		@Pc(93) int local93 = arg2 * local87 >> 8;
		this.anIntArray337 = new int[this.anInt3633];
		this.anIntArray338 = new int[this.anInt3633];
		this.anIntArray332 = new int[this.anInt3633];
		@Pc(118) int local118;
		if (arg0.aShortArray52 == null) {
			this.aShortArray39 = null;
		} else {
			this.aShortArray39 = new short[this.anInt3633];
			for (local118 = 0; local118 < this.anInt3633; local118++) {
				@Pc(124) short local124 = arg0.aShortArray52[local118];
				if (local124 != -1 && Static24.anInterface3_1.method1290(local124)) {
					this.aShortArray39[local118] = local124;
				} else {
					this.aShortArray39[local118] = -1;
				}
			}
		}
		@Pc(295) int local295;
		if (arg0.anInt3937 > 0 && arg0.aByteArray55 != null) {
			@Pc(162) int[] local162 = new int[arg0.anInt3937];
			for (@Pc(164) int local164 = 0; local164 < this.anInt3633; local164++) {
				if (arg0.aByteArray55[local164] != -1) {
					local162[arg0.aByteArray55[local164] & 0xFF]++;
				}
			}
			this.anInt3631 = 0;
			for (@Pc(193) int local193 = 0; local193 < arg0.anInt3937; local193++) {
				if (local162[local193] > 0 && arg0.aByteArray51[local193] == 0) {
					this.anInt3631++;
				}
			}
			this.anIntArray335 = new int[this.anInt3631];
			this.anIntArray336 = new int[this.anInt3631];
			this.anIntArray333 = new int[this.anInt3631];
			@Pc(231) int local231 = 0;
			for (@Pc(233) int local233 = 0; local233 < arg0.anInt3937; local233++) {
				if (local162[local233] > 0 && arg0.aByteArray51[local233] == 0) {
					this.anIntArray335[local231] = arg0.aShortArray56[local233] & 0xFFFF;
					this.anIntArray336[local231] = arg0.aShortArray53[local233] & 0xFFFF;
					this.anIntArray333[local231] = arg0.aShortArray57[local233] & 0xFFFF;
					local162[local233] = local231++;
				} else {
					local162[local233] = -1;
				}
			}
			this.aByteArray42 = new byte[this.anInt3633];
			for (local295 = 0; local295 < this.anInt3633; local295++) {
				if (arg0.aByteArray55[local295] == -1) {
					this.aByteArray42[local295] = -1;
				} else {
					this.aByteArray42[local295] = (byte) local162[arg0.aByteArray55[local295] & 0xFF];
					if (this.aByteArray42[local295] == -1 && this.aShortArray39 != null) {
						this.aShortArray39[local295] = -1;
					}
				}
			}
		}
		for (local118 = 0; local118 < this.anInt3633; local118++) {
			@Pc(348) byte local348;
			if (arg0.aByteArray47 == null) {
				local348 = 0;
			} else {
				local348 = arg0.aByteArray47[local118];
			}
			@Pc(359) byte local359;
			if (arg0.aByteArray50 == null) {
				local359 = 0;
			} else {
				local359 = arg0.aByteArray50[local118];
			}
			@Pc(370) short local370;
			if (this.aShortArray39 == null) {
				local370 = -1;
			} else {
				local370 = this.aShortArray39[local118];
			}
			if (local359 == -2) {
				local348 = 3;
			}
			if (local359 == -1) {
				local348 = 2;
			}
			@Pc(417) Class66 local417;
			@Pc(578) Class53 local578;
			if (local370 == -1) {
				if (local348 == 0) {
					@Pc(398) int local398 = arg0.aShortArray51[local118] & 0xFFFF;
					if (arg0.aClass66Array1 == null || arg0.aClass66Array1[this.anIntArray339[local118]] == null) {
						local417 = arg0.aClass66Array2[this.anIntArray339[local118]];
					} else {
						local417 = arg0.aClass66Array1[this.anIntArray339[local118]];
					}
					local295 = arg1 + (arg3 * local417.anInt2837 + arg4 * local417.anInt2841 + arg5 * local417.anInt2846) / (local93 * local417.anInt2842);
					this.anIntArray337[local118] = Static178.method2752(local398, local295);
					if (arg0.aClass66Array1 == null || arg0.aClass66Array1[this.anIntArray330[local118]] == null) {
						local417 = arg0.aClass66Array2[this.anIntArray330[local118]];
					} else {
						local417 = arg0.aClass66Array1[this.anIntArray330[local118]];
					}
					local295 = arg1 + (arg3 * local417.anInt2837 + arg4 * local417.anInt2841 + arg5 * local417.anInt2846) / (local93 * local417.anInt2842);
					this.anIntArray338[local118] = Static178.method2752(local398, local295);
					if (arg0.aClass66Array1 == null || arg0.aClass66Array1[this.anIntArray331[local118]] == null) {
						local417 = arg0.aClass66Array2[this.anIntArray331[local118]];
					} else {
						local417 = arg0.aClass66Array1[this.anIntArray331[local118]];
					}
					local295 = arg1 + (arg3 * local417.anInt2837 + arg4 * local417.anInt2841 + arg5 * local417.anInt2846) / (local93 * local417.anInt2842);
					this.anIntArray332[local118] = Static178.method2752(local398, local295);
				} else if (local348 == 1) {
					local578 = arg0.aClass53Array1[local118];
					local295 = arg1 + (arg3 * local578.anInt1975 + arg4 * local578.anInt1972 + arg5 * local578.anInt1974) / (local93 + local93 / 2);
					this.anIntArray337[local118] = Static178.method2752(arg0.aShortArray51[local118] & 0xFFFF, local295);
					this.anIntArray332[local118] = -1;
				} else if (local348 == 3) {
					this.anIntArray337[local118] = 128;
					this.anIntArray332[local118] = -1;
				} else {
					this.anIntArray332[local118] = -2;
				}
			} else if (local348 == 0) {
				if (arg0.aClass66Array1 == null || arg0.aClass66Array1[this.anIntArray339[local118]] == null) {
					local417 = arg0.aClass66Array2[this.anIntArray339[local118]];
				} else {
					local417 = arg0.aClass66Array1[this.anIntArray339[local118]];
				}
				local295 = arg1 + (arg3 * local417.anInt2837 + arg4 * local417.anInt2841 + arg5 * local417.anInt2846) / (local93 * local417.anInt2842);
				this.anIntArray337[local118] = Static178.method2748(local295);
				if (arg0.aClass66Array1 == null || arg0.aClass66Array1[this.anIntArray330[local118]] == null) {
					local417 = arg0.aClass66Array2[this.anIntArray330[local118]];
				} else {
					local417 = arg0.aClass66Array1[this.anIntArray330[local118]];
				}
				local295 = arg1 + (arg3 * local417.anInt2837 + arg4 * local417.anInt2841 + arg5 * local417.anInt2846) / (local93 * local417.anInt2842);
				this.anIntArray338[local118] = Static178.method2748(local295);
				if (arg0.aClass66Array1 == null || arg0.aClass66Array1[this.anIntArray331[local118]] == null) {
					local417 = arg0.aClass66Array2[this.anIntArray331[local118]];
				} else {
					local417 = arg0.aClass66Array1[this.anIntArray331[local118]];
				}
				local295 = arg1 + (arg3 * local417.anInt2837 + arg4 * local417.anInt2841 + arg5 * local417.anInt2846) / (local93 * local417.anInt2842);
				this.anIntArray332[local118] = Static178.method2748(local295);
			} else if (local348 == 1) {
				local578 = arg0.aClass53Array1[local118];
				local295 = arg1 + (arg3 * local578.anInt1975 + arg4 * local578.anInt1972 + arg5 * local578.anInt1974) / (local93 + local93 / 2);
				this.anIntArray337[local118] = Static178.method2748(local295);
				this.anIntArray332[local118] = -1;
			} else {
				this.anIntArray332[local118] = -2;
			}
		}
	}

	@OriginalMember(owner = "client!si", name = "<init>", descriptor = "([Lclient!si;I)V")
	private Class24_Sub3_Sub1(@OriginalArg(0) Class24_Sub3_Sub1[] arg0, @OriginalArg(1) int arg1) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		this.anInt3632 = 0;
		this.anInt3633 = 0;
		this.anInt3631 = 0;
		this.aByte11 = -1;
		for (@Pc(38) int local38 = 0; local38 < arg1; local38++) {
			@Pc(43) Class24_Sub3_Sub1 local43 = arg0[local38];
			if (local43 != null) {
				this.anInt3632 += local43.anInt3632;
				this.anInt3633 += local43.anInt3633;
				this.anInt3631 += local43.anInt3631;
				if (local43.aByteArray41 == null) {
					if (this.aByte11 == -1) {
						this.aByte11 = local43.aByte11;
					}
					if (this.aByte11 != local43.aByte11) {
						local18 = true;
					}
				} else {
					local18 = true;
				}
				local20 |= local43.aByteArray40 != null;
				local22 |= local43.aShortArray39 != null;
				local24 |= local43.aByteArray42 != null;
			}
		}
		this.anIntArray329 = new int[this.anInt3632];
		this.anIntArray340 = new int[this.anInt3632];
		this.anIntArray334 = new int[this.anInt3632];
		this.anIntArray339 = new int[this.anInt3633];
		this.anIntArray330 = new int[this.anInt3633];
		this.anIntArray331 = new int[this.anInt3633];
		this.anIntArray337 = new int[this.anInt3633];
		this.anIntArray338 = new int[this.anInt3633];
		this.anIntArray332 = new int[this.anInt3633];
		if (local18) {
			this.aByteArray41 = new byte[this.anInt3633];
		}
		if (local20) {
			this.aByteArray40 = new byte[this.anInt3633];
		}
		if (local22) {
			this.aShortArray39 = new short[this.anInt3633];
		}
		if (local24) {
			this.aByteArray42 = new byte[this.anInt3633];
		}
		if (this.anInt3631 > 0) {
			this.anIntArray335 = new int[this.anInt3631];
			this.anIntArray336 = new int[this.anInt3631];
			this.anIntArray333 = new int[this.anInt3631];
		}
		this.anInt3632 = 0;
		this.anInt3633 = 0;
		this.anInt3631 = 0;
		for (@Pc(220) int local220 = 0; local220 < arg1; local220++) {
			@Pc(225) Class24_Sub3_Sub1 local225 = arg0[local220];
			if (local225 != null) {
				for (@Pc(229) int local229 = 0; local229 < local225.anInt3633; local229++) {
					this.anIntArray339[this.anInt3633] = local225.anIntArray339[local229] + this.anInt3632;
					this.anIntArray330[this.anInt3633] = local225.anIntArray330[local229] + this.anInt3632;
					this.anIntArray331[this.anInt3633] = local225.anIntArray331[local229] + this.anInt3632;
					this.anIntArray337[this.anInt3633] = local225.anIntArray337[local229];
					this.anIntArray338[this.anInt3633] = local225.anIntArray338[local229];
					this.anIntArray332[this.anInt3633] = local225.anIntArray332[local229];
					if (local18) {
						if (local225.aByteArray41 == null) {
							this.aByteArray41[this.anInt3633] = local225.aByte11;
						} else {
							this.aByteArray41[this.anInt3633] = local225.aByteArray41[local229];
						}
					}
					if (local20 && local225.aByteArray40 != null) {
						this.aByteArray40[this.anInt3633] = local225.aByteArray40[local229];
					}
					if (local22) {
						if (local225.aShortArray39 == null) {
							this.aShortArray39[this.anInt3633] = -1;
						} else {
							this.aShortArray39[this.anInt3633] = local225.aShortArray39[local229];
						}
					}
					if (local24) {
						if (local225.aByteArray42 == null || local225.aByteArray42[local229] == -1) {
							this.aByteArray42[this.anInt3633] = -1;
						} else {
							this.aByteArray42[this.anInt3633] = (byte) (local225.aByteArray42[local229] + this.anInt3631);
						}
					}
					this.anInt3633++;
				}
				for (@Pc(394) int local394 = 0; local394 < local225.anInt3631; local394++) {
					this.anIntArray335[this.anInt3631] = local225.anIntArray335[local394] + this.anInt3632;
					this.anIntArray336[this.anInt3631] = local225.anIntArray336[local394] + this.anInt3632;
					this.anIntArray333[this.anInt3631] = local225.anIntArray333[local394] + this.anInt3632;
					this.anInt3631++;
				}
				for (@Pc(444) int local444 = 0; local444 < local225.anInt3632; local444++) {
					this.anIntArray329[this.anInt3632] = local225.anIntArray329[local444];
					this.anIntArray340[this.anInt3632] = local225.anIntArray340[local444];
					this.anIntArray334[this.anInt3632] = local225.anIntArray334[local444];
					this.anInt3632++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!si", name = "f", descriptor = "()I")
	@Override
	public int method2730() {
		if (!this.aBoolean171) {
			this.method2754();
		}
		return this.aShort7;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "()I")
	@Override
	public int method2978() {
		if (!this.aBoolean171) {
			this.method2754();
		}
		return this.aShort12;
	}

	@OriginalMember(owner = "client!si", name = "e", descriptor = "()V")
	@Override
	public void method2729() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3632; local1++) {
			@Pc(7) int local7 = this.anIntArray334[local1];
			this.anIntArray334[local1] = this.anIntArray329[local1];
			this.anIntArray329[local1] = -local7;
		}
		this.aBoolean171 = false;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Lclient!gj;)Lclient!gj;")
	public Class24_Sub3 method2742(@OriginalArg(0) Class24_Sub3 arg0) {
		return new Class24_Sub3_Sub1(new Class24_Sub3_Sub1[] { this, (Class24_Sub3_Sub1) arg0 }, 2);
	}

	@OriginalMember(owner = "client!si", name = "e", descriptor = "(I)V")
	private void method2743(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static24.anInt626;
		@Pc(3) int local3 = Static24.anInt628;
		@Pc(5) int local5 = 0;
		@Pc(10) int local10 = this.anIntArray339[arg0];
		@Pc(15) int local15 = this.anIntArray330[arg0];
		@Pc(20) int local20 = this.anIntArray331[arg0];
		@Pc(24) int local24 = Static178.anIntArray341[local10];
		@Pc(28) int local28 = Static178.anIntArray341[local15];
		@Pc(32) int local32 = Static178.anIntArray341[local20];
		if (this.aByteArray40 == null) {
			Static24.anInt627 = 0;
		} else {
			Static24.anInt627 = this.aByteArray40[arg0] & 0xFF;
		}
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(82) int local82;
		@Pc(95) int local95;
		if (local24 >= 50) {
			Static178.anIntArray348[0] = Static178.anIntArray345[local10];
			Static178.anIntArray346[0] = Static178.anIntArray343[local10];
			local5++;
			Static178.anIntArray347[0] = this.anIntArray337[arg0];
		} else {
			local73 = Static178.anIntArray350[local10];
			local77 = Static178.anIntArray353[local10];
			local82 = this.anIntArray337[arg0];
			if (local32 >= 50) {
				local95 = (50 - local24) * Class16.anIntArray43[local32 - local24];
				Static178.anIntArray348[0] = local1 + (local73 + ((Static178.anIntArray350[local20] - local73) * local95 >> 16) << 9) / 50;
				Static178.anIntArray346[0] = local3 + (local77 + ((Static178.anIntArray353[local20] - local77) * local95 >> 16) << 9) / 50;
				local5++;
				Static178.anIntArray347[0] = local82 + ((this.anIntArray332[arg0] - local82) * local95 >> 16);
			}
			if (local28 >= 50) {
				local95 = (50 - local24) * Class16.anIntArray43[local28 - local24];
				Static178.anIntArray348[local5] = local1 + (local73 + ((Static178.anIntArray350[local15] - local73) * local95 >> 16) << 9) / 50;
				Static178.anIntArray346[local5] = local3 + (local77 + ((Static178.anIntArray353[local15] - local77) * local95 >> 16) << 9) / 50;
				Static178.anIntArray347[local5++] = local82 + ((this.anIntArray338[arg0] - local82) * local95 >> 16);
			}
		}
		if (local28 >= 50) {
			Static178.anIntArray348[local5] = Static178.anIntArray345[local15];
			Static178.anIntArray346[local5] = Static178.anIntArray343[local15];
			Static178.anIntArray347[local5++] = this.anIntArray338[arg0];
		} else {
			local73 = Static178.anIntArray350[local15];
			local77 = Static178.anIntArray353[local15];
			local82 = this.anIntArray338[arg0];
			if (local24 >= 50) {
				local95 = (50 - local28) * Class16.anIntArray43[local24 - local28];
				Static178.anIntArray348[local5] = local1 + (local73 + ((Static178.anIntArray350[local10] - local73) * local95 >> 16) << 9) / 50;
				Static178.anIntArray346[local5] = local3 + (local77 + ((Static178.anIntArray353[local10] - local77) * local95 >> 16) << 9) / 50;
				Static178.anIntArray347[local5++] = local82 + ((this.anIntArray337[arg0] - local82) * local95 >> 16);
			}
			if (local32 >= 50) {
				local95 = (50 - local28) * Class16.anIntArray43[local32 - local28];
				Static178.anIntArray348[local5] = local1 + (local73 + ((Static178.anIntArray350[local20] - local73) * local95 >> 16) << 9) / 50;
				Static178.anIntArray346[local5] = local3 + (local77 + ((Static178.anIntArray353[local20] - local77) * local95 >> 16) << 9) / 50;
				Static178.anIntArray347[local5++] = local82 + ((this.anIntArray332[arg0] - local82) * local95 >> 16);
			}
		}
		if (local32 >= 50) {
			Static178.anIntArray348[local5] = Static178.anIntArray345[local20];
			Static178.anIntArray346[local5] = Static178.anIntArray343[local20];
			Static178.anIntArray347[local5++] = this.anIntArray332[arg0];
		} else {
			local73 = Static178.anIntArray350[local20];
			local77 = Static178.anIntArray353[local20];
			local82 = this.anIntArray332[arg0];
			if (local28 >= 50) {
				local95 = (50 - local32) * Class16.anIntArray43[local28 - local32];
				Static178.anIntArray348[local5] = local1 + (local73 + ((Static178.anIntArray350[local15] - local73) * local95 >> 16) << 9) / 50;
				Static178.anIntArray346[local5] = local3 + (local77 + ((Static178.anIntArray353[local15] - local77) * local95 >> 16) << 9) / 50;
				Static178.anIntArray347[local5++] = local82 + ((this.anIntArray338[arg0] - local82) * local95 >> 16);
			}
			if (local24 >= 50) {
				local95 = (50 - local32) * Class16.anIntArray43[local24 - local32];
				Static178.anIntArray348[local5] = local1 + (local73 + ((Static178.anIntArray350[local10] - local73) * local95 >> 16) << 9) / 50;
				Static178.anIntArray346[local5] = local3 + (local77 + ((Static178.anIntArray353[local10] - local77) * local95 >> 16) << 9) / 50;
				Static178.anIntArray347[local5++] = local82 + ((this.anIntArray337[arg0] - local82) * local95 >> 16);
			}
		}
		local73 = Static178.anIntArray348[0];
		local77 = Static178.anIntArray348[1];
		local82 = Static178.anIntArray348[2];
		local95 = Static178.anIntArray346[0];
		@Pc(590) int local590 = Static178.anIntArray346[1];
		@Pc(594) int local594 = Static178.anIntArray346[2];
		Static24.aBoolean36 = false;
		@Pc(683) int local683;
		@Pc(688) int local688;
		@Pc(693) int local693;
		@Pc(678) int local678;
		if (local5 == 3) {
			if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static24.anInt625 || local77 > Static24.anInt625 || local82 > Static24.anInt625) {
				Static24.aBoolean36 = true;
			}
			if (this.aShortArray39 != null && this.aShortArray39[arg0] != -1) {
				if (this.aByteArray42 == null || this.aByteArray42[arg0] == -1) {
					local683 = local10;
					local688 = local15;
					local693 = local20;
				} else {
					local678 = this.aByteArray42[arg0] & 0xFF;
					local683 = this.anIntArray335[local678];
					local688 = this.anIntArray336[local678];
					local693 = this.anIntArray333[local678];
				}
				if (this.anIntArray332[arg0] == -1) {
					Static24.method474(local95, local590, local594, local73, local77, local82, this.anIntArray337[arg0], this.anIntArray337[arg0], this.anIntArray337[arg0], Static178.anIntArray350[local683], Static178.anIntArray350[local688], Static178.anIntArray350[local693], Static178.anIntArray353[local683], Static178.anIntArray353[local688], Static178.anIntArray353[local693], Static178.anIntArray341[local683], Static178.anIntArray341[local688], Static178.anIntArray341[local693], this.aShortArray39[arg0]);
				} else {
					Static24.method474(local95, local590, local594, local73, local77, local82, Static178.anIntArray347[0], Static178.anIntArray347[1], Static178.anIntArray347[2], Static178.anIntArray350[local683], Static178.anIntArray350[local688], Static178.anIntArray350[local693], Static178.anIntArray353[local683], Static178.anIntArray353[local688], Static178.anIntArray353[local693], Static178.anIntArray341[local683], Static178.anIntArray341[local688], Static178.anIntArray341[local693], this.aShortArray39[arg0]);
				}
			} else if (this.anIntArray332[arg0] == -1) {
				Static24.method469(local95, local590, local594, local73, local77, local82, Static24.anIntArray40[this.anIntArray337[arg0]]);
			} else {
				Static24.method479(local95, local590, local594, local73, local77, local82, Static178.anIntArray347[0], Static178.anIntArray347[1], Static178.anIntArray347[2]);
			}
		}
		if (local5 != 4) {
			return;
		}
		if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static24.anInt625 || local77 > Static24.anInt625 || local82 > Static24.anInt625 || Static178.anIntArray348[3] < 0 || Static178.anIntArray348[3] > Static24.anInt625) {
			Static24.aBoolean36 = true;
		}
		if (this.aShortArray39 == null || this.aShortArray39[arg0] == -1) {
			if (this.anIntArray332[arg0] == -1) {
				local683 = Static24.anIntArray40[this.anIntArray337[arg0]];
				Static24.method469(local95, local590, local594, local73, local77, local82, local683);
				Static24.method469(local95, local594, Static178.anIntArray346[3], local73, local82, Static178.anIntArray348[3], local683);
				return;
			}
			Static24.method479(local95, local590, local594, local73, local77, local82, Static178.anIntArray347[0], Static178.anIntArray347[1], Static178.anIntArray347[2]);
			Static24.method479(local95, local594, Static178.anIntArray346[3], local73, local82, Static178.anIntArray348[3], Static178.anIntArray347[0], Static178.anIntArray347[2], Static178.anIntArray347[3]);
			return;
		}
		if (this.aByteArray42 == null || this.aByteArray42[arg0] == -1) {
			local683 = local10;
			local688 = local15;
			local693 = local20;
		} else {
			local678 = this.aByteArray42[arg0] & 0xFF;
			local683 = this.anIntArray335[local678];
			local688 = this.anIntArray336[local678];
			local693 = this.anIntArray333[local678];
		}
		@Pc(956) short local956 = this.aShortArray39[arg0];
		if (this.anIntArray332[arg0] == -1) {
			Static24.method474(local95, local590, local594, local73, local77, local82, this.anIntArray337[arg0], this.anIntArray337[arg0], this.anIntArray337[arg0], Static178.anIntArray350[local683], Static178.anIntArray350[local688], Static178.anIntArray350[local693], Static178.anIntArray353[local683], Static178.anIntArray353[local688], Static178.anIntArray353[local693], Static178.anIntArray341[local683], Static178.anIntArray341[local688], Static178.anIntArray341[local693], local956);
			Static24.method474(local95, local594, Static178.anIntArray346[3], local73, local82, Static178.anIntArray348[3], this.anIntArray337[arg0], this.anIntArray337[arg0], this.anIntArray337[arg0], Static178.anIntArray350[local683], Static178.anIntArray350[local688], Static178.anIntArray350[local693], Static178.anIntArray353[local683], Static178.anIntArray353[local688], Static178.anIntArray353[local693], Static178.anIntArray341[local683], Static178.anIntArray341[local688], Static178.anIntArray341[local693], local956);
			return;
		}
		Static24.method474(local95, local590, local594, local73, local77, local82, Static178.anIntArray347[0], Static178.anIntArray347[1], Static178.anIntArray347[2], Static178.anIntArray350[local683], Static178.anIntArray350[local688], Static178.anIntArray350[local693], Static178.anIntArray353[local683], Static178.anIntArray353[local688], Static178.anIntArray353[local693], Static178.anIntArray341[local683], Static178.anIntArray341[local688], Static178.anIntArray341[local693], local956);
		Static24.method474(local95, local594, Static178.anIntArray346[3], local73, local82, Static178.anIntArray348[3], Static178.anIntArray347[0], Static178.anIntArray347[2], Static178.anIntArray347[3], Static178.anIntArray350[local683], Static178.anIntArray350[local688], Static178.anIntArray350[local693], Static178.anIntArray353[local683], Static178.anIntArray353[local688], Static178.anIntArray353[local693], Static178.anIntArray341[local683], Static178.anIntArray341[local688], Static178.anIntArray341[local693], local956);
	}

	@OriginalMember(owner = "client!si", name = "c", descriptor = "(III)V")
	@Override
	public void method2738(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3632; local1++) {
			this.anIntArray329[local1] = this.anIntArray329[local1] * arg0 / 128;
			this.anIntArray340[local1] = this.anIntArray340[local1] * arg1 / 128;
			this.anIntArray334[local1] = this.anIntArray334[local1] * arg2 / 128;
		}
		this.aBoolean171 = false;
	}

	@OriginalMember(owner = "client!si", name = "h", descriptor = "()I")
	@Override
	public int method2732() {
		if (!this.aBoolean171) {
			this.method2754();
		}
		return this.aShort9;
	}

	@OriginalMember(owner = "client!si", name = "b", descriptor = "(I)V")
	@Override
	public void method2733(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class16.anIntArray44[arg0];
		@Pc(7) int local7 = Class16.anIntArray39[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt3632; local9++) {
			@Pc(26) int local26 = this.anIntArray340[local9] * local3 + this.anIntArray329[local9] * local7 >> 16;
			this.anIntArray340[local9] = this.anIntArray340[local9] * local7 - this.anIntArray329[local9] * local3 >> 16;
			this.anIntArray329[local9] = local26;
		}
		this.aBoolean171 = false;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Lclient!fe;ILclient!fe;I[I)V")
	@Override
	public void method2737(@OriginalArg(0) Class2_Sub2_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub2_Sub10 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		if (arg1 == -1) {
			return;
		}
		if (arg4 == null || arg3 == -1) {
			this.method2741(arg0, arg1);
			return;
		}
		@Pc(18) Class97 local18 = arg0.aClass97Array1[arg1];
		@Pc(23) Class97 local23 = arg2.aClass97Array1[arg3];
		@Pc(26) Class2_Sub8 local26 = local18.aClass2_Sub8_1;
		Static178.anInt3634 = 0;
		Static178.anInt3636 = 0;
		Static178.anInt3635 = 0;
		@Pc(34) byte local34 = 0;
		@Pc(37) int local37 = local34 + 1;
		@Pc(39) int local39 = arg4[0];
		for (@Pc(41) int local41 = 0; local41 < local18.anInt3729; local41++) {
			@Pc(47) short local47 = local18.aShortArray46[local41];
			while (local47 > local39) {
				local39 = arg4[local37++];
			}
			if (local47 != local39 || local26.anIntArray62[local47] == 0) {
				if (local18.aShortArray43[local41] != -1) {
					this.method2751(0, local26.anIntArrayArray3[local18.aShortArray43[local41]], 0, 0, 0);
				}
				this.method2751(local26.anIntArray62[local47], local26.anIntArrayArray3[local47], local18.aShortArray45[local41], local18.aShortArray47[local41], local18.aShortArray50[local41]);
			}
		}
		Static178.anInt3634 = 0;
		Static178.anInt3636 = 0;
		Static178.anInt3635 = 0;
		local34 = 0;
		local37 = local34 + 1;
		local39 = arg4[0];
		for (@Pc(125) int local125 = 0; local125 < local23.anInt3729; local125++) {
			@Pc(131) short local131 = local23.aShortArray46[local125];
			while (local131 > local39) {
				local39 = arg4[local37++];
			}
			if (local131 == local39 || local26.anIntArray62[local131] == 0) {
				if (local23.aShortArray43[local125] != -1) {
					this.method2751(0, local26.anIntArrayArray3[local23.aShortArray43[local125]], 0, 0, 0);
				}
				this.method2751(local26.anIntArray62[local131], local26.anIntArrayArray3[local131], local23.aShortArray45[local125], local23.aShortArray47[local125], local23.aShortArray50[local125]);
			}
		}
		this.aBoolean171 = false;
	}

	@OriginalMember(owner = "client!si", name = "d", descriptor = "(I)V")
	@Override
	public void method2736(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class16.anIntArray44[arg0];
		@Pc(7) int local7 = Class16.anIntArray39[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt3632; local9++) {
			@Pc(26) int local26 = this.anIntArray340[local9] * local7 - this.anIntArray334[local9] * local3 >> 16;
			this.anIntArray334[local9] = this.anIntArray340[local9] * local3 + this.anIntArray334[local9] * local7 >> 16;
			this.anIntArray340[local9] = local26;
		}
		this.aBoolean171 = false;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method2974(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (!this.aBoolean171) {
			this.method2754();
		}
		@Pc(14) int local14 = arg7 * arg4 - arg5 * arg3 >> 16;
		@Pc(24) int local24 = arg6 * arg1 + local14 * arg2 >> 16;
		@Pc(38) int local38 = local24 + (this.aShort8 * arg2 + this.aShort6 * arg1 >> 16);
		if (local38 <= 50) {
			return;
		}
		@Pc(57) int local57 = local24 + (-this.aShort8 * arg2 + this.aShort12 * arg1 >> 16);
		if (local57 >= 3500) {
			return;
		}
		@Pc(71) int local71 = arg7 * arg3 + arg5 * arg4 >> 16;
		@Pc(78) int local78 = local71 + this.aShort8 << 9;
		if (local78 / local38 <= Static17.anInt498) {
			return;
		}
		@Pc(91) int local91 = local71 - this.aShort8 << 9;
		if (local91 / local38 >= Static120.anInt2732) {
			return;
		}
		@Pc(107) int local107 = arg6 * arg2 - local14 * arg1 >> 16;
		@Pc(123) int local123 = local107 + (this.aShort8 * arg1 + this.aShort6 * arg2 >> 16) << 9;
		if (local123 / local38 <= Static96.anInt2067) {
			return;
		}
		@Pc(146) int local146 = local107 + (-this.aShort8 * arg1 + this.aShort12 * arg2 >> 16) << 9;
		if (local146 / local38 >= Static106.anInt2443) {
			return;
		}
		@Pc(154) boolean local154 = false;
		@Pc(161) boolean local161 = local57 <= 50;
		@Pc(170) boolean local170 = local161 || this.anInt3631 > 0;
		@Pc(172) int local172 = Static24.anInt626;
		@Pc(174) int local174 = Static24.anInt628;
		@Pc(176) int local176 = 0;
		@Pc(178) int local178 = 0;
		if (arg0 != 0) {
			local176 = Class16.anIntArray44[arg0];
			local178 = Class16.anIntArray39[arg0];
		}
		@Pc(190) boolean local190 = false;
		@Pc(204) int local204;
		@Pc(223) int local223;
		@Pc(208) int local208;
		@Pc(227) int local227;
		if (arg8 > 0L && Static39.aBoolean54 && local57 > 0) {
			if (local71 > 0) {
				local204 = local91 / local38;
				local208 = local78 / local57;
			} else {
				local204 = local91 / local57;
				local208 = local78 / local38;
			}
			if (local107 > 0) {
				local223 = local146 / local38;
				local227 = local123 / local57;
			} else {
				local223 = local146 / local57;
				local227 = local123 / local38;
			}
			if (Static59.anInt1451 >= local204 && Static59.anInt1451 <= local208 && Static6.anInt175 >= local223 && Static6.anInt175 <= local227) {
				local204 = 999999;
				local208 = -999999;
				local223 = 999999;
				local227 = -999999;
				@Pc(299) int[] local299 = new int[] { this.aShort7, this.aShort11, this.aShort7, this.aShort11, this.aShort7, this.aShort11, this.aShort7, this.aShort11 };
				@Pc(342) int[] local342 = new int[] { this.aShort10, this.aShort10, this.aShort9, this.aShort9, this.aShort10, this.aShort10, this.aShort9, this.aShort9 };
				@Pc(385) int[] local385 = new int[] { this.aShort12, this.aShort12, this.aShort12, this.aShort12, this.aShort6, this.aShort6, this.aShort6, this.aShort6 };
				for (@Pc(387) int local387 = 0; local387 < 8; local387++) {
					@Pc(392) int local392 = local299[local387];
					@Pc(396) int local396 = local385[local387];
					@Pc(400) int local400 = local342[local387];
					@Pc(412) int local412;
					if (arg0 != 0) {
						local412 = local400 * local176 + local392 * local178 >> 16;
						local400 = local400 * local178 - local392 * local176 >> 16;
						local392 = local412;
					}
					local392 += arg5;
					local396 += arg6;
					local400 += arg7;
					local412 = local400 * arg3 + local392 * arg4 >> 16;
					local400 = local400 * arg4 - local392 * arg3 >> 16;
					local392 = local412;
					local412 = local396 * arg2 - local400 * arg1 >> 16;
					local400 = local396 * arg1 + local400 * arg2 >> 16;
					if (local400 > 0) {
						@Pc(488) int local488 = (local392 << 9) / local400;
						@Pc(494) int local494 = (local412 << 9) / local400;
						if (local488 < local204) {
							local204 = local488;
						}
						if (local488 > local208) {
							local208 = local488;
						}
						if (local494 < local223) {
							local223 = local494;
						}
						if (local494 > local227) {
							local227 = local494;
						}
					}
				}
				if (Static59.anInt1451 >= local204 && Static59.anInt1451 <= local208 && Static6.anInt175 >= local223 && Static6.anInt175 <= local227) {
					if (super.aBoolean170) {
						Static150.aLongArray4[Static44.anInt1173++] = arg8;
					} else {
						local190 = true;
					}
				}
			}
		}
		for (local204 = 0; local204 < this.anInt3632; local204++) {
			local223 = this.anIntArray329[local204];
			local208 = this.anIntArray340[local204];
			local227 = this.anIntArray334[local204];
			@Pc(574) int local574;
			if (arg0 != 0) {
				local574 = local227 * local176 + local223 * local178 >> 16;
				local227 = local227 * local178 - local223 * local176 >> 16;
				local223 = local574;
			}
			local223 += arg5;
			local208 += arg6;
			local227 += arg7;
			local574 = local227 * arg3 + local223 * arg4 >> 16;
			local227 = local227 * arg4 - local223 * arg3 >> 16;
			local223 = local574;
			local574 = local208 * arg2 - local227 * arg1 >> 16;
			local227 = local208 * arg1 + local227 * arg2 >> 16;
			Static178.anIntArray342[local204] = local227 - local24;
			if (local227 >= 50) {
				Static178.anIntArray345[local204] = local172 + (local223 << 9) / local227;
				Static178.anIntArray343[local204] = local174 + (local574 << 9) / local227;
			} else {
				Static178.anIntArray345[local204] = -5000;
				local154 = true;
			}
			if (local170) {
				Static178.anIntArray350[local204] = local223;
				Static178.anIntArray353[local204] = local574;
				Static178.anIntArray341[local204] = local227;
			}
		}
		try {
			this.method2753(local154, local190, arg8, local24 - local57, local38 - local57 + 2);
		} catch (@Pc(712) Exception local712) {
		}
	}

	@OriginalMember(owner = "client!si", name = "d", descriptor = "()I")
	@Override
	public int method2726() {
		if (!this.aBoolean171) {
			this.method2754();
		}
		return this.aShort8;
	}

	@OriginalMember(owner = "client!si", name = "b", descriptor = "(III)V")
	@Override
	public void method2728(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3632; local1++) {
			this.anIntArray329[local1] += arg0;
			this.anIntArray340[local1] += arg1;
			this.anIntArray334[local1] += arg2;
		}
		this.aBoolean171 = false;
	}

	@OriginalMember(owner = "client!si", name = "f", descriptor = "(I)V")
	private void method2744(@OriginalArg(0) int arg0) {
		if (Static178.aBooleanArray24[arg0]) {
			this.method2743(arg0);
			return;
		}
		@Pc(12) int local12 = this.anIntArray339[arg0];
		@Pc(17) int local17 = this.anIntArray330[arg0];
		@Pc(22) int local22 = this.anIntArray331[arg0];
		Static24.aBoolean36 = Static178.aBooleanArray25[arg0];
		if (this.aByteArray40 == null) {
			Static24.anInt627 = 0;
		} else {
			Static24.anInt627 = this.aByteArray40[arg0] & 0xFF;
		}
		if (this.aShortArray39 != null && this.aShortArray39[arg0] != -1) {
			@Pc(133) int local133;
			@Pc(138) int local138;
			@Pc(143) int local143;
			if (this.aByteArray42 == null || this.aByteArray42[arg0] == -1) {
				local133 = local12;
				local138 = local17;
				local143 = local22;
			} else {
				@Pc(128) int local128 = this.aByteArray42[arg0] & 0xFF;
				local133 = this.anIntArray335[local128];
				local138 = this.anIntArray336[local128];
				local143 = this.anIntArray333[local128];
			}
			if (this.anIntArray332[arg0] == -1) {
				Static24.method474(Static178.anIntArray343[local12], Static178.anIntArray343[local17], Static178.anIntArray343[local22], Static178.anIntArray345[local12], Static178.anIntArray345[local17], Static178.anIntArray345[local22], this.anIntArray337[arg0], this.anIntArray337[arg0], this.anIntArray337[arg0], Static178.anIntArray350[local133], Static178.anIntArray350[local138], Static178.anIntArray350[local143], Static178.anIntArray353[local133], Static178.anIntArray353[local138], Static178.anIntArray353[local143], Static178.anIntArray341[local133], Static178.anIntArray341[local138], Static178.anIntArray341[local143], this.aShortArray39[arg0]);
			} else {
				Static24.method474(Static178.anIntArray343[local12], Static178.anIntArray343[local17], Static178.anIntArray343[local22], Static178.anIntArray345[local12], Static178.anIntArray345[local17], Static178.anIntArray345[local22], this.anIntArray337[arg0], this.anIntArray338[arg0], this.anIntArray332[arg0], Static178.anIntArray350[local133], Static178.anIntArray350[local138], Static178.anIntArray350[local143], Static178.anIntArray353[local133], Static178.anIntArray353[local138], Static178.anIntArray353[local143], Static178.anIntArray341[local133], Static178.anIntArray341[local138], Static178.anIntArray341[local143], this.aShortArray39[arg0]);
			}
		} else if (this.anIntArray332[arg0] == -1) {
			Static24.method469(Static178.anIntArray343[local12], Static178.anIntArray343[local17], Static178.anIntArray343[local22], Static178.anIntArray345[local12], Static178.anIntArray345[local17], Static178.anIntArray345[local22], Static24.anIntArray40[this.anIntArray337[arg0]]);
		} else {
			Static24.method479(Static178.anIntArray343[local12], Static178.anIntArray343[local17], Static178.anIntArray343[local22], Static178.anIntArray345[local12], Static178.anIntArray345[local17], Static178.anIntArray345[local22], this.anIntArray337[arg0], this.anIntArray338[arg0], this.anIntArray332[arg0]);
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IIIIIIII)V")
	public void method2745(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			if (!this.aBoolean171) {
				this.method2754();
			}
			@Pc(6) int local6 = Static24.anInt626;
			@Pc(8) int local8 = Static24.anInt628;
			@Pc(12) int local12 = Class16.anIntArray44[0];
			@Pc(16) int local16 = Class16.anIntArray39[0];
			@Pc(20) int local20 = Class16.anIntArray44[arg0];
			@Pc(24) int local24 = Class16.anIntArray39[arg0];
			@Pc(28) int local28 = Class16.anIntArray44[arg1];
			@Pc(32) int local32 = Class16.anIntArray39[arg1];
			@Pc(36) int local36 = Class16.anIntArray44[arg2];
			@Pc(40) int local40 = Class16.anIntArray39[arg2];
			@Pc(50) int local50 = arg4 * local36 + arg5 * local40 >> 16;
			for (@Pc(52) int local52 = 0; local52 < this.anInt3632; local52++) {
				@Pc(58) int local58 = this.anIntArray329[local52];
				@Pc(63) int local63 = this.anIntArray340[local52];
				@Pc(68) int local68 = this.anIntArray334[local52];
				@Pc(80) int local80;
				if (arg1 != 0) {
					local80 = local63 * local28 + local58 * local32 >> 16;
					local63 = local63 * local32 - local58 * local28 >> 16;
					local58 = local80;
				}
				if (arg0 != 0) {
					local80 = local68 * local20 + local58 * local24 >> 16;
					local68 = local68 * local24 - local58 * local20 >> 16;
					local58 = local80;
				}
				local58 += arg3;
				local63 += arg4;
				local68 += arg5;
				local80 = local63 * local40 - local68 * local36 >> 16;
				local68 = local63 * local36 + local68 * local40 >> 16;
				Static178.anIntArray342[local52] = local68 - local50;
				Static178.anIntArray345[local52] = local6 + (local58 << 9) / arg6;
				Static178.anIntArray343[local52] = local8 + (local80 << 9) / arg6;
				if (this.anInt3631 > 0) {
					Static178.anIntArray350[local52] = local58;
					Static178.anIntArray353[local52] = local80;
					Static178.anIntArray341[local52] = local68;
				}
			}
			this.method2753(false, false, 0L, this.aShort5, this.aShort5 << 1);
		} catch (@Pc(233) RuntimeException local233) {
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Lclient!fe;I)V")
	@Override
	public void method2741(@OriginalArg(0) Class2_Sub2_Sub10 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArrayArray28 == null || arg1 == -1) {
			return;
		}
		@Pc(12) Class97 local12 = arg0.aClass97Array1[arg1];
		@Pc(15) Class2_Sub8 local15 = local12.aClass2_Sub8_1;
		Static178.anInt3634 = 0;
		Static178.anInt3636 = 0;
		Static178.anInt3635 = 0;
		for (@Pc(23) int local23 = 0; local23 < local12.anInt3729; local23++) {
			@Pc(29) short local29 = local12.aShortArray46[local23];
			if (local12.aShortArray43[local23] != -1) {
				this.method2751(0, local15.anIntArrayArray3[local12.aShortArray43[local23]], 0, 0, 0);
			}
			this.method2751(local15.anIntArray62[local29], local15.anIntArrayArray3[local29], local12.aShortArray45[local23], local12.aShortArray47[local23], local12.aShortArray50[local23]);
		}
		this.aBoolean171 = false;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method2734(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (!this.aBoolean171) {
				this.method2754();
			}
			@Pc(6) int local6 = Static24.anInt626;
			@Pc(8) int local8 = Static24.anInt628;
			@Pc(12) int local12 = Class16.anIntArray44[0];
			@Pc(16) int local16 = Class16.anIntArray39[0];
			@Pc(20) int local20 = Class16.anIntArray44[arg0];
			@Pc(24) int local24 = Class16.anIntArray39[arg0];
			@Pc(28) int local28 = Class16.anIntArray44[arg1];
			@Pc(32) int local32 = Class16.anIntArray39[arg1];
			@Pc(36) int local36 = Class16.anIntArray44[arg2];
			@Pc(40) int local40 = Class16.anIntArray39[arg2];
			@Pc(50) int local50 = arg4 * local36 + arg5 * local40 >> 16;
			for (@Pc(52) int local52 = 0; local52 < this.anInt3632; local52++) {
				@Pc(58) int local58 = this.anIntArray329[local52];
				@Pc(63) int local63 = this.anIntArray340[local52];
				@Pc(68) int local68 = this.anIntArray334[local52];
				@Pc(80) int local80;
				if (arg1 != 0) {
					local80 = local63 * local28 + local58 * local32 >> 16;
					local63 = local63 * local32 - local58 * local28 >> 16;
					local58 = local80;
				}
				if (arg0 != 0) {
					local80 = local68 * local20 + local58 * local24 >> 16;
					local68 = local68 * local24 - local58 * local20 >> 16;
					local58 = local80;
				}
				local58 += arg3;
				local63 += arg4;
				local68 += arg5;
				local80 = local63 * local40 - local68 * local36 >> 16;
				local68 = local63 * local36 + local68 * local40 >> 16;
				Static178.anIntArray342[local52] = local68 - local50;
				Static178.anIntArray345[local52] = local6 + (local58 << 9) / local68;
				Static178.anIntArray343[local52] = local8 + (local80 << 9) / local68;
				if (this.anInt3631 > 0) {
					Static178.anIntArray350[local52] = local58;
					Static178.anIntArray353[local52] = local80;
					Static178.anIntArray341[local52] = local68;
				}
			}
			this.method2753(false, false, 0L, this.aShort5, this.aShort5 << 1);
		} catch (@Pc(233) RuntimeException local233) {
		}
	}

	@OriginalMember(owner = "client!si", name = "j", descriptor = "()V")
	@Override
	public void method2740() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3632; local1++) {
			this.anIntArray329[local1] = -this.anIntArray329[local1];
			this.anIntArray334[local1] = -this.anIntArray334[local1];
		}
		this.aBoolean171 = false;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "([[IIIIZI)Lclient!si;")
	public Class24_Sub3_Sub1 method2747(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		if (!this.aBoolean171) {
			this.method2754();
		}
		@Pc(9) int local9 = arg1 + this.aShort7;
		@Pc(14) int local14 = arg1 + this.aShort11;
		@Pc(19) int local19 = arg3 + this.aShort10;
		@Pc(24) int local24 = arg3 + this.aShort9;
		if (local9 < 0 || local14 + 128 >> 7 >= arg0.length || local19 < 0 || local24 + 128 >> 7 >= arg0[0].length) {
			return this;
		}
		local9 >>= 0x7;
		local14 = local14 + 127 >> 7;
		local19 >>= 0x7;
		local24 = local24 + 127 >> 7;
		if (arg0[local9][local19] == arg2 && arg0[local14][local19] == arg2 && arg0[local9][local24] == arg2 && arg0[local14][local24] == arg2) {
			return this;
		}
		@Pc(104) Class24_Sub3_Sub1 local104;
		if (arg4) {
			local104 = new Class24_Sub3_Sub1();
			local104.anInt3632 = this.anInt3632;
			local104.anInt3633 = this.anInt3633;
			local104.anInt3631 = this.anInt3631;
			local104.anIntArray329 = this.anIntArray329;
			local104.anIntArray334 = this.anIntArray334;
			local104.anIntArray339 = this.anIntArray339;
			local104.anIntArray330 = this.anIntArray330;
			local104.anIntArray331 = this.anIntArray331;
			local104.anIntArray337 = this.anIntArray337;
			local104.anIntArray338 = this.anIntArray338;
			local104.anIntArray332 = this.anIntArray332;
			local104.aByteArray41 = this.aByteArray41;
			local104.aByteArray40 = this.aByteArray40;
			local104.aByteArray42 = this.aByteArray42;
			local104.aShortArray39 = this.aShortArray39;
			local104.aByte11 = this.aByte11;
			local104.anIntArray335 = this.anIntArray335;
			local104.anIntArray336 = this.anIntArray336;
			local104.anIntArray333 = this.anIntArray333;
			local104.anIntArrayArray28 = this.anIntArrayArray28;
			local104.anIntArrayArray27 = this.anIntArrayArray27;
			local104.aBoolean170 = super.aBoolean170;
			local104.anIntArray340 = new int[local104.anInt3632];
		} else {
			local104 = this;
		}
		@Pc(204) int local204;
		@Pc(212) int local212;
		@Pc(219) int local219;
		@Pc(223) int local223;
		@Pc(227) int local227;
		@Pc(231) int local231;
		@Pc(235) int local235;
		@Pc(257) int local257;
		@Pc(283) int local283;
		@Pc(295) int local295;
		if (arg5 == 0) {
			for (local204 = 0; local204 < local104.anInt3632; local204++) {
				local212 = this.anIntArray329[local204] + arg1;
				local219 = this.anIntArray334[local204] + arg3;
				local223 = local212 & 0x7F;
				local227 = local219 & 0x7F;
				local231 = local212 >> 7;
				local235 = local219 >> 7;
				local257 = arg0[local231][local235] * (128 - local223) + arg0[local231 + 1][local235] * local223 >> 7;
				local283 = arg0[local231][local235 + 1] * (128 - local223) + arg0[local231 + 1][local235 + 1] * local223 >> 7;
				local295 = local257 * (128 - local227) + local283 * local227 >> 7;
				local104.anIntArray340[local204] = this.anIntArray340[local204] + local295 - arg2;
			}
		} else {
			for (local204 = 0; local204 < local104.anInt3632; local204++) {
				local212 = (this.anIntArray340[local204] << 16) / this.aShort12;
				if (local212 < arg5) {
					local219 = this.anIntArray329[local204] + arg1;
					local223 = this.anIntArray334[local204] + arg3;
					local227 = local219 & 0x7F;
					local231 = local223 & 0x7F;
					local235 = local219 >> 7;
					local257 = local223 >> 7;
					local283 = arg0[local235][local257] * (128 - local227) + arg0[local235 + 1][local257] * local227 >> 7;
					local295 = arg0[local235][local257 + 1] * (128 - local227) + arg0[local235 + 1][local257 + 1] * local227 >> 7;
					@Pc(419) int local419 = local283 * (128 - local231) + local295 * local231 >> 7;
					local104.anIntArray340[local204] = this.anIntArray340[local204] + (local419 - arg2) * (arg5 - local212) / arg5;
				} else {
					local104.anIntArray340[local204] = this.anIntArray340[local204];
				}
			}
		}
		local104.aBoolean171 = false;
		return local104;
	}

	@OriginalMember(owner = "client!si", name = "b", descriptor = "(IIIIIIII)Z")
	private boolean method2749(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else {
			return arg0 <= arg5 || arg0 <= arg6 || arg0 <= arg7;
		}
	}

	@OriginalMember(owner = "client!si", name = "g", descriptor = "()I")
	@Override
	public int method2731() {
		if (!this.aBoolean171) {
			this.method2754();
		}
		return this.aShort10;
	}

	@OriginalMember(owner = "client!si", name = "i", descriptor = "()I")
	@Override
	public int method2739() {
		if (!this.aBoolean171) {
			this.method2754();
		}
		return this.aShort11;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Z)Lclient!gj;")
	@Override
	public Class24_Sub3 method2725(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static178.aByteArray44.length < this.anInt3633) {
			Static178.aByteArray44 = new byte[this.anInt3633 + 100];
		}
		return this.method2750(arg0, Static178.aClass24_Sub3_Sub1_2, Static178.aByteArray44);
	}

	@OriginalMember(owner = "client!si", name = "c", descriptor = "(I)V")
	@Override
	public void method2735(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class16.anIntArray44[arg0];
		@Pc(7) int local7 = Class16.anIntArray39[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt3632; local9++) {
			@Pc(26) int local26 = this.anIntArray334[local9] * local3 + this.anIntArray329[local9] * local7 >> 16;
			this.anIntArray334[local9] = this.anIntArray334[local9] * local7 - this.anIntArray329[local9] * local3 >> 16;
			this.anIntArray329[local9] = local26;
		}
		this.aBoolean171 = false;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(ZLclient!si;[B)Lclient!gj;")
	private Class24_Sub3 method2750(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class24_Sub3_Sub1 arg1, @OriginalArg(2) byte[] arg2) {
		arg1.anInt3632 = this.anInt3632;
		arg1.anInt3633 = this.anInt3633;
		arg1.anInt3631 = this.anInt3631;
		if (arg1.anIntArray329 == null || arg1.anIntArray329.length < this.anInt3632) {
			arg1.anIntArray329 = new int[this.anInt3632 + 100];
			arg1.anIntArray340 = new int[this.anInt3632 + 100];
			arg1.anIntArray334 = new int[this.anInt3632 + 100];
		}
		for (@Pc(43) int local43 = 0; local43 < this.anInt3632; local43++) {
			arg1.anIntArray329[local43] = this.anIntArray329[local43];
			arg1.anIntArray340[local43] = this.anIntArray340[local43];
			arg1.anIntArray334[local43] = this.anIntArray334[local43];
		}
		if (arg0) {
			arg1.aByteArray40 = this.aByteArray40;
		} else {
			arg1.aByteArray40 = arg2;
			@Pc(88) int local88;
			if (this.aByteArray40 == null) {
				for (local88 = 0; local88 < this.anInt3633; local88++) {
					arg1.aByteArray40[local88] = 0;
				}
			} else {
				for (local88 = 0; local88 < this.anInt3633; local88++) {
					arg1.aByteArray40[local88] = this.aByteArray40[local88];
				}
			}
		}
		arg1.anIntArray339 = this.anIntArray339;
		arg1.anIntArray330 = this.anIntArray330;
		arg1.anIntArray331 = this.anIntArray331;
		arg1.anIntArray337 = this.anIntArray337;
		arg1.anIntArray338 = this.anIntArray338;
		arg1.anIntArray332 = this.anIntArray332;
		arg1.aByteArray41 = this.aByteArray41;
		arg1.aByteArray42 = this.aByteArray42;
		arg1.aShortArray39 = this.aShortArray39;
		arg1.aByte11 = this.aByte11;
		arg1.anIntArray335 = this.anIntArray335;
		arg1.anIntArray336 = this.anIntArray336;
		arg1.anIntArray333 = this.anIntArray333;
		arg1.anIntArrayArray28 = this.anIntArrayArray28;
		arg1.anIntArrayArray27 = this.anIntArrayArray27;
		arg1.aBoolean170 = super.aBoolean170;
		arg1.aBoolean171 = false;
		return arg1;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(I[IIII)V")
	private void method2751(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(31) int local31;
		@Pc(36) int local36;
		if (arg0 == 0) {
			local6 = 0;
			Static178.anInt3634 = 0;
			Static178.anInt3636 = 0;
			Static178.anInt3635 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				@Pc(19) int local19 = arg1[local14];
				if (local19 < this.anIntArrayArray28.length) {
					@Pc(29) int[] local29 = this.anIntArrayArray28[local19];
					for (local31 = 0; local31 < local29.length; local31++) {
						local36 = local29[local31];
						Static178.anInt3634 += this.anIntArray329[local36];
						Static178.anInt3636 += this.anIntArray340[local36];
						Static178.anInt3635 += this.anIntArray334[local36];
						local6++;
					}
				}
			}
			if (local6 > 0) {
				Static178.anInt3634 = Static178.anInt3634 / local6 + arg2;
				Static178.anInt3636 = Static178.anInt3636 / local6 + arg3;
				Static178.anInt3635 = Static178.anInt3635 / local6 + arg4;
			} else {
				Static178.anInt3634 = arg2;
				Static178.anInt3636 = arg3;
				Static178.anInt3635 = arg4;
			}
			return;
		}
		@Pc(115) int[] local115;
		@Pc(117) int local117;
		if (arg0 == 1) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray28.length) {
					local115 = this.anIntArrayArray28[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray329[local31] += arg2;
						this.anIntArray340[local31] += arg3;
						this.anIntArray334[local31] += arg4;
					}
				}
			}
		} else if (arg0 == 2) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray28.length) {
					local115 = this.anIntArrayArray28[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray329[local31] -= Static178.anInt3634;
						this.anIntArray340[local31] -= Static178.anInt3636;
						this.anIntArray334[local31] -= Static178.anInt3635;
						@Pc(217) int local217;
						@Pc(235) int local235;
						if (arg4 != 0) {
							local36 = Class16.anIntArray44[arg4];
							local217 = Class16.anIntArray39[arg4];
							local235 = this.anIntArray340[local31] * local36 + this.anIntArray329[local31] * local217 + 32767 >> 16;
							this.anIntArray340[local31] = this.anIntArray340[local31] * local217 + 32767 - this.anIntArray329[local31] * local36 >> 16;
							this.anIntArray329[local31] = local235;
						}
						if (arg2 != 0) {
							local36 = Class16.anIntArray44[arg2];
							local217 = Class16.anIntArray39[arg2];
							local235 = this.anIntArray340[local31] * local217 + 32767 - this.anIntArray334[local31] * local36 >> 16;
							this.anIntArray334[local31] = this.anIntArray340[local31] * local36 + this.anIntArray334[local31] * local217 + 32767 >> 16;
							this.anIntArray340[local31] = local235;
						}
						if (arg3 != 0) {
							local36 = Class16.anIntArray44[arg3];
							local217 = Class16.anIntArray39[arg3];
							local235 = this.anIntArray334[local31] * local36 + this.anIntArray329[local31] * local217 + 32767 >> 16;
							this.anIntArray334[local31] = this.anIntArray334[local31] * local217 + 32767 - this.anIntArray329[local31] * local36 >> 16;
							this.anIntArray329[local31] = local235;
						}
						this.anIntArray329[local31] += Static178.anInt3634;
						this.anIntArray340[local31] += Static178.anInt3636;
						this.anIntArray334[local31] += Static178.anInt3635;
					}
				}
			}
		} else if (arg0 == 3) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray28.length) {
					local115 = this.anIntArrayArray28[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray329[local31] -= Static178.anInt3634;
						this.anIntArray340[local31] -= Static178.anInt3636;
						this.anIntArray334[local31] -= Static178.anInt3635;
						this.anIntArray329[local31] = this.anIntArray329[local31] * arg2 / 128;
						this.anIntArray340[local31] = this.anIntArray340[local31] * arg3 / 128;
						this.anIntArray334[local31] = this.anIntArray334[local31] * arg4 / 128;
						this.anIntArray329[local31] += Static178.anInt3634;
						this.anIntArray340[local31] += Static178.anInt3636;
						this.anIntArray334[local31] += Static178.anInt3635;
					}
				}
			}
		} else if (arg0 == 5 && (this.anIntArrayArray27 != null && this.aByteArray40 != null)) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray27.length) {
					local115 = this.anIntArrayArray27[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						local36 = (this.aByteArray40[local31] & 0xFF) + arg2 * 8;
						if (local36 < 0) {
							local36 = 0;
						} else if (local36 > 255) {
							local36 = 255;
						}
						this.aByteArray40[local31] = (byte) local36;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(ZZJII)V")
	private void method2753(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg4 >= 1600) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < arg4; local5++) {
			Static178.anIntArray352[local5] = 0;
		}
		@Pc(28) int local28;
		@Pc(33) int local33;
		@Pc(38) int local38;
		@Pc(42) int local42;
		@Pc(46) int local46;
		@Pc(50) int local50;
		@Pc(65) int local65;
		@Pc(69) int local69;
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(93) int local93;
		for (@Pc(16) int local16 = 0; local16 < this.anInt3633; local16++) {
			if (this.anIntArray332[local16] != -2) {
				local28 = this.anIntArray339[local16];
				local33 = this.anIntArray330[local16];
				local38 = this.anIntArray331[local16];
				local42 = Static178.anIntArray345[local28];
				local46 = Static178.anIntArray345[local33];
				local50 = Static178.anIntArray345[local38];
				if (arg0 && (local42 == -5000 || local46 == -5000 || local50 == -5000)) {
					local65 = Static178.anIntArray350[local28];
					local69 = Static178.anIntArray350[local33];
					@Pc(73) int local73 = Static178.anIntArray350[local38];
					@Pc(77) int local77 = Static178.anIntArray353[local28];
					local81 = Static178.anIntArray353[local33];
					local85 = Static178.anIntArray353[local38];
					@Pc(89) int local89 = Static178.anIntArray341[local28];
					local93 = Static178.anIntArray341[local33];
					@Pc(97) int local97 = Static178.anIntArray341[local38];
					local65 -= local69;
					@Pc(105) int local105 = local73 - local69;
					@Pc(109) int local109 = local77 - local81;
					@Pc(113) int local113 = local85 - local81;
					@Pc(117) int local117 = local89 - local93;
					@Pc(121) int local121 = local97 - local93;
					@Pc(129) int local129 = local109 * local121 - local117 * local113;
					@Pc(137) int local137 = local117 * local105 - local65 * local121;
					@Pc(145) int local145 = local65 * local113 - local109 * local105;
					if (local69 * local129 + local81 * local137 + local93 * local145 > 0) {
						Static178.aBooleanArray24[local16] = true;
						@Pc(177) int local177 = (Static178.anIntArray342[local28] + Static178.anIntArray342[local33] + Static178.anIntArray342[local38]) / 3 + arg3;
						Static178.anIntArrayArray30[local177][Static178.anIntArray352[local177]++] = local16;
					}
				} else {
					if (arg1 && this.method2749(Static59.anInt1451 + Static24.anInt626, Static6.anInt175 + Static24.anInt628, Static178.anIntArray343[local28], Static178.anIntArray343[local33], Static178.anIntArray343[local38], local42, local46, local50)) {
						Static150.aLongArray4[Static44.anInt1173++] = arg2;
						arg1 = false;
					}
					if ((local42 - local46) * (Static178.anIntArray343[local38] - Static178.anIntArray343[local33]) - (Static178.anIntArray343[local28] - Static178.anIntArray343[local33]) * (local50 - local46) > 0) {
						Static178.aBooleanArray24[local16] = false;
						if (local42 >= 0 && local46 >= 0 && local50 >= 0 && local42 <= Static24.anInt625 && local46 <= Static24.anInt625 && local50 <= Static24.anInt625) {
							Static178.aBooleanArray25[local16] = false;
						} else {
							Static178.aBooleanArray25[local16] = true;
						}
						local65 = (Static178.anIntArray342[local28] + Static178.anIntArray342[local33] + Static178.anIntArray342[local38]) / 3 + arg3;
						Static178.anIntArrayArray30[local65][Static178.anIntArray352[local65]++] = local16;
					}
				}
			}
		}
		if (this.aByteArray41 == null) {
			for (local28 = arg4 - 1; local28 >= 0; local28--) {
				local33 = Static178.anIntArray352[local28];
				if (local33 > 0) {
					@Pc(328) int[] local328 = Static178.anIntArrayArray30[local28];
					for (local42 = 0; local42 < local33; local42++) {
						this.method2744(local328[local42]);
					}
				}
			}
			return;
		}
		for (local28 = 0; local28 < 12; local28++) {
			Static178.anIntArray349[local28] = 0;
			Static178.anIntArray351[local28] = 0;
		}
		for (local33 = arg4 - 1; local33 >= 0; local33--) {
			local38 = Static178.anIntArray352[local33];
			if (local38 > 0) {
				@Pc(374) int[] local374 = Static178.anIntArrayArray30[local33];
				for (local46 = 0; local46 < local38; local46++) {
					local50 = local374[local46];
					@Pc(386) byte local386 = this.aByteArray41[local50];
					local69 = Static178.anIntArray349[local386]++;
					Static178.anIntArrayArray29[local386][local69] = local50;
					if (local386 < 10) {
						Static178.anIntArray351[local386] += local33;
					} else if (local386 == 10) {
						Static178.anIntArray344[local69] = local33;
					} else {
						Static178.anIntArray354[local69] = local33;
					}
				}
			}
		}
		local38 = 0;
		if (Static178.anIntArray349[1] > 0 || Static178.anIntArray349[2] > 0) {
			local38 = (Static178.anIntArray351[1] + Static178.anIntArray351[2]) / (Static178.anIntArray349[1] + Static178.anIntArray349[2]);
		}
		local42 = 0;
		if (Static178.anIntArray349[3] > 0 || Static178.anIntArray349[4] > 0) {
			local42 = (Static178.anIntArray351[3] + Static178.anIntArray351[4]) / (Static178.anIntArray349[3] + Static178.anIntArray349[4]);
		}
		local46 = 0;
		if (Static178.anIntArray349[6] > 0 || Static178.anIntArray349[8] > 0) {
			local46 = (Static178.anIntArray351[6] + Static178.anIntArray351[8]) / (Static178.anIntArray349[6] + Static178.anIntArray349[8]);
		}
		local65 = 0;
		local69 = Static178.anIntArray349[10];
		@Pc(519) int[] local519 = Static178.anIntArrayArray29[10];
		@Pc(521) int[] local521 = Static178.anIntArray344;
		if (local69 == 0) {
			local65 = 0;
			local69 = Static178.anIntArray349[11];
			local519 = Static178.anIntArrayArray29[11];
			local521 = Static178.anIntArray354;
		}
		if (local69 > 0) {
			local50 = local521[0];
		} else {
			local50 = -1000;
		}
		for (local81 = 0; local81 < 10; local81++) {
			while (local81 == 0 && local50 > local38) {
				this.method2744(local519[local65++]);
				if (local65 == local69 && local519 != Static178.anIntArrayArray29[11]) {
					local65 = 0;
					local69 = Static178.anIntArray349[11];
					local519 = Static178.anIntArrayArray29[11];
					local521 = Static178.anIntArray354;
				}
				if (local65 < local69) {
					local50 = local521[local65];
				} else {
					local50 = -1000;
				}
			}
			while (local81 == 3 && local50 > local42) {
				this.method2744(local519[local65++]);
				if (local65 == local69 && local519 != Static178.anIntArrayArray29[11]) {
					local65 = 0;
					local69 = Static178.anIntArray349[11];
					local519 = Static178.anIntArrayArray29[11];
					local521 = Static178.anIntArray354;
				}
				if (local65 < local69) {
					local50 = local521[local65];
				} else {
					local50 = -1000;
				}
			}
			while (local81 == 5 && local50 > local46) {
				this.method2744(local519[local65++]);
				if (local65 == local69 && local519 != Static178.anIntArrayArray29[11]) {
					local65 = 0;
					local69 = Static178.anIntArray349[11];
					local519 = Static178.anIntArrayArray29[11];
					local521 = Static178.anIntArray354;
				}
				if (local65 < local69) {
					local50 = local521[local65];
				} else {
					local50 = -1000;
				}
			}
			local85 = Static178.anIntArray349[local81];
			@Pc(684) int[] local684 = Static178.anIntArrayArray29[local81];
			for (local93 = 0; local93 < local85; local93++) {
				this.method2744(local684[local93]);
			}
		}
		while (local50 != -1000) {
			this.method2744(local519[local65++]);
			if (local65 == local69 && local519 != Static178.anIntArrayArray29[11]) {
				local65 = 0;
				local519 = Static178.anIntArrayArray29[11];
				local69 = Static178.anIntArray349[11];
				local521 = Static178.anIntArray354;
			}
			if (local65 < local69) {
				local50 = local521[local65];
			} else {
				local50 = -1000;
			}
		}
	}

	@OriginalMember(owner = "client!si", name = "b", descriptor = "(Z)Lclient!gj;")
	@Override
	public Class24_Sub3 method2727(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static178.aByteArray43.length < this.anInt3633) {
			Static178.aByteArray43 = new byte[this.anInt3633 + 100];
		}
		return this.method2750(arg0, Static178.aClass24_Sub3_Sub1_1, Static178.aByteArray43);
	}

	@OriginalMember(owner = "client!si", name = "c", descriptor = "()V")
	@Override
	public void method2724() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3632; local1++) {
			@Pc(7) int local7 = this.anIntArray329[local1];
			this.anIntArray329[local1] = this.anIntArray334[local1];
			this.anIntArray334[local1] = -local7;
		}
		this.aBoolean171 = false;
	}

	@OriginalMember(owner = "client!si", name = "l", descriptor = "()V")
	private void method2754() {
		@Pc(1) int local1 = 32767;
		@Pc(3) int local3 = 32767;
		@Pc(5) int local5 = 32767;
		@Pc(7) int local7 = -32768;
		@Pc(9) int local9 = -32768;
		@Pc(11) int local11 = -32768;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt3632; local17++) {
			@Pc(23) int local23 = this.anIntArray329[local17];
			@Pc(28) int local28 = this.anIntArray340[local17];
			@Pc(33) int local33 = this.anIntArray334[local17];
			if (local23 < local1) {
				local1 = local23;
			}
			if (local23 > local7) {
				local7 = local23;
			}
			if (local28 < local3) {
				local3 = local28;
			}
			if (local28 > local9) {
				local9 = local28;
			}
			if (local33 < local5) {
				local5 = local33;
			}
			if (local33 > local11) {
				local11 = local33;
			}
			@Pc(71) int local71 = local23 * local23 + local33 * local33;
			if (local71 > local13) {
				local13 = local71;
			}
			local71 = local23 * local23 + local33 * local33 + local28 * local28;
			if (local71 > local15) {
				local15 = local71;
			}
		}
		this.aShort7 = (short) local1;
		this.aShort11 = (short) local7;
		this.aShort12 = (short) local3;
		this.aShort6 = (short) local9;
		this.aShort10 = (short) local5;
		this.aShort9 = (short) local11;
		this.aShort8 = (short) (Math.sqrt((double) local13) + 0.99D);
		this.aShort5 = (short) (Math.sqrt((double) local15) + 0.99D);
		this.aBoolean171 = true;
	}
}
