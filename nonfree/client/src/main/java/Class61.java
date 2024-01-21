import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pb")
public final class Class61 {

	@OriginalMember(owner = "client!pb", name = "v", descriptor = "Lclient!vd;")
	private Class4 aClass4_86;

	@OriginalMember(owner = "client!pb", name = "i", descriptor = "Lclient!vd;")
	public final Class4 aClass4_85 = new Class4();

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "()V")
	public Class61() {
		this.aClass4_85.aClass4_124 = this.aClass4_85;
		this.aClass4_85.aClass4_123 = this.aClass4_85;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)Lclient!vd;")
	public Class4 method1627() {
		@Pc(6) Class4 local6 = this.aClass4_86;
		if (local6 == this.aClass4_85) {
			this.aClass4_86 = null;
			return null;
		} else {
			this.aClass4_86 = local6.aClass4_124;
			return local6;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)Lclient!vd;")
	public Class4 method1628() {
		@Pc(7) Class4 local7 = this.aClass4_85.aClass4_123;
		if (local7 == this.aClass4_85) {
			this.aClass4_86 = null;
			return null;
		} else {
			this.aClass4_86 = local7.aClass4_123;
			return local7;
		}
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(B)Lclient!vd;")
	public Class4 method1629() {
		@Pc(2) Class4 local2 = this.aClass4_86;
		if (local2 == this.aClass4_85) {
			this.aClass4_86 = null;
			return null;
		} else {
			this.aClass4_86 = local2.aClass4_123;
			return local2;
		}
	}

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "(B)Lclient!vd;")
	public Class4 method1631() {
		@Pc(15) Class4 local15 = this.aClass4_85.aClass4_124;
		if (this.aClass4_85 == local15) {
			return null;
		} else {
			local15.method2189();
			return local15;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!vd;Z)V")
	public void method1632(@OriginalArg(0) Class4 arg0) {
		if (arg0.aClass4_124 != null) {
			arg0.method2189();
		}
		arg0.aClass4_123 = this.aClass4_85.aClass4_123;
		arg0.aClass4_124 = this.aClass4_85;
		arg0.aClass4_124.aClass4_123 = arg0;
		arg0.aClass4_123.aClass4_124 = arg0;
	}

	@OriginalMember(owner = "client!pb", name = "d", descriptor = "(B)V")
	public void method1633() {
		while (true) {
			@Pc(12) Class4 local12 = this.aClass4_85.aClass4_123;
			if (local12 == this.aClass4_85) {
				return;
			}
			local12.method2189();
		}
	}

	@OriginalMember(owner = "client!pb", name = "e", descriptor = "(B)Lclient!vd;")
	public Class4 method1634() {
		@Pc(7) Class4 local7 = this.aClass4_85.aClass4_124;
		if (this.aClass4_85 == local7) {
			this.aClass4_86 = null;
			return null;
		} else {
			this.aClass4_86 = local7.aClass4_124;
			return local7;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!vd;B)V")
	public void method1635(@OriginalArg(0) Class4 arg0) {
		if (arg0.aClass4_124 != null) {
			arg0.method2189();
		}
		arg0.aClass4_123 = this.aClass4_85;
		arg0.aClass4_124 = this.aClass4_85.aClass4_124;
		arg0.aClass4_124.aClass4_123 = arg0;
		arg0.aClass4_123.aClass4_124 = arg0;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILclient!vd;Lclient!vd;)V")
	public void method1637(@OriginalArg(1) Class4 arg0, @OriginalArg(2) Class4 arg1) {
		if (arg0.aClass4_124 != null) {
			arg0.method2189();
		}
		arg0.aClass4_123 = arg1;
		arg0.aClass4_124 = arg1.aClass4_124;
		arg0.aClass4_124.aClass4_123 = arg0;
		arg0.aClass4_123.aClass4_124 = arg0;
	}

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "(I)Lclient!vd;")
	public Class4 method1641() {
		@Pc(7) Class4 local7 = this.aClass4_85.aClass4_123;
		if (this.aClass4_85 == local7) {
			return null;
		} else {
			local7.method2189();
			return local7;
		}
	}
}
