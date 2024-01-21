import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!n")
public final class Class1_Sub19 extends Class1 {

	@OriginalMember(owner = "client!n", name = "s", descriptor = "I")
	public int anInt2644;

	@OriginalMember(owner = "client!n", name = "t", descriptor = "I")
	public int anInt2645;

	@OriginalMember(owner = "client!n", name = "v", descriptor = "I")
	public int anInt2646;

	@OriginalMember(owner = "client!n", name = "w", descriptor = "I")
	public int anInt2647;

	@OriginalMember(owner = "client!n", name = "x", descriptor = "[I")
	public int[] anIntArray203;

	@OriginalMember(owner = "client!n", name = "y", descriptor = "Lclient!t;")
	public Class1_Sub12_Sub4 aClass1_Sub12_Sub4_2;

	@OriginalMember(owner = "client!n", name = "A", descriptor = "I")
	public int anInt2649;

	@OriginalMember(owner = "client!n", name = "B", descriptor = "I")
	public int anInt2650;

	@OriginalMember(owner = "client!n", name = "C", descriptor = "I")
	public int anInt2651;

	@OriginalMember(owner = "client!n", name = "F", descriptor = "Lclient!t;")
	public Class1_Sub12_Sub4 aClass1_Sub12_Sub4_3;

	@OriginalMember(owner = "client!n", name = "G", descriptor = "I")
	public int anInt2654;

	@OriginalMember(owner = "client!n", name = "H", descriptor = "I")
	public int anInt2655;

	@OriginalMember(owner = "client!n", name = "I", descriptor = "I")
	public int anInt2656;

	@OriginalMember(owner = "client!n", name = "K", descriptor = "Lclient!fj;")
	public Class1_Sub3_Sub5 aClass1_Sub3_Sub5_1;

	@OriginalMember(owner = "client!n", name = "f", descriptor = "(I)V")
	public void method1862() {
		@Pc(11) int local11 = this.anInt2654;
		@Pc(16) Class1_Sub3_Sub5 local16 = this.aClass1_Sub3_Sub5_1.method959();
		if (local16 == null) {
			this.anInt2654 = -1;
			this.anInt2647 = 0;
			this.anInt2645 = 0;
			this.anInt2646 = 0;
			this.anIntArray203 = null;
		} else {
			this.anInt2645 = local16.anInt1422;
			this.anIntArray203 = local16.anIntArray118;
			this.anInt2647 = local16.anInt1421;
			this.anInt2654 = local16.anInt1401;
			this.anInt2646 = local16.anInt1419 * 128;
		}
		if (this.anInt2654 != local11 && this.aClass1_Sub12_Sub4_3 != null) {
			Static16.aClass1_Sub12_Sub2_2.method1612(this.aClass1_Sub12_Sub4_3);
			this.aClass1_Sub12_Sub4_3 = null;
		}
	}
}
