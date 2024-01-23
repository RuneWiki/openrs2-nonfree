import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!n")
public final class Class4_Sub23 extends Class4 {

	@OriginalMember(owner = "client!n", name = "j", descriptor = "Lclient!fc;")
	public Class47 aClass47_1;

	@OriginalMember(owner = "client!n", name = "k", descriptor = "Z")
	public boolean aBoolean212;

	@OriginalMember(owner = "client!n", name = "l", descriptor = "I")
	public int anInt3417;

	@OriginalMember(owner = "client!n", name = "m", descriptor = "Lclient!qb;")
	public Class12_Sub3_Sub2 aClass12_Sub3_Sub2_1;

	@OriginalMember(owner = "client!n", name = "o", descriptor = "Lclient!df;")
	public Class4_Sub9_Sub1 aClass4_Sub9_Sub1_2;

	@OriginalMember(owner = "client!n", name = "p", descriptor = "I")
	public int anInt3418;

	@OriginalMember(owner = "client!n", name = "q", descriptor = "I")
	public int anInt3419;

	@OriginalMember(owner = "client!n", name = "r", descriptor = "I")
	public int anInt3420;

	@OriginalMember(owner = "client!n", name = "s", descriptor = "I")
	public int anInt3421;

	@OriginalMember(owner = "client!n", name = "t", descriptor = "I")
	public int anInt3422;

	@OriginalMember(owner = "client!n", name = "u", descriptor = "I")
	public int anInt3423;

	@OriginalMember(owner = "client!n", name = "z", descriptor = "I")
	public int anInt3428;

	@OriginalMember(owner = "client!n", name = "A", descriptor = "Lclient!df;")
	public Class4_Sub9_Sub1 aClass4_Sub9_Sub1_3;

	@OriginalMember(owner = "client!n", name = "B", descriptor = "I")
	public int anInt3429;

	@OriginalMember(owner = "client!n", name = "C", descriptor = "I")
	public int anInt3430;

	@OriginalMember(owner = "client!n", name = "D", descriptor = "I")
	public int anInt3431;

	@OriginalMember(owner = "client!n", name = "G", descriptor = "Lclient!hc;")
	public Class12_Sub3_Sub1 aClass12_Sub3_Sub1_1;

	@OriginalMember(owner = "client!n", name = "K", descriptor = "[I")
	public int[] anIntArray297;

	@OriginalMember(owner = "client!n", name = "E", descriptor = "I")
	public int anInt3432 = 0;

	@OriginalMember(owner = "client!n", name = "c", descriptor = "(I)V")
	public void method2708() {
		@Pc(4) int local4 = this.anInt3422;
		if (this.aClass47_1 != null) {
			@Pc(91) Class47 local91 = this.aClass47_1.method1096();
			if (local91 == null) {
				this.anIntArray297 = null;
				this.anInt3423 = 0;
				this.anInt3431 = 0;
				this.anInt3422 = -1;
				this.anInt3421 = 0;
				this.anInt3430 = 0;
			} else {
				this.anInt3421 = local91.anInt1353;
				this.anInt3430 = local91.anInt1372 * 128;
				this.anInt3431 = local91.anInt1373;
				this.anIntArray297 = local91.anIntArray143;
				this.anInt3423 = local91.anInt1346;
				this.anInt3422 = local91.anInt1359;
			}
		} else if (this.aClass12_Sub3_Sub1_1 != null) {
			@Pc(17) int local17 = Static170.method2677(this.aClass12_Sub3_Sub1_1);
			if (local17 != local4) {
				this.anInt3422 = local17;
				@Pc(32) Class175 local32 = this.aClass12_Sub3_Sub1_1.aClass175_1;
				if (local32.anIntArray462 != null) {
					local32 = local32.method4133();
				}
				if (local32 == null) {
					this.anInt3431 = this.anInt3430 = 0;
				} else {
					this.anInt3430 = local32.anInt5215 * 128;
					this.anInt3431 = local32.anInt5205;
				}
			}
		} else if (this.aClass12_Sub3_Sub2_1 != null) {
			this.anInt3422 = Static147.method2370(this.aClass12_Sub3_Sub2_1);
			this.anInt3431 = this.aClass12_Sub3_Sub2_1.anInt4207;
			this.anInt3430 = this.aClass12_Sub3_Sub2_1.anInt4221 * 128;
		}
		if (local4 != this.anInt3422 && this.aClass4_Sub9_Sub1_3 != null) {
			Static219.aClass4_Sub9_Sub4_2.method1470(this.aClass4_Sub9_Sub1_3);
			this.aClass4_Sub9_Sub1_3 = null;
		}
	}
}
