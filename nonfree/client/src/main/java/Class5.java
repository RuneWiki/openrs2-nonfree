import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public class Class5 {

	@OriginalMember(owner = "client!qs", name = "c", descriptor = "Lclient!qs;")
	public Class5 aClass5_247;

	@OriginalMember(owner = "client!qs", name = "g", descriptor = "Lclient!qs;")
	public Class5 aClass5_248;

	@OriginalMember(owner = "client!qs", name = "h", descriptor = "J")
	public long aLong218;

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(I)Z")
	public final boolean method5802() {
		return this.aClass5_248 != null;
	}

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "(B)V")
	public final void method5803() {
		if (this.aClass5_248 != null) {
			this.aClass5_248.aClass5_247 = this.aClass5_247;
			this.aClass5_247.aClass5_248 = this.aClass5_248;
			this.aClass5_248 = null;
			this.aClass5_247 = null;
		}
	}
}
