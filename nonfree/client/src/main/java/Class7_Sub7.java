import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eh")
public final class Class7_Sub7 extends Class7 {

	@OriginalMember(owner = "client!eh", name = "m", descriptor = "I")
	private int anInt1754;

	@OriginalMember(owner = "client!eh", name = "C", descriptor = "I")
	private int anInt1758;

	@OriginalMember(owner = "client!eh", name = "u", descriptor = "Lclient!ag;")
	private final Class8_Sub1 aClass8_Sub1_2;

	@OriginalMember(owner = "client!eh", name = "q", descriptor = "Lclient!j;")
	private final Class7_Sub16 aClass7_Sub16_1;

	@OriginalMember(owner = "client!eh", name = "A", descriptor = "Lclient!hd;")
	private final Class89_Sub1 aClass89_Sub1_13;

	@OriginalMember(owner = "client!eh", name = "l", descriptor = "I")
	private final int anInt1753;

	@OriginalMember(owner = "client!eh", name = "x", descriptor = "I")
	private final int anInt1757;

	@OriginalMember(owner = "client!eh", name = "v", descriptor = "I")
	private final int anInt1756;

	@OriginalMember(owner = "client!eh", name = "n", descriptor = "I")
	private final int anInt1755;

	@OriginalMember(owner = "client!eh", name = "p", descriptor = "[[F")
	private float[][] aFloatArrayArray5;

	@OriginalMember(owner = "client!eh", name = "y", descriptor = "[[F")
	private float[][] aFloatArrayArray6;

	@OriginalMember(owner = "client!eh", name = "o", descriptor = "[[F")
	private float[][] aFloatArrayArray4;

	@OriginalMember(owner = "client!eh", name = "z", descriptor = "Lclient!ap;")
	private Class7_Sub3 aClass7_Sub3_3;

	@OriginalMember(owner = "client!eh", name = "t", descriptor = "Lclient!fb;")
	private Class7_Sub3_Sub1 aClass7_Sub3_Sub1_2;

	@OriginalMember(owner = "client!eh", name = "r", descriptor = "Lclient!aj;")
	private Class10 aClass10_17;

	@OriginalMember(owner = "client!eh", name = "D", descriptor = "Lclient!ui;")
	private final Interface9 anInterface9_1;

	@OriginalMember(owner = "client!eh", name = "s", descriptor = "Lclient!hk;")
	private final Interface3 anInterface3_3;

	@OriginalMember(owner = "client!eh", name = "w", descriptor = "Lclient!rs;")
	private final Class181 aClass181_9;

	@OriginalMember(owner = "client!eh", name = "B", descriptor = "Lclient!rs;")
	private final Class181 aClass181_10;

