import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wg")
public final class Class41_Sub7 extends Class41 {

	@OriginalMember(owner = "client!wg", name = "l", descriptor = "I")
	private int anInt6228;

	@OriginalMember(owner = "client!wg", name = "n", descriptor = "I")
	private int anInt6229;

	@OriginalMember(owner = "client!wg", name = "o", descriptor = "I")
	public int anInt6230;

	@OriginalMember(owner = "client!wg", name = "p", descriptor = "I")
	public int anInt6231;

	@OriginalMember(owner = "client!wg", name = "q", descriptor = "I")
	private int anInt6232;

	@OriginalMember(owner = "client!wg", name = "r", descriptor = "I")
	public int anInt6233;

	@OriginalMember(owner = "client!wg", name = "s", descriptor = "I")
	private int anInt6234;

	@OriginalMember(owner = "client!wg", name = "u", descriptor = "I")
	private int anInt6236;

	@OriginalMember(owner = "client!wg", name = "v", descriptor = "I")
	private int anInt6237;

	@OriginalMember(owner = "client!wg", name = "y", descriptor = "I")
	private int anInt6239;

	@OriginalMember(owner = "client!wg", name = "z", descriptor = "I")
	private int anInt6240;

	@OriginalMember(owner = "client!wg", name = "E", descriptor = "I")
	private int anInt6243;

	@OriginalMember(owner = "client!wg", name = "G", descriptor = "I")
	private int anInt6245;

	@OriginalMember(owner = "client!wg", name = "I", descriptor = "I")
	private int anInt6247;

	@OriginalMember(owner = "client!wg", name = "K", descriptor = "I")
	private int anInt6248;

	@OriginalMember(owner = "client!wg", name = "L", descriptor = "I")
	private int anInt6249;

	@OriginalMember(owner = "client!wg", name = "M", descriptor = "I")
	private int anInt6250;

	@OriginalMember(owner = "client!wg", name = "N", descriptor = "I")
	private int anInt6251;

	@OriginalMember(owner = "client!wg", name = "T", descriptor = "I")
	private int anInt6253;

	@OriginalMember(owner = "client!wg", name = "W", descriptor = "I")
	public int anInt6256;

	@OriginalMember(owner = "client!wg", name = "k", descriptor = "Z")
	private boolean aBoolean576 = false;

	@OriginalMember(owner = "client!wg", name = "m", descriptor = "Z")
	public boolean aBoolean577 = false;

	@OriginalMember(owner = "client!wg", name = "U", descriptor = "I")
	private int anInt6254 = 0;

	@OriginalMember(owner = "client!wg", name = "J", descriptor = "Lclient!hn;")
	public final Class41_Sub3 aClass41_Sub3_7;

	@OriginalMember(owner = "client!wg", name = "Q", descriptor = "J")
	private final long aLong202;

	@OriginalMember(owner = "client!wg", name = "x", descriptor = "Lclient!qt;")
	public final Class197 aClass197_2;

	@OriginalMember(owner = "client!wg", name = "D", descriptor = "Lclient!rr;")
	public Class204 aClass204_1;

	@OriginalMember(owner = "client!wg", name = "O", descriptor = "Lclient!sc;")
	public final Class208 aClass208_10;

