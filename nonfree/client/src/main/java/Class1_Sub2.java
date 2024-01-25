import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bq")
public final class Class1_Sub2 extends Class1 {

	@OriginalMember(owner = "client!bq", name = "h", descriptor = "I")
	private int anInt691;

	@OriginalMember(owner = "client!bq", name = "j", descriptor = "I")
	private int anInt692;

	@OriginalMember(owner = "client!bq", name = "l", descriptor = "I")
	private int anInt694;

	@OriginalMember(owner = "client!bq", name = "m", descriptor = "I")
	private int anInt695;

	@OriginalMember(owner = "client!bq", name = "n", descriptor = "I")
	private int anInt696;

	@OriginalMember(owner = "client!bq", name = "o", descriptor = "I")
	private int anInt697;

	@OriginalMember(owner = "client!bq", name = "u", descriptor = "I")
	private int anInt701;

	@OriginalMember(owner = "client!bq", name = "w", descriptor = "I")
	public int anInt702;

	@OriginalMember(owner = "client!bq", name = "y", descriptor = "I")
	private int anInt703;

	@OriginalMember(owner = "client!bq", name = "z", descriptor = "I")
	private int anInt704;

	@OriginalMember(owner = "client!bq", name = "B", descriptor = "I")
	private int anInt706;

	@OriginalMember(owner = "client!bq", name = "C", descriptor = "I")
	private int anInt707;

	@OriginalMember(owner = "client!bq", name = "D", descriptor = "I")
	private int anInt708;

	@OriginalMember(owner = "client!bq", name = "G", descriptor = "I")
	private int anInt710;

	@OriginalMember(owner = "client!bq", name = "H", descriptor = "I")
	public int anInt711;

	@OriginalMember(owner = "client!bq", name = "I", descriptor = "I")
	private int anInt712;

	@OriginalMember(owner = "client!bq", name = "L", descriptor = "I")
	private int anInt713;

	@OriginalMember(owner = "client!bq", name = "N", descriptor = "I")
	public int anInt714;

	@OriginalMember(owner = "client!bq", name = "S", descriptor = "I")
	private int anInt716;

	@OriginalMember(owner = "client!bq", name = "U", descriptor = "I")
	public int anInt718;

	@OriginalMember(owner = "client!bq", name = "x", descriptor = "Z")
	private boolean aBoolean37 = false;

	@OriginalMember(owner = "client!bq", name = "r", descriptor = "Z")
	public boolean aBoolean36 = false;

	@OriginalMember(owner = "client!bq", name = "t", descriptor = "I")
	private int anInt700 = 0;

	@OriginalMember(owner = "client!bq", name = "p", descriptor = "Lclient!kh;")
	public final Class115 aClass115_1;

	@OriginalMember(owner = "client!bq", name = "F", descriptor = "J")
	private final long aLong23;

	@OriginalMember(owner = "client!bq", name = "J", descriptor = "Lclient!pj;")
	public final Class1_Sub7 aClass1_Sub7_1;

	@OriginalMember(owner = "client!bq", name = "i", descriptor = "Lclient!qb;")
	public Class167 aClass167_1;

	@OriginalMember(owner = "client!bq", name = "v", descriptor = "Lclient!lc;")
	public final Class126 aClass126_1;

	@OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(Lclient!e;Lclient!kh;Lclient!pj;J)V")
	public Class1_Sub2(@OriginalArg(0) Class46 arg0, @OriginalArg(1) Class115 arg1, @OriginalArg(2) Class1_Sub7 arg2, @OriginalArg(3) long arg3) {
		this.aClass115_1 = arg1;
		this.aLong23 = arg3;
		this.aClass1_Sub7_1 = arg2;
		this.aClass167_1 = Static53.method1255(this.aClass115_1.anInt3461);
		if (!arg0.method5176() && this.aClass167_1.anInt4923 != -1) {
			this.aClass167_1 = Static53.method1255(this.aClass167_1.anInt4923);
		}
		this.aClass126_1 = new Class126();
		this.anInt700 = (int) ((double) this.anInt700 + Math.random() * 64.0D);
		this.method747();
	}

