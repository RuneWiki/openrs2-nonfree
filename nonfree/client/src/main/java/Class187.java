import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public final class Class187 {

	@OriginalMember(owner = "client!td", name = "a", descriptor = "Lclient!pl;")
	private Class11 aClass11_212;

	@OriginalMember(owner = "client!td", name = "e", descriptor = "I")
	private int anInt5928 = 0;

	@OriginalMember(owner = "client!td", name = "c", descriptor = "Lclient!ec;")
	private final Class58 aClass58_34;

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Lclient!ec;)V")
	public Class187(@OriginalArg(0) Class58 arg0) {
		this.aClass58_34 = arg0;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(I)Lclient!pl;")
	public Class11 method5109() {
		@Pc(23) Class11 local23;
		if (this.anInt5928 > 0 && this.aClass58_34.aClass11Array1[this.anInt5928 - 1] != this.aClass11_212) {
			local23 = this.aClass11_212;
			this.aClass11_212 = local23.aClass11_251;
			return local23;
		}
		while (this.aClass58_34.anInt1252 > this.anInt5928) {
			local23 = this.aClass58_34.aClass11Array1[this.anInt5928++].aClass11_251;
			if (local23 != this.aClass58_34.aClass11Array1[this.anInt5928 - 1]) {
				this.aClass11_212 = local23.aClass11_251;
				return local23;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!td", name = "c", descriptor = "(I)Lclient!pl;")
	public Class11 method5111() {
		this.anInt5928 = 0;
		return this.method5109();
	}
}
