import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public final class Class1_Sub16_Sub2 extends Class1_Sub16 {

	@OriginalMember(owner = "client!jh", name = "q", descriptor = "I")
	public int anInt4494;

	@OriginalMember(owner = "client!jh", name = "r", descriptor = "I")
	public int anInt4495;

	@OriginalMember(owner = "client!jh", name = "s", descriptor = "J")
	public long aLong133;

	@OriginalMember(owner = "client!jh", name = "t", descriptor = "I")
	public int anInt4496;

	@OriginalMember(owner = "client!jh", name = "u", descriptor = "I")
	public int anInt4497;

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "(Z)J")
	@Override
	public long method3649() {
		return this.aLong133;
	}

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "(B)I")
	@Override
	public int method3648() {
		return this.anInt4496;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)I")
	@Override
	public int method3646() {
		return this.anInt4495;
	}

	@OriginalMember(owner = "client!jh", name = "e", descriptor = "(B)I")
	@Override
	public int method3652() {
		return this.anInt4494;
	}

	@OriginalMember(owner = "client!jh", name = "d", descriptor = "(B)I")
	@Override
	public int method3650() {
		return this.anInt4497;
	}
}
