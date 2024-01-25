import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mk")
public final class Class130 {

	@OriginalMember(owner = "client!mk", name = "p", descriptor = "Lclient!gl;")
	private Class4 aClass4_145;

	@OriginalMember(owner = "client!mk", name = "h", descriptor = "Lclient!gl;")
	public final Class4 aClass4_144 = new Class4();

	@OriginalMember(owner = "client!mk", name = "<init>", descriptor = "()V")
	public Class130() {
		this.aClass4_144.aClass4_248 = this.aClass4_144;
		this.aClass4_144.aClass4_247 = this.aClass4_144;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(B)Lclient!gl;")
	public Class4 method3499() {
		@Pc(7) Class4 local7 = this.aClass4_144.aClass4_247;
		if (this.aClass4_144 == local7) {
			this.aClass4_145 = null;
			return null;
		} else {
			this.aClass4_145 = local7.aClass4_247;
			return local7;
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)Lclient!gl;")
	public Class4 method3500() {
		@Pc(7) Class4 local7 = this.aClass4_144.aClass4_247;
		if (this.aClass4_144 == local7) {
			return null;
		} else {
			local7.method5667();
			return local7;
		}
	}

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "(B)Lclient!gl;")
	public Class4 method3501() {
		@Pc(14) Class4 local14 = this.aClass4_145;
		if (local14 == this.aClass4_144) {
			this.aClass4_145 = null;
			return null;
		} else {
			this.aClass4_145 = local14.aClass4_248;
			return local14;
		}
	}

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "(Z)I")
	public int method3504() {
		@Pc(12) int local12 = 0;
		@Pc(16) Class4 local16 = this.aClass4_144.aClass4_247;
		while (local16 != this.aClass4_144) {
			local16 = local16.aClass4_247;
			local12++;
		}
		return local12;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lclient!gl;B)V")
	public void method3505(@OriginalArg(0) Class4 arg0) {
		if (arg0.aClass4_248 != null) {
			arg0.method5667();
		}
		arg0.aClass4_248 = this.aClass4_144;
		arg0.aClass4_247 = this.aClass4_144.aClass4_247;
		arg0.aClass4_248.aClass4_247 = arg0;
		arg0.aClass4_247.aClass4_248 = arg0;
	}

	@OriginalMember(owner = "client!mk", name = "c", descriptor = "(B)Lclient!gl;")
	public Class4 method3506() {
		@Pc(14) Class4 local14 = this.aClass4_144.aClass4_248;
		if (this.aClass4_144 == local14) {
			this.aClass4_145 = null;
			return null;
		} else {
			this.aClass4_145 = local14.aClass4_248;
			return local14;
		}
	}

	@OriginalMember(owner = "client!mk", name = "c", descriptor = "(I)Z")
	public boolean method3508() {
		return this.aClass4_144.aClass4_247 == this.aClass4_144;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(ILclient!gl;)V")
	public void method3510(@OriginalArg(1) Class4 arg0) {
		if (arg0.aClass4_248 != null) {
			arg0.method5667();
		}
		arg0.aClass4_247 = this.aClass4_144;
		arg0.aClass4_248 = this.aClass4_144.aClass4_248;
		arg0.aClass4_248.aClass4_247 = arg0;
		arg0.aClass4_247.aClass4_248 = arg0;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lclient!mk;I)V")
	public void method3511(@OriginalArg(0) Class130 arg0) {
		this.method3513(this.aClass4_144.aClass4_247, arg0);
	}

	@OriginalMember(owner = "client!mk", name = "d", descriptor = "(I)Lclient!gl;")
	public Class4 method3512() {
		@Pc(14) Class4 local14 = this.aClass4_145;
		if (local14 == this.aClass4_144) {
			this.aClass4_145 = null;
			return null;
		} else {
			this.aClass4_145 = local14.aClass4_247;
			return local14;
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(BLclient!gl;Lclient!mk;)V")
	private void method3513(@OriginalArg(1) Class4 arg0, @OriginalArg(2) Class130 arg1) {
		@Pc(7) Class4 local7 = this.aClass4_144.aClass4_248;
		this.aClass4_144.aClass4_248 = arg0.aClass4_248;
		arg0.aClass4_248.aClass4_247 = this.aClass4_144;
		if (this.aClass4_144 != arg0) {
			arg0.aClass4_248 = arg1.aClass4_144.aClass4_248;
			arg0.aClass4_248.aClass4_247 = arg0;
			arg1.aClass4_144.aClass4_248 = local7;
			local7.aClass4_247 = arg1.aClass4_144;
		}
	}

	@OriginalMember(owner = "client!mk", name = "c", descriptor = "(Z)V")
	public void method3514() {
		while (true) {
			@Pc(14) Class4 local14 = this.aClass4_144.aClass4_247;
			if (local14 == this.aClass4_144) {
				this.aClass4_145 = null;
				return;
			}
			local14.method5667();
		}
	}
}
