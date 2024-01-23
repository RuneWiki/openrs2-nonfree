import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wn")
public final class Class182 {

	@OriginalMember(owner = "client!wn", name = "v", descriptor = "Lclient!vb;")
	private Class8 aClass8_231;

	@OriginalMember(owner = "client!wn", name = "u", descriptor = "Lclient!vb;")
	public Class8 aClass8_230 = new Class8();

	@OriginalMember(owner = "client!wn", name = "<init>", descriptor = "()V")
	public Class182() {
		this.aClass8_230.aClass8_229 = this.aClass8_230;
		this.aClass8_230.aClass8_228 = this.aClass8_230;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(B)Z")
	public boolean method4316() {
		return this.aClass8_230.aClass8_229 == this.aClass8_230;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(I)V")
	public void method4317() {
		while (true) {
			@Pc(9) Class8 local9 = this.aClass8_230.aClass8_229;
			if (local9 == this.aClass8_230) {
				this.aClass8_231 = null;
				return;
			}
			local9.method4273();
		}
	}

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "(I)Lclient!vb;")
	public Class8 method4319() {
		@Pc(7) Class8 local7 = this.aClass8_230.aClass8_229;
		if (this.aClass8_230 == local7) {
			this.aClass8_231 = null;
			return null;
		} else {
			this.aClass8_231 = local7.aClass8_229;
			return local7;
		}
	}

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "(B)Lclient!vb;")
	public Class8 method4320() {
		@Pc(14) Class8 local14 = this.aClass8_230.aClass8_228;
		if (this.aClass8_230 == local14) {
			this.aClass8_231 = null;
			return null;
		} else {
			this.aClass8_231 = local14.aClass8_228;
			return local14;
		}
	}

	@OriginalMember(owner = "client!wn", name = "d", descriptor = "(I)Lclient!vb;")
	public Class8 method4324() {
		@Pc(2) Class8 local2 = this.aClass8_231;
		if (this.aClass8_230 == local2) {
			this.aClass8_231 = null;
			return null;
		} else {
			this.aClass8_231 = local2.aClass8_228;
			return local2;
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(ILclient!vb;)V")
	public void method4325(@OriginalArg(1) Class8 arg0) {
		if (arg0.aClass8_228 != null) {
			arg0.method4273();
		}
		arg0.aClass8_228 = this.aClass8_230;
		arg0.aClass8_229 = this.aClass8_230.aClass8_229;
		arg0.aClass8_228.aClass8_229 = arg0;
		arg0.aClass8_229.aClass8_228 = arg0;
	}

	@OriginalMember(owner = "client!wn", name = "e", descriptor = "(I)Lclient!vb;")
	public Class8 method4326() {
		@Pc(7) Class8 local7 = this.aClass8_230.aClass8_229;
		if (this.aClass8_230 == local7) {
			return null;
		} else {
			local7.method4273();
			return local7;
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(Lclient!vb;B)V")
	public void method4328(@OriginalArg(0) Class8 arg0) {
		if (arg0.aClass8_228 != null) {
			arg0.method4273();
		}
		arg0.aClass8_229 = this.aClass8_230;
		arg0.aClass8_228 = this.aClass8_230.aClass8_228;
		arg0.aClass8_228.aClass8_229 = arg0;
		arg0.aClass8_229.aClass8_228 = arg0;
	}

	@OriginalMember(owner = "client!wn", name = "f", descriptor = "(I)Lclient!vb;")
	public Class8 method4329() {
		@Pc(11) Class8 local11 = this.aClass8_231;
		if (this.aClass8_230 == local11) {
			this.aClass8_231 = null;
			return null;
		} else {
			this.aClass8_231 = local11.aClass8_229;
			return local11;
		}
	}
}
