import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ra")
public final class Class4_Sub6 extends Class4 {

	@OriginalMember(owner = "client!ra", name = "m", descriptor = "I")
	private int anInt7516;

	@OriginalMember(owner = "client!ra", name = "o", descriptor = "I")
	private int anInt7518;

	@OriginalMember(owner = "client!ra", name = "p", descriptor = "I")
	public int anInt7519;

	@OriginalMember(owner = "client!ra", name = "q", descriptor = "I")
	private int anInt7520;

	@OriginalMember(owner = "client!ra", name = "t", descriptor = "I")
	private int anInt7522;

	@OriginalMember(owner = "client!ra", name = "u", descriptor = "I")
	private int anInt7523;

	@OriginalMember(owner = "client!ra", name = "v", descriptor = "I")
	private int anInt7524;

	@OriginalMember(owner = "client!ra", name = "w", descriptor = "I")
	private int anInt7525;

	@OriginalMember(owner = "client!ra", name = "A", descriptor = "I")
	public int anInt7528;

	@OriginalMember(owner = "client!ra", name = "C", descriptor = "I")
	private int anInt7529;

	@OriginalMember(owner = "client!ra", name = "D", descriptor = "I")
	private int anInt7530;

	@OriginalMember(owner = "client!ra", name = "E", descriptor = "I")
	public int anInt7531;

	@OriginalMember(owner = "client!ra", name = "G", descriptor = "I")
	private int anInt7532;

	@OriginalMember(owner = "client!ra", name = "H", descriptor = "I")
	private int anInt7533;

	@OriginalMember(owner = "client!ra", name = "J", descriptor = "I")
	private int anInt7534;

	@OriginalMember(owner = "client!ra", name = "K", descriptor = "I")
	private int anInt7535;

	@OriginalMember(owner = "client!ra", name = "M", descriptor = "I")
	private int anInt7536;

	@OriginalMember(owner = "client!ra", name = "N", descriptor = "I")
	private int anInt7537;

	@OriginalMember(owner = "client!ra", name = "Q", descriptor = "I")
	private int anInt7539;

	@OriginalMember(owner = "client!ra", name = "R", descriptor = "I")
	public int anInt7540;

	@OriginalMember(owner = "client!ra", name = "F", descriptor = "Z")
	public boolean aBoolean523 = false;

	@OriginalMember(owner = "client!ra", name = "z", descriptor = "I")
	private int anInt7527 = 0;

	@OriginalMember(owner = "client!ra", name = "S", descriptor = "Z")
	private boolean aBoolean524 = false;

	@OriginalMember(owner = "client!ra", name = "O", descriptor = "Lclient!fca;")
	public final Class83 aClass83_2;

	@OriginalMember(owner = "client!ra", name = "L", descriptor = "J")
	private final long aLong231;

	@OriginalMember(owner = "client!ra", name = "r", descriptor = "Lclient!kw;")
	public final Class4_Sub4 aClass4_Sub4_6;

	@OriginalMember(owner = "client!ra", name = "x", descriptor = "Lclient!gk;")
	public Class108 aClass108_1;

