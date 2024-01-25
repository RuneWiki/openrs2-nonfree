import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nr")
public final class Class20_Sub1_Sub1_Sub1 extends Class20_Sub1_Sub1 {

	@OriginalMember(owner = "client!nr", name = "J", descriptor = "I")
	private int anInt6331;

	@OriginalMember(owner = "client!nr", name = "K", descriptor = "S")
	private short aShort59;

	@OriginalMember(owner = "client!nr", name = "M", descriptor = "Lclient!od;")
	public Class20_Sub7 aClass20_Sub7_1;

	@OriginalMember(owner = "client!nr", name = "I", descriptor = "S")
	private short aShort58;

	@OriginalMember(owner = "client!nr", name = "N", descriptor = "S")
	private short aShort61;

	@OriginalMember(owner = "client!nr", name = "L", descriptor = "S")
	private short aShort60;

	@OriginalMember(owner = "client!nr", name = "H", descriptor = "S")
	private short aShort57;

	@OriginalMember(owner = "client!nr", name = "P", descriptor = "S")
	private short aShort62;

	@OriginalMember(owner = "client!nr", name = "O", descriptor = "I")
	private int anInt6332;

	@OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(Lclient!od;IIIIIIIIIIIZZ)V")
	public Class20_Sub1_Sub1_Sub1(@OriginalArg(0) Class20_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass20_Sub7_1 = arg0;
		super.anInt6325 = arg1 << 12;
		super.anInt6324 = arg2 << 12;
		super.anInt6329 = arg3 << 12;
		super.anInt6327 = arg9;
		this.aShort61 = this.aShort58 = (short) arg8;
		super.anInt6323 = arg10;
		super.anInt6322 = arg11;
		super.aBoolean451 = arg13;
		this.aShort60 = (short) arg4;
		this.aShort57 = (short) arg5;
		this.aShort62 = (short) arg6;
		this.anInt6332 = arg7;
		super.aByte84 = this.aClass20_Sub7_1.aClass219_2.aByte80;
		this.method5278();
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "()V")
	private void method5278() {
		@Pc(4) int local4 = this.aClass20_Sub7_1.aClass20_Sub5_5.anInt4270;
		if (this.aClass20_Sub7_1.aClass20_Sub5_5.aClass20_Sub1_Sub1_Sub1Array1[local4] != null) {
			this.aClass20_Sub7_1.aClass20_Sub5_5.aClass20_Sub1_Sub1_Sub1Array1[local4].method5279();
		}
		this.aClass20_Sub7_1.aClass20_Sub5_5.aClass20_Sub1_Sub1_Sub1Array1[local4] = this;
		this.aShort59 = (short) this.aClass20_Sub7_1.aClass20_Sub5_5.anInt4270;
		this.aClass20_Sub7_1.aClass20_Sub5_5.anInt4270 = local4 + 1 & 0x1FFF;
		this.aClass20_Sub7_1.aClass349_10.method7655(this);
	}

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "()V")
	public void method5279() {
		this.aClass20_Sub7_1.aClass20_Sub5_5.aClass20_Sub1_Sub1_Sub1Array1[this.aShort59] = null;
		Static293.aClass20_Sub1_Sub1_Sub1Array2[Static436.anInt7677] = this;
		Static436.anInt7677 = Static436.anInt7677 + 1 & 0x3FF;
		this.method7704();
		this.method5273();
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lclient!r;J)V")
	public void method5280(@OriginalArg(0) Class12 arg0, @OriginalArg(1) long arg1) {
		@Pc(6) int local6 = super.anInt6325 >> Static378.anInt6665 + 12;
		@Pc(13) int local13 = super.anInt6329 >> Static378.anInt6665 + 12;
		@Pc(18) int local18 = super.anInt6324 >> 12;
		if (local18 > 0 || local18 < -262144 || local6 < 0 || local6 >= Static446.anInt7725 || local13 < 0 || local13 >= Static218.anInt4229) {
			this.method5279();
			return;
		}
		@Pc(40) Class20_Sub5 local40 = this.aClass20_Sub7_1.aClass20_Sub5_5;
		@Pc(44) Class86 local44 = this.aClass20_Sub7_1.aClass86_1;
		@Pc(46) Class17[] local46 = Static20.aClass17Array1;
		@Pc(49) int local49 = local40.anInt4272;
		@Pc(58) Class293 local58 = Static118.aClass293ArrayArrayArray14[local40.anInt4272][local6][local13];
		if (local58 != null) {
			local49 = local58.aByte100;
		}
		@Pc(71) int local71 = local46[local49].method6642(local6, local13);
		@Pc(86) int local86;
		if (local49 < Static101.anInt2104 - 1) {
			local86 = local46[local49 + 1].method6642(local6, local13);
		} else {
			local86 = local71 - (0x8 << Static378.anInt6665);
		}
		if (local44.aBoolean183) {
			if (local44.anInt2372 == -1 && local18 > local71) {
				this.method5279();
				return;
			}
			if (local44.anInt2372 >= 0 && local18 > local46[local44.anInt2372].method6642(local6, local13)) {
				this.method5279();
				return;
			}
			if (local44.anInt2370 == -1 && local18 < local86) {
				this.method5279();
				return;
			}
			if (local44.anInt2370 >= 0 && local18 < local46[local44.anInt2370 + 1].method6642(local6, local13)) {
				this.method5279();
				return;
			}
		}
		@Pc(154) int local154;
		for (local154 = Static101.anInt2104 - 1; local154 > 0 && local18 > local46[local154].method6642(local6, local13); local154--) {
		}
		if (local44.aBoolean178 && local154 == 0 && local18 > local46[0].method6642(local6, local13)) {
			this.method5279();
		} else if (local154 == Static101.anInt2104 - 1 && local46[local154].method6642(local6, local13) - local18 > 0x8 << Static378.anInt6665) {
			this.method5279();
		} else {
			local58 = Static118.aClass293ArrayArrayArray14[local154][local6][local13];
			@Pc(261) int local261;
			if (local58 == null) {
				if (local154 == 0 || Static118.aClass293ArrayArrayArray14[0][local6][local13] == null) {
					local58 = Static118.aClass293ArrayArrayArray14[0][local6][local13] = new Class293(0);
				}
				@Pc(251) boolean local251 = Static118.aClass293ArrayArrayArray14[0][local6][local13].aClass293_1 != null;
				if (local154 == 3 && local251) {
					this.method5279();
					return;
				}
				for (local261 = 1; local261 <= local154; local261++) {
					if (Static118.aClass293ArrayArrayArray14[local261][local6][local13] == null) {
						local58 = Static118.aClass293ArrayArrayArray14[local261][local6][local13] = new Class293(local261);
						if (local251) {
							local58.aByte100++;
						}
					}
				}
			}
			if (local44.aBoolean180) {
				@Pc(304) int local304 = super.anInt6325 >> 12;
				local261 = super.anInt6329 >> 12;
				@Pc(318) Class60 local318;
				if (local58.aClass20_Sub2_Sub2_2 != null) {
					local318 = local58.aClass20_Sub2_Sub2_2.method7262(arg0);
					if (local318 != null && local318.method1642(local304, local261, local18)) {
						this.method5279();
						return;
					}
				}
				if (local58.aClass20_Sub2_Sub2_1 != null) {
					local318 = local58.aClass20_Sub2_Sub2_1.method7262(arg0);
					if (local318 != null && local318.method1642(local304, local261, local18)) {
						this.method5279();
						return;
					}
				}
				if (local58.aClass20_Sub2_Sub3_1 != null) {
					local318 = local58.aClass20_Sub2_Sub3_1.method7262(arg0);
					if (local318 != null && local318.method1642(local304, local261, local18)) {
						this.method5279();
						return;
					}
				}
				for (@Pc(375) Class285 local375 = local58.aClass285_6; local375 != null; local375 = local375.aClass285_5) {
					@Pc(382) Class60 local382 = local375.aClass20_Sub2_Sub4_1.method7262(arg0);
					if (local382 != null && local382.method1642(local304, local261, local18)) {
						this.method5279();
						return;
					}
				}
			}
			local40.aClass82_1.aClass127_1.method2715(this);
		}
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(JI)V")
	public void method5281(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort58 = (short) (this.aShort58 - arg1);
		if (this.aShort58 <= 0) {
			this.method5279();
			return;
		}
		@Pc(17) int local17 = super.anInt6325 >> 12;
		@Pc(22) int local22 = super.anInt6324 >> 12;
		@Pc(27) int local27 = super.anInt6329 >> 12;
		@Pc(31) Class20_Sub5 local31 = this.aClass20_Sub7_1.aClass20_Sub5_5;
		@Pc(35) Class86 local35 = this.aClass20_Sub7_1.aClass86_1;
		if (local35.anInt2378 != 0) {
			@Pc(65) int local65;
			if (this.aShort61 - this.aShort58 <= local35.anInt2357) {
				local65 = (super.anInt6327 >> 8 & 0xFF00) + (this.anInt6331 >> 16 & 0xFF) + local35.anInt2394 * arg1;
				@Pc(82) int local82 = (super.anInt6327 & 0xFF00) + (this.anInt6331 >> 8 & 0xFF) + local35.anInt2349 * arg1;
				@Pc(99) int local99 = ((super.anInt6327 & 0xFF) << 8) + (this.anInt6331 & 0xFF) + local35.anInt2375 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				if (local82 < 0) {
					local82 = 0;
				} else if (local82 > 65535) {
					local82 = 65535;
				}
				if (local99 < 0) {
					local99 = 0;
				} else if (local99 > 65535) {
					local99 = 65535;
				}
				super.anInt6327 &= 0xFF000000;
				super.anInt6327 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt6331 &= 0xFF000000;
				this.anInt6331 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort61 - this.aShort58 <= local35.anInt2376) {
				local65 = (super.anInt6327 >> 16 & 0xFF00) + (this.anInt6331 >> 24 & 0xFF) + local35.anInt2351 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt6327 &= 0xFFFFFF;
				super.anInt6327 |= (local65 & 0xFF00) << 16;
				this.anInt6331 &= 0xFFFFFF;
				this.anInt6331 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt2353 != -1 && this.aShort61 - this.aShort58 <= local35.anInt2346) {
			this.anInt6332 += local35.anInt2352 * arg1;
		}
		if (local35.anInt2395 != -1 && this.aShort61 - this.aShort58 <= local35.anInt2362) {
			super.anInt6323 += local35.anInt2392 * arg1;
		}
		@Pc(296) double local296 = (double) this.aShort60;
		@Pc(300) double local300 = (double) this.aShort57;
		@Pc(304) double local304 = (double) this.aShort62;
		@Pc(306) boolean local306 = false;
		@Pc(317) int local317;
		@Pc(324) int local324;
		@Pc(331) int local331;
		@Pc(348) int local348;
		@Pc(356) long local356;
		if (local35.anInt2347 == 1) {
			local317 = local17 - this.aClass20_Sub7_1.aClass121_1.anInt3044;
			local324 = local22 - this.aClass20_Sub7_1.aClass121_1.anInt3050;
			local331 = local27 - this.aClass20_Sub7_1.aClass121_1.anInt3047;
			local348 = (int) Math.sqrt((double) (local317 * local317 + local324 * local324 + local331 * local331)) >> 2;
			local356 = local35.anInt2358 * local348 * arg1;
			this.anInt6332 = (int) ((long) this.anInt6332 - ((long) this.anInt6332 * local356 >> 18));
		} else if (local35.anInt2347 == 2) {
			local317 = local17 - this.aClass20_Sub7_1.aClass121_1.anInt3044;
			local324 = local22 - this.aClass20_Sub7_1.aClass121_1.anInt3050;
			local331 = local27 - this.aClass20_Sub7_1.aClass121_1.anInt3047;
			local348 = local317 * local317 + local324 * local324 + local331 * local331;
			local356 = local35.anInt2358 * local348 * arg1;
			this.anInt6332 = (int) ((long) this.anInt6332 - ((long) this.anInt6332 * local356 >> 28));
		}
		if (local35.anIntArray143 != null) {
			@Pc(437) Class1 local437 = local31.aClass361_47.aClass1_281;
			for (@Pc(440) Class1 local440 = local437.aClass1_286; local440 != local437; local440 = local440.aClass1_286) {
				@Pc(444) Class1_Sub3_Sub16 local444 = (Class1_Sub3_Sub16) local440;
				@Pc(447) Class343 local447 = local444.aClass343_1;
				if (local447.anInt9083 != 1) {
					@Pc(453) boolean local453 = false;
					for (@Pc(455) int local455 = 0; local455 < local35.anIntArray143.length; local455++) {
						if (local35.anIntArray143[local455] == local447.anInt9097) {
							local453 = true;
							break;
						}
					}
					if (local453) {
						@Pc(480) double local480 = (double) (local17 - local444.anInt7181);
						@Pc(486) double local486 = (double) (local22 - local444.anInt7177);
						@Pc(492) double local492 = (double) (local27 - local444.anInt7174);
						@Pc(504) double local504 = local480 * local480 + local486 * local486 + local492 * local492;
						if (!(local504 > (double) local447.aLong401)) {
							@Pc(513) double local513 = Math.sqrt(local504);
							if (local513 == 0.0D) {
								local513 = 1.0D;
							}
							@Pc(545) double local545 = (local480 * (double) local444.anInt7179 + local486 * (double) local447.anInt9082 + local492 * (double) local444.anInt7178) * 65535.0D / ((double) local447.anInt9090 * local513);
							if (!(local545 < (double) local447.anInt9092)) {
								@Pc(553) double local553 = 0.0D;
								if (local447.anInt9096 == 1) {
									local553 = local513 / 16.0D * (double) local447.anInt9091;
								} else if (local447.anInt9096 == 2) {
									local553 = local513 / 16.0D * (local513 / 16.0D) * (double) local447.anInt9091;
								}
								if (local447.anInt9087 != 0) {
									@Pc(678) double local678 = local480 / local513 * (double) local447.anInt9090;
									@Pc(686) double local686 = local486 / local513 * (double) local447.anInt9090;
									@Pc(694) double local694 = local492 / local513 * (double) local447.anInt9090;
									if (local447.anInt9093 == 0) {
										local296 += local678 * (double) arg1;
										local300 += local686 * (double) arg1;
										local304 += local694 * (double) arg1;
										local306 = true;
									} else {
										super.anInt6325 = (int) ((double) super.anInt6325 + local678 * (double) arg1);
										super.anInt6324 = (int) ((double) super.anInt6324 + local686 * (double) arg1);
										super.anInt6329 = (int) ((double) super.anInt6329 + local694 * (double) arg1);
									}
								} else if (local447.anInt9093 == 0) {
									local296 += ((double) local444.anInt7179 - local553) * (double) arg1;
									local300 += ((double) local447.anInt9082 - local553) * (double) arg1;
									local304 += ((double) local444.anInt7178 - local553) * (double) arg1;
									local306 = true;
								} else {
									super.anInt6325 = (int) ((double) super.anInt6325 + ((double) local444.anInt7179 - local553) * (double) arg1);
									super.anInt6324 = (int) ((double) super.anInt6324 + ((double) local447.anInt9082 - local553) * (double) arg1);
									super.anInt6329 = (int) ((double) super.anInt6329 + ((double) local444.anInt7178 - local553) * (double) arg1);
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray140 != null) {
			for (local317 = 0; local317 < local35.anIntArray140.length; local317++) {
				@Pc(776) Class1_Sub3_Sub16 local776 = (Class1_Sub3_Sub16) Static531.aClass33_1.method1008((long) local35.anIntArray140[local317]);
				while (local776 != null) {
					@Pc(780) Class343 local780 = local776.aClass343_1;
					@Pc(786) double local786 = (double) (local17 - local776.anInt7181);
					@Pc(792) double local792 = (double) (local22 - local776.anInt7177);
					@Pc(798) double local798 = (double) (local27 - local776.anInt7174);
					@Pc(810) double local810 = local786 * local786 + local792 * local792 + local798 * local798;
					if (local810 > (double) local780.aLong401) {
						local776 = (Class1_Sub3_Sub16) Static531.aClass33_1.method1010();
					} else {
						@Pc(825) double local825 = Math.sqrt(local810);
						if (local825 == 0.0D) {
							local825 = 1.0D;
						}
						@Pc(857) double local857 = (local786 * (double) local776.anInt7179 + local792 * (double) local780.anInt9082 + local798 * (double) local776.anInt7178) * 65535.0D / ((double) local780.anInt9090 * local825);
						if (local857 < (double) local780.anInt9092) {
							local776 = (Class1_Sub3_Sub16) Static531.aClass33_1.method1010();
						} else {
							@Pc(871) double local871 = 0.0D;
							if (local780.anInt9096 == 1) {
								local871 = local825 / 16.0D * (double) local780.anInt9091;
							} else if (local780.anInt9096 == 2) {
								local871 = local825 / 16.0D * (local825 / 16.0D) * (double) local780.anInt9091;
							}
							if (local780.anInt9087 != 0) {
								@Pc(996) double local996 = local786 / local825 * (double) local780.anInt9090;
								@Pc(1004) double local1004 = local792 / local825 * (double) local780.anInt9090;
								@Pc(1012) double local1012 = local798 / local825 * (double) local780.anInt9090;
								if (local780.anInt9093 == 0) {
									local296 += local996 * (double) arg1;
									local300 += local1004 * (double) arg1;
									local304 += local1012 * (double) arg1;
									local306 = true;
								} else {
									super.anInt6325 = (int) ((double) super.anInt6325 + local996 * (double) arg1);
									super.anInt6324 = (int) ((double) super.anInt6324 + local1004 * (double) arg1);
									super.anInt6329 = (int) ((double) super.anInt6329 + local1012 * (double) arg1);
								}
							} else if (local780.anInt9093 == 0) {
								local296 += ((double) local776.anInt7179 - local871) * (double) arg1;
								local300 += ((double) local780.anInt9082 - local871) * (double) arg1;
								local304 += ((double) local776.anInt7178 - local871) * (double) arg1;
								local306 = true;
							} else {
								super.anInt6325 = (int) ((double) super.anInt6325 + ((double) local776.anInt7179 - local871) * (double) arg1);
								super.anInt6324 = (int) ((double) super.anInt6324 + ((double) local780.anInt9082 - local871) * (double) arg1);
								super.anInt6329 = (int) ((double) super.anInt6329 + ((double) local776.anInt7178 - local871) * (double) arg1);
							}
							local776 = (Class1_Sub3_Sub16) Static531.aClass33_1.method1010();
						}
					}
				}
			}
		}
		if (local35.anIntArray142 != null) {
			if (local35.anIntArray141 == null) {
				local35.anIntArray141 = new int[local35.anIntArray142.length];
				for (local317 = 0; local317 < local35.anIntArray142.length; local317++) {
					Static486.method6808(local35.anIntArray142[local317]);
					local35.anIntArray141[local317] = ((Class1_Sub32) Static477.aClass356_36.method7796((long) local35.anIntArray142[local317])).anInt6144;
				}
			}
			for (local317 = 0; local317 < local35.anIntArray141.length; local317++) {
				@Pc(1137) Class343 local1137 = Static416.aClass343Array1[local35.anIntArray141[local317]];
				if (local1137.anInt9093 == 0) {
					local296 += local1137.anInt9095 * arg1;
					local300 += local1137.anInt9082 * arg1;
					local304 += local1137.anInt9088 * arg1;
					local306 = true;
				} else {
					super.anInt6325 += local1137.anInt9095 * arg1;
					super.anInt6324 += local1137.anInt9082 * arg1;
					super.anInt6329 += local1137.anInt9088 * arg1;
				}
			}
		}
		if (local306) {
			while (true) {
				if (!(local296 > 32767.0D) && !(local300 > 32767.0D) && !(local304 > 32767.0D) && !(local296 < -32767.0D) && !(local300 < -32767.0D) && !(local304 < -32767.0D)) {
					this.aShort60 = (short) local296;
					this.aShort57 = (short) local300;
					this.aShort62 = (short) local304;
					break;
				}
				local296 /= 2.0D;
				local300 /= 2.0D;
				local304 /= 2.0D;
				this.anInt6332 <<= 0x1;
			}
		}
		super.anInt6325 = (int) ((long) super.anInt6325 + ((long) this.aShort60 * (long) (this.anInt6332 << 2) >> 23) * (long) arg1);
		super.anInt6324 = (int) ((long) super.anInt6324 + ((long) this.aShort57 * (long) (this.anInt6332 << 2) >> 23) * (long) arg1);
		super.anInt6329 = (int) ((long) super.anInt6329 + ((long) this.aShort62 * (long) (this.anInt6332 << 2) >> 23) * (long) arg1);
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lclient!od;IIIIIIIIIIIZZ)V")
	public void method5282(@OriginalArg(0) Class20_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass20_Sub7_1 = arg0;
		super.anInt6325 = arg1 << 12;
		super.anInt6324 = arg2 << 12;
		super.anInt6329 = arg3 << 12;
		super.anInt6327 = arg9;
		this.aShort61 = this.aShort58 = (short) arg8;
		super.anInt6323 = arg10;
		super.anInt6322 = arg11;
		super.aBoolean451 = arg13;
		this.aShort60 = (short) arg4;
		this.aShort57 = (short) arg5;
		this.aShort62 = (short) arg6;
		this.anInt6332 = arg7;
		super.aByte84 = this.aClass20_Sub7_1.aClass219_2.aByte80;
		this.method5278();
	}
}
