import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bt")
public final class Class43 {

	@OriginalMember(owner = "client!bt", name = "i", descriptor = "Lclient!ri;")
	private Class2 aClass2_20;

	@OriginalMember(owner = "client!bt", name = "g", descriptor = "Lclient!ri;")
	private final Class2 aClass2_19 = new Class2();

	@OriginalMember(owner = "client!bt", name = "<init>", descriptor = "()V")
	public Class43() {
		this.aClass2_19.aClass2_68 = this.aClass2_19;
		this.aClass2_19.aClass2_67 = this.aClass2_19;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(I)Lclient!ri;")
	public Class2 method1082() {
		@Pc(12) Class2 local12 = this.aClass2_19.aClass2_68;
		if (local12 == this.aClass2_19) {
			return null;
		} else {
			local12.method8436();
			return local12;
		}
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(I)I")
	public int method1083() {
		@Pc(7) int local7 = 0;
		for (@Pc(11) Class2 local11 = this.aClass2_19.aClass2_68; local11 != this.aClass2_19; local11 = local11.aClass2_68) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lclient!ri;Z)V")
	public void method1084(@OriginalArg(0) Class2 arg0) {
		if (arg0.aClass2_67 != null) {
			arg0.method8436();
		}
		arg0.aClass2_68 = this.aClass2_19;
		arg0.aClass2_67 = this.aClass2_19.aClass2_67;
		arg0.aClass2_67.aClass2_68 = arg0;
		arg0.aClass2_68.aClass2_67 = arg0;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(B)Lclient!ri;")
	public Class2 method1085() {
		@Pc(12) Class2 local12 = this.aClass2_19.aClass2_67;
		if (this.aClass2_19 == local12) {
			this.aClass2_20 = null;
			return null;
		} else {
			this.aClass2_20 = local12.aClass2_67;
			return local12;
		}
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(B)Z")
	public boolean method1086() {
		return this.aClass2_19.aClass2_68 == this.aClass2_19;
	}

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "(B)Lclient!ri;")
	public Class2 method1087() {
		@Pc(12) Class2 local12 = this.aClass2_19.aClass2_68;
		if (this.aClass2_19 == local12) {
			this.aClass2_20 = null;
			return null;
		} else {
			this.aClass2_20 = local12.aClass2_68;
			return local12;
		}
	}

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "(I)Lclient!ri;")
	public Class2 method1088() {
		@Pc(6) Class2 local6 = this.aClass2_20;
		if (this.aClass2_19 == local6) {
			this.aClass2_20 = null;
			return null;
		} else {
			this.aClass2_20 = local6.aClass2_68;
			return local6;
		}
	}

	@OriginalMember(owner = "client!bt", name = "d", descriptor = "(I)V")
	public void method1089() {
		while (true) {
			@Pc(17) Class2 local17 = this.aClass2_19.aClass2_68;
			if (this.aClass2_19 == local17) {
				this.aClass2_20 = null;
				return;
			}
			local17.method8436();
		}
	}
}
