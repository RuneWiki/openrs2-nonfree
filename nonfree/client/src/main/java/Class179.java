import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public final class Class179 {

	@OriginalMember(owner = "client!vb", name = "k", descriptor = "Lclient!gg;")
	private Class34_Sub2 aClass34_Sub2_6;

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "Lclient!gg;")
	public Class34_Sub2 aClass34_Sub2_5 = new Class34_Sub2();

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "()V")
	public Class179() {
		this.aClass34_Sub2_5.aClass34_Sub2_4 = this.aClass34_Sub2_5;
		this.aClass34_Sub2_5.aClass34_Sub2_3 = this.aClass34_Sub2_5;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)Lclient!gg;")
	public Class34_Sub2 method4438() {
		@Pc(2) Class34_Sub2 local2 = this.aClass34_Sub2_6;
		if (this.aClass34_Sub2_5 == local2) {
			this.aClass34_Sub2_6 = null;
			return null;
		} else {
			this.aClass34_Sub2_6 = local2.aClass34_Sub2_4;
			return local2;
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!gg;I)V")
	public void method4439(@OriginalArg(0) Class34_Sub2 arg0) {
		if (arg0.aClass34_Sub2_3 != null) {
			arg0.method1567();
		}
		arg0.aClass34_Sub2_4 = this.aClass34_Sub2_5;
		arg0.aClass34_Sub2_3 = this.aClass34_Sub2_5.aClass34_Sub2_3;
		arg0.aClass34_Sub2_3.aClass34_Sub2_4 = arg0;
		arg0.aClass34_Sub2_4.aClass34_Sub2_3 = arg0;
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)Lclient!gg;")
	public Class34_Sub2 method4440() {
		@Pc(3) Class34_Sub2 local3 = this.aClass34_Sub2_5.aClass34_Sub2_4;
		if (local3 == this.aClass34_Sub2_5) {
			this.aClass34_Sub2_6 = null;
			return null;
		} else {
			this.aClass34_Sub2_6 = local3.aClass34_Sub2_4;
			return local3;
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Z)V")
	public void method4441() {
		while (true) {
			@Pc(9) Class34_Sub2 local9 = this.aClass34_Sub2_5.aClass34_Sub2_4;
			if (this.aClass34_Sub2_5 == local9) {
				this.aClass34_Sub2_6 = null;
				return;
			}
			local9.method1567();
		}
	}
}
