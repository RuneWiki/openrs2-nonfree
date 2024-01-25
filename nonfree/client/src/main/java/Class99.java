import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fha")
public final class Class99 {

	@OriginalMember(owner = "client!fha", name = "d", descriptor = "[[Lclient!ej;")
	private final Class2_Sub4_Sub1[][] aClass2_Sub4_Sub1ArrayArray3 = new Class2_Sub4_Sub1[64][768];

	@OriginalMember(owner = "client!fha", name = "k", descriptor = "I")
	private int anInt3726 = 0;

	@OriginalMember(owner = "client!fha", name = "n", descriptor = "[[Lclient!ej;")
	private final Class2_Sub4_Sub1[][] aClass2_Sub4_Sub1ArrayArray4 = new Class2_Sub4_Sub1[1600][64];

	@OriginalMember(owner = "client!fha", name = "j", descriptor = "[I")
	private final int[] anIntArray198 = new int[8191];

	@OriginalMember(owner = "client!fha", name = "q", descriptor = "[I")
	private final int[] anIntArray200 = new int[64];

	@OriginalMember(owner = "client!fha", name = "p", descriptor = "[I")
	private final int[] anIntArray199 = new int[1600];

	@OriginalMember(owner = "client!fha", name = "t", descriptor = "Lclient!mia;")
	private final Class34 aClass34_22;

	@OriginalMember(owner = "client!fha", name = "r", descriptor = "Lclient!u;")
	private final Interface26 anInterface26_12;

	@OriginalMember(owner = "client!fha", name = "s", descriptor = "Lclient!u;")
	private final Interface26 anInterface26_13;

	@OriginalMember(owner = "client!fha", name = "b", descriptor = "Lclient!ru;")
	private final Interface23 anInterface23_7;

