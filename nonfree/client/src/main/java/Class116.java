import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kn")
public final class Class116 {

	@OriginalMember(owner = "client!kn", name = "t", descriptor = "Lclient!ge;")
	private Class4 aClass4_122;

	@OriginalMember(owner = "client!kn", name = "m", descriptor = "Lclient!ge;")
	public final Class4 aClass4_121 = new Class4();

	@OriginalMember(owner = "client!kn", name = "<init>", descriptor = "()V")
	public Class116() {
		this.aClass4_121.aClass4_251 = this.aClass4_121;
		this.aClass4_121.aClass4_252 = this.aClass4_121;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(I)Lclient!ge;")
	public Class4 method3266() {
		@Pc(7) Class4 local7 = this.aClass4_121.aClass4_252;
		if (local7 == this.aClass4_121) {
			return null;
		} else {
			local7.method5687();
			return local7;
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(Lclient!kn;B)V")
	public void method3268(@OriginalArg(0) Class116 arg0) {
		this.method3279(arg0, this.aClass4_121.aClass4_252);
	}

	@OriginalMember(owner = "client!kn", name = "c", descriptor = "(I)Lclient!ge;")
	public Class4 method3270() {
		@Pc(12) Class4 local12 = this.aClass4_121.aClass4_252;
		if (local12 == this.aClass4_121) {
			this.aClass4_122 = null;
			return null;
		} else {
			this.aClass4_122 = local12.aClass4_252;
			return local12;
		}
	}

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "(B)Lclient!ge;")
	public Class4 method3271() {
		@Pc(6) Class4 local6 = this.aClass4_122;
		if (this.aClass4_121 == local6) {
			this.aClass4_122 = null;
			return null;
		} else {
			this.aClass4_122 = local6.aClass4_251;
			return local6;
		}
	}

	@OriginalMember(owner = "client!kn", name = "d", descriptor = "(I)Lclient!ge;")
	public Class4 method3272() {
		@Pc(11) Class4 local11 = this.aClass4_122;
		if (this.aClass4_121 == local11) {
			this.aClass4_122 = null;
			return null;
		} else {
			this.aClass4_122 = local11.aClass4_252;
			return local11;
		}
	}

	@OriginalMember(owner = "client!kn", name = "e", descriptor = "(I)V")
	public void method3273() {
		while (true) {
			@Pc(5) Class4 local5 = this.aClass4_121.aClass4_252;
			if (local5 == this.aClass4_121) {
				this.aClass4_122 = null;
				return;
			}
			local5.method5687();
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(ILclient!ge;)V")
	public void method3274(@OriginalArg(1) Class4 arg0) {
		if (arg0.aClass4_251 != null) {
			arg0.method5687();
		}
		arg0.aClass4_251 = this.aClass4_121.aClass4_251;
		arg0.aClass4_252 = this.aClass4_121;
		arg0.aClass4_251.aClass4_252 = arg0;
		arg0.aClass4_252.aClass4_251 = arg0;
	}

	@OriginalMember(owner = "client!kn", name = "f", descriptor = "(I)I")
	public int method3275() {
		@Pc(7) int local7 = 0;
		for (@Pc(16) Class4 local16 = this.aClass4_121.aClass4_252; local16 != this.aClass4_121; local16 = local16.aClass4_252) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "(ILclient!ge;)V")
	public void method3276(@OriginalArg(1) Class4 arg0) {
		if (arg0.aClass4_251 != null) {
			arg0.method5687();
		}
		arg0.aClass4_252 = this.aClass4_121.aClass4_252;
		arg0.aClass4_251 = this.aClass4_121;
		arg0.aClass4_251.aClass4_252 = arg0;
		arg0.aClass4_252.aClass4_251 = arg0;
	}

	@OriginalMember(owner = "client!kn", name = "g", descriptor = "(I)Z")
	public boolean method3277() {
		return this.aClass4_121 == this.aClass4_121.aClass4_252;
	}

	@OriginalMember(owner = "client!kn", name = "h", descriptor = "(I)Lclient!ge;")
	public Class4 method3278() {
		@Pc(7) Class4 local7 = this.aClass4_121.aClass4_251;
		if (local7 == this.aClass4_121) {
			this.aClass4_122 = null;
			return null;
		} else {
			this.aClass4_122 = local7.aClass4_251;
			return local7;
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(Lclient!kn;Lclient!ge;I)V")
	private void method3279(@OriginalArg(0) Class116 arg0, @OriginalArg(1) Class4 arg1) {
		@Pc(7) Class4 local7 = this.aClass4_121.aClass4_251;
		this.aClass4_121.aClass4_251 = arg1.aClass4_251;
		arg1.aClass4_251.aClass4_252 = this.aClass4_121;
		if (this.aClass4_121 != arg1) {
			arg1.aClass4_251 = arg0.aClass4_121.aClass4_251;
			arg1.aClass4_251.aClass4_252 = arg1;
			local7.aClass4_252 = arg0.aClass4_121;
			arg0.aClass4_121.aClass4_251 = local7;
		}
	}
}
