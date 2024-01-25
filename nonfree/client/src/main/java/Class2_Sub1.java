import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ab")
public final class Class2_Sub1 extends Class2 {

	@OriginalMember(owner = "client!ab", name = "h", descriptor = "I")
	private int anInt69;

	@OriginalMember(owner = "client!ab", name = "i", descriptor = "I")
	public int anInt70;

	@OriginalMember(owner = "client!ab", name = "k", descriptor = "I")
	private int anInt71;

	@OriginalMember(owner = "client!ab", name = "o", descriptor = "I")
	private int anInt73;

	@OriginalMember(owner = "client!ab", name = "p", descriptor = "I")
	private int anInt74;

	@OriginalMember(owner = "client!ab", name = "q", descriptor = "I")
	private int anInt75;

	@OriginalMember(owner = "client!ab", name = "r", descriptor = "I")
	private int anInt76;

	@OriginalMember(owner = "client!ab", name = "u", descriptor = "I")
	private int anInt78;

	@OriginalMember(owner = "client!ab", name = "v", descriptor = "I")
	private int anInt79;

	@OriginalMember(owner = "client!ab", name = "z", descriptor = "I")
	private int anInt81;

	@OriginalMember(owner = "client!ab", name = "A", descriptor = "I")
	private int anInt82;

	@OriginalMember(owner = "client!ab", name = "B", descriptor = "I")
	private int anInt83;

	@OriginalMember(owner = "client!ab", name = "C", descriptor = "I")
	private int anInt84;

	@OriginalMember(owner = "client!ab", name = "F", descriptor = "I")
	public int anInt86;

	@OriginalMember(owner = "client!ab", name = "G", descriptor = "I")
	private int anInt87;

	@OriginalMember(owner = "client!ab", name = "I", descriptor = "I")
	private int anInt89;

	@OriginalMember(owner = "client!ab", name = "J", descriptor = "I")
	public int anInt90;

	@OriginalMember(owner = "client!ab", name = "K", descriptor = "I")
	public int anInt91;

	@OriginalMember(owner = "client!ab", name = "O", descriptor = "I")
	private int anInt93;

	@OriginalMember(owner = "client!ab", name = "Q", descriptor = "I")
	private int anInt94;

	@OriginalMember(owner = "client!ab", name = "t", descriptor = "Z")
	public boolean aBoolean4 = false;

	@OriginalMember(owner = "client!ab", name = "j", descriptor = "Z")
	private boolean aBoolean3 = false;

	@OriginalMember(owner = "client!ab", name = "M", descriptor = "I")
	private int anInt92 = 0;

	@OriginalMember(owner = "client!ab", name = "E", descriptor = "Lclient!dea;")
	public final Class2_Sub3 aClass2_Sub3_1;

	@OriginalMember(owner = "client!ab", name = "y", descriptor = "Lclient!lh;")
	public final Class178 aClass178_1;

	@OriginalMember(owner = "client!ab", name = "w", descriptor = "J")
	private final long aLong6;

	@OriginalMember(owner = "client!ab", name = "N", descriptor = "Lclient!gn;")
	public Class107 aClass107_1;

