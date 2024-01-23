import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mi")
public final class Class75 {

	@OriginalMember(owner = "client!mi", name = "r", descriptor = "Lclient!sa;")
	private Class1 aClass1_130;

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "Lclient!sa;")
	public Class1 aClass1_129 = new Class1();

	@OriginalMember(owner = "client!mi", name = "<init>", descriptor = "()V")
	public Class75() {
		this.aClass1_129.aClass1_203 = this.aClass1_129;
		this.aClass1_129.aClass1_204 = this.aClass1_129;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(B)Lclient!sa;")
	public Class1 method2235() {
		@Pc(6) Class1 local6 = this.aClass1_130;
		if (this.aClass1_129 == local6) {
			this.aClass1_130 = null;
			return null;
		} else {
			this.aClass1_130 = local6.aClass1_204;
			return local6;
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(ZLclient!sa;)V")
	public void method2236(@OriginalArg(1) Class1 arg0) {
		if (arg0.aClass1_204 != null) {
			arg0.method3525();
		}
		arg0.aClass1_203 = this.aClass1_129.aClass1_203;
		arg0.aClass1_204 = this.aClass1_129;
		arg0.aClass1_204.aClass1_203 = arg0;
		arg0.aClass1_203.aClass1_204 = arg0;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)I")
	public int method2237() {
		@Pc(12) int local12 = 0;
		@Pc(16) Class1 local16 = this.aClass1_129.aClass1_203;
		while (this.aClass1_129 != local16) {
			local16 = local16.aClass1_203;
			local12++;
		}
		return local12;
	}

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "(B)Lclient!sa;")
	public Class1 method2238() {
		@Pc(11) Class1 local11 = this.aClass1_130;
		if (this.aClass1_129 == local11) {
			this.aClass1_130 = null;
			return null;
		} else {
			this.aClass1_130 = local11.aClass1_203;
			return local11;
		}
	}

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "(I)Lclient!sa;")
	public Class1 method2239() {
		@Pc(12) Class1 local12 = this.aClass1_129.aClass1_203;
		if (local12 == this.aClass1_129) {
			this.aClass1_130 = null;
			return null;
		} else {
			this.aClass1_130 = local12.aClass1_203;
			return local12;
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(BLclient!sa;)V")
	public void method2240(@OriginalArg(1) Class1 arg0) {
		if (arg0.aClass1_204 != null) {
			arg0.method3525();
		}
		arg0.aClass1_203 = this.aClass1_129;
		arg0.aClass1_204 = this.aClass1_129.aClass1_204;
		arg0.aClass1_204.aClass1_203 = arg0;
		arg0.aClass1_203.aClass1_204 = arg0;
	}

	@OriginalMember(owner = "client!mi", name = "c", descriptor = "(B)Lclient!sa;")
	public Class1 method2241() {
		@Pc(12) Class1 local12 = this.aClass1_129.aClass1_203;
		if (this.aClass1_129 == local12) {
			return null;
		} else {
			local12.method3525();
			return local12;
		}
	}

	@OriginalMember(owner = "client!mi", name = "d", descriptor = "(B)V")
	public void method2243() {
		while (true) {
			@Pc(13) Class1 local13 = this.aClass1_129.aClass1_203;
			if (this.aClass1_129 == local13) {
				this.aClass1_130 = null;
				return;
			}
			local13.method3525();
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Z)Lclient!sa;")
	public Class1 method2244() {
		@Pc(7) Class1 local7 = this.aClass1_129.aClass1_204;
		if (this.aClass1_129 == local7) {
			this.aClass1_130 = null;
			return null;
		} else {
			this.aClass1_130 = local7.aClass1_204;
			return local7;
		}
	}
}
