import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public final class Class111 {

	@OriginalMember(owner = "client!i", name = "n", descriptor = "Lclient!mn;")
	private Class57 aClass57_8;

	@OriginalMember(owner = "client!i", name = "f", descriptor = "Lclient!mn;")
	private final Class57 aClass57_7 = new Class57();

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "()V")
	public Class111() {
		this.aClass57_7.aClass57_24 = this.aClass57_7;
		this.aClass57_7.aClass57_23 = this.aClass57_7;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I)Z")
	public boolean method2686() {
		return this.aClass57_7.aClass57_23 == this.aClass57_7;
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(I)Lclient!mn;")
	public Class57 method2687() {
		@Pc(13) Class57 local13 = this.aClass57_7.aClass57_23;
		if (this.aClass57_7 == local13) {
			return null;
		} else {
			local13.method5359();
			return local13;
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Z)Lclient!mn;")
	public Class57 method2688() {
		@Pc(14) Class57 local14 = this.aClass57_7.aClass57_23;
		if (local14 == this.aClass57_7) {
			this.aClass57_8 = null;
			return null;
		} else {
			this.aClass57_8 = local14.aClass57_23;
			return local14;
		}
	}

	@OriginalMember(owner = "client!i", name = "c", descriptor = "(I)I")
	public int method2689() {
		@Pc(7) int local7 = 0;
		@Pc(17) Class57 local17 = this.aClass57_7.aClass57_23;
		while (this.aClass57_7 != local17) {
			local17 = local17.aClass57_23;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(B)Lclient!mn;")
	public Class57 method2690() {
		@Pc(6) Class57 local6 = this.aClass57_8;
		if (this.aClass57_7 == local6) {
			this.aClass57_8 = null;
			return null;
		} else {
			this.aClass57_8 = local6.aClass57_23;
			return local6;
		}
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(B)Lclient!mn;")
	public Class57 method2691() {
		@Pc(7) Class57 local7 = this.aClass57_7.aClass57_24;
		if (this.aClass57_7 == local7) {
			this.aClass57_8 = null;
			return null;
		} else {
			this.aClass57_8 = local7.aClass57_24;
			return local7;
		}
	}

	@OriginalMember(owner = "client!i", name = "d", descriptor = "(I)V")
	public void method2693() {
		while (true) {
			@Pc(9) Class57 local9 = this.aClass57_7.aClass57_23;
			if (local9 == this.aClass57_7) {
				this.aClass57_8 = null;
				return;
			}
			local9.method5359();
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(BLclient!mn;)V")
	public void method2696(@OriginalArg(1) Class57 arg0) {
		if (arg0.aClass57_24 != null) {
			arg0.method5359();
		}
		arg0.aClass57_24 = this.aClass57_7.aClass57_24;
		arg0.aClass57_23 = this.aClass57_7;
		arg0.aClass57_24.aClass57_23 = arg0;
		arg0.aClass57_23.aClass57_24 = arg0;
	}
}
