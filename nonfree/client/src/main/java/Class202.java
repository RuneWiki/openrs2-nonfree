import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kt")
public final class Class202 {

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "Lclient!ko;")
	private Class5 aClass5_184;

	@OriginalMember(owner = "client!kt", name = "d", descriptor = "Lclient!rda;")
	private Class300 aClass300_24;

	@OriginalMember(owner = "client!kt", name = "b", descriptor = "I")
	private int anInt6051 = 0;

	@OriginalMember(owner = "client!kt", name = "<init>", descriptor = "()V")
	private Class202() {
	}

	@OriginalMember(owner = "client!kt", name = "<init>", descriptor = "(Lclient!rda;)V")
	public Class202(@OriginalArg(0) Class300 arg0) {
		this.aClass300_24 = arg0;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(I)Lclient!ko;")
	public Class5 method5025() {
		this.anInt6051 = 0;
		return this.method5027();
	}

	@OriginalMember(owner = "client!kt", name = "b", descriptor = "(I)Lclient!ko;")
	public Class5 method5027() {
		@Pc(25) Class5 local25;
		if (this.anInt6051 > 0 && this.aClass5_184 != this.aClass300_24.aClass5Array1[this.anInt6051 - 1]) {
			local25 = this.aClass5_184;
			this.aClass5_184 = local25.aClass5_338;
			return local25;
		}
		while (this.anInt6051 < this.aClass300_24.anInt8426) {
			local25 = this.aClass300_24.aClass5Array1[this.anInt6051++].aClass5_338;
			if (this.aClass300_24.aClass5Array1[this.anInt6051 - 1] != local25) {
				this.aClass5_184 = local25.aClass5_338;
				return local25;
			}
		}
		return null;
	}
}
