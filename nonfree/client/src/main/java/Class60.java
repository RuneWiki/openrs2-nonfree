import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public final class Class60 {

	@OriginalMember(owner = "client!li", name = "a", descriptor = "B")
	private byte aByte7;

	@OriginalMember(owner = "client!li", name = "b", descriptor = "I")
	public int anInt2521;

	@OriginalMember(owner = "client!li", name = "j", descriptor = "I")
	public int anInt2526;

	@OriginalMember(owner = "client!li", name = "k", descriptor = "I")
	public int anInt2527;

	@OriginalMember(owner = "client!li", name = "m", descriptor = "I")
	public int anInt2529;

	@OriginalMember(owner = "client!li", name = "n", descriptor = "I")
	public int anInt2530;

	@OriginalMember(owner = "client!li", name = "<init>", descriptor = "()V")
	public Class60() {
	}

	@OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Lclient!kd;)V")
	public Class60(@OriginalArg(0) Class2_Sub11 arg0) {
		this.aByte7 = arg0.method1552();
		this.anInt2529 = arg0.method1557();
		this.anInt2521 = arg0.method1577();
		this.anInt2527 = arg0.method1577();
		this.anInt2530 = arg0.method1577();
		this.anInt2526 = arg0.method1577();
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(I)I")
	public int method1775() {
		return this.aByte7 & 0x7;
	}

	@OriginalMember(owner = "client!li", name = "b", descriptor = "(B)I")
	public int method1777() {
		return (this.aByte7 & 0x8) == 8 ? 1 : 0;
	}
}
