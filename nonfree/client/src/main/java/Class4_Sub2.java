import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class Class4_Sub2 extends Class4 {

	@OriginalMember(owner = "client!q", name = "m", descriptor = "Lclient!q;")
	public Class4_Sub2 aClass4_Sub2_68;

	@OriginalMember(owner = "client!q", name = "o", descriptor = "Lclient!q;")
	public Class4_Sub2 aClass4_Sub2_69;

	@OriginalMember(owner = "client!q", name = "p", descriptor = "J")
	public long aLong201;

	@OriginalMember(owner = "client!q", name = "c", descriptor = "(I)V")
	public final void method4396() {
		if (this.aClass4_Sub2_68 != null) {
			this.aClass4_Sub2_68.aClass4_Sub2_69 = this.aClass4_Sub2_69;
			this.aClass4_Sub2_69.aClass4_Sub2_68 = this.aClass4_Sub2_68;
			this.aClass4_Sub2_69 = null;
			this.aClass4_Sub2_68 = null;
		}
	}
}
