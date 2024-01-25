import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tf")
public final class Class340 {

	@OriginalMember(owner = "client!tf", name = "i", descriptor = "Lclient!wb;")
	private Class6 aClass6_284;

	@OriginalMember(owner = "client!tf", name = "t", descriptor = "Lclient!wb;")
	public final Class6 aClass6_283 = new Class6();

	@OriginalMember(owner = "client!tf", name = "<init>", descriptor = "()V")
	public Class340() {
		this.aClass6_283.aClass6_340 = this.aClass6_283;
		this.aClass6_283.aClass6_339 = this.aClass6_283;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)Z")
	public boolean method8121() {
		return this.aClass6_283 == this.aClass6_283.aClass6_339;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lclient!wb;ILclient!tf;)V")
	private void method8122(@OriginalArg(0) Class6 arg0, @OriginalArg(2) Class340 arg1) {
		@Pc(7) Class6 local7 = this.aClass6_283.aClass6_340;
		this.aClass6_283.aClass6_340 = arg0.aClass6_340;
		arg0.aClass6_340.aClass6_339 = this.aClass6_283;
		if (this.aClass6_283 != arg0) {
			arg0.aClass6_340 = arg1.aClass6_283.aClass6_340;
			arg0.aClass6_340.aClass6_339 = arg0;
			arg1.aClass6_283.aClass6_340 = local7;
			local7.aClass6_339 = arg1.aClass6_283;
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)Lclient!wb;")
	public Class6 method8124() {
		@Pc(16) Class6 local16 = this.aClass6_283.aClass6_339;
		if (local16 == this.aClass6_283) {
			this.aClass6_284 = null;
			return null;
		} else {
			this.aClass6_284 = local16.aClass6_339;
			return local16;
		}
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)Lclient!wb;")
	public Class6 method8125() {
		@Pc(6) Class6 local6 = this.aClass6_284;
		if (this.aClass6_283 == local6) {
			this.aClass6_284 = null;
			return null;
		} else {
			this.aClass6_284 = local6.aClass6_340;
			return local6;
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(ILclient!tf;)V")
	public void method8126(@OriginalArg(1) Class340 arg0) {
		this.method8122(this.aClass6_283.aClass6_339, arg0);
	}

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "(I)Lclient!wb;")
	public Class6 method8127() {
		@Pc(16) Class6 local16 = this.aClass6_283.aClass6_339;
		if (this.aClass6_283 == local16) {
			return null;
		} else {
			local16.method9051();
			return local16;
		}
	}

	@OriginalMember(owner = "client!tf", name = "d", descriptor = "(I)I")
	public int method8128() {
		@Pc(7) int local7 = 0;
		for (@Pc(11) Class6 local11 = this.aClass6_283.aClass6_339; local11 != this.aClass6_283; local11 = local11.aClass6_339) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!tf", name = "e", descriptor = "(I)V")
	public void method8129() {
		while (true) {
			@Pc(9) Class6 local9 = this.aClass6_283.aClass6_339;
			if (this.aClass6_283 == local9) {
				this.aClass6_284 = null;
				return;
			}
			local9.method9051();
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(ILclient!wb;)V")
	public void method8130(@OriginalArg(1) Class6 arg0) {
		if (arg0.aClass6_340 != null) {
			arg0.method9051();
		}
		arg0.aClass6_340 = this.aClass6_283;
		arg0.aClass6_339 = this.aClass6_283.aClass6_339;
		arg0.aClass6_340.aClass6_339 = arg0;
		arg0.aClass6_339.aClass6_340 = arg0;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lclient!wb;I)V")
	public void method8131(@OriginalArg(0) Class6 arg0) {
		if (arg0.aClass6_340 != null) {
			arg0.method9051();
		}
		arg0.aClass6_339 = this.aClass6_283;
		arg0.aClass6_340 = this.aClass6_283.aClass6_340;
		arg0.aClass6_340.aClass6_339 = arg0;
		arg0.aClass6_339.aClass6_340 = arg0;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Z)Lclient!wb;")
	public Class6 method8133() {
		@Pc(7) Class6 local7 = this.aClass6_283.aClass6_340;
		if (this.aClass6_283 == local7) {
			this.aClass6_284 = null;
			return null;
		} else {
			this.aClass6_284 = local7.aClass6_340;
			return local7;
		}
	}

	@OriginalMember(owner = "client!tf", name = "f", descriptor = "(I)Lclient!wb;")
	public Class6 method8134() {
		@Pc(12) Class6 local12 = this.aClass6_284;
		if (this.aClass6_283 == local12) {
			this.aClass6_284 = null;
			return null;
		} else {
			this.aClass6_284 = local12.aClass6_339;
			return local12;
		}
	}
}
