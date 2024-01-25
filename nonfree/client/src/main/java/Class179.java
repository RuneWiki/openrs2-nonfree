import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kca")
public final class Class179 {

	@OriginalMember(owner = "client!kca", name = "b", descriptor = "Lclient!iga;")
	private Class3 aClass3_153;

	@OriginalMember(owner = "client!kca", name = "i", descriptor = "Lclient!hga;")
	private Class130 aClass130_34;

	@OriginalMember(owner = "client!kca", name = "<init>", descriptor = "()V")
	public Class179() {
	}

	@OriginalMember(owner = "client!kca", name = "<init>", descriptor = "(Lclient!hga;)V")
	public Class179(@OriginalArg(0) Class130 arg0) {
		this.aClass130_34 = arg0;
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(B)Lclient!iga;")
	public Class3 method4380() {
		@Pc(16) Class3 local16 = this.aClass130_34.aClass3_121.aClass3_285;
		if (local16 == this.aClass130_34.aClass3_121) {
			this.aClass3_153 = null;
			return null;
		} else {
			this.aClass3_153 = local16.aClass3_285;
			return local16;
		}
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(I)Lclient!iga;")
	public Class3 method4382() {
		@Pc(6) Class3 local6 = this.aClass3_153;
		if (this.aClass130_34.aClass3_121 == local6) {
			this.aClass3_153 = null;
			return null;
		} else {
			this.aClass3_153 = local6.aClass3_285;
			return local6;
		}
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(ILclient!hga;)V")
	public void method4383(@OriginalArg(1) Class130 arg0) {
		this.aClass130_34 = arg0;
	}
}
