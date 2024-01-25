import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class Class12_Sub1 extends Class12 {

	@OriginalMember(owner = "client!aj", name = "g", descriptor = "Lclient!aj;")
	public Class12_Sub1 aClass12_Sub1_9;

	@OriginalMember(owner = "client!aj", name = "n", descriptor = "Lclient!aj;")
	public Class12_Sub1 aClass12_Sub1_10;

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V")
	public final void method5462() {
		if (this.aClass12_Sub1_10 != null) {
			this.aClass12_Sub1_10.aClass12_Sub1_9 = this.aClass12_Sub1_9;
			this.aClass12_Sub1_9.aClass12_Sub1_10 = this.aClass12_Sub1_10;
			this.aClass12_Sub1_9 = null;
			this.aClass12_Sub1_10 = null;
		}
	}
}
