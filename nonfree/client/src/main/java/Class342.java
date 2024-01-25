import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sja")
public final class Class342 {

	@OriginalMember(owner = "client!sja", name = "m", descriptor = "Lclient!tfa;")
	private Class3 aClass3_292;

	@OriginalMember(owner = "client!sja", name = "c", descriptor = "Lclient!tfa;")
	public final Class3 aClass3_291 = new Class3();

	@OriginalMember(owner = "client!sja", name = "<init>", descriptor = "()V")
	public Class342() {
		this.aClass3_291.aClass3_345 = this.aClass3_291;
		this.aClass3_291.aClass3_346 = this.aClass3_291;
	}

	@OriginalMember(owner = "client!sja", name = "a", descriptor = "(BLclient!sja;Lclient!tfa;)V")
	private void method7643(@OriginalArg(1) Class342 arg0, @OriginalArg(2) Class3 arg1) {
		@Pc(7) Class3 local7 = this.aClass3_291.aClass3_345;
		this.aClass3_291.aClass3_345 = arg1.aClass3_345;
		arg1.aClass3_345.aClass3_346 = this.aClass3_291;
		if (arg1 != this.aClass3_291) {
			arg1.aClass3_345 = arg0.aClass3_291.aClass3_345;
			arg1.aClass3_345.aClass3_346 = arg1;
			arg0.aClass3_291.aClass3_345 = local7;
			local7.aClass3_346 = arg0.aClass3_291;
		}
	}

	@OriginalMember(owner = "client!sja", name = "g", descriptor = "(I)Lclient!tfa;")
	public Class3 method7644() {
		@Pc(17) Class3 local17 = this.aClass3_291.aClass3_346;
		if (local17 == this.aClass3_291) {
			this.aClass3_292 = null;
			return null;
		} else {
			this.aClass3_292 = local17.aClass3_346;
			return local17;
		}
	}

	@OriginalMember(owner = "client!sja", name = "a", descriptor = "(I)I")
	public int method7647() {
		@Pc(7) int local7 = 0;
		for (@Pc(17) Class3 local17 = this.aClass3_291.aClass3_346; local17 != this.aClass3_291; local17 = local17.aClass3_346) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!sja", name = "f", descriptor = "(I)Lclient!tfa;")
	public Class3 method7649() {
		@Pc(6) Class3 local6 = this.aClass3_292;
		if (this.aClass3_291 == local6) {
			this.aClass3_292 = null;
			return null;
		} else {
			this.aClass3_292 = local6.aClass3_345;
			return local6;
		}
	}

	@OriginalMember(owner = "client!sja", name = "b", descriptor = "(B)Lclient!tfa;")
	public Class3 method7650() {
		@Pc(13) Class3 local13 = this.aClass3_292;
		if (local13 == this.aClass3_291) {
			this.aClass3_292 = null;
			return null;
		} else {
			this.aClass3_292 = local13.aClass3_346;
			return local13;
		}
	}

	@OriginalMember(owner = "client!sja", name = "a", descriptor = "(Lclient!tfa;B)V")
	public void method7651(@OriginalArg(0) Class3 arg0) {
		if (arg0.aClass3_345 != null) {
			arg0.method9596();
		}
		arg0.aClass3_346 = this.aClass3_291.aClass3_346;
		arg0.aClass3_345 = this.aClass3_291;
		arg0.aClass3_345.aClass3_346 = arg0;
		arg0.aClass3_346.aClass3_345 = arg0;
	}

	@OriginalMember(owner = "client!sja", name = "c", descriptor = "(I)Z")
	public boolean method7652() {
		return this.aClass3_291.aClass3_346 == this.aClass3_291;
	}

	@OriginalMember(owner = "client!sja", name = "a", descriptor = "(B)Lclient!tfa;")
	public Class3 method7653() {
		@Pc(16) Class3 local16 = this.aClass3_291.aClass3_346;
		if (this.aClass3_291 == local16) {
			return null;
		} else {
			local16.method9596();
			return local16;
		}
	}

	@OriginalMember(owner = "client!sja", name = "a", descriptor = "(ILclient!tfa;)V")
	public void method7654(@OriginalArg(1) Class3 arg0) {
		if (arg0.aClass3_345 != null) {
			arg0.method9596();
		}
		arg0.aClass3_346 = this.aClass3_291;
		arg0.aClass3_345 = this.aClass3_291.aClass3_345;
		arg0.aClass3_345.aClass3_346 = arg0;
		arg0.aClass3_346.aClass3_345 = arg0;
	}

	@OriginalMember(owner = "client!sja", name = "b", descriptor = "(I)V")
	public void method7655() {
		while (true) {
			@Pc(14) Class3 local14 = this.aClass3_291.aClass3_346;
			if (this.aClass3_291 == local14) {
				this.aClass3_292 = null;
				return;
			}
			local14.method9596();
		}
	}

	@OriginalMember(owner = "client!sja", name = "d", descriptor = "(I)Lclient!tfa;")
	public Class3 method7656() {
		@Pc(7) Class3 local7 = this.aClass3_291.aClass3_345;
		if (local7 == this.aClass3_291) {
			this.aClass3_292 = null;
			return null;
		} else {
			this.aClass3_292 = local7.aClass3_345;
			return local7;
		}
	}

	@OriginalMember(owner = "client!sja", name = "a", descriptor = "(Lclient!sja;I)V")
	public void method7657(@OriginalArg(0) Class342 arg0) {
		this.method7643(arg0, this.aClass3_291.aClass3_346);
	}
}
