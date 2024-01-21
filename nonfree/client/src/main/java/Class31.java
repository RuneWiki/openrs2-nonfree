import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public final class Class31 {

	@OriginalMember(owner = "client!ie", name = "t", descriptor = "Lclient!ue;")
	private Class1 aClass1_62;

	@OriginalMember(owner = "client!ie", name = "h", descriptor = "Lclient!ue;")
	public final Class1 aClass1_61 = new Class1();

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "()V")
	public Class31() {
		this.aClass1_61.aClass1_119 = this.aClass1_61;
		this.aClass1_61.aClass1_120 = this.aClass1_61;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!ue;Lclient!ue;B)V")
	public void method994(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Class1 arg1) {
		if (arg0.aClass1_120 != null) {
			arg0.method2128();
		}
		arg0.aClass1_120 = arg1.aClass1_120;
		arg0.aClass1_119 = arg1;
		arg0.aClass1_120.aClass1_119 = arg0;
		arg0.aClass1_119.aClass1_120 = arg0;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)V")
	public void method995() {
		while (true) {
			@Pc(11) Class1 local11 = this.aClass1_61.aClass1_119;
			if (local11 == this.aClass1_61) {
				return;
			}
			local11.method2128();
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILclient!ue;)V")
	public void method996(@OriginalArg(1) Class1 arg0) {
		if (arg0.aClass1_120 != null) {
			arg0.method2128();
		}
		arg0.aClass1_119 = this.aClass1_61.aClass1_119;
		arg0.aClass1_120 = this.aClass1_61;
		arg0.aClass1_120.aClass1_119 = arg0;
		arg0.aClass1_119.aClass1_120 = arg0;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)Lclient!ue;")
	public Class1 method999() {
		@Pc(7) Class1 local7 = this.aClass1_61.aClass1_119;
		if (this.aClass1_61 == local7) {
			return null;
		} else {
			local7.method2128();
			return local7;
		}
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(B)Lclient!ue;")
	public Class1 method1000() {
		@Pc(7) Class1 local7 = this.aClass1_61.aClass1_119;
		if (this.aClass1_61 == local7) {
			this.aClass1_62 = null;
			return null;
		} else {
			this.aClass1_62 = local7.aClass1_119;
			return local7;
		}
	}

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "(B)Lclient!ue;")
	public Class1 method1001() {
		@Pc(13) Class1 local13 = this.aClass1_61.aClass1_120;
		if (this.aClass1_61 == local13) {
			return null;
		} else {
			local13.method2128();
			return local13;
		}
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(I)Lclient!ue;")
	public Class1 method1002() {
		@Pc(6) Class1 local6 = this.aClass1_62;
		if (local6 == this.aClass1_61) {
			this.aClass1_62 = null;
			return null;
		} else {
			this.aClass1_62 = local6.aClass1_120;
			return local6;
		}
	}

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "(I)Lclient!ue;")
	public Class1 method1003() {
		@Pc(6) Class1 local6 = this.aClass1_62;
		if (this.aClass1_61 == local6) {
			this.aClass1_62 = null;
			return null;
		} else {
			this.aClass1_62 = local6.aClass1_119;
			return local6;
		}
	}

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "(B)Lclient!ue;")
	public Class1 method1004() {
		@Pc(12) Class1 local12 = this.aClass1_61.aClass1_120;
		if (local12 == this.aClass1_61) {
			this.aClass1_62 = null;
			return null;
		} else {
			this.aClass1_62 = local12.aClass1_120;
			return local12;
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!ue;I)V")
	public void method1005(@OriginalArg(0) Class1 arg0) {
		if (arg0.aClass1_120 != null) {
			arg0.method2128();
		}
		arg0.aClass1_119 = this.aClass1_61;
		arg0.aClass1_120 = this.aClass1_61.aClass1_120;
		arg0.aClass1_120.aClass1_119 = arg0;
		arg0.aClass1_119.aClass1_120 = arg0;
	}
}
