import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fk")
public final class Class74 {

	@OriginalMember(owner = "client!fk", name = "s", descriptor = "Lclient!pn;")
	private Class11_Sub4 aClass11_Sub4_20;

	@OriginalMember(owner = "client!fk", name = "f", descriptor = "Lclient!pn;")
	private final Class11_Sub4 aClass11_Sub4_19 = new Class11_Sub4();

	@OriginalMember(owner = "client!fk", name = "<init>", descriptor = "()V")
	public Class74() {
		this.aClass11_Sub4_19.aClass11_Sub4_62 = this.aClass11_Sub4_19;
		this.aClass11_Sub4_19.aClass11_Sub4_61 = this.aClass11_Sub4_19;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)Lclient!pn;")
	public Class11_Sub4 method1288() {
		@Pc(17) Class11_Sub4 local17 = this.aClass11_Sub4_20;
		if (this.aClass11_Sub4_19 == local17) {
			this.aClass11_Sub4_20 = null;
			return null;
		} else {
			this.aClass11_Sub4_20 = local17.aClass11_Sub4_62;
			return local17;
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lclient!pn;Z)V")
	public void method1290(@OriginalArg(0) Class11_Sub4 arg0) {
		if (arg0.aClass11_Sub4_61 != null) {
			arg0.method5580();
		}
		arg0.aClass11_Sub4_62 = this.aClass11_Sub4_19;
		arg0.aClass11_Sub4_61 = this.aClass11_Sub4_19.aClass11_Sub4_61;
		arg0.aClass11_Sub4_61.aClass11_Sub4_62 = arg0;
		arg0.aClass11_Sub4_62.aClass11_Sub4_61 = arg0;
	}

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "(B)Lclient!pn;")
	public Class11_Sub4 method1293() {
		@Pc(12) Class11_Sub4 local12 = this.aClass11_Sub4_19.aClass11_Sub4_62;
		if (local12 == this.aClass11_Sub4_19) {
			return null;
		} else {
			local12.method5580();
			return local12;
		}
	}

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "(I)Lclient!pn;")
	public Class11_Sub4 method1294() {
		@Pc(14) Class11_Sub4 local14 = this.aClass11_Sub4_19.aClass11_Sub4_62;
		if (this.aClass11_Sub4_19 == local14) {
			this.aClass11_Sub4_20 = null;
			return null;
		} else {
			this.aClass11_Sub4_20 = local14.aClass11_Sub4_62;
			return local14;
		}
	}

	@OriginalMember(owner = "client!fk", name = "c", descriptor = "(I)V")
	public void method1298() {
		while (true) {
			@Pc(16) Class11_Sub4 local16 = this.aClass11_Sub4_19.aClass11_Sub4_62;
			if (this.aClass11_Sub4_19 == local16) {
				this.aClass11_Sub4_20 = null;
				return;
			}
			local16.method5580();
		}
	}

	@OriginalMember(owner = "client!fk", name = "d", descriptor = "(I)I")
	public int method1301() {
		@Pc(7) int local7 = 0;
		@Pc(11) Class11_Sub4 local11 = this.aClass11_Sub4_19.aClass11_Sub4_62;
		while (this.aClass11_Sub4_19 != local11) {
			local11 = local11.aClass11_Sub4_62;
			local7++;
		}
		return local7;
	}
}
