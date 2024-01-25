import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nm")
public final class Class140 {

	@OriginalMember(owner = "client!nm", name = "g", descriptor = "Lclient!mk;")
	private Class130 aClass130_98;

	@OriginalMember(owner = "client!nm", name = "j", descriptor = "Lclient!gl;")
	private Class4 aClass4_160;

	@OriginalMember(owner = "client!nm", name = "<init>", descriptor = "()V")
	public Class140() {
	}

	@OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(Lclient!mk;)V")
	public Class140(@OriginalArg(0) Class130 arg0) {
		this.aClass130_98 = arg0;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(I)Lclient!gl;")
	public Class4 method3687() {
		@Pc(8) Class4 local8 = this.aClass130_98.aClass4_144.aClass4_247;
		if (this.aClass130_98.aClass4_144 == local8) {
			this.aClass4_160 = null;
			return null;
		} else {
			this.aClass4_160 = local8.aClass4_247;
			return local8;
		}
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(B)Lclient!gl;")
	public Class4 method3688() {
		@Pc(6) Class4 local6 = this.aClass4_160;
		if (local6 == this.aClass130_98.aClass4_144) {
			this.aClass4_160 = null;
			return null;
		} else {
			this.aClass4_160 = local6.aClass4_247;
			return local6;
		}
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(ILclient!mk;)V")
	public void method3691(@OriginalArg(1) Class130 arg0) {
		this.aClass130_98 = arg0;
	}
}
