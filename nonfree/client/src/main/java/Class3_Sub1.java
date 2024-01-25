import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class Class3_Sub1 extends Class3 {

	@OriginalMember(owner = "client!ab", name = "m", descriptor = "Lclient!ab;")
	public Class3_Sub1 aClass3_Sub1_5;

	@OriginalMember(owner = "client!ab", name = "n", descriptor = "Lclient!ab;")
	public Class3_Sub1 aClass3_Sub1_6;

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "(I)V")
	public final void method3298() {
		if (this.aClass3_Sub1_5 != null) {
			this.aClass3_Sub1_5.aClass3_Sub1_6 = this.aClass3_Sub1_6;
			this.aClass3_Sub1_6.aClass3_Sub1_5 = this.aClass3_Sub1_5;
			this.aClass3_Sub1_6 = null;
			this.aClass3_Sub1_5 = null;
		}
	}
}
