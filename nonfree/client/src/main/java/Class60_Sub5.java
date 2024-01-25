import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lw")
public final class Class60_Sub5 extends Class60 {

	@OriginalMember(owner = "client!lw", name = "i", descriptor = "I")
	private int anInt5639;

	@OriginalMember(owner = "client!lw", name = "j", descriptor = "I")
	private int anInt5640;

	@OriginalMember(owner = "client!lw", name = "l", descriptor = "I")
	private int anInt5642;

	@OriginalMember(owner = "client!lw", name = "m", descriptor = "I")
	private int anInt5643;

	@OriginalMember(owner = "client!lw", name = "o", descriptor = "I")
	private int anInt5645;

	@OriginalMember(owner = "client!lw", name = "q", descriptor = "I")
	private int anInt5647;

	@OriginalMember(owner = "client!lw", name = "r", descriptor = "I")
	public int anInt5648;

	@OriginalMember(owner = "client!lw", name = "t", descriptor = "I")
	private int anInt5650;

	@OriginalMember(owner = "client!lw", name = "u", descriptor = "I")
	private int anInt5651;

	@OriginalMember(owner = "client!lw", name = "w", descriptor = "I")
	public int anInt5652;

	@OriginalMember(owner = "client!lw", name = "x", descriptor = "I")
	private int anInt5653;

	@OriginalMember(owner = "client!lw", name = "z", descriptor = "I")
	private int anInt5654;

	@OriginalMember(owner = "client!lw", name = "B", descriptor = "I")
	private int anInt5655;

	@OriginalMember(owner = "client!lw", name = "C", descriptor = "I")
	private int anInt5656;

	@OriginalMember(owner = "client!lw", name = "D", descriptor = "I")
	private int anInt5657;

	@OriginalMember(owner = "client!lw", name = "F", descriptor = "I")
	private int anInt5658;

	@OriginalMember(owner = "client!lw", name = "H", descriptor = "I")
	public int anInt5660;

	@OriginalMember(owner = "client!lw", name = "I", descriptor = "I")
	public int anInt5661;

	@OriginalMember(owner = "client!lw", name = "O", descriptor = "I")
	private int anInt5664;

	@OriginalMember(owner = "client!lw", name = "P", descriptor = "I")
	private int anInt5665;

	@OriginalMember(owner = "client!lw", name = "A", descriptor = "Z")
	private boolean aBoolean404 = false;

	@OriginalMember(owner = "client!lw", name = "n", descriptor = "I")
	private int anInt5644 = 0;

	@OriginalMember(owner = "client!lw", name = "S", descriptor = "Z")
	public boolean aBoolean406 = false;

	@OriginalMember(owner = "client!lw", name = "E", descriptor = "Lclient!bh;")
	public final Class33 aClass33_2;

	@OriginalMember(owner = "client!lw", name = "K", descriptor = "J")
	private final long aLong138;

	@OriginalMember(owner = "client!lw", name = "h", descriptor = "Lclient!io;")
	public final Class60_Sub4 aClass60_Sub4_5;

	@OriginalMember(owner = "client!lw", name = "M", descriptor = "Lclient!sda;")
	public Class288 aClass288_1;

	@OriginalMember(owner = "client!lw", name = "v", descriptor = "Lclient!wn;")
	public final Class349 aClass349_9;

