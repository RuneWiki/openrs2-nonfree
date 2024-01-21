import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public final class Class63 {

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
	public int anInt2431;

	@OriginalMember(owner = "client!qc", name = "j", descriptor = "I")
	public int anInt2433;

	@OriginalMember(owner = "client!qc", name = "l", descriptor = "I")
	public int anInt2435;

	@OriginalMember(owner = "client!qc", name = "r", descriptor = "I")
	public int anInt2437;

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "()V")
	public Class63() {
	}

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Lclient!qc;)V")
	public Class63(@OriginalArg(0) Class63 arg0) {
		this.anInt2433 = arg0.anInt2433;
		this.anInt2437 = arg0.anInt2437;
		this.anInt2435 = arg0.anInt2435;
		this.anInt2431 = arg0.anInt2431;
	}
}
