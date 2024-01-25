import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cja")
public final class Class2_Sub15 extends Class2 {

	@OriginalMember(owner = "client!cja", name = "I", descriptor = "I")
	private int anInt1459;

	@OriginalMember(owner = "client!cja", name = "z", descriptor = "Lclient!uja;")
	private final Class145_Sub3 aClass145_Sub3_5;

	@OriginalMember(owner = "client!cja", name = "p", descriptor = "Lclient!gba;")
	private final Class133_Sub1 aClass133_Sub1_1;

	@OriginalMember(owner = "client!cja", name = "H", descriptor = "Lclient!bba;")
	private final Class2_Sub7 aClass2_Sub7_2;

	@OriginalMember(owner = "client!cja", name = "G", descriptor = "I")
	private final int anInt1457;

	@OriginalMember(owner = "client!cja", name = "x", descriptor = "I")
	private final int anInt1453;

	@OriginalMember(owner = "client!cja", name = "C", descriptor = "I")
	private final int anInt1458;

	@OriginalMember(owner = "client!cja", name = "L", descriptor = "I")
	private final int anInt1456;

	@OriginalMember(owner = "client!cja", name = "D", descriptor = "[[F")
	private float[][] aFloatArrayArray4;

	@OriginalMember(owner = "client!cja", name = "m", descriptor = "[[F")
	private float[][] aFloatArrayArray6;

	@OriginalMember(owner = "client!cja", name = "r", descriptor = "[[F")
	private float[][] aFloatArrayArray5;

	@OriginalMember(owner = "client!cja", name = "o", descriptor = "I")
	private int anInt1452;

	@OriginalMember(owner = "client!cja", name = "s", descriptor = "Lclient!et;")
	private Class2_Sub20 aClass2_Sub20_3;

	@OriginalMember(owner = "client!cja", name = "q", descriptor = "Lclient!hq;")
	private Class2_Sub20_Sub1 aClass2_Sub20_Sub1_1;

	@OriginalMember(owner = "client!cja", name = "t", descriptor = "Lclient!lba;")
	private Class218 aClass218_5;

	@OriginalMember(owner = "client!cja", name = "K", descriptor = "Lclient!jv;")
	private final Interface12 anInterface12_2;

	@OriginalMember(owner = "client!cja", name = "w", descriptor = "Lclient!kw;")
	private final Interface13 anInterface13_2;

	@OriginalMember(owner = "client!cja", name = "A", descriptor = "Lclient!ib;")
	private final Class170 aClass170_6;

	@OriginalMember(owner = "client!cja", name = "F", descriptor = "Lclient!ib;")
	private final Class170 aClass170_5;

