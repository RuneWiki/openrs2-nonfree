import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vca")
public final class Class6_Sub15_Sub2 extends Class6_Sub15 {

	@OriginalMember(owner = "client!vca", name = "q", descriptor = "I")
	public int anInt9937;

	@OriginalMember(owner = "client!vca", name = "s", descriptor = "I")
	public int anInt9939;

	@OriginalMember(owner = "client!vca", name = "v", descriptor = "J")
	public long aLong263;

	@OriginalMember(owner = "client!vca", name = "w", descriptor = "I")
	public int anInt9942;

	@OriginalMember(owner = "client!vca", name = "B", descriptor = "I")
	public int anInt9947;

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(B)J")
	@Override
	public long method8382() {
		return this.aLong263;
	}

	@OriginalMember(owner = "client!vca", name = "g", descriptor = "(B)I")
	@Override
	public int method8390() {
		return this.anInt9939;
	}

	@OriginalMember(owner = "client!vca", name = "f", descriptor = "(B)I")
	@Override
	public int method8387() {
		return this.anInt9942;
	}

	@OriginalMember(owner = "client!vca", name = "b", descriptor = "(B)I")
	@Override
	public int method8383() {
		return this.anInt9937;
	}

	@OriginalMember(owner = "client!vca", name = "e", descriptor = "(B)I")
	@Override
	public int method8385() {
		return this.anInt9947;
	}
}
