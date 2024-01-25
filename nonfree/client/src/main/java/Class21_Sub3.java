import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!h")
public final class Class21_Sub3 extends Class21 {

	@OriginalMember(owner = "client!h", name = "i", descriptor = "I")
	private int anInt2554;

	@OriginalMember(owner = "client!h", name = "j", descriptor = "I")
	private int anInt2555;

	@OriginalMember(owner = "client!h", name = "k", descriptor = "I")
	private int anInt2556;

	@OriginalMember(owner = "client!h", name = "p", descriptor = "I")
	private int anInt2559;

	@OriginalMember(owner = "client!h", name = "r", descriptor = "I")
	private int anInt2560;

	@OriginalMember(owner = "client!h", name = "s", descriptor = "I")
	public int anInt2561;

	@OriginalMember(owner = "client!h", name = "t", descriptor = "I")
	public int anInt2562;

	@OriginalMember(owner = "client!h", name = "x", descriptor = "I")
	public int anInt2565;

	@OriginalMember(owner = "client!h", name = "y", descriptor = "I")
	private int anInt2566;

	@OriginalMember(owner = "client!h", name = "z", descriptor = "I")
	private int anInt2567;

	@OriginalMember(owner = "client!h", name = "A", descriptor = "I")
	private int anInt2568;

	@OriginalMember(owner = "client!h", name = "C", descriptor = "I")
	private int anInt2570;

	@OriginalMember(owner = "client!h", name = "F", descriptor = "I")
	private int anInt2571;

	@OriginalMember(owner = "client!h", name = "H", descriptor = "I")
	private int anInt2572;

	@OriginalMember(owner = "client!h", name = "I", descriptor = "I")
	private int anInt2573;

	@OriginalMember(owner = "client!h", name = "K", descriptor = "I")
	private int anInt2575;

	@OriginalMember(owner = "client!h", name = "M", descriptor = "I")
	private int anInt2576;

	@OriginalMember(owner = "client!h", name = "N", descriptor = "I")
	private int anInt2577;

	@OriginalMember(owner = "client!h", name = "O", descriptor = "I")
	public int anInt2578;

	@OriginalMember(owner = "client!h", name = "P", descriptor = "I")
	private int anInt2579;

	@OriginalMember(owner = "client!h", name = "q", descriptor = "Z")
	private boolean aBoolean169 = false;

	@OriginalMember(owner = "client!h", name = "u", descriptor = "I")
	private int anInt2563 = 0;

	@OriginalMember(owner = "client!h", name = "o", descriptor = "Z")
	public boolean aBoolean168 = false;

	@OriginalMember(owner = "client!h", name = "w", descriptor = "Lclient!mf;")
	public final Class155 aClass155_1;

	@OriginalMember(owner = "client!h", name = "G", descriptor = "J")
	private final long aLong83;

	@OriginalMember(owner = "client!h", name = "L", descriptor = "Lclient!bv;")
	public final Class21_Sub2 aClass21_Sub2_3;

	@OriginalMember(owner = "client!h", name = "D", descriptor = "Lclient!lv;")
	public Class152 aClass152_1;

	@OriginalMember(owner = "client!h", name = "m", descriptor = "Lclient!gs;")
	public final Class93 aClass93_2;

	@OriginalMember(owner = "client!h", name = "<init>", descriptor = "(Lclient!za;Lclient!mf;Lclient!bv;J)V")
	public Class21_Sub3(@OriginalArg(0) Class163 arg0, @OriginalArg(1) Class155 arg1, @OriginalArg(2) Class21_Sub2 arg2, @OriginalArg(3) long arg3) {
		this.aClass155_1 = arg1;
		this.aLong83 = arg3;
		this.aClass21_Sub2_3 = arg2;
		this.aClass152_1 = this.aClass155_1.method3147();
		if (!arg0.method5541() && this.aClass152_1.anInt3858 != -1) {
			this.aClass152_1 = Static68.method4011(this.aClass152_1.anInt3858);
		}
		this.aClass93_2 = new Class93();
		this.anInt2563 = (int) ((double) this.anInt2563 + Math.random() * 64.0D);
		this.method2117();
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IJ)V")
	public void method2116(@OriginalArg(1) long arg0) {
		for (@Pc(11) Class21_Sub1_Sub1_Sub1 local11 = (Class21_Sub1_Sub1_Sub1) this.aClass93_2.method2080(); local11 != null; local11 = (Class21_Sub1_Sub1_Sub1) this.aClass93_2.method2081()) {
			local11.method441(arg0);
		}
	}

