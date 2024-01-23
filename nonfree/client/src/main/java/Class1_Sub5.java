import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class Class1_Sub5 extends Class1 {

	@OriginalMember(owner = "client!ph", name = "l", descriptor = "Lclient!ph;")
	public Class1_Sub5 aClass1_Sub5_72;

	@OriginalMember(owner = "client!ph", name = "n", descriptor = "J")
	public long aLong211;

	@OriginalMember(owner = "client!ph", name = "o", descriptor = "Lclient!ph;")
	public Class1_Sub5 aClass1_Sub5_73;

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)V")
	public final void method4577() {
		if (this.aClass1_Sub5_72 != null) {
			this.aClass1_Sub5_72.aClass1_Sub5_73 = this.aClass1_Sub5_73;
			this.aClass1_Sub5_73.aClass1_Sub5_72 = this.aClass1_Sub5_72;
			this.aClass1_Sub5_73 = null;
			this.aClass1_Sub5_72 = null;
		}
	}

	@OriginalMember(owner = "client!ph", name = "e", descriptor = "(I)Z")
	public final boolean method4580() {
		return this.aClass1_Sub5_72 != null;
	}
}
