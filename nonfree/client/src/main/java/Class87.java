import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public final class Class87 {

	@OriginalMember(owner = "client!s", name = "t", descriptor = "Lclient!rb;")
	private Class1 aClass1_164;

	@OriginalMember(owner = "client!s", name = "f", descriptor = "Lclient!rb;")
	public final Class1 aClass1_163 = new Class1();

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "()V")
	public Class87() {
		this.aClass1_163.aClass1_213 = this.aClass1_163;
		this.aClass1_163.aClass1_214 = this.aClass1_163;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!rb;B)V")
	public void method2823(@OriginalArg(0) Class1 arg0) {
		if (arg0.aClass1_213 != null) {
			arg0.method3563();
		}
		arg0.aClass1_213 = this.aClass1_163.aClass1_213;
		arg0.aClass1_214 = this.aClass1_163;
		arg0.aClass1_213.aClass1_214 = arg0;
		arg0.aClass1_214.aClass1_213 = arg0;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!rb;I)V")
	public void method2824(@OriginalArg(0) Class1 arg0) {
		if (arg0.aClass1_213 != null) {
			arg0.method3563();
		}
		arg0.aClass1_213 = this.aClass1_163;
		arg0.aClass1_214 = this.aClass1_163.aClass1_214;
		arg0.aClass1_213.aClass1_214 = arg0;
		arg0.aClass1_214.aClass1_213 = arg0;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(B)Lclient!rb;")
	public Class1 method2825() {
		@Pc(7) Class1 local7 = this.aClass1_163.aClass1_214;
		if (this.aClass1_163 == local7) {
			return null;
		} else {
			local7.method3563();
			return local7;
		}
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(I)Lclient!rb;")
	public Class1 method2827() {
		@Pc(11) Class1 local11 = this.aClass1_163.aClass1_214;
		if (this.aClass1_163 == local11) {
			this.aClass1_164 = null;
			return null;
		} else {
			this.aClass1_164 = local11.aClass1_214;
			return local11;
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Z)Lclient!rb;")
	public Class1 method2828() {
		@Pc(7) Class1 local7 = this.aClass1_163.aClass1_213;
		if (this.aClass1_163 == local7) {
			this.aClass1_164 = null;
			return null;
		} else {
			this.aClass1_164 = local7.aClass1_213;
			return local7;
		}
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(B)Lclient!rb;")
	public Class1 method2830() {
		@Pc(6) Class1 local6 = this.aClass1_164;
		if (this.aClass1_163 == local6) {
			this.aClass1_164 = null;
			return null;
		} else {
			this.aClass1_164 = local6.aClass1_214;
			return local6;
		}
	}

	@OriginalMember(owner = "client!s", name = "c", descriptor = "(B)V")
	public void method2831() {
		while (true) {
			@Pc(13) Class1 local13 = this.aClass1_163.aClass1_214;
			if (local13 == this.aClass1_163) {
				return;
			}
			local13.method3563();
		}
	}

	@OriginalMember(owner = "client!s", name = "c", descriptor = "(I)Lclient!rb;")
	public Class1 method2832() {
		@Pc(6) Class1 local6 = this.aClass1_164;
		if (local6 == this.aClass1_163) {
			this.aClass1_164 = null;
			return null;
		} else {
			this.aClass1_164 = local6.aClass1_213;
			return local6;
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!rb;BLclient!rb;)V")
	public void method2835(@OriginalArg(0) Class1 arg0, @OriginalArg(2) Class1 arg1) {
		if (arg0.aClass1_213 != null) {
			arg0.method3563();
		}
		arg0.aClass1_213 = arg1.aClass1_213;
		arg0.aClass1_214 = arg1;
		arg0.aClass1_213.aClass1_214 = arg0;
		arg0.aClass1_214.aClass1_213 = arg0;
	}
}
