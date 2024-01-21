import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!a")
public final class Class1 {

	@OriginalMember(owner = "client!a", name = "z", descriptor = "Lclient!kd;")
	private Class6 aClass6_2;

	@OriginalMember(owner = "client!a", name = "e", descriptor = "Lclient!kd;")
	public final Class6 aClass6_1 = new Class6();

	@OriginalMember(owner = "client!a", name = "<init>", descriptor = "()V")
	public Class1() {
		this.aClass6_1.aClass6_116 = this.aClass6_1;
		this.aClass6_1.aClass6_115 = this.aClass6_1;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(B)Lclient!kd;")
	public Class6 method1() {
		@Pc(11) Class6 local11 = this.aClass6_2;
		if (this.aClass6_1 == local11) {
			this.aClass6_2 = null;
			return null;
		} else {
			this.aClass6_2 = local11.aClass6_115;
			return local11;
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!kd;ILclient!kd;)V")
	public void method2(@OriginalArg(0) Class6 arg0, @OriginalArg(2) Class6 arg1) {
		if (arg0.aClass6_115 != null) {
			arg0.method2123();
		}
		arg0.aClass6_116 = arg1;
		arg0.aClass6_115 = arg1.aClass6_115;
		arg0.aClass6_115.aClass6_116 = arg0;
		arg0.aClass6_116.aClass6_115 = arg0;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Z)Lclient!kd;")
	public Class6 method3() {
		@Pc(7) Class6 local7 = this.aClass6_1.aClass6_116;
		if (this.aClass6_1 == local7) {
			this.aClass6_2 = null;
			return null;
		} else {
			this.aClass6_2 = local7.aClass6_116;
			return local7;
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!kd;Z)V")
	public void method4(@OriginalArg(0) Class6 arg0) {
		if (arg0.aClass6_115 != null) {
			arg0.method2123();
		}
		arg0.aClass6_116 = this.aClass6_1.aClass6_116;
		arg0.aClass6_115 = this.aClass6_1;
		arg0.aClass6_115.aClass6_116 = arg0;
		arg0.aClass6_116.aClass6_115 = arg0;
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(B)Lclient!kd;")
	public Class6 method5() {
		@Pc(7) Class6 local7 = this.aClass6_1.aClass6_115;
		if (this.aClass6_1 == local7) {
			this.aClass6_2 = null;
			return null;
		} else {
			this.aClass6_2 = local7.aClass6_115;
			return local7;
		}
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(I)Lclient!kd;")
	public Class6 method9() {
		@Pc(15) Class6 local15 = this.aClass6_1.aClass6_116;
		if (this.aClass6_1 == local15) {
			return null;
		} else {
			local15.method2123();
			return local15;
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!kd;B)V")
	public void method10(@OriginalArg(0) Class6 arg0) {
		if (arg0.aClass6_115 != null) {
			arg0.method2123();
		}
		arg0.aClass6_115 = this.aClass6_1.aClass6_115;
		arg0.aClass6_116 = this.aClass6_1;
		arg0.aClass6_115.aClass6_116 = arg0;
		arg0.aClass6_116.aClass6_115 = arg0;
	}

	@OriginalMember(owner = "client!a", name = "d", descriptor = "(B)Lclient!kd;")
	public Class6 method12() {
		@Pc(7) Class6 local7 = this.aClass6_1.aClass6_115;
		if (local7 == this.aClass6_1) {
			return null;
		} else {
			local7.method2123();
			return local7;
		}
	}

	@OriginalMember(owner = "client!a", name = "c", descriptor = "(I)Lclient!kd;")
	public Class6 method14() {
		@Pc(6) Class6 local6 = this.aClass6_2;
		if (this.aClass6_1 == local6) {
			this.aClass6_2 = null;
			return null;
		} else {
			this.aClass6_2 = local6.aClass6_116;
			return local6;
		}
	}

	@OriginalMember(owner = "client!a", name = "e", descriptor = "(B)V")
	public void method17() {
		while (true) {
			@Pc(11) Class6 local11 = this.aClass6_1.aClass6_116;
			if (local11 == this.aClass6_1) {
				return;
			}
			local11.method2123();
		}
	}
}
