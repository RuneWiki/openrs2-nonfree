import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ts")
public final class Class259_Sub2 extends Class259 {

	@OriginalMember(owner = "client!ts", name = "q", descriptor = "F")
	private float aFloat160;

	@OriginalMember(owner = "client!ts", name = "z", descriptor = "F")
	private float aFloat161;

	@OriginalMember(owner = "client!ts", name = "x", descriptor = "F")
	private float aFloat162;

	@OriginalMember(owner = "client!ts", name = "o", descriptor = "[[Lclient!uj;")
	private Class376[][] aClass376ArrayArray1;

	@OriginalMember(owner = "client!ts", name = "B", descriptor = "F")
	private float aFloat163;

	@OriginalMember(owner = "client!ts", name = "u", descriptor = "F")
	private float aFloat164;

	@OriginalMember(owner = "client!ts", name = "w", descriptor = "F")
	private float aFloat165;

	@OriginalMember(owner = "client!ts", name = "v", descriptor = "[[Lclient!cu;")
	private Class66[][] aClass66ArrayArray1;

	@OriginalMember(owner = "client!ts", name = "j", descriptor = "[[Lclient!jea;")
	private Class190[][] aClass190ArrayArray1;

	@OriginalMember(owner = "client!ts", name = "n", descriptor = "F")
	private float aFloat166;

	@OriginalMember(owner = "client!ts", name = "t", descriptor = "F")
	private float aFloat167;

	@OriginalMember(owner = "client!ts", name = "A", descriptor = "F")
	private float aFloat168;

	@OriginalMember(owner = "client!ts", name = "D", descriptor = "F")
	private float aFloat169;

	@OriginalMember(owner = "client!ts", name = "y", descriptor = "F")
	private float aFloat170;

	@OriginalMember(owner = "client!ts", name = "k", descriptor = "[[Lclient!v;")
	private Class383[][] aClass383ArrayArray1;

	@OriginalMember(owner = "client!ts", name = "p", descriptor = "F")
	private float aFloat171;

	@OriginalMember(owner = "client!ts", name = "C", descriptor = "[[Lclient!ql;")
	private Class312[][] aClass312ArrayArray1;

	@OriginalMember(owner = "client!ts", name = "E", descriptor = "I")
	private int anInt9766 = -1;

	@OriginalMember(owner = "client!ts", name = "l", descriptor = "Lclient!wda;")
	private final Class22_Sub3 aClass22_Sub3_11;

	@OriginalMember(owner = "client!ts", name = "m", descriptor = "I")
	private final int anInt9767;

	@OriginalMember(owner = "client!ts", name = "r", descriptor = "[[B")
	private byte[][] aByteArrayArray18;

	@OriginalMember(owner = "client!ts", name = "s", descriptor = "[[B")
	private byte[][] aByteArrayArray17;

