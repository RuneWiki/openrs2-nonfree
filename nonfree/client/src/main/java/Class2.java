import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aa")
public final class Class2 {

	@OriginalMember(owner = "client!aa", name = "K", descriptor = "Lclient!vc;")
	private Class1 aClass1_6;

	@OriginalMember(owner = "client!aa", name = "x", descriptor = "Lclient!vc;")
	public final Class1 aClass1_5 = new Class1();

	@OriginalMember(owner = "client!aa", name = "<init>", descriptor = "()V")
	public Class2() {
		this.aClass1_5.aClass1_120 = this.aClass1_5;
		this.aClass1_5.aClass1_119 = this.aClass1_5;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)Lclient!vc;")
	public Class1 method18() {
		@Pc(12) Class1 local12 = this.aClass1_5.aClass1_119;
		if (this.aClass1_5 == local12) {
			return null;
		} else {
			local12.method2024();
			return local12;
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Z)V")
	public void method19() {
		while (true) {
			@Pc(13) Class1 local13 = this.aClass1_5.aClass1_120;
			if (this.aClass1_5 == local13) {
				return;
			}
			local13.method2024();
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)Lclient!vc;")
	public Class1 method20() {
		@Pc(15) Class1 local15 = this.aClass1_5.aClass1_120;
		if (this.aClass1_5 == local15) {
			return null;
		} else {
			local15.method2024();
			return local15;
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lclient!vc;Lclient!vc;B)V")
	public void method21(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Class1 arg1) {
		if (arg0.aClass1_119 != null) {
			arg0.method2024();
		}
		arg0.aClass1_119 = arg1.aClass1_119;
		arg0.aClass1_120 = arg1;
		arg0.aClass1_119.aClass1_120 = arg0;
		arg0.aClass1_120.aClass1_119 = arg0;
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(I)Lclient!vc;")
	public Class1 method22() {
		@Pc(18) Class1 local18 = this.aClass1_5.aClass1_120;
		if (local18 == this.aClass1_5) {
			this.aClass1_6 = null;
			return null;
		} else {
			this.aClass1_6 = local18.aClass1_120;
			return local18;
		}
	}

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "(I)Lclient!vc;")
	public Class1 method23() {
		@Pc(13) Class1 local13 = this.aClass1_6;
		if (this.aClass1_5 == local13) {
			this.aClass1_6 = null;
			return null;
		} else {
			this.aClass1_6 = local13.aClass1_120;
			return local13;
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(BLclient!vc;)V")
	public void method26(@OriginalArg(1) Class1 arg0) {
		if (arg0.aClass1_119 != null) {
			arg0.method2024();
		}
		arg0.aClass1_119 = this.aClass1_5;
		arg0.aClass1_120 = this.aClass1_5.aClass1_120;
		arg0.aClass1_119.aClass1_120 = arg0;
		arg0.aClass1_120.aClass1_119 = arg0;
	}

	@OriginalMember(owner = "client!aa", name = "f", descriptor = "(I)Lclient!vc;")
	public Class1 method28() {
		@Pc(13) Class1 local13 = this.aClass1_6;
		if (local13 == this.aClass1_5) {
			this.aClass1_6 = null;
			return null;
		} else {
			this.aClass1_6 = local13.aClass1_119;
			return local13;
		}
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(Z)Lclient!vc;")
	public Class1 method29() {
		@Pc(12) Class1 local12 = this.aClass1_5.aClass1_119;
		if (local12 == this.aClass1_5) {
			this.aClass1_6 = null;
			return null;
		} else {
			this.aClass1_6 = local12.aClass1_119;
			return local12;
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lclient!vc;I)V")
	public void method33(@OriginalArg(0) Class1 arg0) {
		if (arg0.aClass1_119 != null) {
			arg0.method2024();
		}
		arg0.aClass1_120 = this.aClass1_5;
		arg0.aClass1_119 = this.aClass1_5.aClass1_119;
		arg0.aClass1_119.aClass1_120 = arg0;
		arg0.aClass1_120.aClass1_119 = arg0;
	}
}
