import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public final class Class187 {

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "Lclient!ag;")
	private Class2 aClass2_184;

	@OriginalMember(owner = "client!qe", name = "g", descriptor = "I")
	private int anInt5132 = 0;

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "Lclient!sq;")
	private final Class214 aClass214_28;

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Lclient!sq;)V")
	public Class187(@OriginalArg(0) Class214 arg0) {
		this.aClass214_28 = arg0;
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(B)Lclient!ag;")
	public Class2 method4421() {
		@Pc(23) Class2 local23;
		if (this.anInt5132 > 0 && this.aClass214_28.aClass2Array1[this.anInt5132 - 1] != this.aClass2_184) {
			local23 = this.aClass2_184;
			this.aClass2_184 = local23.aClass2_244;
			return local23;
		}
		while (this.anInt5132 < this.aClass214_28.anInt5786) {
			local23 = this.aClass214_28.aClass2Array1[this.anInt5132++].aClass2_244;
			if (local23 != this.aClass214_28.aClass2Array1[this.anInt5132 - 1]) {
				this.aClass2_184 = local23.aClass2_244;
				return local23;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)Lclient!ag;")
	public Class2 method4423() {
		this.anInt5132 = 0;
		return this.method4421();
	}
}