	@OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(Lclient!tq;Lclient!qt;Lclient!hn;J)V")
	public Class41_Sub7(@OriginalArg(0) Class164 arg0, @OriginalArg(1) Class197 arg1, @OriginalArg(2) Class41_Sub3 arg2, @OriginalArg(3) long arg3) {
		this.aClass41_Sub3_7 = arg2;
		this.aLong202 = arg3;
		this.aClass197_2 = arg1;
		this.aClass204_1 = Static255.method3905(this.aClass197_2.anInt5068);
		if (!arg0.method5304() && this.aClass204_1.anInt5315 != -1) {
			this.aClass204_1 = Static255.method3905(this.aClass204_1.anInt5315);
		}
		this.aClass208_10 = new Class208();
		this.anInt6254 = (int) ((double) this.anInt6254 + Math.random() * 64.0D);
		this.method5441();
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V")
	public void method5441() {
		this.anInt6228 = this.aClass197_2.anInt5070;
		this.anInt6232 = this.aClass197_2.anInt5080;
		this.anInt6234 = this.aClass197_2.anInt5081;
		this.anInt6250 = this.aClass197_2.anInt5077;
		this.anInt6239 = this.aClass197_2.anInt5072;
		this.anInt6248 = this.aClass197_2.anInt5073;
		this.anInt6240 = this.aClass197_2.anInt5067;
		this.anInt6247 = this.aClass197_2.anInt5078;
		this.anInt6249 = this.aClass197_2.anInt5079;
		if (this.anInt6232 == this.anInt6234 && this.anInt6239 == this.anInt6232 && this.anInt6240 == this.anInt6248 && this.anInt6240 == this.anInt6249 && this.anInt6247 == this.anInt6250 && this.anInt6228 == this.anInt6250) {
			this.aBoolean576 = true;
			return;
		}
		this.aBoolean576 = false;
		@Pc(107) int local107 = (this.anInt6232 + this.anInt6234 + this.anInt6239) / 3;
		@Pc(118) int local118 = (this.anInt6249 + this.anInt6240 + this.anInt6248) / 3;
		@Pc(133) int local133 = (this.anInt6228 + this.anInt6247 + this.anInt6250) / 3;
		if (local107 == this.anInt6256 && this.anInt6231 == local118 && local133 == this.anInt6230) {
			return;
		}
		this.anInt6230 = local133;
		this.anInt6231 = local118;
		this.anInt6256 = local107;
		@Pc(169) int local169 = this.anInt6232 - this.anInt6234;
		@Pc(176) int local176 = this.anInt6240 - this.anInt6248;
		@Pc(182) int local182 = this.anInt6250 - this.anInt6247;
		@Pc(189) int local189 = this.anInt6239 - this.anInt6234;
		@Pc(196) int local196 = this.anInt6249 - this.anInt6248;
		@Pc(203) int local203 = this.anInt6228 - this.anInt6247;
		this.anInt6253 = local196 * local169 - local176 * local189;
		this.anInt6237 = local176 * local203 - local196 * local182;
		this.anInt6236 = local182 * local189 - local169 * local203;
		while (this.anInt6237 > 32767 || this.anInt6236 > 32767 || this.anInt6253 > 32767 || this.anInt6237 < -32767 || this.anInt6236 < -32767 || this.anInt6253 < -32767) {
			this.anInt6236 >>= 0x1;
			this.anInt6253 >>= 0x1;
			this.anInt6237 >>= 0x1;
		}
		@Pc(300) int local300 = (int) Math.sqrt((double) (this.anInt6253 * this.anInt6253 + this.anInt6236 * this.anInt6236 + this.anInt6237 * this.anInt6237));
		if (local300 <= 0) {
			local300 = 1;
		}
		this.anInt6237 = this.anInt6237 * 32767 / local300;
		this.anInt6236 = this.anInt6236 * 32767 / local300;
		this.anInt6253 = this.anInt6253 * 32767 / local300;
		if (this.aClass204_1.aShort81 <= 0 && this.aClass204_1.aShort82 <= 0) {
			return;
		}
		@Pc(347) int local347 = (int) (Math.atan2((double) this.anInt6253, (double) this.anInt6237) * 2607.5945876176133D);
		@Pc(368) int local368 = (int) (Math.atan2((double) this.anInt6236, Math.sqrt((double) (this.anInt6253 * this.anInt6253 + this.anInt6237 * this.anInt6237))) * 2607.5945876176133D);
		this.anInt6251 = this.aClass204_1.aShort81 - this.aClass204_1.aShort80;
		this.anInt6243 = this.aClass204_1.aShort82 - this.aClass204_1.lb;
		this.anInt6229 = local347 + this.aClass204_1.aShort80 - (this.anInt6251 >> 1);
		this.anInt6245 = local368 + this.aClass204_1.lb - (this.anInt6243 >> 1);
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILclient!tq;ZJZ)V")
	public void method5443(@OriginalArg(0) int arg0, @OriginalArg(1) Class164 arg1, @OriginalArg(3) long arg2, @OriginalArg(4) boolean arg3) {
		@Pc(47) int local47;
		if (this.aBoolean577) {
			arg3 = false;
		} else if (this.aClass204_1.anInt5303 > Static213.anInt3655) {
			arg3 = false;
		} else if (Static337.anInt5595 > Static372.anIntArray201[Static213.anInt3655]) {
			arg3 = false;
		} else if (this.aBoolean576) {
			arg3 = false;
		} else if (this.aClass204_1.anInt5324 != -1) {
			local47 = (int) (arg2 - this.aLong202);
			if (this.aClass204_1.aBoolean503 || this.aClass204_1.anInt5324 >= local47) {
				local47 %= this.aClass204_1.anInt5324;
			} else {
				arg3 = false;
			}
			if (!this.aClass204_1.aBoolean500 && this.aClass204_1.anInt5323 > local47) {
				arg3 = false;
			}
			if (this.aClass204_1.aBoolean500 && this.aClass204_1.anInt5323 <= local47) {
				arg3 = false;
			}
		}
		if (arg3) {
			this.anInt6254 += (int) ((double) arg0 * ((double) this.aClass204_1.anInt5309 + Math.random() * (double) (this.aClass204_1.anInt5295 - this.aClass204_1.anInt5309)));
			if (this.anInt6254 > 63) {
				local47 = this.anInt6254 >> 6;
				this.anInt6254 &= 0x3F;
				for (@Pc(144) int local144 = 0; local144 < local47; local144++) {
					@Pc(163) int local163;
					@Pc(169) int local169;
					@Pc(166) int local166;
					@Pc(181) int local181;
					@Pc(189) int local189;
					@Pc(193) int local193;
					@Pc(203) int local203;
					@Pc(211) int local211;
					@Pc(221) int local221;
					if (this.aClass204_1.aShort81 <= 0 && this.aClass204_1.aShort82 <= 0) {
						local163 = this.anInt6237;
						local166 = this.anInt6253;
						local169 = this.anInt6236;
					} else {
						local181 = this.anInt6229 + (int) ((double) this.anInt6251 * Math.random());
						@Pc(185) int local185 = local181 & 0x3FFF;
						local189 = Class13.anIntArray20[local185];
						local193 = Class13.anIntArray21[local185];
						local203 = this.anInt6245 + (int) ((double) this.anInt6243 * Math.random());
						@Pc(207) int local207 = local203 & 0x1FFF;
						local211 = Class13.anIntArray20[local207];
						local163 = local211 * local193 >> 15;
						local221 = Class13.anIntArray21[local207];
						local169 = local221 * -1;
						local166 = local211 * local189 >> 15;
					}
					local181 = (int) (Math.random() * 65535.0D);
					local189 = (int) (Math.random() * 65535.0D);
					if (local189 + local181 > 65535) {
						local181 = 65535 - local181;
						local189 = 65535 - local189;
					}
					local193 = 65535 - local189 - local181;
					local203 = local181 * this.anInt6234 + this.anInt6232 * local189 + local193 * this.anInt6239 >> 16;
					local211 = this.anInt6248 * local181 + local189 * this.anInt6240 + local193 * this.anInt6249 >> 16;
					local221 = local193 * this.anInt6228 + this.anInt6247 * local181 + local189 * this.anInt6250 >> 16;
					@Pc(332) int local332 = (int) (Math.random() * (double) (this.aClass204_1.anInt5304 - this.aClass204_1.anInt5297)) + this.aClass204_1.anInt5297;
					@Pc(349) int local349 = this.aClass204_1.anInt5330 + (int) ((double) (this.aClass204_1.anInt5286 - this.aClass204_1.anInt5330) * Math.random());
					@Pc(366) int local366 = this.aClass204_1.anInt5300 + (int) (Math.random() * (double) (this.aClass204_1.anInt5294 - this.aClass204_1.anInt5300));
					@Pc(428) int local428;
					if (this.aClass204_1.aBoolean499) {
						@Pc(432) double local432 = Math.random();
						local428 = (int) ((double) this.aClass204_1.anInt5318 * local432 + (double) this.aClass204_1.anInt5302) | (int) (local432 * (double) this.aClass204_1.anInt5320 + (double) this.aClass204_1.anInt5311) << 8 | (int) (local432 * (double) this.aClass204_1.anInt5335 + (double) this.aClass204_1.anInt5322) << 16 | (int) ((double) this.aClass204_1.anInt5305 + Math.random() * (double) this.aClass204_1.anInt5312) << 24;
					} else {
						local428 = (int) ((double) this.aClass204_1.anInt5302 + Math.random() * (double) this.aClass204_1.anInt5318) | (int) ((double) this.aClass204_1.anInt5311 + Math.random() * (double) this.aClass204_1.anInt5320) << 8 | (int) ((double) this.aClass204_1.anInt5335 * Math.random() + (double) this.aClass204_1.anInt5322) << 16 | (int) (Math.random() * (double) this.aClass204_1.anInt5312 + (double) this.aClass204_1.anInt5305) << 24;
					}
					@Pc(494) int local494 = this.aClass204_1.anInt5308;
					if (!arg1.method5304() && !this.aClass204_1.aBoolean504) {
						local494 = -1;
					}
					if (Static222.anInt4504 == Static99.anInt1793) {
						new Class41_Sub2_Sub1_Sub1(this, local203, local211, local221, local163, local169, local166, local332, local349, local428, local366, local494, this.aClass204_1.aBoolean501);
					} else {
						@Pc(535) Class41_Sub2_Sub1_Sub1 local535 = Static305.aClass41_Sub2_Sub1_Sub1Array2[Static99.anInt1793];
						Static99.anInt1793 = Static99.anInt1793 + 1 & 0x3FF;
						local535.method5487(this, local203, local211, local221, local163, local169, local166, local332, local349, local428, local366, local494, this.aClass204_1.aBoolean501);
					}
				}
			}
		}
		this.anInt6233 = 0;
		for (@Pc(571) Class41_Sub2_Sub1_Sub1 local571 = (Class41_Sub2_Sub1_Sub1) this.aClass208_10.method4661(); local571 != null; local571 = (Class41_Sub2_Sub1_Sub1) this.aClass208_10.method4663()) {
			local571.method5486(arg2, arg0);
			this.anInt6233++;
		}
		Static288.anInt4961 += this.anInt6233;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(JI)V")
	public void method5444(@OriginalArg(0) long arg0) {
		for (@Pc(7) Class41_Sub2_Sub1_Sub1 local7 = (Class41_Sub2_Sub1_Sub1) this.aClass208_10.method4661(); local7 != null; local7 = (Class41_Sub2_Sub1_Sub1) this.aClass208_10.method4663()) {
			local7.method5485(arg0);
		}
	}
}
