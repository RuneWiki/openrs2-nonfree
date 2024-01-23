import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public final class Class70 {

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "I")
	public int anInt2443;

	@OriginalMember(owner = "client!hf", name = "f", descriptor = "I")
	public int anInt2448;

	@OriginalMember(owner = "client!hf", name = "g", descriptor = "I")
	public int anInt2449;

	@OriginalMember(owner = "client!hf", name = "h", descriptor = "I")
	public int anInt2450;

	@OriginalMember(owner = "client!hf", name = "k", descriptor = "B")
	private byte aByte9;

	@OriginalMember(owner = "client!hf", name = "n", descriptor = "I")
	public int anInt2453;

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "()V")
	public Class70() {
	}

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(Lclient!oe;)V")
	public Class70(@OriginalArg(0) Class2_Sub16 arg0) {
		this.aByte9 = arg0.method2170();
		this.anInt2450 = arg0.method2130();
		this.anInt2449 = arg0.method2145();
		this.anInt2448 = arg0.method2145();
		this.anInt2453 = arg0.method2145();
		this.anInt2443 = arg0.method2145();
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(B)I")
	public int method1817() {
		return this.aByte9 & 0x7;
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)I")
	public int method1819() {
		return (this.aByte9 & 0x8) == 8 ? 1 : 0;
	}
}
