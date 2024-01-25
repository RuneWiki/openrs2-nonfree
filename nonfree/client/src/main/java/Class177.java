import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nv")
public final class Class177 {

	@OriginalMember(owner = "client!nv", name = "o", descriptor = "Lclient!dd;")
	private Class5 aClass5_168;

	@OriginalMember(owner = "client!nv", name = "e", descriptor = "Lclient!dd;")
	public final Class5 aClass5_167 = new Class5();

	@OriginalMember(owner = "client!nv", name = "<init>", descriptor = "()V")
	public Class177() {
		this.aClass5_167.aClass5_268 = this.aClass5_167;
		this.aClass5_167.aClass5_267 = this.aClass5_167;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(BLclient!dd;Lclient!nv;)V")
	private void method3609(@OriginalArg(1) Class5 arg0, @OriginalArg(2) Class177 arg1) {
		@Pc(13) Class5 local13 = this.aClass5_167.aClass5_268;
		this.aClass5_167.aClass5_268 = arg0.aClass5_268;
		arg0.aClass5_268.aClass5_267 = this.aClass5_167;
		if (this.aClass5_167 != arg0) {
			arg0.aClass5_268 = arg1.aClass5_167.aClass5_268;
			arg0.aClass5_268.aClass5_267 = arg0;
			arg1.aClass5_167.aClass5_268 = local13;
			local13.aClass5_267 = arg1.aClass5_167;
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lclient!dd;I)V")
	public void method3611(@OriginalArg(0) Class5 arg0) {
		if (arg0.aClass5_268 != null) {
			arg0.method6003();
		}
		arg0.aClass5_268 = this.aClass5_167;
		arg0.aClass5_267 = this.aClass5_167.aClass5_267;
		arg0.aClass5_268.aClass5_267 = arg0;
		arg0.aClass5_267.aClass5_268 = arg0;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(I)Lclient!dd;")
	public Class5 method3612() {
		@Pc(11) Class5 local11 = this.aClass5_168;
		if (this.aClass5_167 == local11) {
			this.aClass5_168 = null;
			return null;
		} else {
			this.aClass5_168 = local11.aClass5_268;
			return local11;
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(ILclient!nv;)V")
	public void method3613(@OriginalArg(1) Class177 arg0) {
		this.method3609(this.aClass5_167.aClass5_267, arg0);
	}

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "(Z)V")
	public void method3614() {
		while (true) {
			@Pc(9) Class5 local9 = this.aClass5_167.aClass5_267;
			if (local9 == this.aClass5_167) {
				this.aClass5_168 = null;
				return;
			}
			local9.method6003();
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(BLclient!dd;)V")
	public void method3615(@OriginalArg(1) Class5 arg0) {
		if (arg0.aClass5_268 != null) {
			arg0.method6003();
		}
		arg0.aClass5_268 = this.aClass5_167.aClass5_268;
		arg0.aClass5_267 = this.aClass5_167;
		arg0.aClass5_268.aClass5_267 = arg0;
		arg0.aClass5_267.aClass5_268 = arg0;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(B)Z")
	public boolean method3616() {
		return this.aClass5_167 == this.aClass5_167.aClass5_267;
	}

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "(I)Lclient!dd;")
	public Class5 method3617() {
		@Pc(7) Class5 local7 = this.aClass5_167.aClass5_268;
		if (local7 == this.aClass5_167) {
			this.aClass5_168 = null;
			return null;
		} else {
			this.aClass5_168 = local7.aClass5_268;
			return local7;
		}
	}

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "(B)Lclient!dd;")
	public Class5 method3618() {
		@Pc(7) Class5 local7 = this.aClass5_167.aClass5_267;
		if (this.aClass5_167 == local7) {
			this.aClass5_168 = null;
			return null;
		} else {
			this.aClass5_168 = local7.aClass5_267;
			return local7;
		}
	}

	@OriginalMember(owner = "client!nv", name = "c", descriptor = "(Z)Lclient!dd;")
	public Class5 method3619() {
		@Pc(6) Class5 local6 = this.aClass5_168;
		if (this.aClass5_167 == local6) {
			this.aClass5_168 = null;
			return null;
		} else {
			this.aClass5_168 = local6.aClass5_267;
			return local6;
		}
	}

	@OriginalMember(owner = "client!nv", name = "c", descriptor = "(I)I")
	public int method3620() {
		@Pc(7) int local7 = 0;
		@Pc(11) Class5 local11 = this.aClass5_167.aClass5_267;
		while (local11 != this.aClass5_167) {
			local11 = local11.aClass5_267;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!nv", name = "d", descriptor = "(I)Lclient!dd;")
	public Class5 method3621() {
		@Pc(7) Class5 local7 = this.aClass5_167.aClass5_267;
		if (local7 == this.aClass5_167) {
			return null;
		} else {
			local7.method6003();
			return local7;
		}
	}
}
