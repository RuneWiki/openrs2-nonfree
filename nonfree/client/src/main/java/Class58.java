import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public final class Class58 {

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
	public int anInt2515;

	@OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
	public int anInt2517;

	@OriginalMember(owner = "client!nc", name = "m", descriptor = "I")
	public int anInt2521;

	@OriginalMember(owner = "client!nc", name = "n", descriptor = "I")
	public int anInt2522;

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "()V")
	public Class58() {
	}

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Lclient!nc;)V")
	public Class58(@OriginalArg(0) Class58 arg0) {
		this.anInt2517 = arg0.anInt2517;
		this.anInt2521 = arg0.anInt2521;
		this.anInt2522 = arg0.anInt2522;
		this.anInt2515 = arg0.anInt2515;
	}
}
