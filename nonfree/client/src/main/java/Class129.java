import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gg")
public final class Class129 {

	@OriginalMember(owner = "client!gg", name = "i", descriptor = "Lclient!mg;")
	private Class3 aClass3_107;

	@OriginalMember(owner = "client!gg", name = "j", descriptor = "Lclient!tca;")
	private Class333 aClass333_14;

	@OriginalMember(owner = "client!gg", name = "k", descriptor = "I")
	private int anInt3527 = 0;

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "()V")
	private Class129() {
	}

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(Lclient!tca;)V")
	public Class129(@OriginalArg(0) Class333 arg0) {
		this.aClass333_14 = arg0;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)Lclient!mg;")
	public Class3 method3007() {
		@Pc(20) Class3 local20;
		if (this.anInt3527 > 0 && this.aClass333_14.aClass3Array1[this.anInt3527 - 1] != this.aClass3_107) {
			local20 = this.aClass3_107;
			this.aClass3_107 = local20.aClass3_337;
			return local20;
		}
		while (this.aClass333_14.anInt9196 > this.anInt3527) {
			local20 = this.aClass333_14.aClass3Array1[this.anInt3527++].aClass3_337;
			if (this.aClass333_14.aClass3Array1[this.anInt3527 - 1] != local20) {
				this.aClass3_107 = local20.aClass3_337;
				return local20;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(I)Lclient!mg;")
	public Class3 method3011() {
		this.anInt3527 = 0;
		return this.method3007();
	}
}
