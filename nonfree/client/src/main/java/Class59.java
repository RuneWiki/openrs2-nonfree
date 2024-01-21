import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public final class Class59 {

	@OriginalMember(owner = "client!nd", name = "v", descriptor = "Lclient!ee;")
	private Class3 aClass3_120;

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "Lclient!ee;")
	public final Class3 aClass3_119 = new Class3();

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "()V")
	public Class59() {
		this.aClass3_119.aClass3_210 = this.aClass3_119;
		this.aClass3_119.aClass3_209 = this.aClass3_119;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!ee;Lclient!ee;I)V")
	public void method1729(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class3 arg1) {
		if (arg1.aClass3_210 != null) {
			arg1.method2900();
		}
		arg1.aClass3_209 = arg0;
		arg1.aClass3_210 = arg0.aClass3_210;
		arg1.aClass3_210.aClass3_209 = arg1;
		arg1.aClass3_209.aClass3_210 = arg1;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!ee;B)V")
	public void method1730(@OriginalArg(0) Class3 arg0) {
		if (arg0.aClass3_210 != null) {
			arg0.method2900();
		}
		arg0.aClass3_210 = this.aClass3_119.aClass3_210;
		arg0.aClass3_209 = this.aClass3_119;
		arg0.aClass3_210.aClass3_209 = arg0;
		arg0.aClass3_209.aClass3_210 = arg0;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Z)Lclient!ee;")
	public Class3 method1731() {
		@Pc(3) Class3 local3 = this.aClass3_119.aClass3_209;
		if (this.aClass3_119 == local3) {
			this.aClass3_120 = null;
			return null;
		} else {
			this.aClass3_120 = local3.aClass3_209;
			return local3;
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)Lclient!ee;")
	public Class3 method1732() {
		@Pc(14) Class3 local14 = this.aClass3_120;
		if (this.aClass3_119 == local14) {
			this.aClass3_120 = null;
			return null;
		} else {
			this.aClass3_120 = local14.aClass3_210;
			return local14;
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)Lclient!ee;")
	public Class3 method1733() {
		@Pc(10) Class3 local10 = this.aClass3_119.aClass3_209;
		if (local10 == this.aClass3_119) {
			return null;
		} else {
			local10.method2900();
			return local10;
		}
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)Lclient!ee;")
	public Class3 method1734() {
		@Pc(6) Class3 local6 = this.aClass3_120;
		if (local6 == this.aClass3_119) {
			this.aClass3_120 = null;
			return null;
		} else {
			this.aClass3_120 = local6.aClass3_209;
			return local6;
		}
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(B)Lclient!ee;")
	public Class3 method1737() {
		@Pc(7) Class3 local7 = this.aClass3_119.aClass3_210;
		if (this.aClass3_119 == local7) {
			this.aClass3_120 = null;
			return null;
		} else {
			this.aClass3_120 = local7.aClass3_210;
			return local7;
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!ee;I)V")
	public void method1738(@OriginalArg(0) Class3 arg0) {
		if (arg0.aClass3_210 != null) {
			arg0.method2900();
		}
		arg0.aClass3_209 = this.aClass3_119.aClass3_209;
		arg0.aClass3_210 = this.aClass3_119;
		arg0.aClass3_210.aClass3_209 = arg0;
		arg0.aClass3_209.aClass3_210 = arg0;
	}

	@OriginalMember(owner = "client!nd", name = "d", descriptor = "(B)V")
	public void method1741() {
		while (true) {
			@Pc(12) Class3 local12 = this.aClass3_119.aClass3_209;
			if (this.aClass3_119 == local12) {
				return;
			}
			local12.method2900();
		}
	}
}