	@OriginalMember(owner = "client!lw", name = "<init>", descriptor = "(Lclient!oa;Lclient!bh;Lclient!io;J)V")
	public Class60_Sub5(@OriginalArg(0) Class90 arg0, @OriginalArg(1) Class33 arg1, @OriginalArg(2) Class60_Sub4 arg2, @OriginalArg(3) long arg3) {
		this.aClass33_2 = arg1;
		this.aLong138 = arg3;
		this.aClass60_Sub4_5 = arg2;
		this.aClass288_1 = this.aClass33_2.method670();
		if (!arg0.method7497() && this.aClass288_1.anInt8234 != -1) {
			this.aClass288_1 = Static299.method4520(this.aClass288_1.anInt8234);
		}
		this.aClass349_9 = new Class349();
		this.anInt5644 = (int) ((double) this.anInt5644 + Math.random() * 64.0D);
		this.method4617();
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(JIIZLclient!oa;)V")
	public void method4612(@OriginalArg(0) long arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class90 arg3) {
		@Pc(42) int local42;
		if (this.aBoolean406) {
			arg2 = false;
		} else if (Static345.anInt6520 < this.aClass288_1.anInt8259) {
			arg2 = false;
		} else if (Static424.anInt7494 > Static203.anIntArray337[Static345.anInt6520]) {
			arg2 = false;
		} else if (this.aBoolean404) {
			arg2 = false;
		} else if (this.aClass288_1.anInt8281 != -1) {
			local42 = (int) (arg0 - this.aLong138);
			if (this.aClass288_1.aBoolean529 || local42 <= this.aClass288_1.anInt8281) {
				local42 %= this.aClass288_1.anInt8281;
			} else {
				arg2 = false;
			}
			if (!this.aClass288_1.aBoolean534 && local42 < this.aClass288_1.anInt8246) {
				arg2 = false;
			}
			if (this.aClass288_1.aBoolean534 && local42 >= this.aClass288_1.anInt8246) {
				arg2 = false;
			}
		}
		if (arg2) {
			this.anInt5644 += (int) (((double) this.aClass288_1.anInt8263 + (double) (this.aClass288_1.anInt8264 - this.aClass288_1.anInt8263) * Math.random()) * (double) arg1);
			if (this.anInt5644 > 63) {
				local42 = this.anInt5644 >> 6;
				this.anInt5644 &= 0x3F;
				for (@Pc(145) int local145 = 0; local145 < local42; local145++) {
					@Pc(216) int local216;
					@Pc(210) int local210;
					@Pc(222) int local222;
					@Pc(168) int local168;
					@Pc(176) int local176;
					@Pc(180) int local180;
					@Pc(190) int local190;
					@Pc(198) int local198;
					@Pc(202) int local202;
					if (this.aClass288_1.aShort102 <= 0 && this.aClass288_1.aShort103 <= 0) {
						local222 = this.anInt5658;
						local216 = this.anInt5656;
						local210 = this.anInt5654;
					} else {
						local168 = (int) (Math.random() * (double) this.anInt5645) + this.anInt5650;
						@Pc(172) int local172 = local168 & 0x3FFF;
						local176 = Class22.anIntArray20[local172];
						local180 = Class22.anIntArray19[local172];
						local190 = (int) ((double) this.anInt5665 * Math.random()) + this.anInt5651;
						@Pc(194) int local194 = local190 & 0x1FFF;
						local198 = Class22.anIntArray20[local194];
						local202 = Class22.anIntArray19[local194];
						local210 = (local202 << 1) * -1;
						local216 = local198 * local180 >> 13;
						local222 = local198 * local176 >> 13;
					}
					local168 = (int) (Math.random() * 65535.0D);
					local176 = (int) (Math.random() * 65535.0D);
					if (local168 + local176 > 65535) {
						local176 = 65535 - local176;
						local168 = 65535 - local168;
					}
					local180 = 65535 - local168 - local176;
					local190 = (int) ((long) local176 * (long) this.anInt5643 + (long) local168 * (long) this.anInt5647 + (long) this.anInt5639 * (long) local180 >> 16);
					local198 = (int) ((long) this.anInt5655 * (long) local180 + (long) local176 * (long) this.anInt5664 + (long) this.anInt5653 * (long) local168 >> 16);
					local202 = (int) ((long) this.anInt5642 * (long) local176 + (long) local168 * (long) this.anInt5657 + (long) local180 * (long) this.anInt5640 >> 16);
					@Pc(358) int local358 = (int) ((double) (this.aClass288_1.anInt8273 - this.aClass288_1.anInt8265) * Math.random()) + this.aClass288_1.anInt8265;
					@Pc(376) int local376 = this.aClass288_1.anInt8244 + (int) ((double) (this.aClass288_1.anInt8236 - this.aClass288_1.anInt8244) * Math.random());
					@Pc(393) int local393 = (int) (Math.random() * (double) (this.aClass288_1.anInt8240 - this.aClass288_1.anInt8266)) + this.aClass288_1.anInt8266;
					@Pc(455) int local455;
					if (this.aClass288_1.aBoolean535) {
						@Pc(459) double local459 = Math.random();
						local455 = (int) ((double) this.aClass288_1.anInt8248 + (double) this.aClass288_1.anInt8262 * Math.random()) << 24 | (int) ((double) this.aClass288_1.anInt8258 * local459 + (double) this.aClass288_1.anInt8242) | (int) ((double) this.aClass288_1.anInt8277 * local459 + (double) this.aClass288_1.anInt8274) << 8 | (int) (local459 * (double) this.aClass288_1.anInt8278 + (double) this.aClass288_1.anInt8279) << 16;
					} else {
						local455 = (int) (Math.random() * (double) this.aClass288_1.anInt8262 + (double) this.aClass288_1.anInt8248) << 24 | (int) (Math.random() * (double) this.aClass288_1.anInt8278 + (double) this.aClass288_1.anInt8279) << 16 | (int) ((double) this.aClass288_1.anInt8274 + Math.random() * (double) this.aClass288_1.anInt8277) << 8 | (int) ((double) this.aClass288_1.anInt8242 + Math.random() * (double) this.aClass288_1.anInt8258);
					}
					@Pc(521) int local521 = this.aClass288_1.anInt8255;
					if (!arg3.method7497() && !this.aClass288_1.aBoolean530) {
						local521 = -1;
					}
					if (Static435.anInt7738 == Static173.anInt3149) {
						new Class60_Sub1_Sub1_Sub1(this, local190, local198, local202, local216, local210, local222, local358, local376, local455, local393, local521, this.aClass288_1.aBoolean531, this.aClass288_1.aBoolean537);
					} else {
						@Pc(561) Class60_Sub1_Sub1_Sub1 local561 = Static431.aClass60_Sub1_Sub1_Sub1Array2[Static435.anInt7738];
						Static435.anInt7738 = Static435.anInt7738 + 1 & 0x3FF;
						local561.method2311(this, local190, local198, local202, local216, local210, local222, local358, local376, local455, local393, local521, this.aClass288_1.aBoolean531, this.aClass288_1.aBoolean537);
					}
				}
			}
		}
		this.anInt5652 = 0;
		for (@Pc(604) Class60_Sub1_Sub1_Sub1 local604 = (Class60_Sub1_Sub1_Sub1) this.aClass349_9.method7890(); local604 != null; local604 = (Class60_Sub1_Sub1_Sub1) this.aClass349_9.method7896()) {
			local604.method2312(arg0, arg1);
			this.anInt5652++;
		}
		Static518.anInt8889 += this.anInt5652;
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(JBLclient!oa;)V")
	public void method4613(@OriginalArg(0) long arg0, @OriginalArg(2) Class90 arg1) {
		for (@Pc(16) Class60_Sub1_Sub1_Sub1 local16 = (Class60_Sub1_Sub1_Sub1) this.aClass349_9.method7890(); local16 != null; local16 = (Class60_Sub1_Sub1_Sub1) this.aClass349_9.method7896()) {
			local16.method2313(arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!lw", name = "c", descriptor = "(I)V")
	public void method4617() {
		this.anInt5655 = this.aClass33_2.anInt773;
		this.anInt5642 = this.aClass33_2.anInt777;
		this.anInt5639 = this.aClass33_2.anInt771;
		this.anInt5664 = this.aClass33_2.anInt776;
		this.anInt5643 = this.aClass33_2.anInt770;
		this.anInt5653 = this.aClass33_2.anInt782;
		this.anInt5640 = this.aClass33_2.anInt778;
		this.anInt5657 = this.aClass33_2.anInt780;
		this.anInt5647 = this.aClass33_2.anInt769;
		if (this.anInt5643 == this.anInt5647 && this.anInt5639 == this.anInt5643 && this.anInt5653 == this.anInt5664 && this.anInt5655 == this.anInt5664 && this.anInt5642 == this.anInt5657 && this.anInt5640 == this.anInt5642) {
			this.aBoolean404 = true;
			return;
		}
		this.aBoolean404 = false;
		@Pc(116) int local116 = (this.anInt5639 + this.anInt5647 + this.anInt5643) / 3;
		@Pc(128) int local128 = (this.anInt5655 + this.anInt5653 + this.anInt5664) / 3;
		@Pc(139) int local139 = (this.anInt5657 + this.anInt5642 + this.anInt5640) / 3;
		if (local116 == this.anInt5660 && local128 == this.anInt5648 && local139 == this.anInt5661) {
			return;
		}
		this.anInt5648 = local128;
		this.anInt5661 = local139;
		this.anInt5660 = local116;
		@Pc(175) int local175 = this.anInt5643 - this.anInt5647;
		@Pc(182) int local182 = this.anInt5664 - this.anInt5653;
		@Pc(188) int local188 = this.anInt5642 - this.anInt5657;
		@Pc(195) int local195 = this.anInt5639 - this.anInt5647;
		@Pc(202) int local202 = this.anInt5655 - this.anInt5653;
		@Pc(209) int local209 = this.anInt5640 - this.anInt5657;
		this.anInt5654 = local195 * local188 - local175 * local209;
		this.anInt5656 = local182 * local209 - local188 * local202;
		this.anInt5658 = local175 * local202 - local182 * local195;
		while (this.anInt5656 > 32767 || this.anInt5654 > 32767 || this.anInt5658 > 32767 || this.anInt5656 < -32767 || this.anInt5654 < -32767 || this.anInt5658 < -32767) {
			this.anInt5658 >>= 0x1;
			this.anInt5656 >>= 0x1;
			this.anInt5654 >>= 0x1;
		}
		@Pc(307) int local307 = (int) Math.sqrt((double) (this.anInt5658 * this.anInt5658 + this.anInt5654 * this.anInt5654 + this.anInt5656 * this.anInt5656));
		if (local307 <= 0) {
			local307 = 1;
		}
		this.anInt5654 = this.anInt5654 * 32767 / local307;
		this.anInt5658 = this.anInt5658 * 32767 / local307;
		this.anInt5656 = this.anInt5656 * 32767 / local307;
		if (this.aClass288_1.aShort102 <= 0 && this.aClass288_1.aShort103 <= 0) {
			return;
		}
		@Pc(357) int local357 = (int) (Math.atan2((double) this.anInt5658, (double) this.anInt5656) * 2607.5945876176133D);
		@Pc(378) int local378 = (int) (Math.atan2((double) this.anInt5654, Math.sqrt((double) (this.anInt5658 * this.anInt5658 + this.anInt5656 * this.anInt5656))) * 2607.5945876176133D);
		this.anInt5645 = this.aClass288_1.aShort102 - this.aClass288_1.aShort100;
		this.anInt5650 = local357 + this.aClass288_1.aShort100 - (this.anInt5645 >> 1);
		this.anInt5665 = this.aClass288_1.aShort103 - this.aClass288_1.aShort101;
		this.anInt5651 = local378 + this.aClass288_1.aShort101 - (this.anInt5665 >> 1);
	}
}
