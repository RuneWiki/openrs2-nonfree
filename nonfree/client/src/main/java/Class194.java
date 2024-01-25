import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pw")
public final class Class194 {

	@OriginalMember(owner = "client!pw", name = "p", descriptor = "Lclient!rh;")
	private Class23 aClass23_20;

	@OriginalMember(owner = "client!pw", name = "j", descriptor = "Lclient!rh;")
	private final Class23 aClass23_19 = new Class23();

	@OriginalMember(owner = "client!pw", name = "<init>", descriptor = "()V")
	public Class194() {
		this.aClass23_19.aClass23_25 = this.aClass23_19;
		this.aClass23_19.aClass23_26 = this.aClass23_19;
	}

	@OriginalMember(owner = "client!pw", name = "b", descriptor = "(I)Lclient!rh;")
	public Class23 method4575() {
		@Pc(15) Class23 local15 = this.aClass23_19.aClass23_25;
		if (this.aClass23_19 == local15) {
			return null;
		} else {
			local15.method5853();
			return local15;
		}
	}

	@OriginalMember(owner = "client!pw", name = "c", descriptor = "(I)Z")
	public boolean method4576() {
		return this.aClass23_19.aClass23_25 == this.aClass23_19;
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(Z)Lclient!rh;")
	public Class23 method4577() {
		@Pc(7) Class23 local7 = this.aClass23_19.aClass23_25;
		if (local7 == this.aClass23_19) {
			this.aClass23_20 = null;
			return null;
		} else {
			this.aClass23_20 = local7.aClass23_25;
			return local7;
		}
	}

	@OriginalMember(owner = "client!pw", name = "d", descriptor = "(I)Lclient!rh;")
	public Class23 method4578() {
		@Pc(7) Class23 local7 = this.aClass23_19.aClass23_26;
		if (local7 == this.aClass23_19) {
			this.aClass23_20 = null;
			return null;
		} else {
			this.aClass23_20 = local7.aClass23_26;
			return local7;
		}
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(B)Lclient!rh;")
	public Class23 method4580() {
		@Pc(11) Class23 local11 = this.aClass23_20;
		if (this.aClass23_19 == local11) {
			this.aClass23_20 = null;
			return null;
		} else {
			this.aClass23_20 = local11.aClass23_25;
			return local11;
		}
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(Lclient!rh;I)V")
	public void method4582(@OriginalArg(0) Class23 arg0) {
		if (arg0.aClass23_26 != null) {
			arg0.method5853();
		}
		arg0.aClass23_25 = this.aClass23_19;
		arg0.aClass23_26 = this.aClass23_19.aClass23_26;
		arg0.aClass23_26.aClass23_25 = arg0;
		arg0.aClass23_25.aClass23_26 = arg0;
	}

	@OriginalMember(owner = "client!pw", name = "g", descriptor = "(I)V")
	public void method4583() {
		while (true) {
			@Pc(5) Class23 local5 = this.aClass23_19.aClass23_25;
			if (local5 == this.aClass23_19) {
				this.aClass23_20 = null;
				return;
			}
			local5.method5853();
		}
	}

	@OriginalMember(owner = "client!pw", name = "h", descriptor = "(I)I")
	public int method4585() {
		@Pc(15) int local15 = 0;
		@Pc(19) Class23 local19 = this.aClass23_19.aClass23_25;
		while (local19 != this.aClass23_19) {
			local19 = local19.aClass23_25;
			local15++;
		}
		return local15;
	}
}
