import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class Class87_Sub1 extends Class87 {

	@OriginalMember(owner = "client!kb", name = "l", descriptor = "Lclient!kb;")
	public Class87_Sub1 aClass87_Sub1_5;

	@OriginalMember(owner = "client!kb", name = "q", descriptor = "Lclient!kb;")
	public Class87_Sub1 aClass87_Sub1_6;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V")
	public final void method4449() {
		if (this.aClass87_Sub1_5 != null) {
			this.aClass87_Sub1_5.aClass87_Sub1_6 = this.aClass87_Sub1_6;
			this.aClass87_Sub1_6.aClass87_Sub1_5 = this.aClass87_Sub1_5;
			this.aClass87_Sub1_6 = null;
			this.aClass87_Sub1_5 = null;
		}
	}
}
