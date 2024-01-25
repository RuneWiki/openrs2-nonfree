import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ik")
public final class Class25_Sub6 extends Class25 {

	@OriginalMember(owner = "client!ik", name = "p", descriptor = "I")
	public int anInt4630;

	@OriginalMember(owner = "client!ik", name = "D", descriptor = "I")
	private int anInt4633;

	@OriginalMember(owner = "client!ik", name = "E", descriptor = "I")
	private int anInt4634;

	@OriginalMember(owner = "client!ik", name = "F", descriptor = "I")
	private int anInt4635;

	@OriginalMember(owner = "client!ik", name = "G", descriptor = "I")
	private int anInt4636;

	@OriginalMember(owner = "client!ik", name = "H", descriptor = "I")
	private int anInt4637;

	@OriginalMember(owner = "client!ik", name = "I", descriptor = "I")
	private int anInt4638;

	@OriginalMember(owner = "client!ik", name = "J", descriptor = "I")
	private int anInt4639;

	@OriginalMember(owner = "client!ik", name = "q", descriptor = "I")
	private int anInt4631 = 0;

	@OriginalMember(owner = "client!ik", name = "z", descriptor = "Z")
	public boolean aBoolean297 = false;

	@OriginalMember(owner = "client!ik", name = "u", descriptor = "Lclient!tc;")
	public Class312 aClass312_1 = new Class312();

	@OriginalMember(owner = "client!ik", name = "B", descriptor = "Lclient!tc;")
	private Class312 aClass312_2 = new Class312();

	@OriginalMember(owner = "client!ik", name = "C", descriptor = "Z")
	private boolean aBoolean298 = false;

	@OriginalMember(owner = "client!ik", name = "v", descriptor = "J")
	private final long aLong107;

	@OriginalMember(owner = "client!ik", name = "w", descriptor = "Lclient!ti;")
	public final Class317 aClass317_1;

	@OriginalMember(owner = "client!ik", name = "m", descriptor = "Lclient!iu;")
	public final Class25_Sub7 aClass25_Sub7_3;

	@OriginalMember(owner = "client!ik", name = "n", descriptor = "Lclient!wg;")
	public Class358 aClass358_1;

	@OriginalMember(owner = "client!ik", name = "x", descriptor = "Lclient!qe;")
	public final Class269 aClass269_3;

