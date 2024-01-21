import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!n")
public final class Class56 {

	@OriginalMember(owner = "client!n", name = "l", descriptor = "Lclient!hb;")
	private Class1 aClass1_126;

	@OriginalMember(owner = "client!n", name = "f", descriptor = "Lclient!hb;")
	public final Class1 aClass1_125 = new Class1();

	@OriginalMember(owner = "client!n", name = "<init>", descriptor = "()V")
	public Class56() {
		this.aClass1_125.aClass1_209 = this.aClass1_125;
		this.aClass1_125.aClass1_210 = this.aClass1_125;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(ILclient!hb;Lclient!hb;)V")
	public void method1845(@OriginalArg(1) Class1 arg0, @OriginalArg(2) Class1 arg1) {
		if (arg1.aClass1_209 != null) {
			arg1.method3141();
		}
		arg1.aClass1_210 = arg0;
		arg1.aClass1_209 = arg0.aClass1_209;
		arg1.aClass1_209.aClass1_210 = arg1;
		arg1.aClass1_210.aClass1_209 = arg1;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(I)Lclient!hb;")
	public Class1 method1847() {
		@Pc(11) Class1 local11 = this.aClass1_126;
		if (local11 == this.aClass1_125) {
			this.aClass1_126 = null;
			return null;
		} else {
			this.aClass1_126 = local11.aClass1_209;
			return local11;
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(B)Lclient!hb;")
	public Class1 method1849() {
		@Pc(14) Class1 local14 = this.aClass1_125.aClass1_209;
		if (local14 == this.aClass1_125) {
			this.aClass1_126 = null;
			return null;
		} else {
			this.aClass1_126 = local14.aClass1_209;
			return local14;
		}
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(I)V")
	public void method1851() {
		while (true) {
			@Pc(12) Class1 local12 = this.aClass1_125.aClass1_210;
			if (local12 == this.aClass1_125) {
				return;
			}
			local12.method3141();
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Lclient!hb;I)V")
	public void method1852(@OriginalArg(0) Class1 arg0) {
		if (arg0.aClass1_209 != null) {
			arg0.method3141();
		}
		arg0.aClass1_210 = this.aClass1_125.aClass1_210;
		arg0.aClass1_209 = this.aClass1_125;
		arg0.aClass1_209.aClass1_210 = arg0;
		arg0.aClass1_210.aClass1_209 = arg0;
	}

	@OriginalMember(owner = "client!n", name = "c", descriptor = "(I)Lclient!hb;")
	public Class1 method1853() {
		@Pc(7) Class1 local7 = this.aClass1_125.aClass1_210;
		if (this.aClass1_125 == local7) {
			this.aClass1_126 = null;
			return null;
		} else {
			this.aClass1_126 = local7.aClass1_210;
			return local7;
		}
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(B)Lclient!hb;")
	public Class1 method1855() {
		@Pc(6) Class1 local6 = this.aClass1_126;
		if (this.aClass1_125 == local6) {
			this.aClass1_126 = null;
			return null;
		} else {
			this.aClass1_126 = local6.aClass1_210;
			return local6;
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(ILclient!hb;)V")
	public void method1856(@OriginalArg(1) Class1 arg0) {
		if (arg0.aClass1_209 != null) {
			arg0.method3141();
		}
		arg0.aClass1_210 = this.aClass1_125;
		arg0.aClass1_209 = this.aClass1_125.aClass1_209;
		arg0.aClass1_209.aClass1_210 = arg0;
		arg0.aClass1_210.aClass1_209 = arg0;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Z)Lclient!hb;")
	public Class1 method1857() {
		@Pc(7) Class1 local7 = this.aClass1_125.aClass1_210;
		if (this.aClass1_125 == local7) {
			return null;
		} else {
			local7.method3141();
			return local7;
		}
	}
}
