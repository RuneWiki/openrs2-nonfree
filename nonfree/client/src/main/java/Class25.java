import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bo")
public final class Class25 {

	@OriginalMember(owner = "client!bo", name = "g", descriptor = "Lclient!vu;")
	private Class4 aClass4_33;

	@OriginalMember(owner = "client!bo", name = "h", descriptor = "I")
	private int anInt626 = 0;

	@OriginalMember(owner = "client!bo", name = "d", descriptor = "Lclient!ib;")
	private final Class102 aClass102_5;

	@OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(Lclient!ib;)V")
	public Class25(@OriginalArg(0) Class102 arg0) {
		this.aClass102_5 = arg0;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Z)Lclient!vu;")
	public Class4 method640() {
		@Pc(30) Class4 local30;
		if (this.anInt626 > 0 && this.aClass4_33 != this.aClass102_5.aClass4Array1[this.anInt626 - 1]) {
			local30 = this.aClass4_33;
			this.aClass4_33 = local30.aClass4_262;
			return local30;
		}
		while (this.anInt626 < this.aClass102_5.anInt3159) {
			local30 = this.aClass102_5.aClass4Array1[this.anInt626++].aClass4_262;
			if (this.aClass102_5.aClass4Array1[this.anInt626 - 1] != local30) {
				this.aClass4_33 = local30.aClass4_262;
				return local30;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)Lclient!vu;")
	public Class4 method641() {
		this.anInt626 = 0;
		return this.method640();
	}
}
