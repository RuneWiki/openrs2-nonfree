import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public final class Class3_Sub21_Sub1 extends Class3_Sub21 {

	@OriginalMember(owner = "client!ge", name = "r", descriptor = "J")
	public long aLong98;

	@OriginalMember(owner = "client!ge", name = "s", descriptor = "I")
	public int anInt3486;

	@OriginalMember(owner = "client!ge", name = "t", descriptor = "I")
	public int anInt3487;

	@OriginalMember(owner = "client!ge", name = "u", descriptor = "I")
	public int anInt3488;

	@OriginalMember(owner = "client!ge", name = "v", descriptor = "I")
	public int anInt3489;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Z)I")
	@Override
	public int method7981() {
		return this.anInt3489;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)I")
	@Override
	public int method7977() {
		return this.anInt3487;
	}

	@OriginalMember(owner = "client!ge", name = "f", descriptor = "(I)I")
	@Override
	public int method7982() {
		return this.anInt3486;
	}

	@OriginalMember(owner = "client!ge", name = "g", descriptor = "(I)I")
	@Override
	public int method7983() {
		return this.anInt3488;
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(I)J")
	@Override
	public long method7979() {
		return this.aLong98;
	}
}
