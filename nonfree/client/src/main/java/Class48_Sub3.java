import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gs")
public final class Class48_Sub3 extends Class48 {

	@OriginalMember(owner = "client!gs", name = "k", descriptor = "I")
	public int anInt2383;

	@OriginalMember(owner = "client!gs", name = "n", descriptor = "I")
	private int anInt2385;

	@OriginalMember(owner = "client!gs", name = "o", descriptor = "I")
	private int anInt2386;

	@OriginalMember(owner = "client!gs", name = "r", descriptor = "I")
	private int anInt2388;

	@OriginalMember(owner = "client!gs", name = "t", descriptor = "I")
	private int anInt2390;

	@OriginalMember(owner = "client!gs", name = "u", descriptor = "I")
	private int anInt2391;

	@OriginalMember(owner = "client!gs", name = "v", descriptor = "I")
	private int anInt2392;

	@OriginalMember(owner = "client!gs", name = "x", descriptor = "I")
	private int anInt2393;

	@OriginalMember(owner = "client!gs", name = "z", descriptor = "I")
	private int anInt2394;

	@OriginalMember(owner = "client!gs", name = "D", descriptor = "I")
	private int anInt2396;

	@OriginalMember(owner = "client!gs", name = "E", descriptor = "I")
	private int anInt2397;

	@OriginalMember(owner = "client!gs", name = "F", descriptor = "I")
	private int anInt2398;

	@OriginalMember(owner = "client!gs", name = "H", descriptor = "I")
	private int anInt2399;

	@OriginalMember(owner = "client!gs", name = "I", descriptor = "I")
	private int anInt2400;

	@OriginalMember(owner = "client!gs", name = "J", descriptor = "I")
	public int anInt2401;

	@OriginalMember(owner = "client!gs", name = "K", descriptor = "I")
	private int anInt2402;

	@OriginalMember(owner = "client!gs", name = "L", descriptor = "I")
	public int anInt2403;

	@OriginalMember(owner = "client!gs", name = "M", descriptor = "I")
	public int anInt2404;

	@OriginalMember(owner = "client!gs", name = "N", descriptor = "I")
	private int anInt2405;

	@OriginalMember(owner = "client!gs", name = "O", descriptor = "I")
	private int anInt2406;

	@OriginalMember(owner = "client!gs", name = "s", descriptor = "I")
	private int anInt2389 = 0;

	@OriginalMember(owner = "client!gs", name = "y", descriptor = "Z")
	public boolean aBoolean180 = false;

	@OriginalMember(owner = "client!gs", name = "C", descriptor = "Z")
	private boolean aBoolean181 = false;

	@OriginalMember(owner = "client!gs", name = "B", descriptor = "Lclient!dd;")
	public final Class48_Sub1 aClass48_Sub1_2;

	@OriginalMember(owner = "client!gs", name = "m", descriptor = "J")
	private final long aLong70;

	@OriginalMember(owner = "client!gs", name = "G", descriptor = "Lclient!oo;")
	public final Class192 aClass192_1;

	@OriginalMember(owner = "client!gs", name = "w", descriptor = "Lclient!uo;")
	public Class245 aClass245_1;

	@OriginalMember(owner = "client!gs", name = "p", descriptor = "Lclient!jg;")
	public final Class128 aClass128_4;

