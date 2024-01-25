import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ws")
public final class Class361 {

	@OriginalMember(owner = "client!ws", name = "j", descriptor = "Lclient!kd;")
	private Class6 aClass6_288;

	@OriginalMember(owner = "client!ws", name = "e", descriptor = "Lclient!kd;")
	public final Class6 aClass6_287 = new Class6();

	@OriginalMember(owner = "client!ws", name = "<init>", descriptor = "()V")
	public Class361() {
		this.aClass6_287.aClass6_285 = this.aClass6_287;
		this.aClass6_287.aClass6_286 = this.aClass6_287;
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(B)Lclient!kd;")
	public Class6 method7832() {
		@Pc(14) Class6 local14 = this.aClass6_288;
		if (this.aClass6_287 == local14) {
			this.aClass6_288 = null;
			return null;
		} else {
			this.aClass6_288 = local14.aClass6_285;
			return local14;
		}
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(Lclient!kd;I)V")
	public void method7833(@OriginalArg(0) Class6 arg0) {
		if (arg0.aClass6_285 != null) {
			arg0.method7804();
		}
		arg0.aClass6_286 = this.aClass6_287;
		arg0.aClass6_285 = this.aClass6_287.aClass6_285;
		arg0.aClass6_285.aClass6_286 = arg0;
		arg0.aClass6_286.aClass6_285 = arg0;
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(I)Lclient!kd;")
	public Class6 method7835() {
		@Pc(7) Class6 local7 = this.aClass6_287.aClass6_286;
		if (local7 == this.aClass6_287) {
			return null;
		} else {
			local7.method7804();
			return local7;
		}
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(ILclient!kd;)V")
	public void method7836(@OriginalArg(1) Class6 arg0) {
		if (arg0.aClass6_285 != null) {
			arg0.method7804();
		}
		arg0.aClass6_286 = this.aClass6_287.aClass6_286;
		arg0.aClass6_285 = this.aClass6_287;
		arg0.aClass6_285.aClass6_286 = arg0;
		arg0.aClass6_286.aClass6_285 = arg0;
	}

	@OriginalMember(owner = "client!ws", name = "c", descriptor = "(B)Z")
	public boolean method7837() {
		return this.aClass6_287.aClass6_286 == this.aClass6_287;
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(Z)Lclient!kd;")
	public Class6 method7838() {
		@Pc(12) Class6 local12 = this.aClass6_287.aClass6_286;
		if (local12 == this.aClass6_287) {
			this.aClass6_288 = null;
			return null;
		} else {
			this.aClass6_288 = local12.aClass6_286;
			return local12;
		}
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(Lclient!ws;ILclient!kd;)V")
	private void method7839(@OriginalArg(0) Class361 arg0, @OriginalArg(2) Class6 arg1) {
		@Pc(15) Class6 local15 = this.aClass6_287.aClass6_285;
		this.aClass6_287.aClass6_285 = arg1.aClass6_285;
		arg1.aClass6_285.aClass6_286 = this.aClass6_287;
		if (arg1 != this.aClass6_287) {
			arg1.aClass6_285 = arg0.aClass6_287.aClass6_285;
			arg1.aClass6_285.aClass6_286 = arg1;
			arg0.aClass6_287.aClass6_285 = local15;
			local15.aClass6_286 = arg0.aClass6_287;
		}
	}

	@OriginalMember(owner = "client!ws", name = "b", descriptor = "(I)Lclient!kd;")
	public Class6 method7840() {
		@Pc(13) Class6 local13 = this.aClass6_287.aClass6_285;
		if (local13 == this.aClass6_287) {
			this.aClass6_288 = null;
			return null;
		} else {
			this.aClass6_288 = local13.aClass6_285;
			return local13;
		}
	}

	@OriginalMember(owner = "client!ws", name = "c", descriptor = "(I)I")
	public int method7841() {
		@Pc(13) int local13 = 0;
		@Pc(17) Class6 local17 = this.aClass6_287.aClass6_286;
		while (local17 != this.aClass6_287) {
			local17 = local17.aClass6_286;
			local13++;
		}
		return local13;
	}

	@OriginalMember(owner = "client!ws", name = "d", descriptor = "(B)V")
	public void method7842() {
		while (true) {
			@Pc(5) Class6 local5 = this.aClass6_287.aClass6_286;
			if (local5 == this.aClass6_287) {
				this.aClass6_288 = null;
				return;
			}
			local5.method7804();
		}
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(ILclient!ws;)V")
	public void method7843(@OriginalArg(1) Class361 arg0) {
		this.method7839(arg0, this.aClass6_287.aClass6_286);
	}

	@OriginalMember(owner = "client!ws", name = "e", descriptor = "(B)Lclient!kd;")
	public Class6 method7845() {
		@Pc(6) Class6 local6 = this.aClass6_288;
		if (local6 == this.aClass6_287) {
			this.aClass6_288 = null;
			return null;
		} else {
			this.aClass6_288 = local6.aClass6_286;
			return local6;
		}
	}
}
