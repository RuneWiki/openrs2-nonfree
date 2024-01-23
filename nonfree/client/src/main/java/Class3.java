import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ab")
public final class Class3 {

	@OriginalMember(owner = "client!ab", name = "r", descriptor = "Lclient!jg;")
	private Class1 aClass1_6;

	@OriginalMember(owner = "client!ab", name = "m", descriptor = "Lclient!jg;")
	public Class1 aClass1_5 = new Class1();

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "()V")
	public Class3() {
		this.aClass1_5.aClass1_212 = this.aClass1_5;
		this.aClass1_5.aClass1_213 = this.aClass1_5;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lclient!jg;B)V")
	public void method28(@OriginalArg(0) Class1 arg0) {
		if (arg0.aClass1_212 != null) {
			arg0.method4186();
		}
		arg0.aClass1_213 = this.aClass1_5;
		arg0.aClass1_212 = this.aClass1_5.aClass1_212;
		arg0.aClass1_212.aClass1_213 = arg0;
		arg0.aClass1_213.aClass1_212 = arg0;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)V")
	public void method29() {
		while (true) {
			@Pc(9) Class1 local9 = this.aClass1_5.aClass1_213;
			if (local9 == this.aClass1_5) {
				this.aClass1_6 = null;
				return;
			}
			local9.method4186();
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)Lclient!jg;")
	public Class1 method30() {
		@Pc(7) Class1 local7 = this.aClass1_5.aClass1_213;
		if (local7 == this.aClass1_5) {
			this.aClass1_6 = null;
			return null;
		} else {
			this.aClass1_6 = local7.aClass1_213;
			return local7;
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lclient!jg;I)V")
	public void method31(@OriginalArg(0) Class1 arg0) {
		if (arg0.aClass1_212 != null) {
			arg0.method4186();
		}
		arg0.aClass1_212 = this.aClass1_5;
		arg0.aClass1_213 = this.aClass1_5.aClass1_213;
		arg0.aClass1_212.aClass1_213 = arg0;
		arg0.aClass1_213.aClass1_212 = arg0;
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)Lclient!jg;")
	public Class1 method32() {
		@Pc(3) Class1 local3 = this.aClass1_5.aClass1_212;
		if (local3 == this.aClass1_5) {
			this.aClass1_6 = null;
			return null;
		} else {
			this.aClass1_6 = local3.aClass1_212;
			return local3;
		}
	}

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "(I)Lclient!jg;")
	public Class1 method33() {
		@Pc(6) Class1 local6 = this.aClass1_6;
		if (this.aClass1_5 == local6) {
			this.aClass1_6 = null;
			return null;
		} else {
			this.aClass1_6 = local6.aClass1_213;
			return local6;
		}
	}

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "(I)Lclient!jg;")
	public Class1 method34() {
		@Pc(13) Class1 local13 = this.aClass1_6;
		if (local13 == this.aClass1_5) {
			this.aClass1_6 = null;
			return null;
		} else {
			this.aClass1_6 = local13.aClass1_212;
			return local13;
		}
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(B)Lclient!jg;")
	public Class1 method37() {
		@Pc(3) Class1 local3 = this.aClass1_5.aClass1_213;
		if (local3 == this.aClass1_5) {
			return null;
		} else {
			local3.method4186();
			return local3;
		}
	}
}
