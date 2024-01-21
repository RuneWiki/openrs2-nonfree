import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!na")
public final class Class3_Sub1_Sub4_Sub5_Sub1 extends Class3_Sub1_Sub4_Sub5 {

	@OriginalMember(owner = "client!na", name = "xb", descriptor = "[B")
	private byte[] aByteArray28;

	@OriginalMember(owner = "client!na", name = "yb", descriptor = "[I")
	private int[] anIntArray251;

	@OriginalMember(owner = "client!na", name = "Ab", descriptor = "[I")
	private int[] anIntArray252;

	@OriginalMember(owner = "client!na", name = "Bb", descriptor = "[I")
	private int[] anIntArray253;

	@OriginalMember(owner = "client!na", name = "Cb", descriptor = "[I")
	private int[] anIntArray254;

	@OriginalMember(owner = "client!na", name = "Db", descriptor = "[I")
	private int[] anIntArray255;

	@OriginalMember(owner = "client!na", name = "Eb", descriptor = "[B")
	private byte[] aByteArray29;

	@OriginalMember(owner = "client!na", name = "Fb", descriptor = "[I")
	private int[] anIntArray256;

	@OriginalMember(owner = "client!na", name = "Gb", descriptor = "[B")
	private byte[] aByteArray30;

	@OriginalMember(owner = "client!na", name = "Hb", descriptor = "[I")
	private int[] anIntArray257;

	@OriginalMember(owner = "client!na", name = "Ib", descriptor = "[I")
	private int[] anIntArray258;

	@OriginalMember(owner = "client!na", name = "Kb", descriptor = "[I")
	private int[] anIntArray259;

	@OriginalMember(owner = "client!na", name = "Lb", descriptor = "[S")
	private short[] aShortArray30;

	@OriginalMember(owner = "client!na", name = "zb", descriptor = "I")
	private int anInt2431 = 0;

	@OriginalMember(owner = "client!na", name = "Jb", descriptor = "B")
	private byte aByte6 = 0;

