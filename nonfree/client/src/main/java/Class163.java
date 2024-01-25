import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mo")
public final class Class163 {

	@OriginalMember(owner = "client!mo", name = "f", descriptor = "Lclient!cf;")
	private Class1 aClass1_154;

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "I")
	private int anInt4559 = 0;

	@OriginalMember(owner = "client!mo", name = "k", descriptor = "Lclient!gu;")
	private final Class96 aClass96_29;

	@OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(Lclient!gu;)V")
	public Class163(@OriginalArg(0) Class96 arg0) {
		this.aClass96_29 = arg0;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(I)Lclient!cf;")
	public Class1 method3759() {
		@Pc(28) Class1 local28;
		if (this.anInt4559 > 0 && this.aClass1_154 != this.aClass96_29.aClass1Array1[this.anInt4559 - 1]) {
			local28 = this.aClass1_154;
			this.aClass1_154 = local28.aClass1_261;
			return local28;
		}
		while (this.aClass96_29.anInt2715 > this.anInt4559) {
			local28 = this.aClass96_29.aClass1Array1[this.anInt4559++].aClass1_261;
			if (this.aClass96_29.aClass1Array1[this.anInt4559 - 1] != local28) {
				this.aClass1_154 = local28.aClass1_261;
				return local28;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(Z)Lclient!cf;")
	public Class1 method3765() {
		this.anInt4559 = 0;
		return this.method3759();
	}
}
