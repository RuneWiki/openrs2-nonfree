import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public final class Class34 {

	@OriginalMember(owner = "client!ie", name = "E", descriptor = "Lclient!cd;")
	private Class2 aClass2_38;

	@OriginalMember(owner = "client!ie", name = "t", descriptor = "Lclient!cd;")
	public final Class2 aClass2_37 = new Class2();

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "()V")
	public Class34() {
		this.aClass2_37.aClass2_95 = this.aClass2_37;
		this.aClass2_37.aClass2_96 = this.aClass2_37;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)Lclient!cd;")
	public Class2 method866() {
		@Pc(6) Class2 local6 = this.aClass2_38;
		if (this.aClass2_37 == local6) {
			this.aClass2_38 = null;
			return null;
		} else {
			this.aClass2_38 = local6.aClass2_96;
			return local6;
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)Lclient!cd;")
	public Class2 method869() {
		@Pc(7) Class2 local7 = this.aClass2_37.aClass2_96;
		if (local7 == this.aClass2_37) {
			return null;
		} else {
			local7.method2045();
			return local7;
		}
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(I)V")
	public void method871() {
		while (true) {
			@Pc(12) Class2 local12 = this.aClass2_37.aClass2_95;
			if (local12 == this.aClass2_37) {
				return;
			}
			local12.method2045();
		}
	}

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "(I)Lclient!cd;")
	public Class2 method872() {
		@Pc(7) Class2 local7 = this.aClass2_37.aClass2_95;
		if (this.aClass2_37 == local7) {
			this.aClass2_38 = null;
			return null;
		} else {
			this.aClass2_38 = local7.aClass2_95;
			return local7;
		}
	}

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "(I)Lclient!cd;")
	public Class2 method873() {
		@Pc(3) Class2 local3 = this.aClass2_37.aClass2_95;
		if (this.aClass2_37 == local3) {
			return null;
		} else {
			local3.method2045();
			return local3;
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILclient!cd;Lclient!cd;)V")
	public void method875(@OriginalArg(1) Class2 arg0, @OriginalArg(2) Class2 arg1) {
		if (arg1.aClass2_96 != null) {
			arg1.method2045();
		}
		arg1.aClass2_95 = arg0;
		arg1.aClass2_96 = arg0.aClass2_96;
		arg1.aClass2_96.aClass2_95 = arg1;
		arg1.aClass2_95.aClass2_96 = arg1;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!cd;I)V")
	public void method876(@OriginalArg(0) Class2 arg0) {
		if (arg0.aClass2_96 != null) {
			arg0.method2045();
		}
		arg0.aClass2_95 = this.aClass2_37;
		arg0.aClass2_96 = this.aClass2_37.aClass2_96;
		arg0.aClass2_96.aClass2_95 = arg0;
		arg0.aClass2_95.aClass2_96 = arg0;
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(B)Lclient!cd;")
	public Class2 method877() {
		@Pc(3) Class2 local3 = this.aClass2_37.aClass2_96;
		if (local3 == this.aClass2_37) {
			this.aClass2_38 = null;
			return null;
		} else {
			this.aClass2_38 = local3.aClass2_96;
			return local3;
		}
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(Lclient!cd;I)V")
	public void method878(@OriginalArg(0) Class2 arg0) {
		if (arg0.aClass2_96 != null) {
			arg0.method2045();
		}
		arg0.aClass2_96 = this.aClass2_37;
		arg0.aClass2_95 = this.aClass2_37.aClass2_95;
		arg0.aClass2_96.aClass2_95 = arg0;
		arg0.aClass2_95.aClass2_96 = arg0;
	}

	@OriginalMember(owner = "client!ie", name = "e", descriptor = "(I)Lclient!cd;")
	public Class2 method879() {
		@Pc(6) Class2 local6 = this.aClass2_38;
		if (this.aClass2_37 == local6) {
			this.aClass2_38 = null;
			return null;
		} else {
			this.aClass2_38 = local6.aClass2_95;
			return local6;
		}
	}
}
