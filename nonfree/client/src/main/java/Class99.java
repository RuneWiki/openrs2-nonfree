import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oh")
public final class Class99 {

	@OriginalMember(owner = "client!oh", name = "o", descriptor = "Lclient!lk;")
	private Class1_Sub2 aClass1_Sub2_39;

	@OriginalMember(owner = "client!oh", name = "l", descriptor = "Lclient!lk;")
	private Class1_Sub2 aClass1_Sub2_38 = new Class1_Sub2();

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "()V")
	public Class99() {
		this.aClass1_Sub2_38.aClass1_Sub2_58 = this.aClass1_Sub2_38;
		this.aClass1_Sub2_38.aClass1_Sub2_59 = this.aClass1_Sub2_38;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)Lclient!lk;")
	public Class1_Sub2 method2963() {
		@Pc(7) Class1_Sub2 local7 = this.aClass1_Sub2_38.aClass1_Sub2_58;
		if (local7 == this.aClass1_Sub2_38) {
			return null;
		} else {
			local7.method4198();
			return local7;
		}
	}

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(I)I")
	public int method2965() {
		@Pc(3) int local3 = 0;
		@Pc(17) Class1_Sub2 local17 = this.aClass1_Sub2_38.aClass1_Sub2_58;
		while (this.aClass1_Sub2_38 != local17) {
			local17 = local17.aClass1_Sub2_58;
			local3++;
		}
		return local3;
	}

	@OriginalMember(owner = "client!oh", name = "e", descriptor = "(I)Lclient!lk;")
	public Class1_Sub2 method2969() {
		@Pc(6) Class1_Sub2 local6 = this.aClass1_Sub2_39;
		if (this.aClass1_Sub2_38 == local6) {
			this.aClass1_Sub2_39 = null;
			return null;
		} else {
			this.aClass1_Sub2_39 = local6.aClass1_Sub2_58;
			return local6;
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(B)Lclient!lk;")
	public Class1_Sub2 method2970() {
		@Pc(7) Class1_Sub2 local7 = this.aClass1_Sub2_38.aClass1_Sub2_58;
		if (this.aClass1_Sub2_38 == local7) {
			this.aClass1_Sub2_39 = null;
			return null;
		} else {
			this.aClass1_Sub2_39 = local7.aClass1_Sub2_58;
			return local7;
		}
	}

	@OriginalMember(owner = "client!oh", name = "f", descriptor = "(I)V")
	public void method2971() {
		while (true) {
			@Pc(5) Class1_Sub2 local5 = this.aClass1_Sub2_38.aClass1_Sub2_58;
			if (local5 == this.aClass1_Sub2_38) {
				this.aClass1_Sub2_39 = null;
				return;
			}
			local5.method4198();
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lclient!lk;I)V")
	public void method2973(@OriginalArg(0) Class1_Sub2 arg0) {
		if (arg0.aClass1_Sub2_59 != null) {
			arg0.method4198();
		}
		arg0.aClass1_Sub2_58 = this.aClass1_Sub2_38;
		arg0.aClass1_Sub2_59 = this.aClass1_Sub2_38.aClass1_Sub2_59;
		arg0.aClass1_Sub2_59.aClass1_Sub2_58 = arg0;
		arg0.aClass1_Sub2_58.aClass1_Sub2_59 = arg0;
	}
}
