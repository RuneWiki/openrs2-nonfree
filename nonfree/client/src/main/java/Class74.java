import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fi")
public final class Class74 {

	@OriginalMember(owner = "client!fi", name = "D", descriptor = "Lclient!s;")
	private Class7 aClass7_73;

	@OriginalMember(owner = "client!fi", name = "j", descriptor = "Lclient!s;")
	public final Class7 aClass7_72 = new Class7();

	@OriginalMember(owner = "client!fi", name = "<init>", descriptor = "()V")
	public Class74() {
		this.aClass7_72.aClass7_248 = this.aClass7_72;
		this.aClass7_72.aClass7_247 = this.aClass7_72;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!fi;B)V")
	public void method1789(@OriginalArg(0) Class74 arg0) {
		this.method1790(arg0, this.aClass7_72.aClass7_247);
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(BLclient!fi;Lclient!s;)V")
	private void method1790(@OriginalArg(1) Class74 arg0, @OriginalArg(2) Class7 arg1) {
		@Pc(12) Class7 local12 = this.aClass7_72.aClass7_248;
		this.aClass7_72.aClass7_248 = arg1.aClass7_248;
		arg1.aClass7_248.aClass7_247 = this.aClass7_72;
		if (this.aClass7_72 != arg1) {
			arg1.aClass7_248 = arg0.aClass7_72.aClass7_248;
			arg1.aClass7_248.aClass7_247 = arg1;
			local12.aClass7_247 = arg0.aClass7_72;
			arg0.aClass7_72.aClass7_248 = local12;
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Z)Lclient!s;")
	public Class7 method1792() {
		@Pc(12) Class7 local12 = this.aClass7_72.aClass7_247;
		if (local12 == this.aClass7_72) {
			return null;
		} else {
			local12.method5648();
			return local12;
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(B)Lclient!s;")
	public Class7 method1793() {
		@Pc(12) Class7 local12 = this.aClass7_72.aClass7_247;
		if (this.aClass7_72 == local12) {
			this.aClass7_73 = null;
			return null;
		} else {
			this.aClass7_73 = local12.aClass7_247;
			return local12;
		}
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)I")
	public int method1795() {
		@Pc(7) int local7 = 0;
		for (@Pc(11) Class7 local11 = this.aClass7_72.aClass7_247; local11 != this.aClass7_72; local11 = local11.aClass7_247) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "(I)Lclient!s;")
	public Class7 method1796() {
		@Pc(10) Class7 local10 = this.aClass7_73;
		if (this.aClass7_72 == local10) {
			this.aClass7_73 = null;
			return null;
		} else {
			this.aClass7_73 = local10.aClass7_248;
			return local10;
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(ZLclient!s;)V")
	public void method1797(@OriginalArg(1) Class7 arg0) {
		if (arg0.aClass7_248 != null) {
			arg0.method5648();
		}
		arg0.aClass7_247 = this.aClass7_72.aClass7_247;
		arg0.aClass7_248 = this.aClass7_72;
		arg0.aClass7_248.aClass7_247 = arg0;
		arg0.aClass7_247.aClass7_248 = arg0;
	}

	@OriginalMember(owner = "client!fi", name = "d", descriptor = "(I)Lclient!s;")
	public Class7 method1798() {
		@Pc(11) Class7 local11 = this.aClass7_73;
		if (local11 == this.aClass7_72) {
			this.aClass7_73 = null;
			return null;
		} else {
			this.aClass7_73 = local11.aClass7_247;
			return local11;
		}
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(B)Z")
	public boolean method1800() {
		return this.aClass7_72 == this.aClass7_72.aClass7_247;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!s;B)V")
	public void method1802(@OriginalArg(0) Class7 arg0) {
		if (arg0.aClass7_248 != null) {
			arg0.method5648();
		}
		arg0.aClass7_248 = this.aClass7_72.aClass7_248;
		arg0.aClass7_247 = this.aClass7_72;
		arg0.aClass7_248.aClass7_247 = arg0;
		arg0.aClass7_247.aClass7_248 = arg0;
	}

	@OriginalMember(owner = "client!fi", name = "e", descriptor = "(I)V")
	public void method1803() {
		while (true) {
			@Pc(7) Class7 local7 = this.aClass7_72.aClass7_247;
			if (this.aClass7_72 == local7) {
				this.aClass7_73 = null;
				return;
			}
			local7.method5648();
		}
	}

	@OriginalMember(owner = "client!fi", name = "f", descriptor = "(I)Lclient!s;")
	public Class7 method1805() {
		@Pc(12) Class7 local12 = this.aClass7_72.aClass7_248;
		if (local12 == this.aClass7_72) {
			this.aClass7_73 = null;
			return null;
		} else {
			this.aClass7_73 = local12.aClass7_248;
			return local12;
		}
	}
}
