import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rq")
public final class Class225 {

	@OriginalMember(owner = "client!rq", name = "d", descriptor = "Lclient!ha;")
	private Class4 aClass4_214;

	@OriginalMember(owner = "client!rq", name = "f", descriptor = "I")
	private int anInt6284 = 0;

	@OriginalMember(owner = "client!rq", name = "g", descriptor = "Lclient!hl;")
	private final Class96 aClass96_34;

	@OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(Lclient!hl;)V")
	public Class225(@OriginalArg(0) Class96 arg0) {
		this.aClass96_34 = arg0;
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(Z)Lclient!ha;")
	public Class4 method5163() {
		this.anInt6284 = 0;
		return this.method5165();
	}

	@OriginalMember(owner = "client!rq", name = "b", descriptor = "(Z)Lclient!ha;")
	public Class4 method5165() {
		@Pc(30) Class4 local30;
		if (this.anInt6284 > 0 && this.aClass96_34.aClass4Array1[this.anInt6284 - 1] != this.aClass4_214) {
			local30 = this.aClass4_214;
			this.aClass4_214 = local30.aClass4_269;
			return local30;
		}
		while (this.anInt6284 < this.aClass96_34.anInt3135) {
			local30 = this.aClass96_34.aClass4Array1[this.anInt6284++].aClass4_269;
			if (this.aClass96_34.aClass4Array1[this.anInt6284 - 1] != local30) {
				this.aClass4_214 = local30.aClass4_269;
				return local30;
			}
		}
		return null;
	}
}
