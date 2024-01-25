import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dm")
public final class Class73 {

	@OriginalMember(owner = "client!dm", name = "j", descriptor = "Lclient!ik;")
	private Class12 aClass12_48;

	@OriginalMember(owner = "client!dm", name = "h", descriptor = "Lclient!ik;")
	public final Class12 aClass12_47 = new Class12();

	static {
		new Class88("Unable to add friend - system busy.", "Der Freund konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un ami - système occupé.", "Não foi possível adicionar o amigo. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!dm", name = "<init>", descriptor = "()V")
	public Class73() {
		this.aClass12_47.aClass12_283 = this.aClass12_47;
		this.aClass12_47.aClass12_284 = this.aClass12_47;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(B)Lclient!ik;")
	public Class12 method2004() {
		@Pc(11) Class12 local11 = this.aClass12_48;
		if (local11 == this.aClass12_47) {
			this.aClass12_48 = null;
			return null;
		} else {
			this.aClass12_48 = local11.aClass12_284;
			return local11;
		}
	}

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "(B)Lclient!ik;")
	public Class12 method2005() {
		@Pc(12) Class12 local12 = this.aClass12_47.aClass12_283;
		if (local12 == this.aClass12_47) {
			this.aClass12_48 = null;
			return null;
		} else {
			this.aClass12_48 = local12.aClass12_283;
			return local12;
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lclient!dm;ILclient!ik;)V")
	private void method2006(@OriginalArg(0) Class73 arg0, @OriginalArg(2) Class12 arg1) {
		@Pc(7) Class12 local7 = this.aClass12_47.aClass12_284;
		this.aClass12_47.aClass12_284 = arg1.aClass12_284;
		arg1.aClass12_284.aClass12_283 = this.aClass12_47;
		if (this.aClass12_47 != arg1) {
			arg1.aClass12_284 = arg0.aClass12_47.aClass12_284;
			arg1.aClass12_284.aClass12_283 = arg1;
			local7.aClass12_283 = arg0.aClass12_47;
			arg0.aClass12_47.aClass12_284 = local7;
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)Lclient!ik;")
	public Class12 method2008() {
		@Pc(12) Class12 local12 = this.aClass12_47.aClass12_283;
		if (local12 == this.aClass12_47) {
			return null;
		} else {
			local12.method7967();
			return local12;
		}
	}

	@OriginalMember(owner = "client!dm", name = "c", descriptor = "(B)Lclient!ik;")
	public Class12 method2009() {
		@Pc(14) Class12 local14 = this.aClass12_48;
		if (this.aClass12_47 == local14) {
			this.aClass12_48 = null;
			return null;
		} else {
			this.aClass12_48 = local14.aClass12_283;
			return local14;
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lclient!dm;I)V")
	public void method2010(@OriginalArg(0) Class73 arg0) {
		this.method2006(arg0, this.aClass12_47.aClass12_283);
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(BLclient!ik;)V")
	public void method2011(@OriginalArg(1) Class12 arg0) {
		if (arg0.aClass12_284 != null) {
			arg0.method7967();
		}
		arg0.aClass12_283 = this.aClass12_47.aClass12_283;
		arg0.aClass12_284 = this.aClass12_47;
		arg0.aClass12_284.aClass12_283 = arg0;
		arg0.aClass12_283.aClass12_284 = arg0;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lclient!ik;I)V")
	public void method2012(@OriginalArg(0) Class12 arg0) {
		if (arg0.aClass12_284 != null) {
			arg0.method7967();
		}
		arg0.aClass12_284 = this.aClass12_47.aClass12_284;
		arg0.aClass12_283 = this.aClass12_47;
		arg0.aClass12_284.aClass12_283 = arg0;
		arg0.aClass12_283.aClass12_284 = arg0;
	}

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "(Z)I")
	public int method2013() {
		@Pc(7) int local7 = 0;
		for (@Pc(18) Class12 local18 = this.aClass12_47.aClass12_283; local18 != this.aClass12_47; local18 = local18.aClass12_283) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!dm", name = "c", descriptor = "(Z)V")
	public void method2014() {
		while (true) {
			@Pc(5) Class12 local5 = this.aClass12_47.aClass12_283;
			if (local5 == this.aClass12_47) {
				this.aClass12_48 = null;
				return;
			}
			local5.method7967();
		}
	}

	@OriginalMember(owner = "client!dm", name = "d", descriptor = "(B)Z")
	public boolean method2015() {
		return this.aClass12_47 == this.aClass12_47.aClass12_283;
	}

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "(I)Lclient!ik;")
	public Class12 method2016() {
		@Pc(7) Class12 local7 = this.aClass12_47.aClass12_284;
		if (local7 == this.aClass12_47) {
			this.aClass12_48 = null;
			return null;
		} else {
			this.aClass12_48 = local7.aClass12_284;
			return local7;
		}
	}
}
