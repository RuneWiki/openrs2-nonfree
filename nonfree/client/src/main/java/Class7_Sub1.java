import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class Class7_Sub1 extends Class7 {

	@OriginalMember(owner = "client!tg", name = "t", descriptor = "Lclient!tg;")
	public Class7_Sub1 aClass7_Sub1_61;

	@OriginalMember(owner = "client!tg", name = "u", descriptor = "Lclient!tg;")
	public Class7_Sub1 aClass7_Sub1_62;

	@OriginalMember(owner = "client!tg", name = "y", descriptor = "J")
	public long aLong222;

	@OriginalMember(owner = "client!tg", name = "c", descriptor = "(I)Z")
	public final boolean method5505() {
		return this.aClass7_Sub1_62 != null;
	}

	@OriginalMember(owner = "client!tg", name = "d", descriptor = "(I)V")
	public final void method5509() {
		if (this.aClass7_Sub1_62 != null) {
			this.aClass7_Sub1_62.aClass7_Sub1_61 = this.aClass7_Sub1_61;
			this.aClass7_Sub1_61.aClass7_Sub1_62 = this.aClass7_Sub1_62;
			this.aClass7_Sub1_62 = null;
			this.aClass7_Sub1_61 = null;
		}
	}
}
