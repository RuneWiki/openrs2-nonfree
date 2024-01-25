import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wp")
public final class Class267 {

	@OriginalMember(owner = "client!wp", name = "h", descriptor = "Lclient!vg;")
	private Class4 aClass4_258;

	@OriginalMember(owner = "client!wp", name = "b", descriptor = "I")
	private int anInt7514 = 0;

	@OriginalMember(owner = "client!wp", name = "c", descriptor = "Lclient!qo;")
	private final Class196 aClass196_43;

	@OriginalMember(owner = "client!wp", name = "<init>", descriptor = "(Lclient!qo;)V")
	public Class267(@OriginalArg(0) Class196 arg0) {
		this.aClass196_43 = arg0;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(B)Lclient!vg;")
	public Class4 method5793() {
		@Pc(31) Class4 local31;
		if (this.anInt7514 > 0 && this.aClass196_43.aClass4Array1[this.anInt7514 - 1] != this.aClass4_258) {
			local31 = this.aClass4_258;
			this.aClass4_258 = local31.aClass4_261;
			return local31;
		}
		while (this.anInt7514 < this.aClass196_43.anInt5807) {
			local31 = this.aClass196_43.aClass4Array1[this.anInt7514++].aClass4_261;
			if (this.aClass196_43.aClass4Array1[this.anInt7514 - 1] != local31) {
				this.aClass4_258 = local31.aClass4_261;
				return local31;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(I)Lclient!vg;")
	public Class4 method5795() {
		this.anInt7514 = 0;
		return this.method5793();
	}
}
