import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gr")
public final class Class76 {

	@OriginalMember(owner = "client!gr", name = "l", descriptor = "Lclient!uj;")
	private Class8_Sub4 aClass8_Sub4_2;

	@OriginalMember(owner = "client!gr", name = "j", descriptor = "Lclient!uj;")
	public final Class8_Sub4 aClass8_Sub4_1 = new Class8_Sub4();

	@OriginalMember(owner = "client!gr", name = "<init>", descriptor = "()V")
	public Class76() {
		this.aClass8_Sub4_1.aClass8_Sub4_8 = this.aClass8_Sub4_1;
		this.aClass8_Sub4_1.aClass8_Sub4_7 = this.aClass8_Sub4_1;
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(I)Lclient!uj;")
	public Class8_Sub4 method1876() {
		@Pc(7) Class8_Sub4 local7 = this.aClass8_Sub4_1.aClass8_Sub4_7;
		if (local7 == this.aClass8_Sub4_1) {
			this.aClass8_Sub4_2 = null;
			return null;
		} else {
			this.aClass8_Sub4_2 = local7.aClass8_Sub4_7;
			return local7;
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(B)Lclient!uj;")
	public Class8_Sub4 method1877() {
		@Pc(6) Class8_Sub4 local6 = this.aClass8_Sub4_2;
		if (local6 == this.aClass8_Sub4_1) {
			this.aClass8_Sub4_2 = null;
			return null;
		} else {
			this.aClass8_Sub4_2 = local6.aClass8_Sub4_7;
			return local6;
		}
	}

	@OriginalMember(owner = "client!gr", name = "b", descriptor = "(I)V")
	public void method1878() {
		while (true) {
			@Pc(5) Class8_Sub4 local5 = this.aClass8_Sub4_1.aClass8_Sub4_7;
			if (this.aClass8_Sub4_1 == local5) {
				this.aClass8_Sub4_2 = null;
				return;
			}
			local5.method2081();
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(ZLclient!uj;)V")
	public void method1880(@OriginalArg(1) Class8_Sub4 arg0) {
		if (arg0.aClass8_Sub4_8 != null) {
			arg0.method2081();
		}
		arg0.aClass8_Sub4_7 = this.aClass8_Sub4_1;
		arg0.aClass8_Sub4_8 = this.aClass8_Sub4_1.aClass8_Sub4_8;
		arg0.aClass8_Sub4_8.aClass8_Sub4_7 = arg0;
		arg0.aClass8_Sub4_7.aClass8_Sub4_8 = arg0;
	}
}
