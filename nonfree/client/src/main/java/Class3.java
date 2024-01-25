import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qha")
public class Class3 {

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "Lclient!qha;")
	public Class3 aClass3_67;

	@OriginalMember(owner = "client!qha", name = "b", descriptor = "Lclient!qha;")
	public Class3 aClass3_68;

	@OriginalMember(owner = "client!qha", name = "d", descriptor = "(I)V")
	public final void method8898() {
		if (this.aClass3_68 != null) {
			this.aClass3_68.aClass3_67 = this.aClass3_67;
			this.aClass3_67.aClass3_68 = this.aClass3_68;
			this.aClass3_67 = null;
			this.aClass3_68 = null;
		}
	}
}
