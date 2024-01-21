import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public final class Class54 {

	@OriginalMember(owner = "client!mf", name = "h", descriptor = "I")
	public int anInt2503;

	@OriginalMember(owner = "client!mf", name = "k", descriptor = "B")
	private byte aByte4;

	@OriginalMember(owner = "client!mf", name = "l", descriptor = "I")
	public int anInt2505;

	@OriginalMember(owner = "client!mf", name = "m", descriptor = "I")
	public int anInt2506;

	@OriginalMember(owner = "client!mf", name = "o", descriptor = "I")
	public int anInt2508;

	@OriginalMember(owner = "client!mf", name = "p", descriptor = "I")
	public int anInt2509;

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "()V")
	public Class54() {
	}

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lclient!me;)V")
	public Class54(@OriginalArg(0) Class2_Sub13 arg0) {
		this.aByte4 = arg0.method1394();
		this.anInt2509 = arg0.method1397();
		this.anInt2506 = arg0.method1396();
		this.anInt2508 = arg0.method1396();
		this.anInt2503 = arg0.method1396();
		this.anInt2505 = arg0.method1396();
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(I)I")
	public int method1697() {
		return this.aByte4 & 0x7;
	}

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "(I)I")
	public int method1698() {
		return (this.aByte4 & 0x8) == 8 ? 1 : 0;
	}
}
