import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tn")
public final class Class164 {

	@OriginalMember(owner = "client!tn", name = "c", descriptor = "Lclient!te;")
	private Class4 aClass4_213;

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "I")
	private int anInt5229 = 0;

	@OriginalMember(owner = "client!tn", name = "j", descriptor = "Lclient!tm;")
	private Class163 aClass163_33;

	@OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(Lclient!tm;)V")
	public Class164(@OriginalArg(0) Class163 arg0) {
		this.aClass163_33 = arg0;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(Z)Lclient!te;")
	public Class4 method4196() {
		this.anInt5229 = 0;
		return this.method4197();
	}

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "(B)Lclient!te;")
	public Class4 method4197() {
		@Pc(29) Class4 local29;
		if (this.anInt5229 > 0 && this.aClass4_213 != this.aClass163_33.aClass4Array1[this.anInt5229 - 1]) {
			local29 = this.aClass4_213;
			this.aClass4_213 = local29.aClass4_233;
			return local29;
		}
		do {
			if (this.anInt5229 >= this.aClass163_33.anInt5223) {
				return null;
			}
			local29 = this.aClass163_33.aClass4Array1[this.anInt5229++].aClass4_233;
		} while (local29 == this.aClass163_33.aClass4Array1[this.anInt5229 - 1]);
		this.aClass4_213 = local29.aClass4_233;
		return local29;
	}
}
