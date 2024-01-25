import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public final class Class160 {

	@OriginalMember(owner = "client!oq", name = "b", descriptor = "I")
	public int anInt4626;

	@OriginalMember(owner = "client!oq", name = "c", descriptor = "B")
	private byte aByte52;

	@OriginalMember(owner = "client!oq", name = "d", descriptor = "I")
	public int anInt4627;

	@OriginalMember(owner = "client!oq", name = "e", descriptor = "I")
	public int anInt4628;

	@OriginalMember(owner = "client!oq", name = "h", descriptor = "I")
	public int anInt4630;

	@OriginalMember(owner = "client!oq", name = "o", descriptor = "I")
	public int anInt4636;

	@OriginalMember(owner = "client!oq", name = "<init>", descriptor = "()V")
	public Class160() {
	}

	@OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(Lclient!jg;)V")
	public Class160(@OriginalArg(0) Class14_Sub4 arg0) {
		this.aByte52 = arg0.method2553();
		this.anInt4627 = arg0.method2498();
		this.anInt4628 = arg0.method2510();
		this.anInt4636 = arg0.method2510();
		this.anInt4630 = arg0.method2510();
		this.anInt4626 = arg0.method2510();
	}

	@OriginalMember(owner = "client!oq", name = "b", descriptor = "(B)I")
	public int method4150() {
		return (this.aByte52 & 0x8) == 8 ? 1 : 0;
	}

	@OriginalMember(owner = "client!oq", name = "c", descriptor = "(B)I")
	public int method4151() {
		return this.aByte52 & 0x7;
	}
}
