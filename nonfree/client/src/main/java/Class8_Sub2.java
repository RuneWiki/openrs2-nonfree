import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bj")
public final class Class8_Sub2 extends Class8 {

	@OriginalMember(owner = "client!bj", name = "w", descriptor = "I")
	public int anInt806;

	@OriginalMember(owner = "client!bj", name = "J", descriptor = "I")
	private int anInt810;

	@OriginalMember(owner = "client!bj", name = "H", descriptor = "I")
	private int anInt811;

	@OriginalMember(owner = "client!bj", name = "u", descriptor = "I")
	private int anInt812;

	@OriginalMember(owner = "client!bj", name = "o", descriptor = "I")
	private int anInt813;

	@OriginalMember(owner = "client!bj", name = "r", descriptor = "I")
	private int anInt814;

	@OriginalMember(owner = "client!bj", name = "t", descriptor = "I")
	private int anInt815;

	@OriginalMember(owner = "client!bj", name = "m", descriptor = "I")
	private int anInt816;

	@OriginalMember(owner = "client!bj", name = "D", descriptor = "I")
	private int anInt809 = 0;

	@OriginalMember(owner = "client!bj", name = "E", descriptor = "Z")
	public boolean aBoolean66 = false;

	@OriginalMember(owner = "client!bj", name = "x", descriptor = "Lclient!oj;")
	public Class263 aClass263_1 = new Class263();

	@OriginalMember(owner = "client!bj", name = "L", descriptor = "Lclient!oj;")
	private Class263 aClass263_2 = new Class263();

	@OriginalMember(owner = "client!bj", name = "A", descriptor = "Z")
	private boolean aBoolean67 = false;

	@OriginalMember(owner = "client!bj", name = "q", descriptor = "Lclient!kq;")
	public final Class8_Sub5 aClass8_Sub5_1;

	@OriginalMember(owner = "client!bj", name = "z", descriptor = "J")
	private final long aLong24;

	@OriginalMember(owner = "client!bj", name = "C", descriptor = "Lclient!jk;")
	public final Class189 aClass189_1;

	@OriginalMember(owner = "client!bj", name = "I", descriptor = "Lclient!jd;")
	public Class184 aClass184_1;

	@OriginalMember(owner = "client!bj", name = "F", descriptor = "Lclient!eba;")
	public final Class98 aClass98_1;

