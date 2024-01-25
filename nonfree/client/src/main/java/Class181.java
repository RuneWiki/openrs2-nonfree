import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nj")
public final class Class181 {

	@OriginalMember(owner = "client!nj", name = "o", descriptor = "Lclient!wh;")
	private Class2 aClass2_157;

	@OriginalMember(owner = "client!nj", name = "d", descriptor = "Lclient!wh;")
	public final Class2 aClass2_156 = new Class2();

	@OriginalMember(owner = "client!nj", name = "<init>", descriptor = "()V")
	public Class181() {
		this.aClass2_156.aClass2_268 = this.aClass2_156;
		this.aClass2_156.aClass2_267 = this.aClass2_156;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(BLclient!nj;)V")
	public void method3962(@OriginalArg(1) Class181 arg0) {
		this.method3968(this.aClass2_156.aClass2_268, arg0);
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)I")
	public int method3963() {
		@Pc(7) int local7 = 0;
		for (@Pc(16) Class2 local16 = this.aClass2_156.aClass2_268; local16 != this.aClass2_156; local16 = local16.aClass2_268) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lclient!wh;B)V")
	public void method3965(@OriginalArg(0) Class2 arg0) {
		if (arg0.aClass2_267 != null) {
			arg0.method6260();
		}
		arg0.aClass2_268 = this.aClass2_156.aClass2_268;
		arg0.aClass2_267 = this.aClass2_156;
		arg0.aClass2_267.aClass2_268 = arg0;
		arg0.aClass2_268.aClass2_267 = arg0;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)Lclient!wh;")
	public Class2 method3966() {
		@Pc(6) Class2 local6 = this.aClass2_157;
		if (local6 == this.aClass2_156) {
			this.aClass2_157 = null;
			return null;
		} else {
			this.aClass2_157 = local6.aClass2_267;
			return local6;
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lclient!wh;ILclient!nj;)V")
	private void method3968(@OriginalArg(0) Class2 arg0, @OriginalArg(2) Class181 arg1) {
		@Pc(11) Class2 local11 = this.aClass2_156.aClass2_267;
		this.aClass2_156.aClass2_267 = arg0.aClass2_267;
		arg0.aClass2_267.aClass2_268 = this.aClass2_156;
		if (this.aClass2_156 != arg0) {
			arg0.aClass2_267 = arg1.aClass2_156.aClass2_267;
			arg0.aClass2_267.aClass2_268 = arg0;
			local11.aClass2_268 = arg1.aClass2_156;
			arg1.aClass2_156.aClass2_267 = local11;
		}
	}

	@OriginalMember(owner = "client!nj", name = "c", descriptor = "(B)V")
	public void method3969() {
		while (true) {
			@Pc(7) Class2 local7 = this.aClass2_156.aClass2_268;
			if (local7 == this.aClass2_156) {
				this.aClass2_157 = null;
				return;
			}
			local7.method6260();
		}
	}

	@OriginalMember(owner = "client!nj", name = "c", descriptor = "(I)Z")
	public boolean method3971() {
		return this.aClass2_156.aClass2_268 == this.aClass2_156;
	}

	@OriginalMember(owner = "client!nj", name = "d", descriptor = "(I)Lclient!wh;")
	public Class2 method3972() {
		@Pc(7) Class2 local7 = this.aClass2_156.aClass2_268;
		if (this.aClass2_156 == local7) {
			this.aClass2_157 = null;
			return null;
		} else {
			this.aClass2_157 = local7.aClass2_268;
			return local7;
		}
	}

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "(Lclient!wh;B)V")
	public void method3973(@OriginalArg(0) Class2 arg0) {
		if (arg0.aClass2_267 != null) {
			arg0.method6260();
		}
		arg0.aClass2_268 = this.aClass2_156;
		arg0.aClass2_267 = this.aClass2_156.aClass2_267;
		arg0.aClass2_267.aClass2_268 = arg0;
		arg0.aClass2_268.aClass2_267 = arg0;
	}

	@OriginalMember(owner = "client!nj", name = "e", descriptor = "(I)Lclient!wh;")
	public Class2 method3974() {
		@Pc(14) Class2 local14 = this.aClass2_156.aClass2_267;
		if (this.aClass2_156 == local14) {
			this.aClass2_157 = null;
			return null;
		} else {
			this.aClass2_157 = local14.aClass2_267;
			return local14;
		}
	}

	@OriginalMember(owner = "client!nj", name = "d", descriptor = "(B)Lclient!wh;")
	public Class2 method3975() {
		@Pc(6) Class2 local6 = this.aClass2_157;
		if (local6 == this.aClass2_156) {
			this.aClass2_157 = null;
			return null;
		} else {
			this.aClass2_157 = local6.aClass2_268;
			return local6;
		}
	}

	@OriginalMember(owner = "client!nj", name = "f", descriptor = "(I)Lclient!wh;")
	public Class2 method3976() {
		@Pc(7) Class2 local7 = this.aClass2_156.aClass2_268;
		if (this.aClass2_156 == local7) {
			return null;
		} else {
			local7.method6260();
			return local7;
		}
	}
}
