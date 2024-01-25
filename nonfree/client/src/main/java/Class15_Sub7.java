import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tca")
public final class Class15_Sub7 extends Class15 {

	@OriginalMember(owner = "client!tca", name = "r", descriptor = "I")
	public int anInt9777;

	@OriginalMember(owner = "client!tca", name = "E", descriptor = "I")
	private int anInt9783;

	@OriginalMember(owner = "client!tca", name = "F", descriptor = "I")
	private int anInt9784;

	@OriginalMember(owner = "client!tca", name = "G", descriptor = "I")
	private int anInt9785;

	@OriginalMember(owner = "client!tca", name = "H", descriptor = "I")
	private int anInt9786;

	@OriginalMember(owner = "client!tca", name = "I", descriptor = "I")
	private int anInt9787;

	@OriginalMember(owner = "client!tca", name = "K", descriptor = "I")
	private int anInt9788;

	@OriginalMember(owner = "client!tca", name = "L", descriptor = "I")
	private int anInt9789;

	@OriginalMember(owner = "client!tca", name = "x", descriptor = "I")
	private int anInt9780 = 0;

	@OriginalMember(owner = "client!tca", name = "z", descriptor = "Z")
	public boolean aBoolean719 = false;

	@OriginalMember(owner = "client!tca", name = "v", descriptor = "Lclient!dba;")
	public Class64 aClass64_1 = new Class64();

	@OriginalMember(owner = "client!tca", name = "D", descriptor = "Lclient!dba;")
	private Class64 aClass64_2 = new Class64();

	@OriginalMember(owner = "client!tca", name = "J", descriptor = "Z")
	private boolean aBoolean720 = false;

	@OriginalMember(owner = "client!tca", name = "l", descriptor = "J")
	private final long aLong269;

	@OriginalMember(owner = "client!tca", name = "m", descriptor = "Lclient!pi;")
	public final Class283 aClass283_2;

	@OriginalMember(owner = "client!tca", name = "k", descriptor = "Lclient!eea;")
	public final Class15_Sub5 aClass15_Sub5_7;

	@OriginalMember(owner = "client!tca", name = "t", descriptor = "Lclient!qw;")
	public Class308 aClass308_1;

	@OriginalMember(owner = "client!tca", name = "C", descriptor = "Lclient!cp;")
	public final Class60 aClass60_9;

