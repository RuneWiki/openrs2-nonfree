import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public final class Class59 {

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "I")
	public int anInt2739;

	@OriginalMember(owner = "client!mi", name = "e", descriptor = "I")
	public int anInt2741;

	@OriginalMember(owner = "client!mi", name = "g", descriptor = "I")
	public int anInt2743;

	@OriginalMember(owner = "client!mi", name = "i", descriptor = "I")
	public int anInt2745;

	@OriginalMember(owner = "client!mi", name = "o", descriptor = "I")
	public int anInt2749;

	@OriginalMember(owner = "client!mi", name = "q", descriptor = "B")
	private byte aByte8;

	@OriginalMember(owner = "client!mi", name = "<init>", descriptor = "()V")
	public Class59() {
	}

	@OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(Lclient!ra;)V")
	public Class59(@OriginalArg(0) Class2_Sub3 arg0) {
		this.aByte8 = arg0.method221();
		this.anInt2749 = arg0.method269();
		this.anInt2739 = arg0.method248();
		this.anInt2743 = arg0.method248();
		this.anInt2741 = arg0.method248();
		this.anInt2745 = arg0.method248();
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)I")
	public int method2086() {
		return this.aByte8 & 0x7;
	}

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "(I)I")
	public int method2087() {
		return (this.aByte8 & 0x8) == 8 ? 1 : 0;
	}
}
