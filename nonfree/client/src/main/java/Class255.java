import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pq")
public final class Class255 {

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "Lclient!hd;")
	private Class128 aClass128_34;

	@OriginalMember(owner = "client!pq", name = "c", descriptor = "Lclient!kd;")
	private Class6 aClass6_214;

	@OriginalMember(owner = "client!pq", name = "d", descriptor = "I")
	private int anInt7176 = 0;

	@OriginalMember(owner = "client!pq", name = "<init>", descriptor = "()V")
	private Class255() {
	}

	@OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(Lclient!hd;)V")
	public Class255(@OriginalArg(0) Class128 arg0) {
		this.aClass128_34 = arg0;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(B)Lclient!kd;")
	public Class6 method5925() {
		@Pc(26) Class6 local26;
		if (this.anInt7176 > 0 && this.aClass128_34.aClass6Array1[this.anInt7176 - 1] != this.aClass6_214) {
			local26 = this.aClass6_214;
			this.aClass6_214 = local26.aClass6_286;
			return local26;
		}
		while (this.anInt7176 < this.aClass128_34.anInt3744) {
			local26 = this.aClass128_34.aClass6Array1[this.anInt7176++].aClass6_286;
			if (local26 != this.aClass128_34.aClass6Array1[this.anInt7176 - 1]) {
				this.aClass6_214 = local26.aClass6_286;
				return local26;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "(I)Lclient!kd;")
	public Class6 method5928() {
		this.anInt7176 = 0;
		return this.method5925();
	}
}
