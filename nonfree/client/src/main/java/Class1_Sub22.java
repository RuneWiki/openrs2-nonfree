import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jg")
public final class Class1_Sub22 extends Class1 {

	@OriginalMember(owner = "client!jg", name = "l", descriptor = "I")
	public int anInt3047;

	@OriginalMember(owner = "client!jg", name = "m", descriptor = "I")
	public int anInt3048;

	@OriginalMember(owner = "client!jg", name = "n", descriptor = "Lclient!np;")
	public Class1_Sub1_Sub2 aClass1_Sub1_Sub2_1;

	@OriginalMember(owner = "client!jg", name = "p", descriptor = "Lclient!nd;")
	public Class141 aClass141_1;

	@OriginalMember(owner = "client!jg", name = "q", descriptor = "Z")
	public boolean aBoolean291;

	@OriginalMember(owner = "client!jg", name = "r", descriptor = "I")
	public int anInt3050;

	@OriginalMember(owner = "client!jg", name = "t", descriptor = "I")
	public int anInt3052;

	@OriginalMember(owner = "client!jg", name = "u", descriptor = "Lclient!pi;")
	public Class17_Sub1_Sub1_Sub2 aClass17_Sub1_Sub1_Sub2_1;

	@OriginalMember(owner = "client!jg", name = "v", descriptor = "Lclient!np;")
	public Class1_Sub1_Sub2 aClass1_Sub1_Sub2_2;

	@OriginalMember(owner = "client!jg", name = "w", descriptor = "[I")
	public int[] anIntArray267;

	@OriginalMember(owner = "client!jg", name = "y", descriptor = "I")
	public int anInt3054;

	@OriginalMember(owner = "client!jg", name = "z", descriptor = "I")
	public int anInt3055;

	@OriginalMember(owner = "client!jg", name = "A", descriptor = "I")
	public int anInt3056;

	@OriginalMember(owner = "client!jg", name = "B", descriptor = "I")
	public int anInt3057;

	@OriginalMember(owner = "client!jg", name = "C", descriptor = "I")
	public int anInt3058;

	@OriginalMember(owner = "client!jg", name = "D", descriptor = "I")
	public int anInt3059;

	@OriginalMember(owner = "client!jg", name = "E", descriptor = "I")
	public int anInt3060;

	@OriginalMember(owner = "client!jg", name = "F", descriptor = "Lclient!be;")
	public Class17_Sub1_Sub1_Sub1 aClass17_Sub1_Sub1_Sub1_4;

	@OriginalMember(owner = "client!jg", name = "x", descriptor = "I")
	public int anInt3053 = 0;

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)V")
	public void method2812() {
		@Pc(14) int local14 = this.anInt3060;
		if (this.aClass141_1 != null) {
			@Pc(24) Class141 local24 = this.aClass141_1.method3833();
			if (local24 == null) {
				this.anInt3054 = 0;
				this.anIntArray267 = null;
				this.anInt3048 = 0;
				this.anInt3055 = 0;
				this.anInt3060 = -1;
				this.anInt3056 = 0;
			} else {
				this.anInt3056 = local24.anInt4282;
				this.anInt3048 = local24.anInt4293;
				this.anInt3055 = local24.anInt4276 * 128;
				this.anInt3054 = local24.anInt4271;
				this.anInt3060 = local24.anInt4259;
				this.anIntArray267 = local24.anIntArray386;
			}
		} else if (this.aClass17_Sub1_Sub1_Sub2_1 != null) {
			@Pc(105) int local105 = Static353.method5618(this.aClass17_Sub1_Sub1_Sub2_1);
			if (local14 != local105) {
				this.anInt3060 = local105;
				@Pc(115) Class213 local115 = this.aClass17_Sub1_Sub1_Sub2_1.aClass213_1;
				if (local115.anIntArray517 != null) {
					local115 = local115.method5480();
				}
				if (local115 == null) {
					this.anInt3048 = this.anInt3055 = 0;
				} else {
					this.anInt3048 = local115.anInt6518;
					this.anInt3055 = local115.anInt6550 * 128;
				}
			}
		} else if (this.aClass17_Sub1_Sub1_Sub1_4 != null) {
			this.anInt3060 = Static322.method5249(this.aClass17_Sub1_Sub1_Sub1_4);
			this.anInt3055 = this.aClass17_Sub1_Sub1_Sub1_4.anInt804 * 128;
			this.anInt3048 = this.aClass17_Sub1_Sub1_Sub1_4.anInt806;
		}
		if (this.anInt3060 != local14 && this.aClass1_Sub1_Sub2_2 != null) {
			Static145.aClass1_Sub1_Sub4_1.method5037(this.aClass1_Sub1_Sub2_2);
			this.aClass1_Sub1_Sub2_2 = null;
		}
	}
}
