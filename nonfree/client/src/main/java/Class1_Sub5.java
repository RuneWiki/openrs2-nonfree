import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class Class1_Sub5 extends Class1 {

	@OriginalMember(owner = "client!jn", name = "m", descriptor = "Lclient!jn;")
	public Class1_Sub5 aClass1_Sub5_57;

	@OriginalMember(owner = "client!jn", name = "n", descriptor = "Lclient!jn;")
	public Class1_Sub5 aClass1_Sub5_58;

	@OriginalMember(owner = "client!jn", name = "p", descriptor = "J")
	public long aLong211;

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "(B)V")
	public final void method5305() {
		if (this.aClass1_Sub5_58 != null) {
			this.aClass1_Sub5_58.aClass1_Sub5_57 = this.aClass1_Sub5_57;
			this.aClass1_Sub5_57.aClass1_Sub5_58 = this.aClass1_Sub5_58;
			this.aClass1_Sub5_58 = null;
			this.aClass1_Sub5_57 = null;
		}
	}

	@OriginalMember(owner = "client!jn", name = "c", descriptor = "(B)Z")
	public final boolean method5307() {
		return this.aClass1_Sub5_58 != null;
	}
}
