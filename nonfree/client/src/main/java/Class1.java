import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class Class1 {

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "Lclient!sj;")
	public Class1 aClass1_67;

	@OriginalMember(owner = "client!sj", name = "g", descriptor = "Lclient!sj;")
	public Class1 aClass1_68;

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "(B)V")
	public final void method8252() {
		if (this.aClass1_67 != null) {
			this.aClass1_67.aClass1_68 = this.aClass1_68;
			this.aClass1_68.aClass1_67 = this.aClass1_67;
			this.aClass1_67 = null;
			this.aClass1_68 = null;
		}
	}
}
