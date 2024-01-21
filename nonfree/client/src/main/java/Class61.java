import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public final class Class61 {

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "Lclient!se;")
	private final Class6_Sub3 aClass6_Sub3_52 = new Class6_Sub3();

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "()V")
	public Class61() {
		this.aClass6_Sub3_52.aClass6_Sub3_64 = this.aClass6_Sub3_52;
		this.aClass6_Sub3_52.aClass6_Sub3_63 = this.aClass6_Sub3_52;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)Lclient!se;")
	public Class6_Sub3 method1672() {
		@Pc(7) Class6_Sub3 local7 = this.aClass6_Sub3_52.aClass6_Sub3_63;
		return local7 == this.aClass6_Sub3_52 ? null : local7;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!se;I)V")
	public void method1676(@OriginalArg(0) Class6_Sub3 arg0) {
		if (arg0.aClass6_Sub3_64 != null) {
			arg0.method2131();
		}
		arg0.aClass6_Sub3_63 = this.aClass6_Sub3_52.aClass6_Sub3_63;
		arg0.aClass6_Sub3_64 = this.aClass6_Sub3_52;
		arg0.aClass6_Sub3_64.aClass6_Sub3_63 = arg0;
		arg0.aClass6_Sub3_63.aClass6_Sub3_64 = arg0;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Z)Lclient!se;")
	public Class6_Sub3 method1680() {
		@Pc(12) Class6_Sub3 local12 = this.aClass6_Sub3_52.aClass6_Sub3_63;
		if (local12 == this.aClass6_Sub3_52) {
			return null;
		} else {
			local12.method2131();
			return local12;
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(BLclient!se;)V")
	public void method1681(@OriginalArg(1) Class6_Sub3 arg0) {
		if (arg0.aClass6_Sub3_64 != null) {
			arg0.method2131();
		}
		arg0.aClass6_Sub3_63 = this.aClass6_Sub3_52;
		arg0.aClass6_Sub3_64 = this.aClass6_Sub3_52.aClass6_Sub3_64;
		arg0.aClass6_Sub3_64.aClass6_Sub3_63 = arg0;
		arg0.aClass6_Sub3_63.aClass6_Sub3_64 = arg0;
	}
}
