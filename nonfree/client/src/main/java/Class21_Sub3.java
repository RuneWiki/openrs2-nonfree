import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tj")
public final class Class21_Sub3 extends Class21 {

	@OriginalMember(owner = "client!tj", name = "g", descriptor = "I")
	private int anInt5145;

	@OriginalMember(owner = "client!tj", name = "h", descriptor = "I")
	private int anInt5146;

	@OriginalMember(owner = "client!tj", name = "j", descriptor = "I")
	private int anInt5147;

	@OriginalMember(owner = "client!tj", name = "l", descriptor = "I")
	private int anInt5149;

	@OriginalMember(owner = "client!tj", name = "m", descriptor = "I")
	private int anInt5150;

	@OriginalMember(owner = "client!tj", name = "n", descriptor = "I")
	private int anInt5151;

	@OriginalMember(owner = "client!tj", name = "o", descriptor = "I")
	private int anInt5152;

	@OriginalMember(owner = "client!tj", name = "p", descriptor = "I")
	public int anInt5153;

	@OriginalMember(owner = "client!tj", name = "t", descriptor = "I")
	private int anInt5156;

	@OriginalMember(owner = "client!tj", name = "u", descriptor = "I")
	private int anInt5157;

	@OriginalMember(owner = "client!tj", name = "v", descriptor = "I")
	private int anInt5158;

	@OriginalMember(owner = "client!tj", name = "w", descriptor = "I")
	private int anInt5159;

	@OriginalMember(owner = "client!tj", name = "B", descriptor = "I")
	private int anInt5162;

	@OriginalMember(owner = "client!tj", name = "D", descriptor = "I")
	private int anInt5163;

	@OriginalMember(owner = "client!tj", name = "F", descriptor = "I")
	private int anInt5164;

	@OriginalMember(owner = "client!tj", name = "G", descriptor = "I")
	private int anInt5165;

	@OriginalMember(owner = "client!tj", name = "J", descriptor = "I")
	public int anInt5167;

	@OriginalMember(owner = "client!tj", name = "L", descriptor = "I")
	public int anInt5168;

	@OriginalMember(owner = "client!tj", name = "M", descriptor = "I")
	public int anInt5169;

	@OriginalMember(owner = "client!tj", name = "O", descriptor = "I")
	private int anInt5171;

	@OriginalMember(owner = "client!tj", name = "H", descriptor = "Z")
	public boolean aBoolean348 = false;

	@OriginalMember(owner = "client!tj", name = "E", descriptor = "Z")
	public boolean aBoolean347 = true;

	@OriginalMember(owner = "client!tj", name = "I", descriptor = "I")
	private int anInt5166 = 0;

	@OriginalMember(owner = "client!tj", name = "s", descriptor = "Lclient!go;")
	public Class62 aClass62_1;

	@OriginalMember(owner = "client!tj", name = "K", descriptor = "Lclient!il;")
	public Class21_Sub1 aClass21_Sub1_6;

	@OriginalMember(owner = "client!tj", name = "C", descriptor = "Lclient!h;")
	public Class63 aClass63_3;

	@OriginalMember(owner = "client!tj", name = "i", descriptor = "Lclient!ig;")
	public Class74 aClass74_2;

	@OriginalMember(owner = "client!tj", name = "y", descriptor = "J")
	private long aLong184;

