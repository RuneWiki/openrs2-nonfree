import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ig")
public final class Class89 {

	@OriginalMember(owner = "client!ig", name = "q", descriptor = "Lclient!sq;")
	private Class1_Sub4 aClass1_Sub4_37;

	@OriginalMember(owner = "client!ig", name = "p", descriptor = "Lclient!sq;")
	private final Class1_Sub4 aClass1_Sub4_36 = new Class1_Sub4();

	@OriginalMember(owner = "client!ig", name = "<init>", descriptor = "()V")
	public Class89() {
		this.aClass1_Sub4_36.aClass1_Sub4_61 = this.aClass1_Sub4_36;
		this.aClass1_Sub4_36.aClass1_Sub4_62 = this.aClass1_Sub4_36;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)Lclient!sq;")
	public Class1_Sub4 method2718() {
		@Pc(12) Class1_Sub4 local12 = this.aClass1_Sub4_36.aClass1_Sub4_61;
		if (this.aClass1_Sub4_36 == local12) {
			this.aClass1_Sub4_37 = null;
			return null;
		} else {
			this.aClass1_Sub4_37 = local12.aClass1_Sub4_61;
			return local12;
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lclient!sq;I)V")
	public void method2720(@OriginalArg(0) Class1_Sub4 arg0) {
		if (arg0.aClass1_Sub4_62 != null) {
			arg0.method5714();
		}
		arg0.aClass1_Sub4_61 = this.aClass1_Sub4_36;
		arg0.aClass1_Sub4_62 = this.aClass1_Sub4_36.aClass1_Sub4_62;
		arg0.aClass1_Sub4_62.aClass1_Sub4_61 = arg0;
		arg0.aClass1_Sub4_61.aClass1_Sub4_62 = arg0;
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(I)I")
	public int method2721() {
		@Pc(14) int local14 = 0;
		for (@Pc(18) Class1_Sub4 local18 = this.aClass1_Sub4_36.aClass1_Sub4_61; local18 != this.aClass1_Sub4_36; local18 = local18.aClass1_Sub4_61) {
			local14++;
		}
		return local14;
	}

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "(I)Lclient!sq;")
	public Class1_Sub4 method2722() {
		@Pc(11) Class1_Sub4 local11 = this.aClass1_Sub4_36.aClass1_Sub4_61;
		if (local11 == this.aClass1_Sub4_36) {
			return null;
		} else {
			local11.method5714();
			return local11;
		}
	}

	@OriginalMember(owner = "client!ig", name = "d", descriptor = "(I)V")
	public void method2723() {
		while (true) {
			@Pc(9) Class1_Sub4 local9 = this.aClass1_Sub4_36.aClass1_Sub4_61;
			if (local9 == this.aClass1_Sub4_36) {
				this.aClass1_Sub4_37 = null;
				return;
			}
			local9.method5714();
		}
	}

	@OriginalMember(owner = "client!ig", name = "f", descriptor = "(I)Lclient!sq;")
	public Class1_Sub4 method2726() {
		@Pc(11) Class1_Sub4 local11 = this.aClass1_Sub4_37;
		if (local11 == this.aClass1_Sub4_36) {
			this.aClass1_Sub4_37 = null;
			return null;
		} else {
			this.aClass1_Sub4_37 = local11.aClass1_Sub4_61;
			return local11;
		}
	}
}
