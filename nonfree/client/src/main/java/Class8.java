import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class Class8 {

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "J")
	public long aLong203;

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "Lclient!vb;")
	public Class8 aClass8_228;

	@OriginalMember(owner = "client!vb", name = "m", descriptor = "Lclient!vb;")
	public Class8 aClass8_229;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)Z")
	public final boolean method4272() {
		return this.aClass8_228 != null;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Z)V")
	public final void method4273() {
		if (this.aClass8_228 != null) {
			this.aClass8_228.aClass8_229 = this.aClass8_229;
			this.aClass8_229.aClass8_228 = this.aClass8_228;
			this.aClass8_228 = null;
			this.aClass8_229 = null;
		}
	}
}
