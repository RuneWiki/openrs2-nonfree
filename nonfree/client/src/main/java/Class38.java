import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class Class38 {

	@OriginalMember(owner = "client!fi", name = "d", descriptor = "Lclient!fi;")
	public Class38 aClass38_23;

	@OriginalMember(owner = "client!fi", name = "g", descriptor = "Lclient!fi;")
	public Class38 aClass38_24;

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)V")
	public final void method5069() {
		if (this.aClass38_23 != null) {
			this.aClass38_23.aClass38_24 = this.aClass38_24;
			this.aClass38_24.aClass38_23 = this.aClass38_23;
			this.aClass38_23 = null;
			this.aClass38_24 = null;
		}
	}
}
