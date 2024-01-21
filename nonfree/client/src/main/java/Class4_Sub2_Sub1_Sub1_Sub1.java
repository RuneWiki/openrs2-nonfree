import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qd")
public final class Class4_Sub2_Sub1_Sub1_Sub1 extends Class4_Sub2_Sub1_Sub1 {

	@OriginalMember(owner = "client!qd", name = "qd", descriptor = "Lclient!qa;")
	public Class63 aClass63_2;

	@OriginalMember(owner = "client!qd", name = "rd", descriptor = "I")
	public int anInt2430;

	@OriginalMember(owner = "client!qd", name = "Ad", descriptor = "I")
	public int anInt2436;

	@OriginalMember(owner = "client!qd", name = "Cd", descriptor = "I")
	public int anInt2438;

	@OriginalMember(owner = "client!qd", name = "Jd", descriptor = "I")
	public int anInt2442;

	@OriginalMember(owner = "client!qd", name = "Kd", descriptor = "I")
	public int anInt2443;

	@OriginalMember(owner = "client!qd", name = "Ld", descriptor = "I")
	public int anInt2444;

	@OriginalMember(owner = "client!qd", name = "Rd", descriptor = "Lclient!ja;")
	public Class39 aClass39_1279;

	@OriginalMember(owner = "client!qd", name = "Wd", descriptor = "Lclient!vb;")
	public Class4_Sub2_Sub1_Sub6 aClass4_Sub2_Sub1_Sub6_1;

	@OriginalMember(owner = "client!qd", name = "Zd", descriptor = "I")
	public int anInt2453;

	@OriginalMember(owner = "client!qd", name = "ce", descriptor = "I")
	public int anInt2455;

	@OriginalMember(owner = "client!qd", name = "ud", descriptor = "I")
	public int anInt2432 = 0;

	@OriginalMember(owner = "client!qd", name = "zd", descriptor = "I")
	public int anInt2435 = 0;

	@OriginalMember(owner = "client!qd", name = "Gd", descriptor = "I")
	public int anInt2440 = -1;

	@OriginalMember(owner = "client!qd", name = "Fd", descriptor = "I")
	public int anInt2439 = 0;

	@OriginalMember(owner = "client!qd", name = "Vd", descriptor = "I")
	public int anInt2450 = 0;

	@OriginalMember(owner = "client!qd", name = "Yd", descriptor = "I")
	public int anInt2452 = -1;

	@OriginalMember(owner = "client!qd", name = "Td", descriptor = "I")
	public int anInt2449 = 0;

	@OriginalMember(owner = "client!qd", name = "be", descriptor = "Z")
	public boolean aBoolean119 = false;

	@OriginalMember(owner = "client!qd", name = "f", descriptor = "(B)Lclient!vb;")
	@Override
	public Class4_Sub2_Sub1_Sub6 method2172() {
		if (this.aClass63_2 == null) {
			return null;
		}
		@Pc(29) Class4_Sub2_Sub2 local29 = super.anInt2678 != -1 && super.anInt2659 == 0 ? Static116.method2017(super.anInt2678) : null;
		@Pc(50) Class4_Sub2_Sub2 local50 = super.anInt2691 == -1 || this.aBoolean119 || super.anInt2679 == super.anInt2691 && local29 != null ? null : Static116.method2017(super.anInt2691);
		@Pc(61) Class4_Sub2_Sub1_Sub6 local61 = this.aClass63_2.method1698(local50, local29, super.anInt2663, super.anInt2671);
		if (local61 == null) {
			return null;
		}
		local61.method2150();
		super.anInt2667 = local61.anInt3118;
		@Pc(95) Class4_Sub2_Sub1_Sub6 local95;
		@Pc(108) Class4_Sub2_Sub1_Sub6[] local108;
		if (!this.aBoolean119 && super.anInt2692 != -1 && super.anInt2684 != -1) {
			local95 = Static35.method590(super.anInt2692).method1843(super.anInt2684);
			if (local95 != null) {
				local108 = new Class4_Sub2_Sub1_Sub6[] { local61, local95 };
				local95.method2146(0, -super.anInt2693, 0);
				local61 = new Class4_Sub2_Sub1_Sub6(local108, 2);
			}
		}
		if (!this.aBoolean119 && this.aClass4_Sub2_Sub1_Sub6_1 != null) {
			if (this.anInt2435 <= Static71.anInt1738) {
				this.aClass4_Sub2_Sub1_Sub6_1 = null;
			}
			if (Static71.anInt1738 >= this.anInt2450 && this.anInt2435 > Static71.anInt1738) {
				local95 = this.aClass4_Sub2_Sub1_Sub6_1;
				local108 = new Class4_Sub2_Sub1_Sub6[] { local61, local95 };
				local95.method2146(this.anInt2443 - super.anInt2643, -this.anInt2438 + this.anInt2444, this.anInt2442 - super.anInt2641);
				if (super.anInt2644 == 512) {
					local95.method2137();
					local95.method2137();
					local95.method2137();
				} else if (super.anInt2644 == 1024) {
					local95.method2137();
					local95.method2137();
				} else if (super.anInt2644 == 1536) {
					local95.method2137();
				}
				local61 = new Class4_Sub2_Sub1_Sub6(local108, 2);
				if (super.anInt2644 == 512) {
					local95.method2137();
				} else if (super.anInt2644 == 1024) {
					local95.method2137();
					local95.method2137();
				} else if (super.anInt2644 == 1536) {
					local95.method2137();
					local95.method2137();
					local95.method2137();
				}
				local95.method2146(super.anInt2643 - this.anInt2443, -this.anInt2444 + this.anInt2438, super.anInt2641 - this.anInt2442);
			}
		}
		local61.aBoolean152 = true;
		return local61;
	}

