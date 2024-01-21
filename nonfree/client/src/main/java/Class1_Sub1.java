import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!YCAZQYJA")
public class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!YCAZQYJA", name = "f", descriptor = "Lclient!YCAZQYJA;")
	public Class1_Sub1 aClass1_Sub1_36;

	@OriginalMember(owner = "client!YCAZQYJA", name = "g", descriptor = "Lclient!YCAZQYJA;")
	public Class1_Sub1 aClass1_Sub1_37;

	@OriginalMember(owner = "client!YCAZQYJA", name = "e", descriptor = "I")
	private int anInt713 = 11419;

	@OriginalMember(owner = "client!YCAZQYJA", name = "b", descriptor = "()V")
	public final void method502() {
		if (this.aClass1_Sub1_37 != null) {
			this.aClass1_Sub1_37.aClass1_Sub1_36 = this.aClass1_Sub1_36;
			this.aClass1_Sub1_36.aClass1_Sub1_37 = this.aClass1_Sub1_37;
			this.aClass1_Sub1_36 = null;
			this.aClass1_Sub1_37 = null;
		}
	}
}
