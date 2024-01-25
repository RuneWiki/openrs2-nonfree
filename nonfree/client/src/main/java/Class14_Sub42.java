import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!taa")
public final class Class14_Sub42 extends Class14 {

	@OriginalMember(owner = "client!taa", name = "M", descriptor = "I")
	public int anInt9531;

	@OriginalMember(owner = "client!taa", name = "Q", descriptor = "Lclient!gba;")
	public Class128 aClass128_1;

	@OriginalMember(owner = "client!taa", name = "U", descriptor = "I")
	public int anInt9534;

	@OriginalMember(owner = "client!taa", name = "S", descriptor = "I")
	public int anInt9535;

	@OriginalMember(owner = "client!taa", name = "l", descriptor = "I")
	public int anInt9536;

	@OriginalMember(owner = "client!taa", name = "P", descriptor = "Z")
	public boolean aBoolean658;

	@OriginalMember(owner = "client!taa", name = "R", descriptor = "Lclient!pd;")
	public Class14_Sub19_Sub1 aClass14_Sub19_Sub1_3;

	@OriginalMember(owner = "client!taa", name = "q", descriptor = "Lclient!vt;")
	public Class14_Sub53 aClass14_Sub53_2;

	@OriginalMember(owner = "client!taa", name = "w", descriptor = "I")
	public int anInt9537;

	@OriginalMember(owner = "client!taa", name = "D", descriptor = "I")
	public int anInt9538;

	@OriginalMember(owner = "client!taa", name = "o", descriptor = "Lclient!vt;")
	public Class14_Sub53 aClass14_Sub53_3;

	@OriginalMember(owner = "client!taa", name = "n", descriptor = "Lclient!aga;")
	public Class14_Sub1_Sub1 aClass14_Sub1_Sub1_3;

	@OriginalMember(owner = "client!taa", name = "v", descriptor = "I")
	public int anInt9539;

	@OriginalMember(owner = "client!taa", name = "p", descriptor = "Z")
	public boolean aBoolean659;

	@OriginalMember(owner = "client!taa", name = "u", descriptor = "I")
	public int anInt9541;

	@OriginalMember(owner = "client!taa", name = "C", descriptor = "I")
	public int anInt9542;

	@OriginalMember(owner = "client!taa", name = "H", descriptor = "Lclient!pd;")
	public Class14_Sub19_Sub1 aClass14_Sub19_Sub1_4;

	@OriginalMember(owner = "client!taa", name = "y", descriptor = "I")
	public int anInt9543;

	@OriginalMember(owner = "client!taa", name = "r", descriptor = "I")
	public int anInt9545;

	@OriginalMember(owner = "client!taa", name = "N", descriptor = "Lclient!gg;")
	public Class4_Sub3_Sub3_Sub3_Sub2 aClass4_Sub3_Sub3_Sub3_Sub2_2;

	@OriginalMember(owner = "client!taa", name = "F", descriptor = "I")
	public int anInt9546;

	@OriginalMember(owner = "client!taa", name = "L", descriptor = "I")
	public int anInt9547;

	@OriginalMember(owner = "client!taa", name = "s", descriptor = "Lclient!aga;")
	public Class14_Sub1_Sub1 aClass14_Sub1_Sub1_4;

	@OriginalMember(owner = "client!taa", name = "x", descriptor = "Z")
	public boolean aBoolean660;

	@OriginalMember(owner = "client!taa", name = "B", descriptor = "Lclient!fr;")
	public Class4_Sub3_Sub3_Sub3_Sub1 aClass4_Sub3_Sub3_Sub3_Sub1_1;

	@OriginalMember(owner = "client!taa", name = "K", descriptor = "[I")
	public int[] anIntArray497;

	@OriginalMember(owner = "client!taa", name = "A", descriptor = "I")
	public int anInt9550;

	@OriginalMember(owner = "client!taa", name = "J", descriptor = "I")
	public int anInt9540 = 0;

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(Z)V")
	public void method8234() {
		@Pc(6) int local6 = this.anInt9545;
		@Pc(9) boolean local9 = this.aBoolean659;
		if (this.aClass128_1 != null) {
			@Pc(26) Class128 local26 = this.aClass128_1.method2685(Static188.aClass238_1);
			if (local26 == null) {
				this.anInt9545 = -1;
				this.anInt9550 = 0;
				this.anInt9543 = 0;
				this.anInt9542 = 0;
				this.anInt9537 = 0;
				this.aBoolean660 = false;
				this.anInt9547 = 256;
				this.anInt9531 = 256;
				this.anIntArray497 = null;
				this.anInt9539 = 0;
				this.aBoolean659 = false;
			} else {
				this.anInt9547 = local26.anInt2963;
				this.anInt9539 = local26.anInt2966;
				this.anInt9543 = local26.anInt2958;
				this.aBoolean660 = local26.aBoolean218;
				this.aBoolean659 = local26.aBoolean217;
				this.anInt9537 = local26.anInt2985;
				this.anInt9545 = local26.anInt2968;
				this.anInt9542 = local26.anInt2971 << 9;
				this.anIntArray497 = local26.anIntArray178;
				this.anInt9531 = local26.anInt2990;
			}
		} else if (this.aClass4_Sub3_Sub3_Sub3_Sub1_1 != null) {
			@Pc(153) int local153 = Static420.method6288(this.aClass4_Sub3_Sub3_Sub3_Sub1_1);
			if (local153 != local6) {
				this.anInt9545 = local153;
				@Pc(163) Class362 local163 = this.aClass4_Sub3_Sub3_Sub3_Sub1_1.aClass362_1;
				if (local163.lb != null) {
					local163 = local163.method8641(Static188.aClass238_1);
				}
				if (local163 == null) {
					this.anInt9547 = 256;
					this.anInt9531 = 256;
					this.aBoolean659 = this.aClass4_Sub3_Sub3_Sub3_Sub1_1.aClass362_1.aBoolean697;
					this.anInt9543 = this.anInt9542 = this.anInt9550 = 0;
				} else {
					this.anInt9543 = local163.anInt10078;
					this.anInt9547 = local163.anInt10096;
					this.anInt9531 = local163.anInt10079;
					this.anInt9550 = local163.anInt10082 << 9;
					this.anInt9542 = local163.anInt10085 << 9;
					this.aBoolean659 = local163.aBoolean697;
				}
			}
		} else if (this.aClass4_Sub3_Sub3_Sub3_Sub2_2 != null) {
			this.anInt9545 = Static254.method4274(this.aClass4_Sub3_Sub3_Sub3_Sub2_2);
			this.anInt9531 = 256;
			this.anInt9547 = 256;
			this.anInt9550 = 0;
			this.anInt9542 = this.aClass4_Sub3_Sub3_Sub3_Sub2_2.anInt3309 << 9;
			this.aBoolean659 = this.aClass4_Sub3_Sub3_Sub3_Sub2_2.aBoolean247;
			this.anInt9543 = this.aClass4_Sub3_Sub3_Sub3_Sub2_2.anInt3323;
		}
		if (this.anInt9545 == local6 && this.aBoolean659 == local9) {
			return;
		}
		if (this.aClass14_Sub1_Sub1_4 == null) {
			return;
		}
		Static196.aClass14_Sub1_Sub2_1.method1810(this.aClass14_Sub1_Sub1_4);
		this.aClass14_Sub19_Sub1_3 = null;
		this.aClass14_Sub1_Sub1_4 = null;
		this.aClass14_Sub53_3 = null;
	}
}
