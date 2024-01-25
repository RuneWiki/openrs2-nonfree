import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!am")
public final class Class14 {

	@OriginalMember(owner = "client!am", name = "o", descriptor = "Lclient!ev;")
	private Class1 aClass1_6;

	@OriginalMember(owner = "client!am", name = "f", descriptor = "Lclient!ev;")
	public final Class1 aClass1_5 = new Class1();

	@OriginalMember(owner = "client!am", name = "<init>", descriptor = "()V")
	public Class14() {
		this.aClass1_5.aClass1_268 = this.aClass1_5;
		this.aClass1_5.aClass1_267 = this.aClass1_5;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(I)Lclient!ev;")
	public Class1 method202() {
		@Pc(7) Class1 local7 = this.aClass1_5.aClass1_267;
		if (local7 == this.aClass1_5) {
			return null;
		} else {
			local7.method5953();
			return local7;
		}
	}

	@OriginalMember(owner = "client!am", name = "b", descriptor = "(I)Lclient!ev;")
	public Class1 method203() {
		@Pc(7) Class1 local7 = this.aClass1_5.aClass1_267;
		if (local7 == this.aClass1_5) {
			this.aClass1_6 = null;
			return null;
		} else {
			this.aClass1_6 = local7.aClass1_267;
			return local7;
		}
	}

	@OriginalMember(owner = "client!am", name = "c", descriptor = "(I)V")
	public void method204() {
		while (true) {
			@Pc(9) Class1 local9 = this.aClass1_5.aClass1_267;
			if (local9 == this.aClass1_5) {
				this.aClass1_6 = null;
				return;
			}
			local9.method5953();
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(ILclient!ev;)V")
	public void method205(@OriginalArg(1) Class1 arg0) {
		if (arg0.aClass1_268 != null) {
			arg0.method5953();
		}
		arg0.aClass1_268 = this.aClass1_5.aClass1_268;
		arg0.aClass1_267 = this.aClass1_5;
		arg0.aClass1_268.aClass1_267 = arg0;
		arg0.aClass1_267.aClass1_268 = arg0;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Lclient!ev;Z)V")
	public void method206(@OriginalArg(0) Class1 arg0) {
		if (arg0.aClass1_268 != null) {
			arg0.method5953();
		}
		arg0.aClass1_268 = this.aClass1_5;
		arg0.aClass1_267 = this.aClass1_5.aClass1_267;
		arg0.aClass1_268.aClass1_267 = arg0;
		arg0.aClass1_267.aClass1_268 = arg0;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Lclient!am;B)V")
	public void method207(@OriginalArg(0) Class14 arg0) {
		this.method216(arg0, this.aClass1_5.aClass1_267);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(B)Lclient!ev;")
	public Class1 method208() {
		@Pc(11) Class1 local11 = this.aClass1_6;
		if (local11 == this.aClass1_5) {
			this.aClass1_6 = null;
			return null;
		} else {
			this.aClass1_6 = local11.aClass1_267;
			return local11;
		}
	}

	@OriginalMember(owner = "client!am", name = "d", descriptor = "(I)Z")
	public boolean method209() {
		return this.aClass1_5.aClass1_267 == this.aClass1_5;
	}

	@OriginalMember(owner = "client!am", name = "b", descriptor = "(B)Lclient!ev;")
	public Class1 method210() {
		@Pc(15) Class1 local15 = this.aClass1_5.aClass1_268;
		if (local15 == this.aClass1_5) {
			this.aClass1_6 = null;
			return null;
		} else {
			this.aClass1_6 = local15.aClass1_268;
			return local15;
		}
	}

	@OriginalMember(owner = "client!am", name = "e", descriptor = "(I)I")
	public int method213() {
		@Pc(15) int local15 = 0;
		@Pc(19) Class1 local19 = this.aClass1_5.aClass1_267;
		while (local19 != this.aClass1_5) {
			local19 = local19.aClass1_267;
			local15++;
		}
		return local15;
	}

	@OriginalMember(owner = "client!am", name = "f", descriptor = "(I)Lclient!ev;")
	public Class1 method215() {
		@Pc(6) Class1 local6 = this.aClass1_6;
		if (local6 == this.aClass1_5) {
			this.aClass1_6 = null;
			return null;
		} else {
			this.aClass1_6 = local6.aClass1_268;
			return local6;
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(ILclient!am;Lclient!ev;)V")
	private void method216(@OriginalArg(1) Class14 arg0, @OriginalArg(2) Class1 arg1) {
		@Pc(7) Class1 local7 = this.aClass1_5.aClass1_268;
		this.aClass1_5.aClass1_268 = arg1.aClass1_268;
		arg1.aClass1_268.aClass1_267 = this.aClass1_5;
		if (this.aClass1_5 != arg1) {
			arg1.aClass1_268 = arg0.aClass1_5.aClass1_268;
			arg1.aClass1_268.aClass1_267 = arg1;
			arg0.aClass1_5.aClass1_268 = local7;
			local7.aClass1_267 = arg0.aClass1_5;
		}
	}
}
