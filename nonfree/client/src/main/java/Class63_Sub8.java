import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wg")
public final class Class63_Sub8 extends Class63 {

	@OriginalMember(owner = "client!wg", name = "m", descriptor = "I")
	public int anInt6428;

	@OriginalMember(owner = "client!wg", name = "n", descriptor = "I")
	public int anInt6429;

	@OriginalMember(owner = "client!wg", name = "o", descriptor = "I")
	public int anInt6430;

	@OriginalMember(owner = "client!wg", name = "p", descriptor = "I")
	private int anInt6431;

	@OriginalMember(owner = "client!wg", name = "q", descriptor = "I")
	public int anInt6432;

	@OriginalMember(owner = "client!wg", name = "r", descriptor = "I")
	private int anInt6433;

	@OriginalMember(owner = "client!wg", name = "s", descriptor = "I")
	private int anInt6434;

	@OriginalMember(owner = "client!wg", name = "t", descriptor = "I")
	private int anInt6435;

	@OriginalMember(owner = "client!wg", name = "u", descriptor = "I")
	private int anInt6436;

	@OriginalMember(owner = "client!wg", name = "v", descriptor = "I")
	private int anInt6437;

	@OriginalMember(owner = "client!wg", name = "w", descriptor = "I")
	private int anInt6438;

	@OriginalMember(owner = "client!wg", name = "x", descriptor = "I")
	private int anInt6439;

	@OriginalMember(owner = "client!wg", name = "D", descriptor = "I")
	private int anInt6443;

	@OriginalMember(owner = "client!wg", name = "F", descriptor = "I")
	private int anInt6444;

	@OriginalMember(owner = "client!wg", name = "K", descriptor = "I")
	private int anInt6446;

	@OriginalMember(owner = "client!wg", name = "N", descriptor = "I")
	private int anInt6448;

	@OriginalMember(owner = "client!wg", name = "Q", descriptor = "I")
	private int anInt6450;

	@OriginalMember(owner = "client!wg", name = "R", descriptor = "I")
	private int anInt6451;

	@OriginalMember(owner = "client!wg", name = "T", descriptor = "I")
	private int anInt6452;

	@OriginalMember(owner = "client!wg", name = "U", descriptor = "I")
	private int anInt6453;

	@OriginalMember(owner = "client!wg", name = "I", descriptor = "Z")
	private boolean aBoolean475 = false;

	@OriginalMember(owner = "client!wg", name = "M", descriptor = "I")
	private int anInt6447 = 0;

	@OriginalMember(owner = "client!wg", name = "O", descriptor = "Z")
	public boolean aBoolean476 = false;

	@OriginalMember(owner = "client!wg", name = "J", descriptor = "Lclient!pl;")
	public final Class63_Sub5 aClass63_Sub5_7;

	@OriginalMember(owner = "client!wg", name = "B", descriptor = "J")
	private final long aLong215;

	@OriginalMember(owner = "client!wg", name = "L", descriptor = "Lclient!nr;")
	public final Class140 aClass140_2;

	@OriginalMember(owner = "client!wg", name = "E", descriptor = "Lclient!qr;")
	public Class168 aClass168_1;

	@OriginalMember(owner = "client!wg", name = "z", descriptor = "Lclient!bn;")
	public final Class24 aClass24_7;

