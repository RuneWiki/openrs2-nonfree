import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!taa")
public final class Class3_Sub46 extends Class3 implements Interface5 {

	@OriginalMember(owner = "client!taa", name = "j", descriptor = "I")
	public int anInt9133;

	@OriginalMember(owner = "client!taa", name = "k", descriptor = "I")
	public int anInt9134;

	@OriginalMember(owner = "client!taa", name = "o", descriptor = "J")
	public long aLong243;

	@OriginalMember(owner = "client!taa", name = "r", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!taa", name = "s", descriptor = "I")
	public int anInt9139;

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(B)I")
	@Override
	public int method7864() {
		return this.anInt9133;
	}

	@OriginalMember(owner = "client!taa", name = "b", descriptor = "(I)C")
	@Override
	public char method7866() {
		return this.aChar4;
	}

	@OriginalMember(owner = "client!taa", name = "b", descriptor = "(B)I")
	@Override
	public int method7867() {
		return this.anInt9139;
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(I)J")
	@Override
	public long method7865() {
		return this.aLong243;
	}

	@OriginalMember(owner = "client!taa", name = "c", descriptor = "(I)I")
	@Override
	public int method7868() {
		return this.anInt9134;
	}
}
