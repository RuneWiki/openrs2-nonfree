import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public final class Class1_Sub13_Sub1 extends Class1_Sub13 {

	@OriginalMember(owner = "client!el", name = "q", descriptor = "I")
	public int anInt2470;

	@OriginalMember(owner = "client!el", name = "t", descriptor = "J")
	public long aLong113;

	@OriginalMember(owner = "client!el", name = "w", descriptor = "I")
	public int anInt2474;

	@OriginalMember(owner = "client!el", name = "y", descriptor = "I")
	public int anInt2475;

	@OriginalMember(owner = "client!el", name = "A", descriptor = "I")
	public int anInt2477;

	@OriginalMember(owner = "client!el", name = "b", descriptor = "(Z)I")
	@Override
	public int method2535() {
		return this.anInt2474;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(Z)I")
	@Override
	public int method2533() {
		return this.anInt2475;
	}

	@OriginalMember(owner = "client!el", name = "c", descriptor = "(B)J")
	@Override
	public long method2538() {
		return this.aLong113;
	}

	@OriginalMember(owner = "client!el", name = "b", descriptor = "(B)I")
	@Override
	public int method2537() {
		return this.anInt2477;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(I)I")
	@Override
	public int method2536() {
		return this.anInt2470;
	}
}
