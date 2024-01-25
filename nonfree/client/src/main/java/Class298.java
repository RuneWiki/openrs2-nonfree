import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!su")
public final class Class298 {

	@OriginalMember(owner = "client!su", name = "f", descriptor = "Lclient!ia;")
	private Class6 aClass6_247;

	@OriginalMember(owner = "client!su", name = "d", descriptor = "Lclient!ia;")
	public final Class6 aClass6_246 = new Class6();

	@OriginalMember(owner = "client!su", name = "<init>", descriptor = "()V")
	public Class298() {
		this.aClass6_246.aClass6_284 = this.aClass6_246;
		this.aClass6_246.aClass6_283 = this.aClass6_246;
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(B)V")
	public void method6808() {
		while (true) {
			@Pc(5) Class6 local5 = this.aClass6_246.aClass6_284;
			if (this.aClass6_246 == local5) {
				this.aClass6_247 = null;
				return;
			}
			local5.method7948();
		}
	}

	@OriginalMember(owner = "client!su", name = "b", descriptor = "(B)Lclient!ia;")
	public Class6 method6809() {
		@Pc(7) Class6 local7 = this.aClass6_246.aClass6_284;
		if (this.aClass6_246 == local7) {
			this.aClass6_247 = null;
			return null;
		} else {
			this.aClass6_247 = local7.aClass6_284;
			return local7;
		}
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(Lclient!ia;Lclient!su;B)V")
	private void method6810(@OriginalArg(0) Class6 arg0, @OriginalArg(1) Class298 arg1) {
		@Pc(13) Class6 local13 = this.aClass6_246.aClass6_283;
		this.aClass6_246.aClass6_283 = arg0.aClass6_283;
		arg0.aClass6_283.aClass6_284 = this.aClass6_246;
		if (this.aClass6_246 != arg0) {
			arg0.aClass6_283 = arg1.aClass6_246.aClass6_283;
			arg0.aClass6_283.aClass6_284 = arg0;
			local13.aClass6_284 = arg1.aClass6_246;
			arg1.aClass6_246.aClass6_283 = local13;
		}
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(I)Lclient!ia;")
	public Class6 method6811() {
		@Pc(11) Class6 local11 = this.aClass6_246.aClass6_284;
		if (local11 == this.aClass6_246) {
			return null;
		} else {
			local11.method7948();
			return local11;
		}
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(Lclient!ia;B)V")
	public void method6812(@OriginalArg(0) Class6 arg0) {
		if (arg0.aClass6_283 != null) {
			arg0.method7948();
		}
		arg0.aClass6_283 = this.aClass6_246.aClass6_283;
		arg0.aClass6_284 = this.aClass6_246;
		arg0.aClass6_283.aClass6_284 = arg0;
		arg0.aClass6_284.aClass6_283 = arg0;
	}

	@OriginalMember(owner = "client!su", name = "c", descriptor = "(B)Z")
	public boolean method6813() {
		return this.aClass6_246 == this.aClass6_246.aClass6_284;
	}

	@OriginalMember(owner = "client!su", name = "b", descriptor = "(I)I")
	public int method6815() {
		@Pc(7) int local7 = 0;
		for (@Pc(18) Class6 local18 = this.aClass6_246.aClass6_284; local18 != this.aClass6_246; local18 = local18.aClass6_284) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(BLclient!su;)V")
	public void method6817(@OriginalArg(1) Class298 arg0) {
		this.method6810(this.aClass6_246.aClass6_284, arg0);
	}

	@OriginalMember(owner = "client!su", name = "b", descriptor = "(Lclient!ia;B)V")
	public void method6819(@OriginalArg(0) Class6 arg0) {
		if (arg0.aClass6_283 != null) {
			arg0.method7948();
		}
		arg0.aClass6_283 = this.aClass6_246;
		arg0.aClass6_284 = this.aClass6_246.aClass6_284;
		arg0.aClass6_283.aClass6_284 = arg0;
		arg0.aClass6_284.aClass6_283 = arg0;
	}

	@OriginalMember(owner = "client!su", name = "d", descriptor = "(I)Lclient!ia;")
	public Class6 method6820() {
		@Pc(6) Class6 local6 = this.aClass6_247;
		if (local6 == this.aClass6_246) {
			this.aClass6_247 = null;
			return null;
		} else {
			this.aClass6_247 = local6.aClass6_283;
			return local6;
		}
	}

	@OriginalMember(owner = "client!su", name = "e", descriptor = "(I)Lclient!ia;")
	public Class6 method6821() {
		@Pc(6) Class6 local6 = this.aClass6_247;
		if (local6 == this.aClass6_246) {
			this.aClass6_247 = null;
			return null;
		} else {
			this.aClass6_247 = local6.aClass6_284;
			return local6;
		}
	}

	@OriginalMember(owner = "client!su", name = "f", descriptor = "(I)Lclient!ia;")
	public Class6 method6823() {
		@Pc(12) Class6 local12 = this.aClass6_246.aClass6_283;
		if (this.aClass6_246 == local12) {
			this.aClass6_247 = null;
			return null;
		} else {
			this.aClass6_247 = local12.aClass6_283;
			return local12;
		}
	}
}
