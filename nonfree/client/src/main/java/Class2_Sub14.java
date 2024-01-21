import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sa")
public final class Class2_Sub14 extends Class2 {

	@OriginalMember(owner = "client!sa", name = "s", descriptor = "I")
	public int anInt2374;

	@OriginalMember(owner = "client!sa", name = "v", descriptor = "I")
	public int anInt2377;

	@OriginalMember(owner = "client!sa", name = "w", descriptor = "I")
	public int anInt2378;

	@OriginalMember(owner = "client!sa", name = "x", descriptor = "I")
	public int anInt2379;

	@OriginalMember(owner = "client!sa", name = "z", descriptor = "Lclient!vb;")
	public Class2_Sub1_Sub15 aClass2_Sub1_Sub15_1;

	@OriginalMember(owner = "client!sa", name = "A", descriptor = "I")
	public int anInt2380;

	@OriginalMember(owner = "client!sa", name = "E", descriptor = "I")
	public int anInt2383;

	@OriginalMember(owner = "client!sa", name = "F", descriptor = "I")
	public int anInt2384;

	@OriginalMember(owner = "client!sa", name = "H", descriptor = "I")
	public int anInt2386;

	@OriginalMember(owner = "client!sa", name = "I", descriptor = "I")
	public int anInt2387;

	@OriginalMember(owner = "client!sa", name = "P", descriptor = "[I")
	public int[] anIntArray312;

	@OriginalMember(owner = "client!sa", name = "S", descriptor = "Lclient!ea;")
	public Class2_Sub2_Sub1 aClass2_Sub2_Sub1_1;

	@OriginalMember(owner = "client!sa", name = "T", descriptor = "Lclient!ea;")
	public Class2_Sub2_Sub1 aClass2_Sub2_Sub1_2;

	@OriginalMember(owner = "client!sa", name = "W", descriptor = "I")
	public int anInt2393;

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "(I)V")
	public void method1722() {
		@Pc(6) int local6 = this.anInt2393;
		@Pc(11) Class2_Sub1_Sub15 local11 = this.aClass2_Sub1_Sub15_1.method1917();
		if (local11 == null) {
			this.anIntArray312 = null;
			this.anInt2378 = 0;
			this.anInt2383 = 0;
			this.anInt2374 = 0;
			this.anInt2393 = -1;
		} else {
			this.anInt2378 = local11.anInt2664;
			this.anInt2393 = local11.anInt2696;
			this.anInt2374 = local11.anInt2665;
			this.anIntArray312 = local11.anIntArray354;
			this.anInt2383 = local11.anInt2685 * 128;
		}
		if (local6 != this.anInt2393 && this.aClass2_Sub2_Sub1_1 != null) {
			Static104.aClass2_Sub2_Sub4_33.method1775(this.aClass2_Sub2_Sub1_1);
			this.aClass2_Sub2_Sub1_1 = null;
		}
	}
}
