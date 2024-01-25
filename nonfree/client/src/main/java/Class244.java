import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!or")
public final class Class244 {

	@OriginalMember(owner = "client!or", name = "n", descriptor = "Lclient!u;")
	private Class3 aClass3_190;

	@OriginalMember(owner = "client!or", name = "j", descriptor = "Lclient!u;")
	public final Class3 aClass3_189 = new Class3();

	@OriginalMember(owner = "client!or", name = "<init>", descriptor = "()V")
	public Class244() {
		this.aClass3_189.aClass3_285 = this.aClass3_189;
		this.aClass3_189.aClass3_286 = this.aClass3_189;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(BLclient!u;)V")
	public void method5570(@OriginalArg(1) Class3 arg0) {
		if (arg0.aClass3_286 != null) {
			arg0.method8128();
		}
		arg0.aClass3_286 = this.aClass3_189.aClass3_286;
		arg0.aClass3_285 = this.aClass3_189;
		arg0.aClass3_286.aClass3_285 = arg0;
		arg0.aClass3_285.aClass3_286 = arg0;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(I)Z")
	public boolean method5571() {
		return this.aClass3_189.aClass3_285 == this.aClass3_189;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(B)Lclient!u;")
	public Class3 method5572() {
		@Pc(7) Class3 local7 = this.aClass3_189.aClass3_285;
		if (local7 == this.aClass3_189) {
			this.aClass3_190 = null;
			return null;
		} else {
			this.aClass3_190 = local7.aClass3_285;
			return local7;
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Lclient!u;B)V")
	public void method5573(@OriginalArg(0) Class3 arg0) {
		if (arg0.aClass3_286 != null) {
			arg0.method8128();
		}
		arg0.aClass3_285 = this.aClass3_189.aClass3_285;
		arg0.aClass3_286 = this.aClass3_189;
		arg0.aClass3_286.aClass3_285 = arg0;
		arg0.aClass3_285.aClass3_286 = arg0;
	}

	@OriginalMember(owner = "client!or", name = "b", descriptor = "(I)Lclient!u;")
	public Class3 method5574() {
		@Pc(12) Class3 local12 = this.aClass3_190;
		if (local12 == this.aClass3_189) {
			this.aClass3_190 = null;
			return null;
		} else {
			this.aClass3_190 = local12.aClass3_286;
			return local12;
		}
	}

	@OriginalMember(owner = "client!or", name = "c", descriptor = "(I)I")
	public int method5575() {
		@Pc(7) int local7 = 0;
		for (@Pc(11) Class3 local11 = this.aClass3_189.aClass3_285; local11 != this.aClass3_189; local11 = local11.aClass3_285) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!or", name = "d", descriptor = "(I)Lclient!u;")
	public Class3 method5576() {
		@Pc(11) Class3 local11 = this.aClass3_190;
		if (local11 == this.aClass3_189) {
			this.aClass3_190 = null;
			return null;
		} else {
			this.aClass3_190 = local11.aClass3_285;
			return local11;
		}
	}

	@OriginalMember(owner = "client!or", name = "e", descriptor = "(I)Lclient!u;")
	public Class3 method5577() {
		@Pc(11) Class3 local11 = this.aClass3_189.aClass3_286;
		if (this.aClass3_189 == local11) {
			this.aClass3_190 = null;
			return null;
		} else {
			this.aClass3_190 = local11.aClass3_286;
			return local11;
		}
	}

	@OriginalMember(owner = "client!or", name = "f", descriptor = "(I)Lclient!u;")
	public Class3 method5578() {
		@Pc(7) Class3 local7 = this.aClass3_189.aClass3_285;
		if (local7 == this.aClass3_189) {
			return null;
		} else {
			local7.method8128();
			return local7;
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(ILclient!or;)V")
	public void method5579(@OriginalArg(1) Class244 arg0) {
		this.method5580(arg0, this.aClass3_189.aClass3_285);
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(ILclient!or;Lclient!u;)V")
	private void method5580(@OriginalArg(1) Class244 arg0, @OriginalArg(2) Class3 arg1) {
		@Pc(7) Class3 local7 = this.aClass3_189.aClass3_286;
		this.aClass3_189.aClass3_286 = arg1.aClass3_286;
		arg1.aClass3_286.aClass3_285 = this.aClass3_189;
		if (this.aClass3_189 != arg1) {
			arg1.aClass3_286 = arg0.aClass3_189.aClass3_286;
			arg1.aClass3_286.aClass3_285 = arg1;
			local7.aClass3_285 = arg0.aClass3_189;
			arg0.aClass3_189.aClass3_286 = local7;
		}
	}

	@OriginalMember(owner = "client!or", name = "g", descriptor = "(I)V")
	public void method5581() {
		while (true) {
			@Pc(16) Class3 local16 = this.aClass3_189.aClass3_285;
			if (local16 == this.aClass3_189) {
				this.aClass3_190 = null;
				return;
			}
			local16.method8128();
		}
	}
}
