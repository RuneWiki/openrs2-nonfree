import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ZUOIJLRD")
public class Class10 {

	@OriginalMember(owner = "client!ZUOIJLRD", name = "a", descriptor = "J")
	public long aLong23;

	@OriginalMember(owner = "client!ZUOIJLRD", name = "b", descriptor = "Lclient!ZUOIJLRD;")
	public Class10 aClass10_41;

	@OriginalMember(owner = "client!ZUOIJLRD", name = "c", descriptor = "Lclient!ZUOIJLRD;")
	public Class10 aClass10_42;

	@OriginalMember(owner = "client!ZUOIJLRD", name = "a", descriptor = "()V")
	public final void method534() {
		if (this.aClass10_42 != null) {
			this.aClass10_42.aClass10_41 = this.aClass10_41;
			this.aClass10_41.aClass10_42 = this.aClass10_42;
			this.aClass10_41 = null;
			this.aClass10_42 = null;
		}
	}
}
