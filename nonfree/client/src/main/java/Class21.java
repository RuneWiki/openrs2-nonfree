import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class Class21 {

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "Lclient!ce;")
	public Class21 aClass21_11;

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "Lclient!ce;")
	public Class21 aClass21_12;

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(B)V")
	public final void method4639() {
		if (this.aClass21_12 != null) {
			this.aClass21_12.aClass21_11 = this.aClass21_11;
			this.aClass21_11.aClass21_12 = this.aClass21_12;
			this.aClass21_12 = null;
			this.aClass21_11 = null;
		}
	}
}
