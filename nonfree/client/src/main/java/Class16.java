import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!as")
public final class Class16 {

	@OriginalMember(owner = "client!as", name = "d", descriptor = "Lclient!es;")
	private Class10 aClass10_13;

	@OriginalMember(owner = "client!as", name = "i", descriptor = "I")
	private int anInt322 = 0;

	@OriginalMember(owner = "client!as", name = "c", descriptor = "Lclient!mn;")
	private final Class167 aClass167_4;

	@OriginalMember(owner = "client!as", name = "<init>", descriptor = "(Lclient!mn;)V")
	public Class16(@OriginalArg(0) Class167 arg0) {
		this.aClass167_4 = arg0;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(Z)Lclient!es;")
	public Class10 method255() {
		this.anInt322 = 0;
		return this.method256();
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(I)Lclient!es;")
	public Class10 method256() {
		@Pc(23) Class10 local23;
		if (this.anInt322 > 0 && this.aClass167_4.aClass10Array1[this.anInt322 - 1] != this.aClass10_13) {
			local23 = this.aClass10_13;
			this.aClass10_13 = local23.aClass10_263;
			return local23;
		}
		while (this.anInt322 < this.aClass167_4.anInt4588) {
			local23 = this.aClass167_4.aClass10Array1[this.anInt322++].aClass10_263;
			if (this.aClass167_4.aClass10Array1[this.anInt322 - 1] != local23) {
				this.aClass10_13 = local23.aClass10_263;
				return local23;
			}
		}
		return null;
	}
}
