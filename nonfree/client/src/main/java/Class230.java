import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!te")
public final class Class230 {

	@OriginalMember(owner = "client!te", name = "d", descriptor = "Lclient!cg;")
	private Class6 aClass6_205;

	@OriginalMember(owner = "client!te", name = "a", descriptor = "I")
	private int anInt6764 = 0;

	@OriginalMember(owner = "client!te", name = "c", descriptor = "Lclient!fe;")
	private final Class74 aClass74_25;

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Lclient!fe;)V")
	public Class230(@OriginalArg(0) Class74 arg0) {
		this.aClass74_25 = arg0;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(B)Lclient!cg;")
	public Class6 method5635() {
		this.anInt6764 = 0;
		return this.method5636();
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(B)Lclient!cg;")
	public Class6 method5636() {
		@Pc(28) Class6 local28;
		if (this.anInt6764 > 0 && this.aClass6_205 != this.aClass74_25.aClass6Array1[this.anInt6764 - 1]) {
			local28 = this.aClass6_205;
			this.aClass6_205 = local28.aClass6_252;
			return local28;
		}
		while (this.aClass74_25.anInt2296 > this.anInt6764) {
			local28 = this.aClass74_25.aClass6Array1[this.anInt6764++].aClass6_252;
			if (this.aClass74_25.aClass6Array1[this.anInt6764 - 1] != local28) {
				this.aClass6_205 = local28.aClass6_252;
				return local28;
			}
		}
		return null;
	}
}
