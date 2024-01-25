import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ko")
public final class Class142 {

	@OriginalMember(owner = "client!ko", name = "e", descriptor = "[I")
	public static final int[] anIntArray298 = new int[32];

	@OriginalMember(owner = "client!ko", name = "u", descriptor = "Lclient!oo;")
	private Class1 aClass1_144;

	@OriginalMember(owner = "client!ko", name = "q", descriptor = "Lclient!oo;")
	public final Class1 aClass1_143 = new Class1();

	static {
		@Pc(4) int local4 = 2;
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			anIntArray298[local6] = local4 - 1;
			local4 += local4;
		}
	}

	@OriginalMember(owner = "client!ko", name = "<init>", descriptor = "()V")
	public Class142() {
		this.aClass1_143.aClass1_261 = this.aClass1_143;
		this.aClass1_143.aClass1_262 = this.aClass1_143;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(I)Lclient!oo;")
	public Class1 method3196() {
		@Pc(7) Class1 local7 = this.aClass1_143.aClass1_262;
		if (local7 == this.aClass1_143) {
			return null;
		} else {
			local7.method5965();
			return local7;
		}
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(I)Lclient!oo;")
	public Class1 method3198() {
		@Pc(6) Class1 local6 = this.aClass1_144;
		if (this.aClass1_143 == local6) {
			this.aClass1_144 = null;
			return null;
		} else {
			this.aClass1_144 = local6.aClass1_262;
			return local6;
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(B)Lclient!oo;")
	public Class1 method3199() {
		@Pc(12) Class1 local12 = this.aClass1_143.aClass1_262;
		if (this.aClass1_143 == local12) {
			this.aClass1_144 = null;
			return null;
		} else {
			this.aClass1_144 = local12.aClass1_262;
			return local12;
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lclient!oo;Lclient!ko;I)V")
	private void method3200(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Class142 arg1) {
		@Pc(7) Class1 local7 = this.aClass1_143.aClass1_261;
		this.aClass1_143.aClass1_261 = arg0.aClass1_261;
		arg0.aClass1_261.aClass1_262 = this.aClass1_143;
		if (arg0 != this.aClass1_143) {
			arg0.aClass1_261 = arg1.aClass1_143.aClass1_261;
			arg0.aClass1_261.aClass1_262 = arg0;
			local7.aClass1_262 = arg1.aClass1_143;
			arg1.aClass1_143.aClass1_261 = local7;
		}
	}

	@OriginalMember(owner = "client!ko", name = "c", descriptor = "(I)Lclient!oo;")
	public Class1 method3202() {
		@Pc(18) Class1 local18 = this.aClass1_143.aClass1_261;
		if (this.aClass1_143 == local18) {
			this.aClass1_144 = null;
			return null;
		} else {
			this.aClass1_144 = local18.aClass1_261;
			return local18;
		}
	}

	@OriginalMember(owner = "client!ko", name = "d", descriptor = "(I)V")
	public void method3206() {
		while (true) {
			@Pc(11) Class1 local11 = this.aClass1_143.aClass1_262;
			if (this.aClass1_143 == local11) {
				this.aClass1_144 = null;
				return;
			}
			local11.method5965();
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(BLclient!oo;)V")
	public void method3207(@OriginalArg(1) Class1 arg0) {
		if (arg0.aClass1_261 != null) {
			arg0.method5965();
		}
		arg0.aClass1_262 = this.aClass1_143.aClass1_262;
		arg0.aClass1_261 = this.aClass1_143;
		arg0.aClass1_261.aClass1_262 = arg0;
		arg0.aClass1_262.aClass1_261 = arg0;
	}

	@OriginalMember(owner = "client!ko", name = "e", descriptor = "(I)I")
	public int method3208() {
		@Pc(12) int local12 = 0;
		@Pc(16) Class1 local16 = this.aClass1_143.aClass1_262;
		while (this.aClass1_143 != local16) {
			local16 = local16.aClass1_262;
			local12++;
		}
		return local12;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lclient!ko;I)V")
	public void method3209(@OriginalArg(0) Class142 arg0) {
		this.method3200(this.aClass1_143.aClass1_262, arg0);
	}

	@OriginalMember(owner = "client!ko", name = "c", descriptor = "(B)Z")
	public boolean method3210() {
		return this.aClass1_143.aClass1_262 == this.aClass1_143;
	}

	@OriginalMember(owner = "client!ko", name = "d", descriptor = "(B)Lclient!oo;")
	public Class1 method3211() {
		@Pc(6) Class1 local6 = this.aClass1_144;
		if (local6 == this.aClass1_143) {
			this.aClass1_144 = null;
			return null;
		} else {
			this.aClass1_144 = local6.aClass1_261;
			return local6;
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(ILclient!oo;)V")
	public void method3212(@OriginalArg(1) Class1 arg0) {
		if (arg0.aClass1_261 != null) {
			arg0.method5965();
		}
		arg0.aClass1_262 = this.aClass1_143;
		arg0.aClass1_261 = this.aClass1_143.aClass1_261;
		arg0.aClass1_261.aClass1_262 = arg0;
		arg0.aClass1_262.aClass1_261 = arg0;
	}
}
