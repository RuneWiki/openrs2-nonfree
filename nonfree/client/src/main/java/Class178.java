import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kf")
public final class Class178 {

	@OriginalMember(owner = "client!kf", name = "q", descriptor = "Lclient!ki;")
	private Class41 aClass41_36;

	@OriginalMember(owner = "client!kf", name = "m", descriptor = "Lclient!ki;")
	private final Class41 aClass41_35 = new Class41();

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "()V")
	public Class178() {
		this.aClass41_35.aClass41_68 = this.aClass41_35;
		this.aClass41_35.aClass41_67 = this.aClass41_35;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)Lclient!ki;")
	public Class41 method4161() {
		@Pc(12) Class41 local12 = this.aClass41_35.aClass41_68;
		if (this.aClass41_35 == local12) {
			return null;
		} else {
			local12.method7833();
			return local12;
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)V")
	public void method4162() {
		while (true) {
			@Pc(12) Class41 local12 = this.aClass41_35.aClass41_68;
			if (local12 == this.aClass41_35) {
				this.aClass41_36 = null;
				return;
			}
			local12.method7833();
		}
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(I)Lclient!ki;")
	public Class41 method4163() {
		@Pc(14) Class41 local14 = this.aClass41_35.aClass41_67;
		if (this.aClass41_35 == local14) {
			this.aClass41_36 = null;
			return null;
		} else {
			this.aClass41_36 = local14.aClass41_67;
			return local14;
		}
	}

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "(I)Lclient!ki;")
	public Class41 method4165() {
		@Pc(6) Class41 local6 = this.aClass41_36;
		if (local6 == this.aClass41_35) {
			this.aClass41_36 = null;
			return null;
		} else {
			this.aClass41_36 = local6.aClass41_68;
			return local6;
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(BLclient!ki;)V")
	public void method4166(@OriginalArg(1) Class41 arg0) {
		if (arg0.aClass41_67 != null) {
			arg0.method7833();
		}
		arg0.aClass41_67 = this.aClass41_35.aClass41_67;
		arg0.aClass41_68 = this.aClass41_35;
		arg0.aClass41_67.aClass41_68 = arg0;
		arg0.aClass41_68.aClass41_67 = arg0;
	}

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "(B)Z")
	public boolean method4167() {
		return this.aClass41_35.aClass41_68 == this.aClass41_35;
	}

	@OriginalMember(owner = "client!kf", name = "d", descriptor = "(B)Lclient!ki;")
	public Class41 method4168() {
		@Pc(7) Class41 local7 = this.aClass41_35.aClass41_68;
		if (this.aClass41_35 == local7) {
			this.aClass41_36 = null;
			return null;
		} else {
			this.aClass41_36 = local7.aClass41_68;
			return local7;
		}
	}

	@OriginalMember(owner = "client!kf", name = "d", descriptor = "(I)I")
	public int method4169() {
		@Pc(12) int local12 = 0;
		@Pc(16) Class41 local16 = this.aClass41_35.aClass41_68;
		while (local16 != this.aClass41_35) {
			local16 = local16.aClass41_68;
			local12++;
		}
		return local12;
	}
}
