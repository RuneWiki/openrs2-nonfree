import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class Class4_Sub1 extends Class4 {

	@OriginalMember(owner = "client!ac", name = "o", descriptor = "J")
	public long aLong198;

	@OriginalMember(owner = "client!ac", name = "r", descriptor = "Lclient!ac;")
	public Class4_Sub1 aClass4_Sub1_55;

	@OriginalMember(owner = "client!ac", name = "s", descriptor = "Lclient!ac;")
	public Class4_Sub1 aClass4_Sub1_56;

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "(B)V")
	public final void method4662() {
		if (this.aClass4_Sub1_56 != null) {
			this.aClass4_Sub1_56.aClass4_Sub1_55 = this.aClass4_Sub1_55;
			this.aClass4_Sub1_55.aClass4_Sub1_56 = this.aClass4_Sub1_56;
			this.aClass4_Sub1_55 = null;
			this.aClass4_Sub1_56 = null;
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Z)Z")
	public final boolean method4666() {
		return this.aClass4_Sub1_56 != null;
	}
}
