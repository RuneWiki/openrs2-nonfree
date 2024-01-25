import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class Class41_Sub4 extends Class41 {

	@OriginalMember(owner = "client!sa", name = "o", descriptor = "Lclient!sa;")
	public Class41_Sub4 aClass41_Sub4_7;

	@OriginalMember(owner = "client!sa", name = "s", descriptor = "Lclient!sa;")
	public Class41_Sub4 aClass41_Sub4_8;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)V")
	public final void method6500() {
		if (this.aClass41_Sub4_8 != null) {
			this.aClass41_Sub4_8.aClass41_Sub4_7 = this.aClass41_Sub4_7;
			this.aClass41_Sub4_7.aClass41_Sub4_8 = this.aClass41_Sub4_8;
			this.aClass41_Sub4_8 = null;
			this.aClass41_Sub4_7 = null;
		}
	}
}
