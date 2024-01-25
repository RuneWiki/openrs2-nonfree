import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!br")
public final class Class27 {

	@OriginalMember(owner = "client!br", name = "l", descriptor = "Lclient!cv;")
	private Class41 aClass41_2;

	@OriginalMember(owner = "client!br", name = "a", descriptor = "Lclient!cv;")
	private final Class41 aClass41_1 = new Class41();

	@OriginalMember(owner = "client!br", name = "<init>", descriptor = "()V")
	public Class27() {
		this.aClass41_1.aClass41_24 = this.aClass41_1;
		this.aClass41_1.aClass41_23 = this.aClass41_1;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(Lclient!cv;I)V")
	public void method725(@OriginalArg(0) Class41 arg0) {
		if (arg0.aClass41_24 != null) {
			arg0.method5818();
		}
		arg0.aClass41_23 = this.aClass41_1;
		arg0.aClass41_24 = this.aClass41_1.aClass41_24;
		arg0.aClass41_24.aClass41_23 = arg0;
		arg0.aClass41_23.aClass41_24 = arg0;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(I)I")
	public int method726() {
		@Pc(7) int local7 = 0;
		for (@Pc(11) Class41 local11 = this.aClass41_1.aClass41_23; local11 != this.aClass41_1; local11 = local11.aClass41_23) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(B)Lclient!cv;")
	public Class41 method730() {
		@Pc(12) Class41 local12 = this.aClass41_1.aClass41_23;
		if (local12 == this.aClass41_1) {
			this.aClass41_2 = null;
			return null;
		} else {
			this.aClass41_2 = local12.aClass41_23;
			return local12;
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(Z)Z")
	public boolean method731() {
		return this.aClass41_1.aClass41_23 == this.aClass41_1;
	}

	@OriginalMember(owner = "client!br", name = "c", descriptor = "(I)Lclient!cv;")
	public Class41 method732() {
		@Pc(12) Class41 local12 = this.aClass41_1.aClass41_24;
		if (local12 == this.aClass41_1) {
			this.aClass41_2 = null;
			return null;
		} else {
			this.aClass41_2 = local12.aClass41_24;
			return local12;
		}
	}

	@OriginalMember(owner = "client!br", name = "d", descriptor = "(I)Lclient!cv;")
	public Class41 method733() {
		@Pc(7) Class41 local7 = this.aClass41_1.aClass41_23;
		if (this.aClass41_1 == local7) {
			return null;
		} else {
			local7.method5818();
			return local7;
		}
	}

	@OriginalMember(owner = "client!br", name = "b", descriptor = "(B)V")
	public void method734() {
		while (true) {
			@Pc(9) Class41 local9 = this.aClass41_1.aClass41_23;
			if (local9 == this.aClass41_1) {
				this.aClass41_2 = null;
				return;
			}
			local9.method5818();
		}
	}

	@OriginalMember(owner = "client!br", name = "e", descriptor = "(I)Lclient!cv;")
	public Class41 method735() {
		@Pc(6) Class41 local6 = this.aClass41_2;
		if (local6 == this.aClass41_1) {
			this.aClass41_2 = null;
			return null;
		} else {
			this.aClass41_2 = local6.aClass41_23;
			return local6;
		}
	}
}
