import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pp")
public final class Class271 {

	@OriginalMember(owner = "client!pp", name = "d", descriptor = "Lclient!ob;")
	private Class3_Sub7 aClass3_Sub7_53;

	@OriginalMember(owner = "client!pp", name = "f", descriptor = "Lclient!vu;")
	private Class363 aClass363_40;

	@OriginalMember(owner = "client!pp", name = "<init>", descriptor = "()V")
	private Class271() {
	}

	@OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(Lclient!vu;)V")
	public Class271(@OriginalArg(0) Class363 arg0) {
		this.aClass363_40 = arg0;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(I)Lclient!ob;")
	public Class3_Sub7 method6640() {
		@Pc(16) Class3_Sub7 local16 = this.aClass363_40.aClass3_Sub7_66.aClass3_Sub7_63;
		if (this.aClass363_40.aClass3_Sub7_66 == local16) {
			this.aClass3_Sub7_53 = null;
			return null;
		} else {
			this.aClass3_Sub7_53 = local16.aClass3_Sub7_63;
			return local16;
		}
	}

	@OriginalMember(owner = "client!pp", name = "d", descriptor = "(I)Lclient!ob;")
	public Class3_Sub7 method6644() {
		@Pc(6) Class3_Sub7 local6 = this.aClass3_Sub7_53;
		if (local6 == this.aClass363_40.aClass3_Sub7_66) {
			this.aClass3_Sub7_53 = null;
			return null;
		} else {
			this.aClass3_Sub7_53 = local6.aClass3_Sub7_63;
			return local6;
		}
	}
}
