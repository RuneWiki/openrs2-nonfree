import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qca")
public final class Class3_Sub38 extends Class3 {

	@OriginalMember(owner = "client!qca", name = "H", descriptor = "I")
	private int anInt7079;

	@OriginalMember(owner = "client!qca", name = "w", descriptor = "Lclient!us;")
	private final Class43_Sub3 aClass43_Sub3_33;

	@OriginalMember(owner = "client!qca", name = "s", descriptor = "Lclient!oj;")
	private final Class139_Sub2 aClass139_Sub2_3;

	@OriginalMember(owner = "client!qca", name = "z", descriptor = "Lclient!ff;")
	private final Class3_Sub22 aClass3_Sub22_3;

	@OriginalMember(owner = "client!qca", name = "u", descriptor = "I")
	private final int anInt7074;

	@OriginalMember(owner = "client!qca", name = "x", descriptor = "I")
	private final int anInt7076;

	@OriginalMember(owner = "client!qca", name = "A", descriptor = "I")
	private final int anInt7077;

	@OriginalMember(owner = "client!qca", name = "v", descriptor = "I")
	private final int anInt7075;

	@OriginalMember(owner = "client!qca", name = "l", descriptor = "[[F")
	private float[][] aFloatArrayArray10;

	@OriginalMember(owner = "client!qca", name = "G", descriptor = "[[F")
	private float[][] aFloatArrayArray12;

	@OriginalMember(owner = "client!qca", name = "D", descriptor = "[[F")
	private float[][] aFloatArrayArray11;

	@OriginalMember(owner = "client!qca", name = "q", descriptor = "I")
	private int anInt7073;

	@OriginalMember(owner = "client!qca", name = "o", descriptor = "Lclient!qh;")
	private Class3_Sub11 aClass3_Sub11_4;

	@OriginalMember(owner = "client!qca", name = "k", descriptor = "Lclient!gt;")
	private Class3_Sub11_Sub2 aClass3_Sub11_Sub2_2;

	@OriginalMember(owner = "client!qca", name = "y", descriptor = "Lclient!sl;")
	private Class310 aClass310_28;

	@OriginalMember(owner = "client!qca", name = "r", descriptor = "Lclient!cv;")
	private final Interface5 anInterface5_3;

	@OriginalMember(owner = "client!qca", name = "p", descriptor = "Lclient!el;")
	private final Interface7 anInterface7_4;

	@OriginalMember(owner = "client!qca", name = "E", descriptor = "Lclient!rca;")
	private final Class280 aClass280_14;

	@OriginalMember(owner = "client!qca", name = "B", descriptor = "Lclient!rca;")
	private final Class280 aClass280_13;

