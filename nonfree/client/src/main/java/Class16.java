import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aq")
public final class Class16 {

	@OriginalMember(owner = "client!aq", name = "w", descriptor = "Lclient!pl;")
	private Class11 aClass11_10;

	@OriginalMember(owner = "client!aq", name = "t", descriptor = "Lclient!pl;")
	public final Class11 aClass11_9 = new Class11();

	@OriginalMember(owner = "client!aq", name = "<init>", descriptor = "()V")
	public Class16() {
		this.aClass11_9.aClass11_252 = this.aClass11_9;
		this.aClass11_9.aClass11_251 = this.aClass11_9;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(ILclient!pl;Lclient!aq;)V")
	private void method178(@OriginalArg(1) Class11 arg0, @OriginalArg(2) Class16 arg1) {
		@Pc(11) Class11 local11 = this.aClass11_9.aClass11_252;
		this.aClass11_9.aClass11_252 = arg0.aClass11_252;
		arg0.aClass11_252.aClass11_251 = this.aClass11_9;
		if (this.aClass11_9 != arg0) {
			arg0.aClass11_252 = arg1.aClass11_9.aClass11_252;
			arg0.aClass11_252.aClass11_251 = arg0;
			local11.aClass11_251 = arg1.aClass11_9;
			arg1.aClass11_9.aClass11_252 = local11;
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(I)Lclient!pl;")
	public Class11 method180() {
		@Pc(7) Class11 local7 = this.aClass11_9.aClass11_251;
		if (this.aClass11_9 == local7) {
			return null;
		} else {
			local7.method5701();
			return local7;
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(B)Lclient!pl;")
	public Class11 method181() {
		@Pc(7) Class11 local7 = this.aClass11_9.aClass11_252;
		if (this.aClass11_9 == local7) {
			this.aClass11_10 = null;
			return null;
		} else {
			this.aClass11_10 = local7.aClass11_252;
			return local7;
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lclient!aq;I)V")
	public void method182(@OriginalArg(0) Class16 arg0) {
		this.method178(this.aClass11_9.aClass11_251, arg0);
	}

	@OriginalMember(owner = "client!aq", name = "b", descriptor = "(B)I")
	public int method183() {
		@Pc(7) int local7 = 0;
		for (@Pc(11) Class11 local11 = this.aClass11_9.aClass11_251; local11 != this.aClass11_9; local11 = local11.aClass11_251) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lclient!pl;Z)V")
	public void method186(@OriginalArg(0) Class11 arg0) {
		if (arg0.aClass11_252 != null) {
			arg0.method5701();
		}
		arg0.aClass11_252 = this.aClass11_9;
		arg0.aClass11_251 = this.aClass11_9.aClass11_251;
		arg0.aClass11_252.aClass11_251 = arg0;
		arg0.aClass11_251.aClass11_252 = arg0;
	}

	@OriginalMember(owner = "client!aq", name = "b", descriptor = "(Z)Lclient!pl;")
	public Class11 method188() {
		@Pc(6) Class11 local6 = this.aClass11_10;
		if (this.aClass11_9 == local6) {
			this.aClass11_10 = null;
			return null;
		} else {
			this.aClass11_10 = local6.aClass11_251;
			return local6;
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lclient!pl;I)V")
	public void method190(@OriginalArg(0) Class11 arg0) {
		if (arg0.aClass11_252 != null) {
			arg0.method5701();
		}
		arg0.aClass11_251 = this.aClass11_9;
		arg0.aClass11_252 = this.aClass11_9.aClass11_252;
		arg0.aClass11_252.aClass11_251 = arg0;
		arg0.aClass11_251.aClass11_252 = arg0;
	}

	@OriginalMember(owner = "client!aq", name = "c", descriptor = "(Z)V")
	public void method191() {
		while (true) {
			@Pc(9) Class11 local9 = this.aClass11_9.aClass11_251;
			if (local9 == this.aClass11_9) {
				this.aClass11_10 = null;
				return;
			}
			local9.method5701();
		}
	}

	@OriginalMember(owner = "client!aq", name = "b", descriptor = "(I)Lclient!pl;")
	public Class11 method192() {
		@Pc(6) Class11 local6 = this.aClass11_10;
		if (this.aClass11_9 == local6) {
			this.aClass11_10 = null;
			return null;
		} else {
			this.aClass11_10 = local6.aClass11_252;
			return local6;
		}
	}

	@OriginalMember(owner = "client!aq", name = "c", descriptor = "(I)Lclient!pl;")
	public Class11 method193() {
		@Pc(12) Class11 local12 = this.aClass11_9.aClass11_251;
		if (local12 == this.aClass11_9) {
			this.aClass11_10 = null;
			return null;
		} else {
			this.aClass11_10 = local12.aClass11_251;
			return local12;
		}
	}

	@OriginalMember(owner = "client!aq", name = "d", descriptor = "(Z)Z")
	public boolean method194() {
		return this.aClass11_9 == this.aClass11_9.aClass11_251;
	}
}
