import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class Class21 {

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "Lclient!fh;")
	public Class21 aClass21_67;

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "Lclient!fh;")
	public Class21 aClass21_68;

	@OriginalMember(owner = "client!fh", name = "e", descriptor = "(I)V")
	public final void method8246() {
		if (this.aClass21_68 != null) {
			this.aClass21_68.aClass21_67 = this.aClass21_67;
			this.aClass21_67.aClass21_68 = this.aClass21_68;
			this.aClass21_67 = null;
			this.aClass21_68 = null;
		}
	}
}
