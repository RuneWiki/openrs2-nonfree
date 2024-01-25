import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kba")
public class Class11 {

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "Lclient!kba;")
	public Class11 aClass11_67;

	@OriginalMember(owner = "client!kba", name = "e", descriptor = "Lclient!kba;")
	public Class11 aClass11_68;

	@OriginalMember(owner = "client!kba", name = "d", descriptor = "(I)V")
	public final void method8372() {
		if (this.aClass11_67 != null) {
			this.aClass11_67.aClass11_68 = this.aClass11_68;
			this.aClass11_68.aClass11_67 = this.aClass11_67;
			this.aClass11_68 = null;
			this.aClass11_67 = null;
		}
	}
}
