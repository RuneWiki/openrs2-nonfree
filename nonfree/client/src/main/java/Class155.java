import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public final class Class155 {

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "B")
	private byte aByte48;

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "I")
	public int anInt4707;

	@OriginalMember(owner = "client!mc", name = "f", descriptor = "I")
	public int anInt4708;

	@OriginalMember(owner = "client!mc", name = "h", descriptor = "I")
	public int anInt4710;

	@OriginalMember(owner = "client!mc", name = "i", descriptor = "I")
	public int anInt4711;

	@OriginalMember(owner = "client!mc", name = "l", descriptor = "I")
	public int anInt4713;

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "()V")
	public Class155() {
	}

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(Lclient!wn;)V")
	public Class155(@OriginalArg(0) Class4_Sub20 arg0) {
		this.aByte48 = arg0.method4576();
		this.anInt4713 = arg0.method4560();
		this.anInt4708 = arg0.method4595();
		this.anInt4707 = arg0.method4595();
		this.anInt4711 = arg0.method4595();
		this.anInt4710 = arg0.method4595();
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Z)I")
	public int method4016() {
		return this.aByte48 & 0x7;
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)I")
	public int method4017() {
		return (this.aByte48 & 0x8) == 8 ? 1 : 0;
	}
}
