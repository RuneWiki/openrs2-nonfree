import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ld")
public final class Class102 {

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "Lclient!ma;")
	private Class2 aClass2_117;

	@OriginalMember(owner = "client!ld", name = "l", descriptor = "I")
	private int anInt3121 = 0;

	@OriginalMember(owner = "client!ld", name = "e", descriptor = "Lclient!ii;")
	private Class79 aClass79_13;

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Lclient!ii;)V")
	public Class102(@OriginalArg(0) Class79 arg0) {
		this.aClass79_13 = arg0;
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)Lclient!ma;")
	public Class2 method2550() {
		this.anInt3121 = 0;
		return this.method2553();
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(Z)Lclient!ma;")
	public Class2 method2553() {
		@Pc(29) Class2 local29;
		if (this.anInt3121 > 0 && this.aClass2_117 != this.aClass79_13.aClass2Array1[this.anInt3121 - 1]) {
			local29 = this.aClass2_117;
			this.aClass2_117 = local29.aClass2_231;
			return local29;
		}
		do {
			if (this.aClass79_13.anInt2326 <= this.anInt3121) {
				return null;
			}
			local29 = this.aClass79_13.aClass2Array1[this.anInt3121++].aClass2_231;
		} while (local29 == this.aClass79_13.aClass2Array1[this.anInt3121 - 1]);
		this.aClass2_117 = local29.aClass2_231;
		return local29;
	}
}
