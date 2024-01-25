import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gea")
public final class Class1_Sub13_Sub2 extends Class1_Sub13 {

	@OriginalMember(owner = "client!gea", name = "k", descriptor = "I")
	public int anInt2996;

	@OriginalMember(owner = "client!gea", name = "l", descriptor = "J")
	public long aLong145;

	@OriginalMember(owner = "client!gea", name = "m", descriptor = "I")
	public int anInt2997;

	@OriginalMember(owner = "client!gea", name = "n", descriptor = "I")
	public int anInt2998;

	@OriginalMember(owner = "client!gea", name = "o", descriptor = "I")
	public int anInt2999;

	@OriginalMember(owner = "client!gea", name = "b", descriptor = "(Z)I")
	@Override
	public int method2535() {
		return this.anInt2996;
	}

	@OriginalMember(owner = "client!gea", name = "b", descriptor = "(B)I")
	@Override
	public int method2537() {
		return this.anInt2999;
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(Z)I")
	@Override
	public int method2533() {
		return this.anInt2998;
	}

	@OriginalMember(owner = "client!gea", name = "c", descriptor = "(B)J")
	@Override
	public long method2538() {
		return this.aLong145;
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(I)I")
	@Override
	public int method2536() {
		return this.anInt2997;
	}
}
