import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ca")
public final class Class40 {

	@OriginalMember(owner = "client!ca", name = "l", descriptor = "Lclient!gga;")
	private Class98 aClass98_2;

	@OriginalMember(owner = "client!ca", name = "k", descriptor = "Lclient!gga;")
	private final Class98 aClass98_1 = new Class98();

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "()V")
	public Class40() {
		this.aClass98_1.aClass98_26 = this.aClass98_1;
		this.aClass98_1.aClass98_25 = this.aClass98_1;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)Lclient!gga;")
	public Class98 method1129() {
		@Pc(14) Class98 local14 = this.aClass98_2;
		if (this.aClass98_1 == local14) {
			this.aClass98_2 = null;
			return null;
		} else {
			this.aClass98_2 = local14.aClass98_26;
			return local14;
		}
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(B)Lclient!gga;")
	public Class98 method1130() {
		@Pc(7) Class98 local7 = this.aClass98_1.aClass98_25;
		if (this.aClass98_1 == local7) {
			this.aClass98_2 = null;
			return null;
		} else {
			this.aClass98_2 = local7.aClass98_25;
			return local7;
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lclient!gga;B)V")
	public void method1131(@OriginalArg(0) Class98 arg0) {
		if (arg0.aClass98_25 != null) {
			arg0.method7855();
		}
		arg0.aClass98_26 = this.aClass98_1;
		arg0.aClass98_25 = this.aClass98_1.aClass98_25;
		arg0.aClass98_25.aClass98_26 = arg0;
		arg0.aClass98_26.aClass98_25 = arg0;
	}

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "(B)Lclient!gga;")
	public Class98 method1132() {
		@Pc(7) Class98 local7 = this.aClass98_1.aClass98_26;
		if (local7 == this.aClass98_1) {
			this.aClass98_2 = null;
			return null;
		} else {
			this.aClass98_2 = local7.aClass98_26;
			return local7;
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V")
	public void method1133() {
		while (true) {
			@Pc(5) Class98 local5 = this.aClass98_1.aClass98_26;
			if (local5 == this.aClass98_1) {
				this.aClass98_2 = null;
				return;
			}
			local5.method7855();
		}
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)I")
	public int method1135() {
		@Pc(7) int local7 = 0;
		for (@Pc(11) Class98 local11 = this.aClass98_1.aClass98_26; local11 != this.aClass98_1; local11 = local11.aClass98_26) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!ca", name = "d", descriptor = "(B)Z")
	public boolean method1136() {
		return this.aClass98_1.aClass98_26 == this.aClass98_1;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Z)Lclient!gga;")
	public Class98 method1137() {
		@Pc(12) Class98 local12 = this.aClass98_1.aClass98_26;
		if (local12 == this.aClass98_1) {
			return null;
		} else {
			local12.method7855();
			return local12;
		}
	}
}
