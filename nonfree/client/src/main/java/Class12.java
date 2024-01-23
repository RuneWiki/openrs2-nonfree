import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ba")
public final class Class12 {

	@OriginalMember(owner = "client!ba", name = "r", descriptor = "Lclient!uo;")
	private Class47_Sub2 aClass47_Sub2_2;

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "Lclient!uo;")
	public Class47_Sub2 aClass47_Sub2_1 = new Class47_Sub2();

	@OriginalMember(owner = "client!ba", name = "<init>", descriptor = "()V")
	public Class12() {
		this.aClass47_Sub2_1.aClass47_Sub2_5 = this.aClass47_Sub2_1;
		this.aClass47_Sub2_1.aClass47_Sub2_6 = this.aClass47_Sub2_1;
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(I)Lclient!uo;")
	public Class47_Sub2 method293() {
		@Pc(2) Class47_Sub2 local2 = this.aClass47_Sub2_2;
		if (this.aClass47_Sub2_1 == local2) {
			this.aClass47_Sub2_2 = null;
			return null;
		} else {
			this.aClass47_Sub2_2 = local2.aClass47_Sub2_6;
			return local2;
		}
	}

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "(I)Lclient!uo;")
	public Class47_Sub2 method295() {
		@Pc(3) Class47_Sub2 local3 = this.aClass47_Sub2_1.aClass47_Sub2_6;
		if (this.aClass47_Sub2_1 == local3) {
			this.aClass47_Sub2_2 = null;
			return null;
		} else {
			this.aClass47_Sub2_2 = local3.aClass47_Sub2_6;
			return local3;
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!uo;I)V")
	public void method296(@OriginalArg(0) Class47_Sub2 arg0) {
		if (arg0.aClass47_Sub2_5 != null) {
			arg0.method4483();
		}
		arg0.aClass47_Sub2_6 = this.aClass47_Sub2_1;
		arg0.aClass47_Sub2_5 = this.aClass47_Sub2_1.aClass47_Sub2_5;
		arg0.aClass47_Sub2_5.aClass47_Sub2_6 = arg0;
		arg0.aClass47_Sub2_6.aClass47_Sub2_5 = arg0;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)V")
	public void method299() {
		while (true) {
			@Pc(5) Class47_Sub2 local5 = this.aClass47_Sub2_1.aClass47_Sub2_6;
			if (this.aClass47_Sub2_1 == local5) {
				this.aClass47_Sub2_2 = null;
				return;
			}
			local5.method4483();
		}
	}
}
