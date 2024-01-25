import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!op")
public final class Class242 {

	@OriginalMember(owner = "client!op", name = "f", descriptor = "Lclient!sba;")
	private Class297 aClass297_28;

	@OriginalMember(owner = "client!op", name = "j", descriptor = "Lclient!u;")
	private Class3 aClass3_188;

	@OriginalMember(owner = "client!op", name = "d", descriptor = "I")
	private int anInt6959 = 0;

	@OriginalMember(owner = "client!op", name = "<init>", descriptor = "()V")
	private Class242() {
	}

	@OriginalMember(owner = "client!op", name = "<init>", descriptor = "(Lclient!sba;)V")
	public Class242(@OriginalArg(0) Class297 arg0) {
		this.aClass297_28 = arg0;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(B)Lclient!u;")
	public Class3 method5560() {
		this.anInt6959 = 0;
		return this.method5563();
	}

	@OriginalMember(owner = "client!op", name = "c", descriptor = "(B)Lclient!u;")
	public Class3 method5563() {
		if (this.anInt6959 > 0 && this.aClass3_188 != this.aClass297_28.aClass3Array1[this.anInt6959 - 1]) {
			@Pc(25) Class3 local25 = this.aClass3_188;
			this.aClass3_188 = local25.aClass3_285;
			return local25;
		}
		while (this.aClass297_28.anInt8325 > this.anInt6959) {
			@Pc(54) Class3 local54 = this.aClass297_28.aClass3Array1[this.anInt6959++].aClass3_285;
			if (this.aClass297_28.aClass3Array1[this.anInt6959 - 1] != local54) {
				this.aClass3_188 = local54.aClass3_285;
				return local54;
			}
		}
		return null;
	}
}
