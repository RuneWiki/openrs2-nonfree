import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!th")
public final class Class4_Sub24 extends Class4 {

	@OriginalMember(owner = "client!th", name = "p", descriptor = "I")
	public int anInt3603;

	@OriginalMember(owner = "client!th", name = "q", descriptor = "I")
	public int anInt3604;

	@OriginalMember(owner = "client!th", name = "r", descriptor = "I")
	public int anInt3605;

	@OriginalMember(owner = "client!th", name = "s", descriptor = "I")
	public int anInt3606;

	@OriginalMember(owner = "client!th", name = "v", descriptor = "Lclient!ha;")
	public Class4_Sub2_Sub2 aClass4_Sub2_Sub2_1;

	@OriginalMember(owner = "client!th", name = "y", descriptor = "I")
	public int anInt3609;

	@OriginalMember(owner = "client!th", name = "z", descriptor = "I")
	public int anInt3610;

	@OriginalMember(owner = "client!th", name = "F", descriptor = "I")
	public int anInt3613;

	@OriginalMember(owner = "client!th", name = "I", descriptor = "Lclient!wh;")
	public Class4_Sub1_Sub19 aClass4_Sub1_Sub19_1;

	@OriginalMember(owner = "client!th", name = "J", descriptor = "I")
	public int anInt3614;

	@OriginalMember(owner = "client!th", name = "K", descriptor = "I")
	public int anInt3615;

	@OriginalMember(owner = "client!th", name = "L", descriptor = "[I")
	public int[] anIntArray352;

	@OriginalMember(owner = "client!th", name = "M", descriptor = "I")
	public int anInt3616;

	@OriginalMember(owner = "client!th", name = "N", descriptor = "Lclient!ha;")
	public Class4_Sub2_Sub2 aClass4_Sub2_Sub2_2;

	@OriginalMember(owner = "client!th", name = "e", descriptor = "(I)V")
	public void method2743() {
		@Pc(2) int local2 = this.anInt3614;
		@Pc(19) Class4_Sub1_Sub19 local19 = this.aClass4_Sub1_Sub19_1.method3185();
		if (local19 == null) {
			this.anInt3610 = 0;
			this.anIntArray352 = null;
			this.anInt3604 = 0;
			this.anInt3614 = -1;
			this.anInt3603 = 0;
		} else {
			this.anInt3604 = local19.anInt4182;
			this.anInt3603 = local19.anInt4181;
			this.anInt3610 = local19.anInt4154 * 128;
			this.anInt3614 = local19.anInt4167;
			this.anIntArray352 = local19.anIntArray445;
		}
		if (local2 != this.anInt3614 && this.aClass4_Sub2_Sub2_1 != null) {
			Static50.aClass4_Sub2_Sub1_1.method1074(this.aClass4_Sub2_Sub2_1);
			this.aClass4_Sub2_Sub2_1 = null;
		}
	}
}
