import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tba")
public final class Class331 {

	@OriginalMember(owner = "client!tba", name = "c", descriptor = "Lclient!sja;")
	private Class6 aClass6_279;

	@OriginalMember(owner = "client!tba", name = "d", descriptor = "Lclient!lk;")
	private Class209 aClass209_50;

	@OriginalMember(owner = "client!tba", name = "f", descriptor = "I")
	private int anInt9351 = 0;

	@OriginalMember(owner = "client!tba", name = "<init>", descriptor = "()V")
	private Class331() {
	}

	@OriginalMember(owner = "client!tba", name = "<init>", descriptor = "(Lclient!lk;)V")
	public Class331(@OriginalArg(0) Class209 arg0) {
		this.aClass209_50 = arg0;
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(I)Lclient!sja;")
	public Class6 method7886() {
		@Pc(23) Class6 local23;
		if (this.anInt9351 > 0 && this.aClass6_279 != this.aClass209_50.aClass6Array1[this.anInt9351 - 1]) {
			local23 = this.aClass6_279;
			this.aClass6_279 = local23.aClass6_338;
			return local23;
		}
		while (this.anInt9351 < this.aClass209_50.anInt5919) {
			local23 = this.aClass209_50.aClass6Array1[this.anInt9351++].aClass6_338;
			if (local23 != this.aClass209_50.aClass6Array1[this.anInt9351 - 1]) {
				this.aClass6_279 = local23.aClass6_338;
				return local23;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(B)Lclient!sja;")
	public Class6 method7889() {
		this.anInt9351 = 0;
		return this.method7886();
	}
}