	@OriginalMember(owner = "client!cja", name = "<init>", descriptor = "(Lclient!uja;Lclient!gba;Lclient!bba;[I)V")
	public Class2_Sub15(@OriginalArg(0) Class145_Sub3 arg0, @OriginalArg(1) Class133_Sub1 arg1, @OriginalArg(2) Class2_Sub7 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass145_Sub3_5 = arg0;
		this.aClass133_Sub1_1 = arg1;
		this.aClass2_Sub7_2 = arg2;
		@Pc(23) int local23 = this.aClass2_Sub7_2.method8173() - (arg1.anInt9321 >> 1);
		this.anInt1457 = this.aClass2_Sub7_2.method8171() - local23 >> arg1.anInt9317;
		this.anInt1453 = local23 + this.aClass2_Sub7_2.method8171() >> arg1.anInt9317;
		this.anInt1458 = this.aClass2_Sub7_2.method8172() - local23 >> arg1.anInt9317;
		this.anInt1456 = local23 + this.aClass2_Sub7_2.method8172() >> arg1.anInt9317;
		@Pc(78) int local78 = this.anInt1453 + 1 - this.anInt1457;
		@Pc(87) int local87 = this.anInt1456 + 1 - this.anInt1458;
		this.aFloatArrayArray4 = new float[local78 + 1][local87 + 1];
		this.aFloatArrayArray6 = new float[local78 + 1][local87 + 1];
		this.aFloatArrayArray5 = new float[local78 + 1][local87 + 1];
		@Pc(123) int local123;
		@Pc(139) int local139;
		@Pc(146) int local146;
		@Pc(174) int local174;
		@Pc(191) int local191;
		for (@Pc(116) int local116 = 0; local116 <= local87; local116++) {
			local123 = local116 + this.anInt1458;
			if (local123 > 0 && this.aClass133_Sub1_1.anInt9315 - 1 > local123) {
				for (local139 = 0; local139 <= local78; local139++) {
					local146 = this.anInt1457 + local139;
					if (local146 > 0 && local146 < this.aClass133_Sub1_1.anInt9318 - 1) {
						local174 = arg1.method8217(local146 + 1, local123) - arg1.method8217(local146 - 1, local123);
						local191 = arg1.method8217(local146, local123 + 1) - arg1.method8217(local146, local123 - 1);
						@Pc(207) float local207 = (float) (1.0D / Math.sqrt((double) (local174 * local174 + local191 * local191 + 65536)));
						this.aFloatArrayArray5[local139][local116] = local207 * (float) local174;
						this.aFloatArrayArray4[local139][local116] = local207 * -256.0F;
						this.aFloatArrayArray6[local139][local116] = local207 * (float) local191;
					}
				}
			}
		}
		local123 = 0;
		@Pc(317) int local317;
		for (local139 = this.anInt1458; local139 <= this.anInt1456; local139++) {
			if (local139 >= 0 && arg1.anInt9315 > local139) {
				for (local146 = this.anInt1457; local146 <= this.anInt1453; local146++) {
					if (local146 >= 0 && local146 < arg1.anInt9318) {
						local174 = arg3[local123];
						@Pc(302) int[] local302 = arg1.anIntArrayArrayArray10[local146][local139];
						if (local302 != null && local174 != 0) {
							if (local174 == 1) {
								local317 = 0;
								while (local317 < local302.length) {
									if (local302[local317++] != -1 && local302[local317++] != -1 && local302[local317++] != -1) {
										this.anInt1452 += 3;
									}
								}
							} else {
								this.anInt1452 += 3;
							}
						}
					}
					local123++;
				}
			} else {
				local123 += this.anInt1453 - this.anInt1457;
			}
		}
		if (this.anInt1452 > 0) {
			this.aClass2_Sub20_3 = new Class2_Sub20(this.anInt1452 * 2);
			this.aClass2_Sub20_Sub1_1 = new Class2_Sub20_Sub1(this.anInt1452 * 16);
			this.aClass218_5 = new Class218(Static330.method4577(this.anInt1452));
			local123 = 0;
			local146 = 0;
			for (local174 = this.anInt1458; local174 <= this.anInt1456; local174++) {
				if (local174 >= 0 && arg1.anInt9315 > local174) {
					local191 = 0;
					for (local317 = this.anInt1457; local317 <= this.anInt1453; local317++) {
						if (local317 >= 0 && arg1.anInt9318 > local317) {
							@Pc(479) int local479 = arg3[local123];
							@Pc(486) int[] local486 = arg1.anIntArrayArrayArray10[local317][local174];
							if (local486 != null && local479 != 0) {
								if (local479 == 1) {
									@Pc(669) int[] local669 = arg1.anIntArrayArrayArray12[local317][local174];
									@Pc(676) int[] local676 = arg1.anIntArrayArrayArray13[local317][local174];
									@Pc(678) int local678 = 0;
									label107: while (true) {
										while (true) {
											if (local678 >= local486.length) {
												break label107;
											}
											if (local486[local678] == -1 || local486[local678 + 1] == -1 || local486[local678 + 2] == -1) {
												local678 += 3;
											} else {
												this.method1291(local174, local676[local678], local191, local669[local678], local317, local146);
												local678++;
												this.method1291(local174, local676[local678], local191, local669[local678], local317, local146);
												local678++;
												this.method1291(local174, local676[local678], local191, local669[local678], local317, local146);
												local678++;
											}
										}
									}
								} else if (local479 == 3) {
									this.method1291(local174, 0, local191, 0, local317, local146);
									this.method1291(local174, 0, local191, arg1.anInt9321, local317, local146);
									this.method1291(local174, arg1.anInt9321, local191, 0, local317, local146);
								} else if (local479 == 2) {
									this.method1291(local174, 0, local191, arg1.anInt9321, local317, local146);
									this.method1291(local174, arg1.anInt9321, local191, arg1.anInt9321, local317, local146);
									this.method1291(local174, 0, local191, 0, local317, local146);
								} else if (local479 == 5) {
									this.method1291(local174, arg1.anInt9321, local191, arg1.anInt9321, local317, local146);
									this.method1291(local174, arg1.anInt9321, local191, 0, local317, local146);
									this.method1291(local174, 0, local191, arg1.anInt9321, local317, local146);
								} else if (local479 == 4) {
									this.method1291(local174, arg1.anInt9321, local191, 0, local317, local146);
									this.method1291(local174, 0, local191, 0, local317, local146);
									this.method1291(local174, arg1.anInt9321, local191, arg1.anInt9321, local317, local146);
								}
							}
						}
						local191++;
						local123++;
					}
				} else {
					local123 += this.anInt1453 - this.anInt1457;
				}
				local146++;
			}
			this.anInterface12_2 = this.aClass145_Sub3_5.method8911(false, this.aClass2_Sub20_3.anInt9723, this.aClass2_Sub20_3.aByteArray111);
			this.anInterface13_2 = this.aClass145_Sub3_5.method8915(this.aClass2_Sub20_Sub1_1.anInt9723, 16, this.aClass2_Sub20_Sub1_1.aByteArray111, false);
			this.aClass170_6 = new Class170(this.anInterface13_2, 5126, 3, 0);
			this.aClass170_5 = new Class170(this.anInterface13_2, 5121, 4, 12);
		} else {
			this.aClass170_6 = null;
			this.anInterface13_2 = null;
			this.aClass170_5 = null;
			this.anInterface12_2 = null;
		}
		this.aFloatArrayArray5 = this.aFloatArrayArray4 = this.aFloatArrayArray6 = null;
		this.aClass218_5 = null;
		this.aClass2_Sub20_Sub1_1 = null;
		this.aClass2_Sub20_3 = null;
	}

