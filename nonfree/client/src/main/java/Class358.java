import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public final class Class358 {

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "I")
	public int anInt10098;

	@OriginalMember(owner = "client!wi", name = "c", descriptor = "I")
	public int anInt10100;

	@OriginalMember(owner = "client!wi", name = "d", descriptor = "I")
	public int anInt10101;

	@OriginalMember(owner = "client!wi", name = "e", descriptor = "I")
	public int anInt10102;

	@OriginalMember(owner = "client!wi", name = "j", descriptor = "I")
	public int anInt10106;

	@OriginalMember(owner = "client!wi", name = "k", descriptor = "B")
	private byte aByte129;

	@OriginalMember(owner = "client!wi", name = "<init>", descriptor = "()V")
	public Class358() {
	}

	@OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(Lclient!un;)V")
	public Class358(@OriginalArg(0) Class4_Sub11 arg0) {
		this.aByte129 = arg0.method4925();
		this.anInt10102 = arg0.method4936();
		this.anInt10106 = arg0.method4931();
		this.anInt10101 = arg0.method4931();
		this.anInt10100 = arg0.method4931();
		this.anInt10098 = arg0.method4931();
	}

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "(I)I")
	public int method8263() {
		return this.aByte129 & 0x7;
	}

	@OriginalMember(owner = "client!wi", name = "c", descriptor = "(I)I")
	public int method8264() {
		return (this.aByte129 & 0x8) == 8 ? 1 : 0;
	}
}
