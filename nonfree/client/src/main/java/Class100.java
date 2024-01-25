import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hm")
public final class Class100 {

	@OriginalMember(owner = "client!hm", name = "g", descriptor = "Lclient!lf;")
	private Class3 aClass3_109;

	@OriginalMember(owner = "client!hm", name = "e", descriptor = "I")
	private int anInt3347 = 0;

	@OriginalMember(owner = "client!hm", name = "h", descriptor = "Lclient!jr;")
	private final Class127 aClass127_16;

	@OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(Lclient!jr;)V")
	public Class100(@OriginalArg(0) Class127 arg0) {
		this.aClass127_16 = arg0;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(Z)Lclient!lf;")
	public Class3 method2731() {
		@Pc(25) Class3 local25;
		if (this.anInt3347 > 0 && this.aClass127_16.aClass3Array1[this.anInt3347 - 1] != this.aClass3_109) {
			local25 = this.aClass3_109;
			this.aClass3_109 = local25.aClass3_261;
			return local25;
		}
		while (this.aClass127_16.anInt3945 > this.anInt3347) {
			local25 = this.aClass127_16.aClass3Array1[this.anInt3347++].aClass3_261;
			if (this.aClass127_16.aClass3Array1[this.anInt3347 - 1] != local25) {
				this.aClass3_109 = local25.aClass3_261;
				return local25;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "(Z)Lclient!lf;")
	public Class3 method2733() {
		this.anInt3347 = 0;
		return this.method2731();
	}
}
