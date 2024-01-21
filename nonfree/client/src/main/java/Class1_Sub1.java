import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!IOXDUYYH")
public class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!IOXDUYYH", name = "f", descriptor = "Lclient!IOXDUYYH;")
	public Class1_Sub1 aClass1_Sub1_36;

	@OriginalMember(owner = "client!IOXDUYYH", name = "g", descriptor = "Lclient!IOXDUYYH;")
	public Class1_Sub1 aClass1_Sub1_37;

	@OriginalMember(owner = "client!IOXDUYYH", name = "e", descriptor = "Z")
	private boolean aBoolean185 = true;

	@OriginalMember(owner = "client!IOXDUYYH", name = "b", descriptor = "()V")
	public final void method553() {
		if (this.aClass1_Sub1_37 != null) {
			this.aClass1_Sub1_37.aClass1_Sub1_36 = this.aClass1_Sub1_36;
			this.aClass1_Sub1_36.aClass1_Sub1_37 = this.aClass1_Sub1_37;
			this.aClass1_Sub1_36 = null;
			this.aClass1_Sub1_37 = null;
		}
	}
}
