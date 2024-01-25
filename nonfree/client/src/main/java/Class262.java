import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pk")
public final class Class262 {

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "Lclient!sl;")
	private Class310 aClass310_27;

	@OriginalMember(owner = "client!pk", name = "c", descriptor = "Lclient!iga;")
	private Class3 aClass3_210;

	@OriginalMember(owner = "client!pk", name = "g", descriptor = "I")
	private int anInt6918 = 0;

	@OriginalMember(owner = "client!pk", name = "<init>", descriptor = "()V")
	private Class262() {
	}

	@OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(Lclient!sl;)V")
	public Class262(@OriginalArg(0) Class310 arg0) {
		this.aClass310_27 = arg0;
	}

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "(I)Lclient!iga;")
	public Class3 method5904() {
		this.anInt6918 = 0;
		return this.method5905();
	}

	@OriginalMember(owner = "client!pk", name = "c", descriptor = "(I)Lclient!iga;")
	public Class3 method5905() {
		@Pc(26) Class3 local26;
		if (this.anInt6918 > 0 && this.aClass3_210 != this.aClass310_27.aClass3Array1[this.anInt6918 - 1]) {
			local26 = this.aClass3_210;
			this.aClass3_210 = local26.aClass3_285;
			return local26;
		}
		while (this.anInt6918 < this.aClass310_27.anInt7832) {
			local26 = this.aClass310_27.aClass3Array1[this.anInt6918++].aClass3_285;
			if (this.aClass310_27.aClass3Array1[this.anInt6918 - 1] != local26) {
				this.aClass3_210 = local26.aClass3_285;
				return local26;
			}
		}
		return null;
	}
}
