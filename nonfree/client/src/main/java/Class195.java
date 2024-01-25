import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tc")
public final class Class195 {

	@OriginalMember(owner = "client!tc", name = "v", descriptor = "Lclient!mh;")
	private Class1 aClass1_208;

	@OriginalMember(owner = "client!tc", name = "s", descriptor = "Lclient!mh;")
	public final Class1 aClass1_207 = new Class1();

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "()V")
	public Class195() {
		this.aClass1_207.aClass1_247 = this.aClass1_207;
		this.aClass1_207.aClass1_248 = this.aClass1_207;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)Z")
	public boolean method5017() {
		return this.aClass1_207.aClass1_247 == this.aClass1_207;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILclient!mh;)V")
	public void method5018(@OriginalArg(1) Class1 arg0) {
		if (arg0.aClass1_248 != null) {
			arg0.method5710();
		}
		arg0.aClass1_247 = this.aClass1_207;
		arg0.aClass1_248 = this.aClass1_207.aClass1_248;
		arg0.aClass1_248.aClass1_247 = arg0;
		arg0.aClass1_247.aClass1_248 = arg0;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!tc;I)V")
	public void method5020(@OriginalArg(0) Class195 arg0) {
		this.method5033(arg0, this.aClass1_207.aClass1_247);
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)Lclient!mh;")
	public Class1 method5021() {
		@Pc(14) Class1 local14 = this.aClass1_208;
		if (local14 == this.aClass1_207) {
			this.aClass1_208 = null;
			return null;
		} else {
			this.aClass1_208 = local14.aClass1_247;
			return local14;
		}
	}

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "(I)Lclient!mh;")
	public Class1 method5023() {
		@Pc(6) Class1 local6 = this.aClass1_208;
		if (local6 == this.aClass1_207) {
			this.aClass1_208 = null;
			return null;
		} else {
			this.aClass1_208 = local6.aClass1_248;
			return local6;
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!mh;I)V")
	public void method5024(@OriginalArg(0) Class1 arg0) {
		if (arg0.aClass1_248 != null) {
			arg0.method5710();
		}
		arg0.aClass1_247 = this.aClass1_207.aClass1_247;
		arg0.aClass1_248 = this.aClass1_207;
		arg0.aClass1_248.aClass1_247 = arg0;
		arg0.aClass1_247.aClass1_248 = arg0;
	}

	@OriginalMember(owner = "client!tc", name = "d", descriptor = "(I)I")
	public int method5026() {
		@Pc(7) int local7 = 0;
		@Pc(18) Class1 local18 = this.aClass1_207.aClass1_247;
		while (local18 != this.aClass1_207) {
			local18 = local18.aClass1_247;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "(B)Lclient!mh;")
	public Class1 method5029() {
		@Pc(14) Class1 local14 = this.aClass1_207.aClass1_247;
		if (local14 == this.aClass1_207) {
			this.aClass1_208 = null;
			return null;
		} else {
			this.aClass1_208 = local14.aClass1_247;
			return local14;
		}
	}

	@OriginalMember(owner = "client!tc", name = "e", descriptor = "(I)Lclient!mh;")
	public Class1 method5030() {
		@Pc(13) Class1 local13 = this.aClass1_207.aClass1_248;
		if (local13 == this.aClass1_207) {
			this.aClass1_208 = null;
			return null;
		} else {
			this.aClass1_208 = local13.aClass1_248;
			return local13;
		}
	}

	@OriginalMember(owner = "client!tc", name = "d", descriptor = "(B)Lclient!mh;")
	public Class1 method5031() {
		@Pc(15) Class1 local15 = this.aClass1_207.aClass1_247;
		if (this.aClass1_207 == local15) {
			return null;
		} else {
			local15.method5710();
			return local15;
		}
	}

	@OriginalMember(owner = "client!tc", name = "f", descriptor = "(I)V")
	public void method5032() {
		while (true) {
			@Pc(5) Class1 local5 = this.aClass1_207.aClass1_247;
			if (local5 == this.aClass1_207) {
				this.aClass1_208 = null;
				return;
			}
			local5.method5710();
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!tc;BLclient!mh;)V")
	private void method5033(@OriginalArg(0) Class195 arg0, @OriginalArg(2) Class1 arg1) {
		@Pc(7) Class1 local7 = this.aClass1_207.aClass1_248;
		this.aClass1_207.aClass1_248 = arg1.aClass1_248;
		arg1.aClass1_248.aClass1_247 = this.aClass1_207;
		if (this.aClass1_207 != arg1) {
			arg1.aClass1_248 = arg0.aClass1_207.aClass1_248;
			arg1.aClass1_248.aClass1_247 = arg1;
			arg0.aClass1_207.aClass1_248 = local7;
			local7.aClass1_247 = arg0.aClass1_207;
		}
	}
}
