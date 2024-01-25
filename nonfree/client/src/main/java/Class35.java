import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!c")
public final class Class35 {

	@OriginalMember(owner = "client!c", name = "c", descriptor = "Lclient!s;")
	private Class7 aClass7_25;

	@OriginalMember(owner = "client!c", name = "f", descriptor = "I")
	private int anInt713 = 0;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "Lclient!aj;")
	private final Class10 aClass10_7;

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "(Lclient!aj;)V")
	public Class35(@OriginalArg(0) Class10 arg0) {
		this.aClass10_7 = arg0;
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(I)Lclient!s;")
	public Class7 method666() {
		@Pc(21) Class7 local21;
		if (this.anInt713 > 0 && this.aClass7_25 != this.aClass10_7.aClass7Array1[this.anInt713 - 1]) {
			local21 = this.aClass7_25;
			this.aClass7_25 = local21.aClass7_247;
			return local21;
		}
		while (this.aClass10_7.anInt182 > this.anInt713) {
			local21 = this.aClass10_7.aClass7Array1[this.anInt713++].aClass7_247;
			if (local21 != this.aClass10_7.aClass7Array1[this.anInt713 - 1]) {
				this.aClass7_25 = local21.aClass7_247;
				return local21;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!c", name = "d", descriptor = "(I)Lclient!s;")
	public Class7 method667() {
		this.anInt713 = 0;
		return this.method666();
	}
}
