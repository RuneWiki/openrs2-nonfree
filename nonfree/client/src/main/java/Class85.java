import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fr")
public final class Class85 {

	@OriginalMember(owner = "client!fr", name = "n", descriptor = "Lclient!ea;")
	private Class7 aClass7_82;

	@OriginalMember(owner = "client!fr", name = "d", descriptor = "Lclient!ea;")
	public final Class7 aClass7_81 = new Class7();

	@OriginalMember(owner = "client!fr", name = "<init>", descriptor = "()V")
	public Class85() {
		this.aClass7_81.aClass7_262 = this.aClass7_81;
		this.aClass7_81.aClass7_261 = this.aClass7_81;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(I)Lclient!ea;")
	public Class7 method2000() {
		@Pc(14) Class7 local14 = this.aClass7_82;
		if (this.aClass7_81 == local14) {
			this.aClass7_82 = null;
			return null;
		} else {
			this.aClass7_82 = local14.aClass7_262;
			return local14;
		}
	}

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "(I)Lclient!ea;")
	public Class7 method2002() {
		@Pc(7) Class7 local7 = this.aClass7_81.aClass7_261;
		if (local7 == this.aClass7_81) {
			this.aClass7_82 = null;
			return null;
		} else {
			this.aClass7_82 = local7.aClass7_261;
			return local7;
		}
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(B)Lclient!ea;")
	public Class7 method2004() {
		@Pc(7) Class7 local7 = this.aClass7_81.aClass7_262;
		if (this.aClass7_81 == local7) {
			return null;
		} else {
			local7.method5802();
			return local7;
		}
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(Lclient!ea;B)V")
	public void method2006(@OriginalArg(0) Class7 arg0) {
		if (arg0.aClass7_261 != null) {
			arg0.method5802();
		}
		arg0.aClass7_261 = this.aClass7_81;
		arg0.aClass7_262 = this.aClass7_81.aClass7_262;
		arg0.aClass7_261.aClass7_262 = arg0;
		arg0.aClass7_262.aClass7_261 = arg0;
	}

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "(B)Z")
	public boolean method2007() {
		return this.aClass7_81.aClass7_262 == this.aClass7_81;
	}

	@OriginalMember(owner = "client!fr", name = "e", descriptor = "(I)V")
	public void method2008() {
		while (true) {
			@Pc(9) Class7 local9 = this.aClass7_81.aClass7_262;
			if (this.aClass7_81 == local9) {
				this.aClass7_82 = null;
				return;
			}
			local9.method5802();
		}
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(Lclient!fr;ILclient!ea;)V")
	private void method2009(@OriginalArg(0) Class85 arg0, @OriginalArg(2) Class7 arg1) {
		@Pc(7) Class7 local7 = this.aClass7_81.aClass7_261;
		this.aClass7_81.aClass7_261 = arg1.aClass7_261;
		arg1.aClass7_261.aClass7_262 = this.aClass7_81;
		if (this.aClass7_81 != arg1) {
			arg1.aClass7_261 = arg0.aClass7_81.aClass7_261;
			arg1.aClass7_261.aClass7_262 = arg1;
			local7.aClass7_262 = arg0.aClass7_81;
			arg0.aClass7_81.aClass7_261 = local7;
		}
	}

	@OriginalMember(owner = "client!fr", name = "f", descriptor = "(I)Lclient!ea;")
	public Class7 method2010() {
		@Pc(15) Class7 local15 = this.aClass7_81.aClass7_262;
		if (this.aClass7_81 == local15) {
			this.aClass7_82 = null;
			return null;
		} else {
			this.aClass7_82 = local15.aClass7_262;
			return local15;
		}
	}

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "(Lclient!ea;B)V")
	public void method2011(@OriginalArg(0) Class7 arg0) {
		if (arg0.aClass7_261 != null) {
			arg0.method5802();
		}
		arg0.aClass7_262 = this.aClass7_81;
		arg0.aClass7_261 = this.aClass7_81.aClass7_261;
		arg0.aClass7_261.aClass7_262 = arg0;
		arg0.aClass7_262.aClass7_261 = arg0;
	}

	@OriginalMember(owner = "client!fr", name = "c", descriptor = "(B)Lclient!ea;")
	public Class7 method2012() {
		@Pc(11) Class7 local11 = this.aClass7_82;
		if (local11 == this.aClass7_81) {
			this.aClass7_82 = null;
			return null;
		} else {
			this.aClass7_82 = local11.aClass7_261;
			return local11;
		}
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(Z)I")
	public int method2013() {
		@Pc(12) int local12 = 0;
		@Pc(16) Class7 local16 = this.aClass7_81.aClass7_262;
		while (local16 != this.aClass7_81) {
			local16 = local16.aClass7_262;
			local12++;
		}
		return local12;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(Lclient!fr;B)V")
	public void method2014(@OriginalArg(0) Class85 arg0) {
		this.method2009(arg0, this.aClass7_81.aClass7_262);
	}
}
