import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hv")
public final class Class143 {

	@OriginalMember(owner = "client!hv", name = "j", descriptor = "Lclient!pp;")
	private Class6_Sub4 aClass6_Sub4_19;

	@OriginalMember(owner = "client!hv", name = "d", descriptor = "Lclient!pp;")
	private final Class6_Sub4 aClass6_Sub4_18 = new Class6_Sub4();

	@OriginalMember(owner = "client!hv", name = "<init>", descriptor = "()V")
	public Class143() {
		this.aClass6_Sub4_18.aClass6_Sub4_60 = this.aClass6_Sub4_18;
		this.aClass6_Sub4_18.aClass6_Sub4_59 = this.aClass6_Sub4_18;
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(I)Lclient!pp;")
	public Class6_Sub4 method3833() {
		@Pc(6) Class6_Sub4 local6 = this.aClass6_Sub4_19;
		if (this.aClass6_Sub4_18 == local6) {
			this.aClass6_Sub4_19 = null;
			return null;
		} else {
			this.aClass6_Sub4_19 = local6.aClass6_Sub4_59;
			return local6;
		}
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(ILclient!pp;)V")
	public void method3835(@OriginalArg(1) Class6_Sub4 arg0) {
		if (arg0.aClass6_Sub4_60 != null) {
			arg0.method8035();
		}
		arg0.aClass6_Sub4_60 = this.aClass6_Sub4_18.aClass6_Sub4_60;
		arg0.aClass6_Sub4_59 = this.aClass6_Sub4_18;
		arg0.aClass6_Sub4_60.aClass6_Sub4_59 = arg0;
		arg0.aClass6_Sub4_59.aClass6_Sub4_60 = arg0;
	}

	@OriginalMember(owner = "client!hv", name = "b", descriptor = "(B)Lclient!pp;")
	public Class6_Sub4 method3836() {
		@Pc(12) Class6_Sub4 local12 = this.aClass6_Sub4_18.aClass6_Sub4_59;
		if (this.aClass6_Sub4_18 == local12) {
			return null;
		} else {
			local12.method8035();
			return local12;
		}
	}

	@OriginalMember(owner = "client!hv", name = "b", descriptor = "(I)V")
	public void method3837() {
		while (true) {
			@Pc(5) Class6_Sub4 local5 = this.aClass6_Sub4_18.aClass6_Sub4_59;
			if (this.aClass6_Sub4_18 == local5) {
				this.aClass6_Sub4_19 = null;
				return;
			}
			local5.method8035();
		}
	}

	@OriginalMember(owner = "client!hv", name = "c", descriptor = "(B)I")
	public int method3838() {
		@Pc(12) int local12 = 0;
		for (@Pc(16) Class6_Sub4 local16 = this.aClass6_Sub4_18.aClass6_Sub4_59; local16 != this.aClass6_Sub4_18; local16 = local16.aClass6_Sub4_59) {
			local12++;
		}
		return local12;
	}

	@OriginalMember(owner = "client!hv", name = "c", descriptor = "(I)Lclient!pp;")
	public Class6_Sub4 method3839() {
		@Pc(7) Class6_Sub4 local7 = this.aClass6_Sub4_18.aClass6_Sub4_59;
		if (this.aClass6_Sub4_18 == local7) {
			this.aClass6_Sub4_19 = null;
			return null;
		} else {
			this.aClass6_Sub4_19 = local7.aClass6_Sub4_59;
			return local7;
		}
	}
}