	@OriginalMember(owner = "client!qca", name = "<init>", descriptor = "(Lclient!us;Lclient!oj;Lclient!ff;[I)V")
	public Class3_Sub38(@OriginalArg(0) Class43_Sub3 arg0, @OriginalArg(1) Class139_Sub2 arg1, @OriginalArg(2) Class3_Sub22 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass43_Sub3_33 = arg0;
		this.aClass139_Sub2_3 = arg1;
		this.aClass3_Sub22_3 = arg2;
		@Pc(22) int local22 = this.aClass3_Sub22_3.method6729() - (arg1.anInt8178 >> 1);
		this.anInt7074 = this.aClass3_Sub22_3.method6731() - local22 >> arg1.anInt8176;
		this.anInt7076 = local22 + this.aClass3_Sub22_3.method6731() >> arg1.anInt8176;
		this.anInt7077 = this.aClass3_Sub22_3.method6725() - local22 >> arg1.anInt8176;
		this.anInt7075 = this.aClass3_Sub22_3.method6725() + local22 >> arg1.anInt8176;
		@Pc(78) int local78 = this.anInt7076 + 1 - this.anInt7074;
		@Pc(86) int local86 = this.anInt7075 + 1 - this.anInt7077;
		this.aFloatArrayArray10 = new float[local78 + 1][local86 + 1];
		this.aFloatArrayArray12 = new float[local78 + 1][local86 + 1];
		this.aFloatArrayArray11 = new float[local78 + 1][local86 + 1];
		@Pc(122) int local122;
		@Pc(140) int local140;
		@Pc(148) int local148;
		@Pc(177) int local177;
		@Pc(194) int local194;
		for (@Pc(115) int local115 = 0; local115 <= local86; local115++) {
			local122 = local115 + this.anInt7077;
			if (local122 > 0 && this.aClass139_Sub2_3.anInt8180 - 1 > local122) {
				for (local140 = 0; local140 <= local78; local140++) {
					local148 = local140 + this.anInt7074;
					if (local148 > 0 && local148 < this.aClass139_Sub2_3.anInt8179 - 1) {
						local177 = arg1.method6889(local148 + 1, local122) - arg1.method6889(local148 - 1, local122);
						local194 = arg1.method6889(local148, local122 + 1) - arg1.method6889(local148, local122 - 1);
						@Pc(209) float local209 = (float) (1.0D / Math.sqrt((double) (local177 * local177 + local194 * local194 + 65536)));
						this.aFloatArrayArray10[local140][local115] = local209 * (float) local177;
						this.aFloatArrayArray11[local140][local115] = local209 * -256.0F;
						this.aFloatArrayArray12[local140][local115] = local209 * (float) local194;
					}
				}
			}
		}
		local122 = 0;
		@Pc(313) int local313;
		for (local140 = this.anInt7077; local140 <= this.anInt7075; local140++) {
			if (local140 >= 0 && local140 < arg1.anInt8180) {
				for (local148 = this.anInt7074; local148 <= this.anInt7076; local148++) {
					if (local148 >= 0 && arg1.anInt8179 > local148) {
						local177 = arg3[local122];
						@Pc(296) int[] local296 = arg1.anIntArrayArrayArray11[local148][local140];
						if (local296 != null && local177 != 0) {
							if (local177 == 1) {
								local313 = 0;
								while (local296.length > local313) {
									if (local296[local313++] != -1 && local296[local313++] != -1 && local296[local313++] != -1) {
										this.anInt7073 += 3;
									}
								}
							} else {
								this.anInt7073 += 3;
							}
						}
					}
					local122++;
				}
			} else {
				local122 += this.anInt7076 - this.anInt7074;
			}
		}
		if (this.anInt7073 > 0) {
			this.aClass3_Sub11_4 = new Class3_Sub11(this.anInt7073 * 2);
			this.aClass3_Sub11_Sub2_2 = new Class3_Sub11_Sub2(this.anInt7073 * 16);
			this.aClass310_28 = new Class310(Static114.method2375(this.anInt7073));
			local122 = 0;
			local148 = 0;
			for (local177 = this.anInt7077; local177 <= this.anInt7075; local177++) {
				if (local177 >= 0 && arg1.anInt8180 > local177) {
					local194 = 0;
					for (local313 = this.anInt7074; local313 <= this.anInt7076; local313++) {
						if (local313 >= 0 && local313 < arg1.anInt8179) {
							@Pc(436) int local436 = arg3[local122];
							@Pc(443) int[] local443 = arg1.anIntArrayArrayArray11[local313][local177];
							if (local443 != null && local436 != 0) {
								if (local436 == 1) {
									@Pc(605) int[] local605 = arg1.anIntArrayArrayArray8[local313][local177];
									@Pc(612) int[] local612 = arg1.anIntArrayArrayArray10[local313][local177];
									@Pc(614) int local614 = 0;
									label106: while (true) {
										while (true) {
											if (local443.length <= local614) {
												break label106;
											}
											if (local443[local614] == -1 || local443[local614 + 1] == -1 || local443[local614 + 2] == -1) {
												local614 += 3;
											} else {
												this.method6032(local605[local614], local313, local612[local614], local194, local148, local177);
												local614++;
												this.method6032(local605[local614], local313, local612[local614], local194, local148, local177);
												local614++;
												this.method6032(local605[local614], local313, local612[local614], local194, local148, local177);
												local614++;
											}
										}
									}
								} else if (local436 == 3) {
									this.method6032(0, local313, 0, local194, local148, local177);
									this.method6032(arg1.anInt8178, local313, 0, local194, local148, local177);
									this.method6032(0, local313, arg1.anInt8178, local194, local148, local177);
								} else if (local436 == 2) {
									this.method6032(arg1.anInt8178, local313, 0, local194, local148, local177);
									this.method6032(arg1.anInt8178, local313, arg1.anInt8178, local194, local148, local177);
									this.method6032(0, local313, 0, local194, local148, local177);
								} else if (local436 == 5) {
									this.method6032(arg1.anInt8178, local313, arg1.anInt8178, local194, local148, local177);
									this.method6032(0, local313, arg1.anInt8178, local194, local148, local177);
									this.method6032(arg1.anInt8178, local313, 0, local194, local148, local177);
								} else if (local436 == 4) {
									this.method6032(0, local313, arg1.anInt8178, local194, local148, local177);
									this.method6032(0, local313, 0, local194, local148, local177);
									this.method6032(arg1.anInt8178, local313, arg1.anInt8178, local194, local148, local177);
								}
							}
						}
						local194++;
						local122++;
					}
				} else {
					local122 += this.anInt7076 - this.anInt7074;
				}
				local148++;
			}
			this.anInterface5_3 = this.aClass43_Sub3_33.method7288(false, this.aClass3_Sub11_4.aByteArray36, this.aClass3_Sub11_4.anInt3520);
			this.anInterface7_4 = this.aClass43_Sub3_33.method7241(this.aClass3_Sub11_Sub2_2.aByteArray36, 16, this.aClass3_Sub11_Sub2_2.anInt3520, false);
			this.aClass280_14 = new Class280(this.anInterface7_4, 5126, 3, 0);
			this.aClass280_13 = new Class280(this.anInterface7_4, 5121, 4, 12);
		} else {
			this.anInterface7_4 = null;
			this.anInterface5_3 = null;
			this.aClass280_13 = null;
			this.aClass280_14 = null;
		}
		this.aClass3_Sub11_Sub2_2 = null;
		this.aClass3_Sub11_4 = null;
		this.aClass310_28 = null;
		this.aFloatArrayArray10 = this.aFloatArrayArray11 = this.aFloatArrayArray12 = null;
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "([[ZIIII)V")
	public void method6030(@OriginalArg(0) boolean[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInterface5_3 == null || (this.anInt7074 > arg1 + arg2 || (this.anInt7076 < arg1 - arg2 || (arg2 + arg3 < this.anInt7077 || arg3 - arg2 > this.anInt7075)))) {
			return;
		}
		for (@Pc(51) int local51 = this.anInt7077; local51 <= this.anInt7075; local51++) {
			for (@Pc(56) int local56 = this.anInt7074; local56 <= this.anInt7076; local56++) {
				@Pc(63) int local63 = local56 - arg1;
				@Pc(68) int local68 = local51 - arg3;
				if (-arg2 < local63 && arg2 > local63 && local68 > -arg2 && local68 < arg2 && arg0[local63 + arg2][arg2 + local68]) {
					this.aClass43_Sub3_33.method7233((int) (this.aClass3_Sub22_3.method6732() * 255.0F) << 24);
					this.aClass43_Sub3_33.method7303(null, this.aClass280_14, this.aClass280_13, null);
					this.aClass43_Sub3_33.method7224(this.anInterface5_3, 0, this.anInt7073);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(SZ)V")
	private void method6031(@OriginalArg(0) short arg0) {
		if (this.aClass43_Sub3_33.aBoolean671) {
			this.aClass3_Sub11_4.method3131(arg0);
		} else {
			this.aClass3_Sub11_4.method3075(arg0);
		}
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(IIIIIII)V")
	private void method6032(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(16) int local16 = arg0 + (arg1 << this.aClass139_Sub2_3.anInt8176);
		@Pc(24) int local24 = (arg5 << this.aClass139_Sub2_3.anInt8176) + arg2;
		@Pc(33) int local33 = this.aClass139_Sub2_3.method6890(local16, local24);
		if ((arg0 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
			local7 = ((long) local24 & 0xFFFFL) << 16 | (long) local16 & 0xFFFFL;
			@Pc(62) Class3 local62 = this.aClass310_28.method6601(local7);
			if (local62 != null) {
				this.method6031(((Class3_Sub26) local62).aShort53);
				return;
			}
		}
		@Pc(80) short local80 = (short) this.anInt7079++;
		if (local7 != -1L) {
			this.aClass310_28.method6603(new Class3_Sub26(local80), local7);
		}
		@Pc(119) float local119;
		@Pc(128) float local128;
		@Pc(137) float local137;
		@Pc(202) float local202;
		@Pc(210) float local210;
		@Pc(217) float local217;
		@Pc(224) float local224;
		@Pc(231) float local231;
		@Pc(240) float local240;
		@Pc(249) float local249;
		@Pc(258) float local258;
		if (arg0 == 0 && arg2 == 0) {
			local119 = this.aFloatArrayArray10[arg3][arg4];
			local128 = this.aFloatArrayArray11[arg3][arg4];
			local137 = this.aFloatArrayArray12[arg3][arg4];
		} else if (arg0 == this.aClass139_Sub2_3.anInt8178 && arg2 == 0) {
			local119 = this.aFloatArrayArray10[arg3 + 1][arg4];
			local128 = this.aFloatArrayArray11[arg3 + 1][arg4];
			local137 = this.aFloatArrayArray12[arg3 + 1][arg4];
		} else if (arg0 == this.aClass139_Sub2_3.anInt8178 && arg2 == this.aClass139_Sub2_3.anInt8178) {
			local137 = this.aFloatArrayArray12[arg3 + 1][arg4 + 1];
			local128 = this.aFloatArrayArray11[arg3 + 1][arg4 + 1];
			local119 = this.aFloatArrayArray10[arg3 + 1][arg4 + 1];
		} else if (arg0 == 0 && this.aClass139_Sub2_3.anInt8178 == arg2) {
			local137 = this.aFloatArrayArray12[arg3][arg4 + 1];
			local119 = this.aFloatArrayArray10[arg3][arg4 + 1];
			local128 = this.aFloatArrayArray11[arg3][arg4 + 1];
		} else {
			local202 = (float) arg0 / (float) this.aClass139_Sub2_3.anInt8178;
			local210 = (float) arg2 / (float) this.aClass139_Sub2_3.anInt8178;
			local217 = this.aFloatArrayArray10[arg3][arg4];
			local224 = this.aFloatArrayArray11[arg3][arg4];
			local231 = this.aFloatArrayArray12[arg3][arg4];
			local240 = this.aFloatArrayArray10[arg3 + 1][arg4];
			local249 = this.aFloatArrayArray11[arg3 + 1][arg4];
			local258 = this.aFloatArrayArray12[arg3 + 1][arg4];
			@Pc(276) float local276 = local240 + (this.aFloatArrayArray10[arg3 + 1][arg4 + 1] - local240) * local202;
			@Pc(291) float local291 = local224 + local202 * (this.aFloatArrayArray11[arg3][arg4 + 1] - local224);
			@Pc(309) float local309 = local249 + (this.aFloatArrayArray11[arg3 + 1][arg4 + 1] - local249) * local202;
			@Pc(325) float local325 = local217 + local202 * (this.aFloatArrayArray10[arg3][arg4 + 1] - local217);
			@Pc(340) float local340 = local231 + local202 * (this.aFloatArrayArray12[arg3][arg4 + 1] - local231);
			local128 = local291 + local210 * (local309 - local291);
			local119 = local325 + (local276 - local325) * local210;
			@Pc(376) float local376 = local258 + (this.aFloatArrayArray12[arg3 + 1][arg4 + 1] - local258) * local202;
			local137 = (local376 - local340) * local210 + local340;
		}
		local202 = this.aClass3_Sub22_3.method6731() - local16;
		local210 = this.aClass3_Sub22_3.method6728() - local33;
		local217 = this.aClass3_Sub22_3.method6725() - local24;
		local224 = (float) Math.sqrt((double) (local217 * local217 + local202 * local202 + local210 * local210));
		local231 = 1.0F / local224;
		local202 *= local231;
		local210 *= local231;
		local217 *= local231;
		local240 = local224 / (float) this.aClass3_Sub22_3.method6729();
		local249 = 1.0F - local240 * local240;
		if (local249 < 0.0F) {
			local249 = 0.0F;
		}
		local258 = local119 * local202 + local210 * local128 + local217 * local137;
		if (local258 < 0.0F) {
			local258 = 0.0F;
		}
		@Pc(544) float local544 = local249 * local258 * 2.0F;
		if (local544 > 1.0F) {
			local544 = 1.0F;
		}
		@Pc(555) int local555 = this.aClass3_Sub22_3.method6724();
		@Pc(565) int local565 = (int) (local544 * (float) (local555 >> 16 & 0xFF));
		if (local565 > 255) {
			local565 = 255;
		}
		@Pc(582) int local582 = (int) (local544 * (float) (local555 >> 8 & 0xFF));
		if (local582 > 255) {
			local582 = 255;
		}
		@Pc(597) int local597 = (int) ((float) (local555 & 0xFF) * local544);
		if (local597 > 255) {
			local597 = 255;
		}
		if (this.aClass43_Sub3_33.aBoolean671) {
			this.aClass3_Sub11_Sub2_2.method3142((float) local16);
			this.aClass3_Sub11_Sub2_2.method3142((float) local33);
			this.aClass3_Sub11_Sub2_2.method3142((float) local24);
		} else {
			this.aClass3_Sub11_Sub2_2.method3143((float) local16);
			this.aClass3_Sub11_Sub2_2.method3143((float) local33);
			this.aClass3_Sub11_Sub2_2.method3143((float) local24);
		}
		this.aClass3_Sub11_Sub2_2.method3079(local565);
		this.aClass3_Sub11_Sub2_2.method3079(local582);
		this.aClass3_Sub11_Sub2_2.method3079(local597);
		this.aClass3_Sub11_Sub2_2.method3079(255);
		this.method6031(local80);
	}
}