	@OriginalMember(owner = "client!qd", name = "g", descriptor = "(B)Z")
	@Override
	public boolean method1915() {
		return this.aClass63_2 != null;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lclient!s;I)V")
	public void method1794(@OriginalArg(0) Class4_Sub16 arg0) {
		arg0.anInt2019 = 0;
		@Pc(12) int local12 = arg0.method1474();
		this.anInt2452 = arg0.method1477();
		@Pc(22) int[] local22 = new int[12];
		this.anInt2440 = arg0.method1477();
		@Pc(29) int local29 = -1;
		this.anInt2449 = 0;
		@Pc(55) int local55;
		@Pc(95) int local95;
		for (@Pc(34) int local34 = 0; local34 < 12; local34++) {
			@Pc(40) int local40 = arg0.method1474();
			if (local40 == 0) {
				local22[local34] = 0;
			} else {
				local55 = arg0.method1474();
				local22[local34] = (local40 << 8) + local55;
				if (local34 == 0 && local22[0] == 65535) {
					local29 = arg0.method1490();
					break;
				}
				if (local22[local34] >= 512) {
					local95 = Static119.method2166(local22[local34] - 512).anInt600;
					if (local95 != 0) {
						this.anInt2449 = local95;
					}
				}
			}
		}
		@Pc(115) int[] local115 = new int[5];
		for (local55 = 0; local55 < 5; local55++) {
			local95 = arg0.method1474();
			if (local95 < 0 || Static65.aShortArrayArray1[local55].length <= local95) {
				local95 = 0;
			}
			local115[local55] = local95;
		}
		super.anInt2679 = arg0.method1490();
		if (super.anInt2679 == 65535) {
			super.anInt2679 = -1;
		}
		super.anInt2657 = arg0.method1490();
		if (super.anInt2657 == 65535) {
			super.anInt2657 = -1;
		}
		super.anInt2656 = super.anInt2657;
		super.anInt2690 = arg0.method1490();
		if (super.anInt2690 == 65535) {
			super.anInt2690 = -1;
		}
		super.anInt2669 = arg0.method1490();
		if (super.anInt2669 == 65535) {
			super.anInt2669 = -1;
		}
		super.anInt2655 = arg0.method1490();
		if (super.anInt2655 == 65535) {
			super.anInt2655 = -1;
		}
		super.anInt2665 = arg0.method1490();
		if (super.anInt2665 == 65535) {
			super.anInt2665 = -1;
		}
		super.anInt2642 = arg0.method1490();
		if (super.anInt2642 == 65535) {
			super.anInt2642 = -1;
		}
		this.aClass39_1279 = Static94.method1699(arg0.method1479()).method955();
		this.anInt2439 = arg0.method1474();
		this.anInt2432 = arg0.method1490();
		if (this.aClass63_2 == null) {
			this.aClass63_2 = new Class63();
		}
		this.aClass63_2.method1703(local22, local115, local12 == 1, local29);
	}
}
