import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public final class Class61 {

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
	public int anInt2617;

	@OriginalMember(owner = "client!oa", name = "j", descriptor = "I")
	public int anInt2620;

	@OriginalMember(owner = "client!oa", name = "n", descriptor = "I")
	public int anInt2622;

	@OriginalMember(owner = "client!oa", name = "p", descriptor = "I")
	public int anInt2623;

	@OriginalMember(owner = "client!oa", name = "q", descriptor = "B")
	private byte aByte6;

	@OriginalMember(owner = "client!oa", name = "s", descriptor = "I")
	public int anInt2625;

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "()V")
	public Class61() {
	}

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Lclient!ka;)V")
	public Class61(@OriginalArg(0) Class1_Sub8 arg0) {
		this.aByte6 = arg0.method339();
		this.anInt2617 = arg0.method359();
		this.anInt2623 = arg0.method347();
		this.anInt2620 = arg0.method347();
		this.anInt2622 = arg0.method347();
		this.anInt2625 = arg0.method347();
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)I")
	public int method2031() {
		return this.aByte6 & 0x7;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)I")
	public int method2032() {
		return (this.aByte6 & 0x8) == 8 ? 1 : 0;
	}
}
