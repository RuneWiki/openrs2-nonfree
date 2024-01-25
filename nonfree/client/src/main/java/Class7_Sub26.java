import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mg")
public final class Class7_Sub26 extends Class7 {

	@OriginalMember(owner = "client!mg", name = "n", descriptor = "[I")
	public int[] anIntArray547;

	@OriginalMember(owner = "client!mg", name = "o", descriptor = "I")
	public int anInt3934;

	@OriginalMember(owner = "client!mg", name = "r", descriptor = "I")
	public int anInt3936;

	@OriginalMember(owner = "client!mg", name = "s", descriptor = "Lclient!kk;")
	public Class122 aClass122_1;

	@OriginalMember(owner = "client!mg", name = "t", descriptor = "Lclient!tk;")
	public Class7_Sub8_Sub4 aClass7_Sub8_Sub4_1;

	@OriginalMember(owner = "client!mg", name = "v", descriptor = "I")
	public int anInt3938;

	@OriginalMember(owner = "client!mg", name = "w", descriptor = "I")
	public int anInt3939;

	@OriginalMember(owner = "client!mg", name = "x", descriptor = "I")
	public int anInt3940;

	@OriginalMember(owner = "client!mg", name = "y", descriptor = "Lclient!cc;")
	public Class22_Sub2_Sub1_Sub1 aClass22_Sub2_Sub1_Sub1_3;

	@OriginalMember(owner = "client!mg", name = "z", descriptor = "Z")
	public boolean aBoolean310;

	@OriginalMember(owner = "client!mg", name = "B", descriptor = "I")
	public int anInt3941;

	@OriginalMember(owner = "client!mg", name = "F", descriptor = "Lclient!tk;")
	public Class7_Sub8_Sub4 aClass7_Sub8_Sub4_2;

	@OriginalMember(owner = "client!mg", name = "H", descriptor = "Lclient!qo;")
	public Class22_Sub2_Sub1_Sub2 aClass22_Sub2_Sub1_Sub2_1;

	@OriginalMember(owner = "client!mg", name = "I", descriptor = "I")
	public int anInt3942;

	@OriginalMember(owner = "client!mg", name = "K", descriptor = "I")
	public int anInt3943;

	@OriginalMember(owner = "client!mg", name = "M", descriptor = "I")
	public int anInt3945;

	@OriginalMember(owner = "client!mg", name = "R", descriptor = "I")
	public int anInt3948;

	@OriginalMember(owner = "client!mg", name = "S", descriptor = "I")
	public int anInt3949;

	@OriginalMember(owner = "client!mg", name = "p", descriptor = "I")
	public int anInt3935 = 0;

	@OriginalMember(owner = "client!mg", name = "d", descriptor = "(B)V")
	public void method3578() {
		@Pc(10) int local10 = this.anInt3939;
		if (this.aClass122_1 != null) {
			@Pc(18) Class122 local18 = this.aClass122_1.method3234();
			if (local18 == null) {
				this.anIntArray547 = null;
				this.anInt3940 = 0;
				this.anInt3936 = 0;
				this.anInt3939 = -1;
				this.anInt3943 = 0;
				this.anInt3948 = 0;
			} else {
				this.anInt3943 = local18.anInt3538;
				this.anInt3939 = local18.anInt3533;
				this.anIntArray547 = local18.anIntArray475;
				this.anInt3948 = local18.anInt3537;
				this.anInt3940 = local18.anInt3531 * 128;
				this.anInt3936 = local18.anInt3555;
			}
		} else if (this.aClass22_Sub2_Sub1_Sub2_1 != null) {
			@Pc(96) int local96 = Static289.method1940(this.aClass22_Sub2_Sub1_Sub2_1);
			if (local96 != local10) {
				this.anInt3939 = local96;
				@Pc(110) Class174 local110 = this.aClass22_Sub2_Sub1_Sub2_1.aClass174_1;
				if (local110.anIntArray670 != null) {
					local110 = local110.method4438();
				}
				if (local110 == null) {
					this.anInt3936 = this.anInt3940 = 0;
				} else {
					this.anInt3936 = local110.anInt5181;
					this.anInt3940 = local110.anInt5207 * 128;
				}
			}
		} else if (this.aClass22_Sub2_Sub1_Sub1_3 != null) {
			this.anInt3939 = Static184.method3384(this.aClass22_Sub2_Sub1_Sub1_3);
			this.anInt3940 = this.aClass22_Sub2_Sub1_Sub1_3.anInt1004 * 128;
			this.anInt3936 = this.aClass22_Sub2_Sub1_Sub1_3.anInt1002;
		}
		if (local10 != this.anInt3939 && this.aClass7_Sub8_Sub4_1 != null) {
			Static134.aClass7_Sub8_Sub3_2.method3898(this.aClass7_Sub8_Sub4_1);
			this.aClass7_Sub8_Sub4_1 = null;
		}
	}
}
