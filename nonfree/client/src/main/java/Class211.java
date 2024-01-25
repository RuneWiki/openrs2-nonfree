import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public final class Class211 {

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "B")
	private byte aByte60;

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "I")
	public int anInt5613;

	@OriginalMember(owner = "client!mn", name = "e", descriptor = "I")
	public int anInt5616;

	@OriginalMember(owner = "client!mn", name = "i", descriptor = "I")
	public int anInt5619;

	@OriginalMember(owner = "client!mn", name = "j", descriptor = "I")
	public int anInt5620;

	@OriginalMember(owner = "client!mn", name = "l", descriptor = "I")
	public int anInt5621;

	@OriginalMember(owner = "client!mn", name = "<init>", descriptor = "()V")
	public Class211() {
	}

	@OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(Lclient!np;)V")
	public Class211(@OriginalArg(0) Class3_Sub11 arg0) {
		this.aByte60 = arg0.method5212();
		this.anInt5616 = arg0.method5198();
		this.anInt5619 = arg0.method5186();
		this.anInt5621 = arg0.method5186();
		this.anInt5613 = arg0.method5186();
		this.anInt5620 = arg0.method5186();
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(I)I")
	public int method4784() {
		return this.aByte60 & 0x7;
	}

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "(I)I")
	public int method4785() {
		return (this.aByte60 & 0x8) == 8 ? 1 : 0;
	}
}
