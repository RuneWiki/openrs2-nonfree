import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!we")
public final class Class4_Sub10 extends Class4 {

	@OriginalMember(owner = "client!we", name = "v", descriptor = "I")
	public int anInt10772;

	@OriginalMember(owner = "client!we", name = "y", descriptor = "I")
	private int anInt10780;

	@OriginalMember(owner = "client!we", name = "w", descriptor = "I")
	private int anInt10781;

	@OriginalMember(owner = "client!we", name = "n", descriptor = "I")
	private int anInt10782;

	@OriginalMember(owner = "client!we", name = "p", descriptor = "I")
	private int anInt10783;

	@OriginalMember(owner = "client!we", name = "h", descriptor = "I")
	private int anInt10784;

	@OriginalMember(owner = "client!we", name = "u", descriptor = "I")
	private int anInt10785;

	@OriginalMember(owner = "client!we", name = "q", descriptor = "I")
	private int anInt10786;

	@OriginalMember(owner = "client!we", name = "z", descriptor = "Z")
	public boolean aBoolean924 = false;

	@OriginalMember(owner = "client!we", name = "F", descriptor = "I")
	private int anInt10773 = 0;

	@OriginalMember(owner = "client!we", name = "o", descriptor = "Lclient!ska;")
	public Class340 aClass340_1 = new Class340();

	@OriginalMember(owner = "client!we", name = "H", descriptor = "Lclient!ska;")
	private Class340 aClass340_2 = new Class340();

	@OriginalMember(owner = "client!we", name = "i", descriptor = "Z")
	private boolean aBoolean925 = false;

	@OriginalMember(owner = "client!we", name = "I", descriptor = "Lclient!hv;")
	public final Class4_Sub7 aClass4_Sub7_8;

	@OriginalMember(owner = "client!we", name = "l", descriptor = "Lclient!uda;")
	public final Class364 aClass364_2;

	@OriginalMember(owner = "client!we", name = "r", descriptor = "J")
	private final long aLong342;

	@OriginalMember(owner = "client!we", name = "C", descriptor = "Lclient!saa;")
	public Class334 aClass334_1;

