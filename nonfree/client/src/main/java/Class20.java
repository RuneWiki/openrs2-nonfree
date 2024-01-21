import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public final class Class20 {

	@OriginalMember(owner = "client!dd", name = "x", descriptor = "Lclient!be;")
	private Class3 aClass3_14;

	@OriginalMember(owner = "client!dd", name = "p", descriptor = "Lclient!be;")
	public final Class3 aClass3_13 = new Class3();

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "()V")
	public Class20() {
		this.aClass3_13.aClass3_98 = this.aClass3_13;
		this.aClass3_13.aClass3_97 = this.aClass3_13;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)Lclient!be;")
	public Class3 method303() {
		@Pc(7) Class3 local7 = this.aClass3_13.aClass3_97;
		if (this.aClass3_13 == local7) {
			this.aClass3_14 = null;
			return null;
		} else {
			this.aClass3_14 = local7.aClass3_97;
			return local7;
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lclient!be;I)V")
	public void method304(@OriginalArg(0) Class3 arg0) {
		if (arg0.aClass3_97 != null) {
			arg0.method1930();
		}
		arg0.aClass3_97 = this.aClass3_13.aClass3_97;
		arg0.aClass3_98 = this.aClass3_13;
		arg0.aClass3_97.aClass3_98 = arg0;
		arg0.aClass3_98.aClass3_97 = arg0;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZLclient!be;)V")
	public void method307(@OriginalArg(1) Class3 arg0) {
		if (arg0.aClass3_97 != null) {
			arg0.method1930();
		}
		arg0.aClass3_98 = this.aClass3_13.aClass3_98;
		arg0.aClass3_97 = this.aClass3_13;
		arg0.aClass3_97.aClass3_98 = arg0;
		arg0.aClass3_98.aClass3_97 = arg0;
	}

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "(I)Lclient!be;")
	public Class3 method308() {
		@Pc(11) Class3 local11 = this.aClass3_13.aClass3_98;
		if (this.aClass3_13 == local11) {
			this.aClass3_14 = null;
			return null;
		} else {
			this.aClass3_14 = local11.aClass3_98;
			return local11;
		}
	}

	@OriginalMember(owner = "client!dd", name = "d", descriptor = "(I)Lclient!be;")
	public Class3 method309() {
		@Pc(10) Class3 local10 = this.aClass3_14;
		if (this.aClass3_13 == local10) {
			this.aClass3_14 = null;
			return null;
		} else {
			this.aClass3_14 = local10.aClass3_98;
			return local10;
		}
	}

	@OriginalMember(owner = "client!dd", name = "e", descriptor = "(I)V")
	public void method310() {
		while (true) {
			@Pc(11) Class3 local11 = this.aClass3_13.aClass3_98;
			if (local11 == this.aClass3_13) {
				return;
			}
			local11.method1930();
		}
	}

	@OriginalMember(owner = "client!dd", name = "f", descriptor = "(I)Lclient!be;")
	public Class3 method311() {
		@Pc(8) Class3 local8 = this.aClass3_13.aClass3_98;
		if (local8 == this.aClass3_13) {
			return null;
		} else {
			local8.method1930();
			return local8;
		}
	}

	@OriginalMember(owner = "client!dd", name = "g", descriptor = "(I)Lclient!be;")
	public Class3 method312() {
		@Pc(6) Class3 local6 = this.aClass3_14;
		if (local6 == this.aClass3_13) {
			this.aClass3_14 = null;
			return null;
		} else {
			this.aClass3_14 = local6.aClass3_97;
			return local6;
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILclient!be;Lclient!be;)V")
	public void method313(@OriginalArg(1) Class3 arg0, @OriginalArg(2) Class3 arg1) {
		if (arg0.aClass3_97 != null) {
			arg0.method1930();
		}
		arg0.aClass3_97 = arg1.aClass3_97;
		arg0.aClass3_98 = arg1;
		arg0.aClass3_97.aClass3_98 = arg0;
		arg0.aClass3_98.aClass3_97 = arg0;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)Lclient!be;")
	public Class3 method314() {
		@Pc(12) Class3 local12 = this.aClass3_13.aClass3_97;
		if (local12 == this.aClass3_13) {
			return null;
		} else {
			local12.method1930();
			return local12;
		}
	}
}
