import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vm")
public final class Class182 {

	@OriginalMember(owner = "client!vm", name = "i", descriptor = "Lclient!ak;")
	private Class1 aClass1_231;

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "I")
	private int anInt5412 = 0;

	@OriginalMember(owner = "client!vm", name = "c", descriptor = "Lclient!il;")
	private Class86 aClass86_38;

	@OriginalMember(owner = "client!vm", name = "<init>", descriptor = "(Lclient!il;)V")
	public Class182(@OriginalArg(0) Class86 arg0) {
		this.aClass86_38 = arg0;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(B)Lclient!ak;")
	public Class1 method4507() {
		@Pc(32) Class1 local32;
		if (this.anInt5412 > 0 && this.aClass86_38.aClass1Array1[this.anInt5412 - 1] != this.aClass1_231) {
			local32 = this.aClass1_231;
			this.aClass1_231 = local32.aClass1_235;
			return local32;
		}
		do {
			if (this.anInt5412 >= this.aClass86_38.anInt2418) {
				return null;
			}
			local32 = this.aClass86_38.aClass1Array1[this.anInt5412++].aClass1_235;
		} while (this.aClass86_38.aClass1Array1[this.anInt5412 - 1] == local32);
		this.aClass1_231 = local32.aClass1_235;
		return local32;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(I)Lclient!ak;")
	public Class1 method4508() {
		this.anInt5412 = 0;
		return this.method4507();
	}
}
