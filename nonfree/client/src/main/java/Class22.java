import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!au")
public final class Class22 {

	@OriginalMember(owner = "client!au", name = "t", descriptor = "Lclient!tv;")
	private Class4 aClass4_14;

	@OriginalMember(owner = "client!au", name = "e", descriptor = "Lclient!tv;")
	public final Class4 aClass4_13 = new Class4();

	@OriginalMember(owner = "client!au", name = "<init>", descriptor = "()V")
	public Class22() {
		this.aClass4_13.aClass4_286 = this.aClass4_13;
		this.aClass4_13.aClass4_285 = this.aClass4_13;
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(I)I")
	public int method880() {
		@Pc(7) int local7 = 0;
		for (@Pc(11) Class4 local11 = this.aClass4_13.aClass4_286; local11 != this.aClass4_13; local11 = local11.aClass4_286) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(ILclient!au;)V")
	public void method881(@OriginalArg(1) Class22 arg0) {
		this.method883(arg0, this.aClass4_13.aClass4_286);
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(Lclient!au;BLclient!tv;)V")
	private void method883(@OriginalArg(0) Class22 arg0, @OriginalArg(2) Class4 arg1) {
		@Pc(7) Class4 local7 = this.aClass4_13.aClass4_285;
		this.aClass4_13.aClass4_285 = arg1.aClass4_285;
		arg1.aClass4_285.aClass4_286 = this.aClass4_13;
		if (arg1 != this.aClass4_13) {
			arg1.aClass4_285 = arg0.aClass4_13.aClass4_285;
			arg1.aClass4_285.aClass4_286 = arg1;
			arg0.aClass4_13.aClass4_285 = local7;
			local7.aClass4_286 = arg0.aClass4_13;
		}
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(Z)Lclient!tv;")
	public Class4 method885() {
		@Pc(7) Class4 local7 = this.aClass4_13.aClass4_285;
		if (this.aClass4_13 == local7) {
			this.aClass4_14 = null;
			return null;
		} else {
			this.aClass4_14 = local7.aClass4_285;
			return local7;
		}
	}

	@OriginalMember(owner = "client!au", name = "c", descriptor = "(I)V")
	public void method886() {
		while (true) {
			@Pc(5) Class4 local5 = this.aClass4_13.aClass4_286;
			if (this.aClass4_13 == local5) {
				this.aClass4_14 = null;
				return;
			}
			local5.method8193();
		}
	}

	@OriginalMember(owner = "client!au", name = "e", descriptor = "(I)Lclient!tv;")
	public Class4 method889() {
		@Pc(6) Class4 local6 = this.aClass4_14;
		if (local6 == this.aClass4_13) {
			this.aClass4_14 = null;
			return null;
		} else {
			this.aClass4_14 = local6.aClass4_286;
			return local6;
		}
	}

	@OriginalMember(owner = "client!au", name = "f", descriptor = "(I)Lclient!tv;")
	public Class4 method891() {
		@Pc(6) Class4 local6 = this.aClass4_14;
		if (this.aClass4_13 == local6) {
			this.aClass4_14 = null;
			return null;
		} else {
			this.aClass4_14 = local6.aClass4_285;
			return local6;
		}
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(Lclient!tv;I)V")
	public void method892(@OriginalArg(0) Class4 arg0) {
		if (arg0.aClass4_285 != null) {
			arg0.method8193();
		}
		arg0.aClass4_286 = this.aClass4_13.aClass4_286;
		arg0.aClass4_285 = this.aClass4_13;
		arg0.aClass4_285.aClass4_286 = arg0;
		arg0.aClass4_286.aClass4_285 = arg0;
	}

	@OriginalMember(owner = "client!au", name = "g", descriptor = "(I)Z")
	public boolean method893() {
		return this.aClass4_13 == this.aClass4_13.aClass4_286;
	}

	@OriginalMember(owner = "client!au", name = "b", descriptor = "(Lclient!tv;I)V")
	public void method894(@OriginalArg(0) Class4 arg0) {
		if (arg0.aClass4_285 != null) {
			arg0.method8193();
		}
		arg0.aClass4_285 = this.aClass4_13.aClass4_285;
		arg0.aClass4_286 = this.aClass4_13;
		arg0.aClass4_285.aClass4_286 = arg0;
		arg0.aClass4_286.aClass4_285 = arg0;
	}

	@OriginalMember(owner = "client!au", name = "h", descriptor = "(I)Lclient!tv;")
	public Class4 method895() {
		@Pc(7) Class4 local7 = this.aClass4_13.aClass4_286;
		if (local7 == this.aClass4_13) {
			this.aClass4_14 = null;
			return null;
		} else {
			this.aClass4_14 = local7.aClass4_286;
			return local7;
		}
	}

	@OriginalMember(owner = "client!au", name = "i", descriptor = "(I)Lclient!tv;")
	public Class4 method896() {
		@Pc(7) Class4 local7 = this.aClass4_13.aClass4_286;
		if (this.aClass4_13 == local7) {
			return null;
		} else {
			local7.method8193();
			return local7;
		}
	}
}
