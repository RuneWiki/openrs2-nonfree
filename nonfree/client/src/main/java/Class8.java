import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class Class8 {

	@OriginalMember(owner = "client!qe", name = "m", descriptor = "Lclient!qe;")
	public Class8 aClass8_127;

	@OriginalMember(owner = "client!qe", name = "o", descriptor = "Lclient!qe;")
	public Class8 aClass8_128;

	@OriginalMember(owner = "client!qe", name = "r", descriptor = "J")
	public long aLong102;

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)Z")
	public final boolean method2011() {
		return this.aClass8_127 != null;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V")
	public final void method2013() {
		if (this.aClass8_127 != null) {
			this.aClass8_127.aClass8_128 = this.aClass8_128;
			this.aClass8_128.aClass8_127 = this.aClass8_127;
			this.aClass8_127 = null;
			this.aClass8_128 = null;
		}
	}
}
