import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!br")
public final class Class40_Sub1 extends Class40 {

	@OriginalMember(owner = "client!br", name = "l", descriptor = "F")
	private float aFloat9;

	@OriginalMember(owner = "client!br", name = "m", descriptor = "F")
	private float aFloat10;

	@OriginalMember(owner = "client!br", name = "n", descriptor = "[[Lclient!uha;")
	private Class343[][] aClass343ArrayArray1;

	@OriginalMember(owner = "client!br", name = "o", descriptor = "[[Lclient!mp;")
	private Class233[][] aClass233ArrayArray1;

	@OriginalMember(owner = "client!br", name = "p", descriptor = "F")
	private float aFloat11;

	@OriginalMember(owner = "client!br", name = "r", descriptor = "F")
	private float aFloat12;

	@OriginalMember(owner = "client!br", name = "s", descriptor = "F")
	private float aFloat13;

	@OriginalMember(owner = "client!br", name = "t", descriptor = "F")
	private float aFloat14;

	@OriginalMember(owner = "client!br", name = "u", descriptor = "[[Lclient!mba;")
	private Class220[][] aClass220ArrayArray1;

	@OriginalMember(owner = "client!br", name = "v", descriptor = "[[Lclient!vd;")
	private Class353[][] aClass353ArrayArray1;

	@OriginalMember(owner = "client!br", name = "x", descriptor = "F")
	private float aFloat15;

	@OriginalMember(owner = "client!br", name = "y", descriptor = "F")
	private float aFloat16;

	@OriginalMember(owner = "client!br", name = "z", descriptor = "F")
	private float aFloat17;

	@OriginalMember(owner = "client!br", name = "A", descriptor = "F")
	private float aFloat18;

	@OriginalMember(owner = "client!br", name = "C", descriptor = "F")
	private float aFloat19;

	@OriginalMember(owner = "client!br", name = "E", descriptor = "F")
	private float aFloat20;

	@OriginalMember(owner = "client!br", name = "F", descriptor = "[[Lclient!dn;")
	private Class78[][] aClass78ArrayArray1;

	@OriginalMember(owner = "client!br", name = "B", descriptor = "I")
	private int anInt809 = -1;

	@OriginalMember(owner = "client!br", name = "G", descriptor = "Lclient!gf;")
	private final Class126_Sub1 aClass126_Sub1_1;

	@OriginalMember(owner = "client!br", name = "q", descriptor = "I")
	private final int anInt808;

	@OriginalMember(owner = "client!br", name = "D", descriptor = "[[B")
	private byte[][] aByteArrayArray3;

	@OriginalMember(owner = "client!br", name = "w", descriptor = "[[B")
	private byte[][] aByteArrayArray2;