	@OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(Lclient!go;Lclient!il;J)V")
	public Class21_Sub3(@OriginalArg(0) Class62 arg0, @OriginalArg(1) Class21_Sub1 arg1, @OriginalArg(2) long arg2) {
		this.aClass62_1 = arg0;
		this.aClass21_Sub1_6 = arg1;
		this.aClass63_3 = new Class63();
		this.anInt5166 = (int) ((double) this.anInt5166 + Math.random() * 64.0D);
		this.aClass74_2 = this.aClass62_1.aClass74_1;
		this.aLong184 = arg2;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(JBZIII)V")
	public void method4117(@OriginalArg(0) long arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(85) int local85;
		if (this.aBoolean348) {
			arg1 = false;
		} else if (this.aClass74_2.anInt2294 > Static117.anInt2440) {
			arg1 = false;
		} else if (Static117.anInt2421 > Static132.anIntArray223[Static117.anInt2440]) {
			arg1 = false;
		} else if (this.anInt5171 == this.anInt5163 && this.anInt5164 == this.anInt5171 && this.anInt5162 == this.anInt5158 && this.anInt5145 == this.anInt5158 && this.anInt5151 == this.anInt5165 && this.anInt5151 == this.anInt5147) {
			arg1 = false;
		} else if (this.aClass74_2.anInt2307 != -1) {
			local85 = (int) (arg0 - this.aLong184);
			if (this.aClass74_2.aBoolean144 || this.aClass74_2.anInt2307 >= local85) {
				local85 %= this.aClass74_2.anInt2307;
			} else {
				arg1 = false;
			}
			if (!this.aClass74_2.aBoolean145 && local85 < this.aClass74_2.anInt2313) {
				arg1 = false;
			}
			if (this.aClass74_2.aBoolean145 && local85 >= this.aClass74_2.anInt2313) {
				arg1 = false;
			}
		}
		if (arg1) {
			this.anInt5166 += (int) (((double) this.aClass74_2.anInt2301 + (double) (this.aClass74_2.anInt2290 - this.aClass74_2.anInt2301) * Math.random()) * (double) arg4);
			if (this.anInt5166 > 63) {
				local85 = this.anInt5166 >> 6;
				this.anInt5166 &= 0x3F;
				@Pc(198) int local198;
				@Pc(205) int local205;
				@Pc(192) int local192;
				@Pc(212) int local212;
				@Pc(219) int local219;
				@Pc(236) int local236;
				@Pc(324) int local324;
				@Pc(387) int local387;
				@Pc(441) int local441;
				if (this.aBoolean347) {
					local192 = this.anInt5151 - this.anInt5165;
					local198 = this.anInt5171 - this.anInt5163;
					local205 = this.anInt5158 - this.anInt5162;
					local212 = this.anInt5164 - this.anInt5163;
					local219 = this.anInt5145 - this.anInt5162;
					this.anInt5152 = local219 * local198 - local212 * local205;
					local236 = this.anInt5147 - this.anInt5165;
					this.anInt5159 = local192 * local212 - local198 * local236;
					this.anInt5149 = local236 * local205 - local192 * local219;
					while (true) {
						if (this.anInt5149 <= 32767 && this.anInt5159 <= 32767 && this.anInt5152 <= 32767 && this.anInt5149 >= -32767 && this.anInt5159 >= -32767 && this.anInt5152 >= -32767) {
							local324 = (int) Math.sqrt((double) (this.anInt5149 * this.anInt5149 + this.anInt5159 * this.anInt5159 + this.anInt5152 * this.anInt5152));
							if (local324 <= 0) {
								local324 = 1;
							}
							this.anInt5149 = this.anInt5149 * 32767 / local324;
							this.anInt5152 = this.anInt5152 * 32767 / local324;
							this.anInt5159 = this.anInt5159 * 32767 / local324;
							if (this.aClass74_2.aShort18 > 0 || this.aClass74_2.aShort21 > 0) {
								local387 = (int) (Math.atan2((double) this.anInt5152, (double) this.anInt5149) * 2047.0D / 6.283185307179586D);
								local441 = (int) (Math.atan2((double) this.anInt5159, Math.sqrt((double) (this.anInt5149 * this.anInt5149 + this.anInt5152 * this.anInt5152))) * 2047.0D / 6.283185307179586D);
								this.anInt5156 = this.aClass74_2.aShort18 - this.aClass74_2.aShort20;
								@Pc(457) int local457 = local387 - this.aClass21_Sub1_6.anInt2429;
								this.anInt5150 = local457 + this.aClass74_2.aShort20 - this.anInt5156 / 2;
								this.anInt5157 = this.aClass74_2.aShort21 - this.aClass74_2.aShort19;
								this.anInt5146 = local441 + this.aClass74_2.aShort19 - this.anInt5157 / 2;
							} else if (this.aClass21_Sub1_6.anInt2429 != 0) {
								local387 = this.anInt5149 * arg2 + this.anInt5152 * arg3 >> 16;
								this.anInt5152 = this.anInt5152 * arg2 - this.anInt5149 * arg3 >> 16;
								this.anInt5149 = local387;
							}
							this.aBoolean347 = false;
							break;
						}
						this.anInt5149 >>= 0x1;
						this.anInt5152 >>= 0x1;
						this.anInt5159 >>= 0x1;
					}
				}
				for (local212 = 0; local212 < local85; local212++) {
					@Pc(589) int local589;
					if (this.aClass74_2.aShort18 <= 0 && this.aClass74_2.aShort21 <= 0) {
						local192 = this.anInt5152;
						local198 = this.anInt5149;
						local205 = this.anInt5159;
					} else {
						local219 = (int) (Math.random() * (double) this.anInt5156) + this.anInt5150;
						local219 &= 0x7FF;
						local387 = this.anInt5146 + (int) ((double) this.anInt5157 * Math.random());
						local236 = Class174.anIntArray444[local219] >> 1;
						local324 = Class174.anIntArray443[local219] >> 1;
						local387 &= 0x3FF;
						local441 = Class174.anIntArray444[local387] >> 1;
						local192 = local236 * local441 >> 15;
						local198 = local441 * local324 >> 15;
						local589 = Class174.anIntArray443[local387] >> 1;
						local205 = local589 * -1;
					}
					local219 = (int) (Math.random() * 255.0D);
					local236 = (int) (Math.random() * 255.0D);
					local324 = (255 - local219) * local236 >> 8;
					local387 = 255 - local219 - local324;
					local441 = local387 * this.anInt5164 + this.anInt5163 * local219 + local324 * this.anInt5171 >> 8;
					local589 = this.anInt5158 * local324 + local219 * this.anInt5162 + local387 * this.anInt5145 >> 8;
					@Pc(672) int local672 = this.anInt5151 * local324 + this.anInt5165 * local219 + this.anInt5147 * local387 >> 8;
					@Pc(689) int local689;
					if (this.aClass21_Sub1_6.anInt2429 != 0) {
						local689 = local672 * arg3 + arg2 * local441 >> 16;
						local672 = local672 * arg2 - local441 * arg3 >> 16;
						local441 = local689;
					}
					local689 = this.aClass74_2.anInt2309 + (int) (Math.random() * (double) (this.aClass74_2.anInt2276 - this.aClass74_2.anInt2309));
					@Pc(738) int local738 = this.aClass74_2.anInt2280 + (int) ((double) (this.aClass74_2.anInt2314 - this.aClass74_2.anInt2280) * Math.random());
					@Pc(800) int local800;
					if (this.aClass74_2.aBoolean147) {
						@Pc(804) double local804 = Math.random();
						local800 = (int) ((double) this.aClass74_2.anInt2321 * local804 + (double) this.aClass74_2.anInt2310) << 16 | (int) ((double) this.aClass74_2.anInt2326 + (double) this.aClass74_2.anInt2292 * local804) << 8 | (int) ((double) this.aClass74_2.anInt2278 * local804 + (double) this.aClass74_2.anInt2302) | (int) ((double) this.aClass74_2.anInt2303 * local804 + (double) this.aClass74_2.anInt2311) << 24;
					} else {
						local800 = (int) ((double) this.aClass74_2.anInt2292 * Math.random() + (double) this.aClass74_2.anInt2326) << 8 | (int) ((double) this.aClass74_2.anInt2321 * Math.random() + (double) this.aClass74_2.anInt2310) << 16 | (int) (Math.random() * (double) this.aClass74_2.anInt2278 + (double) this.aClass74_2.anInt2302) | (int) (Math.random() * (double) this.aClass74_2.anInt2303 + (double) this.aClass74_2.anInt2311) << 24;
					}
					if (Static117.anInt2416 == Static117.anInt2417) {
						new Class21_Sub2_Sub1(this, this.aClass21_Sub1_6.anInt2441 + local441, this.aClass21_Sub1_6.anInt2431 + local589, this.aClass21_Sub1_6.anInt2438 + local672, local198, local205, local192, local689, local738, local800);
					} else {
						@Pc(901) Class21_Sub2_Sub1 local901 = Static117.aClass21_Sub2_Sub1Array2[Static117.anInt2417];
						Static117.anInt2417 = Static117.anInt2417 + 1 & 0x3FF;
						local901.method4645(this, local441 + this.aClass21_Sub1_6.anInt2441, this.aClass21_Sub1_6.anInt2431 - -local589, local672 + this.aClass21_Sub1_6.anInt2438, local198, local205, local192, local689, local738, local800);
					}
				}
			}
		}
		this.anInt5168 = 0;
		for (@Pc(944) Class21_Sub2_Sub1 local944 = (Class21_Sub2_Sub1) this.aClass63_3.method1568(); local944 != null; local944 = (Class21_Sub2_Sub1) this.aClass63_3.method1571()) {
			local944.method4648(arg0, arg4);
			this.anInt5168++;
		}
		Static117.anInt2422 += this.anInt5168;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IZIIIIIIII)V")
	public void method4119(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		this.anInt5145 = arg5;
		this.anInt5147 = arg0;
		this.anInt5171 = arg2;
		this.anInt5164 = arg8;
		this.anInt5165 = arg4;
		this.anInt5162 = arg3;
		this.anInt5158 = arg7;
		this.anInt5163 = arg6;
		@Pc(49) int local49 = (this.anInt5163 + this.anInt5171 + this.anInt5164) / 3 + this.aClass21_Sub1_6.anInt2441;
		@Pc(64) int local64 = (this.anInt5158 + this.anInt5162 + this.anInt5145) / 3 + this.aClass21_Sub1_6.anInt2431;
		this.anInt5151 = arg1;
		@Pc(82) int local82 = (this.anInt5151 + this.anInt5165 + this.anInt5147) / 3 + this.aClass21_Sub1_6.anInt2438;
		if (local49 != this.anInt5153 || this.anInt5167 != local64 || this.anInt5169 != local82) {
			this.anInt5169 = local82;
			this.anInt5153 = local49;
			this.aBoolean347 = true;
			this.anInt5167 = local64;
		}
	}
}
