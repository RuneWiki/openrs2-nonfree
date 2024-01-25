import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!m")
public final class Class130 {

	@OriginalMember(owner = "client!m", name = "f", descriptor = "Lclient!mr;")
	private Class8_Sub2 aClass8_Sub2_8;

	@OriginalMember(owner = "client!m", name = "d", descriptor = "Lclient!mr;")
	public final Class8_Sub2 aClass8_Sub2_7 = new Class8_Sub2();

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "()V")
	public Class130() {
		this.aClass8_Sub2_7.aClass8_Sub2_6 = this.aClass8_Sub2_7;
		this.aClass8_Sub2_7.aClass8_Sub2_5 = this.aClass8_Sub2_7;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(I)Lclient!mr;")
	public Class8_Sub2 method3552() {
		@Pc(12) Class8_Sub2 local12 = this.aClass8_Sub2_7.aClass8_Sub2_5;
		if (local12 == this.aClass8_Sub2_7) {
			this.aClass8_Sub2_8 = null;
			return null;
		} else {
			this.aClass8_Sub2_8 = local12.aClass8_Sub2_5;
			return local12;
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(B)V")
	public void method3553() {
		while (true) {
			@Pc(9) Class8_Sub2 local9 = this.aClass8_Sub2_7.aClass8_Sub2_5;
			if (this.aClass8_Sub2_7 == local9) {
				this.aClass8_Sub2_8 = null;
				return;
			}
			local9.method885();
		}
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(I)Lclient!mr;")
	public Class8_Sub2 method3555() {
		@Pc(6) Class8_Sub2 local6 = this.aClass8_Sub2_8;
		if (this.aClass8_Sub2_7 == local6) {
			this.aClass8_Sub2_8 = null;
			return null;
		} else {
			this.aClass8_Sub2_8 = local6.aClass8_Sub2_5;
			return local6;
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(ILclient!mr;)V")
	public void method3556(@OriginalArg(1) Class8_Sub2 arg0) {
		if (arg0.aClass8_Sub2_6 != null) {
			arg0.method885();
		}
		arg0.aClass8_Sub2_5 = this.aClass8_Sub2_7;
		arg0.aClass8_Sub2_6 = this.aClass8_Sub2_7.aClass8_Sub2_6;
		arg0.aClass8_Sub2_6.aClass8_Sub2_5 = arg0;
		arg0.aClass8_Sub2_5.aClass8_Sub2_6 = arg0;
	}
}
