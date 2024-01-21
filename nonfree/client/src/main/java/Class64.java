import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public final class Class64 {

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "I")
	public int anInt2658;

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "I")
	public int anInt2659;

	@OriginalMember(owner = "client!nf", name = "e", descriptor = "I")
	public int anInt2661;

	@OriginalMember(owner = "client!nf", name = "j", descriptor = "I")
	public int anInt2664;

	@OriginalMember(owner = "client!nf", name = "l", descriptor = "I")
	public int anInt2665;

	@OriginalMember(owner = "client!nf", name = "p", descriptor = "B")
	private byte aByte5;

	@OriginalMember(owner = "client!nf", name = "<init>", descriptor = "()V")
	public Class64() {
	}

	@OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(Lclient!mb;)V")
	public Class64(@OriginalArg(0) Class3_Sub17 arg0) {
		this.aByte5 = arg0.method2123();
		this.anInt2661 = arg0.method2111();
		this.anInt2665 = arg0.method2132();
		this.anInt2658 = arg0.method2132();
		this.anInt2659 = arg0.method2132();
		this.anInt2664 = arg0.method2132();
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(B)I")
	public int method1833() {
		return (this.aByte5 & 0x8) == 8 ? 1 : 0;
	}

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(I)I")
	public int method1836() {
		return this.aByte5 & 0x7;
	}
}
