import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tu")
public final class Class229 {

	@OriginalMember(owner = "client!tu", name = "l", descriptor = "Lclient!lf;")
	private Class3 aClass3_234;

	@OriginalMember(owner = "client!tu", name = "i", descriptor = "Lclient!lf;")
	public final Class3 aClass3_233 = new Class3();

	@OriginalMember(owner = "client!tu", name = "<init>", descriptor = "()V")
	public Class229() {
		this.aClass3_233.aClass3_261 = this.aClass3_233;
		this.aClass3_233.aClass3_262 = this.aClass3_233;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(B)Z")
	public boolean method5317() {
		return this.aClass3_233 == this.aClass3_233.aClass3_261;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(Z)Lclient!lf;")
	public Class3 method5318() {
		@Pc(7) Class3 local7 = this.aClass3_233.aClass3_262;
		if (local7 == this.aClass3_233) {
			this.aClass3_234 = null;
			return null;
		} else {
			this.aClass3_234 = local7.aClass3_262;
			return local7;
		}
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(ILclient!lf;)V")
	public void method5320(@OriginalArg(1) Class3 arg0) {
		if (arg0.aClass3_262 != null) {
			arg0.method5987();
		}
		arg0.aClass3_262 = this.aClass3_233;
		arg0.aClass3_261 = this.aClass3_233.aClass3_261;
		arg0.aClass3_262.aClass3_261 = arg0;
		arg0.aClass3_261.aClass3_262 = arg0;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lclient!lf;I)V")
	public void method5321(@OriginalArg(0) Class3 arg0) {
		if (arg0.aClass3_262 != null) {
			arg0.method5987();
		}
		arg0.aClass3_261 = this.aClass3_233;
		arg0.aClass3_262 = this.aClass3_233.aClass3_262;
		arg0.aClass3_262.aClass3_261 = arg0;
		arg0.aClass3_261.aClass3_262 = arg0;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lclient!tu;I)V")
	public void method5322(@OriginalArg(0) Class229 arg0) {
		this.method5323(arg0, this.aClass3_233.aClass3_261);
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lclient!tu;Lclient!lf;I)V")
	private void method5323(@OriginalArg(0) Class229 arg0, @OriginalArg(1) Class3 arg1) {
		@Pc(7) Class3 local7 = this.aClass3_233.aClass3_262;
		this.aClass3_233.aClass3_262 = arg1.aClass3_262;
		arg1.aClass3_262.aClass3_261 = this.aClass3_233;
		if (arg1 != this.aClass3_233) {
			arg1.aClass3_262 = arg0.aClass3_233.aClass3_262;
			arg1.aClass3_262.aClass3_261 = arg1;
			local7.aClass3_261 = arg0.aClass3_233;
			arg0.aClass3_233.aClass3_262 = local7;
		}
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(I)I")
	public int method5324() {
		@Pc(5) int local5 = 0;
		for (@Pc(9) Class3 local9 = this.aClass3_233.aClass3_261; local9 != this.aClass3_233; local9 = local9.aClass3_261) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "(B)Lclient!lf;")
	public Class3 method5325() {
		@Pc(11) Class3 local11 = this.aClass3_234;
		if (this.aClass3_233 == local11) {
			this.aClass3_234 = null;
			return null;
		} else {
			this.aClass3_234 = local11.aClass3_261;
			return local11;
		}
	}

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "(I)V")
	public void method5326() {
		while (true) {
			@Pc(7) Class3 local7 = this.aClass3_233.aClass3_261;
			if (local7 == this.aClass3_233) {
				this.aClass3_234 = null;
				return;
			}
			local7.method5987();
		}
	}

	@OriginalMember(owner = "client!tu", name = "d", descriptor = "(I)Lclient!lf;")
	public Class3 method5328() {
		@Pc(7) Class3 local7 = this.aClass3_233.aClass3_261;
		if (this.aClass3_233 == local7) {
			this.aClass3_234 = null;
			return null;
		} else {
			this.aClass3_234 = local7.aClass3_261;
			return local7;
		}
	}

	@OriginalMember(owner = "client!tu", name = "c", descriptor = "(B)Lclient!lf;")
	public Class3 method5329() {
		@Pc(6) Class3 local6 = this.aClass3_234;
		if (this.aClass3_233 == local6) {
			this.aClass3_234 = null;
			return null;
		} else {
			this.aClass3_234 = local6.aClass3_262;
			return local6;
		}
	}

	@OriginalMember(owner = "client!tu", name = "d", descriptor = "(B)Lclient!lf;")
	public Class3 method5331() {
		@Pc(12) Class3 local12 = this.aClass3_233.aClass3_261;
		if (this.aClass3_233 == local12) {
			return null;
		} else {
			local12.method5987();
			return local12;
		}
	}
}