	@OriginalMember(owner = "client!gs", name = "<init>", descriptor = "(Lclient!qq;Lclient!oo;Lclient!dd;J)V")
	public Class48_Sub3(@OriginalArg(0) Class28 arg0, @OriginalArg(1) Class192 arg1, @OriginalArg(2) Class48_Sub1 arg2, @OriginalArg(3) long arg3) {
		this.aClass48_Sub1_2 = arg2;
		this.aLong70 = arg3;
		this.aClass192_1 = arg1;
		this.aClass245_1 = this.aClass192_1.method4338();
		if (!arg0.method3550() && this.aClass245_1.anInt6892 != -1) {
			this.aClass245_1 = Static232.method3613(this.aClass245_1.anInt6892);
		}
		this.aClass128_4 = new Class128();
		this.anInt2389 = (int) ((double) this.anInt2389 + Math.random() * 64.0D);
		this.method2190();
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(BJ)V")
	public void method2188(@OriginalArg(1) long arg0) {
		for (@Pc(9) Class48_Sub2_Sub1_Sub1 local9 = (Class48_Sub2_Sub1_Sub1) this.aClass128_4.method2831(); local9 != null; local9 = (Class48_Sub2_Sub1_Sub1) this.aClass128_4.method2832()) {
			local9.method2524(arg0);
		}
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(IJILclient!qq;Z)V")
	public void method2189(@OriginalArg(1) long arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class28 arg2, @OriginalArg(4) boolean arg3) {
		@Pc(56) int local56;
		if (this.aBoolean180) {
			arg3 = false;
		} else if (this.aClass245_1.anInt6868 > Static303.anInt4991) {
			arg3 = false;
		} else if (Static173.anInt3049 > Static336.anIntArray502[Static303.anInt4991]) {
			arg3 = false;
		} else if (this.aBoolean181) {
			arg3 = false;
		} else if (this.aClass245_1.anInt6845 != -1) {
			local56 = (int) (arg0 - this.aLong70);
			if (this.aClass245_1.aBoolean466 || local56 <= this.aClass245_1.anInt6845) {
				local56 %= this.aClass245_1.anInt6845;
			} else {
				arg3 = false;
			}
			if (!this.aClass245_1.aBoolean465 && local56 < this.aClass245_1.anInt6849) {
				arg3 = false;
			}
			if (this.aClass245_1.aBoolean465 && local56 >= this.aClass245_1.anInt6849) {
				arg3 = false;
			}
		}
		if (arg3) {
			this.anInt2389 += (int) ((double) arg1 * ((double) (this.aClass245_1.anInt6883 - this.aClass245_1.anInt6842) * Math.random() + (double) this.aClass245_1.anInt6842));
			if (this.anInt2389 > 63) {
				local56 = this.anInt2389 >> 6;
				this.anInt2389 &= 0x3F;
				for (@Pc(149) int local149 = 0; local149 < local56; local149++) {
					@Pc(165) int local165;
					@Pc(168) int local168;
					@Pc(171) int local171;
					@Pc(184) int local184;
					@Pc(192) int local192;
					@Pc(196) int local196;
					@Pc(207) int local207;
					@Pc(215) int local215;
					@Pc(219) int local219;
					if (this.aClass245_1.aShort103 <= 0 && this.aClass245_1.aShort102 <= 0) {
						local165 = this.anInt2386;
						local168 = this.anInt2385;
						local171 = this.anInt2393;
					} else {
						local184 = this.anInt2396 + (int) (Math.random() * (double) this.anInt2394);
						@Pc(188) int local188 = local184 & 0x3FFF;
						local192 = Class6_Sub1_Sub18.anIntArray642[local188];
						local196 = Class6_Sub1_Sub18.anIntArray643[local188];
						local207 = this.anInt2405 + (int) (Math.random() * (double) this.anInt2398);
						@Pc(211) int local211 = local207 & 0x1FFF;
						local215 = Class6_Sub1_Sub18.anIntArray642[local211];
						local219 = Class6_Sub1_Sub18.anIntArray643[local211];
						local168 = (local219 << 0) * -1;
						local165 = local196 * local215 >> 15;
						local171 = local215 * local192 >> 15;
					}
					local184 = (int) (Math.random() * 65535.0D);
					local192 = (int) (Math.random() * 65535.0D);
					if (local192 + local184 > 65535) {
						local192 = 65535 - local192;
						local184 = 65535 - local184;
					}
					local196 = 65535 - local184 - local192;
					local207 = this.anInt2392 * local196 + local184 * this.anInt2400 + local192 * this.anInt2406 >> 16;
					local215 = this.anInt2399 * local196 + local192 * this.anInt2388 + this.anInt2397 * local184 >> 16;
					local219 = local192 * this.anInt2391 + this.anInt2402 * local184 + local196 * this.anInt2390 >> 16;
					@Pc(343) int local343 = (int) (Math.random() * (double) (this.aClass245_1.anInt6872 - this.aClass245_1.anInt6886)) + this.aClass245_1.anInt6886;
					@Pc(360) int local360 = (int) (Math.random() * (double) (this.aClass245_1.anInt6861 - this.aClass245_1.anInt6873)) + this.aClass245_1.anInt6873;
					@Pc(377) int local377 = (int) (Math.random() * (double) (this.aClass245_1.anInt6856 - this.aClass245_1.anInt6853)) + this.aClass245_1.anInt6853;
					@Pc(439) int local439;
					if (this.aClass245_1.aBoolean470) {
						@Pc(443) double local443 = Math.random();
						local439 = (int) ((double) this.aClass245_1.anInt6885 * local443 + (double) this.aClass245_1.anInt6862) | (int) ((double) this.aClass245_1.anInt6879 + (double) this.aClass245_1.anInt6891 * local443) << 8 | (int) ((double) this.aClass245_1.anInt6858 + local443 * (double) this.aClass245_1.anInt6848) << 16 | (int) (Math.random() * (double) this.aClass245_1.anInt6870 + (double) this.aClass245_1.anInt6881) << 24;
					} else {
						local439 = (int) ((double) this.aClass245_1.anInt6870 * Math.random() + (double) this.aClass245_1.anInt6881) << 24 | (int) (Math.random() * (double) this.aClass245_1.anInt6885 + (double) this.aClass245_1.anInt6862) | (int) ((double) this.aClass245_1.anInt6891 * Math.random() + (double) this.aClass245_1.anInt6879) << 8 | (int) (Math.random() * (double) this.aClass245_1.anInt6848 + (double) this.aClass245_1.anInt6858) << 16;
					}
					@Pc(505) int local505 = this.aClass245_1.anInt6850;
					if (!arg2.method3550() && !this.aClass245_1.aBoolean469) {
						local505 = -1;
					}
					if (Static174.anInt3052 == Static392.anInt6526) {
						new Class48_Sub2_Sub1_Sub1(this, local207, local215, local219, local165, local168, local171, local343, local360, local439, local377, local505, this.aClass245_1.aBoolean464, this.aClass245_1.aBoolean468);
					} else {
						@Pc(525) Class48_Sub2_Sub1_Sub1 local525 = Static33.aClass48_Sub2_Sub1_Sub1Array1[Static174.anInt3052];
						Static174.anInt3052 = Static174.anInt3052 + 1 & 0x3FF;
						local525.method2522(this, local207, local215, local219, local165, local168, local171, local343, local360, local439, local377, local505, this.aClass245_1.aBoolean464, this.aClass245_1.aBoolean468);
					}
				}
			}
		}
		this.anInt2383 = 0;
		for (@Pc(594) Class48_Sub2_Sub1_Sub1 local594 = (Class48_Sub2_Sub1_Sub1) this.aClass128_4.method2831(); local594 != null; local594 = (Class48_Sub2_Sub1_Sub1) this.aClass128_4.method2832()) {
			local594.method2525(arg0, arg1);
			this.anInt2383++;
		}
		Static378.anInt7203 += this.anInt2383;
	}

	@OriginalMember(owner = "client!gs", name = "c", descriptor = "(I)V")
	public void method2190() {
		this.anInt2391 = this.aClass192_1.anInt4889;
		this.anInt2406 = this.aClass192_1.anInt4894;
		this.anInt2388 = this.aClass192_1.anInt4893;
		this.anInt2400 = this.aClass192_1.anInt4902;
		this.anInt2399 = this.aClass192_1.anInt4901;
		this.anInt2397 = this.aClass192_1.anInt4904;
		this.anInt2390 = this.aClass192_1.anInt4892;
		this.anInt2402 = this.aClass192_1.anInt4899;
		this.anInt2392 = this.aClass192_1.anInt4891;
		if (this.anInt2400 == this.anInt2406 && this.anInt2392 == this.anInt2406 && this.anInt2388 == this.anInt2397 && this.anInt2388 == this.anInt2399 && this.anInt2391 == this.anInt2402 && this.anInt2391 == this.anInt2390) {
			this.aBoolean181 = true;
			return;
		}
		this.aBoolean181 = false;
		@Pc(117) int local117 = (this.anInt2392 + this.anInt2406 + this.anInt2400) / 3;
		@Pc(128) int local128 = (this.anInt2397 + this.anInt2388 + this.anInt2399) / 3;
		@Pc(140) int local140 = (this.anInt2402 + this.anInt2391 + this.anInt2390) / 3;
		if (local117 == this.anInt2401 && local128 == this.anInt2404 && this.anInt2403 == local140) {
			return;
		}
		this.anInt2401 = local117;
		this.anInt2404 = local128;
		this.anInt2403 = local140;
		@Pc(176) int local176 = this.anInt2406 - this.anInt2400;
		@Pc(182) int local182 = this.anInt2388 - this.anInt2397;
		@Pc(188) int local188 = this.anInt2391 - this.anInt2402;
		@Pc(194) int local194 = this.anInt2392 - this.anInt2400;
		@Pc(200) int local200 = this.anInt2399 - this.anInt2397;
		@Pc(207) int local207 = this.anInt2390 - this.anInt2402;
		this.anInt2393 = local200 * local176 - local194 * local182;
		this.anInt2386 = local207 * local182 - local200 * local188;
		this.anInt2385 = local188 * local194 - local207 * local176;
		while (this.anInt2386 > 32767 || this.anInt2385 > 32767 || this.anInt2393 > 32767 || this.anInt2386 < -32767 || this.anInt2385 < -32767 || this.anInt2393 < -32767) {
			this.anInt2393 >>= 0x1;
			this.anInt2385 >>= 0x1;
			this.anInt2386 >>= 0x1;
		}
		@Pc(313) int local313 = (int) Math.sqrt((double) (this.anInt2386 * this.anInt2386 + this.anInt2385 * this.anInt2385 + this.anInt2393 * this.anInt2393));
		if (local313 <= 0) {
			local313 = 1;
		}
		this.anInt2393 = this.anInt2393 * 32767 / local313;
		this.anInt2385 = this.anInt2385 * 32767 / local313;
		this.anInt2386 = this.anInt2386 * 32767 / local313;
		if (this.aClass245_1.aShort103 <= 0 && this.aClass245_1.aShort102 <= 0) {
			return;
		}
		@Pc(360) int local360 = (int) (Math.atan2((double) this.anInt2393, (double) this.anInt2386) * 2607.5945876176133D);
		@Pc(381) int local381 = (int) (Math.atan2((double) this.anInt2385, Math.sqrt((double) (this.anInt2393 * this.anInt2393 + this.anInt2386 * this.anInt2386))) * 2607.5945876176133D);
		this.anInt2394 = this.aClass245_1.aShort103 - this.aClass245_1.aShort100;
		this.anInt2396 = this.aClass245_1.aShort100 + local360 - (this.anInt2394 >> 1);
		this.anInt2398 = this.aClass245_1.aShort102 - this.aClass245_1.aShort101;
		this.anInt2405 = this.aClass245_1.aShort101 + local381 - (this.anInt2398 >> 1);
	}
}
