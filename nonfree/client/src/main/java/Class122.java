import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ke")
public final class Class122 {

	@OriginalMember(owner = "client!ke", name = "g", descriptor = "Lclient!af;")
	private Class7 aClass7_20;

	@OriginalMember(owner = "client!ke", name = "d", descriptor = "Lclient!af;")
	private final Class7 aClass7_19 = new Class7();

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "()V")
	public Class122() {
		this.aClass7_19.aClass7_23 = this.aClass7_19;
		this.aClass7_19.aClass7_24 = this.aClass7_19;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Z)Lclient!af;")
	public Class7 method2618() {
		@Pc(12) Class7 local12 = this.aClass7_19.aClass7_24;
		if (local12 == this.aClass7_19) {
			return null;
		} else {
			local12.method3450();
			return local12;
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)V")
	public void method2619() {
		while (true) {
			@Pc(5) Class7 local5 = this.aClass7_19.aClass7_24;
			if (this.aClass7_19 == local5) {
				this.aClass7_20 = null;
				return;
			}
			local5.method3450();
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)Lclient!af;")
	public Class7 method2620() {
		@Pc(7) Class7 local7 = this.aClass7_19.aClass7_23;
		if (local7 == this.aClass7_19) {
			this.aClass7_20 = null;
			return null;
		} else {
			this.aClass7_20 = local7.aClass7_23;
			return local7;
		}
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(I)I")
	public int method2622() {
		@Pc(12) int local12 = 0;
		for (@Pc(16) Class7 local16 = this.aClass7_19.aClass7_24; local16 != this.aClass7_19; local16 = local16.aClass7_24) {
			local12++;
		}
		return local12;
	}

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "(I)Z")
	public boolean method2623() {
		return this.aClass7_19 == this.aClass7_19.aClass7_24;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILclient!af;)V")
	public void method2624(@OriginalArg(1) Class7 arg0) {
		if (arg0.aClass7_23 != null) {
			arg0.method3450();
		}
		arg0.aClass7_24 = this.aClass7_19;
		arg0.aClass7_23 = this.aClass7_19.aClass7_23;
		arg0.aClass7_23.aClass7_24 = arg0;
		arg0.aClass7_24.aClass7_23 = arg0;
	}

	@OriginalMember(owner = "client!ke", name = "d", descriptor = "(I)Lclient!af;")
	public Class7 method2626() {
		@Pc(15) Class7 local15 = this.aClass7_19.aClass7_24;
		if (local15 == this.aClass7_19) {
			this.aClass7_20 = null;
			return null;
		} else {
			this.aClass7_20 = local15.aClass7_24;
			return local15;
		}
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(Z)Lclient!af;")
	public Class7 method2630() {
		@Pc(6) Class7 local6 = this.aClass7_20;
		if (local6 == this.aClass7_19) {
			this.aClass7_20 = null;
			return null;
		} else {
			this.aClass7_20 = local6.aClass7_24;
			return local6;
		}
	}
}
