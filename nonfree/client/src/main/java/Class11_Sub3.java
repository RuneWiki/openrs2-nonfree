import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dq")
public final class Class11_Sub3 extends Class11 {

	@OriginalMember(owner = "client!dq", name = "p", descriptor = "I")
	public int anInt1742;

	@OriginalMember(owner = "client!dq", name = "x", descriptor = "I")
	private int anInt1745;

	@OriginalMember(owner = "client!dq", name = "z", descriptor = "I")
	private int anInt1746;

	@OriginalMember(owner = "client!dq", name = "A", descriptor = "I")
	private int anInt1747;

	@OriginalMember(owner = "client!dq", name = "B", descriptor = "I")
	private int anInt1748;

	@OriginalMember(owner = "client!dq", name = "C", descriptor = "I")
	private int anInt1749;

	@OriginalMember(owner = "client!dq", name = "D", descriptor = "I")
	private int anInt1750;

	@OriginalMember(owner = "client!dq", name = "E", descriptor = "I")
	private int anInt1751;

	@OriginalMember(owner = "client!dq", name = "j", descriptor = "Z")
	public boolean aBoolean113 = false;

	@OriginalMember(owner = "client!dq", name = "m", descriptor = "I")
	private int anInt1740 = 0;

	@OriginalMember(owner = "client!dq", name = "r", descriptor = "Lclient!lb;")
	public Class199 aClass199_1 = new Class199();

	@OriginalMember(owner = "client!dq", name = "w", descriptor = "Lclient!lb;")
	private Class199 aClass199_2 = new Class199();

	@OriginalMember(owner = "client!dq", name = "y", descriptor = "Z")
	private boolean aBoolean114 = false;

	@OriginalMember(owner = "client!dq", name = "u", descriptor = "Lclient!ns;")
	public final Class244 aClass244_1;

	@OriginalMember(owner = "client!dq", name = "t", descriptor = "J")
	private final long aLong54;

	@OriginalMember(owner = "client!dq", name = "q", descriptor = "Lclient!oa;")
	public final Class11_Sub9 aClass11_Sub9_2;

	@OriginalMember(owner = "client!dq", name = "n", descriptor = "Lclient!df;")
	public Class59 aClass59_1;

	@OriginalMember(owner = "client!dq", name = "l", descriptor = "Lclient!kr;")
	public final Class196 aClass196_1;

