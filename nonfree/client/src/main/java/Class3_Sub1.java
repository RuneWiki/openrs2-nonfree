import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class Class3_Sub1 extends Class3 {

	@OriginalMember(owner = "client!bh", name = "w", descriptor = "Lclient!bh;")
	public Class3_Sub1 aClass3_Sub1_69;

	@OriginalMember(owner = "client!bh", name = "E", descriptor = "Lclient!bh;")
	public Class3_Sub1 aClass3_Sub1_70;

	@OriginalMember(owner = "client!bh", name = "d", descriptor = "(I)V")
	public final void method2681() {
		if (this.aClass3_Sub1_69 != null) {
			this.aClass3_Sub1_69.aClass3_Sub1_70 = this.aClass3_Sub1_70;
			this.aClass3_Sub1_70.aClass3_Sub1_69 = this.aClass3_Sub1_69;
			this.aClass3_Sub1_69 = null;
			this.aClass3_Sub1_70 = null;
		}
	}
}
