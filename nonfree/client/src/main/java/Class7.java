import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ai")
public final class Class7 {

	@OriginalMember(owner = "client!ai", name = "d", descriptor = "Lclient!oo;")
	private Class1 aClass1_15;

	@OriginalMember(owner = "client!ai", name = "e", descriptor = "I")
	private int anInt213 = 0;

	@OriginalMember(owner = "client!ai", name = "c", descriptor = "Lclient!cv;")
	private final Class51 aClass51_1;

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Lclient!cv;)V")
	public Class7(@OriginalArg(0) Class51 arg0) {
		this.aClass51_1 = arg0;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)Lclient!oo;")
	public Class1 method180() {
		this.anInt213 = 0;
		return this.method181();
	}

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(I)Lclient!oo;")
	public Class1 method181() {
		@Pc(23) Class1 local23;
		if (this.anInt213 > 0 && this.aClass1_15 != this.aClass51_1.aClass1Array1[this.anInt213 - 1]) {
			local23 = this.aClass1_15;
			this.aClass1_15 = local23.aClass1_262;
			return local23;
		}
		while (this.aClass51_1.anInt1098 > this.anInt213) {
			local23 = this.aClass51_1.aClass1Array1[this.anInt213++].aClass1_262;
			if (this.aClass51_1.aClass1Array1[this.anInt213 - 1] != local23) {
				this.aClass1_15 = local23.aClass1_262;
				return local23;
			}
		}
		return null;
	}
}
