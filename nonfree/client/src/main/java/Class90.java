import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fh")
public final class Class90 {

	@OriginalMember(owner = "client!fh", name = "m", descriptor = "Lclient!kb;")
	private Class4 aClass4_6;

	@OriginalMember(owner = "client!fh", name = "i", descriptor = "Lclient!kb;")
	private final Class4 aClass4_5 = new Class4();

	@OriginalMember(owner = "client!fh", name = "<init>", descriptor = "()V")
	public Class90() {
		this.aClass4_5.aClass4_25 = this.aClass4_5;
		this.aClass4_5.aClass4_26 = this.aClass4_5;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(B)I")
	public int method2317() {
		@Pc(15) int local15 = 0;
		@Pc(19) Class4 local19 = this.aClass4_5.aClass4_25;
		while (this.aClass4_5 != local19) {
			local19 = local19.aClass4_25;
			local15++;
		}
		return local15;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)Lclient!kb;")
	public Class4 method2319() {
		@Pc(7) Class4 local7 = this.aClass4_5.aClass4_25;
		if (local7 == this.aClass4_5) {
			return null;
		} else {
			local7.method7407();
			return local7;
		}
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(I)Z")
	public boolean method2320() {
		return this.aClass4_5 == this.aClass4_5.aClass4_25;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lclient!kb;B)V")
	public void method2322(@OriginalArg(0) Class4 arg0) {
		if (arg0.aClass4_26 != null) {
			arg0.method7407();
		}
		arg0.aClass4_26 = this.aClass4_5.aClass4_26;
		arg0.aClass4_25 = this.aClass4_5;
		arg0.aClass4_26.aClass4_25 = arg0;
		arg0.aClass4_25.aClass4_26 = arg0;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Z)Lclient!kb;")
	public Class4 method2323() {
		@Pc(7) Class4 local7 = this.aClass4_5.aClass4_26;
		if (local7 == this.aClass4_5) {
			this.aClass4_6 = null;
			return null;
		} else {
			this.aClass4_6 = local7.aClass4_26;
			return local7;
		}
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(B)V")
	public void method2324() {
		while (true) {
			@Pc(9) Class4 local9 = this.aClass4_5.aClass4_25;
			if (local9 == this.aClass4_5) {
				this.aClass4_6 = null;
				return;
			}
			local9.method7407();
		}
	}

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "(B)Lclient!kb;")
	public Class4 method2325() {
		@Pc(11) Class4 local11 = this.aClass4_6;
		if (this.aClass4_5 == local11) {
			this.aClass4_6 = null;
			return null;
		} else {
			this.aClass4_6 = local11.aClass4_25;
			return local11;
		}
	}

	@OriginalMember(owner = "client!fh", name = "d", descriptor = "(B)Lclient!kb;")
	public Class4 method2326() {
		@Pc(13) Class4 local13 = this.aClass4_5.aClass4_25;
		if (local13 == this.aClass4_5) {
			this.aClass4_6 = null;
			return null;
		} else {
			this.aClass4_6 = local13.aClass4_25;
			return local13;
		}
	}
}
