import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lg")
public final class Class2_Sub3 extends Class2 {

	@OriginalMember(owner = "client!lg", name = "g", descriptor = "I")
	private int anInt3798;

	@OriginalMember(owner = "client!lg", name = "i", descriptor = "I")
	public int anInt3799;

	@OriginalMember(owner = "client!lg", name = "j", descriptor = "I")
	private int anInt3800;

	@OriginalMember(owner = "client!lg", name = "k", descriptor = "I")
	private int anInt3801;

	@OriginalMember(owner = "client!lg", name = "l", descriptor = "I")
	public int anInt3802;

	@OriginalMember(owner = "client!lg", name = "m", descriptor = "I")
	private int anInt3803;

	@OriginalMember(owner = "client!lg", name = "s", descriptor = "I")
	private int anInt3806;

	@OriginalMember(owner = "client!lg", name = "u", descriptor = "I")
	private int anInt3808;

	@OriginalMember(owner = "client!lg", name = "v", descriptor = "I")
	private int anInt3809;

	@OriginalMember(owner = "client!lg", name = "w", descriptor = "I")
	private int anInt3810;

	@OriginalMember(owner = "client!lg", name = "x", descriptor = "I")
	private int anInt3811;

	@OriginalMember(owner = "client!lg", name = "z", descriptor = "I")
	public int anInt3813;

	@OriginalMember(owner = "client!lg", name = "D", descriptor = "I")
	private int anInt3815;

	@OriginalMember(owner = "client!lg", name = "E", descriptor = "I")
	private int anInt3816;

	@OriginalMember(owner = "client!lg", name = "G", descriptor = "I")
	public int anInt3817;

	@OriginalMember(owner = "client!lg", name = "H", descriptor = "I")
	private int anInt3818;

	@OriginalMember(owner = "client!lg", name = "I", descriptor = "I")
	private int anInt3819;

	@OriginalMember(owner = "client!lg", name = "K", descriptor = "I")
	private int anInt3820;

	@OriginalMember(owner = "client!lg", name = "N", descriptor = "I")
	private int anInt3822;

	@OriginalMember(owner = "client!lg", name = "O", descriptor = "I")
	private int anInt3823;

	@OriginalMember(owner = "client!lg", name = "t", descriptor = "I")
	private int anInt3807 = 0;

	@OriginalMember(owner = "client!lg", name = "F", descriptor = "Z")
	public boolean aBoolean298 = false;

	@OriginalMember(owner = "client!lg", name = "A", descriptor = "Z")
	private boolean aBoolean297 = false;

	@OriginalMember(owner = "client!lg", name = "p", descriptor = "Lclient!hq;")
	public final Class89 aClass89_2;

	@OriginalMember(owner = "client!lg", name = "C", descriptor = "Lclient!nl;")
	public final Class2_Sub4 aClass2_Sub4_4;

	@OriginalMember(owner = "client!lg", name = "n", descriptor = "J")
	private final long aLong111;

	@OriginalMember(owner = "client!lg", name = "L", descriptor = "Lclient!tg;")
	public Class192 aClass192_1;

	@OriginalMember(owner = "client!lg", name = "h", descriptor = "Lclient!cl;")
	public final Class32 aClass32_7;

	static {
		new Class159("Invalid player name.", "Unzulässiger Charaktername!", "Nom de joueur incorrect.", "Nome de jogador inválido.");
	}

