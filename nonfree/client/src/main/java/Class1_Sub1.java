import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!w", name = "f", descriptor = "Lclient!w;")
	public Class1_Sub1 aClass1_Sub1_38;

	@OriginalMember(owner = "client!w", name = "g", descriptor = "Lclient!w;")
	public Class1_Sub1 aClass1_Sub1_39;

	@OriginalMember(owner = "client!w", name = "b", descriptor = "()V")
	public final void method691() {
		if (this.aClass1_Sub1_39 != null) {
			this.aClass1_Sub1_39.aClass1_Sub1_38 = this.aClass1_Sub1_38;
			this.aClass1_Sub1_38.aClass1_Sub1_39 = this.aClass1_Sub1_39;
			this.aClass1_Sub1_38 = null;
			this.aClass1_Sub1_39 = null;
		}
	}
}
