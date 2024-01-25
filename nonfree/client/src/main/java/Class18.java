import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bd")
public final class Class18 {

	@OriginalMember(owner = "client!bd", name = "k", descriptor = "Lclient!tf;")
	private Class14 aClass14_18;

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "Lclient!tf;")
	public final Class14 aClass14_17 = new Class14();

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "()V")
	public Class18() {
		this.aClass14_17.aClass14_247 = this.aClass14_17;
		this.aClass14_17.aClass14_248 = this.aClass14_17;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)I")
	public int method447() {
		@Pc(7) int local7 = 0;
		for (@Pc(16) Class14 local16 = this.aClass14_17.aClass14_248; local16 != this.aClass14_17; local16 = local16.aClass14_248) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILclient!tf;)V")
	public void method451(@OriginalArg(1) Class14 arg0) {
		if (arg0.aClass14_247 != null) {
			arg0.method5986();
		}
		arg0.aClass14_248 = this.aClass14_17;
		arg0.aClass14_247 = this.aClass14_17.aClass14_247;
		arg0.aClass14_247.aClass14_248 = arg0;
		arg0.aClass14_248.aClass14_247 = arg0;
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(B)Z")
	public boolean method452() {
		return this.aClass14_17 == this.aClass14_17.aClass14_248;
	}

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "(B)Lclient!tf;")
	public Class14 method453() {
		@Pc(6) Class14 local6 = this.aClass14_18;
		if (this.aClass14_17 == local6) {
			this.aClass14_18 = null;
			return null;
		} else {
			this.aClass14_18 = local6.aClass14_248;
			return local6;
		}
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)Lclient!tf;")
	public Class14 method454() {
		@Pc(7) Class14 local7 = this.aClass14_17.aClass14_248;
		if (this.aClass14_17 == local7) {
			return null;
		} else {
			local7.method5986();
			return local7;
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lclient!tf;I)V")
	public void method456(@OriginalArg(0) Class14 arg0) {
		if (arg0.aClass14_247 != null) {
			arg0.method5986();
		}
		arg0.aClass14_248 = this.aClass14_17.aClass14_248;
		arg0.aClass14_247 = this.aClass14_17;
		arg0.aClass14_247.aClass14_248 = arg0;
		arg0.aClass14_248.aClass14_247 = arg0;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lclient!tf;ILclient!bd;)V")
	private void method457(@OriginalArg(0) Class14 arg0, @OriginalArg(2) Class18 arg1) {
		@Pc(7) Class14 local7 = this.aClass14_17.aClass14_247;
		this.aClass14_17.aClass14_247 = arg0.aClass14_247;
		arg0.aClass14_247.aClass14_248 = this.aClass14_17;
		if (arg0 != this.aClass14_17) {
			arg0.aClass14_247 = arg1.aClass14_17.aClass14_247;
			arg0.aClass14_247.aClass14_248 = arg0;
			local7.aClass14_248 = arg1.aClass14_17;
			arg1.aClass14_17.aClass14_247 = local7;
		}
	}

	@OriginalMember(owner = "client!bd", name = "d", descriptor = "(B)Lclient!tf;")
	public Class14 method459() {
		@Pc(7) Class14 local7 = this.aClass14_17.aClass14_248;
		if (this.aClass14_17 == local7) {
			this.aClass14_18 = null;
			return null;
		} else {
			this.aClass14_18 = local7.aClass14_248;
			return local7;
		}
	}

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "(I)Lclient!tf;")
	public Class14 method460() {
		@Pc(6) Class14 local6 = this.aClass14_18;
		if (this.aClass14_17 == local6) {
			this.aClass14_18 = null;
			return null;
		} else {
			this.aClass14_18 = local6.aClass14_247;
			return local6;
		}
	}

	@OriginalMember(owner = "client!bd", name = "d", descriptor = "(I)V")
	public void method461() {
		while (true) {
			@Pc(9) Class14 local9 = this.aClass14_17.aClass14_248;
			if (local9 == this.aClass14_17) {
				this.aClass14_18 = null;
				return;
			}
			local9.method5986();
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ZLclient!bd;)V")
	public void method462(@OriginalArg(1) Class18 arg0) {
		this.method457(this.aClass14_17.aClass14_248, arg0);
	}

	@OriginalMember(owner = "client!bd", name = "e", descriptor = "(I)Lclient!tf;")
	public Class14 method463() {
		@Pc(7) Class14 local7 = this.aClass14_17.aClass14_247;
		if (local7 == this.aClass14_17) {
			this.aClass14_18 = null;
			return null;
		} else {
			this.aClass14_18 = local7.aClass14_247;
			return local7;
		}
	}
}
