import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class Class8_Sub1 extends Class8 {

	@OriginalMember(owner = "client!ag", name = "q", descriptor = "Lclient!ag;")
	public Class8_Sub1 aClass8_Sub1_68;

	@OriginalMember(owner = "client!ag", name = "r", descriptor = "Lclient!ag;")
	public Class8_Sub1 aClass8_Sub1_69;

	@OriginalMember(owner = "client!ag", name = "t", descriptor = "J")
	public long aLong204;

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(I)V")
	public final void method4277() {
		if (this.aClass8_Sub1_69 != null) {
			this.aClass8_Sub1_69.aClass8_Sub1_68 = this.aClass8_Sub1_68;
			this.aClass8_Sub1_68.aClass8_Sub1_69 = this.aClass8_Sub1_69;
			this.aClass8_Sub1_68 = null;
			this.aClass8_Sub1_69 = null;
		}
	}
}
