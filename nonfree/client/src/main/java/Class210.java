import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oc")
public final class Class210 {

	@OriginalMember(owner = "client!oc", name = "m", descriptor = "Lclient!aca;")
	private Class6_Sub1 aClass6_Sub1_8;

	@OriginalMember(owner = "client!oc", name = "e", descriptor = "Lclient!aca;")
	public final Class6_Sub1 aClass6_Sub1_7 = new Class6_Sub1();

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "()V")
	public Class210() {
		this.aClass6_Sub1_7.aClass6_Sub1_10 = this.aClass6_Sub1_7;
		this.aClass6_Sub1_7.aClass6_Sub1_9 = this.aClass6_Sub1_7;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)Lclient!aca;")
	public Class6_Sub1 method5353() {
		@Pc(6) Class6_Sub1 local6 = this.aClass6_Sub1_8;
		if (local6 == this.aClass6_Sub1_7) {
			this.aClass6_Sub1_8 = null;
			return null;
		} else {
			this.aClass6_Sub1_8 = local6.aClass6_Sub1_9;
			return local6;
		}
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(B)V")
	public void method5354() {
		while (true) {
			@Pc(9) Class6_Sub1 local9 = this.aClass6_Sub1_7.aClass6_Sub1_9;
			if (this.aClass6_Sub1_7 == local9) {
				this.aClass6_Sub1_8 = null;
				return;
			}
			local9.method6809();
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)I")
	public int method5358() {
		@Pc(7) int local7 = 0;
		@Pc(11) Class6_Sub1 local11 = this.aClass6_Sub1_7.aClass6_Sub1_9;
		while (this.aClass6_Sub1_7 != local11) {
			local11 = local11.aClass6_Sub1_9;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!aca;I)V")
	public void method5360(@OriginalArg(0) Class6_Sub1 arg0) {
		if (arg0.aClass6_Sub1_10 != null) {
			arg0.method6809();
		}
		arg0.aClass6_Sub1_9 = this.aClass6_Sub1_7;
		arg0.aClass6_Sub1_10 = this.aClass6_Sub1_7.aClass6_Sub1_10;
		arg0.aClass6_Sub1_10.aClass6_Sub1_9 = arg0;
		arg0.aClass6_Sub1_9.aClass6_Sub1_10 = arg0;
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)Lclient!aca;")
	public Class6_Sub1 method5361() {
		@Pc(7) Class6_Sub1 local7 = this.aClass6_Sub1_7.aClass6_Sub1_9;
		if (local7 == this.aClass6_Sub1_7) {
			this.aClass6_Sub1_8 = null;
			return null;
		} else {
			this.aClass6_Sub1_8 = local7.aClass6_Sub1_9;
			return local7;
		}
	}
}
