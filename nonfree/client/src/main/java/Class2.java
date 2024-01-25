import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public class Class2 {

	@OriginalMember(owner = "client!fq", name = "b", descriptor = "Lclient!fq;")
	public Class2 aClass2_23;

	@OriginalMember(owner = "client!fq", name = "e", descriptor = "Lclient!fq;")
	public Class2 aClass2_24;

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(I)V")
	public final void method5419() {
		if (this.aClass2_24 != null) {
			this.aClass2_24.aClass2_23 = this.aClass2_23;
			this.aClass2_23.aClass2_24 = this.aClass2_24;
			this.aClass2_23 = null;
			this.aClass2_24 = null;
		}
	}
}
