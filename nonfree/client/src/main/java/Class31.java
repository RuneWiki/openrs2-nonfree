import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bda")
public final class Class31 {

	@OriginalMember(owner = "client!bda", name = "b", descriptor = "Lclient!dha;")
	private Class74 aClass74_2;

	@OriginalMember(owner = "client!bda", name = "c", descriptor = "Lclient!tia;")
	private Class3_Sub11 aClass3_Sub11_7;

	@OriginalMember(owner = "client!bda", name = "<init>", descriptor = "()V")
	private Class31() {
	}

	@OriginalMember(owner = "client!bda", name = "<init>", descriptor = "(Lclient!dha;)V")
	public Class31(@OriginalArg(0) Class74 arg0) {
		this.aClass74_2 = arg0;
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(B)Lclient!tia;")
	public Class3_Sub11 method936() {
		@Pc(13) Class3_Sub11 local13 = this.aClass74_2.aClass3_Sub11_16.aClass3_Sub11_67;
		if (local13 == this.aClass74_2.aClass3_Sub11_16) {
			this.aClass3_Sub11_7 = null;
			return null;
		} else {
			this.aClass3_Sub11_7 = local13.aClass3_Sub11_67;
			return local13;
		}
	}

	@OriginalMember(owner = "client!bda", name = "b", descriptor = "(I)Lclient!tia;")
	public Class3_Sub11 method938() {
		@Pc(11) Class3_Sub11 local11 = this.aClass3_Sub11_7;
		if (this.aClass74_2.aClass3_Sub11_16 == local11) {
			this.aClass3_Sub11_7 = null;
			return null;
		} else {
			this.aClass3_Sub11_7 = local11.aClass3_Sub11_67;
			return local11;
		}
	}
}
