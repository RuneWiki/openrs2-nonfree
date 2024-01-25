import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fea")
public final class Class99 {

	@OriginalMember(owner = "client!fea", name = "v", descriptor = "Lclient!um;")
	private Class5 aClass5_103;

	@OriginalMember(owner = "client!fea", name = "o", descriptor = "Lclient!um;")
	public final Class5 aClass5_102 = new Class5();

	@OriginalMember(owner = "client!fea", name = "<init>", descriptor = "()V")
	public Class99() {
		this.aClass5_102.aClass5_284 = this.aClass5_102;
		this.aClass5_102.aClass5_283 = this.aClass5_102;
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(Lclient!um;B)V")
	public void method2513(@OriginalArg(0) Class5 arg0) {
		if (arg0.aClass5_283 != null) {
			arg0.method7425();
		}
		arg0.aClass5_284 = this.aClass5_102;
		arg0.aClass5_283 = this.aClass5_102.aClass5_283;
		arg0.aClass5_283.aClass5_284 = arg0;
		arg0.aClass5_284.aClass5_283 = arg0;
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(BLclient!um;)V")
	public void method2514(@OriginalArg(1) Class5 arg0) {
		if (arg0.aClass5_283 != null) {
			arg0.method7425();
		}
		arg0.aClass5_283 = this.aClass5_102;
		arg0.aClass5_284 = this.aClass5_102.aClass5_284;
		arg0.aClass5_283.aClass5_284 = arg0;
		arg0.aClass5_284.aClass5_283 = arg0;
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(I)Lclient!um;")
	public Class5 method2515() {
		@Pc(12) Class5 local12 = this.aClass5_103;
		if (this.aClass5_102 == local12) {
			this.aClass5_103 = null;
			return null;
		} else {
			this.aClass5_103 = local12.aClass5_283;
			return local12;
		}
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(B)Lclient!um;")
	public Class5 method2516() {
		@Pc(7) Class5 local7 = this.aClass5_102.aClass5_284;
		if (this.aClass5_102 == local7) {
			return null;
		} else {
			local7.method7425();
			return local7;
		}
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(Lclient!um;Lclient!fea;B)V")
	private void method2517(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class99 arg1) {
		@Pc(12) Class5 local12 = this.aClass5_102.aClass5_283;
		this.aClass5_102.aClass5_283 = arg0.aClass5_283;
		arg0.aClass5_283.aClass5_284 = this.aClass5_102;
		if (arg0 != this.aClass5_102) {
			arg0.aClass5_283 = arg1.aClass5_102.aClass5_283;
			arg0.aClass5_283.aClass5_284 = arg0;
			local12.aClass5_284 = arg1.aClass5_102;
			arg1.aClass5_102.aClass5_283 = local12;
		}
	}

	@OriginalMember(owner = "client!fea", name = "b", descriptor = "(I)I")
	public int method2518() {
		@Pc(12) int local12 = 0;
		for (@Pc(16) Class5 local16 = this.aClass5_102.aClass5_284; local16 != this.aClass5_102; local16 = local16.aClass5_284) {
			local12++;
		}
		return local12;
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(Z)Lclient!um;")
	public Class5 method2519() {
		@Pc(11) Class5 local11 = this.aClass5_103;
		if (this.aClass5_102 == local11) {
			this.aClass5_103 = null;
			return null;
		} else {
			this.aClass5_103 = local11.aClass5_284;
			return local11;
		}
	}

	@OriginalMember(owner = "client!fea", name = "d", descriptor = "(I)Z")
	public boolean method2523() {
		return this.aClass5_102.aClass5_284 == this.aClass5_102;
	}

	@OriginalMember(owner = "client!fea", name = "e", descriptor = "(I)V")
	public void method2524() {
		while (true) {
			@Pc(5) Class5 local5 = this.aClass5_102.aClass5_284;
			if (local5 == this.aClass5_102) {
				this.aClass5_103 = null;
				return;
			}
			local5.method7425();
		}
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(BLclient!fea;)V")
	public void method2525(@OriginalArg(1) Class99 arg0) {
		this.method2517(this.aClass5_102.aClass5_284, arg0);
	}

	@OriginalMember(owner = "client!fea", name = "b", descriptor = "(Z)Lclient!um;")
	public Class5 method2526() {
		@Pc(7) Class5 local7 = this.aClass5_102.aClass5_284;
		if (local7 == this.aClass5_102) {
			this.aClass5_103 = null;
			return null;
		} else {
			this.aClass5_103 = local7.aClass5_284;
			return local7;
		}
	}

	@OriginalMember(owner = "client!fea", name = "f", descriptor = "(I)Lclient!um;")
	public Class5 method2527() {
		@Pc(7) Class5 local7 = this.aClass5_102.aClass5_283;
		if (this.aClass5_102 == local7) {
			this.aClass5_103 = null;
			return null;
		} else {
			this.aClass5_103 = local7.aClass5_283;
			return local7;
		}
	}
}
