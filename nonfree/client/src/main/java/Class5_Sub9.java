import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public class Class5_Sub9 extends Class5 {

	@OriginalMember(owner = "client!qp", name = "k", descriptor = "Lclient!qp;")
	public Class5_Sub9 aClass5_Sub9_60;

	@OriginalMember(owner = "client!qp", name = "m", descriptor = "Lclient!qp;")
	public Class5_Sub9 aClass5_Sub9_61;

	@OriginalMember(owner = "client!qp", name = "n", descriptor = "J")
	public long aLong208;

	@OriginalMember(owner = "client!qp", name = "b", descriptor = "(I)V")
	public final void method5494() {
		if (this.aClass5_Sub9_61 != null) {
			this.aClass5_Sub9_61.aClass5_Sub9_60 = this.aClass5_Sub9_60;
			this.aClass5_Sub9_60.aClass5_Sub9_61 = this.aClass5_Sub9_61;
			this.aClass5_Sub9_60 = null;
			this.aClass5_Sub9_61 = null;
		}
	}

	@OriginalMember(owner = "client!qp", name = "c", descriptor = "(B)Z")
	public final boolean method5495() {
		return this.aClass5_Sub9_61 != null;
	}
}
