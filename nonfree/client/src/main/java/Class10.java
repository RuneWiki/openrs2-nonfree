import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class Class10 {

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "Lclient!dc;")
	public Class10 aClass10_93;

	@OriginalMember(owner = "client!dc", name = "f", descriptor = "J")
	public long aLong81;

	@OriginalMember(owner = "client!dc", name = "h", descriptor = "Lclient!dc;")
	public Class10 aClass10_94;

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(B)V")
	public final void method1654() {
		if (this.aClass10_93 != null) {
			this.aClass10_93.aClass10_94 = this.aClass10_94;
			this.aClass10_94.aClass10_93 = this.aClass10_93;
			this.aClass10_94 = null;
			this.aClass10_93 = null;
		}
	}
}
