import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sp")
public final class Class2_Sub42 extends Class2 {

	@OriginalMember(owner = "client!sp", name = "j", descriptor = "I")
	private int anInt8068;

	@OriginalMember(owner = "client!sp", name = "F", descriptor = "I")
	private int anInt8076;

	@OriginalMember(owner = "client!sp", name = "w", descriptor = "Lclient!nba;")
	private final Class75_Sub3 aClass75_Sub3_3;

	@OriginalMember(owner = "client!sp", name = "s", descriptor = "Lclient!at;")
	private final Class2_Sub5 aClass2_Sub5_3;

	@OriginalMember(owner = "client!sp", name = "u", descriptor = "Lclient!os;")
	private final Class39_Sub3 aClass39_Sub3_35;

	@OriginalMember(owner = "client!sp", name = "l", descriptor = "I")
	private final int anInt8069;

	@OriginalMember(owner = "client!sp", name = "I", descriptor = "I")
	private final int anInt8078;

	@OriginalMember(owner = "client!sp", name = "B", descriptor = "I")
	private final int anInt8075;

	@OriginalMember(owner = "client!sp", name = "x", descriptor = "I")
	private final int anInt8073;

	@OriginalMember(owner = "client!sp", name = "v", descriptor = "[[F")
	private float[][] aFloatArrayArray13;

	@OriginalMember(owner = "client!sp", name = "t", descriptor = "[[F")
	private float[][] aFloatArrayArray12;

	@OriginalMember(owner = "client!sp", name = "D", descriptor = "[[F")
	private float[][] aFloatArrayArray14;

	@OriginalMember(owner = "client!sp", name = "m", descriptor = "Lclient!af;")
	private final Class11 aClass11_15;

	@OriginalMember(owner = "client!sp", name = "k", descriptor = "Lclient!lq;")
	private final Interface10 anInterface10_7;

	@OriginalMember(owner = "client!sp", name = "i", descriptor = "Lclient!eea;")
	private final Interface5 anInterface5_4;

	@OriginalMember(owner = "client!sp", name = "E", descriptor = "Lclient!af;")
	private final Class11 aClass11_16;

	@OriginalMember(owner = "client!sp", name = "C", descriptor = "Lclient!ps;")
	private Class2_Sub29 aClass2_Sub29_8;

	@OriginalMember(owner = "client!sp", name = "J", descriptor = "Lclient!ke;")
	private Class2_Sub29_Sub1 aClass2_Sub29_Sub1_3;

	@OriginalMember(owner = "client!sp", name = "z", descriptor = "Lclient!ica;")
	private Class127 aClass127_41;

