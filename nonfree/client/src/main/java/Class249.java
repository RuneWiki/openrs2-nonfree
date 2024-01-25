import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rk")
public final class Class249 {

	@OriginalMember(owner = "client!rk", name = "s", descriptor = "Lclient!jd;")
	private Class2 aClass2_225;

	@OriginalMember(owner = "client!rk", name = "q", descriptor = "Lclient!jd;")
	public final Class2 aClass2_224 = new Class2();

	@OriginalMember(owner = "client!rk", name = "<init>", descriptor = "()V")
	public Class249() {
		this.aClass2_224.aClass2_284 = this.aClass2_224;
		this.aClass2_224.aClass2_283 = this.aClass2_224;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(BLclient!rk;)V")
	public void method6518(@OriginalArg(1) Class249 arg0) {
		this.method6528(arg0, this.aClass2_224.aClass2_284);
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(B)Z")
	public boolean method6519() {
		return this.aClass2_224.aClass2_284 == this.aClass2_224;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(ZLclient!jd;)V")
	public void method6520(@OriginalArg(1) Class2 arg0) {
		if (arg0.aClass2_283 != null) {
			arg0.method7802();
		}
		arg0.aClass2_283 = this.aClass2_224;
		arg0.aClass2_284 = this.aClass2_224.aClass2_284;
		arg0.aClass2_283.aClass2_284 = arg0;
		arg0.aClass2_284.aClass2_283 = arg0;
	}

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "(I)Lclient!jd;")
	public Class2 method6521() {
		@Pc(7) Class2 local7 = this.aClass2_224.aClass2_283;
		if (local7 == this.aClass2_224) {
			this.aClass2_225 = null;
			return null;
		} else {
			this.aClass2_225 = local7.aClass2_283;
			return local7;
		}
	}

	@OriginalMember(owner = "client!rk", name = "c", descriptor = "(I)I")
	public int method6522() {
		@Pc(7) int local7 = 0;
		@Pc(11) Class2 local11 = this.aClass2_224.aClass2_284;
		while (local11 != this.aClass2_224) {
			local11 = local11.aClass2_284;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(Lclient!jd;B)V")
	public void method6523(@OriginalArg(0) Class2 arg0) {
		if (arg0.aClass2_283 != null) {
			arg0.method7802();
		}
		arg0.aClass2_284 = this.aClass2_224;
		arg0.aClass2_283 = this.aClass2_224.aClass2_283;
		arg0.aClass2_283.aClass2_284 = arg0;
		arg0.aClass2_284.aClass2_283 = arg0;
	}

	@OriginalMember(owner = "client!rk", name = "d", descriptor = "(I)Lclient!jd;")
	public Class2 method6525() {
		@Pc(6) Class2 local6 = this.aClass2_225;
		if (local6 == this.aClass2_224) {
			this.aClass2_225 = null;
			return null;
		} else {
			this.aClass2_225 = local6.aClass2_284;
			return local6;
		}
	}

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "(B)Lclient!jd;")
	public Class2 method6526() {
		@Pc(11) Class2 local11 = this.aClass2_225;
		if (this.aClass2_224 == local11) {
			this.aClass2_225 = null;
			return null;
		} else {
			this.aClass2_225 = local11.aClass2_283;
			return local11;
		}
	}

	@OriginalMember(owner = "client!rk", name = "c", descriptor = "(B)Lclient!jd;")
	public Class2 method6527() {
		@Pc(15) Class2 local15 = this.aClass2_224.aClass2_284;
		if (this.aClass2_224 == local15) {
			this.aClass2_225 = null;
			return null;
		} else {
			this.aClass2_225 = local15.aClass2_284;
			return local15;
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(Lclient!rk;BLclient!jd;)V")
	private void method6528(@OriginalArg(0) Class249 arg0, @OriginalArg(2) Class2 arg1) {
		@Pc(7) Class2 local7 = this.aClass2_224.aClass2_283;
		this.aClass2_224.aClass2_283 = arg1.aClass2_283;
		arg1.aClass2_283.aClass2_284 = this.aClass2_224;
		if (this.aClass2_224 != arg1) {
			arg1.aClass2_283 = arg0.aClass2_224.aClass2_283;
			arg1.aClass2_283.aClass2_284 = arg1;
			local7.aClass2_284 = arg0.aClass2_224;
			arg0.aClass2_224.aClass2_283 = local7;
		}
	}

	@OriginalMember(owner = "client!rk", name = "d", descriptor = "(B)Lclient!jd;")
	public Class2 method6529() {
		@Pc(7) Class2 local7 = this.aClass2_224.aClass2_284;
		if (this.aClass2_224 == local7) {
			return null;
		} else {
			local7.method7802();
			return local7;
		}
	}

	@OriginalMember(owner = "client!rk", name = "e", descriptor = "(I)V")
	public void method6530() {
		while (true) {
			@Pc(8) Class2 local8 = this.aClass2_224.aClass2_284;
			if (this.aClass2_224 == local8) {
				this.aClass2_225 = null;
				return;
			}
			local8.method7802();
		}
	}
}
