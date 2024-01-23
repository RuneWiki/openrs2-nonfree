import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wm")
public final class Class20_Sub3 extends Class20 {

	@OriginalMember(owner = "client!wm", name = "o", descriptor = "I")
	private int anInt6063;

	@OriginalMember(owner = "client!wm", name = "r", descriptor = "I")
	private int anInt6065;

	@OriginalMember(owner = "client!wm", name = "s", descriptor = "I")
	private int anInt6066;

	@OriginalMember(owner = "client!wm", name = "t", descriptor = "I")
	private int anInt6067;

	@OriginalMember(owner = "client!wm", name = "u", descriptor = "I")
	private int anInt6068;

	@OriginalMember(owner = "client!wm", name = "w", descriptor = "I")
	private int anInt6069;

	@OriginalMember(owner = "client!wm", name = "A", descriptor = "I")
	private int anInt6071;

	@OriginalMember(owner = "client!wm", name = "B", descriptor = "I")
	private int anInt6072;

	@OriginalMember(owner = "client!wm", name = "C", descriptor = "I")
	private int anInt6073;

	@OriginalMember(owner = "client!wm", name = "D", descriptor = "I")
	private int anInt6074;

	@OriginalMember(owner = "client!wm", name = "G", descriptor = "I")
	private int anInt6076;

	@OriginalMember(owner = "client!wm", name = "M", descriptor = "I")
	private int anInt6081;

	@OriginalMember(owner = "client!wm", name = "N", descriptor = "I")
	private int anInt6082;

	@OriginalMember(owner = "client!wm", name = "O", descriptor = "I")
	private int anInt6083;

	@OriginalMember(owner = "client!wm", name = "Q", descriptor = "I")
	public int anInt6084;

	@OriginalMember(owner = "client!wm", name = "R", descriptor = "I")
	public int anInt6085;

	@OriginalMember(owner = "client!wm", name = "S", descriptor = "I")
	private int anInt6086;

	@OriginalMember(owner = "client!wm", name = "T", descriptor = "I")
	public int anInt6087;

	@OriginalMember(owner = "client!wm", name = "U", descriptor = "I")
	public int anInt6088;

	@OriginalMember(owner = "client!wm", name = "V", descriptor = "I")
	private int anInt6089;

	@OriginalMember(owner = "client!wm", name = "E", descriptor = "Z")
	public boolean aBoolean404 = false;

	@OriginalMember(owner = "client!wm", name = "F", descriptor = "I")
	private int anInt6075 = 0;

	@OriginalMember(owner = "client!wm", name = "X", descriptor = "Z")
	public boolean aBoolean405 = true;

	@OriginalMember(owner = "client!wm", name = "y", descriptor = "Lclient!gl;")
	public Class20_Sub2 aClass20_Sub2_7;

	@OriginalMember(owner = "client!wm", name = "K", descriptor = "Lclient!vf;")
	public Class185 aClass185_1;

	@OriginalMember(owner = "client!wm", name = "p", descriptor = "Lclient!di;")
	public Class33 aClass33_3;

	@OriginalMember(owner = "client!wm", name = "n", descriptor = "J")
	private long aLong215;

	@OriginalMember(owner = "client!wm", name = "z", descriptor = "Lclient!hm;")
	public Class75 aClass75_2;

