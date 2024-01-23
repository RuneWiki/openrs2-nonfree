import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!t")
public final class Class166 {

	@OriginalMember(owner = "client!t", name = "k", descriptor = "Lclient!kb;")
	private Class87_Sub1 aClass87_Sub1_4;

	@OriginalMember(owner = "client!t", name = "d", descriptor = "Lclient!kb;")
	public Class87_Sub1 aClass87_Sub1_3 = new Class87_Sub1();

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "()V")
	public Class166() {
		this.aClass87_Sub1_3.aClass87_Sub1_5 = this.aClass87_Sub1_3;
		this.aClass87_Sub1_3.aClass87_Sub1_6 = this.aClass87_Sub1_3;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!kb;I)V")
	public void method4156(@OriginalArg(0) Class87_Sub1 arg0) {
		if (arg0.aClass87_Sub1_5 != null) {
			arg0.method4449();
		}
		arg0.aClass87_Sub1_5 = this.aClass87_Sub1_3.aClass87_Sub1_5;
		arg0.aClass87_Sub1_6 = this.aClass87_Sub1_3;
		arg0.aClass87_Sub1_5.aClass87_Sub1_6 = arg0;
		arg0.aClass87_Sub1_6.aClass87_Sub1_5 = arg0;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Z)Lclient!kb;")
	public Class87_Sub1 method4157() {
		@Pc(2) Class87_Sub1 local2 = this.aClass87_Sub1_4;
		if (local2 == this.aClass87_Sub1_3) {
			this.aClass87_Sub1_4 = null;
			return null;
		} else {
			this.aClass87_Sub1_4 = local2.aClass87_Sub1_6;
			return local2;
		}
	}

	@OriginalMember(owner = "client!t", name = "b", descriptor = "(I)V")
	public void method4158() {
		while (true) {
			@Pc(5) Class87_Sub1 local5 = this.aClass87_Sub1_3.aClass87_Sub1_6;
			if (local5 == this.aClass87_Sub1_3) {
				this.aClass87_Sub1_4 = null;
				return;
			}
			local5.method4449();
		}
	}

	@OriginalMember(owner = "client!t", name = "c", descriptor = "(I)Lclient!kb;")
	public Class87_Sub1 method4161() {
		@Pc(9) Class87_Sub1 local9 = this.aClass87_Sub1_3.aClass87_Sub1_6;
		if (this.aClass87_Sub1_3 == local9) {
			this.aClass87_Sub1_4 = null;
			return null;
		} else {
			this.aClass87_Sub1_4 = local9.aClass87_Sub1_6;
			return local9;
		}
	}
}
