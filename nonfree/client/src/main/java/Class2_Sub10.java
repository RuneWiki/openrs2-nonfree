import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!o")
public final class Class2_Sub10 extends Class2 {

	@OriginalMember(owner = "client!o", name = "x", descriptor = "I")
	public int anInt2053;

	@OriginalMember(owner = "client!o", name = "z", descriptor = "I")
	public int anInt2055;

	@OriginalMember(owner = "client!o", name = "A", descriptor = "Lclient!da;")
	public Class2_Sub1_Sub5 aClass2_Sub1_Sub5_1;

	@OriginalMember(owner = "client!o", name = "C", descriptor = "I")
	public int anInt2056;

	@OriginalMember(owner = "client!o", name = "D", descriptor = "I")
	public int anInt2057;

	@OriginalMember(owner = "client!o", name = "F", descriptor = "I")
	public int anInt2059;

	@OriginalMember(owner = "client!o", name = "I", descriptor = "I")
	public int anInt2060;

	@OriginalMember(owner = "client!o", name = "N", descriptor = "I")
	public int anInt2064;

	@OriginalMember(owner = "client!o", name = "Z", descriptor = "I")
	public int anInt2069;

	@OriginalMember(owner = "client!o", name = "bb", descriptor = "I")
	public int anInt2071;

	@OriginalMember(owner = "client!o", name = "db", descriptor = "Lclient!ea;")
	public Class2_Sub4_Sub1 aClass2_Sub4_Sub1_1;

	@OriginalMember(owner = "client!o", name = "gb", descriptor = "Lclient!ea;")
	public Class2_Sub4_Sub1 aClass2_Sub4_Sub1_2;

	@OriginalMember(owner = "client!o", name = "hb", descriptor = "I")
	public int anInt2074;

	@OriginalMember(owner = "client!o", name = "ib", descriptor = "[I")
	public int[] anIntArray258;

	@OriginalMember(owner = "client!o", name = "d", descriptor = "(B)V")
	public void method1490() {
		@Pc(10) int local10 = this.anInt2059;
		@Pc(15) Class2_Sub1_Sub5 local15 = this.aClass2_Sub1_Sub5_1.method422();
		if (local15 == null) {
			this.anIntArray258 = null;
			this.anInt2057 = 0;
			this.anInt2059 = -1;
			this.anInt2053 = 0;
			this.anInt2055 = 0;
		} else {
			this.anInt2059 = local15.anInt532;
			this.anInt2055 = local15.anInt546;
			this.anInt2053 = local15.anInt549 * 128;
			this.anIntArray258 = local15.anIntArray57;
			this.anInt2057 = local15.anInt548;
		}
		if (local10 != this.anInt2059 && this.aClass2_Sub4_Sub1_2 != null) {
			Static10.aClass2_Sub4_Sub2_1.method1662(this.aClass2_Sub4_Sub1_2);
			this.aClass2_Sub4_Sub1_2 = null;
		}
	}
}