	@OriginalMember(owner = "client!dq", name = "<init>", descriptor = "(Lclient!r;Lclient!ns;Lclient!oa;J)V")
	public Class11_Sub3(@OriginalArg(0) Class78 arg0, @OriginalArg(1) Class244 arg1, @OriginalArg(2) Class11_Sub9 arg2, @OriginalArg(3) long arg3) {
		this.aClass244_1 = arg1;
		this.aLong54 = arg3;
		this.aClass11_Sub9_2 = arg2;
		this.aClass59_1 = this.aClass244_1.method5296();
		if (!arg0.method6801() && this.aClass59_1.anInt1601 != -1) {
			this.aClass59_1 = Static528.method7270(this.aClass59_1.anInt1601);
		}
		this.aClass196_1 = new Class196();
		this.anInt1740 = (int) ((double) this.anInt1740 + Math.random() * 64.0D);
		this.method1464();
		this.aClass199_2.anInt5224 = this.aClass199_1.anInt5224;
		this.aClass199_2.anInt5222 = this.aClass199_1.anInt5222;
		this.aClass199_2.anInt5233 = this.aClass199_1.anInt5233;
		this.aClass199_2.anInt5229 = this.aClass199_1.anInt5229;
		this.aClass199_2.anInt5225 = this.aClass199_1.anInt5225;
		this.aClass199_2.anInt5238 = this.aClass199_1.anInt5238;
		this.aClass199_2.anInt5236 = this.aClass199_1.anInt5236;
		this.aClass199_2.anInt5234 = this.aClass199_1.anInt5234;
		this.aClass199_2.anInt5232 = this.aClass199_1.anInt5232;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(JILclient!r;)V")
	public void method1462(@OriginalArg(0) long arg0, @OriginalArg(2) Class78 arg1) {
		for (@Pc(7) Class11_Sub5_Sub1_Sub1 local7 = (Class11_Sub5_Sub1_Sub1) this.aClass196_1.method4024(); local7 != null; local7 = (Class11_Sub5_Sub1_Sub1) this.aClass196_1.method4028()) {
			local7.method3316(arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(ILclient!r;IZJ)V")
	public void method1463(@OriginalArg(1) Class78 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) long arg3) {
		@Pc(50) int local50;
		if (this.aBoolean113) {
			arg2 = false;
		} else if (Static129.anInt2578 < this.aClass59_1.anInt1600) {
			arg2 = false;
		} else if (Static223.anInt4112 > Static517.anIntArray545[Static129.anInt2578]) {
			arg2 = false;
		} else if (this.aBoolean114) {
			arg2 = false;
		} else if (this.aClass59_1.anInt1633 != -1) {
			local50 = (int) (arg3 - this.aLong54);
			if (this.aClass59_1.aBoolean104 || this.aClass59_1.anInt1633 >= local50) {
				local50 %= this.aClass59_1.anInt1633;
			} else {
				arg2 = false;
			}
			if (!this.aClass59_1.aBoolean109 && this.aClass59_1.anInt1618 > local50) {
				arg2 = false;
			}
			if (this.aClass59_1.aBoolean109 && this.aClass59_1.anInt1618 <= local50) {
				arg2 = false;
			}
		}
		if (arg2) {
			Static15.anInt444++;
			local50 = (this.aClass199_1.anInt5238 + this.aClass199_1.anInt5225 + this.aClass199_1.anInt5229) / 3;
			@Pc(139) int local139 = (this.aClass199_1.anInt5222 + this.aClass199_1.anInt5234 + this.aClass199_1.anInt5224) / 3;
			@Pc(153) int local153 = (this.aClass199_1.anInt5233 + this.aClass199_1.anInt5232 + this.aClass199_1.anInt5236) / 3;
			@Pc(193) int local193;
			@Pc(202) int local202;
			@Pc(211) int local211;
			@Pc(220) int local220;
			@Pc(229) int local229;
			@Pc(238) int local238;
			@Pc(342) int local342;
			@Pc(392) int local392;
			@Pc(413) int local413;
			if (local50 != this.aClass199_1.anInt5227 || local139 != this.aClass199_1.anInt5226 || this.aClass199_1.anInt5228 != local153) {
				this.aClass199_1.anInt5227 = local50;
				this.aClass199_1.anInt5226 = local139;
				this.aClass199_1.anInt5228 = local153;
				local193 = this.aClass199_1.anInt5229 - this.aClass199_1.anInt5225;
				local202 = this.aClass199_1.anInt5222 - this.aClass199_1.anInt5234;
				local211 = this.aClass199_1.anInt5233 - this.aClass199_1.anInt5232;
				local220 = this.aClass199_1.anInt5238 - this.aClass199_1.anInt5225;
				local229 = this.aClass199_1.anInt5224 - this.aClass199_1.anInt5234;
				local238 = this.aClass199_1.anInt5236 - this.aClass199_1.anInt5232;
				this.anInt1746 = local193 * local229 - local202 * local220;
				this.anInt1748 = local238 * local202 - local211 * local229;
				this.anInt1747 = local220 * local211 - local238 * local193;
				while (true) {
					if (this.anInt1748 <= 32767 && this.anInt1747 <= 32767 && this.anInt1746 <= 32767 && this.anInt1748 >= -32767 && this.anInt1747 >= -32767 && this.anInt1746 >= -32767) {
						local342 = (int) Math.sqrt((double) (this.anInt1748 * this.anInt1748 + this.anInt1747 * this.anInt1747 + this.anInt1746 * this.anInt1746));
						if (local342 <= 0) {
							local342 = 1;
						}
						this.anInt1746 = this.anInt1746 * 32767 / local342;
						this.anInt1748 = this.anInt1748 * 32767 / local342;
						this.anInt1747 = this.anInt1747 * 32767 / local342;
						if (this.aClass59_1.aShort24 > 0 || this.aClass59_1.aShort22 > 0) {
							local392 = (int) (Math.atan2((double) this.anInt1746, (double) this.anInt1748) * 2607.5945876176133D);
							local413 = (int) (Math.atan2((double) this.anInt1747, Math.sqrt((double) (this.anInt1748 * this.anInt1748 + this.anInt1746 * this.anInt1746))) * 2607.5945876176133D);
							this.anInt1749 = this.aClass59_1.aShort24 - this.aClass59_1.aShort23;
							this.anInt1745 = this.aClass59_1.aShort23 + local392 - (this.anInt1749 >> 1);
							this.anInt1751 = this.aClass59_1.aShort22 - this.aClass59_1.aShort25;
							this.anInt1750 = this.aClass59_1.aShort25 + local413 - (this.anInt1751 >> 1);
						}
						break;
					}
					this.anInt1747 >>= 0x1;
					this.anInt1746 >>= 0x1;
					this.anInt1748 >>= 0x1;
				}
			}
			this.anInt1740 += (int) ((double) arg1 * ((double) (this.aClass59_1.anInt1614 - this.aClass59_1.anInt1583) * Math.random() + (double) this.aClass59_1.anInt1583));
			if (this.anInt1740 > 63) {
				local193 = this.anInt1740 >> 6;
				this.anInt1740 &= 0x3F;
				for (local229 = 0; local229 < local193; local229++) {
					@Pc(566) int local566;
					@Pc(570) int local570;
					if (this.aClass59_1.aShort24 <= 0 && this.aClass59_1.aShort22 <= 0) {
						local202 = this.anInt1748;
						local220 = this.anInt1746;
						local211 = this.anInt1747;
					} else {
						local238 = this.anInt1745 + (int) (Math.random() * (double) this.anInt1749);
						local238 &= 0x3FFF;
						local342 = Class85_Sub8.anIntArray426[local238];
						local392 = Class85_Sub8.anIntArray427[local238];
						local413 = this.anInt1750 + (int) (Math.random() * (double) this.anInt1751);
						local413 &= 0x1FFF;
						local566 = Class85_Sub8.anIntArray426[local413];
						local570 = Class85_Sub8.anIntArray427[local413];
						local211 = (local570 << 1) * -1;
						local202 = local566 * local392 >> 13;
						local220 = local566 * local342 >> 13;
					}
					@Pc(593) float local593 = (float) Math.random();
					@Pc(596) float local596 = (float) Math.random();
					if (local593 + local596 > 1.0F) {
						local593 = 1.0F - local593;
						local596 = 1.0F - local596;
					}
					@Pc(618) float local618 = 1.0F - local596 - local593;
					local413 = (int) ((float) this.aClass199_1.anInt5238 * local618 + local593 * (float) this.aClass199_1.anInt5225 + local596 * (float) this.aClass199_1.anInt5229);
					local566 = (int) (local618 * (float) this.aClass199_1.anInt5224 + (float) this.aClass199_1.anInt5222 * local596 + local593 * (float) this.aClass199_1.anInt5234);
					local570 = (int) ((float) this.aClass199_1.anInt5232 * local593 + local596 * (float) this.aClass199_1.anInt5233 + (float) this.aClass199_1.anInt5236 * local618);
					@Pc(706) int local706 = (int) (local596 * (float) this.aClass199_2.anInt5229 + local593 * (float) this.aClass199_2.anInt5225 + (float) this.aClass199_2.anInt5238 * local618);
					@Pc(728) int local728 = (int) ((float) this.aClass199_2.anInt5224 * local618 + local596 * (float) this.aClass199_2.anInt5222 + (float) this.aClass199_2.anInt5234 * local593);
					@Pc(750) int local750 = (int) (local618 * (float) this.aClass199_2.anInt5236 + local593 * (float) this.aClass199_2.anInt5232 + (float) this.aClass199_2.anInt5233 * local596);
					@Pc(755) int local755 = local413 - local706;
					@Pc(760) int local760 = local566 - local728;
					@Pc(765) int local765 = local570 - local750;
					@Pc(774) int local774 = (int) ((double) local706 + Math.random() * (double) local755);
					@Pc(783) int local783 = (int) ((double) local760 * Math.random() + (double) local728);
					@Pc(792) int local792 = (int) ((double) local750 + Math.random() * (double) local765);
					@Pc(809) int local809 = (int) ((double) (this.aClass59_1.anInt1597 - this.aClass59_1.anInt1582) * Math.random()) + this.aClass59_1.anInt1582;
					@Pc(826) int local826 = (int) (Math.random() * (double) (this.aClass59_1.anInt1599 - this.aClass59_1.anInt1594)) + this.aClass59_1.anInt1594;
					@Pc(843) int local843 = this.aClass59_1.anInt1609 + (int) ((double) (this.aClass59_1.anInt1619 - this.aClass59_1.anInt1609) * Math.random());
					@Pc(905) int local905;
					if (this.aClass59_1.aBoolean108) {
						@Pc(909) double local909 = Math.random();
						local905 = (int) ((double) this.aClass59_1.anInt1613 + local909 * (double) this.aClass59_1.anInt1598) | (int) ((double) this.aClass59_1.anInt1602 * local909 + (double) this.aClass59_1.anInt1617) << 16 | (int) ((double) this.aClass59_1.anInt1627 + (double) this.aClass59_1.anInt1591 * local909) << 8 | (int) ((double) this.aClass59_1.anInt1608 * Math.random() + (double) this.aClass59_1.anInt1593) << 24;
					} else {
						local905 = (int) ((double) this.aClass59_1.anInt1598 * Math.random() + (double) this.aClass59_1.anInt1613) | (int) (Math.random() * (double) this.aClass59_1.anInt1591 + (double) this.aClass59_1.anInt1627) << 8 | (int) ((double) this.aClass59_1.anInt1617 + (double) this.aClass59_1.anInt1602 * Math.random()) << 16 | (int) ((double) this.aClass59_1.anInt1608 * Math.random() + (double) this.aClass59_1.anInt1593) << 24;
					}
					@Pc(971) int local971 = this.aClass59_1.anInt1604;
					if (!arg0.method6801() && !this.aClass59_1.aBoolean103) {
						local971 = -1;
					}
					if (Static331.anInt6049 == Static254.anInt2689) {
						new Class11_Sub5_Sub1_Sub1(this, local774, local783, local792, local202, local211, local220, local809, local826, local905, local843, local971, this.aClass59_1.aBoolean105, this.aClass59_1.aBoolean107);
					} else {
						@Pc(991) Class11_Sub5_Sub1_Sub1 local991 = Static561.aClass11_Sub5_Sub1_Sub1Array2[Static254.anInt2689];
						Static254.anInt2689 = Static254.anInt2689 + 1 & 0x3FF;
						local991.method3315(this, local774, local783, local792, local202, local211, local220, local809, local826, local905, local843, local971, this.aClass59_1.aBoolean105, this.aClass59_1.aBoolean107);
					}
				}
			}
		}
		if (!this.aClass199_1.method4308(this.aClass199_2)) {
			@Pc(1059) Class199 local1059 = this.aClass199_2;
			this.aClass199_2 = this.aClass199_1;
			this.aClass199_1 = local1059;
			this.aClass199_1.anInt5238 = this.aClass244_1.anInt6531;
			this.aClass199_1.anInt5233 = this.aClass244_1.anInt6533;
			this.aClass199_1.anInt5232 = this.aClass244_1.anInt6537;
			this.aClass199_1.anInt5234 = this.aClass244_1.anInt6534;
			this.aClass199_1.anInt5225 = this.aClass244_1.anInt6536;
			this.aClass199_1.anInt5224 = this.aClass244_1.anInt6524;
			this.aClass199_1.anInt5229 = this.aClass244_1.anInt6525;
			this.aClass199_1.anInt5222 = this.aClass244_1.anInt6529;
			this.aClass199_1.anInt5236 = this.aClass244_1.anInt6535;
		}
		this.anInt1742 = 0;
		for (@Pc(1137) Class11_Sub5_Sub1_Sub1 local1137 = (Class11_Sub5_Sub1_Sub1) this.aClass196_1.method4024(); local1137 != null; local1137 = (Class11_Sub5_Sub1_Sub1) this.aClass196_1.method4028()) {
			local1137.method3317(arg3, arg1);
			this.anInt1742++;
		}
		Static74.anInt3298 += this.anInt1742;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(Z)V")
	public void method1464() {
		this.aClass199_1.anInt5224 = this.aClass244_1.anInt6524;
		this.aClass199_1.anInt5238 = this.aClass244_1.anInt6531;
		this.aClass199_1.anInt5229 = this.aClass244_1.anInt6525;
		this.aClass199_1.anInt5233 = this.aClass244_1.anInt6533;
		this.aClass199_1.anInt5225 = this.aClass244_1.anInt6536;
		this.aClass199_1.anInt5236 = this.aClass244_1.anInt6535;
		this.aClass199_1.anInt5234 = this.aClass244_1.anInt6534;
		this.aClass199_1.anInt5222 = this.aClass244_1.anInt6529;
		this.aClass199_1.anInt5232 = this.aClass244_1.anInt6537;
		if (this.aClass199_1.anInt5225 == this.aClass199_1.anInt5229 && this.aClass199_1.anInt5229 == this.aClass199_1.anInt5238 && this.aClass199_1.anInt5234 == this.aClass199_1.anInt5222 && this.aClass199_1.anInt5222 == this.aClass199_1.anInt5224 && this.aClass199_1.anInt5232 == this.aClass199_1.anInt5233 && this.aClass199_1.anInt5236 == this.aClass199_1.anInt5233) {
			this.aBoolean114 = true;
		} else if (this.aBoolean114) {
			this.aClass199_2.anInt5236 = this.aClass199_1.anInt5236;
			this.aClass199_2.anInt5234 = this.aClass199_1.anInt5234;
			this.aBoolean114 = false;
			this.aClass199_2.anInt5224 = this.aClass199_1.anInt5224;
			this.aClass199_2.anInt5233 = this.aClass199_1.anInt5233;
			this.aClass199_2.anInt5222 = this.aClass199_1.anInt5222;
			this.aClass199_2.anInt5232 = this.aClass199_1.anInt5232;
			this.aClass199_2.anInt5225 = this.aClass199_1.anInt5225;
			this.aClass199_2.anInt5229 = this.aClass199_1.anInt5229;
			this.aClass199_2.anInt5238 = this.aClass199_1.anInt5238;
		}
	}
}
