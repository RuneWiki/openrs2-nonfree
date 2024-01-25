import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!og")
public final class Class177 {

	@OriginalMember(owner = "client!og", name = "d", descriptor = "Lclient!ki;")
	private Class1 aClass1_170;

	@OriginalMember(owner = "client!og", name = "c", descriptor = "I")
	private int anInt4987 = 0;

	@OriginalMember(owner = "client!og", name = "b", descriptor = "Lclient!bj;")
	private final Class27 aClass27_29;

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Lclient!bj;)V")
	public Class177(@OriginalArg(0) Class27 arg0) {
		this.aClass27_29 = arg0;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(B)Lclient!ki;")
	public Class1 method4039() {
		this.anInt4987 = 0;
		return this.method4040();
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(I)Lclient!ki;")
	public Class1 method4040() {
		@Pc(27) Class1 local27;
		if (this.anInt4987 > 0 && this.aClass27_29.aClass1Array1[this.anInt4987 - 1] != this.aClass1_170) {
			local27 = this.aClass1_170;
			this.aClass1_170 = local27.aClass1_261;
			return local27;
		}
		while (this.anInt4987 < this.aClass27_29.anInt622) {
			local27 = this.aClass27_29.aClass1Array1[this.anInt4987++].aClass1_261;
			if (this.aClass27_29.aClass1Array1[this.anInt4987 - 1] != local27) {
				this.aClass1_170 = local27.aClass1_261;
				return local27;
			}
		}
		return null;
	}
}
