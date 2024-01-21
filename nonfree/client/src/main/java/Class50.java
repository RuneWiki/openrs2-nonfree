import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!md")
public final class Class50 {

	@OriginalMember(owner = "client!md", name = "r", descriptor = "Lclient!je;")
	private Class1 aClass1_50;

	@OriginalMember(owner = "client!md", name = "e", descriptor = "Lclient!je;")
	public final Class1 aClass1_49 = new Class1();

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "()V")
	public Class50() {
		this.aClass1_49.aClass1_105 = this.aClass1_49;
		this.aClass1_49.aClass1_106 = this.aClass1_49;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(B)Lclient!je;")
	public Class1 method1141() {
		@Pc(11) Class1 local11 = this.aClass1_50;
		if (local11 == this.aClass1_49) {
			this.aClass1_50 = null;
			return null;
		} else {
			this.aClass1_50 = local11.aClass1_106;
			return local11;
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Lclient!je;B)V")
	public void method1142(@OriginalArg(0) Class1 arg0) {
		if (arg0.aClass1_105 != null) {
			arg0.method2076();
		}
		arg0.aClass1_105 = this.aClass1_49.aClass1_105;
		arg0.aClass1_106 = this.aClass1_49;
		arg0.aClass1_105.aClass1_106 = arg0;
		arg0.aClass1_106.aClass1_105 = arg0;
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(B)Lclient!je;")
	public Class1 method1143() {
		@Pc(7) Class1 local7 = this.aClass1_49.aClass1_105;
		if (this.aClass1_49 == local7) {
			this.aClass1_50 = null;
			return null;
		} else {
			this.aClass1_50 = local7.aClass1_105;
			return local7;
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(ILclient!je;)V")
	public void method1144(@OriginalArg(1) Class1 arg0) {
		if (arg0.aClass1_105 != null) {
			arg0.method2076();
		}
		arg0.aClass1_105 = this.aClass1_49;
		arg0.aClass1_106 = this.aClass1_49.aClass1_106;
		arg0.aClass1_105.aClass1_106 = arg0;
		arg0.aClass1_106.aClass1_105 = arg0;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V")
	public void method1145() {
		while (true) {
			@Pc(15) Class1 local15 = this.aClass1_49.aClass1_106;
			if (this.aClass1_49 == local15) {
				return;
			}
			local15.method2076();
		}
	}

	@OriginalMember(owner = "client!md", name = "c", descriptor = "(I)Lclient!je;")
	public Class1 method1147() {
		@Pc(13) Class1 local13 = this.aClass1_50;
		if (local13 == this.aClass1_49) {
			this.aClass1_50 = null;
			return null;
		} else {
			this.aClass1_50 = local13.aClass1_105;
			return local13;
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Z)Lclient!je;")
	public Class1 method1149() {
		@Pc(7) Class1 local7 = this.aClass1_49.aClass1_105;
		if (local7 == this.aClass1_49) {
			return null;
		} else {
			local7.method2076();
			return local7;
		}
	}

	@OriginalMember(owner = "client!md", name = "d", descriptor = "(I)Lclient!je;")
	public Class1 method1150() {
		@Pc(3) Class1 local3 = this.aClass1_49.aClass1_106;
		if (local3 == this.aClass1_49) {
			return null;
		} else {
			local3.method2076();
			return local3;
		}
	}

	@OriginalMember(owner = "client!md", name = "c", descriptor = "(B)Lclient!je;")
	public Class1 method1151() {
		@Pc(7) Class1 local7 = this.aClass1_49.aClass1_106;
		if (this.aClass1_49 == local7) {
			this.aClass1_50 = null;
			return null;
		} else {
			this.aClass1_50 = local7.aClass1_106;
			return local7;
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(BLclient!je;Lclient!je;)V")
	public void method1152(@OriginalArg(1) Class1 arg0, @OriginalArg(2) Class1 arg1) {
		if (arg1.aClass1_105 != null) {
			arg1.method2076();
		}
		arg1.aClass1_105 = arg0.aClass1_105;
		arg1.aClass1_106 = arg0;
		arg1.aClass1_105.aClass1_106 = arg1;
		arg1.aClass1_106.aClass1_105 = arg1;
	}
}
