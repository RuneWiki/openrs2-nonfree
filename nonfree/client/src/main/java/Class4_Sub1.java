import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ad")
public final class Class4_Sub1 extends Class4 {

	@OriginalMember(owner = "client!ad", name = "s", descriptor = "I")
	public int anInt105;

	@OriginalMember(owner = "client!ad", name = "v", descriptor = "I")
	public int anInt107;

	@OriginalMember(owner = "client!ad", name = "w", descriptor = "I")
	public int anInt108;

	@OriginalMember(owner = "client!ad", name = "x", descriptor = "Lclient!k;")
	public Class4_Sub4_Sub8 aClass4_Sub4_Sub8_1;

	@OriginalMember(owner = "client!ad", name = "y", descriptor = "I")
	public int anInt109;

	@OriginalMember(owner = "client!ad", name = "z", descriptor = "I")
	public int anInt110;

	@OriginalMember(owner = "client!ad", name = "F", descriptor = "I")
	public int anInt116;

	@OriginalMember(owner = "client!ad", name = "J", descriptor = "I")
	public int anInt118;

	@OriginalMember(owner = "client!ad", name = "O", descriptor = "I")
	public int anInt123;

	@OriginalMember(owner = "client!ad", name = "R", descriptor = "I")
	public int anInt126;

	@OriginalMember(owner = "client!ad", name = "S", descriptor = "[I")
	public int[] anIntArray17;

	@OriginalMember(owner = "client!ad", name = "U", descriptor = "Lclient!ma;")
	public Class4_Sub12_Sub3 aClass4_Sub12_Sub3_1;

	@OriginalMember(owner = "client!ad", name = "W", descriptor = "Lclient!ma;")
	public Class4_Sub12_Sub3 aClass4_Sub12_Sub3_2;

	@OriginalMember(owner = "client!ad", name = "Y", descriptor = "I")
	public int anInt128;

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(B)V")
	public void method74() {
		@Pc(6) int local6 = this.anInt123;
		@Pc(11) Class4_Sub4_Sub8 local11 = this.aClass4_Sub4_Sub8_1.method994();
		if (local11 == null) {
			this.anInt128 = 0;
			this.anInt116 = 0;
			this.anIntArray17 = null;
			this.anInt105 = 0;
			this.anInt123 = -1;
		} else {
			this.anInt128 = local11.anInt1484;
			this.anIntArray17 = local11.anIntArray189;
			this.anInt105 = local11.anInt1519;
			this.anInt116 = local11.anInt1499 * 128;
			this.anInt123 = local11.anInt1509;
		}
		if (this.anInt123 != local6 && this.aClass4_Sub12_Sub3_1 != null) {
			Static14.aClass4_Sub12_Sub4_1.method1702(this.aClass4_Sub12_Sub3_1);
			this.aClass4_Sub12_Sub3_1 = null;
		}
	}
}
