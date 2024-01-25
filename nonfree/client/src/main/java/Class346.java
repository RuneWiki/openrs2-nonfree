import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!st")
public final class Class346 {

	@OriginalMember(owner = "client!st", name = "i", descriptor = "Lclient!an;")
	private Class3 aClass3_294;

	@OriginalMember(owner = "client!st", name = "g", descriptor = "Lclient!gn;")
	private Class136 aClass136_43;

	@OriginalMember(owner = "client!st", name = "c", descriptor = "I")
	private int anInt9734 = 0;

	@OriginalMember(owner = "client!st", name = "<init>", descriptor = "()V")
	private Class346() {
	}

	@OriginalMember(owner = "client!st", name = "<init>", descriptor = "(Lclient!gn;)V")
	public Class346(@OriginalArg(0) Class136 arg0) {
		this.aClass136_43 = arg0;
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(B)Lclient!an;")
	public Class3 method8213() {
		this.anInt9734 = 0;
		return this.method8215();
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(I)Lclient!an;")
	public Class3 method8215() {
		@Pc(35) Class3 local35;
		if (this.anInt9734 > 0 && this.aClass136_43.aClass3Array1[this.anInt9734 - 1] != this.aClass3_294) {
			local35 = this.aClass3_294;
			this.aClass3_294 = local35.aClass3_341;
			return local35;
		}
		while (this.anInt9734 < this.aClass136_43.anInt4261) {
			local35 = this.aClass136_43.aClass3Array1[this.anInt9734++].aClass3_341;
			if (local35 != this.aClass136_43.aClass3Array1[this.anInt9734 - 1]) {
				this.aClass3_294 = local35.aClass3_341;
				return local35;
			}
		}
		return null;
	}
}
