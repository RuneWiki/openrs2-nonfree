import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public final class Class120 {

	@OriginalMember(owner = "client!je", name = "b", descriptor = "Lclient!qg;")
	private Class3 aClass3_120;

	@OriginalMember(owner = "client!je", name = "i", descriptor = "I")
	private int anInt3736 = 0;

	@OriginalMember(owner = "client!je", name = "g", descriptor = "Lclient!an;")
	private final Class11 aClass11_23;

	@OriginalMember(owner = "client!je", name = "<init>", descriptor = "(Lclient!an;)V")
	public Class120(@OriginalArg(0) Class11 arg0) {
		this.aClass11_23 = arg0;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(I)Lclient!qg;")
	public Class3 method2979() {
		@Pc(28) Class3 local28;
		if (this.anInt3736 > 0 && this.aClass11_23.aClass3Array1[this.anInt3736 - 1] != this.aClass3_120) {
			local28 = this.aClass3_120;
			this.aClass3_120 = local28.aClass3_261;
			return local28;
		}
		while (this.anInt3736 < this.aClass11_23.anInt397) {
			local28 = this.aClass11_23.aClass3Array1[this.anInt3736++].aClass3_261;
			if (local28 != this.aClass11_23.aClass3Array1[this.anInt3736 - 1]) {
				this.aClass3_120 = local28.aClass3_261;
				return local28;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(I)Lclient!qg;")
	public Class3 method2980() {
		this.anInt3736 = 0;
		return this.method2979();
	}
}
