import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qia")
public final class Class276 {

	@OriginalMember(owner = "client!qia", name = "r", descriptor = "Lclient!ns;")
	private Class3 aClass3_232;

	@OriginalMember(owner = "client!qia", name = "n", descriptor = "Lclient!ns;")
	public final Class3 aClass3_231 = new Class3();

	@OriginalMember(owner = "client!qia", name = "<init>", descriptor = "()V")
	public Class276() {
		this.aClass3_231.aClass3_299 = this.aClass3_231;
		this.aClass3_231.aClass3_300 = this.aClass3_231;
	}

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(Lclient!qia;I)V")
	public void method6904(@OriginalArg(0) Class276 arg0) {
		this.method6917(arg0, this.aClass3_231.aClass3_300);
	}

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(Lclient!ns;I)V")
	public void method6905(@OriginalArg(0) Class3 arg0) {
		if (arg0.aClass3_299 != null) {
			arg0.method8671();
		}
		arg0.aClass3_300 = this.aClass3_231.aClass3_300;
		arg0.aClass3_299 = this.aClass3_231;
		arg0.aClass3_299.aClass3_300 = arg0;
		arg0.aClass3_300.aClass3_299 = arg0;
	}

	@OriginalMember(owner = "client!qia", name = "b", descriptor = "(Lclient!ns;I)V")
	public void method6906(@OriginalArg(0) Class3 arg0) {
		if (arg0.aClass3_299 != null) {
			arg0.method8671();
		}
		arg0.aClass3_299 = this.aClass3_231.aClass3_299;
		arg0.aClass3_300 = this.aClass3_231;
		arg0.aClass3_299.aClass3_300 = arg0;
		arg0.aClass3_300.aClass3_299 = arg0;
	}

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(I)Lclient!ns;")
	public Class3 method6907() {
		@Pc(7) Class3 local7 = this.aClass3_231.aClass3_300;
		if (this.aClass3_231 == local7) {
			this.aClass3_232 = null;
			return null;
		} else {
			this.aClass3_232 = local7.aClass3_300;
			return local7;
		}
	}

	@OriginalMember(owner = "client!qia", name = "b", descriptor = "(I)Z")
	public boolean method6908() {
		return this.aClass3_231.aClass3_300 == this.aClass3_231;
	}

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(Z)V")
	public void method6910() {
		while (true) {
			@Pc(5) Class3 local5 = this.aClass3_231.aClass3_300;
			if (local5 == this.aClass3_231) {
				this.aClass3_232 = null;
				return;
			}
			local5.method8671();
		}
	}

	@OriginalMember(owner = "client!qia", name = "c", descriptor = "(I)Lclient!ns;")
	public Class3 method6911() {
		@Pc(14) Class3 local14 = this.aClass3_231.aClass3_300;
		if (local14 == this.aClass3_231) {
			return null;
		} else {
			local14.method8671();
			return local14;
		}
	}

	@OriginalMember(owner = "client!qia", name = "d", descriptor = "(I)Lclient!ns;")
	public Class3 method6912() {
		@Pc(6) Class3 local6 = this.aClass3_232;
		if (local6 == this.aClass3_231) {
			this.aClass3_232 = null;
			return null;
		} else {
			this.aClass3_232 = local6.aClass3_300;
			return local6;
		}
	}

	@OriginalMember(owner = "client!qia", name = "b", descriptor = "(Z)Lclient!ns;")
	public Class3 method6915() {
		@Pc(12) Class3 local12 = this.aClass3_231.aClass3_299;
		if (this.aClass3_231 == local12) {
			this.aClass3_232 = null;
			return null;
		} else {
			this.aClass3_232 = local12.aClass3_299;
			return local12;
		}
	}

	@OriginalMember(owner = "client!qia", name = "b", descriptor = "(B)Lclient!ns;")
	public Class3 method6916() {
		@Pc(6) Class3 local6 = this.aClass3_232;
		if (this.aClass3_231 == local6) {
			this.aClass3_232 = null;
			return null;
		} else {
			this.aClass3_232 = local6.aClass3_299;
			return local6;
		}
	}

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(Lclient!qia;Lclient!ns;I)V")
	private void method6917(@OriginalArg(0) Class276 arg0, @OriginalArg(1) Class3 arg1) {
		@Pc(14) Class3 local14 = this.aClass3_231.aClass3_299;
		this.aClass3_231.aClass3_299 = arg1.aClass3_299;
		arg1.aClass3_299.aClass3_300 = this.aClass3_231;
		if (arg1 != this.aClass3_231) {
			arg1.aClass3_299 = arg0.aClass3_231.aClass3_299;
			arg1.aClass3_299.aClass3_300 = arg1;
			local14.aClass3_300 = arg0.aClass3_231;
			arg0.aClass3_231.aClass3_299 = local14;
		}
	}

	@OriginalMember(owner = "client!qia", name = "e", descriptor = "(I)I")
	public int method6918() {
		@Pc(7) int local7 = 0;
		for (@Pc(11) Class3 local11 = this.aClass3_231.aClass3_300; local11 != this.aClass3_231; local11 = local11.aClass3_300) {
			local7++;
		}
		return local7;
	}
}