	@OriginalMember(owner = "client!bq", name = "c", descriptor = "(Z)V")
	public void method747() {
		this.anInt691 = this.aClass115_1.anInt3448;
		this.anInt710 = this.aClass115_1.anInt3443;
		this.anInt716 = this.aClass115_1.anInt3446;
		this.anInt708 = this.aClass115_1.anInt3441;
		this.anInt695 = this.aClass115_1.anInt3454;
		this.anInt704 = this.aClass115_1.anInt3444;
		this.anInt701 = this.aClass115_1.anInt3440;
		this.anInt697 = this.aClass115_1.anInt3459;
		this.anInt692 = this.aClass115_1.anInt3445;
		if (this.anInt704 == this.anInt692 && this.anInt716 == this.anInt704 && this.anInt697 == this.anInt701 && this.anInt695 == this.anInt701 && this.anInt708 == this.anInt710 && this.anInt691 == this.anInt708) {
			this.aBoolean37 = true;
			return;
		}
		this.aBoolean37 = false;
		@Pc(116) int local116 = (this.anInt716 + this.anInt704 + this.anInt692) / 3;
		@Pc(127) int local127 = (this.anInt695 + this.anInt701 + this.anInt697) / 3;
		@Pc(138) int local138 = (this.anInt691 + this.anInt710 + this.anInt708) / 3;
		if (local116 == this.anInt711 && local127 == this.anInt702 && local138 == this.anInt714) {
			return;
		}
		this.anInt711 = local116;
		this.anInt714 = local138;
		this.anInt702 = local127;
		@Pc(175) int local175 = this.anInt704 - this.anInt692;
		@Pc(182) int local182 = this.anInt701 - this.anInt697;
		@Pc(189) int local189 = this.anInt708 - this.anInt710;
		@Pc(195) int local195 = this.anInt716 - this.anInt692;
		@Pc(202) int local202 = this.anInt695 - this.anInt697;
		@Pc(208) int local208 = this.anInt691 - this.anInt710;
		this.anInt712 = local189 * local195 - local175 * local208;
		this.anInt706 = local182 * local208 - local202 * local189;
		this.anInt696 = local175 * local202 - local195 * local182;
		while (this.anInt706 > 32767 || this.anInt712 > 32767 || this.anInt696 > 32767 || this.anInt706 < -32767 || this.anInt712 < -32767 || this.anInt696 < -32767) {
			this.anInt696 >>= 0x1;
			this.anInt712 >>= 0x1;
			this.anInt706 >>= 0x1;
		}
		@Pc(305) int local305 = (int) Math.sqrt((double) (this.anInt696 * this.anInt696 + this.anInt706 * this.anInt706 + this.anInt712 * this.anInt712));
		if (local305 <= 0) {
			local305 = 1;
		}
		this.anInt706 = this.anInt706 * 32767 / local305;
		this.anInt712 = this.anInt712 * 32767 / local305;
		this.anInt696 = this.anInt696 * 32767 / local305;
		if (this.aClass167_1.aShort70 <= 0 && this.aClass167_1.aShort69 <= 0) {
			return;
		}
		@Pc(355) int local355 = (int) (Math.atan2((double) this.anInt696, (double) this.anInt706) * 2607.5945876176133D);
		@Pc(377) int local377 = (int) (Math.atan2((double) this.anInt712, Math.sqrt((double) (this.anInt706 * this.anInt706 + this.anInt696 * this.anInt696))) * 2607.5945876176133D);
		this.anInt694 = this.aClass167_1.aShort70 - this.aClass167_1.aShort67;
		this.anInt707 = this.aClass167_1.aShort69 - this.aClass167_1.aShort68;
		this.anInt703 = this.aClass167_1.aShort67 + local355 - (this.anInt694 >> 1);
		this.anInt713 = local377 + this.aClass167_1.aShort68 - (this.anInt707 >> 1);
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(ZJ)V")
	public void method748(@OriginalArg(1) long arg0) {
		for (@Pc(17) Class1_Sub1_Sub1_Sub1 local17 = (Class1_Sub1_Sub1_Sub1) this.aClass126_1.method3389(); local17 != null; local17 = (Class1_Sub1_Sub1_Sub1) this.aClass126_1.method3394()) {
			local17.method5715(arg0);
		}
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(JLclient!e;ZII)V")
	public void method750(@OriginalArg(0) long arg0, @OriginalArg(1) Class46 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(50) int local50;
		if (this.aBoolean36) {
			arg2 = false;
		} else if (Static95.anInt2210 < this.aClass167_1.lb) {
			arg2 = false;
		} else if (Static291.anIntArray507[Static95.anInt2210] < Static342.anInt6542) {
			arg2 = false;
		} else if (this.aBoolean37) {
			arg2 = false;
		} else if (this.aClass167_1.anInt4965 != -1) {
			local50 = (int) (arg0 - this.aLong23);
			if (this.aClass167_1.aBoolean328 || this.aClass167_1.anInt4965 >= local50) {
				local50 %= this.aClass167_1.anInt4965;
			} else {
				arg2 = false;
			}
			if (!this.aClass167_1.aBoolean332 && this.aClass167_1.anInt4959 > local50) {
				arg2 = false;
			}
			if (this.aClass167_1.aBoolean332 && this.aClass167_1.anInt4959 <= local50) {
				arg2 = false;
			}
		}
		if (arg2) {
			this.anInt700 += (int) ((double) arg3 * ((double) (this.aClass167_1.anInt4929 - this.aClass167_1.anInt4940) * Math.random() + (double) this.aClass167_1.anInt4940));
			if (this.anInt700 > 63) {
				local50 = this.anInt700 >> 6;
				this.anInt700 &= 0x3F;
				for (@Pc(148) int local148 = 0; local148 < local50; local148++) {
					@Pc(164) int local164;
					@Pc(167) int local167;
					@Pc(170) int local170;
					@Pc(182) int local182;
					@Pc(190) int local190;
					@Pc(194) int local194;
					@Pc(204) int local204;
					@Pc(212) int local212;
					@Pc(216) int local216;
					if (this.aClass167_1.aShort70 <= 0 && this.aClass167_1.aShort69 <= 0) {
						local164 = this.anInt706;
						local167 = this.anInt712;
						local170 = this.anInt696;
					} else {
						local182 = this.anInt703 + (int) ((double) this.anInt694 * Math.random());
						@Pc(186) int local186 = local182 & 0x3FFF;
						local190 = Class14_Sub3_Sub34.anIntArray547[local186];
						local194 = Class14_Sub3_Sub34.anIntArray546[local186];
						local204 = (int) (Math.random() * (double) this.anInt707) + this.anInt713;
						@Pc(208) int local208 = local204 & 0x1FFF;
						local212 = Class14_Sub3_Sub34.anIntArray547[local208];
						local216 = Class14_Sub3_Sub34.anIntArray546[local208];
						local164 = local212 * local194 >> 15;
						local167 = local216 * -1;
						local170 = local212 * local190 >> 15;
					}
					local182 = (int) (Math.random() * 65535.0D);
					local190 = (int) (Math.random() * 65535.0D);
					if (local182 + local190 > 65535) {
						local182 = 65535 - local182;
						local190 = 65535 - local190;
					}
					local194 = 65535 - local190 - local182;
					local204 = this.anInt704 * local190 + local182 * this.anInt692 + this.anInt716 * local194 >> 16;
					local212 = local182 * this.anInt697 + this.anInt701 * local190 + this.anInt695 * local194 >> 16;
					local216 = this.anInt710 * local182 + local190 * this.anInt708 + this.anInt691 * local194 >> 16;
					@Pc(333) int local333 = (int) ((double) (this.aClass167_1.anInt4942 - this.aClass167_1.anInt4964) * Math.random()) + this.aClass167_1.anInt4964;
					@Pc(349) int local349 = (int) ((double) (this.aClass167_1.anInt4943 - this.aClass167_1.anInt4932) * Math.random()) + this.aClass167_1.anInt4932;
					@Pc(366) int local366 = this.aClass167_1.anInt4938 + (int) ((double) (this.aClass167_1.anInt4963 - this.aClass167_1.anInt4938) * Math.random());
					@Pc(428) int local428;
					if (this.aClass167_1.aBoolean327) {
						@Pc(432) double local432 = Math.random();
						local428 = (int) (local432 * (double) this.aClass167_1.anInt4956 + (double) this.aClass167_1.anInt4947) << 24 | (int) ((double) this.aClass167_1.anInt4946 + (double) this.aClass167_1.anInt4926 * local432) << 8 | (int) ((double) this.aClass167_1.anInt4949 * local432 + (double) this.aClass167_1.anInt4931) << 16 | (int) ((double) this.aClass167_1.anInt4952 + local432 * (double) this.aClass167_1.anInt4950);
					} else {
						local428 = (int) ((double) this.aClass167_1.anInt4952 + Math.random() * (double) this.aClass167_1.anInt4950) | (int) ((double) this.aClass167_1.anInt4949 * Math.random() + (double) this.aClass167_1.anInt4931) << 16 | (int) ((double) this.aClass167_1.anInt4946 + Math.random() * (double) this.aClass167_1.anInt4926) << 8 | (int) (Math.random() * (double) this.aClass167_1.anInt4956 + (double) this.aClass167_1.anInt4947) << 24;
					}
					@Pc(494) int local494 = this.aClass167_1.anInt4958;
					if (!arg1.method5176() && !this.aClass167_1.aBoolean331) {
						local494 = -1;
					}
					if (Static22.anInt450 == Static30.anInt717) {
						new Class1_Sub1_Sub1_Sub1(this, local204, local212, local216, local164, local167, local170, local333, local349, local428, local366, local494, this.aClass167_1.aBoolean329);
					} else {
						@Pc(514) Class1_Sub1_Sub1_Sub1 local514 = Static138.aClass1_Sub1_Sub1_Sub1Array1[Static30.anInt717];
						Static30.anInt717 = Static30.anInt717 + 1 & 0x3FF;
						local514.method5714(this, local204, local212, local216, local164, local167, local170, local333, local349, local428, local366, local494, this.aClass167_1.aBoolean329);
					}
				}
			}
		}
		this.anInt718 = 0;
		for (@Pc(575) Class1_Sub1_Sub1_Sub1 local575 = (Class1_Sub1_Sub1_Sub1) this.aClass126_1.method3389(); local575 != null; local575 = (Class1_Sub1_Sub1_Sub1) this.aClass126_1.method3394()) {
			local575.method5712(arg0, arg3);
			this.anInt718++;
		}
		Static228.anInt4498 += this.anInt718;
	}
}
