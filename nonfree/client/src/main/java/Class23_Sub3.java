import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cea")
public final class Class23_Sub3 extends Class23 {

	@OriginalMember(owner = "client!cea", name = "p", descriptor = "I")
	public int anInt1636;

	@OriginalMember(owner = "client!cea", name = "w", descriptor = "I")
	private int anInt1638;

	@OriginalMember(owner = "client!cea", name = "x", descriptor = "I")
	private int anInt1639;

	@OriginalMember(owner = "client!cea", name = "y", descriptor = "I")
	private int anInt1640;

	@OriginalMember(owner = "client!cea", name = "z", descriptor = "I")
	private int anInt1641;

	@OriginalMember(owner = "client!cea", name = "B", descriptor = "I")
	private int anInt1642;

	@OriginalMember(owner = "client!cea", name = "C", descriptor = "I")
	private int anInt1643;

	@OriginalMember(owner = "client!cea", name = "D", descriptor = "I")
	private int anInt1644;

	@OriginalMember(owner = "client!cea", name = "h", descriptor = "I")
	private int anInt1632 = 0;

	@OriginalMember(owner = "client!cea", name = "n", descriptor = "Z")
	public boolean aBoolean148 = false;

	@OriginalMember(owner = "client!cea", name = "t", descriptor = "Lclient!aq;")
	public Class24 aClass24_1 = new Class24();

	@OriginalMember(owner = "client!cea", name = "u", descriptor = "Lclient!aq;")
	private Class24 aClass24_2 = new Class24();

	@OriginalMember(owner = "client!cea", name = "v", descriptor = "Z")
	private boolean aBoolean149 = false;

	@OriginalMember(owner = "client!cea", name = "r", descriptor = "Lclient!f;")
	public final Class23_Sub5 aClass23_Sub5_2;

	@OriginalMember(owner = "client!cea", name = "s", descriptor = "J")
	private final long aLong42;

	@OriginalMember(owner = "client!cea", name = "i", descriptor = "Lclient!oea;")
	public final Class261 aClass261_1;

	@OriginalMember(owner = "client!cea", name = "j", descriptor = "Lclient!iea;")
	public Class174 aClass174_1;

	@OriginalMember(owner = "client!cea", name = "m", descriptor = "Lclient!em;")
	public final Class105 aClass105_3;

