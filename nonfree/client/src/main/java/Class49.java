import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!m")
public final class Class49 {

	@OriginalMember(owner = "client!m", name = "r", descriptor = "Lclient!qe;")
	private Class8 aClass8_76;

	@OriginalMember(owner = "client!m", name = "h", descriptor = "Lclient!qe;")
	public final Class8 aClass8_75 = new Class8();

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "()V")
	public Class49() {
		this.aClass8_75.aClass8_127 = this.aClass8_75;
		this.aClass8_75.aClass8_128 = this.aClass8_75;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(ZLclient!qe;)V")
	public void method1104(@OriginalArg(1) Class8 arg0) {
		if (arg0.aClass8_127 != null) {
			arg0.method2013();
		}
		arg0.aClass8_128 = this.aClass8_75.aClass8_128;
		arg0.aClass8_127 = this.aClass8_75;
		arg0.aClass8_127.aClass8_128 = arg0;
		arg0.aClass8_128.aClass8_127 = arg0;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V")
	public void method1105() {
		while (true) {
			@Pc(15) Class8 local15 = this.aClass8_75.aClass8_128;
			if (local15 == this.aClass8_75) {
				return;
			}
			local15.method2013();
		}
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(I)Lclient!qe;")
	public Class8 method1107() {
		@Pc(11) Class8 local11 = this.aClass8_75.aClass8_128;
		if (local11 == this.aClass8_75) {
			this.aClass8_76 = null;
			return null;
		} else {
			this.aClass8_76 = local11.aClass8_128;
			return local11;
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Z)Lclient!qe;")
	public Class8 method1108() {
		@Pc(12) Class8 local12 = this.aClass8_75.aClass8_127;
		if (this.aClass8_75 == local12) {
			return null;
		} else {
			local12.method2013();
			return local12;
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(B)Lclient!qe;")
	public Class8 method1109() {
		@Pc(11) Class8 local11 = this.aClass8_76;
		if (local11 == this.aClass8_75) {
			this.aClass8_76 = null;
			return null;
		} else {
			this.aClass8_76 = local11.aClass8_128;
			return local11;
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(ILclient!qe;Lclient!qe;)V")
	public void method1110(@OriginalArg(1) Class8 arg0, @OriginalArg(2) Class8 arg1) {
		if (arg1.aClass8_127 != null) {
			arg1.method2013();
		}
		arg1.aClass8_127 = arg0.aClass8_127;
		arg1.aClass8_128 = arg0;
		arg1.aClass8_127.aClass8_128 = arg1;
		arg1.aClass8_128.aClass8_127 = arg1;
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(B)Lclient!qe;")
	public Class8 method1112() {
		@Pc(12) Class8 local12 = this.aClass8_75.aClass8_127;
		if (local12 == this.aClass8_75) {
			this.aClass8_76 = null;
			return null;
		} else {
			this.aClass8_76 = local12.aClass8_127;
			return local12;
		}
	}

	@OriginalMember(owner = "client!m", name = "c", descriptor = "(I)Lclient!qe;")
	public Class8 method1113() {
		@Pc(6) Class8 local6 = this.aClass8_76;
		if (local6 == this.aClass8_75) {
			this.aClass8_76 = null;
			return null;
		} else {
			this.aClass8_76 = local6.aClass8_127;
			return local6;
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Lclient!qe;B)V")
	public void method1114(@OriginalArg(0) Class8 arg0) {
		if (arg0.aClass8_127 != null) {
			arg0.method2013();
		}
		arg0.aClass8_127 = this.aClass8_75.aClass8_127;
		arg0.aClass8_128 = this.aClass8_75;
		arg0.aClass8_127.aClass8_128 = arg0;
		arg0.aClass8_128.aClass8_127 = arg0;
	}

	@OriginalMember(owner = "client!m", name = "d", descriptor = "(I)Lclient!qe;")
	public Class8 method1116() {
		@Pc(11) Class8 local11 = this.aClass8_75.aClass8_128;
		if (this.aClass8_75 == local11) {
			return null;
		} else {
			local11.method2013();
			return local11;
		}
	}
}
