import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cr")
public final class Class40 {

	@OriginalMember(owner = "client!cr", name = "l", descriptor = "Lclient!ff;")
	private Class13 aClass13_8;

	@OriginalMember(owner = "client!cr", name = "h", descriptor = "Lclient!ff;")
	private final Class13 aClass13_7 = new Class13();

	@OriginalMember(owner = "client!cr", name = "<init>", descriptor = "()V")
	public Class40() {
		this.aClass13_7.aClass13_24 = this.aClass13_7;
		this.aClass13_7.aClass13_23 = this.aClass13_7;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(I)Lclient!ff;")
	public Class13 method1188() {
		@Pc(7) Class13 local7 = this.aClass13_7.aClass13_24;
		if (local7 == this.aClass13_7) {
			this.aClass13_8 = null;
			return null;
		} else {
			this.aClass13_8 = local7.aClass13_24;
			return local7;
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(B)Lclient!ff;")
	public Class13 method1189() {
		@Pc(7) Class13 local7 = this.aClass13_7.aClass13_23;
		if (this.aClass13_7 == local7) {
			this.aClass13_8 = null;
			return null;
		} else {
			this.aClass13_8 = local7.aClass13_23;
			return local7;
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(Lclient!ff;I)V")
	public void method1190(@OriginalArg(0) Class13 arg0) {
		if (arg0.aClass13_23 != null) {
			arg0.method5934();
		}
		arg0.aClass13_23 = this.aClass13_7.aClass13_23;
		arg0.aClass13_24 = this.aClass13_7;
		arg0.aClass13_23.aClass13_24 = arg0;
		arg0.aClass13_24.aClass13_23 = arg0;
	}

	@OriginalMember(owner = "client!cr", name = "b", descriptor = "(B)Lclient!ff;")
	public Class13 method1192() {
		@Pc(7) Class13 local7 = this.aClass13_7.aClass13_24;
		if (local7 == this.aClass13_7) {
			return null;
		} else {
			local7.method5934();
			return local7;
		}
	}

	@OriginalMember(owner = "client!cr", name = "b", descriptor = "(I)I")
	public int method1193() {
		@Pc(7) int local7 = 0;
		@Pc(11) Class13 local11 = this.aClass13_7.aClass13_24;
		while (local11 != this.aClass13_7) {
			local11 = local11.aClass13_24;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!cr", name = "c", descriptor = "(B)V")
	public void method1194() {
		while (true) {
			@Pc(11) Class13 local11 = this.aClass13_7.aClass13_24;
			if (local11 == this.aClass13_7) {
				this.aClass13_8 = null;
				return;
			}
			local11.method5934();
		}
	}

	@OriginalMember(owner = "client!cr", name = "c", descriptor = "(I)Lclient!ff;")
	public Class13 method1195() {
		@Pc(6) Class13 local6 = this.aClass13_8;
		if (this.aClass13_7 == local6) {
			this.aClass13_8 = null;
			return null;
		} else {
			this.aClass13_8 = local6.aClass13_24;
			return local6;
		}
	}

	@OriginalMember(owner = "client!cr", name = "d", descriptor = "(B)Z")
	public boolean method1196() {
		return this.aClass13_7 == this.aClass13_7.aClass13_24;
	}
}
