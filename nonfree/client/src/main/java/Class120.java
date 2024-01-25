import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fw")
public final class Class120 {

	@OriginalMember(owner = "client!fw", name = "o", descriptor = "Lclient!cda;")
	private Class4 aClass4_26;

	@OriginalMember(owner = "client!fw", name = "c", descriptor = "Lclient!cda;")
	private final Class4 aClass4_25 = new Class4();

	@OriginalMember(owner = "client!fw", name = "<init>", descriptor = "()V")
	public Class120() {
		this.aClass4_25.aClass4_68 = this.aClass4_25;
		this.aClass4_25.aClass4_67 = this.aClass4_25;
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(B)Lclient!cda;")
	public Class4 method2957() {
		@Pc(12) Class4 local12 = this.aClass4_25.aClass4_68;
		if (this.aClass4_25 == local12) {
			return null;
		} else {
			local12.method7841();
			return local12;
		}
	}

	@OriginalMember(owner = "client!fw", name = "b", descriptor = "(I)I")
	public int method2958() {
		@Pc(7) int local7 = 0;
		for (@Pc(11) Class4 local11 = this.aClass4_25.aClass4_68; local11 != this.aClass4_25; local11 = local11.aClass4_68) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(Lclient!cda;I)V")
	public void method2960(@OriginalArg(0) Class4 arg0) {
		if (arg0.aClass4_67 != null) {
			arg0.method7841();
		}
		arg0.aClass4_68 = this.aClass4_25;
		arg0.aClass4_67 = this.aClass4_25.aClass4_67;
		arg0.aClass4_67.aClass4_68 = arg0;
		arg0.aClass4_68.aClass4_67 = arg0;
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(Z)Lclient!cda;")
	public Class4 method2962() {
		@Pc(6) Class4 local6 = this.aClass4_26;
		if (this.aClass4_25 == local6) {
			this.aClass4_26 = null;
			return null;
		} else {
			this.aClass4_26 = local6.aClass4_68;
			return local6;
		}
	}

	@OriginalMember(owner = "client!fw", name = "c", descriptor = "(B)V")
	public void method2964() {
		while (true) {
			@Pc(5) Class4 local5 = this.aClass4_25.aClass4_68;
			if (this.aClass4_25 == local5) {
				this.aClass4_26 = null;
				return;
			}
			local5.method7841();
		}
	}

	@OriginalMember(owner = "client!fw", name = "b", descriptor = "(Z)Z")
	public boolean method2965() {
		return this.aClass4_25.aClass4_68 == this.aClass4_25;
	}

	@OriginalMember(owner = "client!fw", name = "d", descriptor = "(I)Lclient!cda;")
	public Class4 method2966() {
		@Pc(7) Class4 local7 = this.aClass4_25.aClass4_68;
		if (this.aClass4_25 == local7) {
			this.aClass4_26 = null;
			return null;
		} else {
			this.aClass4_26 = local7.aClass4_68;
			return local7;
		}
	}

	@OriginalMember(owner = "client!fw", name = "e", descriptor = "(I)Lclient!cda;")
	public Class4 method2967() {
		@Pc(12) Class4 local12 = this.aClass4_25.aClass4_67;
		if (this.aClass4_25 == local12) {
			this.aClass4_26 = null;
			return null;
		} else {
			this.aClass4_26 = local12.aClass4_67;
			return local12;
		}
	}
}
