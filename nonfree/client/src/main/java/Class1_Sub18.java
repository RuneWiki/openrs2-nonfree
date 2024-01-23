import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public final class Class1_Sub18 extends Class1 {

	@OriginalMember(owner = "client!la", name = "v", descriptor = "I")
	public int anInt2485;

	@OriginalMember(owner = "client!la", name = "z", descriptor = "I")
	public int anInt2487;

	@OriginalMember(owner = "client!la", name = "A", descriptor = "Lclient!nc;")
	public Class1_Sub4_Sub4 aClass1_Sub4_Sub4_2;

	@OriginalMember(owner = "client!la", name = "C", descriptor = "I")
	public int anInt2489;

	@OriginalMember(owner = "client!la", name = "D", descriptor = "Z")
	public boolean aBoolean100;

	@OriginalMember(owner = "client!la", name = "E", descriptor = "Lclient!qe;")
	public Class5_Sub1_Sub2 aClass5_Sub1_Sub2_1;

	@OriginalMember(owner = "client!la", name = "F", descriptor = "[I")
	public int[] anIntArray143;

	@OriginalMember(owner = "client!la", name = "H", descriptor = "Lclient!ib;")
	public Class5_Sub1_Sub1 aClass5_Sub1_Sub1_2;

	@OriginalMember(owner = "client!la", name = "J", descriptor = "I")
	public int anInt2492;

	@OriginalMember(owner = "client!la", name = "M", descriptor = "Lclient!nc;")
	public Class1_Sub4_Sub4 aClass1_Sub4_Sub4_3;

	@OriginalMember(owner = "client!la", name = "N", descriptor = "I")
	public int anInt2494;

	@OriginalMember(owner = "client!la", name = "O", descriptor = "I")
	public int anInt2495;

	@OriginalMember(owner = "client!la", name = "P", descriptor = "I")
	public int anInt2496;

	@OriginalMember(owner = "client!la", name = "Q", descriptor = "I")
	public int anInt2497;

	@OriginalMember(owner = "client!la", name = "R", descriptor = "Lclient!p;")
	public Class82 aClass82_1;

	@OriginalMember(owner = "client!la", name = "S", descriptor = "I")
	public int anInt2498;

	@OriginalMember(owner = "client!la", name = "T", descriptor = "I")
	public int anInt2499;

	@OriginalMember(owner = "client!la", name = "I", descriptor = "I")
	public int anInt2491 = 0;

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(B)V")
	public void method1908() {
		@Pc(8) int local8 = this.anInt2495;
		if (this.aClass82_1 != null) {
			@Pc(78) Class82 local78 = this.aClass82_1.method2583();
			if (local78 == null) {
				this.anInt2495 = -1;
				this.anInt2497 = 0;
				this.anInt2496 = 0;
				this.anInt2485 = 0;
				this.anIntArray143 = null;
			} else {
				this.anInt2496 = local78.anInt3275 * 128;
				this.anInt2497 = local78.anInt3269;
				this.anInt2495 = local78.anInt3256;
				this.anInt2485 = local78.anInt3277;
				this.anIntArray143 = local78.anIntArray224;
			}
		} else if (this.aClass5_Sub1_Sub2_1 != null) {
			@Pc(19) int local19 = Static202.method3328(this.aClass5_Sub1_Sub2_1);
			if (local8 != local19) {
				@Pc(30) Class27 local30 = this.aClass5_Sub1_Sub2_1.aClass27_1;
				this.anInt2495 = local19;
				if (local30.anIntArray51 != null) {
					local30 = local30.method594();
				}
				if (local30 == null) {
					this.anInt2496 = 0;
				} else {
					this.anInt2496 = local30.anInt810 * 128;
				}
			}
		} else if (this.aClass5_Sub1_Sub1_2 != null) {
			this.anInt2495 = Static17.method325(this.aClass5_Sub1_Sub1_2);
			this.anInt2496 = this.aClass5_Sub1_Sub1_2.anInt1950 * 128;
		}
		if (local8 != this.anInt2495 && this.aClass1_Sub4_Sub4_2 != null) {
			Static111.aClass1_Sub4_Sub3_2.method2304(this.aClass1_Sub4_Sub4_2);
			this.aClass1_Sub4_Sub4_2 = null;
		}
	}
}
