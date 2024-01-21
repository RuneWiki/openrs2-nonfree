import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ga")
public final class Class1_Sub10 extends Class1 {

	@OriginalMember(owner = "client!ga", name = "v", descriptor = "I")
	public int anInt1856;

	@OriginalMember(owner = "client!ga", name = "x", descriptor = "[I")
	public int[] anIntArray189;

	@OriginalMember(owner = "client!ga", name = "y", descriptor = "I")
	public int anInt1858;

	@OriginalMember(owner = "client!ga", name = "z", descriptor = "Lclient!rg;")
	public Class1_Sub8_Sub4 aClass1_Sub8_Sub4_2;

	@OriginalMember(owner = "client!ga", name = "B", descriptor = "I")
	public int anInt1860;

	@OriginalMember(owner = "client!ga", name = "D", descriptor = "I")
	public int anInt1862;

	@OriginalMember(owner = "client!ga", name = "E", descriptor = "I")
	public int anInt1863;

	@OriginalMember(owner = "client!ga", name = "F", descriptor = "Lclient!rg;")
	public Class1_Sub8_Sub4 aClass1_Sub8_Sub4_3;

	@OriginalMember(owner = "client!ga", name = "G", descriptor = "I")
	public int anInt1864;

	@OriginalMember(owner = "client!ga", name = "K", descriptor = "I")
	public int anInt1867;

	@OriginalMember(owner = "client!ga", name = "L", descriptor = "I")
	public int anInt1868;

	@OriginalMember(owner = "client!ga", name = "N", descriptor = "Lclient!g;")
	public Class1_Sub1_Sub7 aClass1_Sub1_Sub7_1;

	@OriginalMember(owner = "client!ga", name = "P", descriptor = "I")
	public int anInt1871;

	@OriginalMember(owner = "client!ga", name = "Q", descriptor = "I")
	public int anInt1872;

	@OriginalMember(owner = "client!ga", name = "f", descriptor = "(I)V")
	public void method1421() {
		@Pc(6) int local6 = this.anInt1864;
		@Pc(11) Class1_Sub1_Sub7 local11 = this.aClass1_Sub1_Sub7_1.method1395();
		if (local11 == null) {
			this.anInt1863 = 0;
			this.anIntArray189 = null;
			this.anInt1864 = -1;
			this.anInt1867 = 0;
			this.anInt1862 = 0;
		} else {
			this.anIntArray189 = local11.anIntArray185;
			this.anInt1864 = local11.anInt1845;
			this.anInt1862 = local11.anInt1808;
			this.anInt1863 = local11.anInt1841;
			this.anInt1867 = local11.anInt1838 * 128;
		}
		if (local6 != this.anInt1864 && this.aClass1_Sub8_Sub4_2 != null) {
			Static105.aClass1_Sub8_Sub1_1.method1088(this.aClass1_Sub8_Sub4_2);
			this.aClass1_Sub8_Sub4_2 = null;
		}
	}
}
