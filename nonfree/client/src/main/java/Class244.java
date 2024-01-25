import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!um")
public final class Class244 {

	@OriginalMember(owner = "client!um", name = "u", descriptor = "Lclient!cg;")
	private Class6 aClass6_221;

	@OriginalMember(owner = "client!um", name = "t", descriptor = "Lclient!cg;")
	public final Class6 aClass6_220 = new Class6();

	@OriginalMember(owner = "client!um", name = "<init>", descriptor = "()V")
	public Class244() {
		this.aClass6_220.aClass6_251 = this.aClass6_220;
		this.aClass6_220.aClass6_252 = this.aClass6_220;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(B)Lclient!cg;")
	public Class6 method5964() {
		@Pc(11) Class6 local11 = this.aClass6_221;
		if (local11 == this.aClass6_220) {
			this.aClass6_221 = null;
			return null;
		} else {
			this.aClass6_221 = local11.aClass6_252;
			return local11;
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(I)I")
	public int method5965() {
		@Pc(12) int local12 = 0;
		@Pc(16) Class6 local16 = this.aClass6_220.aClass6_252;
		while (local16 != this.aClass6_220) {
			local16 = local16.aClass6_252;
			local12++;
		}
		return local12;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(BLclient!cg;)V")
	public void method5966(@OriginalArg(1) Class6 arg0) {
		if (arg0.aClass6_251 != null) {
			arg0.method6525();
		}
		arg0.aClass6_252 = this.aClass6_220;
		arg0.aClass6_251 = this.aClass6_220.aClass6_251;
		arg0.aClass6_251.aClass6_252 = arg0;
		arg0.aClass6_252.aClass6_251 = arg0;
	}

	@OriginalMember(owner = "client!um", name = "d", descriptor = "(I)V")
	public void method5969() {
		while (true) {
			@Pc(5) Class6 local5 = this.aClass6_220.aClass6_252;
			if (local5 == this.aClass6_220) {
				this.aClass6_221 = null;
				return;
			}
			local5.method6525();
		}
	}

	@OriginalMember(owner = "client!um", name = "e", descriptor = "(I)Z")
	public boolean method5970() {
		return this.aClass6_220.aClass6_252 == this.aClass6_220;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(ZLclient!um;)V")
	public void method5971(@OriginalArg(1) Class244 arg0) {
		this.method5977(this.aClass6_220.aClass6_252, arg0);
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(ILclient!cg;)V")
	public void method5972(@OriginalArg(1) Class6 arg0) {
		if (arg0.aClass6_251 != null) {
			arg0.method6525();
		}
		arg0.aClass6_252 = this.aClass6_220.aClass6_252;
		arg0.aClass6_251 = this.aClass6_220;
		arg0.aClass6_251.aClass6_252 = arg0;
		arg0.aClass6_252.aClass6_251 = arg0;
	}

	@OriginalMember(owner = "client!um", name = "f", descriptor = "(I)Lclient!cg;")
	public Class6 method5973() {
		@Pc(7) Class6 local7 = this.aClass6_220.aClass6_252;
		if (local7 == this.aClass6_220) {
			return null;
		} else {
			local7.method6525();
			return local7;
		}
	}

	@OriginalMember(owner = "client!um", name = "g", descriptor = "(I)Lclient!cg;")
	public Class6 method5974() {
		@Pc(7) Class6 local7 = this.aClass6_220.aClass6_251;
		if (this.aClass6_220 == local7) {
			this.aClass6_221 = null;
			return null;
		} else {
			this.aClass6_221 = local7.aClass6_251;
			return local7;
		}
	}

	@OriginalMember(owner = "client!um", name = "h", descriptor = "(I)Lclient!cg;")
	public Class6 method5976() {
		@Pc(12) Class6 local12 = this.aClass6_220.aClass6_252;
		if (local12 == this.aClass6_220) {
			this.aClass6_221 = null;
			return null;
		} else {
			this.aClass6_221 = local12.aClass6_252;
			return local12;
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(ZLclient!cg;Lclient!um;)V")
	private void method5977(@OriginalArg(1) Class6 arg0, @OriginalArg(2) Class244 arg1) {
		@Pc(7) Class6 local7 = this.aClass6_220.aClass6_251;
		this.aClass6_220.aClass6_251 = arg0.aClass6_251;
		arg0.aClass6_251.aClass6_252 = this.aClass6_220;
		if (arg0 != this.aClass6_220) {
			arg0.aClass6_251 = arg1.aClass6_220.aClass6_251;
			arg0.aClass6_251.aClass6_252 = arg0;
			local7.aClass6_252 = arg1.aClass6_220;
			arg1.aClass6_220.aClass6_251 = local7;
		}
	}

	@OriginalMember(owner = "client!um", name = "i", descriptor = "(I)Lclient!cg;")
	public Class6 method5978() {
		@Pc(10) Class6 local10 = this.aClass6_221;
		if (local10 == this.aClass6_220) {
			this.aClass6_221 = null;
			return null;
		} else {
			this.aClass6_221 = local10.aClass6_251;
			return local10;
		}
	}
}
