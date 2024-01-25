import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public final class Class1_Sub41_Sub2 extends Class1_Sub41 {

	@OriginalMember(owner = "client!wk", name = "n", descriptor = "J")
	public long aLong242;

	@OriginalMember(owner = "client!wk", name = "o", descriptor = "I")
	public int anInt9327;

	@OriginalMember(owner = "client!wk", name = "p", descriptor = "I")
	public int anInt9328;

	@OriginalMember(owner = "client!wk", name = "q", descriptor = "I")
	public int anInt9329;

	@OriginalMember(owner = "client!wk", name = "r", descriptor = "I")
	public int anInt9330;

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "(I)I")
	@Override
	public int method7875() {
		return this.anInt9327;
	}

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "(B)J")
	@Override
	public long method7871() {
		return this.aLong242;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(B)I")
	@Override
	public int method7866() {
		return this.anInt9330;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Z)I")
	@Override
	public int method7870() {
		return this.anInt9328;
	}

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "(Z)I")
	@Override
	public int method7873() {
		return this.anInt9329;
	}
}
