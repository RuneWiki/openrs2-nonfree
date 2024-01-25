import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!li")
public final class Class209 {

	@OriginalMember(owner = "client!li", name = "l", descriptor = "Lclient!qp;")
	private Class8 aClass8_38;

	@OriginalMember(owner = "client!li", name = "k", descriptor = "Lclient!qp;")
	private final Class8 aClass8_37 = new Class8();

	@OriginalMember(owner = "client!li", name = "<init>", descriptor = "()V")
	public Class209() {
		this.aClass8_37.aClass8_68 = this.aClass8_37;
		this.aClass8_37.aClass8_67 = this.aClass8_37;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(I)V")
	public void method4186() {
		while (true) {
			@Pc(5) Class8 local5 = this.aClass8_37.aClass8_67;
			if (this.aClass8_37 == local5) {
				this.aClass8_38 = null;
				return;
			}
			local5.method7615();
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(B)Z")
	public boolean method4188() {
		return this.aClass8_37 == this.aClass8_37.aClass8_67;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Z)Lclient!qp;")
	public Class8 method4189() {
		@Pc(14) Class8 local14 = this.aClass8_37.aClass8_68;
		if (local14 == this.aClass8_37) {
			this.aClass8_38 = null;
			return null;
		} else {
			this.aClass8_38 = local14.aClass8_68;
			return local14;
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Lclient!qp;B)V")
	public void method4190(@OriginalArg(0) Class8 arg0) {
		if (arg0.aClass8_68 != null) {
			arg0.method7615();
		}
		arg0.aClass8_68 = this.aClass8_37.aClass8_68;
		arg0.aClass8_67 = this.aClass8_37;
		arg0.aClass8_68.aClass8_67 = arg0;
		arg0.aClass8_67.aClass8_68 = arg0;
	}

	@OriginalMember(owner = "client!li", name = "b", descriptor = "(Z)Lclient!qp;")
	public Class8 method4191() {
		@Pc(15) Class8 local15 = this.aClass8_38;
		if (local15 == this.aClass8_37) {
			this.aClass8_38 = null;
			return null;
		} else {
			this.aClass8_38 = local15.aClass8_67;
			return local15;
		}
	}

	@OriginalMember(owner = "client!li", name = "b", descriptor = "(I)Lclient!qp;")
	public Class8 method4192() {
		@Pc(7) Class8 local7 = this.aClass8_37.aClass8_67;
		if (this.aClass8_37 == local7) {
			return null;
		} else {
			local7.method7615();
			return local7;
		}
	}

	@OriginalMember(owner = "client!li", name = "c", descriptor = "(I)I")
	public int method4193() {
		@Pc(7) int local7 = 0;
		for (@Pc(16) Class8 local16 = this.aClass8_37.aClass8_67; local16 != this.aClass8_37; local16 = local16.aClass8_67) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!li", name = "c", descriptor = "(Z)Lclient!qp;")
	public Class8 method4194() {
		@Pc(7) Class8 local7 = this.aClass8_37.aClass8_67;
		if (local7 == this.aClass8_37) {
			this.aClass8_38 = null;
			return null;
		} else {
			this.aClass8_38 = local7.aClass8_67;
			return local7;
		}
	}
}
