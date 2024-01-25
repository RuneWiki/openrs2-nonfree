import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hu")
public final class Class11_Sub6 extends Class11 {

	@OriginalMember(owner = "client!hu", name = "y", descriptor = "I")
	public int anInt4596;

	@OriginalMember(owner = "client!hu", name = "D", descriptor = "I")
	private int anInt4599;

	@OriginalMember(owner = "client!hu", name = "E", descriptor = "I")
	private int anInt4600;

	@OriginalMember(owner = "client!hu", name = "F", descriptor = "I")
	private int anInt4601;

	@OriginalMember(owner = "client!hu", name = "G", descriptor = "I")
	private int anInt4602;

	@OriginalMember(owner = "client!hu", name = "H", descriptor = "I")
	private int anInt4603;

	@OriginalMember(owner = "client!hu", name = "I", descriptor = "I")
	private int anInt4604;

	@OriginalMember(owner = "client!hu", name = "J", descriptor = "I")
	private int anInt4605;

	@OriginalMember(owner = "client!hu", name = "z", descriptor = "I")
	private int anInt4597 = 0;

	@OriginalMember(owner = "client!hu", name = "w", descriptor = "Z")
	public boolean aBoolean385 = false;

	@OriginalMember(owner = "client!hu", name = "n", descriptor = "Lclient!el;")
	public Class95 aClass95_1 = new Class95();

	@OriginalMember(owner = "client!hu", name = "C", descriptor = "Lclient!el;")
	private Class95 aClass95_2 = new Class95();

	@OriginalMember(owner = "client!hu", name = "K", descriptor = "Z")
	private boolean aBoolean387 = false;

	@OriginalMember(owner = "client!hu", name = "t", descriptor = "Lclient!gi;")
	public final Class130 aClass130_2;

	@OriginalMember(owner = "client!hu", name = "s", descriptor = "J")
	private final long aLong126;

	@OriginalMember(owner = "client!hu", name = "m", descriptor = "Lclient!f;")
	public final Class11_Sub4 aClass11_Sub4_7;

	@OriginalMember(owner = "client!hu", name = "p", descriptor = "Lclient!fe;")
	public Class106 aClass106_1;

	@OriginalMember(owner = "client!hu", name = "v", descriptor = "Lclient!hda;")
	public final Class143 aClass143_5;

