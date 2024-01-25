import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class Class3_Sub5 extends Class3 {

	@OriginalMember(owner = "client!gj", name = "m", descriptor = "J")
	public long aLong312;

	@OriginalMember(owner = "client!gj", name = "o", descriptor = "Lclient!gj;")
	public Class3_Sub5 aClass3_Sub5_66;

	@OriginalMember(owner = "client!gj", name = "q", descriptor = "Lclient!gj;")
	public Class3_Sub5 aClass3_Sub5_67;

	@OriginalMember(owner = "client!gj", name = "c", descriptor = "(B)Z")
	public final boolean method9013() {
		return this.aClass3_Sub5_67 != null;
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(I)V")
	public final void method9014() {
		if (this.aClass3_Sub5_67 != null) {
			this.aClass3_Sub5_67.aClass3_Sub5_66 = this.aClass3_Sub5_66;
			this.aClass3_Sub5_66.aClass3_Sub5_67 = this.aClass3_Sub5_67;
			this.aClass3_Sub5_66 = null;
			this.aClass3_Sub5_67 = null;
		}
	}
}
