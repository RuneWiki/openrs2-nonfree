import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jf")
public final class Class154 {

	@OriginalMember(owner = "client!jf", name = "f", descriptor = "Lclient!pfa;")
	private Class253 aClass253_18;

	@OriginalMember(owner = "client!jf", name = "l", descriptor = "Lclient!mc;")
	private Class8 aClass8_145;

	@OriginalMember(owner = "client!jf", name = "i", descriptor = "I")
	private int anInt5516 = 0;

	@OriginalMember(owner = "client!jf", name = "<init>", descriptor = "()V")
	private Class154() {
	}

	@OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Lclient!pfa;)V")
	public Class154(@OriginalArg(0) Class253 arg0) {
		this.aClass253_18 = arg0;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)Lclient!mc;")
	public Class8 method4529() {
		this.anInt5516 = 0;
		return this.method4531();
	}

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "(I)Lclient!mc;")
	public Class8 method4531() {
		@Pc(29) Class8 local29;
		if (this.anInt5516 > 0 && this.aClass253_18.aClass8Array1[this.anInt5516 - 1] != this.aClass8_145) {
			local29 = this.aClass8_145;
			this.aClass8_145 = local29.aClass8_300;
			return local29;
		}
		while (this.aClass253_18.anInt7945 > this.anInt5516) {
			local29 = this.aClass253_18.aClass8Array1[this.anInt5516++].aClass8_300;
			if (this.aClass253_18.aClass8Array1[this.anInt5516 - 1] != local29) {
				this.aClass8_145 = local29.aClass8_300;
				return local29;
			}
		}
		return null;
	}
}
