import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!saa")
public final class Class317 {

	@OriginalMember(owner = "client!saa", name = "l", descriptor = "Lclient!via;")
	private Class34 aClass34_58;

	@OriginalMember(owner = "client!saa", name = "f", descriptor = "Lclient!via;")
	private final Class34 aClass34_57 = new Class34();

	@OriginalMember(owner = "client!saa", name = "<init>", descriptor = "()V")
	public Class317() {
		this.aClass34_57.aClass34_67 = this.aClass34_57;
		this.aClass34_57.aClass34_68 = this.aClass34_57;
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(I)Lclient!via;")
	public Class34 method6886() {
		@Pc(7) Class34 local7 = this.aClass34_57.aClass34_67;
		if (local7 == this.aClass34_57) {
			this.aClass34_58 = null;
			return null;
		} else {
			this.aClass34_58 = local7.aClass34_67;
			return local7;
		}
	}

	@OriginalMember(owner = "client!saa", name = "b", descriptor = "(B)Z")
	public boolean method6889() {
		return this.aClass34_57.aClass34_68 == this.aClass34_57;
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(BLclient!via;)V")
	public void method6890(@OriginalArg(1) Class34 arg0) {
		if (arg0.aClass34_67 != null) {
			arg0.method8764();
		}
		arg0.aClass34_67 = this.aClass34_57.aClass34_67;
		arg0.aClass34_68 = this.aClass34_57;
		arg0.aClass34_67.aClass34_68 = arg0;
		arg0.aClass34_68.aClass34_67 = arg0;
	}

	@OriginalMember(owner = "client!saa", name = "c", descriptor = "(B)Lclient!via;")
	public Class34 method6891() {
		@Pc(13) Class34 local13 = this.aClass34_57.aClass34_68;
		if (this.aClass34_57 == local13) {
			this.aClass34_58 = null;
			return null;
		} else {
			this.aClass34_58 = local13.aClass34_68;
			return local13;
		}
	}

	@OriginalMember(owner = "client!saa", name = "d", descriptor = "(B)I")
	public int method6892() {
		@Pc(7) int local7 = 0;
		for (@Pc(16) Class34 local16 = this.aClass34_57.aClass34_68; local16 != this.aClass34_57; local16 = local16.aClass34_68) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!saa", name = "c", descriptor = "(I)Lclient!via;")
	public Class34 method6894() {
		@Pc(6) Class34 local6 = this.aClass34_58;
		if (local6 == this.aClass34_57) {
			this.aClass34_58 = null;
			return null;
		} else {
			this.aClass34_58 = local6.aClass34_68;
			return local6;
		}
	}

	@OriginalMember(owner = "client!saa", name = "e", descriptor = "(B)Lclient!via;")
	public Class34 method6895() {
		@Pc(7) Class34 local7 = this.aClass34_57.aClass34_68;
		if (this.aClass34_57 == local7) {
			return null;
		} else {
			local7.method8764();
			return local7;
		}
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(Z)V")
	public void method6896() {
		while (true) {
			@Pc(5) Class34 local5 = this.aClass34_57.aClass34_68;
			if (this.aClass34_57 == local5) {
				this.aClass34_58 = null;
				return;
			}
			local5.method8764();
		}
	}
}
