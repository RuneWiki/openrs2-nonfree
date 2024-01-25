import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ai")
public final class Class9 {

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "Lclient!on;")
	private Class6 aClass6_12;

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "I")
	private int anInt139 = 0;

	@OriginalMember(owner = "client!ai", name = "k", descriptor = "Lclient!jj;")
	private final Class108 aClass108_1;

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Lclient!jj;)V")
	public Class9(@OriginalArg(0) Class108 arg0) {
		this.aClass108_1 = arg0;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)Lclient!on;")
	public Class6 method151() {
		@Pc(27) Class6 local27;
		if (this.anInt139 > 0 && this.aClass6_12 != this.aClass108_1.aClass6Array1[this.anInt139 - 1]) {
			local27 = this.aClass6_12;
			this.aClass6_12 = local27.aClass6_248;
			return local27;
		}
		while (this.aClass108_1.anInt2749 > this.anInt139) {
			local27 = this.aClass108_1.aClass6Array1[this.anInt139++].aClass6_248;
			if (this.aClass108_1.aClass6Array1[this.anInt139 - 1] != local27) {
				this.aClass6_12 = local27.aClass6_248;
				return local27;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Z)Lclient!on;")
	public Class6 method152() {
		this.anInt139 = 0;
		return this.method151();
	}
}
