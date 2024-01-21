import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!IVMCUDWL")
public class Class8_Sub1 extends Class8 {

	@OriginalMember(owner = "client!IVMCUDWL", name = "g", descriptor = "Lclient!IVMCUDWL;")
	public Class8_Sub1 aClass8_Sub1_36;

	@OriginalMember(owner = "client!IVMCUDWL", name = "h", descriptor = "Lclient!IVMCUDWL;")
	public Class8_Sub1 aClass8_Sub1_37;

	@OriginalMember(owner = "client!IVMCUDWL", name = "f", descriptor = "I")
	private int anInt802 = -521;

	@OriginalMember(owner = "client!IVMCUDWL", name = "b", descriptor = "()V")
	public final void method544() {
		if (this.aClass8_Sub1_37 != null) {
			this.aClass8_Sub1_37.aClass8_Sub1_36 = this.aClass8_Sub1_36;
			this.aClass8_Sub1_36.aClass8_Sub1_37 = this.aClass8_Sub1_37;
			this.aClass8_Sub1_36 = null;
			this.aClass8_Sub1_37 = null;
		}
	}
}
