import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kr")
public final class Class4_Sub4 extends Class4 {

	@OriginalMember(owner = "client!kr", name = "g", descriptor = "I")
	public int anInt5358;

	@OriginalMember(owner = "client!kr", name = "x", descriptor = "I")
	private int anInt5366;

	@OriginalMember(owner = "client!kr", name = "y", descriptor = "I")
	private int anInt5367;

	@OriginalMember(owner = "client!kr", name = "z", descriptor = "I")
	private int anInt5368;

	@OriginalMember(owner = "client!kr", name = "A", descriptor = "I")
	private int anInt5369;

	@OriginalMember(owner = "client!kr", name = "B", descriptor = "I")
	private int anInt5370;

	@OriginalMember(owner = "client!kr", name = "C", descriptor = "I")
	private int anInt5371;

	@OriginalMember(owner = "client!kr", name = "E", descriptor = "I")
	private int anInt5372;

	@OriginalMember(owner = "client!kr", name = "m", descriptor = "Z")
	public boolean aBoolean359 = false;

	@OriginalMember(owner = "client!kr", name = "t", descriptor = "I")
	private int anInt5365 = 0;

	@OriginalMember(owner = "client!kr", name = "u", descriptor = "Lclient!ega;")
	public Class88 aClass88_1 = new Class88();

	@OriginalMember(owner = "client!kr", name = "w", descriptor = "Lclient!ega;")
	private Class88 aClass88_2 = new Class88();

	@OriginalMember(owner = "client!kr", name = "D", descriptor = "Z")
	private boolean aBoolean360 = false;

	@OriginalMember(owner = "client!kr", name = "n", descriptor = "Lclient!ta;")
	public final Class4_Sub10 aClass4_Sub10_4;

	@OriginalMember(owner = "client!kr", name = "l", descriptor = "Lclient!qv;")
	public final Class284 aClass284_1;

	@OriginalMember(owner = "client!kr", name = "p", descriptor = "J")
	private final long aLong173;

	@OriginalMember(owner = "client!kr", name = "i", descriptor = "Lclient!va;")
	public Class349 aClass349_1;

	@OriginalMember(owner = "client!kr", name = "r", descriptor = "Lclient!fw;")
	public final Class120 aClass120_4;

