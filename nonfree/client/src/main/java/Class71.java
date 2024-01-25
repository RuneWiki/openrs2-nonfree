import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eea")
public final class Class71 {

	@OriginalMember(owner = "client!eea", name = "o", descriptor = "Lclient!uj;")
	private Class3 aClass3_74;

	@OriginalMember(owner = "client!eea", name = "c", descriptor = "Lclient!uj;")
	public final Class3 aClass3_73 = new Class3();

	@OriginalMember(owner = "client!eea", name = "<init>", descriptor = "()V")
	public Class71() {
		this.aClass3_73.aClass3_284 = this.aClass3_73;
		this.aClass3_73.aClass3_283 = this.aClass3_73;
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(Lclient!uj;Z)V")
	public void method2076(@OriginalArg(0) Class3 arg0) {
		if (arg0.aClass3_283 != null) {
			arg0.method7820();
		}
		arg0.aClass3_283 = this.aClass3_73.aClass3_283;
		arg0.aClass3_284 = this.aClass3_73;
		arg0.aClass3_283.aClass3_284 = arg0;
		arg0.aClass3_284.aClass3_283 = arg0;
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(B)I")
	public int method2077() {
		@Pc(12) int local12 = 0;
		for (@Pc(16) Class3 local16 = this.aClass3_73.aClass3_284; local16 != this.aClass3_73; local16 = local16.aClass3_284) {
			local12++;
		}
		return local12;
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(Lclient!uj;ZLclient!eea;)V")
	private void method2079(@OriginalArg(0) Class3 arg0, @OriginalArg(2) Class71 arg1) {
		@Pc(14) Class3 local14 = this.aClass3_73.aClass3_283;
		this.aClass3_73.aClass3_283 = arg0.aClass3_283;
		arg0.aClass3_283.aClass3_284 = this.aClass3_73;
		if (arg0 != this.aClass3_73) {
			arg0.aClass3_283 = arg1.aClass3_73.aClass3_283;
			arg0.aClass3_283.aClass3_284 = arg0;
			local14.aClass3_284 = arg1.aClass3_73;
			arg1.aClass3_73.aClass3_283 = local14;
		}
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(Lclient!uj;I)V")
	public void method2080(@OriginalArg(0) Class3 arg0) {
		if (arg0.aClass3_283 != null) {
			arg0.method7820();
		}
		arg0.aClass3_284 = this.aClass3_73.aClass3_284;
		arg0.aClass3_283 = this.aClass3_73;
		arg0.aClass3_283.aClass3_284 = arg0;
		arg0.aClass3_284.aClass3_283 = arg0;
	}

	@OriginalMember(owner = "client!eea", name = "b", descriptor = "(I)Lclient!uj;")
	public Class3 method2081() {
		@Pc(12) Class3 local12 = this.aClass3_73.aClass3_283;
		if (this.aClass3_73 == local12) {
			this.aClass3_74 = null;
			return null;
		} else {
			this.aClass3_74 = local12.aClass3_283;
			return local12;
		}
	}

	@OriginalMember(owner = "client!eea", name = "b", descriptor = "(B)Lclient!uj;")
	public Class3 method2082() {
		@Pc(6) Class3 local6 = this.aClass3_74;
		if (local6 == this.aClass3_73) {
			this.aClass3_74 = null;
			return null;
		} else {
			this.aClass3_74 = local6.aClass3_283;
			return local6;
		}
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(Lclient!eea;B)V")
	public void method2083(@OriginalArg(0) Class71 arg0) {
		this.method2079(this.aClass3_73.aClass3_284, arg0);
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(Z)Lclient!uj;")
	public Class3 method2084() {
		@Pc(7) Class3 local7 = this.aClass3_73.aClass3_284;
		if (this.aClass3_73 == local7) {
			return null;
		} else {
			local7.method7820();
			return local7;
		}
	}

	@OriginalMember(owner = "client!eea", name = "b", descriptor = "(Z)Z")
	public boolean method2085() {
		return this.aClass3_73.aClass3_284 == this.aClass3_73;
	}

	@OriginalMember(owner = "client!eea", name = "c", descriptor = "(I)Lclient!uj;")
	public Class3 method2086() {
		@Pc(11) Class3 local11 = this.aClass3_74;
		if (this.aClass3_73 == local11) {
			this.aClass3_74 = null;
			return null;
		} else {
			this.aClass3_74 = local11.aClass3_284;
			return local11;
		}
	}

	@OriginalMember(owner = "client!eea", name = "d", descriptor = "(I)V")
	public void method2088() {
		while (true) {
			@Pc(13) Class3 local13 = this.aClass3_73.aClass3_284;
			if (this.aClass3_73 == local13) {
				this.aClass3_74 = null;
				return;
			}
			local13.method7820();
		}
	}

	@OriginalMember(owner = "client!eea", name = "c", descriptor = "(Z)Lclient!uj;")
	public Class3 method2089() {
		@Pc(14) Class3 local14 = this.aClass3_73.aClass3_284;
		if (this.aClass3_73 == local14) {
			this.aClass3_74 = null;
			return null;
		} else {
			this.aClass3_74 = local14.aClass3_284;
			return local14;
		}
	}
}
