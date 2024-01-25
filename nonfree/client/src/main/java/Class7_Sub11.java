import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public final class Class7_Sub11 extends Class7 {

	@OriginalMember(owner = "client!gk", name = "o", descriptor = "I")
	public final int anInt2482;

	@OriginalMember(owner = "client!gk", name = "r", descriptor = "I")
	public final int anInt2485;

	@OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(II)V")
	public Class7_Sub11(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2482 = arg1;
		this.anInt2485 = arg0;
	}
}
