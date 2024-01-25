import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!m")
public final class Class127 {

	@OriginalMember(owner = "client!m", name = "v", descriptor = "Lclient!ob;")
	private Class3 aClass3_157;

	@OriginalMember(owner = "client!m", name = "s", descriptor = "Lclient!ob;")
	public final Class3 aClass3_156 = new Class3();

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "()V")
	public Class127() {
		this.aClass3_156.aClass3_247 = this.aClass3_156;
		this.aClass3_156.aClass3_248 = this.aClass3_156;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(ILclient!ob;)V")
	public void method3387(@OriginalArg(1) Class3 arg0) {
		if (arg0.aClass3_247 != null) {
			arg0.method5717();
		}
		arg0.aClass3_248 = this.aClass3_156;
		arg0.aClass3_247 = this.aClass3_156.aClass3_247;
		arg0.aClass3_247.aClass3_248 = arg0;
		arg0.aClass3_248.aClass3_247 = arg0;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(I)Lclient!ob;")
	public Class3 method3389() {
		@Pc(6) Class3 local6 = this.aClass3_157;
		if (this.aClass3_156 == local6) {
			this.aClass3_157 = null;
			return null;
		} else {
			this.aClass3_157 = local6.aClass3_247;
			return local6;
		}
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(I)Z")
	public boolean method3390() {
		return this.aClass3_156.aClass3_248 == this.aClass3_156;
	}

	@OriginalMember(owner = "client!m", name = "c", descriptor = "(I)Lclient!ob;")
	public Class3 method3391() {
		@Pc(13) Class3 local13 = this.aClass3_156.aClass3_247;
		if (this.aClass3_156 == local13) {
			this.aClass3_157 = null;
			return null;
		} else {
			this.aClass3_157 = local13.aClass3_247;
			return local13;
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(ILclient!m;Lclient!ob;)V")
	private void method3395(@OriginalArg(1) Class127 arg0, @OriginalArg(2) Class3 arg1) {
		@Pc(7) Class3 local7 = this.aClass3_156.aClass3_247;
		this.aClass3_156.aClass3_247 = arg1.aClass3_247;
		arg1.aClass3_247.aClass3_248 = this.aClass3_156;
		if (arg1 != this.aClass3_156) {
			arg1.aClass3_247 = arg0.aClass3_156.aClass3_247;
			arg1.aClass3_247.aClass3_248 = arg1;
			local7.aClass3_248 = arg0.aClass3_156;
			arg0.aClass3_156.aClass3_247 = local7;
		}
	}

	@OriginalMember(owner = "client!m", name = "e", descriptor = "(I)Lclient!ob;")
	public Class3 method3396() {
		@Pc(12) Class3 local12 = this.aClass3_156.aClass3_248;
		if (this.aClass3_156 == local12) {
			return null;
		} else {
			local12.method5717();
			return local12;
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Lclient!m;I)V")
	public void method3397(@OriginalArg(0) Class127 arg0) {
		this.method3395(arg0, this.aClass3_156.aClass3_248);
	}

	@OriginalMember(owner = "client!m", name = "f", descriptor = "(I)I")
	public int method3398() {
		@Pc(12) int local12 = 0;
		@Pc(16) Class3 local16 = this.aClass3_156.aClass3_248;
		while (local16 != this.aClass3_156) {
			local16 = local16.aClass3_248;
			local12++;
		}
		return local12;
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(B)Lclient!ob;")
	public Class3 method3400() {
		@Pc(6) Class3 local6 = this.aClass3_157;
		if (this.aClass3_156 == local6) {
			this.aClass3_157 = null;
			return null;
		} else {
			this.aClass3_157 = local6.aClass3_248;
			return local6;
		}
	}

	@OriginalMember(owner = "client!m", name = "g", descriptor = "(I)V")
	public void method3401() {
		while (true) {
			@Pc(5) Class3 local5 = this.aClass3_156.aClass3_248;
			if (local5 == this.aClass3_156) {
				this.aClass3_157 = null;
				return;
			}
			local5.method5717();
		}
	}

	@OriginalMember(owner = "client!m", name = "h", descriptor = "(I)Lclient!ob;")
	public Class3 method3402() {
		@Pc(11) Class3 local11 = this.aClass3_156.aClass3_248;
		if (local11 == this.aClass3_156) {
			this.aClass3_157 = null;
			return null;
		} else {
			this.aClass3_157 = local11.aClass3_248;
			return local11;
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(ZLclient!ob;)V")
	public void method3403(@OriginalArg(1) Class3 arg0) {
		if (arg0.aClass3_247 != null) {
			arg0.method5717();
		}
		arg0.aClass3_248 = this.aClass3_156.aClass3_248;
		arg0.aClass3_247 = this.aClass3_156;
		arg0.aClass3_247.aClass3_248 = arg0;
		arg0.aClass3_248.aClass3_247 = arg0;
	}
}
