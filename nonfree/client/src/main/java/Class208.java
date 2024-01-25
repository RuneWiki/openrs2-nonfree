import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qh")
public final class Class208 {

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "Lclient!nd;")
	private Class4 aClass4_182;

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "Lclient!ub;")
	private Class244 aClass244_31;

	static {
		new Class15("Select", "Auswählen", "Sélectionner", "Selecionar");
	}

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "()V")
	public Class208() {
	}

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(Lclient!ub;)V")
	public Class208(@OriginalArg(0) Class244 arg0) {
		this.aClass244_31 = arg0;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(BLclient!ub;)V")
	public void method4286(@OriginalArg(1) Class244 arg0) {
		this.aClass244_31 = arg0;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(B)Lclient!nd;")
	public Class4 method4288() {
		@Pc(6) Class4 local6 = this.aClass4_182;
		if (local6 == this.aClass244_31.aClass4_227) {
			this.aClass4_182 = null;
			return null;
		} else {
			this.aClass4_182 = local6.aClass4_261;
			return local6;
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)Lclient!nd;")
	public Class4 method4290() {
		@Pc(8) Class4 local8 = this.aClass244_31.aClass4_227.aClass4_261;
		if (this.aClass244_31.aClass4_227 == local8) {
			this.aClass4_182 = null;
			return null;
		} else {
			this.aClass4_182 = local8.aClass4_261;
			return local8;
		}
	}
}
