import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!a")
public final class Class1_Sub1_Sub1_Sub1 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!a", name = "L", descriptor = "I")
	private int anInt75;

	@OriginalMember(owner = "client!a", name = "R", descriptor = "S")
	private short aShort5;

	@OriginalMember(owner = "client!a", name = "T", descriptor = "Lclient!wh;")
	public Class1_Sub10 aClass1_Sub10_1;

	@OriginalMember(owner = "client!a", name = "N", descriptor = "S")
	private short aShort1;

	@OriginalMember(owner = "client!a", name = "P", descriptor = "S")
	private short aShort3;

	@OriginalMember(owner = "client!a", name = "O", descriptor = "S")
	private short aShort2;

	@OriginalMember(owner = "client!a", name = "Q", descriptor = "S")
	private short aShort4;

	@OriginalMember(owner = "client!a", name = "S", descriptor = "S")
	private short aShort6;

	@OriginalMember(owner = "client!a", name = "M", descriptor = "I")
	private int anInt76;

	@OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Lclient!wh;IIIIIIIIIIIZZ)V")
	public Class1_Sub1_Sub1_Sub1(@OriginalArg(0) Class1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass1_Sub10_1 = arg0;
		super.anInt72 = arg1 << 12;
		super.anInt71 = arg2 << 12;
		super.anInt73 = arg3 << 12;
		super.anInt69 = arg9;
		this.aShort3 = this.aShort1 = (short) arg8;
		super.anInt70 = arg10;
		super.anInt74 = arg11;
		super.aBoolean2 = arg13;
		this.aShort2 = (short) arg4;
		this.aShort4 = (short) arg5;
		this.aShort6 = (short) arg6;
		this.anInt76 = arg7;
		super.aByte2 = this.aClass1_Sub10_1.aClass227_2.aByte72;
		this.method58();
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "()V")
	public void method56() {
		this.aClass1_Sub10_1.aClass1_Sub2_8.aClass1_Sub1_Sub1_Sub1Array1[this.aShort5] = null;
		Static55.aClass1_Sub1_Sub1_Sub1Array7[Static507.anInt9086] = this;
		Static507.anInt9086 = Static507.anInt9086 + 1 & 0x3FF;
		this.method8252();
		this.method5645();
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(JI)V")
	public void method57(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort1 = (short) (this.aShort1 - arg1);
		if (this.aShort1 <= 0) {
			this.method56();
			return;
		}
		@Pc(17) int local17 = super.anInt72 >> 12;
		@Pc(22) int local22 = super.anInt71 >> 12;
		@Pc(27) int local27 = super.anInt73 >> 12;
		@Pc(31) Class1_Sub2 local31 = this.aClass1_Sub10_1.aClass1_Sub2_8;
		@Pc(35) Class187 local35 = this.aClass1_Sub10_1.aClass187_1;
		if (local35.anInt5109 != 0) {
			@Pc(65) int local65;
			if (this.aShort3 - this.aShort1 <= local35.anInt5113) {
				local65 = (super.anInt69 >> 8 & 0xFF00) + (this.anInt75 >> 16 & 0xFF) + local35.anInt5119 * arg1;
				@Pc(82) int local82 = (super.anInt69 & 0xFF00) + (this.anInt75 >> 8 & 0xFF) + local35.anInt5125 * arg1;
				@Pc(99) int local99 = ((super.anInt69 & 0xFF) << 8) + (this.anInt75 & 0xFF) + local35.anInt5079 * arg1;
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
				super.anInt69 &= 0xFF000000;
				super.anInt69 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt75 &= 0xFF000000;
				this.anInt75 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort3 - this.aShort1 <= local35.anInt5097) {
				local65 = (super.anInt69 >> 16 & 0xFF00) + (this.anInt75 >> 24 & 0xFF) + local35.anInt5088 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt69 &= 0xFFFFFF;
				super.anInt69 |= (local65 & 0xFF00) << 16;
				this.anInt75 &= 0xFFFFFF;
				this.anInt75 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt5111 != -1 && this.aShort3 - this.aShort1 <= local35.anInt5123) {
			this.anInt76 += local35.anInt5100 * arg1;
		}
		if (local35.anInt5103 != -1 && this.aShort3 - this.aShort1 <= local35.anInt5110) {
			super.anInt70 += local35.anInt5116 * arg1;
		}
		@Pc(296) double local296 = (double) this.aShort2;
		@Pc(300) double local300 = (double) this.aShort4;
		@Pc(304) double local304 = (double) this.aShort6;
		@Pc(306) boolean local306 = false;
		@Pc(317) int local317;
		@Pc(324) int local324;
		@Pc(331) int local331;
		@Pc(348) int local348;
		@Pc(356) long local356;
		if (local35.anInt5093 == 1) {
			local317 = local17 - this.aClass1_Sub10_1.aClass336_1.anInt9726;
			local324 = local22 - this.aClass1_Sub10_1.aClass336_1.anInt9718;
			local331 = local27 - this.aClass1_Sub10_1.aClass336_1.anInt9728;
			local348 = (int) Math.sqrt((double) (local317 * local317 + local324 * local324 + local331 * local331)) >> 2;
			local356 = local35.anInt5086 * local348 * arg1;
			this.anInt76 = (int) ((long) this.anInt76 - ((long) this.anInt76 * local356 >> 18));
		} else if (local35.anInt5093 == 2) {
			local317 = local17 - this.aClass1_Sub10_1.aClass336_1.anInt9726;
			local324 = local22 - this.aClass1_Sub10_1.aClass336_1.anInt9718;
			local331 = local27 - this.aClass1_Sub10_1.aClass336_1.anInt9728;
			local348 = local317 * local317 + local324 * local324 + local331 * local331;
			local356 = local35.anInt5086 * local348 * arg1;
			this.anInt76 = (int) ((long) this.anInt76 - ((long) this.anInt76 * local356 >> 28));
		}
		if (local35.anIntArray255 != null) {
			@Pc(437) Class4 local437 = local31.aClass244_1.aClass4_185;
			for (@Pc(440) Class4 local440 = local437.aClass4_285; local440 != local437; local440 = local440.aClass4_285) {
				@Pc(444) Class4_Sub5_Sub11 local444 = (Class4_Sub5_Sub11) local440;
				@Pc(447) Class222 local447 = local444.aClass222_1;
				if (local447.anInt6340 != 1) {
					@Pc(453) boolean local453 = false;
					for (@Pc(455) int local455 = 0; local455 < local35.anIntArray255.length; local455++) {
						if (local35.anIntArray255[local455] == local447.anInt6336) {
							local453 = true;
							break;
						}
					}
					if (local453) {
						@Pc(480) double local480 = (double) (local17 - local444.anInt6322);
						@Pc(486) double local486 = (double) (local22 - local444.anInt6320);
						@Pc(492) double local492 = (double) (local27 - local444.anInt6317);
						@Pc(504) double local504 = local480 * local480 + local486 * local486 + local492 * local492;
						if (!(local504 > (double) local447.aLong160)) {
							@Pc(513) double local513 = Math.sqrt(local504);
							if (local513 == 0.0D) {
								local513 = 1.0D;
							}
							@Pc(545) double local545 = (local480 * (double) local444.anInt6323 + local486 * (double) local447.anInt6337 + local492 * (double) local444.anInt6319) * 65535.0D / ((double) local447.anInt6347 * local513);
							if (!(local545 < (double) local447.anInt6344)) {
								@Pc(553) double local553 = 0.0D;
								if (local447.anInt6349 == 1) {
									local553 = local513 / 16.0D * (double) local447.anInt6343;
								} else if (local447.anInt6349 == 2) {
									local553 = local513 / 16.0D * (local513 / 16.0D) * (double) local447.anInt6343;
								}
								if (local447.anInt6342 != 0) {
									@Pc(678) double local678 = local480 / local513 * (double) local447.anInt6347;
									@Pc(686) double local686 = local486 / local513 * (double) local447.anInt6347;
									@Pc(694) double local694 = local492 / local513 * (double) local447.anInt6347;
									if (local447.anInt6346 == 0) {
										local296 += local678 * (double) arg1;
										local300 += local686 * (double) arg1;
										local304 += local694 * (double) arg1;
										local306 = true;
									} else {
										super.anInt72 = (int) ((double) super.anInt72 + local678 * (double) arg1);
										super.anInt71 = (int) ((double) super.anInt71 + local686 * (double) arg1);
										super.anInt73 = (int) ((double) super.anInt73 + local694 * (double) arg1);
									}
								} else if (local447.anInt6346 == 0) {
									local296 += ((double) local444.anInt6323 - local553) * (double) arg1;
									local300 += ((double) local447.anInt6337 - local553) * (double) arg1;
									local304 += ((double) local444.anInt6319 - local553) * (double) arg1;
									local306 = true;
								} else {
									super.anInt72 = (int) ((double) super.anInt72 + ((double) local444.anInt6323 - local553) * (double) arg1);
									super.anInt71 = (int) ((double) super.anInt71 + ((double) local447.anInt6337 - local553) * (double) arg1);
									super.anInt73 = (int) ((double) super.anInt73 + ((double) local444.anInt6319 - local553) * (double) arg1);
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray253 != null) {
			for (local317 = 0; local317 < local35.anIntArray253.length; local317++) {
				@Pc(776) Class4_Sub5_Sub11 local776 = (Class4_Sub5_Sub11) Static370.aClass217_1.method5343((long) local35.anIntArray253[local317]);
				while (local776 != null) {
					@Pc(780) Class222 local780 = local776.aClass222_1;
					@Pc(786) double local786 = (double) (local17 - local776.anInt6322);
					@Pc(792) double local792 = (double) (local22 - local776.anInt6320);
					@Pc(798) double local798 = (double) (local27 - local776.anInt6317);
					@Pc(810) double local810 = local786 * local786 + local792 * local792 + local798 * local798;
					if (local810 > (double) local780.aLong160) {
						local776 = (Class4_Sub5_Sub11) Static370.aClass217_1.method5342();
					} else {
						@Pc(825) double local825 = Math.sqrt(local810);
						if (local825 == 0.0D) {
							local825 = 1.0D;
						}
						@Pc(857) double local857 = (local786 * (double) local776.anInt6323 + local792 * (double) local780.anInt6337 + local798 * (double) local776.anInt6319) * 65535.0D / ((double) local780.anInt6347 * local825);
						if (local857 < (double) local780.anInt6344) {
							local776 = (Class4_Sub5_Sub11) Static370.aClass217_1.method5342();
						} else {
							@Pc(871) double local871 = 0.0D;
							if (local780.anInt6349 == 1) {
								local871 = local825 / 16.0D * (double) local780.anInt6343;
							} else if (local780.anInt6349 == 2) {
								local871 = local825 / 16.0D * (local825 / 16.0D) * (double) local780.anInt6343;
							}
							if (local780.anInt6342 != 0) {
								@Pc(996) double local996 = local786 / local825 * (double) local780.anInt6347;
								@Pc(1004) double local1004 = local792 / local825 * (double) local780.anInt6347;
								@Pc(1012) double local1012 = local798 / local825 * (double) local780.anInt6347;
								if (local780.anInt6346 == 0) {
									local296 += local996 * (double) arg1;
									local300 += local1004 * (double) arg1;
									local304 += local1012 * (double) arg1;
									local306 = true;
								} else {
									super.anInt72 = (int) ((double) super.anInt72 + local996 * (double) arg1);
									super.anInt71 = (int) ((double) super.anInt71 + local1004 * (double) arg1);
									super.anInt73 = (int) ((double) super.anInt73 + local1012 * (double) arg1);
								}
							} else if (local780.anInt6346 == 0) {
								local296 += ((double) local776.anInt6323 - local871) * (double) arg1;
								local300 += ((double) local780.anInt6337 - local871) * (double) arg1;
								local304 += ((double) local776.anInt6319 - local871) * (double) arg1;
								local306 = true;
							} else {
								super.anInt72 = (int) ((double) super.anInt72 + ((double) local776.anInt6323 - local871) * (double) arg1);
								super.anInt71 = (int) ((double) super.anInt71 + ((double) local780.anInt6337 - local871) * (double) arg1);
								super.anInt73 = (int) ((double) super.anInt73 + ((double) local776.anInt6319 - local871) * (double) arg1);
							}
							local776 = (Class4_Sub5_Sub11) Static370.aClass217_1.method5342();
						}
					}
				}
			}
		}
		if (local35.anIntArray252 != null) {
			if (local35.anIntArray254 == null) {
				local35.anIntArray254 = new int[local35.anIntArray252.length];
				for (local317 = 0; local317 < local35.anIntArray252.length; local317++) {
					Static443.method6828(local35.anIntArray252[local317]);
					local35.anIntArray254[local317] = ((Class4_Sub38) Static24.aClass350_1.method8207((long) local35.anIntArray252[local317])).anInt8496;
				}
			}
			for (local317 = 0; local317 < local35.anIntArray254.length; local317++) {
				@Pc(1137) Class222 local1137 = Static450.aClass222Array1[local35.anIntArray254[local317]];
				if (local1137.anInt6346 == 0) {
					local296 += local1137.anInt6338 * arg1;
					local300 += local1137.anInt6337 * arg1;
					local304 += local1137.anInt6339 * arg1;
					local306 = true;
				} else {
					super.anInt72 += local1137.anInt6338 * arg1;
					super.anInt71 += local1137.anInt6337 * arg1;
					super.anInt73 += local1137.anInt6339 * arg1;
				}
			}
		}
		if (local306) {
			while (true) {
				if (!(local296 > 32767.0D) && !(local300 > 32767.0D) && !(local304 > 32767.0D) && !(local296 < -32767.0D) && !(local300 < -32767.0D) && !(local304 < -32767.0D)) {
					this.aShort2 = (short) local296;
					this.aShort4 = (short) local300;
					this.aShort6 = (short) local304;
					break;
				}
				local296 /= 2.0D;
				local300 /= 2.0D;
				local304 /= 2.0D;
				this.anInt76 <<= 0x1;
			}
		}
		super.anInt72 = (int) ((long) super.anInt72 + ((long) this.aShort2 * (long) (this.anInt76 << 2) >> 23) * (long) arg1);
		super.anInt71 = (int) ((long) super.anInt71 + ((long) this.aShort4 * (long) (this.anInt76 << 2) >> 23) * (long) arg1);
		super.anInt73 = (int) ((long) super.anInt73 + ((long) this.aShort6 * (long) (this.anInt76 << 2) >> 23) * (long) arg1);
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "()V")
	private void method58() {
		@Pc(4) int local4 = this.aClass1_Sub10_1.aClass1_Sub2_8.anInt397;
		if (this.aClass1_Sub10_1.aClass1_Sub2_8.aClass1_Sub1_Sub1_Sub1Array1[local4] != null) {
			this.aClass1_Sub10_1.aClass1_Sub2_8.aClass1_Sub1_Sub1_Sub1Array1[local4].method56();
		}
		this.aClass1_Sub10_1.aClass1_Sub2_8.aClass1_Sub1_Sub1_Sub1Array1[local4] = this;
		this.aShort5 = (short) this.aClass1_Sub10_1.aClass1_Sub2_8.anInt397;
		this.aClass1_Sub10_1.aClass1_Sub2_8.anInt397 = local4 + 1 & 0x1FFF;
		this.aClass1_Sub10_1.aClass136_9.method3289(this);
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!r;J)V")
	public void method59(@OriginalArg(0) Class44 arg0, @OriginalArg(1) long arg1) {
		@Pc(6) int local6 = super.anInt72 >> Static145.anInt3093 + 12;
		@Pc(13) int local13 = super.anInt73 >> Static145.anInt3093 + 12;
		@Pc(18) int local18 = super.anInt71 >> 12;
		if (local18 > 0 || local18 < -262144 || local6 < 0 || local6 >= Static182.anInt3633 || local13 < 0 || local13 >= Static253.anInt4651) {
			this.method56();
			return;
		}
		@Pc(40) Class1_Sub2 local40 = this.aClass1_Sub10_1.aClass1_Sub2_8;
		@Pc(44) Class187 local44 = this.aClass1_Sub10_1.aClass187_1;
		@Pc(46) Class83[] local46 = Static499.aClass83Array3;
		@Pc(49) int local49 = local40.anInt399;
		@Pc(58) Class53 local58 = Static60.aClass53ArrayArrayArray1[local40.anInt399][local6][local13];
		if (local58 != null) {
			local49 = local58.aByte13;
		}
		@Pc(71) int local71 = local46[local49].method7217(local13, local6);
		@Pc(86) int local86;
		if (local49 < Static345.anInt6662 - 1) {
			local86 = local46[local49 + 1].method7217(local13, local6);
		} else {
			local86 = local71 - (0x8 << Static145.anInt3093);
		}
		if (local44.aBoolean370) {
			if (local44.lb == -1 && local18 > local71) {
				this.method56();
				return;
			}
			if (local44.lb >= 0 && local18 > local46[local44.lb].method7217(local13, local6)) {
				this.method56();
				return;
			}
			if (local44.anInt5091 == -1 && local18 < local86) {
				this.method56();
				return;
			}
			if (local44.anInt5091 >= 0 && local18 < local46[local44.anInt5091 + 1].method7217(local13, local6)) {
				this.method56();
				return;
			}
		}
		@Pc(154) int local154;
		for (local154 = Static345.anInt6662 - 1; local154 > 0 && local18 > local46[local154].method7217(local13, local6); local154--) {
		}
		if (local44.aBoolean368 && local154 == 0 && local18 > local46[0].method7217(local13, local6)) {
			this.method56();
		} else if (local154 == Static345.anInt6662 - 1 && local46[local154].method7217(local13, local6) - local18 > 0x8 << Static145.anInt3093) {
			this.method56();
		} else {
			local58 = Static60.aClass53ArrayArrayArray1[local154][local6][local13];
			@Pc(261) int local261;
			if (local58 == null) {
				if (local154 == 0 || Static60.aClass53ArrayArrayArray1[0][local6][local13] == null) {
					local58 = Static60.aClass53ArrayArrayArray1[0][local6][local13] = new Class53(0);
				}
				@Pc(251) boolean local251 = Static60.aClass53ArrayArrayArray1[0][local6][local13].aClass53_1 != null;
				if (local154 == 3 && local251) {
					this.method56();
					return;
				}
				for (local261 = 1; local261 <= local154; local261++) {
					if (Static60.aClass53ArrayArrayArray1[local261][local6][local13] == null) {
						local58 = Static60.aClass53ArrayArrayArray1[local261][local6][local13] = new Class53(local261);
						if (local251) {
							local58.aByte13++;
						}
					}
				}
			}
			if (local44.aBoolean373) {
				@Pc(304) int local304 = super.anInt72 >> 12;
				local261 = super.anInt73 >> 12;
				@Pc(318) Class308 local318;
				if (local58.aClass1_Sub4_Sub5_2 != null) {
					local318 = local58.aClass1_Sub4_Sub5_2.method8121(arg0);
					if (local318 != null && local318.method7240(local261, local304, local18)) {
						this.method56();
						return;
					}
				}
				if (local58.aClass1_Sub4_Sub5_1 != null) {
					local318 = local58.aClass1_Sub4_Sub5_1.method8121(arg0);
					if (local318 != null && local318.method7240(local261, local304, local18)) {
						this.method56();
						return;
					}
				}
				if (local58.aClass1_Sub4_Sub4_1 != null) {
					local318 = local58.aClass1_Sub4_Sub4_1.method8121(arg0);
					if (local318 != null && local318.method7240(local261, local304, local18)) {
						this.method56();
						return;
					}
				}
				for (@Pc(375) Class289 local375 = local58.aClass289_1; local375 != null; local375 = local375.aClass289_3) {
					@Pc(382) Class308 local382 = local375.aClass1_Sub4_Sub2_1.method8121(arg0);
					if (local382 != null && local382.method7240(local261, local304, local18)) {
						this.method56();
						return;
					}
				}
			}
			local40.aClass305_1.aClass224_1.method5404(this);
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!wh;IIIIIIIIIIIZZ)V")
	public void method60(@OriginalArg(0) Class1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass1_Sub10_1 = arg0;
		super.anInt72 = arg1 << 12;
		super.anInt71 = arg2 << 12;
		super.anInt73 = arg3 << 12;
		super.anInt69 = arg9;
		this.aShort3 = this.aShort1 = (short) arg8;
		super.anInt70 = arg10;
		super.anInt74 = arg11;
		super.aBoolean2 = arg13;
		this.aShort2 = (short) arg4;
		this.aShort4 = (short) arg5;
		this.aShort6 = (short) arg6;
		this.anInt76 = arg7;
		super.aByte2 = this.aClass1_Sub10_1.aClass227_2.aByte72;
		this.method58();
	}
}
