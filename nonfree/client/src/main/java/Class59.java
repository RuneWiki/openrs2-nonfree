import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gj")
public final class Class59 {

	@OriginalMember(owner = "client!gj", name = "o", descriptor = "Lclient!ba;")
	private Class1 aClass1_84;

	@OriginalMember(owner = "client!gj", name = "d", descriptor = "Lclient!ba;")
	public Class1 aClass1_83 = new Class1();

	@OriginalMember(owner = "client!gj", name = "<init>", descriptor = "()V")
	public Class59() {
		this.aClass1_83.aClass1_234 = this.aClass1_83;
		this.aClass1_83.aClass1_235 = this.aClass1_83;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)Lclient!ba;")
	public Class1 method1700() {
		@Pc(12) Class1 local12 = this.aClass1_83.aClass1_235;
		if (this.aClass1_83 == local12) {
			return null;
		} else {
			local12.method4779();
			return local12;
		}
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(I)Lclient!ba;")
	public Class1 method1701() {
		@Pc(6) Class1 local6 = this.aClass1_84;
		if (local6 == this.aClass1_83) {
			this.aClass1_84 = null;
			return null;
		} else {
			this.aClass1_84 = local6.aClass1_235;
			return local6;
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(ILclient!ba;)V")
	public void method1702(@OriginalArg(1) Class1 arg0) {
		if (arg0.aClass1_234 != null) {
			arg0.method4779();
		}
		arg0.aClass1_234 = this.aClass1_83;
		arg0.aClass1_235 = this.aClass1_83.aClass1_235;
		arg0.aClass1_234.aClass1_235 = arg0;
		arg0.aClass1_235.aClass1_234 = arg0;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(B)V")
	public void method1703() {
		while (true) {
			@Pc(14) Class1 local14 = this.aClass1_83.aClass1_235;
			if (local14 == this.aClass1_83) {
				this.aClass1_84 = null;
				return;
			}
			local14.method4779();
		}
	}

	@OriginalMember(owner = "client!gj", name = "c", descriptor = "(I)Lclient!ba;")
	public Class1 method1704() {
		@Pc(7) Class1 local7 = this.aClass1_83.aClass1_235;
		if (local7 == this.aClass1_83) {
			this.aClass1_84 = null;
			return null;
		} else {
			this.aClass1_84 = local7.aClass1_235;
			return local7;
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lclient!ba;Z)V")
	public void method1706(@OriginalArg(0) Class1 arg0) {
		if (arg0.aClass1_234 != null) {
			arg0.method4779();
		}
		arg0.aClass1_234 = this.aClass1_83.aClass1_234;
		arg0.aClass1_235 = this.aClass1_83;
		arg0.aClass1_234.aClass1_235 = arg0;
		arg0.aClass1_235.aClass1_234 = arg0;
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(B)Lclient!ba;")
	public Class1 method1708() {
		@Pc(7) Class1 local7 = this.aClass1_83.aClass1_234;
		if (local7 == this.aClass1_83) {
			this.aClass1_84 = null;
			return null;
		} else {
			this.aClass1_84 = local7.aClass1_234;
			return local7;
		}
	}

	@OriginalMember(owner = "client!gj", name = "c", descriptor = "(B)Z")
	public boolean method1709() {
		return this.aClass1_83 == this.aClass1_83.aClass1_235;
	}

	@OriginalMember(owner = "client!gj", name = "d", descriptor = "(B)Lclient!ba;")
	public Class1 method1710() {
		@Pc(6) Class1 local6 = this.aClass1_84;
		if (this.aClass1_83 == local6) {
			this.aClass1_84 = null;
			return null;
		} else {
			this.aClass1_84 = local6.aClass1_234;
			return local6;
		}
	}
}
