import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public final class Class3_Sub1_Sub5_Sub3_Sub1 extends Class3_Sub1_Sub5_Sub3 {

	@OriginalMember(owner = "client!kc", name = "wb", descriptor = "[I")
	private int[] anIntArray244;

	@OriginalMember(owner = "client!kc", name = "xb", descriptor = "[I")
	private int[] anIntArray245;

	@OriginalMember(owner = "client!kc", name = "yb", descriptor = "[B")
	private byte[] aByteArray14;

	@OriginalMember(owner = "client!kc", name = "zb", descriptor = "[B")
	private byte[] aByteArray15;

	@OriginalMember(owner = "client!kc", name = "Bb", descriptor = "[I")
	private int[] anIntArray246;

	@OriginalMember(owner = "client!kc", name = "Cb", descriptor = "[B")
	private byte[] aByteArray16;

	@OriginalMember(owner = "client!kc", name = "Eb", descriptor = "[I")
	private int[] anIntArray247;

	@OriginalMember(owner = "client!kc", name = "Fb", descriptor = "[I")
	private int[] anIntArray248;

	@OriginalMember(owner = "client!kc", name = "Gb", descriptor = "[S")
	private short[] aShortArray19;

	@OriginalMember(owner = "client!kc", name = "Hb", descriptor = "[I")
	private int[] anIntArray249;

	@OriginalMember(owner = "client!kc", name = "Jb", descriptor = "[I")
	private int[] anIntArray250;

	@OriginalMember(owner = "client!kc", name = "Kb", descriptor = "[I")
	private int[] anIntArray251;

	@OriginalMember(owner = "client!kc", name = "Lb", descriptor = "[I")
	private int[] anIntArray252;

	@OriginalMember(owner = "client!kc", name = "Ib", descriptor = "I")
	private int anInt1939 = 0;

	@OriginalMember(owner = "client!kc", name = "Db", descriptor = "B")
	private byte aByte4 = 0;

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub5_Sub3_Sub1() {
	}

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(Lclient!ob;IIIII)V")
	public Class3_Sub1_Sub5_Sub3_Sub1(@OriginalArg(0) Class3_Sub1_Sub5_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.method1896();
		arg0.method1891();
		super.anInt1935 = arg0.anInt2729;
		super.anIntArray242 = arg0.anIntArray371;
		super.anIntArray243 = arg0.anIntArray369;
		super.anIntArray240 = arg0.anIntArray374;
		super.anInt1937 = arg0.anInt2731;
		this.anIntArray247 = arg0.anIntArray367;
		this.anIntArray244 = arg0.anIntArray368;
		this.anIntArray251 = arg0.anIntArray372;
		this.aByteArray16 = arg0.aByteArray35;
		this.aByteArray14 = arg0.aByteArray28;
		this.aByte4 = arg0.aByte6;
		super.anIntArrayArray21 = arg0.anIntArrayArray31;
		super.anIntArrayArray22 = arg0.anIntArrayArray32;
		@Pc(78) int local78 = (int) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		@Pc(84) int local84 = arg2 * local78 >> 8;
		this.anIntArray248 = new int[super.anInt1937];
		this.anIntArray252 = new int[super.anInt1937];
		this.anIntArray250 = new int[super.anInt1937];
		@Pc(109) int local109;
		if (arg0.aShortArray38 == null) {
			this.aShortArray19 = null;
		} else {
			this.aShortArray19 = new short[super.anInt1937];
			for (local109 = 0; local109 < super.anInt1937; local109++) {
				@Pc(115) short local115 = arg0.aShortArray38[local109];
				if (local115 != -1 && Static65.anInterface1_2.method2651(local115)) {
					this.aShortArray19[local109] = local115;
				} else {
					this.aShortArray19[local109] = -1;
				}
			}
		}
		@Pc(286) int local286;
		if (arg0.anInt2730 > 0 && arg0.aByteArray36 != null) {
			@Pc(153) int[] local153 = new int[arg0.anInt2730];
			for (@Pc(155) int local155 = 0; local155 < super.anInt1937; local155++) {
				if (arg0.aByteArray36[local155] != -1) {
					local153[arg0.aByteArray36[local155] & 0xFF]++;
				}
			}
			this.anInt1939 = 0;
			for (@Pc(184) int local184 = 0; local184 < arg0.anInt2730; local184++) {
				if (local153[local184] > 0 && arg0.aByteArray32[local184] == 0) {
					this.anInt1939++;
				}
			}
			this.anIntArray245 = new int[this.anInt1939];
			this.anIntArray246 = new int[this.anInt1939];
			this.anIntArray249 = new int[this.anInt1939];
			@Pc(222) int local222 = 0;
			for (@Pc(224) int local224 = 0; local224 < arg0.anInt2730; local224++) {
				if (local153[local224] > 0 && arg0.aByteArray32[local224] == 0) {
					this.anIntArray245[local222] = arg0.aShortArray42[local224] & 0xFFFF;
					this.anIntArray246[local222] = arg0.aShortArray39[local224] & 0xFFFF;
					this.anIntArray249[local222] = arg0.aShortArray45[local224] & 0xFFFF;
					local153[local224] = local222++;
				} else {
					local153[local224] = -1;
				}
			}
			this.aByteArray15 = new byte[super.anInt1937];
			for (local286 = 0; local286 < super.anInt1937; local286++) {
				if (arg0.aByteArray36[local286] == -1) {
					this.aByteArray15[local286] = -1;
				} else {
					this.aByteArray15[local286] = (byte) local153[arg0.aByteArray36[local286] & 0xFF];
					if (this.aByteArray15[local286] == -1 && this.aShortArray19 != null) {
						this.aShortArray19[local286] = -1;
					}
				}
			}
		}
		for (local109 = 0; local109 < super.anInt1937; local109++) {
			@Pc(339) byte local339;
			if (arg0.aByteArray30 == null) {
				local339 = 0;
			} else {
				local339 = arg0.aByteArray30[local109];
			}
			@Pc(350) byte local350;
			if (arg0.aByteArray28 == null) {
				local350 = 0;
			} else {
				local350 = arg0.aByteArray28[local109];
			}
			@Pc(361) short local361;
			if (this.aShortArray19 == null) {
				local361 = -1;
			} else {
				local361 = this.aShortArray19[local109];
			}
			if (local350 == -2) {
				local339 = 3;
			}
			if (local350 == -1) {
				local339 = 2;
			}
			@Pc(408) Class14 local408;
			@Pc(569) Class87 local569;
			if (local361 == -1) {
				if (local339 == 0) {
					@Pc(389) int local389 = arg0.aShortArray43[local109] & 0xFFFF;
					if (arg0.aClass14Array1 == null || arg0.aClass14Array1[this.anIntArray247[local109]] == null) {
						local408 = arg0.aClass14Array2[this.anIntArray247[local109]];
					} else {
						local408 = arg0.aClass14Array1[this.anIntArray247[local109]];
					}
					local286 = arg1 + (arg3 * local408.anInt511 + arg4 * local408.anInt515 + arg5 * local408.anInt508) / (local84 * local408.anInt514);
					this.anIntArray248[local109] = Static91.method1386(local389, local286);
					if (arg0.aClass14Array1 == null || arg0.aClass14Array1[this.anIntArray244[local109]] == null) {
						local408 = arg0.aClass14Array2[this.anIntArray244[local109]];
					} else {
						local408 = arg0.aClass14Array1[this.anIntArray244[local109]];
					}
					local286 = arg1 + (arg3 * local408.anInt511 + arg4 * local408.anInt515 + arg5 * local408.anInt508) / (local84 * local408.anInt514);
					this.anIntArray252[local109] = Static91.method1386(local389, local286);
					if (arg0.aClass14Array1 == null || arg0.aClass14Array1[this.anIntArray251[local109]] == null) {
						local408 = arg0.aClass14Array2[this.anIntArray251[local109]];
					} else {
						local408 = arg0.aClass14Array1[this.anIntArray251[local109]];
					}
					local286 = arg1 + (arg3 * local408.anInt511 + arg4 * local408.anInt515 + arg5 * local408.anInt508) / (local84 * local408.anInt514);
					this.anIntArray250[local109] = Static91.method1386(local389, local286);
				} else if (local339 == 1) {
					local569 = arg0.aClass87Array1[local109];
					local286 = arg1 + (arg3 * local569.anInt3958 + arg4 * local569.anInt3957 + arg5 * local569.anInt3960) / (local84 + local84 / 2);
					this.anIntArray248[local109] = Static91.method1386(arg0.aShortArray43[local109] & 0xFFFF, local286);
					this.anIntArray250[local109] = -1;
				} else if (local339 == 3) {
					this.anIntArray248[local109] = 128;
					this.anIntArray250[local109] = -1;
				} else {
					this.anIntArray250[local109] = -2;
				}
			} else if (local339 == 0) {
				if (arg0.aClass14Array1 == null || arg0.aClass14Array1[this.anIntArray247[local109]] == null) {
					local408 = arg0.aClass14Array2[this.anIntArray247[local109]];
				} else {
					local408 = arg0.aClass14Array1[this.anIntArray247[local109]];
				}
				local286 = arg1 + (arg3 * local408.anInt511 + arg4 * local408.anInt515 + arg5 * local408.anInt508) / (local84 * local408.anInt514);
				this.anIntArray248[local109] = Static91.method1395(local286);
				if (arg0.aClass14Array1 == null || arg0.aClass14Array1[this.anIntArray244[local109]] == null) {
					local408 = arg0.aClass14Array2[this.anIntArray244[local109]];
				} else {
					local408 = arg0.aClass14Array1[this.anIntArray244[local109]];
				}
				local286 = arg1 + (arg3 * local408.anInt511 + arg4 * local408.anInt515 + arg5 * local408.anInt508) / (local84 * local408.anInt514);
				this.anIntArray252[local109] = Static91.method1395(local286);
				if (arg0.aClass14Array1 == null || arg0.aClass14Array1[this.anIntArray251[local109]] == null) {
					local408 = arg0.aClass14Array2[this.anIntArray251[local109]];
				} else {
					local408 = arg0.aClass14Array1[this.anIntArray251[local109]];
				}
				local286 = arg1 + (arg3 * local408.anInt511 + arg4 * local408.anInt515 + arg5 * local408.anInt508) / (local84 * local408.anInt514);
				this.anIntArray250[local109] = Static91.method1395(local286);
			} else if (local339 == 1) {
				local569 = arg0.aClass87Array1[local109];
				local286 = arg1 + (arg3 * local569.anInt3958 + arg4 * local569.anInt3957 + arg5 * local569.anInt3960) / (local84 + local84 / 2);
				this.anIntArray248[local109] = Static91.method1395(local286);
				this.anIntArray250[local109] = -1;
			} else {
				this.anIntArray250[local109] = -2;
			}
		}
	}

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "([Lclient!kc;I)V")
	private Class3_Sub1_Sub5_Sub3_Sub1(@OriginalArg(0) Class3_Sub1_Sub5_Sub3_Sub1[] arg0, @OriginalArg(1) int arg1) {
		@Pc(9) boolean local9 = false;
		@Pc(11) boolean local11 = false;
		@Pc(13) boolean local13 = false;
		@Pc(15) boolean local15 = false;
		super.anInt1935 = 0;
		super.anInt1937 = 0;
		this.anInt1939 = 0;
		this.aByte4 = -1;
		for (@Pc(29) int local29 = 0; local29 < arg1; local29++) {
			@Pc(34) Class3_Sub1_Sub5_Sub3_Sub1 local34 = arg0[local29];
			if (local34 != null) {
				super.anInt1935 += local34.anInt1935;
				super.anInt1937 += local34.anInt1937;
				this.anInt1939 += local34.anInt1939;
				if (local34.aByteArray16 == null) {
					if (this.aByte4 == -1) {
						this.aByte4 = local34.aByte4;
					}
					if (this.aByte4 != local34.aByte4) {
						local9 = true;
					}
				} else {
					local9 = true;
				}
				local11 |= local34.aByteArray14 != null;
				local13 |= local34.aShortArray19 != null;
				local15 |= local34.aByteArray15 != null;
			}
		}
		super.anIntArray242 = new int[super.anInt1935];
		super.anIntArray243 = new int[super.anInt1935];
		super.anIntArray240 = new int[super.anInt1935];
		this.anIntArray247 = new int[super.anInt1937];
		this.anIntArray244 = new int[super.anInt1937];
		this.anIntArray251 = new int[super.anInt1937];
		this.anIntArray248 = new int[super.anInt1937];
		this.anIntArray252 = new int[super.anInt1937];
		this.anIntArray250 = new int[super.anInt1937];
		if (local9) {
			this.aByteArray16 = new byte[super.anInt1937];
		}
		if (local11) {
			this.aByteArray14 = new byte[super.anInt1937];
		}
		if (local13) {
			this.aShortArray19 = new short[super.anInt1937];
		}
		if (local15) {
			this.aByteArray15 = new byte[super.anInt1937];
		}
		if (this.anInt1939 > 0) {
			this.anIntArray245 = new int[this.anInt1939];
			this.anIntArray246 = new int[this.anInt1939];
			this.anIntArray249 = new int[this.anInt1939];
		}
		super.anInt1935 = 0;
		super.anInt1937 = 0;
		this.anInt1939 = 0;
		for (@Pc(211) int local211 = 0; local211 < arg1; local211++) {
			@Pc(216) Class3_Sub1_Sub5_Sub3_Sub1 local216 = arg0[local211];
			if (local216 != null) {
				for (@Pc(220) int local220 = 0; local220 < local216.anInt1937; local220++) {
					this.anIntArray247[super.anInt1937] = local216.anIntArray247[local220] + super.anInt1935;
					this.anIntArray244[super.anInt1937] = local216.anIntArray244[local220] + super.anInt1935;
					this.anIntArray251[super.anInt1937] = local216.anIntArray251[local220] + super.anInt1935;
					this.anIntArray248[super.anInt1937] = local216.anIntArray248[local220];
					this.anIntArray252[super.anInt1937] = local216.anIntArray252[local220];
					this.anIntArray250[super.anInt1937] = local216.anIntArray250[local220];
					if (local9) {
						if (local216.aByteArray16 == null) {
							this.aByteArray16[super.anInt1937] = local216.aByte4;
						} else {
							this.aByteArray16[super.anInt1937] = local216.aByteArray16[local220];
						}
					}
					if (local11 && local216.aByteArray14 != null) {
						this.aByteArray14[super.anInt1937] = local216.aByteArray14[local220];
					}
					if (local13) {
						if (local216.aShortArray19 == null) {
							this.aShortArray19[super.anInt1937] = -1;
						} else {
							this.aShortArray19[super.anInt1937] = local216.aShortArray19[local220];
						}
					}
					if (local15) {
						if (local216.aByteArray15 == null || local216.aByteArray15[local220] == -1) {
							this.aByteArray15[super.anInt1937] = -1;
						} else {
							this.aByteArray15[super.anInt1937] = (byte) (local216.aByteArray15[local220] + this.anInt1939);
						}
					}
					super.anInt1937++;
				}
				for (@Pc(385) int local385 = 0; local385 < local216.anInt1939; local385++) {
					this.anIntArray245[this.anInt1939] = local216.anIntArray245[local385] + super.anInt1935;
					this.anIntArray246[this.anInt1939] = local216.anIntArray246[local385] + super.anInt1935;
					this.anIntArray249[this.anInt1939] = local216.anIntArray249[local385] + super.anInt1935;
					this.anInt1939++;
				}
				for (@Pc(435) int local435 = 0; local435 < local216.anInt1935; local435++) {
					super.anIntArray242[super.anInt1935] = local216.anIntArray242[local435];
					super.anIntArray243[super.anInt1935] = local216.anIntArray243[local435];
					super.anIntArray240[super.anInt1935] = local216.anIntArray240[local435];
					super.anInt1935++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(I[IIII)V")
	private void method1388(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(31) int local31;
		@Pc(36) int local36;
		if (arg0 == 0) {
			local6 = 0;
			Static91.anInt1941 = 0;
			Static91.anInt1942 = 0;
			Static91.anInt1940 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				@Pc(19) int local19 = arg1[local14];
				if (local19 < super.anIntArrayArray21.length) {
					@Pc(29) int[] local29 = super.anIntArrayArray21[local19];
					for (local31 = 0; local31 < local29.length; local31++) {
						local36 = local29[local31];
						Static91.anInt1941 += super.anIntArray242[local36];
						Static91.anInt1942 += super.anIntArray243[local36];
						Static91.anInt1940 += super.anIntArray240[local36];
						local6++;
					}
				}
			}
			if (local6 > 0) {
				Static91.anInt1941 = Static91.anInt1941 / local6 + arg2;
				Static91.anInt1942 = Static91.anInt1942 / local6 + arg3;
				Static91.anInt1940 = Static91.anInt1940 / local6 + arg4;
			} else {
				Static91.anInt1941 = arg2;
				Static91.anInt1942 = arg3;
				Static91.anInt1940 = arg4;
			}
			return;
		}
		@Pc(115) int[] local115;
		@Pc(117) int local117;
		if (arg0 == 1) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < super.anIntArrayArray21.length) {
					local115 = super.anIntArrayArray21[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						super.anIntArray242[local31] += arg2;
						super.anIntArray243[local31] += arg3;
						super.anIntArray240[local31] += arg4;
					}
				}
			}
		} else if (arg0 == 2) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < super.anIntArrayArray21.length) {
					local115 = super.anIntArrayArray21[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						super.anIntArray242[local31] -= Static91.anInt1941;
						super.anIntArray243[local31] -= Static91.anInt1942;
						super.anIntArray240[local31] -= Static91.anInt1940;
						@Pc(217) int local217;
						@Pc(235) int local235;
						if (arg4 != 0) {
							local36 = Static91.anIntArray270[arg4];
							local217 = Static91.anIntArray253[arg4];
							local235 = super.anIntArray243[local31] * local36 + super.anIntArray242[local31] * local217 + 32767 >> 16;
							super.anIntArray243[local31] = super.anIntArray243[local31] * local217 + 32767 - super.anIntArray242[local31] * local36 >> 16;
							super.anIntArray242[local31] = local235;
						}
						if (arg2 != 0) {
							local36 = Static91.anIntArray270[arg2];
							local217 = Static91.anIntArray253[arg2];
							local235 = super.anIntArray243[local31] * local217 + 32767 - super.anIntArray240[local31] * local36 >> 16;
							super.anIntArray240[local31] = super.anIntArray243[local31] * local36 + super.anIntArray240[local31] * local217 + 32767 >> 16;
							super.anIntArray243[local31] = local235;
						}
						if (arg3 != 0) {
							local36 = Static91.anIntArray270[arg3];
							local217 = Static91.anIntArray253[arg3];
							local235 = super.anIntArray240[local31] * local36 + super.anIntArray242[local31] * local217 + 32767 >> 16;
							super.anIntArray240[local31] = super.anIntArray240[local31] * local217 + 32767 - super.anIntArray242[local31] * local36 >> 16;
							super.anIntArray242[local31] = local235;
						}
						super.anIntArray242[local31] += Static91.anInt1941;
						super.anIntArray243[local31] += Static91.anInt1942;
						super.anIntArray240[local31] += Static91.anInt1940;
					}
				}
			}
		} else if (arg0 == 3) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < super.anIntArrayArray21.length) {
					local115 = super.anIntArrayArray21[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						super.anIntArray242[local31] -= Static91.anInt1941;
						super.anIntArray243[local31] -= Static91.anInt1942;
						super.anIntArray240[local31] -= Static91.anInt1940;
						super.anIntArray242[local31] = super.anIntArray242[local31] * arg2 / 128;
						super.anIntArray243[local31] = super.anIntArray243[local31] * arg3 / 128;
						super.anIntArray240[local31] = super.anIntArray240[local31] * arg4 / 128;
						super.anIntArray242[local31] += Static91.anInt1941;
						super.anIntArray243[local31] += Static91.anInt1942;
						super.anIntArray240[local31] += Static91.anInt1940;
					}
				}
			}
		} else if (arg0 == 5 && (super.anIntArrayArray22 != null && this.aByteArray14 != null)) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < super.anIntArrayArray22.length) {
					local115 = super.anIntArrayArray22[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						local36 = (this.aByteArray14[local31] & 0xFF) + arg2 * 8;
						if (local36 < 0) {
							local36 = 0;
						} else if (local36 > 255) {
							local36 = 255;
						}
						this.aByteArray14[local31] = (byte) local36;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(Z)Lclient!vf;")
	@Override
	public Class3_Sub1_Sub5_Sub3 method1375(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static91.aByteArray18.length < super.anInt1937) {
			Static91.aByteArray18 = new byte[super.anInt1937 + 100];
		}
		return this.method1389(arg0, Static91.aClass3_Sub1_Sub5_Sub3_Sub1_2, Static91.aByteArray18);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ZLclient!kc;[B)Lclient!kc;")
	private Class3_Sub1_Sub5_Sub3_Sub1 method1389(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class3_Sub1_Sub5_Sub3_Sub1 arg1, @OriginalArg(2) byte[] arg2) {
		arg1.anInt1935 = super.anInt1935;
		arg1.anInt1937 = super.anInt1937;
		arg1.anInt1939 = this.anInt1939;
		if (arg1.anIntArray242 == null || arg1.anIntArray242.length < super.anInt1935) {
			arg1.anIntArray242 = new int[super.anInt1935 + 100];
			arg1.anIntArray243 = new int[super.anInt1935 + 100];
			arg1.anIntArray240 = new int[super.anInt1935 + 100];
		}
		for (@Pc(43) int local43 = 0; local43 < super.anInt1935; local43++) {
			arg1.anIntArray242[local43] = super.anIntArray242[local43];
			arg1.anIntArray243[local43] = super.anIntArray243[local43];
			arg1.anIntArray240[local43] = super.anIntArray240[local43];
		}
		if (arg0) {
			arg1.aByteArray14 = this.aByteArray14;
		} else {
			arg1.aByteArray14 = arg2;
			@Pc(88) int local88;
			if (this.aByteArray14 == null) {
				for (local88 = 0; local88 < super.anInt1937; local88++) {
					arg1.aByteArray14[local88] = 0;
				}
			} else {
				for (local88 = 0; local88 < super.anInt1937; local88++) {
					arg1.aByteArray14[local88] = this.aByteArray14[local88];
				}
			}
		}
		arg1.anIntArray247 = this.anIntArray247;
		arg1.anIntArray244 = this.anIntArray244;
		arg1.anIntArray251 = this.anIntArray251;
		arg1.anIntArray248 = this.anIntArray248;
		arg1.anIntArray252 = this.anIntArray252;
		arg1.anIntArray250 = this.anIntArray250;
		arg1.aByteArray16 = this.aByteArray16;
		arg1.aByteArray15 = this.aByteArray15;
		arg1.aShortArray19 = this.aShortArray19;
		arg1.aByte4 = this.aByte4;
		arg1.anIntArray245 = this.anIntArray245;
		arg1.anIntArray246 = this.anIntArray246;
		arg1.anIntArray249 = this.anIntArray249;
		arg1.anIntArrayArray21 = super.anIntArrayArray21;
		arg1.anIntArrayArray22 = super.anIntArrayArray22;
		arg1.aBoolean75 = super.aBoolean75;
		arg1.aBoolean76 = false;
		return arg1;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIIIIII)V")
	@Override
	public void method1372(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			this.method1385();
			@Pc(3) int local3 = Static65.anInt1422;
			@Pc(5) int local5 = Static65.anInt1416;
			@Pc(9) int local9 = Static91.anIntArray270[0];
			@Pc(13) int local13 = Static91.anIntArray253[0];
			@Pc(17) int local17 = Static91.anIntArray270[arg0];
			@Pc(21) int local21 = Static91.anIntArray253[arg0];
			@Pc(25) int local25 = Static91.anIntArray270[arg1];
			@Pc(29) int local29 = Static91.anIntArray253[arg1];
			@Pc(33) int local33 = Static91.anIntArray270[arg2];
			@Pc(37) int local37 = Static91.anIntArray253[arg2];
			@Pc(47) int local47 = arg4 * local33 + arg5 * local37 >> 16;
			for (@Pc(49) int local49 = 0; local49 < super.anInt1935; local49++) {
				@Pc(55) int local55 = super.anIntArray242[local49];
				@Pc(60) int local60 = super.anIntArray243[local49];
				@Pc(65) int local65 = super.anIntArray240[local49];
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
				Static91.anIntArray259[local49] = local65 - local47;
				Static91.anIntArray263[local49] = local3 + (local55 << 9) / arg6;
				Static91.anIntArray258[local49] = local5 + (local77 << 9) / arg6;
				if (this.anInt1939 > 0) {
					Static91.anIntArray256[local49] = local55;
					Static91.anIntArray261[local49] = local77;
					Static91.anIntArray265[local49] = local65;
				}
			}
			this.method1393(false, false, 0L, super.aShort20, super.aShort20 << 1);
		} catch (@Pc(230) RuntimeException local230) {
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!vf;)Lclient!vf;")
	public Class3_Sub1_Sub5_Sub3 method1390(@OriginalArg(0) Class3_Sub1_Sub5_Sub3 arg0) {
		return new Class3_Sub1_Sub5_Sub3_Sub1(new Class3_Sub1_Sub5_Sub3_Sub1[] { this, (Class3_Sub1_Sub5_Sub3_Sub1) arg0 }, 2);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!e;I)V")
	@Override
	public void method1383(@OriginalArg(0) Class3_Sub1_Sub6 arg0, @OriginalArg(1) int arg1) {
		if (super.anIntArrayArray21 == null || arg1 == -1) {
			return;
		}
		@Pc(12) Class65 local12 = arg0.aClass65Array1[arg1];
		@Pc(15) Class3_Sub14 local15 = local12.aClass3_Sub14_1;
		Static91.anInt1941 = 0;
		Static91.anInt1942 = 0;
		Static91.anInt1940 = 0;
		for (@Pc(23) int local23 = 0; local23 < local12.anInt2669; local23++) {
			@Pc(29) short local29 = local12.aShortArray34[local23];
			if (local12.aShortArray29[local23] != -1) {
				this.method1388(0, local15.anIntArrayArray26[local12.aShortArray29[local23]], 0, 0, 0);
			}
			this.method1388(local15.anIntArray275[local29], local15.anIntArrayArray26[local29], local12.aShortArray28[local23], local12.aShortArray31[local23], local12.aShortArray37[local23]);
		}
		super.aBoolean76 = false;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Z)Lclient!vf;")
	@Override
	public Class3_Sub1_Sub5_Sub3 method1371(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static91.aByteArray17.length < super.anInt1937) {
			Static91.aByteArray17 = new byte[super.anInt1937 + 100];
		}
		return this.method1389(arg0, Static91.aClass3_Sub1_Sub5_Sub3_Sub1_1, Static91.aByteArray17);
	}

	@OriginalMember(owner = "client!kc", name = "h", descriptor = "(I)V")
	private void method1391(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static65.anInt1422;
		@Pc(3) int local3 = Static65.anInt1416;
		@Pc(5) int local5 = 0;
		@Pc(10) int local10 = this.anIntArray247[arg0];
		@Pc(15) int local15 = this.anIntArray244[arg0];
		@Pc(20) int local20 = this.anIntArray251[arg0];
		@Pc(24) int local24 = Static91.anIntArray265[local10];
		@Pc(28) int local28 = Static91.anIntArray265[local15];
		@Pc(32) int local32 = Static91.anIntArray265[local20];
		if (this.aByteArray14 == null) {
			Static65.anInt1420 = 0;
		} else {
			Static65.anInt1420 = this.aByteArray14[arg0] & 0xFF;
		}
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(82) int local82;
		@Pc(95) int local95;
		if (local24 >= 50) {
			Static91.anIntArray269[0] = Static91.anIntArray263[local10];
			Static91.anIntArray260[0] = Static91.anIntArray258[local10];
			local5++;
			Static91.anIntArray257[0] = this.anIntArray248[arg0];
		} else {
			local73 = Static91.anIntArray256[local10];
			local77 = Static91.anIntArray261[local10];
			local82 = this.anIntArray248[arg0];
			if (local32 >= 50) {
				local95 = (50 - local24) * Static91.anIntArray255[local32 - local24];
				Static91.anIntArray269[0] = local1 + (local73 + ((Static91.anIntArray256[local20] - local73) * local95 >> 16) << 9) / 50;
				Static91.anIntArray260[0] = local3 + (local77 + ((Static91.anIntArray261[local20] - local77) * local95 >> 16) << 9) / 50;
				local5++;
				Static91.anIntArray257[0] = local82 + ((this.anIntArray250[arg0] - local82) * local95 >> 16);
			}
			if (local28 >= 50) {
				local95 = (50 - local24) * Static91.anIntArray255[local28 - local24];
				Static91.anIntArray269[local5] = local1 + (local73 + ((Static91.anIntArray256[local15] - local73) * local95 >> 16) << 9) / 50;
				Static91.anIntArray260[local5] = local3 + (local77 + ((Static91.anIntArray261[local15] - local77) * local95 >> 16) << 9) / 50;
				Static91.anIntArray257[local5++] = local82 + ((this.anIntArray252[arg0] - local82) * local95 >> 16);
			}
		}
		if (local28 >= 50) {
			Static91.anIntArray269[local5] = Static91.anIntArray263[local15];
			Static91.anIntArray260[local5] = Static91.anIntArray258[local15];
			Static91.anIntArray257[local5++] = this.anIntArray252[arg0];
		} else {
			local73 = Static91.anIntArray256[local15];
			local77 = Static91.anIntArray261[local15];
			local82 = this.anIntArray252[arg0];
			if (local24 >= 50) {
				local95 = (50 - local28) * Static91.anIntArray255[local24 - local28];
				Static91.anIntArray269[local5] = local1 + (local73 + ((Static91.anIntArray256[local10] - local73) * local95 >> 16) << 9) / 50;
				Static91.anIntArray260[local5] = local3 + (local77 + ((Static91.anIntArray261[local10] - local77) * local95 >> 16) << 9) / 50;
				Static91.anIntArray257[local5++] = local82 + ((this.anIntArray248[arg0] - local82) * local95 >> 16);
			}
			if (local32 >= 50) {
				local95 = (50 - local28) * Static91.anIntArray255[local32 - local28];
				Static91.anIntArray269[local5] = local1 + (local73 + ((Static91.anIntArray256[local20] - local73) * local95 >> 16) << 9) / 50;
				Static91.anIntArray260[local5] = local3 + (local77 + ((Static91.anIntArray261[local20] - local77) * local95 >> 16) << 9) / 50;
				Static91.anIntArray257[local5++] = local82 + ((this.anIntArray250[arg0] - local82) * local95 >> 16);
			}
		}
		if (local32 >= 50) {
			Static91.anIntArray269[local5] = Static91.anIntArray263[local20];
			Static91.anIntArray260[local5] = Static91.anIntArray258[local20];
			Static91.anIntArray257[local5++] = this.anIntArray250[arg0];
		} else {
			local73 = Static91.anIntArray256[local20];
			local77 = Static91.anIntArray261[local20];
			local82 = this.anIntArray250[arg0];
			if (local28 >= 50) {
				local95 = (50 - local32) * Static91.anIntArray255[local28 - local32];
				Static91.anIntArray269[local5] = local1 + (local73 + ((Static91.anIntArray256[local15] - local73) * local95 >> 16) << 9) / 50;
				Static91.anIntArray260[local5] = local3 + (local77 + ((Static91.anIntArray261[local15] - local77) * local95 >> 16) << 9) / 50;
				Static91.anIntArray257[local5++] = local82 + ((this.anIntArray252[arg0] - local82) * local95 >> 16);
			}
			if (local24 >= 50) {
				local95 = (50 - local32) * Static91.anIntArray255[local24 - local32];
				Static91.anIntArray269[local5] = local1 + (local73 + ((Static91.anIntArray256[local10] - local73) * local95 >> 16) << 9) / 50;
				Static91.anIntArray260[local5] = local3 + (local77 + ((Static91.anIntArray261[local10] - local77) * local95 >> 16) << 9) / 50;
				Static91.anIntArray257[local5++] = local82 + ((this.anIntArray248[arg0] - local82) * local95 >> 16);
			}
		}
		local73 = Static91.anIntArray269[0];
		local77 = Static91.anIntArray269[1];
		local82 = Static91.anIntArray269[2];
		local95 = Static91.anIntArray260[0];
		@Pc(590) int local590 = Static91.anIntArray260[1];
		@Pc(594) int local594 = Static91.anIntArray260[2];
		Static65.aBoolean59 = false;
		@Pc(683) int local683;
		@Pc(688) int local688;
		@Pc(693) int local693;
		@Pc(678) int local678;
		if (local5 == 3) {
			if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static65.anInt1417 || local77 > Static65.anInt1417 || local82 > Static65.anInt1417) {
				Static65.aBoolean59 = true;
			}
			if (this.aShortArray19 != null && this.aShortArray19[arg0] != -1) {
				if (this.aByteArray15 == null || this.aByteArray15[arg0] == -1) {
					local683 = local10;
					local688 = local15;
					local693 = local20;
				} else {
					local678 = this.aByteArray15[arg0] & 0xFF;
					local683 = this.anIntArray245[local678];
					local688 = this.anIntArray246[local678];
					local693 = this.anIntArray249[local678];
				}
				if (this.anIntArray250[arg0] == -1) {
					Static65.method961(local95, local590, local594, local73, local77, local82, this.anIntArray248[arg0], this.anIntArray248[arg0], this.anIntArray248[arg0], Static91.anIntArray256[local683], Static91.anIntArray256[local688], Static91.anIntArray256[local693], Static91.anIntArray261[local683], Static91.anIntArray261[local688], Static91.anIntArray261[local693], Static91.anIntArray265[local683], Static91.anIntArray265[local688], Static91.anIntArray265[local693], this.aShortArray19[arg0]);
				} else {
					Static65.method961(local95, local590, local594, local73, local77, local82, Static91.anIntArray257[0], Static91.anIntArray257[1], Static91.anIntArray257[2], Static91.anIntArray256[local683], Static91.anIntArray256[local688], Static91.anIntArray256[local693], Static91.anIntArray261[local683], Static91.anIntArray261[local688], Static91.anIntArray261[local693], Static91.anIntArray265[local683], Static91.anIntArray265[local688], Static91.anIntArray265[local693], this.aShortArray19[arg0]);
				}
			} else if (this.anIntArray250[arg0] == -1) {
				Static65.method971(local95, local590, local594, local73, local77, local82, Static91.anIntArray268[this.anIntArray248[arg0]]);
			} else {
				Static65.method955(local95, local590, local594, local73, local77, local82, Static91.anIntArray257[0], Static91.anIntArray257[1], Static91.anIntArray257[2]);
			}
		}
		if (local5 != 4) {
			return;
		}
		if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static65.anInt1417 || local77 > Static65.anInt1417 || local82 > Static65.anInt1417 || Static91.anIntArray269[3] < 0 || Static91.anIntArray269[3] > Static65.anInt1417) {
			Static65.aBoolean59 = true;
		}
		if (this.aShortArray19 == null || this.aShortArray19[arg0] == -1) {
			if (this.anIntArray250[arg0] == -1) {
				local683 = Static91.anIntArray268[this.anIntArray248[arg0]];
				Static65.method971(local95, local590, local594, local73, local77, local82, local683);
				Static65.method971(local95, local594, Static91.anIntArray260[3], local73, local82, Static91.anIntArray269[3], local683);
				return;
			}
			Static65.method955(local95, local590, local594, local73, local77, local82, Static91.anIntArray257[0], Static91.anIntArray257[1], Static91.anIntArray257[2]);
			Static65.method955(local95, local594, Static91.anIntArray260[3], local73, local82, Static91.anIntArray269[3], Static91.anIntArray257[0], Static91.anIntArray257[2], Static91.anIntArray257[3]);
			return;
		}
		if (this.aByteArray15 == null || this.aByteArray15[arg0] == -1) {
			local683 = local10;
			local688 = local15;
			local693 = local20;
		} else {
			local678 = this.aByteArray15[arg0] & 0xFF;
			local683 = this.anIntArray245[local678];
			local688 = this.anIntArray246[local678];
			local693 = this.anIntArray249[local678];
		}
		@Pc(956) short local956 = this.aShortArray19[arg0];
		if (this.anIntArray250[arg0] == -1) {
			Static65.method961(local95, local590, local594, local73, local77, local82, this.anIntArray248[arg0], this.anIntArray248[arg0], this.anIntArray248[arg0], Static91.anIntArray256[local683], Static91.anIntArray256[local688], Static91.anIntArray256[local693], Static91.anIntArray261[local683], Static91.anIntArray261[local688], Static91.anIntArray261[local693], Static91.anIntArray265[local683], Static91.anIntArray265[local688], Static91.anIntArray265[local693], local956);
			Static65.method961(local95, local594, Static91.anIntArray260[3], local73, local82, Static91.anIntArray269[3], this.anIntArray248[arg0], this.anIntArray248[arg0], this.anIntArray248[arg0], Static91.anIntArray256[local683], Static91.anIntArray256[local688], Static91.anIntArray256[local693], Static91.anIntArray261[local683], Static91.anIntArray261[local688], Static91.anIntArray261[local693], Static91.anIntArray265[local683], Static91.anIntArray265[local688], Static91.anIntArray265[local693], local956);
			return;
		}
		Static65.method961(local95, local590, local594, local73, local77, local82, Static91.anIntArray257[0], Static91.anIntArray257[1], Static91.anIntArray257[2], Static91.anIntArray256[local683], Static91.anIntArray256[local688], Static91.anIntArray256[local693], Static91.anIntArray261[local683], Static91.anIntArray261[local688], Static91.anIntArray261[local693], Static91.anIntArray265[local683], Static91.anIntArray265[local688], Static91.anIntArray265[local693], local956);
		Static65.method961(local95, local594, Static91.anIntArray260[3], local73, local82, Static91.anIntArray269[3], Static91.anIntArray257[0], Static91.anIntArray257[2], Static91.anIntArray257[3], Static91.anIntArray256[local683], Static91.anIntArray256[local688], Static91.anIntArray256[local693], Static91.anIntArray261[local683], Static91.anIntArray261[local688], Static91.anIntArray261[local693], Static91.anIntArray265[local683], Static91.anIntArray265[local688], Static91.anIntArray265[local693], local956);
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(IIIIIIII)Z")
	private boolean method1392(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method1382(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			this.method1385();
			@Pc(3) int local3 = Static65.anInt1422;
			@Pc(5) int local5 = Static65.anInt1416;
			@Pc(9) int local9 = Static91.anIntArray270[0];
			@Pc(13) int local13 = Static91.anIntArray253[0];
			@Pc(17) int local17 = Static91.anIntArray270[arg0];
			@Pc(21) int local21 = Static91.anIntArray253[arg0];
			@Pc(25) int local25 = Static91.anIntArray270[arg1];
			@Pc(29) int local29 = Static91.anIntArray253[arg1];
			@Pc(33) int local33 = Static91.anIntArray270[arg2];
			@Pc(37) int local37 = Static91.anIntArray253[arg2];
			@Pc(47) int local47 = arg4 * local33 + arg5 * local37 >> 16;
			for (@Pc(49) int local49 = 0; local49 < super.anInt1935; local49++) {
				@Pc(55) int local55 = super.anIntArray242[local49];
				@Pc(60) int local60 = super.anIntArray243[local49];
				@Pc(65) int local65 = super.anIntArray240[local49];
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
				Static91.anIntArray259[local49] = local65 - local47;
				Static91.anIntArray263[local49] = local3 + (local55 << 9) / local65;
				Static91.anIntArray258[local49] = local5 + (local77 << 9) / local65;
				if (this.anInt1939 > 0) {
					Static91.anIntArray256[local49] = local55;
					Static91.anIntArray261[local49] = local77;
					Static91.anIntArray265[local49] = local65;
				}
			}
			this.method1393(false, false, 0L, super.aShort20, super.aShort20 << 1);
		} catch (@Pc(230) RuntimeException local230) {
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "([[IIIIZI)Lclient!vf;")
	@Override
	public Class3_Sub1_Sub5_Sub3 method1379(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method1385();
		@Pc(6) int local6 = arg1 + super.aShort19;
		@Pc(11) int local11 = arg1 + super.aShort17;
		@Pc(16) int local16 = arg3 + super.aShort16;
		@Pc(21) int local21 = arg3 + super.aShort21;
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
		@Pc(101) Class3_Sub1_Sub5_Sub3_Sub1 local101;
		if (arg4) {
			local101 = new Class3_Sub1_Sub5_Sub3_Sub1();
			local101.anInt1935 = super.anInt1935;
			local101.anInt1937 = super.anInt1937;
			local101.anInt1939 = this.anInt1939;
			local101.anIntArray242 = super.anIntArray242;
			local101.anIntArray240 = super.anIntArray240;
			local101.anIntArray247 = this.anIntArray247;
			local101.anIntArray244 = this.anIntArray244;
			local101.anIntArray251 = this.anIntArray251;
			local101.anIntArray248 = this.anIntArray248;
			local101.anIntArray252 = this.anIntArray252;
			local101.anIntArray250 = this.anIntArray250;
			local101.aByteArray16 = this.aByteArray16;
			local101.aByteArray14 = this.aByteArray14;
			local101.aByteArray15 = this.aByteArray15;
			local101.aShortArray19 = this.aShortArray19;
			local101.aByte4 = this.aByte4;
			local101.anIntArray245 = this.anIntArray245;
			local101.anIntArray246 = this.anIntArray246;
			local101.anIntArray249 = this.anIntArray249;
			local101.anIntArrayArray21 = super.anIntArrayArray21;
			local101.anIntArrayArray22 = super.anIntArrayArray22;
			local101.aBoolean75 = super.aBoolean75;
			local101.anIntArray243 = new int[local101.anInt1935];
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
			for (local201 = 0; local201 < local101.anInt1935; local201++) {
				local209 = super.anIntArray242[local201] + arg1;
				local216 = super.anIntArray240[local201] + arg3;
				local220 = local209 & 0x7F;
				local224 = local216 & 0x7F;
				local228 = local209 >> 7;
				local232 = local216 >> 7;
				local254 = arg0[local228][local232] * (128 - local220) + arg0[local228 + 1][local232] * local220 >> 7;
				local280 = arg0[local228][local232 + 1] * (128 - local220) + arg0[local228 + 1][local232 + 1] * local220 >> 7;
				local292 = local254 * (128 - local224) + local280 * local224 >> 7;
				local101.anIntArray243[local201] = super.anIntArray243[local201] + local292 - arg2;
			}
		} else {
			for (local201 = 0; local201 < local101.anInt1935; local201++) {
				local209 = (super.anIntArray243[local201] << 16) / super.aShort34;
				if (local209 < arg5) {
					local216 = super.anIntArray242[local201] + arg1;
					local220 = super.anIntArray240[local201] + arg3;
					local224 = local216 & 0x7F;
					local228 = local220 & 0x7F;
					local232 = local216 >> 7;
					local254 = local220 >> 7;
					local280 = arg0[local232][local254] * (128 - local224) + arg0[local232 + 1][local254] * local224 >> 7;
					local292 = arg0[local232][local254 + 1] * (128 - local224) + arg0[local232 + 1][local254 + 1] * local224 >> 7;
					@Pc(416) int local416 = local280 * (128 - local228) + local292 * local228 >> 7;
					local101.anIntArray243[local201] = super.anIntArray243[local201] + (local416 - arg2) * (arg5 - local209) / arg5;
				} else {
					local101.anIntArray243[local201] = super.anIntArray243[local201];
				}
			}
		}
		super.aBoolean76 = false;
		return local101;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ZZJII)V")
	private void method1393(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg4 >= 1600) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < arg4; local5++) {
			Static91.anIntArray264[local5] = 0;
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
		for (@Pc(16) int local16 = 0; local16 < super.anInt1937; local16++) {
			if (this.anIntArray250[local16] != -2) {
				local28 = this.anIntArray247[local16];
				local33 = this.anIntArray244[local16];
				local38 = this.anIntArray251[local16];
				local42 = Static91.anIntArray263[local28];
				local46 = Static91.anIntArray263[local33];
				local50 = Static91.anIntArray263[local38];
				if (arg0 && (local42 == -5000 || local46 == -5000 || local50 == -5000)) {
					local65 = Static91.anIntArray256[local28];
					local69 = Static91.anIntArray256[local33];
					@Pc(73) int local73 = Static91.anIntArray256[local38];
					@Pc(77) int local77 = Static91.anIntArray261[local28];
					local81 = Static91.anIntArray261[local33];
					local85 = Static91.anIntArray261[local38];
					@Pc(89) int local89 = Static91.anIntArray265[local28];
					local93 = Static91.anIntArray265[local33];
					@Pc(97) int local97 = Static91.anIntArray265[local38];
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
						Static91.aBooleanArray11[local16] = true;
						@Pc(177) int local177 = (Static91.anIntArray259[local28] + Static91.anIntArray259[local33] + Static91.anIntArray259[local38]) / 3 + arg3;
						Static91.anIntArrayArray23[local177][Static91.anIntArray264[local177]++] = local16;
					}
				} else {
					if (arg1 && this.method1392(Static189.anInt1938, Static189.anInt1934, Static91.anIntArray258[local28], Static91.anIntArray258[local33], Static91.anIntArray258[local38], local42, local46, local50)) {
						Static189.aLongArray7[Static189.anInt1936++] = arg2;
						arg1 = false;
					}
					if ((local42 - local46) * (Static91.anIntArray258[local38] - Static91.anIntArray258[local33]) - (Static91.anIntArray258[local28] - Static91.anIntArray258[local33]) * (local50 - local46) > 0) {
						Static91.aBooleanArray11[local16] = false;
						if (local42 >= 0 && local46 >= 0 && local50 >= 0 && local42 <= Static65.anInt1417 && local46 <= Static65.anInt1417 && local50 <= Static65.anInt1417) {
							Static91.aBooleanArray10[local16] = false;
						} else {
							Static91.aBooleanArray10[local16] = true;
						}
						local65 = (Static91.anIntArray259[local28] + Static91.anIntArray259[local33] + Static91.anIntArray259[local38]) / 3 + arg3;
						Static91.anIntArrayArray23[local65][Static91.anIntArray264[local65]++] = local16;
					}
				}
			}
		}
		if (this.aByteArray16 == null) {
			for (local28 = arg4 - 1; local28 >= 0; local28--) {
				local33 = Static91.anIntArray264[local28];
				if (local33 > 0) {
					@Pc(324) int[] local324 = Static91.anIntArrayArray23[local28];
					for (local42 = 0; local42 < local33; local42++) {
						this.method1394(local324[local42]);
					}
				}
			}
			return;
		}
		for (local28 = 0; local28 < 12; local28++) {
			Static91.anIntArray254[local28] = 0;
			Static91.anIntArray262[local28] = 0;
		}
		for (local33 = arg4 - 1; local33 >= 0; local33--) {
			local38 = Static91.anIntArray264[local33];
			if (local38 > 0) {
				@Pc(370) int[] local370 = Static91.anIntArrayArray23[local33];
				for (local46 = 0; local46 < local38; local46++) {
					local50 = local370[local46];
					@Pc(382) byte local382 = this.aByteArray16[local50];
					local69 = Static91.anIntArray254[local382]++;
					Static91.anIntArrayArray24[local382][local69] = local50;
					if (local382 < 10) {
						Static91.anIntArray262[local382] += local33;
					} else if (local382 == 10) {
						Static91.anIntArray266[local69] = local33;
					} else {
						Static91.anIntArray267[local69] = local33;
					}
				}
			}
		}
		local38 = 0;
		if (Static91.anIntArray254[1] > 0 || Static91.anIntArray254[2] > 0) {
			local38 = (Static91.anIntArray262[1] + Static91.anIntArray262[2]) / (Static91.anIntArray254[1] + Static91.anIntArray254[2]);
		}
		local42 = 0;
		if (Static91.anIntArray254[3] > 0 || Static91.anIntArray254[4] > 0) {
			local42 = (Static91.anIntArray262[3] + Static91.anIntArray262[4]) / (Static91.anIntArray254[3] + Static91.anIntArray254[4]);
		}
		local46 = 0;
		if (Static91.anIntArray254[6] > 0 || Static91.anIntArray254[8] > 0) {
			local46 = (Static91.anIntArray262[6] + Static91.anIntArray262[8]) / (Static91.anIntArray254[6] + Static91.anIntArray254[8]);
		}
		local65 = 0;
		local69 = Static91.anIntArray254[10];
		@Pc(515) int[] local515 = Static91.anIntArrayArray24[10];
		@Pc(517) int[] local517 = Static91.anIntArray266;
		if (local69 == 0) {
			local65 = 0;
			local69 = Static91.anIntArray254[11];
			local515 = Static91.anIntArrayArray24[11];
			local517 = Static91.anIntArray267;
		}
		if (local69 > 0) {
			local50 = local517[0];
		} else {
			local50 = -1000;
		}
		for (local81 = 0; local81 < 10; local81++) {
			while (local81 == 0 && local50 > local38) {
				this.method1394(local515[local65++]);
				if (local65 == local69 && local515 != Static91.anIntArrayArray24[11]) {
					local65 = 0;
					local69 = Static91.anIntArray254[11];
					local515 = Static91.anIntArrayArray24[11];
					local517 = Static91.anIntArray267;
				}
				if (local65 < local69) {
					local50 = local517[local65];
				} else {
					local50 = -1000;
				}
			}
			while (local81 == 3 && local50 > local42) {
				this.method1394(local515[local65++]);
				if (local65 == local69 && local515 != Static91.anIntArrayArray24[11]) {
					local65 = 0;
					local69 = Static91.anIntArray254[11];
					local515 = Static91.anIntArrayArray24[11];
					local517 = Static91.anIntArray267;
				}
				if (local65 < local69) {
					local50 = local517[local65];
				} else {
					local50 = -1000;
				}
			}
			while (local81 == 5 && local50 > local46) {
				this.method1394(local515[local65++]);
				if (local65 == local69 && local515 != Static91.anIntArrayArray24[11]) {
					local65 = 0;
					local69 = Static91.anIntArray254[11];
					local515 = Static91.anIntArrayArray24[11];
					local517 = Static91.anIntArray267;
				}
				if (local65 < local69) {
					local50 = local517[local65];
				} else {
					local50 = -1000;
				}
			}
			local85 = Static91.anIntArray254[local81];
			@Pc(680) int[] local680 = Static91.anIntArrayArray24[local81];
			for (local93 = 0; local93 < local85; local93++) {
				this.method1394(local680[local93]);
			}
		}
		while (local50 != -1000) {
			this.method1394(local515[local65++]);
			if (local65 == local69 && local515 != Static91.anIntArrayArray24[11]) {
				local65 = 0;
				local515 = Static91.anIntArrayArray24[11];
				local69 = Static91.anIntArray254[11];
				local517 = Static91.anIntArray267;
			}
			if (local65 < local69) {
				local50 = local517[local65];
			} else {
				local50 = -1000;
			}
		}
	}

	@OriginalMember(owner = "client!kc", name = "i", descriptor = "(I)V")
	private void method1394(@OriginalArg(0) int arg0) {
		if (Static91.aBooleanArray11[arg0]) {
			this.method1391(arg0);
			return;
		}
		@Pc(12) int local12 = this.anIntArray247[arg0];
		@Pc(17) int local17 = this.anIntArray244[arg0];
		@Pc(22) int local22 = this.anIntArray251[arg0];
		Static65.aBoolean59 = Static91.aBooleanArray10[arg0];
		if (this.aByteArray14 == null) {
			Static65.anInt1420 = 0;
		} else {
			Static65.anInt1420 = this.aByteArray14[arg0] & 0xFF;
		}
		if (this.aShortArray19 != null && this.aShortArray19[arg0] != -1) {
			@Pc(133) int local133;
			@Pc(138) int local138;
			@Pc(143) int local143;
			if (this.aByteArray15 == null || this.aByteArray15[arg0] == -1) {
				local133 = local12;
				local138 = local17;
				local143 = local22;
			} else {
				@Pc(128) int local128 = this.aByteArray15[arg0] & 0xFF;
				local133 = this.anIntArray245[local128];
				local138 = this.anIntArray246[local128];
				local143 = this.anIntArray249[local128];
			}
			if (this.anIntArray250[arg0] == -1) {
				Static65.method961(Static91.anIntArray258[local12], Static91.anIntArray258[local17], Static91.anIntArray258[local22], Static91.anIntArray263[local12], Static91.anIntArray263[local17], Static91.anIntArray263[local22], this.anIntArray248[arg0], this.anIntArray248[arg0], this.anIntArray248[arg0], Static91.anIntArray256[local133], Static91.anIntArray256[local138], Static91.anIntArray256[local143], Static91.anIntArray261[local133], Static91.anIntArray261[local138], Static91.anIntArray261[local143], Static91.anIntArray265[local133], Static91.anIntArray265[local138], Static91.anIntArray265[local143], this.aShortArray19[arg0]);
			} else {
				Static65.method961(Static91.anIntArray258[local12], Static91.anIntArray258[local17], Static91.anIntArray258[local22], Static91.anIntArray263[local12], Static91.anIntArray263[local17], Static91.anIntArray263[local22], this.anIntArray248[arg0], this.anIntArray252[arg0], this.anIntArray250[arg0], Static91.anIntArray256[local133], Static91.anIntArray256[local138], Static91.anIntArray256[local143], Static91.anIntArray261[local133], Static91.anIntArray261[local138], Static91.anIntArray261[local143], Static91.anIntArray265[local133], Static91.anIntArray265[local138], Static91.anIntArray265[local143], this.aShortArray19[arg0]);
			}
		} else if (this.anIntArray250[arg0] == -1) {
			Static65.method971(Static91.anIntArray258[local12], Static91.anIntArray258[local17], Static91.anIntArray258[local22], Static91.anIntArray263[local12], Static91.anIntArray263[local17], Static91.anIntArray263[local22], Static91.anIntArray268[this.anIntArray248[arg0]]);
		} else {
			Static65.method955(Static91.anIntArray258[local12], Static91.anIntArray258[local17], Static91.anIntArray258[local22], Static91.anIntArray263[local12], Static91.anIntArray263[local17], Static91.anIntArray263[local22], this.anIntArray248[arg0], this.anIntArray252[arg0], this.anIntArray250[arg0]);
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method3054(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (!super.aBoolean76) {
			this.method1385();
		}
		@Pc(14) int local14 = arg7 * arg4 - arg5 * arg3 >> 16;
		@Pc(24) int local24 = arg6 * arg1 + local14 * arg2 >> 16;
		@Pc(38) int local38 = local24 + (super.aShort15 * arg2 + super.aShort18 * arg1 >> 16);
		if (local38 <= 50) {
			return;
		}
		@Pc(57) int local57 = local24 + (-super.aShort15 * arg2 + super.aShort34 * arg1 >> 16);
		if (local57 >= 3500) {
			return;
		}
		@Pc(71) int local71 = arg7 * arg3 + arg5 * arg4 >> 16;
		@Pc(78) int local78 = local71 + super.aShort15 << 9;
		if (local78 / local38 <= Static65.anInt1419) {
			return;
		}
		@Pc(91) int local91 = local71 - super.aShort15 << 9;
		if (local91 / local38 >= Static65.anInt1415) {
			return;
		}
		@Pc(107) int local107 = arg6 * arg2 - local14 * arg1 >> 16;
		@Pc(123) int local123 = local107 + (super.aShort15 * arg1 + super.aShort18 * arg2 >> 16) << 9;
		if (local123 / local38 <= Static65.anInt1421) {
			return;
		}
		@Pc(146) int local146 = local107 + (-super.aShort15 * arg1 + super.aShort34 * arg2 >> 16) << 9;
		if (local146 / local38 >= Static65.anInt1418) {
			return;
		}
		@Pc(154) boolean local154 = false;
		@Pc(161) boolean local161 = local57 <= 50;
		@Pc(170) boolean local170 = local161 || this.anInt1939 > 0;
		@Pc(172) int local172 = Static65.anInt1422;
		@Pc(174) int local174 = Static65.anInt1416;
		@Pc(176) int local176 = 0;
		@Pc(178) int local178 = 0;
		if (arg0 != 0) {
			local176 = Static91.anIntArray270[arg0];
			local178 = Static91.anIntArray253[arg0];
		}
		@Pc(190) boolean local190 = false;
		@Pc(204) int local204;
		@Pc(223) int local223;
		@Pc(208) int local208;
		@Pc(227) int local227;
		@Pc(240) int local240;
		if (arg8 > 0L && Static189.aBoolean77 && local57 > 0) {
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
			local240 = Static189.anInt1938 - Static65.anInt1422;
			@Pc(244) int local244 = Static189.anInt1934 - Static65.anInt1416;
			if (local240 >= local204 && local240 <= local208 && local244 >= local223 && local244 <= local227) {
				local204 = 999999;
				local208 = -999999;
				local223 = 999999;
				local227 = -999999;
				@Pc(307) int[] local307 = new int[] { super.aShort19, super.aShort17, super.aShort19, super.aShort17, super.aShort19, super.aShort17, super.aShort19, super.aShort17 };
				@Pc(350) int[] local350 = new int[] { super.aShort16, super.aShort16, super.aShort21, super.aShort21, super.aShort16, super.aShort16, super.aShort21, super.aShort21 };
				@Pc(393) int[] local393 = new int[] { super.aShort34, super.aShort34, super.aShort34, super.aShort34, super.aShort18, super.aShort18, super.aShort18, super.aShort18 };
				for (@Pc(395) int local395 = 0; local395 < 8; local395++) {
					@Pc(400) int local400 = local307[local395];
					@Pc(404) int local404 = local393[local395];
					@Pc(408) int local408 = local350[local395];
					@Pc(420) int local420;
					if (arg0 != 0) {
						local420 = local408 * local176 + local400 * local178 >> 16;
						local408 = local408 * local178 - local400 * local176 >> 16;
						local400 = local420;
					}
					local400 += arg5;
					local404 += arg6;
					local408 += arg7;
					local420 = local408 * arg3 + local400 * arg4 >> 16;
					local408 = local408 * arg4 - local400 * arg3 >> 16;
					local400 = local420;
					local420 = local404 * arg2 - local408 * arg1 >> 16;
					local408 = local404 * arg1 + local408 * arg2 >> 16;
					if (local408 > 0) {
						@Pc(496) int local496 = (local400 << 9) / local408;
						@Pc(502) int local502 = (local420 << 9) / local408;
						if (local496 < local204) {
							local204 = local496;
						}
						if (local496 > local208) {
							local208 = local496;
						}
						if (local502 < local223) {
							local223 = local502;
						}
						if (local502 > local227) {
							local227 = local502;
						}
					}
				}
				if (local240 >= local204 && local240 <= local208 && local244 >= local223 && local244 <= local227) {
					if (super.aBoolean75) {
						Static189.aLongArray7[Static189.anInt1936++] = arg8;
					} else {
						local190 = true;
					}
				}
			}
		}
		for (local204 = 0; local204 < super.anInt1935; local204++) {
			local223 = super.anIntArray242[local204];
			local208 = super.anIntArray243[local204];
			local227 = super.anIntArray240[local204];
			if (arg0 != 0) {
				local240 = local227 * local176 + local223 * local178 >> 16;
				local227 = local227 * local178 - local223 * local176 >> 16;
				local223 = local240;
			}
			local223 += arg5;
			local208 += arg6;
			local227 += arg7;
			local240 = local227 * arg3 + local223 * arg4 >> 16;
			local227 = local227 * arg4 - local223 * arg3 >> 16;
			local223 = local240;
			local240 = local208 * arg2 - local227 * arg1 >> 16;
			local227 = local208 * arg1 + local227 * arg2 >> 16;
			Static91.anIntArray259[local204] = local227 - local24;
			if (local227 >= 50) {
				Static91.anIntArray263[local204] = local172 + (local223 << 9) / local227;
				Static91.anIntArray258[local204] = local174 + (local240 << 9) / local227;
			} else {
				Static91.anIntArray263[local204] = -5000;
				local154 = true;
			}
			if (local170) {
				Static91.anIntArray256[local204] = local223;
				Static91.anIntArray261[local204] = local240;
				Static91.anIntArray265[local204] = local227;
			}
		}
		try {
			this.method1393(local154, local190, arg8, local24 - local57, local38 - local57 + 2);
		} catch (@Pc(720) Exception local720) {
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!e;ILclient!e;I[I)V")
	@Override
	public void method1377(@OriginalArg(0) Class3_Sub1_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub1_Sub6 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		if (arg1 == -1) {
			return;
		}
		if (arg4 == null || arg3 == -1) {
			this.method1383(arg0, arg1);
			return;
		}
		@Pc(18) Class65 local18 = arg0.aClass65Array1[arg1];
		@Pc(23) Class65 local23 = arg2.aClass65Array1[arg3];
		@Pc(26) Class3_Sub14 local26 = local18.aClass3_Sub14_1;
		Static91.anInt1941 = 0;
		Static91.anInt1942 = 0;
		Static91.anInt1940 = 0;
		@Pc(34) byte local34 = 0;
		@Pc(37) int local37 = local34 + 1;
		@Pc(39) int local39 = arg4[0];
		for (@Pc(41) int local41 = 0; local41 < local18.anInt2669; local41++) {
			@Pc(47) short local47 = local18.aShortArray34[local41];
			while (local47 > local39) {
				local39 = arg4[local37++];
			}
			if (local47 != local39 || local26.anIntArray275[local47] == 0) {
				if (local18.aShortArray29[local41] != -1) {
					this.method1388(0, local26.anIntArrayArray26[local18.aShortArray29[local41]], 0, 0, 0);
				}
				this.method1388(local26.anIntArray275[local47], local26.anIntArrayArray26[local47], local18.aShortArray28[local41], local18.aShortArray31[local41], local18.aShortArray37[local41]);
			}
		}
		Static91.anInt1941 = 0;
		Static91.anInt1942 = 0;
		Static91.anInt1940 = 0;
		local34 = 0;
		local37 = local34 + 1;
		local39 = arg4[0];
		for (@Pc(125) int local125 = 0; local125 < local23.anInt2669; local125++) {
			@Pc(131) short local131 = local23.aShortArray34[local125];
			while (local131 > local39) {
				local39 = arg4[local37++];
			}
			if (local131 == local39 || local26.anIntArray275[local131] == 0) {
				if (local23.aShortArray29[local125] != -1) {
					this.method1388(0, local26.anIntArrayArray26[local23.aShortArray29[local125]], 0, 0, 0);
				}
				this.method1388(local26.anIntArray275[local131], local26.anIntArrayArray26[local131], local23.aShortArray28[local125], local23.aShortArray31[local125], local23.aShortArray37[local125]);
			}
		}
		super.aBoolean76 = false;
	}
}
