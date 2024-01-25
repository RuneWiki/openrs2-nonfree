import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jea")
public final class Class164 {

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "B")
	private byte aByte88;

	@OriginalMember(owner = "client!jea", name = "b", descriptor = "I")
	public int anInt5503;

	@OriginalMember(owner = "client!jea", name = "d", descriptor = "I")
	public int anInt5505;

	@OriginalMember(owner = "client!jea", name = "h", descriptor = "I")
	public int anInt5509;

	@OriginalMember(owner = "client!jea", name = "k", descriptor = "I")
	public int anInt5511;

	@OriginalMember(owner = "client!jea", name = "l", descriptor = "I")
	public int anInt5512;

	@OriginalMember(owner = "client!jea", name = "<init>", descriptor = "()V")
	public Class164() {
	}

	@OriginalMember(owner = "client!jea", name = "<init>", descriptor = "(Lclient!cea;)V")
	public Class164(@OriginalArg(0) Class2_Sub11 arg0) {
		this.aByte88 = arg0.method8384();
		this.anInt5505 = arg0.method8326();
		this.anInt5511 = arg0.method8381();
		this.anInt5503 = arg0.method8381();
		this.anInt5512 = arg0.method8381();
		this.anInt5509 = arg0.method8381();
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(I)I")
	public int method4737() {
		return (this.aByte88 & 0x8) == 8 ? 1 : 0;
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(B)I")
	public int method4740() {
		return this.aByte88 & 0x7;
	}
}
