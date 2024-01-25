import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uo")
public final class Class1_Sub42 extends Class1 {

	@OriginalMember(owner = "client!uo", name = "o", descriptor = "Lclient!kn;")
	public Class141 aClass141_1;

	@OriginalMember(owner = "client!uo", name = "p", descriptor = "Lclient!oq;")
	public Class20_Sub3_Sub3_Sub1 aClass20_Sub3_Sub3_Sub1_2;

	@OriginalMember(owner = "client!uo", name = "q", descriptor = "Lclient!ct;")
	public Class1_Sub9_Sub1 aClass1_Sub9_Sub1_3;

	@OriginalMember(owner = "client!uo", name = "s", descriptor = "I")
	public int anInt6721;

	@OriginalMember(owner = "client!uo", name = "t", descriptor = "I")
	public int anInt6722;

	@OriginalMember(owner = "client!uo", name = "u", descriptor = "I")
	public int anInt6723;

	@OriginalMember(owner = "client!uo", name = "v", descriptor = "I")
	public int anInt6724;

	@OriginalMember(owner = "client!uo", name = "y", descriptor = "Lclient!ct;")
	public Class1_Sub9_Sub1 aClass1_Sub9_Sub1_4;

	@OriginalMember(owner = "client!uo", name = "z", descriptor = "Z")
	public boolean aBoolean550;

	@OriginalMember(owner = "client!uo", name = "A", descriptor = "[I")
	public int[] anIntArray449;

	@OriginalMember(owner = "client!uo", name = "C", descriptor = "I")
	public int anInt6728;

	@OriginalMember(owner = "client!uo", name = "D", descriptor = "I")
	public int anInt6729;

	@OriginalMember(owner = "client!uo", name = "E", descriptor = "I")
	public int anInt6730;

	@OriginalMember(owner = "client!uo", name = "G", descriptor = "I")
	public int anInt6731;

	@OriginalMember(owner = "client!uo", name = "H", descriptor = "I")
	public int anInt6732;

	@OriginalMember(owner = "client!uo", name = "I", descriptor = "Lclient!se;")
	public Class20_Sub3_Sub3_Sub2 aClass20_Sub3_Sub3_Sub2_1;

	@OriginalMember(owner = "client!uo", name = "J", descriptor = "I")
	public int anInt6733;

	@OriginalMember(owner = "client!uo", name = "K", descriptor = "I")
	public int anInt6734;

	@OriginalMember(owner = "client!uo", name = "x", descriptor = "I")
	public int anInt6726 = 0;

	@OriginalMember(owner = "client!uo", name = "e", descriptor = "(I)V")
	public void method5165() {
		@Pc(12) int local12 = this.anInt6729;
		if (this.aClass141_1 != null) {
			@Pc(100) Class141 local100 = this.aClass141_1.method2832(Static364.aClass259_1);
			if (local100 == null) {
				this.anIntArray449 = null;
				this.anInt6722 = 0;
				this.anInt6723 = 0;
				this.anInt6724 = 0;
				this.anInt6729 = -1;
				this.anInt6734 = 0;
			} else {
				this.anInt6722 = local100.anInt3406;
				this.anInt6734 = local100.anInt3384;
				this.anInt6723 = local100.anInt3402 << 7;
				this.anIntArray449 = local100.anIntArray186;
				this.anInt6729 = local100.anInt3425;
				this.anInt6724 = local100.anInt3385;
			}
		} else if (this.aClass20_Sub3_Sub3_Sub2_1 != null) {
			@Pc(48) int local48 = Static254.method3259(this.aClass20_Sub3_Sub3_Sub2_1);
			if (local12 != local48) {
				this.anInt6729 = local48;
				@Pc(62) Class246 local62 = this.aClass20_Sub3_Sub3_Sub2_1.aClass246_1;
				if (local62.anIntArray459 != null) {
					local62 = local62.method5255(Static364.aClass259_1);
				}
				if (local62 == null) {
					this.anInt6734 = this.anInt6723 = 0;
				} else {
					this.anInt6734 = local62.anInt6860;
					this.anInt6723 = local62.anInt6852 << 7;
				}
			}
		} else if (this.aClass20_Sub3_Sub3_Sub1_2 != null) {
			this.anInt6729 = Static117.method1606(this.aClass20_Sub3_Sub3_Sub1_2);
			this.anInt6734 = this.aClass20_Sub3_Sub3_Sub1_2.anInt4963;
			this.anInt6723 = this.aClass20_Sub3_Sub3_Sub1_2.anInt4953 << 7;
		}
		if (local12 != this.anInt6729 && this.aClass1_Sub9_Sub1_3 != null) {
			Static155.aClass1_Sub9_Sub2_1.method1038(this.aClass1_Sub9_Sub1_3);
			this.aClass1_Sub9_Sub1_3 = null;
		}
	}
}
