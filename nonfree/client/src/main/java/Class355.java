import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wda")
public final class Class355 {

	@OriginalMember(owner = "client!wda", name = "l", descriptor = "Lclient!wg;")
	private Class8_Sub2 aClass8_Sub2_10;

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "Lclient!wg;")
	public final Class8_Sub2 aClass8_Sub2_9 = new Class8_Sub2();

	@OriginalMember(owner = "client!wda", name = "<init>", descriptor = "()V")
	public Class355() {
		this.aClass8_Sub2_9.aClass8_Sub2_7 = this.aClass8_Sub2_9;
		this.aClass8_Sub2_9.aClass8_Sub2_8 = this.aClass8_Sub2_9;
	}

	@OriginalMember(owner = "client!wda", name = "b", descriptor = "(Z)Lclient!wg;")
	public Class8_Sub2 method7727() {
		@Pc(7) Class8_Sub2 local7 = this.aClass8_Sub2_9.aClass8_Sub2_8;
		if (local7 == this.aClass8_Sub2_9) {
			this.aClass8_Sub2_10 = null;
			return null;
		} else {
			this.aClass8_Sub2_10 = local7.aClass8_Sub2_8;
			return local7;
		}
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(I)Lclient!wg;")
	public Class8_Sub2 method7728() {
		@Pc(11) Class8_Sub2 local11 = this.aClass8_Sub2_10;
		if (this.aClass8_Sub2_9 == local11) {
			this.aClass8_Sub2_10 = null;
			return null;
		} else {
			this.aClass8_Sub2_10 = local11.aClass8_Sub2_8;
			return local11;
		}
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(Lclient!wg;I)V")
	public void method7729(@OriginalArg(0) Class8_Sub2 arg0) {
		if (arg0.aClass8_Sub2_7 != null) {
			arg0.method7400();
		}
		arg0.aClass8_Sub2_8 = this.aClass8_Sub2_9;
		arg0.aClass8_Sub2_7 = this.aClass8_Sub2_9.aClass8_Sub2_7;
		arg0.aClass8_Sub2_7.aClass8_Sub2_8 = arg0;
		arg0.aClass8_Sub2_8.aClass8_Sub2_7 = arg0;
	}

	@OriginalMember(owner = "client!wda", name = "b", descriptor = "(I)V")
	public void method7730() {
		while (true) {
			@Pc(5) Class8_Sub2 local5 = this.aClass8_Sub2_9.aClass8_Sub2_8;
			if (local5 == this.aClass8_Sub2_9) {
				this.aClass8_Sub2_10 = null;
				return;
			}
			local5.method7400();
		}
	}

	@OriginalMember(owner = "client!wda", name = "c", descriptor = "(Z)I")
	public int method7731() {
		@Pc(5) int local5 = 0;
		@Pc(9) Class8_Sub2 local9 = this.aClass8_Sub2_9.aClass8_Sub2_8;
		while (local9 != this.aClass8_Sub2_9) {
			local9 = local9.aClass8_Sub2_8;
			local5++;
		}
		return local5;
	}
}
