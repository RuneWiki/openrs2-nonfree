import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public final class Class49 {

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "Lclient!qd;")
	private final Class5_Sub2 aClass5_Sub2_39 = new Class5_Sub2();

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "()V")
	public Class49() {
		this.aClass5_Sub2_39.aClass5_Sub2_63 = this.aClass5_Sub2_39;
		this.aClass5_Sub2_39.aClass5_Sub2_64 = this.aClass5_Sub2_39;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)Lclient!qd;")
	public Class5_Sub2 method1470() {
		@Pc(3) Class5_Sub2 local3 = this.aClass5_Sub2_39.aClass5_Sub2_63;
		if (this.aClass5_Sub2_39 == local3) {
			return null;
		} else {
			local3.method2116();
			return local3;
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!qd;B)V")
	public void method1471(@OriginalArg(0) Class5_Sub2 arg0) {
		if (arg0.aClass5_Sub2_64 != null) {
			arg0.method2116();
		}
		arg0.aClass5_Sub2_63 = this.aClass5_Sub2_39.aClass5_Sub2_63;
		arg0.aClass5_Sub2_64 = this.aClass5_Sub2_39;
		arg0.aClass5_Sub2_64.aClass5_Sub2_63 = arg0;
		arg0.aClass5_Sub2_63.aClass5_Sub2_64 = arg0;
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(Lclient!qd;B)V")
	public void method1472(@OriginalArg(0) Class5_Sub2 arg0) {
		if (arg0.aClass5_Sub2_64 != null) {
			arg0.method2116();
		}
		arg0.aClass5_Sub2_63 = this.aClass5_Sub2_39;
		arg0.aClass5_Sub2_64 = this.aClass5_Sub2_39.aClass5_Sub2_64;
		arg0.aClass5_Sub2_64.aClass5_Sub2_63 = arg0;
		arg0.aClass5_Sub2_63.aClass5_Sub2_64 = arg0;
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)Lclient!qd;")
	public Class5_Sub2 method1474() {
		@Pc(7) Class5_Sub2 local7 = this.aClass5_Sub2_39.aClass5_Sub2_63;
		return local7 == this.aClass5_Sub2_39 ? null : local7;
	}
}
