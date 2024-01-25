import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lea")
public final class Class205 {

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "I")
	public int anInt5524;

	@OriginalMember(owner = "client!lea", name = "c", descriptor = "I")
	public int anInt5526;

	@OriginalMember(owner = "client!lea", name = "f", descriptor = "I")
	public int anInt5529;

	@OriginalMember(owner = "client!lea", name = "i", descriptor = "B")
	private byte aByte87;

	@OriginalMember(owner = "client!lea", name = "j", descriptor = "I")
	public int anInt5531;

	@OriginalMember(owner = "client!lea", name = "k", descriptor = "I")
	public int anInt5532;

	@OriginalMember(owner = "client!lea", name = "<init>", descriptor = "()V")
	public Class205() {
	}

	@OriginalMember(owner = "client!lea", name = "<init>", descriptor = "(Lclient!ee;)V")
	public Class205(@OriginalArg(0) Class5_Sub12 arg0) {
		this.aByte87 = arg0.method8635();
		this.anInt5529 = arg0.method8631();
		this.anInt5524 = arg0.method8623();
		this.anInt5532 = arg0.method8623();
		this.anInt5531 = arg0.method8623();
		this.anInt5526 = arg0.method8623();
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(I)I")
	public int method4966() {
		return (this.aByte87 & 0x8) == 8 ? 1 : 0;
	}

	@OriginalMember(owner = "client!lea", name = "b", descriptor = "(I)I")
	public int method4967() {
		return this.aByte87 & 0x7;
	}
}
