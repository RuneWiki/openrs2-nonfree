import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class Class7_Sub4 extends Class7 {

	@OriginalMember(owner = "client!tm", name = "l", descriptor = "Lclient!tm;")
	public Class7_Sub4 aClass7_Sub4_57;

	@OriginalMember(owner = "client!tm", name = "m", descriptor = "Lclient!tm;")
	public Class7_Sub4 aClass7_Sub4_58;

	@OriginalMember(owner = "client!tm", name = "n", descriptor = "J")
	public long aLong225;

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(Z)Z")
	public final boolean method5659() {
		return this.aClass7_Sub4_58 != null;
	}

	@OriginalMember(owner = "client!tm", name = "d", descriptor = "(I)V")
	public final void method5661() {
		if (this.aClass7_Sub4_58 != null) {
			this.aClass7_Sub4_58.aClass7_Sub4_57 = this.aClass7_Sub4_57;
			this.aClass7_Sub4_57.aClass7_Sub4_58 = this.aClass7_Sub4_58;
			this.aClass7_Sub4_58 = null;
			this.aClass7_Sub4_57 = null;
		}
	}
}
