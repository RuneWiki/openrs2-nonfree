import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vda")
public class Class4_Sub5 extends Class4 {

	@OriginalMember(owner = "client!vda", name = "k", descriptor = "Lclient!vda;")
	public Class4_Sub5 aClass4_Sub5_61;

	@OriginalMember(owner = "client!vda", name = "l", descriptor = "Lclient!vda;")
	public Class4_Sub5 aClass4_Sub5_62;

	@OriginalMember(owner = "client!vda", name = "o", descriptor = "J")
	public long aLong257;

	@OriginalMember(owner = "client!vda", name = "c", descriptor = "(B)Z")
	public final boolean method8013() {
		return this.aClass4_Sub5_61 != null;
	}

	@OriginalMember(owner = "client!vda", name = "b", descriptor = "(I)V")
	public final void method8015() {
		if (this.aClass4_Sub5_61 != null) {
			this.aClass4_Sub5_61.aClass4_Sub5_62 = this.aClass4_Sub5_62;
			this.aClass4_Sub5_62.aClass4_Sub5_61 = this.aClass4_Sub5_61;
			this.aClass4_Sub5_62 = null;
			this.aClass4_Sub5_61 = null;
		}
	}
}
