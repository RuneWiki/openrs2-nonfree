import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public final class Class2_Sub3 extends Class2 {

	@OriginalMember(owner = "client!dd", name = "y", descriptor = "I")
	public int anInt649;

	@OriginalMember(owner = "client!dd", name = "z", descriptor = "I")
	public int anInt650;

	@OriginalMember(owner = "client!dd", name = "B", descriptor = "I")
	public int anInt652;

	@OriginalMember(owner = "client!dd", name = "C", descriptor = "Lclient!pa;")
	public Class2_Sub10_Sub1 aClass2_Sub10_Sub1_1;

	@OriginalMember(owner = "client!dd", name = "D", descriptor = "I")
	public int anInt653;

	@OriginalMember(owner = "client!dd", name = "G", descriptor = "[I")
	public int[] anIntArray88;

	@OriginalMember(owner = "client!dd", name = "I", descriptor = "I")
	public int anInt655;

	@OriginalMember(owner = "client!dd", name = "J", descriptor = "Lclient!sa;")
	public Class2_Sub1_Sub14 aClass2_Sub1_Sub14_1;

	@OriginalMember(owner = "client!dd", name = "K", descriptor = "I")
	public int anInt656;

	@OriginalMember(owner = "client!dd", name = "L", descriptor = "I")
	public int anInt657;

	@OriginalMember(owner = "client!dd", name = "R", descriptor = "I")
	public int anInt662;

	@OriginalMember(owner = "client!dd", name = "S", descriptor = "I")
	public int anInt663;

	@OriginalMember(owner = "client!dd", name = "T", descriptor = "Lclient!pa;")
	public Class2_Sub10_Sub1 aClass2_Sub10_Sub1_2;

	@OriginalMember(owner = "client!dd", name = "U", descriptor = "I")
	public int anInt664;

	@OriginalMember(owner = "client!dd", name = "d", descriptor = "(I)V")
	public void method417() {
		@Pc(2) int local2 = this.anInt657;
		@Pc(12) Class2_Sub1_Sub14 local12 = this.aClass2_Sub1_Sub14_1.method1612();
		if (local12 == null) {
			this.anInt657 = -1;
			this.anIntArray88 = null;
			this.anInt663 = 0;
			this.anInt656 = 0;
			this.anInt664 = 0;
		} else {
			this.anInt656 = local12.anInt2652;
			this.anInt657 = local12.anInt2645;
			this.anIntArray88 = local12.anIntArray386;
			this.anInt663 = local12.anInt2622 * 128;
			this.anInt664 = local12.anInt2640;
		}
		if (local2 != this.anInt657 && this.aClass2_Sub10_Sub1_1 != null) {
			Static8.aClass2_Sub10_Sub2_1.method1674(this.aClass2_Sub10_Sub1_1);
			this.aClass2_Sub10_Sub1_1 = null;
		}
	}
}
