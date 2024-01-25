import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bu")
public final class Class38 {

	@OriginalMember(owner = "client!bu", name = "k", descriptor = "Lclient!kp;")
	private Class1 aClass1_28;

	@OriginalMember(owner = "client!bu", name = "g", descriptor = "Lclient!kp;")
	public final Class1 aClass1_27 = new Class1();

	@OriginalMember(owner = "client!bu", name = "<init>", descriptor = "()V")
	public Class38() {
		this.aClass1_27.aClass1_283 = this.aClass1_27;
		this.aClass1_27.aClass1_284 = this.aClass1_27;
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(Z)Z")
	public boolean method1414() {
		return this.aClass1_27 == this.aClass1_27.aClass1_283;
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(I)Lclient!kp;")
	public Class1 method1415() {
		@Pc(6) Class1 local6 = this.aClass1_28;
		if (local6 == this.aClass1_27) {
			this.aClass1_28 = null;
			return null;
		} else {
			this.aClass1_28 = local6.aClass1_283;
			return local6;
		}
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(ILclient!bu;Lclient!kp;)V")
	private void method1416(@OriginalArg(1) Class38 arg0, @OriginalArg(2) Class1 arg1) {
		@Pc(7) Class1 local7 = this.aClass1_27.aClass1_284;
		this.aClass1_27.aClass1_284 = arg1.aClass1_284;
		arg1.aClass1_284.aClass1_283 = this.aClass1_27;
		if (this.aClass1_27 != arg1) {
			arg1.aClass1_284 = arg0.aClass1_27.aClass1_284;
			arg1.aClass1_284.aClass1_283 = arg1;
			arg0.aClass1_27.aClass1_284 = local7;
			local7.aClass1_283 = arg0.aClass1_27;
		}
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(B)V")
	public void method1417() {
		while (true) {
			@Pc(8) Class1 local8 = this.aClass1_27.aClass1_283;
			if (this.aClass1_27 == local8) {
				this.aClass1_28 = null;
				return;
			}
			local8.method7983();
		}
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(ILclient!kp;)V")
	public void method1418(@OriginalArg(1) Class1 arg0) {
		if (arg0.aClass1_284 != null) {
			arg0.method7983();
		}
		arg0.aClass1_283 = this.aClass1_27.aClass1_283;
		arg0.aClass1_284 = this.aClass1_27;
		arg0.aClass1_284.aClass1_283 = arg0;
		arg0.aClass1_283.aClass1_284 = arg0;
	}

	@OriginalMember(owner = "client!bu", name = "b", descriptor = "(B)Lclient!kp;")
	public Class1 method1419() {
		@Pc(12) Class1 local12 = this.aClass1_27.aClass1_283;
		if (local12 == this.aClass1_27) {
			this.aClass1_28 = null;
			return null;
		} else {
			this.aClass1_28 = local12.aClass1_283;
			return local12;
		}
	}

	@OriginalMember(owner = "client!bu", name = "b", descriptor = "(I)Lclient!kp;")
	public Class1 method1420() {
		@Pc(12) Class1 local12 = this.aClass1_27.aClass1_284;
		if (local12 == this.aClass1_27) {
			this.aClass1_28 = null;
			return null;
		} else {
			this.aClass1_28 = local12.aClass1_284;
			return local12;
		}
	}

	@OriginalMember(owner = "client!bu", name = "c", descriptor = "(I)Lclient!kp;")
	public Class1 method1421() {
		@Pc(6) Class1 local6 = this.aClass1_28;
		if (this.aClass1_27 == local6) {
			this.aClass1_28 = null;
			return null;
		} else {
			this.aClass1_28 = local6.aClass1_284;
			return local6;
		}
	}

	@OriginalMember(owner = "client!bu", name = "d", descriptor = "(I)I")
	public int method1422() {
		@Pc(5) int local5 = 0;
		@Pc(9) Class1 local9 = this.aClass1_27.aClass1_283;
		while (this.aClass1_27 != local9) {
			local9 = local9.aClass1_283;
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!bu", name = "e", descriptor = "(I)Lclient!kp;")
	public Class1 method1423() {
		@Pc(14) Class1 local14 = this.aClass1_27.aClass1_283;
		if (local14 == this.aClass1_27) {
			return null;
		} else {
			local14.method7983();
			return local14;
		}
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(Lclient!bu;I)V")
	public void method1425(@OriginalArg(0) Class38 arg0) {
		this.method1416(arg0, this.aClass1_27.aClass1_283);
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(Lclient!kp;I)V")
	public void method1426(@OriginalArg(0) Class1 arg0) {
		if (arg0.aClass1_284 != null) {
			arg0.method7983();
		}
		arg0.aClass1_284 = this.aClass1_27.aClass1_284;
		arg0.aClass1_283 = this.aClass1_27;
		arg0.aClass1_284.aClass1_283 = arg0;
		arg0.aClass1_283.aClass1_284 = arg0;
	}
}
