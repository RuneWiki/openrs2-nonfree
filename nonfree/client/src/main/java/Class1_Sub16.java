import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kf")
public final class Class1_Sub16 extends Class1 {

	@OriginalMember(owner = "client!kf", name = "p", descriptor = "I")
	public int anInt3268;

	@OriginalMember(owner = "client!kf", name = "q", descriptor = "I")
	public int anInt3269;

	@OriginalMember(owner = "client!kf", name = "s", descriptor = "Lclient!uk;")
	public Class1_Sub10_Sub4 aClass1_Sub10_Sub4_1;

	@OriginalMember(owner = "client!kf", name = "t", descriptor = "[I")
	public int[] anIntArray303;

	@OriginalMember(owner = "client!kf", name = "u", descriptor = "Lclient!kc;")
	public Class92 aClass92_1;

	@OriginalMember(owner = "client!kf", name = "v", descriptor = "Z")
	public boolean aBoolean213;

	@OriginalMember(owner = "client!kf", name = "y", descriptor = "I")
	public int anInt3271;

	@OriginalMember(owner = "client!kf", name = "z", descriptor = "I")
	public int anInt3272;

	@OriginalMember(owner = "client!kf", name = "A", descriptor = "Lclient!fc;")
	public Class2_Sub4_Sub1 aClass2_Sub4_Sub1_1;

	@OriginalMember(owner = "client!kf", name = "C", descriptor = "I")
	public int anInt3273;

	@OriginalMember(owner = "client!kf", name = "E", descriptor = "I")
	public int anInt3275;

	@OriginalMember(owner = "client!kf", name = "F", descriptor = "I")
	public int anInt3276;

	@OriginalMember(owner = "client!kf", name = "G", descriptor = "I")
	public int anInt3277;

	@OriginalMember(owner = "client!kf", name = "H", descriptor = "I")
	public int anInt3278;

	@OriginalMember(owner = "client!kf", name = "I", descriptor = "Lclient!uk;")
	public Class1_Sub10_Sub4 aClass1_Sub10_Sub4_2;

	@OriginalMember(owner = "client!kf", name = "J", descriptor = "I")
	public int anInt3279;

	@OriginalMember(owner = "client!kf", name = "K", descriptor = "Lclient!jh;")
	public Class2_Sub4_Sub2 aClass2_Sub4_Sub2_2;

	@OriginalMember(owner = "client!kf", name = "L", descriptor = "I")
	public int anInt3280;

	@OriginalMember(owner = "client!kf", name = "D", descriptor = "I")
	public int anInt3274 = 0;

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Z)V")
	public void method2372() {
		@Pc(8) int local8 = this.anInt3279;
		if (this.aClass92_1 != null) {
			@Pc(94) Class92 local94 = this.aClass92_1.method2323();
			if (local94 == null) {
				this.anInt3278 = 0;
				this.anInt3271 = 0;
				this.anIntArray303 = null;
				this.anInt3269 = 0;
				this.anInt3275 = 0;
				this.anInt3279 = -1;
			} else {
				this.anInt3269 = local94.anInt3178;
				this.anIntArray303 = local94.anIntArray298;
				this.anInt3271 = local94.anInt3212 * 128;
				this.anInt3278 = local94.anInt3189;
				this.anInt3279 = local94.anInt3222;
				this.anInt3275 = local94.anInt3211;
			}
		} else if (this.aClass2_Sub4_Sub1_1 != null) {
			@Pc(44) int local44 = Static75.method1315(this.aClass2_Sub4_Sub1_1);
			if (local8 != local44) {
				this.anInt3279 = local44;
				@Pc(59) Class145 local59 = this.aClass2_Sub4_Sub1_1.aClass145_1;
				if (local59.anIntArray455 != null) {
					local59 = local59.method3711();
				}
				if (local59 == null) {
					this.anInt3269 = this.anInt3271 = 0;
				} else {
					this.anInt3271 = local59.anInt4910 * 128;
					this.anInt3269 = local59.anInt4940;
				}
			}
		} else if (this.aClass2_Sub4_Sub2_2 != null) {
			this.anInt3279 = Static64.method1133(this.aClass2_Sub4_Sub2_2);
			this.anInt3269 = this.aClass2_Sub4_Sub2_2.anInt2883;
			this.anInt3271 = this.aClass2_Sub4_Sub2_2.anInt2882 * 128;
		}
		if (local8 != this.anInt3279 && this.aClass1_Sub10_Sub4_2 != null) {
			Static101.aClass1_Sub10_Sub2_2.method1864(this.aClass1_Sub10_Sub4_2);
			this.aClass1_Sub10_Sub4_2 = null;
		}
	}
}
