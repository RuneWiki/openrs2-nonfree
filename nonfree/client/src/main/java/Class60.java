import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ob")
public final class Class60 {

	@OriginalMember(owner = "client!ob", name = "h", descriptor = "Lclient!vf;")
	private final Class2_Sub3 aClass2_Sub3_42 = new Class2_Sub3();

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "()V")
	public Class60() {
		this.aClass2_Sub3_42.aClass2_Sub3_70 = this.aClass2_Sub3_42;
		this.aClass2_Sub3_42.aClass2_Sub3_69 = this.aClass2_Sub3_42;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)Lclient!vf;")
	public Class2_Sub3 method1862() {
		@Pc(7) Class2_Sub3 local7 = this.aClass2_Sub3_42.aClass2_Sub3_69;
		return this.aClass2_Sub3_42 == local7 ? null : local7;
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)Lclient!vf;")
	public Class2_Sub3 method1863() {
		@Pc(7) Class2_Sub3 local7 = this.aClass2_Sub3_42.aClass2_Sub3_69;
		if (local7 == this.aClass2_Sub3_42) {
			return null;
		} else {
			local7.method2725();
			return local7;
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(BLclient!vf;)V")
	public void method1869(@OriginalArg(1) Class2_Sub3 arg0) {
		if (arg0.aClass2_Sub3_70 != null) {
			arg0.method2725();
		}
		arg0.aClass2_Sub3_70 = this.aClass2_Sub3_42.aClass2_Sub3_70;
		arg0.aClass2_Sub3_69 = this.aClass2_Sub3_42;
		arg0.aClass2_Sub3_70.aClass2_Sub3_69 = arg0;
		arg0.aClass2_Sub3_69.aClass2_Sub3_70 = arg0;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILclient!vf;)V")
	public void method1871(@OriginalArg(1) Class2_Sub3 arg0) {
		if (arg0.aClass2_Sub3_70 != null) {
			arg0.method2725();
		}
		arg0.aClass2_Sub3_70 = this.aClass2_Sub3_42;
		arg0.aClass2_Sub3_69 = this.aClass2_Sub3_42.aClass2_Sub3_69;
		arg0.aClass2_Sub3_70.aClass2_Sub3_69 = arg0;
		arg0.aClass2_Sub3_69.aClass2_Sub3_70 = arg0;
	}
}
