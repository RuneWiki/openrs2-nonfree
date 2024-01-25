import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public final class Class180 {

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "Lclient!qp;")
	private Class280 aClass280_24;

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "Lclient!qm;")
	private Class3 aClass3_163;

	@OriginalMember(owner = "client!kb", name = "g", descriptor = "I")
	private int anInt5069 = 0;

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "()V")
	private Class180() {
	}

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Lclient!qp;)V")
	public Class180(@OriginalArg(0) Class280 arg0) {
		this.aClass280_24 = arg0;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)Lclient!qm;")
	public Class3 method4568() {
		@Pc(28) Class3 local28;
		if (this.anInt5069 > 0 && this.aClass280_24.aClass3Array1[this.anInt5069 - 1] != this.aClass3_163) {
			local28 = this.aClass3_163;
			this.aClass3_163 = local28.aClass3_300;
			return local28;
		}
		while (this.aClass280_24.anInt8254 > this.anInt5069) {
			local28 = this.aClass280_24.aClass3Array1[this.anInt5069++].aClass3_300;
			if (local28 != this.aClass280_24.aClass3Array1[this.anInt5069 - 1]) {
				this.aClass3_163 = local28.aClass3_300;
				return local28;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Z)Lclient!qm;")
	public Class3 method4571() {
		this.anInt5069 = 0;
		return this.method4568();
	}
}
