import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dj")
public final class Class39 {

	@OriginalMember(owner = "client!dj", name = "i", descriptor = "Lclient!ni;")
	private Class45_Sub3 aClass45_Sub3_2;

	@OriginalMember(owner = "client!dj", name = "g", descriptor = "Lclient!ni;")
	public Class45_Sub3 aClass45_Sub3_1 = new Class45_Sub3();

	@OriginalMember(owner = "client!dj", name = "<init>", descriptor = "()V")
	public Class39() {
		this.aClass45_Sub3_1.aClass45_Sub3_5 = this.aClass45_Sub3_1;
		this.aClass45_Sub3_1.aClass45_Sub3_6 = this.aClass45_Sub3_1;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Z)Lclient!ni;")
	public Class45_Sub3 method825() {
		@Pc(2) Class45_Sub3 local2 = this.aClass45_Sub3_2;
		if (local2 == this.aClass45_Sub3_1) {
			this.aClass45_Sub3_2 = null;
			return null;
		} else {
			this.aClass45_Sub3_2 = local2.aClass45_Sub3_6;
			return local2;
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)V")
	public void method827() {
		while (true) {
			@Pc(5) Class45_Sub3 local5 = this.aClass45_Sub3_1.aClass45_Sub3_6;
			if (this.aClass45_Sub3_1 == local5) {
				this.aClass45_Sub3_2 = null;
				return;
			}
			local5.method2454();
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILclient!ni;)V")
	public void method828(@OriginalArg(1) Class45_Sub3 arg0) {
		if (arg0.aClass45_Sub3_5 != null) {
			arg0.method2454();
		}
		arg0.aClass45_Sub3_6 = this.aClass45_Sub3_1;
		arg0.aClass45_Sub3_5 = this.aClass45_Sub3_1.aClass45_Sub3_5;
		arg0.aClass45_Sub3_5.aClass45_Sub3_6 = arg0;
		arg0.aClass45_Sub3_6.aClass45_Sub3_5 = arg0;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)Lclient!ni;")
	public Class45_Sub3 method830() {
		@Pc(7) Class45_Sub3 local7 = this.aClass45_Sub3_1.aClass45_Sub3_6;
		if (this.aClass45_Sub3_1 == local7) {
			this.aClass45_Sub3_2 = null;
			return null;
		} else {
			this.aClass45_Sub3_2 = local7.aClass45_Sub3_6;
			return local7;
		}
	}
}
