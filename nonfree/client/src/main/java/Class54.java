import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cka")
public final class Class54 {

	@OriginalMember(owner = "client!cka", name = "d", descriptor = "Lclient!ffa;")
	private Class3_Sub4 aClass3_Sub4_18;

	@OriginalMember(owner = "client!cka", name = "h", descriptor = "Lclient!pda;")
	private Class283 aClass283_2;

	@OriginalMember(owner = "client!cka", name = "<init>", descriptor = "()V")
	private Class54() {
	}

	@OriginalMember(owner = "client!cka", name = "<init>", descriptor = "(Lclient!pda;)V")
	public Class54(@OriginalArg(0) Class283 arg0) {
		this.aClass283_2 = arg0;
	}

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(I)Lclient!ffa;")
	public Class3_Sub4 method1074() {
		@Pc(12) Class3_Sub4 local12 = this.aClass3_Sub4_18;
		if (this.aClass283_2.aClass3_Sub4_51 == local12) {
			this.aClass3_Sub4_18 = null;
			return null;
		} else {
			this.aClass3_Sub4_18 = local12.aClass3_Sub4_66;
			return local12;
		}
	}

	@OriginalMember(owner = "client!cka", name = "b", descriptor = "(B)Lclient!ffa;")
	public Class3_Sub4 method1077() {
		@Pc(8) Class3_Sub4 local8 = this.aClass283_2.aClass3_Sub4_51.aClass3_Sub4_66;
		if (local8 == this.aClass283_2.aClass3_Sub4_51) {
			this.aClass3_Sub4_18 = null;
			return null;
		} else {
			this.aClass3_Sub4_18 = local8.aClass3_Sub4_66;
			return local8;
		}
	}
}
