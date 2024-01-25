import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eo")
public final class Class2_Sub12 extends Class2 {

	@OriginalMember(owner = "client!eo", name = "r", descriptor = "I")
	private int anInt1567;

	@OriginalMember(owner = "client!eo", name = "C", descriptor = "I")
	private int anInt1571;

	@OriginalMember(owner = "client!eo", name = "B", descriptor = "Lclient!rc;")
	private final Class2_Sub14 aClass2_Sub14_1;

	@OriginalMember(owner = "client!eo", name = "D", descriptor = "Lclient!ch;")
	private final Class33_Sub1 aClass33_Sub1_2;

	@OriginalMember(owner = "client!eo", name = "x", descriptor = "Lclient!qi;")
	private final Class82_Sub2 aClass82_Sub2_14;

	@OriginalMember(owner = "client!eo", name = "G", descriptor = "I")
	private final int anInt1572;

	@OriginalMember(owner = "client!eo", name = "u", descriptor = "I")
	private final int anInt1568;

	@OriginalMember(owner = "client!eo", name = "w", descriptor = "I")
	private final int anInt1569;

	@OriginalMember(owner = "client!eo", name = "z", descriptor = "I")
	private final int anInt1570;

	@OriginalMember(owner = "client!eo", name = "E", descriptor = "[[F")
	private float[][] aFloatArrayArray5;

	@OriginalMember(owner = "client!eo", name = "F", descriptor = "[[F")
	private float[][] aFloatArrayArray6;

	@OriginalMember(owner = "client!eo", name = "v", descriptor = "[[F")
	private float[][] aFloatArrayArray4;

	@OriginalMember(owner = "client!eo", name = "s", descriptor = "Lclient!la;")
	private final Interface7 anInterface7_2;

	@OriginalMember(owner = "client!eo", name = "A", descriptor = "Lclient!uk;")
	private final Class229 aClass229_6;

	@OriginalMember(owner = "client!eo", name = "p", descriptor = "Lclient!uk;")
	private final Class229 aClass229_5;

	@OriginalMember(owner = "client!eo", name = "y", descriptor = "Lclient!hm;")
	private final Interface3 anInterface3_1;

	@OriginalMember(owner = "client!eo", name = "q", descriptor = "Lclient!lk;")
	private Class2_Sub13 aClass2_Sub13_7;

	@OriginalMember(owner = "client!eo", name = "t", descriptor = "Lclient!fi;")
	private Class2_Sub13_Sub1 aClass2_Sub13_Sub1_1;

	@OriginalMember(owner = "client!eo", name = "o", descriptor = "Lclient!sq;")
	private Class214 aClass214_9;

