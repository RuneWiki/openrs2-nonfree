import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ob")
public final class Class177 {

	@OriginalMember(owner = "client!ob", name = "g", descriptor = "Lclient!e;")
	private Class57_Sub1 aClass57_Sub1_6;

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "Lclient!e;")
	public final Class57_Sub1 aClass57_Sub1_5 = new Class57_Sub1();

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "()V")
	public Class177() {
		this.aClass57_Sub1_5.aClass57_Sub1_7 = this.aClass57_Sub1_5;
		this.aClass57_Sub1_5.aClass57_Sub1_8 = this.aClass57_Sub1_5;
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)V")
	public void method4205() {
		while (true) {
			@Pc(15) Class57_Sub1 local15 = this.aClass57_Sub1_5.aClass57_Sub1_7;
			if (local15 == this.aClass57_Sub1_5) {
				this.aClass57_Sub1_6 = null;
				return;
			}
			local15.method4328();
		}
	}

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "(I)Lclient!e;")
	public Class57_Sub1 method4206() {
		@Pc(11) Class57_Sub1 local11 = this.aClass57_Sub1_6;
		if (local11 == this.aClass57_Sub1_5) {
			this.aClass57_Sub1_6 = null;
			return null;
		} else {
			this.aClass57_Sub1_6 = local11.aClass57_Sub1_7;
			return local11;
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)Lclient!e;")
	public Class57_Sub1 method4207() {
		@Pc(7) Class57_Sub1 local7 = this.aClass57_Sub1_5.aClass57_Sub1_7;
		if (local7 == this.aClass57_Sub1_5) {
			this.aClass57_Sub1_6 = null;
			return null;
		} else {
			this.aClass57_Sub1_6 = local7.aClass57_Sub1_7;
			return local7;
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!e;B)V")
	public void method4209(@OriginalArg(0) Class57_Sub1 arg0) {
		if (arg0.aClass57_Sub1_8 != null) {
			arg0.method4328();
		}
		arg0.aClass57_Sub1_8 = this.aClass57_Sub1_5.aClass57_Sub1_8;
		arg0.aClass57_Sub1_7 = this.aClass57_Sub1_5;
		arg0.aClass57_Sub1_8.aClass57_Sub1_7 = arg0;
		arg0.aClass57_Sub1_7.aClass57_Sub1_8 = arg0;
	}
}
