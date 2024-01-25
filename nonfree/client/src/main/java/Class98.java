import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public final class Class98 {

	@OriginalMember(owner = "client!eg", name = "e", descriptor = "I")
	public int anInt2474;

	@OriginalMember(owner = "client!eg", name = "f", descriptor = "I")
	public int anInt2475;

	@OriginalMember(owner = "client!eg", name = "g", descriptor = "I")
	public int anInt2476;

	@OriginalMember(owner = "client!eg", name = "j", descriptor = "I")
	public int anInt2479;

	@OriginalMember(owner = "client!eg", name = "n", descriptor = "B")
	private byte aByte28;

	@OriginalMember(owner = "client!eg", name = "p", descriptor = "I")
	public int anInt2483;

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "()V")
	public Class98() {
	}

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(Lclient!fca;)V")
	public Class98(@OriginalArg(0) Class3_Sub17 arg0) {
		this.aByte28 = arg0.method4861();
		this.anInt2475 = arg0.method4858();
		this.anInt2479 = arg0.method4868();
		this.anInt2476 = arg0.method4868();
		this.anInt2483 = arg0.method4868();
		this.anInt2474 = arg0.method4868();
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(B)I")
	public int method2275() {
		return (this.aByte28 & 0x8) == 8 ? 1 : 0;
	}

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "(I)I")
	public int method2276() {
		return this.aByte28 & 0x7;
	}
}
