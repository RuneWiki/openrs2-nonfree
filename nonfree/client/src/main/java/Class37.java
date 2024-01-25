import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bv")
public final class Class37 {

	@OriginalMember(owner = "client!bv", name = "l", descriptor = "Lclient!um;")
	private Class1 aClass1_48;

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "Lclient!um;")
	public final Class1 aClass1_47 = new Class1();

	static {
		new Class306("Unable to send message - system busy.", "Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.", "Impossible d'envoyer un message - système occupé.", "Não foi possível enviar a mensagem. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!bv", name = "<init>", descriptor = "()V")
	public Class37() {
		this.aClass1_47.aClass1_283 = this.aClass1_47;
		this.aClass1_47.aClass1_284 = this.aClass1_47;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(Z)I")
	public int method965() {
		@Pc(7) int local7 = 0;
		@Pc(11) Class1 local11 = this.aClass1_47.aClass1_284;
		while (this.aClass1_47 != local11) {
			local11 = local11.aClass1_284;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(I)Lclient!um;")
	public Class1 method966() {
		@Pc(6) Class1 local6 = this.aClass1_48;
		if (local6 == this.aClass1_47) {
			this.aClass1_48 = null;
			return null;
		} else {
			this.aClass1_48 = local6.aClass1_283;
			return local6;
		}
	}

	@OriginalMember(owner = "client!bv", name = "b", descriptor = "(I)V")
	public void method967() {
		while (true) {
			@Pc(13) Class1 local13 = this.aClass1_47.aClass1_284;
			if (this.aClass1_47 == local13) {
				this.aClass1_48 = null;
				return;
			}
			local13.method7525();
		}
	}

	@OriginalMember(owner = "client!bv", name = "b", descriptor = "(Z)Z")
	public boolean method968() {
		return this.aClass1_47 == this.aClass1_47.aClass1_284;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lclient!um;Z)V")
	public void method970(@OriginalArg(0) Class1 arg0) {
		if (arg0.aClass1_283 != null) {
			arg0.method7525();
		}
		arg0.aClass1_284 = this.aClass1_47;
		arg0.aClass1_283 = this.aClass1_47.aClass1_283;
		arg0.aClass1_283.aClass1_284 = arg0;
		arg0.aClass1_284.aClass1_283 = arg0;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(B)Lclient!um;")
	public Class1 method971() {
		@Pc(11) Class1 local11 = this.aClass1_48;
		if (this.aClass1_47 == local11) {
			this.aClass1_48 = null;
			return null;
		} else {
			this.aClass1_48 = local11.aClass1_284;
			return local11;
		}
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lclient!bv;I)V")
	public void method972(@OriginalArg(0) Class37 arg0) {
		this.method975(this.aClass1_47.aClass1_284, arg0);
	}

	@OriginalMember(owner = "client!bv", name = "c", descriptor = "(I)Lclient!um;")
	public Class1 method973() {
		@Pc(13) Class1 local13 = this.aClass1_47.aClass1_284;
		if (this.aClass1_47 == local13) {
			return null;
		} else {
			local13.method7525();
			return local13;
		}
	}

	@OriginalMember(owner = "client!bv", name = "d", descriptor = "(I)Lclient!um;")
	public Class1 method974() {
		@Pc(14) Class1 local14 = this.aClass1_47.aClass1_283;
		if (local14 == this.aClass1_47) {
			this.aClass1_48 = null;
			return null;
		} else {
			this.aClass1_48 = local14.aClass1_283;
			return local14;
		}
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lclient!um;BLclient!bv;)V")
	private void method975(@OriginalArg(0) Class1 arg0, @OriginalArg(2) Class37 arg1) {
		@Pc(15) Class1 local15 = this.aClass1_47.aClass1_283;
		this.aClass1_47.aClass1_283 = arg0.aClass1_283;
		arg0.aClass1_283.aClass1_284 = this.aClass1_47;
		if (arg0 != this.aClass1_47) {
			arg0.aClass1_283 = arg1.aClass1_47.aClass1_283;
			arg0.aClass1_283.aClass1_284 = arg0;
			arg1.aClass1_47.aClass1_283 = local15;
			local15.aClass1_284 = arg1.aClass1_47;
		}
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lclient!um;B)V")
	public void method976(@OriginalArg(0) Class1 arg0) {
		if (arg0.aClass1_283 != null) {
			arg0.method7525();
		}
		arg0.aClass1_283 = this.aClass1_47;
		arg0.aClass1_284 = this.aClass1_47.aClass1_284;
		arg0.aClass1_283.aClass1_284 = arg0;
		arg0.aClass1_284.aClass1_283 = arg0;
	}

	@OriginalMember(owner = "client!bv", name = "b", descriptor = "(B)Lclient!um;")
	public Class1 method977() {
		@Pc(12) Class1 local12 = this.aClass1_47.aClass1_284;
		if (local12 == this.aClass1_47) {
			this.aClass1_48 = null;
			return null;
		} else {
			this.aClass1_48 = local12.aClass1_284;
			return local12;
		}
	}
}
