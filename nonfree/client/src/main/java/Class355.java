import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tea")
public final class Class355 {

	@OriginalMember(owner = "client!tea", name = "d", descriptor = "Lclient!gw;")
	private Class147 aClass147_12;

	@OriginalMember(owner = "client!tea", name = "c", descriptor = "Lclient!rv;")
	private Class3_Sub7 aClass3_Sub7_61;

	@OriginalMember(owner = "client!tea", name = "<init>", descriptor = "()V")
	private Class355() {
	}

	@OriginalMember(owner = "client!tea", name = "<init>", descriptor = "(Lclient!gw;)V")
	public Class355(@OriginalArg(0) Class147 arg0) {
		this.aClass147_12 = arg0;
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(I)Lclient!rv;")
	public Class3_Sub7 method7921() {
		@Pc(6) Class3_Sub7 local6 = this.aClass3_Sub7_61;
		if (local6 == this.aClass147_12.aClass3_Sub7_28) {
			this.aClass3_Sub7_61 = null;
			return null;
		} else {
			this.aClass3_Sub7_61 = local6.aClass3_Sub7_67;
			return local6;
		}
	}

	@OriginalMember(owner = "client!tea", name = "b", descriptor = "(B)Lclient!rv;")
	public Class3_Sub7 method7923() {
		@Pc(16) Class3_Sub7 local16 = this.aClass147_12.aClass3_Sub7_28.aClass3_Sub7_67;
		if (this.aClass147_12.aClass3_Sub7_28 == local16) {
			this.aClass3_Sub7_61 = null;
			return null;
		} else {
			this.aClass3_Sub7_61 = local16.aClass3_Sub7_67;
			return local16;
		}
	}
}
