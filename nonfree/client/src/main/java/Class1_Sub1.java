import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!IYPTVTAD")
public class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!IYPTVTAD", name = "f", descriptor = "Lclient!IYPTVTAD;")
	public Class1_Sub1 aClass1_Sub1_36;

	@OriginalMember(owner = "client!IYPTVTAD", name = "g", descriptor = "Lclient!IYPTVTAD;")
	public Class1_Sub1 aClass1_Sub1_37;

	@OriginalMember(owner = "client!IYPTVTAD", name = "e", descriptor = "Z")
	private boolean aBoolean200 = false;

	@OriginalMember(owner = "client!IYPTVTAD", name = "b", descriptor = "()V")
	public final void method545() {
		if (this.aClass1_Sub1_37 != null) {
			this.aClass1_Sub1_37.aClass1_Sub1_36 = this.aClass1_Sub1_36;
			this.aClass1_Sub1_36.aClass1_Sub1_37 = this.aClass1_Sub1_37;
			this.aClass1_Sub1_36 = null;
			this.aClass1_Sub1_37 = null;
		}
	}
}
