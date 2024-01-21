import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!w", name = "f", descriptor = "Lclient!w;")
	public Class1_Sub1 aClass1_Sub1_36;

	@OriginalMember(owner = "client!w", name = "g", descriptor = "Lclient!w;")
	public Class1_Sub1 aClass1_Sub1_37;

	@OriginalMember(owner = "client!w", name = "e", descriptor = "I")
	private int anInt999 = 888;

	@OriginalMember(owner = "client!w", name = "b", descriptor = "()V")
	public final void method674() {
		if (this.aClass1_Sub1_37 != null) {
			this.aClass1_Sub1_37.aClass1_Sub1_36 = this.aClass1_Sub1_36;
			this.aClass1_Sub1_36.aClass1_Sub1_37 = this.aClass1_Sub1_37;
			this.aClass1_Sub1_36 = null;
			this.aClass1_Sub1_37 = null;
		}
	}
}