	@OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(Lclient!vq;Lclient!hq;Lclient!nl;J)V")
	public Class2_Sub3(@OriginalArg(0) Class47 arg0, @OriginalArg(1) Class89 arg1, @OriginalArg(2) Class2_Sub4 arg2, @OriginalArg(3) long arg3) {
		this.aClass89_2 = arg1;
		this.aClass2_Sub4_4 = arg2;
		this.aLong111 = arg3;
		this.aClass192_1 = Static322.method2258(this.aClass89_2.anInt2944);
		if (!arg0.method2710() && this.aClass192_1.anInt5837 != -1) {
			this.aClass192_1 = Static322.method2258(this.aClass192_1.anInt5837);
		}
		this.aClass32_7 = new Class32();
		this.anInt3807 = (int) ((double) this.anInt3807 + Math.random() * 64.0D);
		this.method3472();
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IJ)V")
	public void method3470(@OriginalArg(1) long arg0) {
		for (@Pc(11) Class2_Sub1_Sub1_Sub1 local11 = (Class2_Sub1_Sub1_Sub1) this.aClass32_7.method850(); local11 != null; local11 = (Class2_Sub1_Sub1_Sub1) this.aClass32_7.method846()) {
			local11.method4524(arg0);
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IZLclient!vq;ZJ)V")
	public void method3471(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class47 arg2, @OriginalArg(4) long arg3) {
		@Pc(37) int local37;
		if (this.aBoolean298) {
			arg1 = false;
		} else if (this.aClass192_1.anInt5834 > Static74.anInt1921) {
			arg1 = false;
		} else if (Static239.anInt4794 > Static350.anIntArray506[Static74.anInt1921]) {
			arg1 = false;
		} else if (this.aBoolean297) {
			arg1 = false;
		} else if (this.aClass192_1.anInt5821 != -1) {
			local37 = (int) (arg3 - this.aLong111);
			if (this.aClass192_1.aBoolean432 || local37 <= this.aClass192_1.anInt5821) {
				local37 %= this.aClass192_1.anInt5821;
			} else {
				arg1 = false;
			}
			if (!this.aClass192_1.aBoolean433 && local37 < this.aClass192_1.anInt5809) {
				arg1 = false;
			}
			if (this.aClass192_1.aBoolean433 && this.aClass192_1.anInt5809 <= local37) {
				arg1 = false;
			}
		}
		if (arg1) {
			this.anInt3807 += (int) (((double) this.aClass192_1.anInt5807 + Math.random() * (double) (this.aClass192_1.anInt5852 - this.aClass192_1.anInt5807)) * (double) arg0);
			if (this.anInt3807 > 63) {
				local37 = this.anInt3807 >> 6;
				this.anInt3807 &= 0x3F;
				for (@Pc(148) int local148 = 0; local148 < local37; local148++) {
					@Pc(170) int local170;
					@Pc(167) int local167;
					@Pc(164) int local164;
					@Pc(182) int local182;
					@Pc(190) int local190;
					@Pc(194) int local194;
					@Pc(204) int local204;
					@Pc(212) int local212;
					@Pc(216) int local216;
					if (this.aClass192_1.aShort89 <= 0 && this.aClass192_1.aShort88 <= 0) {
						local164 = this.anInt3810;
						local167 = this.anInt3820;
						local170 = this.anInt3819;
					} else {
						local182 = this.anInt3815 + (int) (Math.random() * (double) this.anInt3801);
						@Pc(186) int local186 = local182 & 0x3FFF;
						local190 = Class118_Sub1.anIntArray314[local186];
						local194 = Class118_Sub1.anIntArray317[local186];
						local204 = (int) ((double) this.anInt3811 * Math.random()) + this.anInt3808;
						@Pc(208) int local208 = local204 & 0x1FFF;
						local212 = Class118_Sub1.anIntArray314[local208];
						local216 = Class118_Sub1.anIntArray317[local208];
						local170 = local194 * local212 >> 15;
						local167 = local216 * -1;
						local164 = local190 * local212 >> 15;
					}
					local182 = (int) (Math.random() * 65535.0D);
					local190 = (int) (Math.random() * 65535.0D);
					if (local182 + local190 > 65535) {
						local182 = 65535 - local182;
						local190 = 65535 - local190;
					}
					local194 = 65535 - local182 - local190;
					local204 = this.anInt3806 * local182 + local190 * this.anInt3822 + local194 * this.anInt3818 >> 16;
					local212 = this.anInt3823 * local194 + local182 * this.anInt3803 + local190 * this.anInt3800 >> 16;
					local216 = this.anInt3798 * local190 + local182 * this.anInt3816 + this.anInt3809 * local194 >> 16;
					@Pc(335) int local335 = this.aClass192_1.anInt5857 + (int) ((double) (this.aClass192_1.anInt5860 - this.aClass192_1.anInt5857) * Math.random());
					@Pc(352) int local352 = this.aClass192_1.anInt5859 + (int) (Math.random() * (double) (this.aClass192_1.anInt5854 - this.aClass192_1.anInt5859));
					@Pc(369) int local369 = (int) (Math.random() * (double) (this.aClass192_1.anInt5858 - this.aClass192_1.anInt5845)) + this.aClass192_1.anInt5845;
					@Pc(433) int local433;
					if (this.aClass192_1.aBoolean429) {
						@Pc(375) double local375 = Math.random();
						local433 = (int) (local375 * (double) this.aClass192_1.anInt5829 + (double) this.aClass192_1.anInt5843) << 16 | (int) ((double) this.aClass192_1.anInt5841 * local375 + (double) this.aClass192_1.anInt5839) << 8 | (int) ((double) this.aClass192_1.anInt5848 + local375 * (double) this.aClass192_1.anInt5813) | (int) ((double) this.aClass192_1.anInt5856 * local375 + (double) this.aClass192_1.anInt5828) << 24;
					} else {
						local433 = (int) ((double) this.aClass192_1.anInt5828 + Math.random() * (double) this.aClass192_1.anInt5856) << 24 | (int) ((double) this.aClass192_1.anInt5841 * Math.random() + (double) this.aClass192_1.anInt5839) << 8 | (int) ((double) this.aClass192_1.anInt5843 + Math.random() * (double) this.aClass192_1.anInt5829) << 16 | (int) (Math.random() * (double) this.aClass192_1.anInt5813 + (double) this.aClass192_1.anInt5848);
					}
					@Pc(497) int local497 = this.aClass192_1.anInt5835;
					if (!arg2.method2710() && !this.aClass192_1.aBoolean434) {
						local497 = -1;
					}
					if (Static103.anInt2595 == Static276.anInt5506) {
						new Class2_Sub1_Sub1_Sub1(this, local204, local212, local216, local170, local167, local164, local335, local352, local433, local369, local497, this.aClass192_1.aBoolean430);
					} else {
						@Pc(517) Class2_Sub1_Sub1_Sub1 local517 = Static305.aClass2_Sub1_Sub1_Sub1Array4[Static103.anInt2595];
						Static103.anInt2595 = Static103.anInt2595 + 1 & 0x3FF;
						local517.method4525(this, local204, local212, local216, local170, local167, local164, local335, local352, local433, local369, local497, this.aClass192_1.aBoolean430);
					}
				}
			}
		}
		this.anInt3813 = 0;
		for (@Pc(584) Class2_Sub1_Sub1_Sub1 local584 = (Class2_Sub1_Sub1_Sub1) this.aClass32_7.method850(); local584 != null; local584 = (Class2_Sub1_Sub1_Sub1) this.aClass32_7.method846()) {
			local584.method4526(arg3, arg0);
			this.anInt3813++;
		}
		Static73.anInt2038 += this.anInt3813;
	}

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "(I)V")
	public void method3472() {
		this.anInt3818 = this.aClass89_2.anInt2932;
		this.anInt3800 = this.aClass89_2.anInt2937;
		this.anInt3823 = this.aClass89_2.anInt2933;
		this.anInt3809 = this.aClass89_2.anInt2942;
		this.anInt3806 = this.aClass89_2.anInt2947;
		this.anInt3822 = this.aClass89_2.anInt2945;
		this.anInt3816 = this.aClass89_2.anInt2936;
		this.anInt3803 = this.aClass89_2.anInt2934;
		this.anInt3798 = this.aClass89_2.anInt2941;
		if (this.anInt3822 == this.anInt3806 && this.anInt3818 == this.anInt3822 && this.anInt3800 == this.anInt3803 && this.anInt3823 == this.anInt3800 && this.anInt3798 == this.anInt3816 && this.anInt3809 == this.anInt3798) {
			this.aBoolean297 = true;
			return;
		}
		this.aBoolean297 = false;
		@Pc(110) int local110 = (this.anInt3822 + this.anInt3806 + this.anInt3818) / 3;
		@Pc(121) int local121 = (this.anInt3823 + this.anInt3800 + this.anInt3803) / 3;
		@Pc(133) int local133 = (this.anInt3798 + this.anInt3816 + this.anInt3809) / 3;
		if (this.anInt3817 == local110 && local121 == this.anInt3802 && this.anInt3799 == local133) {
			return;
		}
		this.anInt3817 = local110;
		this.anInt3799 = local133;
		this.anInt3802 = local121;
		@Pc(169) int local169 = this.anInt3822 - this.anInt3806;
		@Pc(176) int local176 = this.anInt3800 - this.anInt3803;
		@Pc(182) int local182 = this.anInt3798 - this.anInt3816;
		@Pc(189) int local189 = this.anInt3818 - this.anInt3806;
		@Pc(196) int local196 = this.anInt3823 - this.anInt3803;
		@Pc(203) int local203 = this.anInt3809 - this.anInt3816;
		this.anInt3820 = local182 * local189 - local169 * local203;
		this.anInt3810 = local196 * local169 - local189 * local176;
		this.anInt3819 = local176 * local203 - local182 * local196;
		while (this.anInt3819 > 32767 || this.anInt3820 > 32767 || this.anInt3810 > 32767 || this.anInt3819 < -32767 || this.anInt3820 < -32767 || this.anInt3810 < -32767) {
			this.anInt3810 >>= 0x1;
			this.anInt3819 >>= 0x1;
			this.anInt3820 >>= 0x1;
		}
		@Pc(301) int local301 = (int) Math.sqrt((double) (this.anInt3810 * this.anInt3810 + this.anInt3819 * this.anInt3819 + this.anInt3820 * this.anInt3820));
		if (local301 <= 0) {
			local301 = 1;
		}
		this.anInt3820 = this.anInt3820 * 32767 / local301;
		this.anInt3819 = this.anInt3819 * 32767 / local301;
		this.anInt3810 = this.anInt3810 * 32767 / local301;
		if (this.aClass192_1.aShort89 <= 0 && this.aClass192_1.aShort88 <= 0) {
			return;
		}
		@Pc(357) int local357 = (int) (Math.atan2((double) this.anInt3810, (double) this.anInt3819) * 2607.5945876176133D);
		@Pc(378) int local378 = (int) (Math.atan2((double) this.anInt3820, Math.sqrt((double) (this.anInt3819 * this.anInt3819 + this.anInt3810 * this.anInt3810))) * 2607.5945876176133D);
		this.anInt3801 = this.aClass192_1.aShort89 - this.aClass192_1.aShort90;
		this.anInt3815 = local357 + this.aClass192_1.aShort90 - (this.anInt3801 >> 1);
		this.anInt3811 = this.aClass192_1.aShort88 - this.aClass192_1.aShort91;
		this.anInt3808 = this.aClass192_1.aShort91 + local378 - (this.anInt3811 >> 1);
	}
}
