import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class Class2 {

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "Lclient!qf;")
	public Class2 aClass2_249;

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "J")
	public long aLong213;

	@OriginalMember(owner = "client!qf", name = "i", descriptor = "Lclient!qf;")
	public Class2 aClass2_250;

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(B)V")
	public final void method5945() {
		if (this.aClass2_249 != null) {
			this.aClass2_249.aClass2_250 = this.aClass2_250;
			this.aClass2_250.aClass2_249 = this.aClass2_249;
			this.aClass2_249 = null;
			this.aClass2_250 = null;
		}
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(B)Z")
	public final boolean method5949() {
		return this.aClass2_249 != null;
	}
}
