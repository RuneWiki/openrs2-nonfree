import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rf")
public final class Class211 {

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "Lclient!da;")
	private Class2 aClass2_181;

	@OriginalMember(owner = "client!rf", name = "h", descriptor = "I")
	private int anInt5962 = 0;

	@OriginalMember(owner = "client!rf", name = "j", descriptor = "Lclient!ub;")
	private final Class240 aClass240_26;

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(Lclient!ub;)V")
	public Class211(@OriginalArg(0) Class240 arg0) {
		this.aClass240_26 = arg0;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Z)Lclient!da;")
	public Class2 method4760() {
		@Pc(31) Class2 local31;
		if (this.anInt5962 > 0 && this.aClass240_26.aClass2Array1[this.anInt5962 - 1] != this.aClass2_181) {
			local31 = this.aClass2_181;
			this.aClass2_181 = local31.aClass2_261;
			return local31;
		}
		while (this.anInt5962 < this.aClass240_26.anInt6931) {
			local31 = this.aClass240_26.aClass2Array1[this.anInt5962++].aClass2_261;
			if (this.aClass240_26.aClass2Array1[this.anInt5962 - 1] != local31) {
				this.aClass2_181 = local31.aClass2_261;
				return local31;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(I)Lclient!da;")
	public Class2 method4764() {
		this.anInt5962 = 0;
		return this.method4760();
	}
}
