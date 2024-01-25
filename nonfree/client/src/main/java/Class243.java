import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pda")
public final class Class243 {

	@OriginalMember(owner = "client!pda", name = "c", descriptor = "Lclient!sf;")
	private Class6 aClass6_212;

	@OriginalMember(owner = "client!pda", name = "j", descriptor = "Lclient!nj;")
	private Class212 aClass212_28;

	@OriginalMember(owner = "client!pda", name = "b", descriptor = "I")
	private int anInt6581 = 0;

	@OriginalMember(owner = "client!pda", name = "<init>", descriptor = "()V")
	private Class243() {
	}

	@OriginalMember(owner = "client!pda", name = "<init>", descriptor = "(Lclient!nj;)V")
	public Class243(@OriginalArg(0) Class212 arg0) {
		this.aClass212_28 = arg0;
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(I)Lclient!sf;")
	public Class6 method5554() {
		this.anInt6581 = 0;
		return this.method5555();
	}

	@OriginalMember(owner = "client!pda", name = "b", descriptor = "(I)Lclient!sf;")
	public Class6 method5555() {
		@Pc(25) Class6 local25;
		if (this.anInt6581 > 0 && this.aClass212_28.aClass6Array1[this.anInt6581 - 1] != this.aClass6_212) {
			local25 = this.aClass6_212;
			this.aClass6_212 = local25.aClass6_284;
			return local25;
		}
		while (this.anInt6581 < this.aClass212_28.anInt5972) {
			local25 = this.aClass212_28.aClass6Array1[this.anInt6581++].aClass6_284;
			if (this.aClass212_28.aClass6Array1[this.anInt6581 - 1] != local25) {
				this.aClass6_212 = local25.aClass6_284;
				return local25;
			}
		}
		return null;
	}
}
