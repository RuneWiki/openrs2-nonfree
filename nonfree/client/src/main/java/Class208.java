import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sc")
public final class Class208 {

	@OriginalMember(owner = "client!sc", name = "n", descriptor = "Lclient!ul;")
	private Class41 aClass41_16;

	@OriginalMember(owner = "client!sc", name = "l", descriptor = "Lclient!ul;")
	private final Class41 aClass41_15 = new Class41();

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "()V")
	public Class208() {
		this.aClass41_15.aClass41_24 = this.aClass41_15;
		this.aClass41_15.aClass41_23 = this.aClass41_15;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)Lclient!ul;")
	public Class41 method4656() {
		@Pc(7) Class41 local7 = this.aClass41_15.aClass41_24;
		if (this.aClass41_15 == local7) {
			return null;
		} else {
			local7.method5475();
			return local7;
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)V")
	public void method4657() {
		while (true) {
			@Pc(9) Class41 local9 = this.aClass41_15.aClass41_24;
			if (this.aClass41_15 == local9) {
				this.aClass41_16 = null;
				return;
			}
			local9.method5475();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)Z")
	public boolean method4659() {
		return this.aClass41_15.aClass41_24 == this.aClass41_15;
	}

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "(I)Lclient!ul;")
	public Class41 method4661() {
		@Pc(7) Class41 local7 = this.aClass41_15.aClass41_24;
		if (this.aClass41_15 == local7) {
			this.aClass41_16 = null;
			return null;
		} else {
			this.aClass41_16 = local7.aClass41_24;
			return local7;
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(B)Lclient!ul;")
	public Class41 method4662() {
		@Pc(14) Class41 local14 = this.aClass41_15.aClass41_23;
		if (local14 == this.aClass41_15) {
			this.aClass41_16 = null;
			return null;
		} else {
			this.aClass41_16 = local14.aClass41_23;
			return local14;
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Z)Lclient!ul;")
	public Class41 method4663() {
		@Pc(12) Class41 local12 = this.aClass41_16;
		if (local12 == this.aClass41_15) {
			this.aClass41_16 = null;
			return null;
		} else {
			this.aClass41_16 = local12.aClass41_24;
			return local12;
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!ul;B)V")
	public void method4664(@OriginalArg(0) Class41 arg0) {
		if (arg0.aClass41_23 != null) {
			arg0.method5475();
		}
		arg0.aClass41_24 = this.aClass41_15;
		arg0.aClass41_23 = this.aClass41_15.aClass41_23;
		arg0.aClass41_23.aClass41_24 = arg0;
		arg0.aClass41_24.aClass41_23 = arg0;
	}

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "(I)I")
	public int method4665() {
		@Pc(7) int local7 = 0;
		for (@Pc(11) Class41 local11 = this.aClass41_15.aClass41_24; local11 != this.aClass41_15; local11 = local11.aClass41_24) {
			local7++;
		}
		return local7;
	}
}
