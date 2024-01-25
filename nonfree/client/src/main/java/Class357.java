import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tj")
public final class Class357 {

	@OriginalMember(owner = "client!tj", name = "q", descriptor = "Lclient!an;")
	private Class3 aClass3_304;

	@OriginalMember(owner = "client!tj", name = "d", descriptor = "Lclient!an;")
	public final Class3 aClass3_303 = new Class3();

	@OriginalMember(owner = "client!tj", name = "<init>", descriptor = "()V")
	public Class357() {
		this.aClass3_303.aClass3_341 = this.aClass3_303;
		this.aClass3_303.aClass3_342 = this.aClass3_303;
	}

	@OriginalMember(owner = "client!tj", name = "d", descriptor = "(B)Lclient!an;")
	public Class3 method8390() {
		@Pc(7) Class3 local7 = this.aClass3_303.aClass3_342;
		if (this.aClass3_303 == local7) {
			this.aClass3_304 = null;
			return null;
		} else {
			this.aClass3_304 = local7.aClass3_342;
			return local7;
		}
	}

	@OriginalMember(owner = "client!tj", name = "c", descriptor = "(B)Lclient!an;")
	public Class3 method8391() {
		@Pc(7) Class3 local7 = this.aClass3_303.aClass3_341;
		if (this.aClass3_303 == local7) {
			this.aClass3_304 = null;
			return null;
		} else {
			this.aClass3_304 = local7.aClass3_341;
			return local7;
		}
	}

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "(B)Lclient!an;")
	public Class3 method8392() {
		@Pc(12) Class3 local12 = this.aClass3_304;
		if (this.aClass3_303 == local12) {
			this.aClass3_304 = null;
			return null;
		} else {
			this.aClass3_304 = local12.aClass3_341;
			return local12;
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lclient!tj;I)V")
	public void method8393(@OriginalArg(0) Class357 arg0) {
		this.method8402(arg0, this.aClass3_303.aClass3_341);
	}

	@OriginalMember(owner = "client!tj", name = "c", descriptor = "(I)I")
	public int method8397() {
		@Pc(7) int local7 = 0;
		@Pc(11) Class3 local11 = this.aClass3_303.aClass3_341;
		while (local11 != this.aClass3_303) {
			local11 = local11.aClass3_341;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(Z)Lclient!an;")
	public Class3 method8398() {
		@Pc(13) Class3 local13 = this.aClass3_303.aClass3_341;
		if (local13 == this.aClass3_303) {
			return null;
		} else {
			local13.method9446();
			return local13;
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lclient!an;B)V")
	public void method8400(@OriginalArg(0) Class3 arg0) {
		if (arg0.aClass3_342 != null) {
			arg0.method9446();
		}
		arg0.aClass3_341 = this.aClass3_303.aClass3_341;
		arg0.aClass3_342 = this.aClass3_303;
		arg0.aClass3_342.aClass3_341 = arg0;
		arg0.aClass3_341.aClass3_342 = arg0;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(BLclient!an;)V")
	public void method8401(@OriginalArg(1) Class3 arg0) {
		if (arg0.aClass3_342 != null) {
			arg0.method9446();
		}
		arg0.aClass3_342 = this.aClass3_303.aClass3_342;
		arg0.aClass3_341 = this.aClass3_303;
		arg0.aClass3_342.aClass3_341 = arg0;
		arg0.aClass3_341.aClass3_342 = arg0;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(ILclient!tj;Lclient!an;)V")
	private void method8402(@OriginalArg(1) Class357 arg0, @OriginalArg(2) Class3 arg1) {
		@Pc(7) Class3 local7 = this.aClass3_303.aClass3_342;
		this.aClass3_303.aClass3_342 = arg1.aClass3_342;
		arg1.aClass3_342.aClass3_341 = this.aClass3_303;
		if (arg1 != this.aClass3_303) {
			arg1.aClass3_342 = arg0.aClass3_303.aClass3_342;
			arg1.aClass3_342.aClass3_341 = arg1;
			arg0.aClass3_303.aClass3_342 = local7;
			local7.aClass3_341 = arg0.aClass3_303;
		}
	}

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "(I)V")
	public void method8403() {
		while (true) {
			@Pc(5) Class3 local5 = this.aClass3_303.aClass3_341;
			if (local5 == this.aClass3_303) {
				this.aClass3_304 = null;
				return;
			}
			local5.method9446();
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)Z")
	public boolean method8404() {
		return this.aClass3_303 == this.aClass3_303.aClass3_341;
	}

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "(Z)Lclient!an;")
	public Class3 method8405() {
		@Pc(14) Class3 local14 = this.aClass3_304;
		if (local14 == this.aClass3_303) {
			this.aClass3_304 = null;
			return null;
		} else {
			this.aClass3_304 = local14.aClass3_342;
			return local14;
		}
	}
}
