import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cb")
public final class Class10 {

	@OriginalMember(owner = "client!cb", name = "z", descriptor = "Lclient!ub;")
	private Class2 aClass2_38;

	@OriginalMember(owner = "client!cb", name = "q", descriptor = "Lclient!ub;")
	public final Class2 aClass2_37 = new Class2();

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "()V")
	public Class10() {
		this.aClass2_37.aClass2_210 = this.aClass2_37;
		this.aClass2_37.aClass2_209 = this.aClass2_37;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)Lclient!ub;")
	public Class2 method444() {
		@Pc(7) Class2 local7 = this.aClass2_37.aClass2_210;
		if (this.aClass2_37 == local7) {
			this.aClass2_38 = null;
			return null;
		} else {
			this.aClass2_38 = local7.aClass2_210;
			return local7;
		}
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)Lclient!ub;")
	public Class2 method446() {
		@Pc(13) Class2 local13 = this.aClass2_37.aClass2_209;
		if (this.aClass2_37 == local13) {
			this.aClass2_38 = null;
			return null;
		} else {
			this.aClass2_38 = local13.aClass2_209;
			return local13;
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!ub;Z)V")
	public void method447(@OriginalArg(0) Class2 arg0) {
		if (arg0.aClass2_209 != null) {
			arg0.method3004();
		}
		arg0.aClass2_210 = this.aClass2_37.aClass2_210;
		arg0.aClass2_209 = this.aClass2_37;
		arg0.aClass2_209.aClass2_210 = arg0;
		arg0.aClass2_210.aClass2_209 = arg0;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILclient!ub;)V")
	public void method448(@OriginalArg(1) Class2 arg0) {
		if (arg0.aClass2_209 != null) {
			arg0.method3004();
		}
		arg0.aClass2_209 = this.aClass2_37.aClass2_209;
		arg0.aClass2_210 = this.aClass2_37;
		arg0.aClass2_209.aClass2_210 = arg0;
		arg0.aClass2_210.aClass2_209 = arg0;
	}

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "(I)Lclient!ub;")
	public Class2 method449() {
		@Pc(12) Class2 local12 = this.aClass2_37.aClass2_210;
		if (local12 == this.aClass2_37) {
			return null;
		} else {
			local12.method3004();
			return local12;
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!ub;Lclient!ub;I)V")
	public void method450(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class2 arg1) {
		if (arg1.aClass2_209 != null) {
			arg1.method3004();
		}
		arg1.aClass2_209 = arg0.aClass2_209;
		arg1.aClass2_210 = arg0;
		arg1.aClass2_209.aClass2_210 = arg1;
		arg1.aClass2_210.aClass2_209 = arg1;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)Lclient!ub;")
	public Class2 method451() {
		@Pc(6) Class2 local6 = this.aClass2_38;
		if (this.aClass2_37 == local6) {
			this.aClass2_38 = null;
			return null;
		} else {
			this.aClass2_38 = local6.aClass2_210;
			return local6;
		}
	}

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "(I)Lclient!ub;")
	public Class2 method452() {
		@Pc(6) Class2 local6 = this.aClass2_38;
		if (local6 == this.aClass2_37) {
			this.aClass2_38 = null;
			return null;
		} else {
			this.aClass2_38 = local6.aClass2_209;
			return local6;
		}
	}

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "(I)V")
	public void method454() {
		while (true) {
			@Pc(12) Class2 local12 = this.aClass2_37.aClass2_210;
			if (local12 == this.aClass2_37) {
				return;
			}
			local12.method3004();
		}
	}
}
