import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class Class4 {

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "Lclient!vj;")
	public Class4 aClass4_67;

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "Lclient!vj;")
	public Class4 aClass4_68;

	@OriginalMember(owner = "client!vj", name = "c", descriptor = "(B)V")
	public final void method9416() {
		if (this.aClass4_68 != null) {
			this.aClass4_68.aClass4_67 = this.aClass4_67;
			this.aClass4_67.aClass4_68 = this.aClass4_68;
			this.aClass4_68 = null;
			this.aClass4_67 = null;
		}
	}
}
