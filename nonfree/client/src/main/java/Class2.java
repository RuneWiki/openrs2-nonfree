import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!PXORWIXO")
public class Class2 {

	@OriginalMember(owner = "client!PXORWIXO", name = "a", descriptor = "J")
	public long aLong26;

	@OriginalMember(owner = "client!PXORWIXO", name = "b", descriptor = "Lclient!PXORWIXO;")
	public Class2 aClass2_41;

	@OriginalMember(owner = "client!PXORWIXO", name = "c", descriptor = "Lclient!PXORWIXO;")
	public Class2 aClass2_42;

	@OriginalMember(owner = "client!PXORWIXO", name = "a", descriptor = "()V")
	public final void method573() {
		if (this.aClass2_42 != null) {
			this.aClass2_42.aClass2_41 = this.aClass2_41;
			this.aClass2_41.aClass2_42 = this.aClass2_42;
			this.aClass2_41 = null;
			this.aClass2_42 = null;
		}
	}
}
