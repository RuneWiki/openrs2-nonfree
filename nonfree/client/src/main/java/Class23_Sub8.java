import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vd")
public final class Class23_Sub8 extends Class23 {

	@OriginalMember(owner = "client!vd", name = "m", descriptor = "I")
	private int anInt7214;

	@OriginalMember(owner = "client!vd", name = "n", descriptor = "I")
	private int anInt7215;

	@OriginalMember(owner = "client!vd", name = "o", descriptor = "I")
	public int anInt7216;

	@OriginalMember(owner = "client!vd", name = "p", descriptor = "I")
	private int anInt7217;

	@OriginalMember(owner = "client!vd", name = "r", descriptor = "I")
	private int anInt7219;

	@OriginalMember(owner = "client!vd", name = "s", descriptor = "I")
	private int anInt7220;

	@OriginalMember(owner = "client!vd", name = "t", descriptor = "I")
	public int anInt7221;

	@OriginalMember(owner = "client!vd", name = "v", descriptor = "I")
	private int anInt7223;

	@OriginalMember(owner = "client!vd", name = "x", descriptor = "I")
	public int anInt7224;

	@OriginalMember(owner = "client!vd", name = "y", descriptor = "I")
	private int anInt7225;

	@OriginalMember(owner = "client!vd", name = "z", descriptor = "I")
	private int anInt7226;

	@OriginalMember(owner = "client!vd", name = "A", descriptor = "I")
	private int anInt7227;

	@OriginalMember(owner = "client!vd", name = "E", descriptor = "I")
	public int anInt7230;

	@OriginalMember(owner = "client!vd", name = "I", descriptor = "I")
	private int anInt7232;

	@OriginalMember(owner = "client!vd", name = "L", descriptor = "I")
	private int anInt7234;

	@OriginalMember(owner = "client!vd", name = "N", descriptor = "I")
	private int anInt7235;

	@OriginalMember(owner = "client!vd", name = "P", descriptor = "I")
	private int anInt7236;

	@OriginalMember(owner = "client!vd", name = "Q", descriptor = "I")
	private int anInt7237;

	@OriginalMember(owner = "client!vd", name = "S", descriptor = "I")
	private int anInt7239;

	@OriginalMember(owner = "client!vd", name = "T", descriptor = "I")
	private int anInt7240;

	@OriginalMember(owner = "client!vd", name = "w", descriptor = "Z")
	public boolean aBoolean489 = false;

	@OriginalMember(owner = "client!vd", name = "O", descriptor = "Z")
	private boolean aBoolean490 = false;

	@OriginalMember(owner = "client!vd", name = "F", descriptor = "I")
	private int anInt7231 = 0;

	@OriginalMember(owner = "client!vd", name = "K", descriptor = "Lclient!lq;")
	public final Class141 aClass141_2;

	@OriginalMember(owner = "client!vd", name = "G", descriptor = "J")
	private final long aLong235;

	@OriginalMember(owner = "client!vd", name = "B", descriptor = "Lclient!jg;")
	public final Class23_Sub3 aClass23_Sub3_6;

	@OriginalMember(owner = "client!vd", name = "l", descriptor = "Lclient!un;")
	public Class248 aClass248_1;

	@OriginalMember(owner = "client!vd", name = "M", descriptor = "Lclient!pw;")
	public final Class194 aClass194_9;

