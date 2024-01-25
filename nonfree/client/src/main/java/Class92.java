import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ef")
public final class Class92 {

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "Lclient!tfa;")
	private Class3 aClass3_97;

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "Lclient!qn;")
	private Class313 aClass313_12;

	@OriginalMember(owner = "client!ef", name = "e", descriptor = "I")
	private int anInt2606 = 0;

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "()V")
	private Class92() {
	}

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Lclient!qn;)V")
	public Class92(@OriginalArg(0) Class313 arg0) {
		this.aClass313_12 = arg0;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Z)Lclient!tfa;")
	public Class3 method2382() {
		@Pc(35) Class3 local35;
		if (this.anInt2606 > 0 && this.aClass3_97 != this.aClass313_12.aClass3Array1[this.anInt2606 - 1]) {
			local35 = this.aClass3_97;
			this.aClass3_97 = local35.aClass3_346;
			return local35;
		}
		while (this.aClass313_12.anInt8324 > this.anInt2606) {
			local35 = this.aClass313_12.aClass3Array1[this.anInt2606++].aClass3_346;
			if (this.aClass313_12.aClass3Array1[this.anInt2606 - 1] != local35) {
				this.aClass3_97 = local35.aClass3_346;
				return local35;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(B)Lclient!tfa;")
	public Class3 method2383() {
		this.anInt2606 = 0;
		return this.method2382();
	}
}