	@OriginalMember(owner = "client!fha", name = "<init>", descriptor = "(Lclient!bm;)V")
	public Class99(@OriginalArg(0) Class33_Sub1 arg0) {
		this.aClass34_22 = arg0.method2090(new Class151[] { new Class151(new Class333[] { Static570.aClass333_1, Static570.aClass333_3, Static570.aClass333_5 }), new Class151(Static570.aClass333_2) });
		this.anInterface26_12 = arg0.method2008(true);
		this.anInterface26_13 = arg0.method2008(false);
		this.anInterface26_13.method7633(12, 393168);
		this.anInterface23_7 = arg0.method1998(false);
		this.anInterface23_7.method7624(49146);
		@Pc(98) Buffer local98 = this.anInterface23_7.method4807();
		@Pc(115) int local115;
		if (local98 != null) {
			@Pc(105) Stream local105 = arg0.method2092(local98);
			@Pc(109) int local109;
			if (Stream.b()) {
				for (local109 = 0; local109 < 8191; local109++) {
					local115 = local109 * 4;
					local105.e(local115);
					local105.e(local115 + 1);
					local105.e(local115 + 2);
					local105.e(local115 + 2);
					local105.e(local115 + 3);
					local105.e(local115);
				}
			} else {
				for (local109 = 0; local109 < 8191; local109++) {
					local115 = local109 * 4;
					local105.a(local115);
					local105.a(local115 + 1);
					local105.a(local115 + 2);
					local105.a(local115 + 2);
					local105.a(local115 + 3);
					local105.a(local115);
				}
			}
			local105.a();
			this.anInterface23_7.method4806();
		}
		@Pc(198) Buffer local198 = this.anInterface26_13.method7632();
		if (local198 != null) {
			@Pc(205) Stream local205 = arg0.method2092(local198);
			if (Stream.b()) {
				for (local115 = 0; local115 < 8191; local115++) {
					local205.a(0.0F);
					local205.a(-1.0F);
					local205.a(0.0F);
					local205.a(0.0F);
					local205.a(-1.0F);
					local205.a(0.0F);
					local205.a(0.0F);
					local205.a(-1.0F);
					local205.a(0.0F);
					local205.a(0.0F);
					local205.a(-1.0F);
					local205.a(0.0F);
				}
			} else {
				for (local115 = 0; local115 < 8191; local115++) {
					local205.b(0.0F);
					local205.b(-1.0F);
					local205.b(0.0F);
					local205.b(0.0F);
					local205.b(-1.0F);
					local205.b(0.0F);
					local205.b(0.0F);
					local205.b(-1.0F);
					local205.b(0.0F);
					local205.b(0.0F);
					local205.b(-1.0F);
					local205.b(0.0F);
				}
			}
			local205.a();
			this.anInterface26_13.method7635();
		}
	}

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(Lclient!bm;I)V")
	private void method3290(@OriginalArg(0) Class33_Sub1 arg0) {
		arg0.method2080(true);
		arg0.method1995(true);
		if (arg0.aFloat85 != Static296.aFloat175) {
			arg0.xa(Static296.aFloat175);
		}
	}

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(Lclient!bm;II)V")
	private void method3291(@OriginalArg(0) Class33_Sub1 arg0, @OriginalArg(1) int arg1) {
		Static296.aFloat175 = arg0.aFloat85;
		arg0.method2011((float) arg1);
		arg0.method2004();
		arg0.method1995(false);
		arg0.method2080(false);
		arg0.method2014();
	}

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(BLclient!bm;)V")
	public void method3292(@OriginalArg(1) Class33_Sub1 arg0) {
		this.anInterface26_12.method7633(24, 786336);
	}

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(Lclient!bm;Lclient!cd;II)V")
	public void method3293(@OriginalArg(0) Class33_Sub1 arg0, @OriginalArg(1) Class40 arg1, @OriginalArg(3) int arg2) {
		if (arg0.aClass47_Sub3_16 == null) {
			return;
		}
		if (arg2 >= 0) {
			this.method3291(arg0, arg2);
		} else {
			this.method3295(arg0);
		}
		@Pc(28) float local28 = arg0.aClass47_Sub3_16.aFloat259;
		@Pc(32) float local32 = arg0.aClass47_Sub3_16.aFloat260;
		@Pc(36) float local36 = arg0.aClass47_Sub3_16.aFloat258;
		@Pc(40) float local40 = arg0.aClass47_Sub3_16.aFloat263;
		try {
			@Pc(42) int local42 = 0;
			@Pc(44) int local44 = Integer.MAX_VALUE;
			@Pc(46) int local46 = 0;
			@Pc(50) Class2_Sub4 local50 = arg1.aClass177_1.aClass2_Sub4_7;
			@Pc(53) Class2_Sub4 local53;
			@Pc(85) int local85;
			for (local53 = local50.aClass2_Sub4_10; local53 != local50; local53 = local53.aClass2_Sub4_10) {
				@Pc(58) Class2_Sub4_Sub1 local58 = (Class2_Sub4_Sub1) local53;
				local85 = (int) (local40 + local32 * (float) (local58.anInt5118 >> 12) + (float) (local58.anInt5115 >> 12) * local28 + (float) (local58.anInt5117 >> 12) * local36);
				this.anIntArray198[local42++] = local85;
				if (local85 < local44) {
					local44 = local85;
				}
				if (local85 > local46) {
					local46 = local85;
				}
			}
			@Pc(112) int local112 = local46 - local44;
			if (local112 + 2 <= 1600) {
				local112 += 2;
				local85 = 0;
			} else {
				local85 = Static539.method7665(local112) + 1 - Static511.anInt8992;
				local112 = (local112 >> local85) + 2;
			}
			local42 = 0;
			local53 = local50.aClass2_Sub4_10;
			@Pc(146) int local146 = -2;
			@Pc(148) boolean local148 = true;
			@Pc(150) boolean local150 = true;
			while (local50 != local53) {
				this.anInt3726 = 0;
				for (@Pc(157) int local157 = 0; local157 < local112; local157++) {
					this.anIntArray199[local157] = 0;
				}
				for (@Pc(174) int local174 = 0; local174 < 64; local174++) {
					this.anIntArray200[local174] = 0;
				}
				while (local50 != local53) {
					@Pc(190) Class2_Sub4_Sub1 local190 = (Class2_Sub4_Sub1) local53;
					if (local150) {
						local148 = local190.aBoolean448;
						local146 = local190.anInt5116;
						local150 = false;
					}
					if (local42 > 0 && (local146 != local190.anInt5116 || local190.aBoolean448 != local148)) {
						local150 = true;
						break;
					}
					@Pc(236) int local236 = this.anIntArray198[local42++] - local44 >> local85;
					if (local236 < 1600) {
						if (this.anIntArray199[local236] >= 64) {
							label102: {
								if (this.anIntArray199[local236] == 64) {
									if (this.anInt3726 == 64) {
										break label102;
									}
									this.anIntArray199[local236] += this.anInt3726++ + 1;
								}
								this.aClass2_Sub4_Sub1ArrayArray3[this.anIntArray199[local236] - 64 - 1][this.anIntArray200[this.anIntArray199[local236] - 64 - 1]++] = local190;
							}
						} else {
							this.aClass2_Sub4_Sub1ArrayArray4[local236][this.anIntArray199[local236]++] = local190;
						}
					}
					local53 = local53.aClass2_Sub4_10;
				}
				arg0.method2012(false, local146 < 0 ? -1 : local146, false);
				if (local148 && arg0.aFloat85 != Static296.aFloat175) {
					arg0.xa(Static296.aFloat175);
				} else if (arg0.aFloat85 != 1.0F) {
					arg0.xa(1.0F);
				}
				this.method3297(arg0, local112);
			}
		} catch (@Pc(369) Exception local369) {
		}
		this.method3290(arg0);
	}

