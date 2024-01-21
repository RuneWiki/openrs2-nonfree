import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!se")
public final class Class65 {

	@OriginalMember(owner = "client!se", name = "v", descriptor = "Lclient!ad;")
	private Class3 aClass3_112;

	@OriginalMember(owner = "client!se", name = "c", descriptor = "Lclient!ad;")
	public final Class3 aClass3_111 = new Class3();

	@OriginalMember(owner = "client!se", name = "<init>", descriptor = "()V")
	public Class65() {
		this.aClass3_111.aClass3_128 = this.aClass3_111;
		this.aClass3_111.aClass3_127 = this.aClass3_111;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Z)Lclient!ad;")
	public Class3 method1954() {
		@Pc(6) Class3 local6 = this.aClass3_112;
		if (this.aClass3_111 == local6) {
			this.aClass3_112 = null;
			return null;
		} else {
			this.aClass3_112 = local6.aClass3_128;
			return local6;
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!ad;B)V")
	public void method1955(@OriginalArg(0) Class3 arg0) {
		if (arg0.aClass3_128 != null) {
			arg0.method2201();
		}
		arg0.aClass3_127 = this.aClass3_111;
		arg0.aClass3_128 = this.aClass3_111.aClass3_128;
		arg0.aClass3_128.aClass3_127 = arg0;
		arg0.aClass3_127.aClass3_128 = arg0;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(I)Lclient!ad;")
	public Class3 method1956() {
		@Pc(12) Class3 local12 = this.aClass3_111.aClass3_128;
		if (local12 == this.aClass3_111) {
			return null;
		} else {
			local12.method2201();
			return local12;
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(B)V")
	public void method1957() {
		while (true) {
			@Pc(15) Class3 local15 = this.aClass3_111.aClass3_127;
			if (this.aClass3_111 == local15) {
				return;
			}
			local15.method2201();
		}
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(I)Lclient!ad;")
	public Class3 method1958() {
		@Pc(14) Class3 local14 = this.aClass3_111.aClass3_127;
		if (local14 == this.aClass3_111) {
			this.aClass3_112 = null;
			return null;
		} else {
			this.aClass3_112 = local14.aClass3_127;
			return local14;
		}
	}

	@OriginalMember(owner = "client!se", name = "c", descriptor = "(I)Lclient!ad;")
	public Class3 method1959() {
		@Pc(7) Class3 local7 = this.aClass3_111.aClass3_127;
		if (this.aClass3_111 == local7) {
			return null;
		} else {
			local7.method2201();
			return local7;
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!ad;BLclient!ad;)V")
	public void method1961(@OriginalArg(0) Class3 arg0, @OriginalArg(2) Class3 arg1) {
		if (arg0.aClass3_128 != null) {
			arg0.method2201();
		}
		arg0.aClass3_128 = arg1.aClass3_128;
		arg0.aClass3_127 = arg1;
		arg0.aClass3_128.aClass3_127 = arg0;
		arg0.aClass3_127.aClass3_128 = arg0;
	}

	@OriginalMember(owner = "client!se", name = "d", descriptor = "(I)Lclient!ad;")
	public Class3 method1962() {
		@Pc(2) Class3 local2 = this.aClass3_112;
		if (local2 == this.aClass3_111) {
			this.aClass3_112 = null;
			return null;
		} else {
			this.aClass3_112 = local2.aClass3_127;
			return local2;
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(ZLclient!ad;)V")
	public void method1964(@OriginalArg(1) Class3 arg0) {
		if (arg0.aClass3_128 != null) {
			arg0.method2201();
		}
		arg0.aClass3_127 = this.aClass3_111.aClass3_127;
		arg0.aClass3_128 = this.aClass3_111;
		arg0.aClass3_128.aClass3_127 = arg0;
		arg0.aClass3_127.aClass3_128 = arg0;
	}

	@OriginalMember(owner = "client!se", name = "e", descriptor = "(I)Lclient!ad;")
	public Class3 method1965() {
		@Pc(13) Class3 local13 = this.aClass3_111.aClass3_128;
		if (this.aClass3_111 == local13) {
			this.aClass3_112 = null;
			return null;
		} else {
			this.aClass3_112 = local13.aClass3_128;
			return local13;
		}
	}
}