	@OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(Lclient!vf;Lclient!gl;J)V")
	public Class20_Sub3(@OriginalArg(0) Class185 arg0, @OriginalArg(1) Class20_Sub2 arg1, @OriginalArg(2) long arg2) {
		this.aClass20_Sub2_7 = arg1;
		this.aClass185_1 = arg0;
		this.aClass33_3 = new Class33();
		this.aLong215 = arg2;
		this.aClass75_2 = this.aClass185_1.aClass75_1;
		this.anInt6075 = (int) ((double) this.anInt6075 + Math.random() * 64.0D);
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIIIIIIIII)V")
	public void method4763(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		this.anInt6072 = arg0;
		this.anInt6083 = arg8;
		this.anInt6069 = arg2;
		this.anInt6089 = arg1;
		this.anInt6081 = arg7;
		this.anInt6074 = arg5;
		this.anInt6076 = arg3;
		this.anInt6073 = arg4;
		this.anInt6066 = arg6;
		@Pc(46) int local46 = this.aClass20_Sub2_7.anInt2326 + (this.anInt6066 + this.anInt6069 + this.anInt6083) / 3;
		@Pc(63) int local63 = (this.anInt6076 + this.anInt6072 + this.anInt6074) / 3 + this.aClass20_Sub2_7.anInt2322;
		@Pc(78) int local78 = (this.anInt6089 + this.anInt6073 + this.anInt6081) / 3 + this.aClass20_Sub2_7.anInt2328;
		if (this.anInt6084 != local63 || this.anInt6085 != local46 || this.anInt6088 != local78) {
			this.anInt6088 = local78;
			this.aBoolean405 = true;
			this.anInt6085 = local46;
			this.anInt6084 = local63;
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IZIBJI)V")
	public void method4766(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) long arg3, @OriginalArg(5) int arg4) {
		@Pc(80) int local80;
		if (this.aBoolean404) {
			arg1 = false;
		} else if (this.aClass75_2.anInt2533 > Static97.anInt2319) {
			arg1 = false;
		} else if (Static97.anInt2312 > Static130.anIntArray294[Static97.anInt2319]) {
			arg1 = false;
		} else if (this.anInt6072 == this.anInt6074 && this.anInt6074 == this.anInt6076 && this.anInt6066 == this.anInt6069 && this.anInt6083 == this.anInt6069 && this.anInt6081 == this.anInt6073 && this.anInt6073 == this.anInt6089) {
			arg1 = false;
		} else if (this.aClass75_2.anInt2539 != -1) {
			local80 = (int) (arg3 - this.aLong215);
			if (this.aClass75_2.aBoolean167 || local80 <= this.aClass75_2.anInt2539) {
				local80 %= this.aClass75_2.anInt2539;
			} else {
				arg1 = false;
			}
			if (!this.aClass75_2.aBoolean170 && local80 < this.aClass75_2.anInt2568) {
				arg1 = false;
			}
			if (this.aClass75_2.aBoolean170 && local80 >= this.aClass75_2.anInt2568) {
				arg1 = false;
			}
		}
		if (arg1) {
			this.anInt6075 += (int) ((double) arg0 * ((double) this.aClass75_2.anInt2549 + (double) (this.aClass75_2.anInt2531 - this.aClass75_2.anInt2549) * Math.random()));
			if (this.anInt6075 > 63) {
				local80 = this.anInt6075 >> 6;
				this.anInt6075 &= 0x3F;
				@Pc(196) int local196;
				@Pc(202) int local202;
				@Pc(208) int local208;
				@Pc(215) int local215;
				@Pc(228) int local228;
				@Pc(222) int local222;
				@Pc(327) int local327;
				@Pc(393) int local393;
				@Pc(448) int local448;
				if (this.aBoolean405) {
					local196 = this.anInt6074 - this.anInt6072;
					local202 = this.anInt6069 - this.anInt6066;
					local208 = this.anInt6073 - this.anInt6081;
					local215 = this.anInt6076 - this.anInt6072;
					local222 = this.anInt6089 - this.anInt6081;
					local228 = this.anInt6083 - this.anInt6066;
					this.anInt6071 = local222 * local202 - local208 * local228;
					this.anInt6067 = local228 * local196 - local215 * local202;
					this.anInt6068 = local208 * local215 - local222 * local196;
					while (true) {
						if (this.anInt6071 <= 32767 && this.anInt6068 <= 32767 && this.anInt6067 <= 32767 && this.anInt6071 >= -32767 && this.anInt6068 >= -32767 && this.anInt6067 >= -32767) {
							local327 = (int) Math.sqrt((double) (this.anInt6068 * this.anInt6068 + this.anInt6071 * this.anInt6071 + this.anInt6067 * this.anInt6067));
							if (local327 <= 0) {
								local327 = 1;
							}
							this.anInt6067 = this.anInt6067 * 32767 / local327;
							this.anInt6071 = this.anInt6071 * 32767 / local327;
							this.anInt6068 = this.anInt6068 * 32767 / local327;
							if (this.aClass75_2.aShort32 > 0 || this.aClass75_2.aShort33 > 0) {
								local393 = (int) (Math.atan2((double) this.anInt6067, (double) this.anInt6071) * 2047.0D / 6.283185307179586D);
								local448 = (int) (Math.atan2((double) this.anInt6068, Math.sqrt((double) (this.anInt6067 * this.anInt6067 + this.anInt6071 * this.anInt6071))) * 2047.0D / 6.283185307179586D);
								this.anInt6082 = this.aClass75_2.aShort32 - this.aClass75_2.aShort35;
								this.anInt6065 = this.aClass75_2.aShort33 - this.aClass75_2.aShort34;
								this.anInt6086 = local448 + this.aClass75_2.aShort34 - this.anInt6065 / 2;
								@Pc(487) int local487 = local393 - this.aClass20_Sub2_7.anInt2334;
								this.anInt6063 = this.aClass75_2.aShort35 + local487 - this.anInt6082 / 2;
							} else if (this.aClass20_Sub2_7.anInt2334 != 0) {
								local393 = this.anInt6067 * arg4 + this.anInt6071 * arg2 >> 16;
								this.anInt6067 = arg2 * this.anInt6067 - this.anInt6071 * arg4 >> 16;
								this.anInt6071 = local393;
							}
							this.aBoolean405 = false;
							break;
						}
						this.anInt6067 >>= 0x1;
						this.anInt6068 >>= 0x1;
						this.anInt6071 >>= 0x1;
					}
				}
				for (local215 = 0; local215 < local80; local215++) {
					@Pc(583) int local583;
					if (this.aClass75_2.aShort32 <= 0 && this.aClass75_2.aShort33 <= 0) {
						local202 = this.anInt6068;
						local196 = this.anInt6071;
						local208 = this.anInt6067;
					} else {
						local228 = (int) ((double) this.anInt6082 * Math.random()) + this.anInt6063;
						local228 &= 0x7FF;
						local327 = Class1.anIntArray3[local228] >> 1;
						local222 = Class1.anIntArray4[local228] >> 1;
						local393 = (int) ((double) this.anInt6065 * Math.random()) + this.anInt6086;
						local393 &= 0x3FF;
						local448 = Class1.anIntArray4[local393] >> 1;
						local196 = local448 * local327 >> 15;
						local208 = local222 * local448 >> 15;
						local583 = Class1.anIntArray3[local393] >> 1;
						local202 = local583 * -1;
					}
					local222 = (int) (Math.random() * 255.0D);
					local228 = (int) (Math.random() * 255.0D);
					local327 = local222 * (255 - local228) >> 8;
					local393 = 255 - local327 - local228;
					local448 = local228 * this.anInt6072 + this.anInt6074 * local327 + local393 * this.anInt6076 >> 8;
					local583 = local393 * this.anInt6083 + local327 * this.anInt6069 + local228 * this.anInt6066 >> 8;
					@Pc(679) int local679 = local228 * this.anInt6081 + this.anInt6073 * local327 + this.anInt6089 * local393 >> 8;
					@Pc(694) int local694;
					if (this.aClass20_Sub2_7.anInt2334 != 0) {
						local694 = local679 * arg4 + local448 * arg2 >> 16;
						local679 = arg2 * local679 - arg4 * local448 >> 16;
						local448 = local694;
					}
					local694 = (int) ((double) (this.aClass75_2.anInt2573 - this.aClass75_2.anInt2570) * Math.random()) + this.aClass75_2.anInt2570;
					@Pc(742) int local742 = this.aClass75_2.anInt2544 + (int) ((double) (this.aClass75_2.anInt2543 - this.aClass75_2.anInt2544) * Math.random());
					@Pc(806) int local806;
					if (this.aClass75_2.aBoolean165) {
						@Pc(748) double local748 = Math.random();
						local806 = (int) ((double) this.aClass75_2.anInt2555 + local748 * (double) this.aClass75_2.anInt2528) << 8 | (int) ((double) this.aClass75_2.anInt2526 * local748 + (double) this.aClass75_2.anInt2550) << 16 | (int) ((double) this.aClass75_2.anInt2530 + (double) this.aClass75_2.anInt2560 * local748) | (int) ((double) this.aClass75_2.anInt2569 * local748 + (double) this.aClass75_2.anInt2552) << 24;
					} else {
						local806 = (int) ((double) this.aClass75_2.anInt2569 * Math.random() + (double) this.aClass75_2.anInt2552) << 24 | (int) ((double) this.aClass75_2.anInt2530 + Math.random() * (double) this.aClass75_2.anInt2560) | (int) ((double) this.aClass75_2.anInt2550 + (double) this.aClass75_2.anInt2526 * Math.random()) << 16 | (int) ((double) this.aClass75_2.anInt2528 * Math.random() + (double) this.aClass75_2.anInt2555) << 8;
					}
					if (Static97.anInt2317 == Static97.anInt2311) {
						new Class20_Sub1_Sub1(this, local448 + this.aClass20_Sub2_7.anInt2322, local583 + this.aClass20_Sub2_7.anInt2326, this.aClass20_Sub2_7.anInt2328 + local679, local196, local202, local208, local694, local742, local806);
					} else {
						@Pc(905) Class20_Sub1_Sub1 local905 = Static97.aClass20_Sub1_Sub1Array1[Static97.anInt2311];
						Static97.anInt2311 = Static97.anInt2311 + 1 & 0x3FF;
						local905.method3698(this, this.aClass20_Sub2_7.anInt2322 + local448, this.aClass20_Sub2_7.anInt2326 - -local583, this.aClass20_Sub2_7.anInt2328 + local679, local196, local202, local208, local694, local742, local806);
					}
				}
			}
		}
		this.anInt6087 = 0;
		for (@Pc(954) Class20_Sub1_Sub1 local954 = (Class20_Sub1_Sub1) this.aClass33_3.method978(); local954 != null; local954 = (Class20_Sub1_Sub1) this.aClass33_3.method980()) {
			local954.method3700(arg3, arg0);
			this.anInt6087++;
		}
		Static97.anInt2310 += this.anInt6087;
	}
}