	@OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(Lclient!r;Lclient!ti;Lclient!iu;J)V")
	public Class25_Sub6(@OriginalArg(0) Class31 arg0, @OriginalArg(1) Class317 arg1, @OriginalArg(2) Class25_Sub7 arg2, @OriginalArg(3) long arg3) {
		this.aLong107 = arg3;
		this.aClass317_1 = arg1;
		this.aClass25_Sub7_3 = arg2;
		this.aClass358_1 = this.aClass317_1.method6934();
		if (!arg0.method8074() && this.aClass358_1.anInt10157 != -1) {
			this.aClass358_1 = Static561.method7676(this.aClass358_1.anInt10157);
		}
		this.aClass269_3 = new Class269();
		this.anInt4631 = (int) ((double) this.anInt4631 + Math.random() * 64.0D);
		this.method3715();
		this.aClass312_2.anInt8761 = this.aClass312_1.anInt8761;
		this.aClass312_2.anInt8768 = this.aClass312_1.anInt8768;
		this.aClass312_2.anInt8767 = this.aClass312_1.anInt8767;
		this.aClass312_2.anInt8763 = this.aClass312_1.anInt8763;
		this.aClass312_2.anInt8756 = this.aClass312_1.anInt8756;
		this.aClass312_2.anInt8759 = this.aClass312_1.anInt8759;
		this.aClass312_2.anInt8766 = this.aClass312_1.anInt8766;
		this.aClass312_2.anInt8760 = this.aClass312_1.anInt8760;
		this.aClass312_2.anInt8765 = this.aClass312_1.anInt8765;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)V")
	public void method3715() {
		this.aClass312_1.anInt8756 = this.aClass317_1.anInt8863;
		this.aClass312_1.anInt8760 = this.aClass317_1.anInt8879;
		this.aClass312_1.anInt8767 = this.aClass317_1.anInt8862;
		this.aClass312_1.anInt8761 = this.aClass317_1.anInt8868;
		this.aClass312_1.anInt8768 = this.aClass317_1.anInt8875;
		this.aClass312_1.anInt8763 = this.aClass317_1.anInt8877;
		this.aClass312_1.anInt8759 = this.aClass317_1.anInt8864;
		this.aClass312_1.anInt8765 = this.aClass317_1.anInt8872;
		this.aClass312_1.anInt8766 = this.aClass317_1.anInt8865;
		if (this.aClass312_1.anInt8766 == this.aClass312_1.anInt8767 && this.aClass312_1.anInt8767 == this.aClass312_1.anInt8759 && this.aClass312_1.anInt8756 == this.aClass312_1.anInt8765 && this.aClass312_1.anInt8765 == this.aClass312_1.anInt8763 && this.aClass312_1.anInt8768 == this.aClass312_1.anInt8761 && this.aClass312_1.anInt8760 == this.aClass312_1.anInt8761) {
			this.aBoolean298 = true;
		} else if (this.aBoolean298) {
			this.aClass312_2.anInt8768 = this.aClass312_1.anInt8768;
			this.aClass312_2.anInt8767 = this.aClass312_1.anInt8767;
			this.aClass312_2.anInt8760 = this.aClass312_1.anInt8760;
			this.aClass312_2.anInt8761 = this.aClass312_1.anInt8761;
			this.aClass312_2.anInt8756 = this.aClass312_1.anInt8756;
			this.aClass312_2.anInt8766 = this.aClass312_1.anInt8766;
			this.aClass312_2.anInt8759 = this.aClass312_1.anInt8759;
			this.aClass312_2.anInt8765 = this.aClass312_1.anInt8765;
			this.aBoolean298 = false;
			this.aClass312_2.anInt8763 = this.aClass312_1.anInt8763;
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IJILclient!r;Z)V")
	public void method3716(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1, @OriginalArg(3) Class31 arg2, @OriginalArg(4) boolean arg3) {
		@Pc(52) int local52;
		if (this.aBoolean297) {
			arg3 = false;
		} else if (this.aClass358_1.anInt10167 > Static80.anInt2134) {
			arg3 = false;
		} else if (Static226.anInt4632 > Static78.anIntArray173[Static80.anInt2134]) {
			arg3 = false;
		} else if (this.aBoolean298) {
			arg3 = false;
		} else if (this.aClass358_1.anInt10156 != -1) {
			local52 = (int) (arg1 - this.aLong107);
			if (this.aClass358_1.aBoolean711 || this.aClass358_1.anInt10156 >= local52) {
				local52 %= this.aClass358_1.anInt10156;
			} else {
				arg3 = false;
			}
			if (!this.aClass358_1.aBoolean709 && local52 < this.aClass358_1.anInt10136) {
				arg3 = false;
			}
			if (this.aClass358_1.aBoolean709 && this.aClass358_1.anInt10136 <= local52) {
				arg3 = false;
			}
		}
		if (arg3) {
			Static266.anInt5087++;
			local52 = (this.aClass312_1.anInt8766 + this.aClass312_1.anInt8767 + this.aClass312_1.anInt8759) / 3;
			@Pc(140) int local140 = (this.aClass312_1.anInt8763 + this.aClass312_1.anInt8765 + this.aClass312_1.anInt8756) / 3;
			@Pc(155) int local155 = (this.aClass312_1.anInt8768 + this.aClass312_1.anInt8761 + this.aClass312_1.anInt8760) / 3;
			@Pc(195) int local195;
			@Pc(204) int local204;
			@Pc(212) int local212;
			@Pc(221) int local221;
			@Pc(229) int local229;
			@Pc(237) int local237;
			@Pc(338) int local338;
			@Pc(391) int local391;
			@Pc(413) int local413;
			if (local52 != this.aClass312_1.anInt8757 || local140 != this.aClass312_1.anInt8769 || local155 != this.aClass312_1.anInt8764) {
				this.aClass312_1.anInt8764 = local155;
				this.aClass312_1.anInt8769 = local140;
				this.aClass312_1.anInt8757 = local52;
				local195 = this.aClass312_1.anInt8767 - this.aClass312_1.anInt8766;
				local204 = this.aClass312_1.anInt8765 - this.aClass312_1.anInt8756;
				local212 = this.aClass312_1.anInt8761 - this.aClass312_1.anInt8768;
				local221 = this.aClass312_1.anInt8759 - this.aClass312_1.anInt8766;
				local229 = this.aClass312_1.anInt8763 - this.aClass312_1.anInt8756;
				local237 = this.aClass312_1.anInt8760 - this.aClass312_1.anInt8768;
				this.anInt4636 = local204 * local237 - local229 * local212;
				this.anInt4633 = local221 * local212 - local237 * local195;
				this.anInt4637 = local229 * local195 - local221 * local204;
				while (true) {
					if (this.anInt4636 <= 32767 && this.anInt4633 <= 32767 && this.anInt4637 <= 32767 && this.anInt4636 >= -32767 && this.anInt4633 >= -32767 && this.anInt4637 >= -32767) {
						local338 = (int) Math.sqrt((double) (this.anInt4637 * this.anInt4637 + this.anInt4633 * this.anInt4633 + this.anInt4636 * this.anInt4636));
						if (local338 <= 0) {
							local338 = 1;
						}
						this.anInt4637 = this.anInt4637 * 32767 / local338;
						this.anInt4633 = this.anInt4633 * 32767 / local338;
						this.anInt4636 = this.anInt4636 * 32767 / local338;
						if (this.aClass358_1.aShort120 > 0 || this.aClass358_1.aShort122 > 0) {
							local391 = (int) (Math.atan2((double) this.anInt4637, (double) this.anInt4636) * 2607.5945876176133D);
							local413 = (int) (Math.atan2((double) this.anInt4633, Math.sqrt((double) (this.anInt4636 * this.anInt4636 + this.anInt4637 * this.anInt4637))) * 2607.5945876176133D);
							this.anInt4638 = this.aClass358_1.aShort120 - this.aClass358_1.aShort123;
							this.anInt4635 = this.aClass358_1.aShort122 - this.aClass358_1.aShort121;
							this.anInt4634 = this.aClass358_1.aShort123 + local391 - (this.anInt4638 >> 1);
							this.anInt4639 = this.aClass358_1.aShort121 + local413 - (this.anInt4635 >> 1);
						}
						break;
					}
					this.anInt4633 >>= 0x1;
					this.anInt4637 >>= 0x1;
					this.anInt4636 >>= 0x1;
				}
			}
			this.anInt4631 += (int) (((double) (this.aClass358_1.anInt10172 - this.aClass358_1.anInt10178) * Math.random() + (double) this.aClass358_1.anInt10178) * (double) arg0);
			if (this.anInt4631 > 63) {
				local195 = this.anInt4631 >> 6;
				this.anInt4631 &= 0x3F;
				for (local229 = 0; local229 < local195; local229++) {
					@Pc(564) int local564;
					@Pc(568) int local568;
					if (this.aClass358_1.aShort120 <= 0 && this.aClass358_1.aShort122 <= 0) {
						local221 = this.anInt4637;
						local204 = this.anInt4636;
						local212 = this.anInt4633;
					} else {
						local237 = this.anInt4634 + (int) ((double) this.anInt4638 * Math.random());
						local237 &= 0x3FFF;
						local338 = Class3_Sub28.anIntArray232[local237];
						local391 = Class3_Sub28.anIntArray231[local237];
						local413 = this.anInt4639 + (int) ((double) this.anInt4635 * Math.random());
						local413 &= 0x1FFF;
						local564 = Class3_Sub28.anIntArray232[local413];
						local568 = Class3_Sub28.anIntArray231[local413];
						local212 = (local568 << 1) * -1;
						local204 = local564 * local391 >> 13;
						local221 = local338 * local564 >> 13;
					}
					@Pc(591) float local591 = (float) Math.random();
					@Pc(594) float local594 = (float) Math.random();
					if (local591 + local594 > 1.0F) {
						local591 = 1.0F - local591;
						local594 = 1.0F - local594;
					}
					@Pc(615) float local615 = 1.0F - local591 - local594;
					local413 = (int) (local615 * (float) this.aClass312_1.anInt8759 + local594 * (float) this.aClass312_1.anInt8767 + (float) this.aClass312_1.anInt8766 * local591);
					local564 = (int) (local594 * (float) this.aClass312_1.anInt8765 + (float) this.aClass312_1.anInt8756 * local591 + (float) this.aClass312_1.anInt8763 * local615);
					local568 = (int) (local591 * (float) this.aClass312_1.anInt8768 + local594 * (float) this.aClass312_1.anInt8761 + local615 * (float) this.aClass312_1.anInt8760);
					@Pc(703) int local703 = (int) ((float) this.aClass312_2.anInt8766 * local591 + local594 * (float) this.aClass312_2.anInt8767 + local615 * (float) this.aClass312_2.anInt8759);
					@Pc(725) int local725 = (int) (local615 * (float) this.aClass312_2.anInt8763 + (float) this.aClass312_2.anInt8765 * local594 + local591 * (float) this.aClass312_2.anInt8756);
					@Pc(747) int local747 = (int) (local615 * (float) this.aClass312_2.anInt8760 + local591 * (float) this.aClass312_2.anInt8768 + (float) this.aClass312_2.anInt8761 * local594);
					@Pc(752) int local752 = local413 - local703;
					@Pc(757) int local757 = local564 - local725;
					@Pc(761) int local761 = local568 - local747;
					@Pc(770) int local770 = (int) ((double) local703 + Math.random() * (double) local752);
					@Pc(779) int local779 = (int) ((double) local725 + Math.random() * (double) local757);
					@Pc(788) int local788 = (int) (Math.random() * (double) local761 + (double) local747);
					@Pc(805) int local805 = this.aClass358_1.anInt10145 + (int) (Math.random() * (double) (this.aClass358_1.anInt10151 - this.aClass358_1.anInt10145));
					@Pc(822) int local822 = this.aClass358_1.anInt10170 + (int) (Math.random() * (double) (this.aClass358_1.anInt10152 - this.aClass358_1.anInt10170));
					@Pc(839) int local839 = (int) ((double) (this.aClass358_1.anInt10158 - this.aClass358_1.anInt10133) * Math.random()) + this.aClass358_1.anInt10133;
					@Pc(903) int local903;
					if (this.aClass358_1.aBoolean712) {
						@Pc(845) double local845 = Math.random();
						local903 = (int) ((double) this.aClass358_1.anInt10165 + (double) this.aClass358_1.anInt10161 * Math.random()) << 24 | (int) ((double) this.aClass358_1.anInt10141 + (double) this.aClass358_1.anInt10182 * local845) | (int) ((double) this.aClass358_1.anInt10176 + local845 * (double) this.aClass358_1.anInt10181) << 8 | (int) ((double) this.aClass358_1.anInt10169 + (double) this.aClass358_1.anInt10137 * local845) << 16;
					} else {
						local903 = (int) ((double) this.aClass358_1.anInt10141 + (double) this.aClass358_1.anInt10182 * Math.random()) | (int) ((double) this.aClass358_1.anInt10169 + (double) this.aClass358_1.anInt10137 * Math.random()) << 16 | (int) ((double) this.aClass358_1.anInt10176 + (double) this.aClass358_1.anInt10181 * Math.random()) << 8 | (int) ((double) this.aClass358_1.anInt10165 + Math.random() * (double) this.aClass358_1.anInt10161) << 24;
					}
					@Pc(967) int local967 = this.aClass358_1.anInt10162;
					if (!arg2.method8074() && !this.aClass358_1.aBoolean710) {
						local967 = -1;
					}
					if (Static345.anInt6222 == Static235.anInt4718) {
						new Class25_Sub5_Sub1_Sub1(this, local770, local779, local788, local204, local212, local221, local805, local822, local903, local839, local967, this.aClass358_1.aBoolean706, this.aClass358_1.aBoolean705);
					} else {
						@Pc(1011) Class25_Sub5_Sub1_Sub1 local1011 = Static520.aClass25_Sub5_Sub1_Sub1Array2[Static235.anInt4718];
						Static235.anInt4718 = Static235.anInt4718 + 1 & 0x3FF;
						local1011.method6971(this, local770, local779, local788, local204, local212, local221, local805, local822, local903, local839, local967, this.aClass358_1.aBoolean706, this.aClass358_1.aBoolean705);
					}
				}
			}
		}
		if (!this.aClass312_1.method6843(this.aClass312_2)) {
			@Pc(1051) Class312 local1051 = this.aClass312_2;
			this.aClass312_2 = this.aClass312_1;
			this.aClass312_1 = local1051;
			this.aClass312_1.anInt8768 = this.aClass317_1.anInt8875;
			this.aClass312_1.anInt8765 = this.aClass317_1.anInt8872;
			this.aClass312_1.anInt8756 = this.aClass317_1.anInt8863;
			this.aClass312_1.anInt8766 = this.aClass317_1.anInt8865;
			this.aClass312_1.anInt8761 = this.aClass317_1.anInt8868;
			this.aClass312_1.anInt8759 = this.aClass317_1.anInt8864;
			this.aClass312_1.anInt8767 = this.aClass317_1.anInt8862;
			this.aClass312_1.anInt8763 = this.aClass317_1.anInt8877;
			this.aClass312_1.anInt8760 = this.aClass317_1.anInt8879;
		}
		this.anInt4630 = 0;
		for (@Pc(1121) Class25_Sub5_Sub1_Sub1 local1121 = (Class25_Sub5_Sub1_Sub1) this.aClass269_3.method5974(); local1121 != null; local1121 = (Class25_Sub5_Sub1_Sub1) this.aClass269_3.method5979()) {
			local1121.method6969(arg1, arg0);
			this.anInt4630++;
		}
		Static65.anInt1813 += this.anInt4630;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(JLclient!r;I)V")
	public void method3718(@OriginalArg(0) long arg0, @OriginalArg(1) Class31 arg1) {
		for (@Pc(17) Class25_Sub5_Sub1_Sub1 local17 = (Class25_Sub5_Sub1_Sub1) this.aClass269_3.method5974(); local17 != null; local17 = (Class25_Sub5_Sub1_Sub1) this.aClass269_3.method5979()) {
			local17.method6970(arg1, arg0);
		}
	}
}
