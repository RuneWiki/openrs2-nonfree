import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hda")
public final class Class143 {

	@OriginalMember(owner = "client!hda", name = "n", descriptor = "Lclient!kba;")
	private Class11 aClass11_44;

	@OriginalMember(owner = "client!hda", name = "e", descriptor = "Lclient!kba;")
	private final Class11 aClass11_43 = new Class11();

	@OriginalMember(owner = "client!hda", name = "<init>", descriptor = "()V")
	public Class143() {
		this.aClass11_43.aClass11_67 = this.aClass11_43;
		this.aClass11_43.aClass11_68 = this.aClass11_43;
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(I)Lclient!kba;")
	public Class11 method3528() {
		@Pc(6) Class11 local6 = this.aClass11_44;
		if (local6 == this.aClass11_43) {
			this.aClass11_44 = null;
			return null;
		} else {
			this.aClass11_44 = local6.aClass11_68;
			return local6;
		}
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(Lclient!kba;I)V")
	public void method3529(@OriginalArg(0) Class11 arg0) {
		if (arg0.aClass11_67 != null) {
			arg0.method8372();
		}
		arg0.aClass11_67 = this.aClass11_43.aClass11_67;
		arg0.aClass11_68 = this.aClass11_43;
		arg0.aClass11_67.aClass11_68 = arg0;
		arg0.aClass11_68.aClass11_67 = arg0;
	}

	@OriginalMember(owner = "client!hda", name = "b", descriptor = "(I)Z")
	public boolean method3531() {
		return this.aClass11_43 == this.aClass11_43.aClass11_68;
	}

	@OriginalMember(owner = "client!hda", name = "c", descriptor = "(I)Lclient!kba;")
	public Class11 method3532() {
		@Pc(7) Class11 local7 = this.aClass11_43.aClass11_67;
		if (this.aClass11_43 == local7) {
			this.aClass11_44 = null;
			return null;
		} else {
			this.aClass11_44 = local7.aClass11_67;
			return local7;
		}
	}

	@OriginalMember(owner = "client!hda", name = "b", descriptor = "(B)Lclient!kba;")
	public Class11 method3534() {
		@Pc(7) Class11 local7 = this.aClass11_43.aClass11_68;
		if (this.aClass11_43 == local7) {
			return null;
		} else {
			local7.method8372();
			return local7;
		}
	}

	@OriginalMember(owner = "client!hda", name = "e", descriptor = "(I)I")
	public int method3535() {
		@Pc(13) int local13 = 0;
		@Pc(17) Class11 local17 = this.aClass11_43.aClass11_68;
		while (local17 != this.aClass11_43) {
			local17 = local17.aClass11_68;
			local13++;
		}
		return local13;
	}

	@OriginalMember(owner = "client!hda", name = "f", descriptor = "(I)Lclient!kba;")
	public Class11 method3536() {
		@Pc(12) Class11 local12 = this.aClass11_43.aClass11_68;
		if (local12 == this.aClass11_43) {
			this.aClass11_44 = null;
			return null;
		} else {
			this.aClass11_44 = local12.aClass11_68;
			return local12;
		}
	}

	@OriginalMember(owner = "client!hda", name = "c", descriptor = "(B)V")
	public void method3537() {
		while (true) {
			@Pc(14) Class11 local14 = this.aClass11_43.aClass11_68;
			if (local14 == this.aClass11_43) {
				this.aClass11_44 = null;
				return;
			}
			local14.method8372();
		}
	}
}
