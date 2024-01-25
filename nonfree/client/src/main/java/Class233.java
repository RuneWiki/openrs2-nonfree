import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public final class Class233 {

	@OriginalMember(owner = "client!te", name = "a", descriptor = "I")
	public int anInt6588;

	@OriginalMember(owner = "client!te", name = "c", descriptor = "I")
	public int anInt6589;

	@OriginalMember(owner = "client!te", name = "d", descriptor = "I")
	public int anInt6590;

	@OriginalMember(owner = "client!te", name = "g", descriptor = "I")
	public int anInt6593;

	@OriginalMember(owner = "client!te", name = "j", descriptor = "B")
	private byte aByte86;

	@OriginalMember(owner = "client!te", name = "k", descriptor = "I")
	public int anInt6596;

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "()V")
	public Class233() {
	}

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Lclient!nn;)V")
	public Class233(@OriginalArg(0) Class10_Sub8 arg0) {
		this.aByte86 = arg0.method2460();
		this.anInt6588 = arg0.method2485();
		this.anInt6596 = arg0.method2459();
		this.anInt6589 = arg0.method2459();
		this.anInt6593 = arg0.method2459();
		this.anInt6590 = arg0.method2459();
	}

	@OriginalMember(owner = "client!te", name = "c", descriptor = "(I)I")
	public int method5172() {
		return (this.aByte86 & 0x8) == 8 ? 1 : 0;
	}

	@OriginalMember(owner = "client!te", name = "d", descriptor = "(I)I")
	public int method5173() {
		return this.aByte86 & 0x7;
	}
}
