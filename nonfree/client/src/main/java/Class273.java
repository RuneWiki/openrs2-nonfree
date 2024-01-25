import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wp")
public final class Class273 {

	@OriginalMember(owner = "client!wp", name = "n", descriptor = "Lclient!fe;")
	private Class71 aClass71_26;

	@OriginalMember(owner = "client!wp", name = "b", descriptor = "Lclient!fe;")
	private final Class71 aClass71_25 = new Class71();

	@OriginalMember(owner = "client!wp", name = "<init>", descriptor = "()V")
	public Class273() {
		this.aClass71_25.aClass71_24 = this.aClass71_25;
		this.aClass71_25.aClass71_23 = this.aClass71_25;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(B)Lclient!fe;")
	public Class71 method6242() {
		@Pc(7) Class71 local7 = this.aClass71_25.aClass71_23;
		if (this.aClass71_25 == local7) {
			this.aClass71_26 = null;
			return null;
		} else {
			this.aClass71_26 = local7.aClass71_23;
			return local7;
		}
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(I)V")
	public void method6243() {
		while (true) {
			@Pc(5) Class71 local5 = this.aClass71_25.aClass71_24;
			if (local5 == this.aClass71_25) {
				this.aClass71_26 = null;
				return;
			}
			local5.method6187();
		}
	}

	@OriginalMember(owner = "client!wp", name = "b", descriptor = "(I)I")
	public int method6245() {
		@Pc(7) int local7 = 0;
		@Pc(16) Class71 local16 = this.aClass71_25.aClass71_24;
		while (local16 != this.aClass71_25) {
			local16 = local16.aClass71_24;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(Z)Lclient!fe;")
	public Class71 method6246() {
		@Pc(12) Class71 local12 = this.aClass71_25.aClass71_24;
		if (this.aClass71_25 == local12) {
			this.aClass71_26 = null;
			return null;
		} else {
			this.aClass71_26 = local12.aClass71_24;
			return local12;
		}
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(Lclient!fe;I)V")
	public void method6247(@OriginalArg(0) Class71 arg0) {
		if (arg0.aClass71_23 != null) {
			arg0.method6187();
		}
		arg0.aClass71_24 = this.aClass71_25;
		arg0.aClass71_23 = this.aClass71_25.aClass71_23;
		arg0.aClass71_23.aClass71_24 = arg0;
		arg0.aClass71_24.aClass71_23 = arg0;
	}

	@OriginalMember(owner = "client!wp", name = "b", descriptor = "(Z)Z")
	public boolean method6248() {
		return this.aClass71_25 == this.aClass71_25.aClass71_24;
	}

	@OriginalMember(owner = "client!wp", name = "c", descriptor = "(I)Lclient!fe;")
	public Class71 method6249() {
		@Pc(12) Class71 local12 = this.aClass71_26;
		if (this.aClass71_25 == local12) {
			this.aClass71_26 = null;
			return null;
		} else {
			this.aClass71_26 = local12.aClass71_24;
			return local12;
		}
	}

	@OriginalMember(owner = "client!wp", name = "d", descriptor = "(I)Lclient!fe;")
	public Class71 method6250() {
		@Pc(7) Class71 local7 = this.aClass71_25.aClass71_24;
		if (this.aClass71_25 == local7) {
			return null;
		} else {
			local7.method6187();
			return local7;
		}
	}
}
