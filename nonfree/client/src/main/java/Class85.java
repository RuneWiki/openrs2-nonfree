import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dn")
public final class Class85 {

	@OriginalMember(owner = "client!dn", name = "f", descriptor = "Lclient!gj;")
	private Class3_Sub5 aClass3_Sub5_21;

	@OriginalMember(owner = "client!dn", name = "g", descriptor = "Lclient!nc;")
	private Class243 aClass243_2;

	@OriginalMember(owner = "client!dn", name = "<init>", descriptor = "()V")
	private Class85() {
	}

	@OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(Lclient!nc;)V")
	public Class85(@OriginalArg(0) Class243 arg0) {
		this.aClass243_2 = arg0;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(B)Lclient!gj;")
	public Class3_Sub5 method1735() {
		@Pc(8) Class3_Sub5 local8 = this.aClass243_2.aClass3_Sub5_44.aClass3_Sub5_66;
		if (local8 == this.aClass243_2.aClass3_Sub5_44) {
			this.aClass3_Sub5_21 = null;
			return null;
		} else {
			this.aClass3_Sub5_21 = local8.aClass3_Sub5_66;
			return local8;
		}
	}

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "(B)Lclient!gj;")
	public Class3_Sub5 method1736() {
		@Pc(6) Class3_Sub5 local6 = this.aClass3_Sub5_21;
		if (local6 == this.aClass243_2.aClass3_Sub5_44) {
			this.aClass3_Sub5_21 = null;
			return null;
		} else {
			this.aClass3_Sub5_21 = local6.aClass3_Sub5_66;
			return local6;
		}
	}
}
