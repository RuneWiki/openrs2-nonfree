import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oaa")
public final class Class5_Sub33_Sub2 extends Class5_Sub33 {

	@OriginalMember(owner = "client!oaa", name = "o", descriptor = "J")
	public long aLong188;

	@OriginalMember(owner = "client!oaa", name = "r", descriptor = "I")
	public int anInt6840;

	@OriginalMember(owner = "client!oaa", name = "s", descriptor = "I")
	public int anInt6841;

	@OriginalMember(owner = "client!oaa", name = "t", descriptor = "I")
	public int anInt6842;

	@OriginalMember(owner = "client!oaa", name = "y", descriptor = "I")
	public int anInt6847;

	@OriginalMember(owner = "client!oaa", name = "b", descriptor = "(I)J")
	@Override
	public long method6093() {
		return this.aLong188;
	}

	@OriginalMember(owner = "client!oaa", name = "d", descriptor = "(I)I")
	@Override
	public int method6097() {
		return this.anInt6841;
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(I)I")
	@Override
	public int method6092() {
		return this.anInt6842;
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(B)I")
	@Override
	public int method6094() {
		return this.anInt6840;
	}

	@OriginalMember(owner = "client!oaa", name = "e", descriptor = "(I)I")
	@Override
	public int method6099() {
		return this.anInt6847;
	}
}
