import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ld")
public final class Class1_Sub17 extends Class1 {

	@OriginalMember(owner = "client!ld", name = "v", descriptor = "Lclient!wf;")
	public Class1_Sub7_Sub4 aClass1_Sub7_Sub4_2;

	@OriginalMember(owner = "client!ld", name = "z", descriptor = "Lclient!tc;")
	public Class1_Sub1_Sub23 aClass1_Sub1_Sub23_1;

	@OriginalMember(owner = "client!ld", name = "B", descriptor = "I")
	public int anInt2558;

	@OriginalMember(owner = "client!ld", name = "C", descriptor = "I")
	public int anInt2559;

	@OriginalMember(owner = "client!ld", name = "G", descriptor = "I")
	public int anInt2561;

	@OriginalMember(owner = "client!ld", name = "I", descriptor = "I")
	public int anInt2562;

	@OriginalMember(owner = "client!ld", name = "J", descriptor = "Lclient!wf;")
	public Class1_Sub7_Sub4 aClass1_Sub7_Sub4_3;

	@OriginalMember(owner = "client!ld", name = "L", descriptor = "[I")
	public int[] anIntArray323;

	@OriginalMember(owner = "client!ld", name = "N", descriptor = "I")
	public int anInt2564;

	@OriginalMember(owner = "client!ld", name = "O", descriptor = "I")
	public int anInt2565;

	@OriginalMember(owner = "client!ld", name = "P", descriptor = "I")
	public int anInt2566;

	@OriginalMember(owner = "client!ld", name = "Q", descriptor = "I")
	public int anInt2567;

	@OriginalMember(owner = "client!ld", name = "U", descriptor = "I")
	public int anInt2568;

	@OriginalMember(owner = "client!ld", name = "V", descriptor = "I")
	public int anInt2569;

	@OriginalMember(owner = "client!ld", name = "d", descriptor = "(I)V")
	public void method1927() {
		@Pc(6) int local6 = this.anInt2569;
		@Pc(11) Class1_Sub1_Sub23 local11 = this.aClass1_Sub1_Sub23_1.method2938();
		if (local11 == null) {
			this.anInt2567 = 0;
			this.anIntArray323 = null;
			this.anInt2561 = 0;
			this.anInt2564 = 0;
			this.anInt2569 = -1;
		} else {
			this.anInt2564 = local11.anInt4000;
			this.anInt2567 = local11.anInt4002;
			this.anInt2569 = local11.anInt4010;
			this.anIntArray323 = local11.anIntArray525;
			this.anInt2561 = local11.anInt4034 * 128;
		}
		if (this.anInt2569 != local6 && this.aClass1_Sub7_Sub4_2 != null) {
			Static166.aClass1_Sub7_Sub2_2.method3374(this.aClass1_Sub7_Sub4_2);
			this.aClass1_Sub7_Sub4_2 = null;
		}
	}
}
