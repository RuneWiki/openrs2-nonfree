import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ja")
public final class Class100 {

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "Lclient!pn;")
	private Class1 aClass1_113;

	@OriginalMember(owner = "client!ja", name = "h", descriptor = "I")
	private int anInt2973 = 0;

	@OriginalMember(owner = "client!ja", name = "i", descriptor = "Lclient!tm;")
	private final Class197 aClass197_12;

	@OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(Lclient!tm;)V")
	public Class100(@OriginalArg(0) Class197 arg0) {
		this.aClass197_12 = arg0;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)Lclient!pn;")
	public Class1 method2753() {
		this.anInt2973 = 0;
		return this.method2754();
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(B)Lclient!pn;")
	public Class1 method2754() {
		@Pc(25) Class1 local25;
		if (this.anInt2973 > 0 && this.aClass197_12.aClass1Array1[this.anInt2973 - 1] != this.aClass1_113) {
			local25 = this.aClass1_113;
			this.aClass1_113 = local25.aClass1_252;
			return local25;
		}
		while (this.aClass197_12.anInt6054 > this.anInt2973) {
			local25 = this.aClass197_12.aClass1Array1[this.anInt2973++].aClass1_252;
			if (local25 != this.aClass197_12.aClass1Array1[this.anInt2973 - 1]) {
				this.aClass1_113 = local25.aClass1_252;
				return local25;
			}
		}
		return null;
	}
}
