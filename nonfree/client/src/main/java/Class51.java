import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!p")
public final class Class51 {

	@OriginalMember(owner = "client!p", name = "H", descriptor = "Lclient!la;")
	private Class3 aClass3_68;

	@OriginalMember(owner = "client!p", name = "E", descriptor = "Lclient!la;")
	public final Class3 aClass3_67 = new Class3();

	@OriginalMember(owner = "client!p", name = "<init>", descriptor = "()V")
	public Class51() {
		this.aClass3_67.aClass3_101 = this.aClass3_67;
		this.aClass3_67.aClass3_102 = this.aClass3_67;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(I)V")
	public void method1300() {
		while (true) {
			@Pc(11) Class3 local11 = this.aClass3_67.aClass3_102;
			if (local11 == this.aClass3_67) {
				return;
			}
			local11.method1966();
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(BLclient!la;)V")
	public void method1303(@OriginalArg(1) Class3 arg0) {
		if (arg0.aClass3_101 != null) {
			arg0.method1966();
		}
		arg0.aClass3_102 = this.aClass3_67;
		arg0.aClass3_101 = this.aClass3_67.aClass3_101;
		arg0.aClass3_101.aClass3_102 = arg0;
		arg0.aClass3_102.aClass3_101 = arg0;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(B)Lclient!la;")
	public Class3 method1304() {
		@Pc(11) Class3 local11 = this.aClass3_68;
		if (this.aClass3_67 == local11) {
			this.aClass3_68 = null;
			return null;
		} else {
			this.aClass3_68 = local11.aClass3_101;
			return local11;
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(BLclient!la;Lclient!la;)V")
	public void method1306(@OriginalArg(1) Class3 arg0, @OriginalArg(2) Class3 arg1) {
		if (arg1.aClass3_101 != null) {
			arg1.method1966();
		}
		arg1.aClass3_101 = arg0.aClass3_101;
		arg1.aClass3_102 = arg0;
		arg1.aClass3_101.aClass3_102 = arg1;
		arg1.aClass3_102.aClass3_101 = arg1;
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(I)Lclient!la;")
	public Class3 method1307() {
		@Pc(7) Class3 local7 = this.aClass3_67.aClass3_101;
		if (local7 == this.aClass3_67) {
			return null;
		} else {
			local7.method1966();
			return local7;
		}
	}

	@OriginalMember(owner = "client!p", name = "c", descriptor = "(I)Lclient!la;")
	public Class3 method1309() {
		@Pc(12) Class3 local12 = this.aClass3_67.aClass3_101;
		if (this.aClass3_67 == local12) {
			this.aClass3_68 = null;
			return null;
		} else {
			this.aClass3_68 = local12.aClass3_101;
			return local12;
		}
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(B)Lclient!la;")
	public Class3 method1310() {
		@Pc(2) Class3 local2 = this.aClass3_68;
		if (local2 == this.aClass3_67) {
			this.aClass3_68 = null;
			return null;
		} else {
			this.aClass3_68 = local2.aClass3_102;
			return local2;
		}
	}

	@OriginalMember(owner = "client!p", name = "c", descriptor = "(B)Lclient!la;")
	public Class3 method1312() {
		@Pc(12) Class3 local12 = this.aClass3_67.aClass3_102;
		if (local12 == this.aClass3_67) {
			return null;
		} else {
			local12.method1966();
			return local12;
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Lclient!la;I)V")
	public void method1313(@OriginalArg(0) Class3 arg0) {
		if (arg0.aClass3_101 != null) {
			arg0.method1966();
		}
		arg0.aClass3_101 = this.aClass3_67;
		arg0.aClass3_102 = this.aClass3_67.aClass3_102;
		arg0.aClass3_101.aClass3_102 = arg0;
		arg0.aClass3_102.aClass3_101 = arg0;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Z)Lclient!la;")
	public Class3 method1316() {
		@Pc(12) Class3 local12 = this.aClass3_67.aClass3_102;
		if (this.aClass3_67 == local12) {
			this.aClass3_68 = null;
			return null;
		} else {
			this.aClass3_68 = local12.aClass3_102;
			return local12;
		}
	}
}
