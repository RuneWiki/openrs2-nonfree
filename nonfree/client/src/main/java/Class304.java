import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rfa")
public final class Class304 {

	@OriginalMember(owner = "client!rfa", name = "e", descriptor = "Lclient!dn;")
	private Class5 aClass5_265;

	@OriginalMember(owner = "client!rfa", name = "f", descriptor = "Lclient!tga;")
	private Class335 aClass335_42;

	@OriginalMember(owner = "client!rfa", name = "h", descriptor = "I")
	private int anInt8527 = 0;

	@OriginalMember(owner = "client!rfa", name = "<init>", descriptor = "()V")
	private Class304() {
	}

	@OriginalMember(owner = "client!rfa", name = "<init>", descriptor = "(Lclient!tga;)V")
	public Class304(@OriginalArg(0) Class335 arg0) {
		this.aClass335_42 = arg0;
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(B)Lclient!dn;")
	public Class5 method7246() {
		@Pc(28) Class5 local28;
		if (this.anInt8527 > 0 && this.aClass5_265 != this.aClass335_42.aClass5Array1[this.anInt8527 - 1]) {
			local28 = this.aClass5_265;
			this.aClass5_265 = local28.aClass5_337;
			return local28;
		}
		while (this.aClass335_42.anInt9280 > this.anInt8527) {
			local28 = this.aClass335_42.aClass5Array1[this.anInt8527++].aClass5_337;
			if (this.aClass335_42.aClass5Array1[this.anInt8527 - 1] != local28) {
				this.aClass5_265 = local28.aClass5_337;
				return local28;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!rfa", name = "b", descriptor = "(B)Lclient!dn;")
	public Class5 method7247() {
		this.anInt8527 = 0;
		return this.method7246();
	}
}