	@OriginalMember(owner = "client!cea", name = "<init>", descriptor = "(Lclient!ha;Lclient!oea;Lclient!f;J)V")
	public Class23_Sub3(@OriginalArg(0) Class16 arg0, @OriginalArg(1) Class261 arg1, @OriginalArg(2) Class23_Sub5 arg2, @OriginalArg(3) long arg3) {
		this.aClass23_Sub5_2 = arg2;
		this.aLong42 = arg3;
		this.aClass261_1 = arg1;
		this.aClass174_1 = this.aClass261_1.method6013();
		if (!arg0.method8157() && this.aClass174_1.anInt4612 != -1) {
			this.aClass174_1 = Static302.method4659(this.aClass174_1.anInt4612);
		}
		this.aClass105_3 = new Class105();
		this.anInt1632 = (int) ((double) this.anInt1632 + Math.random() * 64.0D);
		this.method1576();
		this.aClass24_2.anInt771 = this.aClass24_1.anInt771;
		this.aClass24_2.anInt767 = this.aClass24_1.anInt767;
		this.aClass24_2.anInt762 = this.aClass24_1.anInt762;
		this.aClass24_2.anInt768 = this.aClass24_1.anInt768;
		this.aClass24_2.anInt769 = this.aClass24_1.anInt769;
		this.aClass24_2.anInt764 = this.aClass24_1.anInt764;
		this.aClass24_2.anInt770 = this.aClass24_1.anInt770;
		this.aClass24_2.anInt760 = this.aClass24_1.anInt760;
		this.aClass24_2.anInt766 = this.aClass24_1.anInt766;
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(ZIIJLclient!ha;)V")
	public void method1574(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) long arg2, @OriginalArg(4) Class16 arg3) {
		@Pc(41) int local41;
		if (this.aBoolean148) {
			arg0 = false;
		} else if (this.aClass174_1.anInt4645 > Static200.anInt3634) {
			arg0 = false;
		} else if (Static657.anIntArray646[Static200.anInt3634] < Static407.anInt6947) {
			arg0 = false;
		} else if (this.aBoolean149) {
			arg0 = false;
		} else if (this.aClass174_1.anInt4648 != -1) {
			local41 = (int) (arg2 - this.aLong42);
			if (this.aClass174_1.aBoolean371 || this.aClass174_1.anInt4648 >= local41) {
				local41 %= this.aClass174_1.anInt4648;
			} else {
				arg0 = false;
			}
			if (!this.aClass174_1.aBoolean364 && this.aClass174_1.anInt4615 > local41) {
				arg0 = false;
			}
			if (this.aClass174_1.aBoolean364 && local41 >= this.aClass174_1.anInt4615) {
				arg0 = false;
			}
		}
		if (arg0) {
			Static106.anInt2229++;
			local41 = (this.aClass24_1.anInt764 + this.aClass24_1.anInt769 + this.aClass24_1.anInt771) / 3;
			@Pc(133) int local133 = (this.aClass24_1.anInt766 + this.aClass24_1.anInt770 + this.aClass24_1.anInt767) / 3;
			@Pc(148) int local148 = (this.aClass24_1.anInt768 + this.aClass24_1.anInt762 + this.aClass24_1.anInt760) / 3;
			@Pc(192) int local192;
			@Pc(200) int local200;
			@Pc(209) int local209;
			@Pc(218) int local218;
			@Pc(227) int local227;
			@Pc(236) int local236;
			@Pc(337) int local337;
			@Pc(390) int local390;
			@Pc(412) int local412;
			if (this.aClass24_1.anInt761 != local41 || local133 != this.aClass24_1.anInt763 || local148 != this.aClass24_1.anInt765) {
				this.aClass24_1.anInt765 = local148;
				this.aClass24_1.anInt763 = local133;
				this.aClass24_1.anInt761 = local41;
				local192 = this.aClass24_1.anInt769 - this.aClass24_1.anInt764;
				local200 = this.aClass24_1.anInt770 - this.aClass24_1.anInt767;
				local209 = this.aClass24_1.anInt762 - this.aClass24_1.anInt768;
				local218 = this.aClass24_1.anInt771 - this.aClass24_1.anInt764;
				local227 = this.aClass24_1.anInt766 - this.aClass24_1.anInt767;
				local236 = this.aClass24_1.anInt760 - this.aClass24_1.anInt768;
				this.anInt1638 = local227 * local192 - local218 * local200;
				this.anInt1642 = local236 * local200 - local227 * local209;
				this.anInt1640 = local218 * local209 - local192 * local236;
				while (true) {
					if (this.anInt1642 <= 32767 && this.anInt1640 <= 32767 && this.anInt1638 <= 32767 && this.anInt1642 >= -32767 && this.anInt1640 >= -32767 && this.anInt1638 >= -32767) {
						local337 = (int) Math.sqrt((double) (this.anInt1640 * this.anInt1640 + this.anInt1642 * this.anInt1642 + this.anInt1638 * this.anInt1638));
						if (local337 <= 0) {
							local337 = 1;
						}
						this.anInt1642 = this.anInt1642 * 32767 / local337;
						this.anInt1638 = this.anInt1638 * 32767 / local337;
						this.anInt1640 = this.anInt1640 * 32767 / local337;
						if (this.aClass174_1.aShort65 > 0 || this.aClass174_1.aShort68 > 0) {
							local390 = (int) (Math.atan2((double) this.anInt1638, (double) this.anInt1642) * 2607.5945876176133D);
							local412 = (int) (Math.atan2((double) this.anInt1640, Math.sqrt((double) (this.anInt1642 * this.anInt1642 + this.anInt1638 * this.anInt1638))) * 2607.5945876176133D);
							this.anInt1639 = this.aClass174_1.aShort65 - this.aClass174_1.aShort66;
							this.anInt1641 = this.aClass174_1.aShort68 - this.aClass174_1.aShort67;
							this.anInt1643 = local390 + this.aClass174_1.aShort66 - (this.anInt1639 >> 1);
							this.anInt1644 = local412 + this.aClass174_1.aShort67 - (this.anInt1641 >> 1);
						}
						break;
					}
					this.anInt1642 >>= 0x1;
					this.anInt1640 >>= 0x1;
					this.anInt1638 >>= 0x1;
				}
			}
			this.anInt1632 += (int) ((double) arg1 * (Math.random() * (double) (this.aClass174_1.anInt4603 - this.aClass174_1.anInt4626) + (double) this.aClass174_1.anInt4626));
			if (this.anInt1632 > 63) {
				local192 = this.anInt1632 >> 6;
				this.anInt1632 &= 0x3F;
				for (local227 = 0; local227 < local192; local227++) {
					@Pc(563) int local563;
					@Pc(567) int local567;
					if (this.aClass174_1.aShort65 <= 0 && this.aClass174_1.aShort68 <= 0) {
						local209 = this.anInt1640;
						local218 = this.anInt1638;
						local200 = this.anInt1642;
					} else {
						local236 = this.anInt1643 + (int) ((double) this.anInt1639 * Math.random());
						local236 &= 0x3FFF;
						local337 = Class3_Sub7_Sub2.anIntArray171[local236];
						local390 = Class3_Sub7_Sub2.anIntArray170[local236];
						local412 = (int) ((double) this.anInt1641 * Math.random()) + this.anInt1644;
						local412 &= 0x1FFF;
						local563 = Class3_Sub7_Sub2.anIntArray171[local412];
						local567 = Class3_Sub7_Sub2.anIntArray170[local412];
						local209 = (local567 << 1) * -1;
						local200 = local563 * local390 >> 13;
						local218 = local563 * local337 >> 13;
					}
					@Pc(590) float local590 = (float) Math.random();
					@Pc(593) float local593 = (float) Math.random();
					if (local590 + local593 > 1.0F) {
						local590 = 1.0F - local590;
						local593 = 1.0F - local593;
					}
					@Pc(615) float local615 = 1.0F - local593 - local590;
					local412 = (int) ((float) this.aClass24_1.anInt769 * local593 + local590 * (float) this.aClass24_1.anInt764 + (float) this.aClass24_1.anInt771 * local615);
					local563 = (int) (local590 * (float) this.aClass24_1.anInt767 + local593 * (float) this.aClass24_1.anInt770 + (float) this.aClass24_1.anInt766 * local615);
					local567 = (int) (local615 * (float) this.aClass24_1.anInt760 + (float) this.aClass24_1.anInt762 * local593 + local590 * (float) this.aClass24_1.anInt768);
					@Pc(703) int local703 = (int) ((float) this.aClass24_2.anInt771 * local615 + local590 * (float) this.aClass24_2.anInt764 + (float) this.aClass24_2.anInt769 * local593);
					@Pc(725) int local725 = (int) ((float) this.aClass24_2.anInt766 * local615 + (float) this.aClass24_2.anInt770 * local593 + local590 * (float) this.aClass24_2.anInt767);
					@Pc(747) int local747 = (int) (local593 * (float) this.aClass24_2.anInt762 + local590 * (float) this.aClass24_2.anInt768 + (float) this.aClass24_2.anInt760 * local615);
					@Pc(752) int local752 = local412 - local703;
					@Pc(757) int local757 = local563 - local725;
					@Pc(762) int local762 = local567 - local747;
					@Pc(771) int local771 = (int) ((double) local752 * Math.random() + (double) local703);
					@Pc(780) int local780 = (int) ((double) local725 + Math.random() * (double) local757);
					@Pc(789) int local789 = (int) ((double) local747 + (double) local762 * Math.random());
					@Pc(806) int local806 = (int) ((double) (this.aClass174_1.anInt4637 - this.aClass174_1.anInt4599) * Math.random()) + this.aClass174_1.anInt4599;
					@Pc(823) int local823 = this.aClass174_1.anInt4604 + (int) (Math.random() * (double) (this.aClass174_1.anInt4652 - this.aClass174_1.anInt4604));
					@Pc(841) int local841 = this.aClass174_1.anInt4617 + (int) ((double) (this.aClass174_1.anInt4628 - this.aClass174_1.anInt4617) * Math.random());
					@Pc(905) int local905;
					if (this.aClass174_1.aBoolean366) {
						@Pc(847) double local847 = Math.random();
						local905 = (int) ((double) this.aClass174_1.anInt4631 * Math.random() + (double) this.aClass174_1.anInt4639) << 24 | (int) ((double) this.aClass174_1.anInt4621 + local847 * (double) this.aClass174_1.anInt4618) << 16 | (int) (local847 * (double) this.aClass174_1.anInt4644 + (double) this.aClass174_1.anInt4620) << 8 | (int) ((double) this.aClass174_1.anInt4641 * local847 + (double) this.aClass174_1.anInt4632);
					} else {
						local905 = (int) ((double) this.aClass174_1.anInt4639 + Math.random() * (double) this.aClass174_1.anInt4631) << 24 | (int) (Math.random() * (double) this.aClass174_1.anInt4641 + (double) this.aClass174_1.anInt4632) | (int) (Math.random() * (double) this.aClass174_1.anInt4618 + (double) this.aClass174_1.anInt4621) << 16 | (int) ((double) this.aClass174_1.anInt4620 + (double) this.aClass174_1.anInt4644 * Math.random()) << 8;
					}
					@Pc(969) int local969 = this.aClass174_1.anInt4611;
					if (!arg3.method8157() && !this.aClass174_1.aBoolean367) {
						local969 = -1;
					}
					if (Static185.anInt3412 == Static634.anInt9786) {
						new Class23_Sub1_Sub2_Sub1(this, local771, local780, local789, local200, local209, local218, local806, local823, local905, local841, local969, this.aClass174_1.aBoolean368, this.aClass174_1.aBoolean365);
					} else {
						@Pc(985) Class23_Sub1_Sub2_Sub1 local985 = Static184.aClass23_Sub1_Sub2_Sub1Array2[Static634.anInt9786];
						Static634.anInt9786 = Static634.anInt9786 + 1 & 0x3FF;
						local985.method6592(this, local771, local780, local789, local200, local209, local218, local806, local823, local905, local841, local969, this.aClass174_1.aBoolean368, this.aClass174_1.aBoolean365);
					}
				}
			}
		}
		if (!this.aClass24_1.method798(this.aClass24_2)) {
			@Pc(1059) Class24 local1059 = this.aClass24_2;
			this.aClass24_2 = this.aClass24_1;
			this.aClass24_1 = local1059;
			this.aClass24_1.anInt762 = this.aClass261_1.anInt7129;
			this.aClass24_1.anInt761 = this.aClass24_2.anInt761;
			this.aClass24_1.anInt770 = this.aClass261_1.anInt7123;
			this.aClass24_1.anInt769 = this.aClass261_1.anInt7117;
			this.aClass24_1.anInt768 = this.aClass261_1.anInt7130;
			this.aClass24_1.anInt760 = this.aClass261_1.anInt7135;
			this.aClass24_1.anInt765 = this.aClass24_2.anInt765;
			this.aClass24_1.anInt767 = this.aClass261_1.anInt7128;
			this.aClass24_1.anInt771 = this.aClass261_1.anInt7127;
			this.aClass24_1.anInt766 = this.aClass261_1.anInt7125;
			this.aClass24_1.anInt763 = this.aClass24_2.anInt763;
			this.aClass24_1.anInt764 = this.aClass261_1.anInt7118;
		}
		this.anInt1636 = 0;
		for (@Pc(1147) Class23_Sub1_Sub2_Sub1 local1147 = (Class23_Sub1_Sub2_Sub1) this.aClass105_3.method2444(); local1147 != null; local1147 = (Class23_Sub1_Sub2_Sub1) this.aClass105_3.method2448()) {
			local1147.method6589(arg2, arg1);
			this.anInt1636++;
		}
		Static442.anInt7680 += this.anInt1636;
	}