	@OriginalMember(owner = "client!fha", name = "b", descriptor = "(Lclient!bm;I)V")
	private void method3295(@OriginalArg(0) Class33_Sub1 arg0) {
		Static296.aFloat175 = arg0.aFloat85;
		arg0.method2031();
		arg0.method1995(false);
		arg0.method2080(false);
		arg0.method2014();
	}

	@OriginalMember(owner = "client!fha", name = "b", descriptor = "(Lclient!bm;II)V")
	private void method3297(@OriginalArg(0) Class33_Sub1 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		@Pc(11) Class47_Sub3 local11 = arg0.method2061();
		@Pc(14) float local14 = local11.aFloat257;
		@Pc(17) float local17 = local11.aFloat261;
		@Pc(20) float local20 = local11.aFloat253;
		@Pc(23) float local23 = local11.aFloat264;
		@Pc(26) float local26 = local11.aFloat255;
		@Pc(29) float local29 = local11.aFloat262;
		@Pc(33) float local33 = local23 + local14;
		@Pc(37) float local37 = local17 + local26;
		@Pc(41) float local41 = local29 + local20;
		@Pc(52) float local52 = local14 - local23;
		@Pc(57) float local57 = local17 - local26;
		@Pc(61) float local61 = local20 - local29;
		@Pc(65) float local65 = local23 - local14;
		@Pc(69) float local69 = local26 - local17;
		@Pc(74) float local74 = local29 - local20;
		@Pc(80) Buffer local80 = this.anInterface26_12.method7632();
		if (local80 == null) {
			return;
		}
		@Pc(88) Stream local88 = arg0.method2092(local80);
		@Pc(94) int local94;
		@Pc(111) int local111;
		@Pc(117) int local117;
		@Pc(126) Class2_Sub4_Sub1 local126;
		@Pc(129) int local129;
		@Pc(134) byte local134;
		@Pc(139) byte local139;
		@Pc(142) byte local142;
		@Pc(147) byte local147;
		@Pc(153) float local153;
		@Pc(159) float local159;
		@Pc(165) float local165;
		@Pc(170) int local170;
		@Pc(443) float local443;
		@Pc(448) int local448;
		@Pc(388) int local388;
		@Pc(404) Class2_Sub4_Sub1 local404;
		@Pc(407) int local407;
		@Pc(420) byte local420;
		@Pc(425) byte local425;
		@Pc(437) float local437;
		if (Stream.b()) {
			for (local94 = arg1 - 1; local94 >= 0; local94--) {
				local111 = this.anIntArray199[local94] <= 64 ? this.anIntArray199[local94] : 64;
				if (local111 > 0) {
					for (local117 = local111 - 1; local117 >= 0; local117--) {
						local126 = this.aClass2_Sub4_Sub1ArrayArray4[local94][local117];
						local129 = local126.anInt5114;
						local134 = (byte) (local129 >> 16);
						local139 = (byte) (local129 >> 8);
						local142 = (byte) local129;
						local147 = (byte) (local129 >>> 24);
						local153 = local126.anInt5115 >> 12;
						local159 = local126.anInt5118 >> 12;
						local165 = local126.anInt5117 >> 12;
						local170 = local126.anInt5113 >> 12;
						local88.a(local33 * (float) -local170 + local153);
						local88.a(local37 * (float) -local170 + local159);
						local88.a(local165 + (float) -local170 * local41);
						if (arg0.anInt2178 == 0) {
							local88.a(local134, local139, local142, local147);
						} else {
							local88.b(local134, local139, local142, local147);
						}
						local88.a(0.0F);
						local88.a(0.0F);
						local88.a(local153 + local52 * (float) local170);
						local88.a(local159 + local57 * (float) local170);
						local88.a(local61 * (float) local170 + local165);
						if (arg0.anInt2178 == 0) {
							local88.a(local134, local139, local142, local147);
						} else {
							local88.b(local134, local139, local142, local147);
						}
						local88.a(1.0F);
						local88.a(0.0F);
						local88.a((float) local170 * local33 + local153);
						local88.a(local37 * (float) local170 + local159);
						local88.a((float) local170 * local41 + local165);
						if (arg0.anInt2178 == 0) {
							local88.a(local134, local139, local142, local147);
						} else {
							local88.b(local134, local139, local142, local147);
						}
						local88.a(1.0F);
						local88.a(1.0F);
						local88.a(local65 * (float) local170 + local153);
						local88.a(local69 * (float) local170 + local159);
						local88.a(local165 + (float) local170 * local74);
						if (arg0.anInt2178 == 0) {
							local88.a(local134, local139, local142, local147);
						} else {
							local88.b(local134, local139, local142, local147);
						}
						local88.a(0.0F);
						local7++;
						local88.a(1.0F);
					}
					if (this.anIntArray199[local94] > 64) {
						local388 = this.anIntArray199[local94] - 1 - 64;
						for (local129 = this.anIntArray200[local388] - 1; local129 >= 0; local129--) {
							local404 = this.aClass2_Sub4_Sub1ArrayArray3[local388][local129];
							local407 = local404.anInt5114;
							local142 = (byte) (local407 >> 16);
							local147 = (byte) (local407 >> 8);
							local420 = (byte) local407;
							local425 = (byte) (local407 >>> 24);
							local165 = local404.anInt5115 >> 12;
							local437 = local404.anInt5118 >> 12;
							local443 = local404.anInt5117 >> 12;
							local448 = local404.anInt5113 >> 12;
							local88.a(local165 + (float) -local448 * local33);
							local88.a(local437 + local37 * (float) -local448);
							local88.a(local443 + local41 * (float) -local448);
							if (arg0.anInt2178 == 0) {
								local88.a(local142, local147, local420, local425);
							} else {
								local88.b(local142, local147, local420, local425);
							}
							local88.a(0.0F);
							local88.a(0.0F);
							local88.a(local165 + (float) local448 * local52);
							local88.a(local57 * (float) local448 + local437);
							local88.a((float) local448 * local61 + local443);
							if (arg0.anInt2178 == 0) {
								local88.a(local142, local147, local420, local425);
							} else {
								local88.b(local142, local147, local420, local425);
							}
							local88.a(1.0F);
							local88.a(0.0F);
							local88.a((float) local448 * local33 + local165);
							local88.a((float) local448 * local37 + local437);
							local88.a(local443 + (float) local448 * local41);
							if (arg0.anInt2178 == 0) {
								local88.a(local142, local147, local420, local425);
							} else {
								local88.b(local142, local147, local420, local425);
							}
							local88.a(1.0F);
							local88.a(1.0F);
							local88.a((float) local448 * local65 + local165);
							local88.a(local437 + (float) local448 * local69);
							local88.a(local74 * (float) local448 + local443);
							if (arg0.anInt2178 == 0) {
								local88.a(local142, local147, local420, local425);
							} else {
								local88.b(local142, local147, local420, local425);
							}
							local88.a(0.0F);
							local88.a(1.0F);
							local7++;
						}
					}
				}
			}
		} else {
			for (local94 = arg1 - 1; local94 >= 0; local94--) {
				local111 = this.anIntArray199[local94] <= 64 ? this.anIntArray199[local94] : 64;
				if (local111 > 0) {
					for (local117 = local111 - 1; local117 >= 0; local117--) {
						local126 = this.aClass2_Sub4_Sub1ArrayArray4[local94][local117];
						local129 = local126.anInt5114;
						local134 = (byte) (local129 >> 16);
						local139 = (byte) (local129 >> 8);
						local142 = (byte) local129;
						local147 = (byte) (local129 >>> 24);
						local153 = local126.anInt5115 >> 12;
						local159 = local126.anInt5118 >> 12;
						local165 = local126.anInt5117 >> 12;
						local170 = local126.anInt5113 >> 12;
						local88.b((float) -local170 * local33 + local153);
						local88.b((float) -local170 * local37 + local159);
						local88.b((float) -local170 * local41 + local165);
						if (arg0.anInt2178 == 0) {
							local88.a(local134, local139, local142, local147);
						} else {
							local88.b(local134, local139, local142, local147);
						}
						local88.b(0.0F);
						local88.b(0.0F);
						local88.b(local153 + (float) local170 * local52);
						local88.b(local57 * (float) local170 + local159);
						local88.b(local61 * (float) local170 + local165);
						if (arg0.anInt2178 == 0) {
							local88.a(local134, local139, local142, local147);
						} else {
							local88.b(local134, local139, local142, local147);
						}
						local88.b(1.0F);
						local88.b(0.0F);
						local88.b(local33 * (float) local170 + local153);
						local88.b(local159 + (float) local170 * local37);
						local88.b(local165 + (float) local170 * local41);
						if (arg0.anInt2178 == 0) {
							local88.a(local134, local139, local142, local147);
						} else {
							local88.b(local134, local139, local142, local147);
						}
						local88.b(1.0F);
						local88.b(1.0F);
						local88.b(local153 + (float) local170 * local65);
						local88.b(local159 + (float) local170 * local69);
						local88.b((float) local170 * local74 + local165);
						if (arg0.anInt2178 == 0) {
							local88.a(local134, local139, local142, local147);
						} else {
							local88.b(local134, local139, local142, local147);
						}
						local88.b(0.0F);
						local7++;
						local88.b(1.0F);
					}
					if (this.anIntArray199[local94] > 64) {
						local388 = this.anIntArray199[local94] - 64 - 1;
						for (local129 = this.anIntArray200[local388] - 1; local129 >= 0; local129--) {
							local404 = this.aClass2_Sub4_Sub1ArrayArray3[local388][local129];
							local407 = local404.anInt5114;
							local142 = (byte) (local407 >> 16);
							local147 = (byte) (local407 >> 8);
							local420 = (byte) local407;
							local425 = (byte) (local407 >>> 24);
							local165 = local404.anInt5115 >> 12;
							local437 = local404.anInt5118 >> 12;
							local443 = local404.anInt5117 >> 12;
							local448 = local404.anInt5113 >> 12;
							local88.b(local33 * (float) -local448 + local165);
							local88.b(local37 * (float) -local448 + local437);
							local88.b(local41 * (float) -local448 + local443);
							if (arg0.anInt2178 == 0) {
								local88.a(local142, local147, local420, local425);
							} else {
								local88.b(local142, local147, local420, local425);
							}
							local88.b(0.0F);
							local88.b(0.0F);
							local88.b((float) local448 * local52 + local165);
							local88.b(local57 * (float) local448 + local437);
							local88.b(local443 + local61 * (float) local448);
							if (arg0.anInt2178 == 0) {
								local88.a(local142, local147, local420, local425);
							} else {
								local88.b(local142, local147, local420, local425);
							}
							local88.b(1.0F);
							local88.b(0.0F);
							local88.b(local33 * (float) local448 + local165);
							local88.b(local437 + local37 * (float) local448);
							local88.b(local443 + local41 * (float) local448);
							if (arg0.anInt2178 == 0) {
								local88.a(local142, local147, local420, local425);
							} else {
								local88.b(local142, local147, local420, local425);
							}
							local88.b(1.0F);
							local88.b(1.0F);
							local88.b(local65 * (float) local448 + local165);
							local88.b(local437 + local69 * (float) local448);
							local88.b((float) local448 * local74 + local443);
							if (arg0.anInt2178 == 0) {
								local88.a(local142, local147, local420, local425);
							} else {
								local88.b(local142, local147, local420, local425);
							}
							local88.b(0.0F);
							local7++;
							local88.b(1.0F);
						}
					}
				}
			}
		}
		local88.a();
		if (this.anInterface26_12.method7635()) {
			arg0.method2046(this.anInterface26_12, 0);
			arg0.method2046(this.anInterface26_13, 1);
			arg0.method2003(this.aClass34_22);
			arg0.method2091(0, Static338.aClass304_5, 0, local7 * 2, this.anInterface23_7, local7 * 4);
		}
	}

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(I)V")
	public void method3298() {
		this.anInterface26_12.method7627();
	}
}
