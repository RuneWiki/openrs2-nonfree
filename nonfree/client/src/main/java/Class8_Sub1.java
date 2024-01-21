import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!KTAHMSMP")
public class Class8_Sub1 extends Class8 {

	@OriginalMember(owner = "client!KTAHMSMP", name = "f", descriptor = "Lclient!KTAHMSMP;")
	public Class8_Sub1 aClass8_Sub1_36;

	@OriginalMember(owner = "client!KTAHMSMP", name = "g", descriptor = "Lclient!KTAHMSMP;")
	public Class8_Sub1 aClass8_Sub1_37;

	@OriginalMember(owner = "client!KTAHMSMP", name = "e", descriptor = "I")
	private int anInt786 = -5381;

	@OriginalMember(owner = "client!KTAHMSMP", name = "b", descriptor = "()V")
	public final void method555() {
		if (this.aClass8_Sub1_37 != null) {
			this.aClass8_Sub1_37.aClass8_Sub1_36 = this.aClass8_Sub1_36;
			this.aClass8_Sub1_36.aClass8_Sub1_37 = this.aClass8_Sub1_37;
			this.aClass8_Sub1_36 = null;
			this.aClass8_Sub1_37 = null;
		}
	}
}
