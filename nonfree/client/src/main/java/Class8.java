import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ZMCAQRHG")
public class Class8 {

	@OriginalMember(owner = "client!ZMCAQRHG", name = "b", descriptor = "J")
	public long aLong26;

	@OriginalMember(owner = "client!ZMCAQRHG", name = "c", descriptor = "Lclient!ZMCAQRHG;")
	public Class8 aClass8_41;

	@OriginalMember(owner = "client!ZMCAQRHG", name = "d", descriptor = "Lclient!ZMCAQRHG;")
	public Class8 aClass8_42;

	@OriginalMember(owner = "client!ZMCAQRHG", name = "a", descriptor = "I")
	private int anInt801 = 7;

	@OriginalMember(owner = "client!ZMCAQRHG", name = "a", descriptor = "()V")
	public final void method543() {
		if (this.aClass8_42 != null) {
			this.aClass8_42.aClass8_41 = this.aClass8_41;
			this.aClass8_41.aClass8_42 = this.aClass8_42;
			this.aClass8_41 = null;
			this.aClass8_42 = null;
		}
	}
}
