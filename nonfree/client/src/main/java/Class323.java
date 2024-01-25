import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uo")
public final class Class323 {

	@OriginalMember(owner = "client!uo", name = "d", descriptor = "Lclient!oj;")
	private Class234 aClass234_45;

	@OriginalMember(owner = "client!uo", name = "f", descriptor = "Lclient!ia;")
	private Class6 aClass6_258;

	@OriginalMember(owner = "client!uo", name = "c", descriptor = "I")
	private int anInt9136 = 0;

	@OriginalMember(owner = "client!uo", name = "<init>", descriptor = "()V")
	private Class323() {
	}

	@OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(Lclient!oj;)V")
	public Class323(@OriginalArg(0) Class234 arg0) {
		this.aClass234_45 = arg0;
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(B)Lclient!ia;")
	public Class6 method7240() {
		@Pc(20) Class6 local20;
		if (this.anInt9136 > 0 && this.aClass6_258 != this.aClass234_45.aClass6Array1[this.anInt9136 - 1]) {
			local20 = this.aClass6_258;
			this.aClass6_258 = local20.aClass6_284;
			return local20;
		}
		while (this.anInt9136 < this.aClass234_45.anInt6758) {
			local20 = this.aClass234_45.aClass6Array1[this.anInt9136++].aClass6_284;
			if (this.aClass234_45.aClass6Array1[this.anInt9136 - 1] != local20) {
				this.aClass6_258 = local20.aClass6_284;
				return local20;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!uo", name = "b", descriptor = "(B)Lclient!ia;")
	public Class6 method7241() {
		this.anInt9136 = 0;
		return this.method7240();
	}
}