	@OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(Lclient!qa;Lclient!lq;Lclient!jg;J)V")
	public Class23_Sub8(@OriginalArg(0) Class167 arg0, @OriginalArg(1) Class141 arg1, @OriginalArg(2) Class23_Sub3 arg2, @OriginalArg(3) long arg3) {
		this.aClass141_2 = arg1;
		this.aLong235 = arg3;
		this.aClass23_Sub3_6 = arg2;
		this.aClass248_1 = this.aClass141_2.method3498();
		if (!arg0.method5961() && this.aClass248_1.anInt7088 != -1) {
			this.aClass248_1 = Static307.method4639(this.aClass248_1.anInt7088);
		}
		this.aClass194_9 = new Class194();
		this.anInt7231 = (int) ((double) this.anInt7231 + Math.random() * 64.0D);
		this.method5856();
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IJ)V")
	public void method5855(@OriginalArg(1) long arg0) {
		for (@Pc(11) Class23_Sub1_Sub2_Sub1 local11 = (Class23_Sub1_Sub2_Sub1) this.aClass194_9.method4577(); local11 != null; local11 = (Class23_Sub1_Sub2_Sub1) this.aClass194_9.method4580()) {
			local11.method3690(arg0);
		}
	}

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "(I)V")
	public void method5856() {
		this.anInt7240 = this.aClass141_2.anInt4129;
		this.anInt7236 = this.aClass141_2.anInt4132;
		this.anInt7220 = this.aClass141_2.anInt4139;
		this.anInt7239 = this.aClass141_2.anInt4135;
		this.anInt7237 = this.aClass141_2.anInt4123;
		this.anInt7225 = this.aClass141_2.anInt4130;
		this.anInt7226 = this.aClass141_2.anInt4128;
		this.anInt7219 = this.aClass141_2.anInt4124;
		this.anInt7234 = this.aClass141_2.anInt4138;
		if (this.anInt7240 == this.anInt7220 && this.anInt7239 == this.anInt7220 && this.anInt7237 == this.anInt7225 && this.anInt7237 == this.anInt7236 && this.anInt7234 == this.anInt7226 && this.anInt7234 == this.anInt7219) {
			this.aBoolean490 = true;
			return;
		}
		this.aBoolean490 = false;
		@Pc(116) int local116 = (this.anInt7239 + this.anInt7220 + this.anInt7240) / 3;
		@Pc(129) int local129 = (this.anInt7225 + this.anInt7237 + this.anInt7236) / 3;
		@Pc(141) int local141 = (this.anInt7219 + this.anInt7226 + this.anInt7234) / 3;
		if (this.anInt7216 == local116 && local129 == this.anInt7224 && local141 == this.anInt7230) {
			return;
		}
		this.anInt7230 = local141;
		this.anInt7224 = local129;
		this.anInt7216 = local116;
		@Pc(177) int local177 = this.anInt7220 - this.anInt7240;
		@Pc(183) int local183 = this.anInt7237 - this.anInt7225;
		@Pc(190) int local190 = this.anInt7234 - this.anInt7226;
		@Pc(197) int local197 = this.anInt7239 - this.anInt7240;
		@Pc(204) int local204 = this.anInt7236 - this.anInt7225;
		@Pc(211) int local211 = this.anInt7219 - this.anInt7226;
		this.anInt7232 = local183 * local211 - local204 * local190;
		this.anInt7227 = local177 * local204 - local183 * local197;
		for (this.anInt7217 = local190 * local197 - local211 * local177; this.anInt7232 > 32767 || this.anInt7217 > 32767 || this.anInt7227 > 32767 || this.anInt7232 < -32767 || this.anInt7217 < -32767 || this.anInt7227 < -32767; this.anInt7217 >>= 0x1) {
			this.anInt7227 >>= 0x1;
			this.anInt7232 >>= 0x1;
		}
		@Pc(314) int local314 = (int) Math.sqrt((double) (this.anInt7227 * this.anInt7227 + this.anInt7232 * this.anInt7232 + this.anInt7217 * this.anInt7217));
		if (local314 <= 0) {
			local314 = 1;
		}
		this.anInt7217 = this.anInt7217 * 32767 / local314;
		this.anInt7227 = this.anInt7227 * 32767 / local314;
		this.anInt7232 = this.anInt7232 * 32767 / local314;
		if (this.aClass248_1.aShort104 <= 0 && this.aClass248_1.aShort103 <= 0) {
			return;
		}
		@Pc(364) int local364 = (int) (Math.atan2((double) this.anInt7227, (double) this.anInt7232) * 2607.5945876176133D);
		@Pc(385) int local385 = (int) (Math.atan2((double) this.anInt7217, Math.sqrt((double) (this.anInt7227 * this.anInt7227 + this.anInt7232 * this.anInt7232))) * 2607.5945876176133D);
		this.anInt7214 = this.aClass248_1.aShort104 - this.aClass248_1.aShort105;
		this.anInt7223 = this.aClass248_1.aShort103 - this.aClass248_1.aShort106;
		this.anInt7235 = local364 + this.aClass248_1.aShort105 - (this.anInt7214 >> 1);
		this.anInt7215 = this.aClass248_1.aShort106 + local385 - (this.anInt7223 >> 1);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IZBLclient!qa;J)V")
	public void method5857(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class167 arg2, @OriginalArg(4) long arg3) {
		@Pc(41) int local41;
		if (this.aBoolean489) {
			arg1 = false;
		} else if (this.aClass248_1.anInt7067 > Static243.anInt7147) {
			arg1 = false;
		} else if (Static238.anIntArray266[Static243.anInt7147] < Static198.anInt3555) {
			arg1 = false;
		} else if (this.aBoolean490) {
			arg1 = false;
		} else if (this.aClass248_1.anInt7059 != -1) {
			local41 = (int) (arg3 - this.aLong235);
			if (this.aClass248_1.aBoolean479 || this.aClass248_1.anInt7059 >= local41) {
				local41 %= this.aClass248_1.anInt7059;
			} else {
				arg1 = false;
			}
			if (!this.aClass248_1.aBoolean478 && this.aClass248_1.anInt7069 > local41) {
				arg1 = false;
			}
			if (this.aClass248_1.aBoolean478 && this.aClass248_1.anInt7069 <= local41) {
				arg1 = false;
			}
		}
		if (arg1) {
			this.anInt7231 += (int) ((double) arg0 * ((double) (this.aClass248_1.anInt7076 - this.aClass248_1.anInt7042) * Math.random() + (double) this.aClass248_1.anInt7042));
			if (this.anInt7231 > 63) {
				local41 = this.anInt7231 >> 6;
				this.anInt7231 &= 0x3F;
				for (@Pc(142) int local142 = 0; local142 < local41; local142++) {
					@Pc(204) int local204;
					@Pc(210) int local210;
					@Pc(216) int local216;
					@Pc(162) int local162;
					@Pc(170) int local170;
					@Pc(174) int local174;
					@Pc(184) int local184;
					@Pc(192) int local192;
					@Pc(196) int local196;
					if (this.aClass248_1.aShort104 <= 0 && this.aClass248_1.aShort103 <= 0) {
						local204 = this.anInt7232;
						local210 = this.anInt7217;
						local216 = this.anInt7227;
					} else {
						local162 = (int) (Math.random() * (double) this.anInt7214) + this.anInt7235;
						@Pc(166) int local166 = local162 & 0x3FFF;
						local170 = Class65.anIntArray88[local166];
						local174 = Class65.anIntArray87[local166];
						local184 = (int) ((double) this.anInt7223 * Math.random()) + this.anInt7215;
						@Pc(188) int local188 = local184 & 0x1FFF;
						local192 = Class65.anIntArray88[local188];
						local196 = Class65.anIntArray87[local188];
						local204 = local192 * local174 >> 15;
						local210 = (local196 << 0) * -1;
						local216 = local192 * local170 >> 15;
					}
					local162 = (int) (Math.random() * 65535.0D);
					local170 = (int) (Math.random() * 65535.0D);
					if (local162 + local170 > 65535) {
						local170 = 65535 - local170;
						local162 = 65535 - local162;
					}
					local174 = 65535 - local162 - local170;
					local184 = (int) ((long) this.anInt7239 * (long) local174 + (long) local170 * (long) this.anInt7220 + (long) this.anInt7240 * (long) local162 >> 16);
					local192 = (int) ((long) local162 * (long) this.anInt7225 + (long) local170 * (long) this.anInt7237 + (long) this.anInt7236 * (long) local174 >> 16);
					local196 = (int) ((long) local170 * (long) this.anInt7234 + (long) local162 * (long) this.anInt7226 + (long) this.anInt7219 * (long) local174 >> 16);
					@Pc(349) int local349 = (int) ((double) (this.aClass248_1.anInt7072 - this.aClass248_1.anInt7074) * Math.random()) + this.aClass248_1.anInt7074;
					@Pc(366) int local366 = (int) ((double) (this.aClass248_1.anInt7046 - this.aClass248_1.anInt7051) * Math.random()) + this.aClass248_1.anInt7051;
					@Pc(383) int local383 = this.aClass248_1.anInt7086 + (int) ((double) (this.aClass248_1.anInt7066 - this.aClass248_1.anInt7086) * Math.random());
					@Pc(445) int local445;
					if (this.aClass248_1.aBoolean482) {
						@Pc(449) double local449 = Math.random();
						local445 = (int) ((double) this.aClass248_1.anInt7065 + Math.random() * (double) this.aClass248_1.anInt7082) << 24 | (int) ((double) this.aClass248_1.anInt7085 * local449 + (double) this.aClass248_1.anInt7091) | (int) ((double) this.aClass248_1.anInt7040 + (double) this.aClass248_1.anInt7073 * local449) << 16 | (int) ((double) this.aClass248_1.anInt7060 + (double) this.aClass248_1.anInt7079 * local449) << 8;
					} else {
						local445 = (int) ((double) this.aClass248_1.anInt7085 * Math.random() + (double) this.aClass248_1.anInt7091) | (int) ((double) this.aClass248_1.anInt7073 * Math.random() + (double) this.aClass248_1.anInt7040) << 16 | (int) ((double) this.aClass248_1.anInt7060 + Math.random() * (double) this.aClass248_1.anInt7079) << 8 | (int) (Math.random() * (double) this.aClass248_1.anInt7082 + (double) this.aClass248_1.anInt7065) << 24;
					}
					@Pc(511) int local511 = this.aClass248_1.anInt7044;
					if (!arg2.method5961() && !this.aClass248_1.aBoolean480) {
						local511 = -1;
					}
					if (Static188.anInt3444 == Static298.anInt5158) {
						new Class23_Sub1_Sub2_Sub1(this, local184, local192, local196, local204, local210, local216, local349, local366, local445, local383, local511, this.aClass248_1.aBoolean481, this.aClass248_1.aBoolean483);
					} else {
						@Pc(551) Class23_Sub1_Sub2_Sub1 local551 = Static380.aClass23_Sub1_Sub2_Sub1Array2[Static188.anInt3444];
						Static188.anInt3444 = Static188.anInt3444 + 1 & 0x3FF;
						local551.method3689(this, local184, local192, local196, local204, local210, local216, local349, local366, local445, local383, local511, this.aClass248_1.aBoolean481, this.aClass248_1.aBoolean483);
					}
				}
			}
		}
		this.anInt7221 = 0;
		for (@Pc(590) Class23_Sub1_Sub2_Sub1 local590 = (Class23_Sub1_Sub2_Sub1) this.aClass194_9.method4577(); local590 != null; local590 = (Class23_Sub1_Sub2_Sub1) this.aClass194_9.method4580()) {
			local590.method3692(arg3, arg0);
			this.anInt7221++;
		}
		Static380.anInt6413 += this.anInt7221;
	}
}
