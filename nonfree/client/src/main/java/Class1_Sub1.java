import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!APQXVAYL")
public class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!APQXVAYL", name = "e", descriptor = "Lclient!APQXVAYL;")
	public Class1_Sub1 aClass1_Sub1_36;

	@OriginalMember(owner = "client!APQXVAYL", name = "f", descriptor = "Lclient!APQXVAYL;")
	public Class1_Sub1 aClass1_Sub1_37;

	@OriginalMember(owner = "client!APQXVAYL", name = "b", descriptor = "()V")
	public final void method552() {
		if (this.aClass1_Sub1_37 != null) {
			this.aClass1_Sub1_37.aClass1_Sub1_36 = this.aClass1_Sub1_36;
			this.aClass1_Sub1_36.aClass1_Sub1_37 = this.aClass1_Sub1_37;
			this.aClass1_Sub1_36 = null;
			this.aClass1_Sub1_37 = null;
		}
	}
}
