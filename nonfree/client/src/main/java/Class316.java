import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ui")
public final class Class316 {

	@OriginalMember(owner = "client!ui", name = "d", descriptor = "Lclient!pca;")
	private final Class245 aClass245_64 = new Class245(256);

	@OriginalMember(owner = "client!ui", name = "f", descriptor = "Lclient!e;")
	private final Interface2 anInterface2_12;

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "Lclient!ap;")
	private final Class9_Sub2 aClass9_Sub2_36;

	@OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(Lclient!ap;Lclient!e;)V")
	public Class316(@OriginalArg(0) Class9_Sub2 arg0, @OriginalArg(1) Interface2 arg1) {
		this.anInterface2_12 = arg1;
		this.aClass9_Sub2_36 = arg0;
	}

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "(I)V")
	public void method7581() {
		this.aClass245_64.method6083(5);
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Z)V")
	public void method7582() {
		this.aClass245_64.method6079();
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IB)Lclient!kp;")
	public Class132_Sub1 method7584(@OriginalArg(0) int arg0) {
		@Pc(12) Object local12 = this.aClass245_64.method6082((long) arg0);
		if (local12 != null) {
			return (Class132_Sub1) local12;
		} else if (this.anInterface2_12.method3583(arg0)) {
			@Pc(39) Class296 local39 = this.anInterface2_12.method3585(arg0);
			@Pc(48) int local48 = local39.aBoolean661 ? 64 : this.aClass9_Sub2_36.anInt807;
			@Pc(86) Class132_Sub1 local86;
			if (local39.aBoolean653 && this.aClass9_Sub2_36.method5398()) {
				@Pc(65) float[] local65 = this.anInterface2_12.method3586(0.7F, arg0, local48, local48);
				local86 = new Class132_Sub1(this.aClass9_Sub2_36, 3553, 34842, local48, local48, local39.aByte106 != 0, local65, 6408);
			} else {
				@Pc(101) int[] local101;
				if (local39.aBoolean659) {
					local101 = this.anInterface2_12.method3581(arg0, 0.7F, local48, local48);
				} else {
					local101 = this.anInterface2_12.method3582(0.7F, true, local48, arg0, local48);
				}
				local86 = new Class132_Sub1(this.aClass9_Sub2_36, 3553, 6408, local48, local48, local39.aByte106 != 0, local101, false);
			}
			local86.method3694(local39.aBoolean655, local39.aBoolean658);
			this.aClass245_64.method6075(local86, (long) arg0);
			return local86;
		} else {
			return null;
		}
	}
}
