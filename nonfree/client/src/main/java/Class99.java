import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fca")
public final class Class99 {

	@OriginalMember(owner = "client!fca", name = "c", descriptor = "I")
	public int anInt2745;

	@OriginalMember(owner = "client!fca", name = "d", descriptor = "B")
	private byte aByte32;

	@OriginalMember(owner = "client!fca", name = "e", descriptor = "I")
	public int anInt2746;

	@OriginalMember(owner = "client!fca", name = "f", descriptor = "I")
	public int anInt2747;

	@OriginalMember(owner = "client!fca", name = "i", descriptor = "I")
	public int anInt2748;

	@OriginalMember(owner = "client!fca", name = "j", descriptor = "I")
	public int anInt2749;

	@OriginalMember(owner = "client!fca", name = "<init>", descriptor = "()V")
	public Class99() {
	}

	@OriginalMember(owner = "client!fca", name = "<init>", descriptor = "(Lclient!jr;)V")
	public Class99(@OriginalArg(0) Class6_Sub12 arg0) {
		this.aByte32 = arg0.method6049();
		this.anInt2745 = arg0.method6044();
		this.anInt2746 = arg0.method6015();
		this.anInt2749 = arg0.method6015();
		this.anInt2747 = arg0.method6015();
		this.anInt2748 = arg0.method6015();
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(B)I")
	public int method2339() {
		return this.aByte32 & 0x7;
	}

	@OriginalMember(owner = "client!fca", name = "b", descriptor = "(B)I")
	public int method2340() {
		return (this.aByte32 & 0x8) == 8 ? 1 : 0;
	}
}
