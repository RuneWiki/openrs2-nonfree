import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rc")
public final class Class61 {

	@OriginalMember(owner = "client!rc", name = "A", descriptor = "Lclient!ce;")
	private Class1 aClass1_106;

	@OriginalMember(owner = "client!rc", name = "u", descriptor = "Lclient!ce;")
	public final Class1 aClass1_105 = new Class1();

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "()V")
	public Class61() {
		this.aClass1_105.aClass1_128 = this.aClass1_105;
		this.aClass1_105.aClass1_127 = this.aClass1_105;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)Lclient!ce;")
	public Class1 method1748() {
		@Pc(15) Class1 local15 = this.aClass1_105.aClass1_127;
		if (local15 == this.aClass1_105) {
			this.aClass1_106 = null;
			return null;
		} else {
			this.aClass1_106 = local15.aClass1_127;
			return local15;
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)Lclient!ce;")
	public Class1 method1750() {
		@Pc(6) Class1 local6 = this.aClass1_106;
		if (local6 == this.aClass1_105) {
			this.aClass1_106 = null;
			return null;
		} else {
			this.aClass1_106 = local6.aClass1_128;
			return local6;
		}
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(I)Lclient!ce;")
	public Class1 method1753() {
		@Pc(7) Class1 local7 = this.aClass1_105.aClass1_128;
		if (this.aClass1_105 == local7) {
			this.aClass1_106 = null;
			return null;
		} else {
			this.aClass1_106 = local7.aClass1_128;
			return local7;
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILclient!ce;)V")
	public void method1754(@OriginalArg(1) Class1 arg0) {
		if (arg0.aClass1_128 != null) {
			arg0.method2050();
		}
		arg0.aClass1_128 = this.aClass1_105.aClass1_128;
		arg0.aClass1_127 = this.aClass1_105;
		arg0.aClass1_128.aClass1_127 = arg0;
		arg0.aClass1_127.aClass1_128 = arg0;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!ce;Z)V")
	public void method1755(@OriginalArg(0) Class1 arg0) {
		if (arg0.aClass1_128 != null) {
			arg0.method2050();
		}
		arg0.aClass1_127 = this.aClass1_105.aClass1_127;
		arg0.aClass1_128 = this.aClass1_105;
		arg0.aClass1_128.aClass1_127 = arg0;
		arg0.aClass1_127.aClass1_128 = arg0;
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(B)Lclient!ce;")
	public Class1 method1756() {
		@Pc(7) Class1 local7 = this.aClass1_105.aClass1_127;
		if (this.aClass1_105 == local7) {
			return null;
		} else {
			local7.method2050();
			return local7;
		}
	}

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "(B)Lclient!ce;")
	public Class1 method1758() {
		@Pc(9) Class1 local9 = this.aClass1_105.aClass1_128;
		if (this.aClass1_105 == local9) {
			return null;
		} else {
			local9.method2050();
			return local9;
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!ce;ILclient!ce;)V")
	public void method1759(@OriginalArg(0) Class1 arg0, @OriginalArg(2) Class1 arg1) {
		if (arg1.aClass1_128 != null) {
			arg1.method2050();
		}
		arg1.aClass1_127 = arg0;
		arg1.aClass1_128 = arg0.aClass1_128;
		arg1.aClass1_128.aClass1_127 = arg1;
		arg1.aClass1_127.aClass1_128 = arg1;
	}

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "(I)Lclient!ce;")
	public Class1 method1760() {
		@Pc(13) Class1 local13 = this.aClass1_106;
		if (this.aClass1_105 == local13) {
			this.aClass1_106 = null;
			return null;
		} else {
			this.aClass1_106 = local13.aClass1_127;
			return local13;
		}
	}

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "(I)V")
	public void method1761() {
		while (true) {
			@Pc(13) Class1 local13 = this.aClass1_105.aClass1_127;
			if (local13 == this.aClass1_105) {
				return;
			}
			local13.method2050();
		}
	}
}
