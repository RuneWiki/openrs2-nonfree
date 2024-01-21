import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public final class Class42 {

	@OriginalMember(owner = "client!jg", name = "d", descriptor = "I")
	public int anInt2588;

	@OriginalMember(owner = "client!jg", name = "f", descriptor = "I")
	public int anInt2589;

	@OriginalMember(owner = "client!jg", name = "i", descriptor = "I")
	public int anInt2592;

	@OriginalMember(owner = "client!jg", name = "k", descriptor = "I")
	public int anInt2594;

	@OriginalMember(owner = "client!jg", name = "n", descriptor = "B")
	private byte aByte3;

	@OriginalMember(owner = "client!jg", name = "p", descriptor = "I")
	public int anInt2598;

	@OriginalMember(owner = "client!jg", name = "<init>", descriptor = "()V")
	public Class42() {
	}

	@OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(Lclient!og;)V")
	public Class42(@OriginalArg(0) Class2_Sub3 arg0) {
		this.aByte3 = arg0.method227();
		this.anInt2588 = arg0.method234();
		this.anInt2592 = arg0.method206();
		this.anInt2589 = arg0.method206();
		this.anInt2598 = arg0.method206();
		this.anInt2594 = arg0.method206();
	}

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(B)I")
	public int method2049() {
		return this.aByte3 & 0x7;
	}

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)I")
	public int method2051() {
		return (this.aByte3 & 0x8) == 8 ? 1 : 0;
	}
}
