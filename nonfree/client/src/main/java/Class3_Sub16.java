import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public final class Class3_Sub16 extends Class3 {

	@OriginalMember(owner = "client!sd", name = "K", descriptor = "I")
	public int anInt2608;

	@OriginalMember(owner = "client!sd", name = "M", descriptor = "Lclient!ta;")
	public Class3_Sub1_Sub15 aClass3_Sub1_Sub15_1;

	@OriginalMember(owner = "client!sd", name = "Q", descriptor = "I")
	public int anInt2610;

	@OriginalMember(owner = "client!sd", name = "R", descriptor = "I")
	public int anInt2611;

	@OriginalMember(owner = "client!sd", name = "ab", descriptor = "Lclient!p;")
	public Class3_Sub3_Sub3 aClass3_Sub3_Sub3_1;

	@OriginalMember(owner = "client!sd", name = "bb", descriptor = "I")
	public int anInt2616;

	@OriginalMember(owner = "client!sd", name = "db", descriptor = "Lclient!p;")
	public Class3_Sub3_Sub3 aClass3_Sub3_Sub3_2;

	@OriginalMember(owner = "client!sd", name = "eb", descriptor = "I")
	public int anInt2618;

	@OriginalMember(owner = "client!sd", name = "hb", descriptor = "I")
	public int anInt2619;

	@OriginalMember(owner = "client!sd", name = "ib", descriptor = "I")
	public int anInt2620;

	@OriginalMember(owner = "client!sd", name = "jb", descriptor = "I")
	public int anInt2621;

	@OriginalMember(owner = "client!sd", name = "nb", descriptor = "[I")
	public int[] anIntArray224;

	@OriginalMember(owner = "client!sd", name = "pb", descriptor = "I")
	public int anInt2623;

	@OriginalMember(owner = "client!sd", name = "sb", descriptor = "I")
	public int anInt2624;

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "(I)V")
	public void method1750() {
		@Pc(2) int local2 = this.anInt2616;
		@Pc(12) Class3_Sub1_Sub15 local12 = this.aClass3_Sub1_Sub15_1.method1817();
		if (local12 == null) {
			this.anInt2610 = 0;
			this.anInt2616 = -1;
			this.anInt2621 = 0;
			this.anInt2619 = 0;
			this.anIntArray224 = null;
		} else {
			this.anInt2616 = local12.anInt2744;
			this.anIntArray224 = local12.anIntArray261;
			this.anInt2610 = local12.anInt2733;
			this.anInt2619 = local12.anInt2735;
			this.anInt2621 = local12.anInt2734 * 128;
		}
		if (this.anInt2616 != local2 && this.aClass3_Sub3_Sub3_2 != null) {
			Static68.aClass3_Sub3_Sub4_2.method2069(this.aClass3_Sub3_Sub3_2);
			this.aClass3_Sub3_Sub3_2 = null;
		}
	}
}
