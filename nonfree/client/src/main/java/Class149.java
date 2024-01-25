import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ma")
public final class Class149 {

	@OriginalMember(owner = "client!ma", name = "g", descriptor = "Lclient!pe;")
	private Class1 aClass1_168;

	@OriginalMember(owner = "client!ma", name = "j", descriptor = "Lclient!sr;")
	private Class227 aClass227_26;

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "()V")
	public Class149() {
	}

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(Lclient!sr;)V")
	public Class149(@OriginalArg(0) Class227 arg0) {
		this.aClass227_26 = arg0;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!sr;Z)V")
	public void method3483(@OriginalArg(0) Class227 arg0) {
		this.aClass227_26 = arg0;
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(B)Lclient!pe;")
	public Class1 method3484() {
		@Pc(6) Class1 local6 = this.aClass1_168;
		if (this.aClass227_26.aClass1_225 == local6) {
			this.aClass1_168 = null;
			return null;
		} else {
			this.aClass1_168 = local6.aClass1_261;
			return local6;
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)Lclient!pe;")
	public Class1 method3487() {
		@Pc(8) Class1 local8 = this.aClass227_26.aClass1_225.aClass1_261;
		if (this.aClass227_26.aClass1_225 == local8) {
			this.aClass1_168 = null;
			return null;
		} else {
			this.aClass1_168 = local8.aClass1_261;
			return local8;
		}
	}
}
