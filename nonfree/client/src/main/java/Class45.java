import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oe")
public final class Class45 {

	@OriginalMember(owner = "client!oe", name = "q", descriptor = "Lclient!sa;")
	private Class1 aClass1_72;

	@OriginalMember(owner = "client!oe", name = "i", descriptor = "Lclient!sa;")
	public final Class1 aClass1_71 = new Class1();

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "()V")
	public Class45() {
		this.aClass1_71.aClass1_101 = this.aClass1_71;
		this.aClass1_71.aClass1_102 = this.aClass1_71;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Z)Lclient!sa;")
	public Class1 method1288() {
		@Pc(7) Class1 local7 = this.aClass1_72;
		if (local7 == this.aClass1_71) {
			this.aClass1_72 = null;
			return null;
		} else {
			this.aClass1_72 = local7.aClass1_101;
			return local7;
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)V")
	public void method1291() {
		while (true) {
			@Pc(11) Class1 local11 = this.aClass1_71.aClass1_101;
			if (local11 == this.aClass1_71) {
				return;
			}
			local11.method1913();
		}
	}

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "(I)Lclient!sa;")
	public Class1 method1294() {
		@Pc(8) Class1 local8 = this.aClass1_71.aClass1_102;
		if (this.aClass1_71 == local8) {
			this.aClass1_72 = null;
			return null;
		} else {
			this.aClass1_72 = local8.aClass1_102;
			return local8;
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!sa;I)V")
	public void method1295(@OriginalArg(0) Class1 arg0) {
		if (arg0.aClass1_102 != null) {
			arg0.method1913();
		}
		arg0.aClass1_102 = this.aClass1_71.aClass1_102;
		arg0.aClass1_101 = this.aClass1_71;
		arg0.aClass1_102.aClass1_101 = arg0;
		arg0.aClass1_101.aClass1_102 = arg0;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILclient!sa;Lclient!sa;)V")
	public void method1296(@OriginalArg(1) Class1 arg0, @OriginalArg(2) Class1 arg1) {
		if (arg1.aClass1_102 != null) {
			arg1.method1913();
		}
		arg1.aClass1_101 = arg0;
		arg1.aClass1_102 = arg0.aClass1_102;
		arg1.aClass1_102.aClass1_101 = arg1;
		arg1.aClass1_101.aClass1_102 = arg1;
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(Lclient!sa;I)V")
	public void method1297(@OriginalArg(0) Class1 arg0) {
		if (arg0.aClass1_102 != null) {
			arg0.method1913();
		}
		arg0.aClass1_101 = this.aClass1_71.aClass1_101;
		arg0.aClass1_102 = this.aClass1_71;
		arg0.aClass1_102.aClass1_101 = arg0;
		arg0.aClass1_101.aClass1_102 = arg0;
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(B)Lclient!sa;")
	public Class1 method1298() {
		@Pc(2) Class1 local2 = this.aClass1_72;
		if (local2 == this.aClass1_71) {
			this.aClass1_72 = null;
			return null;
		} else {
			this.aClass1_72 = local2.aClass1_102;
			return local2;
		}
	}

	@OriginalMember(owner = "client!oe", name = "d", descriptor = "(I)Lclient!sa;")
	public Class1 method1299() {
		@Pc(3) Class1 local3 = this.aClass1_71.aClass1_101;
		if (local3 == this.aClass1_71) {
			this.aClass1_72 = null;
			return null;
		} else {
			this.aClass1_72 = local3.aClass1_101;
			return local3;
		}
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(Z)Lclient!sa;")
	public Class1 method1300() {
		@Pc(3) Class1 local3 = this.aClass1_71.aClass1_101;
		if (local3 == this.aClass1_71) {
			return null;
		} else {
			local3.method1913();
			return local3;
		}
	}

	@OriginalMember(owner = "client!oe", name = "e", descriptor = "(I)Lclient!sa;")
	public Class1 method1301() {
		@Pc(7) Class1 local7 = this.aClass1_71.aClass1_102;
		if (local7 == this.aClass1_71) {
			return null;
		} else {
			local7.method1913();
			return local7;
		}
	}
}
