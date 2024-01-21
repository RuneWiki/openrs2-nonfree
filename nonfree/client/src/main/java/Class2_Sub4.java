import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public final class Class2_Sub4 extends Class2 {

	@OriginalMember(owner = "client!be", name = "eb", descriptor = "I")
	public int anInt606;

	@OriginalMember(owner = "client!be", name = "fb", descriptor = "I")
	public int anInt607;

	@OriginalMember(owner = "client!be", name = "ib", descriptor = "I")
	public int anInt609;

	@OriginalMember(owner = "client!be", name = "lb", descriptor = "I")
	public int anInt612;

	@OriginalMember(owner = "client!be", name = "mb", descriptor = "Lclient!ka;")
	public Class2_Sub2_Sub2 aClass2_Sub2_Sub2_1;

	@OriginalMember(owner = "client!be", name = "nb", descriptor = "I")
	public int anInt613;

	@OriginalMember(owner = "client!be", name = "ob", descriptor = "I")
	public int anInt614;

	@OriginalMember(owner = "client!be", name = "qb", descriptor = "[I")
	public int[] anIntArray60;

	@OriginalMember(owner = "client!be", name = "sb", descriptor = "I")
	public int anInt617;

	@OriginalMember(owner = "client!be", name = "vb", descriptor = "Lclient!ka;")
	public Class2_Sub2_Sub2 aClass2_Sub2_Sub2_2;

	@OriginalMember(owner = "client!be", name = "wb", descriptor = "Lclient!ia;")
	public Class2_Sub1_Sub10 aClass2_Sub1_Sub10_1;

	@OriginalMember(owner = "client!be", name = "xb", descriptor = "I")
	public int anInt619;

	@OriginalMember(owner = "client!be", name = "yb", descriptor = "I")
	public int anInt620;

	@OriginalMember(owner = "client!be", name = "zb", descriptor = "I")
	public int anInt621;

	@OriginalMember(owner = "client!be", name = "c", descriptor = "(I)V")
	public void method415() {
		@Pc(2) int local2 = this.anInt609;
		@Pc(15) Class2_Sub1_Sub10 local15 = this.aClass2_Sub1_Sub10_1.method1018();
		if (local15 == null) {
			this.anInt612 = 0;
			this.anInt619 = 0;
			this.anInt613 = 0;
			this.anIntArray60 = null;
			this.anInt609 = -1;
		} else {
			this.anInt612 = local15.anInt1480 * 128;
			this.anInt619 = local15.anInt1478;
			this.anInt613 = local15.anInt1505;
			this.anInt609 = local15.anInt1489;
			this.anIntArray60 = local15.anIntArray152;
		}
		if (local2 != this.anInt609 && this.aClass2_Sub2_Sub2_1 != null) {
			Static82.aClass2_Sub2_Sub1_1.method239(this.aClass2_Sub2_Sub2_1);
			this.aClass2_Sub2_Sub2_1 = null;
		}
	}
}