	@OriginalMember(owner = "client!ra", name = "I", descriptor = "Lclient!fh;")
	public final Class90 aClass90_14;

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Lclient!oa;Lclient!fca;Lclient!kw;J)V")
	public Class4_Sub6(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class83 arg1, @OriginalArg(2) Class4_Sub4 arg2, @OriginalArg(3) long arg3) {
		this.aClass83_2 = arg1;
		this.aLong231 = arg3;
		this.aClass4_Sub4_6 = arg2;
		this.aClass108_1 = this.aClass83_2.method2262();
		if (!arg0.method7431() && this.aClass108_1.anInt3742 != -1) {
			this.aClass108_1 = Static7.method550(this.aClass108_1.anInt3742);
		}
		this.aClass90_14 = new Class90();
		this.anInt7527 = (int) ((double) this.anInt7527 + Math.random() * 64.0D);
		this.method6195();
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(ZLclient!oa;JII)V")
	public void method6194(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3) {
		@Pc(49) int local49;
		if (this.aBoolean523) {
			arg0 = false;
		} else if (Static206.anInt4562 < this.aClass108_1.anInt3758) {
			arg0 = false;
		} else if (Static283.anIntArray515[Static206.anInt4562] < Static244.anInt5026) {
			arg0 = false;
		} else if (this.aBoolean524) {
			arg0 = false;
		} else if (this.aClass108_1.anInt3747 != -1) {
			local49 = (int) (arg2 - this.aLong231);
			if (this.aClass108_1.aBoolean283 || this.aClass108_1.anInt3747 >= local49) {
				local49 %= this.aClass108_1.anInt3747;
			} else {
				arg0 = false;
			}
			if (!this.aClass108_1.aBoolean284 && local49 < this.aClass108_1.anInt3767) {
				arg0 = false;
			}
			if (this.aClass108_1.aBoolean284 && this.aClass108_1.anInt3767 <= local49) {
				arg0 = false;
			}
		}
		if (arg0) {
			this.anInt7527 += (int) ((double) arg3 * ((double) (this.aClass108_1.anInt3743 - this.aClass108_1.anInt3763) * Math.random() + (double) this.aClass108_1.anInt3763));
			if (this.anInt7527 > 63) {
				local49 = this.anInt7527 >> 6;
				this.anInt7527 &= 0x3F;
				for (@Pc(150) int local150 = 0; local150 < local49; local150++) {
					@Pc(166) int local166;
					@Pc(169) int local169;
					@Pc(163) int local163;
					@Pc(181) int local181;
					@Pc(189) int local189;
					@Pc(193) int local193;
					@Pc(204) int local204;
					@Pc(212) int local212;
					@Pc(216) int local216;
					if (this.aClass108_1.aShort64 <= 0 && this.aClass108_1.aShort67 <= 0) {
						local163 = this.anInt7518;
						local166 = this.anInt7525;
						local169 = this.anInt7522;
					} else {
						local181 = (int) (Math.random() * (double) this.anInt7539) + this.anInt7534;
						@Pc(185) int local185 = local181 & 0x3FFF;
						local189 = Class5.anIntArray761[local185];
						local193 = Class5.anIntArray760[local185];
						local204 = this.anInt7529 + (int) (Math.random() * (double) this.anInt7524);
						@Pc(208) int local208 = local204 & 0x1FFF;
						local212 = Class5.anIntArray761[local208];
						local216 = Class5.anIntArray760[local208];
						local169 = (local216 << 1) * -1;
						local166 = local193 * local212 >> 13;
						local163 = local212 * local189 >> 13;
					}
					local181 = (int) (Math.random() * 65535.0D);
					local189 = (int) (Math.random() * 65535.0D);
					if (local181 + local189 > 65535) {
						local181 = 65535 - local181;
						local189 = 65535 - local189;
					}
					local193 = 65535 - local189 - local181;
					local204 = (int) ((long) local193 * (long) this.anInt7532 + (long) local181 * (long) this.anInt7523 + (long) local189 * (long) this.anInt7537 >> 16);
					local212 = (int) ((long) local189 * (long) this.anInt7533 + (long) this.anInt7516 * (long) local181 + (long) this.anInt7520 * (long) local193 >> 16);
					local216 = (int) ((long) local189 * (long) this.anInt7535 + (long) this.anInt7536 * (long) local181 + (long) local193 * (long) this.anInt7530 >> 16);
					@Pc(362) int local362 = this.aClass108_1.anInt3755 + (int) ((double) (this.aClass108_1.anInt3766 - this.aClass108_1.anInt3755) * Math.random());
					@Pc(380) int local380 = this.aClass108_1.anInt3734 + (int) (Math.random() * (double) (this.aClass108_1.anInt3770 - this.aClass108_1.anInt3734));
					@Pc(397) int local397 = (int) ((double) (this.aClass108_1.anInt3723 - this.aClass108_1.anInt3756) * Math.random()) + this.aClass108_1.anInt3756;
					@Pc(459) int local459;
					if (this.aClass108_1.aBoolean281) {
						@Pc(463) double local463 = Math.random();
						local459 = (int) ((double) this.aClass108_1.anInt3736 * Math.random() + (double) this.aClass108_1.anInt3732) << 24 | (int) (local463 * (double) this.aClass108_1.anInt3762 + (double) this.aClass108_1.anInt3744) | (int) (local463 * (double) this.aClass108_1.anInt3745 + (double) this.aClass108_1.anInt3764) << 16 | (int) (local463 * (double) this.aClass108_1.anInt3741 + (double) this.aClass108_1.anInt3761) << 8;
					} else {
						local459 = (int) (Math.random() * (double) this.aClass108_1.anInt3736 + (double) this.aClass108_1.anInt3732) << 24 | (int) ((double) this.aClass108_1.anInt3744 + (double) this.aClass108_1.anInt3762 * Math.random()) | (int) (Math.random() * (double) this.aClass108_1.anInt3741 + (double) this.aClass108_1.anInt3761) << 8 | (int) (Math.random() * (double) this.aClass108_1.anInt3745 + (double) this.aClass108_1.anInt3764) << 16;
					}
					@Pc(525) int local525 = this.aClass108_1.anInt3750;
					if (!arg1.method7431() && !this.aClass108_1.aBoolean280) {
						local525 = -1;
					}
					if (Static223.anInt4826 == Static330.anInt6305) {
						new Class4_Sub3_Sub1_Sub1(this, local204, local212, local216, local166, local169, local163, local362, local380, local459, local397, local525, this.aClass108_1.aBoolean279, this.aClass108_1.aBoolean275);
					} else {
						@Pc(541) Class4_Sub3_Sub1_Sub1 local541 = Static294.aClass4_Sub3_Sub1_Sub1Array2[Static223.anInt4826];
						Static223.anInt4826 = Static223.anInt4826 + 1 & 0x3FF;
						local541.method4384(this, local204, local212, local216, local166, local169, local163, local362, local380, local459, local397, local525, this.aClass108_1.aBoolean279, this.aClass108_1.aBoolean275);
					}
				}
			}
		}
		this.anInt7528 = 0;
		for (@Pc(608) Class4_Sub3_Sub1_Sub1 local608 = (Class4_Sub3_Sub1_Sub1) this.aClass90_14.method2326(); local608 != null; local608 = (Class4_Sub3_Sub1_Sub1) this.aClass90_14.method2325()) {
			local608.method4386(arg2, arg3);
			this.anInt7528++;
		}
		Static243.anInt5018 += this.anInt7528;
	}

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "(B)V")
	public void method6195() {
		this.anInt7523 = this.aClass83_2.anInt2691;
		this.anInt7530 = this.aClass83_2.anInt2677;
		this.anInt7520 = this.aClass83_2.anInt2676;
		this.anInt7536 = this.aClass83_2.anInt2682;
		this.anInt7532 = this.aClass83_2.anInt2689;
		this.anInt7533 = this.aClass83_2.anInt2690;
		this.anInt7535 = this.aClass83_2.anInt2683;
		this.anInt7516 = this.aClass83_2.anInt2684;
		this.anInt7537 = this.aClass83_2.anInt2686;
		if (this.anInt7537 == this.anInt7523 && this.anInt7537 == this.anInt7532 && this.anInt7516 == this.anInt7533 && this.anInt7520 == this.anInt7533 && this.anInt7536 == this.anInt7535 && this.anInt7535 == this.anInt7530) {
			this.aBoolean524 = true;
			return;
		}
		this.aBoolean524 = false;
		@Pc(111) int local111 = (this.anInt7532 + this.anInt7523 + this.anInt7537) / 3;
		@Pc(122) int local122 = (this.anInt7520 + this.anInt7533 + this.anInt7516) / 3;
		@Pc(134) int local134 = (this.anInt7530 + this.anInt7536 + this.anInt7535) / 3;
		if (this.anInt7531 == local111 && this.anInt7519 == local122 && this.anInt7540 == local134) {
			return;
		}
		this.anInt7519 = local122;
		this.anInt7540 = local134;
		this.anInt7531 = local111;
		@Pc(167) int local167 = this.anInt7537 - this.anInt7523;
		@Pc(174) int local174 = this.anInt7533 - this.anInt7516;
		@Pc(181) int local181 = this.anInt7535 - this.anInt7536;
		@Pc(188) int local188 = this.anInt7532 - this.anInt7523;
		@Pc(195) int local195 = this.anInt7520 - this.anInt7516;
		@Pc(201) int local201 = this.anInt7530 - this.anInt7536;
		this.anInt7525 = local174 * local201 - local181 * local195;
		this.anInt7518 = local195 * local167 - local188 * local174;
		for (this.anInt7522 = local181 * local188 - local167 * local201; this.anInt7525 > 32767 || this.anInt7522 > 32767 || this.anInt7518 > 32767 || this.anInt7525 < -32767 || this.anInt7522 < -32767 || this.anInt7518 < -32767; this.anInt7522 >>= 0x1) {
			this.anInt7525 >>= 0x1;
			this.anInt7518 >>= 0x1;
		}
		@Pc(298) int local298 = (int) Math.sqrt((double) (this.anInt7525 * this.anInt7525 + this.anInt7522 * this.anInt7522 + this.anInt7518 * this.anInt7518));
		if (local298 <= 0) {
			local298 = 1;
		}
		this.anInt7525 = this.anInt7525 * 32767 / local298;
		this.anInt7518 = this.anInt7518 * 32767 / local298;
		this.anInt7522 = this.anInt7522 * 32767 / local298;
		if (this.aClass108_1.aShort64 <= 0 && this.aClass108_1.aShort67 <= 0) {
			return;
		}
		@Pc(348) int local348 = (int) (Math.atan2((double) this.anInt7518, (double) this.anInt7525) * 2607.5945876176133D);
		@Pc(369) int local369 = (int) (Math.atan2((double) this.anInt7522, Math.sqrt((double) (this.anInt7518 * this.anInt7518 + this.anInt7525 * this.anInt7525))) * 2607.5945876176133D);
		this.anInt7539 = this.aClass108_1.aShort64 - this.aClass108_1.aShort65;
		this.anInt7524 = this.aClass108_1.aShort67 - this.aClass108_1.aShort66;
		this.anInt7534 = this.aClass108_1.aShort65 + local348 - (this.anInt7539 >> 1);
		this.anInt7529 = local369 + this.aClass108_1.aShort66 - (this.anInt7524 >> 1);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(BLclient!oa;J)V")
	public void method6196(@OriginalArg(1) Class5 arg0, @OriginalArg(2) long arg1) {
		for (@Pc(15) Class4_Sub3_Sub1_Sub1 local15 = (Class4_Sub3_Sub1_Sub1) this.aClass90_14.method2326(); local15 != null; local15 = (Class4_Sub3_Sub1_Sub1) this.aClass90_14.method2325()) {
			local15.method4385(arg0, arg1);
		}
	}
}
