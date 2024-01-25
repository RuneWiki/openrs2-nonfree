import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!as")
public final class Class15 {

	@OriginalMember(owner = "client!as", name = "g", descriptor = "Lclient!uj;")
	private Class2 aClass2_19;

	@OriginalMember(owner = "client!as", name = "c", descriptor = "I")
	private int anInt346 = 0;

	@OriginalMember(owner = "client!as", name = "e", descriptor = "Lclient!mn;")
	private final Class163 aClass163_1;

	@OriginalMember(owner = "client!as", name = "<init>", descriptor = "(Lclient!mn;)V")
	public Class15(@OriginalArg(0) Class163 arg0) {
		this.aClass163_1 = arg0;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(Z)Lclient!uj;")
	public Class2 method314() {
		this.anInt346 = 0;
		return this.method317();
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(I)Lclient!uj;")
	public Class2 method317() {
		@Pc(23) Class2 local23;
		if (this.anInt346 > 0 && this.aClass163_1.aClass2Array1[this.anInt346 - 1] != this.aClass2_19) {
			local23 = this.aClass2_19;
			this.aClass2_19 = local23.aClass2_261;
			return local23;
		}
		while (this.anInt346 < this.aClass163_1.anInt4679) {
			local23 = this.aClass163_1.aClass2Array1[this.anInt346++].aClass2_261;
			if (this.aClass163_1.aClass2Array1[this.anInt346 - 1] != local23) {
				this.aClass2_19 = local23.aClass2_261;
				return local23;
			}
		}
		return null;
	}
}
