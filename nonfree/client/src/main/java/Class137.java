import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!m")
public final class Class137 {

	@OriginalMember(owner = "client!m", name = "i", descriptor = "Lclient!fb;")
	private Class1 aClass1_118;

	@OriginalMember(owner = "client!m", name = "k", descriptor = "Lclient!ar;")
	private Class14 aClass14_14;

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "()V")
	public Class137() {
	}

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Lclient!ar;)V")
	public Class137(@OriginalArg(0) Class14 arg0) {
		this.aClass14_14 = arg0;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(B)Lclient!fb;")
	public Class1 method3157() {
		@Pc(14) Class1 local14 = this.aClass14_14.aClass1_17.aClass1_247;
		if (this.aClass14_14.aClass1_17 == local14) {
			this.aClass1_118 = null;
			return null;
		} else {
			this.aClass1_118 = local14.aClass1_247;
			return local14;
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Lclient!ar;I)V")
	public void method3160(@OriginalArg(0) Class14 arg0) {
		this.aClass14_14 = arg0;
	}

	@OriginalMember(owner = "client!m", name = "c", descriptor = "(B)Lclient!fb;")
	public Class1 method3162() {
		@Pc(14) Class1 local14 = this.aClass1_118;
		if (local14 == this.aClass14_14.aClass1_17) {
			this.aClass1_118 = null;
			return null;
		} else {
			this.aClass1_118 = local14.aClass1_247;
			return local14;
		}
	}
}
