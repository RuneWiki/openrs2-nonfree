import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dga")
public class Class4_Sub4 extends Class4 {

	@OriginalMember(owner = "client!dga", name = "q", descriptor = "Lclient!dga;")
	public Class4_Sub4 aClass4_Sub4_9;

	@OriginalMember(owner = "client!dga", name = "o", descriptor = "Lclient!dga;")
	public Class4_Sub4 aClass4_Sub4_10;

	@OriginalMember(owner = "client!dga", name = "d", descriptor = "(I)V")
	public final void method8320() {
		if (this.aClass4_Sub4_10 != null) {
			this.aClass4_Sub4_10.aClass4_Sub4_9 = this.aClass4_Sub4_9;
			this.aClass4_Sub4_9.aClass4_Sub4_10 = this.aClass4_Sub4_10;
			this.aClass4_Sub4_10 = null;
			this.aClass4_Sub4_9 = null;
		}
	}
}
