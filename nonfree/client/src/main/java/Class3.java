import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!CDEGFOQA")
public class Class3 {

	@OriginalMember(owner = "client!CDEGFOQA", name = "a", descriptor = "J")
	public long aLong25;

	@OriginalMember(owner = "client!CDEGFOQA", name = "b", descriptor = "Lclient!CDEGFOQA;")
	public Class3 aClass3_41;

	@OriginalMember(owner = "client!CDEGFOQA", name = "c", descriptor = "Lclient!CDEGFOQA;")
	public Class3 aClass3_42;

	@OriginalMember(owner = "client!CDEGFOQA", name = "a", descriptor = "()V")
	public final void method503() {
		if (this.aClass3_42 != null) {
			this.aClass3_42.aClass3_41 = this.aClass3_41;
			this.aClass3_41.aClass3_42 = this.aClass3_42;
			this.aClass3_41 = null;
			this.aClass3_42 = null;
		}
	}
}