	@OriginalMember(owner = "client!ts", name = "<init>", descriptor = "(Lclient!wda;IIII[[I[[II)V")
	public Class259_Sub2(@OriginalArg(0) Class22_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass22_Sub3_11 = arg0;
		this.anInt9767 = arg2;
		this.aByteArrayArray18 = new byte[arg3 + 1][arg4 + 1];
		@Pc(29) int local29 = this.aClass22_Sub3_11.anInt11036 >> 9;
		for (@Pc(31) int local31 = 1; local31 < arg4; local31++) {
			for (@Pc(34) int local34 = 1; local34 < arg3; local34++) {
				@Pc(53) int local53 = arg6[local34 + 1][local31] - arg6[local34 - 1][local31];
				@Pc(69) int local69 = arg6[local34][local31 + 1] - arg6[local34][local31 - 1];
				@Pc(84) int local84 = (int) Math.sqrt((double) (local53 * local53 + arg7 * 512 + local69 * local69));
				@Pc(90) int local90 = (local53 << 8) / local84;
				@Pc(96) int local96 = arg7 * -512 / local84;
				@Pc(102) int local102 = (local69 << 8) / local84;
				@Pc(124) int local124 = local29 + (this.aClass22_Sub3_11.anInt11048 * local90 + this.aClass22_Sub3_11.anInt11026 * local96 + this.aClass22_Sub3_11.lb * local102 >> 17);
				local124 >>= 0x1;
				if (local124 < 2) {
					local124 = 2;
				} else if (local124 > 126) {
					local124 = 126;
				}
				this.aByteArrayArray18[local34][local31] = (byte) local124;
			}
		}
		this.aByteArrayArray17 = new byte[arg3 + 1][arg4 + 1];
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(III[[ZZII)V")
	@Override
	public void method9300(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class58_Sub1 local3 = this.aClass22_Sub3_11.aClass58_Sub1_3;
		this.anInt9766 = arg5;
		this.aFloat161 = local3.aFloat55;
		this.aFloat167 = local3.aFloat52;
		this.aFloat168 = local3.aFloat56;
		this.aFloat160 = local3.aFloat48;
		this.aFloat171 = local3.aFloat45;
		this.aFloat162 = local3.aFloat47;
		this.aFloat170 = local3.aFloat46;
		this.aFloat163 = local3.aFloat50;
		this.aFloat164 = local3.aFloat51;
		this.aFloat165 = local3.aFloat49;
		this.aFloat169 = local3.aFloat54;
		this.aFloat166 = local3.aFloat53;
		for (@Pc(56) int local56 = 0; local56 < arg2 + arg2; local56++) {
			for (@Pc(59) int local59 = 0; local59 < arg2 + arg2; local59++) {
				if (arg3[local56][local59]) {
					@Pc(72) int local72 = arg0 + local56 - arg2;
					@Pc(78) int local78 = arg1 + local59 - arg2;
					if (local72 >= 0 && local72 < super.anInt10949 && local78 >= 0 && local78 < super.anInt10946) {
						this.method8345(local72, local78, arg6);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IIZLclient!lw;Lclient!ht;[I[I[I[II)V")
	private void method8338(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class239 arg3, @OriginalArg(4) Class166 arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int arg9) {
		@Pc(6) Class383 local6 = this.aClass383ArrayArray1[arg0][arg1];
		if (arg9 != 0 && (arg9 & 0x2) != 0 || local6 == null) {
			return;
		}
		@Pc(37) int local37;
		@Pc(42) int local42;
		@Pc(52) int local52;
		@Pc(172) float local172;
		@Pc(193) float local193;
		@Pc(73) float local73;
		@Pc(26) int local26;
		@Pc(95) int local95;
		@Pc(115) int local115;
		if (this.anInt9766 == -1) {
			for (local26 = 0; local26 < local6.aShort118; local26++) {
				local37 = local6.aShortArray146[local26] + (arg0 << super.anInt10943);
				local42 = local6.aShortArray145[local26];
				local52 = local6.aShortArray144[local26] + (arg1 << super.anInt10943);
				local73 = this.aFloat166 + this.aFloat164 * (float) local37 + this.aFloat165 * (float) local42 + this.aFloat169 * (float) local52;
				if (local73 <= (float) this.aClass22_Sub3_11.anInt11028) {
					return;
				}
				arg8[local26] = 0;
				if (arg2) {
					local95 = (int) (local73 - (float) arg3.anInt6098);
					if (local95 > 255) {
						local95 = 255;
					}
					if (local95 > 0) {
						arg8[local26] = local95;
						local115 = local6.aShortArray143[local26] * local95 / 255;
						if (local115 > 0) {
							local42 -= local115;
						}
					}
				} else if (arg3.aBoolean394) {
					local95 = (int) (local73 - (float) arg3.anInt6098);
					if (local95 > 0) {
						arg8[local26] = local95;
						if (arg8[local26] > 255) {
							arg8[local26] = 255;
						}
					}
				}
				local172 = this.aFloat160 + this.aFloat161 * (float) local37 + this.aFloat167 * (float) local42 + this.aFloat168 * (float) local52;
				local193 = this.aFloat163 + this.aFloat171 * (float) local37 + this.aFloat162 * (float) local42 + this.aFloat170 * (float) local52;
				arg5[local26] = arg4.anInt3974 + (int) (local172 * (float) this.aClass22_Sub3_11.anInt11046 / local73);
				arg6[local26] = arg4.anInt3975 + (int) (local193 * (float) this.aClass22_Sub3_11.anInt11030 / local73);
				arg7[local26] = (int) local73;
			}
		} else {
			for (local26 = 0; local26 < local6.aShort118; local26++) {
				local37 = local6.aShortArray146[local26] + (arg0 << super.anInt10943);
				local42 = local6.aShortArray145[local26];
				local52 = local6.aShortArray144[local26] + (arg1 << super.anInt10943);
				local73 = this.aFloat166 + this.aFloat164 * (float) local37 + this.aFloat165 * (float) local42 + this.aFloat169 * (float) local52;
				arg8[local26] = 0;
				if (arg2) {
					local95 = this.anInt9766 - arg3.anInt6098;
					if (local95 > 255) {
						local95 = 255;
					}
					if (local95 > 0) {
						arg8[local26] = local95;
						local115 = local6.aShortArray143[local26] * local95 / 255;
						if (local115 > 0) {
							local42 -= local115;
						}
					}
				} else if (arg3.aBoolean394) {
					local95 = this.anInt9766 - arg3.anInt6098;
					if (local95 > 0) {
						arg8[local26] = local95;
						if (arg8[local26] > 255) {
							arg8[local26] = 255;
						}
					}
				}
				local172 = this.aFloat160 + this.aFloat161 * (float) local37 + this.aFloat167 * (float) local42 + this.aFloat168 * (float) local52;
				local193 = this.aFloat163 + this.aFloat171 * (float) local37 + this.aFloat162 * (float) local42 + this.aFloat170 * (float) local52;
				arg5[local26] = arg4.anInt3974 + (int) (local172 * (float) this.aClass22_Sub3_11.anInt11046 / (float) this.anInt9766);
				arg6[local26] = arg4.anInt3975 + (int) (local193 * (float) this.aClass22_Sub3_11.anInt11030 / (float) this.anInt9766);
				arg7[local26] = (int) local73;
			}
		}
		@Pc(441) float local441 = (float) super.anInt10947;
		for (local95 = 0; local95 < local6.aShort117; local95++) {
			local115 = local95 * 3;
			@Pc(452) int local452 = local115 + 1;
			@Pc(456) int local456 = local452 + 1;
			@Pc(460) int local460 = arg5[local115];
			@Pc(464) int local464 = arg5[local452];
			@Pc(468) int local468 = arg5[local456];
			@Pc(472) int local472 = arg6[local115];
			@Pc(476) int local476 = arg6[local452];
			@Pc(480) int local480 = arg6[local456];
			if ((local460 - local464) * (local480 - local476) - (local472 - local476) * (local468 - local464) > 0) {
				arg4.aBoolean251 = local460 < 0 || local464 < 0 || local468 < 0 || local460 > arg4.anInt3977 || local464 > arg4.anInt3977 || local468 > arg4.anInt3977;
				if (arg8[local115] + arg8[local452] + arg8[local456] < 765) {
					@Pc(550) int local550 = arg0 << super.anInt10943;
					@Pc(555) int local555 = arg1 << super.anInt10943;
					if ((local6.anIntArray753[local115] & 0xFFFFFF) != 0) {
						if (local6.aShortArray142[local115] == local6.aShortArray142[local452] && local6.aShortArray142[local115] == local6.aShortArray142[local456] && local6.aShortArray147[local115] == local6.aShortArray147[local452] && local6.aShortArray147[local115] == local6.aShortArray147[local456]) {
							arg4.method3609((float) local472, (float) local476, (float) local480, (float) local460, (float) local464, (float) local468, (float) arg7[local115], (float) arg7[local452], (float) arg7[local456], (float) (local550 + local6.aShortArray146[local115]) / (float) local6.aShortArray147[local115], (float) (local550 + local6.aShortArray146[local452]) / (float) local6.aShortArray147[local452], (float) (local550 + local6.aShortArray146[local456]) / (float) local6.aShortArray147[local456], (float) (local555 + local6.aShortArray144[local115]) / (float) local6.aShortArray147[local115], (float) (local555 + local6.aShortArray144[local452]) / (float) local6.aShortArray147[local452], (float) (local555 + local6.aShortArray144[local456]) / (float) local6.aShortArray147[local456], local6.anIntArray753[local115], local6.anIntArray753[local452], local6.anIntArray753[local456], arg3.anInt6099, arg8[local115], arg8[local452], arg8[local456], local6.aShortArray142[local115]);
						} else {
							arg4.method3601((float) local472, (float) local476, (float) local480, (float) local460, (float) local464, (float) local468, (float) arg7[local115], (float) arg7[local452], (float) arg7[local456], (float) (local550 + local6.aShortArray146[local115]) / local441, (float) (local550 + local6.aShortArray146[local452]) / local441, (float) (local550 + local6.aShortArray146[local456]) / local441, (float) (local555 + local6.aShortArray144[local115]) / local441, (float) (local555 + local6.aShortArray144[local452]) / local441, (float) (local555 + local6.aShortArray144[local456]) / local441, local6.anIntArray753[local115], local6.anIntArray753[local452], local6.anIntArray753[local456], arg3.anInt6099, arg8[local115], arg8[local452], arg8[local456], local6.aShortArray142[local115], local441 / (float) local6.aShortArray147[local115], local6.aShortArray142[local452], local441 / (float) local6.aShortArray147[local452], local6.aShortArray142[local456], local441 / (float) local6.aShortArray147[local456]);
						}
					}
				} else {
					arg4.method3610((float) local472, (float) local476, (float) local480, (float) local460, (float) local464, (float) local468, (float) arg7[local115], (float) arg7[local452], (float) arg7[local456], arg3.anInt6099);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "(IIIIIII[[ZLclient!lw;Lclient!ht;[I[I)V")
	private void method8339(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(8) Class239 arg5, @OriginalArg(9) Class166 arg6, @OriginalArg(10) int[] arg7, @OriginalArg(11) int[] arg8) {
		@Pc(7) int local7 = (arg3 - arg1) * 1024 / 256;
		@Pc(14) boolean local14 = arg5.aBoolean395;
		this.aClass22_Sub3_11.C(false);
		arg6.aBoolean252 = false;
		arg6.aBoolean255 = false;
		@Pc(26) int local26 = 0;
		@Pc(30) int local30 = local7;
		for (@Pc(32) int local32 = arg0; local32 < arg2; local32++) {
			for (@Pc(35) int local35 = arg1; local35 < arg3; local35++) {
				if (arg4[local32 - arg0][local35 - arg1]) {
					@Pc(89) int local89;
					@Pc(379) int local379;
					@Pc(384) int local384;
					@Pc(388) int local388;
					@Pc(392) int local392;
					@Pc(396) int local396;
					@Pc(400) int local400;
					@Pc(404) int local404;
					@Pc(408) int local408;
					@Pc(412) int local412;
					@Pc(416) int local416;
					@Pc(449) int local449;
					if (this.aClass66ArrayArray1 == null) {
						if (this.aClass383ArrayArray1[local32][local35] != null) {
							@Pc(593) Class383 local593 = this.aClass383ArrayArray1[local32][local35];
							for (local89 = 0; local89 < local593.aShort118; local89++) {
								arg7[local89] = local26 + local593.aShortArray146[local89] * 4 / super.anInt10947;
								arg8[local89] = local30 - local593.aShortArray144[local89] * 4 / super.anInt10947;
							}
							for (local379 = 0; local379 < local593.aShort117; local379++) {
								local384 = local379 * 3;
								local388 = local384 + 1;
								local392 = local388 + 1;
								local396 = arg7[local384];
								local400 = arg7[local388];
								local404 = arg7[local392];
								local408 = arg8[local384];
								local412 = arg8[local388];
								local416 = arg8[local392];
								if (local593.anIntArray754 == null || local593.anIntArray754[local379] == 0) {
									arg6.method3599((float) local408, (float) local412, (float) local416, (float) local396, (float) local400, (float) local404, 100.0F, 100.0F, 100.0F, local593.anIntArray753[local384], local593.anIntArray753[local388], local593.anIntArray753[local392]);
								} else {
									local449 = local593.anIntArray754[local379];
									arg6.method3599((float) local408, (float) local412, (float) local416, (float) local396, (float) local400, (float) local404, 100.0F, 100.0F, 100.0F, local449, local449, local449);
								}
							}
						}
					} else if (this.aClass66ArrayArray1[local32][local35] != null) {
						@Pc(67) Class66 local67 = this.aClass66ArrayArray1[local32][local35];
						if (local67.aShort38 != -1 && (local67.aByte49 & 0x2) == 0 && local67.anInt2110 == 0) {
							local89 = this.aClass22_Sub3_11.method9412(local67.aShort38);
							arg6.method3591((float) (local30 - 4), (float) (local30 - 4), (float) local30, (float) (local26 + 4), (float) local26, (float) (local26 + 4), 100.0F, 100.0F, 100.0F, (float) Static276.method3877(local89, local67.anInt2109), (float) Static276.method3877(local89, local67.anInt2112), (float) Static276.method3877(local89, local67.anInt2111));
							arg6.method3591((float) local30, (float) local30, (float) (local30 - 4), (float) local26, (float) (local26 + 4), (float) local26, 100.0F, 100.0F, 100.0F, (float) Static276.method3877(local89, local67.anInt2113), (float) Static276.method3877(local89, local67.anInt2111), (float) Static276.method3877(local89, local67.anInt2112));
						} else if (local67.anInt2110 == 0) {
							arg6.method3599((float) (local30 - 4), (float) (local30 - 4), (float) local30, (float) (local26 + 4), (float) local26, (float) (local26 + 4), 100.0F, 100.0F, 100.0F, local67.anInt2109, local67.anInt2112, local67.anInt2111);
							arg6.method3599((float) local30, (float) local30, (float) (local30 - 4), (float) local26, (float) (local26 + 4), (float) local26, 100.0F, 100.0F, 100.0F, local67.anInt2113, local67.anInt2111, local67.anInt2112);
						} else {
							local89 = local67.anInt2110;
							arg6.method3599((float) (local30 - 4), (float) (local30 - 4), (float) local30, (float) (local26 + 4), (float) local26, (float) (local26 + 4), 100.0F, 100.0F, 100.0F, Static650.method8554(local89, local67.anInt2109 & 0xFF000000), Static650.method8554(local89, local67.anInt2112 & 0xFF000000), Static650.method8554(local89, local67.anInt2111 & 0xFF000000));
							arg6.method3599((float) local30, (float) local30, (float) (local30 - 4), (float) local26, (float) (local26 + 4), (float) local26, 100.0F, 100.0F, 100.0F, Static650.method8554(local89, local67.anInt2113 & 0xFF000000), Static650.method8554(local89, local67.anInt2111 & 0xFF000000), Static650.method8554(local89, local67.anInt2112 & 0xFF000000));
						}
					} else if (this.aClass376ArrayArray1[local32][local35] != null) {
						@Pc(341) Class376 local341 = this.aClass376ArrayArray1[local32][local35];
						for (local89 = 0; local89 < local341.aShort115; local89++) {
							arg7[local89] = local26 + local341.aShortArray137[local89] * 4 / super.anInt10947;
							arg8[local89] = local30 - local341.aShortArray136[local89] * 4 / super.anInt10947;
						}
						for (local379 = 0; local379 < local341.aShort116; local379++) {
							local384 = local379 * 3;
							local388 = local384 + 1;
							local392 = local388 + 1;
							local396 = arg7[local384];
							local400 = arg7[local388];
							local404 = arg7[local392];
							local408 = arg8[local384];
							local412 = arg8[local388];
							local416 = arg8[local392];
							if (local341.anIntArray729 != null && local341.anIntArray729[local379] != 0 && (local341.aShortArray135 == null || local341.aShortArray135 != null && local341.aShortArray135[local379] == -1)) {
								local449 = local341.anIntArray729[local379];
								arg6.method3599((float) local408, (float) local412, (float) local416, (float) local396, (float) local400, (float) local404, 100.0F, 100.0F, 100.0F, Static650.method8554(local449, -(local341.anIntArray728[local384] & -16777216) - 16777216), Static650.method8554(local449, -(local341.anIntArray728[local388] & -16777216) - 16777216), Static650.method8554(local449, -(local341.anIntArray728[local392] & -16777216) - 16777216));
							} else if (local341.aShortArray135 == null || local341.aShortArray135[local379] == -1) {
								arg6.method3599((float) local408, (float) local412, (float) local416, (float) local396, (float) local400, (float) local404, 100.0F, 100.0F, 100.0F, local341.anIntArray728[local384], local341.anIntArray728[local388], local341.anIntArray728[local392]);
							} else {
								local449 = this.aClass22_Sub3_11.method9412(local341.aShortArray135[local379]);
								arg6.method3591((float) local408, (float) local412, (float) local416, (float) local396, (float) local400, (float) local404, 100.0F, 100.0F, 100.0F, (float) local449, (float) local449, (float) local449);
							}
						}
					}
				}
				local30 -= 4;
			}
			local30 = local7;
			local26 += 4;
		}
		arg6.aBoolean252 = true;
		this.aClass22_Sub3_11.C(local14);
	}

	@OriginalMember(owner = "client!ts", name = "YA", descriptor = "()V")
	@Override
	public void YA() {
		this.aByteArrayArray18 = null;
		this.aByteArrayArray17 = null;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(Lclient!jw;[I)V")
	@Override
	public void method9296(@OriginalArg(0) Class3_Sub5 arg0, @OriginalArg(1) int[] arg1) {
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(II)V")
	@Override
	public void method9298(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method8345(arg0, arg1, 0);
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method9301(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		@Pc(3) Class58_Sub1 local3 = this.aClass22_Sub3_11.aClass58_Sub1_3;
		this.anInt9766 = -1;
		this.aFloat161 = local3.aFloat55;
		this.aFloat167 = local3.aFloat52;
		this.aFloat168 = local3.aFloat56;
		this.aFloat160 = local3.aFloat48;
		this.aFloat171 = local3.aFloat45;
		this.aFloat162 = local3.aFloat47;
		this.aFloat170 = local3.aFloat46;
		this.aFloat163 = local3.aFloat50;
		this.aFloat164 = local3.aFloat51;
		this.aFloat165 = local3.aFloat49;
		this.aFloat169 = local3.aFloat54;
		this.aFloat166 = local3.aFloat53;
		for (@Pc(56) int local56 = 0; local56 < arg2 + arg2; local56++) {
			for (@Pc(59) int local59 = 0; local59 < arg2 + arg2; local59++) {
				if (arg3[local56][local59]) {
					@Pc(72) int local72 = arg0 + local56 - arg2;
					@Pc(78) int local78 = arg1 + local59 - arg2;
					if (local72 >= 0 && local72 < super.anInt10949 && local78 >= 0 && local78 < super.anInt10946) {
						this.method8345(local72, local78, arg5);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ts", name = "ka", descriptor = "(III)V")
	@Override
	public void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aByteArrayArray17[arg0][arg1] < arg2) {
			this.aByteArrayArray17[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!ts", name = "wa", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void wa(@OriginalArg(0) Class3_Sub7_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method9292(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		if (this.aClass312ArrayArray1 == null) {
			this.aClass312ArrayArray1 = new Class312[super.anInt10949][super.anInt10946];
			this.aClass190ArrayArray1 = new Class190[super.anInt10949][super.anInt10946];
		} else if (this.aClass66ArrayArray1 != null || this.aClass383ArrayArray1 != null) {
			throw new IllegalStateException();
		}
		@Pc(33) boolean local33 = false;
		@Pc(79) int local79;
		@Pc(85) int local85;
		if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
			local33 = true;
			for (@Pc(72) int local72 = 1; local72 < 2; local72++) {
				local79 = arg2[arg6[local72]];
				local85 = arg4[arg6[local72]];
				if (local79 != 0 && local79 != super.anInt10947 || local85 != 0 && local85 != super.anInt10947) {
					local33 = false;
					break;
				}
			}
		}
		if (!local33) {
			@Pc(118) Class190 local118 = new Class190();
			@Pc(122) short local122 = (short) arg2.length;
			@Pc(126) short local126 = (short) arg9.length;
			local118.aShort61 = local122;
			local118.aShortArray61 = new short[local122];
			local118.aShortArray65 = new short[local122];
			local118.aShortArray58 = new short[local122];
			local118.aShortArray63 = new short[local122];
			@Pc(156) int local156;
			@Pc(323) int local323;
			@Pc(370) int local370;
			for (@Pc(147) int local147 = 0; local147 < local122; local147++) {
				@Pc(152) int local152 = arg2[local147];
				local156 = arg4[local147];
				if (local152 == 0 && local156 == 0) {
					local118.aShortArray61[local147] = (short) (this.aByteArrayArray18[arg0][arg1] - this.aByteArrayArray17[arg0][arg1]);
				} else if (local152 == 0 && local156 == super.anInt10947) {
					local118.aShortArray61[local147] = (short) (this.aByteArrayArray18[arg0][arg1 + 1] - this.aByteArrayArray17[arg0][arg1 + 1]);
				} else if (local152 == super.anInt10947 && local156 == super.anInt10947) {
					local118.aShortArray61[local147] = (short) (this.aByteArrayArray18[arg0 + 1][arg1 + 1] - this.aByteArrayArray17[arg0 + 1][arg1 + 1]);
				} else if (local152 == super.anInt10947 && local156 == 0) {
					local118.aShortArray61[local147] = (short) (this.aByteArrayArray18[arg0 + 1][arg1] - this.aByteArrayArray17[arg0 + 1][arg1]);
				} else {
					local323 = (this.aByteArrayArray18[arg0][arg1] - this.aByteArrayArray17[arg0][arg1]) * (super.anInt10947 - local152) + (this.aByteArrayArray18[arg0 + 1][arg1] - this.aByteArrayArray17[arg0 + 1][arg1]) * local152;
					local370 = (this.aByteArrayArray18[arg0][arg1 + 1] - this.aByteArrayArray17[arg0][arg1 + 1]) * (super.anInt10947 - local152) + (this.aByteArrayArray18[arg0 + 1][arg1 + 1] - this.aByteArrayArray17[arg0 + 1][arg1 + 1]) * local152;
					local118.aShortArray61[local147] = (short) (local323 * (super.anInt10947 - local156) + local370 * local156 >> super.anInt10943 * 2);
				}
				local323 = (arg0 << super.anInt10943) + local152;
				local370 = (arg1 << super.anInt10943) + local156;
				local118.aShortArray65[local147] = (short) local152;
				local118.aShortArray63[local147] = (short) local156;
				local118.aShortArray58[local147] = (short) (this.method9294(local370, local323) + (arg3 == null ? 0 : arg3[local147]));
				if (local118.aShortArray61[local147] < 2) {
					local118.aShortArray61[local147] = 2;
				}
			}
			@Pc(454) boolean local454 = false;
			local156 = 0;
			for (local323 = 0; local323 < local126; local323++) {
				if (arg9[local323] >= 0 || arg10 != null && arg10[local323] >= 0) {
					local156++;
				}
				local370 = arg11[local323];
				if (local370 != -1) {
					@Pc(490) Class406 local490 = this.aClass22_Sub3_11.anInterface4_14.method5761(local370);
					if (!local490.aBoolean761) {
						local454 = true;
						if (this.method8342(local490.aByte149) || local490.aByte145 != 0 || local490.aByte150 != 0) {
							local118.aByte66 = (byte) (local118.aByte66 | 0x4);
						}
					}
				}
			}
			local118.anIntArray358 = new int[local156];
			if (arg10 != null) {
				local118.anIntArray357 = new int[local156];
			}
			local118.aShortArray64 = new short[local156];
			local118.aShortArray62 = new short[local156];
			local118.aShortArray59 = new short[local156];
			if (local454) {
				local118.aShortArray57 = new short[local156];
				local118.aShortArray60 = new short[local156];
			}
			for (local370 = 0; local370 < local126; local370++) {
				if (arg9[local370] >= 0 || arg10 != null && arg10[local370] >= 0) {
					if (arg9[local370] >= 0) {
						local118.anIntArray358[local118.aShort62] = Static150.method2497(arg9[local370]);
					} else {
						local118.anIntArray358[local118.aShort62] = -1;
					}
					if (arg10 != null) {
						if (arg10[local370] == -1) {
							local118.anIntArray357[local118.aShort62] = -1;
						} else {
							local118.anIntArray357[local118.aShort62] = Static150.method2497(arg10[local370]);
						}
					}
					local118.aShortArray64[local118.aShort62] = (short) arg6[local370];
					local118.aShortArray62[local118.aShort62] = (short) arg7[local370];
					local118.aShortArray59[local118.aShort62] = (short) arg8[local370];
					if (local454) {
						if (arg11[local370] == -1 || this.aClass22_Sub3_11.anInterface4_14.method5761(arg11[local370]).aBoolean761) {
							local118.aShortArray57[local118.aShort62] = -1;
						} else {
							local118.aShortArray57[local118.aShort62] = (short) arg11[local370];
							local118.aShortArray60[local118.aShort62] = (short) arg12[local370];
						}
					}
					local118.aShort62++;
				}
			}
			this.aClass190ArrayArray1[arg0][arg1] = local118;
		} else if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
			@Pc(741) Class312 local741 = new Class312();
			local79 = arg9[0];
			local85 = arg11[0];
			if (arg10 != null) {
				local741.anInt8284 = Static276.method3877(Static150.method2497(arg10[0]), this.aByteArrayArray18[arg0][arg1] - this.aByteArrayArray17[arg0][arg1]);
				if (local79 == -1) {
					local741.aByte116 = (byte) (local741.aByte116 | 0x2);
				}
			}
			if (super.anIntArrayArray68[arg0][arg1] == super.anIntArrayArray68[arg0 + 1][arg1] && super.anIntArrayArray68[arg0][arg1] == super.anIntArrayArray68[arg0 + 1][arg1 + 1] && super.anIntArrayArray68[arg0][arg1] == super.anIntArrayArray68[arg0][arg1 + 1]) {
				local741.aByte116 = (byte) (local741.aByte116 | 0x1);
			}
			@Pc(849) Class406 local849 = null;
			if (local85 != -1) {
				local849 = this.aClass22_Sub3_11.anInterface4_14.method5761(local85);
			}
			if (local849 == null || (local741.aByte116 & 0x2) != 0 || local849.aBoolean761) {
				@Pc(987) short local987 = Static150.method2497(local79);
				local741.aShort90 = (short) Static276.method3877(local987, this.aByteArrayArray18[arg0][arg1] - this.aByteArrayArray17[arg0][arg1]);
				local741.aShort87 = (short) Static276.method3877(local987, this.aByteArrayArray18[arg0 + 1][arg1] - this.aByteArrayArray17[arg0 + 1][arg1]);
				local741.aShort91 = (short) Static276.method3877(local987, this.aByteArrayArray18[arg0 + 1][arg1 + 1] - this.aByteArrayArray17[arg0 + 1][arg1 + 1]);
				local741.aShort89 = (short) Static276.method3877(local987, this.aByteArrayArray18[arg0][arg1 + 1] - this.aByteArrayArray17[arg0][arg1 + 1]);
				local741.aShort88 = -1;
			} else {
				local741.aShort90 = (short) (this.aByteArrayArray18[arg0][arg1] - this.aByteArrayArray17[arg0][arg1]);
				local741.aShort87 = (short) (this.aByteArrayArray18[arg0 + 1][arg1] - this.aByteArrayArray17[arg0 + 1][arg1]);
				local741.aShort91 = (short) (this.aByteArrayArray18[arg0 + 1][arg1 + 1] - this.aByteArrayArray17[arg0 + 1][arg1 + 1]);
				local741.aShort89 = (short) (this.aByteArrayArray18[arg0][arg1 + 1] - this.aByteArrayArray17[arg0][arg1 + 1]);
				local741.aShort88 = (short) local85;
				if (this.method8342(local849.aByte149) || local849.aByte145 != 0 || local849.aByte150 != 0) {
					local741.aByte116 = (byte) (local741.aByte116 | 0x4);
				}
			}
			this.aClass312ArrayArray1[arg0][arg1] = local741;
		}
	}

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "(IIZLclient!lw;Lclient!ht;[I[I[I[II)V")
	private void method8340(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class239 arg3, @OriginalArg(4) Class166 arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int arg9) {
		@Pc(6) Class66 local6 = this.aClass66ArrayArray1[arg0][arg1];
		@Pc(50) int local50;
		@Pc(55) int local55;
		@Pc(60) int local60;
		@Pc(559) int local559;
		@Pc(409) int local409;
		@Pc(469) int local469;
		@Pc(529) int local529;
		@Pc(589) int local589;
		if (local6 == null) {
			@Pc(3142) Class376 local3142 = this.aClass376ArrayArray1[arg0][arg1];
			if (local3142 != null) {
				if (arg9 != 0) {
					if ((local3142.aByte137 & 0x4) == 0) {
						if ((arg9 & 0x2) != 0) {
							return;
						}
					} else if ((arg9 & 0x1) != 0) {
						return;
					}
				}
				@Pc(3321) float local3321;
				@Pc(3342) float local3342;
				@Pc(3222) float local3222;
				if (this.anInt9766 == -1) {
					for (local559 = 0; local559 < local3142.aShort115; local559++) {
						local50 = local3142.aShortArray137[local559] + (arg0 << super.anInt10943);
						local55 = local3142.aShortArray133[local559];
						local60 = local3142.aShortArray136[local559] + (arg1 << super.anInt10943);
						local3222 = this.aFloat166 + this.aFloat164 * (float) local50 + this.aFloat165 * (float) local55 + this.aFloat169 * (float) local60;
						if (local3222 <= (float) this.aClass22_Sub3_11.anInt11028) {
							return;
						}
						arg8[local559] = 0;
						if (arg2) {
							local409 = (int) (local3222 - (float) arg3.anInt6098);
							if (local409 > 255) {
								local409 = 255;
							}
							if (local409 > 0) {
								arg8[local559] = local409;
								local469 = local3142.aShortArray134[local559] * local409 / 255;
								if (local469 > 0) {
									local55 -= local469;
								}
							}
						} else if (arg3.aBoolean394) {
							local409 = (int) (local3222 - (float) arg3.anInt6098);
							if (local409 > 0) {
								arg8[local559] = local409;
								if (arg8[local559] > 255) {
									arg8[local559] = 255;
								}
							}
						}
						local3321 = this.aFloat160 + this.aFloat161 * (float) local50 + this.aFloat167 * (float) local55 + this.aFloat168 * (float) local60;
						local3342 = this.aFloat163 + this.aFloat171 * (float) local50 + this.aFloat162 * (float) local55 + this.aFloat170 * (float) local60;
						arg5[local559] = arg4.anInt3974 + (int) (local3321 * (float) this.aClass22_Sub3_11.anInt11046 / local3222);
						arg6[local559] = arg4.anInt3975 + (int) (local3342 * (float) this.aClass22_Sub3_11.anInt11030 / local3222);
						arg7[local559] = (int) local3222;
					}
				} else {
					for (local559 = 0; local559 < local3142.aShort115; local559++) {
						local50 = local3142.aShortArray137[local559] + (arg0 << super.anInt10943);
						local55 = local3142.aShortArray133[local559];
						local60 = local3142.aShortArray136[local559] + (arg1 << super.anInt10943);
						local3222 = this.aFloat166 + this.aFloat164 * (float) local50 + this.aFloat165 * (float) local55 + this.aFloat169 * (float) local60;
						arg8[local559] = 0;
						if (arg2) {
							local409 = this.anInt9766 - arg3.anInt6098;
							if (local409 > 255) {
								local409 = 255;
							}
							if (local409 > 0) {
								arg8[local559] = local409;
								local469 = local3142.aShortArray134[local559] * local409 / 255;
								if (local469 > 0) {
									local55 -= local469;
								}
							}
						} else if (arg3.aBoolean394) {
							local409 = this.anInt9766 - arg3.anInt6098;
							if (local409 > 0) {
								arg8[local559] = local409;
								if (arg8[local559] > 255) {
									arg8[local559] = 255;
								}
							}
						}
						local3321 = this.aFloat160 + this.aFloat161 * (float) local50 + this.aFloat167 * (float) local55 + this.aFloat168 * (float) local60;
						local3342 = this.aFloat163 + this.aFloat171 * (float) local50 + this.aFloat162 * (float) local55 + this.aFloat170 * (float) local60;
						arg5[local559] = arg4.anInt3974 + (int) (local3321 * (float) this.aClass22_Sub3_11.anInt11046 / (float) this.anInt9766);
						arg6[local559] = arg4.anInt3975 + (int) (local3342 * (float) this.aClass22_Sub3_11.anInt11030 / (float) this.anInt9766);
						arg7[local559] = (int) local3222;
					}
				}
				@Pc(3620) int local3620;
				@Pc(3624) int local3624;
				@Pc(3628) int local3628;
				@Pc(3632) int local3632;
				@Pc(3636) int local3636;
				@Pc(3648) int local3648;
				if (local3142.aShortArray135 != null) {
					@Pc(3705) short local3705;
					@Pc(3719) int local3719;
					if (this.anInt9766 == -1) {
						for (local559 = 0; local559 < local3142.aShort116; local559++) {
							local409 = local559 * 3;
							local469 = local409 + 1;
							local529 = local469 + 1;
							local589 = arg5[local409];
							local3620 = arg5[local469];
							local3624 = arg5[local529];
							local3628 = arg6[local409];
							local3632 = arg6[local469];
							local3636 = arg6[local529];
							local3648 = arg8[local409] + arg8[local469] + arg8[local529];
							if ((local589 - local3620) * (local3636 - local3632) - (local3628 - local3632) * (local3624 - local3620) > 0) {
								arg4.aBoolean251 = local589 < 0 || local3620 < 0 || local3624 < 0 || local589 > arg4.anInt3977 || local3620 > arg4.anInt3977 || local3624 > arg4.anInt3977;
								local3705 = local3142.aShortArray135[local559];
								if (local3648 >= 765) {
									arg4.method3610((float) local3628, (float) local3632, (float) local3636, (float) local589, (float) local3620, (float) local3624, (float) arg7[local409], (float) arg7[local469], (float) arg7[local529], arg3.anInt6099);
								} else if (local3648 > 0) {
									if (local3705 != -1) {
										local3719 = -16777216;
										if (local3705 != -1 && this.method8342(this.aClass22_Sub3_11.anInterface4_14.method5761(local3705).aByte149)) {
											local3719 = -1694498816;
										}
										arg4.method3609((float) local3628, (float) local3632, (float) local3636, (float) local589, (float) local3620, (float) local3624, (float) arg7[local409], (float) arg7[local469], (float) arg7[local529], (float) local3142.aShortArray137[local409] / (float) super.anInt10947, (float) local3142.aShortArray137[local469] / (float) super.anInt10947, (float) local3142.aShortArray137[local529] / (float) super.anInt10947, (float) local3142.aShortArray136[local409] / (float) super.anInt10947, (float) local3142.aShortArray136[local469] / (float) super.anInt10947, (float) local3142.aShortArray136[local529] / (float) super.anInt10947, local3719 | local3142.anIntArray728[local409] & 0xFFFFFF, local3719 | local3142.anIntArray728[local469] & 0xFFFFFF, local3719 | local3142.anIntArray728[local529] & 0xFFFFFF, arg3.anInt6099, arg8[local409], arg8[local469], arg8[local529], local3705);
									} else if ((local3142.anIntArray728[local409] & 0xFFFFFF) != 0) {
										if (local3705 != -1 && this.method8342(this.aClass22_Sub3_11.anInterface4_14.method5761(local3705).aByte149)) {
											arg4.anInt3978 = -1694498816;
										}
										arg4.method3599((float) local3628, (float) local3632, (float) local3636, (float) local589, (float) local3620, (float) local3624, (float) arg7[local409], (float) arg7[local469], (float) arg7[local529], Static650.method8554(local3142.anIntArray728[local409], arg8[local409] << 24 | arg3.anInt6099), Static650.method8554(local3142.anIntArray728[local469], arg8[local469] << 24 | arg3.anInt6099), Static650.method8554(local3142.anIntArray728[local529], arg8[local529] << 24 | arg3.anInt6099));
										arg4.anInt3978 = 0;
									}
								} else if (local3705 != -1) {
									local3719 = -16777216;
									if (local3705 != -1 && this.method8342(this.aClass22_Sub3_11.anInterface4_14.method5761(local3705).aByte149)) {
										local3719 = -1694498816;
									}
									arg4.method3609((float) local3628, (float) local3632, (float) local3636, (float) local589, (float) local3620, (float) local3624, (float) arg7[local409], (float) arg7[local469], (float) arg7[local529], (float) local3142.aShortArray137[local409] / (float) super.anInt10947, (float) local3142.aShortArray137[local469] / (float) super.anInt10947, (float) local3142.aShortArray137[local529] / (float) super.anInt10947, (float) local3142.aShortArray136[local409] / (float) super.anInt10947, (float) local3142.aShortArray136[local469] / (float) super.anInt10947, (float) local3142.aShortArray136[local529] / (float) super.anInt10947, local3719 | local3142.anIntArray728[local409] & 0xFFFFFF, local3719 | local3142.anIntArray728[local469] & 0xFFFFFF, local3719 | local3142.anIntArray728[local529] & 0xFFFFFF, 0, 0, 0, 0, local3705);
								} else if ((local3142.anIntArray728[local409] & 0xFFFFFF) != 0) {
									if (local3705 != -1 && this.method8342(this.aClass22_Sub3_11.anInterface4_14.method5761(local3705).aByte149)) {
										arg4.anInt3978 = -1694498816;
									}
									arg4.method3599((float) local3628, (float) local3632, (float) local3636, (float) local589, (float) local3620, (float) local3624, (float) arg7[local409], (float) arg7[local469], (float) arg7[local529], local3142.anIntArray728[local409], local3142.anIntArray728[local469], local3142.anIntArray728[local529]);
									arg4.anInt3978 = 0;
								}
							}
						}
						return;
					}
					for (local559 = 0; local559 < local3142.aShort116; local559++) {
						local409 = local559 * 3;
						local469 = local409 + 1;
						local529 = local469 + 1;
						local589 = arg5[local409];
						local3620 = arg5[local469];
						local3624 = arg5[local529];
						local3628 = arg6[local409];
						local3632 = arg6[local469];
						local3636 = arg6[local529];
						local3648 = arg8[local409] + arg8[local469] + arg8[local529];
						if ((local589 - local3620) * (local3636 - local3632) - (local3628 - local3632) * (local3624 - local3620) > 0) {
							arg4.aBoolean251 = local589 < 0 || local3620 < 0 || local3624 < 0 || local589 > arg4.anInt3977 || local3620 > arg4.anInt3977 || local3624 > arg4.anInt3977;
							local3705 = local3142.aShortArray135[local559];
							if (local3648 < 765) {
								if (local3705 != -1 && this.method8342(this.aClass22_Sub3_11.anInterface4_14.method5761(local3705).aByte149)) {
									arg4.anInt3978 = -1694498816;
								}
								if (local3648 > 0) {
									if (local3705 != -1) {
										local3719 = -16777216;
										if (local3705 != -1 && this.method8342(this.aClass22_Sub3_11.anInterface4_14.method5761(local3705).aByte149)) {
											local3719 = -1694498816;
										}
										arg4.method3609((float) local3628, (float) local3632, (float) local3636, (float) local589, (float) local3620, (float) local3624, (float) arg7[local409], (float) arg7[local469], (float) arg7[local529], (float) local3142.aShortArray137[local409] / (float) super.anInt10947, (float) local3142.aShortArray137[local469] / (float) super.anInt10947, (float) local3142.aShortArray137[local529] / (float) super.anInt10947, (float) local3142.aShortArray136[local409] / (float) super.anInt10947, (float) local3142.aShortArray136[local469] / (float) super.anInt10947, (float) local3142.aShortArray136[local529] / (float) super.anInt10947, local3719 | local3142.anIntArray728[local409] & 0xFFFFFF, local3719 | local3142.anIntArray728[local469] & 0xFFFFFF, local3719 | local3142.anIntArray728[local529] & 0xFFFFFF, arg3.anInt6099, arg8[local409], arg8[local469], arg8[local529], local3705);
									} else if ((local3142.anIntArray728[local409] & 0xFFFFFF) != 0) {
										if (local3705 != -1 && this.method8342(this.aClass22_Sub3_11.anInterface4_14.method5761(local3705).aByte149)) {
											arg4.anInt3978 = -1694498816;
										}
										arg4.method3599((float) local3628, (float) local3632, (float) local3636, (float) local589, (float) local3620, (float) local3624, (float) arg7[local409], (float) arg7[local469], (float) arg7[local529], Static650.method8554(local3142.anIntArray728[local409], arg8[local409] << 24 | arg3.anInt6099), Static650.method8554(local3142.anIntArray728[local469], arg8[local469] << 24 | arg3.anInt6099), Static650.method8554(local3142.anIntArray728[local529], arg8[local529] << 24 | arg3.anInt6099));
										arg4.anInt3978 = 0;
									}
								} else if (local3705 != -1) {
									local3719 = -16777216;
									if (local3705 != -1 && this.method8342(this.aClass22_Sub3_11.anInterface4_14.method5761(local3705).aByte149)) {
										local3719 = -1694498816;
									}
									arg4.method3609((float) local3628, (float) local3632, (float) local3636, (float) local589, (float) local3620, (float) local3624, (float) arg7[local409], (float) arg7[local469], (float) arg7[local529], (float) local3142.aShortArray137[local409] / (float) super.anInt10947, (float) local3142.aShortArray137[local469] / (float) super.anInt10947, (float) local3142.aShortArray137[local529] / (float) super.anInt10947, (float) local3142.aShortArray136[local409] / (float) super.anInt10947, (float) local3142.aShortArray136[local469] / (float) super.anInt10947, (float) local3142.aShortArray136[local529] / (float) super.anInt10947, local3719 | local3142.anIntArray728[local409] & 0xFFFFFF, local3719 | local3142.anIntArray728[local469] & 0xFFFFFF, local3719 | local3142.anIntArray728[local529] & 0xFFFFFF, 0, 0, 0, 0, local3705);
								} else if ((local3142.anIntArray728[local409] & 0xFFFFFF) != 0) {
									if (local3705 != -1 && this.method8342(this.aClass22_Sub3_11.anInterface4_14.method5761(local3705).aByte149)) {
										arg4.anInt3978 = -1694498816;
									}
									arg4.method3599((float) local3628, (float) local3632, (float) local3636, (float) local589, (float) local3620, (float) local3624, (float) arg7[local409], (float) arg7[local469], (float) arg7[local529], local3142.anIntArray728[local409], local3142.anIntArray728[local469], local3142.anIntArray728[local529]);
									arg4.anInt3978 = 0;
								}
								arg4.anInt3978 = 0;
							} else {
								arg4.method3610((float) local3628, (float) local3632, (float) local3636, (float) local589, (float) local3620, (float) local3624, (float) arg7[local409], (float) arg7[local469], (float) arg7[local529], arg3.anInt6099);
							}
						}
					}
					return;
				}
				for (local559 = 0; local559 < local3142.aShort116; local559++) {
					local409 = local559 * 3;
					local469 = local409 + 1;
					local529 = local469 + 1;
					local589 = arg5[local409];
					local3620 = arg5[local469];
					local3624 = arg5[local529];
					local3628 = arg6[local409];
					local3632 = arg6[local469];
					local3636 = arg6[local529];
					local3648 = arg8[local409] + arg8[local469] + arg8[local529];
					if ((local589 - local3620) * (local3636 - local3632) - (local3628 - local3632) * (local3624 - local3620) > 0) {
						arg4.aBoolean251 = local589 < 0 || local3620 < 0 || local3624 < 0 || local589 > arg4.anInt3977 || local3620 > arg4.anInt3977 || local3624 > arg4.anInt3977;
						if (local3648 >= 765) {
							arg4.method3610((float) local3628, (float) local3632, (float) local3636, (float) local589, (float) local3620, (float) local3624, (float) arg7[local409], (float) arg7[local469], (float) arg7[local529], arg3.anInt6099);
						} else if (local3648 > 0) {
							if ((local3142.anIntArray728[local409] & 0xFFFFFF) != 0) {
								arg4.method3599((float) local3628, (float) local3632, (float) local3636, (float) local589, (float) local3620, (float) local3624, (float) arg7[local409], (float) arg7[local469], (float) arg7[local529], Static241.method3446(arg8[local409], arg3.anInt6099, local3142.anIntArray728[local409]), Static241.method3446(arg8[local469], arg3.anInt6099, local3142.anIntArray728[local469]), Static241.method3446(arg8[local529], arg3.anInt6099, local3142.anIntArray728[local529]));
							}
						} else if ((local3142.anIntArray728[local409] & 0xFFFFFF) != 0) {
							arg4.method3599((float) local3628, (float) local3632, (float) local3636, (float) local589, (float) local3620, (float) local3624, (float) arg7[local409], (float) arg7[local469], (float) arg7[local529], local3142.anIntArray728[local409], local3142.anIntArray728[local469], local3142.anIntArray728[local529]);
						}
					}
				}
			}
		} else if ((local6.aByte49 & 0x2) == 0) {
			if (arg9 != 0) {
				if ((local6.aByte49 & 0x4) == 0) {
					if ((arg9 & 0x2) != 0) {
						return;
					}
				} else if ((arg9 & 0x1) != 0) {
					return;
				}
			}
			@Pc(45) int local45 = arg0 * super.anInt10947;
			local50 = local45 + super.anInt10947;
			local55 = arg1 * super.anInt10947;
			local60 = local55 + super.anInt10947;
			@Pc(62) int local62 = 0;
			@Pc(64) int local64 = 0;
			@Pc(66) int local66 = 0;
			@Pc(68) int local68 = 0;
			@Pc(111) float local111;
			@Pc(137) float local137;
			@Pc(163) float local163;
			@Pc(189) float local189;
			@Pc(276) int local276;
			@Pc(84) int local84;
			@Pc(863) int local863;
			@Pc(874) int local874;
			@Pc(379) int local379;
			@Pc(439) int local439;
			@Pc(499) int local499;
			@Pc(366) float local366;
			@Pc(426) float local426;
			@Pc(486) float local486;
			@Pc(546) float local546;
			@Pc(396) float local396;
			@Pc(456) float local456;
			@Pc(516) float local516;
			@Pc(576) float local576;
			if ((local6.aByte49 & 0x1) == 0 || arg2) {
				local84 = super.anIntArrayArray68[arg0][arg1];
				local863 = super.anIntArrayArray68[arg0 + 1][arg1];
				local874 = super.anIntArrayArray68[arg0 + 1][arg1 + 1];
				@Pc(883) int local883 = super.anIntArrayArray68[arg0][arg1 + 1];
				if (this.anInt9766 == -1) {
					local111 = this.aFloat166 + this.aFloat164 * (float) local45 + this.aFloat165 * (float) local84 + this.aFloat169 * (float) local55;
					if (local111 <= (float) this.aClass22_Sub3_11.anInt11028) {
						return;
					}
					local137 = this.aFloat166 + this.aFloat164 * (float) local50 + this.aFloat165 * (float) local863 + this.aFloat169 * (float) local55;
					if (local137 <= (float) this.aClass22_Sub3_11.anInt11028) {
						return;
					}
					local163 = this.aFloat166 + this.aFloat164 * (float) local50 + this.aFloat165 * (float) local874 + this.aFloat169 * (float) local60;
					if (local163 <= (float) this.aClass22_Sub3_11.anInt11028) {
						return;
					}
					local189 = this.aFloat166 + this.aFloat164 * (float) local45 + this.aFloat165 * (float) local883 + this.aFloat169 * (float) local60;
					if (local189 <= (float) this.aClass22_Sub3_11.anInt11028) {
						return;
					}
				} else {
					local111 = this.aFloat166 + this.aFloat164 * (float) local45 + this.aFloat165 * (float) local84 + this.aFloat169 * (float) local55;
					local137 = this.aFloat166 + this.aFloat164 * (float) local50 + this.aFloat165 * (float) local863 + this.aFloat169 * (float) local55;
					local163 = this.aFloat166 + this.aFloat164 * (float) local50 + this.aFloat165 * (float) local874 + this.aFloat169 * (float) local60;
					local189 = this.aFloat166 + this.aFloat164 * (float) local45 + this.aFloat165 * (float) local883 + this.aFloat169 * (float) local60;
				}
				if (arg2) {
					local276 = (int) (local111 - (float) arg3.anInt6098);
					if (local276 > 255) {
						local276 = 255;
					}
					@Pc(1116) int local1116;
					if (local276 > 0) {
						local62 = local276;
						local1116 = local6.aShort39 * local276 / 255;
						if (local1116 > 0) {
							local84 -= local1116;
						}
					}
					local276 = (int) (local137 - (float) arg3.anInt6098);
					if (local276 > 255) {
						local276 = 255;
					}
					if (local276 > 0) {
						local64 = local276;
						local1116 = local6.aShort40 * local276 / 255;
						if (local1116 > 0) {
							local863 -= local1116;
						}
					}
					local276 = (int) (local163 - (float) arg3.anInt6098);
					if (local276 > 255) {
						local276 = 255;
					}
					if (local276 > 0) {
						local66 = local276;
						local1116 = local6.aShort36 * local276 / 255;
						if (local1116 > 0) {
							local874 -= local1116;
						}
					}
					local276 = (int) (local189 - (float) arg3.anInt6098);
					if (local276 > 255) {
						local276 = 255;
					}
					if (local276 > 0) {
						local68 = local276;
						local1116 = local6.aShort37 * local276 / 255;
						if (local1116 > 0) {
							local883 -= local1116;
						}
					}
				} else if (arg3.aBoolean394) {
					local276 = (int) (local111 - (float) arg3.anInt6098);
					if (local276 > 0) {
						local62 = local276;
						if (local276 > 255) {
							local62 = 255;
						}
					}
					local276 = (int) (local137 - (float) arg3.anInt6098);
					if (local276 > 0) {
						local64 = local276;
						if (local276 > 255) {
							local64 = 255;
						}
					}
					local276 = (int) (local163 - (float) arg3.anInt6098);
					if (local276 > 0) {
						local66 = local276;
						if (local276 > 255) {
							local66 = 255;
						}
					}
					local276 = (int) (local189 - (float) arg3.anInt6098);
					if (local276 > 0) {
						local68 = local276;
						if (local276 > 255) {
							local68 = 255;
						}
					}
				}
				if (this.anInt9766 == -1) {
					local366 = this.aFloat160 + this.aFloat161 * (float) local45 + this.aFloat167 * (float) local84 + this.aFloat168 * (float) local55;
					local379 = arg4.anInt3974 + (int) (local366 * (float) this.aClass22_Sub3_11.anInt11046 / local111);
					local396 = this.aFloat163 + this.aFloat171 * (float) local45 + this.aFloat162 * (float) local84 + this.aFloat170 * (float) local55;
					local409 = arg4.anInt3975 + (int) (local396 * (float) this.aClass22_Sub3_11.anInt11030 / local111);
					local426 = this.aFloat160 + this.aFloat161 * (float) local50 + this.aFloat167 * (float) local863 + this.aFloat168 * (float) local55;
					local439 = arg4.anInt3974 + (int) (local426 * (float) this.aClass22_Sub3_11.anInt11046 / local137);
					local456 = this.aFloat163 + this.aFloat171 * (float) local50 + this.aFloat162 * (float) local863 + this.aFloat170 * (float) local55;
					local469 = arg4.anInt3975 + (int) (local456 * (float) this.aClass22_Sub3_11.anInt11030 / local137);
					local486 = this.aFloat160 + this.aFloat161 * (float) local50 + this.aFloat167 * (float) local874 + this.aFloat168 * (float) local60;
					local499 = arg4.anInt3974 + (int) (local486 * (float) this.aClass22_Sub3_11.anInt11046 / local163);
					local516 = this.aFloat163 + this.aFloat171 * (float) local50 + this.aFloat162 * (float) local874 + this.aFloat170 * (float) local60;
					local529 = arg4.anInt3975 + (int) (local516 * (float) this.aClass22_Sub3_11.anInt11030 / local163);
					local546 = this.aFloat160 + this.aFloat161 * (float) local45 + this.aFloat167 * (float) local883 + this.aFloat168 * (float) local60;
					local559 = arg4.anInt3974 + (int) (local546 * (float) this.aClass22_Sub3_11.anInt11046 / local189);
					local576 = this.aFloat163 + this.aFloat171 * (float) local45 + this.aFloat162 * (float) local883 + this.aFloat170 * (float) local60;
					local589 = arg4.anInt3975 + (int) (local576 * (float) this.aClass22_Sub3_11.anInt11030 / local189);
				} else {
					local366 = this.aFloat160 + this.aFloat161 * (float) local45 + this.aFloat167 * (float) local84 + this.aFloat168 * (float) local55;
					local379 = arg4.anInt3974 + (int) (local366 * (float) this.aClass22_Sub3_11.anInt11046 / (float) this.anInt9766);
					local396 = this.aFloat163 + this.aFloat171 * (float) local45 + this.aFloat162 * (float) local84 + this.aFloat170 * (float) local55;
					local409 = arg4.anInt3975 + (int) (local396 * (float) this.aClass22_Sub3_11.anInt11030 / (float) this.anInt9766);
					local426 = this.aFloat160 + this.aFloat161 * (float) local50 + this.aFloat167 * (float) local863 + this.aFloat168 * (float) local55;
					local439 = arg4.anInt3974 + (int) (local426 * (float) this.aClass22_Sub3_11.anInt11046 / (float) this.anInt9766);
					local456 = this.aFloat163 + this.aFloat171 * (float) local50 + this.aFloat162 * (float) local863 + this.aFloat170 * (float) local55;
					local469 = arg4.anInt3975 + (int) (local456 * (float) this.aClass22_Sub3_11.anInt11030 / (float) this.anInt9766);
					local486 = this.aFloat160 + this.aFloat161 * (float) local50 + this.aFloat167 * (float) local874 + this.aFloat168 * (float) local60;
					local499 = arg4.anInt3974 + (int) (local486 * (float) this.aClass22_Sub3_11.anInt11046 / (float) this.anInt9766);
					local516 = this.aFloat163 + this.aFloat171 * (float) local50 + this.aFloat162 * (float) local874 + this.aFloat170 * (float) local60;
					local529 = arg4.anInt3975 + (int) (local516 * (float) this.aClass22_Sub3_11.anInt11030 / (float) this.anInt9766);
					local546 = this.aFloat160 + this.aFloat161 * (float) local45 + this.aFloat167 * (float) local883 + this.aFloat168 * (float) local60;
					local559 = arg4.anInt3974 + (int) (local546 * (float) this.aClass22_Sub3_11.anInt11046 / (float) this.anInt9766);
					local576 = this.aFloat163 + this.aFloat171 * (float) local45 + this.aFloat162 * (float) local883 + this.aFloat170 * (float) local60;
					local589 = arg4.anInt3975 + (int) (local576 * (float) this.aClass22_Sub3_11.anInt11030 / (float) this.anInt9766);
				}
			} else {
				local84 = super.anIntArrayArray68[arg0][arg1];
				@Pc(90) float local90 = this.aFloat165 * (float) local84;
				if (this.anInt9766 == -1) {
					local111 = this.aFloat166 + this.aFloat164 * (float) local45 + local90 + this.aFloat169 * (float) local55;
					if (local111 <= (float) this.aClass22_Sub3_11.anInt11028) {
						return;
					}
					local137 = this.aFloat166 + this.aFloat164 * (float) local50 + local90 + this.aFloat169 * (float) local55;
					if (local137 <= (float) this.aClass22_Sub3_11.anInt11028) {
						return;
					}
					local163 = this.aFloat166 + this.aFloat164 * (float) local50 + local90 + this.aFloat169 * (float) local60;
					if (local163 <= (float) this.aClass22_Sub3_11.anInt11028) {
						return;
					}
					local189 = this.aFloat166 + this.aFloat164 * (float) local45 + local90 + this.aFloat169 * (float) local60;
					if (local189 <= (float) this.aClass22_Sub3_11.anInt11028) {
						return;
					}
				} else {
					local111 = this.aFloat166 + this.aFloat164 * (float) local45 + local90 + this.aFloat169 * (float) local55;
					local137 = this.aFloat166 + this.aFloat164 * (float) local50 + local90 + this.aFloat169 * (float) local55;
					local163 = this.aFloat166 + this.aFloat164 * (float) local50 + local90 + this.aFloat169 * (float) local60;
					local189 = this.aFloat166 + this.aFloat164 * (float) local45 + local90 + this.aFloat169 * (float) local60;
				}
				if (arg3.aBoolean394) {
					local276 = (int) (local111 - (float) arg3.anInt6098);
					if (local276 > 0) {
						local62 = local276;
						if (local276 > 255) {
							local62 = 255;
						}
					}
					local276 = (int) (local137 - (float) arg3.anInt6098);
					if (local276 > 0) {
						local64 = local276;
						if (local276 > 255) {
							local64 = 255;
						}
					}
					local276 = (int) (local163 - (float) arg3.anInt6098);
					if (local276 > 0) {
						local66 = local276;
						if (local276 > 255) {
							local66 = 255;
						}
					}
					local276 = (int) (local189 - (float) arg3.anInt6098);
					if (local276 > 0) {
						local68 = local276;
						if (local276 > 255) {
							local68 = 255;
						}
					}
				}
				@Pc(339) float local339 = this.aFloat167 * (float) local84;
				@Pc(345) float local345 = this.aFloat162 * (float) local84;
				if (this.anInt9766 == -1) {
					local366 = this.aFloat160 + this.aFloat161 * (float) local45 + local339 + this.aFloat168 * (float) local55;
					local379 = arg4.anInt3974 + (int) (local366 * (float) this.aClass22_Sub3_11.anInt11046 / local111);
					local396 = this.aFloat163 + this.aFloat171 * (float) local45 + local345 + this.aFloat170 * (float) local55;
					local409 = arg4.anInt3975 + (int) (local396 * (float) this.aClass22_Sub3_11.anInt11030 / local111);
					local426 = this.aFloat160 + this.aFloat161 * (float) local50 + local339 + this.aFloat168 * (float) local55;
					local439 = arg4.anInt3974 + (int) (local426 * (float) this.aClass22_Sub3_11.anInt11046 / local137);
					local456 = this.aFloat163 + this.aFloat171 * (float) local50 + local345 + this.aFloat170 * (float) local55;
					local469 = arg4.anInt3975 + (int) (local456 * (float) this.aClass22_Sub3_11.anInt11030 / local137);
					local486 = this.aFloat160 + this.aFloat161 * (float) local50 + local339 + this.aFloat168 * (float) local60;
					local499 = arg4.anInt3974 + (int) (local486 * (float) this.aClass22_Sub3_11.anInt11046 / local163);
					local516 = this.aFloat163 + this.aFloat171 * (float) local50 + local345 + this.aFloat170 * (float) local60;
					local529 = arg4.anInt3975 + (int) (local516 * (float) this.aClass22_Sub3_11.anInt11030 / local163);
					local546 = this.aFloat160 + this.aFloat161 * (float) local45 + local339 + this.aFloat168 * (float) local60;
					local559 = arg4.anInt3974 + (int) (local546 * (float) this.aClass22_Sub3_11.anInt11046 / local189);
					local576 = this.aFloat163 + this.aFloat171 * (float) local45 + local345 + this.aFloat170 * (float) local60;
					local589 = arg4.anInt3975 + (int) (local576 * (float) this.aClass22_Sub3_11.anInt11030 / local189);
				} else {
					local366 = this.aFloat160 + this.aFloat161 * (float) local45 + local339 + this.aFloat168 * (float) local55;
					local379 = arg4.anInt3974 + (int) (local366 * (float) this.aClass22_Sub3_11.anInt11046 / (float) this.anInt9766);
					local396 = this.aFloat163 + this.aFloat171 * (float) local45 + local345 + this.aFloat170 * (float) local55;
					local409 = arg4.anInt3975 + (int) (local396 * (float) this.aClass22_Sub3_11.anInt11030 / (float) this.anInt9766);
					local426 = this.aFloat160 + this.aFloat161 * (float) local50 + local339 + this.aFloat168 * (float) local55;
					local439 = arg4.anInt3974 + (int) (local426 * (float) this.aClass22_Sub3_11.anInt11046 / (float) this.anInt9766);
					local456 = this.aFloat163 + this.aFloat171 * (float) local50 + local345 + this.aFloat170 * (float) local55;
					local469 = arg4.anInt3975 + (int) (local456 * (float) this.aClass22_Sub3_11.anInt11030 / (float) this.anInt9766);
					local486 = this.aFloat160 + this.aFloat161 * (float) local50 + local339 + this.aFloat168 * (float) local60;
					local499 = arg4.anInt3974 + (int) (local486 * (float) this.aClass22_Sub3_11.anInt11046 / (float) this.anInt9766);
					local516 = this.aFloat163 + this.aFloat171 * (float) local50 + local345 + this.aFloat170 * (float) local60;
					local529 = arg4.anInt3975 + (int) (local516 * (float) this.aClass22_Sub3_11.anInt11030 / (float) this.anInt9766);
					local546 = this.aFloat160 + this.aFloat161 * (float) local45 + local339 + this.aFloat168 * (float) local60;
					local559 = arg4.anInt3974 + (int) (local546 * (float) this.aClass22_Sub3_11.anInt11046 / (float) this.anInt9766);
					local576 = this.aFloat163 + this.aFloat171 * (float) local45 + local345 + this.aFloat170 * (float) local60;
					local589 = arg4.anInt3975 + (int) (local576 * (float) this.aClass22_Sub3_11.anInt11030 / (float) this.anInt9766);
				}
			}
			@Pc(1864) boolean local1864 = local6.aShort38 != -1 && this.method8342(this.aClass22_Sub3_11.anInterface4_14.method5761(local6.aShort38).aByte149);
			if (this.anInt9766 == -1) {
				local863 = local64 + local66 + local68;
				if ((local499 - local559) * (local469 - local589) - (local529 - local589) * (local439 - local559) > 0) {
					arg4.aBoolean251 = local499 < 0 || local559 < 0 || local439 < 0 || local499 > arg4.anInt3977 || local559 > arg4.anInt3977 || local439 > arg4.anInt3977;
					if (local863 >= 765) {
						arg4.method3610((float) local529, (float) local589, (float) local469, (float) local499, (float) local559, (float) local439, (float) (int) local163, (float) (int) local189, (float) (int) local137, arg3.anInt6099);
					} else if (local863 > 0) {
						if (local6.aShort38 >= 0) {
							local874 = -16777216;
							if (local1864) {
								local874 = -1694498816;
							}
							arg4.method3609((float) local529, (float) local589, (float) local469, (float) local499, (float) local559, (float) local439, local163, local189, local137, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, local874 | local6.anInt2109 & 0xFFFFFF, local874 | local6.anInt2112 & 0xFFFFFF, local874 | local6.anInt2111 & 0xFFFFFF, arg3.anInt6099, local66, local68, local64, local6.aShort38);
						} else {
							if (local1864) {
								arg4.anInt3978 = 100;
							}
							arg4.method3599((float) local529, (float) local589, (float) local469, (float) local499, (float) local559, (float) local439, (float) (int) local163, (float) (int) local189, (float) (int) local137, Static650.method8554(local6.anInt2109, local66 << 24 | arg3.anInt6099), Static650.method8554(local6.anInt2112, local68 << 24 | arg3.anInt6099), Static650.method8554(local6.anInt2111, local64 << 24 | arg3.anInt6099));
							arg4.anInt3978 = 0;
						}
					} else if (local6.aShort38 >= 0) {
						local874 = -16777216;
						if (local1864) {
							local874 = -1694498816;
						}
						arg4.method3609((float) local529, (float) local589, (float) local469, (float) local499, (float) local559, (float) local439, local163, local189, local137, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, local874 | local6.anInt2109 & 0xFFFFFF, local874 | local6.anInt2112 & 0xFFFFFF, local874 | local6.anInt2111 & 0xFFFFFF, 0, 0, 0, 0, local6.aShort38);
					} else {
						if (local1864) {
							arg4.anInt3978 = 100;
						}
						arg4.method3599((float) local529, (float) local589, (float) local469, (float) local499, (float) local559, (float) local439, (float) (int) local163, (float) (int) local189, (float) (int) local137, local6.anInt2109, local6.anInt2112, local6.anInt2111);
						arg4.anInt3978 = 0;
					}
				}
				local863 = local62 + local64 + local68;
				if ((local379 - local439) * (local589 - local469) - (local409 - local469) * (local559 - local439) > 0) {
					arg4.aBoolean251 = local379 < 0 || local439 < 0 || local559 < 0 || local379 > arg4.anInt3977 || local439 > arg4.anInt3977 || local559 > arg4.anInt3977;
					if (local863 < 765) {
						if (local1864) {
							arg4.anInt3978 = -1694498816;
						}
						if (local863 > 0) {
							if (local6.aShort38 >= 0) {
								local874 = -16777216;
								if (local1864) {
									local874 = -1694498816;
								}
								arg4.method3609((float) local409, (float) local469, (float) local589, (float) local379, (float) local439, (float) local559, local111, local137, local189, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, local874 | local6.anInt2113 & 0xFFFFFF, local874 | local6.anInt2111 & 0xFFFFFF, local874 | local6.anInt2112 & 0xFFFFFF, arg3.anInt6099, local62, local64, local68, local6.aShort38);
								return;
							}
							if (local1864) {
								arg4.anInt3978 = 100;
							}
							arg4.method3599((float) local409, (float) local469, (float) local589, (float) local379, (float) local439, (float) local559, (float) (int) local111, (float) (int) local137, (float) (int) local189, Static650.method8554(local6.anInt2113, local62 << 24 | arg3.anInt6099), Static650.method8554(local6.anInt2111, local64 << 24 | arg3.anInt6099), Static650.method8554(local6.anInt2112, local68 << 24 | arg3.anInt6099));
							arg4.anInt3978 = 0;
							return;
						}
						if (local6.aShort38 >= 0) {
							local874 = -16777216;
							if (local1864) {
								local874 = -1694498816;
							}
							arg4.method3609((float) local409, (float) local469, (float) local589, (float) local379, (float) local439, (float) local559, local111, local137, local189, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, local874 | local6.anInt2113 & 0xFFFFFF, local874 | local6.anInt2111 & 0xFFFFFF, local874 | local6.anInt2112 & 0xFFFFFF, 0, 0, 0, 0, local6.aShort38);
							return;
						}
						if (local1864) {
							arg4.anInt3978 = 100;
						}
						arg4.method3599((float) local409, (float) local469, (float) local589, (float) local379, (float) local439, (float) local559, (float) (int) local111, (float) (int) local137, (float) (int) local189, local6.anInt2113, local6.anInt2111, local6.anInt2112);
						arg4.anInt3978 = 0;
						return;
					}
					arg4.method3610((float) local409, (float) local469, (float) local589, (float) local379, (float) local439, (float) local559, (float) (int) local111, (float) (int) local137, (float) (int) local189, arg3.anInt6099);
					return;
				}
			} else {
				local863 = local64 + local66 + local68;
				if ((local499 - local559) * (local469 - local589) - (local529 - local589) * (local439 - local559) > 0) {
					arg4.aBoolean251 = local499 < 0 || local559 < 0 || local439 < 0 || local499 > arg4.anInt3977 || local559 > arg4.anInt3977 || local439 > arg4.anInt3977;
					if (local863 < 765) {
						if (local1864) {
							arg4.anInt3978 = -1694498816;
						}
						if (local863 > 0) {
							if (local6.aShort38 >= 0) {
								local874 = -16777216;
								if (local1864) {
									local874 = -1694498816;
								}
								arg4.method3609((float) local529, (float) local589, (float) local469, (float) local499, (float) local559, (float) local439, local163, local189, local137, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, local874 | local6.anInt2109 & 0xFFFFFF, local874 | local6.anInt2112 & 0xFFFFFF, local874 | local6.anInt2111 & 0xFFFFFF, arg3.anInt6099, local66, local68, local64, local6.aShort38);
							} else {
								if (local1864) {
									arg4.anInt3978 = 100;
								}
								arg4.method3599((float) local529, (float) local589, (float) local469, (float) local499, (float) local559, (float) local439, (float) (int) local163, (float) (int) local189, (float) (int) local137, Static650.method8554(local6.anInt2109, local66 << 24 | arg3.anInt6099), Static650.method8554(local6.anInt2112, local68 << 24 | arg3.anInt6099), Static650.method8554(local6.anInt2111, local64 << 24 | arg3.anInt6099));
								arg4.anInt3978 = 0;
							}
						} else if (local6.aShort38 >= 0) {
							local874 = -16777216;
							if (local1864) {
								local874 = -1694498816;
							}
							arg4.method3609((float) local529, (float) local589, (float) local469, (float) local499, (float) local559, (float) local439, local163, local189, local137, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, local874 | local6.anInt2109 & 0xFFFFFF, local874 | local6.anInt2112 & 0xFFFFFF, local874 | local6.anInt2111 & 0xFFFFFF, 0, 0, 0, 0, local6.aShort38);
						} else {
							if (local1864) {
								arg4.anInt3978 = 100;
							}
							arg4.method3599((float) local529, (float) local589, (float) local469, (float) local499, (float) local559, (float) local439, (float) (int) local163, (float) (int) local189, (float) (int) local137, local6.anInt2109, local6.anInt2112, local6.anInt2111);
							arg4.anInt3978 = 0;
						}
					} else {
						arg4.method3610((float) local529, (float) local589, (float) local469, (float) local499, (float) local559, (float) local439, (float) (int) local163, (float) (int) local189, (float) (int) local137, arg3.anInt6099);
					}
				}
				local863 = local62 + local64 + local68;
				if ((local379 - local439) * (local589 - local469) - (local409 - local469) * (local559 - local439) > 0) {
					arg4.aBoolean251 = local379 < 0 || local439 < 0 || local559 < 0 || local379 > arg4.anInt3977 || local439 > arg4.anInt3977 || local559 > arg4.anInt3977;
					if (local863 < 765) {
						if (local1864) {
							arg4.anInt3978 = -1694498816;
						}
						if (local863 > 0) {
							if (local6.aShort38 >= 0) {
								local874 = -16777216;
								if (local1864) {
									local874 = -1694498816;
								}
								arg4.method3609((float) local409, (float) local469, (float) local589, (float) local379, (float) local439, (float) local559, local111, local137, local189, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, local874 | local6.anInt2113 & 0xFFFFFF, local874 | local6.anInt2111 & 0xFFFFFF, local874 | local6.anInt2112 & 0xFFFFFF, arg3.anInt6099, local62, local64, local68, local6.aShort38);
								return;
							}
							if (local1864) {
								arg4.anInt3978 = 100;
							}
							arg4.method3599((float) local409, (float) local469, (float) local589, (float) local379, (float) local439, (float) local559, (float) (int) local111, (float) (int) local137, (float) (int) local189, Static650.method8554(local6.anInt2113, local62 << 24 | arg3.anInt6099), Static650.method8554(local6.anInt2111, local64 << 24 | arg3.anInt6099), Static650.method8554(local6.anInt2112, local68 << 24 | arg3.anInt6099));
							arg4.anInt3978 = 0;
							return;
						}
						if (local6.aShort38 >= 0) {
							local874 = -16777216;
							if (local1864) {
								local874 = -1694498816;
							}
							arg4.method3609((float) local409, (float) local469, (float) local589, (float) local379, (float) local439, (float) local559, local111, local137, local189, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, local874 | local6.anInt2113 & 0xFFFFFF, local874 | local6.anInt2111 & 0xFFFFFF, local874 | local6.anInt2112 & 0xFFFFFF, 0, 0, 0, 0, local6.aShort38);
							return;
						}
						if (local1864) {
							arg4.anInt3978 = 100;
						}
						arg4.method3599((float) local409, (float) local469, (float) local589, (float) local379, (float) local439, (float) local559, (float) (int) local111, (float) (int) local137, (float) (int) local189, local6.anInt2113, local6.anInt2111, local6.anInt2112);
						arg4.anInt3978 = 0;
						return;
					}
					arg4.method3610((float) local409, (float) local469, (float) local589, (float) local379, (float) local439, (float) local559, (float) (int) local111, (float) (int) local137, (float) (int) local189, arg3.anInt6099);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method9293(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		@Pc(4) Class239 local4 = this.aClass22_Sub3_11.method9423(Thread.currentThread());
		@Pc(7) Class166 local7 = local4.aClass166_2;
		local7.anInt3978 = 0;
		local7.aBoolean251 = true;
		this.aClass22_Sub3_11.ya();
		if (this.aClass66ArrayArray1 != null || this.aClass383ArrayArray1 != null) {
			this.method8339(arg0, arg1, arg2, arg3, arg4, local4, local7, local4.anIntArray459, local4.anIntArray455);
		} else if (this.aClass312ArrayArray1 != null) {
			this.method8343(arg0, arg1, arg2, arg3, arg4, local4, local7, local4.anIntArray459, local4.anIntArray455);
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(I)Z")
	private boolean method8342(@OriginalArg(0) int arg0) {
		if ((this.anInt9767 & 0x8) == 0) {
			return false;
		} else if (arg0 == 4) {
			return true;
		} else if (arg0 == 8) {
			return true;
		} else {
			return arg0 == 9;
		}
	}

	@OriginalMember(owner = "client!ts", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		@Pc(9) boolean local9 = (this.anInt9767 & 0x20) == 0;
		if (this.aClass66ArrayArray1 == null && !local9) {
			this.aClass66ArrayArray1 = new Class66[super.anInt10949][super.anInt10946];
			this.aClass376ArrayArray1 = new Class376[super.anInt10949][super.anInt10946];
		} else if (this.aClass383ArrayArray1 == null && local9) {
			this.aClass383ArrayArray1 = new Class383[super.anInt10949][super.anInt10946];
		} else if (this.aClass312ArrayArray1 != null) {
			throw new IllegalStateException();
		}
		if (arg2 == null || arg2.length == 0) {
			return;
		}
		for (@Pc(67) int local67 = 0; local67 < arg6.length; local67++) {
			if (arg6[local67] == -1) {
				arg6[local67] = 0;
			} else {
				arg6[local67] = Static546.anIntArray610[Static150.method2497(arg6[local67]) & 0xFFFF] << 8 | 0xFF;
			}
		}
		if (arg7 != null) {
			for (@Pc(106) int local106 = 0; local106 < arg7.length; local106++) {
				if (arg7[local106] == -1) {
					arg7[local106] = 0;
				} else {
					arg7[local106] = Static546.anIntArray610[Static150.method2497(arg7[local106]) & 0xFFFF] << 8 | 0xFF;
				}
			}
		}
		@Pc(205) int local205;
		@Pc(210) int local210;
		@Pc(214) int local214;
		@Pc(236) int local236;
		@Pc(363) int local363;
		@Pc(410) int local410;
		@Pc(498) int local498;
		@Pc(530) int local530;
		if (local9) {
			@Pc(147) Class383 local147 = new Class383();
			local147.aShort118 = (short) arg2.length;
			local147.aShort117 = (short) (arg2.length / 3);
			local147.aShortArray146 = new short[local147.aShort118];
			local147.aShortArray145 = new short[local147.aShort118];
			local147.aShortArray144 = new short[local147.aShort118];
			local147.anIntArray753 = new int[local147.aShort118];
			local147.aShortArray142 = new short[local147.aShort118];
			local147.aShortArray147 = new short[local147.aShort118];
			local147.aByteArray106 = new byte[local147.aShort118];
			if (arg5 != null) {
				local147.aShortArray143 = new short[local147.aShort118];
			}
			for (local205 = 0; local205 < local147.aShort118; local205++) {
				local210 = arg2[local205];
				local214 = arg4[local205];
				if (local210 == 0 && local214 == 0) {
					local236 = this.aByteArrayArray18[arg0][arg1] - this.aByteArrayArray17[arg0][arg1];
				} else if (local210 == 0 && local214 == super.anInt10947) {
					local236 = this.aByteArrayArray18[arg0][arg1 + 1] - this.aByteArrayArray17[arg0][arg1 + 1];
				} else if (local210 == super.anInt10947 && local214 == super.anInt10947) {
					local236 = this.aByteArrayArray18[arg0 + 1][arg1 + 1] - this.aByteArrayArray17[arg0 + 1][arg1 + 1];
				} else if (local210 == super.anInt10947 && local214 == 0) {
					local236 = this.aByteArrayArray18[arg0 + 1][arg1] - this.aByteArrayArray17[arg0 + 1][arg1];
				} else {
					local363 = (this.aByteArrayArray18[arg0][arg1] - this.aByteArrayArray17[arg0][arg1]) * (super.anInt10947 - local210) + (this.aByteArrayArray18[arg0 + 1][arg1] - this.aByteArrayArray17[arg0 + 1][arg1]) * local210;
					local410 = (this.aByteArrayArray18[arg0][arg1 + 1] - this.aByteArrayArray17[arg0][arg1 + 1]) * (super.anInt10947 - local210) + (this.aByteArrayArray18[arg0 + 1][arg1 + 1] - this.aByteArrayArray17[arg0 + 1][arg1 + 1]) * local210;
					local236 = local363 * (super.anInt10947 - local214) + local410 * local214 >> super.anInt10943 * 2;
				}
				local363 = (arg0 << super.anInt10943) + local210;
				local410 = (arg1 << super.anInt10943) + local214;
				local147.aShortArray146[local205] = (short) local210;
				local147.aShortArray144[local205] = (short) local214;
				local147.aShortArray145[local205] = (short) (this.method9294(local410, local363) + (arg3 == null ? 0 : arg3[local205]));
				if (local236 < 0) {
					local236 = 0;
				}
				if (arg6[local205] == 0) {
					local147.anIntArray753[local205] = 0;
					if (arg7 != null) {
						local147.aByteArray106[local205] = (byte) local236;
					}
				} else {
					local498 = 0;
					if (arg5 != null) {
						@Pc(510) short local510 = local147.aShortArray143[local205] = (short) arg5[local205];
						if (arg11 != 0) {
							local498 = local510 * 255 / arg11;
							if (local498 < 0) {
								local498 = 0;
							} else if (local498 > 255) {
								local498 = 255;
							}
						}
					}
					local530 = -16777216;
					if (arg8[local205] != -1 && this.method8342(this.aClass22_Sub3_11.anInterface4_14.method5761(arg8[local205]).aByte149)) {
						local530 = -1694498816;
					}
					local147.anIntArray753[local205] = local530 | Static241.method3446(local498, arg10, Static736.method8341(arg6[local205] >> 8, local236));
					if (arg7 != null) {
						local147.aByteArray106[local205] = (byte) local236;
					}
				}
				local147.aShortArray142[local205] = (short) arg8[local205];
				local147.aShortArray147[local205] = (short) arg9[local205];
			}
			if (arg7 != null) {
				local147.anIntArray754 = new int[local147.aShort117];
			}
			for (local210 = 0; local210 < local147.aShort117; local210++) {
				local214 = local210 * 3;
				if (arg7 != null && arg7[local214] != 0) {
					local147.anIntArray754[local210] = arg7[local214] >> 8 | 0xFF000000;
				}
			}
			this.aClass383ArrayArray1[arg0][arg1] = local147;
			return;
		}
		@Pc(654) boolean local654 = true;
		local205 = -1;
		local210 = -1;
		local214 = -1;
		local236 = -1;
		if (arg2.length == 6) {
			for (local363 = 0; local363 < 6; local363++) {
				if (arg2[local363] == 0 && arg4[local363] == 0) {
					if (local205 != -1 && arg6[local205] != arg6[local363]) {
						local654 = false;
						break;
					}
					local205 = local363;
				} else if (arg2[local363] == super.anInt10947 && arg4[local363] == 0) {
					if (local210 != -1 && arg6[local210] != arg6[local363]) {
						local654 = false;
						break;
					}
					local210 = local363;
				} else if (arg2[local363] == super.anInt10947 && arg4[local363] == super.anInt10947) {
					if (local214 != -1 && arg6[local214] != arg6[local363]) {
						local654 = false;
						break;
					}
					local214 = local363;
				} else if (arg2[local363] == 0 && arg4[local363] == super.anInt10947) {
					if (local236 != -1 && arg6[local236] != arg6[local363]) {
						local654 = false;
						break;
					}
					local236 = local363;
				}
			}
			if (local205 == -1 || local210 == -1 || local214 == -1 || local236 == -1) {
				local654 = false;
			}
			if (local654) {
				if (arg3 != null) {
					for (local410 = 0; local410 < 4; local410++) {
						if (arg3[local410] != 0) {
							local654 = false;
							break;
						}
					}
				}
				if (local654) {
					for (local410 = 1; local410 < 4; local410++) {
						if (arg2[local410] != arg2[0] && arg2[local410] != arg2[0] + super.anInt10947 && arg2[local410] != arg2[0] - super.anInt10947) {
							local654 = false;
							break;
						}
						if (arg4[local410] != arg4[0] && arg4[local410] != arg4[0] + super.anInt10947 && arg4[local410] != arg4[0] - super.anInt10947) {
							local654 = false;
							break;
						}
					}
				}
			}
		} else {
			local654 = false;
		}
		if (!local654) {
			@Pc(1760) Class376 local1760 = new Class376();
			local1760.aShort115 = (short) arg2.length;
			local1760.aShort116 = (short) (arg2.length / 3);
			local1760.aShortArray137 = new short[local1760.aShort115];
			local1760.aShortArray133 = new short[local1760.aShort115];
			local1760.aShortArray136 = new short[local1760.aShort115];
			local1760.anIntArray728 = new int[local1760.aShort115];
			if (arg5 != null) {
				local1760.aShortArray134 = new short[local1760.aShort115];
			}
			@Pc(1834) int local1834;
			@Pc(1961) int local1961;
			@Pc(2008) int local2008;
			@Pc(2098) int local2098;
			for (local410 = 0; local410 < local1760.aShort115; local410++) {
				local498 = arg2[local410];
				local530 = arg4[local410];
				if (local498 == 0 && local530 == 0) {
					local1834 = this.aByteArrayArray18[arg0][arg1] - this.aByteArrayArray17[arg0][arg1];
				} else if (local498 == 0 && local530 == super.anInt10947) {
					local1834 = this.aByteArrayArray18[arg0][arg1 + 1] - this.aByteArrayArray17[arg0][arg1 + 1];
				} else if (local498 == super.anInt10947 && local530 == super.anInt10947) {
					local1834 = this.aByteArrayArray18[arg0 + 1][arg1 + 1] - this.aByteArrayArray17[arg0 + 1][arg1 + 1];
				} else if (local498 == super.anInt10947 && local530 == 0) {
					local1834 = this.aByteArrayArray18[arg0 + 1][arg1] - this.aByteArrayArray17[arg0 + 1][arg1];
				} else {
					local1961 = (this.aByteArrayArray18[arg0][arg1] - this.aByteArrayArray17[arg0][arg1]) * (super.anInt10947 - local498) + (this.aByteArrayArray18[arg0 + 1][arg1] - this.aByteArrayArray17[arg0 + 1][arg1]) * local498;
					local2008 = (this.aByteArrayArray18[arg0][arg1 + 1] - this.aByteArrayArray17[arg0][arg1 + 1]) * (super.anInt10947 - local498) + (this.aByteArrayArray18[arg0 + 1][arg1 + 1] - this.aByteArrayArray17[arg0 + 1][arg1 + 1]) * local498;
					local1834 = local1961 * (super.anInt10947 - local530) + local2008 * local530 >> super.anInt10943 * 2;
				}
				local1961 = (arg0 << super.anInt10943) + local498;
				local2008 = (arg1 << super.anInt10943) + local530;
				local1760.aShortArray137[local410] = (short) local498;
				local1760.aShortArray136[local410] = (short) local530;
				local1760.aShortArray133[local410] = (short) (this.method9294(local2008, local1961) + (arg3 == null ? 0 : arg3[local410]));
				if (local1834 < 0) {
					local1834 = 0;
				}
				if (arg6[local410] != 0) {
					local2098 = 0;
					if (arg5 != null) {
						@Pc(2110) short local2110 = local1760.aShortArray134[local410] = (short) arg5[local410];
						if (arg11 != 0) {
							local2098 = local2110 * 255 / arg11;
							if (local2098 < 0) {
								local2098 = 0;
							} else if (local2098 > 255) {
								local2098 = 255;
							}
						}
					}
					local1760.anIntArray728[local410] = Static241.method3446(local2098, arg10, Static736.method8341(arg6[local410] >> 8, local1834));
					if (arg7 != null) {
						local1760.anIntArray728[local410] |= local1834 << 25;
					}
				} else if (arg7 == null) {
					local1760.anIntArray728[local410] = 0;
				} else {
					local1760.anIntArray728[local410] = local1834 << 25;
				}
			}
			@Pc(2164) boolean local2164 = false;
			for (local530 = 0; local530 < local1760.aShort116; local530++) {
				if (arg8[local530 * 3] != -1 && !this.aClass22_Sub3_11.anInterface4_14.method5761(arg8[local530 * 3]).aBoolean761) {
					local2164 = true;
				}
			}
			if (arg7 != null) {
				local1760.anIntArray729 = new int[local1760.aShort116];
			}
			if (local2164) {
				local1760.aShortArray135 = new short[local1760.aShort116];
				local1760.aShortArray138 = new short[local1760.aShort116];
			}
			for (local1834 = 0; local1834 < local1760.aShort116; local1834++) {
				local1961 = local1834 * 3;
				if (arg7 != null && arg7[local1961] != 0) {
					local1760.anIntArray729[local1834] = arg7[local1961] >> 8;
				}
				if (local2164) {
					local2008 = local1961 + 1;
					local2098 = local2008 + 1;
					@Pc(2258) boolean local2258 = false;
					@Pc(2260) boolean local2260 = true;
					@Pc(2264) int local2264 = arg8[local1961];
					if (local2264 == -1 || this.aClass22_Sub3_11.anInterface4_14.method5761(local2264).aBoolean761) {
						local2260 = false;
					} else {
						local2258 = true;
					}
					local2264 = arg8[local2008];
					if (local2264 == -1 || this.aClass22_Sub3_11.anInterface4_14.method5761(local2264).aBoolean761) {
						local2260 = false;
					} else {
						local2258 = true;
					}
					local2264 = arg8[local2098];
					if (local2264 == -1 || this.aClass22_Sub3_11.anInterface4_14.method5761(local2264).aBoolean761) {
						local2260 = false;
					} else {
						local2258 = true;
					}
					if (local2260) {
						local1760.aShortArray135[local1834] = (short) local2264;
						local1760.aShortArray138[local1834] = (short) arg9[local1961];
					} else {
						if (local2258) {
							local2264 = arg8[local1961];
							if (local2264 != -1 && !this.aClass22_Sub3_11.anInterface4_14.method5761(local2264).aBoolean761) {
								local1760.anIntArray728[local1961] = Static546.anIntArray610[Static150.method2497(this.aClass22_Sub3_11.anInterface4_14.method5761(local2264).aShort127 & 0xFFFF) & 0xFFFF];
							}
							local2264 = arg8[local2008];
							if (local2264 != -1 && !this.aClass22_Sub3_11.anInterface4_14.method5761(local2264).aBoolean761) {
								local1760.anIntArray728[local2008] = Static546.anIntArray610[Static150.method2497(this.aClass22_Sub3_11.anInterface4_14.method5761(local2264).aShort127 & 0xFFFF) & 0xFFFF];
							}
							local2264 = arg8[local2098];
							if (local2264 != -1 && !this.aClass22_Sub3_11.anInterface4_14.method5761(local2264).aBoolean761) {
								local1760.anIntArray728[local2098] = Static546.anIntArray610[Static150.method2497(this.aClass22_Sub3_11.anInterface4_14.method5761(local2264).aShort127 & 0xFFFF) & 0xFFFF];
							}
						}
						local1760.aShortArray135[local1834] = -1;
					}
				}
			}
			this.aClass376ArrayArray1[arg0][arg1] = local1760;
			return;
		}
		@Pc(931) Class66 local931 = new Class66();
		local410 = arg6[0];
		local498 = arg8[0];
		if (arg7 != null) {
			local931.anInt2110 = arg7[0] >> 8;
			if (local410 == 0) {
				local931.aByte49 = (byte) (local931.aByte49 | 0x2);
			}
		} else if (local410 == 0) {
			return;
		}
		if (super.anIntArrayArray68[arg0][arg1] == super.anIntArrayArray68[arg0 + 1][arg1] && super.anIntArrayArray68[arg0][arg1] == super.anIntArrayArray68[arg0 + 1][arg1 + 1] && super.anIntArrayArray68[arg0][arg1] == super.anIntArrayArray68[arg0][arg1 + 1]) {
			local931.aByte49 = (byte) (local931.aByte49 | 0x1);
		}
		if (local498 == -1 || (local931.aByte49 & 0x2) != 0 || this.aClass22_Sub3_11.anInterface4_14.method5761(local498).aBoolean761) {
			if (arg5 == null || arg11 == 0) {
				local530 = 0;
			} else {
				local530 = arg5[local205] * 255 / arg11;
				if (local530 < 0) {
					local530 = 0;
				} else if (local530 > 255) {
					local530 = 255;
				}
			}
			local931.anInt2113 = Static241.method3446(local530, arg10, Static736.method8341(arg6[local205] >> 8, this.aByteArrayArray18[arg0][arg1] - this.aByteArrayArray17[arg0][arg1]));
			if (local931.anInt2110 != 0) {
				local931.anInt2113 |= this.aByteArrayArray17[arg0][arg1] + 255 - this.aByteArrayArray18[arg0][arg1] << 25;
			}
			if (arg5 == null || arg11 == 0) {
				local530 = 0;
			} else {
				local530 = arg5[local210] * 255 / arg11;
				if (local530 < 0) {
					local530 = 0;
				} else if (local530 > 255) {
					local530 = 255;
				}
			}
			local931.anInt2111 = Static241.method3446(local530, arg10, Static736.method8341(arg6[local210] >> 8, this.aByteArrayArray18[arg0 + 1][arg1] - this.aByteArrayArray17[arg0 + 1][arg1]));
			if (local931.anInt2110 != 0) {
				local931.anInt2111 |= this.aByteArrayArray17[arg0 + 1][arg1] + 255 - this.aByteArrayArray18[arg0 + 1][arg1] << 25;
			}
			if (arg5 == null || arg11 == 0) {
				local530 = 0;
			} else {
				local530 = arg5[local214] * 255 / arg11;
				if (local530 < 0) {
					local530 = 0;
				} else if (local530 > 255) {
					local530 = 255;
				}
			}
			local931.anInt2109 = Static241.method3446(local530, arg10, Static736.method8341(arg6[local214] >> 8, this.aByteArrayArray18[arg0 + 1][arg1 + 1] - this.aByteArrayArray17[arg0 + 1][arg1 + 1]));
			if (local931.anInt2110 != 0) {
				local931.anInt2109 |= this.aByteArrayArray17[arg0 + 1][arg1 + 1] + 255 - this.aByteArrayArray18[arg0 + 1][arg1 + 1] << 25;
			}
			if (arg5 == null || arg11 == 0) {
				local530 = 0;
			} else {
				local530 = arg5[local236] * 255 / arg11;
				if (local530 < 0) {
					local530 = 0;
				} else if (local530 > 255) {
					local530 = 255;
				}
			}
			local931.anInt2112 = Static241.method3446(local530, arg10, Static736.method8341(arg6[local236] >> 8, this.aByteArrayArray18[arg0][arg1 + 1] - this.aByteArrayArray17[arg0][arg1 + 1]));
			if (local931.anInt2110 != 0) {
				local931.anInt2112 |= this.aByteArrayArray17[arg0][arg1 + 1] + 255 - this.aByteArrayArray18[arg0][arg1 + 1] << 25;
			}
			local931.aShort38 = -1;
		} else {
			if (arg5 == null || arg11 == 0) {
				local530 = 0;
			} else {
				local530 = arg5[local205] * 255 / arg11;
				if (local530 < 0) {
					local530 = 0;
				} else if (local530 > 255) {
					local530 = 255;
				}
			}
			local931.anInt2113 = Static241.method3446(local530, arg10, Static736.method8341(arg6[local205] >> 8, this.aByteArrayArray18[arg0][arg1] - this.aByteArrayArray17[arg0][arg1]));
			if (local931.anInt2110 != 0) {
				local931.anInt2113 |= this.aByteArrayArray17[arg0][arg1] + 255 - this.aByteArrayArray18[arg0][arg1] << 25;
			}
			if (arg5 == null || arg11 == 0) {
				local530 = 0;
			} else {
				local530 = arg5[local210] * 255 / arg11;
				if (local530 < 0) {
					local530 = 0;
				} else if (local530 > 255) {
					local530 = 255;
				}
			}
			local931.anInt2111 = Static241.method3446(local530, arg10, Static736.method8341(arg6[local210] >> 8, this.aByteArrayArray18[arg0 + 1][arg1] - this.aByteArrayArray17[arg0 + 1][arg1]));
			if (local931.anInt2110 != 0) {
				local931.anInt2111 |= this.aByteArrayArray17[arg0 + 1][arg1] + 255 - this.aByteArrayArray18[arg0 + 1][arg1] << 25;
			}
			if (arg5 == null || arg11 == 0) {
				local530 = 0;
			} else {
				local530 = arg5[local214] * 255 / arg11;
				if (local530 < 0) {
					local530 = 0;
				} else if (local530 > 255) {
					local530 = 255;
				}
			}
			local931.anInt2109 = Static241.method3446(local530, arg10, Static736.method8341(arg6[local214] >> 8, this.aByteArrayArray18[arg0 + 1][arg1 + 1] - this.aByteArrayArray17[arg0 + 1][arg1 + 1]));
			if (local931.anInt2110 != 0) {
				local931.anInt2109 |= this.aByteArrayArray17[arg0 + 1][arg1 + 1] + 255 - this.aByteArrayArray18[arg0 + 1][arg1 + 1] << 25;
			}
			if (arg5 == null || arg11 == 0) {
				local530 = 0;
			} else {
				local530 = arg5[local236] * 255 / arg11;
				if (local530 < 0) {
					local530 = 0;
				} else if (local530 > 255) {
					local530 = 255;
				}
			}
			local931.anInt2112 = Static241.method3446(local530, arg10, Static736.method8341(arg6[local236] >> 8, this.aByteArrayArray18[arg0][arg1 + 1] - this.aByteArrayArray17[arg0][arg1 + 1]));
			local931.aShort38 = (short) local498;
		}
		if (arg5 != null) {
			local931.aShort36 = (short) arg5[local214];
			local931.aShort37 = (short) arg5[local236];
			local931.aShort40 = (short) arg5[local210];
			local931.aShort39 = (short) arg5[local205];
		}
		this.aClass66ArrayArray1[arg0][arg1] = local931;
	}

	@OriginalMember(owner = "client!ts", name = "CA", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void CA(@OriginalArg(0) Class3_Sub7_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IIIIIII[[ZLclient!lw;Lclient!ht;[I[I)V")
	private void method8343(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(8) Class239 arg5, @OriginalArg(9) Class166 arg6, @OriginalArg(10) int[] arg7, @OriginalArg(11) int[] arg8) {
		@Pc(7) int local7 = (arg3 - arg1) * 1024 / 256;
		@Pc(14) boolean local14 = arg5.aBoolean395;
		this.aClass22_Sub3_11.C(false);
		arg6.aBoolean252 = false;
		arg6.aBoolean255 = false;
		@Pc(26) int local26 = 0;
		@Pc(30) int local30 = local7;
		for (@Pc(32) int local32 = arg0; local32 < arg2; local32++) {
			for (@Pc(35) int local35 = arg1; local35 < arg3; local35++) {
				if (arg4[local32 - arg0][local35 - arg1]) {
					@Pc(85) int local85;
					if (this.aClass312ArrayArray1[local32][local35] != null) {
						@Pc(62) Class312 local62 = this.aClass312ArrayArray1[local32][local35];
						if (local62.aShort88 != -1 && (local62.aByte116 & 0x2) == 0 && local62.anInt8284 == -1) {
							local85 = this.aClass22_Sub3_11.method9412(local62.aShort88);
							arg6.method3591((float) (local30 - 4), (float) (local30 - 4), (float) local30, (float) (local26 + 4), (float) local26, (float) (local26 + 4), 100.0F, 100.0F, 100.0F, (float) Static276.method3877(local85, local62.aShort91 & 0xFFFF), (float) Static276.method3877(local85, local62.aShort89 & 0xFFFF), (float) Static276.method3877(local85, local62.aShort87 & 0xFFFF));
							arg6.method3591((float) local30, (float) local30, (float) (local30 - 4), (float) local26, (float) (local26 + 4), (float) local26, 100.0F, 100.0F, 100.0F, (float) Static276.method3877(local85, local62.aShort90 & 0xFFFF), (float) Static276.method3877(local85, local62.aShort87 & 0xFFFF), (float) Static276.method3877(local85, local62.aShort89 & 0xFFFF));
						} else if (local62.anInt8284 == -1) {
							arg6.method3591((float) (local30 - 4), (float) (local30 - 4), (float) local30, (float) (local26 + 4), (float) local26, (float) (local26 + 4), 100.0F, 100.0F, 100.0F, (float) (local62.aShort91 & 0xFFFF), (float) (local62.aShort89 & 0xFFFF), (float) (local62.aShort87 & 0xFFFF));
							arg6.method3591((float) local30, (float) local30, (float) (local30 - 4), (float) local26, (float) (local26 + 4), (float) local26, 100.0F, 100.0F, 100.0F, (float) (local62.aShort90 & 0xFFFF), (float) (local62.aShort87 & 0xFFFF), (float) (local62.aShort89 & 0xFFFF));
						} else {
							local85 = local62.anInt8284;
							arg6.method3591((float) (local30 - 4), (float) (local30 - 4), (float) local30, (float) (local26 + 4), (float) local26, (float) (local26 + 4), 100.0F, 100.0F, 100.0F, (float) local85, (float) local85, (float) local85);
							arg6.method3591((float) local30, (float) local30, (float) (local30 - 4), (float) local26, (float) (local26 + 4), (float) local26, 100.0F, 100.0F, 100.0F, (float) local85, (float) local85, (float) local85);
						}
					} else if (this.aClass190ArrayArray1[local32][local35] != null) {
						@Pc(338) Class190 local338 = this.aClass190ArrayArray1[local32][local35];
						for (local85 = 0; local85 < local338.aShort61; local85++) {
							arg7[local85] = local26 + local338.aShortArray65[local85] * 4 / super.anInt10947;
							arg8[local85] = local30 - local338.aShortArray63[local85] * 4 / super.anInt10947;
						}
						for (@Pc(376) int local376 = 0; local376 < local338.aShort62; local376++) {
							@Pc(382) short local382 = local338.aShortArray64[local376];
							@Pc(387) short local387 = local338.aShortArray62[local376];
							@Pc(392) short local392 = local338.aShortArray59[local376];
							@Pc(396) int local396 = arg7[local382];
							@Pc(400) int local400 = arg7[local387];
							@Pc(404) int local404 = arg7[local392];
							@Pc(408) int local408 = arg8[local382];
							@Pc(412) int local412 = arg8[local387];
							@Pc(416) int local416 = arg8[local392];
							@Pc(432) int local432;
							if (local338.anIntArray357 != null && local338.anIntArray357[local376] != -1) {
								local432 = local338.anIntArray357[local376];
								arg6.method3591((float) local408, (float) local412, (float) local416, (float) local396, (float) local400, (float) local404, 100.0F, 100.0F, 100.0F, (float) Static276.method3877(local432, local338.aShortArray61[local382]), (float) Static276.method3877(local432, local338.aShortArray61[local387]), (float) Static276.method3877(local432, local338.aShortArray61[local392]));
							} else if (local338.aShortArray57 == null || local338.aShortArray57[local376] == -1) {
								local432 = local338.anIntArray358[local376];
								arg6.method3591((float) local408, (float) local412, (float) local416, (float) local396, (float) local400, (float) local404, 100.0F, 100.0F, 100.0F, (float) Static276.method3877(local432, local338.aShortArray61[local382]), (float) Static276.method3877(local432, local338.aShortArray61[local387]), (float) Static276.method3877(local432, local338.aShortArray61[local392]));
							} else {
								local432 = this.aClass22_Sub3_11.method9412(local338.aShortArray57[local376]);
								arg6.method3591((float) local408, (float) local412, (float) local416, (float) local396, (float) local400, (float) local404, 100.0F, 100.0F, 100.0F, (float) Static276.method3877(local432, local338.aShortArray61[local382]), (float) Static276.method3877(local432, local338.aShortArray61[local387]), (float) Static276.method3877(local432, local338.aShortArray61[local392]));
							}
						}
					}
				}
				local30 -= 4;
			}
			local30 = local7;
			local26 += 4;
		}
		arg6.aBoolean252 = true;
		this.aClass22_Sub3_11.C(local14);
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IILclient!ht;[I[I[I[II)V")
	private void method8344(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class166 arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int arg7) {
		@Pc(6) Class312 local6 = this.aClass312ArrayArray1[arg0][arg1];
		@Pc(50) int local50;
		@Pc(60) int local60;
		@Pc(480) int local480;
		@Pc(510) int local510;
		if (local6 == null) {
			@Pc(2204) Class190 local2204 = this.aClass190ArrayArray1[arg0][arg1];
			if (local2204 != null) {
				if (arg7 != 0) {
					if ((local2204.aByte66 & 0x4) == 0) {
						if ((arg7 & 0x2) != 0) {
							return;
						}
					} else if ((arg7 & 0x1) != 0) {
						return;
					}
				}
				@Pc(2253) short local2253;
				@Pc(2314) float local2314;
				@Pc(2335) float local2335;
				@Pc(2284) float local2284;
				if (this.anInt9766 == -1) {
					for (local480 = 0; local480 < local2204.aShort61; local480++) {
						local50 = local2204.aShortArray65[local480] + (arg0 << super.anInt10943);
						local2253 = local2204.aShortArray58[local480];
						local60 = local2204.aShortArray63[local480] + (arg1 << super.anInt10943);
						local2284 = this.aFloat166 + this.aFloat164 * (float) local50 + this.aFloat165 * (float) local2253 + this.aFloat169 * (float) local60;
						if (local2284 <= (float) this.aClass22_Sub3_11.anInt11028) {
							return;
						}
						local2314 = this.aFloat160 + this.aFloat161 * (float) local50 + this.aFloat167 * (float) local2253 + this.aFloat168 * (float) local60;
						local2335 = this.aFloat163 + this.aFloat171 * (float) local50 + this.aFloat162 * (float) local2253 + this.aFloat170 * (float) local60;
						arg3[local480] = arg2.anInt3974 + (int) (local2314 * (float) this.aClass22_Sub3_11.anInt11046 / local2284);
						arg4[local480] = arg2.anInt3975 + (int) (local2335 * (float) this.aClass22_Sub3_11.anInt11030 / local2284);
						arg5[local480] = (int) local2284;
					}
				} else {
					for (local480 = 0; local480 < local2204.aShort61; local480++) {
						local50 = local2204.aShortArray65[local480] + (arg0 << super.anInt10943);
						local2253 = local2204.aShortArray58[local480];
						local60 = local2204.aShortArray63[local480] + (arg1 << super.anInt10943);
						local2284 = this.aFloat166 + this.aFloat164 * (float) local50 + this.aFloat165 * (float) local2253 + this.aFloat169 * (float) local60;
						local2314 = this.aFloat160 + this.aFloat161 * (float) local50 + this.aFloat167 * (float) local2253 + this.aFloat168 * (float) local60;
						local2335 = this.aFloat163 + this.aFloat171 * (float) local50 + this.aFloat162 * (float) local2253 + this.aFloat170 * (float) local60;
						arg3[local480] = arg2.anInt3974 + (int) (local2314 * (float) this.aClass22_Sub3_11.anInt11046 / (float) this.anInt9766);
						arg4[local480] = arg2.anInt3975 + (int) (local2335 * (float) this.aClass22_Sub3_11.anInt11030 / (float) this.anInt9766);
						arg5[local480] = (int) local2284;
					}
				}
				@Pc(2531) short local2531;
				@Pc(2536) short local2536;
				@Pc(2541) short local2541;
				@Pc(2549) int local2549;
				@Pc(2553) int local2553;
				@Pc(2557) int local2557;
				@Pc(2561) int local2561;
				@Pc(2565) int local2565;
				if (local2204.aShortArray57 != null) {
					@Pc(2753) int local2753;
					@Pc(2622) short local2622;
					if (this.anInt9766 == -1) {
						for (local480 = 0; local480 < local2204.aShort62; local480++) {
							local2531 = local2204.aShortArray64[local480];
							local2536 = local2204.aShortArray62[local480];
							local2541 = local2204.aShortArray59[local480];
							local510 = arg3[local2531];
							local2549 = arg3[local2536];
							local2553 = arg3[local2541];
							local2557 = arg4[local2531];
							local2561 = arg4[local2536];
							local2565 = arg4[local2541];
							if ((local510 - local2549) * (local2565 - local2561) - (local2557 - local2561) * (local2553 - local2549) > 0) {
								arg2.aBoolean251 = local510 < 0 || local2549 < 0 || local2553 < 0 || local510 > arg2.anInt3977 || local2549 > arg2.anInt3977 || local2553 > arg2.anInt3977;
								local2622 = local2204.aShortArray57[local480];
								if (local2622 == -1) {
									local2753 = local2204.anIntArray358[local480];
									if (local2753 != -1) {
										arg2.method3591((float) local2557, (float) local2561, (float) local2565, (float) local510, (float) local2549, (float) local2553, (float) arg5[local2531], (float) arg5[local2536], (float) arg5[local2541], (float) Static276.method3877(local2753, local2204.aShortArray61[local2531]), (float) Static276.method3877(local2753, local2204.aShortArray61[local2536]), (float) Static276.method3877(local2753, local2204.aShortArray61[local2541]));
									}
								} else {
									arg2.method3609((float) local2557, (float) local2561, (float) local2565, (float) local510, (float) local2549, (float) local2553, (float) arg5[local2531], (float) arg5[local2536], (float) arg5[local2541], (float) local2204.aShortArray65[local2531] / (float) super.anInt10947, (float) local2204.aShortArray65[local2536] / (float) super.anInt10947, (float) local2204.aShortArray65[local2541] / (float) super.anInt10947, (float) local2204.aShortArray63[local2531] / (float) super.anInt10947, (float) local2204.aShortArray63[local2536] / (float) super.anInt10947, (float) local2204.aShortArray63[local2541] / (float) super.anInt10947, Static546.anIntArray610[local2204.aShortArray61[local2531] & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static546.anIntArray610[local2204.aShortArray61[local2536] & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static546.anIntArray610[local2204.aShortArray61[local2541] & 0xFFFF] & 0xFFFFFF | 0xFF000000, 0, 0, 0, 0, local2622);
								}
							}
						}
						return;
					}
					for (local480 = 0; local480 < local2204.aShort62; local480++) {
						local2531 = local2204.aShortArray64[local480];
						local2536 = local2204.aShortArray62[local480];
						local2541 = local2204.aShortArray59[local480];
						local510 = arg3[local2531];
						local2549 = arg3[local2536];
						local2553 = arg3[local2541];
						local2557 = arg4[local2531];
						local2561 = arg4[local2536];
						local2565 = arg4[local2541];
						if ((local510 - local2549) * (local2565 - local2561) - (local2557 - local2561) * (local2553 - local2549) > 0) {
							arg2.aBoolean251 = local510 < 0 || local2549 < 0 || local2553 < 0 || local510 > arg2.anInt3977 || local2549 > arg2.anInt3977 || local2553 > arg2.anInt3977;
							local2622 = local2204.aShortArray57[local480];
							if (local2622 == -1) {
								local2753 = local2204.anIntArray358[local480];
								if (local2753 != -1) {
									arg2.method3591((float) local2557, (float) local2561, (float) local2565, (float) local510, (float) local2549, (float) local2553, (float) arg5[local2531], (float) arg5[local2536], (float) arg5[local2541], (float) Static276.method3877(local2753, local2204.aShortArray61[local2531]), (float) Static276.method3877(local2753, local2204.aShortArray61[local2536]), (float) Static276.method3877(local2753, local2204.aShortArray61[local2541]));
								}
							} else {
								arg2.method3609((float) local2557, (float) local2561, (float) local2565, (float) local510, (float) local2549, (float) local2553, (float) arg5[local2531], (float) arg5[local2536], (float) arg5[local2541], (float) local2204.aShortArray65[local2531] / (float) super.anInt10947, (float) local2204.aShortArray65[local2536] / (float) super.anInt10947, (float) local2204.aShortArray65[local2541] / (float) super.anInt10947, (float) local2204.aShortArray63[local2531] / (float) super.anInt10947, (float) local2204.aShortArray63[local2536] / (float) super.anInt10947, (float) local2204.aShortArray63[local2541] / (float) super.anInt10947, Static546.anIntArray610[local2204.aShortArray61[local2531] & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static546.anIntArray610[local2204.aShortArray61[local2536] & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static546.anIntArray610[local2204.aShortArray61[local2541] & 0xFFFF] & 0xFFFFFF | 0xFF000000, 0, 0, 0, 0, local2622);
							}
						}
					}
					return;
				}
				for (local480 = 0; local480 < local2204.aShort62; local480++) {
					local2531 = local2204.aShortArray64[local480];
					local2536 = local2204.aShortArray62[local480];
					local2541 = local2204.aShortArray59[local480];
					local510 = arg3[local2531];
					local2549 = arg3[local2536];
					local2553 = arg3[local2541];
					local2557 = arg4[local2531];
					local2561 = arg4[local2536];
					local2565 = arg4[local2541];
					if ((local510 - local2549) * (local2565 - local2561) - (local2557 - local2561) * (local2553 - local2549) > 0) {
						@Pc(3170) int local3170 = local2204.anIntArray358[local480];
						if (local3170 != -1) {
							arg2.aBoolean251 = local510 < 0 || local2549 < 0 || local2553 < 0 || local510 > arg2.anInt3977 || local2549 > arg2.anInt3977 || local2553 > arg2.anInt3977;
							arg2.method3591((float) local2557, (float) local2561, (float) local2565, (float) local510, (float) local2549, (float) local2553, (float) arg5[local2531], (float) arg5[local2536], (float) arg5[local2541], (float) Static276.method3877(local3170, local2204.aShortArray61[local2531]), (float) Static276.method3877(local3170, local2204.aShortArray61[local2536]), (float) Static276.method3877(local3170, local2204.aShortArray61[local2541]));
						}
					}
				}
			}
		} else if ((local6.aByte116 & 0x2) == 0) {
			if (arg7 != 0) {
				if ((local6.aByte116 & 0x4) == 0) {
					if ((arg7 & 0x2) != 0) {
						return;
					}
				} else if ((arg7 & 0x1) != 0) {
					return;
				}
			}
			@Pc(45) int local45 = arg0 * super.anInt10947;
			local50 = local45 + super.anInt10947;
			@Pc(55) int local55 = arg1 * super.anInt10947;
			local60 = local55 + super.anInt10947;
			@Pc(497) float local497;
			@Pc(99) float local99;
			@Pc(125) float local125;
			@Pc(151) float local151;
			@Pc(177) float local177;
			@Pc(72) int local72;
			@Pc(300) int local300;
			@Pc(360) int local360;
			@Pc(420) int local420;
			@Pc(330) int local330;
			@Pc(390) int local390;
			@Pc(450) int local450;
			@Pc(287) float local287;
			@Pc(347) float local347;
			@Pc(407) float local407;
			@Pc(467) float local467;
			@Pc(317) float local317;
			@Pc(377) float local377;
			@Pc(437) float local437;
			if ((local6.aByte116 & 0x1) == 0) {
				local72 = super.anIntArrayArray68[arg0][arg1];
				@Pc(784) int local784 = super.anIntArrayArray68[arg0 + 1][arg1];
				@Pc(795) int local795 = super.anIntArrayArray68[arg0 + 1][arg1 + 1];
				@Pc(804) int local804 = super.anIntArrayArray68[arg0][arg1 + 1];
				if (this.anInt9766 == -1) {
					local99 = this.aFloat166 + this.aFloat164 * (float) local45 + this.aFloat165 * (float) local72 + this.aFloat169 * (float) local55;
					if (local99 <= (float) this.aClass22_Sub3_11.anInt11028) {
						return;
					}
					local125 = this.aFloat166 + this.aFloat164 * (float) local50 + this.aFloat165 * (float) local784 + this.aFloat169 * (float) local55;
					if (local125 <= (float) this.aClass22_Sub3_11.anInt11028) {
						return;
					}
					local151 = this.aFloat166 + this.aFloat164 * (float) local50 + this.aFloat165 * (float) local795 + this.aFloat169 * (float) local60;
					if (local151 <= (float) this.aClass22_Sub3_11.anInt11028) {
						return;
					}
					local177 = this.aFloat166 + this.aFloat164 * (float) local45 + this.aFloat165 * (float) local804 + this.aFloat169 * (float) local60;
					if (local177 <= (float) this.aClass22_Sub3_11.anInt11028) {
						return;
					}
					local287 = this.aFloat160 + this.aFloat161 * (float) local45 + this.aFloat167 * (float) local72 + this.aFloat168 * (float) local55;
					local300 = arg2.anInt3974 + (int) (local287 * (float) this.aClass22_Sub3_11.anInt11046 / local99);
					local317 = this.aFloat163 + this.aFloat171 * (float) local45 + this.aFloat162 * (float) local72 + this.aFloat170 * (float) local55;
					local330 = arg2.anInt3975 + (int) (local317 * (float) this.aClass22_Sub3_11.anInt11030 / local99);
					local347 = this.aFloat160 + this.aFloat161 * (float) local50 + this.aFloat167 * (float) local784 + this.aFloat168 * (float) local55;
					local360 = arg2.anInt3974 + (int) (local347 * (float) this.aClass22_Sub3_11.anInt11046 / local125);
					local377 = this.aFloat163 + this.aFloat171 * (float) local50 + this.aFloat162 * (float) local784 + this.aFloat170 * (float) local55;
					local390 = arg2.anInt3975 + (int) (local377 * (float) this.aClass22_Sub3_11.anInt11030 / local125);
					local407 = this.aFloat160 + this.aFloat161 * (float) local50 + this.aFloat167 * (float) local795 + this.aFloat168 * (float) local60;
					local420 = arg2.anInt3974 + (int) (local407 * (float) this.aClass22_Sub3_11.anInt11046 / local151);
					local437 = this.aFloat163 + this.aFloat171 * (float) local50 + this.aFloat162 * (float) local795 + this.aFloat170 * (float) local60;
					local450 = arg2.anInt3975 + (int) (local437 * (float) this.aClass22_Sub3_11.anInt11030 / local151);
					local467 = this.aFloat160 + this.aFloat161 * (float) local45 + this.aFloat167 * (float) local804 + this.aFloat168 * (float) local60;
					local480 = arg2.anInt3974 + (int) (local467 * (float) this.aClass22_Sub3_11.anInt11046 / local177);
					local497 = this.aFloat163 + this.aFloat171 * (float) local45 + this.aFloat162 * (float) local804 + this.aFloat170 * (float) local60;
					local510 = arg2.anInt3975 + (int) (local497 * (float) this.aClass22_Sub3_11.anInt11030 / local177);
				} else {
					local99 = this.aFloat166 + this.aFloat164 * (float) local45 + this.aFloat165 * (float) local72 + this.aFloat169 * (float) local55;
					local125 = this.aFloat166 + this.aFloat164 * (float) local50 + this.aFloat165 * (float) local784 + this.aFloat169 * (float) local55;
					local151 = this.aFloat166 + this.aFloat164 * (float) local50 + this.aFloat165 * (float) local795 + this.aFloat169 * (float) local60;
					local177 = this.aFloat166 + this.aFloat164 * (float) local45 + this.aFloat165 * (float) local804 + this.aFloat169 * (float) local60;
					local287 = this.aFloat160 + this.aFloat161 * (float) local45 + this.aFloat167 * (float) local72 + this.aFloat168 * (float) local55;
					local300 = arg2.anInt3974 + (int) (local287 * (float) this.aClass22_Sub3_11.anInt11046 / (float) this.anInt9766);
					local317 = this.aFloat163 + this.aFloat171 * (float) local45 + this.aFloat162 * (float) local72 + this.aFloat170 * (float) local55;
					local330 = arg2.anInt3975 + (int) (local317 * (float) this.aClass22_Sub3_11.anInt11030 / (float) this.anInt9766);
					local347 = this.aFloat160 + this.aFloat161 * (float) local50 + this.aFloat167 * (float) local784 + this.aFloat168 * (float) local55;
					local360 = arg2.anInt3974 + (int) (local347 * (float) this.aClass22_Sub3_11.anInt11046 / (float) this.anInt9766);
					local377 = this.aFloat163 + this.aFloat171 * (float) local50 + this.aFloat162 * (float) local784 + this.aFloat170 * (float) local55;
					local390 = arg2.anInt3975 + (int) (local377 * (float) this.aClass22_Sub3_11.anInt11030 / (float) this.anInt9766);
					local407 = this.aFloat160 + this.aFloat161 * (float) local50 + this.aFloat167 * (float) local795 + this.aFloat168 * (float) local60;
					local420 = arg2.anInt3974 + (int) (local407 * (float) this.aClass22_Sub3_11.anInt11046 / (float) this.anInt9766);
					local437 = this.aFloat163 + this.aFloat171 * (float) local50 + this.aFloat162 * (float) local795 + this.aFloat170 * (float) local60;
					local450 = arg2.anInt3975 + (int) (local437 * (float) this.aClass22_Sub3_11.anInt11030 / (float) this.anInt9766);
					local467 = this.aFloat160 + this.aFloat161 * (float) local45 + this.aFloat167 * (float) local804 + this.aFloat168 * (float) local60;
					local480 = arg2.anInt3974 + (int) (local467 * (float) this.aClass22_Sub3_11.anInt11046 / (float) this.anInt9766);
					local497 = this.aFloat163 + this.aFloat171 * (float) local45 + this.aFloat162 * (float) local804 + this.aFloat170 * (float) local60;
					local510 = arg2.anInt3975 + (int) (local497 * (float) this.aClass22_Sub3_11.anInt11030 / (float) this.anInt9766);
				}
			} else {
				local72 = super.anIntArrayArray68[arg0][arg1];
				@Pc(78) float local78 = this.aFloat165 * (float) local72;
				if (this.anInt9766 == -1) {
					local99 = this.aFloat166 + this.aFloat164 * (float) local45 + local78 + this.aFloat169 * (float) local55;
					if (local99 <= (float) this.aClass22_Sub3_11.anInt11028) {
						return;
					}
					local125 = this.aFloat166 + this.aFloat164 * (float) local50 + local78 + this.aFloat169 * (float) local55;
					if (local125 <= (float) this.aClass22_Sub3_11.anInt11028) {
						return;
					}
					local151 = this.aFloat166 + this.aFloat164 * (float) local50 + local78 + this.aFloat169 * (float) local60;
					if (local151 <= (float) this.aClass22_Sub3_11.anInt11028) {
						return;
					}
					local177 = this.aFloat166 + this.aFloat164 * (float) local45 + local78 + this.aFloat169 * (float) local60;
					if (local177 <= (float) this.aClass22_Sub3_11.anInt11028) {
						return;
					}
				} else {
					local99 = this.aFloat166 + this.aFloat164 * (float) local45 + local78 + this.aFloat169 * (float) local55;
					local125 = this.aFloat166 + this.aFloat164 * (float) local50 + local78 + this.aFloat169 * (float) local55;
					local151 = this.aFloat166 + this.aFloat164 * (float) local50 + local78 + this.aFloat169 * (float) local60;
					local177 = this.aFloat166 + this.aFloat164 * (float) local45 + local78 + this.aFloat169 * (float) local60;
				}
				@Pc(260) float local260 = this.aFloat167 * (float) local72;
				@Pc(266) float local266 = this.aFloat162 * (float) local72;
				if (this.anInt9766 == -1) {
					local287 = this.aFloat160 + this.aFloat161 * (float) local45 + local260 + this.aFloat168 * (float) local55;
					local300 = arg2.anInt3974 + (int) (local287 * (float) this.aClass22_Sub3_11.anInt11046 / local99);
					local317 = this.aFloat163 + this.aFloat171 * (float) local45 + local266 + this.aFloat170 * (float) local55;
					local330 = arg2.anInt3975 + (int) (local317 * (float) this.aClass22_Sub3_11.anInt11030 / local99);
					local347 = this.aFloat160 + this.aFloat161 * (float) local50 + local260 + this.aFloat168 * (float) local55;
					local360 = arg2.anInt3974 + (int) (local347 * (float) this.aClass22_Sub3_11.anInt11046 / local125);
					local377 = this.aFloat163 + this.aFloat171 * (float) local50 + local266 + this.aFloat170 * (float) local55;
					local390 = arg2.anInt3975 + (int) (local377 * (float) this.aClass22_Sub3_11.anInt11030 / local125);
					local407 = this.aFloat160 + this.aFloat161 * (float) local50 + local260 + this.aFloat168 * (float) local60;
					local420 = arg2.anInt3974 + (int) (local407 * (float) this.aClass22_Sub3_11.anInt11046 / local151);
					local437 = this.aFloat163 + this.aFloat171 * (float) local50 + local266 + this.aFloat170 * (float) local60;
					local450 = arg2.anInt3975 + (int) (local437 * (float) this.aClass22_Sub3_11.anInt11030 / local151);
					local467 = this.aFloat160 + this.aFloat161 * (float) local45 + local260 + this.aFloat168 * (float) local60;
					local480 = arg2.anInt3974 + (int) (local467 * (float) this.aClass22_Sub3_11.anInt11046 / local177);
					local497 = this.aFloat163 + this.aFloat171 * (float) local45 + local266 + this.aFloat170 * (float) local60;
					local510 = arg2.anInt3975 + (int) (local497 * (float) this.aClass22_Sub3_11.anInt11030 / local177);
				} else {
					local287 = this.aFloat160 + this.aFloat161 * (float) local45 + local260 + this.aFloat168 * (float) local55;
					local300 = arg2.anInt3974 + (int) (local287 * (float) this.aClass22_Sub3_11.anInt11046 / (float) this.anInt9766);
					local317 = this.aFloat163 + this.aFloat171 * (float) local45 + local266 + this.aFloat170 * (float) local55;
					local330 = arg2.anInt3975 + (int) (local317 * (float) this.aClass22_Sub3_11.anInt11030 / (float) this.anInt9766);
					local347 = this.aFloat160 + this.aFloat161 * (float) local50 + local260 + this.aFloat168 * (float) local55;
					local360 = arg2.anInt3974 + (int) (local347 * (float) this.aClass22_Sub3_11.anInt11046 / (float) this.anInt9766);
					local377 = this.aFloat163 + this.aFloat171 * (float) local50 + local266 + this.aFloat170 * (float) local55;
					local390 = arg2.anInt3975 + (int) (local377 * (float) this.aClass22_Sub3_11.anInt11030 / (float) this.anInt9766);
					local407 = this.aFloat160 + this.aFloat161 * (float) local50 + local260 + this.aFloat168 * (float) local60;
					local420 = arg2.anInt3974 + (int) (local407 * (float) this.aClass22_Sub3_11.anInt11046 / (float) this.anInt9766);
					local437 = this.aFloat163 + this.aFloat171 * (float) local50 + local266 + this.aFloat170 * (float) local60;
					local450 = arg2.anInt3975 + (int) (local437 * (float) this.aClass22_Sub3_11.anInt11030 / (float) this.anInt9766);
					local467 = this.aFloat160 + this.aFloat161 * (float) local45 + local260 + this.aFloat168 * (float) local60;
					local480 = arg2.anInt3974 + (int) (local467 * (float) this.aClass22_Sub3_11.anInt11046 / (float) this.anInt9766);
					local497 = this.aFloat163 + this.aFloat171 * (float) local45 + local266 + this.aFloat170 * (float) local60;
					local510 = arg2.anInt3975 + (int) (local497 * (float) this.aClass22_Sub3_11.anInt11030 / (float) this.anInt9766);
				}
			}
			if (this.anInt9766 == -1) {
				if ((local420 - local480) * (local390 - local510) - (local450 - local510) * (local360 - local480) > 0) {
					arg2.aBoolean251 = local420 < 0 || local480 < 0 || local360 < 0 || local420 > arg2.anInt3977 || local480 > arg2.anInt3977 || local360 > arg2.anInt3977;
					if (local6.aShort88 >= 0) {
						arg2.method3609((float) local450, (float) local510, (float) local390, (float) local420, (float) local480, (float) local360, local151, local177, local125, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, Static546.anIntArray610[local6.aShort91 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static546.anIntArray610[local6.aShort89 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static546.anIntArray610[local6.aShort87 & 0xFFFF] & 0xFFFFFF | 0xFF000000, 0, 0, 0, 0, local6.aShort88);
					} else {
						arg2.method3591((float) local450, (float) local510, (float) local390, (float) local420, (float) local480, (float) local360, (float) (int) local151, (float) (int) local177, (float) (int) local125, (float) (local6.aShort91 & 0xFFFF), (float) (local6.aShort89 & 0xFFFF), (float) (local6.aShort87 & 0xFFFF));
					}
				}
				if ((local300 - local360) * (local510 - local390) - (local330 - local390) * (local480 - local360) > 0) {
					arg2.aBoolean251 = local300 < 0 || local360 < 0 || local480 < 0 || local300 > arg2.anInt3977 || local360 > arg2.anInt3977 || local480 > arg2.anInt3977;
					if (local6.aShort88 >= 0) {
						arg2.method3609((float) local330, (float) local390, (float) local510, (float) local300, (float) local360, (float) local480, local99, local125, local177, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, Static546.anIntArray610[local6.aShort90 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static546.anIntArray610[local6.aShort87 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static546.anIntArray610[local6.aShort89 & 0xFFFF] & 0xFFFFFF | 0xFF000000, 0, 0, 0, 0, local6.aShort88);
						return;
					}
					arg2.method3591((float) local330, (float) local390, (float) local510, (float) local300, (float) local360, (float) local480, (float) (int) local99, (float) (int) local125, (float) (int) local177, (float) (local6.aShort90 & 0xFFFF), (float) (local6.aShort87 & 0xFFFF), (float) (local6.aShort89 & 0xFFFF));
					return;
				}
			} else {
				if ((local420 - local480) * (local390 - local510) - (local450 - local510) * (local360 - local480) > 0) {
					arg2.aBoolean251 = local420 < 0 || local480 < 0 || local360 < 0 || local420 > arg2.anInt3977 || local480 > arg2.anInt3977 || local360 > arg2.anInt3977;
					if (local6.aShort88 >= 0) {
						arg2.method3609((float) local450, (float) local510, (float) local390, (float) local420, (float) local480, (float) local360, local151, local177, local125, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, Static546.anIntArray610[local6.aShort91 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static546.anIntArray610[local6.aShort89 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static546.anIntArray610[local6.aShort87 & 0xFFFF] & 0xFFFFFF | 0xFF000000, 0, 0, 0, 0, local6.aShort88);
					} else {
						arg2.method3591((float) local450, (float) local510, (float) local390, (float) local420, (float) local480, (float) local360, (float) (int) local151, (float) (int) local177, (float) (int) local125, (float) (local6.aShort91 & 0xFFFF), (float) (local6.aShort89 & 0xFFFF), (float) (local6.aShort87 & 0xFFFF));
					}
				}
				if ((local300 - local360) * (local510 - local390) - (local330 - local390) * (local480 - local360) > 0) {
					arg2.aBoolean251 = local300 < 0 || local360 < 0 || local480 < 0 || local300 > arg2.anInt3977 || local360 > arg2.anInt3977 || local480 > arg2.anInt3977;
					if (local6.aShort88 >= 0) {
						arg2.method3609((float) local330, (float) local390, (float) local510, (float) local300, (float) local360, (float) local480, local99, local125, local177, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, Static546.anIntArray610[local6.aShort90 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static546.anIntArray610[local6.aShort87 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static546.anIntArray610[local6.aShort89 & 0xFFFF] & 0xFFFFFF | 0xFF000000, 0, 0, 0, 0, local6.aShort88);
						return;
					}
					arg2.method3591((float) local330, (float) local390, (float) local510, (float) local300, (float) local360, (float) local480, (float) (int) local99, (float) (int) local125, (float) (int) local177, (float) (local6.aShort90 & 0xFFFF), (float) (local6.aShort87 & 0xFFFF), (float) (local6.aShort89 & 0xFFFF));
				}
			}
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(Lclient!r;IIIIZ)Z")
	@Override
	public boolean method9297(@OriginalArg(0) Class3_Sub7_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return false;
	}

	@OriginalMember(owner = "client!ts", name = "fa", descriptor = "(IILclient!r;)Lclient!r;")
	@Override
	public Class3_Sub7_Sub17 fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub7_Sub17 arg2) {
		return null;
	}

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "(III)V")
	private void method8345(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class239 local4 = this.aClass22_Sub3_11.method9423(Thread.currentThread());
		local4.aClass166_2.anInt3978 = 0;
		if (this.aClass66ArrayArray1 != null) {
			this.method8340(arg0, arg1, local4.aBoolean396, local4, local4.aClass166_2, local4.anIntArray459, local4.anIntArray455, local4.anIntArray458, local4.anIntArray464, arg2);
		} else if (this.aClass312ArrayArray1 != null) {
			this.method8344(arg0, arg1, local4.aClass166_2, local4.anIntArray459, local4.anIntArray455, local4.anIntArray458, local4.anIntArray464, arg2);
		} else if (this.aClass383ArrayArray1 != null) {
			this.method8338(arg0, arg1, local4.aBoolean396, local4, local4.aClass166_2, local4.anIntArray459, local4.anIntArray455, local4.anIntArray458, local4.anIntArray464, arg2);
		}
	}
}
