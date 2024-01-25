import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ul")
public final class Class98_Sub7 extends Class98 {

	@OriginalMember(owner = "client!ul", name = "f", descriptor = "I")
	public int anInt8913;

	@OriginalMember(owner = "client!ul", name = "w", descriptor = "I")
	private int anInt8921;

	@OriginalMember(owner = "client!ul", name = "x", descriptor = "I")
	private int anInt8922;

	@OriginalMember(owner = "client!ul", name = "y", descriptor = "I")
	private int anInt8923;

	@OriginalMember(owner = "client!ul", name = "A", descriptor = "I")
	private int anInt8924;

	@OriginalMember(owner = "client!ul", name = "B", descriptor = "I")
	private int anInt8925;

	@OriginalMember(owner = "client!ul", name = "C", descriptor = "I")
	private int anInt8926;

	@OriginalMember(owner = "client!ul", name = "D", descriptor = "I")
	private int anInt8927;

	@OriginalMember(owner = "client!ul", name = "q", descriptor = "Z")
	public boolean aBoolean651 = false;

	@OriginalMember(owner = "client!ul", name = "r", descriptor = "I")
	private int anInt8918 = 0;

	@OriginalMember(owner = "client!ul", name = "k", descriptor = "Lclient!aw;")
	public Class19 aClass19_1 = new Class19();

	@OriginalMember(owner = "client!ul", name = "v", descriptor = "Lclient!aw;")
	private Class19 aClass19_2 = new Class19();

	@OriginalMember(owner = "client!ul", name = "z", descriptor = "Z")
	private boolean aBoolean652 = false;

	@OriginalMember(owner = "client!ul", name = "o", descriptor = "Lclient!l;")
	public final Class98_Sub3 aClass98_Sub3_6;

	@OriginalMember(owner = "client!ul", name = "n", descriptor = "J")
	private final long aLong242;

	@OriginalMember(owner = "client!ul", name = "m", descriptor = "Lclient!et;")
	public final Class85 aClass85_2;

	@OriginalMember(owner = "client!ul", name = "h", descriptor = "Lclient!rba;")
	public Class281 aClass281_1;

	@OriginalMember(owner = "client!ul", name = "s", descriptor = "Lclient!ca;")
	public final Class40 aClass40_8;

