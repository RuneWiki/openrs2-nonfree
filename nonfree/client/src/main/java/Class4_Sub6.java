import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jga")
public class Class4_Sub6 extends Class4 {

	@OriginalMember(owner = "client!jga", name = "u", descriptor = "J")
	public long aLong286;

	@OriginalMember(owner = "client!jga", name = "w", descriptor = "Lclient!jga;")
	public Class4_Sub6 aClass4_Sub6_61;

	@OriginalMember(owner = "client!jga", name = "y", descriptor = "Lclient!jga;")
	public Class4_Sub6 aClass4_Sub6_62;

	@OriginalMember(owner = "client!jga", name = "b", descriptor = "(I)V")
	public final void method7880() {
		if (this.aClass4_Sub6_61 != null) {
			this.aClass4_Sub6_61.aClass4_Sub6_62 = this.aClass4_Sub6_62;
			this.aClass4_Sub6_62.aClass4_Sub6_61 = this.aClass4_Sub6_61;
			this.aClass4_Sub6_62 = null;
			this.aClass4_Sub6_61 = null;
		}
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(B)Z")
	public final boolean method7881() {
		return this.aClass4_Sub6_61 != null;
	}
}
