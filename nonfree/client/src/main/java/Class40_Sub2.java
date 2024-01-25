import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hw")
public class Class40_Sub2 extends Class40 {

	@OriginalMember(owner = "client!hw", name = "k", descriptor = "Lclient!hw;")
	public Class40_Sub2 aClass40_Sub2_7;

	@OriginalMember(owner = "client!hw", name = "m", descriptor = "Lclient!hw;")
	public Class40_Sub2 aClass40_Sub2_8;

	@OriginalMember(owner = "client!hw", name = "b", descriptor = "(B)V")
	public final void method3361() {
		if (this.aClass40_Sub2_8 != null) {
			this.aClass40_Sub2_8.aClass40_Sub2_7 = this.aClass40_Sub2_7;
			this.aClass40_Sub2_7.aClass40_Sub2_8 = this.aClass40_Sub2_8;
			this.aClass40_Sub2_7 = null;
			this.aClass40_Sub2_8 = null;
		}
	}
}
