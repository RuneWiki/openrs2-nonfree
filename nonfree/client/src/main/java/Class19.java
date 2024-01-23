import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public final class Class19 {

	@OriginalMember(owner = "client!db", name = "v", descriptor = "Lclient!b;")
	private Class1 aClass1_38;

	@OriginalMember(owner = "client!db", name = "n", descriptor = "Lclient!b;")
	public Class1 aClass1_37 = new Class1();

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "()V")
	public Class19() {
		this.aClass1_37.aClass1_213 = this.aClass1_37;
		this.aClass1_37.aClass1_214 = this.aClass1_37;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(B)Lclient!b;")
	public Class1 method609() {
		@Pc(3) Class1 local3 = this.aClass1_37.aClass1_213;
		if (local3 == this.aClass1_37) {
			this.aClass1_38 = null;
			return null;
		} else {
			this.aClass1_38 = local3.aClass1_213;
			return local3;
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!b;Lclient!b;Z)V")
	public void method610(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Class1 arg1) {
		if (arg0.aClass1_214 != null) {
			arg0.method3530();
		}
		arg0.aClass1_213 = arg1;
		arg0.aClass1_214 = arg1.aClass1_214;
		arg0.aClass1_214.aClass1_213 = arg0;
		arg0.aClass1_213.aClass1_214 = arg0;
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(I)Lclient!b;")
	public Class1 method613() {
		@Pc(7) Class1 local7 = this.aClass1_37.aClass1_214;
		if (this.aClass1_37 == local7) {
			this.aClass1_38 = null;
			return null;
		} else {
			this.aClass1_38 = local7.aClass1_214;
			return local7;
		}
	}

	@OriginalMember(owner = "client!db", name = "c", descriptor = "(I)Lclient!b;")
	public Class1 method615() {
		@Pc(13) Class1 local13 = this.aClass1_38;
		if (this.aClass1_37 == local13) {
			this.aClass1_38 = null;
			return null;
		} else {
			this.aClass1_38 = local13.aClass1_213;
			return local13;
		}
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(B)Lclient!b;")
	public Class1 method617() {
		@Pc(6) Class1 local6 = this.aClass1_38;
		if (local6 == this.aClass1_37) {
			this.aClass1_38 = null;
			return null;
		} else {
			this.aClass1_38 = local6.aClass1_214;
			return local6;
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ILclient!b;)V")
	public void method618(@OriginalArg(1) Class1 arg0) {
		if (arg0.aClass1_214 != null) {
			arg0.method3530();
		}
		arg0.aClass1_213 = this.aClass1_37.aClass1_213;
		arg0.aClass1_214 = this.aClass1_37;
		arg0.aClass1_214.aClass1_213 = arg0;
		arg0.aClass1_213.aClass1_214 = arg0;
	}

	@OriginalMember(owner = "client!db", name = "d", descriptor = "(I)V")
	public void method619() {
		while (true) {
			@Pc(11) Class1 local11 = this.aClass1_37.aClass1_213;
			if (this.aClass1_37 == local11) {
				return;
			}
			local11.method3530();
		}
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(ILclient!b;)V")
	public void method620(@OriginalArg(1) Class1 arg0) {
		if (arg0.aClass1_214 != null) {
			arg0.method3530();
		}
		arg0.aClass1_214 = this.aClass1_37.aClass1_214;
		arg0.aClass1_213 = this.aClass1_37;
		arg0.aClass1_214.aClass1_213 = arg0;
		arg0.aClass1_213.aClass1_214 = arg0;
	}

	@OriginalMember(owner = "client!db", name = "e", descriptor = "(I)Lclient!b;")
	public Class1 method621() {
		@Pc(3) Class1 local3 = this.aClass1_37.aClass1_213;
		if (this.aClass1_37 == local3) {
			return null;
		} else {
			local3.method3530();
			return local3;
		}
	}
}
