import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!OZZFMONJ")
public class Class3_Sub3 extends Class3 {

	@OriginalMember(owner = "client!OZZFMONJ", name = "f", descriptor = "Lclient!OZZFMONJ;")
	public Class3_Sub3 aClass3_Sub3_36;

	@OriginalMember(owner = "client!OZZFMONJ", name = "g", descriptor = "Lclient!OZZFMONJ;")
	public Class3_Sub3 aClass3_Sub3_37;

	@OriginalMember(owner = "client!OZZFMONJ", name = "e", descriptor = "I")
	private int anInt811 = 697;

	@OriginalMember(owner = "client!OZZFMONJ", name = "b", descriptor = "()V")
	public final void method546() {
		if (this.aClass3_Sub3_37 != null) {
			this.aClass3_Sub3_37.aClass3_Sub3_36 = this.aClass3_Sub3_36;
			this.aClass3_Sub3_36.aClass3_Sub3_37 = this.aClass3_Sub3_37;
			this.aClass3_Sub3_36 = null;
			this.aClass3_Sub3_37 = null;
		}
	}
}
