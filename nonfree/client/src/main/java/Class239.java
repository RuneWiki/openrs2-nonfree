import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oda")
public final class Class239 {

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "B")
	private byte aByte90;

	@OriginalMember(owner = "client!oda", name = "b", descriptor = "I")
	public int anInt6695;

	@OriginalMember(owner = "client!oda", name = "c", descriptor = "I")
	public int anInt6696;

	@OriginalMember(owner = "client!oda", name = "f", descriptor = "I")
	public int anInt6699;

	@OriginalMember(owner = "client!oda", name = "g", descriptor = "I")
	public int anInt6700;

	@OriginalMember(owner = "client!oda", name = "h", descriptor = "I")
	public int anInt6701;

	@OriginalMember(owner = "client!oda", name = "<init>", descriptor = "()V")
	public Class239() {
	}

	@OriginalMember(owner = "client!oda", name = "<init>", descriptor = "(Lclient!es;)V")
	public Class239(@OriginalArg(0) Class2_Sub15 arg0) {
		this.aByte90 = arg0.method4304();
		this.anInt6695 = arg0.method4294();
		this.anInt6699 = arg0.method4307();
		this.anInt6700 = arg0.method4307();
		this.anInt6701 = arg0.method4307();
		this.anInt6696 = arg0.method4307();
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(I)I")
	public int method5601() {
		return this.aByte90 & 0x7;
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(Z)I")
	public int method5604() {
		return (this.aByte90 & 0x8) == 8 ? 1 : 0;
	}
}
