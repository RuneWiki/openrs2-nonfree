import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!na")
public final class Class2_Sub16 extends Class2 {

	@OriginalMember(owner = "client!na", name = "t", descriptor = "Lclient!oj;")
	public Class2_Sub6_Sub2 aClass2_Sub6_Sub2_2;

	@OriginalMember(owner = "client!na", name = "v", descriptor = "I")
	public int anInt2976;

	@OriginalMember(owner = "client!na", name = "w", descriptor = "I")
	public int anInt2977;

	@OriginalMember(owner = "client!na", name = "x", descriptor = "I")
	public int anInt2978;

	@OriginalMember(owner = "client!na", name = "z", descriptor = "I")
	public int anInt2979;

	@OriginalMember(owner = "client!na", name = "B", descriptor = "Lclient!nf;")
	public Class2_Sub2_Sub14 aClass2_Sub2_Sub14_1;

	@OriginalMember(owner = "client!na", name = "C", descriptor = "[I")
	public int[] anIntArray317;

	@OriginalMember(owner = "client!na", name = "F", descriptor = "I")
	public int anInt2981;

	@OriginalMember(owner = "client!na", name = "G", descriptor = "I")
	public int anInt2982;

	@OriginalMember(owner = "client!na", name = "H", descriptor = "I")
	public int anInt2983;

	@OriginalMember(owner = "client!na", name = "M", descriptor = "Lclient!oj;")
	public Class2_Sub6_Sub2 aClass2_Sub6_Sub2_3;

	@OriginalMember(owner = "client!na", name = "N", descriptor = "I")
	public int anInt2984;

	@OriginalMember(owner = "client!na", name = "P", descriptor = "I")
	public int anInt2985;

	@OriginalMember(owner = "client!na", name = "X", descriptor = "I")
	public int anInt2991;

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(I)V")
	public void method2083() {
		@Pc(2) int local2 = this.anInt2977;
		@Pc(11) Class2_Sub2_Sub14 local11 = this.aClass2_Sub2_Sub14_1.method2120();
		if (local11 == null) {
			this.anIntArray317 = null;
			this.anInt2984 = 0;
			this.anInt2977 = -1;
			this.anInt2981 = 0;
			this.anInt2983 = 0;
		} else {
			this.anInt2981 = local11.anInt3039 * 128;
			this.anIntArray317 = local11.anIntArray327;
			this.anInt2984 = local11.anInt3060;
			this.anInt2977 = local11.anInt3059;
			this.anInt2983 = local11.anInt3051;
		}
		if (local2 != this.anInt2977 && this.aClass2_Sub6_Sub2_3 != null) {
			Static200.aClass2_Sub6_Sub4_2.method3097(this.aClass2_Sub6_Sub2_3);
			this.aClass2_Sub6_Sub2_3 = null;
		}
	}
}
