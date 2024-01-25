import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qr")
public final class Class172 {

	@OriginalMember(owner = "client!qr", name = "c", descriptor = "Lclient!vi;")
	private Class5 aClass5_192;

	@OriginalMember(owner = "client!qr", name = "g", descriptor = "I")
	private int anInt5293 = 0;

	@OriginalMember(owner = "client!qr", name = "d", descriptor = "Lclient!tn;")
	private final Class190 aClass190_29;

	@OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(Lclient!tn;)V")
	public Class172(@OriginalArg(0) Class190 arg0) {
		this.aClass190_29 = arg0;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(B)Lclient!vi;")
	public Class5 method4717() {
		this.anInt5293 = 0;
		return this.method4721();
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(Z)Lclient!vi;")
	public Class5 method4721() {
		@Pc(27) Class5 local27;
		if (this.anInt5293 > 0 && this.aClass190_29.aClass5Array1[this.anInt5293 - 1] != this.aClass5_192) {
			local27 = this.aClass5_192;
			this.aClass5_192 = local27.aClass5_251;
			return local27;
		}
		while (this.anInt5293 < this.aClass190_29.anInt6080) {
			local27 = this.aClass190_29.aClass5Array1[this.anInt5293++].aClass5_251;
			if (this.aClass190_29.aClass5Array1[this.anInt5293 - 1] != local27) {
				this.aClass5_192 = local27.aClass5_251;
				return local27;
			}
		}
		return null;
	}
}
