import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bb")
public final class Class5_Sub3 extends Class5 {

	@OriginalMember(owner = "client!bb", name = "y", descriptor = "[I")
	public int[] anIntArray51;

	@OriginalMember(owner = "client!bb", name = "A", descriptor = "Lclient!vb;")
	public Class5_Sub2_Sub16 aClass5_Sub2_Sub16_1;

	@OriginalMember(owner = "client!bb", name = "B", descriptor = "I")
	public int anInt214;

	@OriginalMember(owner = "client!bb", name = "C", descriptor = "I")
	public int anInt215;

	@OriginalMember(owner = "client!bb", name = "J", descriptor = "I")
	public int anInt216;

	@OriginalMember(owner = "client!bb", name = "L", descriptor = "Lclient!ha;")
	public Class5_Sub5_Sub2 aClass5_Sub5_Sub2_1;

	@OriginalMember(owner = "client!bb", name = "M", descriptor = "I")
	public int anInt217;

	@OriginalMember(owner = "client!bb", name = "O", descriptor = "I")
	public int anInt218;

	@OriginalMember(owner = "client!bb", name = "P", descriptor = "I")
	public int anInt219;

	@OriginalMember(owner = "client!bb", name = "Q", descriptor = "I")
	public int anInt220;

	@OriginalMember(owner = "client!bb", name = "U", descriptor = "I")
	public int anInt222;

	@OriginalMember(owner = "client!bb", name = "W", descriptor = "I")
	public int anInt224;

	@OriginalMember(owner = "client!bb", name = "Y", descriptor = "Lclient!ha;")
	public Class5_Sub5_Sub2 aClass5_Sub5_Sub2_2;

	@OriginalMember(owner = "client!bb", name = "Z", descriptor = "I")
	public int anInt226;

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "(I)V")
	public void method185() {
		@Pc(6) int local6 = this.anInt217;
		@Pc(18) Class5_Sub2_Sub16 local18 = this.aClass5_Sub2_Sub16_1.method1966();
		if (local18 == null) {
			this.anInt215 = 0;
			this.anInt224 = 0;
			this.anInt217 = -1;
			this.anIntArray51 = null;
			this.anInt216 = 0;
		} else {
			this.anIntArray51 = local18.anIntArray376;
			this.anInt217 = local18.anInt3148;
			this.anInt216 = local18.anInt3150;
			this.anInt224 = local18.anInt3117 * 128;
			this.anInt215 = local18.anInt3136;
		}
		if (local6 != this.anInt217 && this.aClass5_Sub5_Sub2_2 != null) {
			Static85.aClass5_Sub5_Sub4_2.method1569(this.aClass5_Sub5_Sub2_2);
			this.aClass5_Sub5_Sub2_2 = null;
		}
	}
}
