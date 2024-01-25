import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bb")
public final class Class16 {

	@OriginalMember(owner = "client!bb", name = "s", descriptor = "Lclient!pn;")
	private Class1 aClass1_26;

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "Lclient!pn;")
	public final Class1 aClass1_25 = new Class1();

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "()V")
	public Class16() {
		this.aClass1_25.aClass1_251 = this.aClass1_25;
		this.aClass1_25.aClass1_252 = this.aClass1_25;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)Lclient!pn;")
	public Class1 method408() {
		@Pc(7) Class1 local7 = this.aClass1_25.aClass1_252;
		if (local7 == this.aClass1_25) {
			return null;
		} else {
			local7.method5628();
			return local7;
		}
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)Lclient!pn;")
	public Class1 method409() {
		@Pc(6) Class1 local6 = this.aClass1_26;
		if (local6 == this.aClass1_25) {
			this.aClass1_26 = null;
			return null;
		} else {
			this.aClass1_26 = local6.aClass1_251;
			return local6;
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)Lclient!pn;")
	public Class1 method410() {
		@Pc(7) Class1 local7 = this.aClass1_25.aClass1_252;
		if (local7 == this.aClass1_25) {
			this.aClass1_26 = null;
			return null;
		} else {
			this.aClass1_26 = local7.aClass1_252;
			return local7;
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILclient!pn;)V")
	public void method411(@OriginalArg(1) Class1 arg0) {
		if (arg0.aClass1_251 != null) {
			arg0.method5628();
		}
		arg0.aClass1_252 = this.aClass1_25.aClass1_252;
		arg0.aClass1_251 = this.aClass1_25;
		arg0.aClass1_251.aClass1_252 = arg0;
		arg0.aClass1_252.aClass1_251 = arg0;
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(B)I")
	public int method414() {
		@Pc(5) int local5 = 0;
		for (@Pc(9) Class1 local9 = this.aClass1_25.aClass1_252; local9 != this.aClass1_25; local9 = local9.aClass1_252) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILclient!bb;)V")
	public void method415(@OriginalArg(1) Class16 arg0) {
		this.method423(this.aClass1_25.aClass1_252, arg0);
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(ZLclient!pn;)V")
	public void method416(@OriginalArg(1) Class1 arg0) {
		if (arg0.aClass1_251 != null) {
			arg0.method5628();
		}
		arg0.aClass1_252 = this.aClass1_25;
		arg0.aClass1_251 = this.aClass1_25.aClass1_251;
		arg0.aClass1_251.aClass1_252 = arg0;
		arg0.aClass1_252.aClass1_251 = arg0;
	}

	@OriginalMember(owner = "client!bb", name = "d", descriptor = "(I)Z")
	public boolean method418() {
		return this.aClass1_25.aClass1_252 == this.aClass1_25;
	}

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "(B)Lclient!pn;")
	public Class1 method419() {
		@Pc(10) Class1 local10 = this.aClass1_26;
		if (local10 == this.aClass1_25) {
			this.aClass1_26 = null;
			return null;
		} else {
			this.aClass1_26 = local10.aClass1_252;
			return local10;
		}
	}

	@OriginalMember(owner = "client!bb", name = "d", descriptor = "(B)Lclient!pn;")
	public Class1 method420() {
		@Pc(12) Class1 local12 = this.aClass1_25.aClass1_251;
		if (local12 == this.aClass1_25) {
			this.aClass1_26 = null;
			return null;
		} else {
			this.aClass1_26 = local12.aClass1_251;
			return local12;
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Z)V")
	public void method421() {
		while (true) {
			@Pc(5) Class1 local5 = this.aClass1_25.aClass1_252;
			if (local5 == this.aClass1_25) {
				this.aClass1_26 = null;
				return;
			}
			local5.method5628();
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!pn;ILclient!bb;)V")
	private void method423(@OriginalArg(0) Class1 arg0, @OriginalArg(2) Class16 arg1) {
		@Pc(12) Class1 local12 = this.aClass1_25.aClass1_251;
		this.aClass1_25.aClass1_251 = arg0.aClass1_251;
		arg0.aClass1_251.aClass1_252 = this.aClass1_25;
		if (this.aClass1_25 != arg0) {
			arg0.aClass1_251 = arg1.aClass1_25.aClass1_251;
			arg0.aClass1_251.aClass1_252 = arg0;
			arg1.aClass1_25.aClass1_251 = local12;
			local12.aClass1_252 = arg1.aClass1_25;
		}
	}
}
