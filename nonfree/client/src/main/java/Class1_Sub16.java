import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nf")
public final class Class1_Sub16 extends Class1 {

	@OriginalMember(owner = "client!nf", name = "A", descriptor = "I")
	public int anInt2132;

	@OriginalMember(owner = "client!nf", name = "C", descriptor = "I")
	public int anInt2133;

	@OriginalMember(owner = "client!nf", name = "E", descriptor = "[I")
	public int[] anIntArray329;

	@OriginalMember(owner = "client!nf", name = "F", descriptor = "I")
	public int anInt2135;

	@OriginalMember(owner = "client!nf", name = "H", descriptor = "Lclient!ic;")
	public Class1_Sub1_Sub2 aClass1_Sub1_Sub2_2;

	@OriginalMember(owner = "client!nf", name = "J", descriptor = "I")
	public int anInt2137;

	@OriginalMember(owner = "client!nf", name = "K", descriptor = "Lclient!lf;")
	public Class1_Sub3_Sub10 aClass1_Sub3_Sub10_1;

	@OriginalMember(owner = "client!nf", name = "Q", descriptor = "I")
	public int anInt2140;

	@OriginalMember(owner = "client!nf", name = "T", descriptor = "I")
	public int anInt2142;

	@OriginalMember(owner = "client!nf", name = "W", descriptor = "I")
	public int anInt2144;

	@OriginalMember(owner = "client!nf", name = "X", descriptor = "I")
	public int anInt2145;

	@OriginalMember(owner = "client!nf", name = "Y", descriptor = "I")
	public int anInt2146;

	@OriginalMember(owner = "client!nf", name = "bb", descriptor = "I")
	public int anInt2147;

	@OriginalMember(owner = "client!nf", name = "cb", descriptor = "Lclient!ic;")
	public Class1_Sub1_Sub2 aClass1_Sub1_Sub2_3;

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(I)V")
	public void method1491() {
		@Pc(6) int local6 = this.anInt2137;
		@Pc(11) Class1_Sub3_Sub10 local11 = this.aClass1_Sub3_Sub10_1.method1260();
		if (local11 == null) {
			this.anIntArray329 = null;
			this.anInt2137 = -1;
			this.anInt2147 = 0;
			this.anInt2133 = 0;
			this.anInt2145 = 0;
		} else {
			this.anInt2133 = local11.anInt1682;
			this.anIntArray329 = local11.anIntArray281;
			this.anInt2147 = local11.anInt1703 * 128;
			this.anInt2137 = local11.anInt1689;
			this.anInt2145 = local11.anInt1664;
		}
		if (local6 != this.anInt2137 && this.aClass1_Sub1_Sub2_3 != null) {
			Static122.aClass1_Sub1_Sub1_2.method37(this.aClass1_Sub1_Sub2_3);
			this.aClass1_Sub1_Sub2_3 = null;
		}
	}
}
