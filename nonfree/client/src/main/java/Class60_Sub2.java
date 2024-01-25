import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public class Class60_Sub2 extends Class60 {

	@OriginalMember(owner = "client!es", name = "k", descriptor = "Lclient!es;")
	public Class60_Sub2 aClass60_Sub2_9;

	@OriginalMember(owner = "client!es", name = "m", descriptor = "Lclient!es;")
	public Class60_Sub2 aClass60_Sub2_10;

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(B)V")
	public final void method7096() {
		if (this.aClass60_Sub2_9 != null) {
			this.aClass60_Sub2_9.aClass60_Sub2_10 = this.aClass60_Sub2_10;
			this.aClass60_Sub2_10.aClass60_Sub2_9 = this.aClass60_Sub2_9;
			this.aClass60_Sub2_10 = null;
			this.aClass60_Sub2_9 = null;
		}
	}
}
