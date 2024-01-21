import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tf")
public final class Class3_Sub22 extends Class3 {

	@OriginalMember(owner = "client!tf", name = "H", descriptor = "[I")
	public int[] anIntArray366;

	@OriginalMember(owner = "client!tf", name = "I", descriptor = "I")
	public int anInt3025;

	@OriginalMember(owner = "client!tf", name = "K", descriptor = "I")
	public int anInt3027;

	@OriginalMember(owner = "client!tf", name = "M", descriptor = "I")
	public int anInt3028;

	@OriginalMember(owner = "client!tf", name = "N", descriptor = "I")
	public int anInt3029;

	@OriginalMember(owner = "client!tf", name = "O", descriptor = "Lclient!ra;")
	public Class3_Sub3_Sub3 aClass3_Sub3_Sub3_2;

	@OriginalMember(owner = "client!tf", name = "R", descriptor = "Lclient!ra;")
	public Class3_Sub3_Sub3 aClass3_Sub3_Sub3_3;

	@OriginalMember(owner = "client!tf", name = "S", descriptor = "I")
	public int anInt3032;

	@OriginalMember(owner = "client!tf", name = "V", descriptor = "I")
	public int anInt3033;

	@OriginalMember(owner = "client!tf", name = "X", descriptor = "Lclient!ab;")
	public Class3_Sub1_Sub1 aClass3_Sub1_Sub1_1;

	@OriginalMember(owner = "client!tf", name = "cb", descriptor = "I")
	public int anInt3036;

	@OriginalMember(owner = "client!tf", name = "fb", descriptor = "I")
	public int anInt3039;

	@OriginalMember(owner = "client!tf", name = "gb", descriptor = "I")
	public int anInt3040;

	@OriginalMember(owner = "client!tf", name = "hb", descriptor = "I")
	public int anInt3041;

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(Z)V")
	public void method2075() {
		@Pc(12) int local12 = this.anInt3036;
		@Pc(17) Class3_Sub1_Sub1 local17 = this.aClass3_Sub1_Sub1_1.method48();
		if (local17 == null) {
			this.anInt3028 = 0;
			this.anInt3025 = 0;
			this.anIntArray366 = null;
			this.anInt3027 = 0;
			this.anInt3036 = -1;
		} else {
			this.anInt3036 = local17.anInt106;
			this.anInt3027 = local17.anInt95 * 128;
			this.anInt3028 = local17.anInt84;
			this.anIntArray366 = local17.anIntArray10;
			this.anInt3025 = local17.anInt88;
		}
		if (local12 != this.anInt3036 && this.aClass3_Sub3_Sub3_3 != null) {
			Static5.aClass3_Sub3_Sub2_63.method1074(this.aClass3_Sub3_Sub3_3);
			this.aClass3_Sub3_Sub3_3 = null;
		}
	}
}
