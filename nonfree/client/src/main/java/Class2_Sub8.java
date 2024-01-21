import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!h")
public final class Class2_Sub8 extends Class2 {

	@OriginalMember(owner = "client!h", name = "o", descriptor = "Lclient!ui;")
	public Class2_Sub2_Sub4 aClass2_Sub2_Sub4_1;

	@OriginalMember(owner = "client!h", name = "q", descriptor = "Lclient!ui;")
	public Class2_Sub2_Sub4 aClass2_Sub2_Sub4_2;

	@OriginalMember(owner = "client!h", name = "r", descriptor = "I")
	public int anInt1458;

	@OriginalMember(owner = "client!h", name = "s", descriptor = "I")
	public int anInt1459;

	@OriginalMember(owner = "client!h", name = "z", descriptor = "I")
	public int anInt1460;

	@OriginalMember(owner = "client!h", name = "E", descriptor = "I")
	public int anInt1463;

	@OriginalMember(owner = "client!h", name = "F", descriptor = "I")
	public int anInt1464;

	@OriginalMember(owner = "client!h", name = "H", descriptor = "Lclient!hg;")
	public Class2_Sub1_Sub11 aClass2_Sub1_Sub11_1;

	@OriginalMember(owner = "client!h", name = "J", descriptor = "I")
	public int anInt1466;

	@OriginalMember(owner = "client!h", name = "K", descriptor = "[I")
	public int[] anIntArray125;

	@OriginalMember(owner = "client!h", name = "L", descriptor = "I")
	public int anInt1467;

	@OriginalMember(owner = "client!h", name = "M", descriptor = "I")
	public int anInt1468;

	@OriginalMember(owner = "client!h", name = "P", descriptor = "I")
	public int anInt1470;

	@OriginalMember(owner = "client!h", name = "R", descriptor = "I")
	public int anInt1472;

	@OriginalMember(owner = "client!h", name = "d", descriptor = "(I)V")
	public void method993() {
		@Pc(10) int local10 = this.anInt1466;
		@Pc(15) Class2_Sub1_Sub11 local15 = this.aClass2_Sub1_Sub11_1.method1062();
		if (local15 == null) {
			this.anInt1459 = 0;
			this.anInt1466 = -1;
			this.anInt1464 = 0;
			this.anInt1470 = 0;
			this.anIntArray125 = null;
		} else {
			this.anIntArray125 = local15.anIntArray131;
			this.anInt1459 = local15.anInt1540 * 128;
			this.anInt1466 = local15.anInt1574;
			this.anInt1464 = local15.anInt1542;
			this.anInt1470 = local15.anInt1552;
		}
		if (local10 != this.anInt1466 && this.aClass2_Sub2_Sub4_1 != null) {
			Static32.aClass2_Sub2_Sub3_1.method2609(this.aClass2_Sub2_Sub4_1);
			this.aClass2_Sub2_Sub4_1 = null;
		}
	}
}