	@OriginalMember(owner = "client!ab", name = "n", descriptor = "Lclient!jc;")
	public final Class145 aClass145_1;

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(Lclient!qa;Lclient!lh;Lclient!dea;J)V")
	public Class2_Sub1(@OriginalArg(0) Class9 arg0, @OriginalArg(1) Class178 arg1, @OriginalArg(2) Class2_Sub3 arg2, @OriginalArg(3) long arg3) {
		this.aClass2_Sub3_1 = arg2;
		this.aClass178_1 = arg1;
		this.aLong6 = arg3;
		this.aClass107_1 = this.aClass178_1.method4677();
		if (!arg0.method7630() && this.aClass107_1.anInt3637 != -1) {
			this.aClass107_1 = Static544.method7950(this.aClass107_1.anInt3637);
		}
		this.aClass145_1 = new Class145();
		this.anInt92 = (int) ((double) this.anInt92 + Math.random() * 64.0D);
		this.method209();
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(BJLclient!qa;)V")
	public void method207(@OriginalArg(1) long arg0, @OriginalArg(2) Class9 arg1) {
		for (@Pc(5) Class2_Sub4_Sub1_Sub1 local5 = (Class2_Sub4_Sub1_Sub1) this.aClass145_1.method3919(); local5 != null; local5 = (Class2_Sub4_Sub1_Sub1) this.aClass145_1.method3926()) {
			local5.method2406(arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)V")
	public void method209() {
		this.anInt69 = this.aClass178_1.anInt5380;
		this.anInt75 = this.aClass178_1.anInt5382;
		this.anInt73 = this.aClass178_1.anInt5385;
		this.anInt87 = this.aClass178_1.anInt5391;
		this.anInt74 = this.aClass178_1.anInt5387;
		this.anInt84 = this.aClass178_1.anInt5381;
		this.anInt81 = this.aClass178_1.anInt5393;
		this.anInt79 = this.aClass178_1.anInt5383;
		this.anInt89 = this.aClass178_1.anInt5395;
		if (this.anInt81 == this.anInt75 && this.anInt89 == this.anInt75 && this.anInt74 == this.anInt79 && this.anInt87 == this.anInt74 && this.anInt69 == this.anInt84 && this.anInt69 == this.anInt73) {
			this.aBoolean3 = true;
			return;
		}
		this.aBoolean3 = false;
		@Pc(118) int local118 = (this.anInt89 + this.anInt81 + this.anInt75) / 3;
		@Pc(130) int local130 = (this.anInt74 + this.anInt79 + this.anInt87) / 3;
		@Pc(142) int local142 = (this.anInt84 + this.anInt69 + this.anInt73) / 3;
		if (this.anInt70 == local118 && local130 == this.anInt91 && this.anInt86 == local142) {
			return;
		}
		this.anInt91 = local130;
		this.anInt70 = local118;
		this.anInt86 = local142;
		@Pc(175) int local175 = this.anInt75 - this.anInt81;
		@Pc(182) int local182 = this.anInt74 - this.anInt79;
		@Pc(189) int local189 = this.anInt69 - this.anInt84;
		@Pc(196) int local196 = this.anInt89 - this.anInt81;
		@Pc(203) int local203 = this.anInt87 - this.anInt79;
		@Pc(209) int local209 = this.anInt73 - this.anInt84;
		this.anInt93 = local175 * local203 - local196 * local182;
		this.anInt76 = local189 * local196 - local175 * local209;
		for (this.anInt78 = local182 * local209 - local189 * local203; this.anInt78 > 32767 || this.anInt76 > 32767 || this.anInt93 > 32767 || this.anInt78 < -32767 || this.anInt76 < -32767 || this.anInt93 < -32767; this.anInt78 >>= 0x1) {
			this.anInt76 >>= 0x1;
			this.anInt93 >>= 0x1;
		}
		@Pc(311) int local311 = (int) Math.sqrt((double) (this.anInt93 * this.anInt93 + this.anInt76 * this.anInt76 + this.anInt78 * this.anInt78));
		if (local311 <= 0) {
			local311 = 1;
		}
		this.anInt93 = this.anInt93 * 32767 / local311;
		this.anInt76 = this.anInt76 * 32767 / local311;
		this.anInt78 = this.anInt78 * 32767 / local311;
		if (this.aClass107_1.aShort65 <= 0 && this.aClass107_1.aShort62 <= 0) {
			return;
		}
		@Pc(367) int local367 = (int) (Math.atan2((double) this.anInt93, (double) this.anInt78) * 2607.5945876176133D);
		@Pc(388) int local388 = (int) (Math.atan2((double) this.anInt76, Math.sqrt((double) (this.anInt93 * this.anInt93 + this.anInt78 * this.anInt78))) * 2607.5945876176133D);
		this.anInt82 = this.aClass107_1.aShort65 - this.aClass107_1.aShort64;
		this.anInt94 = local367 + this.aClass107_1.aShort64 - (this.anInt82 >> 1);
		this.anInt71 = this.aClass107_1.aShort62 - this.aClass107_1.aShort63;
		this.anInt83 = this.aClass107_1.aShort63 + local388 - (this.anInt71 >> 1);
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(BJIZLclient!qa;)V")
	public void method211(@OriginalArg(1) long arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class9 arg3) {
		@Pc(41) int local41;
		if (this.aBoolean4) {
			arg2 = false;
		} else if (Static309.anInt5935 < this.aClass107_1.anInt3604) {
			arg2 = false;
		} else if (Static277.anInt5501 > Static35.anIntArray126[Static309.anInt5935]) {
			arg2 = false;
		} else if (this.aBoolean3) {
			arg2 = false;
		} else if (this.aClass107_1.anInt3625 != -1) {
			local41 = (int) (arg0 - this.aLong6);
			if (this.aClass107_1.aBoolean225 || this.aClass107_1.anInt3625 >= local41) {
				local41 %= this.aClass107_1.anInt3625;
			} else {
				arg2 = false;
			}
			if (!this.aClass107_1.aBoolean228 && this.aClass107_1.anInt3627 > local41) {
				arg2 = false;
			}
			if (this.aClass107_1.aBoolean228 && this.aClass107_1.anInt3627 <= local41) {
				arg2 = false;
			}
		}
		if (arg2) {
			this.anInt92 += (int) (((double) this.aClass107_1.anInt3606 + Math.random() * (double) (this.aClass107_1.anInt3611 - this.aClass107_1.anInt3606)) * (double) arg1);
			if (this.anInt92 > 63) {
				local41 = this.anInt92 >> 6;
				this.anInt92 &= 0x3F;
				for (@Pc(151) int local151 = 0; local151 < local41; local151++) {
					@Pc(170) int local170;
					@Pc(173) int local173;
					@Pc(176) int local176;
					@Pc(188) int local188;
					@Pc(196) int local196;
					@Pc(200) int local200;
					@Pc(211) int local211;
					@Pc(219) int local219;
					@Pc(223) int local223;
					if (this.aClass107_1.aShort65 <= 0 && this.aClass107_1.aShort62 <= 0) {
						local170 = this.anInt78;
						local173 = this.anInt76;
						local176 = this.anInt93;
					} else {
						local188 = (int) ((double) this.anInt82 * Math.random()) + this.anInt94;
						@Pc(192) int local192 = local188 & 0x3FFF;
						local196 = Class307.anIntArray744[local192];
						local200 = Class307.anIntArray743[local192];
						local211 = this.anInt83 + (int) ((double) this.anInt71 * Math.random());
						@Pc(215) int local215 = local211 & 0x1FFF;
						local219 = Class307.anIntArray744[local215];
						local223 = Class307.anIntArray743[local215];
						local170 = local200 * local219 >> 15;
						local173 = (local223 << 0) * -1;
						local176 = local219 * local196 >> 15;
					}
					local188 = (int) (Math.random() * 65535.0D);
					local196 = (int) (Math.random() * 65535.0D);
					if (local196 + local188 > 65535) {
						local196 = 65535 - local196;
						local188 = 65535 - local188;
					}
					local200 = 65535 - local188 - local196;
					local211 = (int) ((long) this.anInt75 * (long) local196 + (long) this.anInt81 * (long) local188 + (long) local200 * (long) this.anInt89 >> 16);
					local219 = (int) ((long) this.anInt79 * (long) local188 + (long) local196 * (long) this.anInt74 + (long) this.anInt87 * (long) local200 >> 16);
					local223 = (int) ((long) local200 * (long) this.anInt73 + (long) this.anInt69 * (long) local196 + (long) this.anInt84 * (long) local188 >> 16);
					@Pc(366) int local366 = this.aClass107_1.anInt3586 + (int) ((double) (this.aClass107_1.anInt3593 - this.aClass107_1.anInt3586) * Math.random());
					@Pc(382) int local382 = (int) ((double) (this.aClass107_1.anInt3631 - this.aClass107_1.anInt3635) * Math.random()) + this.aClass107_1.anInt3635;
					@Pc(399) int local399 = (int) ((double) (this.aClass107_1.anInt3609 - this.aClass107_1.anInt3622) * Math.random()) + this.aClass107_1.anInt3622;
					@Pc(463) int local463;
					if (this.aClass107_1.aBoolean229) {
						@Pc(405) double local405 = Math.random();
						local463 = (int) ((double) this.aClass107_1.anInt3601 + (double) this.aClass107_1.anInt3608 * Math.random()) << 24 | (int) ((double) this.aClass107_1.anInt3588 + (double) this.aClass107_1.anInt3633 * local405) | (int) ((double) this.aClass107_1.anInt3626 * local405 + (double) this.aClass107_1.anInt3613) << 16 | (int) (local405 * (double) this.aClass107_1.anInt3634 + (double) this.aClass107_1.anInt3617) << 8;
					} else {
						local463 = (int) ((double) this.aClass107_1.anInt3617 + (double) this.aClass107_1.anInt3634 * Math.random()) << 8 | (int) ((double) this.aClass107_1.anInt3626 * Math.random() + (double) this.aClass107_1.anInt3613) << 16 | (int) ((double) this.aClass107_1.anInt3588 + (double) this.aClass107_1.anInt3633 * Math.random()) | (int) ((double) this.aClass107_1.anInt3608 * Math.random() + (double) this.aClass107_1.anInt3601) << 24;
					}
					@Pc(527) int local527 = this.aClass107_1.anInt3592;
					if (!arg3.method7630() && !this.aClass107_1.aBoolean227) {
						local527 = -1;
					}
					if (Static270.anInt5256 == Static47.anInt1423) {
						new Class2_Sub4_Sub1_Sub1(this, local211, local219, local223, local170, local173, local176, local366, local382, local463, local399, local527, this.aClass107_1.aBoolean226, this.aClass107_1.aBoolean230);
					} else {
						@Pc(571) Class2_Sub4_Sub1_Sub1 local571 = Static259.aClass2_Sub4_Sub1_Sub1Array2[Static270.anInt5256];
						Static270.anInt5256 = Static270.anInt5256 + 1 & 0x3FF;
						local571.method2404(this, local211, local219, local223, local170, local173, local176, local366, local382, local463, local399, local527, this.aClass107_1.aBoolean226, this.aClass107_1.aBoolean230);
					}
				}
			}
		}
		this.anInt90 = 0;
		for (@Pc(610) Class2_Sub4_Sub1_Sub1 local610 = (Class2_Sub4_Sub1_Sub1) this.aClass145_1.method3919(); local610 != null; local610 = (Class2_Sub4_Sub1_Sub1) this.aClass145_1.method3926()) {
			local610.method2405(arg0, arg1);
			this.anInt90++;
		}
		Static406.anInt7096 += this.anInt90;
	}
}