	@OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(Lclient!ha;Lclient!jk;Lclient!kq;J)V")
	public Class8_Sub2(@OriginalArg(0) Class57 arg0, @OriginalArg(1) Class189 arg1, @OriginalArg(2) Class8_Sub5 arg2, @OriginalArg(3) long arg3) {
		this.aClass8_Sub5_1 = arg2;
		this.aLong24 = arg3;
		this.aClass189_1 = arg1;
		this.aClass184_1 = this.aClass189_1.method4147();
		if (!arg0.method7644() && this.aClass184_1.anInt4725 != -1) {
			this.aClass184_1 = Static602.method8655(this.aClass184_1.anInt4725);
		}
		this.aClass98_1 = new Class98();
		this.anInt809 = (int) ((double) this.anInt809 + Math.random() * 64.0D);
		this.method767();
		this.aClass263_2.anInt7320 = this.aClass263_1.anInt7320;
		this.aClass263_2.anInt7315 = this.aClass263_1.anInt7315;
		this.aClass263_2.anInt7318 = this.aClass263_1.anInt7318;
		this.aClass263_2.anInt7311 = this.aClass263_1.anInt7311;
		this.aClass263_2.anInt7323 = this.aClass263_1.anInt7323;
		this.aClass263_2.anInt7325 = this.aClass263_1.anInt7325;
		this.aClass263_2.anInt7314 = this.aClass263_1.anInt7314;
		this.aClass263_2.anInt7317 = this.aClass263_1.anInt7317;
		this.aClass263_2.anInt7324 = this.aClass263_1.anInt7324;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V")
	public void method767() {
		this.aClass263_1.anInt7325 = this.aClass189_1.anInt4895;
		this.aClass263_1.anInt7317 = this.aClass189_1.anInt4883;
		this.aClass263_1.anInt7318 = this.aClass189_1.anInt4886;
		this.aClass263_1.anInt7320 = this.aClass189_1.anInt4898;
		this.aClass263_1.anInt7324 = this.aClass189_1.anInt4888;
		this.aClass263_1.anInt7315 = this.aClass189_1.anInt4896;
		this.aClass263_1.anInt7314 = this.aClass189_1.anInt4900;
		this.aClass263_1.anInt7311 = this.aClass189_1.anInt4899;
		this.aClass263_1.anInt7323 = this.aClass189_1.anInt4894;
		if (this.aClass263_1.anInt7315 == this.aClass263_1.anInt7323 && this.aClass263_1.anInt7325 == this.aClass263_1.anInt7315 && this.aClass263_1.anInt7317 == this.aClass263_1.anInt7314 && this.aClass263_1.anInt7314 == this.aClass263_1.anInt7318 && this.aClass263_1.anInt7311 == this.aClass263_1.anInt7324 && this.aClass263_1.anInt7320 == this.aClass263_1.anInt7324) {
			this.aBoolean67 = true;
		} else if (this.aBoolean67) {
			this.aClass263_2.anInt7320 = this.aClass263_1.anInt7320;
			this.aBoolean67 = false;
			this.aClass263_2.anInt7324 = this.aClass263_1.anInt7324;
			this.aClass263_2.anInt7314 = this.aClass263_1.anInt7314;
			this.aClass263_2.anInt7318 = this.aClass263_1.anInt7318;
			this.aClass263_2.anInt7325 = this.aClass263_1.anInt7325;
			this.aClass263_2.anInt7311 = this.aClass263_1.anInt7311;
			this.aClass263_2.anInt7315 = this.aClass263_1.anInt7315;
			this.aClass263_2.anInt7317 = this.aClass263_1.anInt7317;
			this.aClass263_2.anInt7323 = this.aClass263_1.anInt7323;
		}
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lclient!ha;JB)V")
	public void method769(@OriginalArg(0) Class57 arg0, @OriginalArg(1) long arg1) {
		for (@Pc(21) Class8_Sub8_Sub1_Sub1 local21 = (Class8_Sub8_Sub1_Sub1) this.aClass98_1.method1777(); local21 != null; local21 = (Class8_Sub8_Sub1_Sub1) this.aClass98_1.method1782()) {
			local21.method6336(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(ZLclient!ha;IIJ)V")
	public void method770(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class57 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) long arg3) {
		if (this.aBoolean66) {
			arg0 = false;
		} else if (this.aClass184_1.anInt4700 > Static554.anInt9335) {
			arg0 = false;
		} else if (Static89.anIntArray74[Static554.anInt9335] < Static87.anInt1455) {
			arg0 = false;
		} else if (this.aBoolean67) {
			arg0 = false;
		} else if (this.aClass184_1.anInt4730 != -1) {
			@Pc(50) int local50 = (int) (arg3 - this.aLong24);
			if (this.aClass184_1.aBoolean369 || local50 <= this.aClass184_1.anInt4730) {
				local50 %= this.aClass184_1.anInt4730;
			} else {
				arg0 = false;
			}
			if (!this.aClass184_1.aBoolean374 && this.aClass184_1.anInt4741 > local50) {
				arg0 = false;
			}
			if (this.aClass184_1.aBoolean374 && local50 >= this.aClass184_1.anInt4741) {
				arg0 = false;
			}
		}
		if (arg0) {
			Static94.anInt1546++;
			@Pc(142) int local142 = (this.aClass263_1.anInt7315 + this.aClass263_1.anInt7323 + this.aClass263_1.anInt7325) / 3;
			@Pc(157) int local157 = (this.aClass263_1.anInt7314 + this.aClass263_1.anInt7317 + this.aClass263_1.anInt7318) / 3;
			@Pc(171) int local171 = (this.aClass263_1.anInt7311 + this.aClass263_1.anInt7324 + this.aClass263_1.anInt7320) / 3;
			@Pc(211) int local211;
			@Pc(219) int local219;
			@Pc(227) int local227;
			@Pc(236) int local236;
			@Pc(244) int local244;
			@Pc(252) int local252;
			@Pc(359) int local359;
			@Pc(414) int local414;
			@Pc(435) int local435;
			if (this.aClass263_1.anInt7316 != local142 || local157 != this.aClass263_1.anInt7321 || this.aClass263_1.anInt7322 != local171) {
				this.aClass263_1.anInt7321 = local157;
				this.aClass263_1.anInt7316 = local142;
				this.aClass263_1.anInt7322 = local171;
				local211 = this.aClass263_1.anInt7315 - this.aClass263_1.anInt7323;
				local219 = this.aClass263_1.anInt7314 - this.aClass263_1.anInt7317;
				local227 = this.aClass263_1.anInt7324 - this.aClass263_1.anInt7311;
				local236 = this.aClass263_1.anInt7325 - this.aClass263_1.anInt7323;
				local244 = this.aClass263_1.anInt7318 - this.aClass263_1.anInt7317;
				local252 = this.aClass263_1.anInt7320 - this.aClass263_1.anInt7311;
				this.anInt812 = local252 * local219 - local227 * local244;
				this.anInt810 = local211 * local244 - local219 * local236;
				this.anInt811 = local236 * local227 - local252 * local211;
				while (true) {
					if (this.anInt812 <= 32767 && this.anInt811 <= 32767 && this.anInt810 <= 32767 && this.anInt812 >= -32767 && this.anInt811 >= -32767 && this.anInt810 >= -32767) {
						local359 = (int) Math.sqrt((double) (this.anInt811 * this.anInt811 + this.anInt812 * this.anInt812 + this.anInt810 * this.anInt810));
						if (local359 <= 0) {
							local359 = 1;
						}
						this.anInt810 = this.anInt810 * 32767 / local359;
						this.anInt812 = this.anInt812 * 32767 / local359;
						this.anInt811 = this.anInt811 * 32767 / local359;
						if (this.aClass184_1.aShort72 > 0 || this.aClass184_1.aShort73 > 0) {
							local414 = (int) (Math.atan2((double) this.anInt810, (double) this.anInt812) * 2607.5945876176133D);
							local435 = (int) (Math.atan2((double) this.anInt811, Math.sqrt((double) (this.anInt810 * this.anInt810 + this.anInt812 * this.anInt812))) * 2607.5945876176133D);
							this.anInt816 = this.aClass184_1.aShort72 - this.aClass184_1.aShort70;
							this.anInt815 = local414 + this.aClass184_1.aShort70 - (this.anInt816 >> 1);
							this.anInt814 = this.aClass184_1.aShort73 - this.aClass184_1.aShort71;
							this.anInt813 = local435 + this.aClass184_1.aShort71 - (this.anInt814 >> 1);
						}
						break;
					}
					this.anInt812 >>= 0x1;
					this.anInt811 >>= 0x1;
					this.anInt810 >>= 0x1;
				}
			}
			this.anInt809 += (int) (((double) (this.aClass184_1.anInt4704 - this.aClass184_1.anInt4722) * Math.random() + (double) this.aClass184_1.anInt4722) * (double) arg2);
			if (this.anInt809 > 63) {
				local211 = this.anInt809 >> 6;
				this.anInt809 &= 0x3F;
				for (local244 = 0; local244 < local211; local244++) {
					@Pc(581) int local581;
					@Pc(585) int local585;
					if (this.aClass184_1.aShort72 <= 0 && this.aClass184_1.aShort73 <= 0) {
						local227 = this.anInt811;
						local236 = this.anInt810;
						local219 = this.anInt812;
					} else {
						local252 = this.anInt815 + (int) (Math.random() * (double) this.anInt816);
						local252 &= 0x3FFF;
						local359 = Class5_Sub12.anIntArray544[local252];
						local414 = Class5_Sub12.anIntArray543[local252];
						local435 = (int) ((double) this.anInt814 * Math.random()) + this.anInt813;
						local435 &= 0x1FFF;
						local581 = Class5_Sub12.anIntArray544[local435];
						local585 = Class5_Sub12.anIntArray543[local435];
						local219 = local581 * local414 >> 13;
						local227 = (local585 << 1) * -1;
						local236 = local359 * local581 >> 13;
					}
					@Pc(619) float local619 = (float) Math.random();
					@Pc(622) float local622 = (float) Math.random();
					if (local622 + local619 > 1.0F) {
						local619 = 1.0F - local619;
						local622 = 1.0F - local622;
					}
					@Pc(644) float local644 = 1.0F - local619 - local622;
					local435 = (int) ((float) this.aClass263_1.anInt7323 * local619 + local622 * (float) this.aClass263_1.anInt7315 + local644 * (float) this.aClass263_1.anInt7325);
					local581 = (int) (local644 * (float) this.aClass263_1.anInt7318 + (float) this.aClass263_1.anInt7314 * local622 + (float) this.aClass263_1.anInt7317 * local619);
					local585 = (int) ((float) this.aClass263_1.anInt7320 * local644 + (float) this.aClass263_1.anInt7324 * local622 + (float) this.aClass263_1.anInt7311 * local619);
					@Pc(732) int local732 = (int) (local619 * (float) this.aClass263_2.anInt7323 + (float) this.aClass263_2.anInt7315 * local622 + local644 * (float) this.aClass263_2.anInt7325);
					@Pc(754) int local754 = (int) (local619 * (float) this.aClass263_2.anInt7317 + local622 * (float) this.aClass263_2.anInt7314 + local644 * (float) this.aClass263_2.anInt7318);
					@Pc(776) int local776 = (int) (local619 * (float) this.aClass263_2.anInt7311 + local622 * (float) this.aClass263_2.anInt7324 + (float) this.aClass263_2.anInt7320 * local644);
					@Pc(781) int local781 = local435 - local732;
					@Pc(786) int local786 = local581 - local754;
					@Pc(791) int local791 = local585 - local776;
					@Pc(800) int local800 = (int) ((double) local732 + Math.random() * (double) local781);
					@Pc(809) int local809 = (int) (Math.random() * (double) local786 + (double) local754);
					@Pc(818) int local818 = (int) ((double) local776 + (double) local791 * Math.random());
					@Pc(836) int local836 = this.aClass184_1.anInt4709 + (int) (Math.random() * (double) (this.aClass184_1.anInt4703 - this.aClass184_1.anInt4709));
					@Pc(852) int local852 = (int) (Math.random() * (double) (this.aClass184_1.anInt4699 - this.aClass184_1.anInt4719)) + this.aClass184_1.anInt4719;
					@Pc(869) int local869 = this.aClass184_1.anInt4715 + (int) (Math.random() * (double) (this.aClass184_1.anInt4717 - this.aClass184_1.anInt4715));
					@Pc(933) int local933;
					if (this.aClass184_1.aBoolean376) {
						@Pc(875) double local875 = Math.random();
						local933 = (int) (local875 * (double) this.aClass184_1.anInt4716 + (double) this.aClass184_1.anInt4743) << 16 | (int) ((double) this.aClass184_1.anInt4744 * local875 + (double) this.aClass184_1.anInt4748) << 8 | (int) ((double) this.aClass184_1.anInt4727 + (double) this.aClass184_1.anInt4695 * local875) | (int) ((double) this.aClass184_1.anInt4701 + (double) this.aClass184_1.anInt4723 * Math.random()) << 24;
					} else {
						local933 = (int) (Math.random() * (double) this.aClass184_1.anInt4723 + (double) this.aClass184_1.anInt4701) << 24 | (int) (Math.random() * (double) this.aClass184_1.anInt4695 + (double) this.aClass184_1.anInt4727) | (int) ((double) this.aClass184_1.anInt4748 + (double) this.aClass184_1.anInt4744 * Math.random()) << 8 | (int) ((double) this.aClass184_1.anInt4716 * Math.random() + (double) this.aClass184_1.anInt4743) << 16;
					}
					@Pc(997) int local997 = this.aClass184_1.anInt4707;
					if (!arg1.method7644() && !this.aClass184_1.aBoolean373) {
						local997 = -1;
					}
					if (Static236.anInt3939 == Static411.anInt7152) {
						new Class8_Sub8_Sub1_Sub1(this, local800, local809, local818, local219, local227, local236, local836, local852, local933, local869, local997, this.aClass184_1.aBoolean375, this.aClass184_1.aBoolean372);
					} else {
						@Pc(1019) Class8_Sub8_Sub1_Sub1 local1019 = Static350.aClass8_Sub8_Sub1_Sub1Array2[Static236.anInt3939];
						Static236.anInt3939 = Static236.anInt3939 + 1 & 0x3FF;
						local1019.method6337(this, local800, local809, local818, local219, local227, local236, local836, local852, local933, local869, local997, this.aClass184_1.aBoolean375, this.aClass184_1.aBoolean372);
					}
				}
			}
		}
		if (!this.aClass263_1.method6314(this.aClass263_2)) {
			@Pc(1085) Class263 local1085 = this.aClass263_2;
			this.aClass263_2 = this.aClass263_1;
			this.aClass263_1 = local1085;
			this.aClass263_1.anInt7323 = this.aClass189_1.anInt4894;
			this.aClass263_1.anInt7325 = this.aClass189_1.anInt4895;
			this.aClass263_1.anInt7317 = this.aClass189_1.anInt4883;
			this.aClass263_1.anInt7318 = this.aClass189_1.anInt4886;
			this.aClass263_1.anInt7324 = this.aClass189_1.anInt4888;
			this.aClass263_1.anInt7311 = this.aClass189_1.anInt4899;
			this.aClass263_1.anInt7320 = this.aClass189_1.anInt4898;
			this.aClass263_1.anInt7322 = this.aClass263_2.anInt7322;
			this.aClass263_1.anInt7314 = this.aClass189_1.anInt4900;
			this.aClass263_1.anInt7315 = this.aClass189_1.anInt4896;
			this.aClass263_1.anInt7321 = this.aClass263_2.anInt7321;
			this.aClass263_1.anInt7316 = this.aClass263_2.anInt7316;
		}
		this.anInt806 = 0;
		for (@Pc(1173) Class8_Sub8_Sub1_Sub1 local1173 = (Class8_Sub8_Sub1_Sub1) this.aClass98_1.method1777(); local1173 != null; local1173 = (Class8_Sub8_Sub1_Sub1) this.aClass98_1.method1782()) {
			local1173.method6338(arg3, arg2);
			this.anInt806++;
		}
		Static35.anInt9303 += this.anInt806;
	}
}