	@OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(Lclient!oa;Lclient!et;Lclient!l;J)V")
	public Class98_Sub7(@OriginalArg(0) Class14 arg0, @OriginalArg(1) Class85 arg1, @OriginalArg(2) Class98_Sub3 arg2, @OriginalArg(3) long arg3) {
		this.aClass98_Sub3_6 = arg2;
		this.aLong242 = arg3;
		this.aClass85_2 = arg1;
		this.aClass281_1 = this.aClass85_2.method2522();
		if (!arg0.method6896() && this.aClass281_1.anInt7672 != -1) {
			this.aClass281_1 = Static438.method6239(this.aClass281_1.anInt7672);
		}
		this.aClass40_8 = new Class40();
		this.anInt8918 = (int) ((double) this.anInt8918 + Math.random() * 64.0D);
		this.method7324();
		this.aClass19_2.anInt777 = this.aClass19_1.anInt777;
		this.aClass19_2.anInt770 = this.aClass19_1.anInt770;
		this.aClass19_2.anInt771 = this.aClass19_1.anInt771;
		this.aClass19_2.anInt773 = this.aClass19_1.anInt773;
		this.aClass19_2.anInt766 = this.aClass19_1.anInt766;
		this.aClass19_2.anInt765 = this.aClass19_1.anInt765;
		this.aClass19_2.anInt775 = this.aClass19_1.anInt775;
		this.aClass19_2.anInt763 = this.aClass19_1.anInt763;
		this.aClass19_2.anInt768 = this.aClass19_1.anInt768;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(JZLclient!oa;)V")
	public void method7322(@OriginalArg(0) long arg0, @OriginalArg(2) Class14 arg1) {
		for (@Pc(11) Class98_Sub1_Sub1_Sub1 local11 = (Class98_Sub1_Sub1_Sub1) this.aClass40_8.method1132(); local11 != null; local11 = (Class98_Sub1_Sub1_Sub1) this.aClass40_8.method1129()) {
			local11.method7770(arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILclient!oa;IZJ)V")
	public void method7323(@OriginalArg(1) Class14 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) long arg3) {
		@Pc(37) int local37;
		if (this.aBoolean651) {
			arg2 = false;
		} else if (this.aClass281_1.anInt7688 > Static92.anInt1780) {
			arg2 = false;
		} else if (Static538.anInt8919 > Static333.anIntArray442[Static92.anInt1780]) {
			arg2 = false;
		} else if (this.aBoolean652) {
			arg2 = false;
		} else if (this.aClass281_1.anInt7686 != -1) {
			local37 = (int) (arg3 - this.aLong242);
			if (this.aClass281_1.aBoolean539 || local37 <= this.aClass281_1.anInt7686) {
				local37 %= this.aClass281_1.anInt7686;
			} else {
				arg2 = false;
			}
			if (!this.aClass281_1.aBoolean536 && local37 < this.aClass281_1.anInt7679) {
				arg2 = false;
			}
			if (this.aClass281_1.aBoolean536 && local37 >= this.aClass281_1.anInt7679) {
				arg2 = false;
			}
		}
		if (arg2) {
			Static438.anInt7573++;
			local37 = (this.aClass19_1.anInt773 + this.aClass19_1.anInt768 + this.aClass19_1.anInt763) / 3;
			@Pc(128) int local128 = (this.aClass19_1.anInt770 + this.aClass19_1.anInt777 + this.aClass19_1.anInt775) / 3;
			@Pc(142) int local142 = (this.aClass19_1.anInt765 + this.aClass19_1.anInt771 + this.aClass19_1.anInt766) / 3;
			@Pc(189) int local189;
			@Pc(198) int local198;
			@Pc(207) int local207;
			@Pc(216) int local216;
			@Pc(225) int local225;
			@Pc(233) int local233;
			@Pc(330) int local330;
			@Pc(377) int local377;
			@Pc(398) int local398;
			if (this.aClass19_1.anInt767 != local37 || local128 != this.aClass19_1.anInt776 || this.aClass19_1.anInt774 != local142) {
				this.aClass19_1.anInt767 = local37;
				this.aClass19_1.anInt776 = local128;
				this.aClass19_1.anInt774 = local142;
				local189 = this.aClass19_1.anInt768 - this.aClass19_1.anInt763;
				local198 = this.aClass19_1.anInt777 - this.aClass19_1.anInt770;
				local207 = this.aClass19_1.anInt765 - this.aClass19_1.anInt771;
				local216 = this.aClass19_1.anInt773 - this.aClass19_1.anInt763;
				local225 = this.aClass19_1.anInt775 - this.aClass19_1.anInt770;
				local233 = this.aClass19_1.anInt766 - this.aClass19_1.anInt771;
				this.anInt8927 = local207 * local216 - local189 * local233;
				this.anInt8923 = local198 * local233 - local225 * local207;
				this.anInt8922 = local189 * local225 - local216 * local198;
				while (true) {
					if (this.anInt8923 <= 32767 && this.anInt8927 <= 32767 && this.anInt8922 <= 32767 && this.anInt8923 >= -32767 && this.anInt8927 >= -32767 && this.anInt8922 >= -32767) {
						local330 = (int) Math.sqrt((double) (this.anInt8927 * this.anInt8927 + this.anInt8923 * this.anInt8923 + this.anInt8922 * this.anInt8922));
						if (local330 <= 0) {
							local330 = 1;
						}
						this.anInt8927 = this.anInt8927 * 32767 / local330;
						this.anInt8922 = this.anInt8922 * 32767 / local330;
						this.anInt8923 = this.anInt8923 * 32767 / local330;
						if (this.aClass281_1.aShort101 > 0 || this.aClass281_1.aShort102 > 0) {
							local377 = (int) (Math.atan2((double) this.anInt8922, (double) this.anInt8923) * 2607.5945876176133D);
							local398 = (int) (Math.atan2((double) this.anInt8927, Math.sqrt((double) (this.anInt8923 * this.anInt8923 + this.anInt8922 * this.anInt8922))) * 2607.5945876176133D);
							this.anInt8921 = this.aClass281_1.aShort101 - this.aClass281_1.aShort104;
							this.anInt8925 = this.aClass281_1.aShort104 + local377 - (this.anInt8921 >> 1);
							this.anInt8926 = this.aClass281_1.aShort102 - this.aClass281_1.aShort103;
							this.anInt8924 = this.aClass281_1.aShort103 + local398 - (this.anInt8926 >> 1);
						}
						break;
					}
					this.anInt8922 >>= 0x1;
					this.anInt8923 >>= 0x1;
					this.anInt8927 >>= 0x1;
				}
			}
			this.anInt8918 += (int) (((double) this.aClass281_1.anInt7653 + Math.random() * (double) (this.aClass281_1.anInt7683 - this.aClass281_1.anInt7653)) * (double) arg1);
			if (this.anInt8918 > 63) {
				local189 = this.anInt8918 >> 6;
				this.anInt8918 &= 0x3F;
				for (local225 = 0; local225 < local189; local225++) {
					@Pc(553) int local553;
					@Pc(557) int local557;
					if (this.aClass281_1.aShort101 <= 0 && this.aClass281_1.aShort102 <= 0) {
						local198 = this.anInt8923;
						local216 = this.anInt8922;
						local207 = this.anInt8927;
					} else {
						local233 = this.anInt8925 + (int) (Math.random() * (double) this.anInt8921);
						local233 &= 0x3FFF;
						local330 = Class6_Sub2_Sub7.anIntArray178[local233];
						local377 = Class6_Sub2_Sub7.anIntArray177[local233];
						local398 = this.anInt8924 + (int) (Math.random() * (double) this.anInt8926);
						local398 &= 0x1FFF;
						local553 = Class6_Sub2_Sub7.anIntArray178[local398];
						local557 = Class6_Sub2_Sub7.anIntArray177[local398];
						local198 = local553 * local377 >> 13;
						local207 = (local557 << 1) * -1;
						local216 = local330 * local553 >> 13;
					}
					@Pc(580) float local580 = (float) Math.random();
					@Pc(583) float local583 = (float) Math.random();
					if (local583 + local580 > 1.0F) {
						local580 = 1.0F - local580;
						local583 = 1.0F - local583;
					}
					@Pc(604) float local604 = 1.0F - local580 - local583;
					local398 = (int) (local604 * (float) this.aClass19_1.anInt773 + local583 * (float) this.aClass19_1.anInt768 + (float) this.aClass19_1.anInt763 * local580);
					local553 = (int) (local583 * (float) this.aClass19_1.anInt777 + (float) this.aClass19_1.anInt770 * local580 + local604 * (float) this.aClass19_1.anInt775);
					local557 = (int) ((float) this.aClass19_1.anInt771 * local580 + (float) this.aClass19_1.anInt765 * local583 + local604 * (float) this.aClass19_1.anInt766);
					@Pc(692) int local692 = (int) ((float) this.aClass19_2.anInt768 * local583 + (float) this.aClass19_2.anInt763 * local580 + local604 * (float) this.aClass19_2.anInt773);
					@Pc(714) int local714 = (int) (local604 * (float) this.aClass19_2.anInt775 + (float) this.aClass19_2.anInt777 * local583 + (float) this.aClass19_2.anInt770 * local580);
					@Pc(736) int local736 = (int) ((float) this.aClass19_2.anInt766 * local604 + local583 * (float) this.aClass19_2.anInt765 + (float) this.aClass19_2.anInt771 * local580);
					@Pc(741) int local741 = local398 - local692;
					@Pc(746) int local746 = local553 - local714;
					@Pc(751) int local751 = local557 - local736;
					@Pc(760) int local760 = (int) (Math.random() * (double) local741 + (double) local692);
					@Pc(769) int local769 = (int) ((double) local714 + Math.random() * (double) local746);
					@Pc(778) int local778 = (int) ((double) local736 + Math.random() * (double) local751);
					@Pc(795) int local795 = (int) ((double) (this.aClass281_1.anInt7696 - this.aClass281_1.anInt7660) * Math.random()) + this.aClass281_1.anInt7660;
					@Pc(812) int local812 = (int) (Math.random() * (double) (this.aClass281_1.anInt7658 - this.aClass281_1.anInt7687)) + this.aClass281_1.anInt7687;
					@Pc(830) int local830 = this.aClass281_1.anInt7671 + (int) ((double) (this.aClass281_1.anInt7682 - this.aClass281_1.anInt7671) * Math.random());
					@Pc(894) int local894;
					if (this.aClass281_1.aBoolean543) {
						@Pc(836) double local836 = Math.random();
						local894 = (int) ((double) this.aClass281_1.anInt7693 * local836 + (double) this.aClass281_1.anInt7663) << 16 | (int) (local836 * (double) this.aClass281_1.anInt7675 + (double) this.aClass281_1.anInt7698) << 8 | (int) ((double) this.aClass281_1.anInt7670 * local836 + (double) this.aClass281_1.lb) | (int) (Math.random() * (double) this.aClass281_1.anInt7699 + (double) this.aClass281_1.anInt7661) << 24;
					} else {
						local894 = (int) ((double) this.aClass281_1.anInt7698 + Math.random() * (double) this.aClass281_1.anInt7675) << 8 | (int) ((double) this.aClass281_1.anInt7663 + (double) this.aClass281_1.anInt7693 * Math.random()) << 16 | (int) ((double) this.aClass281_1.lb + Math.random() * (double) this.aClass281_1.anInt7670) | (int) ((double) this.aClass281_1.anInt7661 + Math.random() * (double) this.aClass281_1.anInt7699) << 24;
					}
					@Pc(958) int local958 = this.aClass281_1.anInt7666;
					if (!arg0.method6896() && !this.aClass281_1.aBoolean537) {
						local958 = -1;
					}
					if (Static536.anInt8903 == Static388.anInt6812) {
						new Class98_Sub1_Sub1_Sub1(this, local760, local769, local778, local198, local207, local216, local795, local812, local894, local830, local958, this.aClass281_1.aBoolean538, this.aClass281_1.aBoolean535);
					} else {
						@Pc(974) Class98_Sub1_Sub1_Sub1 local974 = Static322.aClass98_Sub1_Sub1_Sub1Array2[Static388.anInt6812];
						Static388.anInt6812 = Static388.anInt6812 + 1 & 0x3FF;
						local974.method7773(this, local760, local769, local778, local198, local207, local216, local795, local812, local894, local830, local958, this.aClass281_1.aBoolean538, this.aClass281_1.aBoolean535);
					}
				}
			}
		}
		if (!this.aClass19_1.method791(this.aClass19_2)) {
			@Pc(1038) Class19 local1038 = this.aClass19_2;
			this.aClass19_2 = this.aClass19_1;
			this.aClass19_1 = local1038;
			this.aClass19_1.anInt765 = this.aClass85_2.anInt2873;
			this.aClass19_1.anInt775 = this.aClass85_2.anInt2869;
			this.aClass19_1.anInt771 = this.aClass85_2.anInt2875;
			this.aClass19_1.anInt768 = this.aClass85_2.anInt2863;
			this.aClass19_1.anInt773 = this.aClass85_2.anInt2864;
			this.aClass19_1.anInt770 = this.aClass85_2.anInt2874;
			this.aClass19_1.anInt777 = this.aClass85_2.anInt2865;
			this.aClass19_1.anInt766 = this.aClass85_2.anInt2878;
			this.aClass19_1.anInt763 = this.aClass85_2.anInt2862;
		}
		this.anInt8913 = 0;
		for (@Pc(1108) Class98_Sub1_Sub1_Sub1 local1108 = (Class98_Sub1_Sub1_Sub1) this.aClass40_8.method1132(); local1108 != null; local1108 = (Class98_Sub1_Sub1_Sub1) this.aClass40_8.method1129()) {
			local1108.method7771(arg3, arg1);
			this.anInt8913++;
		}
		Static12.anInt335 += this.anInt8913;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)V")
	public void method7324() {
		this.aClass19_1.anInt777 = this.aClass85_2.anInt2865;
		this.aClass19_1.anInt766 = this.aClass85_2.anInt2878;
		this.aClass19_1.anInt771 = this.aClass85_2.anInt2875;
		this.aClass19_1.anInt763 = this.aClass85_2.anInt2862;
		this.aClass19_1.anInt765 = this.aClass85_2.anInt2873;
		this.aClass19_1.anInt770 = this.aClass85_2.anInt2874;
		this.aClass19_1.anInt768 = this.aClass85_2.anInt2863;
		this.aClass19_1.anInt773 = this.aClass85_2.anInt2864;
		this.aClass19_1.anInt775 = this.aClass85_2.anInt2869;
		if (this.aClass19_1.anInt763 == this.aClass19_1.anInt768 && this.aClass19_1.anInt768 == this.aClass19_1.anInt773 && this.aClass19_1.anInt777 == this.aClass19_1.anInt770 && this.aClass19_1.anInt777 == this.aClass19_1.anInt775 && this.aClass19_1.anInt765 == this.aClass19_1.anInt771 && this.aClass19_1.anInt765 == this.aClass19_1.anInt766) {
			this.aBoolean652 = true;
		} else if (this.aBoolean652) {
			this.aClass19_2.anInt770 = this.aClass19_1.anInt770;
			this.aClass19_2.anInt763 = this.aClass19_1.anInt763;
			this.aBoolean652 = false;
			this.aClass19_2.anInt777 = this.aClass19_1.anInt777;
			this.aClass19_2.anInt768 = this.aClass19_1.anInt768;
			this.aClass19_2.anInt775 = this.aClass19_1.anInt775;
			this.aClass19_2.anInt766 = this.aClass19_1.anInt766;
			this.aClass19_2.anInt773 = this.aClass19_1.anInt773;
			this.aClass19_2.anInt771 = this.aClass19_1.anInt771;
			this.aClass19_2.anInt765 = this.aClass19_1.anInt765;
		}
	}
}
