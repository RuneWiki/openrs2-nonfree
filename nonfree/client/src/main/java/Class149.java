import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!it")
public final class Class149 {

	@OriginalMember(owner = "client!it", name = "q", descriptor = "Lclient!ada;")
	private Class7 aClass7_12;

	@OriginalMember(owner = "client!it", name = "o", descriptor = "Lclient!ada;")
	private final Class7 aClass7_11 = new Class7();

	@OriginalMember(owner = "client!it", name = "<init>", descriptor = "()V")
	public Class149() {
		this.aClass7_11.aClass7_26 = this.aClass7_11;
		this.aClass7_11.aClass7_25 = this.aClass7_11;
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(I)Lclient!ada;")
	public Class7 method3980() {
		@Pc(12) Class7 local12 = this.aClass7_11.aClass7_25;
		if (this.aClass7_11 == local12) {
			return null;
		} else {
			local12.method7760();
			return local12;
		}
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(Z)Lclient!ada;")
	public Class7 method3981() {
		@Pc(7) Class7 local7 = this.aClass7_11.aClass7_26;
		if (this.aClass7_11 == local7) {
			this.aClass7_12 = null;
			return null;
		} else {
			this.aClass7_12 = local7.aClass7_26;
			return local7;
		}
	}

	@OriginalMember(owner = "client!it", name = "b", descriptor = "(I)I")
	public int method3982() {
		@Pc(7) int local7 = 0;
		for (@Pc(11) Class7 local11 = this.aClass7_11.aClass7_25; local11 != this.aClass7_11; local11 = local11.aClass7_25) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(B)V")
	public void method3983() {
		while (true) {
			@Pc(13) Class7 local13 = this.aClass7_11.aClass7_25;
			if (local13 == this.aClass7_11) {
				this.aClass7_12 = null;
				return;
			}
			local13.method7760();
		}
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(Lclient!ada;I)V")
	public void method3984(@OriginalArg(0) Class7 arg0) {
		if (arg0.aClass7_26 != null) {
			arg0.method7760();
		}
		arg0.aClass7_26 = this.aClass7_11.aClass7_26;
		arg0.aClass7_25 = this.aClass7_11;
		arg0.aClass7_26.aClass7_25 = arg0;
		arg0.aClass7_25.aClass7_26 = arg0;
	}

	@OriginalMember(owner = "client!it", name = "b", descriptor = "(Z)Z")
	public boolean method3985() {
		return this.aClass7_11 == this.aClass7_11.aClass7_25;
	}

	@OriginalMember(owner = "client!it", name = "c", descriptor = "(I)Lclient!ada;")
	public Class7 method3986() {
		@Pc(6) Class7 local6 = this.aClass7_12;
		if (local6 == this.aClass7_11) {
			this.aClass7_12 = null;
			return null;
		} else {
			this.aClass7_12 = local6.aClass7_25;
			return local6;
		}
	}

	@OriginalMember(owner = "client!it", name = "d", descriptor = "(I)Lclient!ada;")
	public Class7 method3989() {
		@Pc(14) Class7 local14 = this.aClass7_11.aClass7_25;
		if (local14 == this.aClass7_11) {
			this.aClass7_12 = null;
			return null;
		} else {
			this.aClass7_12 = local14.aClass7_25;
			return local14;
		}
	}
}
