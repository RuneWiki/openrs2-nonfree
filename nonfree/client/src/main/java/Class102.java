import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eo")
public final class Class102 {

	@OriginalMember(owner = "client!eo", name = "j", descriptor = "Lclient!sga;")
	private Class41 aClass41_16;

	@OriginalMember(owner = "client!eo", name = "g", descriptor = "Lclient!sga;")
	private final Class41 aClass41_15 = new Class41();

	@OriginalMember(owner = "client!eo", name = "<init>", descriptor = "()V")
	public Class102() {
		this.aClass41_15.aClass41_68 = this.aClass41_15;
		this.aClass41_15.aClass41_67 = this.aClass41_15;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(B)V")
	public void method2053() {
		while (true) {
			@Pc(14) Class41 local14 = this.aClass41_15.aClass41_67;
			if (local14 == this.aClass41_15) {
				this.aClass41_16 = null;
				return;
			}
			local14.method8644();
		}
	}

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "(B)Lclient!sga;")
	public Class41 method2054() {
		@Pc(6) Class41 local6 = this.aClass41_16;
		if (this.aClass41_15 == local6) {
			this.aClass41_16 = null;
			return null;
		} else {
			this.aClass41_16 = local6.aClass41_67;
			return local6;
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(BLclient!sga;)V")
	public void method2055(@OriginalArg(1) Class41 arg0) {
		if (arg0.aClass41_68 != null) {
			arg0.method8644();
		}
		arg0.aClass41_67 = this.aClass41_15;
		arg0.aClass41_68 = this.aClass41_15.aClass41_68;
		arg0.aClass41_68.aClass41_67 = arg0;
		arg0.aClass41_67.aClass41_68 = arg0;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(I)I")
	public int method2056() {
		@Pc(13) int local13 = 0;
		for (@Pc(17) Class41 local17 = this.aClass41_15.aClass41_67; local17 != this.aClass41_15; local17 = local17.aClass41_67) {
			local13++;
		}
		return local13;
	}

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "(I)Lclient!sga;")
	public Class41 method2058() {
		@Pc(12) Class41 local12 = this.aClass41_15.aClass41_67;
		if (this.aClass41_15 == local12) {
			return null;
		} else {
			local12.method8644();
			return local12;
		}
	}

	@OriginalMember(owner = "client!eo", name = "d", descriptor = "(B)Z")
	public boolean method2059() {
		return this.aClass41_15.aClass41_67 == this.aClass41_15;
	}

	@OriginalMember(owner = "client!eo", name = "c", descriptor = "(I)Lclient!sga;")
	public Class41 method2061() {
		@Pc(7) Class41 local7 = this.aClass41_15.aClass41_68;
		if (this.aClass41_15 == local7) {
			this.aClass41_16 = null;
			return null;
		} else {
			this.aClass41_16 = local7.aClass41_68;
			return local7;
		}
	}

	@OriginalMember(owner = "client!eo", name = "d", descriptor = "(I)Lclient!sga;")
	public Class41 method2062() {
		@Pc(13) Class41 local13 = this.aClass41_15.aClass41_67;
		if (local13 == this.aClass41_15) {
			this.aClass41_16 = null;
			return null;
		} else {
			this.aClass41_16 = local13.aClass41_67;
			return local13;
		}
	}
}
