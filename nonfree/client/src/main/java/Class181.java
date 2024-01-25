import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jja")
public final class Class181 {

	@OriginalMember(owner = "client!jja", name = "b", descriptor = "Lclient!oq;")
	private Class4 aClass4_145;

	@OriginalMember(owner = "client!jja", name = "f", descriptor = "Lclient!dj;")
	private Class66 aClass66_20;

	@OriginalMember(owner = "client!jja", name = "d", descriptor = "I")
	private int anInt4505 = 0;

	@OriginalMember(owner = "client!jja", name = "<init>", descriptor = "()V")
	private Class181() {
	}

	@OriginalMember(owner = "client!jja", name = "<init>", descriptor = "(Lclient!dj;)V")
	public Class181(@OriginalArg(0) Class66 arg0) {
		this.aClass66_20 = arg0;
	}

	@OriginalMember(owner = "client!jja", name = "a", descriptor = "(I)Lclient!oq;")
	public Class4 method4071() {
		@Pc(25) Class4 local25;
		if (this.anInt4505 > 0 && this.aClass66_20.aClass4Array1[this.anInt4505 - 1] != this.aClass4_145) {
			local25 = this.aClass4_145;
			this.aClass4_145 = local25.aClass4_337;
			return local25;
		}
		while (this.anInt4505 < this.aClass66_20.anInt2032) {
			local25 = this.aClass66_20.aClass4Array1[this.anInt4505++].aClass4_337;
			if (local25 != this.aClass66_20.aClass4Array1[this.anInt4505 - 1]) {
				this.aClass4_145 = local25.aClass4_337;
				return local25;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!jja", name = "b", descriptor = "(I)Lclient!oq;")
	public Class4 method4072() {
		this.anInt4505 = 0;
		return this.method4071();
	}
}
