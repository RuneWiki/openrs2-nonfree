import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qf")
public final class Class2_Sub19 extends Class2 {

	@OriginalMember(owner = "client!qf", name = "o", descriptor = "[I")
	public int[] anIntArray422;

	@OriginalMember(owner = "client!qf", name = "p", descriptor = "I")
	public int anInt3833;

	@OriginalMember(owner = "client!qf", name = "q", descriptor = "I")
	public int anInt3834;

	@OriginalMember(owner = "client!qf", name = "r", descriptor = "I")
	public int anInt3835;

	@OriginalMember(owner = "client!qf", name = "t", descriptor = "Lclient!td;")
	public Class2_Sub7_Sub3 aClass2_Sub7_Sub3_2;

	@OriginalMember(owner = "client!qf", name = "w", descriptor = "I")
	public int anInt3838;

	@OriginalMember(owner = "client!qf", name = "x", descriptor = "Lclient!fc;")
	public Class2_Sub1_Sub9 aClass2_Sub1_Sub9_1;

	@OriginalMember(owner = "client!qf", name = "z", descriptor = "I")
	public int anInt3839;

	@OriginalMember(owner = "client!qf", name = "A", descriptor = "Lclient!td;")
	public Class2_Sub7_Sub3 aClass2_Sub7_Sub3_3;

	@OriginalMember(owner = "client!qf", name = "B", descriptor = "I")
	public int anInt3840;

	@OriginalMember(owner = "client!qf", name = "C", descriptor = "I")
	public int anInt3841;

	@OriginalMember(owner = "client!qf", name = "D", descriptor = "I")
	public int anInt3842;

	@OriginalMember(owner = "client!qf", name = "F", descriptor = "I")
	public int anInt3843;

	@OriginalMember(owner = "client!qf", name = "K", descriptor = "I")
	public int anInt3845;

	@OriginalMember(owner = "client!qf", name = "d", descriptor = "(I)V")
	public void method2957() {
		@Pc(6) int local6 = this.anInt3835;
		@Pc(11) Class2_Sub1_Sub9 local11 = this.aClass2_Sub1_Sub9_1.method1262();
		if (local11 == null) {
			this.anIntArray422 = null;
			this.anInt3839 = 0;
			this.anInt3835 = -1;
			this.anInt3842 = 0;
			this.anInt3838 = 0;
		} else {
			this.anInt3838 = local11.anInt1672;
			this.anInt3835 = local11.anInt1684;
			this.anInt3842 = local11.anInt1680;
			this.anIntArray422 = local11.anIntArray165;
			this.anInt3839 = local11.anInt1676 * 128;
		}
		if (local6 != this.anInt3835 && this.aClass2_Sub7_Sub3_2 != null) {
			Static178.aClass2_Sub7_Sub4_2.method3316(this.aClass2_Sub7_Sub3_2);
			this.aClass2_Sub7_Sub3_2 = null;
		}
	}
}
