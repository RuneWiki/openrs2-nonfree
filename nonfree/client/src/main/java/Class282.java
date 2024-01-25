import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rf")
public final class Class282 {

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "Lclient!jca;")
	private Class1 aClass1_222;

	@OriginalMember(owner = "client!rf", name = "g", descriptor = "Lclient!wh;")
	private Class356 aClass356_33;

	@OriginalMember(owner = "client!rf", name = "h", descriptor = "I")
	private int anInt7775 = 0;

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "()V")
	private Class282() {
	}

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(Lclient!wh;)V")
	public Class282(@OriginalArg(0) Class356 arg0) {
		this.aClass356_33 = arg0;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)Lclient!jca;")
	public Class1 method6389() {
		this.anInt7775 = 0;
		return this.method6394();
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(B)Lclient!jca;")
	public Class1 method6394() {
		@Pc(29) Class1 local29;
		if (this.anInt7775 > 0 && this.aClass1_222 != this.aClass356_33.aClass1Array1[this.anInt7775 - 1]) {
			local29 = this.aClass1_222;
			this.aClass1_222 = local29.aClass1_286;
			return local29;
		}
		while (this.anInt7775 < this.aClass356_33.anInt9425) {
			local29 = this.aClass356_33.aClass1Array1[this.anInt7775++].aClass1_286;
			if (local29 != this.aClass356_33.aClass1Array1[this.anInt7775 - 1]) {
				this.aClass1_222 = local29.aClass1_286;
				return local29;
			}
		}
		return null;
	}
}
