import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ad")
public final class Class4 {

	@OriginalMember(owner = "client!ad", name = "u", descriptor = "Lclient!jd;")
	private Class1 aClass1_12;

	@OriginalMember(owner = "client!ad", name = "q", descriptor = "Lclient!jd;")
	public final Class1 aClass1_11 = new Class1();

	@OriginalMember(owner = "client!ad", name = "<init>", descriptor = "()V")
	public Class4() {
		this.aClass1_11.aClass1_213 = this.aClass1_11;
		this.aClass1_11.aClass1_214 = this.aClass1_11;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)Lclient!jd;")
	public Class1 method173() {
		@Pc(7) Class1 local7 = this.aClass1_11.aClass1_213;
		if (this.aClass1_11 == local7) {
			return null;
		} else {
			local7.method3499();
			return local7;
		}
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)Lclient!jd;")
	public Class1 method174() {
		@Pc(15) Class1 local15 = this.aClass1_11.aClass1_213;
		if (local15 == this.aClass1_11) {
			this.aClass1_12 = null;
			return null;
		} else {
			this.aClass1_12 = local15.aClass1_213;
			return local15;
		}
	}

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "(I)Lclient!jd;")
	public Class1 method175() {
		@Pc(11) Class1 local11 = this.aClass1_12;
		if (local11 == this.aClass1_11) {
			this.aClass1_12 = null;
			return null;
		} else {
			this.aClass1_12 = local11.aClass1_214;
			return local11;
		}
	}

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "(I)Lclient!jd;")
	public Class1 method176() {
		@Pc(7) Class1 local7 = this.aClass1_11.aClass1_214;
		if (this.aClass1_11 == local7) {
			this.aClass1_12 = null;
			return null;
		} else {
			this.aClass1_12 = local7.aClass1_214;
			return local7;
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ZLclient!jd;Lclient!jd;)V")
	public void method178(@OriginalArg(1) Class1 arg0, @OriginalArg(2) Class1 arg1) {
		if (arg1.aClass1_214 != null) {
			arg1.method3499();
		}
		arg1.aClass1_213 = arg0;
		arg1.aClass1_214 = arg0.aClass1_214;
		arg1.aClass1_214.aClass1_213 = arg1;
		arg1.aClass1_213.aClass1_214 = arg1;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILclient!jd;)V")
	public void method179(@OriginalArg(1) Class1 arg0) {
		if (arg0.aClass1_214 != null) {
			arg0.method3499();
		}
		arg0.aClass1_213 = this.aClass1_11;
		arg0.aClass1_214 = this.aClass1_11.aClass1_214;
		arg0.aClass1_214.aClass1_213 = arg0;
		arg0.aClass1_213.aClass1_214 = arg0;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!jd;I)V")
	public void method180(@OriginalArg(0) Class1 arg0) {
		if (arg0.aClass1_214 != null) {
			arg0.method3499();
		}
		arg0.aClass1_214 = this.aClass1_11;
		arg0.aClass1_213 = this.aClass1_11.aClass1_213;
		arg0.aClass1_214.aClass1_213 = arg0;
		arg0.aClass1_213.aClass1_214 = arg0;
	}

	@OriginalMember(owner = "client!ad", name = "e", descriptor = "(I)Lclient!jd;")
	public Class1 method181() {
		@Pc(11) Class1 local11 = this.aClass1_12;
		if (this.aClass1_11 == local11) {
			this.aClass1_12 = null;
			return null;
		} else {
			this.aClass1_12 = local11.aClass1_213;
			return local11;
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V")
	public void method182() {
		while (true) {
			@Pc(12) Class1 local12 = this.aClass1_11.aClass1_213;
			if (this.aClass1_11 == local12) {
				return;
			}
			local12.method3499();
		}
	}
}
