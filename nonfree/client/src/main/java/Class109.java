import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nl")
public final class Class109 {

	@OriginalMember(owner = "client!nl", name = "h", descriptor = "Lclient!hl;")
	private Class1 aClass1_153;

	@OriginalMember(owner = "client!nl", name = "j", descriptor = "I")
	private int anInt4035 = 0;

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "Lclient!ol;")
	private Class117 aClass117_15;

	@OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(Lclient!ol;)V")
	public Class109(@OriginalArg(0) Class117 arg0) {
		this.aClass117_15 = arg0;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(B)Lclient!hl;")
	public Class1 method3246() {
		this.anInt4035 = 0;
		return this.method3247();
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)Lclient!hl;")
	public Class1 method3247() {
		@Pc(30) Class1 local30;
		if (this.anInt4035 > 0 && this.aClass1_153 != this.aClass117_15.aClass1Array1[this.anInt4035 - 1]) {
			local30 = this.aClass1_153;
			this.aClass1_153 = local30.aClass1_231;
			return local30;
		}
		do {
			if (this.anInt4035 >= this.aClass117_15.anInt4392) {
				return null;
			}
			local30 = this.aClass117_15.aClass1Array1[this.anInt4035++].aClass1_231;
		} while (local30 == this.aClass117_15.aClass1Array1[this.anInt4035 - 1]);
		this.aClass1_153 = local30.aClass1_231;
		return local30;
	}
}
