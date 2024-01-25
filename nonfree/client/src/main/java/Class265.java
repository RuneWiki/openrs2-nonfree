import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wl")
public final class Class265 {

	@OriginalMember(owner = "client!wl", name = "r", descriptor = "Lclient!da;")
	private Class2 aClass2_258;

	@OriginalMember(owner = "client!wl", name = "k", descriptor = "Lclient!da;")
	public final Class2 aClass2_257 = new Class2();

	@OriginalMember(owner = "client!wl", name = "<init>", descriptor = "()V")
	public Class265() {
		this.aClass2_257.aClass2_261 = this.aClass2_257;
		this.aClass2_257.aClass2_262 = this.aClass2_257;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(BLclient!da;)V")
	public void method5992(@OriginalArg(1) Class2 arg0) {
		if (arg0.aClass2_262 != null) {
			arg0.method6072();
		}
		arg0.aClass2_261 = this.aClass2_257.aClass2_261;
		arg0.aClass2_262 = this.aClass2_257;
		arg0.aClass2_262.aClass2_261 = arg0;
		arg0.aClass2_261.aClass2_262 = arg0;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)Lclient!da;")
	public Class2 method5993() {
		@Pc(6) Class2 local6 = this.aClass2_258;
		if (local6 == this.aClass2_257) {
			this.aClass2_258 = null;
			return null;
		} else {
			this.aClass2_258 = local6.aClass2_262;
			return local6;
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(B)Lclient!da;")
	public Class2 method5995() {
		@Pc(12) Class2 local12 = this.aClass2_257.aClass2_261;
		if (local12 == this.aClass2_257) {
			return null;
		} else {
			local12.method6072();
			return local12;
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lclient!da;Lclient!wl;Z)V")
	private void method5996(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class265 arg1) {
		@Pc(7) Class2 local7 = this.aClass2_257.aClass2_262;
		this.aClass2_257.aClass2_262 = arg0.aClass2_262;
		arg0.aClass2_262.aClass2_261 = this.aClass2_257;
		if (this.aClass2_257 != arg0) {
			arg0.aClass2_262 = arg1.aClass2_257.aClass2_262;
			arg0.aClass2_262.aClass2_261 = arg0;
			arg1.aClass2_257.aClass2_262 = local7;
			local7.aClass2_261 = arg1.aClass2_257;
		}
	}

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "(B)Z")
	public boolean method5997() {
		return this.aClass2_257.aClass2_261 == this.aClass2_257;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(BLclient!wl;)V")
	public void method5998(@OriginalArg(1) Class265 arg0) {
		this.method5996(this.aClass2_257.aClass2_261, arg0);
	}

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "(BLclient!da;)V")
	public void method5999(@OriginalArg(1) Class2 arg0) {
		if (arg0.aClass2_262 != null) {
			arg0.method6072();
		}
		arg0.aClass2_262 = this.aClass2_257.aClass2_262;
		arg0.aClass2_261 = this.aClass2_257;
		arg0.aClass2_262.aClass2_261 = arg0;
		arg0.aClass2_261.aClass2_262 = arg0;
	}

	@OriginalMember(owner = "client!wl", name = "c", descriptor = "(I)Lclient!da;")
	public Class2 method6001() {
		@Pc(13) Class2 local13 = this.aClass2_258;
		if (this.aClass2_257 == local13) {
			this.aClass2_258 = null;
			return null;
		} else {
			this.aClass2_258 = local13.aClass2_261;
			return local13;
		}
	}

	@OriginalMember(owner = "client!wl", name = "d", descriptor = "(I)I")
	public int method6002() {
		@Pc(5) int local5 = 0;
		@Pc(9) Class2 local9 = this.aClass2_257.aClass2_261;
		while (this.aClass2_257 != local9) {
			local9 = local9.aClass2_261;
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!wl", name = "c", descriptor = "(B)V")
	public void method6003() {
		while (true) {
			@Pc(5) Class2 local5 = this.aClass2_257.aClass2_261;
			if (this.aClass2_257 == local5) {
				this.aClass2_258 = null;
				return;
			}
			local5.method6072();
		}
	}

	@OriginalMember(owner = "client!wl", name = "d", descriptor = "(B)Lclient!da;")
	public Class2 method6005() {
		@Pc(12) Class2 local12 = this.aClass2_257.aClass2_261;
		if (this.aClass2_257 == local12) {
			this.aClass2_258 = null;
			return null;
		} else {
			this.aClass2_258 = local12.aClass2_261;
			return local12;
		}
	}

	@OriginalMember(owner = "client!wl", name = "e", descriptor = "(I)Lclient!da;")
	public Class2 method6006() {
		@Pc(7) Class2 local7 = this.aClass2_257.aClass2_262;
		if (local7 == this.aClass2_257) {
			this.aClass2_258 = null;
			return null;
		} else {
			this.aClass2_258 = local7.aClass2_262;
			return local7;
		}
	}
}