	@OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(Lclient!en;Lclient!nr;Lclient!pl;J)V")
	public Class63_Sub8(@OriginalArg(0) Class59 arg0, @OriginalArg(1) Class140 arg1, @OriginalArg(2) Class63_Sub5 arg2, @OriginalArg(3) long arg3) {
		this.aClass63_Sub5_7 = arg2;
		this.aLong215 = arg3;
		this.aClass140_2 = arg1;
		this.aClass168_1 = Static226.method3911(this.aClass140_2.anInt4254);
		if (!arg0.method4805() && this.aClass168_1.anInt5136 != -1) {
			this.aClass168_1 = Static226.method3911(this.aClass168_1.anInt5136);
		}
		this.aClass24_7 = new Class24();
		this.anInt6447 = (int) ((double) this.anInt6447 + Math.random() * 64.0D);
		this.method5695();
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IJ)V")
	public void method5692(@OriginalArg(1) long arg0) {
		for (@Pc(15) Class63_Sub1_Sub1_Sub1 local15 = (Class63_Sub1_Sub1_Sub1) this.aClass24_7.method619(); local15 != null; local15 = (Class63_Sub1_Sub1_Sub1) this.aClass24_7.method627()) {
			local15.method4352(arg0);
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(JILclient!en;IZ)V")
	public void method5693(@OriginalArg(0) long arg0, @OriginalArg(2) Class59 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(48) int local48;
		if (this.aBoolean476) {
			arg3 = false;
		} else if (this.aClass168_1.anInt5122 > Static26.anInt627) {
			arg3 = false;
		} else if (Static140.anInt2789 > Static179.anIntArray268[Static26.anInt627]) {
			arg3 = false;
		} else if (this.aBoolean475) {
			arg3 = false;
		} else if (this.aClass168_1.anInt5108 != -1) {
			local48 = (int) (arg0 - this.aLong215);
			if (this.aClass168_1.aBoolean392 || local48 <= this.aClass168_1.anInt5108) {
				local48 %= this.aClass168_1.anInt5108;
			} else {
				arg3 = false;
			}
			if (!this.aClass168_1.aBoolean390 && this.aClass168_1.anInt5120 > local48) {
				arg3 = false;
			}
			if (this.aClass168_1.aBoolean390 && local48 >= this.aClass168_1.anInt5120) {
				arg3 = false;
			}
		}
		if (arg3) {
			this.anInt6447 += (int) ((double) arg2 * ((double) this.aClass168_1.anInt5124 + Math.random() * (double) (this.aClass168_1.anInt5116 - this.aClass168_1.anInt5124)));
			if (this.anInt6447 > 63) {
				local48 = this.anInt6447 >> 6;
				this.anInt6447 &= 0x3F;
				for (@Pc(140) int local140 = 0; local140 < local48; local140++) {
					@Pc(153) int local153;
					@Pc(159) int local159;
					@Pc(156) int local156;
					@Pc(172) int local172;
					@Pc(180) int local180;
					@Pc(184) int local184;
					@Pc(195) int local195;
					@Pc(203) int local203;
					@Pc(207) int local207;
					if (this.aClass168_1.aShort67 <= 0 && this.aClass168_1.aShort65 <= 0) {
						local153 = this.anInt6444;
						local156 = this.anInt6448;
						local159 = this.anInt6431;
					} else {
						local172 = this.anInt6434 + (int) ((double) this.anInt6439 * Math.random());
						@Pc(176) int local176 = local172 & 0x3FFF;
						local180 = Class5_Sub9_Sub12.anIntArray169[local176];
						local184 = Class5_Sub9_Sub12.anIntArray170[local176];
						local195 = this.anInt6436 + (int) (Math.random() * (double) this.anInt6443);
						@Pc(199) int local199 = local195 & 0x1FFF;
						local203 = Class5_Sub9_Sub12.anIntArray169[local199];
						local207 = Class5_Sub9_Sub12.anIntArray170[local199];
						local153 = local203 * local184 >> 15;
						local156 = local203 * local180 >> 15;
						local159 = local207 * -1;
					}
					local172 = (int) (Math.random() * 65535.0D);
					local180 = (int) (Math.random() * 65535.0D);
					if (local180 + local172 > 65535) {
						local180 = 65535 - local180;
						local172 = 65535 - local172;
					}
					local184 = 65535 - local172 - local180;
					local195 = this.anInt6453 * local184 + this.anInt6451 * local180 + local172 * this.anInt6438 >> 16;
					local203 = this.anInt6452 * local184 + local180 * this.anInt6437 + this.anInt6435 * local172 >> 16;
					local207 = local184 * this.anInt6450 + local180 * this.anInt6446 + local172 * this.anInt6433 >> 16;
					@Pc(323) int local323 = this.aClass168_1.anInt5157 + (int) (Math.random() * (double) (this.aClass168_1.anInt5137 - this.aClass168_1.anInt5157));
					@Pc(340) int local340 = (int) ((double) (this.aClass168_1.anInt5154 - this.aClass168_1.anInt5109) * Math.random()) + this.aClass168_1.anInt5109;
					@Pc(358) int local358 = this.aClass168_1.anInt5143 + (int) (Math.random() * (double) (this.aClass168_1.anInt5115 - this.aClass168_1.anInt5143));
					@Pc(420) int local420;
					if (this.aClass168_1.aBoolean389) {
						@Pc(424) double local424 = Math.random();
						local420 = (int) ((double) this.aClass168_1.anInt5146 * local424 + (double) this.aClass168_1.anInt5110) | (int) ((double) this.aClass168_1.anInt5156 * local424 + (double) this.aClass168_1.anInt5139) << 8 | (int) (local424 * (double) this.aClass168_1.lb + (double) this.aClass168_1.anInt5113) << 16 | (int) ((double) this.aClass168_1.anInt5155 * local424 + (double) this.aClass168_1.anInt5107) << 24;
					} else {
						local420 = (int) ((double) this.aClass168_1.anInt5107 + (double) this.aClass168_1.anInt5155 * Math.random()) << 24 | (int) ((double) this.aClass168_1.lb * Math.random() + (double) this.aClass168_1.anInt5113) << 16 | (int) ((double) this.aClass168_1.anInt5139 + Math.random() * (double) this.aClass168_1.anInt5156) << 8 | (int) (Math.random() * (double) this.aClass168_1.anInt5146 + (double) this.aClass168_1.anInt5110);
					}
					@Pc(486) int local486 = this.aClass168_1.anInt5142;
					if (!arg1.method4805() && !this.aClass168_1.aBoolean394) {
						local486 = -1;
					}
					if (Static261.anInt5034 == Static255.anInt4977) {
						new Class63_Sub1_Sub1_Sub1(this, local195, local203, local207, local153, local159, local156, local323, local340, local420, local358, local486, this.aClass168_1.aBoolean393);
					} else {
						@Pc(502) Class63_Sub1_Sub1_Sub1 local502 = Static68.aClass63_Sub1_Sub1_Sub1Array1[Static261.anInt5034];
						Static261.anInt5034 = Static261.anInt5034 + 1 & 0x3FF;
						local502.method4354(this, local195, local203, local207, local153, local159, local156, local323, local340, local420, local358, local486, this.aClass168_1.aBoolean393);
					}
				}
			}
		}
		this.anInt6432 = 0;
		for (@Pc(563) Class63_Sub1_Sub1_Sub1 local563 = (Class63_Sub1_Sub1_Sub1) this.aClass24_7.method619(); local563 != null; local563 = (Class63_Sub1_Sub1_Sub1) this.aClass24_7.method627()) {
			local563.method4353(arg0, arg2);
			this.anInt6432++;
		}
		Static336.anInt5416 += this.anInt6432;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(B)V")
	public void method5695() {
		this.anInt6446 = this.aClass140_2.anInt4246;
		this.anInt6453 = this.aClass140_2.anInt4245;
		this.anInt6450 = this.aClass140_2.anInt4239;
		this.anInt6433 = this.aClass140_2.anInt4251;
		this.anInt6451 = this.aClass140_2.anInt4244;
		this.anInt6435 = this.aClass140_2.anInt4242;
		this.anInt6437 = this.aClass140_2.anInt4247;
		this.anInt6452 = this.aClass140_2.anInt4252;
		this.anInt6438 = this.aClass140_2.anInt4253;
		if (this.anInt6438 == this.anInt6451 && this.anInt6451 == this.anInt6453 && this.anInt6435 == this.anInt6437 && this.anInt6437 == this.anInt6452 && this.anInt6433 == this.anInt6446 && this.anInt6450 == this.anInt6446) {
			this.aBoolean475 = true;
			return;
		}
		this.aBoolean475 = false;
		@Pc(126) int local126 = (this.anInt6451 + this.anInt6438 + this.anInt6453) / 3;
		@Pc(138) int local138 = (this.anInt6452 + this.anInt6435 + this.anInt6437) / 3;
		@Pc(149) int local149 = (this.anInt6450 + this.anInt6446 + this.anInt6433) / 3;
		if (this.anInt6430 == local126 && this.anInt6428 == local138 && local149 == this.anInt6429) {
			return;
		}
		this.anInt6428 = local138;
		this.anInt6429 = local149;
		this.anInt6430 = local126;
		@Pc(178) int local178 = this.anInt6451 - this.anInt6438;
		@Pc(185) int local185 = this.anInt6437 - this.anInt6435;
		@Pc(192) int local192 = this.anInt6446 - this.anInt6433;
		@Pc(199) int local199 = this.anInt6453 - this.anInt6438;
		@Pc(206) int local206 = this.anInt6452 - this.anInt6435;
		@Pc(213) int local213 = this.anInt6450 - this.anInt6433;
		this.anInt6444 = local213 * local185 - local192 * local206;
		this.anInt6431 = local199 * local192 - local178 * local213;
		this.anInt6448 = local206 * local178 - local185 * local199;
		while (this.anInt6444 > 32767 || this.anInt6431 > 32767 || this.anInt6448 > 32767 || this.anInt6444 < -32767 || this.anInt6431 < -32767 || this.anInt6448 < -32767) {
			this.anInt6431 >>= 0x1;
			this.anInt6448 >>= 0x1;
			this.anInt6444 >>= 0x1;
		}
		@Pc(309) int local309 = (int) Math.sqrt((double) (this.anInt6444 * this.anInt6444 + this.anInt6431 * this.anInt6431 + this.anInt6448 * this.anInt6448));
		if (local309 <= 0) {
			local309 = 1;
		}
		this.anInt6448 = this.anInt6448 * 32767 / local309;
		this.anInt6444 = this.anInt6444 * 32767 / local309;
		this.anInt6431 = this.anInt6431 * 32767 / local309;
		if (this.aClass168_1.aShort67 <= 0 && this.aClass168_1.aShort65 <= 0) {
			return;
		}
		@Pc(362) int local362 = (int) (Math.atan2((double) this.anInt6448, (double) this.anInt6444) * 2607.5945876176133D);
		@Pc(384) int local384 = (int) (Math.atan2((double) this.anInt6431, Math.sqrt((double) (this.anInt6444 * this.anInt6444 + this.anInt6448 * this.anInt6448))) * 2607.5945876176133D);
		this.anInt6439 = this.aClass168_1.aShort67 - this.aClass168_1.aShort64;
		this.anInt6434 = local362 + this.aClass168_1.aShort64 - (this.anInt6439 >> 1);
		this.anInt6443 = this.aClass168_1.aShort65 - this.aClass168_1.aShort66;
		this.anInt6436 = this.aClass168_1.aShort66 + local384 - (this.anInt6443 >> 1);
	}
}
