import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!AGCGSOQI")
public class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!AGCGSOQI", name = "f", descriptor = "Lclient!AGCGSOQI;")
	public Class1_Sub1 aClass1_Sub1_36;

	@OriginalMember(owner = "client!AGCGSOQI", name = "g", descriptor = "Lclient!AGCGSOQI;")
	public Class1_Sub1 aClass1_Sub1_37;

	@OriginalMember(owner = "client!AGCGSOQI", name = "e", descriptor = "B")
	private byte aByte51 = 8;

	@OriginalMember(owner = "client!AGCGSOQI", name = "b", descriptor = "()V")
	public final void method545() {
		if (this.aClass1_Sub1_37 != null) {
			this.aClass1_Sub1_37.aClass1_Sub1_36 = this.aClass1_Sub1_36;
			this.aClass1_Sub1_36.aClass1_Sub1_37 = this.aClass1_Sub1_37;
			this.aClass1_Sub1_36 = null;
			this.aClass1_Sub1_37 = null;
		}
	}
}
