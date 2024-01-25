import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public final class Class191 {

	@OriginalMember(owner = "client!td", name = "d", descriptor = "Lclient!sq;")
	private Class36 aClass36_22;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "Lclient!sq;")
	private final Class36 aClass36_21 = new Class36();

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "()V")
	public Class191() {
		this.aClass36_21.aClass36_24 = this.aClass36_21;
		this.aClass36_21.aClass36_23 = this.aClass36_21;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(I)Lclient!sq;")
	public Class36 method4862() {
		@Pc(12) Class36 local12 = this.aClass36_21.aClass36_24;
		if (this.aClass36_21 == local12) {
			this.aClass36_22 = null;
			return null;
		} else {
			this.aClass36_22 = local12.aClass36_24;
			return local12;
		}
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(I)Lclient!sq;")
	public Class36 method4863() {
		@Pc(11) Class36 local11 = this.aClass36_21.aClass36_23;
		if (local11 == this.aClass36_21) {
			this.aClass36_22 = null;
			return null;
		} else {
			this.aClass36_22 = local11.aClass36_23;
			return local11;
		}
	}

	@OriginalMember(owner = "client!td", name = "d", descriptor = "(I)V")
	public void method4865() {
		while (true) {
			@Pc(10) Class36 local10 = this.aClass36_21.aClass36_24;
			if (local10 == this.aClass36_21) {
				this.aClass36_22 = null;
				return;
			}
			local10.method5317();
		}
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(B)Lclient!sq;")
	public Class36 method4868() {
		@Pc(7) Class36 local7 = this.aClass36_21.aClass36_24;
		if (this.aClass36_21 == local7) {
			return null;
		} else {
			local7.method5317();
			return local7;
		}
	}

	@OriginalMember(owner = "client!td", name = "e", descriptor = "(I)Lclient!sq;")
	public Class36 method4869() {
		@Pc(6) Class36 local6 = this.aClass36_22;
		if (this.aClass36_21 == local6) {
			this.aClass36_22 = null;
			return null;
		} else {
			this.aClass36_22 = local6.aClass36_24;
			return local6;
		}
	}

	@OriginalMember(owner = "client!td", name = "c", descriptor = "(B)Z")
	public boolean method4870() {
		return this.aClass36_21 == this.aClass36_21.aClass36_24;
	}

	@OriginalMember(owner = "client!td", name = "d", descriptor = "(B)I")
	public int method4871() {
		@Pc(7) int local7 = 0;
		for (@Pc(16) Class36 local16 = this.aClass36_21.aClass36_24; local16 != this.aClass36_21; local16 = local16.aClass36_24) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ZLclient!sq;)V")
	public void method4872(@OriginalArg(1) Class36 arg0) {
		if (arg0.aClass36_23 != null) {
			arg0.method5317();
		}
		arg0.aClass36_24 = this.aClass36_21;
		arg0.aClass36_23 = this.aClass36_21.aClass36_23;
		arg0.aClass36_23.aClass36_24 = arg0;
		arg0.aClass36_24.aClass36_23 = arg0;
	}
}
