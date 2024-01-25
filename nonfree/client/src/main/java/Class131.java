import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hga")
public final class Class131 {

	@OriginalMember(owner = "client!hga", name = "k", descriptor = "Lclient!wm;")
	private Class15_Sub5 aClass15_Sub5_8;

	@OriginalMember(owner = "client!hga", name = "i", descriptor = "Lclient!wm;")
	public final Class15_Sub5 aClass15_Sub5_7 = new Class15_Sub5();

	@OriginalMember(owner = "client!hga", name = "<init>", descriptor = "()V")
	public Class131() {
		this.aClass15_Sub5_7.aClass15_Sub5_9 = this.aClass15_Sub5_7;
		this.aClass15_Sub5_7.aClass15_Sub5_10 = this.aClass15_Sub5_7;
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(I)Lclient!wm;")
	public Class15_Sub5 method3724() {
		@Pc(11) Class15_Sub5 local11 = this.aClass15_Sub5_7.aClass15_Sub5_9;
		if (local11 == this.aClass15_Sub5_7) {
			this.aClass15_Sub5_8 = null;
			return null;
		} else {
			this.aClass15_Sub5_8 = local11.aClass15_Sub5_9;
			return local11;
		}
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(B)V")
	public void method3725() {
		while (true) {
			@Pc(5) Class15_Sub5 local5 = this.aClass15_Sub5_7.aClass15_Sub5_9;
			if (local5 == this.aClass15_Sub5_7) {
				this.aClass15_Sub5_8 = null;
				return;
			}
			local5.method8189();
		}
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(Z)Lclient!wm;")
	public Class15_Sub5 method3727() {
		@Pc(11) Class15_Sub5 local11 = this.aClass15_Sub5_8;
		if (local11 == this.aClass15_Sub5_7) {
			this.aClass15_Sub5_8 = null;
			return null;
		} else {
			this.aClass15_Sub5_8 = local11.aClass15_Sub5_9;
			return local11;
		}
	}

	@OriginalMember(owner = "client!hga", name = "b", descriptor = "(I)I")
	public int method3728() {
		@Pc(7) int local7 = 0;
		@Pc(17) Class15_Sub5 local17 = this.aClass15_Sub5_7.aClass15_Sub5_9;
		while (local17 != this.aClass15_Sub5_7) {
			local17 = local17.aClass15_Sub5_9;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(Lclient!wm;I)V")
	public void method3729(@OriginalArg(0) Class15_Sub5 arg0) {
		if (arg0.aClass15_Sub5_10 != null) {
			arg0.method8189();
		}
		arg0.aClass15_Sub5_10 = this.aClass15_Sub5_7.aClass15_Sub5_10;
		arg0.aClass15_Sub5_9 = this.aClass15_Sub5_7;
		arg0.aClass15_Sub5_10.aClass15_Sub5_9 = arg0;
		arg0.aClass15_Sub5_9.aClass15_Sub5_10 = arg0;
	}
}
