import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ks")
public final class Class114 {

	@OriginalMember(owner = "client!ks", name = "e", descriptor = "Lclient!wk;")
	private Class17_Sub7 aClass17_Sub7_2;

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "Lclient!wk;")
	public final Class17_Sub7 aClass17_Sub7_1 = new Class17_Sub7();

	@OriginalMember(owner = "client!ks", name = "<init>", descriptor = "()V")
	public Class114() {
		this.aClass17_Sub7_1.aClass17_Sub7_8 = this.aClass17_Sub7_1;
		this.aClass17_Sub7_1.aClass17_Sub7_7 = this.aClass17_Sub7_1;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Z)V")
	public void method3154() {
		while (true) {
			@Pc(5) Class17_Sub7 local5 = this.aClass17_Sub7_1.aClass17_Sub7_8;
			if (local5 == this.aClass17_Sub7_1) {
				this.aClass17_Sub7_2 = null;
				return;
			}
			local5.method5477();
		}
	}

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "(Z)Lclient!wk;")
	public Class17_Sub7 method3155() {
		@Pc(6) Class17_Sub7 local6 = this.aClass17_Sub7_2;
		if (this.aClass17_Sub7_1 == local6) {
			this.aClass17_Sub7_2 = null;
			return null;
		} else {
			this.aClass17_Sub7_2 = local6.aClass17_Sub7_8;
			return local6;
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lclient!wk;I)V")
	public void method3156(@OriginalArg(0) Class17_Sub7 arg0) {
		if (arg0.aClass17_Sub7_7 != null) {
			arg0.method5477();
		}
		arg0.aClass17_Sub7_7 = this.aClass17_Sub7_1.aClass17_Sub7_7;
		arg0.aClass17_Sub7_8 = this.aClass17_Sub7_1;
		arg0.aClass17_Sub7_7.aClass17_Sub7_8 = arg0;
		arg0.aClass17_Sub7_8.aClass17_Sub7_7 = arg0;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(I)Lclient!wk;")
	public Class17_Sub7 method3158() {
		@Pc(7) Class17_Sub7 local7 = this.aClass17_Sub7_1.aClass17_Sub7_8;
		if (this.aClass17_Sub7_1 == local7) {
			this.aClass17_Sub7_2 = null;
			return null;
		} else {
			this.aClass17_Sub7_2 = local7.aClass17_Sub7_8;
			return local7;
		}
	}
}
