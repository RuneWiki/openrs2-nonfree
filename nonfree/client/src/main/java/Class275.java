import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rh")
public final class Class275 {

	@OriginalMember(owner = "client!rh", name = "r", descriptor = "Lclient!sf;")
	private Class6 aClass6_230;

	@OriginalMember(owner = "client!rh", name = "f", descriptor = "Lclient!sf;")
	public final Class6 aClass6_229 = new Class6();

	@OriginalMember(owner = "client!rh", name = "<init>", descriptor = "()V")
	public Class275() {
		this.aClass6_229.aClass6_283 = this.aClass6_229;
		this.aClass6_229.aClass6_284 = this.aClass6_229;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V")
	public void method6357() {
		while (true) {
			@Pc(5) Class6 local5 = this.aClass6_229.aClass6_284;
			if (this.aClass6_229 == local5) {
				this.aClass6_230 = null;
				return;
			}
			local5.method7849();
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lclient!rh;Lclient!sf;I)V")
	private void method6358(@OriginalArg(0) Class275 arg0, @OriginalArg(1) Class6 arg1) {
		@Pc(7) Class6 local7 = this.aClass6_229.aClass6_283;
		this.aClass6_229.aClass6_283 = arg1.aClass6_283;
		arg1.aClass6_283.aClass6_284 = this.aClass6_229;
		if (this.aClass6_229 != arg1) {
			arg1.aClass6_283 = arg0.aClass6_229.aClass6_283;
			arg1.aClass6_283.aClass6_284 = arg1;
			local7.aClass6_284 = arg0.aClass6_229;
			arg0.aClass6_229.aClass6_283 = local7;
		}
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(I)Lclient!sf;")
	public Class6 method6360() {
		@Pc(7) Class6 local7 = this.aClass6_229.aClass6_284;
		if (local7 == this.aClass6_229) {
			return null;
		} else {
			local7.method7849();
			return local7;
		}
	}

	@OriginalMember(owner = "client!rh", name = "c", descriptor = "(I)I")
	public int method6361() {
		@Pc(7) int local7 = 0;
		@Pc(11) Class6 local11 = this.aClass6_229.aClass6_284;
		while (this.aClass6_229 != local11) {
			local11 = local11.aClass6_284;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!rh", name = "d", descriptor = "(I)Lclient!sf;")
	public Class6 method6363() {
		@Pc(6) Class6 local6 = this.aClass6_230;
		if (local6 == this.aClass6_229) {
			this.aClass6_230 = null;
			return null;
		} else {
			this.aClass6_230 = local6.aClass6_283;
			return local6;
		}
	}

	@OriginalMember(owner = "client!rh", name = "e", descriptor = "(I)Lclient!sf;")
	public Class6 method6364() {
		@Pc(13) Class6 local13 = this.aClass6_230;
		if (this.aClass6_229 == local13) {
			this.aClass6_230 = null;
			return null;
		} else {
			this.aClass6_230 = local13.aClass6_284;
			return local13;
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(B)Lclient!sf;")
	public Class6 method6366() {
		@Pc(7) Class6 local7 = this.aClass6_229.aClass6_284;
		if (this.aClass6_229 == local7) {
			this.aClass6_230 = null;
			return null;
		} else {
			this.aClass6_230 = local7.aClass6_284;
			return local7;
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(BLclient!rh;)V")
	public void method6367(@OriginalArg(1) Class275 arg0) {
		this.method6358(arg0, this.aClass6_229.aClass6_284);
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(ZLclient!sf;)V")
	public void method6368(@OriginalArg(1) Class6 arg0) {
		if (arg0.aClass6_283 != null) {
			arg0.method7849();
		}
		arg0.aClass6_284 = this.aClass6_229.aClass6_284;
		arg0.aClass6_283 = this.aClass6_229;
		arg0.aClass6_283.aClass6_284 = arg0;
		arg0.aClass6_284.aClass6_283 = arg0;
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(B)Lclient!sf;")
	public Class6 method6369() {
		@Pc(14) Class6 local14 = this.aClass6_229.aClass6_283;
		if (local14 == this.aClass6_229) {
			this.aClass6_230 = null;
			return null;
		} else {
			this.aClass6_230 = local14.aClass6_283;
			return local14;
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lclient!sf;I)V")
	public void method6370(@OriginalArg(0) Class6 arg0) {
		if (arg0.aClass6_283 != null) {
			arg0.method7849();
		}
		arg0.aClass6_284 = this.aClass6_229;
		arg0.aClass6_283 = this.aClass6_229.aClass6_283;
		arg0.aClass6_283.aClass6_284 = arg0;
		arg0.aClass6_284.aClass6_283 = arg0;
	}

	@OriginalMember(owner = "client!rh", name = "f", descriptor = "(I)Z")
	public boolean method6371() {
		return this.aClass6_229.aClass6_284 == this.aClass6_229;
	}
}
