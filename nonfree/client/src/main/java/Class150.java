import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hf")
public final class Class150 {

	@OriginalMember(owner = "client!hf", name = "k", descriptor = "Lclient!su;")
	private Class5_Sub2 aClass5_Sub2_25;

	@OriginalMember(owner = "client!hf", name = "i", descriptor = "Lclient!su;")
	public final Class5_Sub2 aClass5_Sub2_24 = new Class5_Sub2();

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "()V")
	public Class150() {
		this.aClass5_Sub2_24.aClass5_Sub2_66 = this.aClass5_Sub2_24;
		this.aClass5_Sub2_24.aClass5_Sub2_67 = this.aClass5_Sub2_24;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lclient!su;I)V")
	public void method3095(@OriginalArg(0) Class5_Sub2 arg0) {
		if (arg0.aClass5_Sub2_66 != null) {
			arg0.method8569();
		}
		arg0.aClass5_Sub2_67 = this.aClass5_Sub2_24;
		arg0.aClass5_Sub2_66 = this.aClass5_Sub2_24.aClass5_Sub2_66;
		arg0.aClass5_Sub2_66.aClass5_Sub2_67 = arg0;
		arg0.aClass5_Sub2_67.aClass5_Sub2_66 = arg0;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)Lclient!su;")
	public Class5_Sub2 method3096() {
		@Pc(11) Class5_Sub2 local11 = this.aClass5_Sub2_25;
		if (local11 == this.aClass5_Sub2_24) {
			this.aClass5_Sub2_25 = null;
			return null;
		} else {
			this.aClass5_Sub2_25 = local11.aClass5_Sub2_67;
			return local11;
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Z)V")
	public void method3097() {
		while (true) {
			@Pc(7) Class5_Sub2 local7 = this.aClass5_Sub2_24.aClass5_Sub2_67;
			if (this.aClass5_Sub2_24 == local7) {
				this.aClass5_Sub2_25 = null;
				return;
			}
			local7.method8569();
		}
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(Z)I")
	public int method3099() {
		@Pc(5) int local5 = 0;
		@Pc(9) Class5_Sub2 local9 = this.aClass5_Sub2_24.aClass5_Sub2_67;
		while (local9 != this.aClass5_Sub2_24) {
			local9 = local9.aClass5_Sub2_67;
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)Lclient!su;")
	public Class5_Sub2 method3100() {
		@Pc(7) Class5_Sub2 local7 = this.aClass5_Sub2_24.aClass5_Sub2_67;
		if (local7 == this.aClass5_Sub2_24) {
			this.aClass5_Sub2_25 = null;
			return null;
		} else {
			this.aClass5_Sub2_25 = local7.aClass5_Sub2_67;
			return local7;
		}
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(B)Lclient!su;")
	public Class5_Sub2 method3101() {
		@Pc(7) Class5_Sub2 local7 = this.aClass5_Sub2_24.aClass5_Sub2_67;
		if (local7 == this.aClass5_Sub2_24) {
			return null;
		} else {
			local7.method8569();
			return local7;
		}
	}
}
