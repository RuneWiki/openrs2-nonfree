import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!ld", name = "j", descriptor = "J")
	public long aLong394;

	@OriginalMember(owner = "client!ld", name = "k", descriptor = "Lclient!ld;")
	public Class1_Sub1 aClass1_Sub1_59;

	@OriginalMember(owner = "client!ld", name = "n", descriptor = "Lclient!ld;")
	public Class1_Sub1 aClass1_Sub1_60;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
	public final void method7528() {
		if (this.aClass1_Sub1_60 != null) {
			this.aClass1_Sub1_60.aClass1_Sub1_59 = this.aClass1_Sub1_59;
			this.aClass1_Sub1_59.aClass1_Sub1_60 = this.aClass1_Sub1_60;
			this.aClass1_Sub1_59 = null;
			this.aClass1_Sub1_60 = null;
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Z)Z")
	public final boolean method7529() {
		return this.aClass1_Sub1_60 != null;
	}
}
