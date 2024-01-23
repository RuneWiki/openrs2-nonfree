import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!va")
public final class Class87_Sub3 extends Class87 {

	@OriginalMember(owner = "client!va", name = "k", descriptor = "I")
	private int anInt5223;

	@OriginalMember(owner = "client!va", name = "l", descriptor = "I")
	private int anInt5224;

	@OriginalMember(owner = "client!va", name = "p", descriptor = "I")
	private int anInt5226;

	@OriginalMember(owner = "client!va", name = "q", descriptor = "I")
	private int anInt5227;

	@OriginalMember(owner = "client!va", name = "u", descriptor = "I")
	private int anInt5229;

	@OriginalMember(owner = "client!va", name = "v", descriptor = "I")
	private int anInt5230;

	@OriginalMember(owner = "client!va", name = "w", descriptor = "I")
	private int anInt5231;

	@OriginalMember(owner = "client!va", name = "x", descriptor = "I")
	private int anInt5232;

	@OriginalMember(owner = "client!va", name = "y", descriptor = "I")
	public int anInt5233;

	@OriginalMember(owner = "client!va", name = "z", descriptor = "I")
	private int anInt5234;

	@OriginalMember(owner = "client!va", name = "A", descriptor = "I")
	private int anInt5235;

	@OriginalMember(owner = "client!va", name = "C", descriptor = "I")
	public int anInt5237;

	@OriginalMember(owner = "client!va", name = "D", descriptor = "I")
	public int anInt5238;

	@OriginalMember(owner = "client!va", name = "E", descriptor = "I")
	public int anInt5239;

	@OriginalMember(owner = "client!va", name = "J", descriptor = "I")
	private int anInt5242;

	@OriginalMember(owner = "client!va", name = "K", descriptor = "I")
	private int anInt5243;

	@OriginalMember(owner = "client!va", name = "N", descriptor = "I")
	private int anInt5245;

	@OriginalMember(owner = "client!va", name = "O", descriptor = "I")
	private int anInt5246;

	@OriginalMember(owner = "client!va", name = "P", descriptor = "I")
	private int anInt5247;

	@OriginalMember(owner = "client!va", name = "Q", descriptor = "I")
	private int anInt5248;

	@OriginalMember(owner = "client!va", name = "m", descriptor = "I")
	private int anInt5225 = 0;

	@OriginalMember(owner = "client!va", name = "F", descriptor = "Z")
	public boolean aBoolean357 = true;

	@OriginalMember(owner = "client!va", name = "I", descriptor = "Z")
	public boolean aBoolean358 = false;

	@OriginalMember(owner = "client!va", name = "s", descriptor = "Lclient!uj;")
	public Class180 aClass180_1;

	@OriginalMember(owner = "client!va", name = "n", descriptor = "Lclient!lg;")
	public Class87_Sub2 aClass87_Sub2_6;

	@OriginalMember(owner = "client!va", name = "o", descriptor = "Lclient!pn;")
	public Class141 aClass141_3;

	@OriginalMember(owner = "client!va", name = "r", descriptor = "J")
	private long aLong192;

