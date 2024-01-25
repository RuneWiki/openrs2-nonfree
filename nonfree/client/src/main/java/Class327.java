import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uh")
public final class Class327 {

	@OriginalMember(owner = "client!uh", name = "c", descriptor = "Lclient!faa;")
	private Class3 aClass3_260;

	@OriginalMember(owner = "client!uh", name = "g", descriptor = "Lclient!ki;")
	private Class183 aClass183_59;

	@OriginalMember(owner = "client!uh", name = "<init>", descriptor = "()V")
	public Class327() {
	}

	@OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(Lclient!ki;)V")
	public Class327(@OriginalArg(0) Class183 arg0) {
		this.aClass183_59 = arg0;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Z)Lclient!faa;")
	public Class3 method7864() {
		@Pc(11) Class3 local11 = this.aClass3_260;
		if (this.aClass183_59.aClass3_161 == local11) {
			this.aClass3_260 = null;
			return null;
		} else {
			this.aClass3_260 = local11.aClass3_288;
			return local11;
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lclient!ki;I)V")
	public void method7866(@OriginalArg(0) Class183 arg0) {
		this.aClass183_59 = arg0;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)Lclient!faa;")
	public Class3 method7867() {
		@Pc(8) Class3 local8 = this.aClass183_59.aClass3_161.aClass3_288;
		if (local8 == this.aClass183_59.aClass3_161) {
			this.aClass3_260 = null;
			return null;
		} else {
			this.aClass3_260 = local8.aClass3_288;
			return local8;
		}
	}
}
