import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vm")
public final class Class335 {

	@OriginalMember(owner = "client!vm", name = "e", descriptor = "Lclient!tq;")
	private Class305 aClass305_39;

	@OriginalMember(owner = "client!vm", name = "i", descriptor = "Lclient!mu;")
	private Class6 aClass6_262;

	@OriginalMember(owner = "client!vm", name = "c", descriptor = "I")
	private int anInt9380 = 0;

	@OriginalMember(owner = "client!vm", name = "<init>", descriptor = "()V")
	private Class335() {
	}

	@OriginalMember(owner = "client!vm", name = "<init>", descriptor = "(Lclient!tq;)V")
	public Class335(@OriginalArg(0) Class305 arg0) {
		this.aClass305_39 = arg0;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(I)Lclient!mu;")
	public Class6 method7834() {
		this.anInt9380 = 0;
		return this.method7835();
	}

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "(I)Lclient!mu;")
	public Class6 method7835() {
		@Pc(23) Class6 local23;
		if (this.anInt9380 > 0 && this.aClass305_39.aClass6Array1[this.anInt9380 - 1] != this.aClass6_262) {
			local23 = this.aClass6_262;
			this.aClass6_262 = local23.aClass6_283;
			return local23;
		}
		while (this.aClass305_39.anInt8868 > this.anInt9380) {
			local23 = this.aClass305_39.aClass6Array1[this.anInt9380++].aClass6_283;
			if (this.aClass305_39.aClass6Array1[this.anInt9380 - 1] != local23) {
				this.aClass6_262 = local23.aClass6_283;
				return local23;
			}
		}
		return null;
	}
}
