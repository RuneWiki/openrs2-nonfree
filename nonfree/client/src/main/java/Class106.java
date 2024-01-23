import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ll")
public final class Class106 {

	@OriginalMember(owner = "client!ll", name = "f", descriptor = "Lclient!vb;")
	private Class8 aClass8_127;

	@OriginalMember(owner = "client!ll", name = "c", descriptor = "I")
	private int anInt3117 = 0;

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "Lclient!pd;")
	private Class129 aClass129_15;

	@OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(Lclient!pd;)V")
	public Class106(@OriginalArg(0) Class129 arg0) {
		this.aClass129_15 = arg0;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(Z)Lclient!vb;")
	public Class8 method2445() {
		@Pc(31) Class8 local31;
		if (this.anInt3117 > 0 && this.aClass8_127 != this.aClass129_15.aClass8Array1[this.anInt3117 - 1]) {
			local31 = this.aClass8_127;
			this.aClass8_127 = local31.aClass8_229;
			return local31;
		}
		do {
			if (this.anInt3117 >= this.aClass129_15.anInt3910) {
				return null;
			}
			local31 = this.aClass129_15.aClass8Array1[this.anInt3117++].aClass8_229;
		} while (local31 == this.aClass129_15.aClass8Array1[this.anInt3117 - 1]);
		this.aClass8_127 = local31.aClass8_229;
		return local31;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)Lclient!vb;")
	public Class8 method2446() {
		this.anInt3117 = 0;
		return this.method2445();
	}
}