	@OriginalMember(owner = "client!na", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub4_Sub5_Sub1() {
	}

	@OriginalMember(owner = "client!na", name = "<init>", descriptor = "(Lclient!lb;IIIII)V")
	public Class3_Sub1_Sub4_Sub5_Sub1(@OriginalArg(0) Class3_Sub1_Sub4_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.method1555();
		arg0.method1570();
		super.anInt2426 = arg0.anInt1998;
		super.anIntArray248 = arg0.anIntArray207;
		super.anIntArray247 = arg0.anIntArray214;
		super.anIntArray245 = arg0.anIntArray206;
		super.anInt2428 = arg0.anInt1996;
		this.anIntArray252 = arg0.anIntArray208;
		this.anIntArray251 = arg0.anIntArray212;
		this.anIntArray254 = arg0.anIntArray213;
		this.aByteArray29 = arg0.aByteArray25;
		this.aByteArray30 = arg0.aByteArray23;
		this.aByte6 = arg0.aByte5;
		super.anIntArrayArray26 = arg0.anIntArrayArray19;
		super.anIntArrayArray25 = arg0.anIntArrayArray18;
		@Pc(78) int local78 = (int) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		@Pc(84) int local84 = arg2 * local78 >> 8;
		this.anIntArray257 = new int[super.anInt2428];
		this.anIntArray253 = new int[super.anInt2428];
		this.anIntArray259 = new int[super.anInt2428];
		@Pc(109) int local109;
		if (arg0.aShortArray18 == null) {
			this.aShortArray30 = null;
		} else {
			this.aShortArray30 = new short[super.anInt2428];
			for (local109 = 0; local109 < super.anInt2428; local109++) {
				@Pc(115) short local115 = arg0.aShortArray18[local109];
				if (local115 != -1 && Static36.anInterface1_2.method1719(local115)) {
					this.aShortArray30[local109] = local115;
				} else {
					this.aShortArray30[local109] = -1;
				}
			}
		}
		@Pc(286) int local286;
		if (arg0.anInt1999 > 0 && arg0.aByteArray27 != null) {
			@Pc(153) int[] local153 = new int[arg0.anInt1999];
			for (@Pc(155) int local155 = 0; local155 < super.anInt2428; local155++) {
				if (arg0.aByteArray27[local155] != -1) {
					local153[arg0.aByteArray27[local155] & 0xFF]++;
				}
			}
			this.anInt2431 = 0;
			for (@Pc(184) int local184 = 0; local184 < arg0.anInt1999; local184++) {
				if (local153[local184] > 0 && arg0.aByteArray26[local184] == 0) {
					this.anInt2431++;
				}
			}
			this.anIntArray256 = new int[this.anInt2431];
			this.anIntArray255 = new int[this.anInt2431];
			this.anIntArray258 = new int[this.anInt2431];
			@Pc(222) int local222 = 0;
			for (@Pc(224) int local224 = 0; local224 < arg0.anInt1999; local224++) {
				if (local153[local224] > 0 && arg0.aByteArray26[local224] == 0) {
					this.anIntArray256[local222] = arg0.aShortArray24[local224] & 0xFFFF;
					this.anIntArray255[local222] = arg0.aShortArray19[local224] & 0xFFFF;
					this.anIntArray258[local222] = arg0.aShortArray22[local224] & 0xFFFF;
					local153[local224] = local222++;
				} else {
					local153[local224] = -1;
				}
			}
			this.aByteArray28 = new byte[super.anInt2428];
			for (local286 = 0; local286 < super.anInt2428; local286++) {
				if (arg0.aByteArray27[local286] == -1) {
					this.aByteArray28[local286] = -1;
				} else {
					this.aByteArray28[local286] = (byte) local153[arg0.aByteArray27[local286] & 0xFF];
					if (this.aByteArray28[local286] == -1 && this.aShortArray30 != null) {
						this.aShortArray30[local286] = -1;
					}
				}
			}
		}
		for (local109 = 0; local109 < super.anInt2428; local109++) {
			@Pc(339) byte local339;
			if (arg0.aByteArray21 == null) {
				local339 = 0;
			} else {
				local339 = arg0.aByteArray21[local109];
			}
			@Pc(350) byte local350;
			if (arg0.aByteArray23 == null) {
				local350 = 0;
			} else {
				local350 = arg0.aByteArray23[local109];
			}
			@Pc(361) short local361;
			if (this.aShortArray30 == null) {
				local361 = -1;
			} else {
				local361 = this.aShortArray30[local109];
			}
			if (local350 == -2) {
				local339 = 3;
			}
			if (local350 == -1) {
				local339 = 2;
			}
			@Pc(408) Class15 local408;
			@Pc(569) Class9 local569;
			if (local361 == -1) {
				if (local339 == 0) {
					@Pc(389) int local389 = arg0.aShortArray23[local109] & 0xFFFF;
					if (arg0.aClass15Array1 == null || arg0.aClass15Array1[this.anIntArray252[local109]] == null) {
						local408 = arg0.aClass15Array2[this.anIntArray252[local109]];
					} else {
						local408 = arg0.aClass15Array1[this.anIntArray252[local109]];
					}
					local286 = arg1 + (arg3 * local408.anInt633 + arg4 * local408.anInt631 + arg5 * local408.anInt632) / (local84 * local408.anInt629);
					this.anIntArray257[local109] = Static106.method1895(local389, local286);
					if (arg0.aClass15Array1 == null || arg0.aClass15Array1[this.anIntArray251[local109]] == null) {
						local408 = arg0.aClass15Array2[this.anIntArray251[local109]];
					} else {
						local408 = arg0.aClass15Array1[this.anIntArray251[local109]];
					}
					local286 = arg1 + (arg3 * local408.anInt633 + arg4 * local408.anInt631 + arg5 * local408.anInt632) / (local84 * local408.anInt629);
					this.anIntArray253[local109] = Static106.method1895(local389, local286);
					if (arg0.aClass15Array1 == null || arg0.aClass15Array1[this.anIntArray254[local109]] == null) {
						local408 = arg0.aClass15Array2[this.anIntArray254[local109]];
					} else {
						local408 = arg0.aClass15Array1[this.anIntArray254[local109]];
					}
					local286 = arg1 + (arg3 * local408.anInt633 + arg4 * local408.anInt631 + arg5 * local408.anInt632) / (local84 * local408.anInt629);
					this.anIntArray259[local109] = Static106.method1895(local389, local286);
				} else if (local339 == 1) {
					local569 = arg0.aClass9Array1[local109];
					local286 = arg1 + (arg3 * local569.anInt314 + arg4 * local569.anInt315 + arg5 * local569.anInt310) / (local84 + local84 / 2);
					this.anIntArray257[local109] = Static106.method1895(arg0.aShortArray23[local109] & 0xFFFF, local286);
					this.anIntArray259[local109] = -1;
				} else if (local339 == 3) {
					this.anIntArray257[local109] = 128;
					this.anIntArray259[local109] = -1;
				} else {
					this.anIntArray259[local109] = -2;
				}
			} else if (local339 == 0) {
				if (arg0.aClass15Array1 == null || arg0.aClass15Array1[this.anIntArray252[local109]] == null) {
					local408 = arg0.aClass15Array2[this.anIntArray252[local109]];
				} else {
					local408 = arg0.aClass15Array1[this.anIntArray252[local109]];
				}
				local286 = arg1 + (arg3 * local408.anInt633 + arg4 * local408.anInt631 + arg5 * local408.anInt632) / (local84 * local408.anInt629);
				this.anIntArray257[local109] = Static106.method1902(local286);
				if (arg0.aClass15Array1 == null || arg0.aClass15Array1[this.anIntArray251[local109]] == null) {
					local408 = arg0.aClass15Array2[this.anIntArray251[local109]];
				} else {
					local408 = arg0.aClass15Array1[this.anIntArray251[local109]];
				}
				local286 = arg1 + (arg3 * local408.anInt633 + arg4 * local408.anInt631 + arg5 * local408.anInt632) / (local84 * local408.anInt629);
				this.anIntArray253[local109] = Static106.method1902(local286);
				if (arg0.aClass15Array1 == null || arg0.aClass15Array1[this.anIntArray254[local109]] == null) {
					local408 = arg0.aClass15Array2[this.anIntArray254[local109]];
				} else {
					local408 = arg0.aClass15Array1[this.anIntArray254[local109]];
				}
				local286 = arg1 + (arg3 * local408.anInt633 + arg4 * local408.anInt631 + arg5 * local408.anInt632) / (local84 * local408.anInt629);
				this.anIntArray259[local109] = Static106.method1902(local286);
			} else if (local339 == 1) {
				local569 = arg0.aClass9Array1[local109];
				local286 = arg1 + (arg3 * local569.anInt314 + arg4 * local569.anInt315 + arg5 * local569.anInt310) / (local84 + local84 / 2);
				this.anIntArray257[local109] = Static106.method1902(local286);
				this.anIntArray259[local109] = -1;
			} else {
				this.anIntArray259[local109] = -2;
			}
		}
	}

	@OriginalMember(owner = "client!na", name = "<init>", descriptor = "([Lclient!na;I)V")
	private Class3_Sub1_Sub4_Sub5_Sub1(@OriginalArg(0) Class3_Sub1_Sub4_Sub5_Sub1[] arg0, @OriginalArg(1) int arg1) {
		@Pc(9) boolean local9 = false;
		@Pc(11) boolean local11 = false;
		@Pc(13) boolean local13 = false;
		@Pc(15) boolean local15 = false;
		super.anInt2426 = 0;
		super.anInt2428 = 0;
		this.anInt2431 = 0;
		this.aByte6 = -1;
		for (@Pc(29) int local29 = 0; local29 < arg1; local29++) {
			@Pc(34) Class3_Sub1_Sub4_Sub5_Sub1 local34 = arg0[local29];
			if (local34 != null) {
				super.anInt2426 += local34.anInt2426;
				super.anInt2428 += local34.anInt2428;
				this.anInt2431 += local34.anInt2431;
				if (local34.aByteArray29 == null) {
					if (this.aByte6 == -1) {
						this.aByte6 = local34.aByte6;
					}
					if (this.aByte6 != local34.aByte6) {
						local9 = true;
					}
				} else {
					local9 = true;
				}
				local11 |= local34.aByteArray30 != null;
				local13 |= local34.aShortArray30 != null;
				local15 |= local34.aByteArray28 != null;
			}
		}
		super.anIntArray248 = new int[super.anInt2426];
		super.anIntArray247 = new int[super.anInt2426];
		super.anIntArray245 = new int[super.anInt2426];
		this.anIntArray252 = new int[super.anInt2428];
		this.anIntArray251 = new int[super.anInt2428];
		this.anIntArray254 = new int[super.anInt2428];
		this.anIntArray257 = new int[super.anInt2428];
		this.anIntArray253 = new int[super.anInt2428];
		this.anIntArray259 = new int[super.anInt2428];
		if (local9) {
			this.aByteArray29 = new byte[super.anInt2428];
		}
		if (local11) {
			this.aByteArray30 = new byte[super.anInt2428];
		}
		if (local13) {
			this.aShortArray30 = new short[super.anInt2428];
		}
		if (local15) {
			this.aByteArray28 = new byte[super.anInt2428];
		}
		if (this.anInt2431 > 0) {
			this.anIntArray256 = new int[this.anInt2431];
			this.anIntArray255 = new int[this.anInt2431];
			this.anIntArray258 = new int[this.anInt2431];
		}
		super.anInt2426 = 0;
		super.anInt2428 = 0;
		this.anInt2431 = 0;
		for (@Pc(211) int local211 = 0; local211 < arg1; local211++) {
			@Pc(216) Class3_Sub1_Sub4_Sub5_Sub1 local216 = arg0[local211];
			if (local216 != null) {
				for (@Pc(220) int local220 = 0; local220 < local216.anInt2428; local220++) {
					this.anIntArray252[super.anInt2428] = local216.anIntArray252[local220] + super.anInt2426;
					this.anIntArray251[super.anInt2428] = local216.anIntArray251[local220] + super.anInt2426;
					this.anIntArray254[super.anInt2428] = local216.anIntArray254[local220] + super.anInt2426;
					this.anIntArray257[super.anInt2428] = local216.anIntArray257[local220];
					this.anIntArray253[super.anInt2428] = local216.anIntArray253[local220];
					this.anIntArray259[super.anInt2428] = local216.anIntArray259[local220];
					if (local9) {
						if (local216.aByteArray29 == null) {
							this.aByteArray29[super.anInt2428] = local216.aByte6;
						} else {
							this.aByteArray29[super.anInt2428] = local216.aByteArray29[local220];
						}
					}
					if (local11 && local216.aByteArray30 != null) {
						this.aByteArray30[super.anInt2428] = local216.aByteArray30[local220];
					}
					if (local13) {
						if (local216.aShortArray30 == null) {
							this.aShortArray30[super.anInt2428] = -1;
						} else {
							this.aShortArray30[super.anInt2428] = local216.aShortArray30[local220];
						}
					}
					if (local15) {
						if (local216.aByteArray28 == null || local216.aByteArray28[local220] == -1) {
							this.aByteArray28[super.anInt2428] = -1;
						} else {
							this.aByteArray28[super.anInt2428] = (byte) (local216.aByteArray28[local220] + this.anInt2431);
						}
					}
					super.anInt2428++;
				}
				for (@Pc(385) int local385 = 0; local385 < local216.anInt2431; local385++) {
					this.anIntArray256[this.anInt2431] = local216.anIntArray256[local385] + super.anInt2426;
					this.anIntArray255[this.anInt2431] = local216.anIntArray255[local385] + super.anInt2426;
					this.anIntArray258[this.anInt2431] = local216.anIntArray258[local385] + super.anInt2426;
					this.anInt2431++;
				}
				for (@Pc(435) int local435 = 0; local435 < local216.anInt2426; local435++) {
					super.anIntArray248[super.anInt2426] = local216.anIntArray248[local435];
					super.anIntArray247[super.anInt2426] = local216.anIntArray247[local435];
					super.anIntArray245[super.anInt2426] = local216.anIntArray245[local435];
					super.anInt2426++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!o;)Lclient!o;")
	public Class3_Sub1_Sub4_Sub5 method1894(@OriginalArg(0) Class3_Sub1_Sub4_Sub5 arg0) {
		return new Class3_Sub1_Sub4_Sub5_Sub1(new Class3_Sub1_Sub4_Sub5_Sub1[] { this, (Class3_Sub1_Sub4_Sub5_Sub1) arg0 }, 2);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Z)Lclient!o;")
	@Override
	public Class3_Sub1_Sub4_Sub5 method1883(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static106.aByteArray32.length < super.anInt2428) {
			Static106.aByteArray32 = new byte[super.anInt2428 + 100];
		}
		return this.method1903(arg0, Static106.aClass3_Sub1_Sub4_Sub5_Sub1_2, Static106.aByteArray32);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method2260(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (!super.aBoolean167) {
			this.method1880();
		}
		@Pc(14) int local14 = arg7 * arg4 - arg5 * arg3 >> 16;
		@Pc(24) int local24 = arg6 * arg1 + local14 * arg2 >> 16;
		@Pc(38) int local38 = local24 + (super.aShort25 * arg2 + super.aShort28 * arg1 >> 16);
		if (local38 <= 50) {
			return;
		}
		@Pc(57) int local57 = local24 + (-super.aShort25 * arg2 + super.aShort32 * arg1 >> 16);
		if (local57 >= 3500) {
			return;
		}
		@Pc(71) int local71 = arg7 * arg3 + arg5 * arg4 >> 16;
		@Pc(78) int local78 = local71 + super.aShort25 << 9;
		if (local78 / local38 <= Static36.anInt865) {
			return;
		}
		@Pc(91) int local91 = local71 - super.aShort25 << 9;
		if (local91 / local38 >= Static36.anInt866) {
			return;
		}
		@Pc(107) int local107 = arg6 * arg2 - local14 * arg1 >> 16;
		@Pc(123) int local123 = local107 + (super.aShort25 * arg1 + super.aShort28 * arg2 >> 16) << 9;
		if (local123 / local38 <= Static36.anInt872) {
			return;
		}
		@Pc(146) int local146 = local107 + (-super.aShort25 * arg1 + super.aShort32 * arg2 >> 16) << 9;
		if (local146 / local38 >= Static36.anInt873) {
			return;
		}
		@Pc(154) boolean local154 = false;
		@Pc(161) boolean local161 = local57 <= 50;
		@Pc(170) boolean local170 = local161 || this.anInt2431 > 0;
		@Pc(172) int local172 = Static36.anInt871;
		@Pc(174) int local174 = Static36.anInt870;
		@Pc(176) int local176 = 0;
		@Pc(178) int local178 = 0;
		if (arg0 != 0) {
			local176 = Static106.anIntArray276[arg0];
			local178 = Static106.anIntArray270[arg0];
		}
		@Pc(190) boolean local190 = false;
		@Pc(202) int local202;
		@Pc(221) int local221;
		@Pc(206) int local206;
		@Pc(225) int local225;
		@Pc(238) int local238;
		if (arg8 > 0 && Static114.aBoolean165 && local57 > 0) {
			if (local71 > 0) {
				local202 = local91 / local38;
				local206 = local78 / local57;
			} else {
				local202 = local91 / local57;
				local206 = local78 / local38;
			}
			if (local107 > 0) {
				local221 = local146 / local38;
				local225 = local123 / local57;
			} else {
				local221 = local146 / local57;
				local225 = local123 / local38;
			}
			local238 = Static114.anInt2427 - Static36.anInt871;
			@Pc(242) int local242 = Static114.anInt2429 - Static36.anInt870;
			if (local238 >= local202 && local238 <= local206 && local242 >= local221 && local242 <= local225) {
				local202 = 999999;
				local206 = -999999;
				local221 = 999999;
				local225 = -999999;
				@Pc(305) int[] local305 = new int[] { super.aShort27, super.aShort26, super.aShort27, super.aShort26, super.aShort27, super.aShort26, super.aShort27, super.aShort26 };
				@Pc(348) int[] local348 = new int[] { super.aShort22, super.aShort22, super.aShort23, super.aShort23, super.aShort22, super.aShort22, super.aShort23, super.aShort23 };
				@Pc(391) int[] local391 = new int[] { super.aShort32, super.aShort32, super.aShort32, super.aShort32, super.aShort28, super.aShort28, super.aShort28, super.aShort28 };
				for (@Pc(393) int local393 = 0; local393 < 8; local393++) {
					@Pc(398) int local398 = local305[local393];
					@Pc(402) int local402 = local391[local393];
					@Pc(406) int local406 = local348[local393];
					@Pc(418) int local418;
					if (arg0 != 0) {
						local418 = local406 * local176 + local398 * local178 >> 16;
						local406 = local406 * local178 - local398 * local176 >> 16;
						local398 = local418;
					}
					local398 += arg5;
					local402 += arg6;
					local406 += arg7;
					local418 = local406 * arg3 + local398 * arg4 >> 16;
					local406 = local406 * arg4 - local398 * arg3 >> 16;
					local398 = local418;
					local418 = local402 * arg2 - local406 * arg1 >> 16;
					local406 = local402 * arg1 + local406 * arg2 >> 16;
					if (local406 > 0) {
						@Pc(494) int local494 = (local398 << 9) / local406;
						@Pc(500) int local500 = (local418 << 9) / local406;
						if (local494 < local202) {
							local202 = local494;
						}
						if (local494 > local206) {
							local206 = local494;
						}
						if (local500 < local221) {
							local221 = local500;
						}
						if (local500 > local225) {
							local225 = local500;
						}
					}
				}
				if (local238 >= local202 && local238 <= local206 && local242 >= local221 && local242 <= local225) {
					if (super.aBoolean166) {
						Static114.anIntArray250[Static114.anInt2430++] = arg8;
					} else {
						local190 = true;
					}
				}
			}
		}
		for (local202 = 0; local202 < super.anInt2426; local202++) {
			local221 = super.anIntArray248[local202];
			local206 = super.anIntArray247[local202];
			local225 = super.anIntArray245[local202];
			if (arg0 != 0) {
				local238 = local225 * local176 + local221 * local178 >> 16;
				local225 = local225 * local178 - local221 * local176 >> 16;
				local221 = local238;
			}
			local221 += arg5;
			local206 += arg6;
			local225 += arg7;
			local238 = local225 * arg3 + local221 * arg4 >> 16;
			local225 = local225 * arg4 - local221 * arg3 >> 16;
			local221 = local238;
			local238 = local206 * arg2 - local225 * arg1 >> 16;
			local225 = local206 * arg1 + local225 * arg2 >> 16;
			Static106.anIntArray267[local202] = local225 - local24;
			if (local225 >= 50) {
				Static106.anIntArray275[local202] = local172 + (local221 << 9) / local225;
				Static106.anIntArray262[local202] = local174 + (local238 << 9) / local225;
			} else {
				Static106.anIntArray275[local202] = -5000;
				local154 = true;
			}
			if (local170) {
				Static106.anIntArray264[local202] = local221;
				Static106.anIntArray268[local202] = local238;
				Static106.anIntArray263[local202] = local225;
			}
		}
		try {
			this.method1899(local154, local190, arg8, local24 - local57, local38 - local57 + 2);
		} catch (@Pc(718) Exception local718) {
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!nc;I)V")
	@Override
	public void method1891(@OriginalArg(0) Class3_Sub1_Sub14 arg0, @OriginalArg(1) int arg1) {
		if (super.anIntArrayArray26 == null || arg1 == -1) {
			return;
		}
		@Pc(12) Class25 local12 = arg0.aClass25Array1[arg1];
		@Pc(15) Class3_Sub21 local15 = local12.aClass3_Sub21_1;
		Static106.anInt2434 = 0;
		Static106.anInt2433 = 0;
		Static106.anInt2432 = 0;
		for (@Pc(23) int local23 = 0; local23 < local12.anInt1135; local23++) {
			@Pc(29) int local29 = local12.anIntArray102[local23];
			this.method1898(local15.anIntArray369[local29], local15.anIntArrayArray36[local29], local12.anIntArray103[local23], local12.anIntArray105[local23], local12.anIntArray104[local23]);
		}
		super.aBoolean167 = false;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method1881(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			this.method1880();
			@Pc(3) int local3 = Static36.anInt871;
			@Pc(5) int local5 = Static36.anInt870;
			@Pc(9) int local9 = Static106.anIntArray276[0];
			@Pc(13) int local13 = Static106.anIntArray270[0];
			@Pc(17) int local17 = Static106.anIntArray276[arg0];
			@Pc(21) int local21 = Static106.anIntArray270[arg0];
			@Pc(25) int local25 = Static106.anIntArray276[arg1];
			@Pc(29) int local29 = Static106.anIntArray270[arg1];
			@Pc(33) int local33 = Static106.anIntArray276[arg2];
			@Pc(37) int local37 = Static106.anIntArray270[arg2];
			@Pc(47) int local47 = arg4 * local33 + arg5 * local37 >> 16;
			for (@Pc(49) int local49 = 0; local49 < super.anInt2426; local49++) {
				@Pc(55) int local55 = super.anIntArray248[local49];
				@Pc(60) int local60 = super.anIntArray247[local49];
				@Pc(65) int local65 = super.anIntArray245[local49];
				@Pc(77) int local77;
				if (arg1 != 0) {
					local77 = local60 * local25 + local55 * local29 >> 16;
					local60 = local60 * local29 - local55 * local25 >> 16;
					local55 = local77;
				}
				if (arg0 != 0) {
					local77 = local65 * local17 + local55 * local21 >> 16;
					local65 = local65 * local21 - local55 * local17 >> 16;
					local55 = local77;
				}
				local55 += arg3;
				local60 += arg4;
				local65 += arg5;
				local77 = local60 * local37 - local65 * local33 >> 16;
				local65 = local60 * local33 + local65 * local37 >> 16;
				Static106.anIntArray267[local49] = local65 - local47;
				Static106.anIntArray275[local49] = local3 + (local55 << 9) / local65;
				Static106.anIntArray262[local49] = local5 + (local77 << 9) / local65;
				if (this.anInt2431 > 0) {
					Static106.anIntArray264[local49] = local55;
					Static106.anIntArray268[local49] = local77;
					Static106.anIntArray263[local49] = local65;
				}
			}
			this.method1899(false, false, 0, super.aShort24, super.aShort24 << 1);
		} catch (@Pc(230) RuntimeException local230) {
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!nc;ILclient!nc;I[I)V")
	@Override
	public void method1884(@OriginalArg(0) Class3_Sub1_Sub14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub1_Sub14 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		if (arg1 == -1) {
			return;
		}
		if (arg4 == null || arg3 == -1) {
			this.method1891(arg0, arg1);
			return;
		}
		@Pc(18) Class25 local18 = arg0.aClass25Array1[arg1];
		@Pc(23) Class25 local23 = arg2.aClass25Array1[arg3];
		@Pc(26) Class3_Sub21 local26 = local18.aClass3_Sub21_1;
		Static106.anInt2434 = 0;
		Static106.anInt2433 = 0;
		Static106.anInt2432 = 0;
		@Pc(34) byte local34 = 0;
		@Pc(37) int local37 = local34 + 1;
		@Pc(39) int local39 = arg4[0];
		@Pc(47) int local47;
		for (@Pc(41) int local41 = 0; local41 < local18.anInt1135; local41++) {
			local47 = local18.anIntArray102[local41];
			while (local47 > local39) {
				local39 = arg4[local37++];
			}
			if (local47 != local39 || local26.anIntArray369[local47] == 0) {
				this.method1898(local26.anIntArray369[local47], local26.anIntArrayArray36[local47], local18.anIntArray103[local41], local18.anIntArray105[local41], local18.anIntArray104[local41]);
			}
		}
		Static106.anInt2434 = 0;
		Static106.anInt2433 = 0;
		Static106.anInt2432 = 0;
		local34 = 0;
		local37 = local34 + 1;
		local39 = arg4[0];
		for (local47 = 0; local47 < local23.anInt1135; local47++) {
			@Pc(112) int local112 = local23.anIntArray102[local47];
			while (local112 > local39) {
				local39 = arg4[local37++];
			}
			if (local112 == local39 || local26.anIntArray369[local112] == 0) {
				this.method1898(local26.anIntArray369[local112], local26.anIntArrayArray36[local112], local23.anIntArray103[local47], local23.anIntArray105[local47], local23.anIntArray104[local47]);
			}
		}
		super.aBoolean167 = false;
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(IIIIIIII)Z")
	private boolean method1896(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!na", name = "l", descriptor = "(I)V")
	private void method1897(@OriginalArg(0) int arg0) {
		if (Static106.aBooleanArray12[arg0]) {
			this.method1900(arg0);
			return;
		}
		@Pc(12) int local12 = this.anIntArray252[arg0];
		@Pc(17) int local17 = this.anIntArray251[arg0];
		@Pc(22) int local22 = this.anIntArray254[arg0];
		Static36.aBoolean54 = Static106.aBooleanArray11[arg0];
		if (this.aByteArray30 == null) {
			Static36.anInt867 = 0;
		} else {
			Static36.anInt867 = this.aByteArray30[arg0] & 0xFF;
		}
		if (this.aShortArray30 != null && this.aShortArray30[arg0] != -1) {
			@Pc(133) int local133;
			@Pc(138) int local138;
			@Pc(143) int local143;
			if (this.aByteArray28 == null || this.aByteArray28[arg0] == -1) {
				local133 = local12;
				local138 = local17;
				local143 = local22;
			} else {
				@Pc(128) int local128 = this.aByteArray28[arg0] & 0xFF;
				local133 = this.anIntArray256[local128];
				local138 = this.anIntArray255[local128];
				local143 = this.anIntArray258[local128];
			}
			if (this.anIntArray259[arg0] == -1) {
				Static36.method666(Static106.anIntArray262[local12], Static106.anIntArray262[local17], Static106.anIntArray262[local22], Static106.anIntArray275[local12], Static106.anIntArray275[local17], Static106.anIntArray275[local22], this.anIntArray257[arg0], this.anIntArray257[arg0], this.anIntArray257[arg0], Static106.anIntArray264[local133], Static106.anIntArray264[local138], Static106.anIntArray264[local143], Static106.anIntArray268[local133], Static106.anIntArray268[local138], Static106.anIntArray268[local143], Static106.anIntArray263[local133], Static106.anIntArray263[local138], Static106.anIntArray263[local143], this.aShortArray30[arg0]);
			} else {
				Static36.method666(Static106.anIntArray262[local12], Static106.anIntArray262[local17], Static106.anIntArray262[local22], Static106.anIntArray275[local12], Static106.anIntArray275[local17], Static106.anIntArray275[local22], this.anIntArray257[arg0], this.anIntArray253[arg0], this.anIntArray259[arg0], Static106.anIntArray264[local133], Static106.anIntArray264[local138], Static106.anIntArray264[local143], Static106.anIntArray268[local133], Static106.anIntArray268[local138], Static106.anIntArray268[local143], Static106.anIntArray263[local133], Static106.anIntArray263[local138], Static106.anIntArray263[local143], this.aShortArray30[arg0]);
			}
		} else if (this.anIntArray259[arg0] == -1) {
			Static36.method665(Static106.anIntArray262[local12], Static106.anIntArray262[local17], Static106.anIntArray262[local22], Static106.anIntArray275[local12], Static106.anIntArray275[local17], Static106.anIntArray275[local22], Static106.anIntArray272[this.anIntArray257[arg0]]);
		} else {
			Static36.method655(Static106.anIntArray262[local12], Static106.anIntArray262[local17], Static106.anIntArray262[local22], Static106.anIntArray275[local12], Static106.anIntArray275[local17], Static106.anIntArray275[local22], this.anIntArray257[arg0], this.anIntArray253[arg0], this.anIntArray259[arg0]);
		}
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(Z)Lclient!o;")
	@Override
	public Class3_Sub1_Sub4_Sub5 method1886(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static106.aByteArray31.length < super.anInt2428) {
			Static106.aByteArray31 = new byte[super.anInt2428 + 100];
		}
		return this.method1903(arg0, Static106.aClass3_Sub1_Sub4_Sub5_Sub1_1, Static106.aByteArray31);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "([[IIIIZI)Lclient!o;")
	@Override
	public Class3_Sub1_Sub4_Sub5 method1888(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method1880();
		@Pc(6) int local6 = arg1 + super.aShort27;
		@Pc(11) int local11 = arg1 + super.aShort26;
		@Pc(16) int local16 = arg3 + super.aShort22;
		@Pc(21) int local21 = arg3 + super.aShort23;
		if (local6 < 0 || local11 + 128 >> 7 >= arg0.length || local16 < 0 || local21 + 128 >> 7 >= arg0[0].length) {
			return this;
		}
		local6 >>= 0x7;
		local11 = local11 + 127 >> 7;
		local16 >>= 0x7;
		local21 = local21 + 127 >> 7;
		if (arg0[local6][local16] == arg2 && arg0[local11][local16] == arg2 && arg0[local6][local21] == arg2 && arg0[local11][local21] == arg2) {
			return this;
		}
		@Pc(101) Class3_Sub1_Sub4_Sub5_Sub1 local101;
		if (arg4) {
			local101 = new Class3_Sub1_Sub4_Sub5_Sub1();
			local101.anInt2426 = super.anInt2426;
			local101.anInt2428 = super.anInt2428;
			local101.anInt2431 = this.anInt2431;
			local101.anIntArray248 = super.anIntArray248;
			local101.anIntArray245 = super.anIntArray245;
			local101.anIntArray252 = this.anIntArray252;
			local101.anIntArray251 = this.anIntArray251;
			local101.anIntArray254 = this.anIntArray254;
			local101.anIntArray257 = this.anIntArray257;
			local101.anIntArray253 = this.anIntArray253;
			local101.anIntArray259 = this.anIntArray259;
			local101.aByteArray29 = this.aByteArray29;
			local101.aByteArray30 = this.aByteArray30;
			local101.aByteArray28 = this.aByteArray28;
			local101.aShortArray30 = this.aShortArray30;
			local101.aByte6 = this.aByte6;
			local101.anIntArray256 = this.anIntArray256;
			local101.anIntArray255 = this.anIntArray255;
			local101.anIntArray258 = this.anIntArray258;
			local101.anIntArrayArray26 = super.anIntArrayArray26;
			local101.anIntArrayArray25 = super.anIntArrayArray25;
			local101.aBoolean166 = super.aBoolean166;
			local101.anIntArray247 = new int[local101.anInt2426];
		} else {
			local101 = this;
		}
		@Pc(201) int local201;
		@Pc(209) int local209;
		@Pc(216) int local216;
		@Pc(220) int local220;
		@Pc(224) int local224;
		@Pc(228) int local228;
		@Pc(232) int local232;
		@Pc(254) int local254;
		@Pc(280) int local280;
		@Pc(292) int local292;
		if (arg5 == 0) {
			for (local201 = 0; local201 < local101.anInt2426; local201++) {
				local209 = super.anIntArray248[local201] + arg1;
				local216 = super.anIntArray245[local201] + arg3;
				local220 = local209 & 0x7F;
				local224 = local216 & 0x7F;
				local228 = local209 >> 7;
				local232 = local216 >> 7;
				local254 = arg0[local228][local232] * (128 - local220) + arg0[local228 + 1][local232] * local220 >> 7;
				local280 = arg0[local228][local232 + 1] * (128 - local220) + arg0[local228 + 1][local232 + 1] * local220 >> 7;
				local292 = local254 * (128 - local224) + local280 * local224 >> 7;
				local101.anIntArray247[local201] = super.anIntArray247[local201] + local292 - arg2;
			}
		} else {
			for (local201 = 0; local201 < local101.anInt2426; local201++) {
				local209 = (super.anIntArray247[local201] << 16) / super.aShort32;
				if (local209 < arg5) {
					local216 = super.anIntArray248[local201] + arg1;
					local220 = super.anIntArray245[local201] + arg3;
					local224 = local216 & 0x7F;
					local228 = local220 & 0x7F;
					local232 = local216 >> 7;
					local254 = local220 >> 7;
					local280 = arg0[local232][local254] * (128 - local224) + arg0[local232 + 1][local254] * local224 >> 7;
					local292 = arg0[local232][local254 + 1] * (128 - local224) + arg0[local232 + 1][local254 + 1] * local224 >> 7;
					@Pc(416) int local416 = local280 * (128 - local228) + local292 * local228 >> 7;
					local101.anIntArray247[local201] = super.anIntArray247[local201] + (local416 - arg2) * (arg5 - local209) / arg5;
				} else {
					local101.anIntArray247[local201] = super.anIntArray247[local201];
				}
			}
		}
		super.aBoolean167 = false;
		return local101;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(I[IIII)V")
	private void method1898(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(31) int local31;
		@Pc(36) int local36;
		if (arg0 == 0) {
			local6 = 0;
			Static106.anInt2434 = 0;
			Static106.anInt2433 = 0;
			Static106.anInt2432 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				@Pc(19) int local19 = arg1[local14];
				if (local19 < super.anIntArrayArray26.length) {
					@Pc(29) int[] local29 = super.anIntArrayArray26[local19];
					for (local31 = 0; local31 < local29.length; local31++) {
						local36 = local29[local31];
						Static106.anInt2434 += super.anIntArray248[local36];
						Static106.anInt2433 += super.anIntArray247[local36];
						Static106.anInt2432 += super.anIntArray245[local36];
						local6++;
					}
				}
			}
			if (local6 > 0) {
				Static106.anInt2434 = Static106.anInt2434 / local6 + arg2;
				Static106.anInt2433 = Static106.anInt2433 / local6 + arg3;
				Static106.anInt2432 = Static106.anInt2432 / local6 + arg4;
			} else {
				Static106.anInt2434 = arg2;
				Static106.anInt2433 = arg3;
				Static106.anInt2432 = arg4;
			}
			return;
		}
		@Pc(115) int[] local115;
		@Pc(117) int local117;
		if (arg0 == 1) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < super.anIntArrayArray26.length) {
					local115 = super.anIntArrayArray26[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						super.anIntArray248[local31] += arg2;
						super.anIntArray247[local31] += arg3;
						super.anIntArray245[local31] += arg4;
					}
				}
			}
		} else if (arg0 == 2) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < super.anIntArrayArray26.length) {
					local115 = super.anIntArrayArray26[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						super.anIntArray248[local31] -= Static106.anInt2434;
						super.anIntArray247[local31] -= Static106.anInt2433;
						super.anIntArray245[local31] -= Static106.anInt2432;
						local36 = (arg2 & 0xFF) * 8;
						@Pc(219) int local219 = (arg3 & 0xFF) * 8;
						@Pc(225) int local225 = (arg4 & 0xFF) * 8;
						@Pc(231) int local231;
						@Pc(235) int local235;
						@Pc(253) int local253;
						if (local225 != 0) {
							local231 = Static106.anIntArray276[local225];
							local235 = Static106.anIntArray270[local225];
							local253 = super.anIntArray247[local31] * local231 + super.anIntArray248[local31] * local235 + 32767 >> 16;
							super.anIntArray247[local31] = super.anIntArray247[local31] * local235 + 32767 - super.anIntArray248[local31] * local231 >> 16;
							super.anIntArray248[local31] = local253;
						}
						if (local36 != 0) {
							local231 = Static106.anIntArray276[local36];
							local235 = Static106.anIntArray270[local36];
							local253 = super.anIntArray247[local31] * local235 + 32767 - super.anIntArray245[local31] * local231 >> 16;
							super.anIntArray245[local31] = super.anIntArray247[local31] * local231 + super.anIntArray245[local31] * local235 + 32767 >> 16;
							super.anIntArray247[local31] = local253;
						}
						if (local219 != 0) {
							local231 = Static106.anIntArray276[local219];
							local235 = Static106.anIntArray270[local219];
							local253 = super.anIntArray245[local31] * local231 + super.anIntArray248[local31] * local235 + 32767 >> 16;
							super.anIntArray245[local31] = super.anIntArray245[local31] * local235 + 32767 - super.anIntArray248[local31] * local231 >> 16;
							super.anIntArray248[local31] = local253;
						}
						super.anIntArray248[local31] += Static106.anInt2434;
						super.anIntArray247[local31] += Static106.anInt2433;
						super.anIntArray245[local31] += Static106.anInt2432;
					}
				}
			}
		} else if (arg0 == 3) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < super.anIntArrayArray26.length) {
					local115 = super.anIntArrayArray26[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						super.anIntArray248[local31] -= Static106.anInt2434;
						super.anIntArray247[local31] -= Static106.anInt2433;
						super.anIntArray245[local31] -= Static106.anInt2432;
						super.anIntArray248[local31] = super.anIntArray248[local31] * arg2 / 128;
						super.anIntArray247[local31] = super.anIntArray247[local31] * arg3 / 128;
						super.anIntArray245[local31] = super.anIntArray245[local31] * arg4 / 128;
						super.anIntArray248[local31] += Static106.anInt2434;
						super.anIntArray247[local31] += Static106.anInt2433;
						super.anIntArray245[local31] += Static106.anInt2432;
					}
				}
			}
		} else if (arg0 == 5 && (super.anIntArrayArray25 != null && this.aByteArray30 != null)) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < super.anIntArrayArray25.length) {
					local115 = super.anIntArrayArray25[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						local36 = (this.aByteArray30[local31] & 0xFF) + arg2 * 8;
						if (local36 < 0) {
							local36 = 0;
						} else if (local36 > 255) {
							local36 = 255;
						}
						this.aByteArray30[local31] = (byte) local36;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(ZZIII)V")
	private void method1899(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg4 >= 1600) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < arg4; local5++) {
			Static106.anIntArray274[local5] = 0;
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
		for (@Pc(16) int local16 = 0; local16 < super.anInt2428; local16++) {
			if (this.anIntArray259[local16] != -2) {
				local28 = this.anIntArray252[local16];
				local33 = this.anIntArray251[local16];
				local38 = this.anIntArray254[local16];
				local42 = Static106.anIntArray275[local28];
				local46 = Static106.anIntArray275[local33];
				local50 = Static106.anIntArray275[local38];
				if (arg0 && (local42 == -5000 || local46 == -5000 || local50 == -5000)) {
					local65 = Static106.anIntArray264[local28];
					local69 = Static106.anIntArray264[local33];
					@Pc(73) int local73 = Static106.anIntArray264[local38];
					@Pc(77) int local77 = Static106.anIntArray268[local28];
					local81 = Static106.anIntArray268[local33];
					local85 = Static106.anIntArray268[local38];
					@Pc(89) int local89 = Static106.anIntArray263[local28];
					local93 = Static106.anIntArray263[local33];
					@Pc(97) int local97 = Static106.anIntArray263[local38];
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
						Static106.aBooleanArray12[local16] = true;
						@Pc(177) int local177 = (Static106.anIntArray267[local28] + Static106.anIntArray267[local33] + Static106.anIntArray267[local38]) / 3 + arg3;
						Static106.anIntArrayArray27[local177][Static106.anIntArray274[local177]++] = local16;
					}
				} else {
					if (arg1 && this.method1896(Static114.anInt2427, Static114.anInt2429, Static106.anIntArray262[local28], Static106.anIntArray262[local33], Static106.anIntArray262[local38], local42, local46, local50)) {
						Static114.anIntArray250[Static114.anInt2430++] = arg2;
						arg1 = false;
					}
					if ((local42 - local46) * (Static106.anIntArray262[local38] - Static106.anIntArray262[local33]) - (Static106.anIntArray262[local28] - Static106.anIntArray262[local33]) * (local50 - local46) > 0) {
						Static106.aBooleanArray12[local16] = false;
						if (local42 >= 0 && local46 >= 0 && local50 >= 0 && local42 <= Static36.anInt868 && local46 <= Static36.anInt868 && local50 <= Static36.anInt868) {
							Static106.aBooleanArray11[local16] = false;
						} else {
							Static106.aBooleanArray11[local16] = true;
						}
						local65 = (Static106.anIntArray267[local28] + Static106.anIntArray267[local33] + Static106.anIntArray267[local38]) / 3 + arg3;
						Static106.anIntArrayArray27[local65][Static106.anIntArray274[local65]++] = local16;
					}
				}
			}
		}
		if (this.aByteArray29 == null) {
			for (local28 = arg4 - 1; local28 >= 0; local28--) {
				local33 = Static106.anIntArray274[local28];
				if (local33 > 0) {
					@Pc(324) int[] local324 = Static106.anIntArrayArray27[local28];
					for (local42 = 0; local42 < local33; local42++) {
						this.method1897(local324[local42]);
					}
				}
			}
			return;
		}
		for (local28 = 0; local28 < 12; local28++) {
			Static106.anIntArray260[local28] = 0;
			Static106.anIntArray277[local28] = 0;
		}
		for (local33 = arg4 - 1; local33 >= 0; local33--) {
			local38 = Static106.anIntArray274[local33];
			if (local38 > 0) {
				@Pc(370) int[] local370 = Static106.anIntArrayArray27[local33];
				for (local46 = 0; local46 < local38; local46++) {
					local50 = local370[local46];
					@Pc(382) byte local382 = this.aByteArray29[local50];
					local69 = Static106.anIntArray260[local382]++;
					Static106.anIntArrayArray28[local382][local69] = local50;
					if (local382 < 10) {
						Static106.anIntArray277[local382] += local33;
					} else if (local382 == 10) {
						Static106.anIntArray265[local69] = local33;
					} else {
						Static106.anIntArray273[local69] = local33;
					}
				}
			}
		}
		local38 = 0;
		if (Static106.anIntArray260[1] > 0 || Static106.anIntArray260[2] > 0) {
			local38 = (Static106.anIntArray277[1] + Static106.anIntArray277[2]) / (Static106.anIntArray260[1] + Static106.anIntArray260[2]);
		}
		local42 = 0;
		if (Static106.anIntArray260[3] > 0 || Static106.anIntArray260[4] > 0) {
			local42 = (Static106.anIntArray277[3] + Static106.anIntArray277[4]) / (Static106.anIntArray260[3] + Static106.anIntArray260[4]);
		}
		local46 = 0;
		if (Static106.anIntArray260[6] > 0 || Static106.anIntArray260[8] > 0) {
			local46 = (Static106.anIntArray277[6] + Static106.anIntArray277[8]) / (Static106.anIntArray260[6] + Static106.anIntArray260[8]);
		}
		local65 = 0;
		local69 = Static106.anIntArray260[10];
		@Pc(515) int[] local515 = Static106.anIntArrayArray28[10];
		@Pc(517) int[] local517 = Static106.anIntArray265;
		if (local69 == 0) {
			local65 = 0;
			local69 = Static106.anIntArray260[11];
			local515 = Static106.anIntArrayArray28[11];
			local517 = Static106.anIntArray273;
		}
		if (local69 > 0) {
			local50 = local517[0];
		} else {
			local50 = -1000;
		}
		for (local81 = 0; local81 < 10; local81++) {
			while (local81 == 0 && local50 > local38) {
				this.method1897(local515[local65++]);
				if (local65 == local69 && local515 != Static106.anIntArrayArray28[11]) {
					local65 = 0;
					local69 = Static106.anIntArray260[11];
					local515 = Static106.anIntArrayArray28[11];
					local517 = Static106.anIntArray273;
				}
				if (local65 < local69) {
					local50 = local517[local65];
				} else {
					local50 = -1000;
				}
			}
			while (local81 == 3 && local50 > local42) {
				this.method1897(local515[local65++]);
				if (local65 == local69 && local515 != Static106.anIntArrayArray28[11]) {
					local65 = 0;
					local69 = Static106.anIntArray260[11];
					local515 = Static106.anIntArrayArray28[11];
					local517 = Static106.anIntArray273;
				}
				if (local65 < local69) {
					local50 = local517[local65];
				} else {
					local50 = -1000;
				}
			}
			while (local81 == 5 && local50 > local46) {
				this.method1897(local515[local65++]);
				if (local65 == local69 && local515 != Static106.anIntArrayArray28[11]) {
					local65 = 0;
					local69 = Static106.anIntArray260[11];
					local515 = Static106.anIntArrayArray28[11];
					local517 = Static106.anIntArray273;
				}
				if (local65 < local69) {
					local50 = local517[local65];
				} else {
					local50 = -1000;
				}
			}
			local85 = Static106.anIntArray260[local81];
			@Pc(680) int[] local680 = Static106.anIntArrayArray28[local81];
			for (local93 = 0; local93 < local85; local93++) {
				this.method1897(local680[local93]);
			}
		}
		while (local50 != -1000) {
			this.method1897(local515[local65++]);
			if (local65 == local69 && local515 != Static106.anIntArrayArray28[11]) {
				local65 = 0;
				local515 = Static106.anIntArrayArray28[11];
				local69 = Static106.anIntArray260[11];
				local517 = Static106.anIntArray273;
			}
			if (local65 < local69) {
				local50 = local517[local65];
			} else {
				local50 = -1000;
			}
		}
	}

	@OriginalMember(owner = "client!na", name = "m", descriptor = "(I)V")
	private void method1900(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static36.anInt871;
		@Pc(3) int local3 = Static36.anInt870;
		@Pc(5) int local5 = 0;
		@Pc(10) int local10 = this.anIntArray252[arg0];
		@Pc(15) int local15 = this.anIntArray251[arg0];
		@Pc(20) int local20 = this.anIntArray254[arg0];
		@Pc(24) int local24 = Static106.anIntArray263[local10];
		@Pc(28) int local28 = Static106.anIntArray263[local15];
		@Pc(32) int local32 = Static106.anIntArray263[local20];
		if (this.aByteArray30 == null) {
			Static36.anInt867 = 0;
		} else {
			Static36.anInt867 = this.aByteArray30[arg0] & 0xFF;
		}
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(82) int local82;
		@Pc(95) int local95;
		if (local24 >= 50) {
			Static106.anIntArray261[0] = Static106.anIntArray275[local10];
			Static106.anIntArray271[0] = Static106.anIntArray262[local10];
			local5++;
			Static106.anIntArray269[0] = this.anIntArray257[arg0];
		} else {
			local73 = Static106.anIntArray264[local10];
			local77 = Static106.anIntArray268[local10];
			local82 = this.anIntArray257[arg0];
			if (local32 >= 50) {
				local95 = (50 - local24) * Static106.anIntArray266[local32 - local24];
				Static106.anIntArray261[0] = local1 + (local73 + ((Static106.anIntArray264[local20] - local73) * local95 >> 16) << 9) / 50;
				Static106.anIntArray271[0] = local3 + (local77 + ((Static106.anIntArray268[local20] - local77) * local95 >> 16) << 9) / 50;
				local5++;
				Static106.anIntArray269[0] = local82 + ((this.anIntArray259[arg0] - local82) * local95 >> 16);
			}
			if (local28 >= 50) {
				local95 = (50 - local24) * Static106.anIntArray266[local28 - local24];
				Static106.anIntArray261[local5] = local1 + (local73 + ((Static106.anIntArray264[local15] - local73) * local95 >> 16) << 9) / 50;
				Static106.anIntArray271[local5] = local3 + (local77 + ((Static106.anIntArray268[local15] - local77) * local95 >> 16) << 9) / 50;
				Static106.anIntArray269[local5++] = local82 + ((this.anIntArray253[arg0] - local82) * local95 >> 16);
			}
		}
		if (local28 >= 50) {
			Static106.anIntArray261[local5] = Static106.anIntArray275[local15];
			Static106.anIntArray271[local5] = Static106.anIntArray262[local15];
			Static106.anIntArray269[local5++] = this.anIntArray253[arg0];
		} else {
			local73 = Static106.anIntArray264[local15];
			local77 = Static106.anIntArray268[local15];
			local82 = this.anIntArray253[arg0];
			if (local24 >= 50) {
				local95 = (50 - local28) * Static106.anIntArray266[local24 - local28];
				Static106.anIntArray261[local5] = local1 + (local73 + ((Static106.anIntArray264[local10] - local73) * local95 >> 16) << 9) / 50;
				Static106.anIntArray271[local5] = local3 + (local77 + ((Static106.anIntArray268[local10] - local77) * local95 >> 16) << 9) / 50;
				Static106.anIntArray269[local5++] = local82 + ((this.anIntArray257[arg0] - local82) * local95 >> 16);
			}
			if (local32 >= 50) {
				local95 = (50 - local28) * Static106.anIntArray266[local32 - local28];
				Static106.anIntArray261[local5] = local1 + (local73 + ((Static106.anIntArray264[local20] - local73) * local95 >> 16) << 9) / 50;
				Static106.anIntArray271[local5] = local3 + (local77 + ((Static106.anIntArray268[local20] - local77) * local95 >> 16) << 9) / 50;
				Static106.anIntArray269[local5++] = local82 + ((this.anIntArray259[arg0] - local82) * local95 >> 16);
			}
		}
		if (local32 >= 50) {
			Static106.anIntArray261[local5] = Static106.anIntArray275[local20];
			Static106.anIntArray271[local5] = Static106.anIntArray262[local20];
			Static106.anIntArray269[local5++] = this.anIntArray259[arg0];
		} else {
			local73 = Static106.anIntArray264[local20];
			local77 = Static106.anIntArray268[local20];
			local82 = this.anIntArray259[arg0];
			if (local28 >= 50) {
				local95 = (50 - local32) * Static106.anIntArray266[local28 - local32];
				Static106.anIntArray261[local5] = local1 + (local73 + ((Static106.anIntArray264[local15] - local73) * local95 >> 16) << 9) / 50;
				Static106.anIntArray271[local5] = local3 + (local77 + ((Static106.anIntArray268[local15] - local77) * local95 >> 16) << 9) / 50;
				Static106.anIntArray269[local5++] = local82 + ((this.anIntArray253[arg0] - local82) * local95 >> 16);
			}
			if (local24 >= 50) {
				local95 = (50 - local32) * Static106.anIntArray266[local24 - local32];
				Static106.anIntArray261[local5] = local1 + (local73 + ((Static106.anIntArray264[local10] - local73) * local95 >> 16) << 9) / 50;
				Static106.anIntArray271[local5] = local3 + (local77 + ((Static106.anIntArray268[local10] - local77) * local95 >> 16) << 9) / 50;
				Static106.anIntArray269[local5++] = local82 + ((this.anIntArray257[arg0] - local82) * local95 >> 16);
			}
		}
		local73 = Static106.anIntArray261[0];
		local77 = Static106.anIntArray261[1];
		local82 = Static106.anIntArray261[2];
		local95 = Static106.anIntArray271[0];
		@Pc(590) int local590 = Static106.anIntArray271[1];
		@Pc(594) int local594 = Static106.anIntArray271[2];
		Static36.aBoolean54 = false;
		@Pc(683) int local683;
		@Pc(688) int local688;
		@Pc(693) int local693;
		@Pc(678) int local678;
		if (local5 == 3) {
			if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static36.anInt868 || local77 > Static36.anInt868 || local82 > Static36.anInt868) {
				Static36.aBoolean54 = true;
			}
			if (this.aShortArray30 != null && this.aShortArray30[arg0] != -1) {
				if (this.aByteArray28 == null || this.aByteArray28[arg0] == -1) {
					local683 = local10;
					local688 = local15;
					local693 = local20;
				} else {
					local678 = this.aByteArray28[arg0] & 0xFF;
					local683 = this.anIntArray256[local678];
					local688 = this.anIntArray255[local678];
					local693 = this.anIntArray258[local678];
				}
				if (this.anIntArray259[arg0] == -1) {
					Static36.method666(local95, local590, local594, local73, local77, local82, this.anIntArray257[arg0], this.anIntArray257[arg0], this.anIntArray257[arg0], Static106.anIntArray264[local683], Static106.anIntArray264[local688], Static106.anIntArray264[local693], Static106.anIntArray268[local683], Static106.anIntArray268[local688], Static106.anIntArray268[local693], Static106.anIntArray263[local683], Static106.anIntArray263[local688], Static106.anIntArray263[local693], this.aShortArray30[arg0]);
				} else {
					Static36.method666(local95, local590, local594, local73, local77, local82, Static106.anIntArray269[0], Static106.anIntArray269[1], Static106.anIntArray269[2], Static106.anIntArray264[local683], Static106.anIntArray264[local688], Static106.anIntArray264[local693], Static106.anIntArray268[local683], Static106.anIntArray268[local688], Static106.anIntArray268[local693], Static106.anIntArray263[local683], Static106.anIntArray263[local688], Static106.anIntArray263[local693], this.aShortArray30[arg0]);
				}
			} else if (this.anIntArray259[arg0] == -1) {
				Static36.method665(local95, local590, local594, local73, local77, local82, Static106.anIntArray272[this.anIntArray257[arg0]]);
			} else {
				Static36.method655(local95, local590, local594, local73, local77, local82, Static106.anIntArray269[0], Static106.anIntArray269[1], Static106.anIntArray269[2]);
			}
		}
		if (local5 != 4) {
			return;
		}
		if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static36.anInt868 || local77 > Static36.anInt868 || local82 > Static36.anInt868 || Static106.anIntArray261[3] < 0 || Static106.anIntArray261[3] > Static36.anInt868) {
			Static36.aBoolean54 = true;
		}
		if (this.aShortArray30 == null || this.aShortArray30[arg0] == -1) {
			if (this.anIntArray259[arg0] == -1) {
				local683 = Static106.anIntArray272[this.anIntArray257[arg0]];
				Static36.method665(local95, local590, local594, local73, local77, local82, local683);
				Static36.method665(local95, local594, Static106.anIntArray271[3], local73, local82, Static106.anIntArray261[3], local683);
				return;
			}
			Static36.method655(local95, local590, local594, local73, local77, local82, Static106.anIntArray269[0], Static106.anIntArray269[1], Static106.anIntArray269[2]);
			Static36.method655(local95, local594, Static106.anIntArray271[3], local73, local82, Static106.anIntArray261[3], Static106.anIntArray269[0], Static106.anIntArray269[2], Static106.anIntArray269[3]);
			return;
		}
		if (this.aByteArray28 == null || this.aByteArray28[arg0] == -1) {
			local683 = local10;
			local688 = local15;
			local693 = local20;
		} else {
			local678 = this.aByteArray28[arg0] & 0xFF;
			local683 = this.anIntArray256[local678];
			local688 = this.anIntArray255[local678];
			local693 = this.anIntArray258[local678];
		}
		@Pc(956) short local956 = this.aShortArray30[arg0];
		if (this.anIntArray259[arg0] == -1) {
			Static36.method666(local95, local590, local594, local73, local77, local82, this.anIntArray257[arg0], this.anIntArray257[arg0], this.anIntArray257[arg0], Static106.anIntArray264[local683], Static106.anIntArray264[local688], Static106.anIntArray264[local693], Static106.anIntArray268[local683], Static106.anIntArray268[local688], Static106.anIntArray268[local693], Static106.anIntArray263[local683], Static106.anIntArray263[local688], Static106.anIntArray263[local693], local956);
			Static36.method666(local95, local594, Static106.anIntArray271[3], local73, local82, Static106.anIntArray261[3], this.anIntArray257[arg0], this.anIntArray257[arg0], this.anIntArray257[arg0], Static106.anIntArray264[local683], Static106.anIntArray264[local688], Static106.anIntArray264[local693], Static106.anIntArray268[local683], Static106.anIntArray268[local688], Static106.anIntArray268[local693], Static106.anIntArray263[local683], Static106.anIntArray263[local688], Static106.anIntArray263[local693], local956);
			return;
		}
		Static36.method666(local95, local590, local594, local73, local77, local82, Static106.anIntArray269[0], Static106.anIntArray269[1], Static106.anIntArray269[2], Static106.anIntArray264[local683], Static106.anIntArray264[local688], Static106.anIntArray264[local693], Static106.anIntArray268[local683], Static106.anIntArray268[local688], Static106.anIntArray268[local693], Static106.anIntArray263[local683], Static106.anIntArray263[local688], Static106.anIntArray263[local693], local956);
		Static36.method666(local95, local594, Static106.anIntArray271[3], local73, local82, Static106.anIntArray261[3], Static106.anIntArray269[0], Static106.anIntArray269[2], Static106.anIntArray269[3], Static106.anIntArray264[local683], Static106.anIntArray264[local688], Static106.anIntArray264[local693], Static106.anIntArray268[local683], Static106.anIntArray268[local688], Static106.anIntArray268[local693], Static106.anIntArray263[local683], Static106.anIntArray263[local688], Static106.anIntArray263[local693], local956);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIIIII)V")
	@Override
	public void method1878(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			this.method1880();
			@Pc(3) int local3 = Static36.anInt871;
			@Pc(5) int local5 = Static36.anInt870;
			@Pc(9) int local9 = Static106.anIntArray276[0];
			@Pc(13) int local13 = Static106.anIntArray270[0];
			@Pc(17) int local17 = Static106.anIntArray276[arg0];
			@Pc(21) int local21 = Static106.anIntArray270[arg0];
			@Pc(25) int local25 = Static106.anIntArray276[arg1];
			@Pc(29) int local29 = Static106.anIntArray270[arg1];
			@Pc(33) int local33 = Static106.anIntArray276[arg2];
			@Pc(37) int local37 = Static106.anIntArray270[arg2];
			@Pc(47) int local47 = arg4 * local33 + arg5 * local37 >> 16;
			for (@Pc(49) int local49 = 0; local49 < super.anInt2426; local49++) {
				@Pc(55) int local55 = super.anIntArray248[local49];
				@Pc(60) int local60 = super.anIntArray247[local49];
				@Pc(65) int local65 = super.anIntArray245[local49];
				@Pc(77) int local77;
				if (arg1 != 0) {
					local77 = local60 * local25 + local55 * local29 >> 16;
					local60 = local60 * local29 - local55 * local25 >> 16;
					local55 = local77;
				}
				if (arg0 != 0) {
					local77 = local65 * local17 + local55 * local21 >> 16;
					local65 = local65 * local21 - local55 * local17 >> 16;
					local55 = local77;
				}
				local55 += arg3;
				local60 += arg4;
				local65 += arg5;
				local77 = local60 * local37 - local65 * local33 >> 16;
				local65 = local60 * local33 + local65 * local37 >> 16;
				Static106.anIntArray267[local49] = local65 - local47;
				Static106.anIntArray275[local49] = local3 + (local55 << 9) / arg6;
				Static106.anIntArray262[local49] = local5 + (local77 << 9) / arg6;
				if (this.anInt2431 > 0) {
					Static106.anIntArray264[local49] = local55;
					Static106.anIntArray268[local49] = local77;
					Static106.anIntArray263[local49] = local65;
				}
			}
			this.method1899(false, false, 0, super.aShort24, super.aShort24 << 1);
		} catch (@Pc(230) RuntimeException local230) {
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(ZLclient!na;[B)Lclient!na;")
	private Class3_Sub1_Sub4_Sub5_Sub1 method1903(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class3_Sub1_Sub4_Sub5_Sub1 arg1, @OriginalArg(2) byte[] arg2) {
		arg1.anInt2426 = super.anInt2426;
		arg1.anInt2428 = super.anInt2428;
		arg1.anInt2431 = this.anInt2431;
		if (arg1.anIntArray248 == null || arg1.anIntArray248.length < super.anInt2426) {
			arg1.anIntArray248 = new int[super.anInt2426 + 100];
			arg1.anIntArray247 = new int[super.anInt2426 + 100];
			arg1.anIntArray245 = new int[super.anInt2426 + 100];
		}
		for (@Pc(43) int local43 = 0; local43 < super.anInt2426; local43++) {
			arg1.anIntArray248[local43] = super.anIntArray248[local43];
			arg1.anIntArray247[local43] = super.anIntArray247[local43];
			arg1.anIntArray245[local43] = super.anIntArray245[local43];
		}
		if (arg0) {
			arg1.aByteArray30 = this.aByteArray30;
		} else {
			arg1.aByteArray30 = arg2;
			@Pc(88) int local88;
			if (this.aByteArray30 == null) {
				for (local88 = 0; local88 < super.anInt2428; local88++) {
					arg1.aByteArray30[local88] = 0;
				}
			} else {
				for (local88 = 0; local88 < super.anInt2428; local88++) {
					arg1.aByteArray30[local88] = this.aByteArray30[local88];
				}
			}
		}
		arg1.anIntArray252 = this.anIntArray252;
		arg1.anIntArray251 = this.anIntArray251;
		arg1.anIntArray254 = this.anIntArray254;
		arg1.anIntArray257 = this.anIntArray257;
		arg1.anIntArray253 = this.anIntArray253;
		arg1.anIntArray259 = this.anIntArray259;
		arg1.aByteArray29 = this.aByteArray29;
		arg1.aByteArray28 = this.aByteArray28;
		arg1.aShortArray30 = this.aShortArray30;
		arg1.aByte6 = this.aByte6;
		arg1.anIntArray256 = this.anIntArray256;
		arg1.anIntArray255 = this.anIntArray255;
		arg1.anIntArray258 = this.anIntArray258;
		arg1.anIntArrayArray26 = super.anIntArrayArray26;
		arg1.anIntArrayArray25 = super.anIntArrayArray25;
		arg1.aBoolean166 = super.aBoolean166;
		arg1.aBoolean167 = false;
		return arg1;
	}
}
