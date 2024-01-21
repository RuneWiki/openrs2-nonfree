import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fa")
public final class Class5_Sub4 extends Class5 {

	@OriginalMember(owner = "client!fa", name = "t", descriptor = "I")
	public int anInt810;

	@OriginalMember(owner = "client!fa", name = "v", descriptor = "Lclient!td;")
	public Class5_Sub1_Sub15 aClass5_Sub1_Sub15_1;

	@OriginalMember(owner = "client!fa", name = "w", descriptor = "I")
	public int anInt812;

	@OriginalMember(owner = "client!fa", name = "B", descriptor = "I")
	public int anInt813;

	@OriginalMember(owner = "client!fa", name = "C", descriptor = "I")
	public int anInt814;

	@OriginalMember(owner = "client!fa", name = "E", descriptor = "Lclient!c;")
	public Class5_Sub2_Sub1 aClass5_Sub2_Sub1_1;

	@OriginalMember(owner = "client!fa", name = "G", descriptor = "I")
	public int anInt816;

	@OriginalMember(owner = "client!fa", name = "H", descriptor = "I")
	public int anInt817;

	@OriginalMember(owner = "client!fa", name = "I", descriptor = "I")
	public int anInt818;

	@OriginalMember(owner = "client!fa", name = "K", descriptor = "Lclient!c;")
	public Class5_Sub2_Sub1 aClass5_Sub2_Sub1_2;

	@OriginalMember(owner = "client!fa", name = "M", descriptor = "[I")
	public int[] anIntArray102;

	@OriginalMember(owner = "client!fa", name = "Q", descriptor = "I")
	public int anInt823;

	@OriginalMember(owner = "client!fa", name = "T", descriptor = "I")
	public int anInt824;

	@OriginalMember(owner = "client!fa", name = "U", descriptor = "I")
	public int anInt825;

	@OriginalMember(owner = "client!fa", name = "e", descriptor = "(B)V")
	public void method603() {
		@Pc(12) int local12 = this.anInt813;
		@Pc(17) Class5_Sub1_Sub15 local17 = this.aClass5_Sub1_Sub15_1.method1712();
		if (local17 == null) {
			this.anInt812 = 0;
			this.anIntArray102 = null;
			this.anInt818 = 0;
			this.anInt813 = -1;
			this.anInt810 = 0;
		} else {
			this.anInt812 = local17.anInt2565;
			this.anInt818 = local17.anInt2549 * 128;
			this.anInt810 = local17.anInt2578;
			this.anInt813 = local17.anInt2554;
			this.anIntArray102 = local17.anIntArray269;
		}
		if (this.anInt813 != local12 && this.aClass5_Sub2_Sub1_1 != null) {
			Static19.aClass5_Sub2_Sub2_1.method1121(this.aClass5_Sub2_Sub1_1);
			this.aClass5_Sub2_Sub1_1 = null;
		}
	}
}
