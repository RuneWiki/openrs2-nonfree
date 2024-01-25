import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public final class Class8_Sub23 extends Class8 implements Interface21 {

	@OriginalMember(owner = "client!fr", name = "j", descriptor = "I")
	public int anInt4000;

	@OriginalMember(owner = "client!fr", name = "p", descriptor = "C")
	public char aChar2;

	@OriginalMember(owner = "client!fr", name = "q", descriptor = "I")
	public int anInt4004;

	@OriginalMember(owner = "client!fr", name = "r", descriptor = "J")
	public long aLong100;

	@OriginalMember(owner = "client!fr", name = "s", descriptor = "I")
	public int anInt4005;

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(I)I")
	@Override
	public int method3237() {
		return this.anInt4005;
	}

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "(B)C")
	@Override
	public char method3239() {
		return this.aChar2;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(B)J")
	@Override
	public long method3236() {
		return this.aLong100;
	}

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "(I)I")
	@Override
	public int method3240() {
		return this.anInt4004;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(Z)I")
	@Override
	public int method3238() {
		return this.anInt4000;
	}
}
