import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qh")
public final class Class204 {

	@OriginalMember(owner = "client!qh", name = "e", descriptor = "Lclient!wh;")
	private Class2 aClass2_204;

	@OriginalMember(owner = "client!qh", name = "d", descriptor = "I")
	private int anInt5980 = 0;

	@OriginalMember(owner = "client!qh", name = "g", descriptor = "Lclient!ru;")
	private final Class220 aClass220_33;

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(Lclient!ru;)V")
	public Class204(@OriginalArg(0) Class220 arg0) {
		this.aClass220_33 = arg0;
	}

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(I)Lclient!wh;")
	public Class2 method4746() {
		@Pc(28) Class2 local28;
		if (this.anInt5980 > 0 && this.aClass220_33.aClass2Array1[this.anInt5980 - 1] != this.aClass2_204) {
			local28 = this.aClass2_204;
			this.aClass2_204 = local28.aClass2_268;
			return local28;
		}
		while (this.anInt5980 < this.aClass220_33.anInt6413) {
			local28 = this.aClass220_33.aClass2Array1[this.anInt5980++].aClass2_268;
			if (local28 != this.aClass220_33.aClass2Array1[this.anInt5980 - 1]) {
				this.aClass2_204 = local28.aClass2_268;
				return local28;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(B)Lclient!wh;")
	public Class2 method4747() {
		this.anInt5980 = 0;
		return this.method4746();
	}
}
