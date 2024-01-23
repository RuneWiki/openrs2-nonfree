import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cf")
public final class Class25 {

	@OriginalMember(owner = "client!cf", name = "k", descriptor = "Lclient!wk;")
	private Class3 aClass3_27;

	@OriginalMember(owner = "client!cf", name = "g", descriptor = "I")
	private int anInt634 = 0;

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "Lclient!cn;")
	private Class30 aClass30_4;

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(Lclient!cn;)V")
	public Class25(@OriginalArg(0) Class30 arg0) {
		this.aClass30_4 = arg0;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)Lclient!wk;")
	public Class3 method536() {
		@Pc(25) Class3 local25;
		if (this.anInt634 > 0 && this.aClass30_4.aClass3Array1[this.anInt634 - 1] != this.aClass3_27) {
			local25 = this.aClass3_27;
			this.aClass3_27 = local25.aClass3_232;
			return local25;
		}
		do {
			if (this.aClass30_4.anInt818 <= this.anInt634) {
				return null;
			}
			local25 = this.aClass30_4.aClass3Array1[this.anInt634++].aClass3_232;
		} while (local25 == this.aClass30_4.aClass3Array1[this.anInt634 - 1]);
		this.aClass3_27 = local25.aClass3_232;
		return local25;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Z)Lclient!wk;")
	public Class3 method538() {
		this.anInt634 = 0;
		return this.method536();
	}
}