	@OriginalMember(owner = "client!we", name = "k", descriptor = "Lclient!re;")
	public final Class320 aClass320_9;

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "(Lclient!ha;Lclient!uda;Lclient!hv;J)V")
	public Class4_Sub10(@OriginalArg(0) Class145 arg0, @OriginalArg(1) Class364 arg1, @OriginalArg(2) Class4_Sub7 arg2, @OriginalArg(3) long arg3) {
		this.aClass4_Sub7_8 = arg2;
		this.aClass364_2 = arg1;
		this.aLong342 = arg3;
		this.aClass334_1 = this.aClass364_2.method8670();
		if (!arg0.method9693() && this.aClass334_1.anInt8950 != -1) {
			this.aClass334_1 = Static490.method7039(this.aClass334_1.anInt8950);
		}
		this.aClass320_9 = new Class320();
		this.anInt10773 = (int) ((double) this.anInt10773 + Math.random() * 64.0D);
		this.method9418();
		this.aClass340_2.anInt9213 = this.aClass340_1.anInt9213;
		this.aClass340_2.anInt9220 = this.aClass340_1.anInt9220;
		this.aClass340_2.anInt9228 = this.aClass340_1.anInt9228;
		this.aClass340_2.anInt9223 = this.aClass340_1.anInt9223;
		this.aClass340_2.anInt9227 = this.aClass340_1.anInt9227;
		this.aClass340_2.anInt9222 = this.aClass340_1.anInt9222;
		this.aClass340_2.anInt9224 = this.aClass340_1.anInt9224;
		this.aClass340_2.anInt9215 = this.aClass340_1.anInt9215;
		this.aClass340_2.anInt9225 = this.aClass340_1.anInt9225;
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(Z)V")
	public void method9418() {
		this.aClass340_1.anInt9215 = this.aClass364_2.anInt9820;
		this.aClass340_1.anInt9227 = this.aClass364_2.anInt9831;
		this.aClass340_1.anInt9213 = this.aClass364_2.anInt9819;
		this.aClass340_1.anInt9224 = this.aClass364_2.anInt9821;
		this.aClass340_1.anInt9225 = this.aClass364_2.anInt9832;
		this.aClass340_1.anInt9223 = this.aClass364_2.anInt9825;
		this.aClass340_1.anInt9228 = this.aClass364_2.anInt9830;
		this.aClass340_1.anInt9220 = this.aClass364_2.anInt9826;
		this.aClass340_1.anInt9222 = this.aClass364_2.anInt9827;
		if (this.aClass340_1.anInt9215 == this.aClass340_1.anInt9223 && this.aClass340_1.anInt9215 == this.aClass340_1.anInt9222 && this.aClass340_1.anInt9225 == this.aClass340_1.anInt9213 && this.aClass340_1.anInt9225 == this.aClass340_1.anInt9227 && this.aClass340_1.anInt9224 == this.aClass340_1.anInt9220 && this.aClass340_1.anInt9224 == this.aClass340_1.anInt9228) {
			this.aBoolean925 = true;
		} else if (this.aBoolean925) {
			this.aClass340_2.anInt9227 = this.aClass340_1.anInt9227;
			this.aClass340_2.anInt9215 = this.aClass340_1.anInt9215;
			this.aClass340_2.anInt9213 = this.aClass340_1.anInt9213;
			this.aClass340_2.anInt9228 = this.aClass340_1.anInt9228;
			this.aClass340_2.anInt9220 = this.aClass340_1.anInt9220;
			this.aClass340_2.anInt9222 = this.aClass340_1.anInt9222;
			this.aClass340_2.anInt9223 = this.aClass340_1.anInt9223;
			this.aBoolean925 = false;
			this.aClass340_2.anInt9224 = this.aClass340_1.anInt9224;
			this.aClass340_2.anInt9225 = this.aClass340_1.anInt9225;
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Lclient!ha;JB)V")
	public void method9421(@OriginalArg(0) Class145 arg0, @OriginalArg(1) long arg1) {
		for (@Pc(7) Class4_Sub1_Sub1_Sub1 local7 = (Class4_Sub1_Sub1_Sub1) this.aClass320_9.method7605(); local7 != null; local7 = (Class4_Sub1_Sub1_Sub1) this.aClass320_9.method7608()) {
			local7.method5193(arg0, arg1);
		}
		if (-10 > -103) {
			;
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Lclient!ha;IZIJ)V")
	public void method9424(@OriginalArg(0) Class145 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) long arg3) {
		@Pc(57) int local57;
		if (this.aBoolean924) {
			arg1 = false;
		} else if (this.aClass334_1.anInt8953 > Static261.anInt10710) {
			arg1 = false;
		} else if (Static352.anInt5419 > Static235.anIntArray289[Static261.anInt10710]) {
			arg1 = false;
		} else if (this.aBoolean925) {
			arg1 = false;
		} else if (this.aClass334_1.anInt8968 != -1) {
			local57 = (int) (arg3 - this.aLong342);
			if (this.aClass334_1.aBoolean764 || local57 <= this.aClass334_1.anInt8968) {
				local57 %= this.aClass334_1.anInt8968;
			} else {
				arg1 = false;
			}
			if (!this.aClass334_1.aBoolean761 && this.aClass334_1.anInt8927 > local57) {
				arg1 = false;
			}
			if (this.aClass334_1.aBoolean761 && this.aClass334_1.anInt8927 <= local57) {
				arg1 = false;
			}
		}
		if (arg1) {
			Static286.anInt4422++;
			local57 = (this.aClass340_1.anInt9223 + this.aClass340_1.anInt9215 + this.aClass340_1.anInt9222) / 3;
			@Pc(155) int local155 = (this.aClass340_1.anInt9227 + this.aClass340_1.anInt9225 + this.aClass340_1.anInt9213) / 3;
			@Pc(169) int local169 = (this.aClass340_1.anInt9228 + this.aClass340_1.anInt9224 + this.aClass340_1.anInt9220) / 3;
			@Pc(220) int local220;
			@Pc(229) int local229;
			@Pc(237) int local237;
			@Pc(245) int local245;
			@Pc(253) int local253;
			@Pc(261) int local261;
			@Pc(362) int local362;
			@Pc(417) int local417;
			@Pc(438) int local438;
			if (local57 != this.aClass340_1.anInt9218 || local155 != this.aClass340_1.anInt9217 || local169 != this.aClass340_1.anInt9226) {
				this.aClass340_1.anInt9226 = local169;
				this.aClass340_1.anInt9218 = local57;
				this.aClass340_1.anInt9217 = local155;
				local220 = this.aClass340_1.anInt9215 - this.aClass340_1.anInt9223;
				local229 = this.aClass340_1.anInt9225 - this.aClass340_1.anInt9213;
				local237 = this.aClass340_1.anInt9224 - this.aClass340_1.anInt9220;
				local245 = this.aClass340_1.anInt9222 - this.aClass340_1.anInt9223;
				local253 = this.aClass340_1.anInt9227 - this.aClass340_1.anInt9213;
				local261 = this.aClass340_1.anInt9228 - this.aClass340_1.anInt9220;
				this.anInt10780 = local237 * local245 - local220 * local261;
				this.anInt10783 = local220 * local253 - local245 * local229;
				this.anInt10781 = local261 * local229 - local237 * local253;
				while (true) {
					if (this.anInt10781 <= 32767 && this.anInt10780 <= 32767 && this.anInt10783 <= 32767 && this.anInt10781 >= -32767 && this.anInt10780 >= -32767 && this.anInt10783 >= -32767) {
						local362 = (int) Math.sqrt((double) (this.anInt10783 * this.anInt10783 + this.anInt10781 * this.anInt10781 + this.anInt10780 * this.anInt10780));
						if (local362 <= 0) {
							local362 = 1;
						}
						this.anInt10783 = this.anInt10783 * 32767 / local362;
						this.anInt10780 = this.anInt10780 * 32767 / local362;
						this.anInt10781 = this.anInt10781 * 32767 / local362;
						if (this.aClass334_1.aShort116 > 0 || this.aClass334_1.aShort117 > 0) {
							local417 = (int) (Math.atan2((double) this.anInt10783, (double) this.anInt10781) * 2607.5945876176133D);
							local438 = (int) (Math.atan2((double) this.anInt10780, Math.sqrt((double) (this.anInt10783 * this.anInt10783 + this.anInt10781 * this.anInt10781))) * 2607.5945876176133D);
							this.anInt10786 = this.aClass334_1.aShort116 - this.aClass334_1.aShort118;
							this.anInt10784 = this.aClass334_1.aShort118 + local417 - (this.anInt10786 >> 1);
							this.anInt10782 = this.aClass334_1.aShort117 - this.aClass334_1.aShort119;
							this.anInt10785 = local438 + this.aClass334_1.aShort119 - (this.anInt10782 >> 1);
						}
						break;
					}
					this.anInt10781 >>= 0x1;
					this.anInt10783 >>= 0x1;
					this.anInt10780 >>= 0x1;
				}
			}
			this.anInt10773 += (int) ((double) arg2 * (Math.random() * (double) (this.aClass334_1.anInt8951 - this.aClass334_1.anInt8949) + (double) this.aClass334_1.anInt8949));
			if (this.anInt10773 > 63) {
				local220 = this.anInt10773 >> 6;
				this.anInt10773 &= 0x3F;
				for (local253 = 0; local253 < local220; local253++) {
					@Pc(581) int local581;
					@Pc(585) int local585;
					if (this.aClass334_1.aShort116 <= 0 && this.aClass334_1.aShort117 <= 0) {
						local229 = this.anInt10781;
						local237 = this.anInt10780;
						local245 = this.anInt10783;
					} else {
						local261 = this.anInt10784 + (int) ((double) this.anInt10786 * Math.random());
						local261 &= 0x3FFF;
						local362 = Class145_Sub1.anIntArray761[local261];
						local417 = Class145_Sub1.anIntArray760[local261];
						local438 = this.anInt10785 + (int) (Math.random() * (double) this.anInt10782);
						local438 &= 0x1FFF;
						local581 = Class145_Sub1.anIntArray761[local438];
						local585 = Class145_Sub1.anIntArray760[local438];
						local229 = local581 * local417 >> 13;
						local237 = (local585 << 1) * -1;
						local245 = local581 * local362 >> 13;
					}
					@Pc(619) float local619 = (float) Math.random();
					@Pc(622) float local622 = (float) Math.random();
					if (local619 + local622 > 1.0F) {
						local619 = 1.0F - local619;
						local622 = 1.0F - local622;
					}
					@Pc(643) float local643 = 1.0F - local622 - local619;
					local438 = (int) (local619 * (float) this.aClass340_1.anInt9223 + local622 * (float) this.aClass340_1.anInt9215 + (float) this.aClass340_1.anInt9222 * local643);
					local581 = (int) ((float) this.aClass340_1.anInt9227 * local643 + (float) this.aClass340_1.anInt9213 * local619 + local622 * (float) this.aClass340_1.anInt9225);
					local585 = (int) (local619 * (float) this.aClass340_1.anInt9220 + (float) this.aClass340_1.anInt9224 * local622 + (float) this.aClass340_1.anInt9228 * local643);
					@Pc(731) int local731 = (int) ((float) this.aClass340_2.anInt9222 * local643 + local619 * (float) this.aClass340_2.anInt9223 + (float) this.aClass340_2.anInt9215 * local622);
					@Pc(753) int local753 = (int) ((float) this.aClass340_2.anInt9227 * local643 + local622 * (float) this.aClass340_2.anInt9225 + (float) this.aClass340_2.anInt9213 * local619);
					@Pc(775) int local775 = (int) ((float) this.aClass340_2.anInt9224 * local622 + (float) this.aClass340_2.anInt9220 * local619 + local643 * (float) this.aClass340_2.anInt9228);
					@Pc(780) int local780 = local438 - local731;
					@Pc(784) int local784 = local581 - local753;
					@Pc(789) int local789 = local585 - local775;
					@Pc(798) int local798 = (int) ((double) local780 * Math.random() + (double) local731);
					@Pc(807) int local807 = (int) ((double) local753 + (double) local784 * Math.random());
					@Pc(816) int local816 = (int) (Math.random() * (double) local789 + (double) local775);
					@Pc(834) int local834 = this.aClass334_1.anInt8929 + (int) (Math.random() * (double) (this.aClass334_1.anInt8943 - this.aClass334_1.anInt8929));
					@Pc(851) int local851 = this.aClass334_1.anInt8930 + (int) (Math.random() * (double) (this.aClass334_1.anInt8932 - this.aClass334_1.anInt8930));
					@Pc(869) int local869 = this.aClass334_1.anInt8934 + (int) (Math.random() * (double) (this.aClass334_1.anInt8961 - this.aClass334_1.anInt8934));
					@Pc(933) int local933;
					if (this.aClass334_1.aBoolean757) {
						@Pc(875) double local875 = Math.random();
						local933 = (int) (Math.random() * (double) this.aClass334_1.anInt8963 + (double) this.aClass334_1.anInt8925) << 24 | (int) (local875 * (double) this.aClass334_1.anInt8974 + (double) this.aClass334_1.anInt8937) << 16 | (int) ((double) this.aClass334_1.anInt8947 + (double) this.aClass334_1.anInt8954 * local875) << 8 | (int) ((double) this.aClass334_1.anInt8928 * local875 + (double) this.aClass334_1.anInt8962);
					} else {
						local933 = (int) (Math.random() * (double) this.aClass334_1.anInt8928 + (double) this.aClass334_1.anInt8962) | (int) ((double) this.aClass334_1.anInt8947 + (double) this.aClass334_1.anInt8954 * Math.random()) << 8 | (int) ((double) this.aClass334_1.anInt8937 + Math.random() * (double) this.aClass334_1.anInt8974) << 16 | (int) ((double) this.aClass334_1.anInt8963 * Math.random() + (double) this.aClass334_1.anInt8925) << 24;
					}
					@Pc(997) int local997 = this.aClass334_1.anInt8970;
					if (!arg0.method9693() && !this.aClass334_1.aBoolean760) {
						local997 = -1;
					}
					if (Static245.anInt3829 == Static660.anInt10311) {
						new Class4_Sub1_Sub1_Sub1(this, local798, local807, local816, local229, local237, local245, local834, local851, local933, local869, local997, this.aClass334_1.aBoolean759, this.aClass334_1.aBoolean765);
					} else {
						@Pc(1039) Class4_Sub1_Sub1_Sub1 local1039 = Static249.aClass4_Sub1_Sub1_Sub1Array1[Static660.anInt10311];
						Static660.anInt10311 = Static660.anInt10311 + 1 & 0x3FF;
						local1039.method5195(this, local798, local807, local816, local229, local237, local245, local834, local851, local933, local869, local997, this.aClass334_1.aBoolean759, this.aClass334_1.aBoolean765);
					}
				}
			}
		}
		if (!this.aClass340_1.method8127(this.aClass340_2)) {
			@Pc(1085) Class340 local1085 = this.aClass340_2;
			this.aClass340_2 = this.aClass340_1;
			this.aClass340_1 = local1085;
			this.aClass340_1.anInt9217 = this.aClass340_2.anInt9217;
			this.aClass340_1.anInt9213 = this.aClass364_2.anInt9819;
			this.aClass340_1.anInt9215 = this.aClass364_2.anInt9820;
			this.aClass340_1.anInt9220 = this.aClass364_2.anInt9826;
			this.aClass340_1.anInt9224 = this.aClass364_2.anInt9821;
			this.aClass340_1.anInt9225 = this.aClass364_2.anInt9832;
			this.aClass340_1.anInt9228 = this.aClass364_2.anInt9830;
			this.aClass340_1.anInt9227 = this.aClass364_2.anInt9831;
			this.aClass340_1.anInt9222 = this.aClass364_2.anInt9827;
			this.aClass340_1.anInt9218 = this.aClass340_2.anInt9218;
			this.aClass340_1.anInt9223 = this.aClass364_2.anInt9825;
			this.aClass340_1.anInt9226 = this.aClass340_2.anInt9226;
		}
		this.anInt10772 = 0;
		for (@Pc(1183) Class4_Sub1_Sub1_Sub1 local1183 = (Class4_Sub1_Sub1_Sub1) this.aClass320_9.method7605(); local1183 != null; local1183 = (Class4_Sub1_Sub1_Sub1) this.aClass320_9.method7608()) {
			local1183.method5194(arg3, arg2);
			this.anInt10772++;
		}
		Static43.anInt584 += this.anInt10772;
	}
}
