import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sg")
public final class Class2_Sub21 extends Class2 {

	@OriginalMember(owner = "client!sg", name = "q", descriptor = "I")
	public int anInt3522;

	@OriginalMember(owner = "client!sg", name = "r", descriptor = "I")
	public int anInt3523;

	@OriginalMember(owner = "client!sg", name = "s", descriptor = "Lclient!f;")
	public Class2_Sub10_Sub1 aClass2_Sub10_Sub1_2;

	@OriginalMember(owner = "client!sg", name = "t", descriptor = "I")
	public int anInt3524;

	@OriginalMember(owner = "client!sg", name = "u", descriptor = "I")
	public int anInt3525;

	@OriginalMember(owner = "client!sg", name = "v", descriptor = "I")
	public int anInt3526;

	@OriginalMember(owner = "client!sg", name = "y", descriptor = "Lclient!eh;")
	public Class2_Sub3_Sub6 aClass2_Sub3_Sub6_1;

	@OriginalMember(owner = "client!sg", name = "z", descriptor = "I")
	public int anInt3528;

	@OriginalMember(owner = "client!sg", name = "D", descriptor = "Lclient!f;")
	public Class2_Sub10_Sub1 aClass2_Sub10_Sub1_3;

	@OriginalMember(owner = "client!sg", name = "F", descriptor = "[I")
	public int[] anIntArray351;

	@OriginalMember(owner = "client!sg", name = "G", descriptor = "I")
	public int anInt3531;

	@OriginalMember(owner = "client!sg", name = "H", descriptor = "I")
	public int anInt3532;

	@OriginalMember(owner = "client!sg", name = "I", descriptor = "I")
	public int anInt3533;

	@OriginalMember(owner = "client!sg", name = "K", descriptor = "I")
	public int anInt3535;

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(I)V")
	public void method2339() {
		@Pc(2) int local2 = this.anInt3528;
		@Pc(7) Class2_Sub3_Sub6 local7 = this.aClass2_Sub3_Sub6_1.method750();
		if (local7 == null) {
			this.anInt3524 = 0;
			this.anIntArray351 = null;
			this.anInt3522 = 0;
			this.anInt3528 = -1;
			this.anInt3533 = 0;
		} else {
			this.anInt3533 = local7.anInt1203 * 128;
			this.anInt3528 = local7.anInt1180;
			this.anIntArray351 = local7.anIntArray63;
			this.anInt3522 = local7.anInt1215;
			this.anInt3524 = local7.anInt1204;
		}
		if (local2 != this.anInt3528 && this.aClass2_Sub10_Sub1_2 != null) {
			Static109.aClass2_Sub10_Sub4_12.method2747(this.aClass2_Sub10_Sub1_2);
			this.aClass2_Sub10_Sub1_2 = null;
		}
	}
}
