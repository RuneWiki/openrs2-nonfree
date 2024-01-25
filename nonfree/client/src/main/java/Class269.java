import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public final class Class269 {

	@OriginalMember(owner = "client!qe", name = "n", descriptor = "Lclient!jea;")
	private Class25 aClass25_64;

	@OriginalMember(owner = "client!qe", name = "g", descriptor = "Lclient!jea;")
	private final Class25 aClass25_63 = new Class25();

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "()V")
	public Class269() {
		this.aClass25_63.aClass25_68 = this.aClass25_63;
		this.aClass25_63.aClass25_67 = this.aClass25_63;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V")
	public void method5969() {
		while (true) {
			@Pc(11) Class25 local11 = this.aClass25_63.aClass25_68;
			if (local11 == this.aClass25_63) {
				this.aClass25_64 = null;
				return;
			}
			local11.method6959();
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)I")
	public int method5970() {
		@Pc(13) int local13 = 0;
		for (@Pc(17) Class25 local17 = this.aClass25_63.aClass25_68; local17 != this.aClass25_63; local17 = local17.aClass25_68) {
			local13++;
		}
		return local13;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Z)Z")
	public boolean method5971() {
		return this.aClass25_63 == this.aClass25_63.aClass25_68;
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(B)Lclient!jea;")
	public Class25 method5972() {
		@Pc(7) Class25 local7 = this.aClass25_63.aClass25_67;
		if (this.aClass25_63 == local7) {
			this.aClass25_64 = null;
			return null;
		} else {
			this.aClass25_64 = local7.aClass25_67;
			return local7;
		}
	}

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "(B)Lclient!jea;")
	public Class25 method5974() {
		@Pc(15) Class25 local15 = this.aClass25_63.aClass25_68;
		if (this.aClass25_63 == local15) {
			this.aClass25_64 = null;
			return null;
		} else {
			this.aClass25_64 = local15.aClass25_68;
			return local15;
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!jea;I)V")
	public void method5977(@OriginalArg(0) Class25 arg0) {
		if (arg0.aClass25_67 != null) {
			arg0.method6959();
		}
		arg0.aClass25_68 = this.aClass25_63;
		arg0.aClass25_67 = this.aClass25_63.aClass25_67;
		arg0.aClass25_67.aClass25_68 = arg0;
		arg0.aClass25_68.aClass25_67 = arg0;
	}

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "(I)Lclient!jea;")
	public Class25 method5978() {
		@Pc(7) Class25 local7 = this.aClass25_63.aClass25_68;
		if (local7 == this.aClass25_63) {
			return null;
		} else {
			local7.method6959();
			return local7;
		}
	}

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "(I)Lclient!jea;")
	public Class25 method5979() {
		@Pc(12) Class25 local12 = this.aClass25_64;
		if (this.aClass25_63 == local12) {
			this.aClass25_64 = null;
			return null;
		} else {
			this.aClass25_64 = local12.aClass25_68;
			return local12;
		}
	}
}
