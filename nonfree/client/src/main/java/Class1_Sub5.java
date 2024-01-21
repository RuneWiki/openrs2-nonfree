import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cf")
public final class Class1_Sub5 extends Class1 {

	@OriginalMember(owner = "client!cf", name = "r", descriptor = "I")
	public int anInt680;

	@OriginalMember(owner = "client!cf", name = "s", descriptor = "I")
	public int anInt681;

	@OriginalMember(owner = "client!cf", name = "t", descriptor = "I")
	public int anInt682;

	@OriginalMember(owner = "client!cf", name = "u", descriptor = "[I")
	public int[] anIntArray70;

	@OriginalMember(owner = "client!cf", name = "w", descriptor = "Lclient!de;")
	public Class1_Sub2_Sub5 aClass1_Sub2_Sub5_1;

	@OriginalMember(owner = "client!cf", name = "x", descriptor = "I")
	public int anInt684;

	@OriginalMember(owner = "client!cf", name = "y", descriptor = "Lclient!jb;")
	public Class1_Sub3_Sub2 aClass1_Sub3_Sub2_1;

	@OriginalMember(owner = "client!cf", name = "B", descriptor = "I")
	public int anInt687;

	@OriginalMember(owner = "client!cf", name = "D", descriptor = "I")
	public int anInt688;

	@OriginalMember(owner = "client!cf", name = "E", descriptor = "I")
	public int anInt689;

	@OriginalMember(owner = "client!cf", name = "G", descriptor = "I")
	public int anInt690;

	@OriginalMember(owner = "client!cf", name = "H", descriptor = "Lclient!jb;")
	public Class1_Sub3_Sub2 aClass1_Sub3_Sub2_2;

	@OriginalMember(owner = "client!cf", name = "I", descriptor = "I")
	public int anInt691;

	@OriginalMember(owner = "client!cf", name = "K", descriptor = "I")
	public int anInt692;

	@OriginalMember(owner = "client!cf", name = "d", descriptor = "(I)V")
	public void method523() {
		@Pc(11) int local11 = this.anInt687;
		@Pc(16) Class1_Sub2_Sub5 local16 = this.aClass1_Sub2_Sub5_1.method695();
		if (local16 == null) {
			this.anIntArray70 = null;
			this.anInt680 = 0;
			this.anInt691 = 0;
			this.anInt687 = -1;
			this.anInt688 = 0;
		} else {
			this.anInt688 = local16.anInt962;
			this.anInt680 = local16.anInt960;
			this.anInt687 = local16.anInt959;
			this.anIntArray70 = local16.anIntArray83;
			this.anInt691 = local16.anInt983 * 128;
		}
		if (local11 != this.anInt687 && this.aClass1_Sub3_Sub2_1 != null) {
			Static33.aClass1_Sub3_Sub1_1.method278(this.aClass1_Sub3_Sub2_1);
			this.aClass1_Sub3_Sub2_1 = null;
		}
	}
}
