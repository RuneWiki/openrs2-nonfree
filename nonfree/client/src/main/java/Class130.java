import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hga")
public final class Class130 {

	@OriginalMember(owner = "client!hga", name = "p", descriptor = "Lclient!iga;")
	private Class3 aClass3_122;

	@OriginalMember(owner = "client!hga", name = "l", descriptor = "Lclient!iga;")
	public final Class3 aClass3_121 = new Class3();

	@OriginalMember(owner = "client!hga", name = "<init>", descriptor = "()V")
	public Class130() {
		this.aClass3_121.aClass3_285 = this.aClass3_121;
		this.aClass3_121.aClass3_286 = this.aClass3_121;
	}

	@OriginalMember(owner = "client!hga", name = "b", descriptor = "(B)Lclient!iga;")
	public Class3 method3540() {
		@Pc(7) Class3 local7 = this.aClass3_121.aClass3_286;
		if (local7 == this.aClass3_121) {
			this.aClass3_122 = null;
			return null;
		} else {
			this.aClass3_122 = local7.aClass3_286;
			return local7;
		}
	}

	@OriginalMember(owner = "client!hga", name = "c", descriptor = "(B)V")
	public void method3541() {
		while (true) {
			@Pc(5) Class3 local5 = this.aClass3_121.aClass3_285;
			if (this.aClass3_121 == local5) {
				this.aClass3_122 = null;
				return;
			}
			local5.method7812();
		}
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(I)Z")
	public boolean method3542() {
		return this.aClass3_121.aClass3_285 == this.aClass3_121;
	}

	@OriginalMember(owner = "client!hga", name = "b", descriptor = "(I)Lclient!iga;")
	public Class3 method3543() {
		@Pc(12) Class3 local12 = this.aClass3_121.aClass3_285;
		if (local12 == this.aClass3_121) {
			this.aClass3_122 = null;
			return null;
		} else {
			this.aClass3_122 = local12.aClass3_285;
			return local12;
		}
	}

	@OriginalMember(owner = "client!hga", name = "c", descriptor = "(I)I")
	public int method3544() {
		@Pc(7) int local7 = 0;
		for (@Pc(11) Class3 local11 = this.aClass3_121.aClass3_285; local11 != this.aClass3_121; local11 = local11.aClass3_285) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!hga", name = "d", descriptor = "(I)Lclient!iga;")
	public Class3 method3545() {
		@Pc(7) Class3 local7 = this.aClass3_121.aClass3_285;
		if (local7 == this.aClass3_121) {
			return null;
		} else {
			local7.method7812();
			return local7;
		}
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(Lclient!hga;Lclient!iga;B)V")
	private void method3546(@OriginalArg(0) Class130 arg0, @OriginalArg(1) Class3 arg1) {
		@Pc(7) Class3 local7 = this.aClass3_121.aClass3_286;
		this.aClass3_121.aClass3_286 = arg1.aClass3_286;
		arg1.aClass3_286.aClass3_285 = this.aClass3_121;
		if (this.aClass3_121 != arg1) {
			arg1.aClass3_286 = arg0.aClass3_121.aClass3_286;
			arg1.aClass3_286.aClass3_285 = arg1;
			arg0.aClass3_121.aClass3_286 = local7;
			local7.aClass3_285 = arg0.aClass3_121;
		}
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(Lclient!iga;B)V")
	public void method3547(@OriginalArg(0) Class3 arg0) {
		if (arg0.aClass3_286 != null) {
			arg0.method7812();
		}
		arg0.aClass3_285 = this.aClass3_121.aClass3_285;
		arg0.aClass3_286 = this.aClass3_121;
		arg0.aClass3_286.aClass3_285 = arg0;
		arg0.aClass3_285.aClass3_286 = arg0;
	}

	@OriginalMember(owner = "client!hga", name = "b", descriptor = "(Lclient!iga;B)V")
	public void method3548(@OriginalArg(0) Class3 arg0) {
		if (arg0.aClass3_286 != null) {
			arg0.method7812();
		}
		arg0.aClass3_286 = this.aClass3_121.aClass3_286;
		arg0.aClass3_285 = this.aClass3_121;
		arg0.aClass3_286.aClass3_285 = arg0;
		arg0.aClass3_285.aClass3_286 = arg0;
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(Lclient!hga;Z)V")
	public void method3549(@OriginalArg(0) Class130 arg0) {
		this.method3546(arg0, this.aClass3_121.aClass3_285);
	}

	@OriginalMember(owner = "client!hga", name = "e", descriptor = "(I)Lclient!iga;")
	public Class3 method3550() {
		@Pc(12) Class3 local12 = this.aClass3_122;
		if (local12 == this.aClass3_121) {
			this.aClass3_122 = null;
			return null;
		} else {
			this.aClass3_122 = local12.aClass3_286;
			return local12;
		}
	}

	@OriginalMember(owner = "client!hga", name = "f", descriptor = "(I)Lclient!iga;")
	public Class3 method3551() {
		@Pc(6) Class3 local6 = this.aClass3_122;
		if (local6 == this.aClass3_121) {
			this.aClass3_122 = null;
			return null;
		} else {
			this.aClass3_122 = local6.aClass3_285;
			return local6;
		}
	}
}
