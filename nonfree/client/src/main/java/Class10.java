import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class Class10 {

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "Lclient!ng;")
	public Class10 aClass10_21;

	@OriginalMember(owner = "client!ng", name = "g", descriptor = "Lclient!ng;")
	public Class10 aClass10_22;

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(B)V")
	public final void method5452() {
		if (this.aClass10_22 != null) {
			this.aClass10_22.aClass10_21 = this.aClass10_21;
			this.aClass10_21.aClass10_22 = this.aClass10_22;
			this.aClass10_21 = null;
			this.aClass10_22 = null;
		}
	}
}
