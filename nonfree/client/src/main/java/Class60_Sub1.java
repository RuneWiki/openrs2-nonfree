import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gca")
public class Class60_Sub1 extends Class60 {

	@OriginalMember(owner = "client!gca", name = "k", descriptor = "Lclient!gca;")
	public Class60_Sub1 aClass60_Sub1_9;

	@OriginalMember(owner = "client!gca", name = "o", descriptor = "Lclient!gca;")
	public Class60_Sub1 aClass60_Sub1_10;

	@OriginalMember(owner = "client!gca", name = "b", descriptor = "(I)V")
	public final void method3818() {
		if (this.aClass60_Sub1_9 != null) {
			this.aClass60_Sub1_9.aClass60_Sub1_10 = this.aClass60_Sub1_10;
			this.aClass60_Sub1_10.aClass60_Sub1_9 = this.aClass60_Sub1_9;
			this.aClass60_Sub1_9 = null;
			this.aClass60_Sub1_10 = null;
		}
	}
}