	@OriginalMember(owner = "client!cea", name = "b", descriptor = "(I)V")
	public void method1576() {
		this.aClass24_1.anInt762 = this.aClass261_1.anInt7129;
		this.aClass24_1.anInt767 = this.aClass261_1.anInt7128;
		this.aClass24_1.anInt764 = this.aClass261_1.anInt7118;
		this.aClass24_1.anInt771 = this.aClass261_1.anInt7127;
		this.aClass24_1.anInt768 = this.aClass261_1.anInt7130;
		this.aClass24_1.anInt766 = this.aClass261_1.anInt7125;
		this.aClass24_1.anInt770 = this.aClass261_1.anInt7123;
		this.aClass24_1.anInt769 = this.aClass261_1.anInt7117;
		this.aClass24_1.anInt760 = this.aClass261_1.anInt7135;
		if (this.aClass24_1.anInt769 == this.aClass24_1.anInt764 && this.aClass24_1.anInt769 == this.aClass24_1.anInt771 && this.aClass24_1.anInt767 == this.aClass24_1.anInt770 && this.aClass24_1.anInt770 == this.aClass24_1.anInt766 && this.aClass24_1.anInt768 == this.aClass24_1.anInt762 && this.aClass24_1.anInt762 == this.aClass24_1.anInt760) {
			this.aBoolean149 = true;
		} else if (this.aBoolean149) {
			this.aClass24_2.anInt760 = this.aClass24_1.anInt760;
			this.aClass24_2.anInt766 = this.aClass24_1.anInt766;
			this.aClass24_2.anInt767 = this.aClass24_1.anInt767;
			this.aClass24_2.anInt762 = this.aClass24_1.anInt762;
			this.aClass24_2.anInt770 = this.aClass24_1.anInt770;
			this.aBoolean149 = false;
			this.aClass24_2.anInt771 = this.aClass24_1.anInt771;
			this.aClass24_2.anInt764 = this.aClass24_1.anInt764;
			this.aClass24_2.anInt768 = this.aClass24_1.anInt768;
			this.aClass24_2.anInt769 = this.aClass24_1.anInt769;
		}
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(JZLclient!ha;)V")
	public void method1578(@OriginalArg(0) long arg0, @OriginalArg(2) Class16 arg1) {
		for (@Pc(16) Class23_Sub1_Sub2_Sub1 local16 = (Class23_Sub1_Sub2_Sub1) this.aClass105_3.method2444(); local16 != null; local16 = (Class23_Sub1_Sub2_Sub1) this.aClass105_3.method2448()) {
			local16.method6590(arg1, arg0);
		}
	}
}