	@OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(Lclient!ha;Lclient!qv;Lclient!ta;J)V")
	public Class4_Sub4(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class284 arg1, @OriginalArg(2) Class4_Sub10 arg2, @OriginalArg(3) long arg3) {
		this.aClass4_Sub10_4 = arg2;
		this.aClass284_1 = arg1;
		this.aLong173 = arg3;
		this.aClass349_1 = this.aClass284_1.method7144();
		if (!arg0.method7499() && this.aClass349_1.anInt9631 != -1) {
			this.aClass349_1 = Static289.method7333(this.aClass349_1.anInt9631);
		}
		this.aClass120_4 = new Class120();
		this.anInt5365 = (int) ((double) this.anInt5365 + Math.random() * 64.0D);
		this.method4805();
		this.aClass88_2.anInt2645 = this.aClass88_1.anInt2645;
		this.aClass88_2.anInt2642 = this.aClass88_1.anInt2642;
		this.aClass88_2.anInt2643 = this.aClass88_1.anInt2643;
		this.aClass88_2.anInt2656 = this.aClass88_1.anInt2656;
		this.aClass88_2.anInt2644 = this.aClass88_1.anInt2644;
		this.aClass88_2.anInt2655 = this.aClass88_1.anInt2655;
		this.aClass88_2.anInt2652 = this.aClass88_1.anInt2652;
		this.aClass88_2.anInt2653 = this.aClass88_1.anInt2653;
		this.aClass88_2.anInt2647 = this.aClass88_1.anInt2647;
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)V")
	public void method4805() {
		this.aClass88_1.anInt2656 = this.aClass284_1.anInt8331;
		this.aClass88_1.anInt2652 = this.aClass284_1.anInt8319;
		this.aClass88_1.anInt2653 = this.aClass284_1.anInt8328;
		this.aClass88_1.anInt2645 = this.aClass284_1.anInt8324;
		this.aClass88_1.anInt2644 = this.aClass284_1.anInt8322;
		this.aClass88_1.anInt2655 = this.aClass284_1.anInt8316;
		this.aClass88_1.anInt2642 = this.aClass284_1.anInt8329;
		this.aClass88_1.anInt2643 = this.aClass284_1.anInt8325;
		this.aClass88_1.anInt2647 = this.aClass284_1.anInt8320;
		if (this.aClass88_1.anInt2647 == this.aClass88_1.anInt2656 && this.aClass88_1.anInt2647 == this.aClass88_1.anInt2642 && this.aClass88_1.anInt2653 == this.aClass88_1.anInt2652 && this.aClass88_1.anInt2643 == this.aClass88_1.anInt2652 && this.aClass88_1.anInt2655 == this.aClass88_1.anInt2644 && this.aClass88_1.anInt2645 == this.aClass88_1.anInt2655) {
			this.aBoolean360 = true;
		} else if (this.aBoolean360) {
			this.aBoolean360 = false;
			this.aClass88_2.anInt2656 = this.aClass88_1.anInt2656;
			this.aClass88_2.anInt2642 = this.aClass88_1.anInt2642;
			this.aClass88_2.anInt2652 = this.aClass88_1.anInt2652;
			this.aClass88_2.anInt2643 = this.aClass88_1.anInt2643;
			this.aClass88_2.anInt2645 = this.aClass88_1.anInt2645;
			this.aClass88_2.anInt2644 = this.aClass88_1.anInt2644;
			this.aClass88_2.anInt2647 = this.aClass88_1.anInt2647;
			this.aClass88_2.anInt2653 = this.aClass88_1.anInt2653;
			this.aClass88_2.anInt2655 = this.aClass88_1.anInt2655;
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(BJLclient!ha;)V")
	public void method4807(@OriginalArg(1) long arg0, @OriginalArg(2) Class5 arg1) {
		for (@Pc(12) Class4_Sub2_Sub2_Sub1 local12 = (Class4_Sub2_Sub2_Sub1) this.aClass120_4.method2966(); local12 != null; local12 = (Class4_Sub2_Sub2_Sub1) this.aClass120_4.method2962()) {
			local12.method6697(arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(Lclient!ha;IZJI)V")
	public void method4809(@OriginalArg(0) Class5 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) long arg2, @OriginalArg(4) int arg3) {
		@Pc(50) int local50;
		if (this.aBoolean359) {
			arg1 = false;
		} else if (Static449.anInt7994 < this.aClass349_1.anInt9644) {
			arg1 = false;
		} else if (Static398.anInt7399 > Static644.anIntArray666[Static449.anInt7994]) {
			arg1 = false;
		} else if (this.aBoolean360) {
			arg1 = false;
		} else if (this.aClass349_1.anInt9667 != -1) {
			local50 = (int) (arg2 - this.aLong173);
			if (this.aClass349_1.aBoolean699 || local50 <= this.aClass349_1.anInt9667) {
				local50 %= this.aClass349_1.anInt9667;
			} else {
				arg1 = false;
			}
			if (!this.aClass349_1.aBoolean695 && this.aClass349_1.anInt9672 > local50) {
				arg1 = false;
			}
			if (this.aClass349_1.aBoolean695 && local50 >= this.aClass349_1.anInt9672) {
				arg1 = false;
			}
		}
		if (arg1) {
			Static138.anInt2768++;
			local50 = (this.aClass88_1.anInt2642 + this.aClass88_1.anInt2647 + this.aClass88_1.anInt2656) / 3;
			@Pc(134) int local134 = (this.aClass88_1.anInt2653 + this.aClass88_1.anInt2652 + this.aClass88_1.anInt2643) / 3;
			@Pc(149) int local149 = (this.aClass88_1.anInt2655 + this.aClass88_1.anInt2644 + this.aClass88_1.anInt2645) / 3;
			@Pc(193) int local193;
			@Pc(202) int local202;
			@Pc(211) int local211;
			@Pc(220) int local220;
			@Pc(229) int local229;
			@Pc(238) int local238;
			@Pc(342) int local342;
			@Pc(395) int local395;
			@Pc(416) int local416;
			if (this.aClass88_1.anInt2641 != local50 || this.aClass88_1.anInt2648 != local134 || this.aClass88_1.anInt2649 != local149) {
				this.aClass88_1.anInt2641 = local50;
				this.aClass88_1.anInt2649 = local149;
				this.aClass88_1.anInt2648 = local134;
				local193 = this.aClass88_1.anInt2647 - this.aClass88_1.anInt2656;
				local202 = this.aClass88_1.anInt2652 - this.aClass88_1.anInt2653;
				local211 = this.aClass88_1.anInt2655 - this.aClass88_1.anInt2644;
				local220 = this.aClass88_1.anInt2642 - this.aClass88_1.anInt2656;
				local229 = this.aClass88_1.anInt2643 - this.aClass88_1.anInt2653;
				local238 = this.aClass88_1.anInt2645 - this.aClass88_1.anInt2644;
				this.anInt5368 = local211 * local220 - local238 * local193;
				this.anInt5372 = local193 * local229 - local220 * local202;
				this.anInt5367 = local238 * local202 - local229 * local211;
				while (true) {
					if (this.anInt5367 <= 32767 && this.anInt5368 <= 32767 && this.anInt5372 <= 32767 && this.anInt5367 >= -32767 && this.anInt5368 >= -32767 && this.anInt5372 >= -32767) {
						local342 = (int) Math.sqrt((double) (this.anInt5372 * this.anInt5372 + this.anInt5368 * this.anInt5368 + this.anInt5367 * this.anInt5367));
						if (local342 <= 0) {
							local342 = 1;
						}
						this.anInt5368 = this.anInt5368 * 32767 / local342;
						this.anInt5367 = this.anInt5367 * 32767 / local342;
						this.anInt5372 = this.anInt5372 * 32767 / local342;
						if (this.aClass349_1.aShort128 > 0 || this.aClass349_1.aShort127 > 0) {
							local395 = (int) (Math.atan2((double) this.anInt5372, (double) this.anInt5367) * 2607.5945876176133D);
							local416 = (int) (Math.atan2((double) this.anInt5368, Math.sqrt((double) (this.anInt5372 * this.anInt5372 + this.anInt5367 * this.anInt5367))) * 2607.5945876176133D);
							this.anInt5369 = this.aClass349_1.aShort128 - this.aClass349_1.aShort126;
							this.anInt5370 = this.aClass349_1.aShort127 - this.aClass349_1.aShort129;
							this.anInt5371 = local395 + this.aClass349_1.aShort126 - (this.anInt5369 >> 1);
							this.anInt5366 = local416 + this.aClass349_1.aShort129 - (this.anInt5370 >> 1);
						}
						break;
					}
					this.anInt5372 >>= 0x1;
					this.anInt5368 >>= 0x1;
					this.anInt5367 >>= 0x1;
				}
			}
			this.anInt5365 += (int) (((double) this.aClass349_1.anInt9632 + Math.random() * (double) (this.aClass349_1.anInt9627 - this.aClass349_1.anInt9632)) * (double) arg3);
			if (this.anInt5365 > 63) {
				local193 = this.anInt5365 >> 6;
				this.anInt5365 &= 0x3F;
				for (local229 = 0; local229 < local193; local229++) {
					@Pc(571) int local571;
					@Pc(575) int local575;
					if (this.aClass349_1.aShort128 <= 0 && this.aClass349_1.aShort127 <= 0) {
						local211 = this.anInt5368;
						local202 = this.anInt5367;
						local220 = this.anInt5372;
					} else {
						local238 = (int) ((double) this.anInt5369 * Math.random()) + this.anInt5371;
						local238 &= 0x3FFF;
						local342 = Class21.anIntArray656[local238];
						local395 = Class21.anIntArray655[local238];
						local416 = this.anInt5366 + (int) ((double) this.anInt5370 * Math.random());
						local416 &= 0x1FFF;
						local571 = Class21.anIntArray656[local416];
						local575 = Class21.anIntArray655[local416];
						local202 = local395 * local571 >> 13;
						local211 = (local575 << 1) * -1;
						local220 = local342 * local571 >> 13;
					}
					@Pc(598) float local598 = (float) Math.random();
					@Pc(601) float local601 = (float) Math.random();
					if (local598 + local601 > 1.0F) {
						local598 = 1.0F - local598;
						local601 = 1.0F - local601;
					}
					@Pc(622) float local622 = 1.0F - local598 - local601;
					local416 = (int) ((float) this.aClass88_1.anInt2642 * local622 + local601 * (float) this.aClass88_1.anInt2647 + local598 * (float) this.aClass88_1.anInt2656);
					local571 = (int) (local598 * (float) this.aClass88_1.anInt2653 + (float) this.aClass88_1.anInt2652 * local601 + local622 * (float) this.aClass88_1.anInt2643);
					local575 = (int) (local601 * (float) this.aClass88_1.anInt2655 + (float) this.aClass88_1.anInt2644 * local598 + (float) this.aClass88_1.anInt2645 * local622);
					@Pc(710) int local710 = (int) (local622 * (float) this.aClass88_2.anInt2642 + (float) this.aClass88_2.anInt2647 * local601 + (float) this.aClass88_2.anInt2656 * local598);
					@Pc(732) int local732 = (int) ((float) this.aClass88_2.anInt2652 * local601 + local598 * (float) this.aClass88_2.anInt2653 + local622 * (float) this.aClass88_2.anInt2643);
					@Pc(754) int local754 = (int) (local598 * (float) this.aClass88_2.anInt2644 + local601 * (float) this.aClass88_2.anInt2655 + local622 * (float) this.aClass88_2.anInt2645);
					@Pc(758) int local758 = local416 - local710;
					@Pc(762) int local762 = local571 - local732;
					@Pc(767) int local767 = local575 - local754;
					@Pc(776) int local776 = (int) (Math.random() * (double) local758 + (double) local710);
					@Pc(785) int local785 = (int) ((double) local732 + (double) local762 * Math.random());
					@Pc(794) int local794 = (int) ((double) local767 * Math.random() + (double) local754);
					@Pc(811) int local811 = (int) (Math.random() * (double) (this.aClass349_1.anInt9628 - this.aClass349_1.anInt9666)) + this.aClass349_1.anInt9666;
					@Pc(828) int local828 = this.aClass349_1.anInt9652 + (int) ((double) (this.aClass349_1.anInt9625 - this.aClass349_1.anInt9652) * Math.random());
					@Pc(845) int local845 = this.aClass349_1.anInt9633 + (int) ((double) (this.aClass349_1.anInt9648 - this.aClass349_1.anInt9633) * Math.random());
					@Pc(907) int local907;
					if (this.aClass349_1.aBoolean698) {
						@Pc(911) double local911 = Math.random();
						local907 = (int) ((double) this.aClass349_1.anInt9647 + (double) this.aClass349_1.anInt9663 * local911) | (int) ((double) this.aClass349_1.anInt9656 + local911 * (double) this.aClass349_1.anInt9626) << 16 | (int) ((double) this.aClass349_1.anInt9673 * local911 + (double) this.aClass349_1.anInt9676) << 8 | (int) ((double) this.aClass349_1.anInt9643 * Math.random() + (double) this.aClass349_1.anInt9654) << 24;
					} else {
						local907 = (int) ((double) this.aClass349_1.anInt9654 + Math.random() * (double) this.aClass349_1.anInt9643) << 24 | (int) ((double) this.aClass349_1.anInt9656 + (double) this.aClass349_1.anInt9626 * Math.random()) << 16 | (int) ((double) this.aClass349_1.anInt9676 + Math.random() * (double) this.aClass349_1.anInt9673) << 8 | (int) ((double) this.aClass349_1.anInt9647 + (double) this.aClass349_1.anInt9663 * Math.random());
					}
					@Pc(973) int local973 = this.aClass349_1.anInt9637;
					if (!arg0.method7499() && !this.aClass349_1.aBoolean694) {
						local973 = -1;
					}
					if (Static474.anInt8293 == Static165.anInt3235) {
						new Class4_Sub2_Sub2_Sub1(this, local776, local785, local794, local202, local211, local220, local811, local828, local907, local845, local973, this.aClass349_1.aBoolean692, this.aClass349_1.aBoolean696);
					} else {
						@Pc(989) Class4_Sub2_Sub2_Sub1 local989 = Static602.aClass4_Sub2_Sub2_Sub1Array2[Static474.anInt8293];
						Static474.anInt8293 = Static474.anInt8293 + 1 & 0x3FF;
						local989.method6696(this, local776, local785, local794, local202, local211, local220, local811, local828, local907, local845, local973, this.aClass349_1.aBoolean692, this.aClass349_1.aBoolean696);
					}
				}
			}
		}
		if (!this.aClass88_1.method2478(this.aClass88_2)) {
			@Pc(1053) Class88 local1053 = this.aClass88_2;
			this.aClass88_2 = this.aClass88_1;
			this.aClass88_1 = local1053;
			this.aClass88_1.anInt2645 = this.aClass284_1.anInt8324;
			this.aClass88_1.anInt2655 = this.aClass284_1.anInt8316;
			this.aClass88_1.anInt2643 = this.aClass284_1.anInt8325;
			this.aClass88_1.anInt2648 = this.aClass88_2.anInt2648;
			this.aClass88_1.anInt2647 = this.aClass284_1.anInt8320;
			this.aClass88_1.anInt2652 = this.aClass284_1.anInt8319;
			this.aClass88_1.anInt2642 = this.aClass284_1.anInt8329;
			this.aClass88_1.anInt2653 = this.aClass284_1.anInt8328;
			this.aClass88_1.anInt2644 = this.aClass284_1.anInt8322;
			this.aClass88_1.anInt2649 = this.aClass88_2.anInt2649;
			this.aClass88_1.anInt2656 = this.aClass284_1.anInt8331;
			this.aClass88_1.anInt2641 = this.aClass88_2.anInt2641;
		}
		this.anInt5358 = 0;
		for (@Pc(1141) Class4_Sub2_Sub2_Sub1 local1141 = (Class4_Sub2_Sub2_Sub1) this.aClass120_4.method2966(); local1141 != null; local1141 = (Class4_Sub2_Sub2_Sub1) this.aClass120_4.method2962()) {
			local1141.method6695(arg2, arg3);
			this.anInt5358++;
		}
		Static622.anInt10061 += this.anInt5358;
	}
}
