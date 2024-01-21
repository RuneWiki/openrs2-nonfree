import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public final class Class1_Sub4 extends Class1 {

	@OriginalMember(owner = "client!be", name = "x", descriptor = "I")
	public int anInt445;

	@OriginalMember(owner = "client!be", name = "y", descriptor = "Lclient!cb;")
	public Class1_Sub1_Sub3 aClass1_Sub1_Sub3_1;

	@OriginalMember(owner = "client!be", name = "C", descriptor = "I")
	public int anInt446;

	@OriginalMember(owner = "client!be", name = "D", descriptor = "I")
	public int anInt447;

	@OriginalMember(owner = "client!be", name = "G", descriptor = "I")
	public int anInt449;

	@OriginalMember(owner = "client!be", name = "I", descriptor = "I")
	public int anInt451;

	@OriginalMember(owner = "client!be", name = "K", descriptor = "I")
	public int anInt452;

	@OriginalMember(owner = "client!be", name = "W", descriptor = "Lclient!ve;")
	public Class1_Sub11_Sub4 aClass1_Sub11_Sub4_1;

	@OriginalMember(owner = "client!be", name = "Z", descriptor = "[I")
	public int[] anIntArray62;

	@OriginalMember(owner = "client!be", name = "ab", descriptor = "I")
	public int anInt456;

	@OriginalMember(owner = "client!be", name = "cb", descriptor = "Lclient!ve;")
	public Class1_Sub11_Sub4 aClass1_Sub11_Sub4_2;

	@OriginalMember(owner = "client!be", name = "db", descriptor = "I")
	public int anInt457;

	@OriginalMember(owner = "client!be", name = "eb", descriptor = "I")
	public int anInt458;

	@OriginalMember(owner = "client!be", name = "gb", descriptor = "I")
	public int anInt459;

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(Z)V")
	public void method249() {
		@Pc(6) int local6 = this.anInt449;
		@Pc(11) Class1_Sub1_Sub3 local11 = this.aClass1_Sub1_Sub3_1.method371();
		if (local11 == null) {
			this.anInt456 = 0;
			this.anInt452 = 0;
			this.anInt458 = 0;
			this.anInt449 = -1;
			this.anIntArray62 = null;
		} else {
			this.anInt458 = local11.anInt632;
			this.anIntArray62 = local11.anIntArray86;
			this.anInt449 = local11.anInt673;
			this.anInt456 = local11.anInt664 * 128;
			this.anInt452 = local11.anInt660;
		}
		if (this.anInt449 != local6 && this.aClass1_Sub11_Sub4_1 != null) {
			Static163.aClass1_Sub11_Sub3_2.method2818(this.aClass1_Sub11_Sub4_1);
			this.aClass1_Sub11_Sub4_1 = null;
		}
	}
}
