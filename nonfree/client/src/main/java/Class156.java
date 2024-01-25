import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mg")
public final class Class156 {

	@OriginalMember(owner = "client!mg", name = "n", descriptor = "Lclient!uj;")
	private Class2 aClass2_160;

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "Lclient!uj;")
	public final Class2 aClass2_159 = new Class2();

	@OriginalMember(owner = "client!mg", name = "<init>", descriptor = "()V")
	public Class156() {
		this.aClass2_159.aClass2_264 = this.aClass2_159;
		this.aClass2_159.aClass2_263 = this.aClass2_159;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)Lclient!uj;")
	public Class2 method3150() {
		@Pc(11) Class2 local11 = this.aClass2_160;
		if (local11 == this.aClass2_159) {
			this.aClass2_160 = null;
			return null;
		} else {
			this.aClass2_160 = local11.aClass2_264;
			return local11;
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lclient!mg;Lclient!uj;B)V")
	private void method3151(@OriginalArg(0) Class156 arg0, @OriginalArg(1) Class2 arg1) {
		@Pc(14) Class2 local14 = this.aClass2_159.aClass2_263;
		this.aClass2_159.aClass2_263 = arg1.aClass2_263;
		arg1.aClass2_263.aClass2_264 = this.aClass2_159;
		if (this.aClass2_159 != arg1) {
			arg1.aClass2_263 = arg0.aClass2_159.aClass2_263;
			arg1.aClass2_263.aClass2_264 = arg1;
			arg0.aClass2_159.aClass2_263 = local14;
			local14.aClass2_264 = arg0.aClass2_159;
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)Lclient!uj;")
	public Class2 method3152() {
		@Pc(15) Class2 local15 = this.aClass2_159.aClass2_264;
		if (local15 == this.aClass2_159) {
			return null;
		} else {
			local15.method5703();
			return local15;
		}
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)Z")
	public boolean method3153() {
		return this.aClass2_159.aClass2_264 == this.aClass2_159;
	}

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "(I)Lclient!uj;")
	public Class2 method3155() {
		@Pc(7) Class2 local7 = this.aClass2_159.aClass2_264;
		if (this.aClass2_159 == local7) {
			this.aClass2_160 = null;
			return null;
		} else {
			this.aClass2_160 = local7.aClass2_264;
			return local7;
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILclient!uj;)V")
	public void method3157(@OriginalArg(1) Class2 arg0) {
		if (arg0.aClass2_263 != null) {
			arg0.method5703();
		}
		arg0.aClass2_263 = this.aClass2_159.aClass2_263;
		arg0.aClass2_264 = this.aClass2_159;
		arg0.aClass2_263.aClass2_264 = arg0;
		arg0.aClass2_264.aClass2_263 = arg0;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lclient!mg;B)V")
	public void method3158(@OriginalArg(0) Class156 arg0) {
		this.method3151(arg0, this.aClass2_159.aClass2_264);
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(ILclient!uj;)V")
	public void method3159(@OriginalArg(1) Class2 arg0) {
		if (arg0.aClass2_263 != null) {
			arg0.method5703();
		}
		arg0.aClass2_263 = this.aClass2_159;
		arg0.aClass2_264 = this.aClass2_159.aClass2_264;
		arg0.aClass2_263.aClass2_264 = arg0;
		arg0.aClass2_264.aClass2_263 = arg0;
	}

	@OriginalMember(owner = "client!mg", name = "d", descriptor = "(I)Lclient!uj;")
	public Class2 method3160() {
		@Pc(6) Class2 local6 = this.aClass2_160;
		if (local6 == this.aClass2_159) {
			this.aClass2_160 = null;
			return null;
		} else {
			this.aClass2_160 = local6.aClass2_263;
			return local6;
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Z)V")
	public void method3161() {
		while (true) {
			@Pc(5) Class2 local5 = this.aClass2_159.aClass2_264;
			if (local5 == this.aClass2_159) {
				this.aClass2_160 = null;
				return;
			}
			local5.method5703();
		}
	}

	@OriginalMember(owner = "client!mg", name = "f", descriptor = "(I)Lclient!uj;")
	public Class2 method3163() {
		@Pc(7) Class2 local7 = this.aClass2_159.aClass2_263;
		if (this.aClass2_159 == local7) {
			this.aClass2_160 = null;
			return null;
		} else {
			this.aClass2_160 = local7.aClass2_263;
			return local7;
		}
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(B)I")
	public int method3164() {
		@Pc(7) int local7 = 0;
		for (@Pc(18) Class2 local18 = this.aClass2_159.aClass2_264; local18 != this.aClass2_159; local18 = local18.aClass2_264) {
			local7++;
		}
		return local7;
	}
}
