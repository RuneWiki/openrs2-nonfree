import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wq")
public final class Class216 {

	@OriginalMember(owner = "client!wq", name = "n", descriptor = "Lclient!qf;")
	private Class2 aClass2_252;

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "Lclient!qf;")
	public final Class2 aClass2_251 = new Class2();

	@OriginalMember(owner = "client!wq", name = "<init>", descriptor = "()V")
	public Class216() {
		this.aClass2_251.aClass2_249 = this.aClass2_251;
		this.aClass2_251.aClass2_250 = this.aClass2_251;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(Lclient!qf;BLclient!wq;)V")
	private void method5988(@OriginalArg(0) Class2 arg0, @OriginalArg(2) Class216 arg1) {
		@Pc(7) Class2 local7 = this.aClass2_251.aClass2_249;
		this.aClass2_251.aClass2_249 = arg0.aClass2_249;
		arg0.aClass2_249.aClass2_250 = this.aClass2_251;
		if (this.aClass2_251 != arg0) {
			arg0.aClass2_249 = arg1.aClass2_251.aClass2_249;
			arg0.aClass2_249.aClass2_250 = arg0;
			local7.aClass2_250 = arg1.aClass2_251;
			arg1.aClass2_251.aClass2_249 = local7;
		}
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(Lclient!wq;Z)V")
	public void method5989(@OriginalArg(0) Class216 arg0) {
		this.method5988(this.aClass2_251.aClass2_250, arg0);
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(Z)Z")
	public boolean method5990() {
		return this.aClass2_251 == this.aClass2_251.aClass2_250;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(B)V")
	public void method5991() {
		while (true) {
			@Pc(5) Class2 local5 = this.aClass2_251.aClass2_250;
			if (local5 == this.aClass2_251) {
				this.aClass2_252 = null;
				return;
			}
			local5.method5945();
		}
	}

	@OriginalMember(owner = "client!wq", name = "b", descriptor = "(B)Lclient!qf;")
	public Class2 method5992() {
		@Pc(7) Class2 local7 = this.aClass2_251.aClass2_250;
		if (this.aClass2_251 == local7) {
			this.aClass2_252 = null;
			return null;
		} else {
			this.aClass2_252 = local7.aClass2_250;
			return local7;
		}
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(BLclient!qf;)V")
	public void method5995(@OriginalArg(1) Class2 arg0) {
		if (arg0.aClass2_249 != null) {
			arg0.method5945();
		}
		arg0.aClass2_249 = this.aClass2_251.aClass2_249;
		arg0.aClass2_250 = this.aClass2_251;
		arg0.aClass2_249.aClass2_250 = arg0;
		arg0.aClass2_250.aClass2_249 = arg0;
	}

	@OriginalMember(owner = "client!wq", name = "c", descriptor = "(B)Lclient!qf;")
	public Class2 method5996() {
		@Pc(13) Class2 local13 = this.aClass2_251.aClass2_249;
		if (local13 == this.aClass2_251) {
			this.aClass2_252 = null;
			return null;
		} else {
			this.aClass2_252 = local13.aClass2_249;
			return local13;
		}
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(Lclient!qf;B)V")
	public void method5997(@OriginalArg(0) Class2 arg0) {
		if (arg0.aClass2_249 != null) {
			arg0.method5945();
		}
		arg0.aClass2_250 = this.aClass2_251.aClass2_250;
		arg0.aClass2_249 = this.aClass2_251;
		arg0.aClass2_249.aClass2_250 = arg0;
		arg0.aClass2_250.aClass2_249 = arg0;
	}

	@OriginalMember(owner = "client!wq", name = "b", descriptor = "(I)Lclient!qf;")
	public Class2 method5998() {
		@Pc(6) Class2 local6 = this.aClass2_252;
		if (this.aClass2_251 == local6) {
			this.aClass2_252 = null;
			return null;
		} else {
			this.aClass2_252 = local6.aClass2_249;
			return local6;
		}
	}

	@OriginalMember(owner = "client!wq", name = "c", descriptor = "(I)Lclient!qf;")
	public Class2 method5999() {
		@Pc(7) Class2 local7 = this.aClass2_251.aClass2_250;
		if (this.aClass2_251 == local7) {
			return null;
		} else {
			local7.method5945();
			return local7;
		}
	}

	@OriginalMember(owner = "client!wq", name = "b", descriptor = "(Z)Lclient!qf;")
	public Class2 method6000() {
		@Pc(11) Class2 local11 = this.aClass2_252;
		if (local11 == this.aClass2_251) {
			this.aClass2_252 = null;
			return null;
		} else {
			this.aClass2_252 = local11.aClass2_250;
			return local11;
		}
	}

	@OriginalMember(owner = "client!wq", name = "d", descriptor = "(B)I")
	public int method6001() {
		@Pc(7) int local7 = 0;
		for (@Pc(18) Class2 local18 = this.aClass2_251.aClass2_250; local18 != this.aClass2_251; local18 = local18.aClass2_250) {
			local7++;
		}
		return local7;
	}
}
