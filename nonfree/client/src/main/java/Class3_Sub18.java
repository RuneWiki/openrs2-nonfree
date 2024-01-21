import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public final class Class3_Sub18 extends Class3 {

	@OriginalMember(owner = "client!qb", name = "t", descriptor = "I")
	public int anInt3234;

	@OriginalMember(owner = "client!qb", name = "w", descriptor = "Lclient!bd;")
	public Class3_Sub3_Sub1 aClass3_Sub3_Sub1_2;

	@OriginalMember(owner = "client!qb", name = "x", descriptor = "I")
	public int anInt3237;

	@OriginalMember(owner = "client!qb", name = "z", descriptor = "I")
	public int anInt3238;

	@OriginalMember(owner = "client!qb", name = "A", descriptor = "Lclient!wd;")
	public Class3_Sub2_Sub18 aClass3_Sub2_Sub18_1;

	@OriginalMember(owner = "client!qb", name = "C", descriptor = "I")
	public int anInt3240;

	@OriginalMember(owner = "client!qb", name = "K", descriptor = "I")
	public int anInt3246;

	@OriginalMember(owner = "client!qb", name = "N", descriptor = "I")
	public int anInt3248;

	@OriginalMember(owner = "client!qb", name = "S", descriptor = "I")
	public int anInt3250;

	@OriginalMember(owner = "client!qb", name = "U", descriptor = "I")
	public int anInt3251;

	@OriginalMember(owner = "client!qb", name = "W", descriptor = "I")
	public int anInt3253;

	@OriginalMember(owner = "client!qb", name = "Y", descriptor = "I")
	public int anInt3254;

	@OriginalMember(owner = "client!qb", name = "ab", descriptor = "Lclient!bd;")
	public Class3_Sub3_Sub1 aClass3_Sub3_Sub1_3;

	@OriginalMember(owner = "client!qb", name = "bb", descriptor = "[I")
	public int[] anIntArray562;

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "(I)V")
	public void method2497() {
		@Pc(6) int local6 = this.anInt3248;
		@Pc(11) Class3_Sub2_Sub18 local11 = this.aClass3_Sub2_Sub18_1.method3185();
		if (local11 == null) {
			this.anInt3248 = -1;
			this.anInt3254 = 0;
			this.anInt3246 = 0;
			this.anIntArray562 = null;
			this.anInt3234 = 0;
		} else {
			this.anInt3246 = local11.anInt4224 * 128;
			this.anInt3234 = local11.anInt4230;
			this.anInt3254 = local11.anInt4217;
			this.anInt3248 = local11.anInt4244;
			this.anIntArray562 = local11.anIntArray700;
		}
		if (local6 != this.anInt3248 && this.aClass3_Sub3_Sub1_3 != null) {
			Static157.aClass3_Sub3_Sub4_2.method2851(this.aClass3_Sub3_Sub1_3);
			this.aClass3_Sub3_Sub1_3 = null;
		}
	}
}
