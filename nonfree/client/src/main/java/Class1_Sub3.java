import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public class Class1_Sub3 extends Class1 {

	@OriginalMember(owner = "client!uq", name = "l", descriptor = "Lclient!uq;")
	public Class1_Sub3 aClass1_Sub3_61;

	@OriginalMember(owner = "client!uq", name = "n", descriptor = "J")
	public long aLong420;

	@OriginalMember(owner = "client!uq", name = "q", descriptor = "Lclient!uq;")
	public Class1_Sub3 aClass1_Sub3_62;

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(B)V")
	public final void method7811() {
		if (this.aClass1_Sub3_61 != null) {
			this.aClass1_Sub3_61.aClass1_Sub3_62 = this.aClass1_Sub3_62;
			this.aClass1_Sub3_62.aClass1_Sub3_61 = this.aClass1_Sub3_61;
			this.aClass1_Sub3_62 = null;
			this.aClass1_Sub3_61 = null;
		}
	}

	@OriginalMember(owner = "client!uq", name = "c", descriptor = "(I)Z")
	public final boolean method7813() {
		return this.aClass1_Sub3_61 != null;
	}
}
