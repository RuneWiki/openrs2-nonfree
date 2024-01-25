import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public final class Class96 {

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "I")
	public int anInt2765;

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "I")
	public int anInt2766;

	@OriginalMember(owner = "client!gk", name = "c", descriptor = "I")
	public int anInt2767;

	@OriginalMember(owner = "client!gk", name = "d", descriptor = "I")
	public int anInt2768;

	@OriginalMember(owner = "client!gk", name = "<init>", descriptor = "()V")
	public Class96() {
	}

	@OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Lclient!gk;)V")
	public Class96(@OriginalArg(0) Class96 arg0) {
		this.anInt2765 = arg0.anInt2765;
		this.anInt2768 = arg0.anInt2768;
		this.anInt2767 = arg0.anInt2767;
		this.anInt2766 = arg0.anInt2766;
	}
}
