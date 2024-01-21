import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!c")
public final class Class11 {

	@OriginalMember(owner = "client!c", name = "x", descriptor = "Lclient!ib;")
	private Class3 aClass3_12;

	@OriginalMember(owner = "client!c", name = "v", descriptor = "Lclient!ib;")
	public final Class3 aClass3_11 = new Class3();

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "()V")
	public Class11() {
		this.aClass3_11.aClass3_115 = this.aClass3_11;
		this.aClass3_11.aClass3_116 = this.aClass3_11;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(I)Lclient!ib;")
	public Class3 method186() {
		@Pc(3) Class3 local3 = this.aClass3_11.aClass3_115;
		if (this.aClass3_11 == local3) {
			return null;
		} else {
			local3.method1962();
			return local3;
		}
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(I)Lclient!ib;")
	public Class3 method187() {
		@Pc(6) Class3 local6 = this.aClass3_12;
		if (this.aClass3_11 == local6) {
			this.aClass3_12 = null;
			return null;
		} else {
			this.aClass3_12 = local6.aClass3_116;
			return local6;
		}
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(I)Lclient!ib;")
	public Class3 method189() {
		@Pc(12) Class3 local12 = this.aClass3_11.aClass3_116;
		if (this.aClass3_11 == local12) {
			this.aClass3_12 = null;
			return null;
		} else {
			this.aClass3_12 = local12.aClass3_116;
			return local12;
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ILclient!ib;)V")
	public void method190(@OriginalArg(1) Class3 arg0) {
		if (arg0.aClass3_115 != null) {
			arg0.method1962();
		}
		arg0.aClass3_115 = this.aClass3_11.aClass3_115;
		arg0.aClass3_116 = this.aClass3_11;
		arg0.aClass3_115.aClass3_116 = arg0;
		arg0.aClass3_116.aClass3_115 = arg0;
	}

	@OriginalMember(owner = "client!c", name = "e", descriptor = "(I)Lclient!ib;")
	public Class3 method193() {
		@Pc(8) Class3 local8 = this.aClass3_11.aClass3_116;
		if (local8 == this.aClass3_11) {
			return null;
		} else {
			local8.method1962();
			return local8;
		}
	}

	@OriginalMember(owner = "client!c", name = "h", descriptor = "(I)Lclient!ib;")
	public Class3 method196() {
		@Pc(14) Class3 local14 = this.aClass3_12;
		if (local14 == this.aClass3_11) {
			this.aClass3_12 = null;
			return null;
		} else {
			this.aClass3_12 = local14.aClass3_115;
			return local14;
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!ib;B)V")
	public void method197(@OriginalArg(0) Class3 arg0) {
		if (arg0.aClass3_115 != null) {
			arg0.method1962();
		}
		arg0.aClass3_115 = this.aClass3_11;
		arg0.aClass3_116 = this.aClass3_11.aClass3_116;
		arg0.aClass3_115.aClass3_116 = arg0;
		arg0.aClass3_116.aClass3_115 = arg0;
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(B)Lclient!ib;")
	public Class3 method198() {
		@Pc(15) Class3 local15 = this.aClass3_11.aClass3_115;
		if (this.aClass3_11 == local15) {
			this.aClass3_12 = null;
			return null;
		} else {
			this.aClass3_12 = local15.aClass3_115;
			return local15;
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!ib;BLclient!ib;)V")
	public void method199(@OriginalArg(0) Class3 arg0, @OriginalArg(2) Class3 arg1) {
		if (arg0.aClass3_115 != null) {
			arg0.method1962();
		}
		arg0.aClass3_115 = arg1.aClass3_115;
		arg0.aClass3_116 = arg1;
		arg0.aClass3_115.aClass3_116 = arg0;
		arg0.aClass3_116.aClass3_115 = arg0;
	}

	@OriginalMember(owner = "client!c", name = "i", descriptor = "(I)V")
	public void method201() {
		while (true) {
			@Pc(12) Class3 local12 = this.aClass3_11.aClass3_116;
			if (this.aClass3_11 == local12) {
				return;
			}
			local12.method1962();
		}
	}
}
