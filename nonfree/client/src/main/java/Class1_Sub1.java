import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!MUOTSYDS")
public class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!MUOTSYDS", name = "e", descriptor = "Lclient!MUOTSYDS;")
	public Class1_Sub1 aClass1_Sub1_35;

	@OriginalMember(owner = "client!MUOTSYDS", name = "f", descriptor = "Lclient!MUOTSYDS;")
	public Class1_Sub1 aClass1_Sub1_36;

	@OriginalMember(owner = "client!MUOTSYDS", name = "b", descriptor = "()V")
	public final void method511() {
		if (this.aClass1_Sub1_36 != null) {
			this.aClass1_Sub1_36.aClass1_Sub1_35 = this.aClass1_Sub1_35;
			this.aClass1_Sub1_35.aClass1_Sub1_36 = this.aClass1_Sub1_36;
			this.aClass1_Sub1_35 = null;
			this.aClass1_Sub1_36 = null;
		}
	}
}
