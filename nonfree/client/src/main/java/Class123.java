import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jh")
public final class Class123 {

	@OriginalMember(owner = "client!jh", name = "m", descriptor = "Lclient!gk;")
	private Class5_Sub2 aClass5_Sub2_24;

	@OriginalMember(owner = "client!jh", name = "k", descriptor = "Lclient!gk;")
	private final Class5_Sub2 aClass5_Sub2_23 = new Class5_Sub2();

	@OriginalMember(owner = "client!jh", name = "<init>", descriptor = "()V")
	public Class123() {
		this.aClass5_Sub2_23.aClass5_Sub2_58 = this.aClass5_Sub2_23;
		this.aClass5_Sub2_23.aClass5_Sub2_57 = this.aClass5_Sub2_23;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)Lclient!gk;")
	public Class5_Sub2 method2616() {
		@Pc(14) Class5_Sub2 local14 = this.aClass5_Sub2_23.aClass5_Sub2_58;
		if (this.aClass5_Sub2_23 == local14) {
			this.aClass5_Sub2_24 = null;
			return null;
		} else {
			this.aClass5_Sub2_24 = local14.aClass5_Sub2_58;
			return local14;
		}
	}

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "(I)I")
	public int method2617() {
		@Pc(13) int local13 = 0;
		for (@Pc(17) Class5_Sub2 local17 = this.aClass5_Sub2_23.aClass5_Sub2_58; local17 != this.aClass5_Sub2_23; local17 = local17.aClass5_Sub2_58) {
			local13++;
		}
		return local13;
	}

	@OriginalMember(owner = "client!jh", name = "c", descriptor = "(I)Lclient!gk;")
	public Class5_Sub2 method2618() {
		@Pc(6) Class5_Sub2 local6 = this.aClass5_Sub2_24;
		if (this.aClass5_Sub2_23 == local6) {
			this.aClass5_Sub2_24 = null;
			return null;
		} else {
			this.aClass5_Sub2_24 = local6.aClass5_Sub2_58;
			return local6;
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Z)Lclient!gk;")
	public Class5_Sub2 method2619() {
		@Pc(7) Class5_Sub2 local7 = this.aClass5_Sub2_23.aClass5_Sub2_58;
		if (local7 == this.aClass5_Sub2_23) {
			return null;
		} else {
			local7.method6006();
			return local7;
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(ILclient!gk;)V")
	public void method2620(@OriginalArg(1) Class5_Sub2 arg0) {
		if (arg0.aClass5_Sub2_57 != null) {
			arg0.method6006();
		}
		arg0.aClass5_Sub2_57 = this.aClass5_Sub2_23.aClass5_Sub2_57;
		arg0.aClass5_Sub2_58 = this.aClass5_Sub2_23;
		arg0.aClass5_Sub2_57.aClass5_Sub2_58 = arg0;
		arg0.aClass5_Sub2_58.aClass5_Sub2_57 = arg0;
	}

	@OriginalMember(owner = "client!jh", name = "d", descriptor = "(I)V")
	public void method2622() {
		while (true) {
			@Pc(9) Class5_Sub2 local9 = this.aClass5_Sub2_23.aClass5_Sub2_58;
			if (local9 == this.aClass5_Sub2_23) {
				this.aClass5_Sub2_24 = null;
				return;
			}
			local9.method6006();
		}
	}
}