	@OriginalMember(owner = "client!h", name = "c", descriptor = "(B)V")
	public void method2117() {
		this.anInt2559 = this.aClass155_1.anInt3989;
		this.anInt2571 = this.aClass155_1.anInt3991;
		this.anInt2554 = this.aClass155_1.anInt3986;
		this.anInt2568 = this.aClass155_1.anInt3980;
		this.anInt2567 = this.aClass155_1.anInt3978;
		this.anInt2555 = this.aClass155_1.anInt3987;
		this.anInt2579 = this.aClass155_1.anInt3976;
		this.anInt2570 = this.aClass155_1.anInt3985;
		this.anInt2572 = this.aClass155_1.anInt3977;
		if (this.anInt2570 == this.anInt2572 && this.anInt2572 == this.anInt2555 && this.anInt2568 == this.anInt2579 && this.anInt2554 == this.anInt2568 && this.anInt2559 == this.anInt2571 && this.anInt2571 == this.anInt2567) {
			this.aBoolean169 = true;
			return;
		}
		this.aBoolean169 = false;
		@Pc(122) int local122 = (this.anInt2570 + this.anInt2572 + this.anInt2555) / 3;
		@Pc(134) int local134 = (this.anInt2568 + this.anInt2579 + this.anInt2554) / 3;
		@Pc(146) int local146 = (this.anInt2559 + this.anInt2571 + this.anInt2567) / 3;
		if (local122 == this.anInt2562 && local134 == this.anInt2565 && local146 == this.anInt2561) {
			return;
		}
		this.anInt2562 = local122;
		this.anInt2561 = local146;
		this.anInt2565 = local134;
		@Pc(178) int local178 = this.anInt2572 - this.anInt2570;
		@Pc(185) int local185 = this.anInt2568 - this.anInt2579;
		@Pc(192) int local192 = this.anInt2571 - this.anInt2559;
		@Pc(198) int local198 = this.anInt2555 - this.anInt2570;
		@Pc(205) int local205 = this.anInt2554 - this.anInt2579;
		@Pc(211) int local211 = this.anInt2567 - this.anInt2559;
		this.anInt2556 = local205 * local178 - local185 * local198;
		this.anInt2575 = local192 * local198 - local178 * local211;
		this.anInt2566 = local211 * local185 - local192 * local205;
		while (this.anInt2566 > 32767 || this.anInt2575 > 32767 || this.anInt2556 > 32767 || this.anInt2566 < -32767 || this.anInt2575 < -32767 || this.anInt2556 < -32767) {
			this.anInt2575 >>= 0x1;
			this.anInt2566 >>= 0x1;
			this.anInt2556 >>= 0x1;
		}
		@Pc(312) int local312 = (int) Math.sqrt((double) (this.anInt2575 * this.anInt2575 + this.anInt2566 * this.anInt2566 + this.anInt2556 * this.anInt2556));
		if (local312 <= 0) {
			local312 = 1;
		}
		this.anInt2575 = this.anInt2575 * 32767 / local312;
		this.anInt2566 = this.anInt2566 * 32767 / local312;
		this.anInt2556 = this.anInt2556 * 32767 / local312;
		if (this.aClass152_1.aShort32 <= 0 && this.aClass152_1.aShort34 <= 0) {
			return;
		}
		@Pc(362) int local362 = (int) (Math.atan2((double) this.anInt2556, (double) this.anInt2566) * 2607.5945876176133D);
		@Pc(383) int local383 = (int) (Math.atan2((double) this.anInt2575, Math.sqrt((double) (this.anInt2556 * this.anInt2556 + this.anInt2566 * this.anInt2566))) * 2607.5945876176133D);
		this.anInt2576 = this.aClass152_1.aShort32 - this.aClass152_1.aShort35;
		this.anInt2577 = this.aClass152_1.aShort34 - this.aClass152_1.aShort33;
		this.anInt2560 = local362 + this.aClass152_1.aShort35 - (this.anInt2576 >> 1);
		this.anInt2573 = this.aClass152_1.aShort33 + local383 - (this.anInt2577 >> 1);
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!za;IZJI)V")
	public void method2118(@OriginalArg(0) Class163 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) long arg3) {
		@Pc(53) int local53;
		if (this.aBoolean168) {
			arg2 = false;
		} else if (Static406.anInt6642 < this.aClass152_1.anInt3861) {
			arg2 = false;
		} else if (Static194.anIntArray274[Static406.anInt6642] < Static28.anInt558) {
			arg2 = false;
		} else if (this.aBoolean169) {
			arg2 = false;
		} else if (this.aClass152_1.anInt3853 != -1) {
			local53 = (int) (arg3 - this.aLong83);
			if (this.aClass152_1.aBoolean271 || local53 <= this.aClass152_1.anInt3853) {
				local53 %= this.aClass152_1.anInt3853;
			} else {
				arg2 = false;
			}
			if (!this.aClass152_1.aBoolean269 && this.aClass152_1.anInt3883 > local53) {
				arg2 = false;
			}
			if (this.aClass152_1.aBoolean269 && this.aClass152_1.anInt3883 <= local53) {
				arg2 = false;
			}
		}
		if (arg2) {
			this.anInt2563 += (int) ((double) arg1 * ((double) this.aClass152_1.anInt3860 + (double) (this.aClass152_1.anInt3848 - this.aClass152_1.anInt3860) * Math.random()));
			if (this.anInt2563 > 63) {
				local53 = this.anInt2563 >> 6;
				this.anInt2563 &= 0x3F;
				for (@Pc(158) int local158 = 0; local158 < local53; local158++) {
					@Pc(230) int local230;
					@Pc(224) int local224;
					@Pc(236) int local236;
					@Pc(182) int local182;
					@Pc(190) int local190;
					@Pc(194) int local194;
					@Pc(204) int local204;
					@Pc(212) int local212;
					@Pc(216) int local216;
					if (this.aClass152_1.aShort32 <= 0 && this.aClass152_1.aShort34 <= 0) {
						local230 = this.anInt2566;
						local236 = this.anInt2556;
						local224 = this.anInt2575;
					} else {
						local182 = this.anInt2560 + (int) ((double) this.anInt2576 * Math.random());
						@Pc(186) int local186 = local182 & 0x3FFF;
						local190 = Class155.anIntArray342[local186];
						local194 = Class155.anIntArray341[local186];
						local204 = this.anInt2573 + (int) (Math.random() * (double) this.anInt2577);
						@Pc(208) int local208 = local204 & 0x1FFF;
						local212 = Class155.anIntArray342[local208];
						local216 = Class155.anIntArray341[local208];
						local224 = (local216 << 0) * -1;
						local230 = local194 * local212 >> 15;
						local236 = local212 * local190 >> 15;
					}
					local182 = (int) (Math.random() * 65535.0D);
					local190 = (int) (Math.random() * 65535.0D);
					if (local182 + local190 > 65535) {
						local182 = 65535 - local182;
						local190 = 65535 - local190;
					}
					local194 = 65535 - local190 - local182;
					local204 = (int) ((long) this.anInt2572 * (long) local190 + (long) local182 * (long) this.anInt2570 + (long) local194 * (long) this.anInt2555 >> 16);
					local212 = (int) ((long) local182 * (long) this.anInt2579 + (long) this.anInt2568 * (long) local190 + (long) this.anInt2554 * (long) local194 >> 16);
					local216 = (int) ((long) this.anInt2567 * (long) local194 + (long) this.anInt2559 * (long) local182 + (long) this.anInt2571 * (long) local190 >> 16);
					@Pc(374) int local374 = (int) ((double) (this.aClass152_1.anInt3875 - this.aClass152_1.anInt3849) * Math.random()) + this.aClass152_1.anInt3849;
					@Pc(390) int local390 = this.aClass152_1.anInt3882 + (int) (Math.random() * (double) (this.aClass152_1.anInt3846 - this.aClass152_1.anInt3882));
					@Pc(407) int local407 = this.aClass152_1.anInt3865 + (int) ((double) (this.aClass152_1.anInt3843 - this.aClass152_1.anInt3865) * Math.random());
					@Pc(469) int local469;
					if (this.aClass152_1.aBoolean267) {
						@Pc(473) double local473 = Math.random();
						local469 = (int) (Math.random() * (double) this.aClass152_1.anInt3870 + (double) this.aClass152_1.anInt3874) << 24 | (int) ((double) this.aClass152_1.lb * local473 + (double) this.aClass152_1.anInt3852) << 8 | (int) ((double) this.aClass152_1.anInt3844 * local473 + (double) this.aClass152_1.anInt3862) << 16 | (int) (local473 * (double) this.aClass152_1.anInt3850 + (double) this.aClass152_1.anInt3877);
					} else {
						local469 = (int) ((double) this.aClass152_1.anInt3874 + (double) this.aClass152_1.anInt3870 * Math.random()) << 24 | (int) ((double) this.aClass152_1.anInt3850 * Math.random() + (double) this.aClass152_1.anInt3877) | (int) (Math.random() * (double) this.aClass152_1.lb + (double) this.aClass152_1.anInt3852) << 8 | (int) ((double) this.aClass152_1.anInt3844 * Math.random() + (double) this.aClass152_1.anInt3862) << 16;
					}
					@Pc(535) int local535 = this.aClass152_1.anInt3837;
					if (!arg0.method5541() && !this.aClass152_1.aBoolean272) {
						local535 = -1;
					}
					if (Static297.anInt4826 == Static364.anInt6131) {
						new Class21_Sub1_Sub1_Sub1(this, local204, local212, local216, local230, local224, local236, local374, local390, local469, local407, local535, this.aClass152_1.aBoolean266, this.aClass152_1.aBoolean270);
					} else {
						@Pc(551) Class21_Sub1_Sub1_Sub1 local551 = Static300.aClass21_Sub1_Sub1_Sub1Array2[Static297.anInt4826];
						Static297.anInt4826 = Static297.anInt4826 + 1 & 0x3FF;
						local551.method444(this, local204, local212, local216, local230, local224, local236, local374, local390, local469, local407, local535, this.aClass152_1.aBoolean266, this.aClass152_1.aBoolean270);
					}
				}
			}
		}
		this.anInt2578 = 0;
		for (@Pc(618) Class21_Sub1_Sub1_Sub1 local618 = (Class21_Sub1_Sub1_Sub1) this.aClass93_2.method2080(); local618 != null; local618 = (Class21_Sub1_Sub1_Sub1) this.aClass93_2.method2081()) {
			local618.method442(arg3, arg1);
			this.anInt2578++;
		}
		Static164.anInt4842 += this.anInt2578;
	}
}
