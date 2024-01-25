import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lh")
public final class Class204 {

	@OriginalMember(owner = "client!lh", name = "c", descriptor = "Lclient!waa;")
	private Class350 aClass350_23;

	@OriginalMember(owner = "client!lh", name = "d", descriptor = "Lclient!ii;")
	private Class4 aClass4_152;

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "I")
	private int anInt6034 = 0;

	@OriginalMember(owner = "client!lh", name = "<init>", descriptor = "()V")
	private Class204() {
	}

	@OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(Lclient!waa;)V")
	public Class204(@OriginalArg(0) Class350 arg0) {
		this.aClass350_23 = arg0;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Z)Lclient!ii;")
	public Class4 method5144() {
		@Pc(23) Class4 local23;
		if (this.anInt6034 > 0 && this.aClass350_23.aClass4Array1[this.anInt6034 - 1] != this.aClass4_152) {
			local23 = this.aClass4_152;
			this.aClass4_152 = local23.aClass4_285;
			return local23;
		}
		while (this.anInt6034 < this.aClass350_23.anInt10039) {
			local23 = this.aClass350_23.aClass4Array1[this.anInt6034++].aClass4_285;
			if (this.aClass350_23.aClass4Array1[this.anInt6034 - 1] != local23) {
				this.aClass4_152 = local23.aClass4_285;
				return local23;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(I)Lclient!ii;")
	public Class4 method5146() {
		this.anInt6034 = 0;
		return this.method5144();
	}
}
