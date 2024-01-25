import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public final class Class12_Sub49 extends Class12 {

	@OriginalMember(owner = "client!vb", name = "F", descriptor = "I")
	private int anInt9113;

	@OriginalMember(owner = "client!vb", name = "M", descriptor = "I")
	private int anInt9114;

	@OriginalMember(owner = "client!vb", name = "E", descriptor = "Lclient!rh;")
	private final Class12_Sub7 aClass12_Sub7_3;

	@OriginalMember(owner = "client!vb", name = "x", descriptor = "Lclient!gi;")
	private final Class42_Sub3 aClass42_Sub3_40;

	@OriginalMember(owner = "client!vb", name = "I", descriptor = "Lclient!ql;")
	private final Class215_Sub2 aClass215_Sub2_2;

	@OriginalMember(owner = "client!vb", name = "s", descriptor = "I")
	private final int anInt9107;

	@OriginalMember(owner = "client!vb", name = "u", descriptor = "I")
	private final int anInt9109;

	@OriginalMember(owner = "client!vb", name = "z", descriptor = "I")
	private final int anInt9111;

	@OriginalMember(owner = "client!vb", name = "w", descriptor = "I")
	private final int anInt9110;

	@OriginalMember(owner = "client!vb", name = "n", descriptor = "[[F")
	private float[][] aFloatArrayArray14;

	@OriginalMember(owner = "client!vb", name = "m", descriptor = "[[F")
	private float[][] aFloatArrayArray13;

	@OriginalMember(owner = "client!vb", name = "q", descriptor = "[[F")
	private float[][] aFloatArrayArray15;

	@OriginalMember(owner = "client!vb", name = "H", descriptor = "Lclient!daa;")
	private Class12_Sub8 aClass12_Sub8_8;

	@OriginalMember(owner = "client!vb", name = "y", descriptor = "Lclient!mh;")
	private Class12_Sub8_Sub1 aClass12_Sub8_Sub1_3;

	@OriginalMember(owner = "client!vb", name = "K", descriptor = "Lclient!dea;")
	private Class68 aClass68_76;

	@OriginalMember(owner = "client!vb", name = "D", descriptor = "Lclient!ah;")
	private final Interface2 anInterface2_4;

	@OriginalMember(owner = "client!vb", name = "v", descriptor = "Lclient!qd;")
	private final Interface14 anInterface14_6;

	@OriginalMember(owner = "client!vb", name = "J", descriptor = "Lclient!dd;")
	private final Class65 aClass65_12;

	@OriginalMember(owner = "client!vb", name = "A", descriptor = "Lclient!dd;")
	private final Class65 aClass65_11;

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Lclient!gi;Lclient!ql;Lclient!rh;[I)V")
	public Class12_Sub49(@OriginalArg(0) Class42_Sub3 arg0, @OriginalArg(1) Class215_Sub2 arg1, @OriginalArg(2) Class12_Sub7 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass12_Sub7_3 = arg2;
		this.aClass42_Sub3_40 = arg0;
		this.aClass215_Sub2_2 = arg1;
		@Pc(23) int local23 = this.aClass12_Sub7_3.method5123() - (arg1.anInt9451 >> 1);
		this.anInt9107 = this.aClass12_Sub7_3.method5124() - local23 >> arg1.anInt9453;
		this.anInt9109 = this.aClass12_Sub7_3.method5124() + local23 >> arg1.anInt9453;
		this.anInt9111 = this.aClass12_Sub7_3.method5117() - local23 >> arg1.anInt9453;
		this.anInt9110 = local23 + this.aClass12_Sub7_3.method5117() >> arg1.anInt9453;
		@Pc(78) int local78 = this.anInt9109 + 1 - this.anInt9107;
		@Pc(86) int local86 = this.anInt9110 + 1 - this.anInt9111;
		this.aFloatArrayArray14 = new float[local78 + 1][local86 + 1];
		this.aFloatArrayArray13 = new float[local78 + 1][local86 + 1];
		this.aFloatArrayArray15 = new float[local78 + 1][local86 + 1];
		@Pc(122) int local122;
		@Pc(133) int local133;
		@Pc(140) int local140;
		@Pc(163) int local163;
		@Pc(178) int local178;
		for (@Pc(115) int local115 = 0; local115 <= local86; local115++) {
			local122 = this.anInt9111 + local115;
			if (local122 > 0 && this.aClass215_Sub2_2.anInt9450 - 1 > local122) {
				for (local133 = 0; local133 <= local78; local133++) {
					local140 = this.anInt9107 + local133;
					if (local140 > 0 && this.aClass215_Sub2_2.anInt9452 - 1 > local140) {
						local163 = arg1.ba(local140 + 1, local122) - arg1.ba(local140 - 1, local122);
						local178 = arg1.ba(local140, local122 + 1) - arg1.ba(local140, local122 - 1);
						@Pc(194) float local194 = (float) (1.0D / Math.sqrt((double) (local163 * local163 + local178 * local178 + 65536)));
						this.aFloatArrayArray15[local133][local115] = local194 * (float) local163;
						this.aFloatArrayArray14[local133][local115] = local194 * -256.0F;
						this.aFloatArrayArray13[local133][local115] = local194 * (float) local178;
					}
				}
			}
		}
		local122 = 0;
		local133 = 0;
		for (local140 = this.anInt9111; local140 <= this.anInt9110; local140++) {
			if (local140 >= 0 && arg1.anInt9450 > local140) {
				for (local163 = this.anInt9107; local163 <= this.anInt9109; local163++) {
					if (local163 >= 0 && arg1.anInt9452 > local163) {
						local178 = arg3[local133];
						@Pc(286) int[] local286 = arg1.anIntArrayArrayArray10[local163][local140];
						if (local286 != null && local178 != 0) {
							if (local178 == 1) {
								local122 += local286.length;
							} else {
								local122 += 3;
							}
						}
					}
					local133++;
				}
			} else {
				local133 += this.anInt9109 - this.anInt9107;
			}
		}
		if (local122 > 0) {
			this.aClass12_Sub8_8 = new Class12_Sub8(local122 * 2);
			this.aClass12_Sub8_Sub1_3 = new Class12_Sub8_Sub1(local122 * 16);
			this.aClass68_76 = new Class68(Static37.method6277(local122));
			local163 = 0;
			local133 = 0;
			for (local178 = this.anInt9111; local178 <= this.anInt9110; local178++) {
				if (local178 >= 0 && arg1.anInt9450 > local178) {
					@Pc(380) int local380 = 0;
					for (@Pc(383) int local383 = this.anInt9107; local383 <= this.anInt9109; local383++) {
						if (local383 >= 0 && arg1.anInt9452 > local383) {
							@Pc(398) int local398 = arg3[local133];
							@Pc(405) int[] local405 = arg1.anIntArrayArrayArray10[local383][local178];
							@Pc(412) int[] local412 = arg1.anIntArrayArrayArray12[local383][local178];
							if (local405 != null && local398 != 0) {
								if (local398 == 1) {
									for (@Pc(426) int local426 = 0; local426 < local405.length; local426++) {
										this.method7507(local380, local405[local426], local383, local163, local178, local412[local426]);
									}
								} else if (local398 == 3) {
									this.method7507(local380, 0, local383, local163, local178, 0);
									this.method7507(local380, arg1.anInt9451, local383, local163, local178, 0);
									this.method7507(local380, 0, local383, local163, local178, arg1.anInt9451);
								} else if (local398 == 2) {
									this.method7507(local380, arg1.anInt9451, local383, local163, local178, 0);
									this.method7507(local380, arg1.anInt9451, local383, local163, local178, arg1.anInt9451);
									this.method7507(local380, 0, local383, local163, local178, 0);
								} else if (local398 == 5) {
									this.method7507(local380, arg1.anInt9451, local383, local163, local178, arg1.anInt9451);
									this.method7507(local380, 0, local383, local163, local178, arg1.anInt9451);
									this.method7507(local380, arg1.anInt9451, local383, local163, local178, 0);
								} else if (local398 == 4) {
									this.method7507(local380, 0, local383, local163, local178, arg1.anInt9451);
									this.method7507(local380, 0, local383, local163, local178, 0);
									this.method7507(local380, arg1.anInt9451, local383, local163, local178, arg1.anInt9451);
								}
							}
						}
						local133++;
						local380++;
					}
				} else {
					local133 += this.anInt9109 - this.anInt9107;
				}
				local163++;
			}
			this.anInterface2_4 = this.aClass42_Sub3_40.method3252(this.aClass12_Sub8_8.anInt6217, false, this.aClass12_Sub8_8.aByteArray82);
			this.anInterface14_6 = this.aClass42_Sub3_40.method3261(16, false, this.aClass12_Sub8_Sub1_3.anInt6217, this.aClass12_Sub8_Sub1_3.aByteArray82);
			this.aClass65_12 = new Class65(this.anInterface14_6, 5126, 3, 0);
			this.aClass65_11 = new Class65(this.anInterface14_6, 5121, 4, 12);
		} else {
			this.aClass65_11 = null;
			this.anInterface14_6 = null;
			this.aClass65_12 = null;
			this.anInterface2_4 = null;
		}
		this.aClass68_76 = null;
		this.aClass12_Sub8_8 = null;
		this.aFloatArrayArray15 = this.aFloatArrayArray14 = this.aFloatArrayArray13 = null;
		this.aClass12_Sub8_Sub1_3 = null;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IS)V")
	private void method7505(@OriginalArg(1) short arg0) {
		if (this.aClass42_Sub3_40.aBoolean292) {
			this.aClass12_Sub8_8.method5190(arg0);
		} else {
			this.aClass12_Sub8_8.method5201(arg0);
		}
		this.anInt9113++;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "([[ZBIII)V")
	public void method7506(@OriginalArg(0) boolean[][] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anInterface2_4 == null || (this.anInt9107 > arg2 + arg3 || (this.anInt9109 < arg2 - arg3 || (this.anInt9111 > arg3 + arg1 || arg1 - arg3 > this.anInt9110)))) {
			return;
		}
		for (@Pc(60) int local60 = this.anInt9111; local60 <= this.anInt9110; local60++) {
			for (@Pc(65) int local65 = this.anInt9107; local65 <= this.anInt9109; local65++) {
				@Pc(72) int local72 = local65 - arg2;
				@Pc(77) int local77 = local60 - arg1;
				if (-arg3 < local72 && local72 < arg3 && -arg3 < local77 && local77 < arg3 && arg0[arg3 + local72][local77 + arg3]) {
					this.aClass42_Sub3_40.method3223((int) (this.aClass12_Sub7_3.method5125() * 255.0F) << 24);
					this.aClass42_Sub3_40.method3241(this.aClass65_11, null, this.aClass65_12, null);
					this.aClass42_Sub3_40.method3227(this.anInterface2_4, this.anInt9113, 0);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIIIII)V")
	private void method7507(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(15) int local15 = (arg2 << this.aClass215_Sub2_2.anInt9453) + arg1;
		@Pc(23) int local23 = (arg4 << this.aClass215_Sub2_2.anInt9453) + arg5;
		@Pc(29) int local29 = this.aClass215_Sub2_2.aa(local15, local23);
		if ((arg1 & 0x7F) == 0 || (arg5 & 0x7F) == 0) {
			local7 = (long) local15 & 0xFFFFL | 0xFFFFL << 16 & (long) local23 << 16;
			@Pc(59) Class12 local59 = this.aClass68_76.method1917(local7);
			if (local59 != null) {
				this.method7505(((Class12_Sub31) local59).aShort68);
				return;
			}
		}
		@Pc(77) short local77 = (short) this.anInt9114++;
		if (local7 != -1L) {
			this.aClass68_76.method1916(new Class12_Sub31(local77), local7);
		}
		@Pc(125) float local125;
		@Pc(118) float local118;
		@Pc(111) float local111;
		@Pc(260) float local260;
		@Pc(268) float local268;
		@Pc(275) float local275;
		@Pc(282) float local282;
		@Pc(289) float local289;
		@Pc(298) float local298;
		@Pc(307) float local307;
		@Pc(398) float local398;
		if (arg1 == 0 && arg5 == 0) {
			local111 = this.aFloatArrayArray13[arg0][arg3];
			local118 = this.aFloatArrayArray14[arg0][arg3];
			local125 = this.aFloatArrayArray15[arg0][arg3];
		} else if (this.aClass215_Sub2_2.anInt9451 == arg1 && arg5 == 0) {
			local125 = this.aFloatArrayArray15[arg0 + 1][arg3];
			local111 = this.aFloatArrayArray13[arg0 + 1][arg3];
			local118 = this.aFloatArrayArray14[arg0 + 1][arg3];
		} else if (arg1 == this.aClass215_Sub2_2.anInt9451 && this.aClass215_Sub2_2.anInt9451 == arg5) {
			local118 = this.aFloatArrayArray14[arg0 + 1][arg3 + 1];
			local111 = this.aFloatArrayArray13[arg0 + 1][arg3 + 1];
			local125 = this.aFloatArrayArray15[arg0 + 1][arg3 + 1];
		} else if (arg1 == 0 && this.aClass215_Sub2_2.anInt9451 == arg5) {
			local118 = this.aFloatArrayArray14[arg0][arg3 + 1];
			local125 = this.aFloatArrayArray15[arg0][arg3 + 1];
			local111 = this.aFloatArrayArray13[arg0][arg3 + 1];
		} else {
			local260 = (float) arg1 / (float) this.aClass215_Sub2_2.anInt9451;
			local268 = (float) arg5 / (float) this.aClass215_Sub2_2.anInt9451;
			local275 = this.aFloatArrayArray15[arg0][arg3];
			local282 = this.aFloatArrayArray14[arg0][arg3];
			local289 = this.aFloatArrayArray13[arg0][arg3];
			local298 = this.aFloatArrayArray15[arg0 + 1][arg3];
			local307 = this.aFloatArrayArray14[arg0 + 1][arg3];
			@Pc(325) float local325 = local307 + (this.aFloatArrayArray14[arg0 + 1][arg3 + 1] - local307) * local260;
			@Pc(340) float local340 = local289 + local260 * (this.aFloatArrayArray13[arg0][arg3 + 1] - local289);
			@Pc(357) float local357 = local298 + (this.aFloatArrayArray15[arg0 + 1][arg3 + 1] - local298) * local260;
			@Pc(373) float local373 = local275 + (this.aFloatArrayArray15[arg0][arg3 + 1] - local275) * local260;
			@Pc(389) float local389 = local282 + local260 * (this.aFloatArrayArray14[arg0][arg3 + 1] - local282);
			local398 = this.aFloatArrayArray13[arg0 + 1][arg3];
			local125 = local373 + local268 * (local357 - local373);
			local118 = local389 + (local325 - local389) * local268;
			@Pc(433) float local433 = local398 + local260 * (this.aFloatArrayArray13[arg0 + 1][arg3 + 1] - local398);
			local111 = local340 + (local433 - local340) * local268;
		}
		local260 = this.aClass12_Sub7_3.method5124() - local15;
		local268 = this.aClass12_Sub7_3.method5120() - local29;
		local275 = this.aClass12_Sub7_3.method5117() - local23;
		local282 = (float) Math.sqrt((double) (local260 * local260 + local268 * local268 + local275 * local275));
		local289 = 1.0F / local282;
		local268 *= local289;
		local275 *= local289;
		local260 *= local289;
		local298 = local282 / (float) this.aClass12_Sub7_3.method5123();
		local307 = 1.0F - local298 * local298;
		if (local307 < 0.0F) {
			local307 = 0.0F;
		}
		local398 = local275 * local111 + local260 * local125 + local268 * local118;
		if (local398 < 0.0F) {
			local398 = 0.0F;
		}
		@Pc(545) float local545 = local307 * local398 * 2.0F;
		if (local545 > 1.0F) {
			local545 = 1.0F;
		}
		@Pc(562) int local562 = this.aClass12_Sub7_3.method5118();
		@Pc(572) int local572 = (int) (local545 * (float) (local562 >> 16 & 0xFF));
		if (local572 > 255) {
			local572 = 255;
		}
		@Pc(589) int local589 = (int) ((float) (local562 >> 8 & 0xFF) * local545);
		if (local589 > 255) {
			local589 = 255;
		}
		@Pc(604) int local604 = (int) (local545 * (float) (local562 & 0xFF));
		if (this.aClass42_Sub3_40.aBoolean292) {
			this.aClass12_Sub8_Sub1_3.method4923((float) local15);
			this.aClass12_Sub8_Sub1_3.method4923((float) local29);
			this.aClass12_Sub8_Sub1_3.method4923((float) local23);
		} else {
			this.aClass12_Sub8_Sub1_3.method4924((float) local15);
			this.aClass12_Sub8_Sub1_3.method4924((float) local29);
			this.aClass12_Sub8_Sub1_3.method4924((float) local23);
		}
		if (local604 > 255) {
			local604 = 255;
		}
		this.aClass12_Sub8_Sub1_3.method5214(local572);
		this.aClass12_Sub8_Sub1_3.method5214(local589);
		this.aClass12_Sub8_Sub1_3.method5214(local604);
		this.aClass12_Sub8_Sub1_3.method5214(255);
		this.method7505(local77);
	}
}
