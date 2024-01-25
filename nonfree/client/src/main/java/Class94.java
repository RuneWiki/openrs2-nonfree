import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eq")
public final class Class94 {

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "Lclient!ak;")
	private Class15 aClass15_4;

	@OriginalMember(owner = "client!eq", name = "f", descriptor = "Lclient!wfa;")
	private Class3_Sub4 aClass3_Sub4_22;

	@OriginalMember(owner = "client!eq", name = "<init>", descriptor = "()V")
	private Class94() {
	}

	@OriginalMember(owner = "client!eq", name = "<init>", descriptor = "(Lclient!ak;)V")
	public Class94(@OriginalArg(0) Class15 arg0) {
		this.aClass15_4 = arg0;
	}

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "(I)Lclient!wfa;")
	public Class3_Sub4 method2557() {
		@Pc(11) Class3_Sub4 local11 = this.aClass3_Sub4_22;
		if (local11 == this.aClass15_4.aClass3_Sub4_5) {
			this.aClass3_Sub4_22 = null;
			return null;
		} else {
			this.aClass3_Sub4_22 = local11.aClass3_Sub4_66;
			return local11;
		}
	}

	@OriginalMember(owner = "client!eq", name = "c", descriptor = "(I)Lclient!wfa;")
	public Class3_Sub4 method2558() {
		@Pc(15) Class3_Sub4 local15 = this.aClass15_4.aClass3_Sub4_5.aClass3_Sub4_66;
		if (local15 == this.aClass15_4.aClass3_Sub4_5) {
			this.aClass3_Sub4_22 = null;
			return null;
		} else {
			this.aClass3_Sub4_22 = local15.aClass3_Sub4_66;
			return local15;
		}
	}
}
