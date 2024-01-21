import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jd")
public final class Class38 {

	@OriginalMember(owner = "client!jd", name = "t", descriptor = "Lclient!sc;")
	private Class1 aClass1_60;

	@OriginalMember(owner = "client!jd", name = "o", descriptor = "Lclient!sc;")
	public final Class1 aClass1_59 = new Class1();

	@OriginalMember(owner = "client!jd", name = "<init>", descriptor = "()V")
	public Class38() {
		this.aClass1_59.aClass1_127 = this.aClass1_59;
		this.aClass1_59.aClass1_128 = this.aClass1_59;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Z)Lclient!sc;")
	public Class1 method1033() {
		@Pc(6) Class1 local6 = this.aClass1_60;
		if (this.aClass1_59 == local6) {
			this.aClass1_60 = null;
			return null;
		} else {
			this.aClass1_60 = local6.aClass1_127;
			return local6;
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)Lclient!sc;")
	public Class1 method1034() {
		@Pc(12) Class1 local12 = this.aClass1_59.aClass1_128;
		if (this.aClass1_59 == local12) {
			this.aClass1_60 = null;
			return null;
		} else {
			this.aClass1_60 = local12.aClass1_128;
			return local12;
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lclient!sc;BLclient!sc;)V")
	public void method1035(@OriginalArg(0) Class1 arg0, @OriginalArg(2) Class1 arg1) {
		if (arg1.aClass1_127 != null) {
			arg1.method2039();
		}
		arg1.aClass1_128 = arg0;
		arg1.aClass1_127 = arg0.aClass1_127;
		arg1.aClass1_127.aClass1_128 = arg1;
		arg1.aClass1_128.aClass1_127 = arg1;
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)Lclient!sc;")
	public Class1 method1038() {
		@Pc(6) Class1 local6 = this.aClass1_60;
		if (local6 == this.aClass1_59) {
			this.aClass1_60 = null;
			return null;
		} else {
			this.aClass1_60 = local6.aClass1_128;
			return local6;
		}
	}

	@OriginalMember(owner = "client!jd", name = "d", descriptor = "(I)Lclient!sc;")
	public Class1 method1040() {
		@Pc(12) Class1 local12 = this.aClass1_59.aClass1_128;
		if (local12 == this.aClass1_59) {
			return null;
		} else {
			local12.method2039();
			return local12;
		}
	}

	@OriginalMember(owner = "client!jd", name = "f", descriptor = "(I)Lclient!sc;")
	public Class1 method1042() {
		@Pc(12) Class1 local12 = this.aClass1_59.aClass1_127;
		if (this.aClass1_59 == local12) {
			return null;
		} else {
			local12.method2039();
			return local12;
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lclient!sc;I)V")
	public void method1043(@OriginalArg(0) Class1 arg0) {
		if (arg0.aClass1_127 != null) {
			arg0.method2039();
		}
		arg0.aClass1_127 = this.aClass1_59;
		arg0.aClass1_128 = this.aClass1_59.aClass1_128;
		arg0.aClass1_127.aClass1_128 = arg0;
		arg0.aClass1_128.aClass1_127 = arg0;
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(B)V")
	public void method1044() {
		while (true) {
			@Pc(13) Class1 local13 = this.aClass1_59.aClass1_128;
			if (this.aClass1_59 == local13) {
				return;
			}
			local13.method2039();
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lclient!sc;B)V")
	public void method1046(@OriginalArg(0) Class1 arg0) {
		if (arg0.aClass1_127 != null) {
			arg0.method2039();
		}
		arg0.aClass1_127 = this.aClass1_59.aClass1_127;
		arg0.aClass1_128 = this.aClass1_59;
		arg0.aClass1_127.aClass1_128 = arg0;
		arg0.aClass1_128.aClass1_127 = arg0;
	}

	@OriginalMember(owner = "client!jd", name = "h", descriptor = "(I)Lclient!sc;")
	public Class1 method1048() {
		@Pc(3) Class1 local3 = this.aClass1_59.aClass1_127;
		if (this.aClass1_59 == local3) {
			this.aClass1_60 = null;
			return null;
		} else {
			this.aClass1_60 = local3.aClass1_127;
			return local3;
		}
	}
}
