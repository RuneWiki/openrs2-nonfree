import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public final class Class13 {

	@OriginalMember(owner = "client!da", name = "p", descriptor = "Lclient!fe;")
	private Class2 aClass2_30;

	@OriginalMember(owner = "client!da", name = "e", descriptor = "Lclient!fe;")
	public final Class2 aClass2_29 = new Class2();

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "()V")
	public Class13() {
		this.aClass2_29.aClass2_118 = this.aClass2_29;
		this.aClass2_29.aClass2_117 = this.aClass2_29;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(B)Lclient!fe;")
	public Class2 method414() {
		@Pc(2) Class2 local2 = this.aClass2_30;
		if (local2 == this.aClass2_29) {
			this.aClass2_30 = null;
			return null;
		} else {
			this.aClass2_30 = local2.aClass2_117;
			return local2;
		}
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(B)Lclient!fe;")
	public Class2 method415() {
		@Pc(7) Class2 local7 = this.aClass2_29.aClass2_117;
		if (local7 == this.aClass2_29) {
			this.aClass2_30 = null;
			return null;
		} else {
			this.aClass2_30 = local7.aClass2_117;
			return local7;
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!fe;I)V")
	public void method418(@OriginalArg(0) Class2 arg0) {
		if (arg0.aClass2_118 != null) {
			arg0.method1930();
		}
		arg0.aClass2_117 = this.aClass2_29;
		arg0.aClass2_118 = this.aClass2_29.aClass2_118;
		arg0.aClass2_118.aClass2_117 = arg0;
		arg0.aClass2_117.aClass2_118 = arg0;
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(I)Lclient!fe;")
	public Class2 method419() {
		@Pc(10) Class2 local10 = this.aClass2_29.aClass2_117;
		if (this.aClass2_29 == local10) {
			return null;
		} else {
			local10.method1930();
			return local10;
		}
	}

	@OriginalMember(owner = "client!da", name = "c", descriptor = "(I)V")
	public void method421() {
		while (true) {
			@Pc(12) Class2 local12 = this.aClass2_29.aClass2_117;
			if (this.aClass2_29 == local12) {
				return;
			}
			local12.method1930();
		}
	}

	@OriginalMember(owner = "client!da", name = "d", descriptor = "(B)Lclient!fe;")
	public Class2 method423() {
		@Pc(12) Class2 local12 = this.aClass2_29.aClass2_118;
		if (local12 == this.aClass2_29) {
			return null;
		} else {
			local12.method1930();
			return local12;
		}
	}

	@OriginalMember(owner = "client!da", name = "d", descriptor = "(I)Lclient!fe;")
	public Class2 method424() {
		@Pc(7) Class2 local7 = this.aClass2_29.aClass2_118;
		if (local7 == this.aClass2_29) {
			this.aClass2_30 = null;
			return null;
		} else {
			this.aClass2_30 = local7.aClass2_118;
			return local7;
		}
	}

	@OriginalMember(owner = "client!da", name = "e", descriptor = "(I)Lclient!fe;")
	public Class2 method425() {
		@Pc(2) Class2 local2 = this.aClass2_30;
		if (local2 == this.aClass2_29) {
			this.aClass2_30 = null;
			return null;
		} else {
			this.aClass2_30 = local2.aClass2_118;
			return local2;
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ZLclient!fe;Lclient!fe;)V")
	public void method427(@OriginalArg(1) Class2 arg0, @OriginalArg(2) Class2 arg1) {
		if (arg1.aClass2_118 != null) {
			arg1.method1930();
		}
		arg1.aClass2_117 = arg0;
		arg1.aClass2_118 = arg0.aClass2_118;
		arg1.aClass2_118.aClass2_117 = arg1;
		arg1.aClass2_117.aClass2_118 = arg1;
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(Lclient!fe;I)V")
	public void method428(@OriginalArg(0) Class2 arg0) {
		if (arg0.aClass2_118 != null) {
			arg0.method1930();
		}
		arg0.aClass2_118 = this.aClass2_29;
		arg0.aClass2_117 = this.aClass2_29.aClass2_117;
		arg0.aClass2_118.aClass2_117 = arg0;
		arg0.aClass2_117.aClass2_118 = arg0;
	}
}
