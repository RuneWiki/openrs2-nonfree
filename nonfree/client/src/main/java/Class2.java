import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public class Class2 {

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "Lclient!nr;")
	public Class2 aClass2_251;

	@OriginalMember(owner = "client!nr", name = "f", descriptor = "Lclient!nr;")
	public Class2 aClass2_252;

	@OriginalMember(owner = "client!nr", name = "i", descriptor = "J")
	public long aLong219;

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(I)Z")
	public final boolean method5722() {
		return this.aClass2_252 != null;
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(B)V")
	public final void method5723() {
		if (this.aClass2_252 != null) {
			this.aClass2_252.aClass2_251 = this.aClass2_251;
			this.aClass2_251.aClass2_252 = this.aClass2_252;
			this.aClass2_251 = null;
			this.aClass2_252 = null;
		}
	}
}
