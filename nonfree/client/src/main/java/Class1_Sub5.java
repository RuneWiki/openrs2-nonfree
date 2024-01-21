import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bj")
public final class Class1_Sub5 extends Class1 {

	@OriginalMember(owner = "client!bj", name = "q", descriptor = "I")
	public int anInt638;

	@OriginalMember(owner = "client!bj", name = "t", descriptor = "I")
	public int anInt640;

	@OriginalMember(owner = "client!bj", name = "v", descriptor = "Lclient!ig;")
	public Class1_Sub2_Sub13 aClass1_Sub2_Sub13_1;

	@OriginalMember(owner = "client!bj", name = "x", descriptor = "I")
	public int anInt643;

	@OriginalMember(owner = "client!bj", name = "y", descriptor = "Lclient!mh;")
	public Class1_Sub6_Sub3 aClass1_Sub6_Sub3_1;

	@OriginalMember(owner = "client!bj", name = "z", descriptor = "I")
	public int anInt644;

	@OriginalMember(owner = "client!bj", name = "B", descriptor = "[I")
	public int[] anIntArray67;

	@OriginalMember(owner = "client!bj", name = "G", descriptor = "I")
	public int anInt648;

	@OriginalMember(owner = "client!bj", name = "J", descriptor = "I")
	public int anInt651;

	@OriginalMember(owner = "client!bj", name = "L", descriptor = "I")
	public int anInt653;

	@OriginalMember(owner = "client!bj", name = "N", descriptor = "Lclient!mh;")
	public Class1_Sub6_Sub3 aClass1_Sub6_Sub3_2;

	@OriginalMember(owner = "client!bj", name = "O", descriptor = "I")
	public int anInt655;

	@OriginalMember(owner = "client!bj", name = "P", descriptor = "I")
	public int anInt656;

	@OriginalMember(owner = "client!bj", name = "R", descriptor = "I")
	public int anInt657;

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "(I)V")
	public void method395() {
		@Pc(6) int local6 = this.anInt653;
		@Pc(11) Class1_Sub2_Sub13 local11 = this.aClass1_Sub2_Sub13_1.method1430();
		if (local11 == null) {
			this.anIntArray67 = null;
			this.anInt651 = 0;
			this.anInt638 = 0;
			this.anInt653 = -1;
			this.anInt655 = 0;
		} else {
			this.anInt638 = local11.anInt2017 * 128;
			this.anInt653 = local11.anInt1986;
			this.anIntArray67 = local11.anIntArray225;
			this.anInt655 = local11.anInt1991;
			this.anInt651 = local11.anInt1985;
		}
		if (local6 != this.anInt653 && this.aClass1_Sub6_Sub3_1 != null) {
			Static93.aClass1_Sub6_Sub1_1.method2000(this.aClass1_Sub6_Sub3_1);
			this.aClass1_Sub6_Sub3_1 = null;
		}
	}
}