	@OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(Lclient!hd;Lclient!ag;Lclient!j;[I)V")
	public Class7_Sub7(@OriginalArg(0) Class89_Sub1 arg0, @OriginalArg(1) Class8_Sub1 arg1, @OriginalArg(2) Class7_Sub16 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass8_Sub1_2 = arg1;
		this.aClass7_Sub16_1 = arg2;
		this.aClass89_Sub1_13 = arg0;
		@Pc(20) int local20 = this.aClass7_Sub16_1.anInt4076 - (arg1.anInt151 >> 1);
		this.anInt1753 = this.aClass7_Sub16_1.anInt4070 - local20 >> arg1.anInt147;
		this.anInt1757 = local20 + this.aClass7_Sub16_1.anInt4070 >> arg1.anInt147;
		this.anInt1756 = this.aClass7_Sub16_1.anInt4072 - local20 >> arg1.anInt147;
		this.anInt1755 = local20 + this.aClass7_Sub16_1.anInt4072 >> arg1.anInt147;
		@Pc(70) int local70 = this.anInt1757 + 1 - this.anInt1753;
		@Pc(79) int local79 = this.anInt1755 + 1 - this.anInt1756;
		this.aFloatArrayArray5 = new float[local70 + 1][local79 + 1];
		this.aFloatArrayArray6 = new float[local70 + 1][local79 + 1];
		this.aFloatArrayArray4 = new float[local70 + 1][local79 + 1];
		@Pc(108) int local108;
		@Pc(121) int local121;
		@Pc(139) int local139;
		@Pc(147) int local147;
		@Pc(179) int local179;
		@Pc(194) int local194;
		for (local108 = 0; local108 <= local79; local108++) {
			local121 = local108 + this.anInt1756;
			if (local121 > 0 && local121 < this.aClass8_Sub1_2.anInt4760 - 1) {
				for (local139 = 0; local139 <= local70; local139++) {
					local147 = this.anInt1753 + local139;
					if (local147 > 0 && local147 < this.aClass8_Sub1_2.anInt4755 - 1) {
						local179 = arg1.method4173(local147 + 1, local121) - arg1.method4173(local147 - 1, local121);
						local194 = arg1.method4173(local147, local121 + 1) - arg1.method4173(local147, local121 - 1);
						@Pc(209) float local209 = (float) (1.0D / Math.sqrt((double) (local194 * local194 + local179 * local179 + 65536)));
						this.aFloatArrayArray4[local139][local108] = local209 * (float) local179;
						this.aFloatArrayArray5[local139][local108] = local209 * -256.0F;
						this.aFloatArrayArray6[local139][local108] = local209 * (float) local194;
					}
				}
			}
		}
		local108 = 0;
		local121 = 0;
		for (local139 = this.anInt1756; local139 <= this.anInt1755; local139++) {
			if (local139 >= 0 && local139 < arg1.anInt4760) {
				for (local147 = this.anInt1753; local147 <= this.anInt1757; local147++) {
					if (local147 >= 0 && arg1.anInt4755 > local147) {
						local179 = arg3[local121];
						@Pc(304) int[] local304 = arg1.anIntArrayArrayArray3[local147][local139];
						if (local304 != null && local179 != 0) {
							if (local179 == 1) {
								local108 += local304.length;
							} else {
								local108 += 3;
							}
						}
					}
					local121++;
				}
			} else {
				local121 += this.anInt1757 - this.anInt1753;
			}
		}
		if (local108 > 0) {
			this.aClass7_Sub3_3 = new Class7_Sub3(local108 * 2);
			this.aClass7_Sub3_Sub1_2 = new Class7_Sub3_Sub1(local108 * 16);
			this.aClass10_17 = new Class10(Static271.method4522(local108));
			local139 = 0;
			local121 = 0;
			for (local147 = this.anInt1756; local147 <= this.anInt1755; local147++) {
				if (local147 >= 0 && local147 < arg1.anInt4760) {
					local179 = 0;
					for (local194 = this.anInt1753; local194 <= this.anInt1757; local194++) {
						if (local194 >= 0 && arg1.anInt4755 > local194) {
							@Pc(414) int local414 = arg3[local121];
							@Pc(421) int[] local421 = arg1.anIntArrayArrayArray3[local194][local147];
							@Pc(428) int[] local428 = arg1.anIntArrayArrayArray5[local194][local147];
							if (local421 != null && local414 != 0) {
								if (local414 == 1) {
									for (@Pc(443) int local443 = 0; local443 < local421.length; local443++) {
										this.method1399(local421[local443], local428[local443], local179, local139, local194, local147);
									}
								} else if (local414 == 3) {
									this.method1399(0, 0, local179, local139, local194, local147);
									this.method1399(arg1.anInt151, 0, local179, local139, local194, local147);
									this.method1399(0, arg1.anInt151, local179, local139, local194, local147);
								} else if (local414 == 2) {
									this.method1399(arg1.anInt151, 0, local179, local139, local194, local147);
									this.method1399(arg1.anInt151, arg1.anInt151, local179, local139, local194, local147);
									this.method1399(0, 0, local179, local139, local194, local147);
								} else if (local414 == 5) {
									this.method1399(arg1.anInt151, arg1.anInt151, local179, local139, local194, local147);
									this.method1399(0, arg1.anInt151, local179, local139, local194, local147);
									this.method1399(arg1.anInt151, 0, local179, local139, local194, local147);
								} else if (local414 == 4) {
									this.method1399(0, arg1.anInt151, local179, local139, local194, local147);
									this.method1399(0, 0, local179, local139, local194, local147);
									this.method1399(arg1.anInt151, arg1.anInt151, local179, local139, local194, local147);
								}
							}
						}
						local121++;
						local179++;
					}
				} else {
					local121 += this.anInt1757 - this.anInt1753;
				}
				local139++;
			}
			this.anInterface9_1 = this.aClass89_Sub1_13.method2408(this.aClass7_Sub3_3.aByteArray33, this.aClass7_Sub3_3.anInt3005, false);
			this.anInterface3_3 = this.aClass89_Sub1_13.method2430(16, this.aClass7_Sub3_Sub1_2.aByteArray33, this.aClass7_Sub3_Sub1_2.anInt3005, false);
			this.aClass181_9 = new Class181(this.aClass89_Sub1_13, this.anInterface3_3, 5126, 3, 0);
			this.aClass181_10 = new Class181(this.aClass89_Sub1_13, this.anInterface3_3, 5121, 4, 12);
		} else {
			this.aClass181_10 = null;
			this.anInterface9_1 = null;
			this.anInterface3_3 = null;
			this.aClass181_9 = null;
		}
		this.aFloatArrayArray4 = this.aFloatArrayArray5 = this.aFloatArrayArray6 = null;
		this.aClass7_Sub3_Sub1_2 = null;
		this.aClass10_17 = null;
		this.aClass7_Sub3_3 = null;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIIIII)V")
	private void method1399(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(1) long local1 = -1L;
		@Pc(10) int local10 = arg0 + (arg4 << this.aClass8_Sub1_2.anInt147);
		@Pc(18) int local18 = (arg5 << this.aClass8_Sub1_2.anInt147) + arg1;
		@Pc(24) int local24 = this.aClass8_Sub1_2.method4169(local10, local18);
		if ((arg0 & 0x7F) == 0 || (arg1 & 0x7F) == 0) {
			local1 = ((long) local18 & 0xFFFFL) << 16 | (long) local10 & 0xFFFFL;
			@Pc(57) Class7 local57 = this.aClass10_17.method163(local1);
			if (local57 != null) {
				this.method1401(((Class7_Sub23) local57).aShort54);
				return;
			}
		}
		@Pc(75) short local75 = (short) this.anInt1754++;
		if (local1 != -1L) {
			this.aClass10_17.method161(local1, new Class7_Sub23(local75));
		}
		@Pc(112) float local112;
		@Pc(105) float local105;
		@Pc(119) float local119;
		@Pc(222) float local222;
		@Pc(230) float local230;
		@Pc(237) float local237;
		@Pc(244) float local244;
		@Pc(251) float local251;
		@Pc(260) float local260;
		@Pc(269) float local269;
		@Pc(346) float local346;
		if (arg0 == 0 && arg1 == 0) {
			local105 = this.aFloatArrayArray5[arg2][arg3];
			local112 = this.aFloatArrayArray4[arg2][arg3];
			local119 = this.aFloatArrayArray6[arg2][arg3];
		} else if (this.aClass8_Sub1_2.anInt151 == arg0 && arg1 == 0) {
			local119 = this.aFloatArrayArray6[arg2 + 1][arg3];
			local112 = this.aFloatArrayArray4[arg2 + 1][arg3];
			local105 = this.aFloatArrayArray5[arg2 + 1][arg3];
		} else if (arg0 == this.aClass8_Sub1_2.anInt151 && this.aClass8_Sub1_2.anInt151 == arg1) {
			local105 = this.aFloatArrayArray5[arg2 + 1][arg3 + 1];
			local112 = this.aFloatArrayArray4[arg2 + 1][arg3 + 1];
			local119 = this.aFloatArrayArray6[arg2 + 1][arg3 + 1];
		} else if (arg0 == 0 && arg1 == this.aClass8_Sub1_2.anInt151) {
			local112 = this.aFloatArrayArray4[arg2][arg3 + 1];
			local105 = this.aFloatArrayArray5[arg2][arg3 + 1];
			local119 = this.aFloatArrayArray6[arg2][arg3 + 1];
		} else {
			local222 = (float) arg0 / (float) this.aClass8_Sub1_2.anInt151;
			local230 = (float) arg1 / (float) this.aClass8_Sub1_2.anInt151;
			local237 = this.aFloatArrayArray4[arg2][arg3];
			local244 = this.aFloatArrayArray5[arg2][arg3];
			local251 = this.aFloatArrayArray6[arg2][arg3];
			local260 = this.aFloatArrayArray4[arg2 + 1][arg3];
			local269 = this.aFloatArrayArray5[arg2 + 1][arg3];
			@Pc(287) float local287 = local260 + local222 * (this.aFloatArrayArray4[arg2 + 1][arg3 + 1] - local260);
			@Pc(303) float local303 = local237 + (this.aFloatArrayArray4[arg2][arg3 + 1] - local237) * local222;
			@Pc(321) float local321 = local269 + (this.aFloatArrayArray5[arg2 + 1][arg3 + 1] - local269) * local222;
			@Pc(337) float local337 = local251 + local222 * (this.aFloatArrayArray6[arg2][arg3 + 1] - local251);
			local346 = this.aFloatArrayArray6[arg2 + 1][arg3];
			@Pc(361) float local361 = local244 + (this.aFloatArrayArray5[arg2][arg3 + 1] - local244) * local222;
			@Pc(379) float local379 = local346 + local222 * (this.aFloatArrayArray6[arg2 + 1][arg3 + 1] - local346);
			local105 = local361 + local230 * (local321 - local361);
			local112 = (local287 - local303) * local230 + local303;
			local119 = local337 + (local379 - local337) * local230;
		}
		local222 = this.aClass7_Sub16_1.anInt4070 - local10;
		local230 = this.aClass7_Sub16_1.anInt4074 - local24;
		local237 = this.aClass7_Sub16_1.anInt4072 - local18;
		local244 = (float) Math.sqrt((double) (local222 * local222 + local230 * local230 + local237 * local237));
		local251 = 1.0F / local244;
		local230 *= local251;
		local237 *= local251;
		local222 *= local251;
		local260 = local244 / (float) this.aClass7_Sub16_1.anInt4076;
		local269 = 1.0F - local260 * local260;
		if (local269 < 0.0F) {
			local269 = 0.0F;
		}
		local346 = local222 * local112 + local230 * local105 + local119 * local237;
		if (local346 < 0.0F) {
			local346 = 0.0F;
		}
		@Pc(536) float local536 = local269 * local346 * 2.0F;
		if (local536 > 1.0F) {
			local536 = 1.0F;
		}
		@Pc(547) int local547 = this.aClass7_Sub16_1.anInt4075;
		@Pc(557) int local557 = (int) ((float) (local547 >> 16 & 0xFF) * local536);
		if (local557 > 255) {
			local557 = 255;
		}
		@Pc(575) int local575 = (int) ((float) (local547 >> 8 & 0xFF) * local536);
		if (local575 > 255) {
			local575 = 255;
		}
		@Pc(590) int local590 = (int) (local536 * (float) (local547 & 0xFF));
		if (this.aClass89_Sub1_13.aBoolean195) {
			this.aClass7_Sub3_Sub1_2.method1702((float) local10);
			this.aClass7_Sub3_Sub1_2.method1702((float) local24);
			this.aClass7_Sub3_Sub1_2.method1702((float) local18);
		} else {
			this.aClass7_Sub3_Sub1_2.method1703((float) local10);
			this.aClass7_Sub3_Sub1_2.method1703((float) local24);
			this.aClass7_Sub3_Sub1_2.method1703((float) local18);
		}
		if (local590 > 255) {
			local590 = 255;
		}
		this.aClass7_Sub3_Sub1_2.method2735(local557);
		this.aClass7_Sub3_Sub1_2.method2735(local575);
		this.aClass7_Sub3_Sub1_2.method2735(local590);
		this.aClass7_Sub3_Sub1_2.method2735(255);
		this.method1401(local75);
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IZII[[Z)V")
	public void method1400(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean[][] arg3) {
		if (this.anInterface9_1 == null || (this.anInt1753 > arg1 + arg0 || (arg0 - arg1 > this.anInt1757 || (this.anInt1756 > arg1 + arg2 || arg2 - arg1 > this.anInt1755)))) {
			return;
		}
		for (@Pc(48) int local48 = this.anInt1756; local48 <= this.anInt1755; local48++) {
			for (@Pc(55) int local55 = this.anInt1753; local55 <= this.anInt1757; local55++) {
				@Pc(67) int local67 = local55 - arg0;
				@Pc(72) int local72 = local48 - arg2;
				if (local67 > -arg1 && local67 < arg1 && local72 > -arg1 && arg1 > local72 && arg3[local67 + arg1][local72 + arg1]) {
					this.aClass89_Sub1_13.method2431((int) (this.aClass7_Sub16_1.aFloat55 * 255.0F) << 24);
					this.aClass89_Sub1_13.method2427(this.aClass181_9);
					this.aClass89_Sub1_13.method2467(this.aClass181_10);
					this.aClass89_Sub1_13.method2435();
					this.aClass89_Sub1_13.method2398(this.anInterface9_1, 0, this.anInt1758);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(ZS)V")
	private void method1401(@OriginalArg(1) short arg0) {
		if (this.aClass89_Sub1_13.aBoolean195) {
			this.aClass7_Sub3_3.method2788(arg0);
		} else {
			this.aClass7_Sub3_3.method2753(arg0);
		}
		this.anInt1758++;
	}
}
