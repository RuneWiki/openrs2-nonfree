import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public final class Class1_Sub6 extends Class1 {

	@OriginalMember(owner = "client!da", name = "A", descriptor = "I")
	public int anInt752;

	@OriginalMember(owner = "client!da", name = "B", descriptor = "I")
	public int anInt753;

	@OriginalMember(owner = "client!da", name = "E", descriptor = "I")
	public int anInt755;

	@OriginalMember(owner = "client!da", name = "F", descriptor = "Lclient!wa;")
	public Class1_Sub1_Sub18 aClass1_Sub1_Sub18_1;

	@OriginalMember(owner = "client!da", name = "H", descriptor = "I")
	public int anInt757;

	@OriginalMember(owner = "client!da", name = "M", descriptor = "I")
	public int anInt758;

	@OriginalMember(owner = "client!da", name = "N", descriptor = "[I")
	public int[] anIntArray111;

	@OriginalMember(owner = "client!da", name = "P", descriptor = "I")
	public int anInt759;

	@OriginalMember(owner = "client!da", name = "R", descriptor = "I")
	public int anInt760;

	@OriginalMember(owner = "client!da", name = "T", descriptor = "I")
	public int anInt762;

	@OriginalMember(owner = "client!da", name = "Y", descriptor = "Lclient!i;")
	public Class1_Sub8_Sub1 aClass1_Sub8_Sub1_1;

	@OriginalMember(owner = "client!da", name = "fb", descriptor = "Lclient!i;")
	public Class1_Sub8_Sub1 aClass1_Sub8_Sub1_2;

	@OriginalMember(owner = "client!da", name = "ib", descriptor = "I")
	public int anInt768;

	@OriginalMember(owner = "client!da", name = "lb", descriptor = "I")
	public int anInt769;

	@OriginalMember(owner = "client!da", name = "c", descriptor = "(B)V")
	public void method424() {
		@Pc(12) int local12 = this.anInt757;
		@Pc(17) Class1_Sub1_Sub18 local17 = this.aClass1_Sub1_Sub18_1.method2126();
		if (local17 == null) {
			this.anIntArray111 = null;
			this.anInt755 = 0;
			this.anInt758 = 0;
			this.anInt757 = -1;
			this.anInt752 = 0;
		} else {
			this.anIntArray111 = local17.anIntArray474;
			this.anInt752 = local17.anInt3044;
			this.anInt757 = local17.anInt3043;
			this.anInt755 = local17.anInt3045 * 128;
			this.anInt758 = local17.anInt3034;
		}
		if (local12 != this.anInt757 && this.aClass1_Sub8_Sub1_1 != null) {
			Static19.aClass1_Sub8_Sub3_1.method1634(this.aClass1_Sub8_Sub1_1);
			this.aClass1_Sub8_Sub1_1 = null;
		}
	}
}
