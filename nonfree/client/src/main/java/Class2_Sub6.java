import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bd")
public final class Class2_Sub6 extends Class2 {

	@OriginalMember(owner = "client!bd", name = "p", descriptor = "I")
	public int anInt621;

	@OriginalMember(owner = "client!bd", name = "q", descriptor = "Lclient!dg;")
	public Class2_Sub4_Sub6 aClass2_Sub4_Sub6_1;

	@OriginalMember(owner = "client!bd", name = "r", descriptor = "Lclient!ee;")
	public Class2_Sub8_Sub2 aClass2_Sub8_Sub2_1;

	@OriginalMember(owner = "client!bd", name = "s", descriptor = "I")
	public int anInt622;

	@OriginalMember(owner = "client!bd", name = "t", descriptor = "I")
	public int anInt623;

	@OriginalMember(owner = "client!bd", name = "v", descriptor = "I")
	public int anInt625;

	@OriginalMember(owner = "client!bd", name = "x", descriptor = "I")
	public int anInt626;

	@OriginalMember(owner = "client!bd", name = "y", descriptor = "I")
	public int anInt627;

	@OriginalMember(owner = "client!bd", name = "z", descriptor = "I")
	public int anInt628;

	@OriginalMember(owner = "client!bd", name = "A", descriptor = "I")
	public int anInt629;

	@OriginalMember(owner = "client!bd", name = "C", descriptor = "Lclient!ee;")
	public Class2_Sub8_Sub2 aClass2_Sub8_Sub2_2;

	@OriginalMember(owner = "client!bd", name = "D", descriptor = "[I")
	public int[] anIntArray40;

	@OriginalMember(owner = "client!bd", name = "G", descriptor = "I")
	public int anInt631;

	@OriginalMember(owner = "client!bd", name = "K", descriptor = "I")
	public int anInt632;

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)V")
	public void method403() {
		@Pc(2) int local2 = this.anInt626;
		@Pc(9) Class2_Sub4_Sub6 local9 = this.aClass2_Sub4_Sub6_1.method718();
		if (local9 == null) {
			this.anInt626 = -1;
			this.anInt627 = 0;
			this.anInt622 = 0;
			this.anInt632 = 0;
			this.anIntArray40 = null;
		} else {
			this.anIntArray40 = local9.anIntArray81;
			this.anInt627 = local9.anInt1034;
			this.anInt626 = local9.anInt1020;
			this.anInt632 = local9.anInt1038;
			this.anInt622 = local9.anInt1042 * 128;
		}
		if (this.anInt626 != local2 && this.aClass2_Sub8_Sub2_2 != null) {
			Static113.aClass2_Sub8_Sub3_1.method1737(this.aClass2_Sub8_Sub2_2);
			this.aClass2_Sub8_Sub2_2 = null;
		}
	}
}
