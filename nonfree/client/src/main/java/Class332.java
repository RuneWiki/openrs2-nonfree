import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!u")
public final class Class332 {

	@OriginalMember(owner = "client!u", name = "a", descriptor = "Lclient!baa;")
	private Class25 aClass25_44;

	@OriginalMember(owner = "client!u", name = "e", descriptor = "Lclient!no;")
	private Class3 aClass3_275;

	@OriginalMember(owner = "client!u", name = "d", descriptor = "I")
	private int anInt9312 = 0;

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "()V")
	private Class332() {
	}

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Lclient!baa;)V")
	public Class332(@OriginalArg(0) Class25 arg0) {
		this.aClass25_44 = arg0;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(I)Lclient!no;")
	public Class3 method7958() {
		this.anInt9312 = 0;
		return this.method7960();
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(B)Lclient!no;")
	public Class3 method7960() {
		@Pc(23) Class3 local23;
		if (this.anInt9312 > 0 && this.aClass3_275 != this.aClass25_44.aClass3Array1[this.anInt9312 - 1]) {
			local23 = this.aClass3_275;
			this.aClass3_275 = local23.aClass3_300;
			return local23;
		}
		while (this.anInt9312 < this.aClass25_44.anInt446) {
			local23 = this.aClass25_44.aClass3Array1[this.anInt9312++].aClass3_300;
			if (this.aClass25_44.aClass3Array1[this.anInt9312 - 1] != local23) {
				this.aClass3_275 = local23.aClass3_300;
				return local23;
			}
		}
		return null;
	}
}