	@OriginalMember(owner = "client!tca", name = "<init>", descriptor = "(Lclient!ha;Lclient!pi;Lclient!eea;J)V")
	public Class15_Sub7(@OriginalArg(0) Class101 arg0, @OriginalArg(1) Class283 arg1, @OriginalArg(2) Class15_Sub5 arg2, @OriginalArg(3) long arg3) {
		this.aLong269 = arg3;
		this.aClass283_2 = arg1;
		this.aClass15_Sub5_7 = arg2;
		this.aClass308_1 = this.aClass283_2.method7373();
		if (!arg0.method8086() && this.aClass308_1.anInt8907 != -1) {
			this.aClass308_1 = Static303.method5004(this.aClass308_1.anInt8907);
		}
		this.aClass60_9 = new Class60();
		this.anInt9780 = (int) ((double) this.anInt9780 + Math.random() * 64.0D);
		this.method8570();
		this.aClass64_2.anInt1691 = this.aClass64_1.anInt1691;
		this.aClass64_2.anInt1699 = this.aClass64_1.anInt1699;
		this.aClass64_2.anInt1693 = this.aClass64_1.anInt1693;
		this.aClass64_2.anInt1704 = this.aClass64_1.anInt1704;
		this.aClass64_2.anInt1702 = this.aClass64_1.anInt1702;
		this.aClass64_2.anInt1695 = this.aClass64_1.anInt1695;
		this.aClass64_2.anInt1705 = this.aClass64_1.anInt1705;
		this.aClass64_2.anInt1690 = this.aClass64_1.anInt1690;
		this.aClass64_2.anInt1701 = this.aClass64_1.anInt1701;
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(JIZILclient!ha;)V")
	public void method8568(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) Class101 arg3) {
		@Pc(50) int local50;
		if (this.aBoolean719) {
			arg2 = false;
		} else if (this.aClass308_1.anInt8938 > Static169.anInt3597) {
			arg2 = false;
		} else if (Static464.anInt8320 > Static565.anIntArray494[Static169.anInt3597]) {
			arg2 = false;
		} else if (this.aBoolean720) {
			arg2 = false;
		} else if (this.aClass308_1.anInt8918 != -1) {
			local50 = (int) (arg0 - this.aLong269);
			if (this.aClass308_1.aBoolean649 || local50 <= this.aClass308_1.anInt8918) {
				local50 %= this.aClass308_1.anInt8918;
			} else {
				arg2 = false;
			}
			if (!this.aClass308_1.aBoolean645 && this.aClass308_1.anInt8933 > local50) {
				arg2 = false;
			}
			if (this.aClass308_1.aBoolean645 && this.aClass308_1.anInt8933 <= local50) {
				arg2 = false;
			}
		}
		if (arg2) {
			Static280.anInt5182++;
			local50 = (this.aClass64_1.anInt1701 + this.aClass64_1.anInt1693 + this.aClass64_1.anInt1702) / 3;
			@Pc(139) int local139 = (this.aClass64_1.anInt1695 + this.aClass64_1.anInt1690 + this.aClass64_1.anInt1699) / 3;
			@Pc(153) int local153 = (this.aClass64_1.anInt1705 + this.aClass64_1.anInt1691 + this.aClass64_1.anInt1704) / 3;
			@Pc(189) int local189;
			@Pc(198) int local198;
			@Pc(207) int local207;
			@Pc(215) int local215;
			@Pc(223) int local223;
			@Pc(232) int local232;
			@Pc(333) int local333;
			@Pc(389) int local389;
			@Pc(411) int local411;
			if (local50 != this.aClass64_1.anInt1706 || this.aClass64_1.anInt1700 != local139 || this.aClass64_1.anInt1696 != local153) {
				this.aClass64_1.anInt1696 = local153;
				this.aClass64_1.anInt1706 = local50;
				this.aClass64_1.anInt1700 = local139;
				local189 = this.aClass64_1.anInt1693 - this.aClass64_1.anInt1701;
				local198 = this.aClass64_1.anInt1695 - this.aClass64_1.anInt1690;
				local207 = this.aClass64_1.anInt1705 - this.aClass64_1.anInt1691;
				local215 = this.aClass64_1.anInt1702 - this.aClass64_1.anInt1701;
				local223 = this.aClass64_1.anInt1699 - this.aClass64_1.anInt1690;
				local232 = this.aClass64_1.anInt1704 - this.aClass64_1.anInt1691;
				this.anInt9787 = local215 * local207 - local189 * local232;
				this.anInt9786 = local223 * local189 - local198 * local215;
				this.anInt9784 = local232 * local198 - local223 * local207;
				while (true) {
					if (this.anInt9784 <= 32767 && this.anInt9787 <= 32767 && this.anInt9786 <= 32767 && this.anInt9784 >= -32767 && this.anInt9787 >= -32767 && this.anInt9786 >= -32767) {
						local333 = (int) Math.sqrt((double) (this.anInt9784 * this.anInt9784 + this.anInt9787 * this.anInt9787 + this.anInt9786 * this.anInt9786));
						if (local333 <= 0) {
							local333 = 1;
						}
						this.anInt9786 = this.anInt9786 * 32767 / local333;
						this.anInt9787 = this.anInt9787 * 32767 / local333;
						this.anInt9784 = this.anInt9784 * 32767 / local333;
						if (this.aClass308_1.aShort96 > 0 || this.aClass308_1.aShort97 > 0) {
							local389 = (int) (Math.atan2((double) this.anInt9786, (double) this.anInt9784) * 2607.5945876176133D);
							local411 = (int) (Math.atan2((double) this.anInt9787, Math.sqrt((double) (this.anInt9784 * this.anInt9784 + this.anInt9786 * this.anInt9786))) * 2607.5945876176133D);
							this.anInt9789 = this.aClass308_1.aShort96 - this.aClass308_1.aShort98;
							this.anInt9788 = local389 + this.aClass308_1.aShort98 - (this.anInt9789 >> 1);
							this.anInt9783 = this.aClass308_1.aShort97 - this.aClass308_1.aShort95;
							this.anInt9785 = this.aClass308_1.aShort95 + local411 - (this.anInt9783 >> 1);
						}
						break;
					}
					this.anInt9787 >>= 0x1;
					this.anInt9784 >>= 0x1;
					this.anInt9786 >>= 0x1;
				}
			}
			this.anInt9780 += (int) ((double) arg1 * ((double) this.aClass308_1.anInt8939 + Math.random() * (double) (this.aClass308_1.anInt8908 - this.aClass308_1.anInt8939)));
			if (this.anInt9780 > 63) {
				local189 = this.anInt9780 >> 6;
				this.anInt9780 &= 0x3F;
				for (local223 = 0; local223 < local189; local223++) {
					@Pc(560) int local560;
					@Pc(564) int local564;
					if (this.aClass308_1.aShort96 <= 0 && this.aClass308_1.aShort97 <= 0) {
						local207 = this.anInt9787;
						local198 = this.anInt9784;
						local215 = this.anInt9786;
					} else {
						local232 = (int) (Math.random() * (double) this.anInt9789) + this.anInt9788;
						local232 &= 0x3FFF;
						local333 = Class12_Sub2.anIntArray204[local232];
						local389 = Class12_Sub2.anIntArray203[local232];
						local411 = (int) (Math.random() * (double) this.anInt9783) + this.anInt9785;
						local411 &= 0x1FFF;
						local560 = Class12_Sub2.anIntArray204[local411];
						local564 = Class12_Sub2.anIntArray203[local411];
						local207 = (local564 << 1) * -1;
						local198 = local560 * local389 >> 13;
						local215 = local333 * local560 >> 13;
					}
					@Pc(587) float local587 = (float) Math.random();
					@Pc(590) float local590 = (float) Math.random();
					if (local590 + local587 > 1.0F) {
						local590 = 1.0F - local590;
						local587 = 1.0F - local587;
					}
					@Pc(611) float local611 = 1.0F - local587 - local590;
					local411 = (int) ((float) this.aClass64_1.anInt1693 * local590 + local587 * (float) this.aClass64_1.anInt1701 + (float) this.aClass64_1.anInt1702 * local611);
					local560 = (int) (local611 * (float) this.aClass64_1.anInt1699 + local587 * (float) this.aClass64_1.anInt1690 + local590 * (float) this.aClass64_1.anInt1695);
					local564 = (int) (local611 * (float) this.aClass64_1.anInt1704 + (float) this.aClass64_1.anInt1691 * local587 + (float) this.aClass64_1.anInt1705 * local590);
					@Pc(699) int local699 = (int) (local611 * (float) this.aClass64_2.anInt1702 + local590 * (float) this.aClass64_2.anInt1693 + (float) this.aClass64_2.anInt1701 * local587);
					@Pc(721) int local721 = (int) ((float) this.aClass64_2.anInt1699 * local611 + local590 * (float) this.aClass64_2.anInt1695 + (float) this.aClass64_2.anInt1690 * local587);
					@Pc(743) int local743 = (int) ((float) this.aClass64_2.anInt1691 * local587 + (float) this.aClass64_2.anInt1705 * local590 + local611 * (float) this.aClass64_2.anInt1704);
					@Pc(748) int local748 = local411 - local699;
					@Pc(753) int local753 = local560 - local721;
					@Pc(758) int local758 = local564 - local743;
					@Pc(767) int local767 = (int) ((double) local699 + Math.random() * (double) local748);
					@Pc(776) int local776 = (int) ((double) local721 + Math.random() * (double) local753);
					@Pc(785) int local785 = (int) ((double) local758 * Math.random() + (double) local743);
					@Pc(802) int local802 = (int) (Math.random() * (double) (this.aClass308_1.anInt8934 - this.aClass308_1.anInt8904)) + this.aClass308_1.anInt8904;
					@Pc(818) int local818 = this.aClass308_1.anInt8947 + (int) (Math.random() * (double) (this.aClass308_1.anInt8956 - this.aClass308_1.anInt8947));
					@Pc(836) int local836 = this.aClass308_1.anInt8929 + (int) ((double) (this.aClass308_1.anInt8914 - this.aClass308_1.anInt8929) * Math.random());
					@Pc(900) int local900;
					if (this.aClass308_1.aBoolean643) {
						@Pc(842) double local842 = Math.random();
						local900 = (int) (Math.random() * (double) this.aClass308_1.anInt8915 + (double) this.aClass308_1.anInt8952) << 24 | (int) ((double) this.aClass308_1.anInt8916 + (double) this.aClass308_1.anInt8931 * local842) | (int) (local842 * (double) this.aClass308_1.anInt8936 + (double) this.aClass308_1.anInt8958) << 8 | (int) (local842 * (double) this.aClass308_1.anInt8943 + (double) this.aClass308_1.anInt8905) << 16;
					} else {
						local900 = (int) ((double) this.aClass308_1.anInt8915 * Math.random() + (double) this.aClass308_1.anInt8952) << 24 | (int) ((double) this.aClass308_1.anInt8916 + (double) this.aClass308_1.anInt8931 * Math.random()) | (int) (Math.random() * (double) this.aClass308_1.anInt8936 + (double) this.aClass308_1.anInt8958) << 8 | (int) ((double) this.aClass308_1.anInt8943 * Math.random() + (double) this.aClass308_1.anInt8905) << 16;
					}
					@Pc(964) int local964 = this.aClass308_1.anInt8946;
					if (!arg3.method8086() && !this.aClass308_1.lb) {
						local964 = -1;
					}
					if (Static597.anInt10382 == Static145.anInt2717) {
						new Class15_Sub2_Sub1_Sub1(this, local767, local776, local785, local198, local207, local215, local802, local818, local900, local836, local964, this.aClass308_1.aBoolean646, this.aClass308_1.aBoolean647);
					} else {
						@Pc(1008) Class15_Sub2_Sub1_Sub1 local1008 = Static458.aClass15_Sub2_Sub1_Sub1Array2[Static597.anInt10382];
						Static597.anInt10382 = Static597.anInt10382 + 1 & 0x3FF;
						local1008.method9322(this, local767, local776, local785, local198, local207, local215, local802, local818, local900, local836, local964, this.aClass308_1.aBoolean646, this.aClass308_1.aBoolean647);
					}
				}
			}
		}
		if (!this.aClass64_1.method1632(this.aClass64_2)) {
			@Pc(1048) Class64 local1048 = this.aClass64_2;
			this.aClass64_2 = this.aClass64_1;
			this.aClass64_1 = local1048;
			this.aClass64_1.anInt1693 = this.aClass283_2.anInt8245;
			this.aClass64_1.anInt1705 = this.aClass283_2.anInt8263;
			this.aClass64_1.anInt1699 = this.aClass283_2.anInt8257;
			this.aClass64_1.anInt1702 = this.aClass283_2.anInt8251;
			this.aClass64_1.anInt1704 = this.aClass283_2.anInt8244;
			this.aClass64_1.anInt1690 = this.aClass283_2.anInt8249;
			this.aClass64_1.anInt1691 = this.aClass283_2.anInt8246;
			this.aClass64_1.anInt1696 = this.aClass64_2.anInt1696;
			this.aClass64_1.anInt1700 = this.aClass64_2.anInt1700;
			this.aClass64_1.anInt1706 = this.aClass64_2.anInt1706;
			this.aClass64_1.anInt1695 = this.aClass283_2.anInt8254;
			this.aClass64_1.anInt1701 = this.aClass283_2.anInt8255;
		}
		this.anInt9777 = 0;
		for (@Pc(1136) Class15_Sub2_Sub1_Sub1 local1136 = (Class15_Sub2_Sub1_Sub1) this.aClass60_9.method1547(); local1136 != null; local1136 = (Class15_Sub2_Sub1_Sub1) this.aClass60_9.method1546()) {
			local1136.method9323(arg0, arg1);
			this.anInt9777++;
		}
		Static211.anInt4371 += this.anInt9777;
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(Lclient!ha;JI)V")
	public void method8569(@OriginalArg(0) Class101 arg0, @OriginalArg(1) long arg1) {
		for (@Pc(7) Class15_Sub2_Sub1_Sub1 local7 = (Class15_Sub2_Sub1_Sub1) this.aClass60_9.method1547(); local7 != null; local7 = (Class15_Sub2_Sub1_Sub1) this.aClass60_9.method1546()) {
			local7.method9320(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(I)V")
	public void method8570() {
		this.aClass64_1.anInt1695 = this.aClass283_2.anInt8254;
		this.aClass64_1.anInt1699 = this.aClass283_2.anInt8257;
		this.aClass64_1.anInt1693 = this.aClass283_2.anInt8245;
		this.aClass64_1.anInt1691 = this.aClass283_2.anInt8246;
		this.aClass64_1.anInt1702 = this.aClass283_2.anInt8251;
		this.aClass64_1.anInt1705 = this.aClass283_2.anInt8263;
		this.aClass64_1.anInt1701 = this.aClass283_2.anInt8255;
		this.aClass64_1.anInt1704 = this.aClass283_2.anInt8244;
		this.aClass64_1.anInt1690 = this.aClass283_2.anInt8249;
		if (this.aClass64_1.anInt1701 == this.aClass64_1.anInt1693 && this.aClass64_1.anInt1693 == this.aClass64_1.anInt1702 && this.aClass64_1.anInt1695 == this.aClass64_1.anInt1690 && this.aClass64_1.anInt1695 == this.aClass64_1.anInt1699 && this.aClass64_1.anInt1705 == this.aClass64_1.anInt1691 && this.aClass64_1.anInt1705 == this.aClass64_1.anInt1704) {
			this.aBoolean720 = true;
		} else if (this.aBoolean720) {
			this.aClass64_2.anInt1690 = this.aClass64_1.anInt1690;
			this.aClass64_2.anInt1704 = this.aClass64_1.anInt1704;
			this.aClass64_2.anInt1705 = this.aClass64_1.anInt1705;
			this.aClass64_2.anInt1699 = this.aClass64_1.anInt1699;
			this.aBoolean720 = false;
			this.aClass64_2.anInt1693 = this.aClass64_1.anInt1693;
			this.aClass64_2.anInt1691 = this.aClass64_1.anInt1691;
			this.aClass64_2.anInt1695 = this.aClass64_1.anInt1695;
			this.aClass64_2.anInt1702 = this.aClass64_1.anInt1702;
			this.aClass64_2.anInt1701 = this.aClass64_1.anInt1701;
		}
	}
}
