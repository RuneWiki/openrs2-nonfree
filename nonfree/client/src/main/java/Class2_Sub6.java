import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jf")
public final class Class2_Sub6 extends Class2 {

	@OriginalMember(owner = "client!jf", name = "t", descriptor = "I")
	public int anInt1752;

	@OriginalMember(owner = "client!jf", name = "u", descriptor = "I")
	public int anInt1753;

	@OriginalMember(owner = "client!jf", name = "y", descriptor = "[I")
	public int[] anIntArray220;

	@OriginalMember(owner = "client!jf", name = "A", descriptor = "Lclient!ra;")
	public Class2_Sub2_Sub4 aClass2_Sub2_Sub4_1;

	@OriginalMember(owner = "client!jf", name = "B", descriptor = "Lclient!ie;")
	public Class2_Sub1_Sub10 aClass2_Sub1_Sub10_1;

	@OriginalMember(owner = "client!jf", name = "D", descriptor = "I")
	public int anInt1758;

	@OriginalMember(owner = "client!jf", name = "E", descriptor = "I")
	public int anInt1759;

	@OriginalMember(owner = "client!jf", name = "F", descriptor = "I")
	public int anInt1760;

	@OriginalMember(owner = "client!jf", name = "H", descriptor = "I")
	public int anInt1761;

	@OriginalMember(owner = "client!jf", name = "I", descriptor = "I")
	public int anInt1762;

	@OriginalMember(owner = "client!jf", name = "J", descriptor = "I")
	public int anInt1763;

	@OriginalMember(owner = "client!jf", name = "L", descriptor = "I")
	public int anInt1765;

	@OriginalMember(owner = "client!jf", name = "M", descriptor = "I")
	public int anInt1766;

	@OriginalMember(owner = "client!jf", name = "O", descriptor = "Lclient!ra;")
	public Class2_Sub2_Sub4 aClass2_Sub2_Sub4_2;

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)V")
	public void method1041() {
		@Pc(6) int local6 = this.anInt1766;
		@Pc(11) Class2_Sub1_Sub10 local11 = this.aClass2_Sub1_Sub10_1.method965();
		if (local11 == null) {
			this.anInt1761 = 0;
			this.anInt1766 = -1;
			this.anIntArray220 = null;
			this.anInt1763 = 0;
			this.anInt1752 = 0;
		} else {
			this.anIntArray220 = local11.anIntArray210;
			this.anInt1752 = local11.anInt1614 * 128;
			this.anInt1763 = local11.anInt1643;
			this.anInt1761 = local11.anInt1624;
			this.anInt1766 = local11.anInt1640;
		}
		if (local6 != this.anInt1766 && this.aClass2_Sub2_Sub4_1 != null) {
			Static123.aClass2_Sub2_Sub2_2.method1229(this.aClass2_Sub2_Sub4_1);
			this.aClass2_Sub2_Sub4_1 = null;
		}
	}
}
