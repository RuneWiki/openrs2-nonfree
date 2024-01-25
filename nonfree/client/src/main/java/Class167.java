import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jg")
public final class Class167 {

	@OriginalMember(owner = "client!jg", name = "d", descriptor = "Lclient!dba;")
	private Class3 aClass3_177;

	@OriginalMember(owner = "client!jg", name = "h", descriptor = "Lclient!tm;")
	private Class338 aClass338_122;

	@OriginalMember(owner = "client!jg", name = "<init>", descriptor = "()V")
	public Class167() {
	}

	@OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(Lclient!tm;)V")
	public Class167(@OriginalArg(0) Class338 arg0) {
		this.aClass338_122 = arg0;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)Lclient!dba;")
	public Class3 method4435() {
		@Pc(8) Class3 local8 = this.aClass338_122.aClass3_302.aClass3_337;
		if (this.aClass338_122.aClass3_302 == local8) {
			this.aClass3_177 = null;
			return null;
		} else {
			this.aClass3_177 = local8.aClass3_337;
			return local8;
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)Lclient!dba;")
	public Class3 method4437() {
		@Pc(6) Class3 local6 = this.aClass3_177;
		if (this.aClass338_122.aClass3_302 == local6) {
			this.aClass3_177 = null;
			return null;
		} else {
			this.aClass3_177 = local6.aClass3_337;
			return local6;
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lclient!tm;I)V")
	public void method4438(@OriginalArg(0) Class338 arg0) {
		this.aClass338_122 = arg0;
	}
}
