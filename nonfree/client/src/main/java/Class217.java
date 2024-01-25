import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mga")
public final class Class217 {

	@OriginalMember(owner = "client!mga", name = "g", descriptor = "Lclient!mo;")
	private Class221 aClass221_21;

	@OriginalMember(owner = "client!mga", name = "i", descriptor = "Lclient!tv;")
	private Class4 aClass4_166;

	@OriginalMember(owner = "client!mga", name = "b", descriptor = "I")
	private int anInt6369 = 0;

	@OriginalMember(owner = "client!mga", name = "<init>", descriptor = "()V")
	private Class217() {
	}

	@OriginalMember(owner = "client!mga", name = "<init>", descriptor = "(Lclient!mo;)V")
	public Class217(@OriginalArg(0) Class221 arg0) {
		this.aClass221_21 = arg0;
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(I)Lclient!tv;")
	public Class4 method5013() {
		this.anInt6369 = 0;
		return this.method5016();
	}

	@OriginalMember(owner = "client!mga", name = "c", descriptor = "(I)Lclient!tv;")
	public Class4 method5016() {
		@Pc(23) Class4 local23;
		if (this.anInt6369 > 0 && this.aClass221_21.aClass4Array1[this.anInt6369 - 1] != this.aClass4_166) {
			local23 = this.aClass4_166;
			this.aClass4_166 = local23.aClass4_286;
			return local23;
		}
		while (this.anInt6369 < this.aClass221_21.anInt6437) {
			local23 = this.aClass221_21.aClass4Array1[this.anInt6369++].aClass4_286;
			if (local23 != this.aClass221_21.aClass4Array1[this.anInt6369 - 1]) {
				this.aClass4_166 = local23.aClass4_286;
				return local23;
			}
		}
		return null;
	}
}
