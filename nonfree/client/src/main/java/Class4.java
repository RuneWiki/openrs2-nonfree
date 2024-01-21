import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class Class4 {

	@OriginalMember(owner = "client!wd", name = "g", descriptor = "Lclient!wd;")
	public Class4 aClass4_215;

	@OriginalMember(owner = "client!wd", name = "n", descriptor = "Lclient!wd;")
	public Class4 aClass4_216;

	@OriginalMember(owner = "client!wd", name = "o", descriptor = "J")
	public long aLong148;

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "(I)V")
	public final void method3173() {
		if (this.aClass4_215 != null) {
			this.aClass4_215.aClass4_216 = this.aClass4_216;
			this.aClass4_216.aClass4_215 = this.aClass4_215;
			this.aClass4_215 = null;
			this.aClass4_216 = null;
		}
	}

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "(B)Z")
	public final boolean method3174() {
		return this.aClass4_215 != null;
	}
}
