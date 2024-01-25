import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public class Class3_Sub7 extends Class3 {

	@OriginalMember(owner = "client!ss", name = "m", descriptor = "J")
	public long aLong231;

	@OriginalMember(owner = "client!ss", name = "q", descriptor = "Lclient!ss;")
	public Class3_Sub7 aClass3_Sub7_53;

	@OriginalMember(owner = "client!ss", name = "u", descriptor = "Lclient!ss;")
	public Class3_Sub7 aClass3_Sub7_54;

	@OriginalMember(owner = "client!ss", name = "b", descriptor = "(I)Z")
	public final boolean method5672() {
		return this.aClass3_Sub7_53 != null;
	}

	@OriginalMember(owner = "client!ss", name = "c", descriptor = "(B)V")
	public final void method5673() {
		if (this.aClass3_Sub7_53 != null) {
			this.aClass3_Sub7_53.aClass3_Sub7_54 = this.aClass3_Sub7_54;
			this.aClass3_Sub7_54.aClass3_Sub7_53 = this.aClass3_Sub7_53;
			this.aClass3_Sub7_53 = null;
			this.aClass3_Sub7_54 = null;
		}
	}
}
