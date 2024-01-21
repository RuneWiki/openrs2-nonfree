import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public final class Class61 {

	@OriginalMember(owner = "client!ob", name = "g", descriptor = "I")
	public int anInt2437;

	@OriginalMember(owner = "client!ob", name = "i", descriptor = "I")
	public int anInt2439;

	@OriginalMember(owner = "client!ob", name = "k", descriptor = "I")
	public int anInt2440;

	@OriginalMember(owner = "client!ob", name = "l", descriptor = "I")
	public int anInt2441;

	@OriginalMember(owner = "client!ob", name = "m", descriptor = "B")
	private byte aByte6;

	@OriginalMember(owner = "client!ob", name = "p", descriptor = "I")
	public int anInt2442;

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "()V")
	public Class61() {
	}

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Lclient!ja;)V")
	public Class61(@OriginalArg(0) Class2_Sub13 arg0) {
		this.aByte6 = arg0.method2948();
		this.anInt2437 = arg0.method2933();
		this.anInt2441 = arg0.method2946();
		this.anInt2442 = arg0.method2946();
		this.anInt2439 = arg0.method2946();
		this.anInt2440 = arg0.method2946();
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)I")
	public int method1968() {
		return this.aByte6 & 0x7;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Z)I")
	public int method1969() {
		return (this.aByte6 & 0x8) == 8 ? 1 : 0;
	}
}
