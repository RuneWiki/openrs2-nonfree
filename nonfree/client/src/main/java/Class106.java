import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gv")
public final class Class106 {

	@OriginalMember(owner = "client!gv", name = "b", descriptor = "Lclient!nd;")
	private Class4 aClass4_87;

	@OriginalMember(owner = "client!gv", name = "h", descriptor = "I")
	private int anInt2520 = 0;

	@OriginalMember(owner = "client!gv", name = "f", descriptor = "Lclient!ek;")
	private final Class67 aClass67_13;

	@OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(Lclient!ek;)V")
	public Class106(@OriginalArg(0) Class67 arg0) {
		this.aClass67_13 = arg0;
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(I)Lclient!nd;")
	public Class4 method1989() {
		this.anInt2520 = 0;
		return this.method1990();
	}

	@OriginalMember(owner = "client!gv", name = "b", descriptor = "(I)Lclient!nd;")
	public Class4 method1990() {
		@Pc(23) Class4 local23;
		if (this.anInt2520 > 0 && this.aClass4_87 != this.aClass67_13.aClass4Array1[this.anInt2520 - 1]) {
			local23 = this.aClass4_87;
			this.aClass4_87 = local23.aClass4_261;
			return local23;
		}
		while (this.anInt2520 < this.aClass67_13.anInt1741) {
			local23 = this.aClass67_13.aClass4Array1[this.anInt2520++].aClass4_261;
			if (local23 != this.aClass67_13.aClass4Array1[this.anInt2520 - 1]) {
				this.aClass4_87 = local23.aClass4_261;
				return local23;
			}
		}
		return null;
	}
}
