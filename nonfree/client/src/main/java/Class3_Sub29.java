import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kv")
public final class Class3_Sub29 extends Class3 {

	@OriginalMember(owner = "client!kv", name = "j", descriptor = "I")
	public int anInt3778;

	@OriginalMember(owner = "client!kv", name = "k", descriptor = "I")
	public int anInt3779;

	@OriginalMember(owner = "client!kv", name = "l", descriptor = "Lclient!wk;")
	public Class1_Sub2_Sub6_Sub2 aClass1_Sub2_Sub6_Sub2_2;

	@OriginalMember(owner = "client!kv", name = "m", descriptor = "[I")
	public int[] anIntArray252;

	@OriginalMember(owner = "client!kv", name = "n", descriptor = "Lclient!ub;")
	public Class1_Sub2_Sub6_Sub1 aClass1_Sub2_Sub6_Sub1_1;

	@OriginalMember(owner = "client!kv", name = "q", descriptor = "Lclient!t;")
	public Class3_Sub1_Sub3 aClass3_Sub1_Sub3_1;

	@OriginalMember(owner = "client!kv", name = "r", descriptor = "I")
	public int anInt3781;

	@OriginalMember(owner = "client!kv", name = "s", descriptor = "I")
	public int anInt3782;

	@OriginalMember(owner = "client!kv", name = "t", descriptor = "I")
	public int anInt3783;

	@OriginalMember(owner = "client!kv", name = "y", descriptor = "Z")
	public boolean aBoolean276;

	@OriginalMember(owner = "client!kv", name = "z", descriptor = "Lclient!t;")
	public Class3_Sub1_Sub3 aClass3_Sub1_Sub3_2;

	@OriginalMember(owner = "client!kv", name = "A", descriptor = "I")
	public int anInt3787;

	@OriginalMember(owner = "client!kv", name = "B", descriptor = "Lclient!cd;")
	public Class31 aClass31_1;

	@OriginalMember(owner = "client!kv", name = "C", descriptor = "I")
	public int anInt3788;

	@OriginalMember(owner = "client!kv", name = "D", descriptor = "I")
	public int anInt3789;

	@OriginalMember(owner = "client!kv", name = "E", descriptor = "I")
	public int anInt3790;

	@OriginalMember(owner = "client!kv", name = "F", descriptor = "I")
	public int anInt3791;

	@OriginalMember(owner = "client!kv", name = "G", descriptor = "I")
	public int anInt3792;

	@OriginalMember(owner = "client!kv", name = "w", descriptor = "I")
	public int anInt3785 = 0;

	@OriginalMember(owner = "client!kv", name = "f", descriptor = "(I)V")
	public void method3256() {
		@Pc(12) int local12 = this.anInt3787;
		if (this.aClass31_1 != null) {
			@Pc(21) Class31 local21 = this.aClass31_1.method863(Static119.aClass47_1);
			if (local21 == null) {
				this.anInt3778 = 0;
				this.anInt3790 = 0;
				this.anIntArray252 = null;
				this.anInt3782 = 0;
				this.anInt3792 = 0;
				this.anInt3787 = -1;
			} else {
				this.anInt3778 = local21.anInt759 << 7;
				this.anInt3790 = local21.anInt767;
				this.anInt3792 = local21.anInt799;
				this.anInt3787 = local21.anInt772;
				this.anIntArray252 = local21.anIntArray46;
				this.anInt3782 = local21.anInt809;
			}
		} else if (this.aClass1_Sub2_Sub6_Sub1_1 != null) {
			@Pc(79) int local79 = Static201.method3082(this.aClass1_Sub2_Sub6_Sub1_1);
			if (local12 != local79) {
				this.anInt3787 = local79;
				@Pc(89) Class158 local89 = this.aClass1_Sub2_Sub6_Sub1_1.aClass158_1;
				if (local89.anIntArray294 != null) {
					local89 = local89.method3705(Static119.aClass47_1);
				}
				if (local89 == null) {
					this.anInt3790 = this.anInt3778 = 0;
				} else {
					this.anInt3778 = local89.anInt4445 << 7;
					this.anInt3790 = local89.anInt4448;
				}
			}
		} else if (this.aClass1_Sub2_Sub6_Sub2_2 != null) {
			this.anInt3787 = Static299.method4272(this.aClass1_Sub2_Sub6_Sub2_2);
			this.anInt3790 = this.aClass1_Sub2_Sub6_Sub2_2.anInt7646;
			this.anInt3778 = this.aClass1_Sub2_Sub6_Sub2_2.anInt7662 << 7;
		}
		if (this.anInt3787 != local12 && this.aClass3_Sub1_Sub3_2 != null) {
			Static440.aClass3_Sub1_Sub2_2.method5098(this.aClass3_Sub1_Sub3_2);
			this.aClass3_Sub1_Sub3_2 = null;
		}
	}
}
