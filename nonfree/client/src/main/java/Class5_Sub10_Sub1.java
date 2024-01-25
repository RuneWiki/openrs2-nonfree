import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cba")
public final class Class5_Sub10_Sub1 extends Class5_Sub10 {

	@OriginalMember(owner = "client!cba", name = "q", descriptor = "J")
	public long aLong40;

	@OriginalMember(owner = "client!cba", name = "p", descriptor = "I")
	public int anInt992;

	@OriginalMember(owner = "client!cba", name = "o", descriptor = "I")
	public int anInt993;

	@OriginalMember(owner = "client!cba", name = "s", descriptor = "I")
	public int anInt994;

	@OriginalMember(owner = "client!cba", name = "r", descriptor = "I")
	public int anInt995;

	@OriginalMember(owner = "client!cba", name = "b", descriptor = "(I)I")
	@Override
	public int method7043() {
		return this.anInt995;
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(B)J")
	@Override
	public long method7041() {
		return this.aLong40;
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(I)I")
	@Override
	public int method7039() {
		return this.anInt994;
	}

	@OriginalMember(owner = "client!cba", name = "c", descriptor = "(I)I")
	@Override
	public int method7042() {
		return this.anInt993;
	}

	@OriginalMember(owner = "client!cba", name = "d", descriptor = "(I)I")
	@Override
	public int method7046() {
		return this.anInt992;
	}
}
