import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class Class22_Sub4 extends Class22 {

	@OriginalMember(owner = "client!ok", name = "j", descriptor = "Lclient!ok;")
	public Class22_Sub4 aClass22_Sub4_5;

	@OriginalMember(owner = "client!ok", name = "p", descriptor = "Lclient!ok;")
	public Class22_Sub4 aClass22_Sub4_6;

	@OriginalMember(owner = "client!ok", name = "c", descriptor = "(I)V")
	public final void method3658() {
		if (this.aClass22_Sub4_5 != null) {
			this.aClass22_Sub4_5.aClass22_Sub4_6 = this.aClass22_Sub4_6;
			this.aClass22_Sub4_6.aClass22_Sub4_5 = this.aClass22_Sub4_5;
			this.aClass22_Sub4_5 = null;
			this.aClass22_Sub4_6 = null;
		}
	}
}
