import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public final class Class72 {

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "I")
	public int anInt2514;

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "I")
	public int anInt2515;

	@OriginalMember(owner = "client!fr", name = "c", descriptor = "I")
	public int anInt2516;

	@OriginalMember(owner = "client!fr", name = "<init>", descriptor = "()V")
	public Class72() {
	}

	@OriginalMember(owner = "client!fr", name = "<init>", descriptor = "(Lclient!fr;)V")
	public Class72(@OriginalArg(0) Class72 arg0) {
		this.anInt2515 = arg0.anInt2515;
		this.anInt2516 = arg0.anInt2516;
		this.anInt2514 = arg0.anInt2514;
	}
}
