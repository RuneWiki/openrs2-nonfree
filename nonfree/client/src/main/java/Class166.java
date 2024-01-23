import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!te")
public final class Class166 {

	@OriginalMember(owner = "client!te", name = "j", descriptor = "Lclient!ec;")
	private Class1 aClass1_193;

	@OriginalMember(owner = "client!te", name = "l", descriptor = "I")
	private int anInt5323 = 0;

	@OriginalMember(owner = "client!te", name = "c", descriptor = "Lclient!vl;")
	private Class186 aClass186_24;

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Lclient!vl;)V")
	public Class166(@OriginalArg(0) Class186 arg0) {
		this.aClass186_24 = arg0;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(I)Lclient!ec;")
	public Class1 method4021() {
		this.anInt5323 = 0;
		return this.method4024();
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(I)Lclient!ec;")
	public Class1 method4024() {
		@Pc(31) Class1 local31;
		if (this.anInt5323 > 0 && this.aClass1_193 != this.aClass186_24.aClass1Array1[this.anInt5323 - 1]) {
			local31 = this.aClass1_193;
			this.aClass1_193 = local31.aClass1_233;
			return local31;
		}
		do {
			if (this.aClass186_24.anInt5960 <= this.anInt5323) {
				return null;
			}
			local31 = this.aClass186_24.aClass1Array1[this.anInt5323++].aClass1_233;
		} while (local31 == this.aClass186_24.aClass1Array1[this.anInt5323 - 1]);
		this.aClass1_193 = local31.aClass1_233;
		return local31;
	}
}
