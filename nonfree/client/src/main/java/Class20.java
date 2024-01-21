import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cf")
public final class Class20 {

	@OriginalMember(owner = "client!cf", name = "x", descriptor = "Lclient!md;")
	private Class1 aClass1_28;

	@OriginalMember(owner = "client!cf", name = "t", descriptor = "Lclient!md;")
	public final Class1 aClass1_27 = new Class1();

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "()V")
	public Class20() {
		this.aClass1_27.aClass1_214 = this.aClass1_27;
		this.aClass1_27.aClass1_213 = this.aClass1_27;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lclient!md;Z)V")
	public void method466(@OriginalArg(0) Class1 arg0) {
		if (arg0.aClass1_214 != null) {
			arg0.method3414();
		}
		arg0.aClass1_214 = this.aClass1_27.aClass1_214;
		arg0.aClass1_213 = this.aClass1_27;
		arg0.aClass1_214.aClass1_213 = arg0;
		arg0.aClass1_213.aClass1_214 = arg0;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)Lclient!md;")
	public Class1 method467() {
		@Pc(3) Class1 local3 = this.aClass1_27.aClass1_213;
		if (local3 == this.aClass1_27) {
			this.aClass1_28 = null;
			return null;
		} else {
			this.aClass1_28 = local3.aClass1_213;
			return local3;
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Z)Lclient!md;")
	public Class1 method468() {
		@Pc(2) Class1 local2 = this.aClass1_28;
		if (this.aClass1_27 == local2) {
			this.aClass1_28 = null;
			return null;
		} else {
			this.aClass1_28 = local2.aClass1_213;
			return local2;
		}
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(I)V")
	public void method469() {
		while (true) {
			@Pc(11) Class1 local11 = this.aClass1_27.aClass1_213;
			if (this.aClass1_27 == local11) {
				return;
			}
			local11.method3414();
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lclient!md;B)V")
	public void method471(@OriginalArg(0) Class1 arg0) {
		if (arg0.aClass1_214 != null) {
			arg0.method3414();
		}
		arg0.aClass1_214 = this.aClass1_27;
		arg0.aClass1_213 = this.aClass1_27.aClass1_213;
		arg0.aClass1_214.aClass1_213 = arg0;
		arg0.aClass1_213.aClass1_214 = arg0;
	}

	@OriginalMember(owner = "client!cf", name = "d", descriptor = "(I)Lclient!md;")
	public Class1 method473() {
		@Pc(11) Class1 local11 = this.aClass1_28;
		if (this.aClass1_27 == local11) {
			this.aClass1_28 = null;
			return null;
		} else {
			this.aClass1_28 = local11.aClass1_214;
			return local11;
		}
	}

	@OriginalMember(owner = "client!cf", name = "e", descriptor = "(I)Lclient!md;")
	public Class1 method475() {
		@Pc(12) Class1 local12 = this.aClass1_27.aClass1_213;
		if (this.aClass1_27 == local12) {
			return null;
		} else {
			local12.method3414();
			return local12;
		}
	}

	@OriginalMember(owner = "client!cf", name = "f", descriptor = "(I)Lclient!md;")
	public Class1 method477() {
		@Pc(11) Class1 local11 = this.aClass1_27.aClass1_214;
		if (local11 == this.aClass1_27) {
			this.aClass1_28 = null;
			return null;
		} else {
			this.aClass1_28 = local11.aClass1_214;
			return local11;
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lclient!md;ILclient!md;)V")
	public void method478(@OriginalArg(0) Class1 arg0, @OriginalArg(2) Class1 arg1) {
		if (arg1.aClass1_214 != null) {
			arg1.method3414();
		}
		arg1.aClass1_214 = arg0.aClass1_214;
		arg1.aClass1_213 = arg0;
		arg1.aClass1_214.aClass1_213 = arg1;
		arg1.aClass1_213.aClass1_214 = arg1;
	}
}
