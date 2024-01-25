import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ik")
public final class Class117 {

	@OriginalMember(owner = "client!ik", name = "r", descriptor = "Lclient!kl;")
	private Class41 aClass41_14;

	@OriginalMember(owner = "client!ik", name = "q", descriptor = "Lclient!kl;")
	private final Class41 aClass41_13 = new Class41();

	@OriginalMember(owner = "client!ik", name = "<init>", descriptor = "()V")
	public Class117() {
		this.aClass41_13.aClass41_25 = this.aClass41_13;
		this.aClass41_13.aClass41_26 = this.aClass41_13;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(B)Lclient!kl;")
	public Class41 method2958() {
		@Pc(7) Class41 local7 = this.aClass41_13.aClass41_25;
		if (this.aClass41_13 == local7) {
			return null;
		} else {
			local7.method5447();
			return local7;
		}
	}

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(B)Z")
	public boolean method2959() {
		return this.aClass41_13 == this.aClass41_13.aClass41_25;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(Z)V")
	public void method2960() {
		while (true) {
			@Pc(3) Class41 local3 = this.aClass41_13.aClass41_25;
			if (this.aClass41_13 == local3) {
				this.aClass41_14 = null;
				return;
			}
			local3.method5447();
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lclient!kl;I)V")
	public void method2961(@OriginalArg(0) Class41 arg0) {
		if (arg0.aClass41_26 != null) {
			arg0.method5447();
		}
		arg0.aClass41_26 = this.aClass41_13.aClass41_26;
		arg0.aClass41_25 = this.aClass41_13;
		arg0.aClass41_26.aClass41_25 = arg0;
		arg0.aClass41_25.aClass41_26 = arg0;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)I")
	public int method2962() {
		@Pc(7) int local7 = 0;
		@Pc(11) Class41 local11 = this.aClass41_13.aClass41_25;
		while (this.aClass41_13 != local11) {
			local11 = local11.aClass41_25;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!ik", name = "c", descriptor = "(I)Lclient!kl;")
	public Class41 method2967() {
		@Pc(12) Class41 local12 = this.aClass41_13.aClass41_25;
		if (local12 == this.aClass41_13) {
			this.aClass41_14 = null;
			return null;
		} else {
			this.aClass41_14 = local12.aClass41_25;
			return local12;
		}
	}

	@OriginalMember(owner = "client!ik", name = "d", descriptor = "(I)Lclient!kl;")
	public Class41 method2969() {
		@Pc(12) Class41 local12 = this.aClass41_13.aClass41_26;
		if (this.aClass41_13 == local12) {
			this.aClass41_14 = null;
			return null;
		} else {
			this.aClass41_14 = local12.aClass41_26;
			return local12;
		}
	}

	@OriginalMember(owner = "client!ik", name = "e", descriptor = "(I)Lclient!kl;")
	public Class41 method2970() {
		@Pc(6) Class41 local6 = this.aClass41_14;
		if (local6 == this.aClass41_13) {
			this.aClass41_14 = null;
			return null;
		} else {
			this.aClass41_14 = local6.aClass41_25;
			return local6;
		}
	}
}
