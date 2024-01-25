import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public final class Class86 {

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "I")
	public int anInt2649;

	@OriginalMember(owner = "client!ge", name = "e", descriptor = "I")
	public int anInt2652;

	@OriginalMember(owner = "client!ge", name = "f", descriptor = "B")
	private byte aByte49;

	@OriginalMember(owner = "client!ge", name = "i", descriptor = "I")
	public int anInt2653;

	@OriginalMember(owner = "client!ge", name = "l", descriptor = "I")
	public int anInt2655;

	@OriginalMember(owner = "client!ge", name = "o", descriptor = "I")
	public int anInt2658;

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "()V")
	public Class86() {
	}

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(Lclient!cu;)V")
	public Class86(@OriginalArg(0) Class3_Sub7 arg0) {
		this.aByte49 = arg0.method2612();
		this.anInt2652 = arg0.method2588();
		this.anInt2649 = arg0.method2589();
		this.anInt2658 = arg0.method2589();
		this.anInt2653 = arg0.method2589();
		this.anInt2655 = arg0.method2589();
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)I")
	public int method2007() {
		return (this.aByte49 & 0x8) == 8 ? 1 : 0;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(B)I")
	public int method2010() {
		return this.aByte49 & 0x7;
	}
}
