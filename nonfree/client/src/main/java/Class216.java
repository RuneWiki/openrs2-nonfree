import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tj")
public final class Class216 {

	@OriginalMember(owner = "client!tj", name = "f", descriptor = "Lclient!pt;")
	private Class2 aClass2_208;

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "I")
	private int anInt6210 = 0;

	@OriginalMember(owner = "client!tj", name = "h", descriptor = "Lclient!wb;")
	private final Class243 aClass243_29;

	@OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(Lclient!wb;)V")
	public Class216(@OriginalArg(0) Class243 arg0) {
		this.aClass243_29 = arg0;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)Lclient!pt;")
	public Class2 method5409() {
		@Pc(23) Class2 local23;
		if (this.anInt6210 > 0 && this.aClass2_208 != this.aClass243_29.aClass2Array1[this.anInt6210 - 1]) {
			local23 = this.aClass2_208;
			this.aClass2_208 = local23.aClass2_244;
			return local23;
		}
		while (this.anInt6210 < this.aClass243_29.anInt6914) {
			local23 = this.aClass243_29.aClass2Array1[this.anInt6210++].aClass2_244;
			if (this.aClass243_29.aClass2Array1[this.anInt6210 - 1] != local23) {
				this.aClass2_208 = local23.aClass2_244;
				return local23;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!tj", name = "c", descriptor = "(I)Lclient!pt;")
	public Class2 method5412() {
		this.anInt6210 = 0;
		return this.method5409();
	}
}
