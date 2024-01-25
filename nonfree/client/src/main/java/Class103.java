import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jm")
public final class Class103 {

	@OriginalMember(owner = "client!jm", name = "p", descriptor = "Lclient!vi;")
	private Class5 aClass5_115;

	@OriginalMember(owner = "client!jm", name = "l", descriptor = "Lclient!vi;")
	public final Class5 aClass5_114 = new Class5();

	@OriginalMember(owner = "client!jm", name = "<init>", descriptor = "()V")
	public Class103() {
		this.aClass5_114.aClass5_252 = this.aClass5_114;
		this.aClass5_114.aClass5_251 = this.aClass5_114;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(B)Lclient!vi;")
	public Class5 method2743() {
		@Pc(7) Class5 local7 = this.aClass5_114.aClass5_251;
		if (local7 == this.aClass5_114) {
			return null;
		} else {
			local7.method6005();
			return local7;
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lclient!jm;I)V")
	public void method2744(@OriginalArg(0) Class103 arg0) {
		this.method2747(this.aClass5_114.aClass5_251, arg0);
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(ILclient!vi;)V")
	public void method2745(@OriginalArg(1) Class5 arg0) {
		if (arg0.aClass5_252 != null) {
			arg0.method6005();
		}
		arg0.aClass5_251 = this.aClass5_114;
		arg0.aClass5_252 = this.aClass5_114.aClass5_252;
		arg0.aClass5_252.aClass5_251 = arg0;
		arg0.aClass5_251.aClass5_252 = arg0;
	}

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "(B)Lclient!vi;")
	public Class5 method2746() {
		@Pc(12) Class5 local12 = this.aClass5_114.aClass5_252;
		if (this.aClass5_114 == local12) {
			this.aClass5_115 = null;
			return null;
		} else {
			this.aClass5_115 = local12.aClass5_252;
			return local12;
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lclient!vi;ZLclient!jm;)V")
	private void method2747(@OriginalArg(0) Class5 arg0, @OriginalArg(2) Class103 arg1) {
		@Pc(7) Class5 local7 = this.aClass5_114.aClass5_252;
		this.aClass5_114.aClass5_252 = arg0.aClass5_252;
		arg0.aClass5_252.aClass5_251 = this.aClass5_114;
		if (arg0 != this.aClass5_114) {
			arg0.aClass5_252 = arg1.aClass5_114.aClass5_252;
			arg0.aClass5_252.aClass5_251 = arg0;
			local7.aClass5_251 = arg1.aClass5_114;
			arg1.aClass5_114.aClass5_252 = local7;
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(Z)Lclient!vi;")
	public Class5 method2748() {
		@Pc(6) Class5 local6 = this.aClass5_115;
		if (this.aClass5_114 == local6) {
			this.aClass5_115 = null;
			return null;
		} else {
			this.aClass5_115 = local6.aClass5_251;
			return local6;
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)Z")
	public boolean method2750() {
		return this.aClass5_114 == this.aClass5_114.aClass5_251;
	}

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "(I)V")
	public void method2751() {
		while (true) {
			@Pc(3) Class5 local3 = this.aClass5_114.aClass5_251;
			if (local3 == this.aClass5_114) {
				this.aClass5_115 = null;
				return;
			}
			local3.method6005();
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lclient!vi;Z)V")
	public void method2752(@OriginalArg(0) Class5 arg0) {
		if (arg0.aClass5_252 != null) {
			arg0.method6005();
		}
		arg0.aClass5_252 = this.aClass5_114;
		arg0.aClass5_251 = this.aClass5_114.aClass5_251;
		arg0.aClass5_252.aClass5_251 = arg0;
		arg0.aClass5_251.aClass5_252 = arg0;
	}

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "(Z)I")
	public int method2753() {
		@Pc(7) int local7 = 0;
		@Pc(16) Class5 local16 = this.aClass5_114.aClass5_251;
		while (local16 != this.aClass5_114) {
			local16 = local16.aClass5_251;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!jm", name = "c", descriptor = "(I)Lclient!vi;")
	public Class5 method2754() {
		@Pc(6) Class5 local6 = this.aClass5_115;
		if (this.aClass5_114 == local6) {
			this.aClass5_115 = null;
			return null;
		} else {
			this.aClass5_115 = local6.aClass5_252;
			return local6;
		}
	}

	@OriginalMember(owner = "client!jm", name = "d", descriptor = "(I)Lclient!vi;")
	public Class5 method2756() {
		@Pc(7) Class5 local7 = this.aClass5_114.aClass5_251;
		if (local7 == this.aClass5_114) {
			this.aClass5_115 = null;
			return null;
		} else {
			this.aClass5_115 = local7.aClass5_251;
			return local7;
		}
	}
}