	@OriginalMember(owner = "client!sp", name = "<init>", descriptor = "(Lclient!os;Lclient!nba;Lclient!at;[I)V")
	public Class2_Sub42(@OriginalArg(0) Class39_Sub3 arg0, @OriginalArg(1) Class75_Sub3 arg1, @OriginalArg(2) Class2_Sub5 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass75_Sub3_3 = arg1;
		this.aClass2_Sub5_3 = arg2;
		this.aClass39_Sub3_35 = arg0;
		@Pc(22) int local22 = this.aClass2_Sub5_3.method1666() - (arg1.anInt7994 >> 1);
		this.anInt8069 = this.aClass2_Sub5_3.method1672() - local22 >> arg1.anInt7996;
		this.anInt8078 = this.aClass2_Sub5_3.method1672() + local22 >> arg1.anInt7996;
		this.anInt8075 = this.aClass2_Sub5_3.method1662() - local22 >> arg1.anInt7996;
		this.anInt8073 = local22 + this.aClass2_Sub5_3.method1662() >> arg1.anInt7996;
		@Pc(77) int local77 = this.anInt8078 + 1 - this.anInt8069;
		@Pc(86) int local86 = this.anInt8073 + 1 - this.anInt8075;
		this.aFloatArrayArray13 = new float[local77 + 1][local86 + 1];
		this.aFloatArrayArray12 = new float[local77 + 1][local86 + 1];
		this.aFloatArrayArray14 = new float[local77 + 1][local86 + 1];
		@Pc(122) int local122;
		@Pc(133) int local133;
		@Pc(141) int local141;
		@Pc(168) int local168;
		@Pc(183) int local183;
		for (@Pc(115) int local115 = 0; local115 <= local86; local115++) {
			local122 = local115 + this.anInt8075;
			if (local122 > 0 && this.aClass75_Sub3_3.anInt7995 - 1 > local122) {
				for (local133 = 0; local133 <= local77; local133++) {
					local141 = local133 + this.anInt8069;
					if (local141 > 0 && this.aClass75_Sub3_3.anInt7998 - 1 > local141) {
						local168 = arg1.ba(local141 + 1, local122) - arg1.ba(local141 - 1, local122);
						local183 = arg1.ba(local141, local122 + 1) - arg1.ba(local141, local122 - 1);
						@Pc(198) float local198 = (float) (1.0D / Math.sqrt((double) (local183 * local183 + local168 * local168 + 65536)));
						this.aFloatArrayArray12[local133][local115] = (float) local168 * local198;
						this.aFloatArrayArray13[local133][local115] = -256.0F * local198;
						this.aFloatArrayArray14[local133][local115] = (float) local183 * local198;
					}
				}
			}
		}
		local122 = 0;
		local133 = 0;
		for (local141 = this.anInt8075; local141 <= this.anInt8073; local141++) {
			if (local141 >= 0 && local141 < arg1.anInt7995) {
				for (local168 = this.anInt8069; local168 <= this.anInt8078; local168++) {
					if (local168 >= 0 && local168 < arg1.anInt7998) {
						local183 = arg3[local133];
						@Pc(272) int[] local272 = arg1.anIntArrayArrayArray16[local168][local141];
						if (local272 != null && local183 != 0) {
							if (local183 == 1) {
								local122 += local272.length;
							} else {
								local122 += 3;
							}
						}
					}
					local133++;
				}
			} else {
				local133 += this.anInt8078 - this.anInt8069;
			}
		}
		if (local122 <= 0) {
			this.aClass11_15 = null;
			this.anInterface10_7 = null;
			this.anInterface5_4 = null;
			this.aClass11_16 = null;
		} else {
			this.aClass2_Sub29_8 = new Class2_Sub29(local122 * 2);
			this.aClass2_Sub29_Sub1_3 = new Class2_Sub29_Sub1(local122 * 16);
			this.aClass127_41 = new Class127(Static131.method2413(local122));
			local133 = 0;
			local168 = 0;
			for (local183 = this.anInt8075; local183 <= this.anInt8073; local183++) {
				if (local183 >= 0 && local183 < arg1.anInt7995) {
					@Pc(372) int local372 = 0;
					for (@Pc(375) int local375 = this.anInt8069; local375 <= this.anInt8078; local375++) {
						if (local375 >= 0 && local375 < arg1.anInt7998) {
							@Pc(391) int local391 = arg3[local133];
							@Pc(398) int[] local398 = arg1.anIntArrayArrayArray16[local375][local183];
							@Pc(405) int[] local405 = arg1.anIntArrayArrayArray14[local375][local183];
							if (local398 != null && local391 != 0) {
								if (local391 == 1) {
									for (@Pc(414) int local414 = 0; local414 < local398.length; local414++) {
										this.method6757(local372, local398[local414], local168, local183, local375, local405[local414]);
									}
								} else if (local391 == 3) {
									this.method6757(local372, 0, local168, local183, local375, 0);
									this.method6757(local372, arg1.anInt7994, local168, local183, local375, 0);
									this.method6757(local372, 0, local168, local183, local375, arg1.anInt7994);
								} else if (local391 == 2) {
									this.method6757(local372, arg1.anInt7994, local168, local183, local375, 0);
									this.method6757(local372, arg1.anInt7994, local168, local183, local375, arg1.anInt7994);
									this.method6757(local372, 0, local168, local183, local375, 0);
								} else if (local391 == 5) {
									this.method6757(local372, arg1.anInt7994, local168, local183, local375, arg1.anInt7994);
									this.method6757(local372, 0, local168, local183, local375, arg1.anInt7994);
									this.method6757(local372, arg1.anInt7994, local168, local183, local375, 0);
								} else if (local391 == 4) {
									this.method6757(local372, 0, local168, local183, local375, arg1.anInt7994);
									this.method6757(local372, 0, local168, local183, local375, 0);
									this.method6757(local372, arg1.anInt7994, local168, local183, local375, arg1.anInt7994);
								}
							}
						}
						local372++;
						local133++;
					}
				} else {
					local133 += this.anInt8078 - this.anInt8069;
				}
				local168++;
			}
			this.anInterface5_4 = this.aClass39_Sub3_35.method5733(this.aClass2_Sub29_8.anInt6132, this.aClass2_Sub29_8.aByteArray96, false);
			this.anInterface10_7 = this.aClass39_Sub3_35.method5689(this.aClass2_Sub29_Sub1_3.anInt6132, this.aClass2_Sub29_Sub1_3.aByteArray96, 16, false);
			this.aClass11_16 = new Class11(this.anInterface10_7, 5126, 3, 0);
			this.aClass11_15 = new Class11(this.anInterface10_7, 5121, 4, 12);
		}
		this.aClass127_41 = null;
		this.aClass2_Sub29_Sub1_3 = null;
		this.aFloatArrayArray12 = this.aFloatArrayArray13 = this.aFloatArrayArray14 = null;
		this.aClass2_Sub29_8 = null;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(BS)V")
	private void method6755(@OriginalArg(1) short arg0) {
		if (this.aClass39_Sub3_35.aBoolean485) {
			this.aClass2_Sub29_8.method5217(arg0);
		} else {
			this.aClass2_Sub29_8.method5199(arg0);
		}
		this.anInt8076++;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(IIBI[[Z)V")
	public void method6756(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean[][] arg3) {
		if (this.anInterface5_4 == null || (this.anInt8069 > arg0 + arg2 || (this.anInt8078 < arg2 - arg0 || (this.anInt8075 > arg1 + arg0 || arg1 - arg0 > this.anInt8073)))) {
			return;
		}
		for (@Pc(53) int local53 = this.anInt8075; local53 <= this.anInt8073; local53++) {
			for (@Pc(58) int local58 = this.anInt8069; local58 <= this.anInt8078; local58++) {
				@Pc(65) int local65 = local58 - arg2;
				@Pc(70) int local70 = local53 - arg1;
				if (local65 > -arg0 && arg0 > local65 && -arg0 < local70 && arg0 > local70 && arg3[local65 + arg0][local70 + arg0]) {
					this.aClass39_Sub3_35.method5751((int) (this.aClass2_Sub5_3.method1665() * 255.0F) << 24);
					this.aClass39_Sub3_35.method5754(this.aClass11_16, this.aClass11_15, null, null);
					this.aClass39_Sub3_35.method5755(this.anInterface5_4, this.anInt8076, 0);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(IIIBIII)V")
	private void method6757(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(15) int local15 = (arg4 << this.aClass75_Sub3_3.anInt7996) + arg1;
		@Pc(23) int local23 = (arg3 << this.aClass75_Sub3_3.anInt7996) + arg5;
		@Pc(29) int local29 = this.aClass75_Sub3_3.aa(local15, local23);
		if ((arg1 & 0x7F) == 0 || (arg5 & 0x7F) == 0) {
			local7 = ((long) local23 & 0xFFFFL) << 16 | (long) local15 & 0xFFFFL;
			@Pc(58) Class2 local58 = this.aClass127_41.method3205(local7);
			if (local58 != null) {
				this.method6755(((Class2_Sub15) local58).aShort24);
				return;
			}
		}
		@Pc(84) short local84 = (short) this.anInt8068++;
		if (local7 != -1L) {
			this.aClass127_41.method3213(new Class2_Sub15(local84), local7);
		}
		@Pc(125) float local125;
		@Pc(111) float local111;
		@Pc(118) float local118;
		@Pc(167) float local167;
		@Pc(175) float local175;
		@Pc(182) float local182;
		@Pc(189) float local189;
		@Pc(196) float local196;
		@Pc(205) float local205;
		@Pc(214) float local214;
		@Pc(289) float local289;
		if (arg1 == 0 && arg5 == 0) {
			local111 = this.aFloatArrayArray13[arg0][arg2];
			local118 = this.aFloatArrayArray14[arg0][arg2];
			local125 = this.aFloatArrayArray12[arg0][arg2];
		} else if (arg1 == this.aClass75_Sub3_3.anInt7994 && arg5 == 0) {
			local118 = this.aFloatArrayArray14[arg0 + 1][arg2];
			local125 = this.aFloatArrayArray12[arg0 + 1][arg2];
			local111 = this.aFloatArrayArray13[arg0 + 1][arg2];
		} else if (arg1 == this.aClass75_Sub3_3.anInt7994 && this.aClass75_Sub3_3.anInt7994 == arg5) {
			local125 = this.aFloatArrayArray12[arg0 + 1][arg2 + 1];
			local111 = this.aFloatArrayArray13[arg0 + 1][arg2 + 1];
			local118 = this.aFloatArrayArray14[arg0 + 1][arg2 + 1];
		} else if (arg1 == 0 && arg5 == this.aClass75_Sub3_3.anInt7994) {
			local111 = this.aFloatArrayArray13[arg0][arg2 + 1];
			local118 = this.aFloatArrayArray14[arg0][arg2 + 1];
			local125 = this.aFloatArrayArray12[arg0][arg2 + 1];
		} else {
			local167 = (float) arg1 / (float) this.aClass75_Sub3_3.anInt7994;
			local175 = (float) arg5 / (float) this.aClass75_Sub3_3.anInt7994;
			local182 = this.aFloatArrayArray12[arg0][arg2];
			local189 = this.aFloatArrayArray13[arg0][arg2];
			local196 = this.aFloatArrayArray14[arg0][arg2];
			local205 = this.aFloatArrayArray12[arg0 + 1][arg2];
			local214 = this.aFloatArrayArray13[arg0 + 1][arg2];
			@Pc(229) float local229 = local189 + (this.aFloatArrayArray13[arg0][arg2 + 1] - local189) * local167;
			@Pc(247) float local247 = local214 + local167 * (this.aFloatArrayArray13[arg0 + 1][arg2 + 1] - local214);
			@Pc(265) float local265 = local205 + local167 * (this.aFloatArrayArray12[arg0 + 1][arg2 + 1] - local205);
			@Pc(280) float local280 = local182 + (this.aFloatArrayArray12[arg0][arg2 + 1] - local182) * local167;
			local289 = this.aFloatArrayArray14[arg0 + 1][arg2];
			@Pc(305) float local305 = local196 + local167 * (this.aFloatArrayArray14[arg0][arg2 + 1] - local196);
			local111 = local175 * (local247 - local229) + local229;
			@Pc(332) float local332 = local289 + local167 * (this.aFloatArrayArray14[arg0 + 1][arg2 + 1] - local289);
			local125 = (local265 - local280) * local175 + local280;
			local118 = local175 * (local332 - local305) + local305;
		}
		local167 = this.aClass2_Sub5_3.method1672() - local15;
		local175 = this.aClass2_Sub5_3.method1671() - local29;
		local182 = this.aClass2_Sub5_3.method1662() - local23;
		local189 = (float) Math.sqrt((double) (local182 * local182 + local175 * local175 + local167 * local167));
		local196 = 1.0F / local189;
		local167 *= local196;
		local182 *= local196;
		local175 *= local196;
		local205 = local189 / (float) this.aClass2_Sub5_3.method1666();
		local214 = 1.0F - local205 * local205;
		if (local214 < 0.0F) {
			local214 = 0.0F;
		}
		local289 = local118 * local182 + local111 * local175 + local125 * local167;
		if (local289 < 0.0F) {
			local289 = 0.0F;
		}
		@Pc(544) float local544 = local289 * local214 * 2.0F;
		if (local544 > 1.0F) {
			local544 = 1.0F;
		}
		@Pc(555) int local555 = this.aClass2_Sub5_3.method1669();
		@Pc(565) int local565 = (int) (local544 * (float) (local555 >> 16 & 0xFF));
		if (local565 > 255) {
			local565 = 255;
		}
		@Pc(580) int local580 = (int) (local544 * (float) (local555 >> 8 & 0xFF));
		if (local580 > 255) {
			local580 = 255;
		}
		@Pc(593) int local593 = (int) ((float) (local555 & 0xFF) * local544);
		if (local593 > 255) {
			local593 = 255;
		}
		if (this.aClass39_Sub3_35.aBoolean485) {
			this.aClass2_Sub29_Sub1_3.method3899((float) local15);
			this.aClass2_Sub29_Sub1_3.method3899((float) local29);
			this.aClass2_Sub29_Sub1_3.method3899((float) local23);
		} else {
			this.aClass2_Sub29_Sub1_3.method3902((float) local15);
			this.aClass2_Sub29_Sub1_3.method3902((float) local29);
			this.aClass2_Sub29_Sub1_3.method3902((float) local23);
		}
		this.aClass2_Sub29_Sub1_3.method5172(local565);
		this.aClass2_Sub29_Sub1_3.method5172(local580);
		this.aClass2_Sub29_Sub1_3.method5172(local593);
		this.aClass2_Sub29_Sub1_3.method5172(255);
		this.method6755(local84);
	}
}
