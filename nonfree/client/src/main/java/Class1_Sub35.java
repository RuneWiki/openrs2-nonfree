import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pk")
public final class Class1_Sub35 extends Class1 {

	@OriginalMember(owner = "client!pk", name = "n", descriptor = "I")
	public int anInt5287;

	@OriginalMember(owner = "client!pk", name = "o", descriptor = "I")
	public int anInt5288;

	@OriginalMember(owner = "client!pk", name = "p", descriptor = "Lclient!fu;")
	public Class87 aClass87_1;

	@OriginalMember(owner = "client!pk", name = "r", descriptor = "I")
	public int anInt5290;

	@OriginalMember(owner = "client!pk", name = "s", descriptor = "Lclient!tc;")
	public Class1_Sub9_Sub4 aClass1_Sub9_Sub4_2;

	@OriginalMember(owner = "client!pk", name = "t", descriptor = "Lclient!et;")
	public Class11_Sub1_Sub3_Sub1 aClass11_Sub1_Sub3_Sub1_1;

	@OriginalMember(owner = "client!pk", name = "u", descriptor = "I")
	public int anInt5291;

	@OriginalMember(owner = "client!pk", name = "v", descriptor = "Lclient!tc;")
	public Class1_Sub9_Sub4 aClass1_Sub9_Sub4_3;

	@OriginalMember(owner = "client!pk", name = "w", descriptor = "[I")
	public int[] anIntArray389;

	@OriginalMember(owner = "client!pk", name = "x", descriptor = "Z")
	public boolean aBoolean477;

	@OriginalMember(owner = "client!pk", name = "z", descriptor = "I")
	public int anInt5293;

	@OriginalMember(owner = "client!pk", name = "A", descriptor = "I")
	public int anInt5294;

	@OriginalMember(owner = "client!pk", name = "C", descriptor = "Lclient!ir;")
	public Class11_Sub1_Sub3_Sub2 aClass11_Sub1_Sub3_Sub2_2;

	@OriginalMember(owner = "client!pk", name = "D", descriptor = "I")
	public int anInt5296;

	@OriginalMember(owner = "client!pk", name = "E", descriptor = "I")
	public int anInt5297;

	@OriginalMember(owner = "client!pk", name = "F", descriptor = "I")
	public int anInt5298;

	@OriginalMember(owner = "client!pk", name = "G", descriptor = "I")
	public int anInt5299;

	@OriginalMember(owner = "client!pk", name = "H", descriptor = "I")
	public int anInt5300;

	@OriginalMember(owner = "client!pk", name = "y", descriptor = "I")
	public int anInt5292 = 0;

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(B)V")
	public void method4222() {
		@Pc(14) int local14 = this.anInt5294;
		if (this.aClass87_1 != null) {
			@Pc(23) Class87 local23 = this.aClass87_1.method1571(Static32.aClass4_1);
			if (local23 == null) {
				this.anInt5298 = 0;
				this.anInt5294 = -1;
				this.anIntArray389 = null;
				this.anInt5297 = 0;
				this.anInt5296 = 0;
				this.anInt5288 = 0;
			} else {
				this.anIntArray389 = local23.anIntArray171;
				this.anInt5297 = local23.anInt1937;
				this.anInt5298 = local23.anInt1961;
				this.anInt5294 = local23.anInt1931;
				this.anInt5288 = local23.anInt1914;
				this.anInt5296 = local23.anInt1915 << 7;
			}
		} else if (this.aClass11_Sub1_Sub3_Sub1_1 != null) {
			@Pc(81) int local81 = Static64.method872(this.aClass11_Sub1_Sub3_Sub1_1);
			if (local14 != local81) {
				this.anInt5294 = local81;
				@Pc(95) Class272 local95 = this.aClass11_Sub1_Sub3_Sub1_1.aClass272_1;
				if (local95.anIntArray543 != null) {
					local95 = local95.method5900(Static32.aClass4_1);
				}
				if (local95 == null) {
					this.anInt5288 = this.anInt5296 = 0;
				} else {
					this.anInt5288 = local95.anInt7340;
					this.anInt5296 = local95.anInt7313 << 7;
				}
			}
		} else if (this.aClass11_Sub1_Sub3_Sub2_2 != null) {
			this.anInt5294 = Static20.method313(this.aClass11_Sub1_Sub3_Sub2_2);
			this.anInt5288 = this.aClass11_Sub1_Sub3_Sub2_2.anInt3383;
			this.anInt5296 = this.aClass11_Sub1_Sub3_Sub2_2.anInt3366 << 7;
		}
		if (this.anInt5294 != local14 && this.aClass1_Sub9_Sub4_3 != null) {
			Static123.aClass1_Sub9_Sub1_1.method4263(this.aClass1_Sub9_Sub4_3);
			this.aClass1_Sub9_Sub4_3 = null;
		}
	}
}
