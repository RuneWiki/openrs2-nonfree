import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class Class6_Sub2 extends Class6 {

	@OriginalMember(owner = "client!m", name = "k", descriptor = "Lclient!m;")
	public Class6_Sub2 aClass6_Sub2_61;

	@OriginalMember(owner = "client!m", name = "l", descriptor = "Lclient!m;")
	public Class6_Sub2 aClass6_Sub2_62;

	@OriginalMember(owner = "client!m", name = "r", descriptor = "J")
	public long aLong219;

	@OriginalMember(owner = "client!m", name = "c", descriptor = "(I)V")
	public final void method5761() {
		if (this.aClass6_Sub2_62 != null) {
			this.aClass6_Sub2_62.aClass6_Sub2_61 = this.aClass6_Sub2_61;
			this.aClass6_Sub2_61.aClass6_Sub2_62 = this.aClass6_Sub2_62;
			this.aClass6_Sub2_61 = null;
			this.aClass6_Sub2_62 = null;
		}
	}

	@OriginalMember(owner = "client!m", name = "d", descriptor = "(I)Z")
	public final boolean method5765() {
		return this.aClass6_Sub2_62 != null;
	}
}
