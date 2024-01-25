import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public class Class28 {

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "Lclient!mq;")
	public Class28 aClass28_67;

	@OriginalMember(owner = "client!mq", name = "d", descriptor = "Lclient!mq;")
	public Class28 aClass28_68;

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "(Z)V")
	public final void method9022() {
		if (this.aClass28_67 != null) {
			this.aClass28_67.aClass28_68 = this.aClass28_68;
			this.aClass28_68.aClass28_67 = this.aClass28_67;
			this.aClass28_67 = null;
			this.aClass28_68 = null;
		}
	}
}
