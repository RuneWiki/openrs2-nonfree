import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jk")
public final class Class190 {

	@OriginalMember(owner = "client!jk", name = "i", descriptor = "Lclient!fw;")
	private Class125 aClass125_18;

	@OriginalMember(owner = "client!jk", name = "g", descriptor = "Lclient!wj;")
	private Class14 aClass14_150;

	@OriginalMember(owner = "client!jk", name = "f", descriptor = "I")
	private int anInt5254 = 0;

	@OriginalMember(owner = "client!jk", name = "<init>", descriptor = "()V")
	private Class190() {
	}

	@OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(Lclient!fw;)V")
	public Class190(@OriginalArg(0) Class125 arg0) {
		this.aClass125_18 = arg0;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(B)Lclient!wj;")
	public Class14 method4783() {
		@Pc(25) Class14 local25;
		if (this.anInt5254 > 0 && this.aClass125_18.aClass14Array1[this.anInt5254 - 1] != this.aClass14_150) {
			local25 = this.aClass14_150;
			this.aClass14_150 = local25.aClass14_339;
			return local25;
		}
		while (this.aClass125_18.anInt2905 > this.anInt5254) {
			local25 = this.aClass125_18.aClass14Array1[this.anInt5254++].aClass14_339;
			if (local25 != this.aClass125_18.aClass14Array1[this.anInt5254 - 1]) {
				this.aClass14_150 = local25.aClass14_339;
				return local25;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)Lclient!wj;")
	public Class14 method4788() {
		this.anInt5254 = 0;
		return this.method4783();
	}
}
