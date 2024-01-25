import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tu")
public final class Class237 {

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "I")
	public int anInt6486;

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "B")
	private byte aByte85;

	@OriginalMember(owner = "client!tu", name = "e", descriptor = "I")
	public int anInt6489;

	@OriginalMember(owner = "client!tu", name = "f", descriptor = "I")
	public int anInt6490;

	@OriginalMember(owner = "client!tu", name = "g", descriptor = "I")
	public int anInt6491;

	@OriginalMember(owner = "client!tu", name = "n", descriptor = "I")
	public int anInt6495;

	@OriginalMember(owner = "client!tu", name = "<init>", descriptor = "()V")
	public Class237() {
	}

	@OriginalMember(owner = "client!tu", name = "<init>", descriptor = "(Lclient!dh;)V")
	public Class237(@OriginalArg(0) Class1_Sub11 arg0) {
		this.aByte85 = arg0.method4452();
		this.anInt6489 = arg0.method4485();
		this.anInt6486 = arg0.method4487();
		this.anInt6491 = arg0.method4487();
		this.anInt6495 = arg0.method4487();
		this.anInt6490 = arg0.method4487();
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(I)I")
	public int method4997() {
		return (this.aByte85 & 0x8) == 8 ? 1 : 0;
	}

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "(I)I")
	public int method4999() {
		return this.aByte85 & 0x7;
	}
}
