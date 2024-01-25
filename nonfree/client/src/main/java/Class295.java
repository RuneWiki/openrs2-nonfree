import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rn")
public final class Class295 {

	@OriginalMember(owner = "client!rn", name = "f", descriptor = "Lclient!efa;")
	private Class6 aClass6_240;

	@OriginalMember(owner = "client!rn", name = "h", descriptor = "Lclient!he;")
	private Class128 aClass128_41;

	@OriginalMember(owner = "client!rn", name = "c", descriptor = "I")
	private int anInt8611 = 0;

	@OriginalMember(owner = "client!rn", name = "<init>", descriptor = "()V")
	private Class295() {
	}

	@OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(Lclient!he;)V")
	public Class295(@OriginalArg(0) Class128 arg0) {
		this.aClass128_41 = arg0;
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)Lclient!efa;")
	public Class6 method7421() {
		this.anInt8611 = 0;
		return this.method7423();
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(Z)Lclient!efa;")
	public Class6 method7423() {
		@Pc(25) Class6 local25;
		if (this.anInt8611 > 0 && this.aClass6_240 != this.aClass128_41.aClass6Array1[this.anInt8611 - 1]) {
			local25 = this.aClass6_240;
			this.aClass6_240 = local25.aClass6_299;
			return local25;
		}
		while (this.aClass128_41.anInt4064 > this.anInt8611) {
			local25 = this.aClass128_41.aClass6Array1[this.anInt8611++].aClass6_299;
			if (local25 != this.aClass128_41.aClass6Array1[this.anInt8611 - 1]) {
				this.aClass6_240 = local25.aClass6_299;
				return local25;
			}
		}
		return null;
	}
}