	@OriginalMember(owner = "client!hu", name = "<init>", descriptor = "(Lclient!ha;Lclient!gi;Lclient!f;J)V")
	public Class11_Sub6(@OriginalArg(0) Class87 arg0, @OriginalArg(1) Class130 arg1, @OriginalArg(2) Class11_Sub4 arg2, @OriginalArg(3) long arg3) {
		this.aClass130_2 = arg1;
		this.aLong126 = arg3;
		this.aClass11_Sub4_7 = arg2;
		this.aClass106_1 = this.aClass130_2.method3303();
		if (!arg0.method7912() && this.aClass106_1.anInt3425 != -1) {
			this.aClass106_1 = Static471.method6780(this.aClass106_1.anInt3425);
		}
		this.aClass143_5 = new Class143();
		this.anInt4597 = (int) ((double) this.anInt4597 + Math.random() * 64.0D);
		this.method3806();
		this.aClass95_2.anInt2947 = this.aClass95_1.anInt2947;
		this.aClass95_2.anInt2952 = this.aClass95_1.anInt2952;
		this.aClass95_2.anInt2943 = this.aClass95_1.anInt2943;
		this.aClass95_2.anInt2944 = this.aClass95_1.anInt2944;
		this.aClass95_2.anInt2938 = this.aClass95_1.anInt2938;
		this.aClass95_2.anInt2945 = this.aClass95_1.anInt2945;
		this.aClass95_2.anInt2939 = this.aClass95_1.anInt2939;
		this.aClass95_2.anInt2950 = this.aClass95_1.anInt2950;
		this.aClass95_2.anInt2954 = this.aClass95_1.anInt2954;
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(Lclient!ha;JI)V")
	public void method3804(@OriginalArg(0) Class87 arg0, @OriginalArg(1) long arg1) {
		for (@Pc(9) Class11_Sub5_Sub1_Sub1 local9 = (Class11_Sub5_Sub1_Sub1) this.aClass143_5.method3536(); local9 != null; local9 = (Class11_Sub5_Sub1_Sub1) this.aClass143_5.method3528()) {
			local9.method3319(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(ZIBJLclient!ha;)V")
	public void method3805(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) long arg2, @OriginalArg(4) Class87 arg3) {
		@Pc(33) int local33;
		if (this.aBoolean385) {
			arg0 = false;
		} else if (Static97.anInt1908 < this.aClass106_1.anInt3423) {
			arg0 = false;
		} else if (Static620.anInt10087 > Static197.anIntArray285[Static97.anInt1908]) {
			arg0 = false;
		} else if (this.aBoolean387) {
			arg0 = false;
		} else if (this.aClass106_1.anInt3420 != -1) {
			local33 = (int) (arg2 - this.aLong126);
			if (this.aClass106_1.aBoolean291 || this.aClass106_1.anInt3420 >= local33) {
				local33 %= this.aClass106_1.anInt3420;
			} else {
				arg0 = false;
			}
			if (!this.aClass106_1.aBoolean288 && this.aClass106_1.anInt3395 > local33) {
				arg0 = false;
			}
			if (this.aClass106_1.aBoolean288 && this.aClass106_1.anInt3395 <= local33) {
				arg0 = false;
			}
		}
		if (arg0) {
			Static565.anInt9337++;
			local33 = (this.aClass95_1.anInt2952 + this.aClass95_1.anInt2938 + this.aClass95_1.anInt2950) / 3;
			@Pc(124) int local124 = (this.aClass95_1.anInt2954 + this.aClass95_1.anInt2947 + this.aClass95_1.anInt2939) / 3;
			@Pc(139) int local139 = (this.aClass95_1.anInt2943 + this.aClass95_1.anInt2945 + this.aClass95_1.anInt2944) / 3;
			@Pc(186) int local186;
			@Pc(195) int local195;
			@Pc(204) int local204;
			@Pc(212) int local212;
			@Pc(221) int local221;
			@Pc(230) int local230;
			@Pc(327) int local327;
			@Pc(377) int local377;
			@Pc(398) int local398;
			if (local33 != this.aClass95_1.anInt2941 || local124 != this.aClass95_1.anInt2946 || local139 != this.aClass95_1.anInt2953) {
				this.aClass95_1.anInt2953 = local139;
				this.aClass95_1.anInt2941 = local33;
				this.aClass95_1.anInt2946 = local124;
				local186 = this.aClass95_1.anInt2938 - this.aClass95_1.anInt2950;
				local195 = this.aClass95_1.anInt2947 - this.aClass95_1.anInt2939;
				local204 = this.aClass95_1.anInt2945 - this.aClass95_1.anInt2943;
				local212 = this.aClass95_1.anInt2952 - this.aClass95_1.anInt2950;
				local221 = this.aClass95_1.anInt2954 - this.aClass95_1.anInt2939;
				local230 = this.aClass95_1.anInt2944 - this.aClass95_1.anInt2943;
				this.anInt4602 = local230 * local195 - local204 * local221;
				this.anInt4604 = local212 * local204 - local230 * local186;
				this.anInt4599 = local221 * local186 - local212 * local195;
				while (true) {
					if (this.anInt4602 <= 32767 && this.anInt4604 <= 32767 && this.anInt4599 <= 32767 && this.anInt4602 >= -32767 && this.anInt4604 >= -32767 && this.anInt4599 >= -32767) {
						local327 = (int) Math.sqrt((double) (this.anInt4602 * this.anInt4602 + this.anInt4604 * this.anInt4604 + this.anInt4599 * this.anInt4599));
						if (local327 <= 0) {
							local327 = 1;
						}
						this.anInt4602 = this.anInt4602 * 32767 / local327;
						this.anInt4604 = this.anInt4604 * 32767 / local327;
						this.anInt4599 = this.anInt4599 * 32767 / local327;
						if (this.aClass106_1.aShort53 > 0 || this.aClass106_1.aShort51 > 0) {
							local377 = (int) (Math.atan2((double) this.anInt4599, (double) this.anInt4602) * 2607.5945876176133D);
							local398 = (int) (Math.atan2((double) this.anInt4604, Math.sqrt((double) (this.anInt4599 * this.anInt4599 + this.anInt4602 * this.anInt4602))) * 2607.5945876176133D);
							this.anInt4603 = this.aClass106_1.aShort53 - this.aClass106_1.aShort52;
							this.anInt4600 = local377 + this.aClass106_1.aShort52 - (this.anInt4603 >> 1);
							this.anInt4605 = this.aClass106_1.aShort51 - this.aClass106_1.aShort54;
							this.anInt4601 = this.aClass106_1.aShort54 + local398 - (this.anInt4605 >> 1);
						}
						break;
					}
					this.anInt4599 >>= 0x1;
					this.anInt4602 >>= 0x1;
					this.anInt4604 >>= 0x1;
				}
			}
			this.anInt4597 += (int) (((double) (this.aClass106_1.anInt3414 - this.aClass106_1.anInt3406) * Math.random() + (double) this.aClass106_1.anInt3406) * (double) arg1);
			if (this.anInt4597 > 63) {
				local186 = this.anInt4597 >> 6;
				this.anInt4597 &= 0x3F;
				for (local221 = 0; local221 < local186; local221++) {
					@Pc(549) int local549;
					@Pc(553) int local553;
					if (this.aClass106_1.aShort53 <= 0 && this.aClass106_1.aShort51 <= 0) {
						local212 = this.anInt4599;
						local195 = this.anInt4602;
						local204 = this.anInt4604;
					} else {
						local230 = (int) (Math.random() * (double) this.anInt4603) + this.anInt4600;
						local230 &= 0x3FFF;
						local327 = Class353.anIntArray681[local230];
						local377 = Class353.anIntArray682[local230];
						local398 = this.anInt4601 + (int) ((double) this.anInt4605 * Math.random());
						local398 &= 0x1FFF;
						local549 = Class353.anIntArray681[local398];
						local553 = Class353.anIntArray682[local398];
						local204 = (local553 << 1) * -1;
						local195 = local549 * local377 >> 13;
						local212 = local327 * local549 >> 13;
					}
					@Pc(576) float local576 = (float) Math.random();
					@Pc(579) float local579 = (float) Math.random();
					if (local579 + local576 > 1.0F) {
						local579 = 1.0F - local579;
						local576 = 1.0F - local576;
					}
					@Pc(600) float local600 = 1.0F - local576 - local579;
					local398 = (int) (local600 * (float) this.aClass95_1.anInt2952 + (float) this.aClass95_1.anInt2950 * local576 + (float) this.aClass95_1.anInt2938 * local579);
					local549 = (int) ((float) this.aClass95_1.anInt2947 * local579 + local576 * (float) this.aClass95_1.anInt2939 + (float) this.aClass95_1.anInt2954 * local600);
					local553 = (int) (local600 * (float) this.aClass95_1.anInt2944 + local579 * (float) this.aClass95_1.anInt2945 + (float) this.aClass95_1.anInt2943 * local576);
					@Pc(688) int local688 = (int) (local576 * (float) this.aClass95_2.anInt2950 + local579 * (float) this.aClass95_2.anInt2938 + local600 * (float) this.aClass95_2.anInt2952);
					@Pc(710) int local710 = (int) ((float) this.aClass95_2.anInt2954 * local600 + (float) this.aClass95_2.anInt2939 * local576 + local579 * (float) this.aClass95_2.anInt2947);
					@Pc(732) int local732 = (int) ((float) this.aClass95_2.anInt2943 * local576 + (float) this.aClass95_2.anInt2945 * local579 + (float) this.aClass95_2.anInt2944 * local600);
					@Pc(736) int local736 = local398 - local688;
					@Pc(741) int local741 = local549 - local710;
					@Pc(745) int local745 = local553 - local732;
					@Pc(754) int local754 = (int) ((double) local688 + Math.random() * (double) local736);
					@Pc(763) int local763 = (int) (Math.random() * (double) local741 + (double) local710);
					@Pc(772) int local772 = (int) (Math.random() * (double) local745 + (double) local732);
					@Pc(790) int local790 = this.aClass106_1.anInt3394 + (int) (Math.random() * (double) (this.aClass106_1.anInt3401 - this.aClass106_1.anInt3394));
					@Pc(807) int local807 = (int) (Math.random() * (double) (this.aClass106_1.anInt3398 - this.aClass106_1.anInt3405)) + this.aClass106_1.anInt3405;
					@Pc(824) int local824 = this.aClass106_1.anInt3403 + (int) ((double) (this.aClass106_1.anInt3430 - this.aClass106_1.anInt3403) * Math.random());
					@Pc(888) int local888;
					if (this.aClass106_1.aBoolean289) {
						@Pc(830) double local830 = Math.random();
						local888 = (int) ((double) this.aClass106_1.anInt3428 * Math.random() + (double) this.aClass106_1.anInt3392) << 24 | (int) (local830 * (double) this.aClass106_1.anInt3429 + (double) this.aClass106_1.anInt3424) | (int) ((double) this.aClass106_1.anInt3384 + local830 * (double) this.aClass106_1.anInt3391) << 8 | (int) ((double) this.aClass106_1.anInt3418 + (double) this.aClass106_1.anInt3411 * local830) << 16;
					} else {
						local888 = (int) ((double) this.aClass106_1.anInt3429 * Math.random() + (double) this.aClass106_1.anInt3424) | (int) ((double) this.aClass106_1.anInt3384 + (double) this.aClass106_1.anInt3391 * Math.random()) << 8 | (int) ((double) this.aClass106_1.anInt3411 * Math.random() + (double) this.aClass106_1.anInt3418) << 16 | (int) (Math.random() * (double) this.aClass106_1.anInt3428 + (double) this.aClass106_1.anInt3392) << 24;
					}
					@Pc(951) int local951 = this.aClass106_1.anInt3417;
					if (!arg3.method7912() && !this.aClass106_1.aBoolean292) {
						local951 = -1;
					}
					if (Static439.anInt7801 == Static616.anInt10011) {
						new Class11_Sub5_Sub1_Sub1(this, local754, local763, local772, local195, local204, local212, local790, local807, local888, local824, local951, this.aClass106_1.aBoolean294, this.aClass106_1.aBoolean293);
					} else {
						@Pc(990) Class11_Sub5_Sub1_Sub1 local990 = Static376.aClass11_Sub5_Sub1_Sub1Array2[Static616.anInt10011];
						Static616.anInt10011 = Static616.anInt10011 + 1 & 0x3FF;
						local990.method3318(this, local754, local763, local772, local195, local204, local212, local790, local807, local888, local824, local951, this.aClass106_1.aBoolean294, this.aClass106_1.aBoolean293);
					}
				}
			}
		}
		if (!this.aClass95_1.method2522(this.aClass95_2)) {
			@Pc(1034) Class95 local1034 = this.aClass95_2;
			this.aClass95_2 = this.aClass95_1;
			this.aClass95_1 = local1034;
			this.aClass95_1.anInt2941 = this.aClass95_2.anInt2941;
			this.aClass95_1.anInt2946 = this.aClass95_2.anInt2946;
			this.aClass95_1.anInt2953 = this.aClass95_2.anInt2953;
			this.aClass95_1.anInt2939 = this.aClass130_2.anInt4023;
			this.aClass95_1.anInt2943 = this.aClass130_2.anInt4018;
			this.aClass95_1.anInt2945 = this.aClass130_2.anInt4024;
			this.aClass95_1.anInt2947 = this.aClass130_2.anInt4025;
			this.aClass95_1.anInt2938 = this.aClass130_2.anInt4012;
			this.aClass95_1.anInt2952 = this.aClass130_2.anInt4028;
			this.aClass95_1.anInt2950 = this.aClass130_2.anInt4019;
			this.aClass95_1.anInt2944 = this.aClass130_2.anInt4016;
			this.aClass95_1.anInt2954 = this.aClass130_2.anInt4014;
		}
		this.anInt4596 = 0;
		for (@Pc(1124) Class11_Sub5_Sub1_Sub1 local1124 = (Class11_Sub5_Sub1_Sub1) this.aClass143_5.method3536(); local1124 != null; local1124 = (Class11_Sub5_Sub1_Sub1) this.aClass143_5.method3528()) {
			local1124.method3316(arg2, arg1);
			this.anInt4596++;
		}
		Static561.anInt9276 += this.anInt4596;
	}

	@OriginalMember(owner = "client!hu", name = "b", descriptor = "(B)V")
	public void method3806() {
		this.aClass95_1.anInt2950 = this.aClass130_2.anInt4019;
		this.aClass95_1.anInt2952 = this.aClass130_2.anInt4028;
		this.aClass95_1.anInt2944 = this.aClass130_2.anInt4016;
		this.aClass95_1.anInt2938 = this.aClass130_2.anInt4012;
		this.aClass95_1.anInt2954 = this.aClass130_2.anInt4014;
		this.aClass95_1.anInt2943 = this.aClass130_2.anInt4018;
		this.aClass95_1.anInt2947 = this.aClass130_2.anInt4025;
		this.aClass95_1.anInt2939 = this.aClass130_2.anInt4023;
		this.aClass95_1.anInt2945 = this.aClass130_2.anInt4024;
		if (this.aClass95_1.anInt2938 == this.aClass95_1.anInt2950 && this.aClass95_1.anInt2938 == this.aClass95_1.anInt2952 && this.aClass95_1.anInt2947 == this.aClass95_1.anInt2939 && this.aClass95_1.anInt2947 == this.aClass95_1.anInt2954 && this.aClass95_1.anInt2943 == this.aClass95_1.anInt2945 && this.aClass95_1.anInt2945 == this.aClass95_1.anInt2944) {
			this.aBoolean387 = true;
		} else if (this.aBoolean387) {
			this.aClass95_2.anInt2945 = this.aClass95_1.anInt2945;
			this.aClass95_2.anInt2947 = this.aClass95_1.anInt2947;
			this.aClass95_2.anInt2938 = this.aClass95_1.anInt2938;
			this.aClass95_2.anInt2939 = this.aClass95_1.anInt2939;
			this.aClass95_2.anInt2954 = this.aClass95_1.anInt2954;
			this.aClass95_2.anInt2950 = this.aClass95_1.anInt2950;
			this.aClass95_2.anInt2943 = this.aClass95_1.anInt2943;
			this.aClass95_2.anInt2952 = this.aClass95_1.anInt2952;
			this.aClass95_2.anInt2944 = this.aClass95_1.anInt2944;
			this.aBoolean387 = false;
		}
	}
}