	@OriginalMember(owner = "client!cja", name = "a", descriptor = "(IIII[[Z)V")
	public void method1289(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean[][] arg3) {
		if (this.anInterface12_2 == null || (arg2 + arg0 < this.anInt1457 || (this.anInt1453 < arg2 - arg0 || (arg0 + arg1 < this.anInt1458 || this.anInt1456 < arg1 - arg0)))) {
			return;
		}
		for (@Pc(66) int local66 = this.anInt1458; local66 <= this.anInt1456; local66++) {
			for (@Pc(71) int local71 = this.anInt1457; local71 <= this.anInt1453; local71++) {
				@Pc(77) int local77 = local71 - arg2;
				@Pc(82) int local82 = local66 - arg1;
				if (local77 > -arg0 && local77 < arg0 && -arg0 < local82 && local82 < arg0 && arg3[local77 + arg0][local82 + arg0]) {
					this.aClass145_Sub3_5.method8912((int) (this.aClass2_Sub7_2.method8169() * 255.0F) << 24);
					this.aClass145_Sub3_5.method8874(this.aClass170_5, this.aClass170_6, (Class170) null, (Class170) null);
					this.aClass145_Sub3_5.method8921(this.anInt1452, 0, this.anInterface12_2);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!cja", name = "a", descriptor = "(IS)V")
	private void method1290(@OriginalArg(1) short arg0) {
		if (this.aClass145_Sub3_5.aBoolean872) {
			this.aClass2_Sub20_3.method8551(arg0);
		} else {
			this.aClass2_Sub20_3.method8589(arg0);
		}
	}

	@OriginalMember(owner = "client!cja", name = "a", descriptor = "(IIBIIII)V")
	private void method1291(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(20) int local20 = arg3 + (arg4 << this.aClass133_Sub1_1.anInt9317);
		@Pc(28) int local28 = (arg0 << this.aClass133_Sub1_1.anInt9317) + arg1;
		@Pc(35) int local35 = this.aClass133_Sub1_1.method8214(local20, local28);
		if ((arg3 & 0x7F) == 0 || (arg1 & 0x7F) == 0) {
			local7 = 0xFFFFL << 16 & (long) local28 << 16 | (long) local20 & 0xFFFFL;
			@Pc(70) Class2 local70 = this.aClass218_5.method5095(local7, 0);
			if (local70 != null) {
				this.method1290(((Class2_Sub16) local70).aShort38);
				return;
			}
		}
		@Pc(89) short local89 = (short) this.anInt1459++;
		if (local7 != -1L) {
			this.aClass218_5.method5099(new Class2_Sub16(local89), local7);
		}
		@Pc(126) float local126;
		@Pc(133) float local133;
		@Pc(119) float local119;
		@Pc(221) float local221;
		@Pc(229) float local229;
		@Pc(236) float local236;
		@Pc(243) float local243;
		@Pc(250) float local250;
		@Pc(259) float local259;
		@Pc(268) float local268;
		@Pc(342) float local342;
		if (arg3 == 0 && arg1 == 0) {
			local119 = this.aFloatArrayArray6[arg2][arg5];
			local126 = this.aFloatArrayArray5[arg2][arg5];
			local133 = this.aFloatArrayArray4[arg2][arg5];
		} else if (arg3 == this.aClass133_Sub1_1.anInt9321 && arg1 == 0) {
			local133 = this.aFloatArrayArray4[arg2 + 1][arg5];
			local126 = this.aFloatArrayArray5[arg2 + 1][arg5];
			local119 = this.aFloatArrayArray6[arg2 + 1][arg5];
		} else if (this.aClass133_Sub1_1.anInt9321 == arg3 && arg1 == this.aClass133_Sub1_1.anInt9321) {
			local133 = this.aFloatArrayArray4[arg2 + 1][arg5 + 1];
			local126 = this.aFloatArrayArray5[arg2 + 1][arg5 + 1];
			local119 = this.aFloatArrayArray6[arg2 + 1][arg5 + 1];
		} else if (arg3 == 0 && this.aClass133_Sub1_1.anInt9321 == arg1) {
			local133 = this.aFloatArrayArray4[arg2][arg5 + 1];
			local119 = this.aFloatArrayArray6[arg2][arg5 + 1];
			local126 = this.aFloatArrayArray5[arg2][arg5 + 1];
		} else {
			local221 = (float) arg3 / (float) this.aClass133_Sub1_1.anInt9321;
			local229 = (float) arg1 / (float) this.aClass133_Sub1_1.anInt9321;
			local236 = this.aFloatArrayArray5[arg2][arg5];
			local243 = this.aFloatArrayArray4[arg2][arg5];
			local250 = this.aFloatArrayArray6[arg2][arg5];
			local259 = this.aFloatArrayArray5[arg2 + 1][arg5];
			local268 = this.aFloatArrayArray4[arg2 + 1][arg5];
			@Pc(284) float local284 = local236 + (this.aFloatArrayArray5[arg2][arg5 + 1] - local236) * local221;
			@Pc(302) float local302 = local268 + local221 * (this.aFloatArrayArray4[arg2 + 1][arg5 + 1] - local268);
			@Pc(317) float local317 = local250 + local221 * (this.aFloatArrayArray6[arg2][arg5 + 1] - local250);
			@Pc(333) float local333 = local243 + (this.aFloatArrayArray4[arg2][arg5 + 1] - local243) * local221;
			local342 = this.aFloatArrayArray6[arg2 + 1][arg5];
			@Pc(359) float local359 = local259 + (this.aFloatArrayArray5[arg2 + 1][arg5 + 1] - local259) * local221;
			local133 = (local302 - local333) * local229 + local333;
			local126 = local284 + local229 * (local359 - local284);
			@Pc(394) float local394 = local342 + (this.aFloatArrayArray6[arg2 + 1][arg5 + 1] - local342) * local221;
			local119 = (local394 - local317) * local229 + local317;
		}
		local221 = (float) (this.aClass2_Sub7_2.method8171() - local20);
		local229 = (float) (this.aClass2_Sub7_2.method8174() - local35);
		local236 = (float) (this.aClass2_Sub7_2.method8172() - local28);
		local243 = (float) Math.sqrt((double) (local229 * local229 + local221 * local221 + local236 * local236));
		local250 = 1.0F / local243;
		local229 *= local250;
		local236 *= local250;
		local221 *= local250;
		local259 = local243 / (float) this.aClass2_Sub7_2.method8173();
		local268 = 1.0F - local259 * local259;
		if (local268 < 0.0F) {
			local268 = 0.0F;
		}
		local342 = local236 * local119 + local221 * local126 + local133 * local229;
		if (local342 < 0.0F) {
			local342 = 0.0F;
		}
		@Pc(563) float local563 = local342 * local268 * 2.0F;
		if (local563 > 1.0F) {
			local563 = 1.0F;
		}
		@Pc(574) int local574 = this.aClass2_Sub7_2.method8170();
		@Pc(584) int local584 = (int) ((float) (local574 >> 16 & 0xFF) * local563);
		if (local584 > 255) {
			local584 = 255;
		}
		@Pc(599) int local599 = (int) (local563 * (float) (local574 >> 8 & 0xFF));
		if (local599 > 255) {
			local599 = 255;
		}
		@Pc(612) int local612 = (int) ((float) (local574 & 0xFF) * local563);
		if (this.aClass145_Sub3_5.aBoolean872) {
			this.aClass2_Sub20_Sub1_1.method3563((float) local20);
			this.aClass2_Sub20_Sub1_1.method3563((float) local35);
			this.aClass2_Sub20_Sub1_1.method3563((float) local28);
		} else {
			this.aClass2_Sub20_Sub1_1.method3565((float) local20);
			this.aClass2_Sub20_Sub1_1.method3565((float) local35);
			this.aClass2_Sub20_Sub1_1.method3565((float) local28);
		}
		if (local612 > 255) {
			local612 = 255;
		}
		this.aClass2_Sub20_Sub1_1.method8584(local584);
		this.aClass2_Sub20_Sub1_1.method8584(local599);
		this.aClass2_Sub20_Sub1_1.method8584(local612);
		this.aClass2_Sub20_Sub1_1.method8584(255);
		this.method1290(local89);
	}
}
