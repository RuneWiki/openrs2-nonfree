import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!or")
public final class Class8_Sub8 extends Class8 {

	@OriginalMember(owner = "client!or", name = "g", descriptor = "I")
	public int anInt6672;

	@OriginalMember(owner = "client!or", name = "t", descriptor = "I")
	private int anInt6678;

	@OriginalMember(owner = "client!or", name = "u", descriptor = "I")
	private int anInt6679;

	@OriginalMember(owner = "client!or", name = "w", descriptor = "I")
	private int anInt6680;

	@OriginalMember(owner = "client!or", name = "x", descriptor = "I")
	private int anInt6681;

	@OriginalMember(owner = "client!or", name = "y", descriptor = "I")
	private int anInt6682;

	@OriginalMember(owner = "client!or", name = "z", descriptor = "I")
	private int anInt6683;

	@OriginalMember(owner = "client!or", name = "A", descriptor = "I")
	private int anInt6684;

	@OriginalMember(owner = "client!or", name = "i", descriptor = "Z")
	public boolean aBoolean538 = false;

	@OriginalMember(owner = "client!or", name = "q", descriptor = "I")
	private int anInt6677 = 0;

	@OriginalMember(owner = "client!or", name = "n", descriptor = "Lclient!jl;")
	public Class175 aClass175_1 = new Class175();

	@OriginalMember(owner = "client!or", name = "s", descriptor = "Lclient!jl;")
	private Class175 aClass175_2 = new Class175();

	@OriginalMember(owner = "client!or", name = "v", descriptor = "Z")
	private boolean aBoolean539 = false;

	@OriginalMember(owner = "client!or", name = "m", descriptor = "Lclient!mca;")
	public final Class8_Sub7 aClass8_Sub7_6;

	@OriginalMember(owner = "client!or", name = "f", descriptor = "J")
	private final long aLong212;

	@OriginalMember(owner = "client!or", name = "l", descriptor = "Lclient!lea;")
	public final Class206 aClass206_2;

	@OriginalMember(owner = "client!or", name = "h", descriptor = "Lclient!nw;")
	public Class243 aClass243_1;

	@OriginalMember(owner = "client!or", name = "r", descriptor = "Lclient!li;")
	public final Class209 aClass209_5;

