import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tn")
public final class Class167 {

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "Lclient!si;")
	private Class4 aClass4_199;

	@OriginalMember(owner = "client!tn", name = "c", descriptor = "I")
	private int anInt4965 = 0;

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "Lclient!lb;")
	private Class97 aClass97_21;

	@OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(Lclient!lb;)V")
	public Class167(@OriginalArg(0) Class97 arg0) {
		this.aClass97_21 = arg0;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(B)Lclient!si;")
	public Class4 method3966() {
		@Pc(25) Class4 local25;
		if (this.anInt4965 > 0 && this.aClass97_21.aClass4Array1[this.anInt4965 - 1] != this.aClass4_199) {
			local25 = this.aClass4_199;
			this.aClass4_199 = local25.aClass4_231;
			return local25;
		}
		do {
			if (this.aClass97_21.anInt2982 <= this.anInt4965) {
				return null;
			}
			local25 = this.aClass97_21.aClass4Array1[this.anInt4965++].aClass4_231;
		} while (this.aClass97_21.aClass4Array1[this.anInt4965 - 1] == local25);
		this.aClass4_199 = local25.aClass4_231;
		return local25;
	}

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "(B)Lclient!si;")
	public Class4 method3968() {
		this.anInt4965 = 0;
		return this.method3966();
	}
}