	@OriginalMember(owner = "client!br", name = "<init>", descriptor = "(Lclient!gf;IIII[[I[[II)V")
	public Class40_Sub1(@OriginalArg(0) Class126_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass126_Sub1_1 = arg0;
		this.anInt808 = arg2;
		this.aByteArrayArray3 = new byte[arg3 + 1][arg4 + 1];
		@Pc(29) int local29 = this.aClass126_Sub1_1.anInt3242 >> 9;
		for (@Pc(31) int local31 = 1; local31 < arg4; local31++) {
			for (@Pc(34) int local34 = 1; local34 < arg3; local34++) {
				@Pc(53) int local53 = arg6[local34 + 1][local31] - arg6[local34 - 1][local31];
				@Pc(69) int local69 = arg6[local34][local31 + 1] - arg6[local34][local31 - 1];
				@Pc(84) int local84 = (int) Math.sqrt((double) (local53 * local53 + arg7 * 512 + local69 * local69));
				@Pc(90) int local90 = (local53 << 8) / local84;
				@Pc(96) int local96 = arg7 * -512 / local84;
				@Pc(102) int local102 = (local69 << 8) / local84;
				@Pc(124) int local124 = local29 + (this.aClass126_Sub1_1.anInt3230 * local90 + this.aClass126_Sub1_1.anInt3220 * local96 + this.aClass126_Sub1_1.anInt3227 * local102 >> 17);
				local124 >>= 0x1;
				if (local124 < 2) {
					local124 = 2;
				} else if (local124 > 126) {
					local124 = 126;
				}
				this.aByteArrayArray3[local34][local31] = (byte) local124;
			}
		}
		this.aByteArrayArray2 = new byte[arg3 + 1][arg4 + 1];
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(II)V")
	@Override
	public void method8445(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method833(arg0, arg1, 0);
	}

	@OriginalMember(owner = "client!br", name = "b", descriptor = "(III)V")
	private void method833(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class223 local4 = this.aClass126_Sub1_1.method2894(Thread.currentThread());
		local4.aClass263_1.anInt7081 = 0;
		if (this.aClass353ArrayArray1 != null) {
			this.method839(arg0, arg1, local4.aBoolean496, local4, local4.aClass263_1, local4.anIntArray458, local4.anIntArray452, local4.anIntArray460, local4.anIntArray455, arg2);
		} else if (this.aClass220ArrayArray1 != null) {
			this.method837(arg0, arg1, local4.aClass263_1, local4.anIntArray458, local4.anIntArray452, local4.anIntArray460, local4.anIntArray455, arg2);
		} else if (this.aClass233ArrayArray1 != null) {
			this.method834(arg0, arg1, local4.aBoolean496, local4, local4.aClass263_1, local4.anIntArray458, local4.anIntArray452, local4.anIntArray460, local4.anIntArray455, arg2);
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IIZLclient!mda;Lclient!or;[I[I[I[II)V")
	private void method834(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class223 arg3, @OriginalArg(4) Class263 arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int arg9) {
		@Pc(6) Class233 local6 = this.aClass233ArrayArray1[arg0][arg1];
		if (arg9 != 0 && (arg9 & 0x2) != 0 || local6 == null) {
			return;
		}
		@Pc(32) int local32;
		@Pc(37) int local37;
		@Pc(47) int local47;
		@Pc(162) float local162;
		@Pc(183) float local183;
		@Pc(68) float local68;
		@Pc(21) int local21;
		@Pc(89) int local89;
		@Pc(109) int local109;
		if (this.anInt809 == -1) {
			for (local21 = 0; local21 < local6.aShort83; local21++) {
				local32 = local6.aShortArray87[local21] + (arg0 << super.anInt9919);
				local37 = local6.aShortArray83[local21];
				local47 = local6.aShortArray86[local21] + (arg1 << super.anInt9919);
				local68 = this.aFloat17 + this.aFloat13 * (float) local32 + this.aFloat18 * (float) local37 + this.aFloat16 * (float) local47;
				if (local68 <= (float) this.aClass126_Sub1_1.anInt3229) {
					return;
				}
				arg8[local21] = 0;
				if (arg2) {
					local89 = (int) (local68 - (float) arg3.anInt5963);
					if (local89 > 255) {
						local89 = 255;
					}
					if (local89 > 0) {
						arg8[local21] = local89;
						local109 = local6.aShortArray85[local21] * local89 / 255;
						if (local109 > 0) {
							local37 -= local109;
						}
					}
				} else if (arg3.aBoolean497) {
					local89 = (int) (local68 - (float) arg3.anInt5963);
					if (local89 > 0) {
						arg8[local21] = local89;
						if (arg8[local21] > 255) {
							arg8[local21] = 255;
						}
					}
				}
				local162 = this.aFloat9 + this.aFloat15 * (float) local32 + this.aFloat12 * (float) local37 + this.aFloat20 * (float) local47;
				local183 = this.aFloat14 + this.aFloat10 * (float) local32 + this.aFloat19 * (float) local37 + this.aFloat11 * (float) local47;
				arg5[local21] = arg4.anInt7076 + (int) (local162 * (float) this.aClass126_Sub1_1.anInt3217 / local68);
				arg6[local21] = arg4.anInt7078 + (int) (local183 * (float) this.aClass126_Sub1_1.anInt3234 / local68);
				arg7[local21] = (int) local68;
			}
		} else {
			for (local21 = 0; local21 < local6.aShort83; local21++) {
				local32 = local6.aShortArray87[local21] + (arg0 << super.anInt9919);
				local37 = local6.aShortArray83[local21];
				local47 = local6.aShortArray86[local21] + (arg1 << super.anInt9919);
				local68 = this.aFloat17 + this.aFloat13 * (float) local32 + this.aFloat18 * (float) local37 + this.aFloat16 * (float) local47;
				arg8[local21] = 0;
				if (arg2) {
					local89 = this.anInt809 - arg3.anInt5963;
					if (local89 > 255) {
						local89 = 255;
					}
					if (local89 > 0) {
						arg8[local21] = local89;
						local109 = local6.aShortArray85[local21] * local89 / 255;
						if (local109 > 0) {
							local37 -= local109;
						}
					}
				} else if (arg3.aBoolean497) {
					local89 = this.anInt809 - arg3.anInt5963;
					if (local89 > 0) {
						arg8[local21] = local89;
						if (arg8[local21] > 255) {
							arg8[local21] = 255;
						}
					}
				}
				local162 = this.aFloat9 + this.aFloat15 * (float) local32 + this.aFloat12 * (float) local37 + this.aFloat20 * (float) local47;
				local183 = this.aFloat14 + this.aFloat10 * (float) local32 + this.aFloat19 * (float) local37 + this.aFloat11 * (float) local47;
				arg5[local21] = arg4.anInt7076 + (int) (local162 * (float) this.aClass126_Sub1_1.anInt3217 / (float) this.anInt809);
				arg6[local21] = arg4.anInt7078 + (int) (local183 * (float) this.aClass126_Sub1_1.anInt3234 / (float) this.anInt809);
				arg7[local21] = (int) local68;
			}
		}
		@Pc(426) float local426 = (float) super.anInt9918;
		for (local89 = 0; local89 < local6.aShort82; local89++) {
			local109 = local89 * 3;
			@Pc(437) int local437 = local109 + 1;
			@Pc(441) int local441 = local437 + 1;
			@Pc(445) int local445 = arg5[local109];
			@Pc(449) int local449 = arg5[local437];
			@Pc(453) int local453 = arg5[local441];
			@Pc(457) int local457 = arg6[local109];
			@Pc(461) int local461 = arg6[local437];
			@Pc(465) int local465 = arg6[local441];
			if ((local445 - local449) * (local465 - local461) - (local457 - local461) * (local453 - local449) > 0) {
				arg4.aBoolean593 = local445 < 0 || local449 < 0 || local453 < 0 || local445 > arg4.anInt7077 || local449 > arg4.anInt7077 || local453 > arg4.anInt7077;
				if (arg8[local109] + arg8[local437] + arg8[local441] < 765) {
					@Pc(522) int local522 = arg0 << super.anInt9919;
					@Pc(527) int local527 = arg1 << super.anInt9919;
					if ((local6.anIntArray494[local109] & 0xFFFFFF) != 0) {
						if (local6.aShortArray82[local109] == local6.aShortArray82[local437] && local6.aShortArray82[local109] == local6.aShortArray82[local441] && local6.aShortArray84[local109] == local6.aShortArray84[local437] && local6.aShortArray84[local109] == local6.aShortArray84[local441]) {
							arg4.method6312((float) local457, (float) local461, (float) local465, (float) local445, (float) local449, (float) local453, (float) arg7[local109], (float) arg7[local437], (float) arg7[local441], (float) (local522 + local6.aShortArray87[local109]) / (float) local6.aShortArray84[local109], (float) (local522 + local6.aShortArray87[local437]) / (float) local6.aShortArray84[local437], (float) (local522 + local6.aShortArray87[local441]) / (float) local6.aShortArray84[local441], (float) (local527 + local6.aShortArray86[local109]) / (float) local6.aShortArray84[local109], (float) (local527 + local6.aShortArray86[local437]) / (float) local6.aShortArray84[local437], (float) (local527 + local6.aShortArray86[local441]) / (float) local6.aShortArray84[local441], local6.anIntArray494[local109], local6.anIntArray494[local437], local6.anIntArray494[local441], arg3.anInt5957, arg8[local109], arg8[local437], arg8[local441], local6.aShortArray82[local109]);
						} else {
							arg4.method6307((float) local457, (float) local461, (float) local465, (float) local445, (float) local449, (float) local453, (float) arg7[local109], (float) arg7[local437], (float) arg7[local441], (float) (local522 + local6.aShortArray87[local109]) / local426, (float) (local522 + local6.aShortArray87[local437]) / local426, (float) (local522 + local6.aShortArray87[local441]) / local426, (float) (local527 + local6.aShortArray86[local109]) / local426, (float) (local527 + local6.aShortArray86[local437]) / local426, (float) (local527 + local6.aShortArray86[local441]) / local426, local6.anIntArray494[local109], local6.anIntArray494[local437], local6.anIntArray494[local441], arg3.anInt5957, arg8[local109], arg8[local437], arg8[local441], local6.aShortArray82[local109], local426 / (float) local6.aShortArray84[local109], local6.aShortArray82[local437], local426 / (float) local6.aShortArray84[local437], local6.aShortArray82[local441], local426 / (float) local6.aShortArray84[local441]);
						}
					}
				} else {
					arg4.method6313((float) local457, (float) local461, (float) local465, (float) local445, (float) local449, (float) local453, (float) arg7[local109], (float) arg7[local437], (float) arg7[local441], arg3.anInt5957);
				}
			}
		}
	}

	@OriginalMember(owner = "client!br", name = "fa", descriptor = "(IILclient!r;)Lclient!r;")
	@Override
	public Class5_Sub4_Sub10 fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5_Sub4_Sub10 arg2) {
		return null;
	}

	@OriginalMember(owner = "client!br", name = "b", descriptor = "(I)Z")
	private boolean method835(@OriginalArg(0) int arg0) {
		if ((this.anInt808 & 0x8) == 0) {
			return false;
		} else if (arg0 == 4) {
			return true;
		} else if (arg0 == 8) {
			return true;
		} else {
			return arg0 == 9;
		}
	}

	@OriginalMember(owner = "client!br", name = "CA", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void CA(@OriginalArg(0) Class5_Sub4_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IILclient!or;[I[I[I[II)V")
	private void method837(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class263 arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int arg7) {
		@Pc(6) Class220 local6 = this.aClass220ArrayArray1[arg0][arg1];
		@Pc(41) int local41;
		@Pc(51) int local51;
		@Pc(467) int local467;
		@Pc(497) int local497;
		if (local6 == null) {
			@Pc(2129) Class343 local2129 = this.aClass343ArrayArray1[arg0][arg1];
			if (local2129 != null) {
				if (arg7 != 0) {
					if ((local2129.aByte127 & 0x4) == 0) {
						if ((arg7 & 0x2) != 0) {
							return;
						}
					} else if ((arg7 & 0x1) != 0) {
						return;
					}
				}
				@Pc(2170) short local2170;
				@Pc(2230) float local2230;
				@Pc(2251) float local2251;
				@Pc(2201) float local2201;
				if (this.anInt809 == -1) {
					for (local467 = 0; local467 < local2129.aShort116; local467++) {
						local41 = local2129.aShortArray161[local467] + (arg0 << super.anInt9919);
						local2170 = local2129.aShortArray164[local467];
						local51 = local2129.aShortArray162[local467] + (arg1 << super.anInt9919);
						local2201 = this.aFloat17 + this.aFloat13 * (float) local41 + this.aFloat18 * (float) local2170 + this.aFloat16 * (float) local51;
						if (local2201 <= (float) this.aClass126_Sub1_1.anInt3229) {
							return;
						}
						local2230 = this.aFloat9 + this.aFloat15 * (float) local41 + this.aFloat12 * (float) local2170 + this.aFloat20 * (float) local51;
						local2251 = this.aFloat14 + this.aFloat10 * (float) local41 + this.aFloat19 * (float) local2170 + this.aFloat11 * (float) local51;
						arg3[local467] = arg2.anInt7076 + (int) (local2230 * (float) this.aClass126_Sub1_1.anInt3217 / local2201);
						arg4[local467] = arg2.anInt7078 + (int) (local2251 * (float) this.aClass126_Sub1_1.anInt3234 / local2201);
						arg5[local467] = (int) local2201;
					}
				} else {
					for (local467 = 0; local467 < local2129.aShort116; local467++) {
						local41 = local2129.aShortArray161[local467] + (arg0 << super.anInt9919);
						local2170 = local2129.aShortArray164[local467];
						local51 = local2129.aShortArray162[local467] + (arg1 << super.anInt9919);
						local2201 = this.aFloat17 + this.aFloat13 * (float) local41 + this.aFloat18 * (float) local2170 + this.aFloat16 * (float) local51;
						local2230 = this.aFloat9 + this.aFloat15 * (float) local41 + this.aFloat12 * (float) local2170 + this.aFloat20 * (float) local51;
						local2251 = this.aFloat14 + this.aFloat10 * (float) local41 + this.aFloat19 * (float) local2170 + this.aFloat11 * (float) local51;
						arg3[local467] = arg2.anInt7076 + (int) (local2230 * (float) this.aClass126_Sub1_1.anInt3217 / (float) this.anInt809);
						arg4[local467] = arg2.anInt7078 + (int) (local2251 * (float) this.aClass126_Sub1_1.anInt3234 / (float) this.anInt809);
						arg5[local467] = (int) local2201;
					}
				}
				@Pc(2442) short local2442;
				@Pc(2447) short local2447;
				@Pc(2452) short local2452;
				@Pc(2460) int local2460;
				@Pc(2464) int local2464;
				@Pc(2468) int local2468;
				@Pc(2472) int local2472;
				@Pc(2476) int local2476;
				if (local2129.aShortArray160 != null) {
					@Pc(2650) int local2650;
					@Pc(2520) short local2520;
					if (this.anInt809 == -1) {
						for (local467 = 0; local467 < local2129.aShort117; local467++) {
							local2442 = local2129.aShortArray158[local467];
							local2447 = local2129.aShortArray163[local467];
							local2452 = local2129.aShortArray157[local467];
							local497 = arg3[local2442];
							local2460 = arg3[local2447];
							local2464 = arg3[local2452];
							local2468 = arg4[local2442];
							local2472 = arg4[local2447];
							local2476 = arg4[local2452];
							if ((local497 - local2460) * (local2476 - local2472) - (local2468 - local2472) * (local2464 - local2460) > 0) {
								arg2.aBoolean593 = local497 < 0 || local2460 < 0 || local2464 < 0 || local497 > arg2.anInt7077 || local2460 > arg2.anInt7077 || local2464 > arg2.anInt7077;
								local2520 = local2129.aShortArray160[local467];
								if (local2520 == -1) {
									local2650 = local2129.anIntArray751[local467];
									if (local2650 != -1) {
										arg2.method6315((float) local2468, (float) local2472, (float) local2476, (float) local497, (float) local2460, (float) local2464, (float) arg5[local2442], (float) arg5[local2447], (float) arg5[local2452], (float) Static408.method6250(local2129.aShortArray159[local2442], local2650), (float) Static408.method6250(local2129.aShortArray159[local2447], local2650), (float) Static408.method6250(local2129.aShortArray159[local2452], local2650));
									}
								} else {
									arg2.method6312((float) local2468, (float) local2472, (float) local2476, (float) local497, (float) local2460, (float) local2464, (float) arg5[local2442], (float) arg5[local2447], (float) arg5[local2452], (float) local2129.aShortArray161[local2442] / (float) super.anInt9918, (float) local2129.aShortArray161[local2447] / (float) super.anInt9918, (float) local2129.aShortArray161[local2452] / (float) super.anInt9918, (float) local2129.aShortArray162[local2442] / (float) super.anInt9918, (float) local2129.aShortArray162[local2447] / (float) super.anInt9918, (float) local2129.aShortArray162[local2452] / (float) super.anInt9918, Static421.anIntArray844[local2129.aShortArray159[local2442] & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static421.anIntArray844[local2129.aShortArray159[local2447] & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static421.anIntArray844[local2129.aShortArray159[local2452] & 0xFFFF] & 0xFFFFFF | 0xFF000000, 0, 0, 0, 0, local2520);
								}
							}
						}
						return;
					}
					for (local467 = 0; local467 < local2129.aShort117; local467++) {
						local2442 = local2129.aShortArray158[local467];
						local2447 = local2129.aShortArray163[local467];
						local2452 = local2129.aShortArray157[local467];
						local497 = arg3[local2442];
						local2460 = arg3[local2447];
						local2464 = arg3[local2452];
						local2468 = arg4[local2442];
						local2472 = arg4[local2447];
						local2476 = arg4[local2452];
						if ((local497 - local2460) * (local2476 - local2472) - (local2468 - local2472) * (local2464 - local2460) > 0) {
							arg2.aBoolean593 = local497 < 0 || local2460 < 0 || local2464 < 0 || local497 > arg2.anInt7077 || local2460 > arg2.anInt7077 || local2464 > arg2.anInt7077;
							local2520 = local2129.aShortArray160[local467];
							if (local2520 == -1) {
								local2650 = local2129.anIntArray751[local467];
								if (local2650 != -1) {
									arg2.method6315((float) local2468, (float) local2472, (float) local2476, (float) local497, (float) local2460, (float) local2464, (float) arg5[local2442], (float) arg5[local2447], (float) arg5[local2452], (float) Static408.method6250(local2129.aShortArray159[local2442], local2650), (float) Static408.method6250(local2129.aShortArray159[local2447], local2650), (float) Static408.method6250(local2129.aShortArray159[local2452], local2650));
								}
							} else {
								arg2.method6312((float) local2468, (float) local2472, (float) local2476, (float) local497, (float) local2460, (float) local2464, (float) arg5[local2442], (float) arg5[local2447], (float) arg5[local2452], (float) local2129.aShortArray161[local2442] / (float) super.anInt9918, (float) local2129.aShortArray161[local2447] / (float) super.anInt9918, (float) local2129.aShortArray161[local2452] / (float) super.anInt9918, (float) local2129.aShortArray162[local2442] / (float) super.anInt9918, (float) local2129.aShortArray162[local2447] / (float) super.anInt9918, (float) local2129.aShortArray162[local2452] / (float) super.anInt9918, Static421.anIntArray844[local2129.aShortArray159[local2442] & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static421.anIntArray844[local2129.aShortArray159[local2447] & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static421.anIntArray844[local2129.aShortArray159[local2452] & 0xFFFF] & 0xFFFFFF | 0xFF000000, 0, 0, 0, 0, local2520);
							}
						}
					}
					return;
				}
				for (local467 = 0; local467 < local2129.aShort117; local467++) {
					local2442 = local2129.aShortArray158[local467];
					local2447 = local2129.aShortArray163[local467];
					local2452 = local2129.aShortArray157[local467];
					local497 = arg3[local2442];
					local2460 = arg3[local2447];
					local2464 = arg3[local2452];
					local2468 = arg4[local2442];
					local2472 = arg4[local2447];
					local2476 = arg4[local2452];
					if ((local497 - local2460) * (local2476 - local2472) - (local2468 - local2472) * (local2464 - local2460) > 0) {
						@Pc(3047) int local3047 = local2129.anIntArray751[local467];
						if (local3047 != -1) {
							arg2.aBoolean593 = local497 < 0 || local2460 < 0 || local2464 < 0 || local497 > arg2.anInt7077 || local2460 > arg2.anInt7077 || local2464 > arg2.anInt7077;
							arg2.method6315((float) local2468, (float) local2472, (float) local2476, (float) local497, (float) local2460, (float) local2464, (float) arg5[local2442], (float) arg5[local2447], (float) arg5[local2452], (float) Static408.method6250(local2129.aShortArray159[local2442], local3047), (float) Static408.method6250(local2129.aShortArray159[local2447], local3047), (float) Static408.method6250(local2129.aShortArray159[local2452], local3047));
						}
					}
				}
			}
		} else if ((local6.aByte88 & 0x2) == 0) {
			if (arg7 != 0) {
				if ((local6.aByte88 & 0x4) == 0) {
					if ((arg7 & 0x2) != 0) {
						return;
					}
				} else if ((arg7 & 0x1) != 0) {
					return;
				}
			}
			@Pc(36) int local36 = arg0 * super.anInt9918;
			local41 = local36 + super.anInt9918;
			@Pc(46) int local46 = arg1 * super.anInt9918;
			local51 = local46 + super.anInt9918;
			@Pc(484) float local484;
			@Pc(90) float local90;
			@Pc(115) float local115;
			@Pc(140) float local140;
			@Pc(165) float local165;
			@Pc(63) int local63;
			@Pc(287) int local287;
			@Pc(347) int local347;
			@Pc(407) int local407;
			@Pc(317) int local317;
			@Pc(377) int local377;
			@Pc(437) int local437;
			@Pc(274) float local274;
			@Pc(334) float local334;
			@Pc(394) float local394;
			@Pc(454) float local454;
			@Pc(304) float local304;
			@Pc(364) float local364;
			@Pc(424) float local424;
			if ((local6.aByte88 & 0x1) == 0) {
				local63 = super.anIntArrayArray60[arg0][arg1];
				@Pc(771) int local771 = super.anIntArrayArray60[arg0 + 1][arg1];
				@Pc(782) int local782 = super.anIntArrayArray60[arg0 + 1][arg1 + 1];
				@Pc(791) int local791 = super.anIntArrayArray60[arg0][arg1 + 1];
				if (this.anInt809 == -1) {
					local90 = this.aFloat17 + this.aFloat13 * (float) local36 + this.aFloat18 * (float) local63 + this.aFloat16 * (float) local46;
					if (local90 <= (float) this.aClass126_Sub1_1.anInt3229) {
						return;
					}
					local115 = this.aFloat17 + this.aFloat13 * (float) local41 + this.aFloat18 * (float) local771 + this.aFloat16 * (float) local46;
					if (local115 <= (float) this.aClass126_Sub1_1.anInt3229) {
						return;
					}
					local140 = this.aFloat17 + this.aFloat13 * (float) local41 + this.aFloat18 * (float) local782 + this.aFloat16 * (float) local51;
					if (local140 <= (float) this.aClass126_Sub1_1.anInt3229) {
						return;
					}
					local165 = this.aFloat17 + this.aFloat13 * (float) local36 + this.aFloat18 * (float) local791 + this.aFloat16 * (float) local51;
					if (local165 <= (float) this.aClass126_Sub1_1.anInt3229) {
						return;
					}
					local274 = this.aFloat9 + this.aFloat15 * (float) local36 + this.aFloat12 * (float) local63 + this.aFloat20 * (float) local46;
					local287 = arg2.anInt7076 + (int) (local274 * (float) this.aClass126_Sub1_1.anInt3217 / local90);
					local304 = this.aFloat14 + this.aFloat10 * (float) local36 + this.aFloat19 * (float) local63 + this.aFloat11 * (float) local46;
					local317 = arg2.anInt7078 + (int) (local304 * (float) this.aClass126_Sub1_1.anInt3234 / local90);
					local334 = this.aFloat9 + this.aFloat15 * (float) local41 + this.aFloat12 * (float) local771 + this.aFloat20 * (float) local46;
					local347 = arg2.anInt7076 + (int) (local334 * (float) this.aClass126_Sub1_1.anInt3217 / local115);
					local364 = this.aFloat14 + this.aFloat10 * (float) local41 + this.aFloat19 * (float) local771 + this.aFloat11 * (float) local46;
					local377 = arg2.anInt7078 + (int) (local364 * (float) this.aClass126_Sub1_1.anInt3234 / local115);
					local394 = this.aFloat9 + this.aFloat15 * (float) local41 + this.aFloat12 * (float) local782 + this.aFloat20 * (float) local51;
					local407 = arg2.anInt7076 + (int) (local394 * (float) this.aClass126_Sub1_1.anInt3217 / local140);
					local424 = this.aFloat14 + this.aFloat10 * (float) local41 + this.aFloat19 * (float) local782 + this.aFloat11 * (float) local51;
					local437 = arg2.anInt7078 + (int) (local424 * (float) this.aClass126_Sub1_1.anInt3234 / local140);
					local454 = this.aFloat9 + this.aFloat15 * (float) local36 + this.aFloat12 * (float) local791 + this.aFloat20 * (float) local51;
					local467 = arg2.anInt7076 + (int) (local454 * (float) this.aClass126_Sub1_1.anInt3217 / local165);
					local484 = this.aFloat14 + this.aFloat10 * (float) local36 + this.aFloat19 * (float) local791 + this.aFloat11 * (float) local51;
					local497 = arg2.anInt7078 + (int) (local484 * (float) this.aClass126_Sub1_1.anInt3234 / local165);
				} else {
					local90 = this.aFloat17 + this.aFloat13 * (float) local36 + this.aFloat18 * (float) local63 + this.aFloat16 * (float) local46;
					local115 = this.aFloat17 + this.aFloat13 * (float) local41 + this.aFloat18 * (float) local771 + this.aFloat16 * (float) local46;
					local140 = this.aFloat17 + this.aFloat13 * (float) local41 + this.aFloat18 * (float) local782 + this.aFloat16 * (float) local51;
					local165 = this.aFloat17 + this.aFloat13 * (float) local36 + this.aFloat18 * (float) local791 + this.aFloat16 * (float) local51;
					local274 = this.aFloat9 + this.aFloat15 * (float) local36 + this.aFloat12 * (float) local63 + this.aFloat20 * (float) local46;
					local287 = arg2.anInt7076 + (int) (local274 * (float) this.aClass126_Sub1_1.anInt3217 / (float) this.anInt809);
					local304 = this.aFloat14 + this.aFloat10 * (float) local36 + this.aFloat19 * (float) local63 + this.aFloat11 * (float) local46;
					local317 = arg2.anInt7078 + (int) (local304 * (float) this.aClass126_Sub1_1.anInt3234 / (float) this.anInt809);
					local334 = this.aFloat9 + this.aFloat15 * (float) local41 + this.aFloat12 * (float) local771 + this.aFloat20 * (float) local46;
					local347 = arg2.anInt7076 + (int) (local334 * (float) this.aClass126_Sub1_1.anInt3217 / (float) this.anInt809);
					local364 = this.aFloat14 + this.aFloat10 * (float) local41 + this.aFloat19 * (float) local771 + this.aFloat11 * (float) local46;
					local377 = arg2.anInt7078 + (int) (local364 * (float) this.aClass126_Sub1_1.anInt3234 / (float) this.anInt809);
					local394 = this.aFloat9 + this.aFloat15 * (float) local41 + this.aFloat12 * (float) local782 + this.aFloat20 * (float) local51;
					local407 = arg2.anInt7076 + (int) (local394 * (float) this.aClass126_Sub1_1.anInt3217 / (float) this.anInt809);
					local424 = this.aFloat14 + this.aFloat10 * (float) local41 + this.aFloat19 * (float) local782 + this.aFloat11 * (float) local51;
					local437 = arg2.anInt7078 + (int) (local424 * (float) this.aClass126_Sub1_1.anInt3234 / (float) this.anInt809);
					local454 = this.aFloat9 + this.aFloat15 * (float) local36 + this.aFloat12 * (float) local791 + this.aFloat20 * (float) local51;
					local467 = arg2.anInt7076 + (int) (local454 * (float) this.aClass126_Sub1_1.anInt3217 / (float) this.anInt809);
					local484 = this.aFloat14 + this.aFloat10 * (float) local36 + this.aFloat19 * (float) local791 + this.aFloat11 * (float) local51;
					local497 = arg2.anInt7078 + (int) (local484 * (float) this.aClass126_Sub1_1.anInt3234 / (float) this.anInt809);
				}
			} else {
				local63 = super.anIntArrayArray60[arg0][arg1];
				@Pc(69) float local69 = this.aFloat18 * (float) local63;
				if (this.anInt809 == -1) {
					local90 = this.aFloat17 + this.aFloat13 * (float) local36 + local69 + this.aFloat16 * (float) local46;
					if (local90 <= (float) this.aClass126_Sub1_1.anInt3229) {
						return;
					}
					local115 = this.aFloat17 + this.aFloat13 * (float) local41 + local69 + this.aFloat16 * (float) local46;
					if (local115 <= (float) this.aClass126_Sub1_1.anInt3229) {
						return;
					}
					local140 = this.aFloat17 + this.aFloat13 * (float) local41 + local69 + this.aFloat16 * (float) local51;
					if (local140 <= (float) this.aClass126_Sub1_1.anInt3229) {
						return;
					}
					local165 = this.aFloat17 + this.aFloat13 * (float) local36 + local69 + this.aFloat16 * (float) local51;
					if (local165 <= (float) this.aClass126_Sub1_1.anInt3229) {
						return;
					}
				} else {
					local90 = this.aFloat17 + this.aFloat13 * (float) local36 + local69 + this.aFloat16 * (float) local46;
					local115 = this.aFloat17 + this.aFloat13 * (float) local41 + local69 + this.aFloat16 * (float) local46;
					local140 = this.aFloat17 + this.aFloat13 * (float) local41 + local69 + this.aFloat16 * (float) local51;
					local165 = this.aFloat17 + this.aFloat13 * (float) local36 + local69 + this.aFloat16 * (float) local51;
				}
				@Pc(247) float local247 = this.aFloat12 * (float) local63;
				@Pc(253) float local253 = this.aFloat19 * (float) local63;
				if (this.anInt809 == -1) {
					local274 = this.aFloat9 + this.aFloat15 * (float) local36 + local247 + this.aFloat20 * (float) local46;
					local287 = arg2.anInt7076 + (int) (local274 * (float) this.aClass126_Sub1_1.anInt3217 / local90);
					local304 = this.aFloat14 + this.aFloat10 * (float) local36 + local253 + this.aFloat11 * (float) local46;
					local317 = arg2.anInt7078 + (int) (local304 * (float) this.aClass126_Sub1_1.anInt3234 / local90);
					local334 = this.aFloat9 + this.aFloat15 * (float) local41 + local247 + this.aFloat20 * (float) local46;
					local347 = arg2.anInt7076 + (int) (local334 * (float) this.aClass126_Sub1_1.anInt3217 / local115);
					local364 = this.aFloat14 + this.aFloat10 * (float) local41 + local253 + this.aFloat11 * (float) local46;
					local377 = arg2.anInt7078 + (int) (local364 * (float) this.aClass126_Sub1_1.anInt3234 / local115);
					local394 = this.aFloat9 + this.aFloat15 * (float) local41 + local247 + this.aFloat20 * (float) local51;
					local407 = arg2.anInt7076 + (int) (local394 * (float) this.aClass126_Sub1_1.anInt3217 / local140);
					local424 = this.aFloat14 + this.aFloat10 * (float) local41 + local253 + this.aFloat11 * (float) local51;
					local437 = arg2.anInt7078 + (int) (local424 * (float) this.aClass126_Sub1_1.anInt3234 / local140);
					local454 = this.aFloat9 + this.aFloat15 * (float) local36 + local247 + this.aFloat20 * (float) local51;
					local467 = arg2.anInt7076 + (int) (local454 * (float) this.aClass126_Sub1_1.anInt3217 / local165);
					local484 = this.aFloat14 + this.aFloat10 * (float) local36 + local253 + this.aFloat11 * (float) local51;
					local497 = arg2.anInt7078 + (int) (local484 * (float) this.aClass126_Sub1_1.anInt3234 / local165);
				} else {
					local274 = this.aFloat9 + this.aFloat15 * (float) local36 + local247 + this.aFloat20 * (float) local46;
					local287 = arg2.anInt7076 + (int) (local274 * (float) this.aClass126_Sub1_1.anInt3217 / (float) this.anInt809);
					local304 = this.aFloat14 + this.aFloat10 * (float) local36 + local253 + this.aFloat11 * (float) local46;
					local317 = arg2.anInt7078 + (int) (local304 * (float) this.aClass126_Sub1_1.anInt3234 / (float) this.anInt809);
					local334 = this.aFloat9 + this.aFloat15 * (float) local41 + local247 + this.aFloat20 * (float) local46;
					local347 = arg2.anInt7076 + (int) (local334 * (float) this.aClass126_Sub1_1.anInt3217 / (float) this.anInt809);
					local364 = this.aFloat14 + this.aFloat10 * (float) local41 + local253 + this.aFloat11 * (float) local46;
					local377 = arg2.anInt7078 + (int) (local364 * (float) this.aClass126_Sub1_1.anInt3234 / (float) this.anInt809);
					local394 = this.aFloat9 + this.aFloat15 * (float) local41 + local247 + this.aFloat20 * (float) local51;
					local407 = arg2.anInt7076 + (int) (local394 * (float) this.aClass126_Sub1_1.anInt3217 / (float) this.anInt809);
					local424 = this.aFloat14 + this.aFloat10 * (float) local41 + local253 + this.aFloat11 * (float) local51;
					local437 = arg2.anInt7078 + (int) (local424 * (float) this.aClass126_Sub1_1.anInt3234 / (float) this.anInt809);
					local454 = this.aFloat9 + this.aFloat15 * (float) local36 + local247 + this.aFloat20 * (float) local51;
					local467 = arg2.anInt7076 + (int) (local454 * (float) this.aClass126_Sub1_1.anInt3217 / (float) this.anInt809);
					local484 = this.aFloat14 + this.aFloat10 * (float) local36 + local253 + this.aFloat11 * (float) local51;
					local497 = arg2.anInt7078 + (int) (local484 * (float) this.aClass126_Sub1_1.anInt3234 / (float) this.anInt809);
				}
			}
			if (this.anInt809 == -1) {
				if ((local407 - local467) * (local377 - local497) - (local437 - local497) * (local347 - local467) > 0) {
					arg2.aBoolean593 = local407 < 0 || local467 < 0 || local347 < 0 || local407 > arg2.anInt7077 || local467 > arg2.anInt7077 || local347 > arg2.anInt7077;
					if (local6.aShort80 >= 0) {
						arg2.method6312((float) local437, (float) local497, (float) local377, (float) local407, (float) local467, (float) local347, local140, local165, local115, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, Static421.anIntArray844[local6.aShort81 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static421.anIntArray844[local6.aShort78 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static421.anIntArray844[local6.aShort79 & 0xFFFF] & 0xFFFFFF | 0xFF000000, 0, 0, 0, 0, local6.aShort80);
					} else {
						arg2.method6315((float) local437, (float) local497, (float) local377, (float) local407, (float) local467, (float) local347, (float) (int) local140, (float) (int) local165, (float) (int) local115, (float) (local6.aShort81 & 0xFFFF), (float) (local6.aShort78 & 0xFFFF), (float) (local6.aShort79 & 0xFFFF));
					}
				}
				if ((local287 - local347) * (local497 - local377) - (local317 - local377) * (local467 - local347) > 0) {
					arg2.aBoolean593 = local287 < 0 || local347 < 0 || local467 < 0 || local287 > arg2.anInt7077 || local347 > arg2.anInt7077 || local467 > arg2.anInt7077;
					if (local6.aShort80 >= 0) {
						arg2.method6312((float) local317, (float) local377, (float) local497, (float) local287, (float) local347, (float) local467, local90, local115, local165, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, Static421.anIntArray844[local6.aShort77 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static421.anIntArray844[local6.aShort79 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static421.anIntArray844[local6.aShort78 & 0xFFFF] & 0xFFFFFF | 0xFF000000, 0, 0, 0, 0, local6.aShort80);
						return;
					}
					arg2.method6315((float) local317, (float) local377, (float) local497, (float) local287, (float) local347, (float) local467, (float) (int) local90, (float) (int) local115, (float) (int) local165, (float) (local6.aShort77 & 0xFFFF), (float) (local6.aShort79 & 0xFFFF), (float) (local6.aShort78 & 0xFFFF));
					return;
				}
			} else {
				if ((local407 - local467) * (local377 - local497) - (local437 - local497) * (local347 - local467) > 0) {
					arg2.aBoolean593 = local407 < 0 || local467 < 0 || local347 < 0 || local407 > arg2.anInt7077 || local467 > arg2.anInt7077 || local347 > arg2.anInt7077;
					if (local6.aShort80 >= 0) {
						arg2.method6312((float) local437, (float) local497, (float) local377, (float) local407, (float) local467, (float) local347, local140, local165, local115, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, Static421.anIntArray844[local6.aShort81 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static421.anIntArray844[local6.aShort78 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static421.anIntArray844[local6.aShort79 & 0xFFFF] & 0xFFFFFF | 0xFF000000, 0, 0, 0, 0, local6.aShort80);
					} else {
						arg2.method6315((float) local437, (float) local497, (float) local377, (float) local407, (float) local467, (float) local347, (float) (int) local140, (float) (int) local165, (float) (int) local115, (float) (local6.aShort81 & 0xFFFF), (float) (local6.aShort78 & 0xFFFF), (float) (local6.aShort79 & 0xFFFF));
					}
				}
				if ((local287 - local347) * (local497 - local377) - (local317 - local377) * (local467 - local347) > 0) {
					arg2.aBoolean593 = local287 < 0 || local347 < 0 || local467 < 0 || local287 > arg2.anInt7077 || local347 > arg2.anInt7077 || local467 > arg2.anInt7077;
					if (local6.aShort80 >= 0) {
						arg2.method6312((float) local317, (float) local377, (float) local497, (float) local287, (float) local347, (float) local467, local90, local115, local165, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, Static421.anIntArray844[local6.aShort77 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static421.anIntArray844[local6.aShort79 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Static421.anIntArray844[local6.aShort78 & 0xFFFF] & 0xFFFFFF | 0xFF000000, 0, 0, 0, 0, local6.aShort80);
						return;
					}
					arg2.method6315((float) local317, (float) local377, (float) local497, (float) local287, (float) local347, (float) local467, (float) (int) local90, (float) (int) local115, (float) (int) local165, (float) (local6.aShort77 & 0xFFFF), (float) (local6.aShort79 & 0xFFFF), (float) (local6.aShort78 & 0xFFFF));
				}
			}
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method8439(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		@Pc(4) Class223 local4 = this.aClass126_Sub1_1.method2894(Thread.currentThread());
		@Pc(7) Class263 local7 = local4.aClass263_1;
		local7.anInt7081 = 0;
		local7.aBoolean593 = true;
		this.aClass126_Sub1_1.ya();
		if (this.aClass353ArrayArray1 != null || this.aClass233ArrayArray1 != null) {
			this.method838(arg0, arg1, arg2, arg3, arg4, local4, local7, local4.anIntArray458, local4.anIntArray452);
		} else if (this.aClass220ArrayArray1 != null) {
			this.method840(arg0, arg1, arg2, arg3, arg4, local4, local7, local4.anIntArray458, local4.anIntArray452);
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(Lclient!r;IIIIZ)Z")
	@Override
	public boolean method8440(@OriginalArg(0) Class5_Sub4_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return false;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(Lclient!tn;[I)V")
	@Override
	public void method8438(@OriginalArg(0) Class5_Sub27 arg0, @OriginalArg(1) int[] arg1) {
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method8437(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		if (this.aClass220ArrayArray1 == null) {
			this.aClass220ArrayArray1 = new Class220[super.anInt9920][super.anInt9923];
			this.aClass343ArrayArray1 = new Class343[super.anInt9920][super.anInt9923];
		} else if (this.aClass353ArrayArray1 != null || this.aClass233ArrayArray1 != null) {
			throw new IllegalStateException();
		}
		@Pc(29) boolean local29 = false;
		@Pc(67) int local67;
		@Pc(73) int local73;
		if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
			local29 = true;
			for (@Pc(60) int local60 = 1; local60 < 2; local60++) {
				local67 = arg2[arg6[local60]];
				local73 = arg4[arg6[local60]];
				if (local67 != 0 && local67 != super.anInt9918 || local73 != 0 && local73 != super.anInt9918) {
					local29 = false;
					break;
				}
			}
		}
		if (!local29) {
			@Pc(98) Class343 local98 = new Class343();
			@Pc(102) short local102 = (short) arg2.length;
			@Pc(106) short local106 = (short) arg9.length;
			local98.aShort116 = local102;
			local98.aShortArray159 = new short[local102];
			local98.aShortArray161 = new short[local102];
			local98.aShortArray164 = new short[local102];
			local98.aShortArray162 = new short[local102];
			@Pc(136) int local136;
			@Pc(291) int local291;
			@Pc(338) int local338;
			for (@Pc(127) int local127 = 0; local127 < local102; local127++) {
				@Pc(132) int local132 = arg2[local127];
				local136 = arg4[local127];
				if (local132 == 0 && local136 == 0) {
					local98.aShortArray159[local127] = (short) (this.aByteArrayArray3[arg0][arg1] - this.aByteArrayArray2[arg0][arg1]);
				} else if (local132 == 0 && local136 == super.anInt9918) {
					local98.aShortArray159[local127] = (short) (this.aByteArrayArray3[arg0][arg1 + 1] - this.aByteArrayArray2[arg0][arg1 + 1]);
				} else if (local132 == super.anInt9918 && local136 == super.anInt9918) {
					local98.aShortArray159[local127] = (short) (this.aByteArrayArray3[arg0 + 1][arg1 + 1] - this.aByteArrayArray2[arg0 + 1][arg1 + 1]);
				} else if (local132 == super.anInt9918 && local136 == 0) {
					local98.aShortArray159[local127] = (short) (this.aByteArrayArray3[arg0 + 1][arg1] - this.aByteArrayArray2[arg0 + 1][arg1]);
				} else {
					local291 = (this.aByteArrayArray3[arg0][arg1] - this.aByteArrayArray2[arg0][arg1]) * (super.anInt9918 - local132) + (this.aByteArrayArray3[arg0 + 1][arg1] - this.aByteArrayArray2[arg0 + 1][arg1]) * local132;
					local338 = (this.aByteArrayArray3[arg0][arg1 + 1] - this.aByteArrayArray2[arg0][arg1 + 1]) * (super.anInt9918 - local132) + (this.aByteArrayArray3[arg0 + 1][arg1 + 1] - this.aByteArrayArray2[arg0 + 1][arg1 + 1]) * local132;
					local98.aShortArray159[local127] = (short) (local291 * (super.anInt9918 - local136) + local338 * local136 >> super.anInt9919 * 2);
				}
				local291 = (arg0 << super.anInt9919) + local132;
				local338 = (arg1 << super.anInt9919) + local136;
				local98.aShortArray161[local127] = (short) local132;
				local98.aShortArray162[local127] = (short) local136;
				local98.aShortArray164[local127] = (short) (this.method8447(local291, local338) + (arg3 == null ? 0 : arg3[local127]));
				if (local98.aShortArray159[local127] < 2) {
					local98.aShortArray159[local127] = 2;
				}
			}
			@Pc(419) boolean local419 = false;
			local136 = 0;
			for (local291 = 0; local291 < local106; local291++) {
				if (arg9[local291] >= 0 || arg10 != null && arg10[local291] >= 0) {
					local136++;
				}
				local338 = arg11[local291];
				if (local338 != -1) {
					@Pc(449) Class321 local449 = this.aClass126_Sub1_1.anInterface8_10.method7813(local338);
					if (!local449.aBoolean724) {
						local419 = true;
						if (this.method835(local449.aByte115) || local449.aByte119 != 0 || local449.aByte118 != 0) {
							local98.aByte127 = (byte) (local98.aByte127 | 0x4);
						}
					}
				}
			}
			local98.anIntArray751 = new int[local136];
			if (arg10 != null) {
				local98.anIntArray750 = new int[local136];
			}
			local98.aShortArray158 = new short[local136];
			local98.aShortArray163 = new short[local136];
			local98.aShortArray157 = new short[local136];
			if (local419) {
				local98.aShortArray160 = new short[local136];
				local98.aShortArray156 = new short[local136];
			}
			for (local338 = 0; local338 < local106; local338++) {
				if (arg9[local338] >= 0 || arg10 != null && arg10[local338] >= 0) {
					if (arg9[local338] >= 0) {
						local98.anIntArray751[local98.aShort117] = Static311.method4936(arg9[local338]);
					} else {
						local98.anIntArray751[local98.aShort117] = -1;
					}
					if (arg10 != null) {
						if (arg10[local338] == -1) {
							local98.anIntArray750[local98.aShort117] = -1;
						} else {
							local98.anIntArray750[local98.aShort117] = Static311.method4936(arg10[local338]);
						}
					}
					local98.aShortArray158[local98.aShort117] = (short) arg6[local338];
					local98.aShortArray163[local98.aShort117] = (short) arg7[local338];
					local98.aShortArray157[local98.aShort117] = (short) arg8[local338];
					if (local419) {
						if (arg11[local338] == -1 || this.aClass126_Sub1_1.anInterface8_10.method7813(arg11[local338]).aBoolean724) {
							local98.aShortArray160[local98.aShort117] = -1;
						} else {
							local98.aShortArray160[local98.aShort117] = (short) arg11[local338];
							local98.aShortArray156[local98.aShort117] = (short) arg12[local338];
						}
					}
					local98.aShort117++;
				}
			}
			this.aClass343ArrayArray1[arg0][arg1] = local98;
		} else if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
			@Pc(668) Class220 local668 = new Class220();
			local67 = arg9[0];
			local73 = arg11[0];
			if (arg10 != null) {
				local668.anInt5921 = Static408.method6250(this.aByteArrayArray3[arg0][arg1] - this.aByteArrayArray2[arg0][arg1], Static311.method4936(arg10[0]));
				if (local67 == -1) {
					local668.aByte88 = (byte) (local668.aByte88 | 0x2);
				}
			}
			if (super.anIntArrayArray60[arg0][arg1] == super.anIntArrayArray60[arg0 + 1][arg1] && super.anIntArrayArray60[arg0][arg1] == super.anIntArrayArray60[arg0 + 1][arg1 + 1] && super.anIntArrayArray60[arg0][arg1] == super.anIntArrayArray60[arg0][arg1 + 1]) {
				local668.aByte88 = (byte) (local668.aByte88 | 0x1);
			}
			@Pc(766) Class321 local766 = null;
			if (local73 != -1) {
				local766 = this.aClass126_Sub1_1.anInterface8_10.method7813(local73);
			}
			if (local766 == null || (local668.aByte88 & 0x2) != 0 || local766.aBoolean724) {
				@Pc(893) short local893 = Static311.method4936(local67);
				local668.aShort77 = (short) Static408.method6250(this.aByteArrayArray3[arg0][arg1] - this.aByteArrayArray2[arg0][arg1], local893);
				local668.aShort79 = (short) Static408.method6250(this.aByteArrayArray3[arg0 + 1][arg1] - this.aByteArrayArray2[arg0 + 1][arg1], local893);
				local668.aShort81 = (short) Static408.method6250(this.aByteArrayArray3[arg0 + 1][arg1 + 1] - this.aByteArrayArray2[arg0 + 1][arg1 + 1], local893);
				local668.aShort78 = (short) Static408.method6250(this.aByteArrayArray3[arg0][arg1 + 1] - this.aByteArrayArray2[arg0][arg1 + 1], local893);
				local668.aShort80 = -1;
			} else {
				local668.aShort77 = (short) (this.aByteArrayArray3[arg0][arg1] - this.aByteArrayArray2[arg0][arg1]);
				local668.aShort79 = (short) (this.aByteArrayArray3[arg0 + 1][arg1] - this.aByteArrayArray2[arg0 + 1][arg1]);
				local668.aShort81 = (short) (this.aByteArrayArray3[arg0 + 1][arg1 + 1] - this.aByteArrayArray2[arg0 + 1][arg1 + 1]);
				local668.aShort78 = (short) (this.aByteArrayArray3[arg0][arg1 + 1] - this.aByteArrayArray2[arg0][arg1 + 1]);
				local668.aShort80 = (short) local73;
				if (this.method835(local766.aByte115) || local766.aByte119 != 0 || local766.aByte118 != 0) {
					local668.aByte88 = (byte) (local668.aByte88 | 0x4);
				}
			}
			this.aClass220ArrayArray1[arg0][arg1] = local668;
		}
	}

	@OriginalMember(owner = "client!br", name = "YA", descriptor = "()V")
	@Override
	public void YA() {
		this.aByteArrayArray3 = null;
		this.aByteArrayArray2 = null;
	}

	@OriginalMember(owner = "client!br", name = "ka", descriptor = "(III)V")
	@Override
	public void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aByteArrayArray2[arg0][arg1] < arg2) {
			this.aByteArrayArray2[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IIIIIII[[ZLclient!mda;Lclient!or;[I[I)V")
	private void method838(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(8) Class223 arg5, @OriginalArg(9) Class263 arg6, @OriginalArg(10) int[] arg7, @OriginalArg(11) int[] arg8) {
		@Pc(7) int local7 = (arg3 - arg1) * 1024 / 256;
		@Pc(14) boolean local14 = arg5.aBoolean498;
		this.aClass126_Sub1_1.C(false);
		arg6.aBoolean591 = false;
		arg6.aBoolean592 = false;
		@Pc(26) int local26 = 0;
		@Pc(30) int local30 = local7;
		for (@Pc(32) int local32 = arg0; local32 < arg2; local32++) {
			for (@Pc(35) int local35 = arg1; local35 < arg3; local35++) {
				if (arg4[local32 - arg0][local35 - arg1]) {
					@Pc(81) int local81;
					@Pc(370) int local370;
					@Pc(375) int local375;
					@Pc(379) int local379;
					@Pc(383) int local383;
					@Pc(387) int local387;
					@Pc(391) int local391;
					@Pc(395) int local395;
					@Pc(399) int local399;
					@Pc(403) int local403;
					@Pc(407) int local407;
					@Pc(432) int local432;
					if (this.aClass353ArrayArray1 == null) {
						if (this.aClass233ArrayArray1[local32][local35] != null) {
							@Pc(573) Class233 local573 = this.aClass233ArrayArray1[local32][local35];
							for (local81 = 0; local81 < local573.aShort83; local81++) {
								arg7[local81] = local26 + local573.aShortArray87[local81] * 4 / super.anInt9918;
								arg8[local81] = local30 - local573.aShortArray86[local81] * 4 / super.anInt9918;
							}
							for (local370 = 0; local370 < local573.aShort82; local370++) {
								local375 = local370 * 3;
								local379 = local375 + 1;
								local383 = local379 + 1;
								local387 = arg7[local375];
								local391 = arg7[local379];
								local395 = arg7[local383];
								local399 = arg8[local375];
								local403 = arg8[local379];
								local407 = arg8[local383];
								if (local573.anIntArray495 == null || local573.anIntArray495[local370] == 0) {
									arg6.method6317((float) local399, (float) local403, (float) local407, (float) local387, (float) local391, (float) local395, 100.0F, 100.0F, 100.0F, local573.anIntArray494[local375], local573.anIntArray494[local379], local573.anIntArray494[local383]);
								} else {
									local432 = local573.anIntArray495[local370];
									arg6.method6317((float) local399, (float) local403, (float) local407, (float) local387, (float) local391, (float) local395, 100.0F, 100.0F, 100.0F, local432, local432, local432);
								}
							}
						}
					} else if (this.aClass353ArrayArray1[local32][local35] != null) {
						@Pc(63) Class353 local63 = this.aClass353ArrayArray1[local32][local35];
						if (local63.aShort120 != -1 && (local63.aByte129 & 0x2) == 0 && local63.anInt9739 == 0) {
							local81 = this.aClass126_Sub1_1.method2892(local63.aShort120);
							arg6.method6315((float) (local30 - 4), (float) (local30 - 4), (float) local30, (float) (local26 + 4), (float) local26, (float) (local26 + 4), 100.0F, 100.0F, 100.0F, (float) Static408.method6250(local63.anInt9740, local81), (float) Static408.method6250(local63.anInt9743, local81), (float) Static408.method6250(local63.anInt9741, local81));
							arg6.method6315((float) local30, (float) local30, (float) (local30 - 4), (float) local26, (float) (local26 + 4), (float) local26, 100.0F, 100.0F, 100.0F, (float) Static408.method6250(local63.anInt9742, local81), (float) Static408.method6250(local63.anInt9741, local81), (float) Static408.method6250(local63.anInt9743, local81));
						} else if (local63.anInt9739 == 0) {
							arg6.method6317((float) (local30 - 4), (float) (local30 - 4), (float) local30, (float) (local26 + 4), (float) local26, (float) (local26 + 4), 100.0F, 100.0F, 100.0F, local63.anInt9740, local63.anInt9743, local63.anInt9741);
							arg6.method6317((float) local30, (float) local30, (float) (local30 - 4), (float) local26, (float) (local26 + 4), (float) local26, 100.0F, 100.0F, 100.0F, local63.anInt9742, local63.anInt9741, local63.anInt9743);
						} else {
							local81 = local63.anInt9739;
							arg6.method6317((float) (local30 - 4), (float) (local30 - 4), (float) local30, (float) (local26 + 4), (float) local26, (float) (local26 + 4), 100.0F, 100.0F, 100.0F, Static513.method7412(local81, local63.anInt9740 & 0xFF000000), Static513.method7412(local81, local63.anInt9743 & 0xFF000000), Static513.method7412(local81, local63.anInt9741 & 0xFF000000));
							arg6.method6317((float) local30, (float) local30, (float) (local30 - 4), (float) local26, (float) (local26 + 4), (float) local26, 100.0F, 100.0F, 100.0F, Static513.method7412(local81, local63.anInt9742 & 0xFF000000), Static513.method7412(local81, local63.anInt9741 & 0xFF000000), Static513.method7412(local81, local63.anInt9743 & 0xFF000000));
						}
					} else if (this.aClass78ArrayArray1[local32][local35] != null) {
						@Pc(332) Class78 local332 = this.aClass78ArrayArray1[local32][local35];
						for (local81 = 0; local81 < local332.aShort22; local81++) {
							arg7[local81] = local26 + local332.aShortArray34[local81] * 4 / super.anInt9918;
							arg8[local81] = local30 - local332.aShortArray31[local81] * 4 / super.anInt9918;
						}
						for (local370 = 0; local370 < local332.aShort21; local370++) {
							local375 = local370 * 3;
							local379 = local375 + 1;
							local383 = local379 + 1;
							local387 = arg7[local375];
							local391 = arg7[local379];
							local395 = arg7[local383];
							local399 = arg8[local375];
							local403 = arg8[local379];
							local407 = arg8[local383];
							if (local332.anIntArray141 != null && local332.anIntArray141[local370] != 0 && (local332.aShortArray32 == null || local332.aShortArray32 != null && local332.aShortArray32[local370] == -1)) {
								local432 = local332.anIntArray141[local370];
								arg6.method6317((float) local399, (float) local403, (float) local407, (float) local387, (float) local391, (float) local395, 100.0F, 100.0F, 100.0F, Static513.method7412(local432, -(local332.anIntArray142[local375] & -16777216) - 16777216), Static513.method7412(local432, -(local332.anIntArray142[local379] & -16777216) - 16777216), Static513.method7412(local432, -(local332.anIntArray142[local383] & -16777216) - 16777216));
							} else if (local332.aShortArray32 == null || local332.aShortArray32[local370] == -1) {
								arg6.method6317((float) local399, (float) local403, (float) local407, (float) local387, (float) local391, (float) local395, 100.0F, 100.0F, 100.0F, local332.anIntArray142[local375], local332.anIntArray142[local379], local332.anIntArray142[local383]);
							} else {
								local432 = this.aClass126_Sub1_1.method2892(local332.aShortArray32[local370]);
								arg6.method6315((float) local399, (float) local403, (float) local407, (float) local387, (float) local391, (float) local395, 100.0F, 100.0F, 100.0F, (float) local432, (float) local432, (float) local432);
							}
						}
					}
				}
				local30 -= 4;
			}
			local30 = local7;
			local26 += 4;
		}
		arg6.aBoolean591 = true;
		this.aClass126_Sub1_1.C(local14);
	}

	@OriginalMember(owner = "client!br", name = "b", descriptor = "(IIZLclient!mda;Lclient!or;[I[I[I[II)V")
	private void method839(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class223 arg3, @OriginalArg(4) Class263 arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int arg9) {
		@Pc(6) Class353 local6 = this.aClass353ArrayArray1[arg0][arg1];
		@Pc(41) int local41;
		@Pc(46) int local46;
		@Pc(51) int local51;
		@Pc(544) int local544;
		@Pc(394) int local394;
		@Pc(454) int local454;
		@Pc(514) int local514;
		@Pc(574) int local574;
		if (local6 == null) {
			@Pc(3030) Class78 local3030 = this.aClass78ArrayArray1[arg0][arg1];
			if (local3030 != null) {
				if (arg9 != 0) {
					if ((local3030.aByte22 & 0x4) == 0) {
						if ((arg9 & 0x2) != 0) {
							return;
						}
					} else if ((arg9 & 0x1) != 0) {
						return;
					}
				}
				@Pc(3196) float local3196;
				@Pc(3217) float local3217;
				@Pc(3102) float local3102;
				if (this.anInt809 == -1) {
					for (local544 = 0; local544 < local3030.aShort22; local544++) {
						local41 = local3030.aShortArray34[local544] + (arg0 << super.anInt9919);
						local46 = local3030.aShortArray30[local544];
						local51 = local3030.aShortArray31[local544] + (arg1 << super.anInt9919);
						local3102 = this.aFloat17 + this.aFloat13 * (float) local41 + this.aFloat18 * (float) local46 + this.aFloat16 * (float) local51;
						if (local3102 <= (float) this.aClass126_Sub1_1.anInt3229) {
							return;
						}
						arg8[local544] = 0;
						if (arg2) {
							local394 = (int) (local3102 - (float) arg3.anInt5963);
							if (local394 > 255) {
								local394 = 255;
							}
							if (local394 > 0) {
								arg8[local544] = local394;
								local454 = local3030.aShortArray33[local544] * local394 / 255;
								if (local454 > 0) {
									local46 -= local454;
								}
							}
						} else if (arg3.aBoolean497) {
							local394 = (int) (local3102 - (float) arg3.anInt5963);
							if (local394 > 0) {
								arg8[local544] = local394;
								if (arg8[local544] > 255) {
									arg8[local544] = 255;
								}
							}
						}
						local3196 = this.aFloat9 + this.aFloat15 * (float) local41 + this.aFloat12 * (float) local46 + this.aFloat20 * (float) local51;
						local3217 = this.aFloat14 + this.aFloat10 * (float) local41 + this.aFloat19 * (float) local46 + this.aFloat11 * (float) local51;
						arg5[local544] = arg4.anInt7076 + (int) (local3196 * (float) this.aClass126_Sub1_1.anInt3217 / local3102);
						arg6[local544] = arg4.anInt7078 + (int) (local3217 * (float) this.aClass126_Sub1_1.anInt3234 / local3102);
						arg7[local544] = (int) local3102;
					}
				} else {
					for (local544 = 0; local544 < local3030.aShort22; local544++) {
						local41 = local3030.aShortArray34[local544] + (arg0 << super.anInt9919);
						local46 = local3030.aShortArray30[local544];
						local51 = local3030.aShortArray31[local544] + (arg1 << super.anInt9919);
						local3102 = this.aFloat17 + this.aFloat13 * (float) local41 + this.aFloat18 * (float) local46 + this.aFloat16 * (float) local51;
						arg8[local544] = 0;
						if (arg2) {
							local394 = this.anInt809 - arg3.anInt5963;
							if (local394 > 255) {
								local394 = 255;
							}
							if (local394 > 0) {
								arg8[local544] = local394;
								local454 = local3030.aShortArray33[local544] * local394 / 255;
								if (local454 > 0) {
									local46 -= local454;
								}
							}
						} else if (arg3.aBoolean497) {
							local394 = this.anInt809 - arg3.anInt5963;
							if (local394 > 0) {
								arg8[local544] = local394;
								if (arg8[local544] > 255) {
									arg8[local544] = 255;
								}
							}
						}
						local3196 = this.aFloat9 + this.aFloat15 * (float) local41 + this.aFloat12 * (float) local46 + this.aFloat20 * (float) local51;
						local3217 = this.aFloat14 + this.aFloat10 * (float) local41 + this.aFloat19 * (float) local46 + this.aFloat11 * (float) local51;
						arg5[local544] = arg4.anInt7076 + (int) (local3196 * (float) this.aClass126_Sub1_1.anInt3217 / (float) this.anInt809);
						arg6[local544] = arg4.anInt7078 + (int) (local3217 * (float) this.aClass126_Sub1_1.anInt3234 / (float) this.anInt809);
						arg7[local544] = (int) local3102;
					}
				}
				@Pc(3486) int local3486;
				@Pc(3490) int local3490;
				@Pc(3494) int local3494;
				@Pc(3498) int local3498;
				@Pc(3502) int local3502;
				@Pc(3514) int local3514;
				if (local3030.aShortArray32 != null) {
					@Pc(3558) short local3558;
					@Pc(3568) int local3568;
					if (this.anInt809 == -1) {
						for (local544 = 0; local544 < local3030.aShort21; local544++) {
							local394 = local544 * 3;
							local454 = local394 + 1;
							local514 = local454 + 1;
							local574 = arg5[local394];
							local3486 = arg5[local454];
							local3490 = arg5[local514];
							local3494 = arg6[local394];
							local3498 = arg6[local454];
							local3502 = arg6[local514];
							local3514 = arg8[local394] + arg8[local454] + arg8[local514];
							if ((local574 - local3486) * (local3502 - local3498) - (local3494 - local3498) * (local3490 - local3486) > 0) {
								arg4.aBoolean593 = local574 < 0 || local3486 < 0 || local3490 < 0 || local574 > arg4.anInt7077 || local3486 > arg4.anInt7077 || local3490 > arg4.anInt7077;
								local3558 = local3030.aShortArray32[local544];
								if (local3514 >= 765) {
									arg4.method6313((float) local3494, (float) local3498, (float) local3502, (float) local574, (float) local3486, (float) local3490, (float) arg7[local394], (float) arg7[local454], (float) arg7[local514], arg3.anInt5957);
								} else if (local3514 > 0) {
									if (local3558 != -1) {
										local3568 = -16777216;
										if (local3558 != -1 && this.method835(this.aClass126_Sub1_1.anInterface8_10.method7813(local3558).aByte115)) {
											local3568 = -1694498816;
										}
										arg4.method6312((float) local3494, (float) local3498, (float) local3502, (float) local574, (float) local3486, (float) local3490, (float) arg7[local394], (float) arg7[local454], (float) arg7[local514], (float) local3030.aShortArray34[local394] / (float) super.anInt9918, (float) local3030.aShortArray34[local454] / (float) super.anInt9918, (float) local3030.aShortArray34[local514] / (float) super.anInt9918, (float) local3030.aShortArray31[local394] / (float) super.anInt9918, (float) local3030.aShortArray31[local454] / (float) super.anInt9918, (float) local3030.aShortArray31[local514] / (float) super.anInt9918, local3568 | local3030.anIntArray142[local394] & 0xFFFFFF, local3568 | local3030.anIntArray142[local454] & 0xFFFFFF, local3568 | local3030.anIntArray142[local514] & 0xFFFFFF, arg3.anInt5957, arg8[local394], arg8[local454], arg8[local514], local3558);
									} else if ((local3030.anIntArray142[local394] & 0xFFFFFF) != 0) {
										if (local3558 != -1 && this.method835(this.aClass126_Sub1_1.anInterface8_10.method7813(local3558).aByte115)) {
											arg4.anInt7081 = -1694498816;
										}
										arg4.method6317((float) local3494, (float) local3498, (float) local3502, (float) local574, (float) local3486, (float) local3490, (float) arg7[local394], (float) arg7[local454], (float) arg7[local514], Static513.method7412(local3030.anIntArray142[local394], arg8[local394] << 24 | arg3.anInt5957), Static513.method7412(local3030.anIntArray142[local454], arg8[local454] << 24 | arg3.anInt5957), Static513.method7412(local3030.anIntArray142[local514], arg8[local514] << 24 | arg3.anInt5957));
										arg4.anInt7081 = 0;
									}
								} else if (local3558 != -1) {
									local3568 = -16777216;
									if (local3558 != -1 && this.method835(this.aClass126_Sub1_1.anInterface8_10.method7813(local3558).aByte115)) {
										local3568 = -1694498816;
									}
									arg4.method6312((float) local3494, (float) local3498, (float) local3502, (float) local574, (float) local3486, (float) local3490, (float) arg7[local394], (float) arg7[local454], (float) arg7[local514], (float) local3030.aShortArray34[local394] / (float) super.anInt9918, (float) local3030.aShortArray34[local454] / (float) super.anInt9918, (float) local3030.aShortArray34[local514] / (float) super.anInt9918, (float) local3030.aShortArray31[local394] / (float) super.anInt9918, (float) local3030.aShortArray31[local454] / (float) super.anInt9918, (float) local3030.aShortArray31[local514] / (float) super.anInt9918, local3568 | local3030.anIntArray142[local394] & 0xFFFFFF, local3568 | local3030.anIntArray142[local454] & 0xFFFFFF, local3568 | local3030.anIntArray142[local514] & 0xFFFFFF, 0, 0, 0, 0, local3558);
								} else if ((local3030.anIntArray142[local394] & 0xFFFFFF) != 0) {
									if (local3558 != -1 && this.method835(this.aClass126_Sub1_1.anInterface8_10.method7813(local3558).aByte115)) {
										arg4.anInt7081 = -1694498816;
									}
									arg4.method6317((float) local3494, (float) local3498, (float) local3502, (float) local574, (float) local3486, (float) local3490, (float) arg7[local394], (float) arg7[local454], (float) arg7[local514], local3030.anIntArray142[local394], local3030.anIntArray142[local454], local3030.anIntArray142[local514]);
									arg4.anInt7081 = 0;
								}
							}
						}
						return;
					}
					for (local544 = 0; local544 < local3030.aShort21; local544++) {
						local394 = local544 * 3;
						local454 = local394 + 1;
						local514 = local454 + 1;
						local574 = arg5[local394];
						local3486 = arg5[local454];
						local3490 = arg5[local514];
						local3494 = arg6[local394];
						local3498 = arg6[local454];
						local3502 = arg6[local514];
						local3514 = arg8[local394] + arg8[local454] + arg8[local514];
						if ((local574 - local3486) * (local3502 - local3498) - (local3494 - local3498) * (local3490 - local3486) > 0) {
							arg4.aBoolean593 = local574 < 0 || local3486 < 0 || local3490 < 0 || local574 > arg4.anInt7077 || local3486 > arg4.anInt7077 || local3490 > arg4.anInt7077;
							local3558 = local3030.aShortArray32[local544];
							if (local3514 < 765) {
								if (local3558 != -1 && this.method835(this.aClass126_Sub1_1.anInterface8_10.method7813(local3558).aByte115)) {
									arg4.anInt7081 = -1694498816;
								}
								if (local3514 > 0) {
									if (local3558 != -1) {
										local3568 = -16777216;
										if (local3558 != -1 && this.method835(this.aClass126_Sub1_1.anInterface8_10.method7813(local3558).aByte115)) {
											local3568 = -1694498816;
										}
										arg4.method6312((float) local3494, (float) local3498, (float) local3502, (float) local574, (float) local3486, (float) local3490, (float) arg7[local394], (float) arg7[local454], (float) arg7[local514], (float) local3030.aShortArray34[local394] / (float) super.anInt9918, (float) local3030.aShortArray34[local454] / (float) super.anInt9918, (float) local3030.aShortArray34[local514] / (float) super.anInt9918, (float) local3030.aShortArray31[local394] / (float) super.anInt9918, (float) local3030.aShortArray31[local454] / (float) super.anInt9918, (float) local3030.aShortArray31[local514] / (float) super.anInt9918, local3568 | local3030.anIntArray142[local394] & 0xFFFFFF, local3568 | local3030.anIntArray142[local454] & 0xFFFFFF, local3568 | local3030.anIntArray142[local514] & 0xFFFFFF, arg3.anInt5957, arg8[local394], arg8[local454], arg8[local514], local3558);
									} else if ((local3030.anIntArray142[local394] & 0xFFFFFF) != 0) {
										if (local3558 != -1 && this.method835(this.aClass126_Sub1_1.anInterface8_10.method7813(local3558).aByte115)) {
											arg4.anInt7081 = -1694498816;
										}
										arg4.method6317((float) local3494, (float) local3498, (float) local3502, (float) local574, (float) local3486, (float) local3490, (float) arg7[local394], (float) arg7[local454], (float) arg7[local514], Static513.method7412(local3030.anIntArray142[local394], arg8[local394] << 24 | arg3.anInt5957), Static513.method7412(local3030.anIntArray142[local454], arg8[local454] << 24 | arg3.anInt5957), Static513.method7412(local3030.anIntArray142[local514], arg8[local514] << 24 | arg3.anInt5957));
										arg4.anInt7081 = 0;
									}
								} else if (local3558 != -1) {
									local3568 = -16777216;
									if (local3558 != -1 && this.method835(this.aClass126_Sub1_1.anInterface8_10.method7813(local3558).aByte115)) {
										local3568 = -1694498816;
									}
									arg4.method6312((float) local3494, (float) local3498, (float) local3502, (float) local574, (float) local3486, (float) local3490, (float) arg7[local394], (float) arg7[local454], (float) arg7[local514], (float) local3030.aShortArray34[local394] / (float) super.anInt9918, (float) local3030.aShortArray34[local454] / (float) super.anInt9918, (float) local3030.aShortArray34[local514] / (float) super.anInt9918, (float) local3030.aShortArray31[local394] / (float) super.anInt9918, (float) local3030.aShortArray31[local454] / (float) super.anInt9918, (float) local3030.aShortArray31[local514] / (float) super.anInt9918, local3568 | local3030.anIntArray142[local394] & 0xFFFFFF, local3568 | local3030.anIntArray142[local454] & 0xFFFFFF, local3568 | local3030.anIntArray142[local514] & 0xFFFFFF, 0, 0, 0, 0, local3558);
								} else if ((local3030.anIntArray142[local394] & 0xFFFFFF) != 0) {
									if (local3558 != -1 && this.method835(this.aClass126_Sub1_1.anInterface8_10.method7813(local3558).aByte115)) {
										arg4.anInt7081 = -1694498816;
									}
									arg4.method6317((float) local3494, (float) local3498, (float) local3502, (float) local574, (float) local3486, (float) local3490, (float) arg7[local394], (float) arg7[local454], (float) arg7[local514], local3030.anIntArray142[local394], local3030.anIntArray142[local454], local3030.anIntArray142[local514]);
									arg4.anInt7081 = 0;
								}
								arg4.anInt7081 = 0;
							} else {
								arg4.method6313((float) local3494, (float) local3498, (float) local3502, (float) local574, (float) local3486, (float) local3490, (float) arg7[local394], (float) arg7[local454], (float) arg7[local514], arg3.anInt5957);
							}
						}
					}
					return;
				}
				for (local544 = 0; local544 < local3030.aShort21; local544++) {
					local394 = local544 * 3;
					local454 = local394 + 1;
					local514 = local454 + 1;
					local574 = arg5[local394];
					local3486 = arg5[local454];
					local3490 = arg5[local514];
					local3494 = arg6[local394];
					local3498 = arg6[local454];
					local3502 = arg6[local514];
					local3514 = arg8[local394] + arg8[local454] + arg8[local514];
					if ((local574 - local3486) * (local3502 - local3498) - (local3494 - local3498) * (local3490 - local3486) > 0) {
						arg4.aBoolean593 = local574 < 0 || local3486 < 0 || local3490 < 0 || local574 > arg4.anInt7077 || local3486 > arg4.anInt7077 || local3490 > arg4.anInt7077;
						if (local3514 >= 765) {
							arg4.method6313((float) local3494, (float) local3498, (float) local3502, (float) local574, (float) local3486, (float) local3490, (float) arg7[local394], (float) arg7[local454], (float) arg7[local514], arg3.anInt5957);
						} else if (local3514 > 0) {
							if ((local3030.anIntArray142[local394] & 0xFFFFFF) != 0) {
								arg4.method6317((float) local3494, (float) local3498, (float) local3502, (float) local574, (float) local3486, (float) local3490, (float) arg7[local394], (float) arg7[local454], (float) arg7[local514], Static49.method779(local3030.anIntArray142[local394], arg8[local394], arg3.anInt5957), Static49.method779(local3030.anIntArray142[local454], arg8[local454], arg3.anInt5957), Static49.method779(local3030.anIntArray142[local514], arg8[local514], arg3.anInt5957));
							}
						} else if ((local3030.anIntArray142[local394] & 0xFFFFFF) != 0) {
							arg4.method6317((float) local3494, (float) local3498, (float) local3502, (float) local574, (float) local3486, (float) local3490, (float) arg7[local394], (float) arg7[local454], (float) arg7[local514], local3030.anIntArray142[local394], local3030.anIntArray142[local454], local3030.anIntArray142[local514]);
						}
					}
				}
			}
		} else if ((local6.aByte129 & 0x2) == 0) {
			if (arg9 != 0) {
				if ((local6.aByte129 & 0x4) == 0) {
					if ((arg9 & 0x2) != 0) {
						return;
					}
				} else if ((arg9 & 0x1) != 0) {
					return;
				}
			}
			@Pc(36) int local36 = arg0 * super.anInt9918;
			local41 = local36 + super.anInt9918;
			local46 = arg1 * super.anInt9918;
			local51 = local46 + super.anInt9918;
			@Pc(53) int local53 = 0;
			@Pc(55) int local55 = 0;
			@Pc(57) int local57 = 0;
			@Pc(59) int local59 = 0;
			@Pc(100) float local100;
			@Pc(125) float local125;
			@Pc(150) float local150;
			@Pc(175) float local175;
			@Pc(261) int local261;
			@Pc(73) int local73;
			@Pc(848) int local848;
			@Pc(859) int local859;
			@Pc(364) int local364;
			@Pc(424) int local424;
			@Pc(484) int local484;
			@Pc(351) float local351;
			@Pc(411) float local411;
			@Pc(471) float local471;
			@Pc(531) float local531;
			@Pc(381) float local381;
			@Pc(441) float local441;
			@Pc(501) float local501;
			@Pc(561) float local561;
			if ((local6.aByte129 & 0x1) == 0 || arg2) {
				local73 = super.anIntArrayArray60[arg0][arg1];
				local848 = super.anIntArrayArray60[arg0 + 1][arg1];
				local859 = super.anIntArrayArray60[arg0 + 1][arg1 + 1];
				@Pc(868) int local868 = super.anIntArrayArray60[arg0][arg1 + 1];
				if (this.anInt809 == -1) {
					local100 = this.aFloat17 + this.aFloat13 * (float) local36 + this.aFloat18 * (float) local73 + this.aFloat16 * (float) local46;
					if (local100 <= (float) this.aClass126_Sub1_1.anInt3229) {
						return;
					}
					local125 = this.aFloat17 + this.aFloat13 * (float) local41 + this.aFloat18 * (float) local848 + this.aFloat16 * (float) local46;
					if (local125 <= (float) this.aClass126_Sub1_1.anInt3229) {
						return;
					}
					local150 = this.aFloat17 + this.aFloat13 * (float) local41 + this.aFloat18 * (float) local859 + this.aFloat16 * (float) local51;
					if (local150 <= (float) this.aClass126_Sub1_1.anInt3229) {
						return;
					}
					local175 = this.aFloat17 + this.aFloat13 * (float) local36 + this.aFloat18 * (float) local868 + this.aFloat16 * (float) local51;
					if (local175 <= (float) this.aClass126_Sub1_1.anInt3229) {
						return;
					}
				} else {
					local100 = this.aFloat17 + this.aFloat13 * (float) local36 + this.aFloat18 * (float) local73 + this.aFloat16 * (float) local46;
					local125 = this.aFloat17 + this.aFloat13 * (float) local41 + this.aFloat18 * (float) local848 + this.aFloat16 * (float) local46;
					local150 = this.aFloat17 + this.aFloat13 * (float) local41 + this.aFloat18 * (float) local859 + this.aFloat16 * (float) local51;
					local175 = this.aFloat17 + this.aFloat13 * (float) local36 + this.aFloat18 * (float) local868 + this.aFloat16 * (float) local51;
				}
				if (arg2) {
					local261 = (int) (local100 - (float) arg3.anInt5963);
					if (local261 > 255) {
						local261 = 255;
					}
					@Pc(1097) int local1097;
					if (local261 > 0) {
						local53 = local261;
						local1097 = local6.aShort122 * local261 / 255;
						if (local1097 > 0) {
							local73 -= local1097;
						}
					}
					local261 = (int) (local125 - (float) arg3.anInt5963);
					if (local261 > 255) {
						local261 = 255;
					}
					if (local261 > 0) {
						local55 = local261;
						local1097 = local6.aShort121 * local261 / 255;
						if (local1097 > 0) {
							local848 -= local1097;
						}
					}
					local261 = (int) (local150 - (float) arg3.anInt5963);
					if (local261 > 255) {
						local261 = 255;
					}
					if (local261 > 0) {
						local57 = local261;
						local1097 = local6.aShort118 * local261 / 255;
						if (local1097 > 0) {
							local859 -= local1097;
						}
					}
					local261 = (int) (local175 - (float) arg3.anInt5963);
					if (local261 > 255) {
						local261 = 255;
					}
					if (local261 > 0) {
						local59 = local261;
						local1097 = local6.aShort119 * local261 / 255;
						if (local1097 > 0) {
							local868 -= local1097;
						}
					}
				} else if (arg3.aBoolean497) {
					local261 = (int) (local100 - (float) arg3.anInt5963);
					if (local261 > 0) {
						local53 = local261;
						if (local261 > 255) {
							local53 = 255;
						}
					}
					local261 = (int) (local125 - (float) arg3.anInt5963);
					if (local261 > 0) {
						local55 = local261;
						if (local261 > 255) {
							local55 = 255;
						}
					}
					local261 = (int) (local150 - (float) arg3.anInt5963);
					if (local261 > 0) {
						local57 = local261;
						if (local261 > 255) {
							local57 = 255;
						}
					}
					local261 = (int) (local175 - (float) arg3.anInt5963);
					if (local261 > 0) {
						local59 = local261;
						if (local261 > 255) {
							local59 = 255;
						}
					}
				}
				if (this.anInt809 == -1) {
					local351 = this.aFloat9 + this.aFloat15 * (float) local36 + this.aFloat12 * (float) local73 + this.aFloat20 * (float) local46;
					local364 = arg4.anInt7076 + (int) (local351 * (float) this.aClass126_Sub1_1.anInt3217 / local100);
					local381 = this.aFloat14 + this.aFloat10 * (float) local36 + this.aFloat19 * (float) local73 + this.aFloat11 * (float) local46;
					local394 = arg4.anInt7078 + (int) (local381 * (float) this.aClass126_Sub1_1.anInt3234 / local100);
					local411 = this.aFloat9 + this.aFloat15 * (float) local41 + this.aFloat12 * (float) local848 + this.aFloat20 * (float) local46;
					local424 = arg4.anInt7076 + (int) (local411 * (float) this.aClass126_Sub1_1.anInt3217 / local125);
					local441 = this.aFloat14 + this.aFloat10 * (float) local41 + this.aFloat19 * (float) local848 + this.aFloat11 * (float) local46;
					local454 = arg4.anInt7078 + (int) (local441 * (float) this.aClass126_Sub1_1.anInt3234 / local125);
					local471 = this.aFloat9 + this.aFloat15 * (float) local41 + this.aFloat12 * (float) local859 + this.aFloat20 * (float) local51;
					local484 = arg4.anInt7076 + (int) (local471 * (float) this.aClass126_Sub1_1.anInt3217 / local150);
					local501 = this.aFloat14 + this.aFloat10 * (float) local41 + this.aFloat19 * (float) local859 + this.aFloat11 * (float) local51;
					local514 = arg4.anInt7078 + (int) (local501 * (float) this.aClass126_Sub1_1.anInt3234 / local150);
					local531 = this.aFloat9 + this.aFloat15 * (float) local36 + this.aFloat12 * (float) local868 + this.aFloat20 * (float) local51;
					local544 = arg4.anInt7076 + (int) (local531 * (float) this.aClass126_Sub1_1.anInt3217 / local175);
					local561 = this.aFloat14 + this.aFloat10 * (float) local36 + this.aFloat19 * (float) local868 + this.aFloat11 * (float) local51;
					local574 = arg4.anInt7078 + (int) (local561 * (float) this.aClass126_Sub1_1.anInt3234 / local175);
				} else {
					local351 = this.aFloat9 + this.aFloat15 * (float) local36 + this.aFloat12 * (float) local73 + this.aFloat20 * (float) local46;
					local364 = arg4.anInt7076 + (int) (local351 * (float) this.aClass126_Sub1_1.anInt3217 / (float) this.anInt809);
					local381 = this.aFloat14 + this.aFloat10 * (float) local36 + this.aFloat19 * (float) local73 + this.aFloat11 * (float) local46;
					local394 = arg4.anInt7078 + (int) (local381 * (float) this.aClass126_Sub1_1.anInt3234 / (float) this.anInt809);
					local411 = this.aFloat9 + this.aFloat15 * (float) local41 + this.aFloat12 * (float) local848 + this.aFloat20 * (float) local46;
					local424 = arg4.anInt7076 + (int) (local411 * (float) this.aClass126_Sub1_1.anInt3217 / (float) this.anInt809);
					local441 = this.aFloat14 + this.aFloat10 * (float) local41 + this.aFloat19 * (float) local848 + this.aFloat11 * (float) local46;
					local454 = arg4.anInt7078 + (int) (local441 * (float) this.aClass126_Sub1_1.anInt3234 / (float) this.anInt809);
					local471 = this.aFloat9 + this.aFloat15 * (float) local41 + this.aFloat12 * (float) local859 + this.aFloat20 * (float) local51;
					local484 = arg4.anInt7076 + (int) (local471 * (float) this.aClass126_Sub1_1.anInt3217 / (float) this.anInt809);
					local501 = this.aFloat14 + this.aFloat10 * (float) local41 + this.aFloat19 * (float) local859 + this.aFloat11 * (float) local51;
					local514 = arg4.anInt7078 + (int) (local501 * (float) this.aClass126_Sub1_1.anInt3234 / (float) this.anInt809);
					local531 = this.aFloat9 + this.aFloat15 * (float) local36 + this.aFloat12 * (float) local868 + this.aFloat20 * (float) local51;
					local544 = arg4.anInt7076 + (int) (local531 * (float) this.aClass126_Sub1_1.anInt3217 / (float) this.anInt809);
					local561 = this.aFloat14 + this.aFloat10 * (float) local36 + this.aFloat19 * (float) local868 + this.aFloat11 * (float) local51;
					local574 = arg4.anInt7078 + (int) (local561 * (float) this.aClass126_Sub1_1.anInt3234 / (float) this.anInt809);
				}
			} else {
				local73 = super.anIntArrayArray60[arg0][arg1];
				@Pc(79) float local79 = this.aFloat18 * (float) local73;
				if (this.anInt809 == -1) {
					local100 = this.aFloat17 + this.aFloat13 * (float) local36 + local79 + this.aFloat16 * (float) local46;
					if (local100 <= (float) this.aClass126_Sub1_1.anInt3229) {
						return;
					}
					local125 = this.aFloat17 + this.aFloat13 * (float) local41 + local79 + this.aFloat16 * (float) local46;
					if (local125 <= (float) this.aClass126_Sub1_1.anInt3229) {
						return;
					}
					local150 = this.aFloat17 + this.aFloat13 * (float) local41 + local79 + this.aFloat16 * (float) local51;
					if (local150 <= (float) this.aClass126_Sub1_1.anInt3229) {
						return;
					}
					local175 = this.aFloat17 + this.aFloat13 * (float) local36 + local79 + this.aFloat16 * (float) local51;
					if (local175 <= (float) this.aClass126_Sub1_1.anInt3229) {
						return;
					}
				} else {
					local100 = this.aFloat17 + this.aFloat13 * (float) local36 + local79 + this.aFloat16 * (float) local46;
					local125 = this.aFloat17 + this.aFloat13 * (float) local41 + local79 + this.aFloat16 * (float) local46;
					local150 = this.aFloat17 + this.aFloat13 * (float) local41 + local79 + this.aFloat16 * (float) local51;
					local175 = this.aFloat17 + this.aFloat13 * (float) local36 + local79 + this.aFloat16 * (float) local51;
				}
				if (arg3.aBoolean497) {
					local261 = (int) (local100 - (float) arg3.anInt5963);
					if (local261 > 0) {
						local53 = local261;
						if (local261 > 255) {
							local53 = 255;
						}
					}
					local261 = (int) (local125 - (float) arg3.anInt5963);
					if (local261 > 0) {
						local55 = local261;
						if (local261 > 255) {
							local55 = 255;
						}
					}
					local261 = (int) (local150 - (float) arg3.anInt5963);
					if (local261 > 0) {
						local57 = local261;
						if (local261 > 255) {
							local57 = 255;
						}
					}
					local261 = (int) (local175 - (float) arg3.anInt5963);
					if (local261 > 0) {
						local59 = local261;
						if (local261 > 255) {
							local59 = 255;
						}
					}
				}
				@Pc(324) float local324 = this.aFloat12 * (float) local73;
				@Pc(330) float local330 = this.aFloat19 * (float) local73;
				if (this.anInt809 == -1) {
					local351 = this.aFloat9 + this.aFloat15 * (float) local36 + local324 + this.aFloat20 * (float) local46;
					local364 = arg4.anInt7076 + (int) (local351 * (float) this.aClass126_Sub1_1.anInt3217 / local100);
					local381 = this.aFloat14 + this.aFloat10 * (float) local36 + local330 + this.aFloat11 * (float) local46;
					local394 = arg4.anInt7078 + (int) (local381 * (float) this.aClass126_Sub1_1.anInt3234 / local100);
					local411 = this.aFloat9 + this.aFloat15 * (float) local41 + local324 + this.aFloat20 * (float) local46;
					local424 = arg4.anInt7076 + (int) (local411 * (float) this.aClass126_Sub1_1.anInt3217 / local125);
					local441 = this.aFloat14 + this.aFloat10 * (float) local41 + local330 + this.aFloat11 * (float) local46;
					local454 = arg4.anInt7078 + (int) (local441 * (float) this.aClass126_Sub1_1.anInt3234 / local125);
					local471 = this.aFloat9 + this.aFloat15 * (float) local41 + local324 + this.aFloat20 * (float) local51;
					local484 = arg4.anInt7076 + (int) (local471 * (float) this.aClass126_Sub1_1.anInt3217 / local150);
					local501 = this.aFloat14 + this.aFloat10 * (float) local41 + local330 + this.aFloat11 * (float) local51;
					local514 = arg4.anInt7078 + (int) (local501 * (float) this.aClass126_Sub1_1.anInt3234 / local150);
					local531 = this.aFloat9 + this.aFloat15 * (float) local36 + local324 + this.aFloat20 * (float) local51;
					local544 = arg4.anInt7076 + (int) (local531 * (float) this.aClass126_Sub1_1.anInt3217 / local175);
					local561 = this.aFloat14 + this.aFloat10 * (float) local36 + local330 + this.aFloat11 * (float) local51;
					local574 = arg4.anInt7078 + (int) (local561 * (float) this.aClass126_Sub1_1.anInt3234 / local175);
				} else {
					local351 = this.aFloat9 + this.aFloat15 * (float) local36 + local324 + this.aFloat20 * (float) local46;
					local364 = arg4.anInt7076 + (int) (local351 * (float) this.aClass126_Sub1_1.anInt3217 / (float) this.anInt809);
					local381 = this.aFloat14 + this.aFloat10 * (float) local36 + local330 + this.aFloat11 * (float) local46;
					local394 = arg4.anInt7078 + (int) (local381 * (float) this.aClass126_Sub1_1.anInt3234 / (float) this.anInt809);
					local411 = this.aFloat9 + this.aFloat15 * (float) local41 + local324 + this.aFloat20 * (float) local46;
					local424 = arg4.anInt7076 + (int) (local411 * (float) this.aClass126_Sub1_1.anInt3217 / (float) this.anInt809);
					local441 = this.aFloat14 + this.aFloat10 * (float) local41 + local330 + this.aFloat11 * (float) local46;
					local454 = arg4.anInt7078 + (int) (local441 * (float) this.aClass126_Sub1_1.anInt3234 / (float) this.anInt809);
					local471 = this.aFloat9 + this.aFloat15 * (float) local41 + local324 + this.aFloat20 * (float) local51;
					local484 = arg4.anInt7076 + (int) (local471 * (float) this.aClass126_Sub1_1.anInt3217 / (float) this.anInt809);
					local501 = this.aFloat14 + this.aFloat10 * (float) local41 + local330 + this.aFloat11 * (float) local51;
					local514 = arg4.anInt7078 + (int) (local501 * (float) this.aClass126_Sub1_1.anInt3234 / (float) this.anInt809);
					local531 = this.aFloat9 + this.aFloat15 * (float) local36 + local324 + this.aFloat20 * (float) local51;
					local544 = arg4.anInt7076 + (int) (local531 * (float) this.aClass126_Sub1_1.anInt3217 / (float) this.anInt809);
					local561 = this.aFloat14 + this.aFloat10 * (float) local36 + local330 + this.aFloat11 * (float) local51;
					local574 = arg4.anInt7078 + (int) (local561 * (float) this.aClass126_Sub1_1.anInt3234 / (float) this.anInt809);
				}
			}
			@Pc(1842) boolean local1842 = local6.aShort120 != -1 && this.method835(this.aClass126_Sub1_1.anInterface8_10.method7813(local6.aShort120).aByte115);
			if (this.anInt809 == -1) {
				local848 = local55 + local57 + local59;
				if ((local484 - local544) * (local454 - local574) - (local514 - local574) * (local424 - local544) > 0) {
					arg4.aBoolean593 = local484 < 0 || local544 < 0 || local424 < 0 || local484 > arg4.anInt7077 || local544 > arg4.anInt7077 || local424 > arg4.anInt7077;
					if (local848 >= 765) {
						arg4.method6313((float) local514, (float) local574, (float) local454, (float) local484, (float) local544, (float) local424, (float) (int) local150, (float) (int) local175, (float) (int) local125, arg3.anInt5957);
					} else if (local848 > 0) {
						if (local6.aShort120 >= 0) {
							local859 = -16777216;
							if (local1842) {
								local859 = -1694498816;
							}
							arg4.method6312((float) local514, (float) local574, (float) local454, (float) local484, (float) local544, (float) local424, local150, local175, local125, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, local859 | local6.anInt9740 & 0xFFFFFF, local859 | local6.anInt9743 & 0xFFFFFF, local859 | local6.anInt9741 & 0xFFFFFF, arg3.anInt5957, local57, local59, local55, local6.aShort120);
						} else {
							if (local1842) {
								arg4.anInt7081 = 100;
							}
							arg4.method6317((float) local514, (float) local574, (float) local454, (float) local484, (float) local544, (float) local424, (float) (int) local150, (float) (int) local175, (float) (int) local125, Static513.method7412(local6.anInt9740, local57 << 24 | arg3.anInt5957), Static513.method7412(local6.anInt9743, local59 << 24 | arg3.anInt5957), Static513.method7412(local6.anInt9741, local55 << 24 | arg3.anInt5957));
							arg4.anInt7081 = 0;
						}
					} else if (local6.aShort120 >= 0) {
						local859 = -16777216;
						if (local1842) {
							local859 = -1694498816;
						}
						arg4.method6312((float) local514, (float) local574, (float) local454, (float) local484, (float) local544, (float) local424, local150, local175, local125, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, local859 | local6.anInt9740 & 0xFFFFFF, local859 | local6.anInt9743 & 0xFFFFFF, local859 | local6.anInt9741 & 0xFFFFFF, 0, 0, 0, 0, local6.aShort120);
					} else {
						if (local1842) {
							arg4.anInt7081 = 100;
						}
						arg4.method6317((float) local514, (float) local574, (float) local454, (float) local484, (float) local544, (float) local424, (float) (int) local150, (float) (int) local175, (float) (int) local125, local6.anInt9740, local6.anInt9743, local6.anInt9741);
						arg4.anInt7081 = 0;
					}
				}
				local848 = local53 + local55 + local59;
				if ((local364 - local424) * (local574 - local454) - (local394 - local454) * (local544 - local424) > 0) {
					arg4.aBoolean593 = local364 < 0 || local424 < 0 || local544 < 0 || local364 > arg4.anInt7077 || local424 > arg4.anInt7077 || local544 > arg4.anInt7077;
					if (local848 < 765) {
						if (local1842) {
							arg4.anInt7081 = -1694498816;
						}
						if (local848 > 0) {
							if (local6.aShort120 >= 0) {
								local859 = -16777216;
								if (local1842) {
									local859 = -1694498816;
								}
								arg4.method6312((float) local394, (float) local454, (float) local574, (float) local364, (float) local424, (float) local544, local100, local125, local175, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, local859 | local6.anInt9742 & 0xFFFFFF, local859 | local6.anInt9741 & 0xFFFFFF, local859 | local6.anInt9743 & 0xFFFFFF, arg3.anInt5957, local53, local55, local59, local6.aShort120);
								return;
							}
							if (local1842) {
								arg4.anInt7081 = 100;
							}
							arg4.method6317((float) local394, (float) local454, (float) local574, (float) local364, (float) local424, (float) local544, (float) (int) local100, (float) (int) local125, (float) (int) local175, Static513.method7412(local6.anInt9742, local53 << 24 | arg3.anInt5957), Static513.method7412(local6.anInt9741, local55 << 24 | arg3.anInt5957), Static513.method7412(local6.anInt9743, local59 << 24 | arg3.anInt5957));
							arg4.anInt7081 = 0;
							return;
						}
						if (local6.aShort120 >= 0) {
							local859 = -16777216;
							if (local1842) {
								local859 = -1694498816;
							}
							arg4.method6312((float) local394, (float) local454, (float) local574, (float) local364, (float) local424, (float) local544, local100, local125, local175, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, local859 | local6.anInt9742 & 0xFFFFFF, local859 | local6.anInt9741 & 0xFFFFFF, local859 | local6.anInt9743 & 0xFFFFFF, 0, 0, 0, 0, local6.aShort120);
							return;
						}
						if (local1842) {
							arg4.anInt7081 = 100;
						}
						arg4.method6317((float) local394, (float) local454, (float) local574, (float) local364, (float) local424, (float) local544, (float) (int) local100, (float) (int) local125, (float) (int) local175, local6.anInt9742, local6.anInt9741, local6.anInt9743);
						arg4.anInt7081 = 0;
						return;
					}
					arg4.method6313((float) local394, (float) local454, (float) local574, (float) local364, (float) local424, (float) local544, (float) (int) local100, (float) (int) local125, (float) (int) local175, arg3.anInt5957);
					return;
				}
			} else {
				local848 = local55 + local57 + local59;
				if ((local484 - local544) * (local454 - local574) - (local514 - local574) * (local424 - local544) > 0) {
					arg4.aBoolean593 = local484 < 0 || local544 < 0 || local424 < 0 || local484 > arg4.anInt7077 || local544 > arg4.anInt7077 || local424 > arg4.anInt7077;
					if (local848 < 765) {
						if (local1842) {
							arg4.anInt7081 = -1694498816;
						}
						if (local848 > 0) {
							if (local6.aShort120 >= 0) {
								local859 = -16777216;
								if (local1842) {
									local859 = -1694498816;
								}
								arg4.method6312((float) local514, (float) local574, (float) local454, (float) local484, (float) local544, (float) local424, local150, local175, local125, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, local859 | local6.anInt9740 & 0xFFFFFF, local859 | local6.anInt9743 & 0xFFFFFF, local859 | local6.anInt9741 & 0xFFFFFF, arg3.anInt5957, local57, local59, local55, local6.aShort120);
							} else {
								if (local1842) {
									arg4.anInt7081 = 100;
								}
								arg4.method6317((float) local514, (float) local574, (float) local454, (float) local484, (float) local544, (float) local424, (float) (int) local150, (float) (int) local175, (float) (int) local125, Static513.method7412(local6.anInt9740, local57 << 24 | arg3.anInt5957), Static513.method7412(local6.anInt9743, local59 << 24 | arg3.anInt5957), Static513.method7412(local6.anInt9741, local55 << 24 | arg3.anInt5957));
								arg4.anInt7081 = 0;
							}
						} else if (local6.aShort120 >= 0) {
							local859 = -16777216;
							if (local1842) {
								local859 = -1694498816;
							}
							arg4.method6312((float) local514, (float) local574, (float) local454, (float) local484, (float) local544, (float) local424, local150, local175, local125, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, local859 | local6.anInt9740 & 0xFFFFFF, local859 | local6.anInt9743 & 0xFFFFFF, local859 | local6.anInt9741 & 0xFFFFFF, 0, 0, 0, 0, local6.aShort120);
						} else {
							if (local1842) {
								arg4.anInt7081 = 100;
							}
							arg4.method6317((float) local514, (float) local574, (float) local454, (float) local484, (float) local544, (float) local424, (float) (int) local150, (float) (int) local175, (float) (int) local125, local6.anInt9740, local6.anInt9743, local6.anInt9741);
							arg4.anInt7081 = 0;
						}
					} else {
						arg4.method6313((float) local514, (float) local574, (float) local454, (float) local484, (float) local544, (float) local424, (float) (int) local150, (float) (int) local175, (float) (int) local125, arg3.anInt5957);
					}
				}
				local848 = local53 + local55 + local59;
				if ((local364 - local424) * (local574 - local454) - (local394 - local454) * (local544 - local424) > 0) {
					arg4.aBoolean593 = local364 < 0 || local424 < 0 || local544 < 0 || local364 > arg4.anInt7077 || local424 > arg4.anInt7077 || local544 > arg4.anInt7077;
					if (local848 < 765) {
						if (local1842) {
							arg4.anInt7081 = -1694498816;
						}
						if (local848 > 0) {
							if (local6.aShort120 >= 0) {
								local859 = -16777216;
								if (local1842) {
									local859 = -1694498816;
								}
								arg4.method6312((float) local394, (float) local454, (float) local574, (float) local364, (float) local424, (float) local544, local100, local125, local175, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, local859 | local6.anInt9742 & 0xFFFFFF, local859 | local6.anInt9741 & 0xFFFFFF, local859 | local6.anInt9743 & 0xFFFFFF, arg3.anInt5957, local53, local55, local59, local6.aShort120);
								return;
							}
							if (local1842) {
								arg4.anInt7081 = 100;
							}
							arg4.method6317((float) local394, (float) local454, (float) local574, (float) local364, (float) local424, (float) local544, (float) (int) local100, (float) (int) local125, (float) (int) local175, Static513.method7412(local6.anInt9742, local53 << 24 | arg3.anInt5957), Static513.method7412(local6.anInt9741, local55 << 24 | arg3.anInt5957), Static513.method7412(local6.anInt9743, local59 << 24 | arg3.anInt5957));
							arg4.anInt7081 = 0;
							return;
						}
						if (local6.aShort120 >= 0) {
							local859 = -16777216;
							if (local1842) {
								local859 = -1694498816;
							}
							arg4.method6312((float) local394, (float) local454, (float) local574, (float) local364, (float) local424, (float) local544, local100, local125, local175, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, local859 | local6.anInt9742 & 0xFFFFFF, local859 | local6.anInt9741 & 0xFFFFFF, local859 | local6.anInt9743 & 0xFFFFFF, 0, 0, 0, 0, local6.aShort120);
							return;
						}
						if (local1842) {
							arg4.anInt7081 = 100;
						}
						arg4.method6317((float) local394, (float) local454, (float) local574, (float) local364, (float) local424, (float) local544, (float) (int) local100, (float) (int) local125, (float) (int) local175, local6.anInt9742, local6.anInt9741, local6.anInt9743);
						arg4.anInt7081 = 0;
						return;
					}
					arg4.method6313((float) local394, (float) local454, (float) local574, (float) local364, (float) local424, (float) local544, (float) (int) local100, (float) (int) local125, (float) (int) local175, arg3.anInt5957);
				}
			}
		}
	}

	@OriginalMember(owner = "client!br", name = "wa", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void wa(@OriginalArg(0) Class5_Sub4_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(III[[ZZII)V")
	@Override
	public void method8441(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class117_Sub1 local3 = this.aClass126_Sub1_1.aClass117_Sub1_1;
		this.anInt809 = arg5;
		this.aFloat15 = local3.aFloat31;
		this.aFloat12 = local3.aFloat28;
		this.aFloat20 = local3.aFloat29;
		this.aFloat9 = local3.aFloat30;
		this.aFloat10 = local3.aFloat37;
		this.aFloat19 = local3.aFloat35;
		this.aFloat11 = local3.aFloat34;
		this.aFloat14 = local3.aFloat27;
		this.aFloat13 = local3.aFloat33;
		this.aFloat18 = local3.aFloat32;
		this.aFloat16 = local3.aFloat36;
		this.aFloat17 = local3.aFloat26;
		for (@Pc(56) int local56 = 0; local56 < arg2 + arg2; local56++) {
			for (@Pc(59) int local59 = 0; local59 < arg2 + arg2; local59++) {
				if (arg3[local56][local59]) {
					@Pc(72) int local72 = arg0 + local56 - arg2;
					@Pc(78) int local78 = arg1 + local59 - arg2;
					if (local72 >= 0 && local72 < super.anInt9920 && local78 >= 0 && local78 < super.anInt9923) {
						this.method833(local72, local78, arg6);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!br", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		@Pc(8) boolean local8 = (this.anInt808 & 0x20) == 0;
		if (this.aClass353ArrayArray1 == null && !local8) {
			this.aClass353ArrayArray1 = new Class353[super.anInt9920][super.anInt9923];
			this.aClass78ArrayArray1 = new Class78[super.anInt9920][super.anInt9923];
		} else if (this.aClass233ArrayArray1 == null && local8) {
			this.aClass233ArrayArray1 = new Class233[super.anInt9920][super.anInt9923];
		} else if (this.aClass220ArrayArray1 != null) {
			throw new IllegalStateException();
		}
		if (arg2 == null || arg2.length == 0) {
			return;
		}
		for (@Pc(56) int local56 = 0; local56 < arg6.length; local56++) {
			if (arg6[local56] == -1) {
				arg6[local56] = 0;
			} else {
				arg6[local56] = Static421.anIntArray844[Static311.method4936(arg6[local56]) & 0xFFFF] << 8 | 0xFF;
			}
		}
		if (arg7 != null) {
			for (@Pc(92) int local92 = 0; local92 < arg7.length; local92++) {
				if (arg7[local92] == -1) {
					arg7[local92] = 0;
				} else {
					arg7[local92] = Static421.anIntArray844[Static311.method4936(arg7[local92]) & 0xFFFF] << 8 | 0xFF;
				}
			}
		}
		@Pc(186) int local186;
		@Pc(191) int local191;
		@Pc(195) int local195;
		@Pc(215) int local215;
		@Pc(336) int local336;
		@Pc(383) int local383;
		@Pc(467) int local467;
		@Pc(499) int local499;
		if (local8) {
			@Pc(130) Class233 local130 = new Class233();
			local130.aShort83 = (short) arg2.length;
			local130.aShort82 = (short) (arg2.length / 3);
			local130.aShortArray87 = new short[local130.aShort83];
			local130.aShortArray83 = new short[local130.aShort83];
			local130.aShortArray86 = new short[local130.aShort83];
			local130.anIntArray494 = new int[local130.aShort83];
			local130.aShortArray82 = new short[local130.aShort83];
			local130.aShortArray84 = new short[local130.aShort83];
			local130.aByteArray49 = new byte[local130.aShort83];
			if (arg5 != null) {
				local130.aShortArray85 = new short[local130.aShort83];
			}
			for (local186 = 0; local186 < local130.aShort83; local186++) {
				local191 = arg2[local186];
				local195 = arg4[local186];
				if (local191 == 0 && local195 == 0) {
					local215 = this.aByteArrayArray3[arg0][arg1] - this.aByteArrayArray2[arg0][arg1];
				} else if (local191 == 0 && local195 == super.anInt9918) {
					local215 = this.aByteArrayArray3[arg0][arg1 + 1] - this.aByteArrayArray2[arg0][arg1 + 1];
				} else if (local191 == super.anInt9918 && local195 == super.anInt9918) {
					local215 = this.aByteArrayArray3[arg0 + 1][arg1 + 1] - this.aByteArrayArray2[arg0 + 1][arg1 + 1];
				} else if (local191 == super.anInt9918 && local195 == 0) {
					local215 = this.aByteArrayArray3[arg0 + 1][arg1] - this.aByteArrayArray2[arg0 + 1][arg1];
				} else {
					local336 = (this.aByteArrayArray3[arg0][arg1] - this.aByteArrayArray2[arg0][arg1]) * (super.anInt9918 - local191) + (this.aByteArrayArray3[arg0 + 1][arg1] - this.aByteArrayArray2[arg0 + 1][arg1]) * local191;
					local383 = (this.aByteArrayArray3[arg0][arg1 + 1] - this.aByteArrayArray2[arg0][arg1 + 1]) * (super.anInt9918 - local191) + (this.aByteArrayArray3[arg0 + 1][arg1 + 1] - this.aByteArrayArray2[arg0 + 1][arg1 + 1]) * local191;
					local215 = local336 * (super.anInt9918 - local195) + local383 * local195 >> super.anInt9919 * 2;
				}
				local336 = (arg0 << super.anInt9919) + local191;
				local383 = (arg1 << super.anInt9919) + local195;
				local130.aShortArray87[local186] = (short) local191;
				local130.aShortArray86[local186] = (short) local195;
				local130.aShortArray83[local186] = (short) (this.method8447(local336, local383) + (arg3 == null ? 0 : arg3[local186]));
				if (local215 < 0) {
					local215 = 0;
				}
				if (arg6[local186] == 0) {
					local130.anIntArray494[local186] = 0;
					if (arg7 != null) {
						local130.aByteArray49[local186] = (byte) local215;
					}
				} else {
					local467 = 0;
					if (arg5 != null) {
						@Pc(479) short local479 = local130.aShortArray85[local186] = (short) arg5[local186];
						if (arg11 != 0) {
							local467 = local479 * 255 / arg11;
							if (local467 < 0) {
								local467 = 0;
							} else if (local467 > 255) {
								local467 = 255;
							}
						}
					}
					local499 = -16777216;
					if (arg8[local186] != -1 && this.method835(this.aClass126_Sub1_1.anInterface8_10.method7813(arg8[local186]).aByte115)) {
						local499 = -1694498816;
					}
					local130.anIntArray494[local186] = local499 | Static49.method779(Static651.method836(arg6[local186] >> 8, local215), local467, arg10);
					if (arg7 != null) {
						local130.aByteArray49[local186] = (byte) local215;
					}
				}
				local130.aShortArray82[local186] = (short) arg8[local186];
				local130.aShortArray84[local186] = (short) arg9[local186];
			}
			if (arg7 != null) {
				local130.anIntArray495 = new int[local130.aShort82];
			}
			for (local191 = 0; local191 < local130.aShort82; local191++) {
				local195 = local191 * 3;
				if (arg7 != null && arg7[local195] != 0) {
					local130.anIntArray495[local191] = arg7[local195] >> 8 | 0xFF000000;
				}
			}
			this.aClass233ArrayArray1[arg0][arg1] = local130;
			return;
		}
		@Pc(610) boolean local610 = true;
		local186 = -1;
		local191 = -1;
		local195 = -1;
		local215 = -1;
		if (arg2.length == 6) {
			for (local336 = 0; local336 < 6; local336++) {
				if (arg2[local336] == 0 && arg4[local336] == 0) {
					if (local186 != -1 && arg6[local186] != arg6[local336]) {
						local610 = false;
						break;
					}
					local186 = local336;
				} else if (arg2[local336] == super.anInt9918 && arg4[local336] == 0) {
					if (local191 != -1 && arg6[local191] != arg6[local336]) {
						local610 = false;
						break;
					}
					local191 = local336;
				} else if (arg2[local336] == super.anInt9918 && arg4[local336] == super.anInt9918) {
					if (local195 != -1 && arg6[local195] != arg6[local336]) {
						local610 = false;
						break;
					}
					local195 = local336;
				} else if (arg2[local336] == 0 && arg4[local336] == super.anInt9918) {
					if (local215 != -1 && arg6[local215] != arg6[local336]) {
						local610 = false;
						break;
					}
					local215 = local336;
				}
			}
			if (local186 == -1 || local191 == -1 || local195 == -1 || local215 == -1) {
				local610 = false;
			}
			if (local610) {
				if (arg3 != null) {
					for (local383 = 0; local383 < 4; local383++) {
						if (arg3[local383] != 0) {
							local610 = false;
							break;
						}
					}
				}
				if (local610) {
					for (local383 = 1; local383 < 4; local383++) {
						if (arg2[local383] != arg2[0] && arg2[local383] != arg2[0] + super.anInt9918 && arg2[local383] != arg2[0] - super.anInt9918) {
							local610 = false;
							break;
						}
						if (arg4[local383] != arg4[0] && arg4[local383] != arg4[0] + super.anInt9918 && arg4[local383] != arg4[0] - super.anInt9918) {
							local610 = false;
							break;
						}
					}
				}
			}
		} else {
			local610 = false;
		}
		if (!local610) {
			@Pc(1623) Class78 local1623 = new Class78();
			local1623.aShort22 = (short) arg2.length;
			local1623.aShort21 = (short) (arg2.length / 3);
			local1623.aShortArray34 = new short[local1623.aShort22];
			local1623.aShortArray30 = new short[local1623.aShort22];
			local1623.aShortArray31 = new short[local1623.aShort22];
			local1623.anIntArray142 = new int[local1623.aShort22];
			if (arg5 != null) {
				local1623.aShortArray33 = new short[local1623.aShort22];
			}
			@Pc(1693) int local1693;
			@Pc(1814) int local1814;
			@Pc(1861) int local1861;
			@Pc(1947) int local1947;
			for (local383 = 0; local383 < local1623.aShort22; local383++) {
				local467 = arg2[local383];
				local499 = arg4[local383];
				if (local467 == 0 && local499 == 0) {
					local1693 = this.aByteArrayArray3[arg0][arg1] - this.aByteArrayArray2[arg0][arg1];
				} else if (local467 == 0 && local499 == super.anInt9918) {
					local1693 = this.aByteArrayArray3[arg0][arg1 + 1] - this.aByteArrayArray2[arg0][arg1 + 1];
				} else if (local467 == super.anInt9918 && local499 == super.anInt9918) {
					local1693 = this.aByteArrayArray3[arg0 + 1][arg1 + 1] - this.aByteArrayArray2[arg0 + 1][arg1 + 1];
				} else if (local467 == super.anInt9918 && local499 == 0) {
					local1693 = this.aByteArrayArray3[arg0 + 1][arg1] - this.aByteArrayArray2[arg0 + 1][arg1];
				} else {
					local1814 = (this.aByteArrayArray3[arg0][arg1] - this.aByteArrayArray2[arg0][arg1]) * (super.anInt9918 - local467) + (this.aByteArrayArray3[arg0 + 1][arg1] - this.aByteArrayArray2[arg0 + 1][arg1]) * local467;
					local1861 = (this.aByteArrayArray3[arg0][arg1 + 1] - this.aByteArrayArray2[arg0][arg1 + 1]) * (super.anInt9918 - local467) + (this.aByteArrayArray3[arg0 + 1][arg1 + 1] - this.aByteArrayArray2[arg0 + 1][arg1 + 1]) * local467;
					local1693 = local1814 * (super.anInt9918 - local499) + local1861 * local499 >> super.anInt9919 * 2;
				}
				local1814 = (arg0 << super.anInt9919) + local467;
				local1861 = (arg1 << super.anInt9919) + local499;
				local1623.aShortArray34[local383] = (short) local467;
				local1623.aShortArray31[local383] = (short) local499;
				local1623.aShortArray30[local383] = (short) (this.method8447(local1814, local1861) + (arg3 == null ? 0 : arg3[local383]));
				if (local1693 < 0) {
					local1693 = 0;
				}
				if (arg6[local383] != 0) {
					local1947 = 0;
					if (arg5 != null) {
						@Pc(1959) short local1959 = local1623.aShortArray33[local383] = (short) arg5[local383];
						if (arg11 != 0) {
							local1947 = local1959 * 255 / arg11;
							if (local1947 < 0) {
								local1947 = 0;
							} else if (local1947 > 255) {
								local1947 = 255;
							}
						}
					}
					local1623.anIntArray142[local383] = Static49.method779(Static651.method836(arg6[local383] >> 8, local1693), local1947, arg10);
					if (arg7 != null) {
						local1623.anIntArray142[local383] |= local1693 << 25;
					}
				} else if (arg7 == null) {
					local1623.anIntArray142[local383] = 0;
				} else {
					local1623.anIntArray142[local383] = local1693 << 25;
				}
			}
			@Pc(2011) boolean local2011 = false;
			for (local499 = 0; local499 < local1623.aShort21; local499++) {
				if (arg8[local499 * 3] != -1 && !this.aClass126_Sub1_1.anInterface8_10.method7813(arg8[local499 * 3]).aBoolean724) {
					local2011 = true;
				}
			}
			if (arg7 != null) {
				local1623.anIntArray141 = new int[local1623.aShort21];
			}
			if (local2011) {
				local1623.aShortArray32 = new short[local1623.aShort21];
				local1623.aShortArray29 = new short[local1623.aShort21];
			}
			for (local1693 = 0; local1693 < local1623.aShort21; local1693++) {
				local1814 = local1693 * 3;
				if (arg7 != null && arg7[local1814] != 0) {
					local1623.anIntArray141[local1693] = arg7[local1814] >> 8;
				}
				if (local2011) {
					local1861 = local1814 + 1;
					local1947 = local1861 + 1;
					@Pc(2093) boolean local2093 = false;
					@Pc(2095) boolean local2095 = true;
					@Pc(2099) int local2099 = arg8[local1814];
					if (local2099 == -1 || this.aClass126_Sub1_1.anInterface8_10.method7813(local2099).aBoolean724) {
						local2095 = false;
					} else {
						local2093 = true;
					}
					local2099 = arg8[local1861];
					if (local2099 == -1 || this.aClass126_Sub1_1.anInterface8_10.method7813(local2099).aBoolean724) {
						local2095 = false;
					} else {
						local2093 = true;
					}
					local2099 = arg8[local1947];
					if (local2099 == -1 || this.aClass126_Sub1_1.anInterface8_10.method7813(local2099).aBoolean724) {
						local2095 = false;
					} else {
						local2093 = true;
					}
					if (local2095) {
						local1623.aShortArray32[local1693] = (short) local2099;
						local1623.aShortArray29[local1693] = (short) arg9[local1814];
					} else {
						if (local2093) {
							local2099 = arg8[local1814];
							if (local2099 != -1 && !this.aClass126_Sub1_1.anInterface8_10.method7813(local2099).aBoolean724) {
								local1623.anIntArray142[local1814] = Static421.anIntArray844[Static311.method4936(this.aClass126_Sub1_1.anInterface8_10.method7813(local2099).aShort103 & 0xFFFF) & 0xFFFF];
							}
							local2099 = arg8[local1861];
							if (local2099 != -1 && !this.aClass126_Sub1_1.anInterface8_10.method7813(local2099).aBoolean724) {
								local1623.anIntArray142[local1861] = Static421.anIntArray844[Static311.method4936(this.aClass126_Sub1_1.anInterface8_10.method7813(local2099).aShort103 & 0xFFFF) & 0xFFFF];
							}
							local2099 = arg8[local1947];
							if (local2099 != -1 && !this.aClass126_Sub1_1.anInterface8_10.method7813(local2099).aBoolean724) {
								local1623.anIntArray142[local1947] = Static421.anIntArray844[Static311.method4936(this.aClass126_Sub1_1.anInterface8_10.method7813(local2099).aShort103 & 0xFFFF) & 0xFFFF];
							}
						}
						local1623.aShortArray32[local1693] = -1;
					}
				}
			}
			this.aClass78ArrayArray1[arg0][arg1] = local1623;
			return;
		}
		@Pc(842) Class353 local842 = new Class353();
		local383 = arg6[0];
		local467 = arg8[0];
		if (arg7 != null) {
			local842.anInt9739 = arg7[0] >> 8;
			if (local383 == 0) {
				local842.aByte129 = (byte) (local842.aByte129 | 0x2);
			}
		} else if (local383 == 0) {
			return;
		}
		if (super.anIntArrayArray60[arg0][arg1] == super.anIntArrayArray60[arg0 + 1][arg1] && super.anIntArrayArray60[arg0][arg1] == super.anIntArrayArray60[arg0 + 1][arg1 + 1] && super.anIntArrayArray60[arg0][arg1] == super.anIntArrayArray60[arg0][arg1 + 1]) {
			local842.aByte129 = (byte) (local842.aByte129 | 0x1);
		}
		if (local467 == -1 || (local842.aByte129 & 0x2) != 0 || this.aClass126_Sub1_1.anInterface8_10.method7813(local467).aBoolean724) {
			if (arg5 == null || arg11 == 0) {
				local499 = 0;
			} else {
				local499 = arg5[local186] * 255 / arg11;
				if (local499 < 0) {
					local499 = 0;
				} else if (local499 > 255) {
					local499 = 255;
				}
			}
			local842.anInt9742 = Static49.method779(Static651.method836(arg6[local186] >> 8, this.aByteArrayArray3[arg0][arg1] - this.aByteArrayArray2[arg0][arg1]), local499, arg10);
			if (local842.anInt9739 != 0) {
				local842.anInt9742 |= this.aByteArrayArray2[arg0][arg1] + 255 - this.aByteArrayArray3[arg0][arg1] << 25;
			}
			if (arg5 == null || arg11 == 0) {
				local499 = 0;
			} else {
				local499 = arg5[local191] * 255 / arg11;
				if (local499 < 0) {
					local499 = 0;
				} else if (local499 > 255) {
					local499 = 255;
				}
			}
			local842.anInt9741 = Static49.method779(Static651.method836(arg6[local191] >> 8, this.aByteArrayArray3[arg0 + 1][arg1] - this.aByteArrayArray2[arg0 + 1][arg1]), local499, arg10);
			if (local842.anInt9739 != 0) {
				local842.anInt9741 |= this.aByteArrayArray2[arg0 + 1][arg1] + 255 - this.aByteArrayArray3[arg0 + 1][arg1] << 25;
			}
			if (arg5 == null || arg11 == 0) {
				local499 = 0;
			} else {
				local499 = arg5[local195] * 255 / arg11;
				if (local499 < 0) {
					local499 = 0;
				} else if (local499 > 255) {
					local499 = 255;
				}
			}
			local842.anInt9740 = Static49.method779(Static651.method836(arg6[local195] >> 8, this.aByteArrayArray3[arg0 + 1][arg1 + 1] - this.aByteArrayArray2[arg0 + 1][arg1 + 1]), local499, arg10);
			if (local842.anInt9739 != 0) {
				local842.anInt9740 |= this.aByteArrayArray2[arg0 + 1][arg1 + 1] + 255 - this.aByteArrayArray3[arg0 + 1][arg1 + 1] << 25;
			}
			if (arg5 == null || arg11 == 0) {
				local499 = 0;
			} else {
				local499 = arg5[local215] * 255 / arg11;
				if (local499 < 0) {
					local499 = 0;
				} else if (local499 > 255) {
					local499 = 255;
				}
			}
			local842.anInt9743 = Static49.method779(Static651.method836(arg6[local215] >> 8, this.aByteArrayArray3[arg0][arg1 + 1] - this.aByteArrayArray2[arg0][arg1 + 1]), local499, arg10);
			if (local842.anInt9739 != 0) {
				local842.anInt9743 |= this.aByteArrayArray2[arg0][arg1 + 1] + 255 - this.aByteArrayArray3[arg0][arg1 + 1] << 25;
			}
			local842.aShort120 = -1;
		} else {
			if (arg5 == null || arg11 == 0) {
				local499 = 0;
			} else {
				local499 = arg5[local186] * 255 / arg11;
				if (local499 < 0) {
					local499 = 0;
				} else if (local499 > 255) {
					local499 = 255;
				}
			}
			local842.anInt9742 = Static49.method779(Static651.method836(arg6[local186] >> 8, this.aByteArrayArray3[arg0][arg1] - this.aByteArrayArray2[arg0][arg1]), local499, arg10);
			if (local842.anInt9739 != 0) {
				local842.anInt9742 |= this.aByteArrayArray2[arg0][arg1] + 255 - this.aByteArrayArray3[arg0][arg1] << 25;
			}
			if (arg5 == null || arg11 == 0) {
				local499 = 0;
			} else {
				local499 = arg5[local191] * 255 / arg11;
				if (local499 < 0) {
					local499 = 0;
				} else if (local499 > 255) {
					local499 = 255;
				}
			}
			local842.anInt9741 = Static49.method779(Static651.method836(arg6[local191] >> 8, this.aByteArrayArray3[arg0 + 1][arg1] - this.aByteArrayArray2[arg0 + 1][arg1]), local499, arg10);
			if (local842.anInt9739 != 0) {
				local842.anInt9741 |= this.aByteArrayArray2[arg0 + 1][arg1] + 255 - this.aByteArrayArray3[arg0 + 1][arg1] << 25;
			}
			if (arg5 == null || arg11 == 0) {
				local499 = 0;
			} else {
				local499 = arg5[local195] * 255 / arg11;
				if (local499 < 0) {
					local499 = 0;
				} else if (local499 > 255) {
					local499 = 255;
				}
			}
			local842.anInt9740 = Static49.method779(Static651.method836(arg6[local195] >> 8, this.aByteArrayArray3[arg0 + 1][arg1 + 1] - this.aByteArrayArray2[arg0 + 1][arg1 + 1]), local499, arg10);
			if (local842.anInt9739 != 0) {
				local842.anInt9740 |= this.aByteArrayArray2[arg0 + 1][arg1 + 1] + 255 - this.aByteArrayArray3[arg0 + 1][arg1 + 1] << 25;
			}
			if (arg5 == null || arg11 == 0) {
				local499 = 0;
			} else {
				local499 = arg5[local215] * 255 / arg11;
				if (local499 < 0) {
					local499 = 0;
				} else if (local499 > 255) {
					local499 = 255;
				}
			}
			local842.anInt9743 = Static49.method779(Static651.method836(arg6[local215] >> 8, this.aByteArrayArray3[arg0][arg1 + 1] - this.aByteArrayArray2[arg0][arg1 + 1]), local499, arg10);
			local842.aShort120 = (short) local467;
		}
		if (arg5 != null) {
			local842.aShort118 = (short) arg5[local195];
			local842.aShort119 = (short) arg5[local215];
			local842.aShort121 = (short) arg5[local191];
			local842.aShort122 = (short) arg5[local186];
		}
		this.aClass353ArrayArray1[arg0][arg1] = local842;
	}

	@OriginalMember(owner = "client!br", name = "b", descriptor = "(IIIIIII[[ZLclient!mda;Lclient!or;[I[I)V")
	private void method840(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(8) Class223 arg5, @OriginalArg(9) Class263 arg6, @OriginalArg(10) int[] arg7, @OriginalArg(11) int[] arg8) {
		@Pc(7) int local7 = (arg3 - arg1) * 1024 / 256;
		@Pc(14) boolean local14 = arg5.aBoolean498;
		this.aClass126_Sub1_1.C(false);
		arg6.aBoolean591 = false;
		arg6.aBoolean592 = false;
		@Pc(26) int local26 = 0;
		@Pc(30) int local30 = local7;
		for (@Pc(32) int local32 = arg0; local32 < arg2; local32++) {
			for (@Pc(35) int local35 = arg1; local35 < arg3; local35++) {
				if (arg4[local32 - arg0][local35 - arg1]) {
					@Pc(79) int local79;
					if (this.aClass220ArrayArray1[local32][local35] != null) {
						@Pc(60) Class220 local60 = this.aClass220ArrayArray1[local32][local35];
						if (local60.aShort80 != -1 && (local60.aByte88 & 0x2) == 0 && local60.anInt5921 == -1) {
							local79 = this.aClass126_Sub1_1.method2892(local60.aShort80);
							arg6.method6315((float) (local30 - 4), (float) (local30 - 4), (float) local30, (float) (local26 + 4), (float) local26, (float) (local26 + 4), 100.0F, 100.0F, 100.0F, (float) Static408.method6250(local60.aShort81 & 0xFFFF, local79), (float) Static408.method6250(local60.aShort78 & 0xFFFF, local79), (float) Static408.method6250(local60.aShort79 & 0xFFFF, local79));
							arg6.method6315((float) local30, (float) local30, (float) (local30 - 4), (float) local26, (float) (local26 + 4), (float) local26, 100.0F, 100.0F, 100.0F, (float) Static408.method6250(local60.aShort77 & 0xFFFF, local79), (float) Static408.method6250(local60.aShort79 & 0xFFFF, local79), (float) Static408.method6250(local60.aShort78 & 0xFFFF, local79));
						} else if (local60.anInt5921 == -1) {
							arg6.method6315((float) (local30 - 4), (float) (local30 - 4), (float) local30, (float) (local26 + 4), (float) local26, (float) (local26 + 4), 100.0F, 100.0F, 100.0F, (float) (local60.aShort81 & 0xFFFF), (float) (local60.aShort78 & 0xFFFF), (float) (local60.aShort79 & 0xFFFF));
							arg6.method6315((float) local30, (float) local30, (float) (local30 - 4), (float) local26, (float) (local26 + 4), (float) local26, 100.0F, 100.0F, 100.0F, (float) (local60.aShort77 & 0xFFFF), (float) (local60.aShort79 & 0xFFFF), (float) (local60.aShort78 & 0xFFFF));
						} else {
							local79 = local60.anInt5921;
							arg6.method6315((float) (local30 - 4), (float) (local30 - 4), (float) local30, (float) (local26 + 4), (float) local26, (float) (local26 + 4), 100.0F, 100.0F, 100.0F, (float) local79, (float) local79, (float) local79);
							arg6.method6315((float) local30, (float) local30, (float) (local30 - 4), (float) local26, (float) (local26 + 4), (float) local26, 100.0F, 100.0F, 100.0F, (float) local79, (float) local79, (float) local79);
						}
					} else if (this.aClass343ArrayArray1[local32][local35] != null) {
						@Pc(331) Class343 local331 = this.aClass343ArrayArray1[local32][local35];
						for (local79 = 0; local79 < local331.aShort116; local79++) {
							arg7[local79] = local26 + local331.aShortArray161[local79] * 4 / super.anInt9918;
							arg8[local79] = local30 - local331.aShortArray162[local79] * 4 / super.anInt9918;
						}
						for (@Pc(369) int local369 = 0; local369 < local331.aShort117; local369++) {
							@Pc(375) short local375 = local331.aShortArray158[local369];
							@Pc(380) short local380 = local331.aShortArray163[local369];
							@Pc(385) short local385 = local331.aShortArray157[local369];
							@Pc(389) int local389 = arg7[local375];
							@Pc(393) int local393 = arg7[local380];
							@Pc(397) int local397 = arg7[local385];
							@Pc(401) int local401 = arg8[local375];
							@Pc(405) int local405 = arg8[local380];
							@Pc(409) int local409 = arg8[local385];
							@Pc(423) int local423;
							if (local331.anIntArray750 != null && local331.anIntArray750[local369] != -1) {
								local423 = local331.anIntArray750[local369];
								arg6.method6315((float) local401, (float) local405, (float) local409, (float) local389, (float) local393, (float) local397, 100.0F, 100.0F, 100.0F, (float) Static408.method6250(local331.aShortArray159[local375], local423), (float) Static408.method6250(local331.aShortArray159[local380], local423), (float) Static408.method6250(local331.aShortArray159[local385], local423));
							} else if (local331.aShortArray160 == null || local331.aShortArray160[local369] == -1) {
								local423 = local331.anIntArray751[local369];
								arg6.method6315((float) local401, (float) local405, (float) local409, (float) local389, (float) local393, (float) local397, 100.0F, 100.0F, 100.0F, (float) Static408.method6250(local331.aShortArray159[local375], local423), (float) Static408.method6250(local331.aShortArray159[local380], local423), (float) Static408.method6250(local331.aShortArray159[local385], local423));
							} else {
								local423 = this.aClass126_Sub1_1.method2892(local331.aShortArray160[local369]);
								arg6.method6315((float) local401, (float) local405, (float) local409, (float) local389, (float) local393, (float) local397, 100.0F, 100.0F, 100.0F, (float) Static408.method6250(local331.aShortArray159[local375], local423), (float) Static408.method6250(local331.aShortArray159[local380], local423), (float) Static408.method6250(local331.aShortArray159[local385], local423));
							}
						}
					}
				}
				local30 -= 4;
			}
			local30 = local7;
			local26 += 4;
		}
		arg6.aBoolean591 = true;
		this.aClass126_Sub1_1.C(local14);
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method8446(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		@Pc(3) Class117_Sub1 local3 = this.aClass126_Sub1_1.aClass117_Sub1_1;
		this.anInt809 = -1;
		this.aFloat15 = local3.aFloat31;
		this.aFloat12 = local3.aFloat28;
		this.aFloat20 = local3.aFloat29;
		this.aFloat9 = local3.aFloat30;
		this.aFloat10 = local3.aFloat37;
		this.aFloat19 = local3.aFloat35;
		this.aFloat11 = local3.aFloat34;
		this.aFloat14 = local3.aFloat27;
		this.aFloat13 = local3.aFloat33;
		this.aFloat18 = local3.aFloat32;
		this.aFloat16 = local3.aFloat36;
		this.aFloat17 = local3.aFloat26;
		for (@Pc(56) int local56 = 0; local56 < arg2 + arg2; local56++) {
			for (@Pc(59) int local59 = 0; local59 < arg2 + arg2; local59++) {
				if (arg3[local56][local59]) {
					@Pc(72) int local72 = arg0 + local56 - arg2;
					@Pc(78) int local78 = arg1 + local59 - arg2;
					if (local72 >= 0 && local72 < super.anInt9920 && local78 >= 0 && local78 < super.anInt9923) {
						this.method833(local72, local78, arg5);
					}
				}
			}
		}
	}
}