	@OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(Lclient!qi;Lclient!ch;Lclient!rc;[I)V")
	public Class2_Sub12(@OriginalArg(0) Class82_Sub2 arg0, @OriginalArg(1) Class33_Sub1 arg1, @OriginalArg(2) Class2_Sub14 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass2_Sub14_1 = arg2;
		this.aClass33_Sub1_2 = arg1;
		this.aClass82_Sub2_14 = arg0;
		@Pc(19) int local19 = this.aClass2_Sub14_1.anInt2166 - (arg1.anInt753 >> 1);
		this.anInt1572 = this.aClass2_Sub14_1.anInt2170 - local19 >> arg1.anInt750;
		this.anInt1568 = local19 + this.aClass2_Sub14_1.anInt2170 >> arg1.anInt750;
		this.anInt1569 = this.aClass2_Sub14_1.anInt2167 - local19 >> arg1.anInt750;
		this.anInt1570 = this.aClass2_Sub14_1.anInt2167 + local19 >> arg1.anInt750;
		@Pc(69) int local69 = this.anInt1568 + 1 - this.anInt1572;
		@Pc(77) int local77 = this.anInt1570 + 1 - this.anInt1569;
		this.aFloatArrayArray5 = new float[local69 + 1][local77 + 1];
		this.aFloatArrayArray6 = new float[local69 + 1][local77 + 1];
		this.aFloatArrayArray4 = new float[local69 + 1][local77 + 1];
		@Pc(106) int local106;
		@Pc(119) int local119;
		@Pc(132) int local132;
		@Pc(140) int local140;
		@Pc(165) int local165;
		@Pc(180) int local180;
		for (local106 = 0; local106 <= local77; local106++) {
			local119 = local106 + this.anInt1569;
			if (local119 > 0 && local119 < this.aClass33_Sub1_2.anInt4626 - 1) {
				for (local132 = 0; local132 <= local69; local132++) {
					local140 = this.anInt1572 + local132;
					if (local140 > 0 && local140 < this.aClass33_Sub1_2.anInt4627 - 1) {
						local165 = arg1.method4057(local140 + 1, local119) - arg1.method4057(local140 - 1, local119);
						local180 = arg1.method4057(local140, local119 + 1) - arg1.method4057(local140, local119 - 1);
						@Pc(196) float local196 = (float) (1.0D / Math.sqrt((double) (local165 * local165 + local180 * local180 + 65536)));
						this.aFloatArrayArray5[local132][local106] = (float) local165 * local196;
						this.aFloatArrayArray6[local132][local106] = local196 * -256.0F;
						this.aFloatArrayArray4[local132][local106] = local196 * (float) local180;
					}
				}
			}
		}
		local106 = 0;
		local119 = 0;
		for (local132 = this.anInt1569; local132 <= this.anInt1570; local132++) {
			if (local132 >= 0 && arg1.anInt4626 > local132) {
				for (local140 = this.anInt1572; local140 <= this.anInt1568; local140++) {
					if (local140 >= 0 && local140 < arg1.anInt4627) {
						local165 = arg3[local119];
						@Pc(294) int[] local294 = arg1.anIntArrayArrayArray4[local140][local132];
						if (local294 != null && local165 != 0) {
							if (local165 == 1) {
								local106 += local294.length;
							} else {
								local106 += 3;
							}
						}
					}
					local119++;
				}
			} else {
				local119 += this.anInt1568 - this.anInt1572;
			}
		}
		if (local106 <= 0) {
			this.anInterface7_2 = null;
			this.aClass229_6 = null;
			this.aClass229_5 = null;
			this.anInterface3_1 = null;
		} else {
			this.aClass2_Sub13_7 = new Class2_Sub13(local106 * 2);
			this.aClass2_Sub13_Sub1_1 = new Class2_Sub13_Sub1(local106 * 16);
			this.aClass214_9 = new Class214(Static353.method5359(local106));
			local119 = 0;
			local132 = 0;
			for (local140 = this.anInt1569; local140 <= this.anInt1570; local140++) {
				if (local140 >= 0 && local140 < arg1.anInt4626) {
					local165 = 0;
					for (local180 = this.anInt1572; local180 <= this.anInt1568; local180++) {
						if (local180 >= 0 && local180 < arg1.anInt4627) {
							@Pc(426) int local426 = arg3[local119];
							@Pc(433) int[] local433 = arg1.anIntArrayArrayArray4[local180][local140];
							@Pc(440) int[] local440 = arg1.anIntArrayArrayArray7[local180][local140];
							if (local433 != null && local426 != 0) {
								if (local426 == 1) {
									for (@Pc(453) int local453 = 0; local453 < local433.length; local453++) {
										this.method1465(local180, local165, local440[local453], local132, local433[local453], local140);
									}
								} else if (local426 == 3) {
									this.method1465(local180, local165, 0, local132, 0, local140);
									this.method1465(local180, local165, 0, local132, arg1.anInt753, local140);
									this.method1465(local180, local165, arg1.anInt753, local132, 0, local140);
								} else if (local426 == 2) {
									this.method1465(local180, local165, 0, local132, arg1.anInt753, local140);
									this.method1465(local180, local165, arg1.anInt753, local132, arg1.anInt753, local140);
									this.method1465(local180, local165, 0, local132, 0, local140);
								} else if (local426 == 5) {
									this.method1465(local180, local165, arg1.anInt753, local132, arg1.anInt753, local140);
									this.method1465(local180, local165, arg1.anInt753, local132, 0, local140);
									this.method1465(local180, local165, 0, local132, arg1.anInt753, local140);
								} else if (local426 == 4) {
									this.method1465(local180, local165, arg1.anInt753, local132, 0, local140);
									this.method1465(local180, local165, 0, local132, 0, local140);
									this.method1465(local180, local165, arg1.anInt753, local132, arg1.anInt753, local140);
								}
							}
						}
						local119++;
						local165++;
					}
				} else {
					local119 += this.anInt1568 - this.anInt1572;
				}
				local132++;
			}
			this.anInterface3_1 = this.aClass82_Sub2_14.method4567(this.aClass2_Sub13_7.aByteArray77, this.aClass2_Sub13_7.anInt4788, false);
			this.anInterface7_2 = this.aClass82_Sub2_14.method4610(16, this.aClass2_Sub13_Sub1_1.aByteArray77, this.aClass2_Sub13_Sub1_1.anInt4788, false);
			this.aClass229_6 = new Class229(this.aClass82_Sub2_14, this.anInterface7_2, 5126, 3, 0);
			this.aClass229_5 = new Class229(this.aClass82_Sub2_14, this.anInterface7_2, 5121, 4, 12);
		}
		this.aFloatArrayArray5 = this.aFloatArrayArray6 = this.aFloatArrayArray4 = null;
		this.aClass2_Sub13_Sub1_1 = null;
		this.aClass214_9 = null;
		this.aClass2_Sub13_7 = null;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(BS)V")
	private void method1463(@OriginalArg(1) short arg0) {
		if (this.aClass82_Sub2_14.aBoolean403) {
			this.aClass2_Sub13_7.method4199(arg0);
		} else {
			this.aClass2_Sub13_7.method4243(arg0);
		}
		this.anInt1571++;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(II[[ZIB)V")
	public void method1464(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean[][] arg2, @OriginalArg(3) int arg3) {
		if (this.anInterface3_1 == null || (arg3 + arg1 < this.anInt1572 || (this.anInt1568 < arg3 - arg1 || (this.anInt1569 > arg1 + arg0 || arg0 - arg1 > this.anInt1570)))) {
			return;
		}
		for (@Pc(58) int local58 = this.anInt1569; local58 <= this.anInt1570; local58++) {
			for (@Pc(69) int local69 = this.anInt1572; local69 <= this.anInt1568; local69++) {
				@Pc(82) int local82 = local69 - arg3;
				@Pc(87) int local87 = local58 - arg0;
				if (local82 > -arg1 && local82 < arg1 && local87 > -arg1 && arg1 > local87 && arg2[arg1 + local82][local87 + arg1]) {
					this.aClass82_Sub2_14.method4571((int) (this.aClass2_Sub14_1.aFloat25 * 255.0F) << 24);
					this.aClass82_Sub2_14.method4580(this.aClass229_6, null, this.aClass229_5, null);
					this.aClass82_Sub2_14.method4595(this.anInterface3_1, 0, this.anInt1571);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIIIBII)V")
	private void method1465(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(1) long local1 = -1L;
		@Pc(9) int local9 = (arg0 << this.aClass33_Sub1_2.anInt750) + arg4;
		@Pc(17) int local17 = arg2 + (arg5 << this.aClass33_Sub1_2.anInt750);
		@Pc(23) int local23 = this.aClass33_Sub1_2.method4055(local9, local17);
		if ((arg4 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
			local1 = (long) local9 & 0xFFFFL | ((long) local17 & 0xFFFFL) << 16;
			@Pc(54) Class2 local54 = this.aClass214_9.method5059(local1);
			if (local54 != null) {
				this.method1463(((Class2_Sub30) local54).aShort67);
				return;
			}
		}
		@Pc(73) short local73 = (short) this.anInt1567++;
		if (local1 != -1L) {
			this.aClass214_9.method5065(local1, new Class2_Sub30(local73));
		}
		@Pc(116) float local116;
		@Pc(123) float local123;
		@Pc(130) float local130;
		@Pc(241) float local241;
		@Pc(249) float local249;
		@Pc(256) float local256;
		@Pc(263) float local263;
		@Pc(270) float local270;
		@Pc(279) float local279;
		@Pc(288) float local288;
		@Pc(378) float local378;
		if (arg4 == 0 && arg2 == 0) {
			local116 = this.aFloatArrayArray5[arg1][arg3];
			local123 = this.aFloatArrayArray6[arg1][arg3];
			local130 = this.aFloatArrayArray4[arg1][arg3];
		} else if (this.aClass33_Sub1_2.anInt753 == arg4 && arg2 == 0) {
			local116 = this.aFloatArrayArray5[arg1 + 1][arg3];
			local130 = this.aFloatArrayArray4[arg1 + 1][arg3];
			local123 = this.aFloatArrayArray6[arg1 + 1][arg3];
		} else if (this.aClass33_Sub1_2.anInt753 == arg4 && this.aClass33_Sub1_2.anInt753 == arg2) {
			local123 = this.aFloatArrayArray6[arg1 + 1][arg3 + 1];
			local116 = this.aFloatArrayArray5[arg1 + 1][arg3 + 1];
			local130 = this.aFloatArrayArray4[arg1 + 1][arg3 + 1];
		} else if (arg4 == 0 && arg2 == this.aClass33_Sub1_2.anInt753) {
			local130 = this.aFloatArrayArray4[arg1][arg3 + 1];
			local123 = this.aFloatArrayArray6[arg1][arg3 + 1];
			local116 = this.aFloatArrayArray5[arg1][arg3 + 1];
		} else {
			local241 = (float) arg4 / (float) this.aClass33_Sub1_2.anInt753;
			local249 = (float) arg2 / (float) this.aClass33_Sub1_2.anInt753;
			local256 = this.aFloatArrayArray5[arg1][arg3];
			local263 = this.aFloatArrayArray6[arg1][arg3];
			local270 = this.aFloatArrayArray4[arg1][arg3];
			local279 = this.aFloatArrayArray5[arg1 + 1][arg3];
			local288 = this.aFloatArrayArray6[arg1 + 1][arg3];
			@Pc(305) float local305 = local279 + (this.aFloatArrayArray5[arg1 + 1][arg3 + 1] - local279) * local241;
			@Pc(321) float local321 = local270 + local241 * (this.aFloatArrayArray4[arg1][arg3 + 1] - local270);
			@Pc(337) float local337 = local263 + local241 * (this.aFloatArrayArray6[arg1][arg3 + 1] - local263);
			@Pc(352) float local352 = local256 + local241 * (this.aFloatArrayArray5[arg1][arg3 + 1] - local256);
			@Pc(369) float local369 = local288 + (this.aFloatArrayArray6[arg1 + 1][arg3 + 1] - local288) * local241;
			local378 = this.aFloatArrayArray4[arg1 + 1][arg3];
			local116 = local249 * (local305 - local352) + local352;
			local123 = (local369 - local337) * local249 + local337;
			@Pc(414) float local414 = local378 + (this.aFloatArrayArray4[arg1 + 1][arg3 + 1] - local378) * local241;
			local130 = (local414 - local321) * local249 + local321;
		}
		local241 = this.aClass2_Sub14_1.anInt2170 - local9;
		local249 = this.aClass2_Sub14_1.anInt2165 - local23;
		local256 = this.aClass2_Sub14_1.anInt2167 - local17;
		local263 = (float) Math.sqrt((double) (local241 * local241 + local249 * local249 + local256 * local256));
		local270 = 1.0F / local263;
		local249 *= local270;
		local241 *= local270;
		local256 *= local270;
		local279 = local263 / (float) this.aClass2_Sub14_1.anInt2166;
		local288 = 1.0F - local279 * local279;
		if (local288 < 0.0F) {
			local288 = 0.0F;
		}
		local378 = local256 * local130 + local123 * local249 + local116 * local241;
		if (local378 < 0.0F) {
			local378 = 0.0F;
		}
		@Pc(549) float local549 = local288 * 2.0F * local378;
		if (local549 > 1.0F) {
			local549 = 1.0F;
		}
		@Pc(559) int local559 = this.aClass2_Sub14_1.anInt2172;
		@Pc(569) int local569 = (int) ((float) (local559 >> 16 & 0xFF) * local549);
		if (local569 > 255) {
			local569 = 255;
		}
		@Pc(585) int local585 = (int) (local549 * (float) (local559 >> 8 & 0xFF));
		if (local585 > 255) {
			local585 = 255;
		}
		@Pc(599) int local599 = (int) (local549 * (float) (local559 & 0xFF));
		if (this.aClass82_Sub2_14.aBoolean403) {
			this.aClass2_Sub13_Sub1_1.method1757((float) local9);
			this.aClass2_Sub13_Sub1_1.method1757((float) local23);
			this.aClass2_Sub13_Sub1_1.method1757((float) local17);
		} else {
			this.aClass2_Sub13_Sub1_1.method1756((float) local9);
			this.aClass2_Sub13_Sub1_1.method1756((float) local23);
			this.aClass2_Sub13_Sub1_1.method1756((float) local17);
		}
		if (local599 > 255) {
			local599 = 255;
		}
		this.aClass2_Sub13_Sub1_1.method4207(local569);
		this.aClass2_Sub13_Sub1_1.method4207(local585);
		this.aClass2_Sub13_Sub1_1.method4207(local599);
		this.aClass2_Sub13_Sub1_1.method4207(255);
		this.method1463(local73);
	}
}
