import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bn")
public final class Class24 {

	@OriginalMember(owner = "client!bn", name = "n", descriptor = "Lclient!qk;")
	private Class63 aClass63_2;

	@OriginalMember(owner = "client!bn", name = "d", descriptor = "Lclient!qk;")
	private final Class63 aClass63_1 = new Class63();

	@OriginalMember(owner = "client!bn", name = "<init>", descriptor = "()V")
	public Class24() {
		this.aClass63_1.aClass63_24 = this.aClass63_1;
		this.aClass63_1.aClass63_23 = this.aClass63_1;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(B)Lclient!qk;")
	public Class63 method619() {
		@Pc(15) Class63 local15 = this.aClass63_1.aClass63_24;
		if (this.aClass63_1 == local15) {
			this.aClass63_2 = null;
			return null;
		} else {
			this.aClass63_2 = local15.aClass63_24;
			return local15;
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lclient!qk;I)V")
	public void method620(@OriginalArg(0) Class63 arg0) {
		if (arg0.aClass63_23 != null) {
			arg0.method5690();
		}
		arg0.aClass63_24 = this.aClass63_1;
		arg0.aClass63_23 = this.aClass63_1.aClass63_23;
		arg0.aClass63_23.aClass63_24 = arg0;
		arg0.aClass63_24.aClass63_23 = arg0;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(I)Lclient!qk;")
	public Class63 method621() {
		@Pc(7) Class63 local7 = this.aClass63_1.aClass63_24;
		if (local7 == this.aClass63_1) {
			return null;
		} else {
			local7.method5690();
			return local7;
		}
	}

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "(I)Lclient!qk;")
	public Class63 method622() {
		@Pc(12) Class63 local12 = this.aClass63_1.aClass63_23;
		if (local12 == this.aClass63_1) {
			this.aClass63_2 = null;
			return null;
		} else {
			this.aClass63_2 = local12.aClass63_23;
			return local12;
		}
	}

	@OriginalMember(owner = "client!bn", name = "d", descriptor = "(I)I")
	public int method624() {
		@Pc(7) int local7 = 0;
		for (@Pc(11) Class63 local11 = this.aClass63_1.aClass63_24; local11 != this.aClass63_1; local11 = local11.aClass63_24) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(Z)V")
	public void method625() {
		while (true) {
			@Pc(5) Class63 local5 = this.aClass63_1.aClass63_24;
			if (local5 == this.aClass63_1) {
				this.aClass63_2 = null;
				return;
			}
			local5.method5690();
		}
	}

	@OriginalMember(owner = "client!bn", name = "e", descriptor = "(I)Z")
	public boolean method626() {
		return this.aClass63_1 == this.aClass63_1.aClass63_24;
	}

	@OriginalMember(owner = "client!bn", name = "f", descriptor = "(I)Lclient!qk;")
	public Class63 method627() {
		@Pc(6) Class63 local6 = this.aClass63_2;
		if (local6 == this.aClass63_1) {
			this.aClass63_2 = null;
			return null;
		} else {
			this.aClass63_2 = local6.aClass63_24;
			return local6;
		}
	}
}
