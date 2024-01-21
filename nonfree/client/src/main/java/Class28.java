import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public final class Class28 {

	@OriginalMember(owner = "client!he", name = "J", descriptor = "Lclient!w;")
	private Class3 aClass3_40;

	@OriginalMember(owner = "client!he", name = "H", descriptor = "Lclient!w;")
	public final Class3 aClass3_39 = new Class3();

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "()V")
	public Class28() {
		this.aClass3_39.aClass3_96 = this.aClass3_39;
		this.aClass3_39.aClass3_95 = this.aClass3_39;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Z)Lclient!w;")
	public Class3 method875() {
		@Pc(6) Class3 local6 = this.aClass3_40;
		if (this.aClass3_39 == local6) {
			this.aClass3_40 = null;
			return null;
		} else {
			this.aClass3_40 = local6.aClass3_95;
			return local6;
		}
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(B)Lclient!w;")
	public Class3 method877() {
		@Pc(13) Class3 local13 = this.aClass3_40;
		if (this.aClass3_39 == local13) {
			this.aClass3_40 = null;
			return null;
		} else {
			this.aClass3_40 = local13.aClass3_96;
			return local13;
		}
	}

	@OriginalMember(owner = "client!he", name = "c", descriptor = "(B)Lclient!w;")
	public Class3 method880() {
		@Pc(7) Class3 local7 = this.aClass3_39.aClass3_96;
		if (local7 == this.aClass3_39) {
			return null;
		} else {
			local7.method1883();
			return local7;
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!w;B)V")
	public void method881(@OriginalArg(0) Class3 arg0) {
		if (arg0.aClass3_96 != null) {
			arg0.method1883();
		}
		arg0.aClass3_95 = this.aClass3_39.aClass3_95;
		arg0.aClass3_96 = this.aClass3_39;
		arg0.aClass3_96.aClass3_95 = arg0;
		arg0.aClass3_95.aClass3_96 = arg0;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(I)Lclient!w;")
	public Class3 method882() {
		@Pc(3) Class3 local3 = this.aClass3_39.aClass3_95;
		if (this.aClass3_39 == local3) {
			return null;
		} else {
			local3.method1883();
			return local3;
		}
	}

	@OriginalMember(owner = "client!he", name = "e", descriptor = "(B)Lclient!w;")
	public Class3 method884() {
		@Pc(7) Class3 local7 = this.aClass3_39.aClass3_95;
		if (local7 == this.aClass3_39) {
			this.aClass3_40 = null;
			return null;
		} else {
			this.aClass3_40 = local7.aClass3_95;
			return local7;
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!w;Lclient!w;I)V")
	public void method885(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class3 arg1) {
		if (arg1.aClass3_96 != null) {
			arg1.method1883();
		}
		arg1.aClass3_95 = arg0;
		arg1.aClass3_96 = arg0.aClass3_96;
		arg1.aClass3_96.aClass3_95 = arg1;
		arg1.aClass3_95.aClass3_96 = arg1;
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(I)Lclient!w;")
	public Class3 method886() {
		@Pc(7) Class3 local7 = this.aClass3_39.aClass3_96;
		if (local7 == this.aClass3_39) {
			this.aClass3_40 = null;
			return null;
		} else {
			this.aClass3_40 = local7.aClass3_96;
			return local7;
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!w;Z)V")
	public void method889(@OriginalArg(0) Class3 arg0) {
		if (arg0.aClass3_96 != null) {
			arg0.method1883();
		}
		arg0.aClass3_95 = this.aClass3_39;
		arg0.aClass3_96 = this.aClass3_39.aClass3_96;
		arg0.aClass3_96.aClass3_95 = arg0;
		arg0.aClass3_95.aClass3_96 = arg0;
	}

	@OriginalMember(owner = "client!he", name = "f", descriptor = "(B)V")
	public void method891() {
		while (true) {
			@Pc(11) Class3 local11 = this.aClass3_39.aClass3_95;
			if (this.aClass3_39 == local11) {
				return;
			}
			local11.method1883();
		}
	}
}