	@OriginalMember(owner = "client!va", name = "M", descriptor = "Lclient!so;")
	public Class165 aClass165_2;

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Lclient!uj;Lclient!lg;J)V")
	public Class87_Sub3(@OriginalArg(0) Class180 arg0, @OriginalArg(1) Class87_Sub2 arg1, @OriginalArg(2) long arg2) {
		this.aClass180_1 = arg0;
		this.aClass87_Sub2_6 = arg1;
		this.aClass141_3 = new Class141();
		this.aLong192 = arg2;
		this.anInt5225 = (int) ((double) this.anInt5225 + Math.random() * 64.0D);
		this.aClass165_2 = this.aClass180_1.aClass165_1;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIIIIIIBI)V")
	public void method4461(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		this.anInt5245 = arg0;
		this.anInt5224 = arg5;
		this.anInt5231 = arg4;
		this.anInt5242 = arg1;
		this.anInt5232 = arg2;
		this.anInt5247 = arg3;
		@Pc(40) int local40 = this.aClass87_Sub2_6.anInt3120 + (this.anInt5232 + this.anInt5245 + this.anInt5242) / 3;
		this.anInt5248 = arg6;
		this.anInt5226 = arg8;
		this.anInt5229 = arg7;
		@Pc(64) int local64 = this.aClass87_Sub2_6.anInt3119 + (this.anInt5229 + this.anInt5224 + this.anInt5248) / 3;
		@Pc(79) int local79 = (this.anInt5231 + this.anInt5247 + this.anInt5226) / 3 + this.aClass87_Sub2_6.anInt3131;
		if (local40 != this.anInt5237 || this.anInt5233 != local79 || local64 != this.anInt5239) {
			this.anInt5237 = local40;
			this.aBoolean357 = true;
			this.anInt5239 = local64;
			this.anInt5233 = local79;
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IIZBJI)V")
	public void method4462(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) long arg3, @OriginalArg(5) int arg4) {
		@Pc(100) int local100;
		if (this.aBoolean358) {
			arg2 = false;
		} else if (this.aClass165_2.anInt4778 > Static158.anInt3114) {
			arg2 = false;
		} else if (Static158.anInt3111 > Static64.anIntArray112[Static158.anInt3114]) {
			arg2 = false;
		} else if (this.anInt5245 == this.anInt5232 && this.anInt5242 == this.anInt5245 && this.anInt5247 == this.anInt5231 && this.anInt5231 == this.anInt5226 && this.anInt5229 == this.anInt5224 && this.anInt5248 == this.anInt5229) {
			arg2 = false;
		} else if (this.aClass165_2.anInt4781 != -1) {
			local100 = (int) (arg3 - this.aLong192);
			if (this.aClass165_2.aBoolean332 || this.aClass165_2.anInt4781 >= local100) {
				local100 %= this.aClass165_2.anInt4781;
			} else {
				arg2 = false;
			}
			if (!this.aClass165_2.aBoolean328 && this.aClass165_2.anInt4817 > local100) {
				arg2 = false;
			}
			if (this.aClass165_2.aBoolean328 && this.aClass165_2.anInt4817 <= local100) {
				arg2 = false;
			}
		}
		if (arg2) {
			this.anInt5225 += (int) ((double) arg0 * (Math.random() * (double) (this.aClass165_2.anInt4824 - this.aClass165_2.anInt4809) + (double) this.aClass165_2.anInt4809));
			if (this.anInt5225 > 63) {
				local100 = this.anInt5225 >> 6;
				this.anInt5225 &= 0x3F;
				@Pc(214) int local214;
				@Pc(208) int local208;
				@Pc(220) int local220;
				@Pc(226) int local226;
				@Pc(232) int local232;
				@Pc(239) int local239;
				@Pc(340) int local340;
				@Pc(398) int local398;
				@Pc(421) int local421;
				if (this.aBoolean357) {
					local208 = this.anInt5231 - this.anInt5247;
					local214 = this.anInt5245 - this.anInt5232;
					local220 = this.anInt5229 - this.anInt5224;
					local226 = this.anInt5242 - this.anInt5232;
					local232 = this.anInt5226 - this.anInt5247;
					local239 = this.anInt5248 - this.anInt5224;
					this.anInt5227 = local226 * local220 - local239 * local214;
					this.anInt5246 = local208 * local239 - local232 * local220;
					this.anInt5223 = local214 * local232 - local226 * local208;
					while (true) {
						if (this.anInt5246 <= 32767 && this.anInt5227 <= 32767 && this.anInt5223 <= 32767 && this.anInt5246 >= -32767 && this.anInt5227 >= -32767 && this.anInt5223 >= -32767) {
							local340 = (int) Math.sqrt((double) (this.anInt5223 * this.anInt5223 + this.anInt5227 * this.anInt5227 + this.anInt5246 * this.anInt5246));
							if (local340 <= 0) {
								local340 = 1;
							}
							this.anInt5227 = this.anInt5227 * 32767 / local340;
							this.anInt5246 = this.anInt5246 * 32767 / local340;
							this.anInt5223 = this.anInt5223 * 32767 / local340;
							if (this.aClass165_2.aShort38 > 0 || this.aClass165_2.aShort36 > 0) {
								local398 = (int) (Math.atan2((double) this.anInt5223, (double) this.anInt5246) * 2047.0D / 6.283185307179586D);
								local421 = (int) (Math.atan2((double) this.anInt5227, Math.sqrt((double) (this.anInt5223 * this.anInt5223 + this.anInt5246 * this.anInt5246))) * 2047.0D / 6.283185307179586D);
								this.anInt5234 = this.aClass165_2.aShort38 - this.aClass165_2.aShort39;
								this.anInt5235 = this.aClass165_2.aShort36 - this.aClass165_2.aShort37;
								@Pc(447) int local447 = local398 - this.aClass87_Sub2_6.anInt3122;
								this.anInt5230 = local447 + this.aClass165_2.aShort39 - this.anInt5234 / 2;
								this.anInt5243 = local421 + this.aClass165_2.aShort37 - this.anInt5235 / 2;
							} else if (this.aClass87_Sub2_6.anInt3122 != 0) {
								local398 = this.anInt5246 * arg1 + this.anInt5223 * arg4 >> 16;
								this.anInt5223 = arg1 * this.anInt5223 - arg4 * this.anInt5246 >> 16;
								this.anInt5246 = local398;
							}
							this.aBoolean357 = false;
							break;
						}
						this.anInt5227 >>= 0x1;
						this.anInt5223 >>= 0x1;
						this.anInt5246 >>= 0x1;
					}
				}
				for (local226 = 0; local226 < local100; local226++) {
					@Pc(591) int local591;
					if (this.aClass165_2.aShort38 <= 0 && this.aClass165_2.aShort36 <= 0) {
						local214 = this.anInt5246;
						local220 = this.anInt5223;
						local208 = this.anInt5227;
					} else {
						local232 = this.anInt5230 + (int) ((double) this.anInt5234 * Math.random());
						local232 &= 0x7FF;
						local239 = Class135.anIntArray335[local232] >> 1;
						local340 = Class135.anIntArray338[local232] >> 1;
						local398 = this.anInt5243 + (int) (Math.random() * (double) this.anInt5235);
						local398 &= 0x3FF;
						local591 = Class135.anIntArray338[local398] >> 1;
						local421 = Class135.anIntArray335[local398] >> 1;
						local208 = local591 * -1;
						local214 = local340 * local421 >> 15;
						local220 = local421 * local239 >> 15;
					}
					local232 = (int) (Math.random() * 255.0D);
					local239 = (int) (Math.random() * 255.0D);
					local340 = local239 * (255 - local232) >> 8;
					local398 = 255 - local232 - local340;
					local591 = this.anInt5226 * local398 + this.anInt5231 * local340 + local232 * this.anInt5247 >> 8;
					@Pc(672) int local672 = this.anInt5248 * local398 + this.anInt5229 * local340 + this.anInt5224 * local232 >> 8;
					local421 = local232 * this.anInt5232 + local340 * this.anInt5245 + local398 * this.anInt5242 >> 8;
					@Pc(709) int local709;
					if (this.aClass87_Sub2_6.anInt3122 != 0) {
						local709 = local672 * arg4 + local421 * arg1 >> 16;
						local672 = arg1 * local672 - local421 * arg4 >> 16;
						local421 = local709;
					}
					@Pc(740) int local740 = this.aClass165_2.anInt4826 + (int) (Math.random() * (double) (this.aClass165_2.anInt4812 - this.aClass165_2.anInt4826));
					local709 = (int) ((double) (this.aClass165_2.anInt4813 - this.aClass165_2.anInt4784) * Math.random()) + this.aClass165_2.anInt4784;
					@Pc(819) int local819;
					if (this.aClass165_2.aBoolean331) {
						@Pc(823) double local823 = Math.random();
						local819 = (int) ((double) this.aClass165_2.anInt4792 + local823 * (double) this.aClass165_2.anInt4780) << 24 | (int) ((double) this.aClass165_2.anInt4803 + local823 * (double) this.aClass165_2.anInt4779) | (int) ((double) this.aClass165_2.anInt4811 + local823 * (double) this.aClass165_2.anInt4786) << 16 | (int) ((double) this.aClass165_2.anInt4798 + local823 * (double) this.aClass165_2.anInt4777) << 8;
					} else {
						local819 = (int) (Math.random() * (double) this.aClass165_2.anInt4780 + (double) this.aClass165_2.anInt4792) << 24 | (int) ((double) this.aClass165_2.anInt4779 * Math.random() + (double) this.aClass165_2.anInt4803) | (int) (Math.random() * (double) this.aClass165_2.anInt4786 + (double) this.aClass165_2.anInt4811) << 16 | (int) (Math.random() * (double) this.aClass165_2.anInt4777 + (double) this.aClass165_2.anInt4798) << 8;
					}
					if (Static158.anInt3107 == Static158.anInt3110) {
						new Class87_Sub1_Sub1(this, local421 + this.aClass87_Sub2_6.anInt3120, local591 + this.aClass87_Sub2_6.anInt3131, this.aClass87_Sub2_6.anInt3119 + local672, local214, local208, local220, local709, local740, local819);
					} else {
						@Pc(888) Class87_Sub1_Sub1 local888 = Static158.aClass87_Sub1_Sub1Array1[Static158.anInt3110];
						Static158.anInt3110 = Static158.anInt3110 + 1 & 0x3FF;
						local888.method4452(this, local421 + this.aClass87_Sub2_6.anInt3120, this.aClass87_Sub2_6.anInt3131 - -local591, this.aClass87_Sub2_6.anInt3119 + local672, local214, local208, local220, local709, local740, local819);
					}
				}
			}
		}
		this.anInt5238 = 0;
		for (@Pc(959) Class87_Sub1_Sub1 local959 = (Class87_Sub1_Sub1) this.aClass141_3.method3481(); local959 != null; local959 = (Class87_Sub1_Sub1) this.aClass141_3.method3477()) {
			local959.method4453(arg3, arg0);
			this.anInt5238++;
		}
		Static158.anInt3109 += this.anInt5238;
	}
}
