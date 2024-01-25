import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class Class10_Sub1 extends Class10 {

	@OriginalMember(owner = "client!ol", name = "m", descriptor = "Lclient!ol;")
	public Class10_Sub1 aClass10_Sub1_56;

	@OriginalMember(owner = "client!ol", name = "o", descriptor = "J")
	public long aLong254;

	@OriginalMember(owner = "client!ol", name = "p", descriptor = "Lclient!ol;")
	public Class10_Sub1 aClass10_Sub1_57;

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "(B)Z")
	public final boolean method5894() {
		return this.aClass10_Sub1_57 != null;
	}

	@OriginalMember(owner = "client!ol", name = "d", descriptor = "(B)V")
	public final void method5897() {
		if (this.aClass10_Sub1_57 != null) {
			this.aClass10_Sub1_57.aClass10_Sub1_56 = this.aClass10_Sub1_56;
			this.aClass10_Sub1_56.aClass10_Sub1_57 = this.aClass10_Sub1_57;
			this.aClass10_Sub1_57 = null;
			this.aClass10_Sub1_56 = null;
		}
	}
}
