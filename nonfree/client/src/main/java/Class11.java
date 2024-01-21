import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cd")
public final class Class11 {

	@OriginalMember(owner = "client!cd", name = "f", descriptor = "Lclient!re;")
	private final Class6_Sub2 aClass6_Sub2_15 = new Class6_Sub2();

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "()V")
	public Class11() {
		this.aClass6_Sub2_15.aClass6_Sub2_61 = this.aClass6_Sub2_15;
		this.aClass6_Sub2_15.aClass6_Sub2_62 = this.aClass6_Sub2_15;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILclient!re;)V")
	public void method459(@OriginalArg(1) Class6_Sub2 arg0) {
		if (arg0.aClass6_Sub2_62 != null) {
			arg0.method2094();
		}
		arg0.aClass6_Sub2_61 = this.aClass6_Sub2_15.aClass6_Sub2_61;
		arg0.aClass6_Sub2_62 = this.aClass6_Sub2_15;
		arg0.aClass6_Sub2_62.aClass6_Sub2_61 = arg0;
		arg0.aClass6_Sub2_61.aClass6_Sub2_62 = arg0;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(BLclient!re;)V")
	public void method461(@OriginalArg(1) Class6_Sub2 arg0) {
		if (arg0.aClass6_Sub2_62 != null) {
			arg0.method2094();
		}
		arg0.aClass6_Sub2_62 = this.aClass6_Sub2_15.aClass6_Sub2_62;
		arg0.aClass6_Sub2_61 = this.aClass6_Sub2_15;
		arg0.aClass6_Sub2_62.aClass6_Sub2_61 = arg0;
		arg0.aClass6_Sub2_61.aClass6_Sub2_62 = arg0;
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(I)Lclient!re;")
	public Class6_Sub2 method462() {
		@Pc(7) Class6_Sub2 local7 = this.aClass6_Sub2_15.aClass6_Sub2_61;
		return this.aClass6_Sub2_15 == local7 ? null : local7;
	}

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "(I)Lclient!re;")
	public Class6_Sub2 method463() {
		@Pc(14) Class6_Sub2 local14 = this.aClass6_Sub2_15.aClass6_Sub2_61;
		if (this.aClass6_Sub2_15 == local14) {
			return null;
		} else {
			local14.method2094();
			return local14;
		}
	}
}