	@OriginalMember(owner = "client!or", name = "<init>", descriptor = "(Lclient!r;Lclient!lea;Lclient!mca;J)V")
	public Class8_Sub8(@OriginalArg(0) Class134 arg0, @OriginalArg(1) Class206 arg1, @OriginalArg(2) Class8_Sub7 arg2, @OriginalArg(3) long arg3) {
		this.aClass8_Sub7_6 = arg2;
		this.aLong212 = arg3;
		this.aClass206_2 = arg1;
		this.aClass243_1 = this.aClass206_2.method4130();
		if (!arg0.method6912() && this.aClass243_1.anInt6043 != -1) {
			this.aClass243_1 = Static98.method5019(this.aClass243_1.anInt6043);
		}
		this.aClass209_5 = new Class209();
		this.anInt6677 = (int) ((double) this.anInt6677 + Math.random() * 64.0D);
		this.method5345();
		this.aClass175_2.anInt4527 = this.aClass175_1.anInt4527;
		this.aClass175_2.anInt4522 = this.aClass175_1.anInt4522;
		this.aClass175_2.anInt4535 = this.aClass175_1.anInt4535;
		this.aClass175_2.anInt4532 = this.aClass175_1.anInt4532;
		this.aClass175_2.anInt4530 = this.aClass175_1.anInt4530;
		this.aClass175_2.anInt4526 = this.aClass175_1.anInt4526;
		this.aClass175_2.anInt4529 = this.aClass175_1.anInt4529;
		this.aClass175_2.anInt4525 = this.aClass175_1.anInt4525;
		this.aClass175_2.anInt4524 = this.aClass175_1.anInt4524;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(B)V")
	public void method5345() {
		this.aClass175_1.anInt4527 = this.aClass206_2.anInt5083;
		this.aClass175_1.anInt4524 = this.aClass206_2.anInt5073;
		this.aClass175_1.anInt4530 = this.aClass206_2.anInt5075;
		this.aClass175_1.anInt4529 = this.aClass206_2.anInt5082;
		this.aClass175_1.anInt4526 = this.aClass206_2.anInt5070;
		this.aClass175_1.anInt4532 = this.aClass206_2.anInt5081;
		this.aClass175_1.anInt4522 = this.aClass206_2.anInt5071;
		this.aClass175_1.anInt4535 = this.aClass206_2.anInt5072;
		this.aClass175_1.anInt4525 = this.aClass206_2.anInt5066;
		if (this.aClass175_1.anInt4535 == this.aClass175_1.anInt4525 && this.aClass175_1.anInt4535 == this.aClass175_1.anInt4527 && this.aClass175_1.anInt4532 == this.aClass175_1.anInt4526 && this.aClass175_1.anInt4526 == this.aClass175_1.anInt4530 && this.aClass175_1.anInt4522 == this.aClass175_1.anInt4524 && this.aClass175_1.anInt4529 == this.aClass175_1.anInt4522) {
			this.aBoolean539 = true;
		} else if (this.aBoolean539) {
			this.aClass175_2.anInt4529 = this.aClass175_1.anInt4529;
			this.aClass175_2.anInt4522 = this.aClass175_1.anInt4522;
			this.aClass175_2.anInt4524 = this.aClass175_1.anInt4524;
			this.aClass175_2.anInt4532 = this.aClass175_1.anInt4532;
			this.aClass175_2.anInt4530 = this.aClass175_1.anInt4530;
			this.aBoolean539 = false;
			this.aClass175_2.anInt4525 = this.aClass175_1.anInt4525;
			this.aClass175_2.anInt4535 = this.aClass175_1.anInt4535;
			this.aClass175_2.anInt4527 = this.aClass175_1.anInt4527;
			this.aClass175_2.anInt4526 = this.aClass175_1.anInt4526;
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(JBLclient!r;)V")
	public void method5346(@OriginalArg(0) long arg0, @OriginalArg(2) Class134 arg1) {
		for (@Pc(17) Class8_Sub2_Sub1_Sub1 local17 = (Class8_Sub2_Sub1_Sub1) this.aClass209_5.method4194(); local17 != null; local17 = (Class8_Sub2_Sub1_Sub1) this.aClass209_5.method4191()) {
			local17.method4235(arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(BIJZLclient!r;)V")
	public void method5347(@OriginalArg(1) int arg0, @OriginalArg(2) long arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class134 arg3) {
		@Pc(48) int local48;
		if (this.aBoolean538) {
			arg2 = false;
		} else if (Static390.anInt6750 < this.aClass243_1.anInt6051) {
			arg2 = false;
		} else if (Static334.anInt5669 > Static336.anIntArray457[Static390.anInt6750]) {
			arg2 = false;
		} else if (this.aBoolean539) {
			arg2 = false;
		} else if (this.aClass243_1.anInt6089 != -1) {
			local48 = (int) (arg1 - this.aLong212);
			if (this.aClass243_1.aBoolean477 || this.aClass243_1.anInt6089 >= local48) {
				local48 %= this.aClass243_1.anInt6089;
			} else {
				arg2 = false;
			}
			if (!this.aClass243_1.aBoolean476 && this.aClass243_1.anInt6073 > local48) {
				arg2 = false;
			}
			if (this.aClass243_1.aBoolean476 && local48 >= this.aClass243_1.anInt6073) {
				arg2 = false;
			}
		}
		if (arg2) {
			Static126.anInt2509++;
			local48 = (this.aClass175_1.anInt4535 + this.aClass175_1.anInt4525 + this.aClass175_1.anInt4527) / 3;
			@Pc(140) int local140 = (this.aClass175_1.anInt4526 + this.aClass175_1.anInt4532 + this.aClass175_1.anInt4530) / 3;
			@Pc(154) int local154 = (this.aClass175_1.anInt4529 + this.aClass175_1.anInt4522 + this.aClass175_1.anInt4524) / 3;
			@Pc(197) int local197;
			@Pc(206) int local206;
			@Pc(214) int local214;
			@Pc(223) int local223;
			@Pc(232) int local232;
			@Pc(241) int local241;
			@Pc(338) int local338;
			@Pc(391) int local391;
			@Pc(412) int local412;
			if (this.aClass175_1.anInt4528 != local48 || local140 != this.aClass175_1.anInt4521 || local154 != this.aClass175_1.anInt4533) {
				this.aClass175_1.anInt4528 = local48;
				this.aClass175_1.anInt4521 = local140;
				this.aClass175_1.anInt4533 = local154;
				local197 = this.aClass175_1.anInt4535 - this.aClass175_1.anInt4525;
				local206 = this.aClass175_1.anInt4526 - this.aClass175_1.anInt4532;
				local214 = this.aClass175_1.anInt4522 - this.aClass175_1.anInt4524;
				local223 = this.aClass175_1.anInt4527 - this.aClass175_1.anInt4525;
				local232 = this.aClass175_1.anInt4530 - this.aClass175_1.anInt4532;
				local241 = this.aClass175_1.anInt4529 - this.aClass175_1.anInt4524;
				this.anInt6679 = local232 * local197 - local223 * local206;
				this.anInt6678 = local206 * local241 - local232 * local214;
				this.anInt6681 = local214 * local223 - local241 * local197;
				while (true) {
					if (this.anInt6678 <= 32767 && this.anInt6681 <= 32767 && this.anInt6679 <= 32767 && this.anInt6678 >= -32767 && this.anInt6681 >= -32767 && this.anInt6679 >= -32767) {
						local338 = (int) Math.sqrt((double) (this.anInt6679 * this.anInt6679 + this.anInt6678 * this.anInt6678 + this.anInt6681 * this.anInt6681));
						if (local338 <= 0) {
							local338 = 1;
						}
						this.anInt6681 = this.anInt6681 * 32767 / local338;
						this.anInt6678 = this.anInt6678 * 32767 / local338;
						this.anInt6679 = this.anInt6679 * 32767 / local338;
						if (this.aClass243_1.aShort82 > 0 || this.aClass243_1.aShort81 > 0) {
							local391 = (int) (Math.atan2((double) this.anInt6679, (double) this.anInt6678) * 2607.5945876176133D);
							local412 = (int) (Math.atan2((double) this.anInt6681, Math.sqrt((double) (this.anInt6679 * this.anInt6679 + this.anInt6678 * this.anInt6678))) * 2607.5945876176133D);
							this.anInt6683 = this.aClass243_1.aShort82 - this.aClass243_1.aShort84;
							this.anInt6684 = this.aClass243_1.aShort81 - this.aClass243_1.aShort83;
							this.anInt6680 = local391 + this.aClass243_1.aShort84 - (this.anInt6683 >> 1);
							this.anInt6682 = local412 + this.aClass243_1.aShort83 - (this.anInt6684 >> 1);
						}
						break;
					}
					this.anInt6679 >>= 0x1;
					this.anInt6678 >>= 0x1;
					this.anInt6681 >>= 0x1;
				}
			}
			this.anInt6677 += (int) ((double) arg0 * ((double) (this.aClass243_1.anInt6071 - this.aClass243_1.anInt6045) * Math.random() + (double) this.aClass243_1.anInt6045));
			if (this.anInt6677 > 63) {
				local197 = this.anInt6677 >> 6;
				this.anInt6677 &= 0x3F;
				for (local232 = 0; local232 < local197; local232++) {
					@Pc(556) int local556;
					@Pc(560) int local560;
					if (this.aClass243_1.aShort82 <= 0 && this.aClass243_1.aShort81 <= 0) {
						local223 = this.anInt6679;
						local214 = this.anInt6681;
						local206 = this.anInt6678;
					} else {
						local241 = (int) (Math.random() * (double) this.anInt6683) + this.anInt6680;
						local241 &= 0x3FFF;
						local338 = Class1_Sub6_Sub2.anIntArray675[local241];
						local391 = Class1_Sub6_Sub2.anIntArray676[local241];
						local412 = this.anInt6682 + (int) ((double) this.anInt6684 * Math.random());
						local412 &= 0x1FFF;
						local556 = Class1_Sub6_Sub2.anIntArray675[local412];
						local560 = Class1_Sub6_Sub2.anIntArray676[local412];
						local214 = (local560 << 1) * -1;
						local206 = local391 * local556 >> 13;
						local223 = local338 * local556 >> 13;
					}
					@Pc(594) float local594 = (float) Math.random();
					@Pc(597) float local597 = (float) Math.random();
					if (local594 + local597 > 1.0F) {
						local597 = 1.0F - local597;
						local594 = 1.0F - local594;
					}
					@Pc(617) float local617 = 1.0F - local597 - local594;
					local412 = (int) (local617 * (float) this.aClass175_1.anInt4527 + (float) this.aClass175_1.anInt4525 * local594 + (float) this.aClass175_1.anInt4535 * local597);
					local556 = (int) (local617 * (float) this.aClass175_1.anInt4530 + local594 * (float) this.aClass175_1.anInt4532 + (float) this.aClass175_1.anInt4526 * local597);
					local560 = (int) ((float) this.aClass175_1.anInt4529 * local617 + (float) this.aClass175_1.anInt4522 * local597 + local594 * (float) this.aClass175_1.anInt4524);
					@Pc(705) int local705 = (int) ((float) this.aClass175_2.anInt4527 * local617 + local597 * (float) this.aClass175_2.anInt4535 + local594 * (float) this.aClass175_2.anInt4525);
					@Pc(727) int local727 = (int) ((float) this.aClass175_2.anInt4526 * local597 + (float) this.aClass175_2.anInt4532 * local594 + local617 * (float) this.aClass175_2.anInt4530);
					@Pc(749) int local749 = (int) (local597 * (float) this.aClass175_2.anInt4522 + local594 * (float) this.aClass175_2.anInt4524 + local617 * (float) this.aClass175_2.anInt4529);
					@Pc(754) int local754 = local412 - local705;
					@Pc(759) int local759 = local556 - local727;
					@Pc(764) int local764 = local560 - local749;
					@Pc(773) int local773 = (int) ((double) local754 * Math.random() + (double) local705);
					@Pc(782) int local782 = (int) ((double) local727 + (double) local759 * Math.random());
					@Pc(791) int local791 = (int) ((double) local749 + Math.random() * (double) local764);
					@Pc(808) int local808 = this.aClass243_1.anInt6065 + (int) (Math.random() * (double) (this.aClass243_1.anInt6085 - this.aClass243_1.anInt6065));
					@Pc(825) int local825 = (int) (Math.random() * (double) (this.aClass243_1.anInt6048 - this.aClass243_1.anInt6076)) + this.aClass243_1.anInt6076;
					@Pc(842) int local842 = this.aClass243_1.anInt6054 + (int) ((double) (this.aClass243_1.anInt6082 - this.aClass243_1.anInt6054) * Math.random());
					@Pc(904) int local904;
					if (this.aClass243_1.aBoolean478) {
						@Pc(908) double local908 = Math.random();
						local904 = (int) ((double) this.aClass243_1.anInt6058 + Math.random() * (double) this.aClass243_1.anInt6064) << 24 | (int) (local908 * (double) this.aClass243_1.anInt6088 + (double) this.aClass243_1.anInt6057) | (int) ((double) this.aClass243_1.anInt6062 + (double) this.aClass243_1.anInt6067 * local908) << 8 | (int) (local908 * (double) this.aClass243_1.anInt6086 + (double) this.aClass243_1.anInt6055) << 16;
					} else {
						local904 = (int) ((double) this.aClass243_1.anInt6064 * Math.random() + (double) this.aClass243_1.anInt6058) << 24 | (int) ((double) this.aClass243_1.anInt6062 + Math.random() * (double) this.aClass243_1.anInt6067) << 8 | (int) ((double) this.aClass243_1.anInt6086 * Math.random() + (double) this.aClass243_1.anInt6055) << 16 | (int) (Math.random() * (double) this.aClass243_1.anInt6088 + (double) this.aClass243_1.anInt6057);
					}
					@Pc(970) int local970 = this.aClass243_1.anInt6041;
					if (!arg3.method6912() && !this.aClass243_1.aBoolean472) {
						local970 = -1;
					}
					if (Static301.anInt5192 == Static51.anInt962) {
						new Class8_Sub2_Sub1_Sub1(this, local773, local782, local791, local206, local214, local223, local808, local825, local904, local842, local970, this.aClass243_1.aBoolean481, this.aClass243_1.aBoolean473);
					} else {
						@Pc(990) Class8_Sub2_Sub1_Sub1 local990 = Static434.aClass8_Sub2_Sub1_Sub1Array2[Static51.anInt962];
						Static51.anInt962 = Static51.anInt962 + 1 & 0x3FF;
						local990.method4234(this, local773, local782, local791, local206, local214, local223, local808, local825, local904, local842, local970, this.aClass243_1.aBoolean481, this.aClass243_1.aBoolean473);
					}
				}
			}
		}
		if (!this.aClass175_1.method3678(this.aClass175_2)) {
			@Pc(1058) Class175 local1058 = this.aClass175_2;
			this.aClass175_2 = this.aClass175_1;
			this.aClass175_1 = local1058;
			this.aClass175_1.anInt4532 = this.aClass206_2.anInt5081;
			this.aClass175_1.anInt4524 = this.aClass206_2.anInt5073;
			this.aClass175_1.anInt4526 = this.aClass206_2.anInt5070;
			this.aClass175_1.anInt4527 = this.aClass206_2.anInt5083;
			this.aClass175_1.anInt4529 = this.aClass206_2.anInt5082;
			this.aClass175_1.anInt4530 = this.aClass206_2.anInt5075;
			this.aClass175_1.anInt4522 = this.aClass206_2.anInt5071;
			this.aClass175_1.anInt4525 = this.aClass206_2.anInt5066;
			this.aClass175_1.anInt4535 = this.aClass206_2.anInt5072;
		}
		this.anInt6672 = 0;
		for (@Pc(1128) Class8_Sub2_Sub1_Sub1 local1128 = (Class8_Sub2_Sub1_Sub1) this.aClass209_5.method4194(); local1128 != null; local1128 = (Class8_Sub2_Sub1_Sub1) this.aClass209_5.method4191()) {
			local1128.method4236(arg1, arg0);
			this.anInt6672++;
		}
		Static269.anInt4744 += this.anInt6672;
	}
}
